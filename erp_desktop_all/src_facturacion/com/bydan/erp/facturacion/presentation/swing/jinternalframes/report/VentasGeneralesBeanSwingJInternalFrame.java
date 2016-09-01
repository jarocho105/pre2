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

//import com.bydan.erp.facturacion.util.VentasGeneralesConstantesFunciones;
import com.bydan.erp.facturacion.util.report.VentasGeneralesParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.VentasGeneralesParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.VentasGeneralesBean;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class VentasGeneralesBeanSwingJInternalFrame extends VentasGeneralesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VentasGeneralesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<VentasGenerales> ventasgeneralesValidator = new ClassValidator<VentasGenerales>(VentasGenerales.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public VentasGenerales ventasgenerales;	
	public VentasGenerales ventasgeneralesAux;
	public VentasGenerales ventasgeneralesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public VentasGenerales ventasgeneralesTotales;
	public Long idVentasGeneralesActual;
	public Long iIdNuevoVentasGenerales=0L;
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
	
	public Boolean isPermisoTodoVentasGenerales;
	public Boolean isPermisoNuevoVentasGenerales;
	public Boolean isPermisoActualizarVentasGenerales;
	public Boolean isPermisoActualizarOriginalVentasGenerales;
	public Boolean isPermisoEliminarVentasGenerales;
	public Boolean isPermisoGuardarCambiosVentasGenerales;
	public Boolean isPermisoConsultaVentasGenerales;
	public Boolean isPermisoBusquedaVentasGenerales;
	public Boolean isPermisoReporteVentasGenerales;
	public Boolean isPermisoPaginacionMedioVentasGenerales;
	public Boolean isPermisoPaginacionAltoVentasGenerales;
	public Boolean isPermisoPaginacionTodoVentasGenerales;
	public Boolean isPermisoCopiarVentasGenerales;
	public Boolean isPermisoVerFormVentasGenerales;
	public Boolean isPermisoDuplicarVentasGenerales;
	public Boolean isPermisoOrdenVentasGenerales;
	
	
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
	
	public VentasGeneralesParameterReturnGeneral ventasgeneralesReturnGeneral;
	public VentasGeneralesParameterReturnGeneral ventasgeneralesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVentasGenerales=false;
	public Boolean esParaAccionDesdeFormularioVentasGenerales=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VentasGeneralesSessionBeanAdditional ventasgeneralesSessionBeanAdditional=null;
	
	public VentasGeneralesSessionBeanAdditional getVentasGeneralesSessionBeanAdditional() {
		return this.ventasgeneralesSessionBeanAdditional;
	}
	
	public void setVentasGeneralesSessionBeanAdditional(VentasGeneralesSessionBeanAdditional ventasgeneralesSessionBeanAdditional) {
		try {
			this.ventasgeneralesSessionBeanAdditional=ventasgeneralesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VentasGeneralesBeanSwingJInternalFrameAdditional ventasgeneralesBeanSwingJInternalFrameAdditional=null;
	//public class VentasGeneralesBeanSwingJInternalFrame
	
	public VentasGeneralesBeanSwingJInternalFrameAdditional getVentasGeneralesBeanSwingJInternalFrameAdditional() {
		return this.ventasgeneralesBeanSwingJInternalFrameAdditional;
	}
	
	public void setVentasGeneralesBeanSwingJInternalFrameAdditional(VentasGeneralesBeanSwingJInternalFrameAdditional ventasgeneralesBeanSwingJInternalFrameAdditional) {
		try {
			this.ventasgeneralesBeanSwingJInternalFrameAdditional=ventasgeneralesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VentasGeneralesLogic ventasgeneralesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public VentasGenerales ventasgeneralesBean;
	public VentasGeneralesConstantesFunciones ventasgeneralesConstantesFunciones;
	//public VentasGeneralesParameterReturnGeneral ventasgeneralesReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<VentasGenerales> ventasgeneraless;	
	//public List<VentasGenerales> ventasgeneralessEliminados;
	//public List<VentasGenerales> ventasgeneralessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVentasGenerales=false;
	public Boolean isVisibilidadCeldaDuplicarVentasGenerales=true;
	public Boolean isVisibilidadCeldaCopiarVentasGenerales=true;
	public Boolean isVisibilidadCeldaVerFormVentasGenerales=true;
	public Boolean isVisibilidadCeldaOrdenVentasGenerales=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVentasGenerales=false;
	public Boolean isVisibilidadCeldaModificarVentasGenerales=false;
	public Boolean isVisibilidadCeldaActualizarVentasGenerales=false;
	public Boolean isVisibilidadCeldaEliminarVentasGenerales=false;
	public Boolean isVisibilidadCeldaCancelarVentasGenerales=false;
	public Boolean isVisibilidadCeldaGuardarVentasGenerales=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVentasGenerales=false;	
	
	
	public Boolean isVisibilidadBusquedaVentasGenerales=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoVentasGenerales() {
		return this.iIdNuevoVentasGenerales;
	}

	public void setiIdNuevoVentasGenerales(Long iIdNuevoVentasGenerales) {
		this.iIdNuevoVentasGenerales = iIdNuevoVentasGenerales;
	}
	
	public Long getidVentasGeneralesActual() {
		return this.idVentasGeneralesActual;
	}

	public void setidVentasGeneralesActual(Long idVentasGeneralesActual) {
		this.idVentasGeneralesActual = idVentasGeneralesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public VentasGenerales getventasgenerales() {
		return this.ventasgenerales;
	}

	public void setventasgenerales(VentasGenerales ventasgenerales) {
		this.ventasgenerales = ventasgenerales;
	}
	
	public VentasGenerales getventasgeneralesAux() {
		return this.ventasgeneralesAux;
	}

	public void setventasgeneralesAux(VentasGenerales ventasgeneralesAux) {
		this.ventasgeneralesAux = ventasgeneralesAux;
	}				
	
	public VentasGenerales getventasgeneralesAnterior() {
		return this.ventasgeneralesAnterior;
	}

	public void setventasgeneralesAnterior(VentasGenerales ventasgeneralesAnterior) {
		this.ventasgeneralesAnterior = ventasgeneralesAnterior;
	}	
	
	public VentasGenerales getventasgeneralesTotales() {
		return this.ventasgeneralesTotales;
	}

	public void setventasgeneralesTotales(VentasGenerales ventasgeneralesTotales) {
		this.ventasgeneralesTotales = ventasgeneralesTotales;
	}	
	
	public VentasGenerales getventasgeneralesBean() {
		return this.ventasgeneralesBean;
	}

	public void setventasgeneralesBean(VentasGenerales ventasgeneralesBean) {
		this.ventasgeneralesBean = ventasgeneralesBean;
	}	
	
	public VentasGeneralesParameterReturnGeneral getventasgeneralesReturnGeneral() {
		return this.ventasgeneralesReturnGeneral;
	}

	public void setventasgeneralesReturnGeneral(VentasGeneralesParameterReturnGeneral ventasgeneralesReturnGeneral) {
		this.ventasgeneralesReturnGeneral = ventasgeneralesReturnGeneral;
	}	
	
	
	public Date fecha_emision_desdeBusquedaVentasGenerales=new Date();

	public Date getfecha_emision_desdeBusquedaVentasGenerales() {
		return this.fecha_emision_desdeBusquedaVentasGenerales;
	}

	public void setfecha_emision_desdeBusquedaVentasGenerales(Date fecha_emision_desdeBusquedaVentasGenerales) {
		this.fecha_emision_desdeBusquedaVentasGenerales = fecha_emision_desdeBusquedaVentasGenerales;
	}

;
	public Date fecha_emision_hastaBusquedaVentasGenerales=new Date();

	public Date getfecha_emision_hastaBusquedaVentasGenerales() {
		return this.fecha_emision_hastaBusquedaVentasGenerales;
	}

	public void setfecha_emision_hastaBusquedaVentasGenerales(Date fecha_emision_hastaBusquedaVentasGenerales) {
		this.fecha_emision_hastaBusquedaVentasGenerales = fecha_emision_hastaBusquedaVentasGenerales;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public VentasGeneralesLogic getVentasGeneralesLogic()	{		
		return ventasgeneralesLogic;
	}

	public void setVentasGeneralesLogic(VentasGeneralesLogic ventasgeneralesLogic) {
		this.ventasgeneralesLogic = ventasgeneralesLogic;
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
	
	public Boolean getIsEsNuevoVentasGenerales() {
		return isEsNuevoVentasGenerales;
	}

	public void setIsEsNuevoVentasGenerales(Boolean isEsNuevoVentasGenerales) {
		this.isEsNuevoVentasGenerales = isEsNuevoVentasGenerales;
	}

	public Boolean getEsParaAccionDesdeFormularioVentasGenerales() {
		return esParaAccionDesdeFormularioVentasGenerales;
	}
	
	public void setEsParaAccionDesdeFormularioVentasGenerales(Boolean esParaAccionDesdeFormularioVentasGenerales) {
		this.esParaAccionDesdeFormularioVentasGenerales = esParaAccionDesdeFormularioVentasGenerales;
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

			if(this.ventasgeneralesSessionBean==null) {
				this.ventasgeneralesSessionBean=new VentasGeneralesSessionBean();
			}

			if(!this.ventasgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(ventasgeneralesSessionBean.getlidEmpresaActual());
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

					if(this.ventasgenerales!=null) {
						this.ventasgenerales.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
						this.jInternalFrameDetalleFormVentasGenerales.jComboBoxid_empresaVentasGenerales.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVentasGenerales.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
						if(this.jInternalFrameDetalleFormVentasGenerales.jComboBoxid_empresaVentasGenerales.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentasGenerales.jComboBoxid_empresaVentasGenerales.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVentasGeneralesGenerico)throws Exception
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
				jComboBoxid_empresaVentasGeneralesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVentasGeneralesGenerico!=null && jComboBoxid_empresaVentasGeneralesGenerico.getItemCount()>0) {
					jComboBoxid_empresaVentasGeneralesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(VentasGenerales ventasgenerales,JComboBox jComboBoxid_empresaVentasGeneralesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVentasGeneralesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVentasGenerales.jComboBoxid_empresaVentasGenerales.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVentasGeneralesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				ventasgenerales.setid_empresa(empresaAux.getId());
				ventasgenerales.setempresa_descripcion(VentasGeneralesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				ventasgenerales.setEmpresa(empresaAux);			}
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

					if(!VentasGeneralesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentasGenerales!=null) { 
							this.jInternalFrameDetalleFormVentasGenerales.jComboBoxid_empresaVentasGenerales.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVentasGenerales.jComboBoxid_empresaVentasGenerales.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentasGenerales!=null) { 
					}

					if(!VentasGeneralesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
							this.jInternalFrameDetalleFormVentasGenerales.jComboBoxid_empresaVentasGenerales.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
							this.jInternalFrameDetalleFormVentasGenerales.jComboBoxid_empresaVentasGenerales.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesVentasGenerales() throws Exception {
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
		
	public VentasGeneralesParameterReturnGeneral getVentasGeneralesParameterGeneral() {
		return this.ventasgeneralesParameterGeneral;
	}
	
	public void setVentasGeneralesParameterGeneral(VentasGeneralesParameterReturnGeneral ventasgeneralesParameterGeneral) {
		this.ventasgeneralesParameterGeneral = ventasgeneralesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoVentasGenerales() {
		return isPermisoTodoVentasGenerales;
	}

	public void setIsPermisoTodoVentasGenerales(Boolean isPermisoTodoVentasGenerales) {
		this.isPermisoTodoVentasGenerales = isPermisoTodoVentasGenerales;
	}

	public Boolean getIsPermisoNuevoVentasGenerales() {
		return isPermisoNuevoVentasGenerales;
	}

	public void setIsPermisoNuevoVentasGenerales(Boolean isPermisoNuevoVentasGenerales) {
		this.isPermisoNuevoVentasGenerales = isPermisoNuevoVentasGenerales;
	}

	public Boolean getIsPermisoActualizarVentasGenerales() {
		return isPermisoActualizarVentasGenerales;
	}

	public void setIsPermisoActualizarVentasGenerales(Boolean isPermisoActualizarVentasGenerales) {
		this.isPermisoActualizarVentasGenerales = isPermisoActualizarVentasGenerales;
	}

	public Boolean getIsPermisoEliminarVentasGenerales() {
		return isPermisoEliminarVentasGenerales;
	}

	public void setIsPermisoEliminarVentasGenerales(Boolean isPermisoEliminarVentasGenerales) {
		this.isPermisoEliminarVentasGenerales = isPermisoEliminarVentasGenerales;
	}

	public Boolean getIsPermisoGuardarCambiosVentasGenerales() {
		return isPermisoGuardarCambiosVentasGenerales;
	}

	public void setIsPermisoGuardarCambiosVentasGenerales(Boolean isPermisoGuardarCambiosVentasGenerales) {
		this.isPermisoGuardarCambiosVentasGenerales = isPermisoGuardarCambiosVentasGenerales;
	}
	
	public Boolean getIsPermisoConsultaVentasGenerales() {
		return isPermisoConsultaVentasGenerales;
	}

	public void setIsPermisoConsultaVentasGenerales(Boolean isPermisoConsultaVentasGenerales) {
		this.isPermisoConsultaVentasGenerales = isPermisoConsultaVentasGenerales;
	}

	public Boolean getIsPermisoBusquedaVentasGenerales() {
		return isPermisoBusquedaVentasGenerales;
	}

	public void setIsPermisoBusquedaVentasGenerales(Boolean isPermisoBusquedaVentasGenerales) {
		this.isPermisoBusquedaVentasGenerales = isPermisoBusquedaVentasGenerales;
	}

	public Boolean getIsPermisoReporteVentasGenerales() {
		return isPermisoReporteVentasGenerales;
	}

	public void setIsPermisoReporteVentasGenerales(Boolean isPermisoReporteVentasGenerales) {
		this.isPermisoReporteVentasGenerales = isPermisoReporteVentasGenerales;
	}
	
	public Boolean getIsPermisoPaginacionMedioVentasGenerales() {
		return isPermisoPaginacionMedioVentasGenerales;
	}

	public void setIsPermisoPaginacionMedioVentasGenerales(Boolean isPermisoPaginacionMedioVentasGenerales) {
		this.isPermisoPaginacionMedioVentasGenerales = isPermisoPaginacionMedioVentasGenerales;
	}
	
	public Boolean getIsPermisoPaginacionTodoVentasGenerales() {
		return isPermisoPaginacionTodoVentasGenerales;
	}

	public void setIsPermisoPaginacionTodoVentasGenerales(Boolean isPermisoPaginacionTodoVentasGenerales) {
		this.isPermisoPaginacionTodoVentasGenerales = isPermisoPaginacionTodoVentasGenerales;
	}
	
	public Boolean getIsPermisoPaginacionAltoVentasGenerales() {
		return isPermisoPaginacionAltoVentasGenerales;
	}

	public void setIsPermisoPaginacionAltoVentasGenerales(Boolean isPermisoPaginacionAltoVentasGenerales) {
		this.isPermisoPaginacionAltoVentasGenerales = isPermisoPaginacionAltoVentasGenerales;
	}
	
	public Boolean getIsPermisoCopiarVentasGenerales() {
		return isPermisoCopiarVentasGenerales;
	}

	public void setIsPermisoCopiarVentasGenerales(Boolean isPermisoCopiarVentasGenerales) {
		this.isPermisoCopiarVentasGenerales = isPermisoCopiarVentasGenerales;
	}
	
	public Boolean getIsPermisoVerFormVentasGenerales() {
		return isPermisoVerFormVentasGenerales;
	}

	public void setIsPermisoVerFormVentasGenerales(Boolean isPermisoVerFormVentasGenerales) {
		this.isPermisoVerFormVentasGenerales = isPermisoVerFormVentasGenerales;
	}
	
	public Boolean getIsPermisoDuplicarVentasGenerales() {
		return isPermisoDuplicarVentasGenerales;
	}

	public void setIsPermisoDuplicarVentasGenerales(Boolean isPermisoDuplicarVentasGenerales) {
		this.isPermisoDuplicarVentasGenerales = isPermisoDuplicarVentasGenerales;
	}
	
	public Boolean getIsPermisoOrdenVentasGenerales() {
		return isPermisoOrdenVentasGenerales;
	}

	public void setIsPermisoOrdenVentasGenerales(Boolean isPermisoOrdenVentasGenerales) {
		this.isPermisoOrdenVentasGenerales = isPermisoOrdenVentasGenerales;
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
	
	public Boolean getIsVisibilidadCeldaNuevoVentasGenerales() {
		return isVisibilidadCeldaNuevoVentasGenerales;
	}

	public void setIsVisibilidadCeldaNuevoVentasGenerales(Boolean isVisibilidadCeldaNuevoVentasGenerales) {
		this.isVisibilidadCeldaNuevoVentasGenerales = isVisibilidadCeldaNuevoVentasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVentasGenerales() {
		return isVisibilidadCeldaDuplicarVentasGenerales;
	}

	public void setIsVisibilidadCeldaDuplicarVentasGenerales(Boolean isVisibilidadCeldaDuplicarVentasGenerales) {
		this.isVisibilidadCeldaDuplicarVentasGenerales = isVisibilidadCeldaDuplicarVentasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVentasGenerales() {
		return isVisibilidadCeldaCopiarVentasGenerales;
	}

	public void setIsVisibilidadCeldaCopiarVentasGenerales(Boolean isVisibilidadCeldaCopiarVentasGenerales) {
		this.isVisibilidadCeldaCopiarVentasGenerales = isVisibilidadCeldaCopiarVentasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVentasGenerales() {
		return isVisibilidadCeldaVerFormVentasGenerales;
	}

	public void setIsVisibilidadCeldaVerFormVentasGenerales(Boolean isVisibilidadCeldaVerFormVentasGenerales) {
		this.isVisibilidadCeldaVerFormVentasGenerales = isVisibilidadCeldaVerFormVentasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVentasGenerales() {
		return isVisibilidadCeldaOrdenVentasGenerales;
	}

	public void setIsVisibilidadCeldaOrdenVentasGenerales(Boolean isVisibilidadCeldaOrdenVentasGenerales) {
		this.isVisibilidadCeldaOrdenVentasGenerales = isVisibilidadCeldaOrdenVentasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVentasGenerales() {
		return isVisibilidadCeldaNuevoRelacionesVentasGenerales;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVentasGenerales(Boolean isVisibilidadCeldaNuevoRelacionesVentasGenerales) {
		this.isVisibilidadCeldaNuevoRelacionesVentasGenerales = isVisibilidadCeldaNuevoRelacionesVentasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVentasGenerales() {
		return isVisibilidadCeldaModificarVentasGenerales;
	}

	public void setIsVisibilidadCeldaModificarVentasGenerales(Boolean isVisibilidadCeldaModificarVentasGenerales) {
		this.isVisibilidadCeldaModificarVentasGenerales = isVisibilidadCeldaModificarVentasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVentasGenerales() {
		return isVisibilidadCeldaActualizarVentasGenerales;
	}

	public void setIsVisibilidadCeldaActualizarVentasGenerales(Boolean isVisibilidadCeldaActualizarVentasGenerales) {
		this.isVisibilidadCeldaActualizarVentasGenerales = isVisibilidadCeldaActualizarVentasGenerales;
	}

	public Boolean getIsVisibilidadCeldaEliminarVentasGenerales() {
		return isVisibilidadCeldaEliminarVentasGenerales;
	}

	public void setIsVisibilidadCeldaEliminarVentasGenerales(Boolean isVisibilidadCeldaEliminarVentasGenerales) {
		this.isVisibilidadCeldaEliminarVentasGenerales = isVisibilidadCeldaEliminarVentasGenerales;
	}

	public Boolean getIsVisibilidadCeldaCancelarVentasGenerales() {
		return isVisibilidadCeldaCancelarVentasGenerales;
	}

	public void setIsVisibilidadCeldaCancelarVentasGenerales(Boolean isVisibilidadCeldaCancelarVentasGenerales) {
		this.isVisibilidadCeldaCancelarVentasGenerales = isVisibilidadCeldaCancelarVentasGenerales;
	}

	public Boolean getIsVisibilidadCeldaGuardarVentasGenerales() {
		return isVisibilidadCeldaGuardarVentasGenerales;
	}

	public void setIsVisibilidadCeldaGuardarVentasGenerales(Boolean isVisibilidadCeldaGuardarVentasGenerales) {
		this.isVisibilidadCeldaGuardarVentasGenerales = isVisibilidadCeldaGuardarVentasGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVentasGenerales() {
		return isVisibilidadCeldaGuardarCambiosVentasGenerales;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVentasGenerales(Boolean isVisibilidadCeldaGuardarCambiosVentasGenerales) {
		this.isVisibilidadCeldaGuardarCambiosVentasGenerales = isVisibilidadCeldaGuardarCambiosVentasGenerales;
	}
		
	public VentasGeneralesSessionBean getventasgeneralesSessionBean() {
		return this.ventasgeneralesSessionBean;
	}
	
	public void setventasgeneralesSessionBean(VentasGeneralesSessionBean ventasgeneralesSessionBean) {
		this.ventasgeneralesSessionBean=ventasgeneralesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaVentasGenerales() {
		return this.isVisibilidadBusquedaVentasGenerales;
	}

	public void setisVisibilidadBusquedaVentasGenerales(Boolean isVisibilidadBusquedaVentasGenerales) {
		this.isVisibilidadBusquedaVentasGenerales=isVisibilidadBusquedaVentasGenerales;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(VentasGenerales ventasgenerales)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(ventasgenerales,null);
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
	
	public void bugActualizarReferenciaActual(VentasGenerales ventasgenerales,VentasGenerales ventasgeneralesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVentasGenerales(ventasgenerales);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ventasgeneralesAux.setId(ventasgenerales.getId());
		ventasgeneralesAux.setVersionRow(ventasgenerales.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(VentasGenerales ventasgeneralesLocal) throws Exception {
		
		if(this.ventasgeneralesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VentasGenerales ventasgeneralesLocal) throws Exception {	
		if(this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				ventasgeneralesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVentasGeneralesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ventasgeneralesValidator.getInvalidValues(this.ventasgenerales);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(VentasGenerales ventasgenerales,List<VentasGenerales> ventasgeneraless) throws Exception {
	}		
	
	public void actualizarSelectedLista(VentasGenerales ventasgenerales,List<VentasGenerales> ventasgeneraless) throws Exception {
		try	{			
			VentasGeneralesConstantesFunciones.actualizarSelectedLista(ventasgenerales,ventasgeneraless);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VentasGenerales> ventasgeneralessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ventasgeneralessLocal=this.ventasgeneralesLogic.getVentasGeneraless();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ventasgeneralessLocal=this.ventasgeneraless;
			}
			//ARCHITECTURE
		
			for(VentasGenerales ventasgeneralesLocal:ventasgeneralessLocal) {
				if(this.permiteMantenimiento(ventasgeneralesLocal) && ventasgeneralesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+VentasGeneralesConstantesFunciones.getVentasGeneralesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VentasGeneralesConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasGenerales.jLabelnombre_productoVentasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasGeneralesConstantesFunciones.MONTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasGenerales.jLabelmontoVentasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasGeneralesConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasGenerales.jLabelcodigo_productoVentasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasGeneralesConstantesFunciones.NOTASCREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasGenerales.jLabelnotas_creditoVentasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasGeneralesConstantesFunciones.VENTANETA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasGenerales.jLabelventa_netaVentasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasGeneralesConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasGenerales.jLabelporcentajeVentasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasGeneralesConstantesFunciones.ACUMULADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasGenerales.jLabelacumuladoVentasGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentasGeneralesConstantesFunciones.TIPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasGenerales.jLabeltipoVentasGenerales,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasGenerales.jLabelnombre_productoVentasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasGenerales.jLabelmontoVentasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasGenerales.jLabelcodigo_productoVentasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasGenerales.jLabelnotas_creditoVentasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasGenerales.jLabelventa_netaVentasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasGenerales.jLabelporcentajeVentasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasGenerales.jLabelacumuladoVentasGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentasGenerales.jLabeltipoVentasGenerales,"");
		
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
		this.iIdNuevoVentasGenerales--;	
		
		
		this.ventasgeneralesAux=new VentasGenerales();
		
		this.ventasgeneralesAux.setId(this.iIdNuevoVentasGenerales);
		this.ventasgeneralesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventasgeneralesLogic.getVentasGeneraless().add(this.ventasgeneralesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ventasgeneraless.add(this.ventasgeneralesAux);
		}
		//ARCHITECTURE
		
		this.ventasgenerales=this.ventasgeneralesAux;
		
		if(VentasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVentasGenerales(this.ventasgenerales);
			this.setVariablesObjetoActualToFormularioForeignKeyVentasGenerales(this.ventasgenerales);
		}
				
		//this.setDefaultControlesVentasGenerales();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVentasGenerales();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVentasGenerales();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentasGenerales();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentasGenerales(this.ventasgeneralesBean,this.ventasgenerales,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVentasGenerales(this.ventasgeneralesReturnGeneral,this.ventasgeneralesBean,false);
		
		if(this.ventasgeneralesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVentasGenerales(this.ventasgeneralesReturnGeneral.getVentasGenerales());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVentasGenerales(this.ventasgeneralesReturnGeneral.getVentasGenerales());
		}
		
		if(this.ventasgeneralesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVentasGenerales(this.ventasgeneralesReturnGeneral.getVentasGenerales(),classes);//this.ventasgeneralesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVentasGenerales(this.ventasgenerales,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVentasGenerales();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVentasGenerales();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VentasGeneralesBeanSwingJInternalFrameAdditional.RecargarFormVentasGenerales(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVentasGenerales(false);
						
			if(ventasgeneralesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VentasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasGenerales();
			}
			
			this.actualizarVisualTableDatosVentasGenerales();
			
			this.jTableDatosVentasGenerales.setRowSelectionInterval(this.getIndiceNuevoVentasGenerales(), this.getIndiceNuevoVentasGenerales());
			
			this.seleccionarFilaTablaVentasGeneralesActual();
						
			this.actualizarEstadoCeldasBotonesVentasGenerales("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVentasGenerales(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVentasGenerales.jDateChooserfecha_emision_desdeVentasGenerales.setEnabled(isHabilitar && this.ventasgeneralesConstantesFunciones.activarfecha_emision_desdeVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jDateChooserfecha_emision_hastaVentasGenerales.setEnabled(isHabilitar && this.ventasgeneralesConstantesFunciones.activarfecha_emision_hastaVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jTextAreanombre_productoVentasGenerales.setEnabled(isHabilitar && this.ventasgeneralesConstantesFunciones.activarnombre_productoVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jTextFieldmontoVentasGenerales.setEnabled(isHabilitar && this.ventasgeneralesConstantesFunciones.activarmontoVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jTextFieldcodigo_productoVentasGenerales.setEnabled(isHabilitar && this.ventasgeneralesConstantesFunciones.activarcodigo_productoVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jTextFieldnotas_creditoVentasGenerales.setEnabled(isHabilitar && this.ventasgeneralesConstantesFunciones.activarnotas_creditoVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jTextFieldventa_netaVentasGenerales.setEnabled(isHabilitar && this.ventasgeneralesConstantesFunciones.activarventa_netaVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jTextFieldporcentajeVentasGenerales.setEnabled(isHabilitar && this.ventasgeneralesConstantesFunciones.activarporcentajeVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jTextFieldacumuladoVentasGenerales.setEnabled(isHabilitar && this.ventasgeneralesConstantesFunciones.activaracumuladoVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jTextFieldtipoVentasGenerales.setEnabled(isHabilitar && this.ventasgeneralesConstantesFunciones.activartipoVentasGenerales);	
		//
		this.jInternalFrameDetalleFormVentasGenerales.jComboBoxid_empresaVentasGenerales.setEnabled(isHabilitar && this.ventasgeneralesConstantesFunciones.activarid_empresaVentasGenerales);
	};
	
	public void setDefaultControlesVentasGenerales() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVentasGenerales(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ventasgeneralesSessionBean.setConGuardarRelaciones(true);			
			this.ventasgeneralesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVentasGenerales.jTabbedPaneRelacionesVentasGenerales.setVisible(true);
			
					
		} else {
			//this.ventasgeneralesSessionBean.setConGuardarRelaciones(false);			
			this.ventasgeneralesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVentasGenerales.jTabbedPaneRelacionesVentasGenerales.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVentasGenerales() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasGenerales ventasgeneralesAux:this.ventasgeneralesLogic.getVentasGeneraless()) {
				if(ventasgeneralesAux.getId().equals(this.iIdNuevoVentasGenerales)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasGenerales ventasgeneralesAux:this.ventasgeneraless) {
				if(ventasgeneralesAux.getId().equals(this.iIdNuevoVentasGenerales)) {
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
	
	public int getIndiceActualVentasGenerales(VentasGenerales ventasgenerales,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasGenerales ventasgeneralesAux:this.ventasgeneralesLogic.getVentasGeneraless()) {
				if(ventasgeneralesAux.getId().equals(ventasgenerales.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasGenerales ventasgeneralesAux:this.ventasgeneraless) {
				if(ventasgeneralesAux.getId().equals(ventasgenerales.getId())) {
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
	
	public void setCamposBaseDesdeOriginalVentasGenerales(VentasGenerales ventasgeneralesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasGenerales ventasgeneralesAux:this.ventasgeneralesLogic.getVentasGeneraless()) {
				if(ventasgeneralesAux.getVentasGeneralesOriginal().getId().equals(ventasgeneralesOriginal.getId())) {
					existe=true;
					ventasgeneralesOriginal.setId(ventasgeneralesAux.getId());
					ventasgeneralesOriginal.setVersionRow(ventasgeneralesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasGenerales ventasgeneralesAux:this.ventasgeneraless) {
				if(ventasgeneralesAux.getVentasGeneralesOriginal().getId().equals(ventasgeneralesOriginal.getId())) {
					existe=true;
					ventasgeneralesOriginal.setId(ventasgeneralesAux.getId());
					ventasgeneralesOriginal.setVersionRow(ventasgeneralesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVentasGenerales(Boolean esParaCancelar) throws Exception {
		ventasgeneralessAux=new ArrayList<VentasGenerales>();
		ventasgeneralesAux=new VentasGenerales();
		
		if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentasGenerales ventasgeneralesAux:this.ventasgeneralesLogic.getVentasGeneraless()) {
					if(ventasgeneralesAux.getId()<0) {
						ventasgeneralessAux.add(ventasgeneralesAux);
					}		
				}
				this.iIdNuevoVentasGenerales=0L;
				this.ventasgeneralesLogic.getVentasGeneraless().removeAll(ventasgeneralessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasGenerales ventasgeneralesAux:this.ventasgeneraless) {
					if(ventasgeneralesAux.getId()<0) {
						ventasgeneralessAux.add(ventasgeneralesAux);
					}		
				}
				this.iIdNuevoVentasGenerales=0L;
				this.ventasgeneraless.removeAll(ventasgeneralessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVentasGenerales 
					&& this.ventasgeneralesLogic.getVentasGeneraless().size()>0
					) {
					ventasgeneralesAux=this.ventasgeneralesLogic.getVentasGeneraless().get(this.ventasgeneralesLogic.getVentasGeneraless().size() - 1);
				
					if(ventasgeneralesAux.getId()<0) {
						this.ventasgeneralesLogic.getVentasGeneraless().remove(ventasgeneralesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVentasGenerales && this.ventasgeneraless.size()>0) {
					ventasgeneralesAux=this.ventasgeneraless.get(this.ventasgeneraless.size() - 1);
				
					if(ventasgeneralesAux.getId()<0) {
						this.ventasgeneraless.remove(ventasgeneralesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVentasGenerales(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ventasgenerales.getId()<0) {
				this.ventasgeneralesLogic.getVentasGeneraless().remove(this.ventasgenerales);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ventasgenerales.getId()<0) {
				this.ventasgeneraless.remove(this.ventasgenerales);
			}
		}			
	}
	
	public void setEstadosInicialesVentasGenerales(List<VentasGenerales> ventasgeneralessAux) throws Exception {
		VentasGeneralesConstantesFunciones.setEstadosInicialesVentasGenerales(ventasgeneralessAux);
	}
	
	public void setEstadosInicialesVentasGenerales(VentasGenerales ventasgeneralesAux) throws Exception {
		VentasGeneralesConstantesFunciones.setEstadosInicialesVentasGenerales(ventasgeneralesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVentasGeneralesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVentasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVentasGeneralesActual()) {
				if(!this.isEsNuevoVentasGenerales) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVentasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVentasGenerales=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVentasGeneralesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Ventas Generales ?", "MANTENIMIENTO DE Ventas Generales", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVentasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(VentasGenerales ventasgenerales) throws Exception {
		VentasGeneralesConstantesFunciones.seleccionarAsignar(this.ventasgenerales,ventasgenerales);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVentasGenerales=this.isPermisoActualizarOriginalVentasGenerales;
			
			
			this.seleccionarAsignar(ventasgenerales);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesVentasGenerales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ventasgeneralesSessionBean.setsFuncionBusquedaRapida(this.ventasgeneralesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoVentasGenerales) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVentasGenerales(esParaCancelar);				
				this.cancelarNuevoVentasGenerales(esParaCancelar);								
			}
			
			this.ventasgenerales=new VentasGenerales();
			
			this.inicializarVentasGenerales();
			
			this.actualizarEstadoCeldasBotonesVentasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVentasGenerales() throws Exception {
		try {
			VentasGeneralesConstantesFunciones.inicializarVentasGenerales(this.ventasgenerales);
			
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
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ventasgeneralesLogic.getVentasGeneraless().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVentasGeneraless(String sAccionBusqueda,List<VentasGenerales> ventasgeneralessParaReportes) throws Exception {
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
					sPathReporteFinal="VentasGenerales"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VentasGeneralesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VentasGeneralesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="VentasGenerales"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Ventas Generaleses");		
		parameters.put("busquedapor", VentasGeneralesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVentasGenerales=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VentasGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VentasGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVentasGenerales=new JRBeanArrayDataSource(VentasGeneralesJInternalFrame.TraerVentasGeneralesBeans(ventasgeneralessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVentasGenerales);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VentasGeneralesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VentasGeneralesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VentasGeneralesBean.TraerVentasGeneralesBeans(ventasgeneralessParaReportes).toArray()));
							
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
				this.generarExcelReporteVentasGeneraless(sAccionBusqueda,sTipoArchivoReporte,ventasgeneralessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVentasGeneraless(sAccionBusqueda,sTipoArchivoReporte,ventasgeneralessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVentasGeneralesActionPerformed(null);
					//this.generarExcelReporteVentasGeneraless(sAccionBusqueda,sTipoArchivoReporte,ventasgeneralessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVentasGeneraless(sAccionBusqueda,sTipoArchivoReporte,ventasgeneralessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVentasGeneraless(sAccionBusqueda,sTipoArchivoReporte,ventasgeneralessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVentasGeneraless(sAccionBusqueda,sTipoArchivoReporte,ventasgeneralessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVentasGeneraless(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasGenerales> ventasgeneralessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasgenerales";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasGeneraless");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentasGenerales("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(VentasGenerales ventasgenerales : ventasgeneralessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VentasGeneralesConstantesFunciones.generarExcelReporteDataVentasGenerales("NORMAL",row,workbook,ventasgenerales,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Generales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVentasGenerales(String sTipo,Row row,Workbook workbook) {
		
		VentasGeneralesConstantesFunciones.generarExcelReporteHeaderVentasGenerales(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVentasGeneraless(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasGenerales> ventasgeneralessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasgenerales_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasGeneraless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(VentasGenerales ventasgenerales : ventasgeneralessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VentasGeneralesConstantesFunciones.getVentasGeneralesDescripcion(ventasgenerales));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasGeneralesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasgenerales.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasgenerales.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasgenerales.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasgenerales.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasGeneralesConstantesFunciones.LABEL_MONTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_MONTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasgenerales.getmonto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasgenerales.getcodigo_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasGeneralesConstantesFunciones.LABEL_NOTASCREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_NOTASCREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasgenerales.getnotas_credito());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasGeneralesConstantesFunciones.LABEL_VENTANETA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_VENTANETA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasgenerales.getventa_neta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasGeneralesConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasgenerales.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasGeneralesConstantesFunciones.LABEL_ACUMULADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_ACUMULADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasgenerales.getacumulado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentasGeneralesConstantesFunciones.LABEL_TIPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_TIPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventasgenerales.gettipo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Generales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVentasGeneraless(String sAccionBusqueda,String sTipoArchivoReporte,List<VentasGenerales> ventasgeneralessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<VentasGenerales> ventasgeneralessRespaldo=null;
		
		classes=VentasGeneralesConstantesFunciones.getClassesRelationshipsOfVentasGenerales(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ventasgeneralesLogic.setDatosCliente(this.datosCliente);
		this.ventasgeneralesLogic.setDatosDeep(this.datosDeep);
		this.ventasgeneralesLogic.setIsConDeep(true);
		
		ventasgeneralessRespaldo=this.ventasgeneralesLogic.getVentasGeneraless();
		
		this.ventasgeneralesLogic.setVentasGeneraless(ventasgeneralessParaReportes);	
		this.ventasgeneralesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ventasgeneralessParaReportes=this.ventasgeneralesLogic.getVentasGeneraless();
		this.ventasgeneralesLogic.setVentasGeneraless(ventasgeneralessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasgenerales_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentasGeneraless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentasGenerales("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(VentasGenerales ventasgenerales : ventasgeneralessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVentasGenerales("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VentasGeneralesConstantesFunciones.generarExcelReporteDataVentasGenerales("NORMAL",row,workbook,ventasgenerales,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VentasGeneralesConstantesFunciones.getVentasGeneralesDescripcion(ventasgenerales));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Generales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentasGenerales.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasGenerales.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentasGenerales.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasGenerales.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVentasGenerales() throws Exception {		
		this.startProcessVentasGenerales(true);
	}
	
	public void startProcessVentasGenerales(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVentasGenerales ,this.jPanelParametrosReportesVentasGenerales, this.jScrollPanelDatosVentasGenerales,this.jPanelPaginacionVentasGenerales, this.jScrollPanelDatosEdicionVentasGenerales, this.jPanelAccionesVentasGenerales,this.jPanelAccionesFormularioVentasGenerales,this.jmenuBarVentasGenerales,this.jmenuBarDetalleVentasGenerales,this.jTtoolBarVentasGenerales,this.jTtoolBarDetalleVentasGenerales);		
		
		final JTabbedPane jTabbedPaneBusquedasVentasGenerales=this.jTabbedPaneBusquedasVentasGenerales; 
		
		final JPanel jPanelParametrosReportesVentasGenerales=this.jPanelParametrosReportesVentasGenerales;
		//final JScrollPane jScrollPanelDatosVentasGenerales=this.jScrollPanelDatosVentasGenerales;
		final JTable jTableDatosVentasGenerales=this.jTableDatosVentasGenerales;		
		final JPanel jPanelPaginacionVentasGenerales=this.jPanelPaginacionVentasGenerales;
		//final JScrollPane jScrollPanelDatosEdicionVentasGenerales=this.jScrollPanelDatosEdicionVentasGenerales;
		final JPanel jPanelAccionesVentasGenerales=this.jPanelAccionesVentasGenerales;
		
		JPanel jPanelCamposAuxiliarVentasGenerales=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVentasGenerales=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
			jPanelCamposAuxiliarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jPanelCamposVentasGenerales;
			jPanelAccionesFormularioAuxiliarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jPanelAccionesFormularioVentasGenerales;
		}
		
		final JPanel jPanelCamposVentasGenerales=jPanelCamposAuxiliarVentasGenerales;
		final JPanel jPanelAccionesFormularioVentasGenerales=jPanelAccionesFormularioAuxiliarVentasGenerales;
		
		
		final JMenuBar jmenuBarVentasGenerales=this.jmenuBarVentasGenerales;
		final JToolBar jTtoolBarVentasGenerales=this.jTtoolBarVentasGenerales;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVentasGenerales=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentasGenerales=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
			jmenuBarDetalleAuxiliarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jmenuBarDetalleVentasGenerales;
			jTtoolBarDetalleAuxiliarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jTtoolBarDetalleVentasGenerales;
		}
		
		final JMenuBar jmenuBarDetalleVentasGenerales=jmenuBarDetalleAuxiliarVentasGenerales;
		final JToolBar jTtoolBarDetalleVentasGenerales=jTtoolBarDetalleAuxiliarVentasGenerales;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentasGenerales;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentasGenerales;
			processRunnable.jTableDatos=jTableDatosVentasGenerales;
			processRunnable.jPanelCampos=jPanelCamposVentasGenerales;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentasGenerales;
			processRunnable.jPanelAcciones=jPanelAccionesVentasGenerales;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentasGenerales;
			
			
			processRunnable.jmenuBar=jmenuBarVentasGenerales;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentasGenerales;
			processRunnable.jTtoolBar=jTtoolBarVentasGenerales;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentasGenerales;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentasGenerales ,jPanelParametrosReportesVentasGenerales,jTableDatosVentasGenerales, /*jScrollPanelDatosVentasGenerales,*/jPanelCamposVentasGenerales,jPanelPaginacionVentasGenerales, /*jScrollPanelDatosEdicionVentasGenerales,*/ jPanelAccionesVentasGenerales,jPanelAccionesFormularioVentasGenerales,jmenuBarVentasGenerales,jmenuBarDetalleVentasGenerales,jTtoolBarVentasGenerales,jTtoolBarDetalleVentasGenerales);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentasGenerales ,jPanelParametrosReportesVentasGenerales, jScrollPanelDatosVentasGenerales,jPanelPaginacionVentasGenerales, jScrollPanelDatosEdicionVentasGenerales, jPanelAccionesVentasGenerales,jPanelAccionesFormularioVentasGenerales,jmenuBarVentasGenerales,jmenuBarDetalleVentasGenerales,jTtoolBarVentasGenerales,jTtoolBarDetalleVentasGenerales);
						
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
	
	public void finishProcessVentasGenerales() {// throws Exception 
		this.finishProcessVentasGenerales(true);
	}
	
	public void finishProcessVentasGenerales(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVentasGenerales ,this.jPanelParametrosReportesVentasGenerales, this.jScrollPanelDatosVentasGenerales,this.jPanelPaginacionVentasGenerales, this.jScrollPanelDatosEdicionVentasGenerales, this.jPanelAccionesVentasGenerales,this.jPanelAccionesFormularioVentasGenerales,this.jmenuBarVentasGenerales,this.jmenuBarDetalleVentasGenerales,this.jTtoolBarVentasGenerales,this.jTtoolBarDetalleVentasGenerales);		
		
		final JTabbedPane jTabbedPaneBusquedasVentasGenerales=this.jTabbedPaneBusquedasVentasGenerales; 
		
		final JPanel jPanelParametrosReportesVentasGenerales=this.jPanelParametrosReportesVentasGenerales;
		//final JScrollPane jScrollPanelDatosVentasGenerales=this.jScrollPanelDatosVentasGenerales;
		final JTable jTableDatosVentasGenerales=this.jTableDatosVentasGenerales;		
		final JPanel jPanelPaginacionVentasGenerales=this.jPanelPaginacionVentasGenerales;
		//final JScrollPane jScrollPanelDatosEdicionVentasGenerales=this.jScrollPanelDatosEdicionVentasGenerales;
		final JPanel jPanelAccionesVentasGenerales=this.jPanelAccionesVentasGenerales;
		
		JPanel jPanelCamposAuxiliarVentasGenerales=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVentasGenerales=new JPanel();
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
			jPanelCamposAuxiliarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jPanelCamposVentasGenerales;
			jPanelAccionesFormularioAuxiliarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jPanelAccionesFormularioVentasGenerales;
		}
		
		final JPanel jPanelCamposVentasGenerales=jPanelCamposAuxiliarVentasGenerales;
		final JPanel jPanelAccionesFormularioVentasGenerales=jPanelAccionesFormularioAuxiliarVentasGenerales;
		
		
		final JMenuBar jmenuBarVentasGenerales=this.jmenuBarVentasGenerales;		
		final JToolBar jTtoolBarVentasGenerales=this.jTtoolBarVentasGenerales;
				
		JMenuBar jmenuBarDetalleAuxiliarVentasGenerales=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentasGenerales=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
			jmenuBarDetalleAuxiliarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jmenuBarDetalleVentasGenerales;
			jTtoolBarDetalleAuxiliarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jTtoolBarDetalleVentasGenerales;		
		}
		
		final JMenuBar jmenuBarDetalleVentasGenerales=jmenuBarDetalleAuxiliarVentasGenerales;
		final JToolBar jTtoolBarDetalleVentasGenerales=jTtoolBarDetalleAuxiliarVentasGenerales;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentasGenerales;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentasGenerales;
			processRunnable.jTableDatos=jTableDatosVentasGenerales;
			processRunnable.jPanelCampos=jPanelCamposVentasGenerales;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentasGenerales;
			processRunnable.jPanelAcciones=jPanelAccionesVentasGenerales;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentasGenerales;
			
			
			processRunnable.jmenuBar=jmenuBarVentasGenerales;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentasGenerales;
			processRunnable.jTtoolBar=jTtoolBarVentasGenerales;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentasGenerales;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVentasGenerales ,jPanelParametrosReportesVentasGenerales, jTableDatosVentasGenerales,/*jScrollPanelDatosVentasGenerales,*/jPanelCamposVentasGenerales,jPanelPaginacionVentasGenerales, /*jScrollPanelDatosEdicionVentasGenerales,*/ jPanelAccionesVentasGenerales,jPanelAccionesFormularioVentasGenerales,jmenuBarVentasGenerales,jmenuBarDetalleVentasGenerales,jTtoolBarVentasGenerales,jTtoolBarDetalleVentasGenerales));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVentasGenerales(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVentasGenerales(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVentasGenerales(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVentasGenerales(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVentasGenerales,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVentasGenerales,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVentasGenerales(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVentasGenerales,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVentasGenerales,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ventasgeneralesConstantesFunciones.getsFinalQueryVentasGenerales();
		String  finalQueryPaginacionTodos=this.ventasgeneralesConstantesFunciones.getsFinalQueryVentasGenerales();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VentasGeneralesConstantesFunciones.getArrayColumnasGlobalesNoVentasGenerales(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VentasGeneralesConstantesFunciones.getArrayColumnasGlobalesVentasGenerales(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VentasGeneralesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ventasgeneralessEliminados= new ArrayList<VentasGenerales>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVentasGenerales();
		
				///*VentasGeneralesSessionBean*/this.ventasgeneralesSessionBean=new VentasGeneralesSessionBean();
			
			if(this.ventasgeneralesSessionBean==null) {
				this.ventasgeneralesSessionBean=new VentasGeneralesSessionBean();
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
					this.iNumeroPaginacion=VentasGeneralesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VentasGeneralesConstantesFunciones.getClassesForeignKeysOfVentasGenerales(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ventasgenerales."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ventasgeneralessAux= new ArrayList<VentasGenerales>();
			
				
			ventasgeneralesLogic.setDatosCliente(this.datosCliente);
			ventasgeneralesLogic.setDatosDeep(this.datosDeep);
			ventasgeneralesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaVentasGenerales")) {
				this.sDetalleReporte=VentasGeneralesConstantesFunciones.getDetalleIndiceBusquedaVentasGenerales(fecha_emision_desdeBusquedaVentasGenerales,fecha_emision_hastaBusquedaVentasGenerales);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ventasgeneralesLogic.getVentasGeneralessBusquedaVentasGenerales(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaVentasGenerales,fecha_emision_hastaBusquedaVentasGenerales);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentasGeneralesConstantesFunciones.getDetalleIndiceBusquedaVentasGenerales(fecha_emision_desdeBusquedaVentasGenerales,fecha_emision_hastaBusquedaVentasGenerales);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentasGeneralesConstantesFunciones.getDetalleIndiceBusquedaVentasGenerales(fecha_emision_desdeBusquedaVentasGenerales,fecha_emision_hastaBusquedaVentasGenerales);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ventasgeneralesLogic.getVentasGeneraless()==null||ventasgeneralesLogic.getVentasGeneraless().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ventasgeneraless==null|| ventasgeneraless.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasgeneralessAux=new ArrayList<VentasGenerales>();
						ventasgeneralessAux.addAll(ventasgeneralesLogic.getVentasGeneraless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventasgeneralessAux=new ArrayList<VentasGenerales>();
							ventasgeneralessAux.addAll(ventasgeneraless);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ventasgeneralesLogic.getVentasGeneralessBusquedaVentasGenerales(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaVentasGenerales,fecha_emision_hastaBusquedaVentasGenerales);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentasGeneralesConstantesFunciones.getDetalleIndiceBusquedaVentasGenerales(fecha_emision_desdeBusquedaVentasGenerales,fecha_emision_hastaBusquedaVentasGenerales);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentasGeneralesConstantesFunciones.getDetalleIndiceBusquedaVentasGenerales(fecha_emision_desdeBusquedaVentasGenerales,fecha_emision_hastaBusquedaVentasGenerales);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVentasGeneraless("BusquedaVentasGenerales",ventasgeneralesLogic.getVentasGeneraless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVentasGeneraless("BusquedaVentasGenerales",ventasgeneraless);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasgeneralesLogic.setVentasGeneraless(new ArrayList<VentasGenerales>());
						ventasgeneralesLogic.getVentasGeneraless().addAll(ventasgeneralessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventasgeneraless=new ArrayList<VentasGenerales>();
							ventasgeneraless.addAll(ventasgeneralessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVentasGenerales();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVentasGenerales();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventasgeneralesLogic.getVentasGeneraless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventasgeneraless.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventasgeneralesLogic.getVentasGeneraless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventasgeneraless.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(VentasGenerales ventasgenerales) {
		Boolean permite=true;
		
		if(this.ventasgenerales.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VentasGeneralesConstantesFunciones.getOrderByListaVentasGenerales();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VentasGeneralesConstantesFunciones.getOrderByListaVentasGenerales();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasGenerales ventasgenerales:ventasgeneralesLogic.getVentasGeneraless()) {
				if(ventasgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					ventasgeneralesTotales=ventasgenerales;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasGenerales ventasgenerales:this.ventasgeneraless) {
				if(ventasgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					ventasgeneralesTotales=ventasgenerales;
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
			this.ventasgeneralesAux=new VentasGenerales();
			this.ventasgeneralesAux.setsType(Constantes2.S_TOTALES);
			this.ventasgeneralesAux.setIsNew(false);
			this.ventasgeneralesAux.setIsChanged(false);
			this.ventasgeneralesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//VentasGeneralesConstantesFunciones.TotalizarValoresFilaVentasGenerales(this.ventasgeneralesLogic.getVentasGeneraless(),this.ventasgeneralesAux);
				
				//this.ventasgeneralesLogic.getVentasGeneraless().add(this.ventasgeneralesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VentasGeneralesConstantesFunciones.TotalizarValoresFilaVentasGenerales(this.ventasgeneraless,this.ventasgeneralesAux);
				
				this.ventasgeneraless.add(this.ventasgeneralesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ventasgeneralesTotales=new VentasGenerales();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventasgeneralesLogic.getVentasGeneraless().remove(ventasgeneralesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventasgeneraless.remove(ventasgeneralesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ventasgeneralesTotales=new VentasGenerales();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentasGenerales ventasgenerales:ventasgeneralesLogic.getVentasGeneraless()) {
				if(ventasgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					ventasgeneralesTotales=ventasgenerales;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentasGeneralesConstantesFunciones.TotalizarValoresFilaVentasGenerales(this.ventasgeneralesLogic.getVentasGeneraless(),ventasgeneralesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentasGenerales ventasgenerales:this.ventasgeneraless) {
				if(ventasgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					ventasgeneralesTotales=ventasgenerales;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentasGeneralesConstantesFunciones.TotalizarValoresFilaVentasGenerales(this.ventasgeneraless,ventasgeneralesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVentasGeneralessBusquedaVentasGenerales()throws Exception {
		try {
			sAccionBusqueda="BusquedaVentasGenerales";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentasGeneralessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVentasGeneralessBusquedaVentasGenerales(String sFinalQuery,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventasgeneralesLogic.getVentasGeneralessBusquedaVentasGenerales(sFinalQuery,this.pagination,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentasGeneralessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventasgeneralesLogic.getVentasGeneralessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosVentasGenerales() {
		this.isPermisoTodoVentasGenerales=false;
		this.isPermisoNuevoVentasGenerales=false;
		this.isPermisoActualizarVentasGenerales=false;
		this.isPermisoActualizarOriginalVentasGenerales=false;
		this.isPermisoEliminarVentasGenerales=false;
		this.isPermisoGuardarCambiosVentasGenerales=false;
		this.isPermisoConsultaVentasGenerales=true;
		this.isPermisoBusquedaVentasGenerales=true;
		this.isPermisoReporteVentasGenerales=true;
		this.isPermisoOrdenVentasGenerales=false;		
		this.isPermisoPaginacionMedioVentasGenerales=false;		
		this.isPermisoPaginacionAltoVentasGenerales=false;		
		this.isPermisoPaginacionTodoVentasGenerales=false;		
		this.isPermisoCopiarVentasGenerales=false;		
		this.isPermisoVerFormVentasGenerales=false;		
		this.isPermisoDuplicarVentasGenerales=false;
		this.isPermisoOrdenVentasGenerales=false;
	}
	
	public void setPermisosUsuarioVentasGenerales(Boolean isPermiso) {
		this.isPermisoTodoVentasGenerales=isPermiso;
		this.isPermisoNuevoVentasGenerales=isPermiso;
		this.isPermisoActualizarVentasGenerales=isPermiso;
		this.isPermisoActualizarOriginalVentasGenerales=isPermiso;
		this.isPermisoEliminarVentasGenerales=isPermiso;
		this.isPermisoGuardarCambiosVentasGenerales=isPermiso;
		this.isPermisoConsultaVentasGenerales=isPermiso;
		this.isPermisoBusquedaVentasGenerales=isPermiso;
		this.isPermisoReporteVentasGenerales=isPermiso;
		this.isPermisoOrdenVentasGenerales=isPermiso;		
		this.isPermisoPaginacionMedioVentasGenerales=isPermiso;		
		this.isPermisoPaginacionAltoVentasGenerales=isPermiso;		
		this.isPermisoPaginacionTodoVentasGenerales=isPermiso;		
		this.isPermisoCopiarVentasGenerales=isPermiso;		
		this.isPermisoVerFormVentasGenerales=isPermiso;		
		this.isPermisoDuplicarVentasGenerales=isPermiso;
		this.isPermisoOrdenVentasGenerales=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVentasGenerales(Boolean isPermiso) {
		//this.isPermisoTodoVentasGenerales=isPermiso;
		this.isPermisoNuevoVentasGenerales=isPermiso;
		this.isPermisoActualizarVentasGenerales=isPermiso;
		this.isPermisoActualizarOriginalVentasGenerales=isPermiso;
		this.isPermisoEliminarVentasGenerales=isPermiso;
		this.isPermisoGuardarCambiosVentasGenerales=isPermiso;
		//this.isPermisoConsultaVentasGenerales=isPermiso;
		//this.isPermisoBusquedaVentasGenerales=isPermiso;
		//this.isPermisoReporteVentasGenerales=isPermiso;
		//this.isPermisoOrdenVentasGenerales=isPermiso;		
		//this.isPermisoPaginacionMedioVentasGenerales=isPermiso;		
		//this.isPermisoPaginacionAltoVentasGenerales=isPermiso;		
		//this.isPermisoPaginacionTodoVentasGenerales=isPermiso;		
		//this.isPermisoCopiarVentasGenerales=isPermiso;		
		//this.isPermisoDuplicarVentasGenerales=isPermiso;
		//this.isPermisoOrdenVentasGenerales=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVentasGeneralesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VentasGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebVentasGenerales(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVentasGeneralesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVentasGeneralesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVentasGeneralesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVentasGeneralesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVentasGenerales() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VentasGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VentasGeneralesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVentasGenerales=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVentasGenerales=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVentasGenerales=this.isPermisoActualizarVentasGenerales;
			this.isPermisoEliminarVentasGenerales=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVentasGenerales=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVentasGenerales=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVentasGenerales=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVentasGenerales=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVentasGenerales=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentasGenerales=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVentasGenerales=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVentasGenerales=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVentasGenerales=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVentasGenerales=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVentasGenerales=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVentasGenerales=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentasGenerales=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVentasGenerales.setToolTipText(this.jTableDatosVentasGenerales.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVentasGenerales(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVentasGenerales(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VentasGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(VentasGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioVentasGenerales() throws Exception {
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
	public void inicializarCombosForeignKeyVentasGeneralesListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVentasGeneralesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VentasGeneralesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyVentasGenerales()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.ventasgeneralesSessionBean==null) {
				this.ventasgeneralesSessionBean=new VentasGeneralesSessionBean();
			}

			if(!this.ventasgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyVentasGenerales()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVentasGenerales(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVentasGenerales()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentasGenerales();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVentasGenerales(VentasGenerales ventasgenerales)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVentasGenerales(VentasGenerales ventasgenerales,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVentasGenerales()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVentasGenerales()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVentasGenerales()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVentasGenerales()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVentasGenerales()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVentasGenerales()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVentasGenerales(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVentasGenerales()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVentasGenerales.jComboBoxid_empresaVentasGenerales!=null && this.jInternalFrameDetalleFormVentasGenerales.jComboBoxid_empresaVentasGenerales.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentasGenerales.jComboBoxid_empresaVentasGenerales.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public VentasGeneralesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VentasGeneralesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VentasGeneralesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ventasgeneralesSessionBean=new VentasGeneralesSessionBean(); 
		this.ventasgeneralesConstantesFunciones=new VentasGeneralesConstantesFunciones(); 
		this.ventasgeneralesBean=new VentasGenerales();//(this.ventasgeneralesConstantesFunciones); 		
		this.ventasgeneralesReturnGeneral=new VentasGeneralesParameterReturnGeneral(); 
		
		this.ventasgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventasgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VentasGeneralesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VentasGeneralesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VentasGeneralesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVentasGenerales(true);
			
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
			
			this.ventasgeneralesConstantesFunciones=new VentasGeneralesConstantesFunciones(); 
			this.ventasgeneralesBean=new VentasGenerales();//this.ventasgeneralesConstantesFunciones); 			
			this.ventasgeneralesReturnGeneral=new VentasGeneralesParameterReturnGeneral(); 
		
			VentasGeneralesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ventas Generales Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.ventasgenerales=new VentasGenerales();
			this.ventasgeneraless = new ArrayList<VentasGenerales>();
			this.ventasgeneralessAux = new ArrayList<VentasGenerales>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic=new VentasGeneralesLogic();
				this.ventasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			//this.ventasgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ventasgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVentasGenerales);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVentasGenerales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentasGenerales);	
					}
					
					if(this.jInternalFrameImportacionVentasGenerales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentasGenerales);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVentasGenerales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVentasGenerales);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVentasGenerales);
				this.jInternalFrameDetalleFormVentasGenerales.setVisible(false);
				this.jInternalFrameDetalleFormVentasGenerales.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasGenerales!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentasGenerales);
					this.jInternalFrameReporteDinamicoVentasGenerales.setVisible(false);
					this.jInternalFrameReporteDinamicoVentasGenerales.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVentasGenerales!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVentasGenerales);
					this.jInternalFrameImportacionVentasGenerales.setVisible(false);
					this.jInternalFrameImportacionVentasGenerales.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVentasGenerales!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVentasGenerales);
					this.jInternalFrameOrderByVentasGenerales.setVisible(false);
					this.jInternalFrameOrderByVentasGenerales.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVentasGeneralesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VentasGeneralesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ventasgeneralesReturnGeneral=new VentasGeneralesParameterReturnGeneral();
			
			this.ventasgeneralesParameterGeneral=new VentasGeneralesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ventasgeneralesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(VentasGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentasGeneralesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventasgeneralesSessionBean.getEsGuardarRelacionado(),this.ventasgeneralesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentasGeneralesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventasgeneralesSessionBean.getEsGuardarRelacionado(),this.ventasgeneralesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoVentasGenerales=false;
			this.isVisibilidadCeldaDuplicarVentasGenerales=true;
			this.isVisibilidadCeldaCopiarVentasGenerales=true;
			this.isVisibilidadCeldaVerFormVentasGenerales=true;
			this.isVisibilidadCeldaOrdenVentasGenerales=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasGenerales=false;
			this.isVisibilidadCeldaModificarVentasGenerales=false;
			this.isVisibilidadCeldaActualizarVentasGenerales=false;
			this.isVisibilidadCeldaEliminarVentasGenerales=false;
			this.isVisibilidadCeldaCancelarVentasGenerales=false;
			this.isVisibilidadCeldaGuardarVentasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosVentasGenerales=false;
			
			
			this.isVisibilidadBusquedaVentasGenerales=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVentasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVentasGenerales();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVentasGenerales(false);
			
			this.setPermisosUsuarioVentasGenerales();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado() 
				|| (this.ventasgeneralesSessionBean.getEsGuardarRelacionado() && this.ventasgeneralesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVentasGeneralesClasesRelacionadas();
			}
			
			if(this.ventasgeneralesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVentasGeneralesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VentasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVentasGenerales();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVentasGenerales();
			}
			
			if(!this.isPermisoBusquedaVentasGenerales) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVentasGenerales.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VentasGeneralesConstantesFunciones.getTiposSeleccionarVentasGenerales());
				
				this.tiposColumnasSelect=VentasGeneralesConstantesFunciones.getTiposSeleccionarVentasGenerales(true);
				
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
			//if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVentasGenerales();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioVentasGenerales(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioVentasGenerales(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasGenerales() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				ventasgeneralesImplementable= (VentasGeneralesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentasGeneralesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ventasgeneralesImplementableHome= (VentasGeneralesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentasGeneralesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ventasgeneraless= new ArrayList<VentasGenerales>();
			this.ventasgeneralessEliminados= new ArrayList<VentasGenerales>();
						
			this.isEsNuevoVentasGenerales=false;
			this.esParaAccionDesdeFormularioVentasGenerales=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVentasGenerales(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVentasGenerales();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VentasGeneralesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VentasGeneralesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVentasGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVentasGenerales(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVentasGenerales!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVentasGenerales();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVentasGenerales();
			}
			
			VentasGeneralesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVentasGenerales.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVentasGenerales.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVentasGenerales.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVentasGenerales(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga VentasGenerales: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVentasGenerales() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVentasGenerales")) {
				iIndex=this.jInternalFrameDetalleFormVentasGenerales.jTabbedPaneRelacionesVentasGenerales.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVentasGenerales.jTabbedPaneRelacionesVentasGenerales.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVentasGenerales();	
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
	
	public void cargarCombosForeignKeyVentasGenerales(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVentasGenerales(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVentasGenerales(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVentasGeneralesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVentasGenerales();
		
		this.cargarCombosFrameForeignKeyVentasGenerales();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVentasGenerales();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVentasGenerales();
		}
	}
	
	
	
	public void jButtonNuevoVentasGeneralesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ventasgeneralesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVentasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
			
			
			if(jTableDatosVentasGenerales.getRowCount()>=1) {
				jTableDatosVentasGenerales.removeRowSelectionInterval(0, jTableDatosVentasGenerales.getRowCount()-1);						
			}
			
			this.isEsNuevoVentasGenerales=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVentasGenerales(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVentasGenerales(true);			
			//this.ventasgenerales=new VentasGenerales();
			//this.ventasgenerales.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasGenerales(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasGenerales() ;
			
			if(VentasGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasGenerales(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ventasgenerales);	
			this.actualizarInformacion("INFO_PADRE",false,this.ventasgenerales);				
			
			VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
			
			if(this.ventasgeneralesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VentasGenerales: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVentasGeneralesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<VentasGenerales> ventasgeneralessSeleccionados=new ArrayList<VentasGenerales>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVentasGenerales.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVentasGenerales.getSelectedRows().length;			
			}
			
			ventasgeneralessSeleccionados=this.getVentasGeneralessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVentasGenerales--;			
				//VentasGenerales ventasgeneralesAux= new VentasGenerales();			
				//ventasgeneralesAux.setId(this.iIdNuevoVentasGenerales);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VentasGenerales ventasgeneralesOrigen=new VentasGenerales();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VentasGenerales ventasgeneralesOrigen : ventasgeneralessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ventasgeneralesOrigen =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventasgeneralesOrigen =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVentasGenerales();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ventasgenerales.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVentasGenerales(ventasgeneralesOrigen,this.ventasgenerales,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventasgeneralesLogic.getVentasGeneraless().add(this.ventasgeneralesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventasgeneraless.add(this.ventasgeneralesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVentasGenerales(false);
				
				this.jTableDatosVentasGenerales.setRowSelectionInterval(this.getIndiceNuevoVentasGenerales(), this.getIndiceNuevoVentasGenerales());
				
				int iLastRow =  this.jTableDatosVentasGenerales.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentasGenerales.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentasGenerales.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasGenerales(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<VentasGenerales> ventasgeneralessSeleccionados=new ArrayList<VentasGenerales>();									
		
			VentasGenerales ventasgeneralesOrigen=new VentasGenerales();
			VentasGenerales ventasgeneralesDestino=new VentasGenerales();
				
			ventasgeneralessSeleccionados=this.getVentasGeneralessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVentasGenerales.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ventasgeneralessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVentasGenerales.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasgeneralesOrigen =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventasgeneralesOrigen =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventasgeneralesDestino =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventasgeneralesDestino =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ventasgeneralesOrigen =ventasgeneralessSeleccionados.get(0);
				ventasgeneralesDestino =ventasgeneralessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVentasGenerales(ventasgeneralesOrigen,ventasgeneralesDestino,true,false);
				
				ventasgeneralesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ventasgeneralesDestino,ventasgeneralesLogic.getVentasGeneraless());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ventasgeneralesDestino,ventasgeneraless);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVentasGenerales(false);
				
				//this.jTableDatosVentasGenerales.setRowSelectionInterval(this.getIndiceNuevoVentasGenerales(), this.getIndiceNuevoVentasGenerales());
				
				int iLastRow =  this.jTableDatosVentasGenerales.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentasGenerales.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentasGenerales.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasGenerales(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVentasGenerales.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVentasGenerales.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVentasGenerales.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVentasGenerales.setVisible(!isVisible);
			this.jPanelPaginacionVentasGenerales.setVisible(!isVisible);
			this.jPanelAccionesVentasGenerales.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVentasGenerales();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVentasGenerales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVentasGenerales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVentasGenerales();
			
			this.abrirFrameOrderByVentasGenerales();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVentasGenerales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVentasGenerales(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentasGenerales);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVentasGenerales.isMaximum()) {
					this.jInternalFrameDetalleFormVentasGenerales.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVentasGenerales.setSize(this.jInternalFrameDetalleFormVentasGenerales.iWidthFormulario,this.jInternalFrameDetalleFormVentasGenerales.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVentasGenerales.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVentasGenerales.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVentasGenerales.isMaximum()) {
						this.jInternalFrameDetalleFormVentasGenerales.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVentasGenerales.jContentPaneDetalleVentasGenerales.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVentasGenerales.jTabbedPaneRelacionesVentasGenerales.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVentasGenerales.jContentPaneDetalleVentasGenerales.getWidth(),VentasGeneralesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentasGenerales.jTabbedPaneRelacionesVentasGenerales.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVentasGenerales.jContentPaneDetalleVentasGenerales.getWidth(),VentasGeneralesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentasGenerales.jTabbedPaneRelacionesVentasGenerales.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVentasGenerales.jContentPaneDetalleVentasGenerales.getWidth(),VentasGeneralesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVentasGenerales.setVisible(true);
	        this.jInternalFrameDetalleFormVentasGenerales.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVentasGenerales() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVentasGenerales==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVentasGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasGenerales,false,this);
				} else {
					this.jInternalFrameOrderByVentasGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasGenerales,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVentasGenerales);
				this.jInternalFrameOrderByVentasGenerales.setVisible(false);
				this.jInternalFrameOrderByVentasGenerales.setSelected(false);
				
				this.jInternalFrameOrderByVentasGenerales.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentasGenerales"));
				
				this.inicializarActualizarBindingTablaOrderByVentasGenerales();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVentasGenerales() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVentasGenerales==null) {
				
				this.jInternalFrameImportacionVentasGenerales=new ImportacionJInternalFrame(VentasGeneralesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentasGenerales);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVentasGenerales);
				this.jInternalFrameImportacionVentasGenerales.setVisible(false);
				this.jInternalFrameImportacionVentasGenerales.setSelected(false);


				this.jInternalFrameImportacionVentasGenerales.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentasGenerales"));
				this.jInternalFrameImportacionVentasGenerales.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentasGenerales"));
				this.jInternalFrameImportacionVentasGenerales.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentasGenerales"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVentasGenerales() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVentasGenerales==null) {
				this.jInternalFrameReporteDinamicoVentasGenerales=new ReporteDinamicoJInternalFrame(VentasGeneralesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentasGenerales);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentasGenerales);
				this.jInternalFrameReporteDinamicoVentasGenerales.setVisible(false);
				this.jInternalFrameReporteDinamicoVentasGenerales.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVentasGenerales.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasGenerales"));
				this.jInternalFrameReporteDinamicoVentasGenerales.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasGenerales"));
				this.jInternalFrameReporteDinamicoVentasGenerales.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasGenerales"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasGenerales();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVentasGenerales() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentasGenerales);
			
	       	this.jInternalFrameDetalleFormVentasGenerales.setVisible(false);
	        this.jInternalFrameDetalleFormVentasGenerales.setSelected(false);
			
			//this.jInternalFrameDetalleFormVentasGenerales.dispose();
			//this.jInternalFrameDetalleFormVentasGenerales=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVentasGenerales() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVentasGenerales.setVisible(true);
	        this.jInternalFrameReporteDinamicoVentasGenerales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVentasGenerales() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVentasGenerales.setVisible(true);
	        this.jInternalFrameImportacionVentasGenerales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVentasGenerales() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVentasGenerales.setVisible(true);
	        this.jInternalFrameOrderByVentasGenerales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVentasGenerales() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVentasGenerales.setVisible(false);
	        this.jInternalFrameOrderByVentasGenerales.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVentasGenerales() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVentasGenerales.setVisible(false);
	        this.jInternalFrameReporteDinamicoVentasGenerales.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVentasGenerales() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVentasGenerales.setVisible(false);
	        this.jInternalFrameImportacionVentasGenerales.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVentasGenerales(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVentasGenerales(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVentasGenerales(true);
			//this.isEsNuevoVentasGenerales=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVentasGenerales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasGenerales(false) ;
			
			if(ventasgeneralesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VentasGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasGenerales(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasGenerales(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVentasGeneralesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVentasGenerales(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVentasGenerales(true);
			//this.isEsNuevoVentasGenerales=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ventasgenerales.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVentasGenerales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVentasGenerales(false) ;
			
			if(VentasGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentasGenerales(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasGenerales(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVentasGenerales(false);
			
			//if(!this.isEsNuevoVentasGenerales) {								
				int intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VentasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVentasGenerales(this.ventasgenerales,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
				
			}
			
			if(this.permiteMantenimiento(this.ventasgenerales)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVentasGenerales=true;
					this.inicializarActualizarBindingTablaVentasGenerales(false);
					this.isEsNuevoVentasGenerales=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVentasGenerales=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVentasGenerales=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentasGenerales(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasGenerales(false);
				
				this.habilitarDeshabilitarControlesVentasGenerales(false);
			
												
				
				if(VentasGeneralesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVentasGenerales();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVentasGeneralesActionPerformed(evt,ventasgeneralesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVentasGenerales(this.ventasgenerales,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVentasGenerales.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ventasgeneralesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ventasgenerales.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VentasGenerales.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasGenerales.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				this.ventasgenerales.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				this.ventasgenerales.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ventasgenerales)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VentasGeneralesModel) this.jTableDatosVentasGenerales.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVentasGenerales=true;
				this.inicializarActualizarBindingTablaVentasGenerales(false);
				this.isEsNuevoVentasGenerales=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentasGenerales(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasGenerales(false);
				
				this.habilitarDeshabilitarControlesVentasGenerales(false);
				
				
				
				if(VentasGeneralesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVentasGenerales();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVentasGenerales.getRowCount()>=1) {
				jTableDatosVentasGenerales.removeRowSelectionInterval(0, jTableDatosVentasGenerales.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVentasGenerales(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVentasGenerales(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentasGenerales(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentasGenerales(false) ;
			
			this.isEsNuevoVentasGenerales=false;
			
			if(VentasGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVentasGenerales();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVentasGenerales(false);
				
				//SI ES MANUAL
				if(VentasGeneralesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVentasGenerales();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVentasGenerales--;			
			//VentasGenerales ventasgeneralesAux= new VentasGenerales();			
			//ventasgeneralesAux.setId(this.iIdNuevoVentasGenerales);
			
			if(this.jInternalFrameDetalleFormVentasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVentasGenerales();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
			
			this.ventasgenerales.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ventasgeneralesLogic.getVentasGeneraless().add(this.ventasgeneralesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ventasgeneraless.add(this.ventasgeneralesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVentasGenerales(false);
			
			this.jTableDatosVentasGenerales.setRowSelectionInterval(this.getIndiceNuevoVentasGenerales(), this.getIndiceNuevoVentasGenerales());
			
			int iLastRow =  this.jTableDatosVentasGenerales.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVentasGenerales.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVentasGenerales.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVentasGenerales(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVentasGenerales(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasGenerales(false);
			
			//SI ES MANUAL
			if(VentasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasGenerales();
			}
			
			//this.abrirFrameTreeVentasGenerales();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVentasGenerales.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVentasGenerales.setFileImportacion(this.jInternalFrameImportacionVentasGenerales.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVentasGenerales.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVentasGenerales.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVentasGenerales.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVentasGenerales.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<VentasGenerales> ventasgeneralessSeleccionados=new ArrayList<VentasGenerales>();		

		ventasgeneralessSeleccionados=this.getVentasGeneralessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VentasGeneralesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VentasGeneralesBaseDesign.jrxml";
			
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
			
			this.generarReporteVentasGeneraless("Todos",ventasgeneralessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Generales",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoVentasGenerales.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasGenerales.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasGeneralesConstantesFunciones.LABEL_MONTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasGeneralesConstantesFunciones.LABEL_NOTASCREDITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tasCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tasCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tasCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tasCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasGeneralesConstantesFunciones.LABEL_VENTANETA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntaNeta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntaNeta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntaNeta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntaNeta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasGeneralesConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasGeneralesConstantesFunciones.LABEL_ACUMULADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_umulado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_umulado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_umulado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_umulado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentasGeneralesConstantesFunciones.LABEL_TIPO:
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
		
		if(this.jInternalFrameReporteDinamicoVentasGenerales.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case VentasGeneralesConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoria="monto";
					break;

				case VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;

				case VentasGeneralesConstantesFunciones.LABEL_NOTASCREDITO:
					sNombreCampoCategoria="notas_credito";
					break;

				case VentasGeneralesConstantesFunciones.LABEL_VENTANETA:
					sNombreCampoCategoria="venta_neta";
					break;

				case VentasGeneralesConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case VentasGeneralesConstantesFunciones.LABEL_ACUMULADO:
					sNombreCampoCategoria="acumulado";
					break;

				case VentasGeneralesConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoria="tipo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case VentasGeneralesConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoriaValor="monto";
					break;

				case VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;

				case VentasGeneralesConstantesFunciones.LABEL_NOTASCREDITO:
					sNombreCampoCategoriaValor="notas_credito";
					break;

				case VentasGeneralesConstantesFunciones.LABEL_VENTANETA:
					sNombreCampoCategoriaValor="venta_neta";
					break;

				case VentasGeneralesConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case VentasGeneralesConstantesFunciones.LABEL_ACUMULADO:
					sNombreCampoCategoriaValor="acumulado";
					break;

				case VentasGeneralesConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoriaValor="tipo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVentasGenerales.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasGenerales.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case VentasGeneralesConstantesFunciones.LABEL_MONTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto");
					break;

				case VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_producto");
					break;

				case VentasGeneralesConstantesFunciones.LABEL_NOTASCREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Notas Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"notas_credito");
					break;

				case VentasGeneralesConstantesFunciones.LABEL_VENTANETA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Venta Neta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"venta_neta");
					break;

				case VentasGeneralesConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case VentasGeneralesConstantesFunciones.LABEL_ACUMULADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Acumulado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"acumulado");
					break;

				case VentasGeneralesConstantesFunciones.LABEL_TIPO:
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
	
	public void jButtonGenerarExcelReporteDinamicoVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<VentasGenerales> ventasgeneralessSeleccionados=new ArrayList<VentasGenerales>();		
		
		ventasgeneralessSeleccionados=this.getVentasGeneralessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasgenerales";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("VentasGeneraless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVentasGenerales.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVentasGenerales.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VentasGeneralesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(VentasGenerales ventasgenerales:ventasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasgenerales.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(VentasGenerales ventasgenerales:ventasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasgenerales.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(VentasGenerales ventasgenerales:ventasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasgenerales.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(VentasGenerales ventasgenerales:ventasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasgenerales.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasGeneralesConstantesFunciones.LABEL_MONTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_MONTO);
					iRow++;

					for(VentasGenerales ventasgenerales:ventasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasgenerales.getmonto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(VentasGenerales ventasgenerales:ventasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasgenerales.getcodigo_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasGeneralesConstantesFunciones.LABEL_NOTASCREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_NOTASCREDITO);
					iRow++;

					for(VentasGenerales ventasgenerales:ventasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasgenerales.getnotas_credito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasGeneralesConstantesFunciones.LABEL_VENTANETA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_VENTANETA);
					iRow++;

					for(VentasGenerales ventasgenerales:ventasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasgenerales.getventa_neta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasGeneralesConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(VentasGenerales ventasgenerales:ventasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasgenerales.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasGeneralesConstantesFunciones.LABEL_ACUMULADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_ACUMULADO);
					iRow++;

					for(VentasGenerales ventasgenerales:ventasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasgenerales.getacumulado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentasGeneralesConstantesFunciones.LABEL_TIPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_TIPO);
					iRow++;

					for(VentasGenerales ventasgenerales:ventasgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventasgenerales.gettipo());
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
			//	this.getFilaCabeceraExportarExcelVentasGenerales(row);				
			//	iRow++;
			//}				
			
			//for(VentasGenerales ventasgeneralesAux:ventasgeneralessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVentasGenerales(ventasgeneralesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Generales",JOptionPane.INFORMATION_MESSAGE);
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
				this.ventasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasGenerales(false);
			
			//SI ES MANUAL
			if(VentasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentasGenerales();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasGenerales(false);
			
			//SI ES MANUAL
			if(VentasGeneralesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentasGenerales();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentasGenerales(false);
			
			//SI ES MANUAL
			if(VentasGeneralesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentasGenerales();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVentasGenerales() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVentasGenerales.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVentasGenerales.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVentasGenerales.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVentasGenerales.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVentasGenerales.setMinimumSize(dimensionMinimum);
		this.jTableDatosVentasGenerales.setMaximumSize(dimensionMaximum);
		this.jTableDatosVentasGenerales.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVentasGenerales(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVentasGenerales(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVentasGenerales(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVentasGenerales(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVentasGenerales(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVentasGenerales(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasGenerales(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVentasGenerales(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VentasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VentasGeneralesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVentasGenerales() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVentasGenerales();
		
		this.inicializarActualizarBindingBotonesManualVentasGenerales(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVentasGenerales();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentasGenerales() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVentasGenerales(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVentasGenerales(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVentasGenerales.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVentasGenerales.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVentasGenerales.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVentasGenerales.jCheckBoxPostAccionNuevoVentasGenerales.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVentasGenerales.jCheckBoxPostAccionSinCerrarVentasGenerales.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVentasGenerales.jCheckBoxPostAccionSinMensajeVentasGenerales.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVentasGenerales.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVentasGenerales.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVentasGenerales.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
				this.jInternalFrameDetalleFormVentasGenerales.jCheckBoxPostAccionNuevoVentasGenerales.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVentasGenerales.jCheckBoxPostAccionSinCerrarVentasGenerales.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVentasGenerales.jCheckBoxPostAccionSinMensajeVentasGenerales.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVentasGenerales.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVentasGenerales.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVentasGenerales.jComboBoxTiposAccionesFormularioVentasGenerales.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVentasGenerales.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVentasGenerales!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVentasGenerales.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVentasGenerales.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVentasGenerales.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVentasGenerales.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVentasGenerales!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVentasGenerales.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVentasGenerales.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVentasGenerales(Boolean esInicializar) throws Exception {
		try	{	
			if(VentasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVentasGenerales(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVentasGenerales() throws Exception {
		try	{
			if(VentasGeneralesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVentasGenerales();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentasGenerales() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVentasGenerales.jComboBoxTiposAccionesFormularioVentasGenerales.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVentasGenerales.jComboBoxTiposAccionesFormularioVentasGenerales.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVentasGenerales() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVentasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVentasGenerales.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVentasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVentasGenerales.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVentasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVentasGenerales.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVentasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVentasGenerales.addItem(reporte);
			}
			
			
			if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVentasGenerales.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVentasGenerales.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVentasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVentasGenerales.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVentasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVentasGenerales.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVentasGenerales.jComboBoxTiposAccionesFormularioVentasGenerales.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVentasGenerales.jComboBoxTiposAccionesFormularioVentasGenerales.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVentasGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVentasGenerales.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVentasGenerales.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasGenerales();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentasGenerales() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentasGenerales!=null) {
				this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentasGenerales!=null) {
				this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVentasGenerales!=null) {
				
				if(this.jInternalFrameReporteDinamicoVentasGenerales.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentasGenerales.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasGenerales.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVentasGenerales.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentasGenerales.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasGenerales.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=VentasGeneralesConstantesFunciones.getTiposSeleccionarVentasGenerales(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=VentasGeneralesConstantesFunciones.getTiposSeleccionarVentasGenerales(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoVentasGenerales.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentasGenerales.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=VentasGeneralesConstantesFunciones.getTiposSeleccionarVentasGenerales(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentasGenerales.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoVentasGenerales.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVentasGenerales()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_emision_desdeBusquedaVentasGenerales=new Date(this.jDateChooserfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales.getDate().getTime());
		this.fecha_emision_hastaBusquedaVentasGenerales=new Date(this.jDateChooserfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVentasGenerales(Boolean esInicializar) throws Exception {				
		if(VentasGeneralesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVentasGenerales();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVentasGenerales() throws Exception {
		this.inicializarActualizarBindingTablaVentasGenerales(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVentasGenerales() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVentasGenerales.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVentasGenerales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasGenerales.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VentasGeneralesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVentasGenerales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasGenerales.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VentasGeneralesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVentasGeneralesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasGeneralesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VentasGeneralesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVentasGenerales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentasGenerales.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VentasGeneralesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVentasGenerales.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVentasGenerales(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ventasgeneralesLogic.getVentasGeneraless().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ventasgeneraless.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VentasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVentasGenerales.setModel(new VentasGeneralesModel(this.ventasgeneralesLogic.getVentasGeneraless(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVentasGenerales.setModel(new VentasGeneralesModel(this.ventasgeneraless,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVentasGenerales!=null && this.jInternalFrameOrderByVentasGenerales.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVentasGenerales();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVentasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasGenerales,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VentasGeneralesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO,ventasgeneralesConstantesFunciones.resaltarSeleccionarVentasGenerales,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO,ventasgeneralesConstantesFunciones.resaltarSeleccionarVentasGenerales,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVentasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasGenerales,VentasGeneralesConstantesFunciones.LABEL_ID));

		if(this.ventasgeneralesConstantesFunciones.mostraridVentasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasGeneralesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasgeneralesConstantesFunciones.resaltaridVentasGenerales,this.ventasgeneralesConstantesFunciones.activaridVentasGenerales,iSizeTabla,this,true,"idVentasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasgeneralesConstantesFunciones.resaltaridVentasGenerales,this.ventasgeneralesConstantesFunciones.activaridVentasGenerales,this,true,"idVentasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasGenerales,VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.ventasgeneralesConstantesFunciones.mostrarnombre_productoVentasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasgeneralesConstantesFunciones.resaltarnombre_productoVentasGenerales,this.ventasgeneralesConstantesFunciones.activarnombre_productoVentasGenerales,iSizeTabla,this,true,"nombre_productoVentasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasgeneralesConstantesFunciones.resaltarnombre_productoVentasGenerales,this.ventasgeneralesConstantesFunciones.activarnombre_productoVentasGenerales,this,true,"nombre_productoVentasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasGenerales,VentasGeneralesConstantesFunciones.LABEL_MONTO));

		if(this.ventasgeneralesConstantesFunciones.mostrarmontoVentasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasGeneralesConstantesFunciones.LABEL_MONTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasgeneralesConstantesFunciones.resaltarmontoVentasGenerales,this.ventasgeneralesConstantesFunciones.activarmontoVentasGenerales,iSizeTabla,this,true,"montoVentasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasgeneralesConstantesFunciones.resaltarmontoVentasGenerales,this.ventasgeneralesConstantesFunciones.activarmontoVentasGenerales,this,true,"montoVentasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasGenerales,VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.ventasgeneralesConstantesFunciones.mostrarcodigo_productoVentasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasgeneralesConstantesFunciones.resaltarcodigo_productoVentasGenerales,this.ventasgeneralesConstantesFunciones.activarcodigo_productoVentasGenerales,iSizeTabla,this,true,"codigo_productoVentasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasgeneralesConstantesFunciones.resaltarcodigo_productoVentasGenerales,this.ventasgeneralesConstantesFunciones.activarcodigo_productoVentasGenerales,this,true,"codigo_productoVentasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasGenerales,VentasGeneralesConstantesFunciones.LABEL_NOTASCREDITO));

		if(this.ventasgeneralesConstantesFunciones.mostrarnotas_creditoVentasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasGeneralesConstantesFunciones.LABEL_NOTASCREDITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasgeneralesConstantesFunciones.resaltarnotas_creditoVentasGenerales,this.ventasgeneralesConstantesFunciones.activarnotas_creditoVentasGenerales,iSizeTabla,this,true,"notas_creditoVentasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasgeneralesConstantesFunciones.resaltarnotas_creditoVentasGenerales,this.ventasgeneralesConstantesFunciones.activarnotas_creditoVentasGenerales,this,true,"notas_creditoVentasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasGenerales,VentasGeneralesConstantesFunciones.LABEL_VENTANETA));

		if(this.ventasgeneralesConstantesFunciones.mostrarventa_netaVentasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasGeneralesConstantesFunciones.LABEL_VENTANETA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasgeneralesConstantesFunciones.resaltarventa_netaVentasGenerales,this.ventasgeneralesConstantesFunciones.activarventa_netaVentasGenerales,iSizeTabla,this,true,"venta_netaVentasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasgeneralesConstantesFunciones.resaltarventa_netaVentasGenerales,this.ventasgeneralesConstantesFunciones.activarventa_netaVentasGenerales,this,true,"venta_netaVentasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasGenerales,VentasGeneralesConstantesFunciones.LABEL_PORCENTAJE));

		if(this.ventasgeneralesConstantesFunciones.mostrarporcentajeVentasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasGeneralesConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasgeneralesConstantesFunciones.resaltarporcentajeVentasGenerales,this.ventasgeneralesConstantesFunciones.activarporcentajeVentasGenerales,iSizeTabla,this,true,"porcentajeVentasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasgeneralesConstantesFunciones.resaltarporcentajeVentasGenerales,this.ventasgeneralesConstantesFunciones.activarporcentajeVentasGenerales,this,true,"porcentajeVentasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasGenerales,VentasGeneralesConstantesFunciones.LABEL_ACUMULADO));

		if(this.ventasgeneralesConstantesFunciones.mostraracumuladoVentasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasGeneralesConstantesFunciones.LABEL_ACUMULADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventasgeneralesConstantesFunciones.resaltaracumuladoVentasGenerales,this.ventasgeneralesConstantesFunciones.activaracumuladoVentasGenerales,iSizeTabla,this,true,"acumuladoVentasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasgeneralesConstantesFunciones.resaltaracumuladoVentasGenerales,this.ventasgeneralesConstantesFunciones.activaracumuladoVentasGenerales,this,true,"acumuladoVentasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentasGenerales,VentasGeneralesConstantesFunciones.LABEL_TIPO));

		if(this.ventasgeneralesConstantesFunciones.mostrartipoVentasGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentasGeneralesConstantesFunciones.LABEL_TIPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventasgeneralesConstantesFunciones.resaltartipoVentasGenerales,this.ventasgeneralesConstantesFunciones.activartipoVentasGenerales,iSizeTabla,this,true,"tipoVentasGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventasgeneralesConstantesFunciones.resaltartipoVentasGenerales,this.ventasgeneralesConstantesFunciones.activartipoVentasGenerales,this,true,"tipoVentasGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentasGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentasGenerales.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentasGenerales.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVentasGenerales && this.isPermisoGuardarCambiosVentasGenerales) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ventasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ventasgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVentasGenerales.addColumn(tableColumn);
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
			
			this.jTableDatosVentasGenerales.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentasGenerales && this.isPermisoGuardarCambiosVentasGenerales) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentasGenerales && this.isPermisoGuardarCambiosVentasGenerales) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVentasGenerales.moveColumn(this.jTableDatosVentasGenerales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVentasGenerales.moveColumn(this.jTableDatosVentasGenerales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVentasGenerales.moveColumn(this.jTableDatosVentasGenerales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVentasGenerales.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVentasGenerales.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVentasGenerales,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VentasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVentasGenerales.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVentasGenerales.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VentasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VentasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVentasGenerales.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVentasGenerales.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVentasGenerales.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=ventasgeneralesLogic.getVentasGeneraless().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ventasgeneraless.size()-1;
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
		//this.jTableDatosVentasGenerales.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVentasGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVentasGenerales();
			
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
				
				//this.isEsNuevoVentasGenerales=false;
					
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
			
				if(this.ventasgeneralesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVentasGenerales==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentasGenerales.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentasGenerales.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ventasgenerales.getsType().equals("DUPLICADO")
				   || this.ventasgenerales.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVentasGenerales=true;
				
				} else {
					this.isEsNuevoVentasGenerales=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
					if(this.ventasgenerales.getId()>=0 && !this.ventasgenerales.getIsNew()) {						
						this.isEsNuevoVentasGenerales=false;
						
					} else {
						this.isEsNuevoVentasGenerales=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVentasGenerales(esRelaciones);						
				
				this.seleccionarVentasGenerales(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ventasgenerales.getId()<0) {
					this.isEsNuevoVentasGenerales=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVentasGenerales(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVentasGenerales(evt,rowIndex);
				}	
				
				if(this.ventasgeneralesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VentasGenerales: " + this.dDif); 
					}
				}								
				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVentasGenerales(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ventasgenerales)) {
					if(this.ventasgenerales.getId()>0) {
						this.ventasgenerales.setIsDeleted(true);
						
						this.ventasgeneralessEliminados.add(this.ventasgenerales);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventasgeneralesLogic.getVentasGeneraless().remove(this.ventasgenerales);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventasgeneraless.remove(this.ventasgenerales);				
					}
					
					
					((VentasGeneralesModel) this.jTableDatosVentasGenerales.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVentasGenerales(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVentasGenerales(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVentasGenerales) {
			
			if(this.jInternalFrameDetalleFormVentasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentasGenerales.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentasGenerales.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VentasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVentasGenerales(this.ventasgenerales);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVentasGenerales("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVentasGenerales(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentasGenerales() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentasGenerales(VentasGenerales ventasgenerales) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVentasGenerales(ventasgenerales,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentasGenerales(VentasGenerales ventasgenerales,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVentasGenerales(ventasgenerales);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVentasGenerales(ventasgenerales,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVentasGenerales(ventasgenerales);
	}
	
	public void setVariablesObjetoActualToFormularioVentasGenerales(VentasGenerales ventasgenerales) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVentasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVentasGenerales.jLabelidVentasGenerales.setText(ventasgenerales.getId().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextAreanombre_productoVentasGenerales.setText(ventasgenerales.getnombre_producto());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldmontoVentasGenerales.setText(ventasgenerales.getmonto().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldcodigo_productoVentasGenerales.setText(ventasgenerales.getcodigo_producto());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldnotas_creditoVentasGenerales.setText(ventasgenerales.getnotas_credito().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldventa_netaVentasGenerales.setText(ventasgenerales.getventa_neta().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldporcentajeVentasGenerales.setText(ventasgenerales.getporcentaje().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldacumuladoVentasGenerales.setText(ventasgenerales.getacumulado().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldtipoVentasGenerales.setText(ventasgenerales.gettipo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,VentasGenerales ventasgeneralesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ventasgeneralesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VentasGenerales ventasgeneralesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ventasgeneralesLocal=this.ventasgenerales;
			} else {
				ventasgeneralesLocal=this.ventasgeneralesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ventasgeneralesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVentasGenerales(ventasgeneralesLocal,true);
					
					if(ventasgeneralesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ventasgeneralesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ventasgeneralesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVentasGenerales(VentasGenerales ventasgenerales,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentasGenerales(ventasgenerales,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(ventasgenerales);
	}
	
	public void setVariablesFormularioToObjetoActualVentasGenerales(VentasGenerales ventasgenerales,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentasGenerales(ventasgenerales,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVentasGenerales(VentasGenerales ventasgenerales,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVentasGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVentasGenerales.jLabelidVentasGenerales.getText()==null || this.jInternalFrameDetalleFormVentasGenerales.jLabelidVentasGenerales.getText()=="" || this.jInternalFrameDetalleFormVentasGenerales.jLabelidVentasGenerales.getText()=="Id") {
				this.jInternalFrameDetalleFormVentasGenerales.jLabelidVentasGenerales.setText("0");
			}

			if(conColumnasBase) {ventasgenerales.setId(Long.parseLong(this.jInternalFrameDetalleFormVentasGenerales.jLabelidVentasGenerales.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasGeneralesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasGenerales.jLabelIdVentasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasgenerales.setnombre_producto(this.jInternalFrameDetalleFormVentasGenerales.jTextAreanombre_productoVentasGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasGenerales.jLabelnombre_productoVentasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasgenerales.setmonto(Double.parseDouble(this.jInternalFrameDetalleFormVentasGenerales.jTextFieldmontoVentasGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasGeneralesConstantesFunciones.LABEL_MONTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasGenerales.jLabelmontoVentasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasgenerales.setcodigo_producto(this.jInternalFrameDetalleFormVentasGenerales.jTextFieldcodigo_productoVentasGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasGenerales.jLabelcodigo_productoVentasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasgenerales.setnotas_credito(Double.parseDouble(this.jInternalFrameDetalleFormVentasGenerales.jTextFieldnotas_creditoVentasGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasGeneralesConstantesFunciones.LABEL_NOTASCREDITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasGenerales.jLabelnotas_creditoVentasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasgenerales.setventa_neta(Double.parseDouble(this.jInternalFrameDetalleFormVentasGenerales.jTextFieldventa_netaVentasGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasGeneralesConstantesFunciones.LABEL_VENTANETA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasGenerales.jLabelventa_netaVentasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasgenerales.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormVentasGenerales.jTextFieldporcentajeVentasGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasGeneralesConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasGenerales.jLabelporcentajeVentasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasgenerales.setacumulado(Double.parseDouble(this.jInternalFrameDetalleFormVentasGenerales.jTextFieldacumuladoVentasGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasGeneralesConstantesFunciones.LABEL_ACUMULADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasGenerales.jLabelacumuladoVentasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventasgenerales.settipo(this.jInternalFrameDetalleFormVentasGenerales.jTextFieldtipoVentasGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentasGeneralesConstantesFunciones.LABEL_TIPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentasGenerales.jLabeltipoVentasGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentasGenerales(VentasGenerales ventasgeneralesBean,VentasGenerales ventasgenerales,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVentasGenerales(VentasGenerales ventasgeneralesOrigen,VentasGenerales ventasgenerales,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventasgeneralesOrigen.getId()!=null && !ventasgeneralesOrigen.getId().equals(0L))) {ventasgenerales.setId(ventasgeneralesOrigen.getId());}}
			if(conDefault || (!conDefault && ventasgeneralesOrigen.getfecha_emision_desde()!=null && !ventasgeneralesOrigen.getfecha_emision_desde().equals(new Date()))) {ventasgenerales.setfecha_emision_desde(ventasgeneralesOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && ventasgeneralesOrigen.getfecha_emision_hasta()!=null && !ventasgeneralesOrigen.getfecha_emision_hasta().equals(new Date()))) {ventasgenerales.setfecha_emision_hasta(ventasgeneralesOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && ventasgeneralesOrigen.getnombre_producto()!=null && !ventasgeneralesOrigen.getnombre_producto().equals(""))) {ventasgenerales.setnombre_producto(ventasgeneralesOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && ventasgeneralesOrigen.getmonto()!=null && !ventasgeneralesOrigen.getmonto().equals(0.0))) {ventasgenerales.setmonto(ventasgeneralesOrigen.getmonto());}
			if(conDefault || (!conDefault && ventasgeneralesOrigen.getcodigo_producto()!=null && !ventasgeneralesOrigen.getcodigo_producto().equals(""))) {ventasgenerales.setcodigo_producto(ventasgeneralesOrigen.getcodigo_producto());}
			if(conDefault || (!conDefault && ventasgeneralesOrigen.getnotas_credito()!=null && !ventasgeneralesOrigen.getnotas_credito().equals(0.0))) {ventasgenerales.setnotas_credito(ventasgeneralesOrigen.getnotas_credito());}
			if(conDefault || (!conDefault && ventasgeneralesOrigen.getventa_neta()!=null && !ventasgeneralesOrigen.getventa_neta().equals(0.0))) {ventasgenerales.setventa_neta(ventasgeneralesOrigen.getventa_neta());}
			if(conDefault || (!conDefault && ventasgeneralesOrigen.getporcentaje()!=null && !ventasgeneralesOrigen.getporcentaje().equals(0.0))) {ventasgenerales.setporcentaje(ventasgeneralesOrigen.getporcentaje());}
			if(conDefault || (!conDefault && ventasgeneralesOrigen.getacumulado()!=null && !ventasgeneralesOrigen.getacumulado().equals(0.0))) {ventasgenerales.setacumulado(ventasgeneralesOrigen.getacumulado());}
			if(conDefault || (!conDefault && ventasgeneralesOrigen.gettipo()!=null && !ventasgeneralesOrigen.gettipo().equals(""))) {ventasgenerales.settipo(ventasgeneralesOrigen.gettipo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentasGenerales(VentasGenerales ventasgenerales) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentasGenerales.jLabelidVentasGenerales.setText(ventasgenerales.getId().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextAreanombre_productoVentasGenerales.setText(ventasgenerales.getnombre_producto());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldmontoVentasGenerales.setText(ventasgenerales.getmonto().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldcodigo_productoVentasGenerales.setText(ventasgenerales.getcodigo_producto());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldnotas_creditoVentasGenerales.setText(ventasgenerales.getnotas_credito().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldventa_netaVentasGenerales.setText(ventasgenerales.getventa_neta().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldporcentajeVentasGenerales.setText(ventasgenerales.getporcentaje().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldacumuladoVentasGenerales.setText(ventasgenerales.getacumulado().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldtipoVentasGenerales.setText(ventasgenerales.gettipo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentasGenerales(VentasGeneralesBean ventasgeneralesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentasGenerales.jLabelidVentasGenerales.setText(ventasgeneralesBean.getId().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextAreanombre_productoVentasGenerales.setText(ventasgeneralesBean.getnombre_producto());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldmontoVentasGenerales.setText(ventasgeneralesBean.getmonto().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldcodigo_productoVentasGenerales.setText(ventasgeneralesBean.getcodigo_producto());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldnotas_creditoVentasGenerales.setText(ventasgeneralesBean.getnotas_credito().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldventa_netaVentasGenerales.setText(ventasgeneralesBean.getventa_neta().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldporcentajeVentasGenerales.setText(ventasgeneralesBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldacumuladoVentasGenerales.setText(ventasgeneralesBean.getacumulado().toString());
			this.jInternalFrameDetalleFormVentasGenerales.jTextFieldtipoVentasGenerales.setText(ventasgeneralesBean.gettipo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVentasGenerales(VentasGeneralesParameterReturnGeneral ventasgeneralesReturnGeneral,VentasGeneralesBean ventasgeneralesBean,Boolean conDefault) throws Exception { 
		try {
			VentasGenerales ventasgeneralesLocal=new VentasGenerales();
			
			ventasgeneralesLocal=ventasgeneralesReturnGeneral.getVentasGenerales();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventasgeneralesLocal.getId()!=null && !ventasgeneralesLocal.getId().equals(0L))) {ventasgeneralesBean.setId(ventasgeneralesLocal.getId());}}
			if(conDefault || (!conDefault && ventasgeneralesLocal.getnombre_producto()!=null && !ventasgeneralesLocal.getnombre_producto().equals(""))) {ventasgeneralesBean.setnombre_producto(ventasgeneralesLocal.getnombre_producto());}
			if(conDefault || (!conDefault && ventasgeneralesLocal.getmonto()!=null && !ventasgeneralesLocal.getmonto().equals(0.0))) {ventasgeneralesBean.setmonto(ventasgeneralesLocal.getmonto());}
			if(conDefault || (!conDefault && ventasgeneralesLocal.getcodigo_producto()!=null && !ventasgeneralesLocal.getcodigo_producto().equals(""))) {ventasgeneralesBean.setcodigo_producto(ventasgeneralesLocal.getcodigo_producto());}
			if(conDefault || (!conDefault && ventasgeneralesLocal.getnotas_credito()!=null && !ventasgeneralesLocal.getnotas_credito().equals(0.0))) {ventasgeneralesBean.setnotas_credito(ventasgeneralesLocal.getnotas_credito());}
			if(conDefault || (!conDefault && ventasgeneralesLocal.getventa_neta()!=null && !ventasgeneralesLocal.getventa_neta().equals(0.0))) {ventasgeneralesBean.setventa_neta(ventasgeneralesLocal.getventa_neta());}
			if(conDefault || (!conDefault && ventasgeneralesLocal.getporcentaje()!=null && !ventasgeneralesLocal.getporcentaje().equals(0.0))) {ventasgeneralesBean.setporcentaje(ventasgeneralesLocal.getporcentaje());}
			if(conDefault || (!conDefault && ventasgeneralesLocal.getacumulado()!=null && !ventasgeneralesLocal.getacumulado().equals(0.0))) {ventasgeneralesBean.setacumulado(ventasgeneralesLocal.getacumulado());}
			if(conDefault || (!conDefault && ventasgeneralesLocal.gettipo()!=null && !ventasgeneralesLocal.gettipo().equals(""))) {ventasgeneralesBean.settipo(ventasgeneralesLocal.gettipo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVentasGeneralesGenerico(Long idVentasGeneralesSeleccionado,JComboBox jComboBoxVentasGenerales,List<VentasGenerales> ventasgeneralessLocal)throws Exception {
		try {
			VentasGenerales  ventasgeneralesTemp=null;

			for(VentasGenerales ventasgeneralesAux:ventasgeneralessLocal) {
				if(ventasgeneralesAux.getId()!=null && ventasgeneralesAux.getId().equals(idVentasGeneralesSeleccionado)) {
					ventasgeneralesTemp=ventasgeneralesAux;
					break;
				}
			}

			jComboBoxVentasGenerales.setSelectedItem(ventasgeneralesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVentasGeneralesGenerico(JComboBox jComboBoxVentasGenerales,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVentasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVentasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentasGenerales.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVentasGenerales.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentasGenerales.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVentasGenerales.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVentasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVentasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventasgenerales=(VentasGenerales) ventasgeneralesLogic.getVentasGeneraless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventasgenerales =(VentasGenerales) ventasgeneraless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!ventasgenerales.getIsNew() && !ventasgenerales.getIsChanged() && !ventasgenerales.getIsDeleted()) {
				sDescripcion=ventasgenerales.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=ventasgenerales.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VentasGenerales ventasgeneralesRow=new VentasGenerales();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventasgeneralesRow=(VentasGenerales) ventasgeneralesLogic.getVentasGeneraless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventasgeneralesRow=(VentasGenerales) ventasgeneraless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVentasGenerales(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVentasGenerales.setVisible((this.isVisibilidadCeldaNuevoVentasGenerales && this.isPermisoNuevoVentasGenerales));			
			this.jButtonDuplicarVentasGenerales.setVisible((this.isVisibilidadCeldaDuplicarVentasGenerales && this.isPermisoDuplicarVentasGenerales));			
			this.jButtonCopiarVentasGenerales.setVisible((this.isVisibilidadCeldaCopiarVentasGenerales && this.isPermisoCopiarVentasGenerales));
			this.jButtonVerFormVentasGenerales.setVisible((this.isVisibilidadCeldaVerFormVentasGenerales && this.isPermisoVerFormVentasGenerales));
			
			this.jButtonAbrirOrderByVentasGenerales.setVisible((this.isVisibilidadCeldaOrdenVentasGenerales && this.isPermisoOrdenVentasGenerales));			
			
			this.jButtonNuevoRelacionesVentasGenerales.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasGenerales && this.isPermisoNuevoVentasGenerales));			
			this.jButtonNuevoGuardarCambiosVentasGenerales.setVisible((this.isVisibilidadCeldaNuevoVentasGenerales && this.isPermisoNuevoVentasGenerales && this.isPermisoGuardarCambiosVentasGenerales));
			
			if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
			this.jInternalFrameDetalleFormVentasGenerales.jButtonModificarVentasGenerales.setVisible((this.isVisibilidadCeldaModificarVentasGenerales && this.isPermisoActualizarVentasGenerales));	
			this.jInternalFrameDetalleFormVentasGenerales.jButtonActualizarVentasGenerales.setVisible((this.isVisibilidadCeldaActualizarVentasGenerales && this.isPermisoActualizarVentasGenerales));	
			this.jInternalFrameDetalleFormVentasGenerales.jButtonEliminarVentasGenerales.setVisible((this.isVisibilidadCeldaEliminarVentasGenerales && this.isPermisoEliminarVentasGenerales));
			this.jInternalFrameDetalleFormVentasGenerales.jButtonCancelarVentasGenerales.setVisible(this.isVisibilidadCeldaCancelarVentasGenerales);							
			this.jInternalFrameDetalleFormVentasGenerales.jButtonGuardarCambiosVentasGenerales.setVisible((this.isVisibilidadCeldaGuardarVentasGenerales && this.isPermisoGuardarCambiosVentasGenerales));			
			
			}
						
			this.jButtonGuardarCambiosTablaVentasGenerales.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasGenerales && this.isPermisoGuardarCambiosVentasGenerales));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVentasGenerales.setVisible((this.isVisibilidadCeldaNuevoVentasGenerales && this.isPermisoNuevoVentasGenerales));						
			this.jButtonDuplicarToolBarVentasGenerales.setVisible((this.isVisibilidadCeldaDuplicarVentasGenerales && this.isPermisoDuplicarVentasGenerales));						
			this.jButtonCopiarToolBarVentasGenerales.setVisible((this.isVisibilidadCeldaCopiarVentasGenerales && this.isPermisoCopiarVentasGenerales));			
			this.jButtonVerFormToolBarVentasGenerales.setVisible((this.isVisibilidadCeldaVerFormVentasGenerales && this.isPermisoVerFormVentasGenerales));			
			this.jButtonAbrirOrderByToolBarVentasGenerales.setVisible((this.isVisibilidadCeldaOrdenVentasGenerales && this.isPermisoOrdenVentasGenerales));
			this.jButtonNuevoRelacionesToolBarVentasGenerales.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasGenerales && this.isPermisoNuevoVentasGenerales));			
			this.jButtonNuevoGuardarCambiosToolBarVentasGenerales.setVisible((this.isVisibilidadCeldaNuevoVentasGenerales && this.isPermisoNuevoVentasGenerales && this.isPermisoGuardarCambiosVentasGenerales));			
			
			if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
			this.jInternalFrameDetalleFormVentasGenerales.jButtonModificarToolBarVentasGenerales.setVisible((this.isVisibilidadCeldaModificarVentasGenerales && this.isPermisoActualizarVentasGenerales));	
			this.jInternalFrameDetalleFormVentasGenerales.jButtonActualizarToolBarVentasGenerales.setVisible((this.isVisibilidadCeldaActualizarVentasGenerales  && this.isPermisoActualizarVentasGenerales));	
			this.jInternalFrameDetalleFormVentasGenerales.jButtonEliminarToolBarVentasGenerales.setVisible((this.isVisibilidadCeldaEliminarVentasGenerales && this.isPermisoEliminarVentasGenerales));
			this.jInternalFrameDetalleFormVentasGenerales.jButtonCancelarToolBarVentasGenerales.setVisible(this.isVisibilidadCeldaCancelarVentasGenerales);				
			this.jInternalFrameDetalleFormVentasGenerales.jButtonGuardarCambiosToolBarVentasGenerales.setVisible((this.isVisibilidadCeldaGuardarVentasGenerales && this.isPermisoGuardarCambiosVentasGenerales));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVentasGenerales.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasGenerales && this.isPermisoGuardarCambiosVentasGenerales));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVentasGenerales.setVisible((this.isVisibilidadCeldaNuevoVentasGenerales && this.isPermisoNuevoVentasGenerales));			
			this.jMenuItemDuplicarVentasGenerales.setVisible((this.isVisibilidadCeldaDuplicarVentasGenerales && this.isPermisoDuplicarVentasGenerales));			
			this.jMenuItemCopiarVentasGenerales.setVisible((this.isVisibilidadCeldaCopiarVentasGenerales && this.isPermisoCopiarVentasGenerales));			
			this.jMenuItemVerFormVentasGenerales.setVisible((this.isVisibilidadCeldaVerFormVentasGenerales && this.isPermisoVerFormVentasGenerales));			
			this.jMenuItemAbrirOrderByVentasGenerales.setVisible((this.isVisibilidadCeldaOrdenVentasGenerales && this.isPermisoOrdenVentasGenerales));			
			//this.jMenuItemMostrarOcultarVentasGenerales.setVisible((this.isVisibilidadCeldaOrdenVentasGenerales && this.isPermisoOrdenVentasGenerales));
			this.jMenuItemDetalleAbrirOrderByVentasGenerales.setVisible((this.isVisibilidadCeldaOrdenVentasGenerales && this.isPermisoOrdenVentasGenerales));			
			//this.jMenuItemDetalleMostrarOcultarVentasGenerales.setVisible((this.isVisibilidadCeldaOrdenVentasGenerales && this.isPermisoOrdenVentasGenerales));			
			this.jMenuItemNuevoRelacionesVentasGenerales.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentasGenerales && this.isPermisoNuevoVentasGenerales));			
			this.jMenuItemNuevoGuardarCambiosVentasGenerales.setVisible((this.isVisibilidadCeldaNuevoVentasGenerales && this.isPermisoNuevoVentasGenerales && this.isPermisoGuardarCambiosVentasGenerales));									
			
			if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
			this.jInternalFrameDetalleFormVentasGenerales.jMenuItemModificarVentasGenerales.setVisible((this.isVisibilidadCeldaModificarVentasGenerales && this.isPermisoActualizarVentasGenerales));	
			this.jInternalFrameDetalleFormVentasGenerales.jMenuItemActualizarVentasGenerales.setVisible((this.isVisibilidadCeldaActualizarVentasGenerales && this.isPermisoActualizarVentasGenerales));	
			this.jInternalFrameDetalleFormVentasGenerales.jMenuItemEliminarVentasGenerales.setVisible((this.isVisibilidadCeldaEliminarVentasGenerales && this.isPermisoEliminarVentasGenerales));
			this.jInternalFrameDetalleFormVentasGenerales.jMenuItemCancelarVentasGenerales.setVisible(this.isVisibilidadCeldaCancelarVentasGenerales);				
			}
			
			this.jMenuItemGuardarCambiosVentasGenerales.setVisible((this.isVisibilidadCeldaGuardarVentasGenerales && this.isPermisoGuardarCambiosVentasGenerales));						
			this.jMenuItemGuardarCambiosTablaVentasGenerales.setVisible((this.isVisibilidadCeldaGuardarCambiosVentasGenerales && this.isPermisoGuardarCambiosVentasGenerales));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVentasGenerales=this.jButtonNuevoVentasGenerales.isVisible();
			this.isVisibilidadCeldaDuplicarVentasGenerales=this.jButtonDuplicarVentasGenerales.isVisible();
			this.isVisibilidadCeldaCopiarVentasGenerales=this.jButtonCopiarVentasGenerales.isVisible();
			this.isVisibilidadCeldaVerFormVentasGenerales=this.jButtonVerFormVentasGenerales.isVisible();
			
			this.isVisibilidadCeldaOrdenVentasGenerales=this.jButtonAbrirOrderByVentasGenerales.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVentasGenerales=this.jButtonNuevoRelacionesVentasGenerales.isVisible();
			this.isVisibilidadCeldaModificarVentasGenerales=this.jButtonModificarVentasGenerales.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
			this.isVisibilidadCeldaActualizarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jButtonActualizarVentasGenerales.isVisible();
			this.isVisibilidadCeldaEliminarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jButtonEliminarVentasGenerales.isVisible();
			this.isVisibilidadCeldaCancelarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jButtonCancelarVentasGenerales.isVisible();
			this.isVisibilidadCeldaGuardarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jButtonGuardarCambiosVentasGenerales.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVentasGenerales=this.jButtonGuardarCambiosTablaVentasGenerales.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVentasGenerales=this.jButtonNuevoToolBarVentasGenerales.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentasGenerales=this.jButtonNuevoRelacionesToolBarVentasGenerales.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
			this.isVisibilidadCeldaModificarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jButtonModificarToolBarVentasGenerales.isVisible();
			this.isVisibilidadCeldaActualizarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jButtonActualizarToolBarVentasGenerales.isVisible();
			this.isVisibilidadCeldaEliminarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jButtonEliminarToolBarVentasGenerales.isVisible();
			this.isVisibilidadCeldaCancelarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jButtonCancelarToolBarVentasGenerales.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentasGenerales=this.jButtonGuardarCambiosToolBarVentasGenerales.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentasGenerales=this.jButtonGuardarCambiosTablaToolBarVentasGenerales.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVentasGenerales=this.jMenuItemNuevoVentasGenerales.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentasGenerales=this.jMenuItemNuevoRelacionesVentasGenerales.isVisible();
			
			if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
			this.isVisibilidadCeldaModificarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jMenuItemModificarVentasGenerales.isVisible();
			this.isVisibilidadCeldaActualizarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jMenuItemActualizarVentasGenerales.isVisible();
			this.isVisibilidadCeldaEliminarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jMenuItemEliminarVentasGenerales.isVisible();
			this.isVisibilidadCeldaCancelarVentasGenerales=this.jInternalFrameDetalleFormVentasGenerales.jMenuItemCancelarVentasGenerales.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentasGenerales=this.jMenuItemGuardarCambiosVentasGenerales.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentasGenerales=this.jMenuItemGuardarCambiosTablaVentasGenerales.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVentasGenerales(Boolean esInicializar) {
		if(VentasGeneralesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ventasgeneralesSessionBean.getConGuardarRelaciones()) {
				//if(this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVentasGenerales();
			}
			
			this.inicializarActualizarBindingBotonesManualVentasGenerales(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVentasGenerales() {
		this.jButtonNuevoVentasGenerales.setVisible(this.isPermisoNuevoVentasGenerales);			
		this.jButtonDuplicarVentasGenerales.setVisible(this.isPermisoDuplicarVentasGenerales);			
		this.jButtonCopiarVentasGenerales.setVisible(this.isPermisoCopiarVentasGenerales);			
		this.jButtonVerFormVentasGenerales.setVisible(this.isPermisoVerFormVentasGenerales);			
		
		this.jButtonAbrirOrderByVentasGenerales.setVisible(this.isPermisoOrdenVentasGenerales);					
		
		this.jButtonNuevoRelacionesVentasGenerales.setVisible(this.isPermisoNuevoVentasGenerales);			
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasGenerales.jButtonModificarVentasGenerales.setVisible(this.isPermisoActualizarVentasGenerales);	
			this.jInternalFrameDetalleFormVentasGenerales.jButtonActualizarVentasGenerales.setVisible(this.isPermisoActualizarVentasGenerales);	
			this.jInternalFrameDetalleFormVentasGenerales.jButtonEliminarVentasGenerales.setVisible(this.isPermisoEliminarVentasGenerales);
			this.jInternalFrameDetalleFormVentasGenerales.jButtonCancelarVentasGenerales.setVisible(this.isVisibilidadCeldaCancelarVentasGenerales);						
			this.jInternalFrameDetalleFormVentasGenerales.jButtonGuardarCambiosVentasGenerales.setVisible(this.isPermisoGuardarCambiosVentasGenerales);							
		}
		
		this.jButtonGuardarCambiosTablaVentasGenerales.setVisible(this.isPermisoActualizarVentasGenerales);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVentasGenerales() {
		this.jInternalFrameDetalleFormVentasGenerales.jButtonModificarVentasGenerales.setVisible(this.isPermisoActualizarVentasGenerales);	
		this.jInternalFrameDetalleFormVentasGenerales.jButtonActualizarVentasGenerales.setVisible(this.isPermisoActualizarVentasGenerales);	
		this.jInternalFrameDetalleFormVentasGenerales.jButtonEliminarVentasGenerales.setVisible(this.isPermisoEliminarVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jButtonCancelarVentasGenerales.setVisible(this.isVisibilidadCeldaCancelarVentasGenerales);							
		this.jInternalFrameDetalleFormVentasGenerales.jButtonGuardarCambiosVentasGenerales.setVisible((this.isVisibilidadCeldaGuardarVentasGenerales && this.isPermisoGuardarCambiosVentasGenerales));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVentasGenerales() {
		if(VentasGeneralesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVentasGenerales();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVentasGenerales() {
	}
	
	public void jTableDatosVentasGeneralesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVentasGenerales(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVentasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasGenerales(this.getventasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasgenerales==null) {
						this.ventasgenerales = new VentasGenerales();
					}

					this.setVariablesFormularioToObjetoActualVentasGenerales(this.ventasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
				}

				if(this.ventasgenerales.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ventasgenerales.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVentasGeneralesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVentasGenerales(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentasGenerales.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentasGenerales.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentasGenerales(this.getventasgenerales(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.ventasgeneralesLogic.getConnexion());

				if(this.ventasgenerales.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.ventasgenerales.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentasGenerales=(TitledBorder)this.jScrollPanelDatosVentasGenerales.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVentasGenerales.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVentasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasGenerales(this.getventasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasgenerales==null) {
						this.ventasgenerales = new VentasGenerales();
					}

					this.setVariablesFormularioToObjetoActualVentasGenerales(this.ventasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
				}

				if(this.ventasgenerales.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.ventasgenerales.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeVentasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasGenerales(this.getventasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasgenerales==null) {
						this.ventasgenerales = new VentasGenerales();
					}

					this.setVariablesFormularioToObjetoActualVentasGenerales(this.ventasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
				}

				if(this.ventasgenerales.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.ventasgenerales.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaVentasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasGenerales(this.getventasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasgenerales==null) {
						this.ventasgenerales = new VentasGenerales();
					}

					this.setVariablesFormularioToObjetoActualVentasGenerales(this.ventasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
				}

				if(this.ventasgenerales.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.ventasgenerales.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoVentasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasGenerales(this.getventasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasgenerales==null) {
						this.ventasgenerales = new VentasGenerales();
					}

					this.setVariablesFormularioToObjetoActualVentasGenerales(this.ventasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
				}

				if(this.ventasgenerales.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.ventasgenerales.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmontoVentasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasGenerales(this.getventasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasgenerales==null) {
						this.ventasgenerales = new VentasGenerales();
					}

					this.setVariablesFormularioToObjetoActualVentasGenerales(this.ventasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
				}

				if(this.ventasgenerales.getmonto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto = "+this.ventasgenerales.getmonto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoVentasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasGenerales(this.getventasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasgenerales==null) {
						this.ventasgenerales = new VentasGenerales();
					}

					this.setVariablesFormularioToObjetoActualVentasGenerales(this.ventasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
				}

				if(this.ventasgenerales.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.ventasgenerales.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnotas_creditoVentasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasGenerales(this.getventasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasgenerales==null) {
						this.ventasgenerales = new VentasGenerales();
					}

					this.setVariablesFormularioToObjetoActualVentasGenerales(this.ventasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
				}

				if(this.ventasgenerales.getnotas_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where notas_credito = "+this.ventasgenerales.getnotas_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonventa_netaVentasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasGenerales(this.getventasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasgenerales==null) {
						this.ventasgenerales = new VentasGenerales();
					}

					this.setVariablesFormularioToObjetoActualVentasGenerales(this.ventasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
				}

				if(this.ventasgenerales.getventa_neta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where venta_neta = "+this.ventasgenerales.getventa_neta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeVentasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasGenerales(this.getventasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasgenerales==null) {
						this.ventasgenerales = new VentasGenerales();
					}

					this.setVariablesFormularioToObjetoActualVentasGenerales(this.ventasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
				}

				if(this.ventasgenerales.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.ventasgenerales.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonacumuladoVentasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasGenerales(this.getventasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasgenerales==null) {
						this.ventasgenerales = new VentasGenerales();
					}

					this.setVariablesFormularioToObjetoActualVentasGenerales(this.ventasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
				}

				if(this.ventasgenerales.getacumulado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where acumulado = "+this.ventasgenerales.getacumulado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipoVentasGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentasGenerales(this.getventasgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventasgenerales==null) {
						this.ventasgenerales = new VentasGenerales();
					}

					this.setVariablesFormularioToObjetoActualVentasGenerales(this.ventasgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);
				}

				if(this.ventasgenerales.gettipo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo like '%"+this.ventasgenerales.gettipo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentasGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaVentasGeneralesVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasGenerales(false,false);

			this.getVentasGeneralessBusquedaVentasGenerales();

			this.inicializarActualizarBindingVentasGenerales(false);

			//if(VentasGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaVentasGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentasGenerales(false,false);

			this.getVentasGeneralessFK_IdEmpresa();

			this.inicializarActualizarBindingVentasGenerales(false);

			//if(VentasGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentasGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventasgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVentasGenerales() {
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
			this.jInternalFrameDetalleFormVentasGenerales.setVisible(false);	    			
			this.jInternalFrameDetalleFormVentasGenerales.dispose();
			this.jInternalFrameDetalleFormVentasGenerales=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVentasGenerales!=null) {
			this.jInternalFrameReporteDinamicoVentasGenerales.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVentasGenerales.dispose();
			this.jInternalFrameReporteDinamicoVentasGenerales=null;
		}
		
		if(this.jInternalFrameImportacionVentasGenerales!=null) {
			this.jInternalFrameImportacionVentasGenerales.setVisible(false);	    			
			this.jInternalFrameImportacionVentasGenerales.dispose();
			this.jInternalFrameImportacionVentasGenerales=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVentasGenerales();
			
			VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
			
			
			if(sTipo.equals("NuevoVentasGenerales")) {
				jButtonNuevoVentasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVentasGenerales")) {
				jButtonDuplicarVentasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVentasGenerales")) {
				jButtonCopiarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("VerFormVentasGenerales")) {
				jButtonVerFormVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVentasGenerales")) {
				jButtonNuevoVentasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVentasGenerales")) {
				jButtonDuplicarVentasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVentasGenerales")) {
				jButtonNuevoVentasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVentasGenerales")) {
				jButtonDuplicarVentasGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVentasGenerales")) {
				jButtonNuevoVentasGeneralesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVentasGenerales")) {
				jButtonNuevoVentasGeneralesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVentasGenerales")) {
				jButtonNuevoVentasGeneralesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVentasGenerales")) {
				jButtonModificarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVentasGenerales")) {
				jButtonModificarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVentasGenerales")) {
				jButtonModificarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVentasGenerales")) {
				jButtonActualizarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVentasGenerales")) {
				jButtonActualizarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVentasGenerales")) {
				jButtonActualizarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("EliminarVentasGenerales")) {
				jButtonEliminarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVentasGenerales")) {
				jButtonEliminarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVentasGenerales")) {
				jButtonEliminarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CancelarVentasGenerales")) {
				jButtonCancelarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVentasGenerales")) {
				jButtonCancelarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVentasGenerales")) {
				jButtonCancelarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CerrarVentasGenerales")) {
				jButtonCerrarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVentasGenerales")) {
				jButtonCerrarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVentasGenerales")) {
				jButtonCerrarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVentasGenerales")) {
				jButtonMostrarOcultarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVentasGenerales")) {
				jButtonCancelarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVentasGenerales")) {
				jButtonGuardarCambiosVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVentasGenerales")) {
				jButtonGuardarCambiosVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVentasGenerales")) {
				jButtonCopiarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVentasGenerales")) {
				jButtonVerFormVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVentasGenerales")) {
				jButtonGuardarCambiosVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVentasGenerales")) {
				jButtonCopiarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVentasGenerales")) {
				jButtonVerFormVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVentasGenerales")) {
				jButtonGuardarCambiosVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVentasGenerales")) {
				jButtonGuardarCambiosVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVentasGenerales")) {
				jButtonGuardarCambiosVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVentasGenerales")) {
				jButtonRecargarInformacionVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVentasGenerales")) {
				jButtonRecargarInformacionVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVentasGenerales")) {
				jButtonRecargarInformacionVentasGeneralesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVentasGenerales")) {
				jButtonAnterioresVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVentasGenerales")) {
				jButtonAnterioresVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVentasGenerales")) {
				jButtonAnterioresVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVentasGenerales")) {
				jButtonSiguientesVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVentasGenerales")) {
				jButtonSiguientesVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVentasGenerales")) {
				jButtonSiguientesVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVentasGenerales") || sTipo.equals("MenuItemDetalleAbrirOrderByVentasGenerales")) {
				jButtonAbrirOrderByVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVentasGenerales") || sTipo.equals("MenuItemDetalleMostrarOcultarVentasGenerales")) {
				jButtonMostrarOcultarVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVentasGenerales")) {
				jButtonNuevoGuardarCambiosVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVentasGenerales")) {
				jButtonNuevoGuardarCambiosVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVentasGenerales")) {
				jButtonNuevoGuardarCambiosVentasGeneralesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVentasGenerales")) {
				jButtonCerrarReporteDinamicoVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVentasGenerales")) {
				jButtonGenerarReporteDinamicoVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVentasGenerales")) {
				
				jButtonGenerarExcelReporteDinamicoVentasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVentasGenerales")) {
				jButtonCerrarImportacionVentasGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVentasGenerales")) {
				
				jButtonGenerarImportacionVentasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVentasGenerales")) {
				
				jButtonAbrirImportacionVentasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVentasGenerales")) {
				jComboBoxTiposAccionesVentasGeneralesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVentasGenerales")) {
				jComboBoxTiposRelacionesVentasGeneralesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVentasGenerales")) {
				jComboBoxTiposAccionesVentasGeneralesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVentasGenerales")) {
				
				jComboBoxTiposSeleccionarVentasGeneralesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVentasGenerales")) {
				jTextFieldValorCampoGeneralVentasGeneralesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVentasGenerales")) {
				jButtonAbrirOrderByVentasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVentasGenerales")) {
				jButtonAbrirOrderByVentasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVentasGenerales")) {
				jButtonCerrarOrderByVentasGeneralesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentasGeneralesBusqueda")) {
				this.jButtonidVentasGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentasGeneralesUpdate")) {
				this.jButtonid_empresaVentasGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentasGeneralesBusqueda")) {
				this.jButtonid_empresaVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeVentasGeneralesBusqueda")) {
				this.jButtonfecha_emision_desdeVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaVentasGeneralesBusqueda")) {
				this.jButtonfecha_emision_hastaVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoVentasGeneralesBusqueda")) {
				this.jButtonnombre_productoVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoVentasGeneralesBusqueda")) {
				this.jButtonmontoVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoVentasGeneralesBusqueda")) {
				this.jButtoncodigo_productoVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("notas_creditoVentasGeneralesBusqueda")) {
				this.jButtonnotas_creditoVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("venta_netaVentasGeneralesBusqueda")) {
				this.jButtonventa_netaVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeVentasGeneralesBusqueda")) {
				this.jButtonporcentajeVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("acumuladoVentasGeneralesBusqueda")) {
				this.jButtonacumuladoVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoVentasGeneralesBusqueda")) {
				this.jButtontipoVentasGeneralesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaVentasGeneralesVentasGenerales")) {
				this.jButtonBusquedaVentasGeneralesVentasGeneralesActionPerformed(evt);
			}
			
			;
			
			
			VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVentasGenerales();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasGeneralesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasgenerales);
				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
				
				


				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			VentasGenerales ventasgeneralesLocal=null;
			
			if(!this.getEsControlTabla()) {
				ventasgeneralesLocal=this.ventasgenerales;
			} else {
				ventasgeneralesLocal=this.ventasgeneralesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasgenerales);
				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
							
				
				


				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesAnterior =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasgeneralesAnterior =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
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
			
			VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
			
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
			
			


			
			VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasGeneralesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasgenerales);
				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
								
						
				


				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasGenerales.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasgenerales);
				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
								
				
				


				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesAnterior =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasgeneralesAnterior =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasgenerales);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesAnterior =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasgeneralesAnterior =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasGeneralesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasgenerales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventasgenerales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasgenerales);
				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
							
				
				


				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasGenerales.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasGeneralesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasgeneralesAnterior =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventasgeneralesAnterior =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
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
			
			VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
			
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
			
			


			
			VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasGeneralesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasgenerales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventasgenerales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasgenerales);
				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
								
				
				


				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesAnterior =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasgeneralesAnterior =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasGeneralesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasgenerales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventasgenerales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasGeneralesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasgenerales);
				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVentasGenerales")) {
					jCheckBoxSeleccionarTodosVentasGeneralesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVentasGenerales")) {
					jCheckBoxSeleccionadosVentasGeneralesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVentasGenerales")) {
					
				}
				
				


				
				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasgenerales);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ventasgenerales);
				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
												
				
				


				
				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasGeneralesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventasgeneralesAnterior =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventasgeneralesAnterior =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasGeneralesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasgenerales);
				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
				
				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
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
			
			VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
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
			
			


			
			VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentasGeneralesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasgenerales);
				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasGenerales.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasGenerales.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventasgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventasgenerales);
				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
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
				
				


				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentasGenerales.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentasGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentasGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventasgeneralesAnterior =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventasgeneralesAnterior =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVentasGenerales")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVentasGeneralesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVentasGenerales.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ventasgenerales =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ventasgenerales =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ventasgenerales);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVentasGenerales")) {
				
				}
				
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVentasGenerales")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVentasGenerales.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVentasGenerales")) {
			
			}
			
			VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVentasGenerales();
			
			VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
			
			if(sTipo.equals("NuevoVentasGenerales")) {
				jButtonNuevoVentasGeneralesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVentasGenerales")) {
				jButtonDuplicarVentasGeneralesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVentasGenerales")) {
				jButtonCopiarVentasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVentasGenerales")) {
				jButtonVerFormVentasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVentasGenerales")) {
				jButtonNuevoVentasGeneralesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVentasGenerales")) {
				jButtonModificarVentasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVentasGenerales")) {
				jButtonActualizarVentasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVentasGenerales")) {
				jButtonEliminarVentasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVentasGenerales")) {
				jButtonGuardarCambiosVentasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVentasGenerales")) {
				jButtonCancelarVentasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVentasGenerales")) {
				jButtonCerrarVentasGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVentasGenerales")) {
				jButtonGuardarCambiosVentasGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVentasGenerales")) {
				jButtonNuevoGuardarCambiosVentasGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVentasGenerales")) {
				jButtonAbrirOrderByVentasGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVentasGenerales")) {
				jButtonRecargarInformacionVentasGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVentasGenerales")) {
				jButtonAnterioresVentasGeneralesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVentasGenerales")) {
				jButtonSiguientesVentasGeneralesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentasGeneralesBusqueda")) {
				this.jButtonidVentasGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentasGeneralesUpdate")) {
				this.jButtonid_empresaVentasGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentasGeneralesBusqueda")) {
				this.jButtonid_empresaVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeVentasGeneralesBusqueda")) {
				this.jButtonfecha_emision_desdeVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaVentasGeneralesBusqueda")) {
				this.jButtonfecha_emision_hastaVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoVentasGeneralesBusqueda")) {
				this.jButtonnombre_productoVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoVentasGeneralesBusqueda")) {
				this.jButtonmontoVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoVentasGeneralesBusqueda")) {
				this.jButtoncodigo_productoVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("notas_creditoVentasGeneralesBusqueda")) {
				this.jButtonnotas_creditoVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("venta_netaVentasGeneralesBusqueda")) {
				this.jButtonventa_netaVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeVentasGeneralesBusqueda")) {
				this.jButtonporcentajeVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("acumuladoVentasGeneralesBusqueda")) {
				this.jButtonacumuladoVentasGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoVentasGeneralesBusqueda")) {
				this.jButtontipoVentasGeneralesBusquedaActionPerformed(evt);
			}
			
			VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVentasGenerales();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVentasGenerales")) {
				closingInternalFrameVentasGenerales();
				
			} else if(sTipo.equals("jButtonCancelarVentasGenerales")) {
				JInternalFrameBase jInternalFrameDetalleFormVentasGenerales = (JInternalFrameBase)evt.getSource();
	            	
	            VentasGeneralesBeanSwingJInternalFrame jInternalFrameParent=(VentasGeneralesBeanSwingJInternalFrame)jInternalFrameDetalleFormVentasGenerales.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVentasGeneralesActionPerformed(null);
			}
			
			VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventasgenerales,new Object(),this.ventasgeneralesParameterGeneral,this.ventasgeneralesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVentasGenerales(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVentasGenerales(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVentasGenerales(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ventasgenerales)) {
			if(!esControlTabla) {
				if(VentasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVentasGenerales(this.ventasgenerales,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);			
				}
				
				if(this.ventasgeneralesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVentasGenerales(this.ventasgenerales,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVentasGenerales(this.ventasgeneralesReturnGeneral,this.ventasgeneralesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ventasgeneralesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVentasGenerales(classes,this.ventasgeneralesReturnGeneral,this.ventasgeneralesBean,false);
					}
						
					if(this.ventasgeneralesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVentasGenerales(this.ventasgeneralesReturnGeneral.getVentasGenerales());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVentasGenerales(this.ventasgeneralesReturnGeneral.getVentasGenerales());	
					}
						
					if(this.ventasgeneralesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVentasGenerales(this.ventasgeneralesReturnGeneral.getVentasGenerales(),classes);//this.ventasgeneralesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVentasGenerales(this.ventasgenerales,classes);//this.ventasgeneralesBean);									
				}
			
				if(VentasGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVentasGenerales(this.ventasgenerales,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentasGenerales(this.ventasgenerales);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ventasgeneralesAnterior!=null) {
						this.ventasgenerales=this.ventasgeneralesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ventasgeneralesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ventasgeneralesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ventasgeneralesReturnGeneral.getVentasGenerales(),ventasgeneralesLogic.getVentasGeneraless());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ventasgeneralesReturnGeneral.getVentasGenerales(),this.ventasgeneraless);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVentasGenerales.repaint();
				
				//((AbstractTableModel) this.jTableDatosVentasGenerales.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVentasGenerales();
			}
		}
	}
	
	public void actualizarVisualTableDatosVentasGenerales() throws Exception {
		
		VentasGeneralesModel ventasgeneralesModel=(VentasGeneralesModel)this.jTableDatosVentasGenerales.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventasgeneralesModel.ventasgeneraless=this.ventasgeneralesLogic.getVentasGeneraless();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ventasgeneralesModel.ventasgeneraless=this.ventasgeneraless;
		}
		
		
		((VentasGeneralesModel) this.jTableDatosVentasGenerales.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVentasGenerales() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getventasgeneralesAnterior(),this.ventasgeneralesLogic.getVentasGeneraless());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getventasgeneralesAnterior(),this.ventasgeneraless);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVentasGenerales();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVentasGenerales(VentasGenerales ventasgenerales,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
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
										
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventasgenerales,new Object(),generalEntityParameterGeneral,this.ventasgeneralesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ventasgeneralesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VentasGeneralesConstantesFunciones.getClassesRelationshipsOfVentasGenerales(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VentasGeneralesConstantesFunciones.getClassesRelationshipsFromStringsOfVentasGenerales(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVentasGenerales(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VentasGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventasgenerales,new Object(),generalEntityParameterGeneral,this.ventasgeneralesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVentasGenerales(VentasGeneralesBean ventasgeneralesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVentasGenerales(ArrayList<Classe> classes,VentasGeneralesReturnGeneral ventasgeneralesReturnGeneral,VentasGeneralesBean ventasgeneralesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVentasGenerales(VentasGenerales ventasgenerales,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.ventasgenerales)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVentasGenerales = new VentasGeneralesDetalleFormJInternalFrame(jDesktopPane,this.ventasgeneralesSessionBean.getConGuardarRelaciones(),this.ventasgeneralesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.setVisible(false);
		this.jInternalFrameDetalleFormVentasGenerales.setSelected(false);						
		
		this.jInternalFrameDetalleFormVentasGenerales.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVentasGenerales.ventasgeneralesLogic=this.ventasgeneralesLogic;
		
		this.cargarCombosFrameForeignKeyVentasGenerales("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVentasGenerales();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentasGenerales();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVentasGenerales("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVentasGenerales();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVentasGenerales.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentasGenerales"));
		
		this.jInternalFrameDetalleFormVentasGenerales.jButtonModificarVentasGenerales.addActionListener(new ButtonActionListener(this,"ModificarVentasGenerales"));

		
		this.jInternalFrameDetalleFormVentasGenerales.jButtonModificarToolBarVentasGenerales.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentasGenerales"));
					
		this.jInternalFrameDetalleFormVentasGenerales.jMenuItemModificarVentasGenerales.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentasGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormVentasGenerales.jButtonActualizarVentasGenerales.addActionListener (new ButtonActionListener(this,"ActualizarVentasGenerales"));
		
		
		this.jInternalFrameDetalleFormVentasGenerales.jButtonActualizarToolBarVentasGenerales.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentasGenerales"));
						
		this.jInternalFrameDetalleFormVentasGenerales.jMenuItemActualizarVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentasGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormVentasGenerales.jButtonEliminarVentasGenerales.addActionListener (new ButtonActionListener(this,"EliminarVentasGenerales"));
		
		
		this.jInternalFrameDetalleFormVentasGenerales.jButtonEliminarToolBarVentasGenerales.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentasGenerales"));
								
		this.jInternalFrameDetalleFormVentasGenerales.jMenuItemEliminarVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentasGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormVentasGenerales.jButtonCancelarVentasGenerales.addActionListener (new ButtonActionListener(this,"CancelarVentasGenerales"));
		
		
		this.jInternalFrameDetalleFormVentasGenerales.jButtonCancelarToolBarVentasGenerales.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentasGenerales"));
					
		this.jInternalFrameDetalleFormVentasGenerales.jMenuItemCancelarVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentasGenerales"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVentasGenerales.jMenuItemDetalleCerrarVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentasGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormVentasGenerales.jButtonGuardarCambiosToolBarVentasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasGenerales"));
		
		
		
		this.jInternalFrameDetalleFormVentasGenerales.jButtonGuardarCambiosToolBarVentasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasGenerales"));
		
		
		
		this.jInternalFrameDetalleFormVentasGenerales.jComboBoxTiposAccionesFormularioVentasGenerales.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentasGenerales"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonidVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"idVentasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasGenerales.jButtonid_empresaVentasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonid_empresaVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonfecha_emision_desdeVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonfecha_emision_hastaVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonnombre_productoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonmontoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"montoVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtoncodigo_productoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonnotas_creditoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"notas_creditoVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonventa_netaVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"venta_netaVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonporcentajeVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonacumuladoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"acumuladoVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtontipoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"tipoVentasGeneralesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVentasGenerales.jTabbedPaneRelacionesVentasGenerales.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentasGenerales"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVentasGenerales"));
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasGenerales.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentasGenerales"));
		}
		
		this.jTableDatosVentasGenerales.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVentasGenerales"));
		
		this.jTableDatosVentasGenerales.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVentasGenerales"));
		
		this.jButtonNuevoVentasGenerales.addActionListener(new ButtonActionListener(this,"NuevoVentasGenerales"));
		
		this.jButtonDuplicarVentasGenerales.addActionListener(new ButtonActionListener(this,"DuplicarVentasGenerales"));
		
		this.jButtonCopiarVentasGenerales.addActionListener(new ButtonActionListener(this,"CopiarVentasGenerales"));
		
		this.jButtonVerFormVentasGenerales.addActionListener(new ButtonActionListener(this,"VerFormVentasGenerales"));
		
		
		this.jButtonNuevoToolBarVentasGenerales.addActionListener(new ButtonActionListener(this,"NuevoToolBarVentasGenerales"));
			
		this.jButtonDuplicarToolBarVentasGenerales.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVentasGenerales"));
			
		this.jMenuItemNuevoVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVentasGenerales"));
			
		this.jMenuItemDuplicarVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVentasGenerales"));		
		
		
		this.jButtonNuevoRelacionesVentasGenerales.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVentasGenerales"));
		
		
		this.jButtonNuevoRelacionesToolBarVentasGenerales.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVentasGenerales"));
			
		this.jMenuItemNuevoRelacionesVentasGenerales.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVentasGenerales"));		
		
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasGenerales.jButtonModificarVentasGenerales.addActionListener(new ButtonActionListener(this,"ModificarVentasGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasGenerales.jButtonModificarToolBarVentasGenerales.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentasGenerales"));
			
			this.jInternalFrameDetalleFormVentasGenerales.jMenuItemModificarVentasGenerales.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentasGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVentasGenerales.jButtonActualizarVentasGenerales.addActionListener (new ButtonActionListener(this,"ActualizarVentasGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasGenerales.jButtonActualizarToolBarVentasGenerales.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentasGenerales"));
				
			this.jInternalFrameDetalleFormVentasGenerales.jMenuItemActualizarVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentasGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasGenerales.jButtonEliminarVentasGenerales.addActionListener (new ButtonActionListener(this,"EliminarVentasGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasGenerales.jButtonEliminarToolBarVentasGenerales.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentasGenerales"));
						
			this.jInternalFrameDetalleFormVentasGenerales.jMenuItemEliminarVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentasGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasGenerales.jButtonCancelarVentasGenerales.addActionListener (new ButtonActionListener(this,"CancelarVentasGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasGenerales.jButtonCancelarToolBarVentasGenerales.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentasGenerales"));
			
			this.jInternalFrameDetalleFormVentasGenerales.jMenuItemCancelarVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentasGenerales"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVentasGenerales.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVentasGenerales"));		
		
		
		this.jButtonCerrarVentasGenerales.addActionListener (new ButtonActionListener(this,"CerrarVentasGenerales"));
		
		
		this.jButtonCerrarToolBarVentasGenerales.addActionListener (new ButtonActionListener(this,"CerrarToolBarVentasGenerales"));
			
		this.jMenuItemCerrarVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVentasGenerales"));
			
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasGenerales.jMenuItemDetalleCerrarVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentasGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasGenerales.jButtonGuardarCambiosVentasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosVentasGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasGenerales.jButtonGuardarCambiosToolBarVentasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentasGenerales"));
		}
		
		this.jButtonCopiarToolBarVentasGenerales.addActionListener (new ButtonActionListener(this,"CopiarToolBarVentasGenerales"));
			
		this.jButtonVerFormToolBarVentasGenerales.addActionListener (new ButtonActionListener(this,"VerFormToolBarVentasGenerales"));
		
		this.jMenuItemGuardarCambiosVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVentasGenerales"));
			
		this.jMenuItemCopiarVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVentasGenerales"));		
		
		this.jMenuItemVerFormVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVentasGenerales"));		
		
		
		this.jButtonGuardarCambiosTablaVentasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentasGenerales"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVentasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVentasGenerales"));
			
		this.jMenuItemGuardarCambiosTablaVentasGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentasGenerales"));		
		
		
		
		this.jButtonRecargarInformacionVentasGenerales.addActionListener (new ButtonActionListener(this,"RecargarInformacionVentasGenerales"));
					
		this.jButtonRecargarInformacionToolBarVentasGenerales.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVentasGenerales"));
		
		this.jMenuItemRecargarInformacionVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVentasGenerales"));		
		
		
		
		this.jButtonAnterioresVentasGenerales.addActionListener (new ButtonActionListener(this,"AnterioresVentasGenerales"));
		
		
		this.jButtonAnterioresToolBarVentasGenerales.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVentasGenerales"));
		
		this.jMenuItemAnterioresVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVentasGenerales"));		
		
		
		this.jButtonSiguientesVentasGenerales.addActionListener (new ButtonActionListener(this,"SiguientesVentasGenerales"));
		
		
		this.jButtonSiguientesToolBarVentasGenerales.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVentasGenerales"));
			
		this.jMenuItemSiguientesVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVentasGenerales"));
			
		this.jMenuItemAbrirOrderByVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVentasGenerales"));
			
		this.jMenuItemMostrarOcultarVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVentasGenerales"));
			
		this.jMenuItemDetalleAbrirOrderByVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVentasGenerales"));
			
		this.jMenuItemDetalleMostarOcultarVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVentasGenerales"));		
		
		
		this.jButtonNuevoGuardarCambiosVentasGenerales.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVentasGenerales"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentasGenerales.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVentasGenerales"));
			
		this.jMenuItemNuevoGuardarCambiosVentasGenerales.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVentasGenerales"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVentasGenerales.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVentasGenerales"));

		this.jCheckBoxSeleccionadosVentasGenerales.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVentasGenerales"));
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasGenerales.jComboBoxTiposAccionesFormularioVentasGenerales.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentasGenerales"));
		}
		
		
		this.jComboBoxTiposRelacionesVentasGenerales.addActionListener (new ButtonActionListener(this,"TiposRelacionesVentasGenerales"));
			
		this.jComboBoxTiposAccionesVentasGenerales.addActionListener (new ButtonActionListener(this,"TiposAccionesVentasGenerales"));
					
		this.jComboBoxTiposSeleccionarVentasGenerales.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVentasGenerales"));
			
		this.jTextFieldValorCampoGeneralVentasGenerales.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVentasGenerales"));		
		
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonidVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"idVentasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasGenerales.jButtonid_empresaVentasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonid_empresaVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonfecha_emision_desdeVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonfecha_emision_hastaVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonnombre_productoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonmontoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"montoVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtoncodigo_productoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonnotas_creditoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"notas_creditoVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonventa_netaVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"venta_netaVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonporcentajeVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonacumuladoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"acumuladoVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtontipoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"tipoVentasGeneralesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaVentasGeneralesVentasGenerales.addActionListener(new ButtonActionListener(this,"BusquedaVentasGeneralesVentasGenerales"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVentasGenerales!=null) {
				this.jInternalFrameReporteDinamicoVentasGenerales.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasGenerales"));
				this.jInternalFrameReporteDinamicoVentasGenerales.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasGenerales"));
				this.jInternalFrameReporteDinamicoVentasGenerales.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasGenerales"));
			}
			
			//this.jButtonCerrarReporteDinamicoVentasGenerales.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentasGenerales"));				
			//this.jButtonGenerarReporteDinamicoVentasGenerales.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentasGenerales"));
			//this.jButtonGenerarExcelReporteDinamicoVentasGenerales.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentasGenerales"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVentasGenerales!=null) {
				this.jInternalFrameImportacionVentasGenerales.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentasGenerales"));
				this.jInternalFrameImportacionVentasGenerales.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentasGenerales"));
				this.jInternalFrameImportacionVentasGenerales.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentasGenerales"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVentasGenerales.addActionListener (new ButtonActionListener(this,"AbrirOrderByVentasGenerales"));
			
			this.jButtonAbrirOrderByToolBarVentasGenerales.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVentasGenerales"));			
			
			if(this.jInternalFrameOrderByVentasGenerales!=null) {
				this.jInternalFrameOrderByVentasGenerales.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentasGenerales"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentasGenerales.jTabbedPaneRelacionesVentasGenerales.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentasGenerales"));
		
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
            		closingInternalFrameVentasGenerales();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVentasGenerales.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVentasGenerales = (JInternalFrameBase)event.getSource();
	            	
	            VentasGeneralesBeanSwingJInternalFrame jInternalFrameParent=(VentasGeneralesBeanSwingJInternalFrame)jInternalFrameDetalleFormVentasGenerales.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVentasGeneralesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVentasGenerales.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVentasGeneralesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVentasGenerales.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVentasGenerales.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasGeneralesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasGeneralesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasGeneralesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVentasGenerales";
		inputMap = this.jButtonNuevoVentasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVentasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentasGeneralesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasGeneralesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasGeneralesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentasGeneralesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVentasGenerales";
		inputMap = this.jButtonNuevoRelacionesVentasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVentasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentasGeneralesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVentasGenerales";
		inputMap = this.jButtonModificarVentasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVentasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVentasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVentasGenerales";
		inputMap = this.jButtonActualizarVentasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVentasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVentasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVentasGenerales";
		inputMap = this.jButtonEliminarVentasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVentasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVentasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVentasGenerales";
		inputMap = this.jButtonCancelarVentasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVentasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVentasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVentasGenerales";
		inputMap = this.jButtonCerrarVentasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVentasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVentasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVentasGenerales.jButtonGuardarCambiosVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVentasGenerales";
		inputMap = this.jInternalFrameDetalleFormVentasGenerales.jButtonGuardarCambiosVentasGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVentasGenerales.jButtonGuardarCambiosVentasGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVentasGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVentasGenerales.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVentasGeneralesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVentasGenerales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVentasGeneralesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVentasGenerales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVentasGeneralesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVentasGenerales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVentasGeneralesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonidVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"idVentasGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentasGenerales.jButtonid_empresaVentasGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentasGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonid_empresaVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonfecha_emision_desdeVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonfecha_emision_hastaVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonnombre_productoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonmontoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"montoVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtoncodigo_productoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonnotas_creditoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"notas_creditoVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonventa_netaVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"venta_netaVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonporcentajeVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtonacumuladoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"acumuladoVentasGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentasGenerales.jButtontipoVentasGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"tipoVentasGeneralesBusqueda"));
		
		
		this.jButtonBusquedaVentasGeneralesVentasGenerales.addActionListener(new ButtonActionListener(this,"BusquedaVentasGeneralesVentasGenerales"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVentasGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVentasGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVentasGeneralesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVentasGenerales.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVentasGenerales(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(VentasGenerales ventasgeneralesAux:this.ventasgeneralesLogic.getVentasGeneraless()) {
					ventasgeneralesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasGenerales ventasgeneralesAux:ventasgeneraless) {
					ventasgeneralesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVentasGeneralesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentasGenerales(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentasGenerales ventasgeneralesAux:this.ventasgeneralesLogic.getVentasGeneraless()) {
						ventasgeneralesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasGenerales ventasgeneralesAux:ventasgeneraless) {
						ventasgeneralesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(VentasGenerales ventasgeneralesAux:this.ventasgeneralesLogic.getVentasGeneraless()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasGenerales ventasgeneralesAux:ventasgeneraless) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVentasGenerales(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentasGenerales.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentasGenerales.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentasGenerales,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVentasGeneralesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentasGenerales(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVentasGenerales.getSelectedRows();
			
			VentasGenerales ventasgeneralesLocal=new VentasGenerales();
			
			//this.seleccionarTodosVentasGenerales(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ventasgeneralesLocal =(VentasGenerales) this.ventasgeneralesLogic.getVentasGeneraless().toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ventasgeneralesLocal =(VentasGenerales) this.ventasgeneraless.toArray()[this.jTableDatosVentasGenerales.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ventasgeneralesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentasGenerales ventasgeneralesAux:this.ventasgeneralesLogic.getVentasGeneraless()) {
						ventasgeneralesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentasGenerales ventasgeneralesAux:ventasgeneraless) {
						ventasgeneralesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVentasGenerales(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentasGenerales.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentasGenerales.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentasGenerales,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVentasGeneralesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVentasGeneralesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVentasGeneralesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVentasGenerales(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVentasGenerales.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentasGenerales ventasgeneralesAux:this.ventasgeneralesLogic.getVentasGeneraless()) {
				
						if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ventasgeneralesAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ventasgeneralesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							ventasgeneralesAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							ventasgeneralesAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							ventasgeneralesAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_NOTASCREDITO)) {
							existe=true;
							ventasgeneralesAux.setnotas_credito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_VENTANETA)) {
							existe=true;
							ventasgeneralesAux.setventa_neta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							ventasgeneralesAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_ACUMULADO)) {
							existe=true;
							ventasgeneralesAux.setacumulado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							ventasgeneralesAux.settipo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasGenerales ventasgeneralesAux:ventasgeneraless) {
					
						if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ventasgeneralesAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ventasgeneralesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							ventasgeneralesAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							ventasgeneralesAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							ventasgeneralesAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_NOTASCREDITO)) {
							existe=true;
							ventasgeneralesAux.setnotas_credito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_VENTANETA)) {
							existe=true;
							ventasgeneralesAux.setventa_neta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							ventasgeneralesAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_ACUMULADO)) {
							existe=true;
							ventasgeneralesAux.setacumulado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							ventasgeneralesAux.settipo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVentasGenerales(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVentasGeneralesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVentasGenerales(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVentasGenerales=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVentasGenerales.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVentasGenerales.jComboBoxTiposAccionesFormularioVentasGenerales.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVentasGenerales) {				
					conSplash=true;//false;										
					
					//this.startProcessVentasGenerales(conSplash);
				
					this.generarReporteVentasGeneralessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasGenerales.jComboBoxTiposAccionesFormularioVentasGenerales.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVentasGeneralessSeleccionados();
				//this.jComboBoxTiposAccionesVentasGenerales.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentasGeneralessSeleccionados(false);
				//this.jComboBoxTiposAccionesVentasGenerales.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentasGeneralessSeleccionados(true);
				//this.jComboBoxTiposAccionesVentasGenerales.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentasGenerales();
				
				this.exportarVentasGeneralessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasGenerales.jComboBoxTiposAccionesFormularioVentasGenerales.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVentasGeneraless();
				//this.importarVentasGeneraless();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasGenerales.jComboBoxTiposAccionesFormularioVentasGenerales.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentasGenerales();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVentasGeneralessSeleccionados();
				//this.jComboBoxTiposAccionesVentasGenerales.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Ventas Generales", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVentasGenerales();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVentasGenerales)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVentasGenerales(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Ventas Generales",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentasGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentasGenerales.jComboBoxTiposAccionesFormularioVentasGenerales.setSelectedIndex(0);					
				}	
			} 			
			else if(VentasGeneralesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVentasGenerales) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVentasGenerales(conSplash);
					
						//this.actualizarParametrosGeneralVentasGenerales();
						
						this.generarReporteProcesoAccionVentasGeneralessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVentasGenerales.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVentasGenerales.jComboBoxTiposAccionesFormularioVentasGenerales.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VentasGeneralesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Ventas GeneralesES SELECCIONADOS?", "MANTENIMIENTO DE Ventas Generales", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVentasGenerales();
				
						this.actualizarParametrosGeneralVentasGenerales();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ventasgeneralesReturnGeneral=ventasgeneralesLogic.procesarAccionVentasGeneralessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ventasgeneralesLogic.getVentasGeneraless(),this.ventasgeneralesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVentasGeneralesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentasGenerales.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentasGenerales.jComboBoxTiposAccionesFormularioVentasGenerales.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVentasGenerales();
					
					VentasGeneralesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVentasGeneralesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentasGenerales.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentasGenerales.jComboBoxTiposAccionesFormularioVentasGenerales.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVentasGenerales(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVentasGeneralesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVentasGenerales();
			
			if(this.jInternalFrameDetalleFormVentasGenerales==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<VentasGenerales> ventasgeneralessSeleccionados=new ArrayList<VentasGenerales>();		
			VentasGenerales ventasgenerales=new VentasGenerales();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVentasGenerales(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVentasGenerales.getSelectedItem();
			
			
			
			
			ventasgeneralessSeleccionados=this.getVentasGeneralessSeleccionados(true);
			//this.sTipoAccion;
			
			if(ventasgeneralessSeleccionados.size()==1) {
				for(VentasGenerales ventasgeneralesAux:ventasgeneralessSeleccionados) {
					ventasgenerales=ventasgeneralesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVentasGenerales();
			
      		//this.finishProcessVentasGenerales(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVentasGeneralesReturnGeneral() throws Exception {
		if(this.ventasgeneralesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ventasgeneralesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ventasgeneralesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ventasgeneralesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ventasgeneralesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ventasgeneralesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVentasGenerales(false);
		}
		
		if(this.ventasgeneralesReturnGeneral.getConRetornoLista() || this.ventasgeneralesReturnGeneral.getConRetornoObjeto()) {
			if(this.ventasgeneralesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ventasgeneralesLogic.setVentasGeneraless(this.ventasgeneralesReturnGeneral.getVentasGeneraless());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingVentasGenerales(false);
		}
	}
	
	public void actualizarParametrosGeneralVentasGenerales() throws Exception {
		
		
	}
	
	public ArrayList<VentasGenerales> getVentasGeneralessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VentasGenerales> ventasgeneralessSeleccionados=new ArrayList<VentasGenerales>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVentasGenerales) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(VentasGenerales ventasgeneralesAux:ventasgeneralesLogic.getVentasGeneraless()) {
					if(ventasgeneralesAux.getIsSelected()) {
						ventasgeneralessSeleccionados.add(ventasgeneralesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentasGenerales ventasgeneralesAux:this.ventasgeneraless) {
					if(ventasgeneralesAux.getIsSelected()) {
						ventasgeneralessSeleccionados.add(ventasgeneralesAux);				
					}
				}
			}
			
			if(ventasgeneralessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ventasgeneralessSeleccionados.addAll(this.ventasgeneralesLogic.getVentasGeneraless());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ventasgeneralessSeleccionados.addAll(this.ventasgeneraless);				
					}
				}
			}
		} else {
			ventasgeneralessSeleccionados.add(this.ventasgenerales);
		}
		
		return ventasgeneralessSeleccionados;
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
	
	public void generarReporteVentasGeneralessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVentasGeneralessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVentasGeneralessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentasGeneralessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentasGeneralessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Ventas Generales",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVentasGeneralessSeleccionados() throws Exception {
		ArrayList<VentasGenerales> ventasgeneralessSeleccionados=new ArrayList<VentasGenerales>();		
		
		ventasgeneralessSeleccionados=this.getVentasGeneralessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVentasGeneraless("Todos",ventasgeneralessSeleccionados);
		
	}	
	
	public void generarReporteNormalVentasGeneralessSeleccionados() throws Exception {
		ArrayList<VentasGenerales> ventasgeneralessSeleccionados=new ArrayList<VentasGenerales>();		
		
		ventasgeneralessSeleccionados=this.getVentasGeneralessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVentasGeneraless("Todos",ventasgeneralessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVentasGeneralessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VentasGenerales> ventasgeneralessSeleccionados=new ArrayList<VentasGenerales>();
		
		ventasgeneralessSeleccionados=this.getVentasGeneralessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVentasGeneraless("Todos",ventasgeneralessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVentasGeneralessSeleccionados() throws Exception {
		ArrayList<VentasGenerales> ventasgeneralessSeleccionados=new ArrayList<VentasGenerales>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVentasGenerales();
		
		
		ventasgeneralessSeleccionados=this.getVentasGeneralessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVentasGenerales();
		
		
		//this.generarReporteVentasGeneraless("Todos",ventasgeneralessSeleccionados ,ventasgeneralesImplementable,ventasgeneralesImplementableHome);
	}
	
	public void mostrarImportacionVentasGeneraless() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVentasGenerales();
		
		this.abrirFrameImportacionVentasGenerales();		
		
			
		//this.generarReporteVentasGeneraless("Todos",ventasgeneralessSeleccionados ,ventasgeneralesImplementable,ventasgeneralesImplementableHome);
	}
	
	public void importarVentasGeneraless() throws Exception {		
	
	}
	
	public void exportarVentasGeneralessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVentasGeneralessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVentasGeneralessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVentasGeneralessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Ventas Generales",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVentasGeneralessSeleccionados() throws Exception {
		ArrayList<VentasGenerales> ventasgeneralessSeleccionados=new ArrayList<VentasGenerales>();		
		
		ventasgeneralessSeleccionados=this.getVentasGeneralessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasgenerales."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVentasGenerales(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(VentasGenerales ventasgeneralesAux:ventasgeneralessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVentasGenerales(ventasgeneralesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ventasgeneralesAux.setsDetalleGeneralEntityReporte(ventasgeneralesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Generales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVentasGenerales(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VentasGeneralesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasGeneralesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasGeneralesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasGeneralesConstantesFunciones.LABEL_MONTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasGeneralesConstantesFunciones.LABEL_NOTASCREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasGeneralesConstantesFunciones.LABEL_VENTANETA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasGeneralesConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasGeneralesConstantesFunciones.LABEL_ACUMULADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentasGeneralesConstantesFunciones.LABEL_TIPO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVentasGenerales(VentasGenerales ventasgenerales,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ventasgenerales.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasgenerales.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasgenerales.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasgenerales.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasgenerales.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasgenerales.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasgenerales.getmonto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasgenerales.getcodigo_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasgenerales.getnotas_credito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasgenerales.getventa_neta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasgenerales.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasgenerales.getacumulado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventasgenerales.gettipo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVentasGeneralessSeleccionados() throws Exception {
		ArrayList<VentasGenerales> ventasgeneralessSeleccionados=new ArrayList<VentasGenerales>();		
		
		ventasgeneralessSeleccionados=this.getVentasGeneralessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasgenerales.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("VentasGeneraless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVentasGenerales(row);				
				iRow++;
			}				
			
			for(VentasGenerales ventasgeneralesAux:ventasgeneralessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVentasGenerales(ventasgeneralesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Generales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVentasGeneralessSeleccionados() throws Exception {
		ArrayList<VentasGenerales> ventasgeneralessSeleccionados=new ArrayList<VentasGenerales>();		
		
		ventasgeneralessSeleccionados=this.getVentasGeneralessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventasgenerales.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ventasgeneraless");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ventasgenerales");
			//elementRoot.appendChild(element);
		
			for(VentasGenerales ventasgeneralesAux:ventasgeneralessSeleccionados) {
				element = document.createElement("ventasgenerales");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVentasGenerales(ventasgeneralesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ventas Generales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVentasGenerales(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_MONTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_NOTASCREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_VENTANETA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_ACUMULADO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentasGeneralesConstantesFunciones.LABEL_TIPO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVentasGenerales(VentasGenerales ventasgenerales,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ventasgenerales.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasgenerales.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasgenerales.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasgenerales.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasgenerales.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasgenerales.getmonto());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasgenerales.getcodigo_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasgenerales.getnotas_credito());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasgenerales.getventa_neta());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasgenerales.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasgenerales.getacumulado());
		cell = row.createCell(iColumn++);cell.setCellValue(ventasgenerales.gettipo());				
	}
	
	public void setFilaDatosExportarXmlVentasGenerales(VentasGenerales ventasgenerales,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VentasGeneralesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ventasgenerales.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VentasGeneralesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ventasgenerales.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VentasGeneralesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(ventasgenerales.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfecha_emision_desde = document.createElement(VentasGeneralesConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(ventasgenerales.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(VentasGeneralesConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(ventasgenerales.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_producto = document.createElement(VentasGeneralesConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(ventasgenerales.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementmonto = document.createElement(VentasGeneralesConstantesFunciones.MONTO);
		elementmonto.appendChild(document.createTextNode(ventasgenerales.getmonto().toString().trim()));
		element.appendChild(elementmonto);

		Element elementcodigo_producto = document.createElement(VentasGeneralesConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(ventasgenerales.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);

		Element elementnotas_credito = document.createElement(VentasGeneralesConstantesFunciones.NOTASCREDITO);
		elementnotas_credito.appendChild(document.createTextNode(ventasgenerales.getnotas_credito().toString().trim()));
		element.appendChild(elementnotas_credito);

		Element elementventa_neta = document.createElement(VentasGeneralesConstantesFunciones.VENTANETA);
		elementventa_neta.appendChild(document.createTextNode(ventasgenerales.getventa_neta().toString().trim()));
		element.appendChild(elementventa_neta);

		Element elementporcentaje = document.createElement(VentasGeneralesConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(ventasgenerales.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementacumulado = document.createElement(VentasGeneralesConstantesFunciones.ACUMULADO);
		elementacumulado.appendChild(document.createTextNode(ventasgenerales.getacumulado().toString().trim()));
		element.appendChild(elementacumulado);

		Element elementtipo = document.createElement(VentasGeneralesConstantesFunciones.TIPO);
		elementtipo.appendChild(document.createTextNode(ventasgenerales.gettipo().trim()));
		element.appendChild(elementtipo);
	}
	
	public void generarReporteGroupGenericoVentasGeneralessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<VentasGenerales> ventasgeneralessSeleccionados=new ArrayList<VentasGenerales>();
		
		ventasgeneralessSeleccionados=this.getVentasGeneralessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoVentasGenerales(ventasgeneralessSeleccionados);
		
		this.generarReporteVentasGeneraless("Todos",ventasgeneralessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVentasGenerales(ArrayList<VentasGenerales> ventasgeneralessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VentasGenerales ventasgeneralesAux:ventasgeneralessSeleccionados) {
				ventasgeneralesAux.setsDetalleGeneralEntityReporte(ventasgeneralesAux.toString());
			
				if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					ventasgeneralesAux.setsDescripcionGeneralEntityReporte1(ventasgeneralesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					ventasgeneralesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventasgeneralesAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					ventasgeneralesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventasgeneralesAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					ventasgeneralesAux.setsDescripcionGeneralEntityReporte1(ventasgeneralesAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					ventasgeneralesAux.setsDescripcionGeneralEntityReporte1(ventasgeneralesAux.getcodigo_producto());
				}
				 else if(sTipoSeleccionar.equals(VentasGeneralesConstantesFunciones.LABEL_TIPO)) {
					existe=true;
					ventasgeneralesAux.setsDescripcionGeneralEntityReporte1(ventasgeneralesAux.gettipo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentasGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVentasGenerales(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVentasGenerales=true;
				this.isVisibilidadCeldaNuevoRelacionesVentasGenerales=true;
				this.isVisibilidadCeldaGuardarCambiosVentasGenerales=true;
			}
			
			this.isVisibilidadCeldaModificarVentasGenerales=false;
			this.isVisibilidadCeldaActualizarVentasGenerales=false;
			this.isVisibilidadCeldaEliminarVentasGenerales=false;
			this.isVisibilidadCeldaCancelarVentasGenerales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasGenerales=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVentasGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosVentasGenerales=false;
			this.isVisibilidadCeldaModificarVentasGenerales=false;
			this.isVisibilidadCeldaActualizarVentasGenerales=true;
			this.isVisibilidadCeldaEliminarVentasGenerales=false;
			this.isVisibilidadCeldaCancelarVentasGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasGenerales=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVentasGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosVentasGenerales=false;
			this.isVisibilidadCeldaModificarVentasGenerales=false;
			this.isVisibilidadCeldaActualizarVentasGenerales=true;
			this.isVisibilidadCeldaEliminarVentasGenerales=true;
			this.isVisibilidadCeldaCancelarVentasGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasGenerales=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVentasGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosVentasGenerales=false;
			this.isVisibilidadCeldaModificarVentasGenerales=false;
			this.isVisibilidadCeldaActualizarVentasGenerales=true;
			this.isVisibilidadCeldaEliminarVentasGenerales=false;
			this.isVisibilidadCeldaCancelarVentasGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasGenerales=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasGenerales=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVentasGenerales=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasGenerales=true;
			this.isVisibilidadCeldaGuardarCambiosVentasGenerales=true;
			this.isVisibilidadCeldaModificarVentasGenerales=false;
			this.isVisibilidadCeldaActualizarVentasGenerales=false;
			this.isVisibilidadCeldaEliminarVentasGenerales=false;
			this.isVisibilidadCeldaCancelarVentasGenerales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarVentasGenerales=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVentasGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosVentasGenerales=false;
			this.isVisibilidadCeldaActualizarVentasGenerales=false;
			this.isVisibilidadCeldaEliminarVentasGenerales=false;
			this.isVisibilidadCeldaCancelarVentasGenerales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasGenerales=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasGenerales=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVentasGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesVentasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosVentasGenerales=false;
			this.isVisibilidadCeldaModificarVentasGenerales=true;
			this.isVisibilidadCeldaActualizarVentasGenerales=false;
			this.isVisibilidadCeldaEliminarVentasGenerales=false;
			this.isVisibilidadCeldaCancelarVentasGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentasGenerales=false;
				} else {
					this.isVisibilidadCeldaGuardarVentasGenerales=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VentasGeneralesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVentasGenerales=true;
			this.isVisibilidadCeldaNuevoRelacionesVentasGenerales=true;
			this.isVisibilidadCeldaGuardarCambiosVentasGenerales=true;
		} else {
			this.actualizarEstadoPanelsVentasGenerales(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVentasGenerales=false;
			//this.isVisibilidadCeldaVerFormVentasGenerales=false;
			this.isVisibilidadCeldaDuplicarVentasGenerales=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ventasgeneralesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVentasGenerales=false;
		} else {
			this.isVisibilidadCeldaNuevoVentasGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosVentasGenerales=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
			if(!ventasgeneralesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVentasGenerales=false;												
			}
			
			this.jButtonCerrarVentasGenerales.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVentasGenerales=false;
		}
		
		if(!this.permiteMantenimiento(this.ventasgenerales)) {
			this.isVisibilidadCeldaActualizarVentasGenerales=false;
			this.isVisibilidadCeldaEliminarVentasGenerales=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoVentasGenerales=false;
		this.isVisibilidadCeldaNuevoRelacionesVentasGenerales=false;
		this.isVisibilidadCeldaGuardarCambiosVentasGenerales=false;
		//this.isVisibilidadCeldaModificarVentasGenerales=true;
		this.isVisibilidadCeldaActualizarVentasGenerales=false;
		this.isVisibilidadCeldaEliminarVentasGenerales=false;
		//this.isVisibilidadCeldaCancelarVentasGenerales=true;			
		this.isVisibilidadCeldaGuardarVentasGenerales=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVentasGenerales() {
	}
	
	public void actualizarEstadoPanelsVentasGenerales(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVentasGenerales!=null) {
				this.jScrollPanelDatosEdicionVentasGenerales.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasGenerales!=null) {
				this.jTabbedPaneBusquedasVentasGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasGenerales!=null) {
				this.jScrollPanelDatosVentasGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasGenerales!=null) {
				this.jPanelPaginacionVentasGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasGenerales!=null) {
				this.jPanelParametrosReportesVentasGenerales.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVentasGenerales!=null) {
				this.jScrollPanelDatosEdicionVentasGenerales.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasGenerales!=null) {
				this.jTabbedPaneBusquedasVentasGenerales.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVentasGenerales!=null) {
				this.jScrollPanelDatosVentasGenerales.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasGenerales!=null) {
				this.jPanelPaginacionVentasGenerales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasGenerales!=null) {
				this.jPanelParametrosReportesVentasGenerales.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVentasGenerales!=null) {
				this.jScrollPanelDatosEdicionVentasGenerales.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasGenerales!=null) {
				this.jTabbedPaneBusquedasVentasGenerales.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentasGenerales!=null) {
				this.jScrollPanelDatosVentasGenerales.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasGenerales!=null) {
				this.jPanelPaginacionVentasGenerales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasGenerales!=null) {
				this.jPanelParametrosReportesVentasGenerales.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVentasGenerales!=null) {
				this.jScrollPanelDatosEdicionVentasGenerales.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasGenerales!=null) {
				this.jTabbedPaneBusquedasVentasGenerales.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentasGenerales!=null) {
				this.jScrollPanelDatosVentasGenerales.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentasGenerales!=null) {
				this.jPanelPaginacionVentasGenerales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentasGenerales!=null) {
				this.jPanelParametrosReportesVentasGenerales.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVentasGenerales!=null) {
				this.jScrollPanelDatosEdicionVentasGenerales.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasGenerales!=null) {
				this.jTabbedPaneBusquedasVentasGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasGenerales!=null) {
				this.jScrollPanelDatosVentasGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasGenerales!=null) {
				this.jPanelPaginacionVentasGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasGenerales!=null) {
				this.jPanelParametrosReportesVentasGenerales.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVentasGenerales!=null) {
				this.jScrollPanelDatosEdicionVentasGenerales.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasGenerales!=null) {
				this.jTabbedPaneBusquedasVentasGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasGenerales!=null) {
				this.jScrollPanelDatosVentasGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasGenerales!=null) {
				this.jPanelPaginacionVentasGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasGenerales!=null) {
				this.jPanelParametrosReportesVentasGenerales.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVentasGenerales!=null) {
				this.jScrollPanelDatosEdicionVentasGenerales.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasGenerales!=null) {
				this.jTabbedPaneBusquedasVentasGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentasGenerales!=null) {
				this.jScrollPanelDatosVentasGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentasGenerales!=null) {
				this.jPanelPaginacionVentasGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentasGenerales!=null) {
				this.jPanelParametrosReportesVentasGenerales.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVentasGenerales!=null) {
					this.jTabbedPaneBusquedasVentasGenerales.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVentasGenerales!=null) {
				this.jPanelParametrosReportesVentasGenerales.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentasGenerales!=null) {
				this.jTabbedPaneBusquedasVentasGenerales.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVentasGenerales!=null) {
				this.jPanelParametrosReportesVentasGenerales.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaVentasGenerales=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaVentasGenerales) {this.jTabbedPaneBusquedasVentasGenerales.remove(jPanelBusquedaVentasGeneralesVentasGenerales);}
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
			
			this.inicializarActualizarBindingTablaVentasGenerales(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVentasGenerales() {
		this.updateBorderResaltarBusquedasFormularioVentasGenerales();
		this.updateVisibilidadBusquedasFormularioVentasGenerales();
		this.updateHabilitarBusquedasFormularioVentasGenerales();
	}
	
	public void updateBorderResaltarBusquedasFormularioVentasGenerales() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVentasGenerales.getComponents().length>0) {
	

		if(this.ventasgeneralesConstantesFunciones.resaltarBusquedaVentasGeneralesVentasGenerales!=null) {
			index= this.jTabbedPaneBusquedasVentasGenerales.indexOfComponent(this.jPanelBusquedaVentasGeneralesVentasGenerales);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentasGenerales.getComponent(index);
				jPanel.setBorder(this.ventasgeneralesConstantesFunciones.resaltarBusquedaVentasGeneralesVentasGenerales);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVentasGenerales() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVentasGenerales.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentasGenerales.indexOfComponent(this.jPanelBusquedaVentasGeneralesVentasGenerales);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVentasGenerales.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ventasgeneralesConstantesFunciones.mostrarBusquedaVentasGeneralesVentasGenerales);
			if(!this.ventasgeneralesConstantesFunciones.mostrarBusquedaVentasGeneralesVentasGenerales && index>-1) {
				this.jTabbedPaneBusquedasVentasGenerales.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVentasGenerales() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVentasGenerales.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentasGenerales.indexOfComponent(this.jPanelBusquedaVentasGeneralesVentasGenerales);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVentasGenerales.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ventasgeneralesConstantesFunciones.activarBusquedaVentasGeneralesVentasGenerales);
				this.jTabbedPaneBusquedasVentasGenerales.setEnabledAt(index,this.ventasgeneralesConstantesFunciones.activarBusquedaVentasGeneralesVentasGenerales);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVentasGenerales(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaVentasGenerales")) {
			index= this.jTabbedPaneBusquedasVentasGenerales.indexOfComponent(this.jPanelBusquedaVentasGeneralesVentasGenerales);

			this.jTabbedPaneBusquedasVentasGenerales.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentasGenerales.getComponent(index);

			this.ventasgeneralesConstantesFunciones.setResaltarBusquedaVentasGeneralesVentasGenerales(resaltar);

			jPanel.setBorder(this.ventasgeneralesConstantesFunciones.resaltarBusquedaVentasGeneralesVentasGenerales);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVentasGenerales.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioVentasGenerales() throws Exception {

		if(this.jInternalFrameDetalleFormVentasGenerales==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVentasGenerales();
		this.updateVisibilidadResaltarControlesFormularioVentasGenerales();
		this.updateHabilitarResaltarControlesFormularioVentasGenerales();
		
	}
	
	public void updateBorderResaltarControlesFormularioVentasGenerales() throws Exception {
		if(this.jInternalFrameDetalleFormVentasGenerales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ventasgeneralesConstantesFunciones.resaltaridVentasGenerales!=null && this.jInternalFrameDetalleFormVentasGenerales!=null) {this.jInternalFrameDetalleFormVentasGenerales.jLabelidVentasGenerales.setBorder(this.ventasgeneralesConstantesFunciones.resaltaridVentasGenerales);}
		if(this.ventasgeneralesConstantesFunciones.resaltarid_empresaVentasGenerales!=null && this.jInternalFrameDetalleFormVentasGenerales!=null) {this.jInternalFrameDetalleFormVentasGenerales.jComboBoxid_empresaVentasGenerales.setBorder(this.ventasgeneralesConstantesFunciones.resaltarid_empresaVentasGenerales);}
		if(this.ventasgeneralesConstantesFunciones.resaltarfecha_emision_desdeVentasGenerales!=null && this.jInternalFrameDetalleFormVentasGenerales!=null) {this.jInternalFrameDetalleFormVentasGenerales.jDateChooserfecha_emision_desdeVentasGenerales.setBorder(this.ventasgeneralesConstantesFunciones.resaltarfecha_emision_desdeVentasGenerales);}
		if(this.ventasgeneralesConstantesFunciones.resaltarfecha_emision_hastaVentasGenerales!=null && this.jInternalFrameDetalleFormVentasGenerales!=null) {this.jInternalFrameDetalleFormVentasGenerales.jDateChooserfecha_emision_hastaVentasGenerales.setBorder(this.ventasgeneralesConstantesFunciones.resaltarfecha_emision_hastaVentasGenerales);}
		if(this.ventasgeneralesConstantesFunciones.resaltarnombre_productoVentasGenerales!=null && this.jInternalFrameDetalleFormVentasGenerales!=null) {this.jInternalFrameDetalleFormVentasGenerales.jTextAreanombre_productoVentasGenerales.setBorder(this.ventasgeneralesConstantesFunciones.resaltarnombre_productoVentasGenerales);}
		if(this.ventasgeneralesConstantesFunciones.resaltarmontoVentasGenerales!=null && this.jInternalFrameDetalleFormVentasGenerales!=null) {this.jInternalFrameDetalleFormVentasGenerales.jTextFieldmontoVentasGenerales.setBorder(this.ventasgeneralesConstantesFunciones.resaltarmontoVentasGenerales);}
		if(this.ventasgeneralesConstantesFunciones.resaltarcodigo_productoVentasGenerales!=null && this.jInternalFrameDetalleFormVentasGenerales!=null) {this.jInternalFrameDetalleFormVentasGenerales.jTextFieldcodigo_productoVentasGenerales.setBorder(this.ventasgeneralesConstantesFunciones.resaltarcodigo_productoVentasGenerales);}
		if(this.ventasgeneralesConstantesFunciones.resaltarnotas_creditoVentasGenerales!=null && this.jInternalFrameDetalleFormVentasGenerales!=null) {this.jInternalFrameDetalleFormVentasGenerales.jTextFieldnotas_creditoVentasGenerales.setBorder(this.ventasgeneralesConstantesFunciones.resaltarnotas_creditoVentasGenerales);}
		if(this.ventasgeneralesConstantesFunciones.resaltarventa_netaVentasGenerales!=null && this.jInternalFrameDetalleFormVentasGenerales!=null) {this.jInternalFrameDetalleFormVentasGenerales.jTextFieldventa_netaVentasGenerales.setBorder(this.ventasgeneralesConstantesFunciones.resaltarventa_netaVentasGenerales);}
		if(this.ventasgeneralesConstantesFunciones.resaltarporcentajeVentasGenerales!=null && this.jInternalFrameDetalleFormVentasGenerales!=null) {this.jInternalFrameDetalleFormVentasGenerales.jTextFieldporcentajeVentasGenerales.setBorder(this.ventasgeneralesConstantesFunciones.resaltarporcentajeVentasGenerales);}
		if(this.ventasgeneralesConstantesFunciones.resaltaracumuladoVentasGenerales!=null && this.jInternalFrameDetalleFormVentasGenerales!=null) {this.jInternalFrameDetalleFormVentasGenerales.jTextFieldacumuladoVentasGenerales.setBorder(this.ventasgeneralesConstantesFunciones.resaltaracumuladoVentasGenerales);}
		if(this.ventasgeneralesConstantesFunciones.resaltartipoVentasGenerales!=null && this.jInternalFrameDetalleFormVentasGenerales!=null) {this.jInternalFrameDetalleFormVentasGenerales.jTextFieldtipoVentasGenerales.setBorder(this.ventasgeneralesConstantesFunciones.resaltartipoVentasGenerales);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVentasGenerales() throws Exception {		
		if(this.jInternalFrameDetalleFormVentasGenerales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
	
		//this.jInternalFrameDetalleFormVentasGenerales.jLabelidVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostraridVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jPanelidVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostraridVentasGenerales);
		//this.jInternalFrameDetalleFormVentasGenerales.jComboBoxid_empresaVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarid_empresaVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jPanelid_empresaVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarid_empresaVentasGenerales);
		//this.jInternalFrameDetalleFormVentasGenerales.jDateChooserfecha_emision_desdeVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarfecha_emision_desdeVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jPanelfecha_emision_desdeVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarfecha_emision_desdeVentasGenerales);
		//this.jInternalFrameDetalleFormVentasGenerales.jDateChooserfecha_emision_hastaVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarfecha_emision_hastaVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jPanelfecha_emision_hastaVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarfecha_emision_hastaVentasGenerales);
		//this.jInternalFrameDetalleFormVentasGenerales.jTextAreanombre_productoVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarnombre_productoVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jPanelnombre_productoVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarnombre_productoVentasGenerales);
		//this.jInternalFrameDetalleFormVentasGenerales.jTextFieldmontoVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarmontoVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jPanelmontoVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarmontoVentasGenerales);
		//this.jInternalFrameDetalleFormVentasGenerales.jTextFieldcodigo_productoVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarcodigo_productoVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jPanelcodigo_productoVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarcodigo_productoVentasGenerales);
		//this.jInternalFrameDetalleFormVentasGenerales.jTextFieldnotas_creditoVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarnotas_creditoVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jPanelnotas_creditoVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarnotas_creditoVentasGenerales);
		//this.jInternalFrameDetalleFormVentasGenerales.jTextFieldventa_netaVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarventa_netaVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jPanelventa_netaVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarventa_netaVentasGenerales);
		//this.jInternalFrameDetalleFormVentasGenerales.jTextFieldporcentajeVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarporcentajeVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jPanelporcentajeVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrarporcentajeVentasGenerales);
		//this.jInternalFrameDetalleFormVentasGenerales.jTextFieldacumuladoVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostraracumuladoVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jPanelacumuladoVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostraracumuladoVentasGenerales);
		//this.jInternalFrameDetalleFormVentasGenerales.jTextFieldtipoVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrartipoVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jPaneltipoVentasGenerales.setVisible(this.ventasgeneralesConstantesFunciones.mostrartipoVentasGenerales);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVentasGenerales() throws Exception {
		if(this.jInternalFrameDetalleFormVentasGenerales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentasGenerales!=null) {
	
		this.jInternalFrameDetalleFormVentasGenerales.jLabelidVentasGenerales.setEnabled(this.ventasgeneralesConstantesFunciones.activaridVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jComboBoxid_empresaVentasGenerales.setEnabled(this.ventasgeneralesConstantesFunciones.activarid_empresaVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jDateChooserfecha_emision_desdeVentasGenerales.setEnabled(this.ventasgeneralesConstantesFunciones.activarfecha_emision_desdeVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jDateChooserfecha_emision_hastaVentasGenerales.setEnabled(this.ventasgeneralesConstantesFunciones.activarfecha_emision_hastaVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jTextAreanombre_productoVentasGenerales.setEnabled(this.ventasgeneralesConstantesFunciones.activarnombre_productoVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jTextFieldmontoVentasGenerales.setEnabled(this.ventasgeneralesConstantesFunciones.activarmontoVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jTextFieldcodigo_productoVentasGenerales.setEnabled(this.ventasgeneralesConstantesFunciones.activarcodigo_productoVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jTextFieldnotas_creditoVentasGenerales.setEnabled(this.ventasgeneralesConstantesFunciones.activarnotas_creditoVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jTextFieldventa_netaVentasGenerales.setEnabled(this.ventasgeneralesConstantesFunciones.activarventa_netaVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jTextFieldporcentajeVentasGenerales.setEnabled(this.ventasgeneralesConstantesFunciones.activarporcentajeVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jTextFieldacumuladoVentasGenerales.setEnabled(this.ventasgeneralesConstantesFunciones.activaracumuladoVentasGenerales);
		this.jInternalFrameDetalleFormVentasGenerales.jTextFieldtipoVentasGenerales.setEnabled(this.ventasgeneralesConstantesFunciones.activartipoVentasGenerales);
		}
	}
	
		
}