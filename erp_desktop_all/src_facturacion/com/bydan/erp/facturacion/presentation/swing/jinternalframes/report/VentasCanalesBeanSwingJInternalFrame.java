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

//import com.bydan.erp.facturacion.util.VentasCanalesConstantesFunciones;
import com.bydan.erp.facturacion.util.report.VentasCanalesParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.VentasCanalesParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.VentasCanalesBean;
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
import com.bydan.erp.cartera.business.logic.*;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class VentasCanalesBeanSwingJInternalFrame extends VentasCanalesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VentasCanalesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<VentasCanales> ventascanalesValidator = new ClassValidator<VentasCanales>(VentasCanales.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public VentasCanales ventascanales;	
	public VentasCanales ventascanalesAux;
	public VentasCanales ventascanalesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public VentasCanales ventascanalesTotales;
	public Long idVentasCanalesActual;
	public Long iIdNuevoVentasCanales=0L;
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

	public String sFinalQueryComboTituloCliente="";

	public List<TituloCliente> tituloclientesForeignKey;

	public List<TituloCliente> gettituloclientesForeignKey() {
		return tituloclientesForeignKey;
	}

	public void settituloclientesForeignKey(List<TituloCliente> tituloclientesForeignKey) {
		this.tituloclientesForeignKey = tituloclientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public TituloCliente tituloclienteForeignKey;

	public TituloCliente gettituloclienteForeignKey() {
		return tituloclienteForeignKey;
	}

	public void settituloclienteForeignKey(TituloCliente tituloclienteForeignKey) {
		this.tituloclienteForeignKey = tituloclienteForeignKey;
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
	
	public Boolean isPermisoTodoVentasCanales;
	public Boolean isPermisoNuevoVentasCanales;
	public Boolean isPermisoActualizarVentasCanales;
	public Boolean isPermisoActualizarOriginalVentasCanales;
	public Boolean isPermisoEliminarVentasCanales;
	public Boolean isPermisoGuardarCambiosVentasCanales;
	public Boolean isPermisoConsultaVentasCanales;
	public Boolean isPermisoBusquedaVentasCanales;
	public Boolean isPermisoReporteVentasCanales;
	public Boolean isPermisoPaginacionMedioVentasCanales;
	public Boolean isPermisoPaginacionAltoVentasCanales;
	public Boolean isPermisoPaginacionTodoVentasCanales;
	public Boolean isPermisoCopiarVentasCanales;
	public Boolean isPermisoVerFormVentasCanales;
	public Boolean isPermisoDuplicarVentasCanales;
	public Boolean isPermisoOrdenVentasCanales;
	
	
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
	
	public VentasCanalesParameterReturnGeneral ventascanalesReturnGeneral;
	public VentasCanalesParameterReturnGeneral ventascanalesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVentasCanales=false;
	public Boolean esParaAccionDesdeFormularioVentasCanales=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VentasCanalesSessionBeanAdditional ventascanalesSessionBeanAdditional=null;
	
	public VentasCanalesSessionBeanAdditional getVentasCanalesSessionBeanAdditional() {
		return this.ventascanalesSessionBeanAdditional;
	}
	
	public void setVentasCanalesSessionBeanAdditional(VentasCanalesSessionBeanAdditional ventascanalesSessionBeanAdditional) {
		try {
			this.ventascanalesSessionBeanAdditional=ventascanalesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VentasCanalesBeanSwingJInternalFrameAdditional ventascanalesBeanSwingJInternalFrameAdditional=null;
	//public class VentasCanalesBeanSwingJInternalFrame
	
	public VentasCanalesBeanSwingJInternalFrameAdditional getVentasCanalesBeanSwingJInternalFrameAdditional() {
		return this.ventascanalesBeanSwingJInternalFrameAdditional;
	}
	
	public void setVentasCanalesBeanSwingJInternalFrameAdditional(VentasCanalesBeanSwingJInternalFrameAdditional ventascanalesBeanSwingJInternalFrameAdditional) {
		try {
			this.ventascanalesBeanSwingJInternalFrameAdditional=ventascanalesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VentasCanalesLogic ventascanalesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public VentasCanales ventascanalesBean;
	public VentasCanalesConstantesFunciones ventascanalesConstantesFunciones;
	//public VentasCanalesParameterReturnGeneral ventascanalesReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TituloClienteLogic tituloclienteLogic;
	
	//PARAMETROS
	
	
	//public List<VentasCanales> ventascanaless;	
	//public List<VentasCanales> ventascanalessEliminados;
	//public List<VentasCanales> ventascanalessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVentasCanales=false;
	public Boolean isVisibilidadCeldaDuplicarVentasCanales=true;
	public Boolean isVisibilidadCeldaCopiarVentasCanales=true;
	public Boolean isVisibilidadCeldaVerFormVentasCanales=true;
	public Boolean isVisibilidadCeldaOrdenVentasCanales=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVentasCanales=false;
	public Boolean isVisibilidadCeldaModificarVentasCanales=false;
	public Boolean isVisibilidadCeldaActualizarVentasCanales=false;
	public Boolean isVisibilidadCeldaEliminarVentasCanales=false;
	public Boolean isVisibilidadCeldaCancelarVentasCanales=false;
	public Boolean isVisibilidadCeldaGuardarVentasCanales=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVentasCanales=false;	
	
	
	public Boolean isVisibilidadBusquedaVentasCanales=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTituloCliente=false;
	
	public Long getiIdNuevoVentasCanales() {
		return this.iIdNuevoVentasCanales;
	}

	public void setiIdNuevoVentasCanales(Long iIdNuevoVentasCanales) {
		this.iIdNuevoVentasCanales = iIdNuevoVentasCanales;
	}
	
	public Long getidVentasCanalesActual() {
		return this.idVentasCanalesActual;
	}

	public void setidVentasCanalesActual(Long idVentasCanalesActual) {
		this.idVentasCanalesActual = idVentasCanalesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public VentasCanales getventascanales() {
		return this.ventascanales;
	}

	public void setventascanales(VentasCanales ventascanales) {
		this.ventascanales = ventascanales;
	}
	
	public VentasCanales getventascanalesAux() {
		return this.ventascanalesAux;
	}

	public void setventascanalesAux(VentasCanales ventascanalesAux) {
		this.ventascanalesAux = ventascanalesAux;
	}				
	
	public VentasCanales getventascanalesAnterior() {
		return this.ventascanalesAnterior;
	}

	public void setventascanalesAnterior(VentasCanales ventascanalesAnterior) {
		this.ventascanalesAnterior = ventascanalesAnterior;
	}	
	
	public VentasCanales getventascanalesTotales() {
		return this.ventascanalesTotales;
	}

	public void setventascanalesTotales(VentasCanales ventascanalesTotales) {
		this.ventascanalesTotales = ventascanalesTotales;
	}	
	
	public VentasCanales getventascanalesBean() {
		return this.ventascanalesBean;
	}

	public void setventascanalesBean(VentasCanales ventascanalesBean) {
		this.ventascanalesBean = ventascanalesBean;
	}	
	
	public VentasCanalesParameterReturnGeneral getventascanalesReturnGeneral() {
		return this.ventascanalesReturnGeneral;
	}

	public void setventascanalesReturnGeneral(VentasCanalesParameterReturnGeneral ventascanalesReturnGeneral) {
		this.ventascanalesReturnGeneral = ventascanalesReturnGeneral;
	}	
	
	
	public Long id_titulo_clienteBusquedaVentasCanales=-1L;

	public Long getid_titulo_clienteBusquedaVentasCanales() {
		return this.id_titulo_clienteBusquedaVentasCanales;
	}

	public void setid_titulo_clienteBusquedaVentasCanales(Long id_titulo_clienteBusquedaVentasCanales) {
		this.id_titulo_clienteBusquedaVentasCanales = id_titulo_clienteBusquedaVentasCanales;
	}

;
	public Date fecha_emision_desdeBusquedaVentasCanales=new Date();

	public Date getfecha_emision_desdeBusquedaVentasCanales() {
		return this.fecha_emision_desdeBusquedaVentasCanales;
	}

	public void setfecha_emision_desdeBusquedaVentasCanales(Date fecha_emision_desdeBusquedaVentasCanales) {
		this.fecha_emision_desdeBusquedaVentasCanales = fecha_emision_desdeBusquedaVentasCanales;
	}

;
	public Date fecha_emision_hastaBusquedaVentasCanales=new Date();

	public Date getfecha_emision_hastaBusquedaVentasCanales() {
		return this.fecha_emision_hastaBusquedaVentasCanales;
	}

	public void setfecha_emision_hastaBusquedaVentasCanales(Date fecha_emision_hastaBusquedaVentasCanales) {
		this.fecha_emision_hastaBusquedaVentasCanales = fecha_emision_hastaBusquedaVentasCanales;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_titulo_clienteFK_IdTituloCliente=-1L;

	public Long getid_titulo_clienteFK_IdTituloCliente() {
		return this.id_titulo_clienteFK_IdTituloCliente;
	}

	public void setid_titulo_clienteFK_IdTituloCliente(Long id_titulo_clienteFK_IdTituloCliente) {
		this.id_titulo_clienteFK_IdTituloCliente = id_titulo_clienteFK_IdTituloCliente;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public VentasCanalesLogic getVentasCanalesLogic()	{		
		return ventascanalesLogic;
	}

	public void setVentasCanalesLogic(VentasCanalesLogic ventascanalesLogic) {
		this.ventascanalesLogic = ventascanalesLogic;
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
	
	public Boolean getIsEsNuevoVentasCanales() {
		return isEsNuevoVentasCanales;
	}

	public void setIsEsNuevoVentasCanales(Boolean isEsNuevoVentasCanales) {
		this.isEsNuevoVentasCanales = isEsNuevoVentasCanales;
	}

	public Boolean getEsParaAccionDesdeFormularioVentasCanales() {
		return esParaAccionDesdeFormularioVentasCanales;
	}
	
	public void setEsParaAccionDesdeFormularioVentasCanales(Boolean esParaAccionDesdeFormularioVentasCanales) {
		this.esParaAccionDesdeFormularioVentasCanales = esParaAccionDesdeFormularioVentasCanales;
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

			if(this.ventascanalesSessionBean==null) {
				this.ventascanalesSessionBean=new VentasCanalesSessionBean();
			}

			if(!this.ventascanalesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(ventascanalesSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTituloClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tituloclientesForeignKey=new ArrayList<TituloCliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TituloClienteLogic tituloclienteLogic=new TituloClienteLogic();

			//tituloclienteLogic.getTituloClienteDataAccess().setIsForForeingKeyData(true);

			if(this.ventascanalesSessionBean==null) {
				this.ventascanalesSessionBean=new VentasCanalesSessionBean();
			}

			if(!this.ventascanalesSessionBean.getisBusquedaDesdeForeignKeySesionTituloCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tituloclienteLogic.getTituloClienteDataAccess().setIsForForeingKeyData(true);

					tituloclienteLogic.getTodosTituloClientesWithConnection(sFinalQuery,new Pagination());

					this.tituloclientesForeignKey=tituloclienteLogic.getTituloClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTituloCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tituloclienteLogic.getEntityWithConnection(ventascanalesSessionBean.getlidTituloClienteActual());
					this.tituloclientesForeignKey.add(tituloclienteLogic.getTituloCliente());
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

					if(this.ventascanales!=null) {
						this.ventascanales.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVentasCanales!=null) {
						this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_empresaVentasCanales.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVentasCanales.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVentasCanales!=null) {
						if(this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_empresaVentasCanales.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_empresaVentasCanales.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVentasCanalesGenerico)throws Exception
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
				jComboBoxid_empresaVentasCanalesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVentasCanalesGenerico!=null && jComboBoxid_empresaVentasCanalesGenerico.getItemCount()>0) {
					jComboBoxid_empresaVentasCanalesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTituloClienteForeignKey(Long idTituloClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TituloCliente  tituloclienteTemp=null;

			for(TituloCliente tituloclienteAux:tituloclientesForeignKey) {
				if(tituloclienteAux.getId()!=null && tituloclienteAux.getId().equals(idTituloClienteSeleccionado)) {
					tituloclienteTemp=tituloclienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tituloclienteTemp!=null) {

					if(this.ventascanales!=null) {
						this.ventascanales.setTituloCliente(tituloclienteTemp);
					}

					if(this.jInternalFrameDetalleFormVentasCanales!=null) {
						this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_titulo_clienteVentasCanales.setSelectedItem(tituloclienteTemp);
					}
				} else {
					//jComboBoxid_titulo_clienteVentasCanales.setSelectedItem(tituloclienteTemp);
					if(this.jInternalFrameDetalleFormVentasCanales!=null) {
						if(this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_titulo_clienteVentasCanales.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_titulo_clienteVentasCanales.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaVentasCanales") || sFormularioTipoBusqueda.equals("Todos")){
					if(tituloclienteTemp!=null && jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales!=null) {
						jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales.setSelectedItem(tituloclienteTemp);
					} else {
						if(jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales!=null) {
							//jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales.setSelectedItem(tituloclienteTemp);
							if(jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales.getItemCount()>0) {
								jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales.setSelectedIndex(0);
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

	public String getActualTituloClienteForeignKeyDescripcion(Long idTituloClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TituloCliente  tituloclienteTemp=null;

			for(TituloCliente tituloclienteAux:tituloclientesForeignKey) {
				if(tituloclienteAux.getId()!=null && tituloclienteAux.getId().equals(idTituloClienteSeleccionado)) {
					tituloclienteTemp=tituloclienteAux;
					break;
				}
			}


			sDescripcion=TituloClienteConstantesFunciones.getTituloClienteDescripcion(tituloclienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTituloClienteForeignKeyGenerico(Long idTituloClienteSeleccionado,JComboBox jComboBoxid_titulo_clienteVentasCanalesGenerico)throws Exception
	{
		try
		{
			TituloCliente  tituloclienteTemp=null;

			for(TituloCliente tituloclienteAux:tituloclientesForeignKey) {
				if(tituloclienteAux.getId()!=null && tituloclienteAux.getId().equals(idTituloClienteSeleccionado)) {
					tituloclienteTemp=tituloclienteAux;
					break;
				}
			}

			if(tituloclienteTemp!=null) {
				jComboBoxid_titulo_clienteVentasCanalesGenerico.setSelectedItem(tituloclienteTemp);
			} else {
				if(jComboBoxid_titulo_clienteVentasCanalesGenerico!=null && jComboBoxid_titulo_clienteVentasCanalesGenerico.getItemCount()>0) {
					jComboBoxid_titulo_clienteVentasCanalesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(VentasCanales ventascanales,JComboBox jComboBoxid_empresaVentasCanalesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVentasCanalesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_empresaVentasCanales.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVentasCanalesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				ventascanales.setid_empresa(empresaAux.getId());
				ventascanales.setempresa_descripcion(VentasCanalesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				ventascanales.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTituloClienteForeignKey(VentasCanales ventascanales,JComboBox jComboBoxid_titulo_clienteVentasCanalesGenerico)throws Exception
	{
		try
		{
			TituloCliente  tituloclienteAux=new TituloCliente();

			if(jComboBoxid_titulo_clienteVentasCanalesGenerico==null) {
				tituloclienteAux=(TituloCliente)this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_titulo_clienteVentasCanales.getSelectedItem();
			} else {
				tituloclienteAux=(TituloCliente)jComboBoxid_titulo_clienteVentasCanalesGenerico.getSelectedItem();
			}

			if(tituloclienteAux!=null && tituloclienteAux.getId()!=null) {
				ventascanales.setid_titulo_cliente(tituloclienteAux.getId());
				ventascanales.settitulocliente_descripcion(VentasCanalesConstantesFunciones.getTituloClienteDescripcion(tituloclienteAux));
				ventascanales.setTituloCliente(tituloclienteAux);			}
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

					if(!VentasCanalesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasCanales!=null) { 
							this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_empresaVentasCanales.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_empresaVentasCanales.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasCanales!=null) { 
					}

					if(!VentasCanalesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTituloClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTituloCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VentasCanalesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasCanales!=null) { 
							this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_titulo_clienteVentasCanales.removeAllItems();

							for(TituloCliente titulocliente:this.tituloclientesForeignKey) {
								this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_titulo_clienteVentasCanales.addItem(titulocliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasCanales!=null) { 
					}

					if(!VentasCanalesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaVentasCanales") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VentasCanalesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales.removeAllItems();

							for(TituloCliente titulocliente:this.tituloclientesForeignKey) {
								this.jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales.addItem(titulocliente);
							}
						}

						if(!VentasCanalesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormVentasCanales!=null) {
							this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_empresaVentasCanales.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasCanales!=null) {
							this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_empresaVentasCanales.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTituloClienteForeignKey(TituloCliente titulocliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVentasCanales!=null) {
							this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_titulo_clienteVentasCanales.setSelectedItem(titulocliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasCanales!=null) {
							this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_titulo_clienteVentasCanales.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales.setSelectedItem(titulocliente);
						} else {
							this.jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesVentasCanales() throws Exception {
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
		
	public VentasCanalesParameterReturnGeneral getVentasCanalesParameterGeneral() {
		return this.ventascanalesParameterGeneral;
	}
	
	public void setVentasCanalesParameterGeneral(VentasCanalesParameterReturnGeneral ventascanalesParameterGeneral) {
		this.ventascanalesParameterGeneral = ventascanalesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoVentasCanales() {
		return isPermisoTodoVentasCanales;
	}

	public void setIsPermisoTodoVentasCanales(Boolean isPermisoTodoVentasCanales) {
		this.isPermisoTodoVentasCanales = isPermisoTodoVentasCanales;
	}

	public Boolean getIsPermisoNuevoVentasCanales() {
		return isPermisoNuevoVentasCanales;
	}

	public void setIsPermisoNuevoVentasCanales(Boolean isPermisoNuevoVentasCanales) {
		this.isPermisoNuevoVentasCanales = isPermisoNuevoVentasCanales;
	}

	public Boolean getIsPermisoActualizarVentasCanales() {
		return isPermisoActualizarVentasCanales;
	}

	public void setIsPermisoActualizarVentasCanales(Boolean isPermisoActualizarVentasCanales) {
		this.isPermisoActualizarVentasCanales = isPermisoActualizarVentasCanales;
	}

	public Boolean getIsPermisoEliminarVentasCanales() {
		return isPermisoEliminarVentasCanales;
	}

	public void setIsPermisoEliminarVentasCanales(Boolean isPermisoEliminarVentasCanales) {
		this.isPermisoEliminarVentasCanales = isPermisoEliminarVentasCanales;
	}

	public Boolean getIsPermisoGuardarCambiosVentasCanales() {
		return isPermisoGuardarCambiosVentasCanales;
	}

	public void setIsPermisoGuardarCambiosVentasCanales(Boolean isPermisoGuardarCambiosVentasCanales) {
		this.isPermisoGuardarCambiosVentasCanales = isPermisoGuardarCambiosVentasCanales;
	}
	
	public Boolean getIsPermisoConsultaVentasCanales() {
		return isPermisoConsultaVentasCanales;
	}

	public void setIsPermisoConsultaVentasCanales(Boolean isPermisoConsultaVentasCanales) {
		this.isPermisoConsultaVentasCanales = isPermisoConsultaVentasCanales;
	}

	public Boolean getIsPermisoBusquedaVentasCanales() {
		return isPermisoBusquedaVentasCanales;
	}

	public void setIsPermisoBusquedaVentasCanales(Boolean isPermisoBusquedaVentasCanales) {
		this.isPermisoBusquedaVentasCanales = isPermisoBusquedaVentasCanales;
	}

	public Boolean getIsPermisoReporteVentasCanales() {
		return isPermisoReporteVentasCanales;
	}

	public void setIsPermisoReporteVentasCanales(Boolean isPermisoReporteVentasCanales) {
		this.isPermisoReporteVentasCanales = isPermisoReporteVentasCanales;
	}
	
	public Boolean getIsPermisoPaginacionMedioVentasCanales() {
		return isPermisoPaginacionMedioVentasCanales;
	}

	public void setIsPermisoPaginacionMedioVentasCanales(Boolean isPermisoPaginacionMedioVentasCanales) {
		this.isPermisoPaginacionMedioVentasCanales = isPermisoPaginacionMedioVentasCanales;
	}
	
	public Boolean getIsPermisoPaginacionTodoVentasCanales() {
		return isPermisoPaginacionTodoVentasCanales;
	}

	public void setIsPermisoPaginacionTodoVentasCanales(Boolean isPermisoPaginacionTodoVentasCanales) {
		this.isPermisoPaginacionTodoVentasCanales = isPermisoPaginacionTodoVentasCanales;
	}
	
	public Boolean getIsPermisoPaginacionAltoVentasCanales() {
		return isPermisoPaginacionAltoVentasCanales;
	}

	public void setIsPermisoPaginacionAltoVentasCanales(Boolean isPermisoPaginacionAltoVentasCanales) {
		this.isPermisoPaginacionAltoVentasCanales = isPermisoPaginacionAltoVentasCanales;
	}
	
	public Boolean getIsPermisoCopiarVentasCanales() {
		return isPermisoCopiarVentasCanales;
	}

	public void setIsPermisoCopiarVentasCanales(Boolean isPermisoCopiarVentasCanales) {
		this.isPermisoCopiarVentasCanales = isPermisoCopiarVentasCanales;
	}
	
	public Boolean getIsPermisoVerFormVentasCanales() {
		return isPermisoVerFormVentasCanales;
	}

	public void setIsPermisoVerFormVentasCanales(Boolean isPermisoVerFormVentasCanales) {
		this.isPermisoVerFormVentasCanales = isPermisoVerFormVentasCanales;
	}
	
	public Boolean getIsPermisoDuplicarVentasCanales() {
		return isPermisoDuplicarVentasCanales;
	}

	public void setIsPermisoDuplicarVentasCanales(Boolean isPermisoDuplicarVentasCanales) {
		this.isPermisoDuplicarVentasCanales = isPermisoDuplicarVentasCanales;
	}
	
	public Boolean getIsPermisoOrdenVentasCanales() {
		return isPermisoOrdenVentasCanales;
	}

	public void setIsPermisoOrdenVentasCanales(Boolean isPermisoOrdenVentasCanales) {
		this.isPermisoOrdenVentasCanales = isPermisoOrdenVentasCanales;
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
	
	public Boolean getIsVisibilidadCeldaNuevoVentasCanales() {
		return isVisibilidadCeldaNuevoVentasCanales;
	}

	public void setIsVisibilidadCeldaNuevoVentasCanales(Boolean isVisibilidadCeldaNuevoVentasCanales) {
		this.isVisibilidadCeldaNuevoVentasCanales = isVisibilidadCeldaNuevoVentasCanales;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVentasCanales() {
		return isVisibilidadCeldaDuplicarVentasCanales;
	}

	public void setIsVisibilidadCeldaDuplicarVentasCanales(Boolean isVisibilidadCeldaDuplicarVentasCanales) {
		this.isVisibilidadCeldaDuplicarVentasCanales = isVisibilidadCeldaDuplicarVentasCanales;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVentasCanales() {
		return isVisibilidadCeldaCopiarVentasCanales;
	}

	public void setIsVisibilidadCeldaCopiarVentasCanales(Boolean isVisibilidadCeldaCopiarVentasCanales) {
		this.isVisibilidadCeldaCopiarVentasCanales = isVisibilidadCeldaCopiarVentasCanales;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVentasCanales() {
		return isVisibilidadCeldaVerFormVentasCanales;
	}

	public void setIsVisibilidadCeldaVerFormVentasCanales(Boolean isVisibilidadCeldaVerFormVentasCanales) {
		this.isVisibilidadCeldaVerFormVentasCanales = isVisibilidadCeldaVerFormVentasCanales;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVentasCanales() {
		return isVisibilidadCeldaOrdenVentasCanales;
	}

	public void setIsVisibilidadCeldaOrdenVentasCanales(Boolean isVisibilidadCeldaOrdenVentasCanales) {
		this.isVisibilidadCeldaOrdenVentasCanales = isVisibilidadCeldaOrdenVentasCanales;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVentasCanales() {
		return isVisibilidadCeldaNuevoRelacionesVentasCanales;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVentasCanales(Boolean isVisibilidadCeldaNuevoRelacionesVentasCanales) {
		this.isVisibilidadCeldaNuevoRelacionesVentasCanales = isVisibilidadCeldaNuevoRelacionesVentasCanales;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVentasCanales() {
		return isVisibilidadCeldaModificarVentasCanales;
	}

	public void setIsVisibilidadCeldaModificarVentasCanales(Boolean isVisibilidadCeldaModificarVentasCanales) {
		this.isVisibilidadCeldaModificarVentasCanales = isVisibilidadCeldaModificarVentasCanales;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVentasCanales() {
		return isVisibilidadCeldaActualizarVentasCanales;
	}

	public void setIsVisibilidadCeldaActualizarVentasCanales(Boolean isVisibilidadCeldaActualizarVentasCanales) {
		this.isVisibilidadCeldaActualizarVentasCanales = isVisibilidadCeldaActualizarVentasCanales;
	}

	public Boolean getIsVisibilidadCeldaEliminarVentasCanales() {
		return isVisibilidadCeldaEliminarVentasCanales;
	}

	public void setIsVisibilidadCeldaEliminarVentasCanales(Boolean isVisibilidadCeldaEliminarVentasCanales) {
		this.isVisibilidadCeldaEliminarVentasCanales = isVisibilidadCeldaEliminarVentasCanales;
	}

	public Boolean getIsVisibilidadCeldaCancelarVentasCanales() {
		return isVisibilidadCeldaCancelarVentasCanales;
	}

	public void setIsVisibilidadCeldaCancelarVentasCanales(Boolean isVisibilidadCeldaCancelarVentasCanales) {
		this.isVisibilidadCeldaCancelarVentasCanales = isVisibilidadCeldaCancelarVentasCanales;
	}

	public Boolean getIsVisibilidadCeldaGuardarVentasCanales() {
		return isVisibilidadCeldaGuardarVentasCanales;
	}

	public void setIsVisibilidadCeldaGuardarVentasCanales(Boolean isVisibilidadCeldaGuardarVentasCanales) {
		this.isVisibilidadCeldaGuardarVentasCanales = isVisibilidadCeldaGuardarVentasCanales;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVentasCanales() {
		return isVisibilidadCeldaGuardarCambiosVentasCanales;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVentasCanales(Boolean isVisibilidadCeldaGuardarCambiosVentasCanales) {
		this.isVisibilidadCeldaGuardarCambiosVentasCanales = isVisibilidadCeldaGuardarCambiosVentasCanales;
	}
		
	public VentasCanalesSessionBean getventascanalesSessionBean() {
		return this.ventascanalesSessionBean;
	}
	
	public void setventascanalesSessionBean(VentasCanalesSessionBean ventascanalesSessionBean) {
		this.ventascanalesSessionBean=ventascanalesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaVentasCanales() {
		return this.isVisibilidadBusquedaVentasCanales;
	}

	public void setisVisibilidadBusquedaVentasCanales(Boolean isVisibilidadBusquedaVentasCanales) {
		this.isVisibilidadBusquedaVentasCanales=isVisibilidadBusquedaVentasCanales;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTituloCliente() {
		return this.isVisibilidadFK_IdTituloCliente;
	}

	public void setisVisibilidadFK_IdTituloCliente(Boolean isVisibilidadFK_IdTituloCliente) {
		this.isVisibilidadFK_IdTituloCliente=isVisibilidadFK_IdTituloCliente;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVentasCanales(VentasCanales ventascanales)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(ventascanales,null);
				this.setActualParaGuardarTituloClienteForeignKey(ventascanales,null);
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
	
	public void bugActualizarReferenciaActual(VentasCanales ventascanales,VentasCanales ventascanalesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVentasCanales(ventascanales);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ventascanalesAux.setId(ventascanales.getId());
		ventascanalesAux.setVersionRow(ventascanales.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(VentasCanales ventascanalesLocal) throws Exception {
		
		if(this.ventascanalesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VentasCanales ventascanalesLocal) throws Exception {	
		if(this.ventascanalesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				ventascanalesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TituloClienteDetalleFormJInternalFrame.class)) {
				TituloClienteBeanSwingJInternalFrame tituloclienteBeanSwingJInternalFrameLocal=(TituloClienteBeanSwingJInternalFrame) ((TituloClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tituloclienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTituloCliente(tituloclienteBeanSwingJInternalFrameLocal.gettitulocliente(),true);
				tituloclienteBeanSwingJInternalFrameLocal.actualizarLista(tituloclienteBeanSwingJInternalFrameLocal.titulocliente,this.tituloclientesForeignKey);

				tituloclienteBeanSwingJInternalFrameLocal.actualizarRelaciones(tituloclienteBeanSwingJInternalFrameLocal.titulocliente);

				ventascanalesLocal.setTituloCliente(tituloclienteBeanSwingJInternalFrameLocal.titulocliente);

				this.addItemDefectoCombosForeignKeyTituloCliente();
				this.cargarCombosFrameTituloClientesForeignKey("Formulario");
				this.setActualTituloClienteForeignKey(tituloclienteBeanSwingJInternalFrameLocal.titulocliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVentasCanalesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ventascanalesValidator.getInvalidValues(this.ventascanales);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(VentasCanales ventascanales,List<VentasCanales> ventascanaless) throws Exception {
	}		
	
	public void actualizarSelectedLista(VentasCanales ventascanales,List<VentasCanales> ventascanaless) throws Exception {
		try	{			
			VentasCanalesConstantesFunciones.actualizarSelectedLista(ventascanales,ventascanaless);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VentasCanales> ventascanalessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ventascanalessLocal=this.ventascanalesLogic.getVentasCanaless();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ventascanalessLocal=this.ventascanaless;
			}
			//ARCHITECTURE
		
			for(VentasCanales ventascanalesLocal:ventascanalessLocal) {
				if(this.permiteMantenimiento(ventascanalesLocal) && ventascanalesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+VentasCanalesConstantesFunciones.getVentasCanalesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VentasCanalesConstantesFunciones.NOMBRETITULOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCanales.jLabelnombre_titulo_clienteVentasCanales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasCanalesConstantesFunciones.MONTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCanales.jLabelmontoVentasCanales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasCanalesConstantesFunciones.CODIGOTITULOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCanales.jLabelcodigo_titulo_clienteVentasCanales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasCanalesConstantesFunciones.NOTASCREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCanales.jLabelnotas_creditoVentasCanales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasCanalesConstantesFunciones.VENTANETA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCanales.jLabelventa_netaVentasCanales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasCanalesConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCanales.jLabelporcentajeVentasCanales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasCanalesConstantesFunciones.ACUMULADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCanales.jLabelacumuladoVentasCanales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasCanalesConstantesFunciones.TIPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCanales.jLabeltipoVentasCanales,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasCanales.jLabelnombre_titulo_clienteVentasCanales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasCanales.jLabelmontoVentasCanales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasCanales.jLabelcodigo_titulo_clienteVentasCanales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasCanales.jLabelnotas_creditoVentasCanales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasCanales.jLabelventa_netaVentasCanales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasCanales.jLabelporcentajeVentasCanales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasCanales.jLabelacumuladoVentasCanales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasCanales.jLabeltipoVentasCanales,"");
		
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
		this.iIdNuevoVentasCanales--;	
		
		
		this.ventascanalesAux=new VentasCanales();
		
		this.ventascanalesAux.setId(this.iIdNuevoVentasCanales);
		this.ventascanalesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventascanalesLogic.getVentasCanaless().add(this.ventascanalesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ventascanaless.add(this.ventascanalesAux);
		}
		//ARCHITECTURE
		
		this.ventascanales=this.ventascanalesAux;
		
		if(VentasCanalesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVentasCanales(this.ventascanales);
			this.setVariablesObjetoActualToFormularioForeignKeyVentasCanales(this.ventascanales);
		}
				
		//this.setDefaultControlesVentasCanales();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVentasCanales();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVentasCanales();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentasCanales();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentasCanales(this.ventascanalesBean,this.ventascanales,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVentasCanales(this.ventascanalesReturnGeneral,this.ventascanalesBean,false);
		
		if(this.ventascanalesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVentasCanales(this.ventascanalesReturnGeneral.getVentasCanales());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVentasCanales(this.ventascanalesReturnGeneral.getVentasCanales());
		}
		
		if(this.ventascanalesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVentasCanales(this.ventascanalesReturnGeneral.getVentasCanales(),classes);//this.ventascanalesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVentasCanales(this.ventascanales,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVentasCanales();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVentasCanales();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VentasCanalesBeanSwingJInternalFrameAdditional.RecargarFormVentasCanales(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVentasCanales(false);
						
			if(ventascanalesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VentasCanalesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasCanales();
			}
			
			this.actualizarVisualTableDatosVentasCanales();
			
			this.jTableDatosVentasCanales.setRowSelectionInterval(this.getIndiceNuevoVentasCanales(), this.getIndiceNuevoVentasCanales());
			
			this.seleccionarFilaTablaVentasCanalesActual();
						
			this.actualizarEstadoCeldasBotonesVentasCanales("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVentasCanales(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVentasCanales.jDateChooserfecha_emision_desdeVentasCanales.setEnabled(isHabilitar && this.ventascanalesConstantesFunciones.activarfecha_emision_desdeVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jDateChooserfecha_emision_hastaVentasCanales.setEnabled(isHabilitar && this.ventascanalesConstantesFunciones.activarfecha_emision_hastaVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jTextAreanombre_titulo_clienteVentasCanales.setEnabled(isHabilitar && this.ventascanalesConstantesFunciones.activarnombre_titulo_clienteVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jTextFieldmontoVentasCanales.setEnabled(isHabilitar && this.ventascanalesConstantesFunciones.activarmontoVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jTextFieldcodigo_titulo_clienteVentasCanales.setEnabled(isHabilitar && this.ventascanalesConstantesFunciones.activarcodigo_titulo_clienteVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jTextFieldnotas_creditoVentasCanales.setEnabled(isHabilitar && this.ventascanalesConstantesFunciones.activarnotas_creditoVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jTextFieldventa_netaVentasCanales.setEnabled(isHabilitar && this.ventascanalesConstantesFunciones.activarventa_netaVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jTextFieldporcentajeVentasCanales.setEnabled(isHabilitar && this.ventascanalesConstantesFunciones.activarporcentajeVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jTextFieldacumuladoVentasCanales.setEnabled(isHabilitar && this.ventascanalesConstantesFunciones.activaracumuladoVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jTextFieldtipoVentasCanales.setEnabled(isHabilitar && this.ventascanalesConstantesFunciones.activartipoVentasCanales);	
		//
		this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_empresaVentasCanales.setEnabled(isHabilitar && this.ventascanalesConstantesFunciones.activarid_empresaVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_titulo_clienteVentasCanales.setEnabled(isHabilitar && this.ventascanalesConstantesFunciones.activarid_titulo_clienteVentasCanales);
	};
	
	public void setDefaultControlesVentasCanales() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVentasCanales(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ventascanalesSessionBean.setConGuardarRelaciones(true);			
			this.ventascanalesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVentasCanales.jTabbedPaneRelacionesVentasCanales.setVisible(true);
			
					
		} else {
			//this.ventascanalesSessionBean.setConGuardarRelaciones(false);			
			this.ventascanalesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVentasCanales.jTabbedPaneRelacionesVentasCanales.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVentasCanales() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasCanales ventascanalesAux:this.ventascanalesLogic.getVentasCanaless()) {
				if(ventascanalesAux.getId().equals(this.iIdNuevoVentasCanales)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasCanales ventascanalesAux:this.ventascanaless) {
				if(ventascanalesAux.getId().equals(this.iIdNuevoVentasCanales)) {
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
	
	public int getIndiceActualVentasCanales(VentasCanales ventascanales,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasCanales ventascanalesAux:this.ventascanalesLogic.getVentasCanaless()) {
				if(ventascanalesAux.getId().equals(ventascanales.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasCanales ventascanalesAux:this.ventascanaless) {
				if(ventascanalesAux.getId().equals(ventascanales.getId())) {
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
	
	public void setCamposBaseDesdeOriginalVentasCanales(VentasCanales ventascanalesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasCanales ventascanalesAux:this.ventascanalesLogic.getVentasCanaless()) {
				if(ventascanalesAux.getVentasCanalesOriginal().getId().equals(ventascanalesOriginal.getId())) {
					existe=true;
					ventascanalesOriginal.setId(ventascanalesAux.getId());
					ventascanalesOriginal.setVersionRow(ventascanalesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasCanales ventascanalesAux:this.ventascanaless) {
				if(ventascanalesAux.getVentasCanalesOriginal().getId().equals(ventascanalesOriginal.getId())) {
					existe=true;
					ventascanalesOriginal.setId(ventascanalesAux.getId());
					ventascanalesOriginal.setVersionRow(ventascanalesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVentasCanales(Boolean esParaCancelar) throws Exception {
		ventascanalessAux=new ArrayList<VentasCanales>();
		ventascanalesAux=new VentasCanales();
		
		if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentasCanales ventascanalesAux:this.ventascanalesLogic.getVentasCanaless()) {
					if(ventascanalesAux.getId()<0) {
						ventascanalessAux.add(ventascanalesAux);
					}		
				}
				this.iIdNuevoVentasCanales=0L;
				this.ventascanalesLogic.getVentasCanaless().removeAll(ventascanalessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasCanales ventascanalesAux:this.ventascanaless) {
					if(ventascanalesAux.getId()<0) {
						ventascanalessAux.add(ventascanalesAux);
					}		
				}
				this.iIdNuevoVentasCanales=0L;
				this.ventascanaless.removeAll(ventascanalessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVentasCanales 
					&& this.ventascanalesLogic.getVentasCanaless().size()>0
					) {
					ventascanalesAux=this.ventascanalesLogic.getVentasCanaless().get(this.ventascanalesLogic.getVentasCanaless().size() - 1);
				
					if(ventascanalesAux.getId()<0) {
						this.ventascanalesLogic.getVentasCanaless().remove(ventascanalesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVentasCanales && this.ventascanaless.size()>0) {
					ventascanalesAux=this.ventascanaless.get(this.ventascanaless.size() - 1);
				
					if(ventascanalesAux.getId()<0) {
						this.ventascanaless.remove(ventascanalesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVentasCanales(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ventascanales.getId()<0) {
				this.ventascanalesLogic.getVentasCanaless().remove(this.ventascanales);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ventascanales.getId()<0) {
				this.ventascanaless.remove(this.ventascanales);
			}
		}			
	}
	
	public void setEstadosInicialesVentasCanales(List<VentasCanales> ventascanalessAux) throws Exception {
		VentasCanalesConstantesFunciones.setEstadosInicialesVentasCanales(ventascanalessAux);
	}
	
	public void setEstadosInicialesVentasCanales(VentasCanales ventascanalesAux) throws Exception {
		VentasCanalesConstantesFunciones.setEstadosInicialesVentasCanales(ventascanalesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVentasCanalesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVentasCanales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVentasCanalesActual()) {
				if(!this.isEsNuevoVentasCanales) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVentasCanales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVentasCanales=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVentasCanalesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Ventas Canales ?", "MANTENIMIENTO DE Ventas Canales", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVentasCanales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(VentasCanales ventascanales) throws Exception {
		VentasCanalesConstantesFunciones.seleccionarAsignar(this.ventascanales,ventascanales);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVentasCanales=this.isPermisoActualizarOriginalVentasCanales;
			
			
			this.seleccionarAsignar(ventascanales);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesVentasCanales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ventascanalesSessionBean.setsFuncionBusquedaRapida(this.ventascanalesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoVentasCanales) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVentasCanales(esParaCancelar);				
				this.cancelarNuevoVentasCanales(esParaCancelar);								
			}
			
			this.ventascanales=new VentasCanales();
			
			this.inicializarVentasCanales();
			
			this.actualizarEstadoCeldasBotonesVentasCanales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVentasCanales() throws Exception {
		try {
			VentasCanalesConstantesFunciones.inicializarVentasCanales(this.ventascanales);
			
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
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ventascanalesLogic.getVentasCanaless().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVentasCanaless(String sAccionBusqueda,List<VentasCanales> ventascanalessParaReportes) throws Exception {
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
					sPathReporteFinal="VentasCanales"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VentasCanalesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VentasCanalesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="VentasCanales"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Ventas Canaleses");		
		parameters.put("busquedapor", VentasCanalesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVentasCanales=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VentasCanalesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VentasCanalesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVentasCanales=new JRBeanArrayDataSource(VentasCanalesJInternalFrame.TraerVentasCanalesBeans(ventascanalessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVentasCanales);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VentasCanalesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VentasCanalesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VentasCanalesBean.TraerVentasCanalesBeans(ventascanalessParaReportes).toArray()));
							
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
				this.generarExcelReporteVentasCanaless(sAccionBusqueda,sTipoArchivoReporte,ventascanalessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVentasCanaless(sAccionBusqueda,sTipoArchivoReporte,ventascanalessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVentasCanalesActionPerformed(null);
					//this.generarExcelReporteVentasCanaless(sAccionBusqueda,sTipoArchivoReporte,ventascanalessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVentasCanaless(sAccionBusqueda,sTipoArchivoReporte,ventascanalessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVentasCanaless(sAccionBusqueda,sTipoArchivoReporte,ventascanalessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVentasCanaless(sAccionBusqueda,sTipoArchivoReporte,ventascanalessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVentasCanaless(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasCanales> ventascanalessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventascanales";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasCanaless");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentasCanales("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(VentasCanales ventascanales : ventascanalessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VentasCanalesConstantesFunciones.generarExcelReporteDataVentasCanales("NORMAL",row,workbook,ventascanales,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventascanalesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Canales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVentasCanales(String sTipo,Row row,Workbook workbook) {
		
		VentasCanalesConstantesFunciones.generarExcelReporteHeaderVentasCanales(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVentasCanaless(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasCanales> ventascanalessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventascanales_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasCanaless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(VentasCanales ventascanales : ventascanalessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VentasCanalesConstantesFunciones.getVentasCanalesDescripcion(ventascanales));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCanalesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascanales.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCanalesConstantesFunciones.LABEL_IDTITULOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_IDTITULOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascanales.gettitulocliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascanales.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascanales.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascanales.getnombre_titulo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCanalesConstantesFunciones.LABEL_MONTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_MONTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascanales.getmonto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascanales.getcodigo_titulo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCanalesConstantesFunciones.LABEL_NOTASCREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_NOTASCREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascanales.getnotas_credito());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCanalesConstantesFunciones.LABEL_VENTANETA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_VENTANETA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascanales.getventa_neta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCanalesConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascanales.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCanalesConstantesFunciones.LABEL_ACUMULADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_ACUMULADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascanales.getacumulado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasCanalesConstantesFunciones.LABEL_TIPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_TIPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventascanales.gettipo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventascanalesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Canales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVentasCanaless(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasCanales> ventascanalessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<VentasCanales> ventascanalessRespaldo=null;
		
		classes=VentasCanalesConstantesFunciones.getClassesRelationshipsOfVentasCanales(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ventascanalesLogic.setDatosCliente(this.datosCliente);
		this.ventascanalesLogic.setDatosDeep(this.datosDeep);
		this.ventascanalesLogic.setIsConDeep(true);
		
		ventascanalessRespaldo=this.ventascanalesLogic.getVentasCanaless();
		
		this.ventascanalesLogic.setVentasCanaless(ventascanalessParaReportes);	
		this.ventascanalesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ventascanalessParaReportes=this.ventascanalesLogic.getVentasCanaless();
		this.ventascanalesLogic.setVentasCanaless(ventascanalessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventascanales_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasCanaless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentasCanales("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(VentasCanales ventascanales : ventascanalessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVentasCanales("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VentasCanalesConstantesFunciones.generarExcelReporteDataVentasCanales("NORMAL",row,workbook,ventascanales,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VentasCanalesConstantesFunciones.getVentasCanalesDescripcion(ventascanales));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventascanalesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Canales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentasCanales.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasCanales.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentasCanales.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasCanales.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVentasCanales() throws Exception {		
		this.startProcessVentasCanales(true);
	}
	
	public void startProcessVentasCanales(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVentasCanales ,this.jPanelParametrosReportesVentasCanales, this.jScrollPanelDatosVentasCanales,this.jPanelPaginacionVentasCanales, this.jScrollPanelDatosEdicionVentasCanales, this.jPanelAccionesVentasCanales,this.jPanelAccionesFormularioVentasCanales,this.jmenuBarVentasCanales,this.jmenuBarDetalleVentasCanales,this.jTtoolBarVentasCanales,this.jTtoolBarDetalleVentasCanales);		
		
		final JTabbedPane jTabbedPaneBusquedasVentasCanales=this.jTabbedPaneBusquedasVentasCanales; 
		
		final JPanel jPanelParametrosReportesVentasCanales=this.jPanelParametrosReportesVentasCanales;
		//final JScrollPane jScrollPanelDatosVentasCanales=this.jScrollPanelDatosVentasCanales;
		final JTable jTableDatosVentasCanales=this.jTableDatosVentasCanales;		
		final JPanel jPanelPaginacionVentasCanales=this.jPanelPaginacionVentasCanales;
		//final JScrollPane jScrollPanelDatosEdicionVentasCanales=this.jScrollPanelDatosEdicionVentasCanales;
		final JPanel jPanelAccionesVentasCanales=this.jPanelAccionesVentasCanales;
		
		JPanel jPanelCamposAuxiliarVentasCanales=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVentasCanales=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) {
			jPanelCamposAuxiliarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jPanelCamposVentasCanales;
			jPanelAccionesFormularioAuxiliarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jPanelAccionesFormularioVentasCanales;
		}
		
		final JPanel jPanelCamposVentasCanales=jPanelCamposAuxiliarVentasCanales;
		final JPanel jPanelAccionesFormularioVentasCanales=jPanelAccionesFormularioAuxiliarVentasCanales;
		
		
		final JMenuBar jmenuBarVentasCanales=this.jmenuBarVentasCanales;
		final JToolBar jTtoolBarVentasCanales=this.jTtoolBarVentasCanales;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVentasCanales=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentasCanales=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) {
			jmenuBarDetalleAuxiliarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jmenuBarDetalleVentasCanales;
			jTtoolBarDetalleAuxiliarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jTtoolBarDetalleVentasCanales;
		}
		
		final JMenuBar jmenuBarDetalleVentasCanales=jmenuBarDetalleAuxiliarVentasCanales;
		final JToolBar jTtoolBarDetalleVentasCanales=jTtoolBarDetalleAuxiliarVentasCanales;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentasCanales;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentasCanales;
			processRunnable.jTableDatos=jTableDatosVentasCanales;
			processRunnable.jPanelCampos=jPanelCamposVentasCanales;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentasCanales;
			processRunnable.jPanelAcciones=jPanelAccionesVentasCanales;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentasCanales;
			
			
			processRunnable.jmenuBar=jmenuBarVentasCanales;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentasCanales;
			processRunnable.jTtoolBar=jTtoolBarVentasCanales;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentasCanales;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentasCanales ,jPanelParametrosReportesVentasCanales,jTableDatosVentasCanales, /*jScrollPanelDatosVentasCanales,*/jPanelCamposVentasCanales,jPanelPaginacionVentasCanales, /*jScrollPanelDatosEdicionVentasCanales,*/ jPanelAccionesVentasCanales,jPanelAccionesFormularioVentasCanales,jmenuBarVentasCanales,jmenuBarDetalleVentasCanales,jTtoolBarVentasCanales,jTtoolBarDetalleVentasCanales);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentasCanales ,jPanelParametrosReportesVentasCanales, jScrollPanelDatosVentasCanales,jPanelPaginacionVentasCanales, jScrollPanelDatosEdicionVentasCanales, jPanelAccionesVentasCanales,jPanelAccionesFormularioVentasCanales,jmenuBarVentasCanales,jmenuBarDetalleVentasCanales,jTtoolBarVentasCanales,jTtoolBarDetalleVentasCanales);
						
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
	
	public void finishProcessVentasCanales() {// throws Exception 
		this.finishProcessVentasCanales(true);
	}
	
	public void finishProcessVentasCanales(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVentasCanales ,this.jPanelParametrosReportesVentasCanales, this.jScrollPanelDatosVentasCanales,this.jPanelPaginacionVentasCanales, this.jScrollPanelDatosEdicionVentasCanales, this.jPanelAccionesVentasCanales,this.jPanelAccionesFormularioVentasCanales,this.jmenuBarVentasCanales,this.jmenuBarDetalleVentasCanales,this.jTtoolBarVentasCanales,this.jTtoolBarDetalleVentasCanales);		
		
		final JTabbedPane jTabbedPaneBusquedasVentasCanales=this.jTabbedPaneBusquedasVentasCanales; 
		
		final JPanel jPanelParametrosReportesVentasCanales=this.jPanelParametrosReportesVentasCanales;
		//final JScrollPane jScrollPanelDatosVentasCanales=this.jScrollPanelDatosVentasCanales;
		final JTable jTableDatosVentasCanales=this.jTableDatosVentasCanales;		
		final JPanel jPanelPaginacionVentasCanales=this.jPanelPaginacionVentasCanales;
		//final JScrollPane jScrollPanelDatosEdicionVentasCanales=this.jScrollPanelDatosEdicionVentasCanales;
		final JPanel jPanelAccionesVentasCanales=this.jPanelAccionesVentasCanales;
		
		JPanel jPanelCamposAuxiliarVentasCanales=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVentasCanales=new JPanel();
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) {
			jPanelCamposAuxiliarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jPanelCamposVentasCanales;
			jPanelAccionesFormularioAuxiliarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jPanelAccionesFormularioVentasCanales;
		}
		
		final JPanel jPanelCamposVentasCanales=jPanelCamposAuxiliarVentasCanales;
		final JPanel jPanelAccionesFormularioVentasCanales=jPanelAccionesFormularioAuxiliarVentasCanales;
		
		
		final JMenuBar jmenuBarVentasCanales=this.jmenuBarVentasCanales;		
		final JToolBar jTtoolBarVentasCanales=this.jTtoolBarVentasCanales;
				
		JMenuBar jmenuBarDetalleAuxiliarVentasCanales=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentasCanales=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) {
			jmenuBarDetalleAuxiliarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jmenuBarDetalleVentasCanales;
			jTtoolBarDetalleAuxiliarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jTtoolBarDetalleVentasCanales;		
		}
		
		final JMenuBar jmenuBarDetalleVentasCanales=jmenuBarDetalleAuxiliarVentasCanales;
		final JToolBar jTtoolBarDetalleVentasCanales=jTtoolBarDetalleAuxiliarVentasCanales;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentasCanales;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentasCanales;
			processRunnable.jTableDatos=jTableDatosVentasCanales;
			processRunnable.jPanelCampos=jPanelCamposVentasCanales;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentasCanales;
			processRunnable.jPanelAcciones=jPanelAccionesVentasCanales;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentasCanales;
			
			
			processRunnable.jmenuBar=jmenuBarVentasCanales;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentasCanales;
			processRunnable.jTtoolBar=jTtoolBarVentasCanales;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentasCanales;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVentasCanales ,jPanelParametrosReportesVentasCanales, jTableDatosVentasCanales,/*jScrollPanelDatosVentasCanales,*/jPanelCamposVentasCanales,jPanelPaginacionVentasCanales, /*jScrollPanelDatosEdicionVentasCanales,*/ jPanelAccionesVentasCanales,jPanelAccionesFormularioVentasCanales,jmenuBarVentasCanales,jmenuBarDetalleVentasCanales,jTtoolBarVentasCanales,jTtoolBarDetalleVentasCanales));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVentasCanales(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVentasCanales(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVentasCanales(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVentasCanales(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVentasCanales,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVentasCanales,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVentasCanales(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVentasCanales,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVentasCanales,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ventascanalesConstantesFunciones.getsFinalQueryVentasCanales();
		String  finalQueryPaginacionTodos=this.ventascanalesConstantesFunciones.getsFinalQueryVentasCanales();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VentasCanalesConstantesFunciones.getArrayColumnasGlobalesNoVentasCanales(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VentasCanalesConstantesFunciones.getArrayColumnasGlobalesVentasCanales(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VentasCanalesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ventascanalessEliminados= new ArrayList<VentasCanales>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVentasCanales();
		
				///*VentasCanalesSessionBean*/this.ventascanalesSessionBean=new VentasCanalesSessionBean();
			
			if(this.ventascanalesSessionBean==null) {
				this.ventascanalesSessionBean=new VentasCanalesSessionBean();
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
					this.iNumeroPaginacion=VentasCanalesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VentasCanalesConstantesFunciones.getClassesForeignKeysOfVentasCanales(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ventascanales."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ventascanalessAux= new ArrayList<VentasCanales>();
			
				
			ventascanalesLogic.setDatosCliente(this.datosCliente);
			ventascanalesLogic.setDatosDeep(this.datosDeep);
			ventascanalesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaVentasCanales")) {
				this.sDetalleReporte=VentasCanalesConstantesFunciones.getDetalleIndiceBusquedaVentasCanales(id_titulo_clienteBusquedaVentasCanales,fecha_emision_desdeBusquedaVentasCanales,fecha_emision_hastaBusquedaVentasCanales);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ventascanalesLogic.getVentasCanalessBusquedaVentasCanales(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_titulo_clienteBusquedaVentasCanales,fecha_emision_desdeBusquedaVentasCanales,fecha_emision_hastaBusquedaVentasCanales);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentasCanalesConstantesFunciones.getDetalleIndiceBusquedaVentasCanales(id_titulo_clienteBusquedaVentasCanales,fecha_emision_desdeBusquedaVentasCanales,fecha_emision_hastaBusquedaVentasCanales);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentasCanalesConstantesFunciones.getDetalleIndiceBusquedaVentasCanales(id_titulo_clienteBusquedaVentasCanales,fecha_emision_desdeBusquedaVentasCanales,fecha_emision_hastaBusquedaVentasCanales);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ventascanalesLogic.getVentasCanaless()==null||ventascanalesLogic.getVentasCanaless().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ventascanaless==null|| ventascanaless.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ventascanalessAux=new ArrayList<VentasCanales>();
						ventascanalessAux.addAll(ventascanalesLogic.getVentasCanaless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventascanalessAux=new ArrayList<VentasCanales>();
							ventascanalessAux.addAll(ventascanaless);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ventascanalesLogic.getVentasCanalessBusquedaVentasCanales(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_titulo_clienteBusquedaVentasCanales,fecha_emision_desdeBusquedaVentasCanales,fecha_emision_hastaBusquedaVentasCanales);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentasCanalesConstantesFunciones.getDetalleIndiceBusquedaVentasCanales(id_titulo_clienteBusquedaVentasCanales,fecha_emision_desdeBusquedaVentasCanales,fecha_emision_hastaBusquedaVentasCanales);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentasCanalesConstantesFunciones.getDetalleIndiceBusquedaVentasCanales(id_titulo_clienteBusquedaVentasCanales,fecha_emision_desdeBusquedaVentasCanales,fecha_emision_hastaBusquedaVentasCanales);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVentasCanaless("BusquedaVentasCanales",ventascanalesLogic.getVentasCanaless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVentasCanaless("BusquedaVentasCanales",ventascanaless);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ventascanalesLogic.setVentasCanaless(new ArrayList<VentasCanales>());
						ventascanalesLogic.getVentasCanaless().addAll(ventascanalessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventascanaless=new ArrayList<VentasCanales>();
							ventascanaless.addAll(ventascanalessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVentasCanales();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVentasCanales();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventascanalesLogic.getVentasCanaless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventascanaless.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventascanalesLogic.getVentasCanaless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventascanaless.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(VentasCanales ventascanales) {
		Boolean permite=true;
		
		if(this.ventascanales.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VentasCanalesConstantesFunciones.getOrderByListaVentasCanales();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VentasCanalesConstantesFunciones.getOrderByListaVentasCanales();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasCanales ventascanales:ventascanalesLogic.getVentasCanaless()) {
				if(ventascanales.getsType().equals(Constantes2.S_TOTALES)) {
					ventascanalesTotales=ventascanales;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasCanales ventascanales:this.ventascanaless) {
				if(ventascanales.getsType().equals(Constantes2.S_TOTALES)) {
					ventascanalesTotales=ventascanales;
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
			this.ventascanalesAux=new VentasCanales();
			this.ventascanalesAux.setsType(Constantes2.S_TOTALES);
			this.ventascanalesAux.setIsNew(false);
			this.ventascanalesAux.setIsChanged(false);
			this.ventascanalesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//VentasCanalesConstantesFunciones.TotalizarValoresFilaVentasCanales(this.ventascanalesLogic.getVentasCanaless(),this.ventascanalesAux);
				
				//this.ventascanalesLogic.getVentasCanaless().add(this.ventascanalesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VentasCanalesConstantesFunciones.TotalizarValoresFilaVentasCanales(this.ventascanaless,this.ventascanalesAux);
				
				this.ventascanaless.add(this.ventascanalesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ventascanalesTotales=new VentasCanales();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventascanalesLogic.getVentasCanaless().remove(ventascanalesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventascanaless.remove(ventascanalesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ventascanalesTotales=new VentasCanales();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasCanales ventascanales:ventascanalesLogic.getVentasCanaless()) {
				if(ventascanales.getsType().equals(Constantes2.S_TOTALES)) {
					ventascanalesTotales=ventascanales;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentasCanalesConstantesFunciones.TotalizarValoresFilaVentasCanales(this.ventascanalesLogic.getVentasCanaless(),ventascanalesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasCanales ventascanales:this.ventascanaless) {
				if(ventascanales.getsType().equals(Constantes2.S_TOTALES)) {
					ventascanalesTotales=ventascanales;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentasCanalesConstantesFunciones.TotalizarValoresFilaVentasCanales(this.ventascanaless,ventascanalesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVentasCanalessBusquedaVentasCanales()throws Exception {
		try {
			sAccionBusqueda="BusquedaVentasCanales";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasCanalessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasCanalessFK_IdTituloCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdTituloCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVentasCanalessBusquedaVentasCanales(String sFinalQuery,Long id_titulo_cliente,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventascanalesLogic.getVentasCanalessBusquedaVentasCanales(sFinalQuery,this.pagination,id_titulo_cliente,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasCanalessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventascanalesLogic.getVentasCanalessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasCanalessFK_IdTituloCliente(String sFinalQuery,Long id_titulo_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventascanalesLogic.getVentasCanalessFK_IdTituloCliente(sFinalQuery,this.pagination,id_titulo_cliente);
				
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
	
	public void inicializarPermisosVentasCanales() {
		this.isPermisoTodoVentasCanales=false;
		this.isPermisoNuevoVentasCanales=false;
		this.isPermisoActualizarVentasCanales=false;
		this.isPermisoActualizarOriginalVentasCanales=false;
		this.isPermisoEliminarVentasCanales=false;
		this.isPermisoGuardarCambiosVentasCanales=false;
		this.isPermisoConsultaVentasCanales=true;
		this.isPermisoBusquedaVentasCanales=true;
		this.isPermisoReporteVentasCanales=true;
		this.isPermisoOrdenVentasCanales=false;		
		this.isPermisoPaginacionMedioVentasCanales=false;		
		this.isPermisoPaginacionAltoVentasCanales=false;		
		this.isPermisoPaginacionTodoVentasCanales=false;		
		this.isPermisoCopiarVentasCanales=false;		
		this.isPermisoVerFormVentasCanales=false;		
		this.isPermisoDuplicarVentasCanales=false;
		this.isPermisoOrdenVentasCanales=false;
	}
	
	public void setPermisosUsuarioVentasCanales(Boolean isPermiso) {
		this.isPermisoTodoVentasCanales=isPermiso;
		this.isPermisoNuevoVentasCanales=isPermiso;
		this.isPermisoActualizarVentasCanales=isPermiso;
		this.isPermisoActualizarOriginalVentasCanales=isPermiso;
		this.isPermisoEliminarVentasCanales=isPermiso;
		this.isPermisoGuardarCambiosVentasCanales=isPermiso;
		this.isPermisoConsultaVentasCanales=isPermiso;
		this.isPermisoBusquedaVentasCanales=isPermiso;
		this.isPermisoReporteVentasCanales=isPermiso;
		this.isPermisoOrdenVentasCanales=isPermiso;		
		this.isPermisoPaginacionMedioVentasCanales=isPermiso;		
		this.isPermisoPaginacionAltoVentasCanales=isPermiso;		
		this.isPermisoPaginacionTodoVentasCanales=isPermiso;		
		this.isPermisoCopiarVentasCanales=isPermiso;		
		this.isPermisoVerFormVentasCanales=isPermiso;		
		this.isPermisoDuplicarVentasCanales=isPermiso;
		this.isPermisoOrdenVentasCanales=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVentasCanales(Boolean isPermiso) {
		//this.isPermisoTodoVentasCanales=isPermiso;
		this.isPermisoNuevoVentasCanales=isPermiso;
		this.isPermisoActualizarVentasCanales=isPermiso;
		this.isPermisoActualizarOriginalVentasCanales=isPermiso;
		this.isPermisoEliminarVentasCanales=isPermiso;
		this.isPermisoGuardarCambiosVentasCanales=isPermiso;
		//this.isPermisoConsultaVentasCanales=isPermiso;
		//this.isPermisoBusquedaVentasCanales=isPermiso;
		//this.isPermisoReporteVentasCanales=isPermiso;
		//this.isPermisoOrdenVentasCanales=isPermiso;		
		//this.isPermisoPaginacionMedioVentasCanales=isPermiso;		
		//this.isPermisoPaginacionAltoVentasCanales=isPermiso;		
		//this.isPermisoPaginacionTodoVentasCanales=isPermiso;		
		//this.isPermisoCopiarVentasCanales=isPermiso;		
		//this.isPermisoDuplicarVentasCanales=isPermiso;
		//this.isPermisoOrdenVentasCanales=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVentasCanalesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VentasCanalesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebVentasCanales(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVentasCanalesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVentasCanalesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVentasCanalesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVentasCanalesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVentasCanales() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VentasCanalesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VentasCanalesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVentasCanales=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVentasCanales=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVentasCanales=this.isPermisoActualizarVentasCanales;
			this.isPermisoEliminarVentasCanales=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVentasCanales=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVentasCanales=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVentasCanales=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVentasCanales=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVentasCanales=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentasCanales=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVentasCanales=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVentasCanales=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVentasCanales=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVentasCanales=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVentasCanales=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVentasCanales=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentasCanales=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVentasCanales.setToolTipText(this.jTableDatosVentasCanales.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVentasCanales(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVentasCanales(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VentasCanalesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(VentasCanalesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioVentasCanales() throws Exception {
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
	public void inicializarCombosForeignKeyVentasCanalesListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tituloclientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVentasCanalesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VentasCanalesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTituloClienteListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTituloClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tituloclientesForeignKey==null||this.tituloclientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TituloClienteConstantesFunciones.getArrayColumnasGlobalesTituloCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TituloClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TituloClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosTituloClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyVentasCanales()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTituloCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.ventascanalesSessionBean==null) {
				this.ventascanalesSessionBean=new VentasCanalesSessionBean();
			}

			if(!this.ventascanalesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTituloCliente()throws Exception {
		try {

			if(!this.ventascanalesSessionBean.getisBusquedaDesdeForeignKeySesionTituloCliente()) {
				TituloCliente titulocliente=new TituloCliente();
				TituloClienteConstantesFunciones.setTituloClienteDescripcion(titulocliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				titulocliente.setId(null);

				if(!TituloClienteConstantesFunciones.ExisteEnLista(this.tituloclientesForeignKey,titulocliente,true)) {

					this.tituloclientesForeignKey.add(0,titulocliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyVentasCanales()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVentasCanales(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVentasCanales()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentasCanales();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVentasCanales(VentasCanales ventascanales)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVentasCanales(VentasCanales ventascanales,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVentasCanales()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVentasCanales()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVentasCanales()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVentasCanales()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVentasCanales()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVentasCanales()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTituloClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVentasCanales(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTituloClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVentasCanales()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_empresaVentasCanales!=null && this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_empresaVentasCanales.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_empresaVentasCanales.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_titulo_clienteVentasCanales!=null && this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_titulo_clienteVentasCanales.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_titulo_clienteVentasCanales.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public VentasCanalesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VentasCanalesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VentasCanalesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ventascanalesSessionBean=new VentasCanalesSessionBean(); 
		this.ventascanalesConstantesFunciones=new VentasCanalesConstantesFunciones(); 
		this.ventascanalesBean=new VentasCanales();//(this.ventascanalesConstantesFunciones); 		
		this.ventascanalesReturnGeneral=new VentasCanalesParameterReturnGeneral(); 
		
		this.ventascanalesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventascanalesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VentasCanalesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VentasCanalesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VentasCanalesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVentasCanales(true);
			
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
			
			this.ventascanalesConstantesFunciones=new VentasCanalesConstantesFunciones(); 
			this.ventascanalesBean=new VentasCanales();//this.ventascanalesConstantesFunciones); 			
			this.ventascanalesReturnGeneral=new VentasCanalesParameterReturnGeneral(); 
		
			VentasCanalesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ventas Canales Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.ventascanales=new VentasCanales();
			this.ventascanaless = new ArrayList<VentasCanales>();
			this.ventascanalessAux = new ArrayList<VentasCanales>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic=new VentasCanalesLogic();
				this.ventascanalesLogic.getNewConnexionToDeep("");
			}
			
			//this.ventascanalesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ventascanalesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVentasCanales);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVentasCanales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentasCanales);	
					}
					
					if(this.jInternalFrameImportacionVentasCanales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentasCanales);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVentasCanales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVentasCanales);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVentasCanales!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVentasCanales);
				this.jInternalFrameDetalleFormVentasCanales.setVisible(false);
				this.jInternalFrameDetalleFormVentasCanales.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasCanales!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentasCanales);
					this.jInternalFrameReporteDinamicoVentasCanales.setVisible(false);
					this.jInternalFrameReporteDinamicoVentasCanales.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVentasCanales!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVentasCanales);
					this.jInternalFrameImportacionVentasCanales.setVisible(false);
					this.jInternalFrameImportacionVentasCanales.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVentasCanales!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVentasCanales);
					this.jInternalFrameOrderByVentasCanales.setVisible(false);
					this.jInternalFrameOrderByVentasCanales.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVentasCanalesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VentasCanalesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ventascanalesReturnGeneral=new VentasCanalesParameterReturnGeneral();
			
			this.ventascanalesParameterGeneral=new VentasCanalesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ventascanalesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(VentasCanalesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentasCanalesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventascanalesSessionBean.getEsGuardarRelacionado(),this.ventascanalesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentasCanalesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventascanalesSessionBean.getEsGuardarRelacionado(),this.ventascanalesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoVentasCanales=false;
			this.isVisibilidadCeldaDuplicarVentasCanales=true;
			this.isVisibilidadCeldaCopiarVentasCanales=true;
			this.isVisibilidadCeldaVerFormVentasCanales=true;
			this.isVisibilidadCeldaOrdenVentasCanales=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasCanales=false;
			this.isVisibilidadCeldaModificarVentasCanales=false;
			this.isVisibilidadCeldaActualizarVentasCanales=false;
			this.isVisibilidadCeldaEliminarVentasCanales=false;
			this.isVisibilidadCeldaCancelarVentasCanales=false;
			this.isVisibilidadCeldaGuardarVentasCanales=false;
			this.isVisibilidadCeldaGuardarCambiosVentasCanales=false;
			
			
			this.isVisibilidadBusquedaVentasCanales=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTituloCliente=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVentasCanales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVentasCanales();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVentasCanales(false);
			
			this.setPermisosUsuarioVentasCanales();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventascanalesSessionBean.getEsGuardarRelacionado() 
				|| (this.ventascanalesSessionBean.getEsGuardarRelacionado() && this.ventascanalesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVentasCanalesClasesRelacionadas();
			}
			
			if(this.ventascanalesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVentasCanalesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VentasCanalesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVentasCanales();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVentasCanales();
			}
			
			if(!this.isPermisoBusquedaVentasCanales) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVentasCanales.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VentasCanalesConstantesFunciones.getTiposSeleccionarVentasCanales());
				
				this.tiposColumnasSelect=VentasCanalesConstantesFunciones.getTiposSeleccionarVentasCanales(true);
				
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
			//if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVentasCanales();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioVentasCanales(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioVentasCanales(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasCanales() ;
			
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
			this.tituloclienteLogic=new TituloClienteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				ventascanalesImplementable= (VentasCanalesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentasCanalesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ventascanalesImplementableHome= (VentasCanalesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentasCanalesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ventascanaless= new ArrayList<VentasCanales>();
			this.ventascanalessEliminados= new ArrayList<VentasCanales>();
						
			this.isEsNuevoVentasCanales=false;
			this.esParaAccionDesdeFormularioVentasCanales=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tituloclientesForeignKey=new ArrayList<TituloCliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVentasCanales(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVentasCanales();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VentasCanalesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VentasCanalesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVentasCanales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVentasCanales(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVentasCanales!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVentasCanales();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVentasCanales();
			}
			
			VentasCanalesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVentasCanales.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVentasCanales.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVentasCanales.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVentasCanales(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga VentasCanales: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVentasCanales() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVentasCanales")) {
				iIndex=this.jInternalFrameDetalleFormVentasCanales.jTabbedPaneRelacionesVentasCanales.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVentasCanales.jTabbedPaneRelacionesVentasCanales.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVentasCanales();	
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
	
	public void cargarCombosForeignKeyVentasCanales(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVentasCanales(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVentasCanales(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVentasCanalesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVentasCanales();
		
		this.cargarCombosFrameForeignKeyVentasCanales();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVentasCanales();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVentasCanales();
		}
	}
	
	

	public void cargarCombosForeignKeyTituloCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTituloClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTituloCliente();
				this.cargarCombosFrameTituloClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTituloCliente(this.tituloclientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoVentasCanalesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ventascanalesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVentasCanales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
			
			
			if(jTableDatosVentasCanales.getRowCount()>=1) {
				jTableDatosVentasCanales.removeRowSelectionInterval(0, jTableDatosVentasCanales.getRowCount()-1);						
			}
			
			this.isEsNuevoVentasCanales=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVentasCanales(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVentasCanales(true);			
			//this.ventascanales=new VentasCanales();
			//this.ventascanales.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasCanales(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasCanales() ;
			
			if(VentasCanalesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasCanales(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ventascanales);	
			this.actualizarInformacion("INFO_PADRE",false,this.ventascanales);				
			
			VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
			
			if(this.ventascanalesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VentasCanales: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVentasCanalesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<VentasCanales> ventascanalessSeleccionados=new ArrayList<VentasCanales>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVentasCanales.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVentasCanales.getSelectedRows().length;			
			}
			
			ventascanalessSeleccionados=this.getVentasCanalessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVentasCanales--;			
				//VentasCanales ventascanalesAux= new VentasCanales();			
				//ventascanalesAux.setId(this.iIdNuevoVentasCanales);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VentasCanales ventascanalesOrigen=new VentasCanales();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VentasCanales ventascanalesOrigen : ventascanalessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ventascanalesOrigen =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventascanalesOrigen =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVentasCanales();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ventascanales.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVentasCanales(ventascanalesOrigen,this.ventascanales,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventascanalesLogic.getVentasCanaless().add(this.ventascanalesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventascanaless.add(this.ventascanalesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVentasCanales(false);
				
				this.jTableDatosVentasCanales.setRowSelectionInterval(this.getIndiceNuevoVentasCanales(), this.getIndiceNuevoVentasCanales());
				
				int iLastRow =  this.jTableDatosVentasCanales.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentasCanales.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentasCanales.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasCanales(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVentasCanalesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<VentasCanales> ventascanalessSeleccionados=new ArrayList<VentasCanales>();									
		
			VentasCanales ventascanalesOrigen=new VentasCanales();
			VentasCanales ventascanalesDestino=new VentasCanales();
				
			ventascanalessSeleccionados=this.getVentasCanalessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVentasCanales.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ventascanalessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVentasCanales.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventascanalesOrigen =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventascanalesOrigen =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventascanalesDestino =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventascanalesDestino =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ventascanalesOrigen =ventascanalessSeleccionados.get(0);
				ventascanalesDestino =ventascanalessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVentasCanales(ventascanalesOrigen,ventascanalesDestino,true,false);
				
				ventascanalesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ventascanalesDestino,ventascanalesLogic.getVentasCanaless());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ventascanalesDestino,ventascanaless);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVentasCanales(false);
				
				//this.jTableDatosVentasCanales.setRowSelectionInterval(this.getIndiceNuevoVentasCanales(), this.getIndiceNuevoVentasCanales());
				
				int iLastRow =  this.jTableDatosVentasCanales.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentasCanales.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentasCanales.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasCanales(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVentasCanalesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentasCanales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVentasCanales.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVentasCanalesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVentasCanales.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVentasCanales.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVentasCanales.setVisible(!isVisible);
			this.jPanelPaginacionVentasCanales.setVisible(!isVisible);
			this.jPanelAccionesVentasCanales.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVentasCanalesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVentasCanales();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVentasCanalesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVentasCanales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVentasCanalesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVentasCanales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVentasCanalesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVentasCanales();
			
			this.abrirFrameOrderByVentasCanales();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVentasCanalesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVentasCanales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVentasCanales(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentasCanales);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVentasCanales.isMaximum()) {
					this.jInternalFrameDetalleFormVentasCanales.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVentasCanales.setSize(this.jInternalFrameDetalleFormVentasCanales.iWidthFormulario,this.jInternalFrameDetalleFormVentasCanales.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVentasCanales.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVentasCanales.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVentasCanales.isMaximum()) {
						this.jInternalFrameDetalleFormVentasCanales.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVentasCanales.jContentPaneDetalleVentasCanales.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVentasCanales.jTabbedPaneRelacionesVentasCanales.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVentasCanales.jContentPaneDetalleVentasCanales.getWidth(),VentasCanalesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentasCanales.jTabbedPaneRelacionesVentasCanales.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVentasCanales.jContentPaneDetalleVentasCanales.getWidth(),VentasCanalesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentasCanales.jTabbedPaneRelacionesVentasCanales.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVentasCanales.jContentPaneDetalleVentasCanales.getWidth(),VentasCanalesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVentasCanales.setVisible(true);
	        this.jInternalFrameDetalleFormVentasCanales.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVentasCanales() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVentasCanales==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVentasCanales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasCanales,false,this);
				} else {
					this.jInternalFrameOrderByVentasCanales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasCanales,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVentasCanales);
				this.jInternalFrameOrderByVentasCanales.setVisible(false);
				this.jInternalFrameOrderByVentasCanales.setSelected(false);
				
				this.jInternalFrameOrderByVentasCanales.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentasCanales"));
				
				this.inicializarActualizarBindingTablaOrderByVentasCanales();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVentasCanales() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVentasCanales==null) {
				
				this.jInternalFrameImportacionVentasCanales=new ImportacionJInternalFrame(VentasCanalesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentasCanales);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVentasCanales);
				this.jInternalFrameImportacionVentasCanales.setVisible(false);
				this.jInternalFrameImportacionVentasCanales.setSelected(false);


				this.jInternalFrameImportacionVentasCanales.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentasCanales"));
				this.jInternalFrameImportacionVentasCanales.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentasCanales"));
				this.jInternalFrameImportacionVentasCanales.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentasCanales"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVentasCanales() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVentasCanales==null) {
				this.jInternalFrameReporteDinamicoVentasCanales=new ReporteDinamicoJInternalFrame(VentasCanalesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentasCanales);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentasCanales);
				this.jInternalFrameReporteDinamicoVentasCanales.setVisible(false);
				this.jInternalFrameReporteDinamicoVentasCanales.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVentasCanales.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasCanales"));
				this.jInternalFrameReporteDinamicoVentasCanales.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasCanales"));
				this.jInternalFrameReporteDinamicoVentasCanales.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasCanales"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasCanales();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVentasCanales() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentasCanales);
			
	       	this.jInternalFrameDetalleFormVentasCanales.setVisible(false);
	        this.jInternalFrameDetalleFormVentasCanales.setSelected(false);
			
			//this.jInternalFrameDetalleFormVentasCanales.dispose();
			//this.jInternalFrameDetalleFormVentasCanales=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVentasCanales() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVentasCanales.setVisible(true);
	        this.jInternalFrameReporteDinamicoVentasCanales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVentasCanales() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVentasCanales.setVisible(true);
	        this.jInternalFrameImportacionVentasCanales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVentasCanales() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVentasCanales.setVisible(true);
	        this.jInternalFrameOrderByVentasCanales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVentasCanales() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVentasCanales.setVisible(false);
	        this.jInternalFrameOrderByVentasCanales.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVentasCanales() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVentasCanales.setVisible(false);
	        this.jInternalFrameReporteDinamicoVentasCanales.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVentasCanales() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVentasCanales.setVisible(false);
	        this.jInternalFrameImportacionVentasCanales.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVentasCanalesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVentasCanales(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVentasCanales(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVentasCanales(true);
			//this.isEsNuevoVentasCanales=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVentasCanales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasCanales(false) ;
			
			if(ventascanalesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VentasCanalesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasCanales(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasCanales(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVentasCanalesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVentasCanales(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentasCanales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVentasCanales(true);
			//this.isEsNuevoVentasCanales=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ventascanales.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVentasCanales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVentasCanales(false) ;
			
			if(VentasCanalesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasCanales(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasCanales(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTituloCliente(List<TituloCliente> tituloclientesForeignKey)throws Exception{
		TableColumn tableColumnTituloCliente=this.jTableDatosVentasCanales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCanales,VentasCanalesConstantesFunciones.LABEL_IDTITULOCLIENTE));
		TableCellEditor tableCellEditorTituloCliente =tableColumnTituloCliente.getCellEditor();

		TituloClienteTableCell tituloclienteTableCellFk=(TituloClienteTableCell)tableCellEditorTituloCliente;

		if(tituloclienteTableCellFk!=null) {
			tituloclienteTableCellFk.settituloclientesForeignKey(tituloclientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVentasCanales.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tituloclienteTableCellFk.setRowActual(intSelectedRow);
			//tituloclienteTableCellFk.settituloclientesForeignKeyActual(tituloclientesForeignKey);
		//}


		if(tituloclienteTableCellFk!=null) {
			tituloclienteTableCellFk.RecargarTituloClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarVentasCanalesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVentasCanales(false);
			
			//if(!this.isEsNuevoVentasCanales) {								
				int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VentasCanalesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVentasCanales(this.ventascanales,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
				
			}
			
			if(this.permiteMantenimiento(this.ventascanales)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVentasCanales=true;
					this.inicializarActualizarBindingTablaVentasCanales(false);
					this.isEsNuevoVentasCanales=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVentasCanales=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVentasCanales=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentasCanales(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasCanales(false);
				
				this.habilitarDeshabilitarControlesVentasCanales(false);
			
												
				
				if(VentasCanalesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVentasCanales();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVentasCanalesActionPerformed(evt,ventascanalesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVentasCanales(this.ventascanales,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVentasCanales.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ventascanalesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ventascanales.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VentasCanales.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCanales.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVentasCanalesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				this.ventascanales.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				this.ventascanales.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ventascanales)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VentasCanalesModel) this.jTableDatosVentasCanales.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVentasCanales=true;
				this.inicializarActualizarBindingTablaVentasCanales(false);
				this.isEsNuevoVentasCanales=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentasCanales(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasCanales(false);
				
				this.habilitarDeshabilitarControlesVentasCanales(false);
				
				
				
				if(VentasCanalesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVentasCanales();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVentasCanalesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVentasCanales.getRowCount()>=1) {
				jTableDatosVentasCanales.removeRowSelectionInterval(0, jTableDatosVentasCanales.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVentasCanales(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVentasCanales(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasCanales(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasCanales(false) ;
			
			this.isEsNuevoVentasCanales=false;
			
			if(VentasCanalesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVentasCanales();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVentasCanalesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVentasCanales(false);
				
				//SI ES MANUAL
				if(VentasCanalesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVentasCanales();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVentasCanalesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVentasCanales--;			
			//VentasCanales ventascanalesAux= new VentasCanales();			
			//ventascanalesAux.setId(this.iIdNuevoVentasCanales);
			
			if(this.jInternalFrameDetalleFormVentasCanales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVentasCanales();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
			
			this.ventascanales.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ventascanalesLogic.getVentasCanaless().add(this.ventascanalesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ventascanaless.add(this.ventascanalesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVentasCanales(false);
			
			this.jTableDatosVentasCanales.setRowSelectionInterval(this.getIndiceNuevoVentasCanales(), this.getIndiceNuevoVentasCanales());
			
			int iLastRow =  this.jTableDatosVentasCanales.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVentasCanales.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVentasCanales.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVentasCanales(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVentasCanalesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVentasCanales(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasCanales(false);
			
			//SI ES MANUAL
			if(VentasCanalesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasCanales();
			}
			
			//this.abrirFrameTreeVentasCanales();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVentasCanalesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVentasCanalesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVentasCanales.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVentasCanales.setFileImportacion(this.jInternalFrameImportacionVentasCanales.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVentasCanales.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVentasCanales.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVentasCanales.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVentasCanales.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVentasCanalesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<VentasCanales> ventascanalessSeleccionados=new ArrayList<VentasCanales>();		

		ventascanalessSeleccionados=this.getVentasCanalessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VentasCanalesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VentasCanalesBaseDesign.jrxml";
			
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
			
			this.generarReporteVentasCanaless("Todos",ventascanalessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventascanalesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Canales",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoVentasCanales.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasCanales.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTituloCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTituloCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTituloCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTituloCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasCanalesConstantesFunciones.LABEL_MONTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoTituloCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoTituloCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoTituloCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoTituloCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasCanalesConstantesFunciones.LABEL_NOTASCREDITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tasCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tasCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tasCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tasCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasCanalesConstantesFunciones.LABEL_VENTANETA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntaNeta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntaNeta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntaNeta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntaNeta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasCanalesConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasCanalesConstantesFunciones.LABEL_ACUMULADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_umulado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_umulado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_umulado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_umulado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasCanalesConstantesFunciones.LABEL_TIPO:
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
		
		if(this.jInternalFrameReporteDinamicoVentasCanales.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE:
					sNombreCampoCategoria="nombre_titulo_cliente";
					break;

				case VentasCanalesConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoria="monto";
					break;

				case VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE:
					sNombreCampoCategoria="codigo_titulo_cliente";
					break;

				case VentasCanalesConstantesFunciones.LABEL_NOTASCREDITO:
					sNombreCampoCategoria="notas_credito";
					break;

				case VentasCanalesConstantesFunciones.LABEL_VENTANETA:
					sNombreCampoCategoria="venta_neta";
					break;

				case VentasCanalesConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case VentasCanalesConstantesFunciones.LABEL_ACUMULADO:
					sNombreCampoCategoria="acumulado";
					break;

				case VentasCanalesConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoria="tipo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE:
					sNombreCampoCategoriaValor="nombre_titulo_cliente";
					break;

				case VentasCanalesConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoriaValor="monto";
					break;

				case VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE:
					sNombreCampoCategoriaValor="codigo_titulo_cliente";
					break;

				case VentasCanalesConstantesFunciones.LABEL_NOTASCREDITO:
					sNombreCampoCategoriaValor="notas_credito";
					break;

				case VentasCanalesConstantesFunciones.LABEL_VENTANETA:
					sNombreCampoCategoriaValor="venta_neta";
					break;

				case VentasCanalesConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case VentasCanalesConstantesFunciones.LABEL_ACUMULADO:
					sNombreCampoCategoriaValor="acumulado";
					break;

				case VentasCanalesConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoriaValor="tipo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVentasCanales.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasCanales.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Titulo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_titulo_cliente");
					break;

				case VentasCanalesConstantesFunciones.LABEL_MONTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto");
					break;

				case VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Titulo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_titulo_cliente");
					break;

				case VentasCanalesConstantesFunciones.LABEL_NOTASCREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Notas Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"notas_credito");
					break;

				case VentasCanalesConstantesFunciones.LABEL_VENTANETA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Venta Neta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"venta_neta");
					break;

				case VentasCanalesConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case VentasCanalesConstantesFunciones.LABEL_ACUMULADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Acumulado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"acumulado");
					break;

				case VentasCanalesConstantesFunciones.LABEL_TIPO:
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
	
	public void jButtonGenerarExcelReporteDinamicoVentasCanalesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<VentasCanales> ventascanalessSeleccionados=new ArrayList<VentasCanales>();		
		
		ventascanalessSeleccionados=this.getVentasCanalessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventascanales";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("VentasCanaless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVentasCanales.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasCanales.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VentasCanalesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(VentasCanales ventascanales:ventascanalessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascanales.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCanalesConstantesFunciones.LABEL_IDTITULOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_IDTITULOCLIENTE);
					iRow++;

					for(VentasCanales ventascanales:ventascanalessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascanales.gettitulocliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(VentasCanales ventascanales:ventascanalessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascanales.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(VentasCanales ventascanales:ventascanalessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascanales.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE);
					iRow++;

					for(VentasCanales ventascanales:ventascanalessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascanales.getnombre_titulo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCanalesConstantesFunciones.LABEL_MONTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_MONTO);
					iRow++;

					for(VentasCanales ventascanales:ventascanalessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascanales.getmonto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE);
					iRow++;

					for(VentasCanales ventascanales:ventascanalessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascanales.getcodigo_titulo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCanalesConstantesFunciones.LABEL_NOTASCREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_NOTASCREDITO);
					iRow++;

					for(VentasCanales ventascanales:ventascanalessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascanales.getnotas_credito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCanalesConstantesFunciones.LABEL_VENTANETA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_VENTANETA);
					iRow++;

					for(VentasCanales ventascanales:ventascanalessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascanales.getventa_neta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCanalesConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(VentasCanales ventascanales:ventascanalessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascanales.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCanalesConstantesFunciones.LABEL_ACUMULADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_ACUMULADO);
					iRow++;

					for(VentasCanales ventascanales:ventascanalessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascanales.getacumulado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasCanalesConstantesFunciones.LABEL_TIPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_TIPO);
					iRow++;

					for(VentasCanales ventascanales:ventascanalessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventascanales.gettipo());
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
			//	this.getFilaCabeceraExportarExcelVentasCanales(row);				
			//	iRow++;
			//}				
			
			//for(VentasCanales ventascanalesAux:ventascanalessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVentasCanales(ventascanalesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventascanalesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Canales",JOptionPane.INFORMATION_MESSAGE);
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
				this.ventascanalesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasCanales(false);
			
			//SI ES MANUAL
			if(VentasCanalesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasCanales();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVentasCanalesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasCanales(false);
			
			//SI ES MANUAL
			if(VentasCanalesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentasCanales();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVentasCanalesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasCanales(false);
			
			//SI ES MANUAL
			if(VentasCanalesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentasCanales();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVentasCanales() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVentasCanales.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVentasCanales.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVentasCanales.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVentasCanales.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVentasCanales.setMinimumSize(dimensionMinimum);
		this.jTableDatosVentasCanales.setMaximumSize(dimensionMaximum);
		this.jTableDatosVentasCanales.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVentasCanales(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVentasCanales(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVentasCanales(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVentasCanales(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVentasCanales(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVentasCanales(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasCanales(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVentasCanales(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VentasCanalesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VentasCanalesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVentasCanales() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVentasCanales();
		
		this.inicializarActualizarBindingBotonesManualVentasCanales(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVentasCanales();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasCanales() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVentasCanales(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVentasCanales(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVentasCanales.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVentasCanales.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVentasCanales.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVentasCanales!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVentasCanales.jCheckBoxPostAccionNuevoVentasCanales.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVentasCanales.jCheckBoxPostAccionSinCerrarVentasCanales.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVentasCanales.jCheckBoxPostAccionSinMensajeVentasCanales.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVentasCanales.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVentasCanales.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVentasCanales.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVentasCanales!=null) {
				this.jInternalFrameDetalleFormVentasCanales.jCheckBoxPostAccionNuevoVentasCanales.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVentasCanales.jCheckBoxPostAccionSinCerrarVentasCanales.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVentasCanales.jCheckBoxPostAccionSinMensajeVentasCanales.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVentasCanales.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVentasCanales.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVentasCanales!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVentasCanales.jComboBoxTiposAccionesFormularioVentasCanales.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVentasCanales.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVentasCanales!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVentasCanales.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVentasCanales.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVentasCanales.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVentasCanales.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVentasCanales!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVentasCanales.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVentasCanales.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVentasCanales(Boolean esInicializar) throws Exception {
		try	{	
			if(VentasCanalesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVentasCanales(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVentasCanales() throws Exception {
		try	{
			if(VentasCanalesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVentasCanales();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentasCanales() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVentasCanales.jComboBoxTiposAccionesFormularioVentasCanales.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVentasCanales.jComboBoxTiposAccionesFormularioVentasCanales.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVentasCanales() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVentasCanales.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVentasCanales.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVentasCanales.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVentasCanales.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVentasCanales.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVentasCanales.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVentasCanales.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVentasCanales.addItem(reporte);
			}
			
			
			if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVentasCanales.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVentasCanales.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVentasCanales.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVentasCanales.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVentasCanales.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVentasCanales.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVentasCanales.jComboBoxTiposAccionesFormularioVentasCanales.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVentasCanales.jComboBoxTiposAccionesFormularioVentasCanales.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVentasCanales.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVentasCanales.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVentasCanales.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasCanales();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasCanales() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentasCanales!=null) {
				this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentasCanales!=null) {
				this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVentasCanales!=null) {
				
				if(this.jInternalFrameReporteDinamicoVentasCanales.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentasCanales.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasCanales.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVentasCanales.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentasCanales.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasCanales.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=VentasCanalesConstantesFunciones.getTiposSeleccionarVentasCanales(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=VentasCanalesConstantesFunciones.getTiposSeleccionarVentasCanales(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoVentasCanales.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentasCanales.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=VentasCanalesConstantesFunciones.getTiposSeleccionarVentasCanales(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasCanales.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoVentasCanales.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVentasCanales()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales.getSelectedItem()!=null){this.id_titulo_clienteBusquedaVentasCanales=((TituloCliente)this.jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaVentasCanales=new Date(this.jDateChooserfecha_emision_desdeBusquedaVentasCanalesVentasCanales.getDate().getTime());
		this.fecha_emision_hastaBusquedaVentasCanales=new Date(this.jDateChooserfecha_emision_hastaBusquedaVentasCanalesVentasCanales.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVentasCanales(Boolean esInicializar) throws Exception {				
		if(VentasCanalesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVentasCanales();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVentasCanales() throws Exception {
		this.inicializarActualizarBindingTablaVentasCanales(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVentasCanales() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVentasCanales.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVentasCanales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasCanales.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VentasCanalesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVentasCanales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasCanales.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VentasCanalesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVentasCanalesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCanalesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VentasCanalesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVentasCanales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasCanales.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VentasCanalesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVentasCanales.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVentasCanales(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ventascanalesLogic.getVentasCanaless().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ventascanaless.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VentasCanalesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVentasCanales.setModel(new VentasCanalesModel(this.ventascanalesLogic.getVentasCanaless(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVentasCanales.setModel(new VentasCanalesModel(this.ventascanaless,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVentasCanales!=null && this.jInternalFrameOrderByVentasCanales.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVentasCanales();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVentasCanales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCanales,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VentasCanalesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO,ventascanalesConstantesFunciones.resaltarSeleccionarVentasCanales,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO,ventascanalesConstantesFunciones.resaltarSeleccionarVentasCanales,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVentasCanales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCanales,VentasCanalesConstantesFunciones.LABEL_ID));

		if(this.ventascanalesConstantesFunciones.mostraridVentasCanales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCanalesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventascanalesConstantesFunciones.resaltaridVentasCanales,this.ventascanalesConstantesFunciones.activaridVentasCanales,iSizeTabla,this,true,"idVentasCanales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascanalesConstantesFunciones.resaltaridVentasCanales,this.ventascanalesConstantesFunciones.activaridVentasCanales,this,true,"idVentasCanales","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasCanales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCanales,VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE));

		if(this.ventascanalesConstantesFunciones.mostrarnombre_titulo_clienteVentasCanales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventascanalesConstantesFunciones.resaltarnombre_titulo_clienteVentasCanales,this.ventascanalesConstantesFunciones.activarnombre_titulo_clienteVentasCanales,iSizeTabla,this,true,"nombre_titulo_clienteVentasCanales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascanalesConstantesFunciones.resaltarnombre_titulo_clienteVentasCanales,this.ventascanalesConstantesFunciones.activarnombre_titulo_clienteVentasCanales,this,true,"nombre_titulo_clienteVentasCanales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasCanalesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasCanales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCanales,VentasCanalesConstantesFunciones.LABEL_MONTO));

		if(this.ventascanalesConstantesFunciones.mostrarmontoVentasCanales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCanalesConstantesFunciones.LABEL_MONTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventascanalesConstantesFunciones.resaltarmontoVentasCanales,this.ventascanalesConstantesFunciones.activarmontoVentasCanales,iSizeTabla,this,true,"montoVentasCanales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascanalesConstantesFunciones.resaltarmontoVentasCanales,this.ventascanalesConstantesFunciones.activarmontoVentasCanales,this,true,"montoVentasCanales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasCanalesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasCanales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCanales,VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE));

		if(this.ventascanalesConstantesFunciones.mostrarcodigo_titulo_clienteVentasCanales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventascanalesConstantesFunciones.resaltarcodigo_titulo_clienteVentasCanales,this.ventascanalesConstantesFunciones.activarcodigo_titulo_clienteVentasCanales,iSizeTabla,this,true,"codigo_titulo_clienteVentasCanales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascanalesConstantesFunciones.resaltarcodigo_titulo_clienteVentasCanales,this.ventascanalesConstantesFunciones.activarcodigo_titulo_clienteVentasCanales,this,true,"codigo_titulo_clienteVentasCanales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasCanalesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasCanales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCanales,VentasCanalesConstantesFunciones.LABEL_NOTASCREDITO));

		if(this.ventascanalesConstantesFunciones.mostrarnotas_creditoVentasCanales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCanalesConstantesFunciones.LABEL_NOTASCREDITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventascanalesConstantesFunciones.resaltarnotas_creditoVentasCanales,this.ventascanalesConstantesFunciones.activarnotas_creditoVentasCanales,iSizeTabla,this,true,"notas_creditoVentasCanales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascanalesConstantesFunciones.resaltarnotas_creditoVentasCanales,this.ventascanalesConstantesFunciones.activarnotas_creditoVentasCanales,this,true,"notas_creditoVentasCanales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasCanalesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasCanales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCanales,VentasCanalesConstantesFunciones.LABEL_VENTANETA));

		if(this.ventascanalesConstantesFunciones.mostrarventa_netaVentasCanales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCanalesConstantesFunciones.LABEL_VENTANETA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventascanalesConstantesFunciones.resaltarventa_netaVentasCanales,this.ventascanalesConstantesFunciones.activarventa_netaVentasCanales,iSizeTabla,this,true,"venta_netaVentasCanales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascanalesConstantesFunciones.resaltarventa_netaVentasCanales,this.ventascanalesConstantesFunciones.activarventa_netaVentasCanales,this,true,"venta_netaVentasCanales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasCanalesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasCanales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCanales,VentasCanalesConstantesFunciones.LABEL_PORCENTAJE));

		if(this.ventascanalesConstantesFunciones.mostrarporcentajeVentasCanales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCanalesConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventascanalesConstantesFunciones.resaltarporcentajeVentasCanales,this.ventascanalesConstantesFunciones.activarporcentajeVentasCanales,iSizeTabla,this,true,"porcentajeVentasCanales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascanalesConstantesFunciones.resaltarporcentajeVentasCanales,this.ventascanalesConstantesFunciones.activarporcentajeVentasCanales,this,true,"porcentajeVentasCanales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasCanalesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasCanales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCanales,VentasCanalesConstantesFunciones.LABEL_ACUMULADO));

		if(this.ventascanalesConstantesFunciones.mostraracumuladoVentasCanales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCanalesConstantesFunciones.LABEL_ACUMULADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventascanalesConstantesFunciones.resaltaracumuladoVentasCanales,this.ventascanalesConstantesFunciones.activaracumuladoVentasCanales,iSizeTabla,this,true,"acumuladoVentasCanales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascanalesConstantesFunciones.resaltaracumuladoVentasCanales,this.ventascanalesConstantesFunciones.activaracumuladoVentasCanales,this,true,"acumuladoVentasCanales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasCanalesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasCanales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasCanales,VentasCanalesConstantesFunciones.LABEL_TIPO));

		if(this.ventascanalesConstantesFunciones.mostrartipoVentasCanales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasCanalesConstantesFunciones.LABEL_TIPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventascanalesConstantesFunciones.resaltartipoVentasCanales,this.ventascanalesConstantesFunciones.activartipoVentasCanales,iSizeTabla,this,true,"tipoVentasCanales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventascanalesConstantesFunciones.resaltartipoVentasCanales,this.ventascanalesConstantesFunciones.activartipoVentasCanales,this,true,"tipoVentasCanales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasCanalesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventascanalesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventascanalesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentasCanales.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventascanalesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventascanalesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentasCanales.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVentasCanales && this.isPermisoGuardarCambiosVentasCanales) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ventascanalesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ventascanalesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVentasCanales.addColumn(tableColumn);
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
			
			this.jTableDatosVentasCanales.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentasCanales && this.isPermisoGuardarCambiosVentasCanales) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentasCanales && this.isPermisoGuardarCambiosVentasCanales) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVentasCanales.moveColumn(this.jTableDatosVentasCanales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVentasCanales.moveColumn(this.jTableDatosVentasCanales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVentasCanales.moveColumn(this.jTableDatosVentasCanales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVentasCanales.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVentasCanales.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVentasCanales,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VentasCanalesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVentasCanales.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVentasCanales.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VentasCanalesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VentasCanalesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVentasCanales.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVentasCanales.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVentasCanales.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=ventascanalesLogic.getVentasCanaless().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ventascanaless.size()-1;
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
		//this.jTableDatosVentasCanales.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVentasCanales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVentasCanales();
			
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
				
				//this.isEsNuevoVentasCanales=false;
					
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
			
				if(this.ventascanalesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVentasCanales==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentasCanales.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentasCanales.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ventascanales.getsType().equals("DUPLICADO")
				   || this.ventascanales.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVentasCanales=true;
				
				} else {
					this.isEsNuevoVentasCanales=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
					if(this.ventascanales.getId()>=0 && !this.ventascanales.getIsNew()) {						
						this.isEsNuevoVentasCanales=false;
						
					} else {
						this.isEsNuevoVentasCanales=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVentasCanales(esRelaciones);						
				
				this.seleccionarVentasCanales(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ventascanales.getId()<0) {
					this.isEsNuevoVentasCanales=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVentasCanales(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVentasCanales(evt,rowIndex);
				}	
				
				if(this.ventascanalesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VentasCanales: " + this.dDif); 
					}
				}								
				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVentasCanales(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ventascanales)) {
					if(this.ventascanales.getId()>0) {
						this.ventascanales.setIsDeleted(true);
						
						this.ventascanalessEliminados.add(this.ventascanales);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventascanalesLogic.getVentasCanaless().remove(this.ventascanales);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventascanaless.remove(this.ventascanales);				
					}
					
					
					((VentasCanalesModel) this.jTableDatosVentasCanales.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasCanales(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVentasCanales(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVentasCanales) {
			
			if(this.jInternalFrameDetalleFormVentasCanales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentasCanales.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentasCanales.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VentasCanalesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVentasCanales(this.ventascanales);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVentasCanales("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVentasCanales(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasCanales() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentasCanales(VentasCanales ventascanales) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVentasCanales(ventascanales,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentasCanales(VentasCanales ventascanales,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVentasCanales(ventascanales);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVentasCanales(ventascanales,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVentasCanales(ventascanales);
	}
	
	public void setVariablesObjetoActualToFormularioVentasCanales(VentasCanales ventascanales) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVentasCanales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVentasCanales.jLabelidVentasCanales.setText(ventascanales.getId().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextAreanombre_titulo_clienteVentasCanales.setText(ventascanales.getnombre_titulo_cliente());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldmontoVentasCanales.setText(ventascanales.getmonto().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldcodigo_titulo_clienteVentasCanales.setText(ventascanales.getcodigo_titulo_cliente());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldnotas_creditoVentasCanales.setText(ventascanales.getnotas_credito().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldventa_netaVentasCanales.setText(ventascanales.getventa_neta().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldporcentajeVentasCanales.setText(ventascanales.getporcentaje().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldacumuladoVentasCanales.setText(ventascanales.getacumulado().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldtipoVentasCanales.setText(ventascanales.gettipo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,VentasCanales ventascanalesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ventascanalesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VentasCanales ventascanalesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ventascanalesLocal=this.ventascanales;
			} else {
				ventascanalesLocal=this.ventascanalesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ventascanalesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVentasCanales(ventascanalesLocal,true);
					
					if(ventascanalesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ventascanalesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ventascanalesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVentasCanales(VentasCanales ventascanales,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentasCanales(ventascanales,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(ventascanales);
	}
	
	public void setVariablesFormularioToObjetoActualVentasCanales(VentasCanales ventascanales,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentasCanales(ventascanales,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVentasCanales(VentasCanales ventascanales,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVentasCanales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVentasCanales.jLabelidVentasCanales.getText()==null || this.jInternalFrameDetalleFormVentasCanales.jLabelidVentasCanales.getText()=="" || this.jInternalFrameDetalleFormVentasCanales.jLabelidVentasCanales.getText()=="Id") {
				this.jInternalFrameDetalleFormVentasCanales.jLabelidVentasCanales.setText("0");
			}

			if(conColumnasBase) {ventascanales.setId(Long.parseLong(this.jInternalFrameDetalleFormVentasCanales.jLabelidVentasCanales.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCanalesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCanales.jLabelIdVentasCanales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventascanales.setnombre_titulo_cliente(this.jInternalFrameDetalleFormVentasCanales.jTextAreanombre_titulo_clienteVentasCanales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCanales.jLabelnombre_titulo_clienteVentasCanales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventascanales.setmonto(Double.parseDouble(this.jInternalFrameDetalleFormVentasCanales.jTextFieldmontoVentasCanales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCanalesConstantesFunciones.LABEL_MONTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCanales.jLabelmontoVentasCanales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventascanales.setcodigo_titulo_cliente(this.jInternalFrameDetalleFormVentasCanales.jTextFieldcodigo_titulo_clienteVentasCanales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCanales.jLabelcodigo_titulo_clienteVentasCanales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventascanales.setnotas_credito(Double.parseDouble(this.jInternalFrameDetalleFormVentasCanales.jTextFieldnotas_creditoVentasCanales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCanalesConstantesFunciones.LABEL_NOTASCREDITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCanales.jLabelnotas_creditoVentasCanales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventascanales.setventa_neta(Double.parseDouble(this.jInternalFrameDetalleFormVentasCanales.jTextFieldventa_netaVentasCanales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCanalesConstantesFunciones.LABEL_VENTANETA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCanales.jLabelventa_netaVentasCanales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventascanales.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormVentasCanales.jTextFieldporcentajeVentasCanales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCanalesConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCanales.jLabelporcentajeVentasCanales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventascanales.setacumulado(Double.parseDouble(this.jInternalFrameDetalleFormVentasCanales.jTextFieldacumuladoVentasCanales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCanalesConstantesFunciones.LABEL_ACUMULADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCanales.jLabelacumuladoVentasCanales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventascanales.settipo(this.jInternalFrameDetalleFormVentasCanales.jTextFieldtipoVentasCanales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasCanalesConstantesFunciones.LABEL_TIPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasCanales.jLabeltipoVentasCanales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentasCanales(VentasCanales ventascanalesBean,VentasCanales ventascanales,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVentasCanales(VentasCanales ventascanalesOrigen,VentasCanales ventascanales,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventascanalesOrigen.getId()!=null && !ventascanalesOrigen.getId().equals(0L))) {ventascanales.setId(ventascanalesOrigen.getId());}}
			if(conDefault || (!conDefault && ventascanalesOrigen.getfecha_emision_desde()!=null && !ventascanalesOrigen.getfecha_emision_desde().equals(new Date()))) {ventascanales.setfecha_emision_desde(ventascanalesOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && ventascanalesOrigen.getfecha_emision_hasta()!=null && !ventascanalesOrigen.getfecha_emision_hasta().equals(new Date()))) {ventascanales.setfecha_emision_hasta(ventascanalesOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && ventascanalesOrigen.getnombre_titulo_cliente()!=null && !ventascanalesOrigen.getnombre_titulo_cliente().equals(""))) {ventascanales.setnombre_titulo_cliente(ventascanalesOrigen.getnombre_titulo_cliente());}
			if(conDefault || (!conDefault && ventascanalesOrigen.getmonto()!=null && !ventascanalesOrigen.getmonto().equals(0.0))) {ventascanales.setmonto(ventascanalesOrigen.getmonto());}
			if(conDefault || (!conDefault && ventascanalesOrigen.getcodigo_titulo_cliente()!=null && !ventascanalesOrigen.getcodigo_titulo_cliente().equals(""))) {ventascanales.setcodigo_titulo_cliente(ventascanalesOrigen.getcodigo_titulo_cliente());}
			if(conDefault || (!conDefault && ventascanalesOrigen.getnotas_credito()!=null && !ventascanalesOrigen.getnotas_credito().equals(0.0))) {ventascanales.setnotas_credito(ventascanalesOrigen.getnotas_credito());}
			if(conDefault || (!conDefault && ventascanalesOrigen.getventa_neta()!=null && !ventascanalesOrigen.getventa_neta().equals(0.0))) {ventascanales.setventa_neta(ventascanalesOrigen.getventa_neta());}
			if(conDefault || (!conDefault && ventascanalesOrigen.getporcentaje()!=null && !ventascanalesOrigen.getporcentaje().equals(0.0))) {ventascanales.setporcentaje(ventascanalesOrigen.getporcentaje());}
			if(conDefault || (!conDefault && ventascanalesOrigen.getacumulado()!=null && !ventascanalesOrigen.getacumulado().equals(0.0))) {ventascanales.setacumulado(ventascanalesOrigen.getacumulado());}
			if(conDefault || (!conDefault && ventascanalesOrigen.gettipo()!=null && !ventascanalesOrigen.gettipo().equals(""))) {ventascanales.settipo(ventascanalesOrigen.gettipo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentasCanales(VentasCanales ventascanales) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentasCanales.jLabelidVentasCanales.setText(ventascanales.getId().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextAreanombre_titulo_clienteVentasCanales.setText(ventascanales.getnombre_titulo_cliente());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldmontoVentasCanales.setText(ventascanales.getmonto().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldcodigo_titulo_clienteVentasCanales.setText(ventascanales.getcodigo_titulo_cliente());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldnotas_creditoVentasCanales.setText(ventascanales.getnotas_credito().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldventa_netaVentasCanales.setText(ventascanales.getventa_neta().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldporcentajeVentasCanales.setText(ventascanales.getporcentaje().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldacumuladoVentasCanales.setText(ventascanales.getacumulado().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldtipoVentasCanales.setText(ventascanales.gettipo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentasCanales(VentasCanalesBean ventascanalesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentasCanales.jLabelidVentasCanales.setText(ventascanalesBean.getId().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextAreanombre_titulo_clienteVentasCanales.setText(ventascanalesBean.getnombre_titulo_cliente());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldmontoVentasCanales.setText(ventascanalesBean.getmonto().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldcodigo_titulo_clienteVentasCanales.setText(ventascanalesBean.getcodigo_titulo_cliente());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldnotas_creditoVentasCanales.setText(ventascanalesBean.getnotas_credito().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldventa_netaVentasCanales.setText(ventascanalesBean.getventa_neta().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldporcentajeVentasCanales.setText(ventascanalesBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldacumuladoVentasCanales.setText(ventascanalesBean.getacumulado().toString());
			this.jInternalFrameDetalleFormVentasCanales.jTextFieldtipoVentasCanales.setText(ventascanalesBean.gettipo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVentasCanales(VentasCanalesParameterReturnGeneral ventascanalesReturnGeneral,VentasCanalesBean ventascanalesBean,Boolean conDefault) throws Exception { 
		try {
			VentasCanales ventascanalesLocal=new VentasCanales();
			
			ventascanalesLocal=ventascanalesReturnGeneral.getVentasCanales();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventascanalesLocal.getId()!=null && !ventascanalesLocal.getId().equals(0L))) {ventascanalesBean.setId(ventascanalesLocal.getId());}}
			if(conDefault || (!conDefault && ventascanalesLocal.getnombre_titulo_cliente()!=null && !ventascanalesLocal.getnombre_titulo_cliente().equals(""))) {ventascanalesBean.setnombre_titulo_cliente(ventascanalesLocal.getnombre_titulo_cliente());}
			if(conDefault || (!conDefault && ventascanalesLocal.getmonto()!=null && !ventascanalesLocal.getmonto().equals(0.0))) {ventascanalesBean.setmonto(ventascanalesLocal.getmonto());}
			if(conDefault || (!conDefault && ventascanalesLocal.getcodigo_titulo_cliente()!=null && !ventascanalesLocal.getcodigo_titulo_cliente().equals(""))) {ventascanalesBean.setcodigo_titulo_cliente(ventascanalesLocal.getcodigo_titulo_cliente());}
			if(conDefault || (!conDefault && ventascanalesLocal.getnotas_credito()!=null && !ventascanalesLocal.getnotas_credito().equals(0.0))) {ventascanalesBean.setnotas_credito(ventascanalesLocal.getnotas_credito());}
			if(conDefault || (!conDefault && ventascanalesLocal.getventa_neta()!=null && !ventascanalesLocal.getventa_neta().equals(0.0))) {ventascanalesBean.setventa_neta(ventascanalesLocal.getventa_neta());}
			if(conDefault || (!conDefault && ventascanalesLocal.getporcentaje()!=null && !ventascanalesLocal.getporcentaje().equals(0.0))) {ventascanalesBean.setporcentaje(ventascanalesLocal.getporcentaje());}
			if(conDefault || (!conDefault && ventascanalesLocal.getacumulado()!=null && !ventascanalesLocal.getacumulado().equals(0.0))) {ventascanalesBean.setacumulado(ventascanalesLocal.getacumulado());}
			if(conDefault || (!conDefault && ventascanalesLocal.gettipo()!=null && !ventascanalesLocal.gettipo().equals(""))) {ventascanalesBean.settipo(ventascanalesLocal.gettipo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVentasCanalesGenerico(Long idVentasCanalesSeleccionado,JComboBox jComboBoxVentasCanales,List<VentasCanales> ventascanalessLocal)throws Exception {
		try {
			VentasCanales  ventascanalesTemp=null;

			for(VentasCanales ventascanalesAux:ventascanalessLocal) {
				if(ventascanalesAux.getId()!=null && ventascanalesAux.getId().equals(idVentasCanalesSeleccionado)) {
					ventascanalesTemp=ventascanalesAux;
					break;
				}
			}

			jComboBoxVentasCanales.setSelectedItem(ventascanalesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVentasCanalesGenerico(JComboBox jComboBoxVentasCanales,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentasCanales.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVentasCanales.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentasCanales.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVentasCanales.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVentasCanales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVentasCanales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventascanales=(VentasCanales) ventascanalesLogic.getVentasCanaless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventascanales =(VentasCanales) ventascanaless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!ventascanales.getIsNew() && !ventascanales.getIsChanged() && !ventascanales.getIsDeleted()) {
				sDescripcion=ventascanales.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=ventascanales.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TituloCliente")) {
			//sDescripcion=this.getActualTituloClienteForeignKeyDescripcion((Long)value);
			if(!ventascanales.getIsNew() && !ventascanales.getIsChanged() && !ventascanales.getIsDeleted()) {
				sDescripcion=ventascanales.gettitulocliente_descripcion();
			} else {
				//sDescripcion=this.getActualTituloClienteForeignKeyDescripcion((Long)value);
				sDescripcion=ventascanales.gettitulocliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VentasCanales ventascanalesRow=new VentasCanales();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventascanalesRow=(VentasCanales) ventascanalesLogic.getVentasCanaless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventascanalesRow=(VentasCanales) ventascanaless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVentasCanales(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVentasCanales.setVisible((this.isVisibilidadCeldaNuevoVentasCanales && this.isPermisoNuevoVentasCanales));			
			this.jButtonDuplicarVentasCanales.setVisible((this.isVisibilidadCeldaDuplicarVentasCanales && this.isPermisoDuplicarVentasCanales));			
			this.jButtonCopiarVentasCanales.setVisible((this.isVisibilidadCeldaCopiarVentasCanales && this.isPermisoCopiarVentasCanales));
			this.jButtonVerFormVentasCanales.setVisible((this.isVisibilidadCeldaVerFormVentasCanales && this.isPermisoVerFormVentasCanales));
			
			this.jButtonAbrirOrderByVentasCanales.setVisible((this.isVisibilidadCeldaOrdenVentasCanales && this.isPermisoOrdenVentasCanales));			
			
			this.jButtonNuevoRelacionesVentasCanales.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasCanales && this.isPermisoNuevoVentasCanales));			
			this.jButtonNuevoGuardarCambiosVentasCanales.setVisible((this.isVisibilidadCeldaNuevoVentasCanales && this.isPermisoNuevoVentasCanales && this.isPermisoGuardarCambiosVentasCanales));
			
			if(this.jInternalFrameDetalleFormVentasCanales!=null) {
			this.jInternalFrameDetalleFormVentasCanales.jButtonModificarVentasCanales.setVisible((this.isVisibilidadCeldaModificarVentasCanales && this.isPermisoActualizarVentasCanales));	
			this.jInternalFrameDetalleFormVentasCanales.jButtonActualizarVentasCanales.setVisible((this.isVisibilidadCeldaActualizarVentasCanales && this.isPermisoActualizarVentasCanales));	
			this.jInternalFrameDetalleFormVentasCanales.jButtonEliminarVentasCanales.setVisible((this.isVisibilidadCeldaEliminarVentasCanales && this.isPermisoEliminarVentasCanales));
			this.jInternalFrameDetalleFormVentasCanales.jButtonCancelarVentasCanales.setVisible(this.isVisibilidadCeldaCancelarVentasCanales);							
			this.jInternalFrameDetalleFormVentasCanales.jButtonGuardarCambiosVentasCanales.setVisible((this.isVisibilidadCeldaGuardarVentasCanales && this.isPermisoGuardarCambiosVentasCanales));			
			
			}
						
			this.jButtonGuardarCambiosTablaVentasCanales.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasCanales && this.isPermisoGuardarCambiosVentasCanales));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVentasCanales.setVisible((this.isVisibilidadCeldaNuevoVentasCanales && this.isPermisoNuevoVentasCanales));						
			this.jButtonDuplicarToolBarVentasCanales.setVisible((this.isVisibilidadCeldaDuplicarVentasCanales && this.isPermisoDuplicarVentasCanales));						
			this.jButtonCopiarToolBarVentasCanales.setVisible((this.isVisibilidadCeldaCopiarVentasCanales && this.isPermisoCopiarVentasCanales));			
			this.jButtonVerFormToolBarVentasCanales.setVisible((this.isVisibilidadCeldaVerFormVentasCanales && this.isPermisoVerFormVentasCanales));			
			this.jButtonAbrirOrderByToolBarVentasCanales.setVisible((this.isVisibilidadCeldaOrdenVentasCanales && this.isPermisoOrdenVentasCanales));
			this.jButtonNuevoRelacionesToolBarVentasCanales.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasCanales && this.isPermisoNuevoVentasCanales));			
			this.jButtonNuevoGuardarCambiosToolBarVentasCanales.setVisible((this.isVisibilidadCeldaNuevoVentasCanales && this.isPermisoNuevoVentasCanales && this.isPermisoGuardarCambiosVentasCanales));			
			
			if(this.jInternalFrameDetalleFormVentasCanales!=null) {
			this.jInternalFrameDetalleFormVentasCanales.jButtonModificarToolBarVentasCanales.setVisible((this.isVisibilidadCeldaModificarVentasCanales && this.isPermisoActualizarVentasCanales));	
			this.jInternalFrameDetalleFormVentasCanales.jButtonActualizarToolBarVentasCanales.setVisible((this.isVisibilidadCeldaActualizarVentasCanales  && this.isPermisoActualizarVentasCanales));	
			this.jInternalFrameDetalleFormVentasCanales.jButtonEliminarToolBarVentasCanales.setVisible((this.isVisibilidadCeldaEliminarVentasCanales && this.isPermisoEliminarVentasCanales));
			this.jInternalFrameDetalleFormVentasCanales.jButtonCancelarToolBarVentasCanales.setVisible(this.isVisibilidadCeldaCancelarVentasCanales);				
			this.jInternalFrameDetalleFormVentasCanales.jButtonGuardarCambiosToolBarVentasCanales.setVisible((this.isVisibilidadCeldaGuardarVentasCanales && this.isPermisoGuardarCambiosVentasCanales));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVentasCanales.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasCanales && this.isPermisoGuardarCambiosVentasCanales));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVentasCanales.setVisible((this.isVisibilidadCeldaNuevoVentasCanales && this.isPermisoNuevoVentasCanales));			
			this.jMenuItemDuplicarVentasCanales.setVisible((this.isVisibilidadCeldaDuplicarVentasCanales && this.isPermisoDuplicarVentasCanales));			
			this.jMenuItemCopiarVentasCanales.setVisible((this.isVisibilidadCeldaCopiarVentasCanales && this.isPermisoCopiarVentasCanales));			
			this.jMenuItemVerFormVentasCanales.setVisible((this.isVisibilidadCeldaVerFormVentasCanales && this.isPermisoVerFormVentasCanales));			
			this.jMenuItemAbrirOrderByVentasCanales.setVisible((this.isVisibilidadCeldaOrdenVentasCanales && this.isPermisoOrdenVentasCanales));			
			//this.jMenuItemMostrarOcultarVentasCanales.setVisible((this.isVisibilidadCeldaOrdenVentasCanales && this.isPermisoOrdenVentasCanales));
			this.jMenuItemDetalleAbrirOrderByVentasCanales.setVisible((this.isVisibilidadCeldaOrdenVentasCanales && this.isPermisoOrdenVentasCanales));			
			//this.jMenuItemDetalleMostrarOcultarVentasCanales.setVisible((this.isVisibilidadCeldaOrdenVentasCanales && this.isPermisoOrdenVentasCanales));			
			this.jMenuItemNuevoRelacionesVentasCanales.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasCanales && this.isPermisoNuevoVentasCanales));			
			this.jMenuItemNuevoGuardarCambiosVentasCanales.setVisible((this.isVisibilidadCeldaNuevoVentasCanales && this.isPermisoNuevoVentasCanales && this.isPermisoGuardarCambiosVentasCanales));									
			
			if(this.jInternalFrameDetalleFormVentasCanales!=null) {
			this.jInternalFrameDetalleFormVentasCanales.jMenuItemModificarVentasCanales.setVisible((this.isVisibilidadCeldaModificarVentasCanales && this.isPermisoActualizarVentasCanales));	
			this.jInternalFrameDetalleFormVentasCanales.jMenuItemActualizarVentasCanales.setVisible((this.isVisibilidadCeldaActualizarVentasCanales && this.isPermisoActualizarVentasCanales));	
			this.jInternalFrameDetalleFormVentasCanales.jMenuItemEliminarVentasCanales.setVisible((this.isVisibilidadCeldaEliminarVentasCanales && this.isPermisoEliminarVentasCanales));
			this.jInternalFrameDetalleFormVentasCanales.jMenuItemCancelarVentasCanales.setVisible(this.isVisibilidadCeldaCancelarVentasCanales);				
			}
			
			this.jMenuItemGuardarCambiosVentasCanales.setVisible((this.isVisibilidadCeldaGuardarVentasCanales && this.isPermisoGuardarCambiosVentasCanales));						
			this.jMenuItemGuardarCambiosTablaVentasCanales.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasCanales && this.isPermisoGuardarCambiosVentasCanales));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVentasCanales=this.jButtonNuevoVentasCanales.isVisible();
			this.isVisibilidadCeldaDuplicarVentasCanales=this.jButtonDuplicarVentasCanales.isVisible();
			this.isVisibilidadCeldaCopiarVentasCanales=this.jButtonCopiarVentasCanales.isVisible();
			this.isVisibilidadCeldaVerFormVentasCanales=this.jButtonVerFormVentasCanales.isVisible();
			
			this.isVisibilidadCeldaOrdenVentasCanales=this.jButtonAbrirOrderByVentasCanales.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVentasCanales=this.jButtonNuevoRelacionesVentasCanales.isVisible();
			this.isVisibilidadCeldaModificarVentasCanales=this.jButtonModificarVentasCanales.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasCanales!=null) {
			this.isVisibilidadCeldaActualizarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jButtonActualizarVentasCanales.isVisible();
			this.isVisibilidadCeldaEliminarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jButtonEliminarVentasCanales.isVisible();
			this.isVisibilidadCeldaCancelarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jButtonCancelarVentasCanales.isVisible();
			this.isVisibilidadCeldaGuardarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jButtonGuardarCambiosVentasCanales.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVentasCanales=this.jButtonGuardarCambiosTablaVentasCanales.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVentasCanales=this.jButtonNuevoToolBarVentasCanales.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentasCanales=this.jButtonNuevoRelacionesToolBarVentasCanales.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasCanales!=null) {
			this.isVisibilidadCeldaModificarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jButtonModificarToolBarVentasCanales.isVisible();
			this.isVisibilidadCeldaActualizarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jButtonActualizarToolBarVentasCanales.isVisible();
			this.isVisibilidadCeldaEliminarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jButtonEliminarToolBarVentasCanales.isVisible();
			this.isVisibilidadCeldaCancelarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jButtonCancelarToolBarVentasCanales.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentasCanales=this.jButtonGuardarCambiosToolBarVentasCanales.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentasCanales=this.jButtonGuardarCambiosTablaToolBarVentasCanales.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVentasCanales=this.jMenuItemNuevoVentasCanales.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentasCanales=this.jMenuItemNuevoRelacionesVentasCanales.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasCanales!=null) {
			this.isVisibilidadCeldaModificarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jMenuItemModificarVentasCanales.isVisible();
			this.isVisibilidadCeldaActualizarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jMenuItemActualizarVentasCanales.isVisible();
			this.isVisibilidadCeldaEliminarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jMenuItemEliminarVentasCanales.isVisible();
			this.isVisibilidadCeldaCancelarVentasCanales=this.jInternalFrameDetalleFormVentasCanales.jMenuItemCancelarVentasCanales.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentasCanales=this.jMenuItemGuardarCambiosVentasCanales.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentasCanales=this.jMenuItemGuardarCambiosTablaVentasCanales.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVentasCanales(Boolean esInicializar) {
		if(VentasCanalesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ventascanalesSessionBean.getConGuardarRelaciones()) {
				//if(this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVentasCanales();
			}
			
			this.inicializarActualizarBindingBotonesManualVentasCanales(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVentasCanales() {
		this.jButtonNuevoVentasCanales.setVisible(this.isPermisoNuevoVentasCanales);			
		this.jButtonDuplicarVentasCanales.setVisible(this.isPermisoDuplicarVentasCanales);			
		this.jButtonCopiarVentasCanales.setVisible(this.isPermisoCopiarVentasCanales);			
		this.jButtonVerFormVentasCanales.setVisible(this.isPermisoVerFormVentasCanales);			
		
		this.jButtonAbrirOrderByVentasCanales.setVisible(this.isPermisoOrdenVentasCanales);					
		
		this.jButtonNuevoRelacionesVentasCanales.setVisible(this.isPermisoNuevoVentasCanales);			
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCanales.jButtonModificarVentasCanales.setVisible(this.isPermisoActualizarVentasCanales);	
			this.jInternalFrameDetalleFormVentasCanales.jButtonActualizarVentasCanales.setVisible(this.isPermisoActualizarVentasCanales);	
			this.jInternalFrameDetalleFormVentasCanales.jButtonEliminarVentasCanales.setVisible(this.isPermisoEliminarVentasCanales);
			this.jInternalFrameDetalleFormVentasCanales.jButtonCancelarVentasCanales.setVisible(this.isVisibilidadCeldaCancelarVentasCanales);						
			this.jInternalFrameDetalleFormVentasCanales.jButtonGuardarCambiosVentasCanales.setVisible(this.isPermisoGuardarCambiosVentasCanales);							
		}
		
		this.jButtonGuardarCambiosTablaVentasCanales.setVisible(this.isPermisoActualizarVentasCanales);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVentasCanales() {
		this.jInternalFrameDetalleFormVentasCanales.jButtonModificarVentasCanales.setVisible(this.isPermisoActualizarVentasCanales);	
		this.jInternalFrameDetalleFormVentasCanales.jButtonActualizarVentasCanales.setVisible(this.isPermisoActualizarVentasCanales);	
		this.jInternalFrameDetalleFormVentasCanales.jButtonEliminarVentasCanales.setVisible(this.isPermisoEliminarVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jButtonCancelarVentasCanales.setVisible(this.isVisibilidadCeldaCancelarVentasCanales);							
		this.jInternalFrameDetalleFormVentasCanales.jButtonGuardarCambiosVentasCanales.setVisible((this.isVisibilidadCeldaGuardarVentasCanales && this.isPermisoGuardarCambiosVentasCanales));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVentasCanales() {
		if(VentasCanalesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVentasCanales();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVentasCanales() {
	}
	
	public void jTableDatosVentasCanalesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVentasCanales(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVentasCanalesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCanales(this.getventascanales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascanales==null) {
						this.ventascanales = new VentasCanales();
					}

					this.setVariablesFormularioToObjetoActualVentasCanales(this.ventascanales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
				}

				if(this.ventascanales.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ventascanales.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCanales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVentasCanalesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVentasCanales(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasCanales.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasCanales.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasCanales(this.getventascanales(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.ventascanalesLogic.getConnexion());

				if(this.ventascanales.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.ventascanales.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasCanales=(TitledBorder)this.jScrollPanelDatosVentasCanales.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVentasCanales.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVentasCanalesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCanales(this.getventascanales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascanales==null) {
						this.ventascanales = new VentasCanales();
					}

					this.setVariablesFormularioToObjetoActualVentasCanales(this.ventascanales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
				}

				if(this.ventascanales.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.ventascanales.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCanales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_titulo_clienteVentasCanalesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotitulocliente=true;

			idTienePermisotitulocliente=this.tienePermisosUsuarioEnPaginaWebVentasCanales(TituloClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisotitulocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasCanales.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasCanales.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasCanales(this.getventascanales(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);

				this.tituloclienteBeanSwingJInternalFrame=new TituloClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tituloclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tituloclienteBeanSwingJInternalFrame.getTituloClienteLogic().setConnexion(this.ventascanalesLogic.getConnexion());

				if(this.ventascanales.getid_titulo_cliente()!=null) {
					this.tituloclienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tituloclienteBeanSwingJInternalFrame.setIdActual(this.ventascanales.getid_titulo_cliente());
					this.tituloclienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tituloclienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tituloclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaTituloCliente();
				}

				JInternalFrameBase jinternalFrame =this.tituloclienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasCanales=(TitledBorder)this.jScrollPanelDatosVentasCanales.getBorder();
				TitledBorder titledBordertitulocliente=(TitledBorder)this.tituloclienteBeanSwingJInternalFrame.jScrollPanelDatosTituloCliente.getBorder();

				titledBordertitulocliente.setTitle(titledBorderVentasCanales.getTitle() + " -> Titulo Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_titulo_clienteVentasCanalesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCanales(this.getventascanales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascanales==null) {
						this.ventascanales = new VentasCanales();
					}

					this.setVariablesFormularioToObjetoActualVentasCanales(this.ventascanales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
				}

				if(this.ventascanales.getid_titulo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_titulo_cliente = "+this.ventascanales.getid_titulo_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCanales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeVentasCanalesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCanales(this.getventascanales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascanales==null) {
						this.ventascanales = new VentasCanales();
					}

					this.setVariablesFormularioToObjetoActualVentasCanales(this.ventascanales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
				}

				if(this.ventascanales.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.ventascanales.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCanales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaVentasCanalesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCanales(this.getventascanales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascanales==null) {
						this.ventascanales = new VentasCanales();
					}

					this.setVariablesFormularioToObjetoActualVentasCanales(this.ventascanales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
				}

				if(this.ventascanales.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.ventascanales.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCanales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_titulo_clienteVentasCanalesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCanales(this.getventascanales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascanales==null) {
						this.ventascanales = new VentasCanales();
					}

					this.setVariablesFormularioToObjetoActualVentasCanales(this.ventascanales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
				}

				if(this.ventascanales.getnombre_titulo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_titulo_cliente like '%"+this.ventascanales.getnombre_titulo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCanales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmontoVentasCanalesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCanales(this.getventascanales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascanales==null) {
						this.ventascanales = new VentasCanales();
					}

					this.setVariablesFormularioToObjetoActualVentasCanales(this.ventascanales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
				}

				if(this.ventascanales.getmonto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto = "+this.ventascanales.getmonto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCanales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_titulo_clienteVentasCanalesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCanales(this.getventascanales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascanales==null) {
						this.ventascanales = new VentasCanales();
					}

					this.setVariablesFormularioToObjetoActualVentasCanales(this.ventascanales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
				}

				if(this.ventascanales.getcodigo_titulo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_titulo_cliente like '%"+this.ventascanales.getcodigo_titulo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCanales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnotas_creditoVentasCanalesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCanales(this.getventascanales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascanales==null) {
						this.ventascanales = new VentasCanales();
					}

					this.setVariablesFormularioToObjetoActualVentasCanales(this.ventascanales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
				}

				if(this.ventascanales.getnotas_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where notas_credito = "+this.ventascanales.getnotas_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCanales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonventa_netaVentasCanalesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCanales(this.getventascanales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascanales==null) {
						this.ventascanales = new VentasCanales();
					}

					this.setVariablesFormularioToObjetoActualVentasCanales(this.ventascanales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
				}

				if(this.ventascanales.getventa_neta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where venta_neta = "+this.ventascanales.getventa_neta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCanales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeVentasCanalesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCanales(this.getventascanales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascanales==null) {
						this.ventascanales = new VentasCanales();
					}

					this.setVariablesFormularioToObjetoActualVentasCanales(this.ventascanales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
				}

				if(this.ventascanales.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.ventascanales.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCanales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonacumuladoVentasCanalesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCanales(this.getventascanales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascanales==null) {
						this.ventascanales = new VentasCanales();
					}

					this.setVariablesFormularioToObjetoActualVentasCanales(this.ventascanales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
				}

				if(this.ventascanales.getacumulado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where acumulado = "+this.ventascanales.getacumulado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCanales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipoVentasCanalesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasCanales(this.getventascanales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventascanales==null) {
						this.ventascanales = new VentasCanales();
					}

					this.setVariablesFormularioToObjetoActualVentasCanales(this.ventascanales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);
				}

				if(this.ventascanales.gettipo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo like '%"+this.ventascanales.gettipo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasCanales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaVentasCanalesVentasCanalesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasCanales(false,false);

			this.getVentasCanalessBusquedaVentasCanales();

			this.inicializarActualizarBindingVentasCanales(false);

			//if(VentasCanalesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasCanales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaVentasCanalesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasCanales(false,false);

			this.getVentasCanalessFK_IdEmpresa();

			this.inicializarActualizarBindingVentasCanales(false);

			//if(VentasCanalesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasCanales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTituloClienteVentasCanalesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasCanales(false,false);

			this.getVentasCanalessFK_IdTituloCliente();

			this.inicializarActualizarBindingVentasCanales(false);

			//if(VentasCanalesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasCanales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventascanalesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVentasCanales() {
		if(this.jInternalFrameDetalleFormVentasCanales!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) {
			this.jInternalFrameDetalleFormVentasCanales.setVisible(false);	    			
			this.jInternalFrameDetalleFormVentasCanales.dispose();
			this.jInternalFrameDetalleFormVentasCanales=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVentasCanales!=null) {
			this.jInternalFrameReporteDinamicoVentasCanales.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVentasCanales.dispose();
			this.jInternalFrameReporteDinamicoVentasCanales=null;
		}
		
		if(this.jInternalFrameImportacionVentasCanales!=null) {
			this.jInternalFrameImportacionVentasCanales.setVisible(false);	    			
			this.jInternalFrameImportacionVentasCanales.dispose();
			this.jInternalFrameImportacionVentasCanales=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVentasCanales();
			
			VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
			
			
			if(sTipo.equals("NuevoVentasCanales")) {
				jButtonNuevoVentasCanalesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVentasCanales")) {
				jButtonDuplicarVentasCanalesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVentasCanales")) {
				jButtonCopiarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("VerFormVentasCanales")) {
				jButtonVerFormVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVentasCanales")) {
				jButtonNuevoVentasCanalesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVentasCanales")) {
				jButtonDuplicarVentasCanalesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVentasCanales")) {
				jButtonNuevoVentasCanalesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVentasCanales")) {
				jButtonDuplicarVentasCanalesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVentasCanales")) {
				jButtonNuevoVentasCanalesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVentasCanales")) {
				jButtonNuevoVentasCanalesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVentasCanales")) {
				jButtonNuevoVentasCanalesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVentasCanales")) {
				jButtonModificarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVentasCanales")) {
				jButtonModificarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVentasCanales")) {
				jButtonModificarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVentasCanales")) {
				jButtonActualizarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVentasCanales")) {
				jButtonActualizarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVentasCanales")) {
				jButtonActualizarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("EliminarVentasCanales")) {
				jButtonEliminarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVentasCanales")) {
				jButtonEliminarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVentasCanales")) {
				jButtonEliminarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("CancelarVentasCanales")) {
				jButtonCancelarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVentasCanales")) {
				jButtonCancelarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVentasCanales")) {
				jButtonCancelarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("CerrarVentasCanales")) {
				jButtonCerrarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVentasCanales")) {
				jButtonCerrarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVentasCanales")) {
				jButtonCerrarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVentasCanales")) {
				jButtonMostrarOcultarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVentasCanales")) {
				jButtonCancelarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVentasCanales")) {
				jButtonGuardarCambiosVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVentasCanales")) {
				jButtonGuardarCambiosVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVentasCanales")) {
				jButtonCopiarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVentasCanales")) {
				jButtonVerFormVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVentasCanales")) {
				jButtonGuardarCambiosVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVentasCanales")) {
				jButtonCopiarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVentasCanales")) {
				jButtonVerFormVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVentasCanales")) {
				jButtonGuardarCambiosVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVentasCanales")) {
				jButtonGuardarCambiosVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVentasCanales")) {
				jButtonGuardarCambiosVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVentasCanales")) {
				jButtonRecargarInformacionVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVentasCanales")) {
				jButtonRecargarInformacionVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVentasCanales")) {
				jButtonRecargarInformacionVentasCanalesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVentasCanales")) {
				jButtonAnterioresVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVentasCanales")) {
				jButtonAnterioresVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVentasCanales")) {
				jButtonAnterioresVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVentasCanales")) {
				jButtonSiguientesVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVentasCanales")) {
				jButtonSiguientesVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVentasCanales")) {
				jButtonSiguientesVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVentasCanales") || sTipo.equals("MenuItemDetalleAbrirOrderByVentasCanales")) {
				jButtonAbrirOrderByVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVentasCanales") || sTipo.equals("MenuItemDetalleMostrarOcultarVentasCanales")) {
				jButtonMostrarOcultarVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVentasCanales")) {
				jButtonNuevoGuardarCambiosVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVentasCanales")) {
				jButtonNuevoGuardarCambiosVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVentasCanales")) {
				jButtonNuevoGuardarCambiosVentasCanalesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVentasCanales")) {
				jButtonCerrarReporteDinamicoVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVentasCanales")) {
				jButtonGenerarReporteDinamicoVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVentasCanales")) {
				
				jButtonGenerarExcelReporteDinamicoVentasCanalesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVentasCanales")) {
				jButtonCerrarImportacionVentasCanalesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVentasCanales")) {
				
				jButtonGenerarImportacionVentasCanalesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVentasCanales")) {
				
				jButtonAbrirImportacionVentasCanalesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVentasCanales")) {
				jComboBoxTiposAccionesVentasCanalesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVentasCanales")) {
				jComboBoxTiposRelacionesVentasCanalesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVentasCanales")) {
				jComboBoxTiposAccionesVentasCanalesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVentasCanales")) {
				
				jComboBoxTiposSeleccionarVentasCanalesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVentasCanales")) {
				jTextFieldValorCampoGeneralVentasCanalesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVentasCanales")) {
				jButtonAbrirOrderByVentasCanalesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVentasCanales")) {
				jButtonAbrirOrderByVentasCanalesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVentasCanales")) {
				jButtonCerrarOrderByVentasCanalesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentasCanalesBusqueda")) {
				this.jButtonidVentasCanalesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentasCanalesUpdate")) {
				this.jButtonid_empresaVentasCanalesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentasCanalesBusqueda")) {
				this.jButtonid_empresaVentasCanalesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_titulo_clienteVentasCanalesUpdate")) {
				this.jButtonid_titulo_clienteVentasCanalesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_titulo_clienteVentasCanalesBusqueda")) {
				this.jButtonid_titulo_clienteVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeVentasCanalesBusqueda")) {
				this.jButtonfecha_emision_desdeVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaVentasCanalesBusqueda")) {
				this.jButtonfecha_emision_hastaVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_titulo_clienteVentasCanalesBusqueda")) {
				this.jButtonnombre_titulo_clienteVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoVentasCanalesBusqueda")) {
				this.jButtonmontoVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_titulo_clienteVentasCanalesBusqueda")) {
				this.jButtoncodigo_titulo_clienteVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("notas_creditoVentasCanalesBusqueda")) {
				this.jButtonnotas_creditoVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("venta_netaVentasCanalesBusqueda")) {
				this.jButtonventa_netaVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeVentasCanalesBusqueda")) {
				this.jButtonporcentajeVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("acumuladoVentasCanalesBusqueda")) {
				this.jButtonacumuladoVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoVentasCanalesBusqueda")) {
				this.jButtontipoVentasCanalesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaVentasCanalesVentasCanales")) {
				this.jButtonBusquedaVentasCanalesVentasCanalesActionPerformed(evt);
			}
			
			;
			
			
			VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVentasCanales();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasCanalesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascanales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascanales);
				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
				
				


				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCanales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCanales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			VentasCanales ventascanalesLocal=null;
			
			if(!this.getEsControlTabla()) {
				ventascanalesLocal=this.ventascanales;
			} else {
				ventascanalesLocal=this.ventascanalesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascanales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascanales);
				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
							
				
				


				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCanales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCanales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasCanalesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesAnterior =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventascanalesAnterior =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
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
			
			VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
			
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
			
			


			
			VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasCanalesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascanales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascanales);
				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
								
						
				


				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCanales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCanales.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascanales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascanales);
				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
								
				
				


				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCanales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCanales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasCanalesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesAnterior =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventascanalesAnterior =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascanales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascanales);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasCanalesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesAnterior =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventascanalesAnterior =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasCanalesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascanales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventascanales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascanales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascanales);
				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
							
				
				


				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCanales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCanales.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasCanalesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascanalesAnterior =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventascanalesAnterior =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
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
			
			VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
			
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
			
			


			
			VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasCanalesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascanales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventascanales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascanales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascanales);
				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
								
				
				


				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCanales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCanales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasCanalesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesAnterior =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventascanalesAnterior =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasCanalesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascanales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventascanales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasCanalesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascanales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascanales);
				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVentasCanales")) {
					jCheckBoxSeleccionarTodosVentasCanalesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVentasCanales")) {
					jCheckBoxSeleccionadosVentasCanalesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVentasCanales")) {
					
				}
				
				


				
				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCanales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCanales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascanales);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ventascanales);
				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
												
				
				


				
				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCanales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCanales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasCanalesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventascanalesAnterior =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventascanalesAnterior =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasCanalesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascanales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascanales);
				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
				
				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
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
			
			VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
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
			
			


			
			VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasCanalesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascanales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascanales);
				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCanales.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCanales.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventascanales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventascanales);
				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
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
				
				


				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasCanales.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasCanales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasCanalesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventascanalesAnterior =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventascanalesAnterior =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVentasCanales")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVentasCanalesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVentasCanales.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ventascanales =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ventascanales =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ventascanales);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVentasCanales")) {
				
				}
				
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVentasCanales")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVentasCanales.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVentasCanales")) {
			
			}
			
			VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVentasCanales();
			
			VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
			
			if(sTipo.equals("NuevoVentasCanales")) {
				jButtonNuevoVentasCanalesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVentasCanales")) {
				jButtonDuplicarVentasCanalesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVentasCanales")) {
				jButtonCopiarVentasCanalesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVentasCanales")) {
				jButtonVerFormVentasCanalesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVentasCanales")) {
				jButtonNuevoVentasCanalesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVentasCanales")) {
				jButtonModificarVentasCanalesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVentasCanales")) {
				jButtonActualizarVentasCanalesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVentasCanales")) {
				jButtonEliminarVentasCanalesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVentasCanales")) {
				jButtonGuardarCambiosVentasCanalesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVentasCanales")) {
				jButtonCancelarVentasCanalesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVentasCanales")) {
				jButtonCerrarVentasCanalesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVentasCanales")) {
				jButtonGuardarCambiosVentasCanalesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVentasCanales")) {
				jButtonNuevoGuardarCambiosVentasCanalesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVentasCanales")) {
				jButtonAbrirOrderByVentasCanalesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVentasCanales")) {
				jButtonRecargarInformacionVentasCanalesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVentasCanales")) {
				jButtonAnterioresVentasCanalesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVentasCanales")) {
				jButtonSiguientesVentasCanalesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentasCanalesBusqueda")) {
				this.jButtonidVentasCanalesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentasCanalesUpdate")) {
				this.jButtonid_empresaVentasCanalesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentasCanalesBusqueda")) {
				this.jButtonid_empresaVentasCanalesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_titulo_clienteVentasCanalesUpdate")) {
				this.jButtonid_titulo_clienteVentasCanalesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_titulo_clienteVentasCanalesBusqueda")) {
				this.jButtonid_titulo_clienteVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeVentasCanalesBusqueda")) {
				this.jButtonfecha_emision_desdeVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaVentasCanalesBusqueda")) {
				this.jButtonfecha_emision_hastaVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_titulo_clienteVentasCanalesBusqueda")) {
				this.jButtonnombre_titulo_clienteVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoVentasCanalesBusqueda")) {
				this.jButtonmontoVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_titulo_clienteVentasCanalesBusqueda")) {
				this.jButtoncodigo_titulo_clienteVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("notas_creditoVentasCanalesBusqueda")) {
				this.jButtonnotas_creditoVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("venta_netaVentasCanalesBusqueda")) {
				this.jButtonventa_netaVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeVentasCanalesBusqueda")) {
				this.jButtonporcentajeVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("acumuladoVentasCanalesBusqueda")) {
				this.jButtonacumuladoVentasCanalesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoVentasCanalesBusqueda")) {
				this.jButtontipoVentasCanalesBusquedaActionPerformed(evt);
			}
			
			VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVentasCanales();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVentasCanales")) {
				closingInternalFrameVentasCanales();
				
			} else if(sTipo.equals("jButtonCancelarVentasCanales")) {
				JInternalFrameBase jInternalFrameDetalleFormVentasCanales = (JInternalFrameBase)evt.getSource();
	            	
	            VentasCanalesBeanSwingJInternalFrame jInternalFrameParent=(VentasCanalesBeanSwingJInternalFrame)jInternalFrameDetalleFormVentasCanales.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVentasCanalesActionPerformed(null);
			}
			
			VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventascanales,new Object(),this.ventascanalesParameterGeneral,this.ventascanalesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVentasCanales(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVentasCanales(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVentasCanales(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ventascanales)) {
			if(!esControlTabla) {
				if(VentasCanalesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVentasCanales(this.ventascanales,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);			
				}
				
				if(this.ventascanalesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVentasCanales(this.ventascanales,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVentasCanales(this.ventascanalesReturnGeneral,this.ventascanalesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ventascanalesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVentasCanales(classes,this.ventascanalesReturnGeneral,this.ventascanalesBean,false);
					}
						
					if(this.ventascanalesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVentasCanales(this.ventascanalesReturnGeneral.getVentasCanales());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVentasCanales(this.ventascanalesReturnGeneral.getVentasCanales());	
					}
						
					if(this.ventascanalesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVentasCanales(this.ventascanalesReturnGeneral.getVentasCanales(),classes);//this.ventascanalesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVentasCanales(this.ventascanales,classes);//this.ventascanalesBean);									
				}
			
				if(VentasCanalesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVentasCanales(this.ventascanales,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasCanales(this.ventascanales);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ventascanalesAnterior!=null) {
						this.ventascanales=this.ventascanalesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ventascanalesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ventascanalesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ventascanalesReturnGeneral.getVentasCanales(),ventascanalesLogic.getVentasCanaless());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ventascanalesReturnGeneral.getVentasCanales(),this.ventascanaless);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVentasCanales.repaint();
				
				//((AbstractTableModel) this.jTableDatosVentasCanales.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVentasCanales();
			}
		}
	}
	
	public void actualizarVisualTableDatosVentasCanales() throws Exception {
		
		VentasCanalesModel ventascanalesModel=(VentasCanalesModel)this.jTableDatosVentasCanales.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventascanalesModel.ventascanaless=this.ventascanalesLogic.getVentasCanaless();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ventascanalesModel.ventascanaless=this.ventascanaless;
		}
		
		
		((VentasCanalesModel) this.jTableDatosVentasCanales.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVentasCanales() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getventascanalesAnterior(),this.ventascanalesLogic.getVentasCanaless());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getventascanalesAnterior(),this.ventascanaless);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVentasCanales();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVentasCanales(VentasCanales ventascanales,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
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
										
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventascanales,new Object(),generalEntityParameterGeneral,this.ventascanalesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ventascanalesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VentasCanalesConstantesFunciones.getClassesRelationshipsOfVentasCanales(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VentasCanalesConstantesFunciones.getClassesRelationshipsFromStringsOfVentasCanales(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVentasCanales(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VentasCanalesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventascanales,new Object(),generalEntityParameterGeneral,this.ventascanalesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVentasCanales(VentasCanalesBean ventascanalesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVentasCanales(ArrayList<Classe> classes,VentasCanalesReturnGeneral ventascanalesReturnGeneral,VentasCanalesBean ventascanalesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVentasCanales(VentasCanales ventascanales,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.ventascanales)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVentasCanales = new VentasCanalesDetalleFormJInternalFrame(jDesktopPane,this.ventascanalesSessionBean.getConGuardarRelaciones(),this.ventascanalesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.setVisible(false);
		this.jInternalFrameDetalleFormVentasCanales.setSelected(false);						
		
		this.jInternalFrameDetalleFormVentasCanales.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVentasCanales.ventascanalesLogic=this.ventascanalesLogic;
		
		this.cargarCombosFrameForeignKeyVentasCanales("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVentasCanales();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentasCanales();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVentasCanales("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVentasCanales();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVentasCanales.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentasCanales"));
		
		this.jInternalFrameDetalleFormVentasCanales.jButtonModificarVentasCanales.addActionListener(new ButtonActionListener(this,"ModificarVentasCanales"));

		
		this.jInternalFrameDetalleFormVentasCanales.jButtonModificarToolBarVentasCanales.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentasCanales"));
					
		this.jInternalFrameDetalleFormVentasCanales.jMenuItemModificarVentasCanales.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentasCanales"));		
		
		
		
		this.jInternalFrameDetalleFormVentasCanales.jButtonActualizarVentasCanales.addActionListener (new ButtonActionListener(this,"ActualizarVentasCanales"));
		
		
		this.jInternalFrameDetalleFormVentasCanales.jButtonActualizarToolBarVentasCanales.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentasCanales"));
						
		this.jInternalFrameDetalleFormVentasCanales.jMenuItemActualizarVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentasCanales"));		
		
		
		
		this.jInternalFrameDetalleFormVentasCanales.jButtonEliminarVentasCanales.addActionListener (new ButtonActionListener(this,"EliminarVentasCanales"));
		
		
		this.jInternalFrameDetalleFormVentasCanales.jButtonEliminarToolBarVentasCanales.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentasCanales"));
								
		this.jInternalFrameDetalleFormVentasCanales.jMenuItemEliminarVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentasCanales"));		
		
		
		
		this.jInternalFrameDetalleFormVentasCanales.jButtonCancelarVentasCanales.addActionListener (new ButtonActionListener(this,"CancelarVentasCanales"));
		
		
		this.jInternalFrameDetalleFormVentasCanales.jButtonCancelarToolBarVentasCanales.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentasCanales"));
					
		this.jInternalFrameDetalleFormVentasCanales.jMenuItemCancelarVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentasCanales"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVentasCanales.jMenuItemDetalleCerrarVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentasCanales"));		
		
		
		
		this.jInternalFrameDetalleFormVentasCanales.jButtonGuardarCambiosToolBarVentasCanales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasCanales"));
		
		
		
		this.jInternalFrameDetalleFormVentasCanales.jButtonGuardarCambiosToolBarVentasCanales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasCanales"));
		
		
		
		this.jInternalFrameDetalleFormVentasCanales.jComboBoxTiposAccionesFormularioVentasCanales.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentasCanales"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonidVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"idVentasCanalesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasCanales.jButtonid_empresaVentasCanalesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasCanalesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonid_empresaVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasCanalesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasCanales.jButtonid_titulo_clienteVentasCanalesUpdate.addActionListener(new ButtonActionListener(this,"id_titulo_clienteVentasCanalesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonid_titulo_clienteVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"id_titulo_clienteVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonfecha_emision_desdeVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonfecha_emision_hastaVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonnombre_titulo_clienteVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_titulo_clienteVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonmontoVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"montoVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtoncodigo_titulo_clienteVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_titulo_clienteVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonnotas_creditoVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"notas_creditoVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonventa_netaVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"venta_netaVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonporcentajeVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonacumuladoVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"acumuladoVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtontipoVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"tipoVentasCanalesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVentasCanales.jTabbedPaneRelacionesVentasCanales.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentasCanales"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVentasCanales"));
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCanales.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentasCanales"));
		}
		
		this.jTableDatosVentasCanales.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVentasCanales"));
		
		this.jTableDatosVentasCanales.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVentasCanales"));
		
		this.jButtonNuevoVentasCanales.addActionListener(new ButtonActionListener(this,"NuevoVentasCanales"));
		
		this.jButtonDuplicarVentasCanales.addActionListener(new ButtonActionListener(this,"DuplicarVentasCanales"));
		
		this.jButtonCopiarVentasCanales.addActionListener(new ButtonActionListener(this,"CopiarVentasCanales"));
		
		this.jButtonVerFormVentasCanales.addActionListener(new ButtonActionListener(this,"VerFormVentasCanales"));
		
		
		this.jButtonNuevoToolBarVentasCanales.addActionListener(new ButtonActionListener(this,"NuevoToolBarVentasCanales"));
			
		this.jButtonDuplicarToolBarVentasCanales.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVentasCanales"));
			
		this.jMenuItemNuevoVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVentasCanales"));
			
		this.jMenuItemDuplicarVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVentasCanales"));		
		
		
		this.jButtonNuevoRelacionesVentasCanales.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVentasCanales"));
		
		
		this.jButtonNuevoRelacionesToolBarVentasCanales.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVentasCanales"));
			
		this.jMenuItemNuevoRelacionesVentasCanales.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVentasCanales"));		
		
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCanales.jButtonModificarVentasCanales.addActionListener(new ButtonActionListener(this,"ModificarVentasCanales"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCanales.jButtonModificarToolBarVentasCanales.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentasCanales"));
			
			this.jInternalFrameDetalleFormVentasCanales.jMenuItemModificarVentasCanales.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentasCanales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVentasCanales.jButtonActualizarVentasCanales.addActionListener (new ButtonActionListener(this,"ActualizarVentasCanales"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCanales.jButtonActualizarToolBarVentasCanales.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentasCanales"));
				
			this.jInternalFrameDetalleFormVentasCanales.jMenuItemActualizarVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentasCanales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCanales.jButtonEliminarVentasCanales.addActionListener (new ButtonActionListener(this,"EliminarVentasCanales"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCanales.jButtonEliminarToolBarVentasCanales.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentasCanales"));
						
			this.jInternalFrameDetalleFormVentasCanales.jMenuItemEliminarVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentasCanales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCanales.jButtonCancelarVentasCanales.addActionListener (new ButtonActionListener(this,"CancelarVentasCanales"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCanales.jButtonCancelarToolBarVentasCanales.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentasCanales"));
			
			this.jInternalFrameDetalleFormVentasCanales.jMenuItemCancelarVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentasCanales"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVentasCanales.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVentasCanales"));		
		
		
		this.jButtonCerrarVentasCanales.addActionListener (new ButtonActionListener(this,"CerrarVentasCanales"));
		
		
		this.jButtonCerrarToolBarVentasCanales.addActionListener (new ButtonActionListener(this,"CerrarToolBarVentasCanales"));
			
		this.jMenuItemCerrarVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVentasCanales"));
			
		if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCanales.jMenuItemDetalleCerrarVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentasCanales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCanales.jButtonGuardarCambiosVentasCanales.addActionListener (new ButtonActionListener(this,"GuardarCambiosVentasCanales"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCanales.jButtonGuardarCambiosToolBarVentasCanales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasCanales"));
		}
		
		this.jButtonCopiarToolBarVentasCanales.addActionListener (new ButtonActionListener(this,"CopiarToolBarVentasCanales"));
			
		this.jButtonVerFormToolBarVentasCanales.addActionListener (new ButtonActionListener(this,"VerFormToolBarVentasCanales"));
		
		this.jMenuItemGuardarCambiosVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVentasCanales"));
			
		this.jMenuItemCopiarVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVentasCanales"));		
		
		this.jMenuItemVerFormVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVentasCanales"));		
		
		
		this.jButtonGuardarCambiosTablaVentasCanales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentasCanales"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVentasCanales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVentasCanales"));
			
		this.jMenuItemGuardarCambiosTablaVentasCanales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentasCanales"));		
		
		
		
		this.jButtonRecargarInformacionVentasCanales.addActionListener (new ButtonActionListener(this,"RecargarInformacionVentasCanales"));
					
		this.jButtonRecargarInformacionToolBarVentasCanales.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVentasCanales"));
		
		this.jMenuItemRecargarInformacionVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVentasCanales"));		
		
		
		
		this.jButtonAnterioresVentasCanales.addActionListener (new ButtonActionListener(this,"AnterioresVentasCanales"));
		
		
		this.jButtonAnterioresToolBarVentasCanales.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVentasCanales"));
		
		this.jMenuItemAnterioresVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVentasCanales"));		
		
		
		this.jButtonSiguientesVentasCanales.addActionListener (new ButtonActionListener(this,"SiguientesVentasCanales"));
		
		
		this.jButtonSiguientesToolBarVentasCanales.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVentasCanales"));
			
		this.jMenuItemSiguientesVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVentasCanales"));
			
		this.jMenuItemAbrirOrderByVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVentasCanales"));
			
		this.jMenuItemMostrarOcultarVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVentasCanales"));
			
		this.jMenuItemDetalleAbrirOrderByVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVentasCanales"));
			
		this.jMenuItemDetalleMostarOcultarVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVentasCanales"));		
		
		
		this.jButtonNuevoGuardarCambiosVentasCanales.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVentasCanales"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentasCanales.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVentasCanales"));
			
		this.jMenuItemNuevoGuardarCambiosVentasCanales.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVentasCanales"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVentasCanales.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVentasCanales"));

		this.jCheckBoxSeleccionadosVentasCanales.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVentasCanales"));
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCanales.jComboBoxTiposAccionesFormularioVentasCanales.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentasCanales"));
		}
		
		
		this.jComboBoxTiposRelacionesVentasCanales.addActionListener (new ButtonActionListener(this,"TiposRelacionesVentasCanales"));
			
		this.jComboBoxTiposAccionesVentasCanales.addActionListener (new ButtonActionListener(this,"TiposAccionesVentasCanales"));
					
		this.jComboBoxTiposSeleccionarVentasCanales.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVentasCanales"));
			
		this.jTextFieldValorCampoGeneralVentasCanales.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVentasCanales"));		
		
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonidVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"idVentasCanalesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasCanales.jButtonid_empresaVentasCanalesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasCanalesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonid_empresaVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasCanalesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasCanales.jButtonid_titulo_clienteVentasCanalesUpdate.addActionListener(new ButtonActionListener(this,"id_titulo_clienteVentasCanalesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonid_titulo_clienteVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"id_titulo_clienteVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonfecha_emision_desdeVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonfecha_emision_hastaVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonnombre_titulo_clienteVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_titulo_clienteVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonmontoVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"montoVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtoncodigo_titulo_clienteVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_titulo_clienteVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonnotas_creditoVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"notas_creditoVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonventa_netaVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"venta_netaVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonporcentajeVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonacumuladoVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"acumuladoVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtontipoVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"tipoVentasCanalesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaVentasCanalesVentasCanales.addActionListener(new ButtonActionListener(this,"BusquedaVentasCanalesVentasCanales"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVentasCanales!=null) {
				this.jInternalFrameReporteDinamicoVentasCanales.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasCanales"));
				this.jInternalFrameReporteDinamicoVentasCanales.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasCanales"));
				this.jInternalFrameReporteDinamicoVentasCanales.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasCanales"));
			}
			
			//this.jButtonCerrarReporteDinamicoVentasCanales.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasCanales"));				
			//this.jButtonGenerarReporteDinamicoVentasCanales.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasCanales"));
			//this.jButtonGenerarExcelReporteDinamicoVentasCanales.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasCanales"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVentasCanales!=null) {
				this.jInternalFrameImportacionVentasCanales.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentasCanales"));
				this.jInternalFrameImportacionVentasCanales.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentasCanales"));
				this.jInternalFrameImportacionVentasCanales.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentasCanales"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVentasCanales.addActionListener (new ButtonActionListener(this,"AbrirOrderByVentasCanales"));
			
			this.jButtonAbrirOrderByToolBarVentasCanales.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVentasCanales"));			
			
			if(this.jInternalFrameOrderByVentasCanales!=null) {
				this.jInternalFrameOrderByVentasCanales.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentasCanales"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVentasCanales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasCanales.jTabbedPaneRelacionesVentasCanales.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentasCanales"));
		
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
            		closingInternalFrameVentasCanales();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVentasCanales.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVentasCanales = (JInternalFrameBase)event.getSource();
	            	
	            VentasCanalesBeanSwingJInternalFrame jInternalFrameParent=(VentasCanalesBeanSwingJInternalFrame)jInternalFrameDetalleFormVentasCanales.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVentasCanalesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVentasCanales.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVentasCanalesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVentasCanales.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVentasCanales.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasCanalesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasCanalesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasCanalesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVentasCanales";
		inputMap = this.jButtonNuevoVentasCanales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVentasCanales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentasCanalesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasCanalesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasCanalesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasCanalesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVentasCanales";
		inputMap = this.jButtonNuevoRelacionesVentasCanales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVentasCanales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentasCanalesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVentasCanales";
		inputMap = this.jButtonModificarVentasCanales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVentasCanales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVentasCanalesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVentasCanales";
		inputMap = this.jButtonActualizarVentasCanales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVentasCanales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVentasCanalesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVentasCanales";
		inputMap = this.jButtonEliminarVentasCanales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVentasCanales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVentasCanalesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVentasCanales";
		inputMap = this.jButtonCancelarVentasCanales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVentasCanales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVentasCanalesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVentasCanales";
		inputMap = this.jButtonCerrarVentasCanales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVentasCanales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVentasCanalesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVentasCanales.jButtonGuardarCambiosVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVentasCanales";
		inputMap = this.jInternalFrameDetalleFormVentasCanales.jButtonGuardarCambiosVentasCanales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVentasCanales.jButtonGuardarCambiosVentasCanales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVentasCanalesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVentasCanales.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVentasCanalesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVentasCanales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVentasCanalesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVentasCanales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVentasCanalesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVentasCanales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVentasCanalesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonidVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"idVentasCanalesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasCanales.jButtonid_empresaVentasCanalesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasCanalesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonid_empresaVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasCanalesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasCanales.jButtonid_titulo_clienteVentasCanalesUpdate.addActionListener(new ButtonActionListener(this,"id_titulo_clienteVentasCanalesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonid_titulo_clienteVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"id_titulo_clienteVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonfecha_emision_desdeVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonfecha_emision_hastaVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonnombre_titulo_clienteVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_titulo_clienteVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonmontoVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"montoVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtoncodigo_titulo_clienteVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_titulo_clienteVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonnotas_creditoVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"notas_creditoVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonventa_netaVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"venta_netaVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonporcentajeVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtonacumuladoVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"acumuladoVentasCanalesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasCanales.jButtontipoVentasCanalesBusqueda.addActionListener(new ButtonActionListener(this,"tipoVentasCanalesBusqueda"));
		
		
		this.jButtonBusquedaVentasCanalesVentasCanales.addActionListener(new ButtonActionListener(this,"BusquedaVentasCanalesVentasCanales"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVentasCanales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVentasCanalesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVentasCanalesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVentasCanales.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVentasCanales(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(VentasCanales ventascanalesAux:this.ventascanalesLogic.getVentasCanaless()) {
					ventascanalesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasCanales ventascanalesAux:ventascanaless) {
					ventascanalesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVentasCanalesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentasCanales(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentasCanales ventascanalesAux:this.ventascanalesLogic.getVentasCanaless()) {
						ventascanalesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasCanales ventascanalesAux:ventascanaless) {
						ventascanalesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(VentasCanales ventascanalesAux:this.ventascanalesLogic.getVentasCanaless()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasCanales ventascanalesAux:ventascanaless) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVentasCanales(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentasCanales.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentasCanales.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentasCanales,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVentasCanalesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentasCanales(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVentasCanales.getSelectedRows();
			
			VentasCanales ventascanalesLocal=new VentasCanales();
			
			//this.seleccionarTodosVentasCanales(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ventascanalesLocal =(VentasCanales) this.ventascanalesLogic.getVentasCanaless().toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ventascanalesLocal =(VentasCanales) this.ventascanaless.toArray()[this.jTableDatosVentasCanales.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ventascanalesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentasCanales ventascanalesAux:this.ventascanalesLogic.getVentasCanaless()) {
						ventascanalesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasCanales ventascanalesAux:ventascanaless) {
						ventascanalesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVentasCanales(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentasCanales.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentasCanales.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentasCanales,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVentasCanalesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVentasCanalesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVentasCanalesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVentasCanales(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVentasCanales.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentasCanales ventascanalesAux:this.ventascanalesLogic.getVentasCanaless()) {
				
						if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ventascanalesAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ventascanalesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE)) {
							existe=true;
							ventascanalesAux.setnombre_titulo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							ventascanalesAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE)) {
							existe=true;
							ventascanalesAux.setcodigo_titulo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_NOTASCREDITO)) {
							existe=true;
							ventascanalesAux.setnotas_credito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_VENTANETA)) {
							existe=true;
							ventascanalesAux.setventa_neta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							ventascanalesAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_ACUMULADO)) {
							existe=true;
							ventascanalesAux.setacumulado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							ventascanalesAux.settipo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasCanales ventascanalesAux:ventascanaless) {
					
						if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ventascanalesAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ventascanalesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE)) {
							existe=true;
							ventascanalesAux.setnombre_titulo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							ventascanalesAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE)) {
							existe=true;
							ventascanalesAux.setcodigo_titulo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_NOTASCREDITO)) {
							existe=true;
							ventascanalesAux.setnotas_credito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_VENTANETA)) {
							existe=true;
							ventascanalesAux.setventa_neta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							ventascanalesAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_ACUMULADO)) {
							existe=true;
							ventascanalesAux.setacumulado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							ventascanalesAux.settipo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVentasCanales(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVentasCanalesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVentasCanales(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVentasCanales=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVentasCanales.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVentasCanales.jComboBoxTiposAccionesFormularioVentasCanales.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVentasCanales) {				
					conSplash=true;//false;										
					
					//this.startProcessVentasCanales(conSplash);
				
					this.generarReporteVentasCanalessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasCanales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasCanales.jComboBoxTiposAccionesFormularioVentasCanales.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVentasCanalessSeleccionados();
				//this.jComboBoxTiposAccionesVentasCanales.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentasCanalessSeleccionados(false);
				//this.jComboBoxTiposAccionesVentasCanales.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentasCanalessSeleccionados(true);
				//this.jComboBoxTiposAccionesVentasCanales.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentasCanales();
				
				this.exportarVentasCanalessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasCanales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasCanales.jComboBoxTiposAccionesFormularioVentasCanales.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVentasCanaless();
				//this.importarVentasCanaless();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasCanales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasCanales.jComboBoxTiposAccionesFormularioVentasCanales.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentasCanales();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVentasCanalessSeleccionados();
				//this.jComboBoxTiposAccionesVentasCanales.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Ventas Canales", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVentasCanales();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVentasCanales)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVentasCanales(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Ventas Canales",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasCanales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasCanales.jComboBoxTiposAccionesFormularioVentasCanales.setSelectedIndex(0);					
				}	
			} 			
			else if(VentasCanalesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVentasCanales) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVentasCanales(conSplash);
					
						//this.actualizarParametrosGeneralVentasCanales();
						
						this.generarReporteProcesoAccionVentasCanalessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVentasCanales.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVentasCanales.jComboBoxTiposAccionesFormularioVentasCanales.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VentasCanalesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Ventas CanalesES SELECCIONADOS?", "MANTENIMIENTO DE Ventas Canales", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVentasCanales();
				
						this.actualizarParametrosGeneralVentasCanales();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ventascanalesReturnGeneral=ventascanalesLogic.procesarAccionVentasCanalessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ventascanalesLogic.getVentasCanaless(),this.ventascanalesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVentasCanalesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentasCanales.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentasCanales.jComboBoxTiposAccionesFormularioVentasCanales.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVentasCanales();
					
					VentasCanalesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVentasCanalesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentasCanales.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentasCanales.jComboBoxTiposAccionesFormularioVentasCanales.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVentasCanales(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVentasCanalesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVentasCanales();
			
			if(this.jInternalFrameDetalleFormVentasCanales==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<VentasCanales> ventascanalessSeleccionados=new ArrayList<VentasCanales>();		
			VentasCanales ventascanales=new VentasCanales();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVentasCanales(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVentasCanales.getSelectedItem();
			
			
			
			
			ventascanalessSeleccionados=this.getVentasCanalessSeleccionados(true);
			//this.sTipoAccion;
			
			if(ventascanalessSeleccionados.size()==1) {
				for(VentasCanales ventascanalesAux:ventascanalessSeleccionados) {
					ventascanales=ventascanalesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVentasCanales();
			
      		//this.finishProcessVentasCanales(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVentasCanalesReturnGeneral() throws Exception {
		if(this.ventascanalesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ventascanalesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ventascanalesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ventascanalesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ventascanalesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ventascanalesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVentasCanales(false);
		}
		
		if(this.ventascanalesReturnGeneral.getConRetornoLista() || this.ventascanalesReturnGeneral.getConRetornoObjeto()) {
			if(this.ventascanalesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ventascanalesLogic.setVentasCanaless(this.ventascanalesReturnGeneral.getVentasCanaless());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingVentasCanales(false);
		}
	}
	
	public void actualizarParametrosGeneralVentasCanales() throws Exception {
		
		
	}
	
	public ArrayList<VentasCanales> getVentasCanalessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VentasCanales> ventascanalessSeleccionados=new ArrayList<VentasCanales>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVentasCanales) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(VentasCanales ventascanalesAux:ventascanalesLogic.getVentasCanaless()) {
					if(ventascanalesAux.getIsSelected()) {
						ventascanalessSeleccionados.add(ventascanalesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasCanales ventascanalesAux:this.ventascanaless) {
					if(ventascanalesAux.getIsSelected()) {
						ventascanalessSeleccionados.add(ventascanalesAux);				
					}
				}
			}
			
			if(ventascanalessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ventascanalessSeleccionados.addAll(this.ventascanalesLogic.getVentasCanaless());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ventascanalessSeleccionados.addAll(this.ventascanaless);				
					}
				}
			}
		} else {
			ventascanalessSeleccionados.add(this.ventascanales);
		}
		
		return ventascanalessSeleccionados;
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
	
	public void generarReporteVentasCanalessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVentasCanalessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVentasCanalessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentasCanalessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentasCanalessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Ventas Canales",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVentasCanalessSeleccionados() throws Exception {
		ArrayList<VentasCanales> ventascanalessSeleccionados=new ArrayList<VentasCanales>();		
		
		ventascanalessSeleccionados=this.getVentasCanalessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVentasCanaless("Todos",ventascanalessSeleccionados);
		
	}	
	
	public void generarReporteNormalVentasCanalessSeleccionados() throws Exception {
		ArrayList<VentasCanales> ventascanalessSeleccionados=new ArrayList<VentasCanales>();		
		
		ventascanalessSeleccionados=this.getVentasCanalessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVentasCanaless("Todos",ventascanalessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVentasCanalessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VentasCanales> ventascanalessSeleccionados=new ArrayList<VentasCanales>();
		
		ventascanalessSeleccionados=this.getVentasCanalessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVentasCanaless("Todos",ventascanalessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVentasCanalessSeleccionados() throws Exception {
		ArrayList<VentasCanales> ventascanalessSeleccionados=new ArrayList<VentasCanales>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVentasCanales();
		
		
		ventascanalessSeleccionados=this.getVentasCanalessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVentasCanales();
		
		
		//this.generarReporteVentasCanaless("Todos",ventascanalessSeleccionados ,ventascanalesImplementable,ventascanalesImplementableHome);
	}
	
	public void mostrarImportacionVentasCanaless() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVentasCanales();
		
		this.abrirFrameImportacionVentasCanales();		
		
			
		//this.generarReporteVentasCanaless("Todos",ventascanalessSeleccionados ,ventascanalesImplementable,ventascanalesImplementableHome);
	}
	
	public void importarVentasCanaless() throws Exception {		
	
	}
	
	public void exportarVentasCanalessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVentasCanalessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVentasCanalessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVentasCanalessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Ventas Canales",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVentasCanalessSeleccionados() throws Exception {
		ArrayList<VentasCanales> ventascanalessSeleccionados=new ArrayList<VentasCanales>();		
		
		ventascanalessSeleccionados=this.getVentasCanalessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventascanales."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVentasCanales(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(VentasCanales ventascanalesAux:ventascanalessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVentasCanales(ventascanalesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ventascanalesAux.setsDetalleGeneralEntityReporte(ventascanalesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventascanalesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Canales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVentasCanales(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VentasCanalesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCanalesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCanalesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCanalesConstantesFunciones.LABEL_IDTITULOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCanalesConstantesFunciones.LABEL_MONTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCanalesConstantesFunciones.LABEL_NOTASCREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCanalesConstantesFunciones.LABEL_VENTANETA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCanalesConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCanalesConstantesFunciones.LABEL_ACUMULADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasCanalesConstantesFunciones.LABEL_TIPO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVentasCanales(VentasCanales ventascanales,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ventascanales.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascanales.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascanales.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascanales.gettitulocliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascanales.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascanales.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascanales.getnombre_titulo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascanales.getmonto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascanales.getcodigo_titulo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascanales.getnotas_credito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascanales.getventa_neta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascanales.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascanales.getacumulado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventascanales.gettipo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVentasCanalessSeleccionados() throws Exception {
		ArrayList<VentasCanales> ventascanalessSeleccionados=new ArrayList<VentasCanales>();		
		
		ventascanalessSeleccionados=this.getVentasCanalessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventascanales.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("VentasCanaless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVentasCanales(row);				
				iRow++;
			}				
			
			for(VentasCanales ventascanalesAux:ventascanalessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVentasCanales(ventascanalesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventascanalesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Canales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVentasCanalessSeleccionados() throws Exception {
		ArrayList<VentasCanales> ventascanalessSeleccionados=new ArrayList<VentasCanales>();		
		
		ventascanalessSeleccionados=this.getVentasCanalessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventascanales.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ventascanaless");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ventascanales");
			//elementRoot.appendChild(element);
		
			for(VentasCanales ventascanalesAux:ventascanalessSeleccionados) {
				element = document.createElement("ventascanales");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVentasCanales(ventascanalesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventascanalesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Canales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVentasCanales(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_IDTITULOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_MONTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_NOTASCREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_VENTANETA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_ACUMULADO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasCanalesConstantesFunciones.LABEL_TIPO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVentasCanales(VentasCanales ventascanales,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ventascanales.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascanales.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascanales.gettitulocliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascanales.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascanales.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascanales.getnombre_titulo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascanales.getmonto());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascanales.getcodigo_titulo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascanales.getnotas_credito());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascanales.getventa_neta());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascanales.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascanales.getacumulado());
		cell = row.createCell(iColumn++);cell.setCellValue(ventascanales.gettipo());				
	}
	
	public void setFilaDatosExportarXmlVentasCanales(VentasCanales ventascanales,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VentasCanalesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ventascanales.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VentasCanalesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ventascanales.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VentasCanalesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(ventascanales.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtitulocliente_descripcion = document.createElement(VentasCanalesConstantesFunciones.IDTITULOCLIENTE);
		elementtitulocliente_descripcion.appendChild(document.createTextNode(ventascanales.gettitulocliente_descripcion()));
		element.appendChild(elementtitulocliente_descripcion);

		Element elementfecha_emision_desde = document.createElement(VentasCanalesConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(ventascanales.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(VentasCanalesConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(ventascanales.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_titulo_cliente = document.createElement(VentasCanalesConstantesFunciones.NOMBRETITULOCLIENTE);
		elementnombre_titulo_cliente.appendChild(document.createTextNode(ventascanales.getnombre_titulo_cliente().trim()));
		element.appendChild(elementnombre_titulo_cliente);

		Element elementmonto = document.createElement(VentasCanalesConstantesFunciones.MONTO);
		elementmonto.appendChild(document.createTextNode(ventascanales.getmonto().toString().trim()));
		element.appendChild(elementmonto);

		Element elementcodigo_titulo_cliente = document.createElement(VentasCanalesConstantesFunciones.CODIGOTITULOCLIENTE);
		elementcodigo_titulo_cliente.appendChild(document.createTextNode(ventascanales.getcodigo_titulo_cliente().trim()));
		element.appendChild(elementcodigo_titulo_cliente);

		Element elementnotas_credito = document.createElement(VentasCanalesConstantesFunciones.NOTASCREDITO);
		elementnotas_credito.appendChild(document.createTextNode(ventascanales.getnotas_credito().toString().trim()));
		element.appendChild(elementnotas_credito);

		Element elementventa_neta = document.createElement(VentasCanalesConstantesFunciones.VENTANETA);
		elementventa_neta.appendChild(document.createTextNode(ventascanales.getventa_neta().toString().trim()));
		element.appendChild(elementventa_neta);

		Element elementporcentaje = document.createElement(VentasCanalesConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(ventascanales.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementacumulado = document.createElement(VentasCanalesConstantesFunciones.ACUMULADO);
		elementacumulado.appendChild(document.createTextNode(ventascanales.getacumulado().toString().trim()));
		element.appendChild(elementacumulado);

		Element elementtipo = document.createElement(VentasCanalesConstantesFunciones.TIPO);
		elementtipo.appendChild(document.createTextNode(ventascanales.gettipo().trim()));
		element.appendChild(elementtipo);
	}
	
	public void generarReporteGroupGenericoVentasCanalessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<VentasCanales> ventascanalessSeleccionados=new ArrayList<VentasCanales>();
		
		ventascanalessSeleccionados=this.getVentasCanalessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoVentasCanales(ventascanalessSeleccionados);
		
		this.generarReporteVentasCanaless("Todos",ventascanalessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVentasCanales(ArrayList<VentasCanales> ventascanalessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VentasCanales ventascanalesAux:ventascanalessSeleccionados) {
				ventascanalesAux.setsDetalleGeneralEntityReporte(ventascanalesAux.toString());
			
				if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					ventascanalesAux.setsDescripcionGeneralEntityReporte1(ventascanalesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_IDTITULOCLIENTE)) {
					existe=true;
					ventascanalesAux.setsDescripcionGeneralEntityReporte1(ventascanalesAux.gettitulocliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					ventascanalesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventascanalesAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					ventascanalesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventascanalesAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_NOMBRETITULOCLIENTE)) {
					existe=true;
					ventascanalesAux.setsDescripcionGeneralEntityReporte1(ventascanalesAux.getnombre_titulo_cliente());
				}
				 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_CODIGOTITULOCLIENTE)) {
					existe=true;
					ventascanalesAux.setsDescripcionGeneralEntityReporte1(ventascanalesAux.getcodigo_titulo_cliente());
				}
				 else if(sTipoSeleccionar.equals(VentasCanalesConstantesFunciones.LABEL_TIPO)) {
					existe=true;
					ventascanalesAux.setsDescripcionGeneralEntityReporte1(ventascanalesAux.gettipo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasCanalesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVentasCanales(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVentasCanales=true;
				this.isVisibilidadCeldaNuevoRelacionesVentasCanales=true;
				this.isVisibilidadCeldaGuardarCambiosVentasCanales=true;
			}
			
			this.isVisibilidadCeldaModificarVentasCanales=false;
			this.isVisibilidadCeldaActualizarVentasCanales=false;
			this.isVisibilidadCeldaEliminarVentasCanales=false;
			this.isVisibilidadCeldaCancelarVentasCanales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasCanales=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasCanales=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVentasCanales=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasCanales=false;
			this.isVisibilidadCeldaGuardarCambiosVentasCanales=false;
			this.isVisibilidadCeldaModificarVentasCanales=false;
			this.isVisibilidadCeldaActualizarVentasCanales=true;
			this.isVisibilidadCeldaEliminarVentasCanales=false;
			this.isVisibilidadCeldaCancelarVentasCanales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasCanales=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasCanales=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVentasCanales=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasCanales=false;
			this.isVisibilidadCeldaGuardarCambiosVentasCanales=false;
			this.isVisibilidadCeldaModificarVentasCanales=false;
			this.isVisibilidadCeldaActualizarVentasCanales=true;
			this.isVisibilidadCeldaEliminarVentasCanales=true;
			this.isVisibilidadCeldaCancelarVentasCanales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasCanales=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasCanales=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVentasCanales=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasCanales=false;
			this.isVisibilidadCeldaGuardarCambiosVentasCanales=false;
			this.isVisibilidadCeldaModificarVentasCanales=false;
			this.isVisibilidadCeldaActualizarVentasCanales=true;
			this.isVisibilidadCeldaEliminarVentasCanales=false;
			this.isVisibilidadCeldaCancelarVentasCanales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasCanales=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasCanales=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVentasCanales=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasCanales=true;
			this.isVisibilidadCeldaGuardarCambiosVentasCanales=true;
			this.isVisibilidadCeldaModificarVentasCanales=false;
			this.isVisibilidadCeldaActualizarVentasCanales=false;
			this.isVisibilidadCeldaEliminarVentasCanales=false;
			this.isVisibilidadCeldaCancelarVentasCanales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasCanales=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasCanales=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVentasCanales=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasCanales=false;
			this.isVisibilidadCeldaGuardarCambiosVentasCanales=false;
			this.isVisibilidadCeldaActualizarVentasCanales=false;
			this.isVisibilidadCeldaEliminarVentasCanales=false;
			this.isVisibilidadCeldaCancelarVentasCanales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasCanales=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasCanales=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVentasCanales=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasCanales=false;
			this.isVisibilidadCeldaGuardarCambiosVentasCanales=false;
			this.isVisibilidadCeldaModificarVentasCanales=true;
			this.isVisibilidadCeldaActualizarVentasCanales=false;
			this.isVisibilidadCeldaEliminarVentasCanales=false;
			this.isVisibilidadCeldaCancelarVentasCanales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasCanales=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasCanales=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VentasCanalesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVentasCanales=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasCanales=true;
			this.isVisibilidadCeldaGuardarCambiosVentasCanales=true;
		} else {
			this.actualizarEstadoPanelsVentasCanales(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVentasCanales=false;
			//this.isVisibilidadCeldaVerFormVentasCanales=false;
			this.isVisibilidadCeldaDuplicarVentasCanales=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ventascanalesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVentasCanales=false;
		} else {
			this.isVisibilidadCeldaNuevoVentasCanales=false;
			this.isVisibilidadCeldaGuardarCambiosVentasCanales=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ventascanalesSessionBean.getEsGuardarRelacionado()) {
			if(!ventascanalesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVentasCanales=false;												
			}
			
			this.jButtonCerrarVentasCanales.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVentasCanales=false;
		}
		
		if(!this.permiteMantenimiento(this.ventascanales)) {
			this.isVisibilidadCeldaActualizarVentasCanales=false;
			this.isVisibilidadCeldaEliminarVentasCanales=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoVentasCanales=false;
		this.isVisibilidadCeldaNuevoRelacionesVentasCanales=false;
		this.isVisibilidadCeldaGuardarCambiosVentasCanales=false;
		//this.isVisibilidadCeldaModificarVentasCanales=true;
		this.isVisibilidadCeldaActualizarVentasCanales=false;
		this.isVisibilidadCeldaEliminarVentasCanales=false;
		//this.isVisibilidadCeldaCancelarVentasCanales=true;			
		this.isVisibilidadCeldaGuardarVentasCanales=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVentasCanales() {
	}
	
	public void actualizarEstadoPanelsVentasCanales(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVentasCanales!=null) {
				this.jScrollPanelDatosEdicionVentasCanales.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasCanales!=null) {
				this.jTabbedPaneBusquedasVentasCanales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasCanales!=null) {
				this.jScrollPanelDatosVentasCanales.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasCanales!=null) {
				this.jPanelPaginacionVentasCanales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasCanales!=null) {
				this.jPanelParametrosReportesVentasCanales.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVentasCanales!=null) {
				this.jScrollPanelDatosEdicionVentasCanales.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasCanales!=null) {
				this.jTabbedPaneBusquedasVentasCanales.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVentasCanales!=null) {
				this.jScrollPanelDatosVentasCanales.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasCanales!=null) {
				this.jPanelPaginacionVentasCanales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasCanales!=null) {
				this.jPanelParametrosReportesVentasCanales.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVentasCanales!=null) {
				this.jScrollPanelDatosEdicionVentasCanales.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasCanales!=null) {
				this.jTabbedPaneBusquedasVentasCanales.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentasCanales!=null) {
				this.jScrollPanelDatosVentasCanales.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasCanales!=null) {
				this.jPanelPaginacionVentasCanales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasCanales!=null) {
				this.jPanelParametrosReportesVentasCanales.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVentasCanales!=null) {
				this.jScrollPanelDatosEdicionVentasCanales.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasCanales!=null) {
				this.jTabbedPaneBusquedasVentasCanales.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentasCanales!=null) {
				this.jScrollPanelDatosVentasCanales.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasCanales!=null) {
				this.jPanelPaginacionVentasCanales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasCanales!=null) {
				this.jPanelParametrosReportesVentasCanales.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVentasCanales!=null) {
				this.jScrollPanelDatosEdicionVentasCanales.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasCanales!=null) {
				this.jTabbedPaneBusquedasVentasCanales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasCanales!=null) {
				this.jScrollPanelDatosVentasCanales.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasCanales!=null) {
				this.jPanelPaginacionVentasCanales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasCanales!=null) {
				this.jPanelParametrosReportesVentasCanales.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVentasCanales!=null) {
				this.jScrollPanelDatosEdicionVentasCanales.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasCanales!=null) {
				this.jTabbedPaneBusquedasVentasCanales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasCanales!=null) {
				this.jScrollPanelDatosVentasCanales.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasCanales!=null) {
				this.jPanelPaginacionVentasCanales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasCanales!=null) {
				this.jPanelParametrosReportesVentasCanales.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVentasCanales!=null) {
				this.jScrollPanelDatosEdicionVentasCanales.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasCanales!=null) {
				this.jTabbedPaneBusquedasVentasCanales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasCanales!=null) {
				this.jScrollPanelDatosVentasCanales.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasCanales!=null) {
				this.jPanelPaginacionVentasCanales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasCanales!=null) {
				this.jPanelParametrosReportesVentasCanales.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVentasCanales!=null) {
					this.jTabbedPaneBusquedasVentasCanales.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVentasCanales!=null) {
				this.jPanelParametrosReportesVentasCanales.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasCanales!=null) {
				this.jTabbedPaneBusquedasVentasCanales.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVentasCanales!=null) {
				this.jPanelParametrosReportesVentasCanales.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaVentasCanales=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaVentasCanales) {this.jTabbedPaneBusquedasVentasCanales.remove(jPanelBusquedaVentasCanalesVentasCanales);}
		}
		
	}

	public void setVisibilidadBusquedasParaTituloCliente(Boolean isParaTituloCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTituloClienteNegation=!isParaTituloCliente;

			this.isVisibilidadBusquedaVentasCanales=isParaTituloCliente;
			if(!this.isVisibilidadBusquedaVentasCanales) {this.jTabbedPaneBusquedasVentasCanales.remove(jPanelBusquedaVentasCanalesVentasCanales);}
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
			
			this.inicializarActualizarBindingTablaVentasCanales(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVentasCanales() {
		this.updateBorderResaltarBusquedasFormularioVentasCanales();
		this.updateVisibilidadBusquedasFormularioVentasCanales();
		this.updateHabilitarBusquedasFormularioVentasCanales();
	}
	
	public void updateBorderResaltarBusquedasFormularioVentasCanales() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVentasCanales.getComponents().length>0) {
	

		if(this.ventascanalesConstantesFunciones.resaltarBusquedaVentasCanalesVentasCanales!=null) {
			index= this.jTabbedPaneBusquedasVentasCanales.indexOfComponent(this.jPanelBusquedaVentasCanalesVentasCanales);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentasCanales.getComponent(index);
				jPanel.setBorder(this.ventascanalesConstantesFunciones.resaltarBusquedaVentasCanalesVentasCanales);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVentasCanales() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVentasCanales.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentasCanales.indexOfComponent(this.jPanelBusquedaVentasCanalesVentasCanales);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVentasCanales.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ventascanalesConstantesFunciones.mostrarBusquedaVentasCanalesVentasCanales);
			if(!this.ventascanalesConstantesFunciones.mostrarBusquedaVentasCanalesVentasCanales && index>-1) {
				this.jTabbedPaneBusquedasVentasCanales.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVentasCanales() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVentasCanales.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentasCanales.indexOfComponent(this.jPanelBusquedaVentasCanalesVentasCanales);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVentasCanales.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ventascanalesConstantesFunciones.activarBusquedaVentasCanalesVentasCanales);
				this.jTabbedPaneBusquedasVentasCanales.setEnabledAt(index,this.ventascanalesConstantesFunciones.activarBusquedaVentasCanalesVentasCanales);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVentasCanales(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaVentasCanales")) {
			index= this.jTabbedPaneBusquedasVentasCanales.indexOfComponent(this.jPanelBusquedaVentasCanalesVentasCanales);

			this.jTabbedPaneBusquedasVentasCanales.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentasCanales.getComponent(index);

			this.ventascanalesConstantesFunciones.setResaltarBusquedaVentasCanalesVentasCanales(resaltar);

			jPanel.setBorder(this.ventascanalesConstantesFunciones.resaltarBusquedaVentasCanalesVentasCanales);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVentasCanales.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioVentasCanales() throws Exception {

		if(this.jInternalFrameDetalleFormVentasCanales==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVentasCanales();
		this.updateVisibilidadResaltarControlesFormularioVentasCanales();
		this.updateHabilitarResaltarControlesFormularioVentasCanales();
		
	}
	
	public void updateBorderResaltarControlesFormularioVentasCanales() throws Exception {
		if(this.jInternalFrameDetalleFormVentasCanales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ventascanalesConstantesFunciones.resaltaridVentasCanales!=null && this.jInternalFrameDetalleFormVentasCanales!=null) {this.jInternalFrameDetalleFormVentasCanales.jLabelidVentasCanales.setBorder(this.ventascanalesConstantesFunciones.resaltaridVentasCanales);}
		if(this.ventascanalesConstantesFunciones.resaltarid_empresaVentasCanales!=null && this.jInternalFrameDetalleFormVentasCanales!=null) {this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_empresaVentasCanales.setBorder(this.ventascanalesConstantesFunciones.resaltarid_empresaVentasCanales);}
		if(this.ventascanalesConstantesFunciones.resaltarid_titulo_clienteVentasCanales!=null && this.jInternalFrameDetalleFormVentasCanales!=null) {this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_titulo_clienteVentasCanales.setBorder(this.ventascanalesConstantesFunciones.resaltarid_titulo_clienteVentasCanales);}
		if(this.ventascanalesConstantesFunciones.resaltarfecha_emision_desdeVentasCanales!=null && this.jInternalFrameDetalleFormVentasCanales!=null) {this.jInternalFrameDetalleFormVentasCanales.jDateChooserfecha_emision_desdeVentasCanales.setBorder(this.ventascanalesConstantesFunciones.resaltarfecha_emision_desdeVentasCanales);}
		if(this.ventascanalesConstantesFunciones.resaltarfecha_emision_hastaVentasCanales!=null && this.jInternalFrameDetalleFormVentasCanales!=null) {this.jInternalFrameDetalleFormVentasCanales.jDateChooserfecha_emision_hastaVentasCanales.setBorder(this.ventascanalesConstantesFunciones.resaltarfecha_emision_hastaVentasCanales);}
		if(this.ventascanalesConstantesFunciones.resaltarnombre_titulo_clienteVentasCanales!=null && this.jInternalFrameDetalleFormVentasCanales!=null) {this.jInternalFrameDetalleFormVentasCanales.jTextAreanombre_titulo_clienteVentasCanales.setBorder(this.ventascanalesConstantesFunciones.resaltarnombre_titulo_clienteVentasCanales);}
		if(this.ventascanalesConstantesFunciones.resaltarmontoVentasCanales!=null && this.jInternalFrameDetalleFormVentasCanales!=null) {this.jInternalFrameDetalleFormVentasCanales.jTextFieldmontoVentasCanales.setBorder(this.ventascanalesConstantesFunciones.resaltarmontoVentasCanales);}
		if(this.ventascanalesConstantesFunciones.resaltarcodigo_titulo_clienteVentasCanales!=null && this.jInternalFrameDetalleFormVentasCanales!=null) {this.jInternalFrameDetalleFormVentasCanales.jTextFieldcodigo_titulo_clienteVentasCanales.setBorder(this.ventascanalesConstantesFunciones.resaltarcodigo_titulo_clienteVentasCanales);}
		if(this.ventascanalesConstantesFunciones.resaltarnotas_creditoVentasCanales!=null && this.jInternalFrameDetalleFormVentasCanales!=null) {this.jInternalFrameDetalleFormVentasCanales.jTextFieldnotas_creditoVentasCanales.setBorder(this.ventascanalesConstantesFunciones.resaltarnotas_creditoVentasCanales);}
		if(this.ventascanalesConstantesFunciones.resaltarventa_netaVentasCanales!=null && this.jInternalFrameDetalleFormVentasCanales!=null) {this.jInternalFrameDetalleFormVentasCanales.jTextFieldventa_netaVentasCanales.setBorder(this.ventascanalesConstantesFunciones.resaltarventa_netaVentasCanales);}
		if(this.ventascanalesConstantesFunciones.resaltarporcentajeVentasCanales!=null && this.jInternalFrameDetalleFormVentasCanales!=null) {this.jInternalFrameDetalleFormVentasCanales.jTextFieldporcentajeVentasCanales.setBorder(this.ventascanalesConstantesFunciones.resaltarporcentajeVentasCanales);}
		if(this.ventascanalesConstantesFunciones.resaltaracumuladoVentasCanales!=null && this.jInternalFrameDetalleFormVentasCanales!=null) {this.jInternalFrameDetalleFormVentasCanales.jTextFieldacumuladoVentasCanales.setBorder(this.ventascanalesConstantesFunciones.resaltaracumuladoVentasCanales);}
		if(this.ventascanalesConstantesFunciones.resaltartipoVentasCanales!=null && this.jInternalFrameDetalleFormVentasCanales!=null) {this.jInternalFrameDetalleFormVentasCanales.jTextFieldtipoVentasCanales.setBorder(this.ventascanalesConstantesFunciones.resaltartipoVentasCanales);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVentasCanales() throws Exception {		
		if(this.jInternalFrameDetalleFormVentasCanales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) {
	
		//this.jInternalFrameDetalleFormVentasCanales.jLabelidVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostraridVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jPanelidVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostraridVentasCanales);
		//this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_empresaVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarid_empresaVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jPanelid_empresaVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarid_empresaVentasCanales);
		//this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_titulo_clienteVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarid_titulo_clienteVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jPanelid_titulo_clienteVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarid_titulo_clienteVentasCanales);
		//this.jInternalFrameDetalleFormVentasCanales.jDateChooserfecha_emision_desdeVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarfecha_emision_desdeVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jPanelfecha_emision_desdeVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarfecha_emision_desdeVentasCanales);
		//this.jInternalFrameDetalleFormVentasCanales.jDateChooserfecha_emision_hastaVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarfecha_emision_hastaVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jPanelfecha_emision_hastaVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarfecha_emision_hastaVentasCanales);
		//this.jInternalFrameDetalleFormVentasCanales.jTextAreanombre_titulo_clienteVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarnombre_titulo_clienteVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jPanelnombre_titulo_clienteVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarnombre_titulo_clienteVentasCanales);
		//this.jInternalFrameDetalleFormVentasCanales.jTextFieldmontoVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarmontoVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jPanelmontoVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarmontoVentasCanales);
		//this.jInternalFrameDetalleFormVentasCanales.jTextFieldcodigo_titulo_clienteVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarcodigo_titulo_clienteVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jPanelcodigo_titulo_clienteVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarcodigo_titulo_clienteVentasCanales);
		//this.jInternalFrameDetalleFormVentasCanales.jTextFieldnotas_creditoVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarnotas_creditoVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jPanelnotas_creditoVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarnotas_creditoVentasCanales);
		//this.jInternalFrameDetalleFormVentasCanales.jTextFieldventa_netaVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarventa_netaVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jPanelventa_netaVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarventa_netaVentasCanales);
		//this.jInternalFrameDetalleFormVentasCanales.jTextFieldporcentajeVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarporcentajeVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jPanelporcentajeVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrarporcentajeVentasCanales);
		//this.jInternalFrameDetalleFormVentasCanales.jTextFieldacumuladoVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostraracumuladoVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jPanelacumuladoVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostraracumuladoVentasCanales);
		//this.jInternalFrameDetalleFormVentasCanales.jTextFieldtipoVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrartipoVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jPaneltipoVentasCanales.setVisible(this.ventascanalesConstantesFunciones.mostrartipoVentasCanales);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVentasCanales() throws Exception {
		if(this.jInternalFrameDetalleFormVentasCanales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentasCanales!=null) {
	
		this.jInternalFrameDetalleFormVentasCanales.jLabelidVentasCanales.setEnabled(this.ventascanalesConstantesFunciones.activaridVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_empresaVentasCanales.setEnabled(this.ventascanalesConstantesFunciones.activarid_empresaVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jComboBoxid_titulo_clienteVentasCanales.setEnabled(this.ventascanalesConstantesFunciones.activarid_titulo_clienteVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jDateChooserfecha_emision_desdeVentasCanales.setEnabled(this.ventascanalesConstantesFunciones.activarfecha_emision_desdeVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jDateChooserfecha_emision_hastaVentasCanales.setEnabled(this.ventascanalesConstantesFunciones.activarfecha_emision_hastaVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jTextAreanombre_titulo_clienteVentasCanales.setEnabled(this.ventascanalesConstantesFunciones.activarnombre_titulo_clienteVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jTextFieldmontoVentasCanales.setEnabled(this.ventascanalesConstantesFunciones.activarmontoVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jTextFieldcodigo_titulo_clienteVentasCanales.setEnabled(this.ventascanalesConstantesFunciones.activarcodigo_titulo_clienteVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jTextFieldnotas_creditoVentasCanales.setEnabled(this.ventascanalesConstantesFunciones.activarnotas_creditoVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jTextFieldventa_netaVentasCanales.setEnabled(this.ventascanalesConstantesFunciones.activarventa_netaVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jTextFieldporcentajeVentasCanales.setEnabled(this.ventascanalesConstantesFunciones.activarporcentajeVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jTextFieldacumuladoVentasCanales.setEnabled(this.ventascanalesConstantesFunciones.activaracumuladoVentasCanales);
		this.jInternalFrameDetalleFormVentasCanales.jTextFieldtipoVentasCanales.setEnabled(this.ventascanalesConstantesFunciones.activartipoVentasCanales);
		}
	}
	
		
}