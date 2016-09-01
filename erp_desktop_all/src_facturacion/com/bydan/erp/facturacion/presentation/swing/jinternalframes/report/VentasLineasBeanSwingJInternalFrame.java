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

//import com.bydan.erp.facturacion.util.VentasLineasConstantesFunciones;
import com.bydan.erp.facturacion.util.report.VentasLineasParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.VentasLineasParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.VentasLineasBean;
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
import com.bydan.erp.inventario.business.logic.*;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class VentasLineasBeanSwingJInternalFrame extends VentasLineasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VentasLineasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<VentasLineas> ventaslineasValidator = new ClassValidator<VentasLineas>(VentasLineas.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public VentasLineas ventaslineas;	
	public VentasLineas ventaslineasAux;
	public VentasLineas ventaslineasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public VentasLineas ventaslineasTotales;
	public Long idVentasLineasActual;
	public Long iIdNuevoVentasLineas=0L;
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

	public String sFinalQueryComboLinea="";

	public List<Linea> lineasForeignKey;

	public List<Linea> getlineasForeignKey() {
		return lineasForeignKey;
	}

	public void setlineasForeignKey(List<Linea> lineasForeignKey) {
		this.lineasForeignKey = lineasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineaForeignKey;

	public Linea getlineaForeignKey() {
		return lineaForeignKey;
	}

	public void setlineaForeignKey(Linea lineaForeignKey) {
		this.lineaForeignKey = lineaForeignKey;
	}

	public String sFinalQueryComboLineaGrupo="";

	public List<Linea> lineagruposForeignKey;

	public List<Linea> getlineagruposForeignKey() {
		return lineagruposForeignKey;
	}

	public void setlineagruposForeignKey(List<Linea> lineagruposForeignKey) {
		this.lineagruposForeignKey = lineagruposForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineagrupoForeignKey;

	public Linea getlineagrupoForeignKey() {
		return lineagrupoForeignKey;
	}

	public void setlineagrupoForeignKey(Linea lineagrupoForeignKey) {
		this.lineagrupoForeignKey = lineagrupoForeignKey;
	}

	public String sFinalQueryComboLineaCategoria="";

	public List<Linea> lineacategoriasForeignKey;

	public List<Linea> getlineacategoriasForeignKey() {
		return lineacategoriasForeignKey;
	}

	public void setlineacategoriasForeignKey(List<Linea> lineacategoriasForeignKey) {
		this.lineacategoriasForeignKey = lineacategoriasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineacategoriaForeignKey;

	public Linea getlineacategoriaForeignKey() {
		return lineacategoriaForeignKey;
	}

	public void setlineacategoriaForeignKey(Linea lineacategoriaForeignKey) {
		this.lineacategoriaForeignKey = lineacategoriaForeignKey;
	}

	public String sFinalQueryComboLineaMarca="";

	public List<Linea> lineamarcasForeignKey;

	public List<Linea> getlineamarcasForeignKey() {
		return lineamarcasForeignKey;
	}

	public void setlineamarcasForeignKey(List<Linea> lineamarcasForeignKey) {
		this.lineamarcasForeignKey = lineamarcasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineamarcaForeignKey;

	public Linea getlineamarcaForeignKey() {
		return lineamarcaForeignKey;
	}

	public void setlineamarcaForeignKey(Linea lineamarcaForeignKey) {
		this.lineamarcaForeignKey = lineamarcaForeignKey;
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
	
	public Boolean isPermisoTodoVentasLineas;
	public Boolean isPermisoNuevoVentasLineas;
	public Boolean isPermisoActualizarVentasLineas;
	public Boolean isPermisoActualizarOriginalVentasLineas;
	public Boolean isPermisoEliminarVentasLineas;
	public Boolean isPermisoGuardarCambiosVentasLineas;
	public Boolean isPermisoConsultaVentasLineas;
	public Boolean isPermisoBusquedaVentasLineas;
	public Boolean isPermisoReporteVentasLineas;
	public Boolean isPermisoPaginacionMedioVentasLineas;
	public Boolean isPermisoPaginacionAltoVentasLineas;
	public Boolean isPermisoPaginacionTodoVentasLineas;
	public Boolean isPermisoCopiarVentasLineas;
	public Boolean isPermisoVerFormVentasLineas;
	public Boolean isPermisoDuplicarVentasLineas;
	public Boolean isPermisoOrdenVentasLineas;
	
	
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
	
	public VentasLineasParameterReturnGeneral ventaslineasReturnGeneral;
	public VentasLineasParameterReturnGeneral ventaslineasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVentasLineas=false;
	public Boolean esParaAccionDesdeFormularioVentasLineas=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VentasLineasSessionBeanAdditional ventaslineasSessionBeanAdditional=null;
	
	public VentasLineasSessionBeanAdditional getVentasLineasSessionBeanAdditional() {
		return this.ventaslineasSessionBeanAdditional;
	}
	
	public void setVentasLineasSessionBeanAdditional(VentasLineasSessionBeanAdditional ventaslineasSessionBeanAdditional) {
		try {
			this.ventaslineasSessionBeanAdditional=ventaslineasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VentasLineasBeanSwingJInternalFrameAdditional ventaslineasBeanSwingJInternalFrameAdditional=null;
	//public class VentasLineasBeanSwingJInternalFrame
	
	public VentasLineasBeanSwingJInternalFrameAdditional getVentasLineasBeanSwingJInternalFrameAdditional() {
		return this.ventaslineasBeanSwingJInternalFrameAdditional;
	}
	
	public void setVentasLineasBeanSwingJInternalFrameAdditional(VentasLineasBeanSwingJInternalFrameAdditional ventaslineasBeanSwingJInternalFrameAdditional) {
		try {
			this.ventaslineasBeanSwingJInternalFrameAdditional=ventaslineasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VentasLineasLogic ventaslineasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public VentasLineas ventaslineasBean;
	public VentasLineasConstantesFunciones ventaslineasConstantesFunciones;
	//public VentasLineasParameterReturnGeneral ventaslineasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	
	//PARAMETROS
	
	
	//public List<VentasLineas> ventaslineass;	
	//public List<VentasLineas> ventaslineassEliminados;
	//public List<VentasLineas> ventaslineassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVentasLineas=false;
	public Boolean isVisibilidadCeldaDuplicarVentasLineas=true;
	public Boolean isVisibilidadCeldaCopiarVentasLineas=true;
	public Boolean isVisibilidadCeldaVerFormVentasLineas=true;
	public Boolean isVisibilidadCeldaOrdenVentasLineas=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVentasLineas=false;
	public Boolean isVisibilidadCeldaModificarVentasLineas=false;
	public Boolean isVisibilidadCeldaActualizarVentasLineas=false;
	public Boolean isVisibilidadCeldaEliminarVentasLineas=false;
	public Boolean isVisibilidadCeldaCancelarVentasLineas=false;
	public Boolean isVisibilidadCeldaGuardarVentasLineas=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVentasLineas=false;	
	
	
	public Boolean isVisibilidadBusquedaVentasLineas=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	
	public Long getiIdNuevoVentasLineas() {
		return this.iIdNuevoVentasLineas;
	}

	public void setiIdNuevoVentasLineas(Long iIdNuevoVentasLineas) {
		this.iIdNuevoVentasLineas = iIdNuevoVentasLineas;
	}
	
	public Long getidVentasLineasActual() {
		return this.idVentasLineasActual;
	}

	public void setidVentasLineasActual(Long idVentasLineasActual) {
		this.idVentasLineasActual = idVentasLineasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public VentasLineas getventaslineas() {
		return this.ventaslineas;
	}

	public void setventaslineas(VentasLineas ventaslineas) {
		this.ventaslineas = ventaslineas;
	}
	
	public VentasLineas getventaslineasAux() {
		return this.ventaslineasAux;
	}

	public void setventaslineasAux(VentasLineas ventaslineasAux) {
		this.ventaslineasAux = ventaslineasAux;
	}				
	
	public VentasLineas getventaslineasAnterior() {
		return this.ventaslineasAnterior;
	}

	public void setventaslineasAnterior(VentasLineas ventaslineasAnterior) {
		this.ventaslineasAnterior = ventaslineasAnterior;
	}	
	
	public VentasLineas getventaslineasTotales() {
		return this.ventaslineasTotales;
	}

	public void setventaslineasTotales(VentasLineas ventaslineasTotales) {
		this.ventaslineasTotales = ventaslineasTotales;
	}	
	
	public VentasLineas getventaslineasBean() {
		return this.ventaslineasBean;
	}

	public void setventaslineasBean(VentasLineas ventaslineasBean) {
		this.ventaslineasBean = ventaslineasBean;
	}	
	
	public VentasLineasParameterReturnGeneral getventaslineasReturnGeneral() {
		return this.ventaslineasReturnGeneral;
	}

	public void setventaslineasReturnGeneral(VentasLineasParameterReturnGeneral ventaslineasReturnGeneral) {
		this.ventaslineasReturnGeneral = ventaslineasReturnGeneral;
	}	
	
	
	public Long id_empresaBusquedaVentasLineas=-1L;

	public Long getid_empresaBusquedaVentasLineas() {
		return this.id_empresaBusquedaVentasLineas;
	}

	public void setid_empresaBusquedaVentasLineas(Long id_empresaBusquedaVentasLineas) {
		this.id_empresaBusquedaVentasLineas = id_empresaBusquedaVentasLineas;
	}

;
	public Long id_lineaBusquedaVentasLineas=-1L;

	public Long getid_lineaBusquedaVentasLineas() {
		return this.id_lineaBusquedaVentasLineas;
	}

	public void setid_lineaBusquedaVentasLineas(Long id_lineaBusquedaVentasLineas) {
		this.id_lineaBusquedaVentasLineas = id_lineaBusquedaVentasLineas;
	}

;
	public Long id_linea_grupoBusquedaVentasLineas=-1L;

	public Long getid_linea_grupoBusquedaVentasLineas() {
		return this.id_linea_grupoBusquedaVentasLineas;
	}

	public void setid_linea_grupoBusquedaVentasLineas(Long id_linea_grupoBusquedaVentasLineas) {
		this.id_linea_grupoBusquedaVentasLineas = id_linea_grupoBusquedaVentasLineas;
	}

;
	public Long id_linea_categoriaBusquedaVentasLineas=-1L;

	public Long getid_linea_categoriaBusquedaVentasLineas() {
		return this.id_linea_categoriaBusquedaVentasLineas;
	}

	public void setid_linea_categoriaBusquedaVentasLineas(Long id_linea_categoriaBusquedaVentasLineas) {
		this.id_linea_categoriaBusquedaVentasLineas = id_linea_categoriaBusquedaVentasLineas;
	}

;
	public Long id_linea_marcaBusquedaVentasLineas=-1L;

	public Long getid_linea_marcaBusquedaVentasLineas() {
		return this.id_linea_marcaBusquedaVentasLineas;
	}

	public void setid_linea_marcaBusquedaVentasLineas(Long id_linea_marcaBusquedaVentasLineas) {
		this.id_linea_marcaBusquedaVentasLineas = id_linea_marcaBusquedaVentasLineas;
	}

;
	public Date fecha_emision_desdeBusquedaVentasLineas=new Date();

	public Date getfecha_emision_desdeBusquedaVentasLineas() {
		return this.fecha_emision_desdeBusquedaVentasLineas;
	}

	public void setfecha_emision_desdeBusquedaVentasLineas(Date fecha_emision_desdeBusquedaVentasLineas) {
		this.fecha_emision_desdeBusquedaVentasLineas = fecha_emision_desdeBusquedaVentasLineas;
	}

;
	public Date fecha_emision_hastaBusquedaVentasLineas=new Date();

	public Date getfecha_emision_hastaBusquedaVentasLineas() {
		return this.fecha_emision_hastaBusquedaVentasLineas;
	}

	public void setfecha_emision_hastaBusquedaVentasLineas(Date fecha_emision_hastaBusquedaVentasLineas) {
		this.fecha_emision_hastaBusquedaVentasLineas = fecha_emision_hastaBusquedaVentasLineas;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_lineaFK_IdLinea=-1L;

	public Long getid_lineaFK_IdLinea() {
		return this.id_lineaFK_IdLinea;
	}

	public void setid_lineaFK_IdLinea(Long id_lineaFK_IdLinea) {
		this.id_lineaFK_IdLinea = id_lineaFK_IdLinea;
	}

	public Long id_linea_categoriaFK_IdLineaCategoria=-1L;

	public Long getid_linea_categoriaFK_IdLineaCategoria() {
		return this.id_linea_categoriaFK_IdLineaCategoria;
	}

	public void setid_linea_categoriaFK_IdLineaCategoria(Long id_linea_categoriaFK_IdLineaCategoria) {
		this.id_linea_categoriaFK_IdLineaCategoria = id_linea_categoriaFK_IdLineaCategoria;
	}

	public Long id_linea_grupoFK_IdLineaGrupo=-1L;

	public Long getid_linea_grupoFK_IdLineaGrupo() {
		return this.id_linea_grupoFK_IdLineaGrupo;
	}

	public void setid_linea_grupoFK_IdLineaGrupo(Long id_linea_grupoFK_IdLineaGrupo) {
		this.id_linea_grupoFK_IdLineaGrupo = id_linea_grupoFK_IdLineaGrupo;
	}

	public Long id_linea_marcaFK_IdLineaMarca=-1L;

	public Long getid_linea_marcaFK_IdLineaMarca() {
		return this.id_linea_marcaFK_IdLineaMarca;
	}

	public void setid_linea_marcaFK_IdLineaMarca(Long id_linea_marcaFK_IdLineaMarca) {
		this.id_linea_marcaFK_IdLineaMarca = id_linea_marcaFK_IdLineaMarca;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public VentasLineasLogic getVentasLineasLogic()	{		
		return ventaslineasLogic;
	}

	public void setVentasLineasLogic(VentasLineasLogic ventaslineasLogic) {
		this.ventaslineasLogic = ventaslineasLogic;
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
	
	public Boolean getIsEsNuevoVentasLineas() {
		return isEsNuevoVentasLineas;
	}

	public void setIsEsNuevoVentasLineas(Boolean isEsNuevoVentasLineas) {
		this.isEsNuevoVentasLineas = isEsNuevoVentasLineas;
	}

	public Boolean getEsParaAccionDesdeFormularioVentasLineas() {
		return esParaAccionDesdeFormularioVentasLineas;
	}
	
	public void setEsParaAccionDesdeFormularioVentasLineas(Boolean esParaAccionDesdeFormularioVentasLineas) {
		this.esParaAccionDesdeFormularioVentasLineas = esParaAccionDesdeFormularioVentasLineas;
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

			if(this.ventaslineasSessionBean==null) {
				this.ventaslineasSessionBean=new VentasLineasSessionBean();
			}

			if(!this.ventaslineasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(ventaslineasSessionBean.getlidEmpresaActual());
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

	public void cargarCombosLineasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.ventaslineasSessionBean==null) {
				this.ventaslineasSessionBean=new VentasLineasSessionBean();
			}

			if(!this.ventaslineasSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLinea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(ventaslineasSessionBean.getlidLineaActual());
					this.lineasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaGruposForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineagruposForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.ventaslineasSessionBean==null) {
				this.ventaslineasSessionBean=new VentasLineasSessionBean();
			}

			if(!this.ventaslineasSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineagrupoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineagruposForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaGrupo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(ventaslineasSessionBean.getlidLineaGrupoActual());
					this.lineagruposForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaCategoriasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineacategoriasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.ventaslineasSessionBean==null) {
				this.ventaslineasSessionBean=new VentasLineasSessionBean();
			}

			if(!this.ventaslineasSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineacategoriaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineacategoriasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaCategoria(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(ventaslineasSessionBean.getlidLineaCategoriaActual());
					this.lineacategoriasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaMarcasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineamarcasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.ventaslineasSessionBean==null) {
				this.ventaslineasSessionBean=new VentasLineasSessionBean();
			}

			if(!this.ventaslineasSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineamarcaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineamarcasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaMarca(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(ventaslineasSessionBean.getlidLineaMarcaActual());
					this.lineamarcasForeignKey.add(lineaLogic.getLinea());
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

					if(this.ventaslineas!=null) {
						this.ventaslineas.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVentasLineas!=null) {
						this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_empresaVentasLineas.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVentasLineas.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVentasLineas!=null) {
						if(this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_empresaVentasLineas.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_empresaVentasLineas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaVentasLineas") || sFormularioTipoBusqueda.equals("Todos")){
					if(empresaTemp!=null && jComboBoxid_empresaBusquedaVentasLineasVentasLineas!=null) {
						jComboBoxid_empresaBusquedaVentasLineasVentasLineas.setSelectedItem(empresaTemp);
					} else {
						if(jComboBoxid_empresaBusquedaVentasLineasVentasLineas!=null) {
							//jComboBoxid_empresaBusquedaVentasLineasVentasLineas.setSelectedItem(empresaTemp);
							if(jComboBoxid_empresaBusquedaVentasLineasVentasLineas.getItemCount()>0) {
								jComboBoxid_empresaBusquedaVentasLineasVentasLineas.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVentasLineasGenerico)throws Exception
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
				jComboBoxid_empresaVentasLineasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVentasLineasGenerico!=null && jComboBoxid_empresaVentasLineasGenerico.getItemCount()>0) {
					jComboBoxid_empresaVentasLineasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaForeignKey(Long idLineaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineaTemp!=null) {

					if(this.ventaslineas!=null) {
						this.ventaslineas.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormVentasLineas!=null) {
						this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_lineaVentasLineas.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaVentasLineas.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormVentasLineas!=null) {
						if(this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_lineaVentasLineas.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_lineaVentasLineas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaVentasLineas") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaVentasLineasVentasLineas!=null) {
						jComboBoxid_lineaBusquedaVentasLineasVentasLineas.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaVentasLineasVentasLineas!=null) {
							//jComboBoxid_lineaBusquedaVentasLineasVentasLineas.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaVentasLineasVentasLineas.getItemCount()>0) {
								jComboBoxid_lineaBusquedaVentasLineasVentasLineas.setSelectedIndex(0);
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

	public String getActualLineaForeignKeyDescripcion(Long idLineaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaVentasLineasGenerico)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(lineaTemp!=null) {
				jComboBoxid_lineaVentasLineasGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaVentasLineasGenerico!=null && jComboBoxid_lineaVentasLineasGenerico.getItemCount()>0) {
					jComboBoxid_lineaVentasLineasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaGrupoForeignKey(Long idLineaGrupoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineagrupoTemp!=null) {

					if(this.ventaslineas!=null) {
						this.ventaslineas.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormVentasLineas!=null) {
						this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_grupoVentasLineas.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoVentasLineas.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormVentasLineas!=null) {
						if(this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_grupoVentasLineas.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_grupoVentasLineas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaVentasLineas") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas!=null) {
						jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas!=null) {
							//jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas.setSelectedIndex(0);
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

	public String getActualLineaGrupoForeignKeyDescripcion(Long idLineaGrupoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineagrupoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoVentasLineasGenerico)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(lineagrupoTemp!=null) {
				jComboBoxid_linea_grupoVentasLineasGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoVentasLineasGenerico!=null && jComboBoxid_linea_grupoVentasLineasGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoVentasLineasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaCategoriaForeignKey(Long idLineaCategoriaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineacategoriaTemp!=null) {

					if(this.ventaslineas!=null) {
						this.ventaslineas.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormVentasLineas!=null) {
						this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_categoriaVentasLineas.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaVentasLineas.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormVentasLineas!=null) {
						if(this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_categoriaVentasLineas.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_categoriaVentasLineas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaVentasLineas") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas!=null) {
						jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas!=null) {
							//jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas.setSelectedIndex(0);
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

	public String getActualLineaCategoriaForeignKeyDescripcion(Long idLineaCategoriaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineacategoriaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaVentasLineasGenerico)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(lineacategoriaTemp!=null) {
				jComboBoxid_linea_categoriaVentasLineasGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaVentasLineasGenerico!=null && jComboBoxid_linea_categoriaVentasLineasGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaVentasLineasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaMarcaForeignKey(Long idLineaMarcaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineamarcaTemp!=null) {

					if(this.ventaslineas!=null) {
						this.ventaslineas.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormVentasLineas!=null) {
						this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_marcaVentasLineas.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaVentasLineas.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormVentasLineas!=null) {
						if(this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_marcaVentasLineas.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_marcaVentasLineas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaVentasLineas") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas!=null) {
						jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas!=null) {
							//jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas.setSelectedIndex(0);
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

	public String getActualLineaMarcaForeignKeyDescripcion(Long idLineaMarcaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineamarcaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaVentasLineasGenerico)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(lineamarcaTemp!=null) {
				jComboBoxid_linea_marcaVentasLineasGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaVentasLineasGenerico!=null && jComboBoxid_linea_marcaVentasLineasGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaVentasLineasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(VentasLineas ventaslineas,JComboBox jComboBoxid_empresaVentasLineasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVentasLineasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_empresaVentasLineas.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVentasLineasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				ventaslineas.setid_empresa(empresaAux.getId());
				ventaslineas.setempresa_descripcion(VentasLineasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				ventaslineas.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(VentasLineas ventaslineas,JComboBox jComboBoxid_lineaVentasLineasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaVentasLineasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_lineaVentasLineas.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaVentasLineasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				ventaslineas.setid_linea(lineaAux.getId());
				ventaslineas.setlinea_descripcion(VentasLineasConstantesFunciones.getLineaDescripcion(lineaAux));
				ventaslineas.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(VentasLineas ventaslineas,JComboBox jComboBoxid_linea_grupoVentasLineasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoVentasLineasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_grupoVentasLineas.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoVentasLineasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				ventaslineas.setid_linea_grupo(lineaAux.getId());
				ventaslineas.setlineagrupo_descripcion(VentasLineasConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				ventaslineas.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(VentasLineas ventaslineas,JComboBox jComboBoxid_linea_categoriaVentasLineasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaVentasLineasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_categoriaVentasLineas.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaVentasLineasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				ventaslineas.setid_linea_categoria(lineaAux.getId());
				ventaslineas.setlineacategoria_descripcion(VentasLineasConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				ventaslineas.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(VentasLineas ventaslineas,JComboBox jComboBoxid_linea_marcaVentasLineasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaVentasLineasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_marcaVentasLineas.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaVentasLineasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				ventaslineas.setid_linea_marca(lineaAux.getId());
				ventaslineas.setlineamarca_descripcion(VentasLineasConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				ventaslineas.setLineaMarca(lineaAux);			}
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

					if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasLineas!=null) { 
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_empresaVentasLineas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_empresaVentasLineas.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasLineas!=null) { 
					}

					if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaVentasLineas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empresaBusquedaVentasLineasVentasLineas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jComboBoxid_empresaBusquedaVentasLineasVentasLineas.addItem(empresa);
							}
						}

						if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasLineas!=null) { 
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_lineaVentasLineas.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_lineaVentasLineas.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasLineas!=null) { 
					}

					if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaVentasLineas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaVentasLineasVentasLineas.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaVentasLineasVentasLineas.addItem(linea);
							}
						}

						if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaGruposForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasLineas!=null) { 
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_grupoVentasLineas.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_grupoVentasLineas.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasLineas!=null) { 
					}

					if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaVentasLineas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas.addItem(lineagrupo);
							}
						}

						if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaCategoriasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasLineas!=null) { 
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_categoriaVentasLineas.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_categoriaVentasLineas.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasLineas!=null) { 
					}

					if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaVentasLineas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas.addItem(lineacategoria);
							}
						}

						if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaMarcasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasLineas!=null) { 
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_marcaVentasLineas.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_marcaVentasLineas.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasLineas!=null) { 
					}

					if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaVentasLineas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas.addItem(lineamarca);
							}
						}

						if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormVentasLineas!=null) {
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_empresaVentasLineas.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasLineas!=null) {
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_empresaVentasLineas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empresaBusquedaVentasLineasVentasLineas.setSelectedItem(empresa);
						} else {
							this.jComboBoxid_empresaBusquedaVentasLineasVentasLineas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaForeignKey(Linea linea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVentasLineas!=null) {
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_lineaVentasLineas.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasLineas!=null) {
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_lineaVentasLineas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaVentasLineasVentasLineas.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaVentasLineasVentasLineas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaGrupoForeignKey(Linea lineagrupo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVentasLineas!=null) {
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_grupoVentasLineas.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasLineas!=null) {
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_grupoVentasLineas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaCategoriaForeignKey(Linea lineacategoria,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVentasLineas!=null) {
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_categoriaVentasLineas.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasLineas!=null) {
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_categoriaVentasLineas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaMarcaForeignKey(Linea lineamarca,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVentasLineas!=null) {
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_marcaVentasLineas.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasLineas!=null) {
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_marcaVentasLineas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesVentasLineas() throws Exception {
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
		
	public VentasLineasParameterReturnGeneral getVentasLineasParameterGeneral() {
		return this.ventaslineasParameterGeneral;
	}
	
	public void setVentasLineasParameterGeneral(VentasLineasParameterReturnGeneral ventaslineasParameterGeneral) {
		this.ventaslineasParameterGeneral = ventaslineasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoVentasLineas() {
		return isPermisoTodoVentasLineas;
	}

	public void setIsPermisoTodoVentasLineas(Boolean isPermisoTodoVentasLineas) {
		this.isPermisoTodoVentasLineas = isPermisoTodoVentasLineas;
	}

	public Boolean getIsPermisoNuevoVentasLineas() {
		return isPermisoNuevoVentasLineas;
	}

	public void setIsPermisoNuevoVentasLineas(Boolean isPermisoNuevoVentasLineas) {
		this.isPermisoNuevoVentasLineas = isPermisoNuevoVentasLineas;
	}

	public Boolean getIsPermisoActualizarVentasLineas() {
		return isPermisoActualizarVentasLineas;
	}

	public void setIsPermisoActualizarVentasLineas(Boolean isPermisoActualizarVentasLineas) {
		this.isPermisoActualizarVentasLineas = isPermisoActualizarVentasLineas;
	}

	public Boolean getIsPermisoEliminarVentasLineas() {
		return isPermisoEliminarVentasLineas;
	}

	public void setIsPermisoEliminarVentasLineas(Boolean isPermisoEliminarVentasLineas) {
		this.isPermisoEliminarVentasLineas = isPermisoEliminarVentasLineas;
	}

	public Boolean getIsPermisoGuardarCambiosVentasLineas() {
		return isPermisoGuardarCambiosVentasLineas;
	}

	public void setIsPermisoGuardarCambiosVentasLineas(Boolean isPermisoGuardarCambiosVentasLineas) {
		this.isPermisoGuardarCambiosVentasLineas = isPermisoGuardarCambiosVentasLineas;
	}
	
	public Boolean getIsPermisoConsultaVentasLineas() {
		return isPermisoConsultaVentasLineas;
	}

	public void setIsPermisoConsultaVentasLineas(Boolean isPermisoConsultaVentasLineas) {
		this.isPermisoConsultaVentasLineas = isPermisoConsultaVentasLineas;
	}

	public Boolean getIsPermisoBusquedaVentasLineas() {
		return isPermisoBusquedaVentasLineas;
	}

	public void setIsPermisoBusquedaVentasLineas(Boolean isPermisoBusquedaVentasLineas) {
		this.isPermisoBusquedaVentasLineas = isPermisoBusquedaVentasLineas;
	}

	public Boolean getIsPermisoReporteVentasLineas() {
		return isPermisoReporteVentasLineas;
	}

	public void setIsPermisoReporteVentasLineas(Boolean isPermisoReporteVentasLineas) {
		this.isPermisoReporteVentasLineas = isPermisoReporteVentasLineas;
	}
	
	public Boolean getIsPermisoPaginacionMedioVentasLineas() {
		return isPermisoPaginacionMedioVentasLineas;
	}

	public void setIsPermisoPaginacionMedioVentasLineas(Boolean isPermisoPaginacionMedioVentasLineas) {
		this.isPermisoPaginacionMedioVentasLineas = isPermisoPaginacionMedioVentasLineas;
	}
	
	public Boolean getIsPermisoPaginacionTodoVentasLineas() {
		return isPermisoPaginacionTodoVentasLineas;
	}

	public void setIsPermisoPaginacionTodoVentasLineas(Boolean isPermisoPaginacionTodoVentasLineas) {
		this.isPermisoPaginacionTodoVentasLineas = isPermisoPaginacionTodoVentasLineas;
	}
	
	public Boolean getIsPermisoPaginacionAltoVentasLineas() {
		return isPermisoPaginacionAltoVentasLineas;
	}

	public void setIsPermisoPaginacionAltoVentasLineas(Boolean isPermisoPaginacionAltoVentasLineas) {
		this.isPermisoPaginacionAltoVentasLineas = isPermisoPaginacionAltoVentasLineas;
	}
	
	public Boolean getIsPermisoCopiarVentasLineas() {
		return isPermisoCopiarVentasLineas;
	}

	public void setIsPermisoCopiarVentasLineas(Boolean isPermisoCopiarVentasLineas) {
		this.isPermisoCopiarVentasLineas = isPermisoCopiarVentasLineas;
	}
	
	public Boolean getIsPermisoVerFormVentasLineas() {
		return isPermisoVerFormVentasLineas;
	}

	public void setIsPermisoVerFormVentasLineas(Boolean isPermisoVerFormVentasLineas) {
		this.isPermisoVerFormVentasLineas = isPermisoVerFormVentasLineas;
	}
	
	public Boolean getIsPermisoDuplicarVentasLineas() {
		return isPermisoDuplicarVentasLineas;
	}

	public void setIsPermisoDuplicarVentasLineas(Boolean isPermisoDuplicarVentasLineas) {
		this.isPermisoDuplicarVentasLineas = isPermisoDuplicarVentasLineas;
	}
	
	public Boolean getIsPermisoOrdenVentasLineas() {
		return isPermisoOrdenVentasLineas;
	}

	public void setIsPermisoOrdenVentasLineas(Boolean isPermisoOrdenVentasLineas) {
		this.isPermisoOrdenVentasLineas = isPermisoOrdenVentasLineas;
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
	
	public Boolean getIsVisibilidadCeldaNuevoVentasLineas() {
		return isVisibilidadCeldaNuevoVentasLineas;
	}

	public void setIsVisibilidadCeldaNuevoVentasLineas(Boolean isVisibilidadCeldaNuevoVentasLineas) {
		this.isVisibilidadCeldaNuevoVentasLineas = isVisibilidadCeldaNuevoVentasLineas;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVentasLineas() {
		return isVisibilidadCeldaDuplicarVentasLineas;
	}

	public void setIsVisibilidadCeldaDuplicarVentasLineas(Boolean isVisibilidadCeldaDuplicarVentasLineas) {
		this.isVisibilidadCeldaDuplicarVentasLineas = isVisibilidadCeldaDuplicarVentasLineas;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVentasLineas() {
		return isVisibilidadCeldaCopiarVentasLineas;
	}

	public void setIsVisibilidadCeldaCopiarVentasLineas(Boolean isVisibilidadCeldaCopiarVentasLineas) {
		this.isVisibilidadCeldaCopiarVentasLineas = isVisibilidadCeldaCopiarVentasLineas;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVentasLineas() {
		return isVisibilidadCeldaVerFormVentasLineas;
	}

	public void setIsVisibilidadCeldaVerFormVentasLineas(Boolean isVisibilidadCeldaVerFormVentasLineas) {
		this.isVisibilidadCeldaVerFormVentasLineas = isVisibilidadCeldaVerFormVentasLineas;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVentasLineas() {
		return isVisibilidadCeldaOrdenVentasLineas;
	}

	public void setIsVisibilidadCeldaOrdenVentasLineas(Boolean isVisibilidadCeldaOrdenVentasLineas) {
		this.isVisibilidadCeldaOrdenVentasLineas = isVisibilidadCeldaOrdenVentasLineas;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVentasLineas() {
		return isVisibilidadCeldaNuevoRelacionesVentasLineas;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVentasLineas(Boolean isVisibilidadCeldaNuevoRelacionesVentasLineas) {
		this.isVisibilidadCeldaNuevoRelacionesVentasLineas = isVisibilidadCeldaNuevoRelacionesVentasLineas;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVentasLineas() {
		return isVisibilidadCeldaModificarVentasLineas;
	}

	public void setIsVisibilidadCeldaModificarVentasLineas(Boolean isVisibilidadCeldaModificarVentasLineas) {
		this.isVisibilidadCeldaModificarVentasLineas = isVisibilidadCeldaModificarVentasLineas;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVentasLineas() {
		return isVisibilidadCeldaActualizarVentasLineas;
	}

	public void setIsVisibilidadCeldaActualizarVentasLineas(Boolean isVisibilidadCeldaActualizarVentasLineas) {
		this.isVisibilidadCeldaActualizarVentasLineas = isVisibilidadCeldaActualizarVentasLineas;
	}

	public Boolean getIsVisibilidadCeldaEliminarVentasLineas() {
		return isVisibilidadCeldaEliminarVentasLineas;
	}

	public void setIsVisibilidadCeldaEliminarVentasLineas(Boolean isVisibilidadCeldaEliminarVentasLineas) {
		this.isVisibilidadCeldaEliminarVentasLineas = isVisibilidadCeldaEliminarVentasLineas;
	}

	public Boolean getIsVisibilidadCeldaCancelarVentasLineas() {
		return isVisibilidadCeldaCancelarVentasLineas;
	}

	public void setIsVisibilidadCeldaCancelarVentasLineas(Boolean isVisibilidadCeldaCancelarVentasLineas) {
		this.isVisibilidadCeldaCancelarVentasLineas = isVisibilidadCeldaCancelarVentasLineas;
	}

	public Boolean getIsVisibilidadCeldaGuardarVentasLineas() {
		return isVisibilidadCeldaGuardarVentasLineas;
	}

	public void setIsVisibilidadCeldaGuardarVentasLineas(Boolean isVisibilidadCeldaGuardarVentasLineas) {
		this.isVisibilidadCeldaGuardarVentasLineas = isVisibilidadCeldaGuardarVentasLineas;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVentasLineas() {
		return isVisibilidadCeldaGuardarCambiosVentasLineas;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVentasLineas(Boolean isVisibilidadCeldaGuardarCambiosVentasLineas) {
		this.isVisibilidadCeldaGuardarCambiosVentasLineas = isVisibilidadCeldaGuardarCambiosVentasLineas;
	}
		
	public VentasLineasSessionBean getventaslineasSessionBean() {
		return this.ventaslineasSessionBean;
	}
	
	public void setventaslineasSessionBean(VentasLineasSessionBean ventaslineasSessionBean) {
		this.ventaslineasSessionBean=ventaslineasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaVentasLineas() {
		return this.isVisibilidadBusquedaVentasLineas;
	}

	public void setisVisibilidadBusquedaVentasLineas(Boolean isVisibilidadBusquedaVentasLineas) {
		this.isVisibilidadBusquedaVentasLineas=isVisibilidadBusquedaVentasLineas;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdLinea() {
		return this.isVisibilidadFK_IdLinea;
	}

	public void setisVisibilidadFK_IdLinea(Boolean isVisibilidadFK_IdLinea) {
		this.isVisibilidadFK_IdLinea=isVisibilidadFK_IdLinea;
	}

	public Boolean getisVisibilidadFK_IdLineaCategoria() {
		return this.isVisibilidadFK_IdLineaCategoria;
	}

	public void setisVisibilidadFK_IdLineaCategoria(Boolean isVisibilidadFK_IdLineaCategoria) {
		this.isVisibilidadFK_IdLineaCategoria=isVisibilidadFK_IdLineaCategoria;
	}

	public Boolean getisVisibilidadFK_IdLineaGrupo() {
		return this.isVisibilidadFK_IdLineaGrupo;
	}

	public void setisVisibilidadFK_IdLineaGrupo(Boolean isVisibilidadFK_IdLineaGrupo) {
		this.isVisibilidadFK_IdLineaGrupo=isVisibilidadFK_IdLineaGrupo;
	}

	public Boolean getisVisibilidadFK_IdLineaMarca() {
		return this.isVisibilidadFK_IdLineaMarca;
	}

	public void setisVisibilidadFK_IdLineaMarca(Boolean isVisibilidadFK_IdLineaMarca) {
		this.isVisibilidadFK_IdLineaMarca=isVisibilidadFK_IdLineaMarca;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVentasLineas(VentasLineas ventaslineas)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(ventaslineas,null);
				this.setActualParaGuardarLineaForeignKey(ventaslineas,null);
				this.setActualParaGuardarLineaGrupoForeignKey(ventaslineas,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(ventaslineas,null);
				this.setActualParaGuardarLineaMarcaForeignKey(ventaslineas,null);
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
	
	public void bugActualizarReferenciaActual(VentasLineas ventaslineas,VentasLineas ventaslineasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVentasLineas(ventaslineas);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ventaslineasAux.setId(ventaslineas.getId());
		ventaslineasAux.setVersionRow(ventaslineas.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(VentasLineas ventaslineasLocal) throws Exception {
		
		if(this.ventaslineasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VentasLineas ventaslineasLocal) throws Exception {	
		if(this.ventaslineasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				ventaslineasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				ventaslineasLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				ventaslineasLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				ventaslineasLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				ventaslineasLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVentasLineasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ventaslineasValidator.getInvalidValues(this.ventaslineas);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(VentasLineas ventaslineas,List<VentasLineas> ventaslineass) throws Exception {
	}		
	
	public void actualizarSelectedLista(VentasLineas ventaslineas,List<VentasLineas> ventaslineass) throws Exception {
		try	{			
			VentasLineasConstantesFunciones.actualizarSelectedLista(ventaslineas,ventaslineass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VentasLineas> ventaslineassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ventaslineassLocal=this.ventaslineasLogic.getVentasLineass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ventaslineassLocal=this.ventaslineass;
			}
			//ARCHITECTURE
		
			for(VentasLineas ventaslineasLocal:ventaslineassLocal) {
				if(this.permiteMantenimiento(ventaslineasLocal) && ventaslineasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+VentasLineasConstantesFunciones.getVentasLineasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VentasLineasConstantesFunciones.NOMBRELINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelnombre_lineaVentasLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasLineasConstantesFunciones.NOMBREGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelnombre_grupoVentasLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasLineasConstantesFunciones.NOMBRECATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelnombre_categoriaVentasLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasLineasConstantesFunciones.NOMBREMARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelnombre_marcaVentasLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasLineasConstantesFunciones.MONTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelmontoVentasLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasLineasConstantesFunciones.NOTASCREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelnotas_creditoVentasLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasLineasConstantesFunciones.VENTANETA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelventa_netaVentasLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasLineasConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelporcentajeVentasLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasLineasConstantesFunciones.ACUMULADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelacumuladoVentasLineas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasLineasConstantesFunciones.TIPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabeltipoVentasLineas,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasLineas.jLabelnombre_lineaVentasLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasLineas.jLabelnombre_grupoVentasLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasLineas.jLabelnombre_categoriaVentasLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasLineas.jLabelnombre_marcaVentasLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasLineas.jLabelmontoVentasLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasLineas.jLabelnotas_creditoVentasLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasLineas.jLabelventa_netaVentasLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasLineas.jLabelporcentajeVentasLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasLineas.jLabelacumuladoVentasLineas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasLineas.jLabeltipoVentasLineas,"");
		
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
		this.iIdNuevoVentasLineas--;	
		
		
		this.ventaslineasAux=new VentasLineas();
		
		this.ventaslineasAux.setId(this.iIdNuevoVentasLineas);
		this.ventaslineasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventaslineasLogic.getVentasLineass().add(this.ventaslineasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ventaslineass.add(this.ventaslineasAux);
		}
		//ARCHITECTURE
		
		this.ventaslineas=this.ventaslineasAux;
		
		if(VentasLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVentasLineas(this.ventaslineas);
			this.setVariablesObjetoActualToFormularioForeignKeyVentasLineas(this.ventaslineas);
		}
				
		//this.setDefaultControlesVentasLineas();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVentasLineas();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVentasLineas();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentasLineas();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentasLineas(this.ventaslineasBean,this.ventaslineas,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVentasLineas(this.ventaslineasReturnGeneral,this.ventaslineasBean,false);
		
		if(this.ventaslineasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVentasLineas(this.ventaslineasReturnGeneral.getVentasLineas());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVentasLineas(this.ventaslineasReturnGeneral.getVentasLineas());
		}
		
		if(this.ventaslineasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVentasLineas(this.ventaslineasReturnGeneral.getVentasLineas(),classes);//this.ventaslineasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVentasLineas();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVentasLineas();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VentasLineasBeanSwingJInternalFrameAdditional.RecargarFormVentasLineas(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVentasLineas(false);
						
			if(ventaslineasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VentasLineasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasLineas();
			}
			
			this.actualizarVisualTableDatosVentasLineas();
			
			this.jTableDatosVentasLineas.setRowSelectionInterval(this.getIndiceNuevoVentasLineas(), this.getIndiceNuevoVentasLineas());
			
			this.seleccionarFilaTablaVentasLineasActual();
						
			this.actualizarEstadoCeldasBotonesVentasLineas("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVentasLineas(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVentasLineas.jDateChooserfecha_emision_desdeVentasLineas.setEnabled(isHabilitar && this.ventaslineasConstantesFunciones.activarfecha_emision_desdeVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jDateChooserfecha_emision_hastaVentasLineas.setEnabled(isHabilitar && this.ventaslineasConstantesFunciones.activarfecha_emision_hastaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_lineaVentasLineas.setEnabled(isHabilitar && this.ventaslineasConstantesFunciones.activarnombre_lineaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_grupoVentasLineas.setEnabled(isHabilitar && this.ventaslineasConstantesFunciones.activarnombre_grupoVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_categoriaVentasLineas.setEnabled(isHabilitar && this.ventaslineasConstantesFunciones.activarnombre_categoriaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_marcaVentasLineas.setEnabled(isHabilitar && this.ventaslineasConstantesFunciones.activarnombre_marcaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextFieldmontoVentasLineas.setEnabled(isHabilitar && this.ventaslineasConstantesFunciones.activarmontoVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextFieldnotas_creditoVentasLineas.setEnabled(isHabilitar && this.ventaslineasConstantesFunciones.activarnotas_creditoVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextFieldventa_netaVentasLineas.setEnabled(isHabilitar && this.ventaslineasConstantesFunciones.activarventa_netaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextFieldporcentajeVentasLineas.setEnabled(isHabilitar && this.ventaslineasConstantesFunciones.activarporcentajeVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextFieldacumuladoVentasLineas.setEnabled(isHabilitar && this.ventaslineasConstantesFunciones.activaracumuladoVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextFieldtipoVentasLineas.setEnabled(isHabilitar && this.ventaslineasConstantesFunciones.activartipoVentasLineas);	
		//
		this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_empresaVentasLineas.setEnabled(isHabilitar && this.ventaslineasConstantesFunciones.activarid_empresaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_lineaVentasLineas.setEnabled(isHabilitar && this.ventaslineasConstantesFunciones.activarid_lineaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_grupoVentasLineas.setEnabled(isHabilitar && this.ventaslineasConstantesFunciones.activarid_linea_grupoVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_categoriaVentasLineas.setEnabled(isHabilitar && this.ventaslineasConstantesFunciones.activarid_linea_categoriaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_marcaVentasLineas.setEnabled(isHabilitar && this.ventaslineasConstantesFunciones.activarid_linea_marcaVentasLineas);
	};
	
	public void setDefaultControlesVentasLineas() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVentasLineas(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ventaslineasSessionBean.setConGuardarRelaciones(true);			
			this.ventaslineasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVentasLineas.jTabbedPaneRelacionesVentasLineas.setVisible(true);
			
					
		} else {
			//this.ventaslineasSessionBean.setConGuardarRelaciones(false);			
			this.ventaslineasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVentasLineas.jTabbedPaneRelacionesVentasLineas.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVentasLineas() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasLineas ventaslineasAux:this.ventaslineasLogic.getVentasLineass()) {
				if(ventaslineasAux.getId().equals(this.iIdNuevoVentasLineas)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasLineas ventaslineasAux:this.ventaslineass) {
				if(ventaslineasAux.getId().equals(this.iIdNuevoVentasLineas)) {
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
	
	public int getIndiceActualVentasLineas(VentasLineas ventaslineas,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasLineas ventaslineasAux:this.ventaslineasLogic.getVentasLineass()) {
				if(ventaslineasAux.getId().equals(ventaslineas.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasLineas ventaslineasAux:this.ventaslineass) {
				if(ventaslineasAux.getId().equals(ventaslineas.getId())) {
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
	
	public void setCamposBaseDesdeOriginalVentasLineas(VentasLineas ventaslineasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasLineas ventaslineasAux:this.ventaslineasLogic.getVentasLineass()) {
				if(ventaslineasAux.getVentasLineasOriginal().getId().equals(ventaslineasOriginal.getId())) {
					existe=true;
					ventaslineasOriginal.setId(ventaslineasAux.getId());
					ventaslineasOriginal.setVersionRow(ventaslineasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasLineas ventaslineasAux:this.ventaslineass) {
				if(ventaslineasAux.getVentasLineasOriginal().getId().equals(ventaslineasOriginal.getId())) {
					existe=true;
					ventaslineasOriginal.setId(ventaslineasAux.getId());
					ventaslineasOriginal.setVersionRow(ventaslineasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVentasLineas(Boolean esParaCancelar) throws Exception {
		ventaslineassAux=new ArrayList<VentasLineas>();
		ventaslineasAux=new VentasLineas();
		
		if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentasLineas ventaslineasAux:this.ventaslineasLogic.getVentasLineass()) {
					if(ventaslineasAux.getId()<0) {
						ventaslineassAux.add(ventaslineasAux);
					}		
				}
				this.iIdNuevoVentasLineas=0L;
				this.ventaslineasLogic.getVentasLineass().removeAll(ventaslineassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasLineas ventaslineasAux:this.ventaslineass) {
					if(ventaslineasAux.getId()<0) {
						ventaslineassAux.add(ventaslineasAux);
					}		
				}
				this.iIdNuevoVentasLineas=0L;
				this.ventaslineass.removeAll(ventaslineassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVentasLineas 
					&& this.ventaslineasLogic.getVentasLineass().size()>0
					) {
					ventaslineasAux=this.ventaslineasLogic.getVentasLineass().get(this.ventaslineasLogic.getVentasLineass().size() - 1);
				
					if(ventaslineasAux.getId()<0) {
						this.ventaslineasLogic.getVentasLineass().remove(ventaslineasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVentasLineas && this.ventaslineass.size()>0) {
					ventaslineasAux=this.ventaslineass.get(this.ventaslineass.size() - 1);
				
					if(ventaslineasAux.getId()<0) {
						this.ventaslineass.remove(ventaslineasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVentasLineas(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ventaslineas.getId()<0) {
				this.ventaslineasLogic.getVentasLineass().remove(this.ventaslineas);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ventaslineas.getId()<0) {
				this.ventaslineass.remove(this.ventaslineas);
			}
		}			
	}
	
	public void setEstadosInicialesVentasLineas(List<VentasLineas> ventaslineassAux) throws Exception {
		VentasLineasConstantesFunciones.setEstadosInicialesVentasLineas(ventaslineassAux);
	}
	
	public void setEstadosInicialesVentasLineas(VentasLineas ventaslineasAux) throws Exception {
		VentasLineasConstantesFunciones.setEstadosInicialesVentasLineas(ventaslineasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVentasLineasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVentasLineas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVentasLineasActual()) {
				if(!this.isEsNuevoVentasLineas) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVentasLineas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVentasLineas=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVentasLineasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Ventas Lineas ?", "MANTENIMIENTO DE Ventas Lineas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVentasLineas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(VentasLineas ventaslineas) throws Exception {
		VentasLineasConstantesFunciones.seleccionarAsignar(this.ventaslineas,ventaslineas);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVentasLineas=this.isPermisoActualizarOriginalVentasLineas;
			
			
			this.seleccionarAsignar(ventaslineas);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesVentasLineas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ventaslineasSessionBean.setsFuncionBusquedaRapida(this.ventaslineasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoVentasLineas) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVentasLineas(esParaCancelar);				
				this.cancelarNuevoVentasLineas(esParaCancelar);								
			}
			
			this.ventaslineas=new VentasLineas();
			
			this.inicializarVentasLineas();
			
			this.actualizarEstadoCeldasBotonesVentasLineas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVentasLineas() throws Exception {
		try {
			VentasLineasConstantesFunciones.inicializarVentasLineas(this.ventaslineas);
			
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
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ventaslineasLogic.getVentasLineass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVentasLineass(String sAccionBusqueda,List<VentasLineas> ventaslineassParaReportes) throws Exception {
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
					sPathReporteFinal="VentasLineas"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VentasLineasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VentasLineasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="VentasLineas"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Ventas Lineases");		
		parameters.put("busquedapor", VentasLineasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVentasLineas=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VentasLineasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VentasLineasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVentasLineas=new JRBeanArrayDataSource(VentasLineasJInternalFrame.TraerVentasLineasBeans(ventaslineassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVentasLineas);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VentasLineasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VentasLineasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VentasLineasBean.TraerVentasLineasBeans(ventaslineassParaReportes).toArray()));
							
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
				this.generarExcelReporteVentasLineass(sAccionBusqueda,sTipoArchivoReporte,ventaslineassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVentasLineass(sAccionBusqueda,sTipoArchivoReporte,ventaslineassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVentasLineasActionPerformed(null);
					//this.generarExcelReporteVentasLineass(sAccionBusqueda,sTipoArchivoReporte,ventaslineassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVentasLineass(sAccionBusqueda,sTipoArchivoReporte,ventaslineassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVentasLineass(sAccionBusqueda,sTipoArchivoReporte,ventaslineassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVentasLineass(sAccionBusqueda,sTipoArchivoReporte,ventaslineassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVentasLineass(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasLineas> ventaslineassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventaslineas";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasLineass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentasLineas("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(VentasLineas ventaslineas : ventaslineassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VentasLineasConstantesFunciones.generarExcelReporteDataVentasLineas("NORMAL",row,workbook,ventaslineas,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventaslineasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Lineas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVentasLineas(String sTipo,Row row,Workbook workbook) {
		
		VentasLineasConstantesFunciones.generarExcelReporteHeaderVentasLineas(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVentasLineass(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasLineas> ventaslineassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventaslineas_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasLineass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(VentasLineas ventaslineas : ventaslineassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VentasLineasConstantesFunciones.getVentasLineasDescripcion(ventaslineas));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasLineasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasLineasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaslineas.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasLineasConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasLineasConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaslineas.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasLineasConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasLineasConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaslineas.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasLineasConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasLineasConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaslineas.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasLineasConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasLineasConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaslineas.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaslineas.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaslineas.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasLineasConstantesFunciones.LABEL_NOMBRELINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasLineasConstantesFunciones.LABEL_NOMBRELINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaslineas.getnombre_linea());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaslineas.getnombre_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaslineas.getnombre_categoria());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasLineasConstantesFunciones.LABEL_NOMBREMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasLineasConstantesFunciones.LABEL_NOMBREMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaslineas.getnombre_marca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasLineasConstantesFunciones.LABEL_MONTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasLineasConstantesFunciones.LABEL_MONTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaslineas.getmonto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasLineasConstantesFunciones.LABEL_NOTASCREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasLineasConstantesFunciones.LABEL_NOTASCREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaslineas.getnotas_credito());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasLineasConstantesFunciones.LABEL_VENTANETA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasLineasConstantesFunciones.LABEL_VENTANETA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaslineas.getventa_neta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasLineasConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasLineasConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaslineas.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasLineasConstantesFunciones.LABEL_ACUMULADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasLineasConstantesFunciones.LABEL_ACUMULADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaslineas.getacumulado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasLineasConstantesFunciones.LABEL_TIPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasLineasConstantesFunciones.LABEL_TIPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaslineas.gettipo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventaslineasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Lineas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVentasLineass(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasLineas> ventaslineassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<VentasLineas> ventaslineassRespaldo=null;
		
		classes=VentasLineasConstantesFunciones.getClassesRelationshipsOfVentasLineas(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ventaslineasLogic.setDatosCliente(this.datosCliente);
		this.ventaslineasLogic.setDatosDeep(this.datosDeep);
		this.ventaslineasLogic.setIsConDeep(true);
		
		ventaslineassRespaldo=this.ventaslineasLogic.getVentasLineass();
		
		this.ventaslineasLogic.setVentasLineass(ventaslineassParaReportes);	
		this.ventaslineasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ventaslineassParaReportes=this.ventaslineasLogic.getVentasLineass();
		this.ventaslineasLogic.setVentasLineass(ventaslineassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventaslineas_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasLineass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentasLineas("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(VentasLineas ventaslineas : ventaslineassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVentasLineas("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VentasLineasConstantesFunciones.generarExcelReporteDataVentasLineas("NORMAL",row,workbook,ventaslineas,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VentasLineasConstantesFunciones.getVentasLineasDescripcion(ventaslineas));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventaslineasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Lineas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentasLineas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasLineas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentasLineas.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasLineas.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVentasLineas() throws Exception {		
		this.startProcessVentasLineas(true);
	}
	
	public void startProcessVentasLineas(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVentasLineas ,this.jPanelParametrosReportesVentasLineas, this.jScrollPanelDatosVentasLineas,this.jPanelPaginacionVentasLineas, this.jScrollPanelDatosEdicionVentasLineas, this.jPanelAccionesVentasLineas,this.jPanelAccionesFormularioVentasLineas,this.jmenuBarVentasLineas,this.jmenuBarDetalleVentasLineas,this.jTtoolBarVentasLineas,this.jTtoolBarDetalleVentasLineas);		
		
		final JTabbedPane jTabbedPaneBusquedasVentasLineas=this.jTabbedPaneBusquedasVentasLineas; 
		
		final JPanel jPanelParametrosReportesVentasLineas=this.jPanelParametrosReportesVentasLineas;
		//final JScrollPane jScrollPanelDatosVentasLineas=this.jScrollPanelDatosVentasLineas;
		final JTable jTableDatosVentasLineas=this.jTableDatosVentasLineas;		
		final JPanel jPanelPaginacionVentasLineas=this.jPanelPaginacionVentasLineas;
		//final JScrollPane jScrollPanelDatosEdicionVentasLineas=this.jScrollPanelDatosEdicionVentasLineas;
		final JPanel jPanelAccionesVentasLineas=this.jPanelAccionesVentasLineas;
		
		JPanel jPanelCamposAuxiliarVentasLineas=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVentasLineas=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) {
			jPanelCamposAuxiliarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jPanelCamposVentasLineas;
			jPanelAccionesFormularioAuxiliarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jPanelAccionesFormularioVentasLineas;
		}
		
		final JPanel jPanelCamposVentasLineas=jPanelCamposAuxiliarVentasLineas;
		final JPanel jPanelAccionesFormularioVentasLineas=jPanelAccionesFormularioAuxiliarVentasLineas;
		
		
		final JMenuBar jmenuBarVentasLineas=this.jmenuBarVentasLineas;
		final JToolBar jTtoolBarVentasLineas=this.jTtoolBarVentasLineas;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVentasLineas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentasLineas=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) {
			jmenuBarDetalleAuxiliarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jmenuBarDetalleVentasLineas;
			jTtoolBarDetalleAuxiliarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jTtoolBarDetalleVentasLineas;
		}
		
		final JMenuBar jmenuBarDetalleVentasLineas=jmenuBarDetalleAuxiliarVentasLineas;
		final JToolBar jTtoolBarDetalleVentasLineas=jTtoolBarDetalleAuxiliarVentasLineas;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentasLineas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentasLineas;
			processRunnable.jTableDatos=jTableDatosVentasLineas;
			processRunnable.jPanelCampos=jPanelCamposVentasLineas;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentasLineas;
			processRunnable.jPanelAcciones=jPanelAccionesVentasLineas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentasLineas;
			
			
			processRunnable.jmenuBar=jmenuBarVentasLineas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentasLineas;
			processRunnable.jTtoolBar=jTtoolBarVentasLineas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentasLineas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentasLineas ,jPanelParametrosReportesVentasLineas,jTableDatosVentasLineas, /*jScrollPanelDatosVentasLineas,*/jPanelCamposVentasLineas,jPanelPaginacionVentasLineas, /*jScrollPanelDatosEdicionVentasLineas,*/ jPanelAccionesVentasLineas,jPanelAccionesFormularioVentasLineas,jmenuBarVentasLineas,jmenuBarDetalleVentasLineas,jTtoolBarVentasLineas,jTtoolBarDetalleVentasLineas);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentasLineas ,jPanelParametrosReportesVentasLineas, jScrollPanelDatosVentasLineas,jPanelPaginacionVentasLineas, jScrollPanelDatosEdicionVentasLineas, jPanelAccionesVentasLineas,jPanelAccionesFormularioVentasLineas,jmenuBarVentasLineas,jmenuBarDetalleVentasLineas,jTtoolBarVentasLineas,jTtoolBarDetalleVentasLineas);
						
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
	
	public void finishProcessVentasLineas() {// throws Exception 
		this.finishProcessVentasLineas(true);
	}
	
	public void finishProcessVentasLineas(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVentasLineas ,this.jPanelParametrosReportesVentasLineas, this.jScrollPanelDatosVentasLineas,this.jPanelPaginacionVentasLineas, this.jScrollPanelDatosEdicionVentasLineas, this.jPanelAccionesVentasLineas,this.jPanelAccionesFormularioVentasLineas,this.jmenuBarVentasLineas,this.jmenuBarDetalleVentasLineas,this.jTtoolBarVentasLineas,this.jTtoolBarDetalleVentasLineas);		
		
		final JTabbedPane jTabbedPaneBusquedasVentasLineas=this.jTabbedPaneBusquedasVentasLineas; 
		
		final JPanel jPanelParametrosReportesVentasLineas=this.jPanelParametrosReportesVentasLineas;
		//final JScrollPane jScrollPanelDatosVentasLineas=this.jScrollPanelDatosVentasLineas;
		final JTable jTableDatosVentasLineas=this.jTableDatosVentasLineas;		
		final JPanel jPanelPaginacionVentasLineas=this.jPanelPaginacionVentasLineas;
		//final JScrollPane jScrollPanelDatosEdicionVentasLineas=this.jScrollPanelDatosEdicionVentasLineas;
		final JPanel jPanelAccionesVentasLineas=this.jPanelAccionesVentasLineas;
		
		JPanel jPanelCamposAuxiliarVentasLineas=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVentasLineas=new JPanel();
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) {
			jPanelCamposAuxiliarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jPanelCamposVentasLineas;
			jPanelAccionesFormularioAuxiliarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jPanelAccionesFormularioVentasLineas;
		}
		
		final JPanel jPanelCamposVentasLineas=jPanelCamposAuxiliarVentasLineas;
		final JPanel jPanelAccionesFormularioVentasLineas=jPanelAccionesFormularioAuxiliarVentasLineas;
		
		
		final JMenuBar jmenuBarVentasLineas=this.jmenuBarVentasLineas;		
		final JToolBar jTtoolBarVentasLineas=this.jTtoolBarVentasLineas;
				
		JMenuBar jmenuBarDetalleAuxiliarVentasLineas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentasLineas=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) {
			jmenuBarDetalleAuxiliarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jmenuBarDetalleVentasLineas;
			jTtoolBarDetalleAuxiliarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jTtoolBarDetalleVentasLineas;		
		}
		
		final JMenuBar jmenuBarDetalleVentasLineas=jmenuBarDetalleAuxiliarVentasLineas;
		final JToolBar jTtoolBarDetalleVentasLineas=jTtoolBarDetalleAuxiliarVentasLineas;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentasLineas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentasLineas;
			processRunnable.jTableDatos=jTableDatosVentasLineas;
			processRunnable.jPanelCampos=jPanelCamposVentasLineas;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentasLineas;
			processRunnable.jPanelAcciones=jPanelAccionesVentasLineas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentasLineas;
			
			
			processRunnable.jmenuBar=jmenuBarVentasLineas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentasLineas;
			processRunnable.jTtoolBar=jTtoolBarVentasLineas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentasLineas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVentasLineas ,jPanelParametrosReportesVentasLineas, jTableDatosVentasLineas,/*jScrollPanelDatosVentasLineas,*/jPanelCamposVentasLineas,jPanelPaginacionVentasLineas, /*jScrollPanelDatosEdicionVentasLineas,*/ jPanelAccionesVentasLineas,jPanelAccionesFormularioVentasLineas,jmenuBarVentasLineas,jmenuBarDetalleVentasLineas,jTtoolBarVentasLineas,jTtoolBarDetalleVentasLineas));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVentasLineas(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVentasLineas(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVentasLineas(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVentasLineas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVentasLineas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVentasLineas,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVentasLineas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVentasLineas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVentasLineas,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ventaslineasConstantesFunciones.getsFinalQueryVentasLineas();
		String  finalQueryPaginacionTodos=this.ventaslineasConstantesFunciones.getsFinalQueryVentasLineas();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VentasLineasConstantesFunciones.getArrayColumnasGlobalesNoVentasLineas(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VentasLineasConstantesFunciones.getArrayColumnasGlobalesVentasLineas(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VentasLineasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ventaslineassEliminados= new ArrayList<VentasLineas>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVentasLineas();
		
				///*VentasLineasSessionBean*/this.ventaslineasSessionBean=new VentasLineasSessionBean();
			
			if(this.ventaslineasSessionBean==null) {
				this.ventaslineasSessionBean=new VentasLineasSessionBean();
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
					this.iNumeroPaginacion=VentasLineasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VentasLineasConstantesFunciones.getClassesForeignKeysOfVentasLineas(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ventaslineas."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ventaslineassAux= new ArrayList<VentasLineas>();
			
				
			ventaslineasLogic.setDatosCliente(this.datosCliente);
			ventaslineasLogic.setDatosDeep(this.datosDeep);
			ventaslineasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaVentasLineas")) {
				this.sDetalleReporte=VentasLineasConstantesFunciones.getDetalleIndiceBusquedaVentasLineas(id_empresaBusquedaVentasLineas,id_lineaBusquedaVentasLineas,id_linea_grupoBusquedaVentasLineas,id_linea_categoriaBusquedaVentasLineas,id_linea_marcaBusquedaVentasLineas,fecha_emision_desdeBusquedaVentasLineas,fecha_emision_hastaBusquedaVentasLineas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ventaslineasLogic.getVentasLineassBusquedaVentasLineas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_empresaBusquedaVentasLineas,id_lineaBusquedaVentasLineas,id_linea_grupoBusquedaVentasLineas,id_linea_categoriaBusquedaVentasLineas,id_linea_marcaBusquedaVentasLineas,fecha_emision_desdeBusquedaVentasLineas,fecha_emision_hastaBusquedaVentasLineas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentasLineasConstantesFunciones.getDetalleIndiceBusquedaVentasLineas(id_empresaBusquedaVentasLineas,id_lineaBusquedaVentasLineas,id_linea_grupoBusquedaVentasLineas,id_linea_categoriaBusquedaVentasLineas,id_linea_marcaBusquedaVentasLineas,fecha_emision_desdeBusquedaVentasLineas,fecha_emision_hastaBusquedaVentasLineas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentasLineasConstantesFunciones.getDetalleIndiceBusquedaVentasLineas(id_empresaBusquedaVentasLineas,id_lineaBusquedaVentasLineas,id_linea_grupoBusquedaVentasLineas,id_linea_categoriaBusquedaVentasLineas,id_linea_marcaBusquedaVentasLineas,fecha_emision_desdeBusquedaVentasLineas,fecha_emision_hastaBusquedaVentasLineas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ventaslineasLogic.getVentasLineass()==null||ventaslineasLogic.getVentasLineass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ventaslineass==null|| ventaslineass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ventaslineassAux=new ArrayList<VentasLineas>();
						ventaslineassAux.addAll(ventaslineasLogic.getVentasLineass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventaslineassAux=new ArrayList<VentasLineas>();
							ventaslineassAux.addAll(ventaslineass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ventaslineasLogic.getVentasLineassBusquedaVentasLineas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_empresaBusquedaVentasLineas,id_lineaBusquedaVentasLineas,id_linea_grupoBusquedaVentasLineas,id_linea_categoriaBusquedaVentasLineas,id_linea_marcaBusquedaVentasLineas,fecha_emision_desdeBusquedaVentasLineas,fecha_emision_hastaBusquedaVentasLineas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentasLineasConstantesFunciones.getDetalleIndiceBusquedaVentasLineas(id_empresaBusquedaVentasLineas,id_lineaBusquedaVentasLineas,id_linea_grupoBusquedaVentasLineas,id_linea_categoriaBusquedaVentasLineas,id_linea_marcaBusquedaVentasLineas,fecha_emision_desdeBusquedaVentasLineas,fecha_emision_hastaBusquedaVentasLineas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentasLineasConstantesFunciones.getDetalleIndiceBusquedaVentasLineas(id_empresaBusquedaVentasLineas,id_lineaBusquedaVentasLineas,id_linea_grupoBusquedaVentasLineas,id_linea_categoriaBusquedaVentasLineas,id_linea_marcaBusquedaVentasLineas,fecha_emision_desdeBusquedaVentasLineas,fecha_emision_hastaBusquedaVentasLineas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVentasLineass("BusquedaVentasLineas",ventaslineasLogic.getVentasLineass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVentasLineass("BusquedaVentasLineas",ventaslineass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ventaslineasLogic.setVentasLineass(new ArrayList<VentasLineas>());
						ventaslineasLogic.getVentasLineass().addAll(ventaslineassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventaslineass=new ArrayList<VentasLineas>();
							ventaslineass.addAll(ventaslineassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVentasLineas();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVentasLineas();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventaslineasLogic.getVentasLineass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventaslineass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventaslineasLogic.getVentasLineass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventaslineass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(VentasLineas ventaslineas) {
		Boolean permite=true;
		
		if(this.ventaslineas.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VentasLineasConstantesFunciones.getOrderByListaVentasLineas();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VentasLineasConstantesFunciones.getOrderByListaVentasLineas();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasLineas ventaslineas:ventaslineasLogic.getVentasLineass()) {
				if(ventaslineas.getsType().equals(Constantes2.S_TOTALES)) {
					ventaslineasTotales=ventaslineas;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasLineas ventaslineas:this.ventaslineass) {
				if(ventaslineas.getsType().equals(Constantes2.S_TOTALES)) {
					ventaslineasTotales=ventaslineas;
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
			this.ventaslineasAux=new VentasLineas();
			this.ventaslineasAux.setsType(Constantes2.S_TOTALES);
			this.ventaslineasAux.setIsNew(false);
			this.ventaslineasAux.setIsChanged(false);
			this.ventaslineasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//VentasLineasConstantesFunciones.TotalizarValoresFilaVentasLineas(this.ventaslineasLogic.getVentasLineass(),this.ventaslineasAux);
				
				//this.ventaslineasLogic.getVentasLineass().add(this.ventaslineasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VentasLineasConstantesFunciones.TotalizarValoresFilaVentasLineas(this.ventaslineass,this.ventaslineasAux);
				
				this.ventaslineass.add(this.ventaslineasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ventaslineasTotales=new VentasLineas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventaslineasLogic.getVentasLineass().remove(ventaslineasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventaslineass.remove(ventaslineasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ventaslineasTotales=new VentasLineas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasLineas ventaslineas:ventaslineasLogic.getVentasLineass()) {
				if(ventaslineas.getsType().equals(Constantes2.S_TOTALES)) {
					ventaslineasTotales=ventaslineas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentasLineasConstantesFunciones.TotalizarValoresFilaVentasLineas(this.ventaslineasLogic.getVentasLineass(),ventaslineasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasLineas ventaslineas:this.ventaslineass) {
				if(ventaslineas.getsType().equals(Constantes2.S_TOTALES)) {
					ventaslineasTotales=ventaslineas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentasLineasConstantesFunciones.TotalizarValoresFilaVentasLineas(this.ventaslineass,ventaslineasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVentasLineassBusquedaVentasLineas()throws Exception {
		try {
			sAccionBusqueda="BusquedaVentasLineas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasLineassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasLineassFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasLineassFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasLineassFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasLineassFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVentasLineassBusquedaVentasLineas(String sFinalQuery,Long id_empresa,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventaslineasLogic.getVentasLineassBusquedaVentasLineas(sFinalQuery,this.pagination,id_empresa,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasLineassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventaslineasLogic.getVentasLineassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasLineassFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventaslineasLogic.getVentasLineassFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasLineassFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventaslineasLogic.getVentasLineassFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasLineassFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventaslineasLogic.getVentasLineassFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasLineassFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventaslineasLogic.getVentasLineassFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
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
	
	public void inicializarPermisosVentasLineas() {
		this.isPermisoTodoVentasLineas=false;
		this.isPermisoNuevoVentasLineas=false;
		this.isPermisoActualizarVentasLineas=false;
		this.isPermisoActualizarOriginalVentasLineas=false;
		this.isPermisoEliminarVentasLineas=false;
		this.isPermisoGuardarCambiosVentasLineas=false;
		this.isPermisoConsultaVentasLineas=true;
		this.isPermisoBusquedaVentasLineas=true;
		this.isPermisoReporteVentasLineas=true;
		this.isPermisoOrdenVentasLineas=false;		
		this.isPermisoPaginacionMedioVentasLineas=false;		
		this.isPermisoPaginacionAltoVentasLineas=false;		
		this.isPermisoPaginacionTodoVentasLineas=false;		
		this.isPermisoCopiarVentasLineas=false;		
		this.isPermisoVerFormVentasLineas=false;		
		this.isPermisoDuplicarVentasLineas=false;
		this.isPermisoOrdenVentasLineas=false;
	}
	
	public void setPermisosUsuarioVentasLineas(Boolean isPermiso) {
		this.isPermisoTodoVentasLineas=isPermiso;
		this.isPermisoNuevoVentasLineas=isPermiso;
		this.isPermisoActualizarVentasLineas=isPermiso;
		this.isPermisoActualizarOriginalVentasLineas=isPermiso;
		this.isPermisoEliminarVentasLineas=isPermiso;
		this.isPermisoGuardarCambiosVentasLineas=isPermiso;
		this.isPermisoConsultaVentasLineas=isPermiso;
		this.isPermisoBusquedaVentasLineas=isPermiso;
		this.isPermisoReporteVentasLineas=isPermiso;
		this.isPermisoOrdenVentasLineas=isPermiso;		
		this.isPermisoPaginacionMedioVentasLineas=isPermiso;		
		this.isPermisoPaginacionAltoVentasLineas=isPermiso;		
		this.isPermisoPaginacionTodoVentasLineas=isPermiso;		
		this.isPermisoCopiarVentasLineas=isPermiso;		
		this.isPermisoVerFormVentasLineas=isPermiso;		
		this.isPermisoDuplicarVentasLineas=isPermiso;
		this.isPermisoOrdenVentasLineas=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVentasLineas(Boolean isPermiso) {
		//this.isPermisoTodoVentasLineas=isPermiso;
		this.isPermisoNuevoVentasLineas=isPermiso;
		this.isPermisoActualizarVentasLineas=isPermiso;
		this.isPermisoActualizarOriginalVentasLineas=isPermiso;
		this.isPermisoEliminarVentasLineas=isPermiso;
		this.isPermisoGuardarCambiosVentasLineas=isPermiso;
		//this.isPermisoConsultaVentasLineas=isPermiso;
		//this.isPermisoBusquedaVentasLineas=isPermiso;
		//this.isPermisoReporteVentasLineas=isPermiso;
		//this.isPermisoOrdenVentasLineas=isPermiso;		
		//this.isPermisoPaginacionMedioVentasLineas=isPermiso;		
		//this.isPermisoPaginacionAltoVentasLineas=isPermiso;		
		//this.isPermisoPaginacionTodoVentasLineas=isPermiso;		
		//this.isPermisoCopiarVentasLineas=isPermiso;		
		//this.isPermisoDuplicarVentasLineas=isPermiso;
		//this.isPermisoOrdenVentasLineas=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVentasLineasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VentasLineasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebVentasLineas(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVentasLineasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVentasLineasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVentasLineasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVentasLineasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVentasLineas() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VentasLineasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VentasLineasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVentasLineas=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVentasLineas=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVentasLineas=this.isPermisoActualizarVentasLineas;
			this.isPermisoEliminarVentasLineas=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVentasLineas=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVentasLineas=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVentasLineas=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVentasLineas=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVentasLineas=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentasLineas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVentasLineas=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVentasLineas=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVentasLineas=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVentasLineas=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVentasLineas=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVentasLineas=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentasLineas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVentasLineas.setToolTipText(this.jTableDatosVentasLineas.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVentasLineas(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVentasLineas(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VentasLineasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(VentasLineasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioVentasLineas() throws Exception {
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
	public void inicializarCombosForeignKeyVentasLineasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVentasLineasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VentasLineasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyLineaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoriaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineacategoriasForeignKey==null||this.lineacategoriasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaCategoriasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarcaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineamarcasForeignKey==null||this.lineamarcasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaMarcasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyVentasLineas()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.ventaslineasSessionBean==null) {
				this.ventaslineasSessionBean=new VentasLineasSessionBean();
			}

			if(!this.ventaslineasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.ventaslineasSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				Linea linea=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(linea,Constantes.SMENSAJE_ESCOJA_OPCION);
				linea.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineasForeignKey,linea,true)) {

					this.lineasForeignKey.add(0,linea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaGrupo()throws Exception {
		try {

			if(!this.ventaslineasSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				Linea lineagrupo=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineagrupo,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineagrupo.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineagruposForeignKey,lineagrupo,true)) {

					this.lineagruposForeignKey.add(0,lineagrupo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaCategoria()throws Exception {
		try {

			if(!this.ventaslineasSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				Linea lineacategoria=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineacategoria,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineacategoria.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineacategoriasForeignKey,lineacategoria,true)) {

					this.lineacategoriasForeignKey.add(0,lineacategoria);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaMarca()throws Exception {
		try {

			if(!this.ventaslineasSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				Linea lineamarca=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineamarca,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineamarca.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineamarcasForeignKey,lineamarca,true)) {

					this.lineamarcasForeignKey.add(0,lineamarca);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyVentasLineas()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVentasLineas(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVentasLineas()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentasLineas();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVentasLineas(VentasLineas ventaslineas)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVentasLineas(VentasLineas ventaslineas,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVentasLineas()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVentasLineas()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVentasLineas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVentasLineas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVentasLineas()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVentasLineas()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVentasLineas(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVentasLineas()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_empresaVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_empresaVentasLineas.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_empresaVentasLineas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_lineaVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_lineaVentasLineas.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_lineaVentasLineas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_grupoVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_grupoVentasLineas.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_grupoVentasLineas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_categoriaVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_categoriaVentasLineas.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_categoriaVentasLineas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_marcaVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_marcaVentasLineas.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_marcaVentasLineas.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public VentasLineasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VentasLineasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VentasLineasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ventaslineasSessionBean=new VentasLineasSessionBean(); 
		this.ventaslineasConstantesFunciones=new VentasLineasConstantesFunciones(); 
		this.ventaslineasBean=new VentasLineas();//(this.ventaslineasConstantesFunciones); 		
		this.ventaslineasReturnGeneral=new VentasLineasParameterReturnGeneral(); 
		
		this.ventaslineasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventaslineasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VentasLineasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VentasLineasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VentasLineasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVentasLineas(true);
			
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
			
			this.ventaslineasConstantesFunciones=new VentasLineasConstantesFunciones(); 
			this.ventaslineasBean=new VentasLineas();//this.ventaslineasConstantesFunciones); 			
			this.ventaslineasReturnGeneral=new VentasLineasParameterReturnGeneral(); 
		
			VentasLineasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ventas Lineas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.ventaslineas=new VentasLineas();
			this.ventaslineass = new ArrayList<VentasLineas>();
			this.ventaslineassAux = new ArrayList<VentasLineas>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic=new VentasLineasLogic();
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}
			
			//this.ventaslineasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ventaslineasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVentasLineas);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVentasLineas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentasLineas);	
					}
					
					if(this.jInternalFrameImportacionVentasLineas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentasLineas);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVentasLineas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVentasLineas);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVentasLineas!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVentasLineas);
				this.jInternalFrameDetalleFormVentasLineas.setVisible(false);
				this.jInternalFrameDetalleFormVentasLineas.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasLineas!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentasLineas);
					this.jInternalFrameReporteDinamicoVentasLineas.setVisible(false);
					this.jInternalFrameReporteDinamicoVentasLineas.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVentasLineas!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVentasLineas);
					this.jInternalFrameImportacionVentasLineas.setVisible(false);
					this.jInternalFrameImportacionVentasLineas.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVentasLineas!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVentasLineas);
					this.jInternalFrameOrderByVentasLineas.setVisible(false);
					this.jInternalFrameOrderByVentasLineas.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVentasLineasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VentasLineasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ventaslineasReturnGeneral=new VentasLineasParameterReturnGeneral();
			
			this.ventaslineasParameterGeneral=new VentasLineasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ventaslineasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(VentasLineasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentasLineasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventaslineasSessionBean.getEsGuardarRelacionado(),this.ventaslineasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentasLineasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventaslineasSessionBean.getEsGuardarRelacionado(),this.ventaslineasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoVentasLineas=false;
			this.isVisibilidadCeldaDuplicarVentasLineas=true;
			this.isVisibilidadCeldaCopiarVentasLineas=true;
			this.isVisibilidadCeldaVerFormVentasLineas=true;
			this.isVisibilidadCeldaOrdenVentasLineas=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasLineas=false;
			this.isVisibilidadCeldaModificarVentasLineas=false;
			this.isVisibilidadCeldaActualizarVentasLineas=false;
			this.isVisibilidadCeldaEliminarVentasLineas=false;
			this.isVisibilidadCeldaCancelarVentasLineas=false;
			this.isVisibilidadCeldaGuardarVentasLineas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasLineas=false;
			
			
			this.isVisibilidadBusquedaVentasLineas=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVentasLineas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVentasLineas();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVentasLineas(false);
			
			this.setPermisosUsuarioVentasLineas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventaslineasSessionBean.getEsGuardarRelacionado() 
				|| (this.ventaslineasSessionBean.getEsGuardarRelacionado() && this.ventaslineasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVentasLineasClasesRelacionadas();
			}
			
			if(this.ventaslineasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVentasLineasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVentasLineas();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVentasLineas();
			}
			
			if(!this.isPermisoBusquedaVentasLineas) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVentasLineas.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VentasLineasConstantesFunciones.getTiposSeleccionarVentasLineas());
				
				this.tiposColumnasSelect=VentasLineasConstantesFunciones.getTiposSeleccionarVentasLineas(true);
				
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
			//if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVentasLineas();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioVentasLineas(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioVentasLineas(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasLineas() ;
			
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
			this.lineaLogic=new LineaLogic();
			this.lineagrupoLogic=new LineaLogic();
			this.lineacategoriaLogic=new LineaLogic();
			this.lineamarcaLogic=new LineaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				ventaslineasImplementable= (VentasLineasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentasLineasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ventaslineasImplementableHome= (VentasLineasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentasLineasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ventaslineass= new ArrayList<VentasLineas>();
			this.ventaslineassEliminados= new ArrayList<VentasLineas>();
						
			this.isEsNuevoVentasLineas=false;
			this.esParaAccionDesdeFormularioVentasLineas=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVentasLineas(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVentasLineas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VentasLineasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VentasLineasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVentasLineas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVentasLineas(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVentasLineas!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVentasLineas();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVentasLineas();
			}
			
			VentasLineasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVentasLineas.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVentasLineas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVentasLineas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVentasLineas(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga VentasLineas: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVentasLineas() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVentasLineas")) {
				iIndex=this.jInternalFrameDetalleFormVentasLineas.jTabbedPaneRelacionesVentasLineas.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVentasLineas.jTabbedPaneRelacionesVentasLineas.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVentasLineas();	
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
	
	public void cargarCombosForeignKeyVentasLineas(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVentasLineas(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVentasLineas(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVentasLineasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVentasLineas();
		
		this.cargarCombosFrameForeignKeyVentasLineas();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVentasLineas();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVentasLineas();
		}
	}
	
	

	public void cargarCombosForeignKeyLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLinea(this.lineasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaGrupo(this.lineagruposForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoria(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaCategoria(this.lineacategoriasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarca(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaMarca(this.lineamarcasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoVentasLineasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ventaslineasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVentasLineas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
			
			
			if(jTableDatosVentasLineas.getRowCount()>=1) {
				jTableDatosVentasLineas.removeRowSelectionInterval(0, jTableDatosVentasLineas.getRowCount()-1);						
			}
			
			this.isEsNuevoVentasLineas=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVentasLineas(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVentasLineas(true);			
			//this.ventaslineas=new VentasLineas();
			//this.ventaslineas.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasLineas(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasLineas() ;
			
			if(VentasLineasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasLineas(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ventaslineas);	
			this.actualizarInformacion("INFO_PADRE",false,this.ventaslineas);				
			
			VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
			
			if(this.ventaslineasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VentasLineas: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVentasLineasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<VentasLineas> ventaslineassSeleccionados=new ArrayList<VentasLineas>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVentasLineas.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVentasLineas.getSelectedRows().length;			
			}
			
			ventaslineassSeleccionados=this.getVentasLineassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVentasLineas--;			
				//VentasLineas ventaslineasAux= new VentasLineas();			
				//ventaslineasAux.setId(this.iIdNuevoVentasLineas);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VentasLineas ventaslineasOrigen=new VentasLineas();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VentasLineas ventaslineasOrigen : ventaslineassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ventaslineasOrigen =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventaslineasOrigen =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVentasLineas();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ventaslineas.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVentasLineas(ventaslineasOrigen,this.ventaslineas,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventaslineasLogic.getVentasLineass().add(this.ventaslineasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventaslineass.add(this.ventaslineasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVentasLineas(false);
				
				this.jTableDatosVentasLineas.setRowSelectionInterval(this.getIndiceNuevoVentasLineas(), this.getIndiceNuevoVentasLineas());
				
				int iLastRow =  this.jTableDatosVentasLineas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentasLineas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentasLineas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasLineas(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVentasLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<VentasLineas> ventaslineassSeleccionados=new ArrayList<VentasLineas>();									
		
			VentasLineas ventaslineasOrigen=new VentasLineas();
			VentasLineas ventaslineasDestino=new VentasLineas();
				
			ventaslineassSeleccionados=this.getVentasLineassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVentasLineas.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ventaslineassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVentasLineas.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventaslineasOrigen =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventaslineasOrigen =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventaslineasDestino =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventaslineasDestino =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ventaslineasOrigen =ventaslineassSeleccionados.get(0);
				ventaslineasDestino =ventaslineassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVentasLineas(ventaslineasOrigen,ventaslineasDestino,true,false);
				
				ventaslineasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ventaslineasDestino,ventaslineasLogic.getVentasLineass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ventaslineasDestino,ventaslineass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVentasLineas(false);
				
				//this.jTableDatosVentasLineas.setRowSelectionInterval(this.getIndiceNuevoVentasLineas(), this.getIndiceNuevoVentasLineas());
				
				int iLastRow =  this.jTableDatosVentasLineas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentasLineas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentasLineas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasLineas(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVentasLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentasLineas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVentasLineas.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVentasLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVentasLineas.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVentasLineas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVentasLineas.setVisible(!isVisible);
			this.jPanelPaginacionVentasLineas.setVisible(!isVisible);
			this.jPanelAccionesVentasLineas.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVentasLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVentasLineas();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVentasLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVentasLineas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVentasLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVentasLineas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVentasLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVentasLineas();
			
			this.abrirFrameOrderByVentasLineas();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVentasLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVentasLineas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVentasLineas(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentasLineas);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVentasLineas.isMaximum()) {
					this.jInternalFrameDetalleFormVentasLineas.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVentasLineas.setSize(this.jInternalFrameDetalleFormVentasLineas.iWidthFormulario,this.jInternalFrameDetalleFormVentasLineas.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVentasLineas.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVentasLineas.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVentasLineas.isMaximum()) {
						this.jInternalFrameDetalleFormVentasLineas.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVentasLineas.jContentPaneDetalleVentasLineas.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVentasLineas.jTabbedPaneRelacionesVentasLineas.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVentasLineas.jContentPaneDetalleVentasLineas.getWidth(),VentasLineasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentasLineas.jTabbedPaneRelacionesVentasLineas.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVentasLineas.jContentPaneDetalleVentasLineas.getWidth(),VentasLineasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentasLineas.jTabbedPaneRelacionesVentasLineas.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVentasLineas.jContentPaneDetalleVentasLineas.getWidth(),VentasLineasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVentasLineas.setVisible(true);
	        this.jInternalFrameDetalleFormVentasLineas.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVentasLineas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVentasLineas==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVentasLineas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasLineas,false,this);
				} else {
					this.jInternalFrameOrderByVentasLineas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasLineas,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVentasLineas);
				this.jInternalFrameOrderByVentasLineas.setVisible(false);
				this.jInternalFrameOrderByVentasLineas.setSelected(false);
				
				this.jInternalFrameOrderByVentasLineas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentasLineas"));
				
				this.inicializarActualizarBindingTablaOrderByVentasLineas();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVentasLineas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVentasLineas==null) {
				
				this.jInternalFrameImportacionVentasLineas=new ImportacionJInternalFrame(VentasLineasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentasLineas);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVentasLineas);
				this.jInternalFrameImportacionVentasLineas.setVisible(false);
				this.jInternalFrameImportacionVentasLineas.setSelected(false);


				this.jInternalFrameImportacionVentasLineas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentasLineas"));
				this.jInternalFrameImportacionVentasLineas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentasLineas"));
				this.jInternalFrameImportacionVentasLineas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentasLineas"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVentasLineas() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVentasLineas==null) {
				this.jInternalFrameReporteDinamicoVentasLineas=new ReporteDinamicoJInternalFrame(VentasLineasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentasLineas);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentasLineas);
				this.jInternalFrameReporteDinamicoVentasLineas.setVisible(false);
				this.jInternalFrameReporteDinamicoVentasLineas.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVentasLineas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasLineas"));
				this.jInternalFrameReporteDinamicoVentasLineas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasLineas"));
				this.jInternalFrameReporteDinamicoVentasLineas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasLineas"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasLineas();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVentasLineas() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentasLineas);
			
	       	this.jInternalFrameDetalleFormVentasLineas.setVisible(false);
	        this.jInternalFrameDetalleFormVentasLineas.setSelected(false);
			
			//this.jInternalFrameDetalleFormVentasLineas.dispose();
			//this.jInternalFrameDetalleFormVentasLineas=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVentasLineas() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVentasLineas.setVisible(true);
	        this.jInternalFrameReporteDinamicoVentasLineas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVentasLineas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVentasLineas.setVisible(true);
	        this.jInternalFrameImportacionVentasLineas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVentasLineas() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVentasLineas.setVisible(true);
	        this.jInternalFrameOrderByVentasLineas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVentasLineas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVentasLineas.setVisible(false);
	        this.jInternalFrameOrderByVentasLineas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVentasLineas() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVentasLineas.setVisible(false);
	        this.jInternalFrameReporteDinamicoVentasLineas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVentasLineas() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVentasLineas.setVisible(false);
	        this.jInternalFrameImportacionVentasLineas.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVentasLineasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVentasLineas(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVentasLineas(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVentasLineas(true);
			//this.isEsNuevoVentasLineas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVentasLineas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasLineas(false) ;
			
			if(ventaslineasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VentasLineasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasLineas(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasLineas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVentasLineasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVentasLineas(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentasLineas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVentasLineas(true);
			//this.isEsNuevoVentasLineas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ventaslineas.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVentasLineas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVentasLineas(false) ;
			
			if(VentasLineasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasLineas(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasLineas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosVentasLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,VentasLineasConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVentasLineas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaGrupo(List<Linea> lineagruposForeignKey)throws Exception{
		TableColumn tableColumnLineaGrupo=this.jTableDatosVentasLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,VentasLineasConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVentasLineas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineagruposForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaCategoria(List<Linea> lineacategoriasForeignKey)throws Exception{
		TableColumn tableColumnLineaCategoria=this.jTableDatosVentasLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,VentasLineasConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVentasLineas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineacategoriasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaMarca(List<Linea> lineamarcasForeignKey)throws Exception{
		TableColumn tableColumnLineaMarca=this.jTableDatosVentasLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,VentasLineasConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVentasLineas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarVentasLineasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVentasLineas(false);
			
			//if(!this.isEsNuevoVentasLineas) {								
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VentasLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				
			}
			
			if(this.permiteMantenimiento(this.ventaslineas)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVentasLineas=true;
					this.inicializarActualizarBindingTablaVentasLineas(false);
					this.isEsNuevoVentasLineas=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVentasLineas=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVentasLineas=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentasLineas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasLineas(false);
				
				this.habilitarDeshabilitarControlesVentasLineas(false);
			
												
				
				if(VentasLineasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVentasLineas();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVentasLineasActionPerformed(evt,ventaslineasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVentasLineas(this.ventaslineas,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVentasLineas.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ventaslineasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ventaslineas.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VentasLineas.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasLineas.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVentasLineasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				this.ventaslineas.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				this.ventaslineas.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ventaslineas)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VentasLineasModel) this.jTableDatosVentasLineas.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVentasLineas=true;
				this.inicializarActualizarBindingTablaVentasLineas(false);
				this.isEsNuevoVentasLineas=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentasLineas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasLineas(false);
				
				this.habilitarDeshabilitarControlesVentasLineas(false);
				
				
				
				if(VentasLineasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVentasLineas();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVentasLineasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVentasLineas.getRowCount()>=1) {
				jTableDatosVentasLineas.removeRowSelectionInterval(0, jTableDatosVentasLineas.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVentasLineas(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVentasLineas(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasLineas(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasLineas(false) ;
			
			this.isEsNuevoVentasLineas=false;
			
			if(VentasLineasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVentasLineas();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVentasLineasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVentasLineas(false);
				
				//SI ES MANUAL
				if(VentasLineasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVentasLineas();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVentasLineasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVentasLineas--;			
			//VentasLineas ventaslineasAux= new VentasLineas();			
			//ventaslineasAux.setId(this.iIdNuevoVentasLineas);
			
			if(this.jInternalFrameDetalleFormVentasLineas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVentasLineas();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
			
			this.ventaslineas.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ventaslineasLogic.getVentasLineass().add(this.ventaslineasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ventaslineass.add(this.ventaslineasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVentasLineas(false);
			
			this.jTableDatosVentasLineas.setRowSelectionInterval(this.getIndiceNuevoVentasLineas(), this.getIndiceNuevoVentasLineas());
			
			int iLastRow =  this.jTableDatosVentasLineas.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVentasLineas.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVentasLineas.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVentasLineas(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVentasLineasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVentasLineas(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasLineas(false);
			
			//SI ES MANUAL
			if(VentasLineasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasLineas();
			}
			
			//this.abrirFrameTreeVentasLineas();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVentasLineasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVentasLineasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVentasLineas.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVentasLineas.setFileImportacion(this.jInternalFrameImportacionVentasLineas.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVentasLineas.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVentasLineas.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVentasLineas.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVentasLineas.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVentasLineasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<VentasLineas> ventaslineassSeleccionados=new ArrayList<VentasLineas>();		

		ventaslineassSeleccionados=this.getVentasLineassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VentasLineasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VentasLineasBaseDesign.jrxml";
			
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
			
			this.generarReporteVentasLineass("Todos",ventaslineassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventaslineasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Lineas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoVentasLineas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasLineas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentasLineasConstantesFunciones.LABEL_NOMBRELINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLinea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLinea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLinea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLinea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasLineasConstantesFunciones.LABEL_NOMBREMARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreMarca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreMarca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreMarca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreMarca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasLineasConstantesFunciones.LABEL_MONTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasLineasConstantesFunciones.LABEL_NOTASCREDITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tasCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tasCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tasCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tasCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasLineasConstantesFunciones.LABEL_VENTANETA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntaNeta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntaNeta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntaNeta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntaNeta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasLineasConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasLineasConstantesFunciones.LABEL_ACUMULADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_umulado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_umulado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_umulado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_umulado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasLineasConstantesFunciones.LABEL_TIPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_po_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_po_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_po_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_po_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoVentasLineas.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VentasLineasConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoria="nombre_linea";
					break;

				case VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO:
					sNombreCampoCategoria="nombre_grupo";
					break;

				case VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA:
					sNombreCampoCategoria="nombre_categoria";
					break;

				case VentasLineasConstantesFunciones.LABEL_NOMBREMARCA:
					sNombreCampoCategoria="nombre_marca";
					break;

				case VentasLineasConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoria="monto";
					break;

				case VentasLineasConstantesFunciones.LABEL_NOTASCREDITO:
					sNombreCampoCategoria="notas_credito";
					break;

				case VentasLineasConstantesFunciones.LABEL_VENTANETA:
					sNombreCampoCategoria="venta_neta";
					break;

				case VentasLineasConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case VentasLineasConstantesFunciones.LABEL_ACUMULADO:
					sNombreCampoCategoria="acumulado";
					break;

				case VentasLineasConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoria="tipo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VentasLineasConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoriaValor="nombre_linea";
					break;

				case VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO:
					sNombreCampoCategoriaValor="nombre_grupo";
					break;

				case VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA:
					sNombreCampoCategoriaValor="nombre_categoria";
					break;

				case VentasLineasConstantesFunciones.LABEL_NOMBREMARCA:
					sNombreCampoCategoriaValor="nombre_marca";
					break;

				case VentasLineasConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoriaValor="monto";
					break;

				case VentasLineasConstantesFunciones.LABEL_NOTASCREDITO:
					sNombreCampoCategoriaValor="notas_credito";
					break;

				case VentasLineasConstantesFunciones.LABEL_VENTANETA:
					sNombreCampoCategoriaValor="venta_neta";
					break;

				case VentasLineasConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case VentasLineasConstantesFunciones.LABEL_ACUMULADO:
					sNombreCampoCategoriaValor="acumulado";
					break;

				case VentasLineasConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoriaValor="tipo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVentasLineas.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasLineas.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentasLineasConstantesFunciones.LABEL_NOMBRELINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea");
					break;

				case VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_grupo");
					break;

				case VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_categoria");
					break;

				case VentasLineasConstantesFunciones.LABEL_NOMBREMARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_marca");
					break;

				case VentasLineasConstantesFunciones.LABEL_MONTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto");
					break;

				case VentasLineasConstantesFunciones.LABEL_NOTASCREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Notas Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"notas_credito");
					break;

				case VentasLineasConstantesFunciones.LABEL_VENTANETA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Venta Neta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"venta_neta");
					break;

				case VentasLineasConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case VentasLineasConstantesFunciones.LABEL_ACUMULADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Acumulado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"acumulado");
					break;

				case VentasLineasConstantesFunciones.LABEL_TIPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo");
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
	
	public void jButtonGenerarExcelReporteDinamicoVentasLineasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<VentasLineas> ventaslineassSeleccionados=new ArrayList<VentasLineas>();		
		
		ventaslineassSeleccionados=this.getVentasLineassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventaslineas";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("VentasLineass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVentasLineas.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasLineas.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VentasLineasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasLineasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(VentasLineas ventaslineas:ventaslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaslineas.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasLineasConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasLineasConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(VentasLineas ventaslineas:ventaslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaslineas.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasLineasConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasLineasConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(VentasLineas ventaslineas:ventaslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaslineas.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasLineasConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasLineasConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(VentasLineas ventaslineas:ventaslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaslineas.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasLineasConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasLineasConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(VentasLineas ventaslineas:ventaslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaslineas.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(VentasLineas ventaslineas:ventaslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaslineas.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(VentasLineas ventaslineas:ventaslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaslineas.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasLineasConstantesFunciones.LABEL_NOMBRELINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasLineasConstantesFunciones.LABEL_NOMBRELINEA);
					iRow++;

					for(VentasLineas ventaslineas:ventaslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaslineas.getnombre_linea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO);
					iRow++;

					for(VentasLineas ventaslineas:ventaslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaslineas.getnombre_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA);
					iRow++;

					for(VentasLineas ventaslineas:ventaslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaslineas.getnombre_categoria());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasLineasConstantesFunciones.LABEL_NOMBREMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasLineasConstantesFunciones.LABEL_NOMBREMARCA);
					iRow++;

					for(VentasLineas ventaslineas:ventaslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaslineas.getnombre_marca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasLineasConstantesFunciones.LABEL_MONTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasLineasConstantesFunciones.LABEL_MONTO);
					iRow++;

					for(VentasLineas ventaslineas:ventaslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaslineas.getmonto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasLineasConstantesFunciones.LABEL_NOTASCREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasLineasConstantesFunciones.LABEL_NOTASCREDITO);
					iRow++;

					for(VentasLineas ventaslineas:ventaslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaslineas.getnotas_credito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasLineasConstantesFunciones.LABEL_VENTANETA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasLineasConstantesFunciones.LABEL_VENTANETA);
					iRow++;

					for(VentasLineas ventaslineas:ventaslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaslineas.getventa_neta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasLineasConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasLineasConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(VentasLineas ventaslineas:ventaslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaslineas.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasLineasConstantesFunciones.LABEL_ACUMULADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasLineasConstantesFunciones.LABEL_ACUMULADO);
					iRow++;

					for(VentasLineas ventaslineas:ventaslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaslineas.getacumulado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasLineasConstantesFunciones.LABEL_TIPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasLineasConstantesFunciones.LABEL_TIPO);
					iRow++;

					for(VentasLineas ventaslineas:ventaslineassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaslineas.gettipo());
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
			//	this.getFilaCabeceraExportarExcelVentasLineas(row);				
			//	iRow++;
			//}				
			
			//for(VentasLineas ventaslineasAux:ventaslineassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVentasLineas(ventaslineasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventaslineasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Lineas",JOptionPane.INFORMATION_MESSAGE);
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
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasLineas(false);
			
			//SI ES MANUAL
			if(VentasLineasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasLineas();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVentasLineasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasLineas(false);
			
			//SI ES MANUAL
			if(VentasLineasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentasLineas();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVentasLineasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasLineas(false);
			
			//SI ES MANUAL
			if(VentasLineasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentasLineas();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVentasLineas() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVentasLineas.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVentasLineas.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVentasLineas.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVentasLineas.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVentasLineas.setMinimumSize(dimensionMinimum);
		this.jTableDatosVentasLineas.setMaximumSize(dimensionMaximum);
		this.jTableDatosVentasLineas.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVentasLineas(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVentasLineas(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVentasLineas(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVentasLineas(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVentasLineas(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVentasLineas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasLineas(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVentasLineas(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VentasLineasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VentasLineasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVentasLineas() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVentasLineas();
		
		this.inicializarActualizarBindingBotonesManualVentasLineas(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVentasLineas();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasLineas() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVentasLineas(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVentasLineas(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVentasLineas.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVentasLineas.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVentasLineas.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVentasLineas!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVentasLineas.jCheckBoxPostAccionNuevoVentasLineas.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVentasLineas.jCheckBoxPostAccionSinCerrarVentasLineas.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVentasLineas.jCheckBoxPostAccionSinMensajeVentasLineas.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVentasLineas.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVentasLineas.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVentasLineas.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVentasLineas!=null) {
				this.jInternalFrameDetalleFormVentasLineas.jCheckBoxPostAccionNuevoVentasLineas.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVentasLineas.jCheckBoxPostAccionSinCerrarVentasLineas.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVentasLineas.jCheckBoxPostAccionSinMensajeVentasLineas.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVentasLineas.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVentasLineas.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVentasLineas!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVentasLineas.jComboBoxTiposAccionesFormularioVentasLineas.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVentasLineas.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVentasLineas!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVentasLineas.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVentasLineas.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVentasLineas.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVentasLineas.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVentasLineas!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVentasLineas.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVentasLineas.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVentasLineas(Boolean esInicializar) throws Exception {
		try	{	
			if(VentasLineasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVentasLineas(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVentasLineas() throws Exception {
		try	{
			if(VentasLineasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVentasLineas();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentasLineas() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVentasLineas.jComboBoxTiposAccionesFormularioVentasLineas.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVentasLineas.jComboBoxTiposAccionesFormularioVentasLineas.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVentasLineas() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVentasLineas.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVentasLineas.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVentasLineas.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVentasLineas.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVentasLineas.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVentasLineas.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVentasLineas.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVentasLineas.addItem(reporte);
			}
			
			
			if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVentasLineas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVentasLineas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVentasLineas.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVentasLineas.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVentasLineas.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVentasLineas.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVentasLineas.jComboBoxTiposAccionesFormularioVentasLineas.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVentasLineas.jComboBoxTiposAccionesFormularioVentasLineas.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVentasLineas.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVentasLineas.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVentasLineas.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasLineas();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasLineas() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentasLineas!=null) {
				this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentasLineas!=null) {
				this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVentasLineas!=null) {
				
				if(this.jInternalFrameReporteDinamicoVentasLineas.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentasLineas.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasLineas.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVentasLineas.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentasLineas.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasLineas.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=VentasLineasConstantesFunciones.getTiposSeleccionarVentasLineas(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=VentasLineasConstantesFunciones.getTiposSeleccionarVentasLineas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoVentasLineas.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentasLineas.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=VentasLineasConstantesFunciones.getTiposSeleccionarVentasLineas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasLineas.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoVentasLineas.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVentasLineas()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empresaBusquedaVentasLineasVentasLineas.getSelectedItem()!=null){this.id_empresaBusquedaVentasLineas=((Empresa)this.jComboBoxid_empresaBusquedaVentasLineasVentasLineas.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaVentasLineasVentasLineas.getSelectedItem()!=null){this.id_lineaBusquedaVentasLineas=((Linea)this.jComboBoxid_lineaBusquedaVentasLineasVentasLineas.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas.getSelectedItem()!=null){this.id_linea_grupoBusquedaVentasLineas=((Linea)this.jComboBoxid_linea_grupoBusquedaVentasLineasVentasLineas.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas.getSelectedItem()!=null){this.id_linea_categoriaBusquedaVentasLineas=((Linea)this.jComboBoxid_linea_categoriaBusquedaVentasLineasVentasLineas.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas.getSelectedItem()!=null){this.id_linea_marcaBusquedaVentasLineas=((Linea)this.jComboBoxid_linea_marcaBusquedaVentasLineasVentasLineas.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaVentasLineas=new Date(this.jDateChooserfecha_emision_desdeBusquedaVentasLineasVentasLineas.getDate().getTime());
		this.fecha_emision_hastaBusquedaVentasLineas=new Date(this.jDateChooserfecha_emision_hastaBusquedaVentasLineasVentasLineas.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVentasLineas(Boolean esInicializar) throws Exception {				
		if(VentasLineasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVentasLineas();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVentasLineas() throws Exception {
		this.inicializarActualizarBindingTablaVentasLineas(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVentasLineas() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVentasLineas.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVentasLineas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasLineas.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VentasLineasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVentasLineas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasLineas.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VentasLineasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVentasLineasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasLineasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VentasLineasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVentasLineas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasLineas.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VentasLineasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVentasLineas.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVentasLineas(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ventaslineasLogic.getVentasLineass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ventaslineass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VentasLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVentasLineas.setModel(new VentasLineasModel(this.ventaslineasLogic.getVentasLineass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVentasLineas.setModel(new VentasLineasModel(this.ventaslineass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVentasLineas!=null && this.jInternalFrameOrderByVentasLineas.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVentasLineas();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVentasLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VentasLineasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VentasLineasConstantesFunciones.SCLASSWEBTITULO,ventaslineasConstantesFunciones.resaltarSeleccionarVentasLineas,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VentasLineasConstantesFunciones.SCLASSWEBTITULO,ventaslineasConstantesFunciones.resaltarSeleccionarVentasLineas,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVentasLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,VentasLineasConstantesFunciones.LABEL_ID));

		if(this.ventaslineasConstantesFunciones.mostraridVentasLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasLineasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventaslineasConstantesFunciones.resaltaridVentasLineas,this.ventaslineasConstantesFunciones.activaridVentasLineas,iSizeTabla,this,true,"idVentasLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaslineasConstantesFunciones.resaltaridVentasLineas,this.ventaslineasConstantesFunciones.activaridVentasLineas,this,true,"idVentasLineas","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,VentasLineasConstantesFunciones.LABEL_NOMBRELINEA));

		if(this.ventaslineasConstantesFunciones.mostrarnombre_lineaVentasLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasLineasConstantesFunciones.LABEL_NOMBRELINEA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventaslineasConstantesFunciones.resaltarnombre_lineaVentasLineas,this.ventaslineasConstantesFunciones.activarnombre_lineaVentasLineas,iSizeTabla,this,true,"nombre_lineaVentasLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaslineasConstantesFunciones.resaltarnombre_lineaVentasLineas,this.ventaslineasConstantesFunciones.activarnombre_lineaVentasLineas,this,true,"nombre_lineaVentasLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO));

		if(this.ventaslineasConstantesFunciones.mostrarnombre_grupoVentasLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventaslineasConstantesFunciones.resaltarnombre_grupoVentasLineas,this.ventaslineasConstantesFunciones.activarnombre_grupoVentasLineas,iSizeTabla,this,true,"nombre_grupoVentasLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaslineasConstantesFunciones.resaltarnombre_grupoVentasLineas,this.ventaslineasConstantesFunciones.activarnombre_grupoVentasLineas,this,true,"nombre_grupoVentasLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA));

		if(this.ventaslineasConstantesFunciones.mostrarnombre_categoriaVentasLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventaslineasConstantesFunciones.resaltarnombre_categoriaVentasLineas,this.ventaslineasConstantesFunciones.activarnombre_categoriaVentasLineas,iSizeTabla,this,true,"nombre_categoriaVentasLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaslineasConstantesFunciones.resaltarnombre_categoriaVentasLineas,this.ventaslineasConstantesFunciones.activarnombre_categoriaVentasLineas,this,true,"nombre_categoriaVentasLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,VentasLineasConstantesFunciones.LABEL_NOMBREMARCA));

		if(this.ventaslineasConstantesFunciones.mostrarnombre_marcaVentasLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasLineasConstantesFunciones.LABEL_NOMBREMARCA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventaslineasConstantesFunciones.resaltarnombre_marcaVentasLineas,this.ventaslineasConstantesFunciones.activarnombre_marcaVentasLineas,iSizeTabla,this,true,"nombre_marcaVentasLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaslineasConstantesFunciones.resaltarnombre_marcaVentasLineas,this.ventaslineasConstantesFunciones.activarnombre_marcaVentasLineas,this,true,"nombre_marcaVentasLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,VentasLineasConstantesFunciones.LABEL_MONTO));

		if(this.ventaslineasConstantesFunciones.mostrarmontoVentasLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasLineasConstantesFunciones.LABEL_MONTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventaslineasConstantesFunciones.resaltarmontoVentasLineas,this.ventaslineasConstantesFunciones.activarmontoVentasLineas,iSizeTabla,this,true,"montoVentasLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaslineasConstantesFunciones.resaltarmontoVentasLineas,this.ventaslineasConstantesFunciones.activarmontoVentasLineas,this,true,"montoVentasLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,VentasLineasConstantesFunciones.LABEL_NOTASCREDITO));

		if(this.ventaslineasConstantesFunciones.mostrarnotas_creditoVentasLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasLineasConstantesFunciones.LABEL_NOTASCREDITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventaslineasConstantesFunciones.resaltarnotas_creditoVentasLineas,this.ventaslineasConstantesFunciones.activarnotas_creditoVentasLineas,iSizeTabla,this,true,"notas_creditoVentasLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaslineasConstantesFunciones.resaltarnotas_creditoVentasLineas,this.ventaslineasConstantesFunciones.activarnotas_creditoVentasLineas,this,true,"notas_creditoVentasLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,VentasLineasConstantesFunciones.LABEL_VENTANETA));

		if(this.ventaslineasConstantesFunciones.mostrarventa_netaVentasLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasLineasConstantesFunciones.LABEL_VENTANETA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventaslineasConstantesFunciones.resaltarventa_netaVentasLineas,this.ventaslineasConstantesFunciones.activarventa_netaVentasLineas,iSizeTabla,this,true,"venta_netaVentasLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaslineasConstantesFunciones.resaltarventa_netaVentasLineas,this.ventaslineasConstantesFunciones.activarventa_netaVentasLineas,this,true,"venta_netaVentasLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,VentasLineasConstantesFunciones.LABEL_PORCENTAJE));

		if(this.ventaslineasConstantesFunciones.mostrarporcentajeVentasLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasLineasConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventaslineasConstantesFunciones.resaltarporcentajeVentasLineas,this.ventaslineasConstantesFunciones.activarporcentajeVentasLineas,iSizeTabla,this,true,"porcentajeVentasLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaslineasConstantesFunciones.resaltarporcentajeVentasLineas,this.ventaslineasConstantesFunciones.activarporcentajeVentasLineas,this,true,"porcentajeVentasLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,VentasLineasConstantesFunciones.LABEL_ACUMULADO));

		if(this.ventaslineasConstantesFunciones.mostraracumuladoVentasLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasLineasConstantesFunciones.LABEL_ACUMULADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventaslineasConstantesFunciones.resaltaracumuladoVentasLineas,this.ventaslineasConstantesFunciones.activaracumuladoVentasLineas,iSizeTabla,this,true,"acumuladoVentasLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaslineasConstantesFunciones.resaltaracumuladoVentasLineas,this.ventaslineasConstantesFunciones.activaracumuladoVentasLineas,this,true,"acumuladoVentasLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,VentasLineasConstantesFunciones.LABEL_TIPO));

		if(this.ventaslineasConstantesFunciones.mostrartipoVentasLineas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasLineasConstantesFunciones.LABEL_TIPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventaslineasConstantesFunciones.resaltartipoVentasLineas,this.ventaslineasConstantesFunciones.activartipoVentasLineas,iSizeTabla,this,true,"tipoVentasLineas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaslineasConstantesFunciones.resaltartipoVentasLineas,this.ventaslineasConstantesFunciones.activartipoVentasLineas,this,true,"tipoVentasLineas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasLineasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventaslineasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventaslineasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentasLineas.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventaslineasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventaslineasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentasLineas.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVentasLineas && this.isPermisoGuardarCambiosVentasLineas) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ventaslineasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ventaslineasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVentasLineas.addColumn(tableColumn);
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
			
			this.jTableDatosVentasLineas.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentasLineas && this.isPermisoGuardarCambiosVentasLineas) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentasLineas && this.isPermisoGuardarCambiosVentasLineas) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVentasLineas.moveColumn(this.jTableDatosVentasLineas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVentasLineas.moveColumn(this.jTableDatosVentasLineas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVentasLineas.moveColumn(this.jTableDatosVentasLineas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVentasLineas.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVentasLineas.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVentasLineas,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VentasLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVentasLineas.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVentasLineas.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VentasLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VentasLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVentasLineas.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVentasLineas.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVentasLineas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=ventaslineasLogic.getVentasLineass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ventaslineass.size()-1;
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
		//this.jTableDatosVentasLineas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVentasLineas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVentasLineas();
			
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
				
				//this.isEsNuevoVentasLineas=false;
					
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
			
				if(this.ventaslineasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVentasLineas==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentasLineas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentasLineas.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ventaslineas.getsType().equals("DUPLICADO")
				   || this.ventaslineas.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVentasLineas=true;
				
				} else {
					this.isEsNuevoVentasLineas=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
					if(this.ventaslineas.getId()>=0 && !this.ventaslineas.getIsNew()) {						
						this.isEsNuevoVentasLineas=false;
						
					} else {
						this.isEsNuevoVentasLineas=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVentasLineas(esRelaciones);						
				
				this.seleccionarVentasLineas(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ventaslineas.getId()<0) {
					this.isEsNuevoVentasLineas=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVentasLineas(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVentasLineas(evt,rowIndex);
				}	
				
				if(this.ventaslineasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VentasLineas: " + this.dDif); 
					}
				}								
				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVentasLineas(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ventaslineas)) {
					if(this.ventaslineas.getId()>0) {
						this.ventaslineas.setIsDeleted(true);
						
						this.ventaslineassEliminados.add(this.ventaslineas);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventaslineasLogic.getVentasLineass().remove(this.ventaslineas);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventaslineass.remove(this.ventaslineas);				
					}
					
					
					((VentasLineasModel) this.jTableDatosVentasLineas.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasLineas(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVentasLineas(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVentasLineas) {
			
			if(this.jInternalFrameDetalleFormVentasLineas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentasLineas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentasLineas.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VentasLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVentasLineas(this.ventaslineas);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVentasLineas("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVentasLineas(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasLineas() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentasLineas(VentasLineas ventaslineas) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVentasLineas(ventaslineas,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentasLineas(VentasLineas ventaslineas,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVentasLineas(ventaslineas);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVentasLineas(ventaslineas,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVentasLineas(ventaslineas);
	}
	
	public void setVariablesObjetoActualToFormularioVentasLineas(VentasLineas ventaslineas) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVentasLineas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVentasLineas.jLabelidVentasLineas.setText(ventaslineas.getId().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_lineaVentasLineas.setText(ventaslineas.getnombre_linea());
			this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_grupoVentasLineas.setText(ventaslineas.getnombre_grupo());
			this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_categoriaVentasLineas.setText(ventaslineas.getnombre_categoria());
			this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_marcaVentasLineas.setText(ventaslineas.getnombre_marca());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldmontoVentasLineas.setText(ventaslineas.getmonto().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldnotas_creditoVentasLineas.setText(ventaslineas.getnotas_credito().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldventa_netaVentasLineas.setText(ventaslineas.getventa_neta().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldporcentajeVentasLineas.setText(ventaslineas.getporcentaje().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldacumuladoVentasLineas.setText(ventaslineas.getacumulado().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldtipoVentasLineas.setText(ventaslineas.gettipo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,VentasLineas ventaslineasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ventaslineasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VentasLineas ventaslineasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ventaslineasLocal=this.ventaslineas;
			} else {
				ventaslineasLocal=this.ventaslineasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ventaslineasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVentasLineas(ventaslineasLocal,true);
					
					if(ventaslineasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ventaslineasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ventaslineasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVentasLineas(VentasLineas ventaslineas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentasLineas(ventaslineas,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(ventaslineas);
	}
	
	public void setVariablesFormularioToObjetoActualVentasLineas(VentasLineas ventaslineas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentasLineas(ventaslineas,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVentasLineas(VentasLineas ventaslineas,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVentasLineas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVentasLineas.jLabelidVentasLineas.getText()==null || this.jInternalFrameDetalleFormVentasLineas.jLabelidVentasLineas.getText()=="" || this.jInternalFrameDetalleFormVentasLineas.jLabelidVentasLineas.getText()=="Id") {
				this.jInternalFrameDetalleFormVentasLineas.jLabelidVentasLineas.setText("0");
			}

			if(conColumnasBase) {ventaslineas.setId(Long.parseLong(this.jInternalFrameDetalleFormVentasLineas.jLabelidVentasLineas.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasLineasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelIdVentasLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaslineas.setnombre_linea(this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_lineaVentasLineas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasLineasConstantesFunciones.LABEL_NOMBRELINEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelnombre_lineaVentasLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaslineas.setnombre_grupo(this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_grupoVentasLineas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelnombre_grupoVentasLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaslineas.setnombre_categoria(this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_categoriaVentasLineas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelnombre_categoriaVentasLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaslineas.setnombre_marca(this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_marcaVentasLineas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasLineasConstantesFunciones.LABEL_NOMBREMARCA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelnombre_marcaVentasLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaslineas.setmonto(Double.parseDouble(this.jInternalFrameDetalleFormVentasLineas.jTextFieldmontoVentasLineas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasLineasConstantesFunciones.LABEL_MONTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelmontoVentasLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaslineas.setnotas_credito(Double.parseDouble(this.jInternalFrameDetalleFormVentasLineas.jTextFieldnotas_creditoVentasLineas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasLineasConstantesFunciones.LABEL_NOTASCREDITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelnotas_creditoVentasLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaslineas.setventa_neta(Double.parseDouble(this.jInternalFrameDetalleFormVentasLineas.jTextFieldventa_netaVentasLineas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasLineasConstantesFunciones.LABEL_VENTANETA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelventa_netaVentasLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaslineas.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormVentasLineas.jTextFieldporcentajeVentasLineas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasLineasConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelporcentajeVentasLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaslineas.setacumulado(Double.parseDouble(this.jInternalFrameDetalleFormVentasLineas.jTextFieldacumuladoVentasLineas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasLineasConstantesFunciones.LABEL_ACUMULADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabelacumuladoVentasLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaslineas.settipo(this.jInternalFrameDetalleFormVentasLineas.jTextFieldtipoVentasLineas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasLineasConstantesFunciones.LABEL_TIPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasLineas.jLabeltipoVentasLineas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentasLineas(VentasLineas ventaslineasBean,VentasLineas ventaslineas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVentasLineas(VentasLineas ventaslineasOrigen,VentasLineas ventaslineas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventaslineasOrigen.getId()!=null && !ventaslineasOrigen.getId().equals(0L))) {ventaslineas.setId(ventaslineasOrigen.getId());}}
			if(conDefault || (!conDefault && ventaslineasOrigen.getfecha_emision_desde()!=null && !ventaslineasOrigen.getfecha_emision_desde().equals(new Date()))) {ventaslineas.setfecha_emision_desde(ventaslineasOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && ventaslineasOrigen.getfecha_emision_hasta()!=null && !ventaslineasOrigen.getfecha_emision_hasta().equals(new Date()))) {ventaslineas.setfecha_emision_hasta(ventaslineasOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && ventaslineasOrigen.getnombre_linea()!=null && !ventaslineasOrigen.getnombre_linea().equals(""))) {ventaslineas.setnombre_linea(ventaslineasOrigen.getnombre_linea());}
			if(conDefault || (!conDefault && ventaslineasOrigen.getnombre_grupo()!=null && !ventaslineasOrigen.getnombre_grupo().equals(""))) {ventaslineas.setnombre_grupo(ventaslineasOrigen.getnombre_grupo());}
			if(conDefault || (!conDefault && ventaslineasOrigen.getnombre_categoria()!=null && !ventaslineasOrigen.getnombre_categoria().equals(""))) {ventaslineas.setnombre_categoria(ventaslineasOrigen.getnombre_categoria());}
			if(conDefault || (!conDefault && ventaslineasOrigen.getnombre_marca()!=null && !ventaslineasOrigen.getnombre_marca().equals(""))) {ventaslineas.setnombre_marca(ventaslineasOrigen.getnombre_marca());}
			if(conDefault || (!conDefault && ventaslineasOrigen.getmonto()!=null && !ventaslineasOrigen.getmonto().equals(0.0))) {ventaslineas.setmonto(ventaslineasOrigen.getmonto());}
			if(conDefault || (!conDefault && ventaslineasOrigen.getnotas_credito()!=null && !ventaslineasOrigen.getnotas_credito().equals(0.0))) {ventaslineas.setnotas_credito(ventaslineasOrigen.getnotas_credito());}
			if(conDefault || (!conDefault && ventaslineasOrigen.getventa_neta()!=null && !ventaslineasOrigen.getventa_neta().equals(0.0))) {ventaslineas.setventa_neta(ventaslineasOrigen.getventa_neta());}
			if(conDefault || (!conDefault && ventaslineasOrigen.getporcentaje()!=null && !ventaslineasOrigen.getporcentaje().equals(0.0))) {ventaslineas.setporcentaje(ventaslineasOrigen.getporcentaje());}
			if(conDefault || (!conDefault && ventaslineasOrigen.getacumulado()!=null && !ventaslineasOrigen.getacumulado().equals(0.0))) {ventaslineas.setacumulado(ventaslineasOrigen.getacumulado());}
			if(conDefault || (!conDefault && ventaslineasOrigen.gettipo()!=null && !ventaslineasOrigen.gettipo().equals(""))) {ventaslineas.settipo(ventaslineasOrigen.gettipo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentasLineas(VentasLineas ventaslineas) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentasLineas.jLabelidVentasLineas.setText(ventaslineas.getId().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_lineaVentasLineas.setText(ventaslineas.getnombre_linea());
			this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_grupoVentasLineas.setText(ventaslineas.getnombre_grupo());
			this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_categoriaVentasLineas.setText(ventaslineas.getnombre_categoria());
			this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_marcaVentasLineas.setText(ventaslineas.getnombre_marca());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldmontoVentasLineas.setText(ventaslineas.getmonto().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldnotas_creditoVentasLineas.setText(ventaslineas.getnotas_credito().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldventa_netaVentasLineas.setText(ventaslineas.getventa_neta().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldporcentajeVentasLineas.setText(ventaslineas.getporcentaje().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldacumuladoVentasLineas.setText(ventaslineas.getacumulado().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldtipoVentasLineas.setText(ventaslineas.gettipo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentasLineas(VentasLineasBean ventaslineasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentasLineas.jLabelidVentasLineas.setText(ventaslineasBean.getId().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_lineaVentasLineas.setText(ventaslineasBean.getnombre_linea());
			this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_grupoVentasLineas.setText(ventaslineasBean.getnombre_grupo());
			this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_categoriaVentasLineas.setText(ventaslineasBean.getnombre_categoria());
			this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_marcaVentasLineas.setText(ventaslineasBean.getnombre_marca());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldmontoVentasLineas.setText(ventaslineasBean.getmonto().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldnotas_creditoVentasLineas.setText(ventaslineasBean.getnotas_credito().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldventa_netaVentasLineas.setText(ventaslineasBean.getventa_neta().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldporcentajeVentasLineas.setText(ventaslineasBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldacumuladoVentasLineas.setText(ventaslineasBean.getacumulado().toString());
			this.jInternalFrameDetalleFormVentasLineas.jTextFieldtipoVentasLineas.setText(ventaslineasBean.gettipo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVentasLineas(VentasLineasParameterReturnGeneral ventaslineasReturnGeneral,VentasLineasBean ventaslineasBean,Boolean conDefault) throws Exception { 
		try {
			VentasLineas ventaslineasLocal=new VentasLineas();
			
			ventaslineasLocal=ventaslineasReturnGeneral.getVentasLineas();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventaslineasLocal.getId()!=null && !ventaslineasLocal.getId().equals(0L))) {ventaslineasBean.setId(ventaslineasLocal.getId());}}
			if(conDefault || (!conDefault && ventaslineasLocal.getnombre_linea()!=null && !ventaslineasLocal.getnombre_linea().equals(""))) {ventaslineasBean.setnombre_linea(ventaslineasLocal.getnombre_linea());}
			if(conDefault || (!conDefault && ventaslineasLocal.getnombre_grupo()!=null && !ventaslineasLocal.getnombre_grupo().equals(""))) {ventaslineasBean.setnombre_grupo(ventaslineasLocal.getnombre_grupo());}
			if(conDefault || (!conDefault && ventaslineasLocal.getnombre_categoria()!=null && !ventaslineasLocal.getnombre_categoria().equals(""))) {ventaslineasBean.setnombre_categoria(ventaslineasLocal.getnombre_categoria());}
			if(conDefault || (!conDefault && ventaslineasLocal.getnombre_marca()!=null && !ventaslineasLocal.getnombre_marca().equals(""))) {ventaslineasBean.setnombre_marca(ventaslineasLocal.getnombre_marca());}
			if(conDefault || (!conDefault && ventaslineasLocal.getmonto()!=null && !ventaslineasLocal.getmonto().equals(0.0))) {ventaslineasBean.setmonto(ventaslineasLocal.getmonto());}
			if(conDefault || (!conDefault && ventaslineasLocal.getnotas_credito()!=null && !ventaslineasLocal.getnotas_credito().equals(0.0))) {ventaslineasBean.setnotas_credito(ventaslineasLocal.getnotas_credito());}
			if(conDefault || (!conDefault && ventaslineasLocal.getventa_neta()!=null && !ventaslineasLocal.getventa_neta().equals(0.0))) {ventaslineasBean.setventa_neta(ventaslineasLocal.getventa_neta());}
			if(conDefault || (!conDefault && ventaslineasLocal.getporcentaje()!=null && !ventaslineasLocal.getporcentaje().equals(0.0))) {ventaslineasBean.setporcentaje(ventaslineasLocal.getporcentaje());}
			if(conDefault || (!conDefault && ventaslineasLocal.getacumulado()!=null && !ventaslineasLocal.getacumulado().equals(0.0))) {ventaslineasBean.setacumulado(ventaslineasLocal.getacumulado());}
			if(conDefault || (!conDefault && ventaslineasLocal.gettipo()!=null && !ventaslineasLocal.gettipo().equals(""))) {ventaslineasBean.settipo(ventaslineasLocal.gettipo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVentasLineasGenerico(Long idVentasLineasSeleccionado,JComboBox jComboBoxVentasLineas,List<VentasLineas> ventaslineassLocal)throws Exception {
		try {
			VentasLineas  ventaslineasTemp=null;

			for(VentasLineas ventaslineasAux:ventaslineassLocal) {
				if(ventaslineasAux.getId()!=null && ventaslineasAux.getId().equals(idVentasLineasSeleccionado)) {
					ventaslineasTemp=ventaslineasAux;
					break;
				}
			}

			jComboBoxVentasLineas.setSelectedItem(ventaslineasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVentasLineasGenerico(JComboBox jComboBoxVentasLineas,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentasLineas.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVentasLineas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentasLineas.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVentasLineas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventaslineas=(VentasLineas) ventaslineasLogic.getVentasLineass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventaslineas =(VentasLineas) ventaslineass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!ventaslineas.getIsNew() && !ventaslineas.getIsChanged() && !ventaslineas.getIsDeleted()) {
				sDescripcion=ventaslineas.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=ventaslineas.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!ventaslineas.getIsNew() && !ventaslineas.getIsChanged() && !ventaslineas.getIsDeleted()) {
				sDescripcion=ventaslineas.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=ventaslineas.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!ventaslineas.getIsNew() && !ventaslineas.getIsChanged() && !ventaslineas.getIsDeleted()) {
				sDescripcion=ventaslineas.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=ventaslineas.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!ventaslineas.getIsNew() && !ventaslineas.getIsChanged() && !ventaslineas.getIsDeleted()) {
				sDescripcion=ventaslineas.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=ventaslineas.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!ventaslineas.getIsNew() && !ventaslineas.getIsChanged() && !ventaslineas.getIsDeleted()) {
				sDescripcion=ventaslineas.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=ventaslineas.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VentasLineas ventaslineasRow=new VentasLineas();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventaslineasRow=(VentasLineas) ventaslineasLogic.getVentasLineass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventaslineasRow=(VentasLineas) ventaslineass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVentasLineas(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVentasLineas.setVisible((this.isVisibilidadCeldaNuevoVentasLineas && this.isPermisoNuevoVentasLineas));			
			this.jButtonDuplicarVentasLineas.setVisible((this.isVisibilidadCeldaDuplicarVentasLineas && this.isPermisoDuplicarVentasLineas));			
			this.jButtonCopiarVentasLineas.setVisible((this.isVisibilidadCeldaCopiarVentasLineas && this.isPermisoCopiarVentasLineas));
			this.jButtonVerFormVentasLineas.setVisible((this.isVisibilidadCeldaVerFormVentasLineas && this.isPermisoVerFormVentasLineas));
			
			this.jButtonAbrirOrderByVentasLineas.setVisible((this.isVisibilidadCeldaOrdenVentasLineas && this.isPermisoOrdenVentasLineas));			
			
			this.jButtonNuevoRelacionesVentasLineas.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasLineas && this.isPermisoNuevoVentasLineas));			
			this.jButtonNuevoGuardarCambiosVentasLineas.setVisible((this.isVisibilidadCeldaNuevoVentasLineas && this.isPermisoNuevoVentasLineas && this.isPermisoGuardarCambiosVentasLineas));
			
			if(this.jInternalFrameDetalleFormVentasLineas!=null) {
			this.jInternalFrameDetalleFormVentasLineas.jButtonModificarVentasLineas.setVisible((this.isVisibilidadCeldaModificarVentasLineas && this.isPermisoActualizarVentasLineas));	
			this.jInternalFrameDetalleFormVentasLineas.jButtonActualizarVentasLineas.setVisible((this.isVisibilidadCeldaActualizarVentasLineas && this.isPermisoActualizarVentasLineas));	
			this.jInternalFrameDetalleFormVentasLineas.jButtonEliminarVentasLineas.setVisible((this.isVisibilidadCeldaEliminarVentasLineas && this.isPermisoEliminarVentasLineas));
			this.jInternalFrameDetalleFormVentasLineas.jButtonCancelarVentasLineas.setVisible(this.isVisibilidadCeldaCancelarVentasLineas);							
			this.jInternalFrameDetalleFormVentasLineas.jButtonGuardarCambiosVentasLineas.setVisible((this.isVisibilidadCeldaGuardarVentasLineas && this.isPermisoGuardarCambiosVentasLineas));			
			
			}
						
			this.jButtonGuardarCambiosTablaVentasLineas.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasLineas && this.isPermisoGuardarCambiosVentasLineas));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVentasLineas.setVisible((this.isVisibilidadCeldaNuevoVentasLineas && this.isPermisoNuevoVentasLineas));						
			this.jButtonDuplicarToolBarVentasLineas.setVisible((this.isVisibilidadCeldaDuplicarVentasLineas && this.isPermisoDuplicarVentasLineas));						
			this.jButtonCopiarToolBarVentasLineas.setVisible((this.isVisibilidadCeldaCopiarVentasLineas && this.isPermisoCopiarVentasLineas));			
			this.jButtonVerFormToolBarVentasLineas.setVisible((this.isVisibilidadCeldaVerFormVentasLineas && this.isPermisoVerFormVentasLineas));			
			this.jButtonAbrirOrderByToolBarVentasLineas.setVisible((this.isVisibilidadCeldaOrdenVentasLineas && this.isPermisoOrdenVentasLineas));
			this.jButtonNuevoRelacionesToolBarVentasLineas.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasLineas && this.isPermisoNuevoVentasLineas));			
			this.jButtonNuevoGuardarCambiosToolBarVentasLineas.setVisible((this.isVisibilidadCeldaNuevoVentasLineas && this.isPermisoNuevoVentasLineas && this.isPermisoGuardarCambiosVentasLineas));			
			
			if(this.jInternalFrameDetalleFormVentasLineas!=null) {
			this.jInternalFrameDetalleFormVentasLineas.jButtonModificarToolBarVentasLineas.setVisible((this.isVisibilidadCeldaModificarVentasLineas && this.isPermisoActualizarVentasLineas));	
			this.jInternalFrameDetalleFormVentasLineas.jButtonActualizarToolBarVentasLineas.setVisible((this.isVisibilidadCeldaActualizarVentasLineas  && this.isPermisoActualizarVentasLineas));	
			this.jInternalFrameDetalleFormVentasLineas.jButtonEliminarToolBarVentasLineas.setVisible((this.isVisibilidadCeldaEliminarVentasLineas && this.isPermisoEliminarVentasLineas));
			this.jInternalFrameDetalleFormVentasLineas.jButtonCancelarToolBarVentasLineas.setVisible(this.isVisibilidadCeldaCancelarVentasLineas);				
			this.jInternalFrameDetalleFormVentasLineas.jButtonGuardarCambiosToolBarVentasLineas.setVisible((this.isVisibilidadCeldaGuardarVentasLineas && this.isPermisoGuardarCambiosVentasLineas));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVentasLineas.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasLineas && this.isPermisoGuardarCambiosVentasLineas));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVentasLineas.setVisible((this.isVisibilidadCeldaNuevoVentasLineas && this.isPermisoNuevoVentasLineas));			
			this.jMenuItemDuplicarVentasLineas.setVisible((this.isVisibilidadCeldaDuplicarVentasLineas && this.isPermisoDuplicarVentasLineas));			
			this.jMenuItemCopiarVentasLineas.setVisible((this.isVisibilidadCeldaCopiarVentasLineas && this.isPermisoCopiarVentasLineas));			
			this.jMenuItemVerFormVentasLineas.setVisible((this.isVisibilidadCeldaVerFormVentasLineas && this.isPermisoVerFormVentasLineas));			
			this.jMenuItemAbrirOrderByVentasLineas.setVisible((this.isVisibilidadCeldaOrdenVentasLineas && this.isPermisoOrdenVentasLineas));			
			//this.jMenuItemMostrarOcultarVentasLineas.setVisible((this.isVisibilidadCeldaOrdenVentasLineas && this.isPermisoOrdenVentasLineas));
			this.jMenuItemDetalleAbrirOrderByVentasLineas.setVisible((this.isVisibilidadCeldaOrdenVentasLineas && this.isPermisoOrdenVentasLineas));			
			//this.jMenuItemDetalleMostrarOcultarVentasLineas.setVisible((this.isVisibilidadCeldaOrdenVentasLineas && this.isPermisoOrdenVentasLineas));			
			this.jMenuItemNuevoRelacionesVentasLineas.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasLineas && this.isPermisoNuevoVentasLineas));			
			this.jMenuItemNuevoGuardarCambiosVentasLineas.setVisible((this.isVisibilidadCeldaNuevoVentasLineas && this.isPermisoNuevoVentasLineas && this.isPermisoGuardarCambiosVentasLineas));									
			
			if(this.jInternalFrameDetalleFormVentasLineas!=null) {
			this.jInternalFrameDetalleFormVentasLineas.jMenuItemModificarVentasLineas.setVisible((this.isVisibilidadCeldaModificarVentasLineas && this.isPermisoActualizarVentasLineas));	
			this.jInternalFrameDetalleFormVentasLineas.jMenuItemActualizarVentasLineas.setVisible((this.isVisibilidadCeldaActualizarVentasLineas && this.isPermisoActualizarVentasLineas));	
			this.jInternalFrameDetalleFormVentasLineas.jMenuItemEliminarVentasLineas.setVisible((this.isVisibilidadCeldaEliminarVentasLineas && this.isPermisoEliminarVentasLineas));
			this.jInternalFrameDetalleFormVentasLineas.jMenuItemCancelarVentasLineas.setVisible(this.isVisibilidadCeldaCancelarVentasLineas);				
			}
			
			this.jMenuItemGuardarCambiosVentasLineas.setVisible((this.isVisibilidadCeldaGuardarVentasLineas && this.isPermisoGuardarCambiosVentasLineas));						
			this.jMenuItemGuardarCambiosTablaVentasLineas.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasLineas && this.isPermisoGuardarCambiosVentasLineas));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVentasLineas=this.jButtonNuevoVentasLineas.isVisible();
			this.isVisibilidadCeldaDuplicarVentasLineas=this.jButtonDuplicarVentasLineas.isVisible();
			this.isVisibilidadCeldaCopiarVentasLineas=this.jButtonCopiarVentasLineas.isVisible();
			this.isVisibilidadCeldaVerFormVentasLineas=this.jButtonVerFormVentasLineas.isVisible();
			
			this.isVisibilidadCeldaOrdenVentasLineas=this.jButtonAbrirOrderByVentasLineas.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVentasLineas=this.jButtonNuevoRelacionesVentasLineas.isVisible();
			this.isVisibilidadCeldaModificarVentasLineas=this.jButtonModificarVentasLineas.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasLineas!=null) {
			this.isVisibilidadCeldaActualizarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jButtonActualizarVentasLineas.isVisible();
			this.isVisibilidadCeldaEliminarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jButtonEliminarVentasLineas.isVisible();
			this.isVisibilidadCeldaCancelarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jButtonCancelarVentasLineas.isVisible();
			this.isVisibilidadCeldaGuardarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jButtonGuardarCambiosVentasLineas.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVentasLineas=this.jButtonGuardarCambiosTablaVentasLineas.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVentasLineas=this.jButtonNuevoToolBarVentasLineas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentasLineas=this.jButtonNuevoRelacionesToolBarVentasLineas.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasLineas!=null) {
			this.isVisibilidadCeldaModificarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jButtonModificarToolBarVentasLineas.isVisible();
			this.isVisibilidadCeldaActualizarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jButtonActualizarToolBarVentasLineas.isVisible();
			this.isVisibilidadCeldaEliminarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jButtonEliminarToolBarVentasLineas.isVisible();
			this.isVisibilidadCeldaCancelarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jButtonCancelarToolBarVentasLineas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentasLineas=this.jButtonGuardarCambiosToolBarVentasLineas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentasLineas=this.jButtonGuardarCambiosTablaToolBarVentasLineas.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVentasLineas=this.jMenuItemNuevoVentasLineas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentasLineas=this.jMenuItemNuevoRelacionesVentasLineas.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasLineas!=null) {
			this.isVisibilidadCeldaModificarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jMenuItemModificarVentasLineas.isVisible();
			this.isVisibilidadCeldaActualizarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jMenuItemActualizarVentasLineas.isVisible();
			this.isVisibilidadCeldaEliminarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jMenuItemEliminarVentasLineas.isVisible();
			this.isVisibilidadCeldaCancelarVentasLineas=this.jInternalFrameDetalleFormVentasLineas.jMenuItemCancelarVentasLineas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentasLineas=this.jMenuItemGuardarCambiosVentasLineas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentasLineas=this.jMenuItemGuardarCambiosTablaVentasLineas.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVentasLineas(Boolean esInicializar) {
		if(VentasLineasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ventaslineasSessionBean.getConGuardarRelaciones()) {
				//if(this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVentasLineas();
			}
			
			this.inicializarActualizarBindingBotonesManualVentasLineas(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVentasLineas() {
		this.jButtonNuevoVentasLineas.setVisible(this.isPermisoNuevoVentasLineas);			
		this.jButtonDuplicarVentasLineas.setVisible(this.isPermisoDuplicarVentasLineas);			
		this.jButtonCopiarVentasLineas.setVisible(this.isPermisoCopiarVentasLineas);			
		this.jButtonVerFormVentasLineas.setVisible(this.isPermisoVerFormVentasLineas);			
		
		this.jButtonAbrirOrderByVentasLineas.setVisible(this.isPermisoOrdenVentasLineas);					
		
		this.jButtonNuevoRelacionesVentasLineas.setVisible(this.isPermisoNuevoVentasLineas);			
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasLineas.jButtonModificarVentasLineas.setVisible(this.isPermisoActualizarVentasLineas);	
			this.jInternalFrameDetalleFormVentasLineas.jButtonActualizarVentasLineas.setVisible(this.isPermisoActualizarVentasLineas);	
			this.jInternalFrameDetalleFormVentasLineas.jButtonEliminarVentasLineas.setVisible(this.isPermisoEliminarVentasLineas);
			this.jInternalFrameDetalleFormVentasLineas.jButtonCancelarVentasLineas.setVisible(this.isVisibilidadCeldaCancelarVentasLineas);						
			this.jInternalFrameDetalleFormVentasLineas.jButtonGuardarCambiosVentasLineas.setVisible(this.isPermisoGuardarCambiosVentasLineas);							
		}
		
		this.jButtonGuardarCambiosTablaVentasLineas.setVisible(this.isPermisoActualizarVentasLineas);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVentasLineas() {
		this.jInternalFrameDetalleFormVentasLineas.jButtonModificarVentasLineas.setVisible(this.isPermisoActualizarVentasLineas);	
		this.jInternalFrameDetalleFormVentasLineas.jButtonActualizarVentasLineas.setVisible(this.isPermisoActualizarVentasLineas);	
		this.jInternalFrameDetalleFormVentasLineas.jButtonEliminarVentasLineas.setVisible(this.isPermisoEliminarVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jButtonCancelarVentasLineas.setVisible(this.isVisibilidadCeldaCancelarVentasLineas);							
		this.jInternalFrameDetalleFormVentasLineas.jButtonGuardarCambiosVentasLineas.setVisible((this.isVisibilidadCeldaGuardarVentasLineas && this.isPermisoGuardarCambiosVentasLineas));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVentasLineas() {
		if(VentasLineasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVentasLineas();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVentasLineas() {
	}
	
	public void jTableDatosVentasLineasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVentasLineas(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ventaslineas.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVentasLineasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVentasLineas(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasLineas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasLineas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.ventaslineasLogic.getConnexion());

				if(this.ventaslineas.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.ventaslineas.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasLineas=(TitledBorder)this.jScrollPanelDatosVentasLineas.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVentasLineas.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.ventaslineas.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaVentasLineasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebVentasLineas(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasLineas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasLineas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.ventaslineasLogic.getConnexion());

				if(this.ventaslineas.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.ventaslineas.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasLineas=(TitledBorder)this.jScrollPanelDatosVentasLineas.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderVentasLineas.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.ventaslineas.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoVentasLineasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebVentasLineas(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasLineas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasLineas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.ventaslineasLogic.getConnexion());

				if(this.ventaslineas.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.ventaslineas.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasLineas=(TitledBorder)this.jScrollPanelDatosVentasLineas.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderVentasLineas.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.ventaslineas.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaVentasLineasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebVentasLineas(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasLineas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasLineas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.ventaslineasLogic.getConnexion());

				if(this.ventaslineas.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.ventaslineas.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasLineas=(TitledBorder)this.jScrollPanelDatosVentasLineas.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderVentasLineas.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.ventaslineas.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaVentasLineasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebVentasLineas(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasLineas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasLineas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.ventaslineasLogic.getConnexion());

				if(this.ventaslineas.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.ventaslineas.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasLineas=(TitledBorder)this.jScrollPanelDatosVentasLineas.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderVentasLineas.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.ventaslineas.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.ventaslineas.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.ventaslineas.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_lineaVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.getnombre_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea like '%"+this.ventaslineas.getnombre_linea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_grupoVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.getnombre_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_grupo like '%"+this.ventaslineas.getnombre_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_categoriaVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.getnombre_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_categoria like '%"+this.ventaslineas.getnombre_categoria()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_marcaVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.getnombre_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_marca like '%"+this.ventaslineas.getnombre_marca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmontoVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.getmonto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto = "+this.ventaslineas.getmonto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnotas_creditoVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.getnotas_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where notas_credito = "+this.ventaslineas.getnotas_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonventa_netaVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.getventa_neta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where venta_neta = "+this.ventaslineas.getventa_neta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.ventaslineas.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonacumuladoVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.getacumulado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where acumulado = "+this.ventaslineas.getacumulado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipoVentasLineasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.getventaslineas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaslineas==null) {
						this.ventaslineas = new VentasLineas();
					}

					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);
				}

				if(this.ventaslineas.gettipo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo like '%"+this.ventaslineas.gettipo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasLineas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaVentasLineasVentasLineasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasLineas(false,false);

			this.getVentasLineassBusquedaVentasLineas();

			this.inicializarActualizarBindingVentasLineas(false);

			//if(VentasLineasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasLineas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaVentasLineasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasLineas(false,false);

			this.getVentasLineassFK_IdEmpresa();

			this.inicializarActualizarBindingVentasLineas(false);

			//if(VentasLineasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasLineas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaVentasLineasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasLineas(false,false);

			this.getVentasLineassFK_IdLinea();

			this.inicializarActualizarBindingVentasLineas(false);

			//if(VentasLineasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasLineas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaVentasLineasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasLineas(false,false);

			this.getVentasLineassFK_IdLineaCategoria();

			this.inicializarActualizarBindingVentasLineas(false);

			//if(VentasLineasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasLineas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoVentasLineasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasLineas(false,false);

			this.getVentasLineassFK_IdLineaGrupo();

			this.inicializarActualizarBindingVentasLineas(false);

			//if(VentasLineasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasLineas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaVentasLineasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasLineas(false,false);

			this.getVentasLineassFK_IdLineaMarca();

			this.inicializarActualizarBindingVentasLineas(false);

			//if(VentasLineasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasLineas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaslineasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVentasLineas() {
		if(this.jInternalFrameDetalleFormVentasLineas!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) {
			this.jInternalFrameDetalleFormVentasLineas.setVisible(false);	    			
			this.jInternalFrameDetalleFormVentasLineas.dispose();
			this.jInternalFrameDetalleFormVentasLineas=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVentasLineas!=null) {
			this.jInternalFrameReporteDinamicoVentasLineas.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVentasLineas.dispose();
			this.jInternalFrameReporteDinamicoVentasLineas=null;
		}
		
		if(this.jInternalFrameImportacionVentasLineas!=null) {
			this.jInternalFrameImportacionVentasLineas.setVisible(false);	    			
			this.jInternalFrameImportacionVentasLineas.dispose();
			this.jInternalFrameImportacionVentasLineas=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVentasLineas();
			
			VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
			
			
			if(sTipo.equals("NuevoVentasLineas")) {
				jButtonNuevoVentasLineasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVentasLineas")) {
				jButtonDuplicarVentasLineasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVentasLineas")) {
				jButtonCopiarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("VerFormVentasLineas")) {
				jButtonVerFormVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVentasLineas")) {
				jButtonNuevoVentasLineasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVentasLineas")) {
				jButtonDuplicarVentasLineasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVentasLineas")) {
				jButtonNuevoVentasLineasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVentasLineas")) {
				jButtonDuplicarVentasLineasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVentasLineas")) {
				jButtonNuevoVentasLineasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVentasLineas")) {
				jButtonNuevoVentasLineasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVentasLineas")) {
				jButtonNuevoVentasLineasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVentasLineas")) {
				jButtonModificarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVentasLineas")) {
				jButtonModificarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVentasLineas")) {
				jButtonModificarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVentasLineas")) {
				jButtonActualizarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVentasLineas")) {
				jButtonActualizarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVentasLineas")) {
				jButtonActualizarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("EliminarVentasLineas")) {
				jButtonEliminarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVentasLineas")) {
				jButtonEliminarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVentasLineas")) {
				jButtonEliminarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("CancelarVentasLineas")) {
				jButtonCancelarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVentasLineas")) {
				jButtonCancelarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVentasLineas")) {
				jButtonCancelarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("CerrarVentasLineas")) {
				jButtonCerrarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVentasLineas")) {
				jButtonCerrarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVentasLineas")) {
				jButtonCerrarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVentasLineas")) {
				jButtonMostrarOcultarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVentasLineas")) {
				jButtonCancelarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVentasLineas")) {
				jButtonGuardarCambiosVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVentasLineas")) {
				jButtonGuardarCambiosVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVentasLineas")) {
				jButtonCopiarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVentasLineas")) {
				jButtonVerFormVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVentasLineas")) {
				jButtonGuardarCambiosVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVentasLineas")) {
				jButtonCopiarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVentasLineas")) {
				jButtonVerFormVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVentasLineas")) {
				jButtonGuardarCambiosVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVentasLineas")) {
				jButtonGuardarCambiosVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVentasLineas")) {
				jButtonGuardarCambiosVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVentasLineas")) {
				jButtonRecargarInformacionVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVentasLineas")) {
				jButtonRecargarInformacionVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVentasLineas")) {
				jButtonRecargarInformacionVentasLineasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVentasLineas")) {
				jButtonAnterioresVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVentasLineas")) {
				jButtonAnterioresVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVentasLineas")) {
				jButtonAnterioresVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVentasLineas")) {
				jButtonSiguientesVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVentasLineas")) {
				jButtonSiguientesVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVentasLineas")) {
				jButtonSiguientesVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVentasLineas") || sTipo.equals("MenuItemDetalleAbrirOrderByVentasLineas")) {
				jButtonAbrirOrderByVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVentasLineas") || sTipo.equals("MenuItemDetalleMostrarOcultarVentasLineas")) {
				jButtonMostrarOcultarVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVentasLineas")) {
				jButtonNuevoGuardarCambiosVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVentasLineas")) {
				jButtonNuevoGuardarCambiosVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVentasLineas")) {
				jButtonNuevoGuardarCambiosVentasLineasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVentasLineas")) {
				jButtonCerrarReporteDinamicoVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVentasLineas")) {
				jButtonGenerarReporteDinamicoVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVentasLineas")) {
				
				jButtonGenerarExcelReporteDinamicoVentasLineasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVentasLineas")) {
				jButtonCerrarImportacionVentasLineasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVentasLineas")) {
				
				jButtonGenerarImportacionVentasLineasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVentasLineas")) {
				
				jButtonAbrirImportacionVentasLineasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVentasLineas")) {
				jComboBoxTiposAccionesVentasLineasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVentasLineas")) {
				jComboBoxTiposRelacionesVentasLineasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVentasLineas")) {
				jComboBoxTiposAccionesVentasLineasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVentasLineas")) {
				
				jComboBoxTiposSeleccionarVentasLineasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVentasLineas")) {
				jTextFieldValorCampoGeneralVentasLineasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVentasLineas")) {
				jButtonAbrirOrderByVentasLineasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVentasLineas")) {
				jButtonAbrirOrderByVentasLineasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVentasLineas")) {
				jButtonCerrarOrderByVentasLineasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentasLineasBusqueda")) {
				this.jButtonidVentasLineasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentasLineasUpdate")) {
				this.jButtonid_empresaVentasLineasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentasLineasBusqueda")) {
				this.jButtonid_empresaVentasLineasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaVentasLineasUpdate")) {
				this.jButtonid_lineaVentasLineasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaVentasLineasBusqueda")) {
				this.jButtonid_lineaVentasLineasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoVentasLineasUpdate")) {
				this.jButtonid_linea_grupoVentasLineasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoVentasLineasBusqueda")) {
				this.jButtonid_linea_grupoVentasLineasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaVentasLineasUpdate")) {
				this.jButtonid_linea_categoriaVentasLineasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaVentasLineasBusqueda")) {
				this.jButtonid_linea_categoriaVentasLineasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaVentasLineasUpdate")) {
				this.jButtonid_linea_marcaVentasLineasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaVentasLineasBusqueda")) {
				this.jButtonid_linea_marcaVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeVentasLineasBusqueda")) {
				this.jButtonfecha_emision_desdeVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaVentasLineasBusqueda")) {
				this.jButtonfecha_emision_hastaVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaVentasLineasBusqueda")) {
				this.jButtonnombre_lineaVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupoVentasLineasBusqueda")) {
				this.jButtonnombre_grupoVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_categoriaVentasLineasBusqueda")) {
				this.jButtonnombre_categoriaVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_marcaVentasLineasBusqueda")) {
				this.jButtonnombre_marcaVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoVentasLineasBusqueda")) {
				this.jButtonmontoVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("notas_creditoVentasLineasBusqueda")) {
				this.jButtonnotas_creditoVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("venta_netaVentasLineasBusqueda")) {
				this.jButtonventa_netaVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeVentasLineasBusqueda")) {
				this.jButtonporcentajeVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("acumuladoVentasLineasBusqueda")) {
				this.jButtonacumuladoVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoVentasLineasBusqueda")) {
				this.jButtontipoVentasLineasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaVentasLineasVentasLineas")) {
				this.jButtonBusquedaVentasLineasVentasLineasActionPerformed(evt);
			}
			
			;
			
			
			VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVentasLineas();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasLineasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaslineas);
				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
				
				


				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasLineas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasLineas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			VentasLineas ventaslineasLocal=null;
			
			if(!this.getEsControlTabla()) {
				ventaslineasLocal=this.ventaslineas;
			} else {
				ventaslineasLocal=this.ventaslineasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaslineas);
				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
							
				
				


				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasLineas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasLineas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasLineasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasAnterior =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventaslineasAnterior =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
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
			
			VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
			
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
			
			


			
			VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasLineasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaslineas);
				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
								
						
				


				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasLineas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasLineas.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaslineas);
				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
								
				
				


				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasLineas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasLineas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasLineasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasAnterior =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventaslineasAnterior =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaslineas);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasLineasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasAnterior =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventaslineasAnterior =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasLineasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaslineas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventaslineas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaslineas);
				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
							
				
				


				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasLineas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasLineas.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasLineasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineasAnterior =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventaslineasAnterior =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
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
			
			VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
			
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
			
			


			
			VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasLineasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaslineas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventaslineas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaslineas);
				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
								
				
				


				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasLineas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasLineas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasLineasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasAnterior =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventaslineasAnterior =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasLineasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaslineas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventaslineas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasLineasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaslineas);
				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVentasLineas")) {
					jCheckBoxSeleccionarTodosVentasLineasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVentasLineas")) {
					jCheckBoxSeleccionadosVentasLineasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVentasLineas")) {
					
				}
				
				


				
				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasLineas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasLineas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaslineas);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ventaslineas);
				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
												
				
				


				
				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasLineas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasLineas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasLineasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaslineasAnterior =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventaslineasAnterior =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasLineasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaslineas);
				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
				
				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
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
			
			VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
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
			
			


			
			VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasLineasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaslineas);
				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasLineas.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasLineas.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaslineas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaslineas);
				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
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
				
				


				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasLineas.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasLineas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasLineasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaslineasAnterior =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventaslineasAnterior =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVentasLineas")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVentasLineasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVentasLineas.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ventaslineas =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ventaslineas =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ventaslineas);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVentasLineas")) {
				
				}
				
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVentasLineas")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVentasLineas.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVentasLineas")) {
			
			}
			
			VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVentasLineas();
			
			VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
			
			if(sTipo.equals("NuevoVentasLineas")) {
				jButtonNuevoVentasLineasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVentasLineas")) {
				jButtonDuplicarVentasLineasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVentasLineas")) {
				jButtonCopiarVentasLineasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVentasLineas")) {
				jButtonVerFormVentasLineasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVentasLineas")) {
				jButtonNuevoVentasLineasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVentasLineas")) {
				jButtonModificarVentasLineasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVentasLineas")) {
				jButtonActualizarVentasLineasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVentasLineas")) {
				jButtonEliminarVentasLineasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVentasLineas")) {
				jButtonGuardarCambiosVentasLineasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVentasLineas")) {
				jButtonCancelarVentasLineasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVentasLineas")) {
				jButtonCerrarVentasLineasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVentasLineas")) {
				jButtonGuardarCambiosVentasLineasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVentasLineas")) {
				jButtonNuevoGuardarCambiosVentasLineasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVentasLineas")) {
				jButtonAbrirOrderByVentasLineasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVentasLineas")) {
				jButtonRecargarInformacionVentasLineasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVentasLineas")) {
				jButtonAnterioresVentasLineasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVentasLineas")) {
				jButtonSiguientesVentasLineasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentasLineasBusqueda")) {
				this.jButtonidVentasLineasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentasLineasUpdate")) {
				this.jButtonid_empresaVentasLineasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentasLineasBusqueda")) {
				this.jButtonid_empresaVentasLineasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaVentasLineasUpdate")) {
				this.jButtonid_lineaVentasLineasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaVentasLineasBusqueda")) {
				this.jButtonid_lineaVentasLineasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoVentasLineasUpdate")) {
				this.jButtonid_linea_grupoVentasLineasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoVentasLineasBusqueda")) {
				this.jButtonid_linea_grupoVentasLineasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaVentasLineasUpdate")) {
				this.jButtonid_linea_categoriaVentasLineasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaVentasLineasBusqueda")) {
				this.jButtonid_linea_categoriaVentasLineasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaVentasLineasUpdate")) {
				this.jButtonid_linea_marcaVentasLineasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaVentasLineasBusqueda")) {
				this.jButtonid_linea_marcaVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeVentasLineasBusqueda")) {
				this.jButtonfecha_emision_desdeVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaVentasLineasBusqueda")) {
				this.jButtonfecha_emision_hastaVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaVentasLineasBusqueda")) {
				this.jButtonnombre_lineaVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupoVentasLineasBusqueda")) {
				this.jButtonnombre_grupoVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_categoriaVentasLineasBusqueda")) {
				this.jButtonnombre_categoriaVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_marcaVentasLineasBusqueda")) {
				this.jButtonnombre_marcaVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoVentasLineasBusqueda")) {
				this.jButtonmontoVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("notas_creditoVentasLineasBusqueda")) {
				this.jButtonnotas_creditoVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("venta_netaVentasLineasBusqueda")) {
				this.jButtonventa_netaVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeVentasLineasBusqueda")) {
				this.jButtonporcentajeVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("acumuladoVentasLineasBusqueda")) {
				this.jButtonacumuladoVentasLineasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoVentasLineasBusqueda")) {
				this.jButtontipoVentasLineasBusquedaActionPerformed(evt);
			}
			
			VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVentasLineas();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVentasLineas")) {
				closingInternalFrameVentasLineas();
				
			} else if(sTipo.equals("jButtonCancelarVentasLineas")) {
				JInternalFrameBase jInternalFrameDetalleFormVentasLineas = (JInternalFrameBase)evt.getSource();
	            	
	            VentasLineasBeanSwingJInternalFrame jInternalFrameParent=(VentasLineasBeanSwingJInternalFrame)jInternalFrameDetalleFormVentasLineas.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVentasLineasActionPerformed(null);
			}
			
			VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventaslineas,new Object(),this.ventaslineasParameterGeneral,this.ventaslineasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVentasLineas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVentasLineas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVentasLineas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ventaslineas)) {
			if(!esControlTabla) {
				if(VentasLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);			
				}
				
				if(this.ventaslineasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVentasLineas(this.ventaslineas,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVentasLineas(this.ventaslineasReturnGeneral,this.ventaslineasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ventaslineasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVentasLineas(classes,this.ventaslineasReturnGeneral,this.ventaslineasBean,false);
					}
						
					if(this.ventaslineasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVentasLineas(this.ventaslineasReturnGeneral.getVentasLineas());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVentasLineas(this.ventaslineasReturnGeneral.getVentasLineas());	
					}
						
					if(this.ventaslineasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVentasLineas(this.ventaslineasReturnGeneral.getVentasLineas(),classes);//this.ventaslineasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVentasLineas(this.ventaslineas,classes);//this.ventaslineasBean);									
				}
			
				if(VentasLineasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVentasLineas(this.ventaslineas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasLineas(this.ventaslineas);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ventaslineasAnterior!=null) {
						this.ventaslineas=this.ventaslineasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ventaslineasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ventaslineasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ventaslineasReturnGeneral.getVentasLineas(),ventaslineasLogic.getVentasLineass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ventaslineasReturnGeneral.getVentasLineas(),this.ventaslineass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVentasLineas.repaint();
				
				//((AbstractTableModel) this.jTableDatosVentasLineas.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVentasLineas();
			}
		}
	}
	
	public void actualizarVisualTableDatosVentasLineas() throws Exception {
		
		VentasLineasModel ventaslineasModel=(VentasLineasModel)this.jTableDatosVentasLineas.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventaslineasModel.ventaslineass=this.ventaslineasLogic.getVentasLineass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ventaslineasModel.ventaslineass=this.ventaslineass;
		}
		
		
		((VentasLineasModel) this.jTableDatosVentasLineas.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVentasLineas() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getventaslineasAnterior(),this.ventaslineasLogic.getVentasLineass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getventaslineasAnterior(),this.ventaslineass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVentasLineas();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVentasLineas(VentasLineas ventaslineas,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
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
										
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventaslineas,new Object(),generalEntityParameterGeneral,this.ventaslineasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ventaslineasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VentasLineasConstantesFunciones.getClassesRelationshipsOfVentasLineas(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VentasLineasConstantesFunciones.getClassesRelationshipsFromStringsOfVentasLineas(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVentasLineas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VentasLineasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventaslineas,new Object(),generalEntityParameterGeneral,this.ventaslineasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVentasLineas(VentasLineasBean ventaslineasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVentasLineas(ArrayList<Classe> classes,VentasLineasReturnGeneral ventaslineasReturnGeneral,VentasLineasBean ventaslineasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVentasLineas(VentasLineas ventaslineas,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.ventaslineas)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVentasLineas = new VentasLineasDetalleFormJInternalFrame(jDesktopPane,this.ventaslineasSessionBean.getConGuardarRelaciones(),this.ventaslineasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.setVisible(false);
		this.jInternalFrameDetalleFormVentasLineas.setSelected(false);						
		
		this.jInternalFrameDetalleFormVentasLineas.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVentasLineas.ventaslineasLogic=this.ventaslineasLogic;
		
		this.cargarCombosFrameForeignKeyVentasLineas("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVentasLineas();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentasLineas();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVentasLineas("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVentasLineas();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVentasLineas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentasLineas"));
		
		this.jInternalFrameDetalleFormVentasLineas.jButtonModificarVentasLineas.addActionListener(new ButtonActionListener(this,"ModificarVentasLineas"));

		
		this.jInternalFrameDetalleFormVentasLineas.jButtonModificarToolBarVentasLineas.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentasLineas"));
					
		this.jInternalFrameDetalleFormVentasLineas.jMenuItemModificarVentasLineas.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentasLineas"));		
		
		
		
		this.jInternalFrameDetalleFormVentasLineas.jButtonActualizarVentasLineas.addActionListener (new ButtonActionListener(this,"ActualizarVentasLineas"));
		
		
		this.jInternalFrameDetalleFormVentasLineas.jButtonActualizarToolBarVentasLineas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentasLineas"));
						
		this.jInternalFrameDetalleFormVentasLineas.jMenuItemActualizarVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentasLineas"));		
		
		
		
		this.jInternalFrameDetalleFormVentasLineas.jButtonEliminarVentasLineas.addActionListener (new ButtonActionListener(this,"EliminarVentasLineas"));
		
		
		this.jInternalFrameDetalleFormVentasLineas.jButtonEliminarToolBarVentasLineas.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentasLineas"));
								
		this.jInternalFrameDetalleFormVentasLineas.jMenuItemEliminarVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentasLineas"));		
		
		
		
		this.jInternalFrameDetalleFormVentasLineas.jButtonCancelarVentasLineas.addActionListener (new ButtonActionListener(this,"CancelarVentasLineas"));
		
		
		this.jInternalFrameDetalleFormVentasLineas.jButtonCancelarToolBarVentasLineas.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentasLineas"));
					
		this.jInternalFrameDetalleFormVentasLineas.jMenuItemCancelarVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentasLineas"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVentasLineas.jMenuItemDetalleCerrarVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentasLineas"));		
		
		
		
		this.jInternalFrameDetalleFormVentasLineas.jButtonGuardarCambiosToolBarVentasLineas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasLineas"));
		
		
		
		this.jInternalFrameDetalleFormVentasLineas.jButtonGuardarCambiosToolBarVentasLineas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasLineas"));
		
		
		
		this.jInternalFrameDetalleFormVentasLineas.jComboBoxTiposAccionesFormularioVentasLineas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentasLineas"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonidVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"idVentasLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_empresaVentasLineasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_empresaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_lineaVentasLineasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaVentasLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_lineaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaVentasLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_grupoVentasLineasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoVentasLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_grupoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoVentasLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_categoriaVentasLineasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaVentasLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_categoriaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaVentasLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_marcaVentasLineasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaVentasLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_marcaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonfecha_emision_desdeVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonfecha_emision_hastaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonnombre_lineaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonnombre_grupoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupoVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonnombre_categoriaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_categoriaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonnombre_marcaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_marcaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonmontoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"montoVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonnotas_creditoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"notas_creditoVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonventa_netaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"venta_netaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonporcentajeVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonacumuladoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"acumuladoVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtontipoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"tipoVentasLineasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVentasLineas.jTabbedPaneRelacionesVentasLineas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentasLineas"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVentasLineas"));
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasLineas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentasLineas"));
		}
		
		this.jTableDatosVentasLineas.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVentasLineas"));
		
		this.jTableDatosVentasLineas.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVentasLineas"));
		
		this.jButtonNuevoVentasLineas.addActionListener(new ButtonActionListener(this,"NuevoVentasLineas"));
		
		this.jButtonDuplicarVentasLineas.addActionListener(new ButtonActionListener(this,"DuplicarVentasLineas"));
		
		this.jButtonCopiarVentasLineas.addActionListener(new ButtonActionListener(this,"CopiarVentasLineas"));
		
		this.jButtonVerFormVentasLineas.addActionListener(new ButtonActionListener(this,"VerFormVentasLineas"));
		
		
		this.jButtonNuevoToolBarVentasLineas.addActionListener(new ButtonActionListener(this,"NuevoToolBarVentasLineas"));
			
		this.jButtonDuplicarToolBarVentasLineas.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVentasLineas"));
			
		this.jMenuItemNuevoVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVentasLineas"));
			
		this.jMenuItemDuplicarVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVentasLineas"));		
		
		
		this.jButtonNuevoRelacionesVentasLineas.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVentasLineas"));
		
		
		this.jButtonNuevoRelacionesToolBarVentasLineas.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVentasLineas"));
			
		this.jMenuItemNuevoRelacionesVentasLineas.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVentasLineas"));		
		
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasLineas.jButtonModificarVentasLineas.addActionListener(new ButtonActionListener(this,"ModificarVentasLineas"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasLineas.jButtonModificarToolBarVentasLineas.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentasLineas"));
			
			this.jInternalFrameDetalleFormVentasLineas.jMenuItemModificarVentasLineas.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentasLineas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVentasLineas.jButtonActualizarVentasLineas.addActionListener (new ButtonActionListener(this,"ActualizarVentasLineas"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasLineas.jButtonActualizarToolBarVentasLineas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentasLineas"));
				
			this.jInternalFrameDetalleFormVentasLineas.jMenuItemActualizarVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentasLineas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasLineas.jButtonEliminarVentasLineas.addActionListener (new ButtonActionListener(this,"EliminarVentasLineas"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasLineas.jButtonEliminarToolBarVentasLineas.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentasLineas"));
						
			this.jInternalFrameDetalleFormVentasLineas.jMenuItemEliminarVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentasLineas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasLineas.jButtonCancelarVentasLineas.addActionListener (new ButtonActionListener(this,"CancelarVentasLineas"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasLineas.jButtonCancelarToolBarVentasLineas.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentasLineas"));
			
			this.jInternalFrameDetalleFormVentasLineas.jMenuItemCancelarVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentasLineas"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVentasLineas.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVentasLineas"));		
		
		
		this.jButtonCerrarVentasLineas.addActionListener (new ButtonActionListener(this,"CerrarVentasLineas"));
		
		
		this.jButtonCerrarToolBarVentasLineas.addActionListener (new ButtonActionListener(this,"CerrarToolBarVentasLineas"));
			
		this.jMenuItemCerrarVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVentasLineas"));
			
		if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasLineas.jMenuItemDetalleCerrarVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentasLineas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasLineas.jButtonGuardarCambiosVentasLineas.addActionListener (new ButtonActionListener(this,"GuardarCambiosVentasLineas"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasLineas.jButtonGuardarCambiosToolBarVentasLineas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasLineas"));
		}
		
		this.jButtonCopiarToolBarVentasLineas.addActionListener (new ButtonActionListener(this,"CopiarToolBarVentasLineas"));
			
		this.jButtonVerFormToolBarVentasLineas.addActionListener (new ButtonActionListener(this,"VerFormToolBarVentasLineas"));
		
		this.jMenuItemGuardarCambiosVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVentasLineas"));
			
		this.jMenuItemCopiarVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVentasLineas"));		
		
		this.jMenuItemVerFormVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVentasLineas"));		
		
		
		this.jButtonGuardarCambiosTablaVentasLineas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentasLineas"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVentasLineas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVentasLineas"));
			
		this.jMenuItemGuardarCambiosTablaVentasLineas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentasLineas"));		
		
		
		
		this.jButtonRecargarInformacionVentasLineas.addActionListener (new ButtonActionListener(this,"RecargarInformacionVentasLineas"));
					
		this.jButtonRecargarInformacionToolBarVentasLineas.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVentasLineas"));
		
		this.jMenuItemRecargarInformacionVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVentasLineas"));		
		
		
		
		this.jButtonAnterioresVentasLineas.addActionListener (new ButtonActionListener(this,"AnterioresVentasLineas"));
		
		
		this.jButtonAnterioresToolBarVentasLineas.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVentasLineas"));
		
		this.jMenuItemAnterioresVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVentasLineas"));		
		
		
		this.jButtonSiguientesVentasLineas.addActionListener (new ButtonActionListener(this,"SiguientesVentasLineas"));
		
		
		this.jButtonSiguientesToolBarVentasLineas.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVentasLineas"));
			
		this.jMenuItemSiguientesVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVentasLineas"));
			
		this.jMenuItemAbrirOrderByVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVentasLineas"));
			
		this.jMenuItemMostrarOcultarVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVentasLineas"));
			
		this.jMenuItemDetalleAbrirOrderByVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVentasLineas"));
			
		this.jMenuItemDetalleMostarOcultarVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVentasLineas"));		
		
		
		this.jButtonNuevoGuardarCambiosVentasLineas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVentasLineas"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentasLineas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVentasLineas"));
			
		this.jMenuItemNuevoGuardarCambiosVentasLineas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVentasLineas"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVentasLineas.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVentasLineas"));

		this.jCheckBoxSeleccionadosVentasLineas.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVentasLineas"));
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasLineas.jComboBoxTiposAccionesFormularioVentasLineas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentasLineas"));
		}
		
		
		this.jComboBoxTiposRelacionesVentasLineas.addActionListener (new ButtonActionListener(this,"TiposRelacionesVentasLineas"));
			
		this.jComboBoxTiposAccionesVentasLineas.addActionListener (new ButtonActionListener(this,"TiposAccionesVentasLineas"));
					
		this.jComboBoxTiposSeleccionarVentasLineas.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVentasLineas"));
			
		this.jTextFieldValorCampoGeneralVentasLineas.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVentasLineas"));		
		
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonidVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"idVentasLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_empresaVentasLineasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_empresaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_lineaVentasLineasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaVentasLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_lineaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaVentasLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_grupoVentasLineasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoVentasLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_grupoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoVentasLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_categoriaVentasLineasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaVentasLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_categoriaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaVentasLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_marcaVentasLineasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaVentasLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_marcaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonfecha_emision_desdeVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonfecha_emision_hastaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonnombre_lineaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonnombre_grupoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupoVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonnombre_categoriaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_categoriaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonnombre_marcaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_marcaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonmontoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"montoVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonnotas_creditoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"notas_creditoVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonventa_netaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"venta_netaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonporcentajeVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonacumuladoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"acumuladoVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtontipoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"tipoVentasLineasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaVentasLineasVentasLineas.addActionListener(new ButtonActionListener(this,"BusquedaVentasLineasVentasLineas"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVentasLineas!=null) {
				this.jInternalFrameReporteDinamicoVentasLineas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasLineas"));
				this.jInternalFrameReporteDinamicoVentasLineas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasLineas"));
				this.jInternalFrameReporteDinamicoVentasLineas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasLineas"));
			}
			
			//this.jButtonCerrarReporteDinamicoVentasLineas.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasLineas"));				
			//this.jButtonGenerarReporteDinamicoVentasLineas.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasLineas"));
			//this.jButtonGenerarExcelReporteDinamicoVentasLineas.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasLineas"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVentasLineas!=null) {
				this.jInternalFrameImportacionVentasLineas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentasLineas"));
				this.jInternalFrameImportacionVentasLineas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentasLineas"));
				this.jInternalFrameImportacionVentasLineas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentasLineas"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVentasLineas.addActionListener (new ButtonActionListener(this,"AbrirOrderByVentasLineas"));
			
			this.jButtonAbrirOrderByToolBarVentasLineas.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVentasLineas"));			
			
			if(this.jInternalFrameOrderByVentasLineas!=null) {
				this.jInternalFrameOrderByVentasLineas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentasLineas"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVentasLineas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasLineas.jTabbedPaneRelacionesVentasLineas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentasLineas"));
		
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
            		closingInternalFrameVentasLineas();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVentasLineas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVentasLineas = (JInternalFrameBase)event.getSource();
	            	
	            VentasLineasBeanSwingJInternalFrame jInternalFrameParent=(VentasLineasBeanSwingJInternalFrame)jInternalFrameDetalleFormVentasLineas.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVentasLineasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVentasLineas.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVentasLineasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVentasLineas.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVentasLineas.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasLineasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasLineasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasLineasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVentasLineas";
		inputMap = this.jButtonNuevoVentasLineas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVentasLineas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentasLineasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasLineasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasLineasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasLineasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVentasLineas";
		inputMap = this.jButtonNuevoRelacionesVentasLineas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVentasLineas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentasLineasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVentasLineas";
		inputMap = this.jButtonModificarVentasLineas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVentasLineas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVentasLineasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVentasLineas";
		inputMap = this.jButtonActualizarVentasLineas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVentasLineas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVentasLineasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVentasLineas";
		inputMap = this.jButtonEliminarVentasLineas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVentasLineas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVentasLineasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVentasLineas";
		inputMap = this.jButtonCancelarVentasLineas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVentasLineas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVentasLineasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVentasLineas";
		inputMap = this.jButtonCerrarVentasLineas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVentasLineas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVentasLineasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVentasLineas.jButtonGuardarCambiosVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVentasLineas";
		inputMap = this.jInternalFrameDetalleFormVentasLineas.jButtonGuardarCambiosVentasLineas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVentasLineas.jButtonGuardarCambiosVentasLineas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVentasLineasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVentasLineas.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVentasLineasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVentasLineas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVentasLineasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVentasLineas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVentasLineasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVentasLineas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVentasLineasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonidVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"idVentasLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_empresaVentasLineasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_empresaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_lineaVentasLineasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaVentasLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_lineaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaVentasLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_grupoVentasLineasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoVentasLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_grupoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoVentasLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_categoriaVentasLineasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaVentasLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_categoriaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaVentasLineasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_marcaVentasLineasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaVentasLineasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonid_linea_marcaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonfecha_emision_desdeVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonfecha_emision_hastaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonnombre_lineaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonnombre_grupoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupoVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonnombre_categoriaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_categoriaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonnombre_marcaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_marcaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonmontoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"montoVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonnotas_creditoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"notas_creditoVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonventa_netaVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"venta_netaVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonporcentajeVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtonacumuladoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"acumuladoVentasLineasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasLineas.jButtontipoVentasLineasBusqueda.addActionListener(new ButtonActionListener(this,"tipoVentasLineasBusqueda"));
		
		
		this.jButtonBusquedaVentasLineasVentasLineas.addActionListener(new ButtonActionListener(this,"BusquedaVentasLineasVentasLineas"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVentasLineas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVentasLineasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVentasLineasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVentasLineas.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVentasLineas(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(VentasLineas ventaslineasAux:this.ventaslineasLogic.getVentasLineass()) {
					ventaslineasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasLineas ventaslineasAux:ventaslineass) {
					ventaslineasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVentasLineasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentasLineas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentasLineas ventaslineasAux:this.ventaslineasLogic.getVentasLineass()) {
						ventaslineasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasLineas ventaslineasAux:ventaslineass) {
						ventaslineasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(VentasLineas ventaslineasAux:this.ventaslineasLogic.getVentasLineass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasLineas ventaslineasAux:ventaslineass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVentasLineas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentasLineas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentasLineas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVentasLineasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentasLineas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVentasLineas.getSelectedRows();
			
			VentasLineas ventaslineasLocal=new VentasLineas();
			
			//this.seleccionarTodosVentasLineas(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ventaslineasLocal =(VentasLineas) this.ventaslineasLogic.getVentasLineass().toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ventaslineasLocal =(VentasLineas) this.ventaslineass.toArray()[this.jTableDatosVentasLineas.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ventaslineasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentasLineas ventaslineasAux:this.ventaslineasLogic.getVentasLineass()) {
						ventaslineasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasLineas ventaslineasAux:ventaslineass) {
						ventaslineasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVentasLineas(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentasLineas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentasLineas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentasLineas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVentasLineasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVentasLineasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVentasLineasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVentasLineas(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVentasLineas.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentasLineas ventaslineasAux:this.ventaslineasLogic.getVentasLineass()) {
				
						if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ventaslineasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ventaslineasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							ventaslineasAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO)) {
							existe=true;
							ventaslineasAux.setnombre_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA)) {
							existe=true;
							ventaslineasAux.setnombre_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_NOMBREMARCA)) {
							existe=true;
							ventaslineasAux.setnombre_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							ventaslineasAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_NOTASCREDITO)) {
							existe=true;
							ventaslineasAux.setnotas_credito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_VENTANETA)) {
							existe=true;
							ventaslineasAux.setventa_neta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							ventaslineasAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_ACUMULADO)) {
							existe=true;
							ventaslineasAux.setacumulado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							ventaslineasAux.settipo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasLineas ventaslineasAux:ventaslineass) {
					
						if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ventaslineasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ventaslineasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							ventaslineasAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO)) {
							existe=true;
							ventaslineasAux.setnombre_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA)) {
							existe=true;
							ventaslineasAux.setnombre_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_NOMBREMARCA)) {
							existe=true;
							ventaslineasAux.setnombre_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							ventaslineasAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_NOTASCREDITO)) {
							existe=true;
							ventaslineasAux.setnotas_credito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_VENTANETA)) {
							existe=true;
							ventaslineasAux.setventa_neta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							ventaslineasAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_ACUMULADO)) {
							existe=true;
							ventaslineasAux.setacumulado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							ventaslineasAux.settipo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVentasLineas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVentasLineasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVentasLineas(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVentasLineas=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVentasLineas.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVentasLineas.jComboBoxTiposAccionesFormularioVentasLineas.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVentasLineas) {				
					conSplash=true;//false;										
					
					//this.startProcessVentasLineas(conSplash);
				
					this.generarReporteVentasLineassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasLineas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasLineas.jComboBoxTiposAccionesFormularioVentasLineas.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVentasLineassSeleccionados();
				//this.jComboBoxTiposAccionesVentasLineas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentasLineassSeleccionados(false);
				//this.jComboBoxTiposAccionesVentasLineas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentasLineassSeleccionados(true);
				//this.jComboBoxTiposAccionesVentasLineas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentasLineas();
				
				this.exportarVentasLineassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasLineas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasLineas.jComboBoxTiposAccionesFormularioVentasLineas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVentasLineass();
				//this.importarVentasLineass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasLineas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasLineas.jComboBoxTiposAccionesFormularioVentasLineas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentasLineas();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVentasLineassSeleccionados();
				//this.jComboBoxTiposAccionesVentasLineas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Ventas Lineas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVentasLineas();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVentasLineas)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVentasLineas(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Ventas Lineas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasLineas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasLineas.jComboBoxTiposAccionesFormularioVentasLineas.setSelectedIndex(0);					
				}	
			} 			
			else if(VentasLineasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVentasLineas) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVentasLineas(conSplash);
					
						//this.actualizarParametrosGeneralVentasLineas();
						
						this.generarReporteProcesoAccionVentasLineassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVentasLineas.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVentasLineas.jComboBoxTiposAccionesFormularioVentasLineas.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VentasLineasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Ventas LineasES SELECCIONADOS?", "MANTENIMIENTO DE Ventas Lineas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVentasLineas();
				
						this.actualizarParametrosGeneralVentasLineas();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ventaslineasReturnGeneral=ventaslineasLogic.procesarAccionVentasLineassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ventaslineasLogic.getVentasLineass(),this.ventaslineasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVentasLineasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentasLineas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentasLineas.jComboBoxTiposAccionesFormularioVentasLineas.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVentasLineas();
					
					VentasLineasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVentasLineasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentasLineas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentasLineas.jComboBoxTiposAccionesFormularioVentasLineas.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVentasLineas(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVentasLineasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVentasLineas();
			
			if(this.jInternalFrameDetalleFormVentasLineas==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<VentasLineas> ventaslineassSeleccionados=new ArrayList<VentasLineas>();		
			VentasLineas ventaslineas=new VentasLineas();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVentasLineas(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVentasLineas.getSelectedItem();
			
			
			
			
			ventaslineassSeleccionados=this.getVentasLineassSeleccionados(true);
			//this.sTipoAccion;
			
			if(ventaslineassSeleccionados.size()==1) {
				for(VentasLineas ventaslineasAux:ventaslineassSeleccionados) {
					ventaslineas=ventaslineasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVentasLineas();
			
      		//this.finishProcessVentasLineas(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVentasLineasReturnGeneral() throws Exception {
		if(this.ventaslineasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ventaslineasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ventaslineasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ventaslineasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ventaslineasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ventaslineasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVentasLineas(false);
		}
		
		if(this.ventaslineasReturnGeneral.getConRetornoLista() || this.ventaslineasReturnGeneral.getConRetornoObjeto()) {
			if(this.ventaslineasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ventaslineasLogic.setVentasLineass(this.ventaslineasReturnGeneral.getVentasLineass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingVentasLineas(false);
		}
	}
	
	public void actualizarParametrosGeneralVentasLineas() throws Exception {
		
		
	}
	
	public ArrayList<VentasLineas> getVentasLineassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VentasLineas> ventaslineassSeleccionados=new ArrayList<VentasLineas>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVentasLineas) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(VentasLineas ventaslineasAux:ventaslineasLogic.getVentasLineass()) {
					if(ventaslineasAux.getIsSelected()) {
						ventaslineassSeleccionados.add(ventaslineasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasLineas ventaslineasAux:this.ventaslineass) {
					if(ventaslineasAux.getIsSelected()) {
						ventaslineassSeleccionados.add(ventaslineasAux);				
					}
				}
			}
			
			if(ventaslineassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ventaslineassSeleccionados.addAll(this.ventaslineasLogic.getVentasLineass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ventaslineassSeleccionados.addAll(this.ventaslineass);				
					}
				}
			}
		} else {
			ventaslineassSeleccionados.add(this.ventaslineas);
		}
		
		return ventaslineassSeleccionados;
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
	
	public void generarReporteVentasLineassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVentasLineassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVentasLineassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentasLineassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentasLineassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Ventas Lineas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVentasLineassSeleccionados() throws Exception {
		ArrayList<VentasLineas> ventaslineassSeleccionados=new ArrayList<VentasLineas>();		
		
		ventaslineassSeleccionados=this.getVentasLineassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVentasLineass("Todos",ventaslineassSeleccionados);
		
	}	
	
	public void generarReporteNormalVentasLineassSeleccionados() throws Exception {
		ArrayList<VentasLineas> ventaslineassSeleccionados=new ArrayList<VentasLineas>();		
		
		ventaslineassSeleccionados=this.getVentasLineassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVentasLineass("Todos",ventaslineassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVentasLineassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VentasLineas> ventaslineassSeleccionados=new ArrayList<VentasLineas>();
		
		ventaslineassSeleccionados=this.getVentasLineassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVentasLineass("Todos",ventaslineassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVentasLineassSeleccionados() throws Exception {
		ArrayList<VentasLineas> ventaslineassSeleccionados=new ArrayList<VentasLineas>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVentasLineas();
		
		
		ventaslineassSeleccionados=this.getVentasLineassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVentasLineas();
		
		
		//this.generarReporteVentasLineass("Todos",ventaslineassSeleccionados ,ventaslineasImplementable,ventaslineasImplementableHome);
	}
	
	public void mostrarImportacionVentasLineass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVentasLineas();
		
		this.abrirFrameImportacionVentasLineas();		
		
			
		//this.generarReporteVentasLineass("Todos",ventaslineassSeleccionados ,ventaslineasImplementable,ventaslineasImplementableHome);
	}
	
	public void importarVentasLineass() throws Exception {		
	
	}
	
	public void exportarVentasLineassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVentasLineassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVentasLineassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVentasLineassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Ventas Lineas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVentasLineassSeleccionados() throws Exception {
		ArrayList<VentasLineas> ventaslineassSeleccionados=new ArrayList<VentasLineas>();		
		
		ventaslineassSeleccionados=this.getVentasLineassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventaslineas."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVentasLineas(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(VentasLineas ventaslineasAux:ventaslineassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVentasLineas(ventaslineasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ventaslineasAux.setsDetalleGeneralEntityReporte(ventaslineasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventaslineasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Lineas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVentasLineas(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_NOMBRELINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_NOMBREMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_MONTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_NOTASCREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_VENTANETA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_ACUMULADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasLineasConstantesFunciones.LABEL_TIPO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVentasLineas(VentasLineas ventaslineas,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ventaslineas.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.getnombre_linea();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.getnombre_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.getnombre_categoria();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.getnombre_marca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.getmonto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.getnotas_credito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.getventa_neta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.getacumulado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaslineas.gettipo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVentasLineassSeleccionados() throws Exception {
		ArrayList<VentasLineas> ventaslineassSeleccionados=new ArrayList<VentasLineas>();		
		
		ventaslineassSeleccionados=this.getVentasLineassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventaslineas.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("VentasLineass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVentasLineas(row);				
				iRow++;
			}				
			
			for(VentasLineas ventaslineasAux:ventaslineassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVentasLineas(ventaslineasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventaslineasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Lineas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVentasLineassSeleccionados() throws Exception {
		ArrayList<VentasLineas> ventaslineassSeleccionados=new ArrayList<VentasLineas>();		
		
		ventaslineassSeleccionados=this.getVentasLineassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventaslineas.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ventaslineass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ventaslineas");
			//elementRoot.appendChild(element);
		
			for(VentasLineas ventaslineasAux:ventaslineassSeleccionados) {
				element = document.createElement("ventaslineas");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVentasLineas(ventaslineasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventaslineasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Lineas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVentasLineas(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_NOMBRELINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_NOMBREMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_MONTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_NOTASCREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_VENTANETA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_ACUMULADO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasLineasConstantesFunciones.LABEL_TIPO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVentasLineas(VentasLineas ventaslineas,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.getnombre_linea());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.getnombre_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.getnombre_categoria());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.getnombre_marca());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.getmonto());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.getnotas_credito());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.getventa_neta());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.getacumulado());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaslineas.gettipo());				
	}
	
	public void setFilaDatosExportarXmlVentasLineas(VentasLineas ventaslineas,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VentasLineasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ventaslineas.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VentasLineasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ventaslineas.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VentasLineasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(ventaslineas.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementlinea_descripcion = document.createElement(VentasLineasConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(ventaslineas.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(VentasLineasConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(ventaslineas.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(VentasLineasConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(ventaslineas.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(VentasLineasConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(ventaslineas.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementfecha_emision_desde = document.createElement(VentasLineasConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(ventaslineas.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(VentasLineasConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(ventaslineas.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_linea = document.createElement(VentasLineasConstantesFunciones.NOMBRELINEA);
		elementnombre_linea.appendChild(document.createTextNode(ventaslineas.getnombre_linea().trim()));
		element.appendChild(elementnombre_linea);

		Element elementnombre_grupo = document.createElement(VentasLineasConstantesFunciones.NOMBREGRUPO);
		elementnombre_grupo.appendChild(document.createTextNode(ventaslineas.getnombre_grupo().trim()));
		element.appendChild(elementnombre_grupo);

		Element elementnombre_categoria = document.createElement(VentasLineasConstantesFunciones.NOMBRECATEGORIA);
		elementnombre_categoria.appendChild(document.createTextNode(ventaslineas.getnombre_categoria().trim()));
		element.appendChild(elementnombre_categoria);

		Element elementnombre_marca = document.createElement(VentasLineasConstantesFunciones.NOMBREMARCA);
		elementnombre_marca.appendChild(document.createTextNode(ventaslineas.getnombre_marca().trim()));
		element.appendChild(elementnombre_marca);

		Element elementmonto = document.createElement(VentasLineasConstantesFunciones.MONTO);
		elementmonto.appendChild(document.createTextNode(ventaslineas.getmonto().toString().trim()));
		element.appendChild(elementmonto);

		Element elementnotas_credito = document.createElement(VentasLineasConstantesFunciones.NOTASCREDITO);
		elementnotas_credito.appendChild(document.createTextNode(ventaslineas.getnotas_credito().toString().trim()));
		element.appendChild(elementnotas_credito);

		Element elementventa_neta = document.createElement(VentasLineasConstantesFunciones.VENTANETA);
		elementventa_neta.appendChild(document.createTextNode(ventaslineas.getventa_neta().toString().trim()));
		element.appendChild(elementventa_neta);

		Element elementporcentaje = document.createElement(VentasLineasConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(ventaslineas.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementacumulado = document.createElement(VentasLineasConstantesFunciones.ACUMULADO);
		elementacumulado.appendChild(document.createTextNode(ventaslineas.getacumulado().toString().trim()));
		element.appendChild(elementacumulado);

		Element elementtipo = document.createElement(VentasLineasConstantesFunciones.TIPO);
		elementtipo.appendChild(document.createTextNode(ventaslineas.gettipo().trim()));
		element.appendChild(elementtipo);
	}
	
	public void generarReporteGroupGenericoVentasLineassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<VentasLineas> ventaslineassSeleccionados=new ArrayList<VentasLineas>();
		
		ventaslineassSeleccionados=this.getVentasLineassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoVentasLineas(ventaslineassSeleccionados);
		
		this.generarReporteVentasLineass("Todos",ventaslineassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVentasLineas(ArrayList<VentasLineas> ventaslineassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VentasLineas ventaslineasAux:ventaslineassSeleccionados) {
				ventaslineasAux.setsDetalleGeneralEntityReporte(ventaslineasAux.toString());
			
				if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					ventaslineasAux.setsDescripcionGeneralEntityReporte1(ventaslineasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					ventaslineasAux.setsDescripcionGeneralEntityReporte1(ventaslineasAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					ventaslineasAux.setsDescripcionGeneralEntityReporte1(ventaslineasAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					ventaslineasAux.setsDescripcionGeneralEntityReporte1(ventaslineasAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					ventaslineasAux.setsDescripcionGeneralEntityReporte1(ventaslineasAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					ventaslineasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventaslineasAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					ventaslineasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventaslineasAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_NOMBRELINEA)) {
					existe=true;
					ventaslineasAux.setsDescripcionGeneralEntityReporte1(ventaslineasAux.getnombre_linea());
				}
				 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO)) {
					existe=true;
					ventaslineasAux.setsDescripcionGeneralEntityReporte1(ventaslineasAux.getnombre_grupo());
				}
				 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA)) {
					existe=true;
					ventaslineasAux.setsDescripcionGeneralEntityReporte1(ventaslineasAux.getnombre_categoria());
				}
				 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_NOMBREMARCA)) {
					existe=true;
					ventaslineasAux.setsDescripcionGeneralEntityReporte1(ventaslineasAux.getnombre_marca());
				}
				 else if(sTipoSeleccionar.equals(VentasLineasConstantesFunciones.LABEL_TIPO)) {
					existe=true;
					ventaslineasAux.setsDescripcionGeneralEntityReporte1(ventaslineasAux.gettipo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasLineasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVentasLineas(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVentasLineas=true;
				this.isVisibilidadCeldaNuevoRelacionesVentasLineas=true;
				this.isVisibilidadCeldaGuardarCambiosVentasLineas=true;
			}
			
			this.isVisibilidadCeldaModificarVentasLineas=false;
			this.isVisibilidadCeldaActualizarVentasLineas=false;
			this.isVisibilidadCeldaEliminarVentasLineas=false;
			this.isVisibilidadCeldaCancelarVentasLineas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasLineas=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasLineas=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVentasLineas=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasLineas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasLineas=false;
			this.isVisibilidadCeldaModificarVentasLineas=false;
			this.isVisibilidadCeldaActualizarVentasLineas=true;
			this.isVisibilidadCeldaEliminarVentasLineas=false;
			this.isVisibilidadCeldaCancelarVentasLineas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasLineas=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasLineas=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVentasLineas=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasLineas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasLineas=false;
			this.isVisibilidadCeldaModificarVentasLineas=false;
			this.isVisibilidadCeldaActualizarVentasLineas=true;
			this.isVisibilidadCeldaEliminarVentasLineas=true;
			this.isVisibilidadCeldaCancelarVentasLineas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasLineas=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasLineas=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVentasLineas=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasLineas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasLineas=false;
			this.isVisibilidadCeldaModificarVentasLineas=false;
			this.isVisibilidadCeldaActualizarVentasLineas=true;
			this.isVisibilidadCeldaEliminarVentasLineas=false;
			this.isVisibilidadCeldaCancelarVentasLineas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasLineas=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasLineas=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVentasLineas=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasLineas=true;
			this.isVisibilidadCeldaGuardarCambiosVentasLineas=true;
			this.isVisibilidadCeldaModificarVentasLineas=false;
			this.isVisibilidadCeldaActualizarVentasLineas=false;
			this.isVisibilidadCeldaEliminarVentasLineas=false;
			this.isVisibilidadCeldaCancelarVentasLineas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasLineas=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasLineas=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVentasLineas=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasLineas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasLineas=false;
			this.isVisibilidadCeldaActualizarVentasLineas=false;
			this.isVisibilidadCeldaEliminarVentasLineas=false;
			this.isVisibilidadCeldaCancelarVentasLineas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasLineas=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasLineas=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVentasLineas=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasLineas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasLineas=false;
			this.isVisibilidadCeldaModificarVentasLineas=true;
			this.isVisibilidadCeldaActualizarVentasLineas=false;
			this.isVisibilidadCeldaEliminarVentasLineas=false;
			this.isVisibilidadCeldaCancelarVentasLineas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasLineas=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasLineas=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VentasLineasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVentasLineas=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasLineas=true;
			this.isVisibilidadCeldaGuardarCambiosVentasLineas=true;
		} else {
			this.actualizarEstadoPanelsVentasLineas(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVentasLineas=false;
			//this.isVisibilidadCeldaVerFormVentasLineas=false;
			this.isVisibilidadCeldaDuplicarVentasLineas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ventaslineasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVentasLineas=false;
		} else {
			this.isVisibilidadCeldaNuevoVentasLineas=false;
			this.isVisibilidadCeldaGuardarCambiosVentasLineas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ventaslineasSessionBean.getEsGuardarRelacionado()) {
			if(!ventaslineasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVentasLineas=false;												
			}
			
			this.jButtonCerrarVentasLineas.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVentasLineas=false;
		}
		
		if(!this.permiteMantenimiento(this.ventaslineas)) {
			this.isVisibilidadCeldaActualizarVentasLineas=false;
			this.isVisibilidadCeldaEliminarVentasLineas=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoVentasLineas=false;
		this.isVisibilidadCeldaNuevoRelacionesVentasLineas=false;
		this.isVisibilidadCeldaGuardarCambiosVentasLineas=false;
		//this.isVisibilidadCeldaModificarVentasLineas=true;
		this.isVisibilidadCeldaActualizarVentasLineas=false;
		this.isVisibilidadCeldaEliminarVentasLineas=false;
		//this.isVisibilidadCeldaCancelarVentasLineas=true;			
		this.isVisibilidadCeldaGuardarVentasLineas=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVentasLineas() {
	}
	
	public void actualizarEstadoPanelsVentasLineas(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVentasLineas!=null) {
				this.jScrollPanelDatosEdicionVentasLineas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasLineas!=null) {
				this.jTabbedPaneBusquedasVentasLineas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasLineas!=null) {
				this.jScrollPanelDatosVentasLineas.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasLineas!=null) {
				this.jPanelPaginacionVentasLineas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasLineas!=null) {
				this.jPanelParametrosReportesVentasLineas.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVentasLineas!=null) {
				this.jScrollPanelDatosEdicionVentasLineas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasLineas!=null) {
				this.jTabbedPaneBusquedasVentasLineas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVentasLineas!=null) {
				this.jScrollPanelDatosVentasLineas.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasLineas!=null) {
				this.jPanelPaginacionVentasLineas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasLineas!=null) {
				this.jPanelParametrosReportesVentasLineas.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVentasLineas!=null) {
				this.jScrollPanelDatosEdicionVentasLineas.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasLineas!=null) {
				this.jTabbedPaneBusquedasVentasLineas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentasLineas!=null) {
				this.jScrollPanelDatosVentasLineas.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasLineas!=null) {
				this.jPanelPaginacionVentasLineas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasLineas!=null) {
				this.jPanelParametrosReportesVentasLineas.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVentasLineas!=null) {
				this.jScrollPanelDatosEdicionVentasLineas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasLineas!=null) {
				this.jTabbedPaneBusquedasVentasLineas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentasLineas!=null) {
				this.jScrollPanelDatosVentasLineas.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasLineas!=null) {
				this.jPanelPaginacionVentasLineas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasLineas!=null) {
				this.jPanelParametrosReportesVentasLineas.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVentasLineas!=null) {
				this.jScrollPanelDatosEdicionVentasLineas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasLineas!=null) {
				this.jTabbedPaneBusquedasVentasLineas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasLineas!=null) {
				this.jScrollPanelDatosVentasLineas.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasLineas!=null) {
				this.jPanelPaginacionVentasLineas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasLineas!=null) {
				this.jPanelParametrosReportesVentasLineas.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVentasLineas!=null) {
				this.jScrollPanelDatosEdicionVentasLineas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasLineas!=null) {
				this.jTabbedPaneBusquedasVentasLineas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasLineas!=null) {
				this.jScrollPanelDatosVentasLineas.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasLineas!=null) {
				this.jPanelPaginacionVentasLineas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasLineas!=null) {
				this.jPanelParametrosReportesVentasLineas.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVentasLineas!=null) {
				this.jScrollPanelDatosEdicionVentasLineas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasLineas!=null) {
				this.jTabbedPaneBusquedasVentasLineas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasLineas!=null) {
				this.jScrollPanelDatosVentasLineas.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasLineas!=null) {
				this.jPanelPaginacionVentasLineas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasLineas!=null) {
				this.jPanelParametrosReportesVentasLineas.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVentasLineas!=null) {
					this.jTabbedPaneBusquedasVentasLineas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVentasLineas!=null) {
				this.jPanelParametrosReportesVentasLineas.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasLineas!=null) {
				this.jTabbedPaneBusquedasVentasLineas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVentasLineas!=null) {
				this.jPanelParametrosReportesVentasLineas.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaVentasLineas=isParaEmpresa;
			if(!this.isVisibilidadBusquedaVentasLineas) {this.jTabbedPaneBusquedasVentasLineas.remove(jPanelBusquedaVentasLineasVentasLineas);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaVentasLineas=isParaLinea;
			if(!this.isVisibilidadBusquedaVentasLineas) {this.jTabbedPaneBusquedasVentasLineas.remove(jPanelBusquedaVentasLineasVentasLineas);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaVentasLineas=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaVentasLineas) {this.jTabbedPaneBusquedasVentasLineas.remove(jPanelBusquedaVentasLineasVentasLineas);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaVentasLineas=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaVentasLineas) {this.jTabbedPaneBusquedasVentasLineas.remove(jPanelBusquedaVentasLineasVentasLineas);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaVentasLineas=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaVentasLineas) {this.jTabbedPaneBusquedasVentasLineas.remove(jPanelBusquedaVentasLineasVentasLineas);}
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
			
			this.inicializarActualizarBindingTablaVentasLineas(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVentasLineas() {
		this.updateBorderResaltarBusquedasFormularioVentasLineas();
		this.updateVisibilidadBusquedasFormularioVentasLineas();
		this.updateHabilitarBusquedasFormularioVentasLineas();
	}
	
	public void updateBorderResaltarBusquedasFormularioVentasLineas() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVentasLineas.getComponents().length>0) {
	

		if(this.ventaslineasConstantesFunciones.resaltarBusquedaVentasLineasVentasLineas!=null) {
			index= this.jTabbedPaneBusquedasVentasLineas.indexOfComponent(this.jPanelBusquedaVentasLineasVentasLineas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentasLineas.getComponent(index);
				jPanel.setBorder(this.ventaslineasConstantesFunciones.resaltarBusquedaVentasLineasVentasLineas);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVentasLineas() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVentasLineas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentasLineas.indexOfComponent(this.jPanelBusquedaVentasLineasVentasLineas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVentasLineas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ventaslineasConstantesFunciones.mostrarBusquedaVentasLineasVentasLineas);
			if(!this.ventaslineasConstantesFunciones.mostrarBusquedaVentasLineasVentasLineas && index>-1) {
				this.jTabbedPaneBusquedasVentasLineas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVentasLineas() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVentasLineas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentasLineas.indexOfComponent(this.jPanelBusquedaVentasLineasVentasLineas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVentasLineas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ventaslineasConstantesFunciones.activarBusquedaVentasLineasVentasLineas);
				this.jTabbedPaneBusquedasVentasLineas.setEnabledAt(index,this.ventaslineasConstantesFunciones.activarBusquedaVentasLineasVentasLineas);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVentasLineas(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaVentasLineas")) {
			index= this.jTabbedPaneBusquedasVentasLineas.indexOfComponent(this.jPanelBusquedaVentasLineasVentasLineas);

			this.jTabbedPaneBusquedasVentasLineas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentasLineas.getComponent(index);

			this.ventaslineasConstantesFunciones.setResaltarBusquedaVentasLineasVentasLineas(resaltar);

			jPanel.setBorder(this.ventaslineasConstantesFunciones.resaltarBusquedaVentasLineasVentasLineas);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVentasLineas.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioVentasLineas() throws Exception {

		if(this.jInternalFrameDetalleFormVentasLineas==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVentasLineas();
		this.updateVisibilidadResaltarControlesFormularioVentasLineas();
		this.updateHabilitarResaltarControlesFormularioVentasLineas();
		
	}
	
	public void updateBorderResaltarControlesFormularioVentasLineas() throws Exception {
		if(this.jInternalFrameDetalleFormVentasLineas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ventaslineasConstantesFunciones.resaltaridVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jLabelidVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltaridVentasLineas);}
		if(this.ventaslineasConstantesFunciones.resaltarid_empresaVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_empresaVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltarid_empresaVentasLineas);}
		if(this.ventaslineasConstantesFunciones.resaltarid_lineaVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_lineaVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltarid_lineaVentasLineas);}
		if(this.ventaslineasConstantesFunciones.resaltarid_linea_grupoVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_grupoVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltarid_linea_grupoVentasLineas);}
		if(this.ventaslineasConstantesFunciones.resaltarid_linea_categoriaVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_categoriaVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltarid_linea_categoriaVentasLineas);}
		if(this.ventaslineasConstantesFunciones.resaltarid_linea_marcaVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_marcaVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltarid_linea_marcaVentasLineas);}
		if(this.ventaslineasConstantesFunciones.resaltarfecha_emision_desdeVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jDateChooserfecha_emision_desdeVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltarfecha_emision_desdeVentasLineas);}
		if(this.ventaslineasConstantesFunciones.resaltarfecha_emision_hastaVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jDateChooserfecha_emision_hastaVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltarfecha_emision_hastaVentasLineas);}
		if(this.ventaslineasConstantesFunciones.resaltarnombre_lineaVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_lineaVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltarnombre_lineaVentasLineas);}
		if(this.ventaslineasConstantesFunciones.resaltarnombre_grupoVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_grupoVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltarnombre_grupoVentasLineas);}
		if(this.ventaslineasConstantesFunciones.resaltarnombre_categoriaVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_categoriaVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltarnombre_categoriaVentasLineas);}
		if(this.ventaslineasConstantesFunciones.resaltarnombre_marcaVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_marcaVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltarnombre_marcaVentasLineas);}
		if(this.ventaslineasConstantesFunciones.resaltarmontoVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jTextFieldmontoVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltarmontoVentasLineas);}
		if(this.ventaslineasConstantesFunciones.resaltarnotas_creditoVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jTextFieldnotas_creditoVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltarnotas_creditoVentasLineas);}
		if(this.ventaslineasConstantesFunciones.resaltarventa_netaVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jTextFieldventa_netaVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltarventa_netaVentasLineas);}
		if(this.ventaslineasConstantesFunciones.resaltarporcentajeVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jTextFieldporcentajeVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltarporcentajeVentasLineas);}
		if(this.ventaslineasConstantesFunciones.resaltaracumuladoVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jTextFieldacumuladoVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltaracumuladoVentasLineas);}
		if(this.ventaslineasConstantesFunciones.resaltartipoVentasLineas!=null && this.jInternalFrameDetalleFormVentasLineas!=null) {this.jInternalFrameDetalleFormVentasLineas.jTextFieldtipoVentasLineas.setBorder(this.ventaslineasConstantesFunciones.resaltartipoVentasLineas);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVentasLineas() throws Exception {		
		if(this.jInternalFrameDetalleFormVentasLineas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) {
	
		//this.jInternalFrameDetalleFormVentasLineas.jLabelidVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostraridVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPanelidVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostraridVentasLineas);
		//this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_empresaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarid_empresaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPanelid_empresaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarid_empresaVentasLineas);
		//this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_lineaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarid_lineaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPanelid_lineaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarid_lineaVentasLineas);
		//this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_grupoVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarid_linea_grupoVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPanelid_linea_grupoVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarid_linea_grupoVentasLineas);
		//this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_categoriaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarid_linea_categoriaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPanelid_linea_categoriaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarid_linea_categoriaVentasLineas);
		//this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_marcaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarid_linea_marcaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPanelid_linea_marcaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarid_linea_marcaVentasLineas);
		//this.jInternalFrameDetalleFormVentasLineas.jDateChooserfecha_emision_desdeVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarfecha_emision_desdeVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPanelfecha_emision_desdeVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarfecha_emision_desdeVentasLineas);
		//this.jInternalFrameDetalleFormVentasLineas.jDateChooserfecha_emision_hastaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarfecha_emision_hastaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPanelfecha_emision_hastaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarfecha_emision_hastaVentasLineas);
		//this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_lineaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarnombre_lineaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPanelnombre_lineaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarnombre_lineaVentasLineas);
		//this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_grupoVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarnombre_grupoVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPanelnombre_grupoVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarnombre_grupoVentasLineas);
		//this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_categoriaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarnombre_categoriaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPanelnombre_categoriaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarnombre_categoriaVentasLineas);
		//this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_marcaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarnombre_marcaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPanelnombre_marcaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarnombre_marcaVentasLineas);
		//this.jInternalFrameDetalleFormVentasLineas.jTextFieldmontoVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarmontoVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPanelmontoVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarmontoVentasLineas);
		//this.jInternalFrameDetalleFormVentasLineas.jTextFieldnotas_creditoVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarnotas_creditoVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPanelnotas_creditoVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarnotas_creditoVentasLineas);
		//this.jInternalFrameDetalleFormVentasLineas.jTextFieldventa_netaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarventa_netaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPanelventa_netaVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarventa_netaVentasLineas);
		//this.jInternalFrameDetalleFormVentasLineas.jTextFieldporcentajeVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarporcentajeVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPanelporcentajeVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrarporcentajeVentasLineas);
		//this.jInternalFrameDetalleFormVentasLineas.jTextFieldacumuladoVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostraracumuladoVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPanelacumuladoVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostraracumuladoVentasLineas);
		//this.jInternalFrameDetalleFormVentasLineas.jTextFieldtipoVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrartipoVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jPaneltipoVentasLineas.setVisible(this.ventaslineasConstantesFunciones.mostrartipoVentasLineas);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVentasLineas() throws Exception {
		if(this.jInternalFrameDetalleFormVentasLineas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentasLineas!=null) {
	
		this.jInternalFrameDetalleFormVentasLineas.jLabelidVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activaridVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_empresaVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activarid_empresaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_lineaVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activarid_lineaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_grupoVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activarid_linea_grupoVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_categoriaVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activarid_linea_categoriaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jComboBoxid_linea_marcaVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activarid_linea_marcaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jDateChooserfecha_emision_desdeVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activarfecha_emision_desdeVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jDateChooserfecha_emision_hastaVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activarfecha_emision_hastaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_lineaVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activarnombre_lineaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_grupoVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activarnombre_grupoVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_categoriaVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activarnombre_categoriaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextAreanombre_marcaVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activarnombre_marcaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextFieldmontoVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activarmontoVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextFieldnotas_creditoVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activarnotas_creditoVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextFieldventa_netaVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activarventa_netaVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextFieldporcentajeVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activarporcentajeVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextFieldacumuladoVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activaracumuladoVentasLineas);
		this.jInternalFrameDetalleFormVentasLineas.jTextFieldtipoVentasLineas.setEnabled(this.ventaslineasConstantesFunciones.activartipoVentasLineas);
		}
	}
	
		
}