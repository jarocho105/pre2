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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.cartera.util.ListadoMovimientosConstantesFunciones;
import com.bydan.erp.cartera.util.report.ListadoMovimientosParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.ListadoMovimientosParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.ListadoMovimientosBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.cartera.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.cartera.util.*;

import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.cartera.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.entity.report.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;

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
public class ListadoMovimientosBeanSwingJInternalFrame extends ListadoMovimientosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ListadoMovimientosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ListadoMovimientos> listadomovimientosValidator = new ClassValidator<ListadoMovimientos>(ListadoMovimientos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ListadoMovimientos listadomovimientos;	
	public ListadoMovimientos listadomovimientosAux;
	public ListadoMovimientos listadomovimientosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ListadoMovimientos listadomovimientosTotales;
	public Long idListadoMovimientosActual;
	public Long iIdNuevoListadoMovimientos=0L;
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
	
	public Boolean isPermisoTodoListadoMovimientos;
	public Boolean isPermisoNuevoListadoMovimientos;
	public Boolean isPermisoActualizarListadoMovimientos;
	public Boolean isPermisoActualizarOriginalListadoMovimientos;
	public Boolean isPermisoEliminarListadoMovimientos;
	public Boolean isPermisoGuardarCambiosListadoMovimientos;
	public Boolean isPermisoConsultaListadoMovimientos;
	public Boolean isPermisoBusquedaListadoMovimientos;
	public Boolean isPermisoReporteListadoMovimientos;
	public Boolean isPermisoPaginacionMedioListadoMovimientos;
	public Boolean isPermisoPaginacionAltoListadoMovimientos;
	public Boolean isPermisoPaginacionTodoListadoMovimientos;
	public Boolean isPermisoCopiarListadoMovimientos;
	public Boolean isPermisoVerFormListadoMovimientos;
	public Boolean isPermisoDuplicarListadoMovimientos;
	public Boolean isPermisoOrdenListadoMovimientos;
	
	
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
	
	public ListadoMovimientosParameterReturnGeneral listadomovimientosReturnGeneral;
	public ListadoMovimientosParameterReturnGeneral listadomovimientosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoListadoMovimientos=false;
	public Boolean esParaAccionDesdeFormularioListadoMovimientos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ListadoMovimientosSessionBeanAdditional listadomovimientosSessionBeanAdditional=null;
	
	public ListadoMovimientosSessionBeanAdditional getListadoMovimientosSessionBeanAdditional() {
		return this.listadomovimientosSessionBeanAdditional;
	}
	
	public void setListadoMovimientosSessionBeanAdditional(ListadoMovimientosSessionBeanAdditional listadomovimientosSessionBeanAdditional) {
		try {
			this.listadomovimientosSessionBeanAdditional=listadomovimientosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ListadoMovimientosBeanSwingJInternalFrameAdditional listadomovimientosBeanSwingJInternalFrameAdditional=null;
	//public class ListadoMovimientosBeanSwingJInternalFrame
	
	public ListadoMovimientosBeanSwingJInternalFrameAdditional getListadoMovimientosBeanSwingJInternalFrameAdditional() {
		return this.listadomovimientosBeanSwingJInternalFrameAdditional;
	}
	
	public void setListadoMovimientosBeanSwingJInternalFrameAdditional(ListadoMovimientosBeanSwingJInternalFrameAdditional listadomovimientosBeanSwingJInternalFrameAdditional) {
		try {
			this.listadomovimientosBeanSwingJInternalFrameAdditional=listadomovimientosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ListadoMovimientosLogic listadomovimientosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ListadoMovimientos listadomovimientosBean;
	public ListadoMovimientosConstantesFunciones listadomovimientosConstantesFunciones;
	//public ListadoMovimientosParameterReturnGeneral listadomovimientosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ListadoMovimientos> listadomovimientoss;	
	//public List<ListadoMovimientos> listadomovimientossEliminados;
	//public List<ListadoMovimientos> listadomovimientossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoListadoMovimientos=false;
	public Boolean isVisibilidadCeldaDuplicarListadoMovimientos=true;
	public Boolean isVisibilidadCeldaCopiarListadoMovimientos=true;
	public Boolean isVisibilidadCeldaVerFormListadoMovimientos=true;
	public Boolean isVisibilidadCeldaOrdenListadoMovimientos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesListadoMovimientos=false;
	public Boolean isVisibilidadCeldaModificarListadoMovimientos=false;
	public Boolean isVisibilidadCeldaActualizarListadoMovimientos=false;
	public Boolean isVisibilidadCeldaEliminarListadoMovimientos=false;
	public Boolean isVisibilidadCeldaCancelarListadoMovimientos=false;
	public Boolean isVisibilidadCeldaGuardarListadoMovimientos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosListadoMovimientos=false;	
	
	
	public Boolean isVisibilidadBusquedaListadoMovimientos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoListadoMovimientos() {
		return this.iIdNuevoListadoMovimientos;
	}

	public void setiIdNuevoListadoMovimientos(Long iIdNuevoListadoMovimientos) {
		this.iIdNuevoListadoMovimientos = iIdNuevoListadoMovimientos;
	}
	
	public Long getidListadoMovimientosActual() {
		return this.idListadoMovimientosActual;
	}

	public void setidListadoMovimientosActual(Long idListadoMovimientosActual) {
		this.idListadoMovimientosActual = idListadoMovimientosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ListadoMovimientos getlistadomovimientos() {
		return this.listadomovimientos;
	}

	public void setlistadomovimientos(ListadoMovimientos listadomovimientos) {
		this.listadomovimientos = listadomovimientos;
	}
	
	public ListadoMovimientos getlistadomovimientosAux() {
		return this.listadomovimientosAux;
	}

	public void setlistadomovimientosAux(ListadoMovimientos listadomovimientosAux) {
		this.listadomovimientosAux = listadomovimientosAux;
	}				
	
	public ListadoMovimientos getlistadomovimientosAnterior() {
		return this.listadomovimientosAnterior;
	}

	public void setlistadomovimientosAnterior(ListadoMovimientos listadomovimientosAnterior) {
		this.listadomovimientosAnterior = listadomovimientosAnterior;
	}	
	
	public ListadoMovimientos getlistadomovimientosTotales() {
		return this.listadomovimientosTotales;
	}

	public void setlistadomovimientosTotales(ListadoMovimientos listadomovimientosTotales) {
		this.listadomovimientosTotales = listadomovimientosTotales;
	}	
	
	public ListadoMovimientos getlistadomovimientosBean() {
		return this.listadomovimientosBean;
	}

	public void setlistadomovimientosBean(ListadoMovimientos listadomovimientosBean) {
		this.listadomovimientosBean = listadomovimientosBean;
	}	
	
	public ListadoMovimientosParameterReturnGeneral getlistadomovimientosReturnGeneral() {
		return this.listadomovimientosReturnGeneral;
	}

	public void setlistadomovimientosReturnGeneral(ListadoMovimientosParameterReturnGeneral listadomovimientosReturnGeneral) {
		this.listadomovimientosReturnGeneral = listadomovimientosReturnGeneral;
	}	
	
	
	public Date fecha_emision_desdeBusquedaListadoMovimientos=new Date();

	public Date getfecha_emision_desdeBusquedaListadoMovimientos() {
		return this.fecha_emision_desdeBusquedaListadoMovimientos;
	}

	public void setfecha_emision_desdeBusquedaListadoMovimientos(Date fecha_emision_desdeBusquedaListadoMovimientos) {
		this.fecha_emision_desdeBusquedaListadoMovimientos = fecha_emision_desdeBusquedaListadoMovimientos;
	}

;
	public Date fecha_emision_hastaBusquedaListadoMovimientos=new Date();

	public Date getfecha_emision_hastaBusquedaListadoMovimientos() {
		return this.fecha_emision_hastaBusquedaListadoMovimientos;
	}

	public void setfecha_emision_hastaBusquedaListadoMovimientos(Date fecha_emision_hastaBusquedaListadoMovimientos) {
		this.fecha_emision_hastaBusquedaListadoMovimientos = fecha_emision_hastaBusquedaListadoMovimientos;
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
	
	
	public ListadoMovimientosLogic getListadoMovimientosLogic()	{		
		return listadomovimientosLogic;
	}

	public void setListadoMovimientosLogic(ListadoMovimientosLogic listadomovimientosLogic) {
		this.listadomovimientosLogic = listadomovimientosLogic;
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
	
	public Boolean getIsEsNuevoListadoMovimientos() {
		return isEsNuevoListadoMovimientos;
	}

	public void setIsEsNuevoListadoMovimientos(Boolean isEsNuevoListadoMovimientos) {
		this.isEsNuevoListadoMovimientos = isEsNuevoListadoMovimientos;
	}

	public Boolean getEsParaAccionDesdeFormularioListadoMovimientos() {
		return esParaAccionDesdeFormularioListadoMovimientos;
	}
	
	public void setEsParaAccionDesdeFormularioListadoMovimientos(Boolean esParaAccionDesdeFormularioListadoMovimientos) {
		this.esParaAccionDesdeFormularioListadoMovimientos = esParaAccionDesdeFormularioListadoMovimientos;
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

			if(this.listadomovimientosSessionBean==null) {
				this.listadomovimientosSessionBean=new ListadoMovimientosSessionBean();
			}

			if(!this.listadomovimientosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(listadomovimientosSessionBean.getlidEmpresaActual());
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

					if(this.listadomovimientos!=null) {
						this.listadomovimientos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
						this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxid_empresaListadoMovimientos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaListadoMovimientos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
						if(this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxid_empresaListadoMovimientos.getItemCount()>0) {
							this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxid_empresaListadoMovimientos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaListadoMovimientosGenerico)throws Exception
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
				jComboBoxid_empresaListadoMovimientosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaListadoMovimientosGenerico!=null && jComboBoxid_empresaListadoMovimientosGenerico.getItemCount()>0) {
					jComboBoxid_empresaListadoMovimientosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ListadoMovimientos listadomovimientos,JComboBox jComboBoxid_empresaListadoMovimientosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaListadoMovimientosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxid_empresaListadoMovimientos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaListadoMovimientosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				listadomovimientos.setid_empresa(empresaAux.getId());
				listadomovimientos.setempresa_descripcion(ListadoMovimientosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				listadomovimientos.setEmpresa(empresaAux);			}
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

					if(!ListadoMovimientosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { 
							this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxid_empresaListadoMovimientos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxid_empresaListadoMovimientos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { 
					}

					if(!ListadoMovimientosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
							this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxid_empresaListadoMovimientos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
							this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxid_empresaListadoMovimientos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesListadoMovimientos() throws Exception {
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
		
	public ListadoMovimientosParameterReturnGeneral getListadoMovimientosParameterGeneral() {
		return this.listadomovimientosParameterGeneral;
	}
	
	public void setListadoMovimientosParameterGeneral(ListadoMovimientosParameterReturnGeneral listadomovimientosParameterGeneral) {
		this.listadomovimientosParameterGeneral = listadomovimientosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoListadoMovimientos() {
		return isPermisoTodoListadoMovimientos;
	}

	public void setIsPermisoTodoListadoMovimientos(Boolean isPermisoTodoListadoMovimientos) {
		this.isPermisoTodoListadoMovimientos = isPermisoTodoListadoMovimientos;
	}

	public Boolean getIsPermisoNuevoListadoMovimientos() {
		return isPermisoNuevoListadoMovimientos;
	}

	public void setIsPermisoNuevoListadoMovimientos(Boolean isPermisoNuevoListadoMovimientos) {
		this.isPermisoNuevoListadoMovimientos = isPermisoNuevoListadoMovimientos;
	}

	public Boolean getIsPermisoActualizarListadoMovimientos() {
		return isPermisoActualizarListadoMovimientos;
	}

	public void setIsPermisoActualizarListadoMovimientos(Boolean isPermisoActualizarListadoMovimientos) {
		this.isPermisoActualizarListadoMovimientos = isPermisoActualizarListadoMovimientos;
	}

	public Boolean getIsPermisoEliminarListadoMovimientos() {
		return isPermisoEliminarListadoMovimientos;
	}

	public void setIsPermisoEliminarListadoMovimientos(Boolean isPermisoEliminarListadoMovimientos) {
		this.isPermisoEliminarListadoMovimientos = isPermisoEliminarListadoMovimientos;
	}

	public Boolean getIsPermisoGuardarCambiosListadoMovimientos() {
		return isPermisoGuardarCambiosListadoMovimientos;
	}

	public void setIsPermisoGuardarCambiosListadoMovimientos(Boolean isPermisoGuardarCambiosListadoMovimientos) {
		this.isPermisoGuardarCambiosListadoMovimientos = isPermisoGuardarCambiosListadoMovimientos;
	}
	
	public Boolean getIsPermisoConsultaListadoMovimientos() {
		return isPermisoConsultaListadoMovimientos;
	}

	public void setIsPermisoConsultaListadoMovimientos(Boolean isPermisoConsultaListadoMovimientos) {
		this.isPermisoConsultaListadoMovimientos = isPermisoConsultaListadoMovimientos;
	}

	public Boolean getIsPermisoBusquedaListadoMovimientos() {
		return isPermisoBusquedaListadoMovimientos;
	}

	public void setIsPermisoBusquedaListadoMovimientos(Boolean isPermisoBusquedaListadoMovimientos) {
		this.isPermisoBusquedaListadoMovimientos = isPermisoBusquedaListadoMovimientos;
	}

	public Boolean getIsPermisoReporteListadoMovimientos() {
		return isPermisoReporteListadoMovimientos;
	}

	public void setIsPermisoReporteListadoMovimientos(Boolean isPermisoReporteListadoMovimientos) {
		this.isPermisoReporteListadoMovimientos = isPermisoReporteListadoMovimientos;
	}
	
	public Boolean getIsPermisoPaginacionMedioListadoMovimientos() {
		return isPermisoPaginacionMedioListadoMovimientos;
	}

	public void setIsPermisoPaginacionMedioListadoMovimientos(Boolean isPermisoPaginacionMedioListadoMovimientos) {
		this.isPermisoPaginacionMedioListadoMovimientos = isPermisoPaginacionMedioListadoMovimientos;
	}
	
	public Boolean getIsPermisoPaginacionTodoListadoMovimientos() {
		return isPermisoPaginacionTodoListadoMovimientos;
	}

	public void setIsPermisoPaginacionTodoListadoMovimientos(Boolean isPermisoPaginacionTodoListadoMovimientos) {
		this.isPermisoPaginacionTodoListadoMovimientos = isPermisoPaginacionTodoListadoMovimientos;
	}
	
	public Boolean getIsPermisoPaginacionAltoListadoMovimientos() {
		return isPermisoPaginacionAltoListadoMovimientos;
	}

	public void setIsPermisoPaginacionAltoListadoMovimientos(Boolean isPermisoPaginacionAltoListadoMovimientos) {
		this.isPermisoPaginacionAltoListadoMovimientos = isPermisoPaginacionAltoListadoMovimientos;
	}
	
	public Boolean getIsPermisoCopiarListadoMovimientos() {
		return isPermisoCopiarListadoMovimientos;
	}

	public void setIsPermisoCopiarListadoMovimientos(Boolean isPermisoCopiarListadoMovimientos) {
		this.isPermisoCopiarListadoMovimientos = isPermisoCopiarListadoMovimientos;
	}
	
	public Boolean getIsPermisoVerFormListadoMovimientos() {
		return isPermisoVerFormListadoMovimientos;
	}

	public void setIsPermisoVerFormListadoMovimientos(Boolean isPermisoVerFormListadoMovimientos) {
		this.isPermisoVerFormListadoMovimientos = isPermisoVerFormListadoMovimientos;
	}
	
	public Boolean getIsPermisoDuplicarListadoMovimientos() {
		return isPermisoDuplicarListadoMovimientos;
	}

	public void setIsPermisoDuplicarListadoMovimientos(Boolean isPermisoDuplicarListadoMovimientos) {
		this.isPermisoDuplicarListadoMovimientos = isPermisoDuplicarListadoMovimientos;
	}
	
	public Boolean getIsPermisoOrdenListadoMovimientos() {
		return isPermisoOrdenListadoMovimientos;
	}

	public void setIsPermisoOrdenListadoMovimientos(Boolean isPermisoOrdenListadoMovimientos) {
		this.isPermisoOrdenListadoMovimientos = isPermisoOrdenListadoMovimientos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoListadoMovimientos() {
		return isVisibilidadCeldaNuevoListadoMovimientos;
	}

	public void setIsVisibilidadCeldaNuevoListadoMovimientos(Boolean isVisibilidadCeldaNuevoListadoMovimientos) {
		this.isVisibilidadCeldaNuevoListadoMovimientos = isVisibilidadCeldaNuevoListadoMovimientos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarListadoMovimientos() {
		return isVisibilidadCeldaDuplicarListadoMovimientos;
	}

	public void setIsVisibilidadCeldaDuplicarListadoMovimientos(Boolean isVisibilidadCeldaDuplicarListadoMovimientos) {
		this.isVisibilidadCeldaDuplicarListadoMovimientos = isVisibilidadCeldaDuplicarListadoMovimientos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarListadoMovimientos() {
		return isVisibilidadCeldaCopiarListadoMovimientos;
	}

	public void setIsVisibilidadCeldaCopiarListadoMovimientos(Boolean isVisibilidadCeldaCopiarListadoMovimientos) {
		this.isVisibilidadCeldaCopiarListadoMovimientos = isVisibilidadCeldaCopiarListadoMovimientos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormListadoMovimientos() {
		return isVisibilidadCeldaVerFormListadoMovimientos;
	}

	public void setIsVisibilidadCeldaVerFormListadoMovimientos(Boolean isVisibilidadCeldaVerFormListadoMovimientos) {
		this.isVisibilidadCeldaVerFormListadoMovimientos = isVisibilidadCeldaVerFormListadoMovimientos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenListadoMovimientos() {
		return isVisibilidadCeldaOrdenListadoMovimientos;
	}

	public void setIsVisibilidadCeldaOrdenListadoMovimientos(Boolean isVisibilidadCeldaOrdenListadoMovimientos) {
		this.isVisibilidadCeldaOrdenListadoMovimientos = isVisibilidadCeldaOrdenListadoMovimientos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesListadoMovimientos() {
		return isVisibilidadCeldaNuevoRelacionesListadoMovimientos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesListadoMovimientos(Boolean isVisibilidadCeldaNuevoRelacionesListadoMovimientos) {
		this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos = isVisibilidadCeldaNuevoRelacionesListadoMovimientos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarListadoMovimientos() {
		return isVisibilidadCeldaModificarListadoMovimientos;
	}

	public void setIsVisibilidadCeldaModificarListadoMovimientos(Boolean isVisibilidadCeldaModificarListadoMovimientos) {
		this.isVisibilidadCeldaModificarListadoMovimientos = isVisibilidadCeldaModificarListadoMovimientos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarListadoMovimientos() {
		return isVisibilidadCeldaActualizarListadoMovimientos;
	}

	public void setIsVisibilidadCeldaActualizarListadoMovimientos(Boolean isVisibilidadCeldaActualizarListadoMovimientos) {
		this.isVisibilidadCeldaActualizarListadoMovimientos = isVisibilidadCeldaActualizarListadoMovimientos;
	}

	public Boolean getIsVisibilidadCeldaEliminarListadoMovimientos() {
		return isVisibilidadCeldaEliminarListadoMovimientos;
	}

	public void setIsVisibilidadCeldaEliminarListadoMovimientos(Boolean isVisibilidadCeldaEliminarListadoMovimientos) {
		this.isVisibilidadCeldaEliminarListadoMovimientos = isVisibilidadCeldaEliminarListadoMovimientos;
	}

	public Boolean getIsVisibilidadCeldaCancelarListadoMovimientos() {
		return isVisibilidadCeldaCancelarListadoMovimientos;
	}

	public void setIsVisibilidadCeldaCancelarListadoMovimientos(Boolean isVisibilidadCeldaCancelarListadoMovimientos) {
		this.isVisibilidadCeldaCancelarListadoMovimientos = isVisibilidadCeldaCancelarListadoMovimientos;
	}

	public Boolean getIsVisibilidadCeldaGuardarListadoMovimientos() {
		return isVisibilidadCeldaGuardarListadoMovimientos;
	}

	public void setIsVisibilidadCeldaGuardarListadoMovimientos(Boolean isVisibilidadCeldaGuardarListadoMovimientos) {
		this.isVisibilidadCeldaGuardarListadoMovimientos = isVisibilidadCeldaGuardarListadoMovimientos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosListadoMovimientos() {
		return isVisibilidadCeldaGuardarCambiosListadoMovimientos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosListadoMovimientos(Boolean isVisibilidadCeldaGuardarCambiosListadoMovimientos) {
		this.isVisibilidadCeldaGuardarCambiosListadoMovimientos = isVisibilidadCeldaGuardarCambiosListadoMovimientos;
	}
		
	public ListadoMovimientosSessionBean getlistadomovimientosSessionBean() {
		return this.listadomovimientosSessionBean;
	}
	
	public void setlistadomovimientosSessionBean(ListadoMovimientosSessionBean listadomovimientosSessionBean) {
		this.listadomovimientosSessionBean=listadomovimientosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaListadoMovimientos() {
		return this.isVisibilidadBusquedaListadoMovimientos;
	}

	public void setisVisibilidadBusquedaListadoMovimientos(Boolean isVisibilidadBusquedaListadoMovimientos) {
		this.isVisibilidadBusquedaListadoMovimientos=isVisibilidadBusquedaListadoMovimientos;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(ListadoMovimientos listadomovimientos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(listadomovimientos,null);
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
	
	public void bugActualizarReferenciaActual(ListadoMovimientos listadomovimientos,ListadoMovimientos listadomovimientosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalListadoMovimientos(listadomovimientos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		listadomovimientosAux.setId(listadomovimientos.getId());
		listadomovimientosAux.setVersionRow(listadomovimientos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ListadoMovimientos listadomovimientosLocal) throws Exception {
		
		if(this.listadomovimientosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ListadoMovimientos listadomovimientosLocal) throws Exception {	
		if(this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				listadomovimientosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarListadoMovimientosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = listadomovimientosValidator.getInvalidValues(this.listadomovimientos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ListadoMovimientos listadomovimientos,List<ListadoMovimientos> listadomovimientoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ListadoMovimientos listadomovimientos,List<ListadoMovimientos> listadomovimientoss) throws Exception {
		try	{			
			ListadoMovimientosConstantesFunciones.actualizarSelectedLista(listadomovimientos,listadomovimientoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ListadoMovimientos> listadomovimientossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				listadomovimientossLocal=this.listadomovimientosLogic.getListadoMovimientoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				listadomovimientossLocal=this.listadomovimientoss;
			}
			//ARCHITECTURE
		
			for(ListadoMovimientos listadomovimientosLocal:listadomovimientossLocal) {
				if(this.permiteMantenimiento(listadomovimientosLocal) && listadomovimientosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ListadoMovimientosConstantesFunciones.getListadoMovimientosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ListadoMovimientosConstantesFunciones.NOMBRETRANSACCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoMovimientos.jLabelnombre_transaccionListadoMovimientos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoMovimientosConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoMovimientos.jLabelfecha_emisionListadoMovimientos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoMovimientosConstantesFunciones.FECHAVENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoMovimientos.jLabelfecha_ventaListadoMovimientos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoMovimientosConstantesFunciones.NUMEROCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoMovimientos.jLabelnumero_comprobanteListadoMovimientos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoMovimientosConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoMovimientos.jLabelnombre_clienteListadoMovimientos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoMovimientosConstantesFunciones.DEBITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoMovimientos.jLabeldebito_mone_localListadoMovimientos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoMovimientosConstantesFunciones.CREDITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoMovimientos.jLabelcredito_mone_localListadoMovimientos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoMovimientosConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoMovimientos.jLabeldescripcionListadoMovimientos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoMovimientos.jLabelnombre_transaccionListadoMovimientos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoMovimientos.jLabelfecha_emisionListadoMovimientos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoMovimientos.jLabelfecha_ventaListadoMovimientos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoMovimientos.jLabelnumero_comprobanteListadoMovimientos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoMovimientos.jLabelnombre_clienteListadoMovimientos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoMovimientos.jLabeldebito_mone_localListadoMovimientos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoMovimientos.jLabelcredito_mone_localListadoMovimientos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoMovimientos.jLabeldescripcionListadoMovimientos,"");
		
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
		this.iIdNuevoListadoMovimientos--;	
		
		
		this.listadomovimientosAux=new ListadoMovimientos();
		
		this.listadomovimientosAux.setId(this.iIdNuevoListadoMovimientos);
		this.listadomovimientosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.listadomovimientosLogic.getListadoMovimientoss().add(this.listadomovimientosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.listadomovimientoss.add(this.listadomovimientosAux);
		}
		//ARCHITECTURE
		
		this.listadomovimientos=this.listadomovimientosAux;
		
		if(ListadoMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioListadoMovimientos(this.listadomovimientos);
			this.setVariablesObjetoActualToFormularioForeignKeyListadoMovimientos(this.listadomovimientos);
		}
				
		//this.setDefaultControlesListadoMovimientos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyListadoMovimientos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyListadoMovimientos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyListadoMovimientos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualListadoMovimientos(this.listadomovimientosBean,this.listadomovimientos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanListadoMovimientos(this.listadomovimientosReturnGeneral,this.listadomovimientosBean,false);
		
		if(this.listadomovimientosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyListadoMovimientos(this.listadomovimientosReturnGeneral.getListadoMovimientos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioListadoMovimientos(this.listadomovimientosReturnGeneral.getListadoMovimientos());
		}
		
		if(this.listadomovimientosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioListadoMovimientos(this.listadomovimientosReturnGeneral.getListadoMovimientos(),classes);//this.listadomovimientosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualListadoMovimientos(this.listadomovimientos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyListadoMovimientos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyListadoMovimientos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ListadoMovimientosBeanSwingJInternalFrameAdditional.RecargarFormListadoMovimientos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingListadoMovimientos(false);
						
			if(listadomovimientosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ListadoMovimientosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadoMovimientos();
			}
			
			this.actualizarVisualTableDatosListadoMovimientos();
			
			this.jTableDatosListadoMovimientos.setRowSelectionInterval(this.getIndiceNuevoListadoMovimientos(), this.getIndiceNuevoListadoMovimientos());
			
			this.seleccionarFilaTablaListadoMovimientosActual();
						
			this.actualizarEstadoCeldasBotonesListadoMovimientos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesListadoMovimientos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_emision_desdeListadoMovimientos.setEnabled(isHabilitar && this.listadomovimientosConstantesFunciones.activarfecha_emision_desdeListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_emision_hastaListadoMovimientos.setEnabled(isHabilitar && this.listadomovimientosConstantesFunciones.activarfecha_emision_hastaListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldnombre_transaccionListadoMovimientos.setEnabled(isHabilitar && this.listadomovimientosConstantesFunciones.activarnombre_transaccionListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_emisionListadoMovimientos.setEnabled(isHabilitar && this.listadomovimientosConstantesFunciones.activarfecha_emisionListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_ventaListadoMovimientos.setEnabled(isHabilitar && this.listadomovimientosConstantesFunciones.activarfecha_ventaListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldnumero_comprobanteListadoMovimientos.setEnabled(isHabilitar && this.listadomovimientosConstantesFunciones.activarnumero_comprobanteListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jTextAreanombre_clienteListadoMovimientos.setEnabled(isHabilitar && this.listadomovimientosConstantesFunciones.activarnombre_clienteListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jTextFielddebito_mone_localListadoMovimientos.setEnabled(isHabilitar && this.listadomovimientosConstantesFunciones.activardebito_mone_localListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldcredito_mone_localListadoMovimientos.setEnabled(isHabilitar && this.listadomovimientosConstantesFunciones.activarcredito_mone_localListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jTextAreadescripcionListadoMovimientos.setEnabled(isHabilitar && this.listadomovimientosConstantesFunciones.activardescripcionListadoMovimientos);	
		//
		this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxid_empresaListadoMovimientos.setEnabled(isHabilitar && this.listadomovimientosConstantesFunciones.activarid_empresaListadoMovimientos);
	};
	
	public void setDefaultControlesListadoMovimientos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoListadoMovimientos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.listadomovimientosSessionBean.setConGuardarRelaciones(true);			
			this.listadomovimientosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormListadoMovimientos.jTabbedPaneRelacionesListadoMovimientos.setVisible(true);
			
					
		} else {
			//this.listadomovimientosSessionBean.setConGuardarRelaciones(false);			
			this.listadomovimientosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormListadoMovimientos.jTabbedPaneRelacionesListadoMovimientos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoListadoMovimientos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadoMovimientos listadomovimientosAux:this.listadomovimientosLogic.getListadoMovimientoss()) {
				if(listadomovimientosAux.getId().equals(this.iIdNuevoListadoMovimientos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadoMovimientos listadomovimientosAux:this.listadomovimientoss) {
				if(listadomovimientosAux.getId().equals(this.iIdNuevoListadoMovimientos)) {
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
	
	public int getIndiceActualListadoMovimientos(ListadoMovimientos listadomovimientos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadoMovimientos listadomovimientosAux:this.listadomovimientosLogic.getListadoMovimientoss()) {
				if(listadomovimientosAux.getId().equals(listadomovimientos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadoMovimientos listadomovimientosAux:this.listadomovimientoss) {
				if(listadomovimientosAux.getId().equals(listadomovimientos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalListadoMovimientos(ListadoMovimientos listadomovimientosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadoMovimientos listadomovimientosAux:this.listadomovimientosLogic.getListadoMovimientoss()) {
				if(listadomovimientosAux.getListadoMovimientosOriginal().getId().equals(listadomovimientosOriginal.getId())) {
					existe=true;
					listadomovimientosOriginal.setId(listadomovimientosAux.getId());
					listadomovimientosOriginal.setVersionRow(listadomovimientosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadoMovimientos listadomovimientosAux:this.listadomovimientoss) {
				if(listadomovimientosAux.getListadoMovimientosOriginal().getId().equals(listadomovimientosOriginal.getId())) {
					existe=true;
					listadomovimientosOriginal.setId(listadomovimientosAux.getId());
					listadomovimientosOriginal.setVersionRow(listadomovimientosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosListadoMovimientos(Boolean esParaCancelar) throws Exception {
		listadomovimientossAux=new ArrayList<ListadoMovimientos>();
		listadomovimientosAux=new ListadoMovimientos();
		
		if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ListadoMovimientos listadomovimientosAux:this.listadomovimientosLogic.getListadoMovimientoss()) {
					if(listadomovimientosAux.getId()<0) {
						listadomovimientossAux.add(listadomovimientosAux);
					}		
				}
				this.iIdNuevoListadoMovimientos=0L;
				this.listadomovimientosLogic.getListadoMovimientoss().removeAll(listadomovimientossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadoMovimientos listadomovimientosAux:this.listadomovimientoss) {
					if(listadomovimientosAux.getId()<0) {
						listadomovimientossAux.add(listadomovimientosAux);
					}		
				}
				this.iIdNuevoListadoMovimientos=0L;
				this.listadomovimientoss.removeAll(listadomovimientossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoListadoMovimientos 
					&& this.listadomovimientosLogic.getListadoMovimientoss().size()>0
					) {
					listadomovimientosAux=this.listadomovimientosLogic.getListadoMovimientoss().get(this.listadomovimientosLogic.getListadoMovimientoss().size() - 1);
				
					if(listadomovimientosAux.getId()<0) {
						this.listadomovimientosLogic.getListadoMovimientoss().remove(listadomovimientosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoListadoMovimientos && this.listadomovimientoss.size()>0) {
					listadomovimientosAux=this.listadomovimientoss.get(this.listadomovimientoss.size() - 1);
				
					if(listadomovimientosAux.getId()<0) {
						this.listadomovimientoss.remove(listadomovimientosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoListadoMovimientos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(listadomovimientos.getId()<0) {
				this.listadomovimientosLogic.getListadoMovimientoss().remove(this.listadomovimientos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(listadomovimientos.getId()<0) {
				this.listadomovimientoss.remove(this.listadomovimientos);
			}
		}			
	}
	
	public void setEstadosInicialesListadoMovimientos(List<ListadoMovimientos> listadomovimientossAux) throws Exception {
		ListadoMovimientosConstantesFunciones.setEstadosInicialesListadoMovimientos(listadomovimientossAux);
	}
	
	public void setEstadosInicialesListadoMovimientos(ListadoMovimientos listadomovimientosAux) throws Exception {
		ListadoMovimientosConstantesFunciones.setEstadosInicialesListadoMovimientos(listadomovimientosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarListadoMovimientosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesListadoMovimientos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarListadoMovimientosActual()) {
				if(!this.isEsNuevoListadoMovimientos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesListadoMovimientos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoListadoMovimientos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarListadoMovimientosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Listado Movimientos ?", "MANTENIMIENTO DE Listado Movimientos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesListadoMovimientos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ListadoMovimientos listadomovimientos) throws Exception {
		ListadoMovimientosConstantesFunciones.seleccionarAsignar(this.listadomovimientos,listadomovimientos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarListadoMovimientos=this.isPermisoActualizarOriginalListadoMovimientos;
			
			
			this.seleccionarAsignar(listadomovimientos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesListadoMovimientos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.listadomovimientosSessionBean.setsFuncionBusquedaRapida(this.listadomovimientosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoListadoMovimientos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosListadoMovimientos(esParaCancelar);				
				this.cancelarNuevoListadoMovimientos(esParaCancelar);								
			}
			
			this.listadomovimientos=new ListadoMovimientos();
			
			this.inicializarListadoMovimientos();
			
			this.actualizarEstadoCeldasBotonesListadoMovimientos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarListadoMovimientos() throws Exception {
		try {
			ListadoMovimientosConstantesFunciones.inicializarListadoMovimientos(this.listadomovimientos);
			
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
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.listadomovimientosLogic.getListadoMovimientoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteListadoMovimientoss(String sAccionBusqueda,List<ListadoMovimientos> listadomovimientossParaReportes) throws Exception {
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
					sPathReporteFinal="ListadoMovimientos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ListadoMovimientosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ListadoMovimientosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ListadoMovimientos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Listado Movimientoses");		
		parameters.put("busquedapor", ListadoMovimientosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceListadoMovimientos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ListadoMovimientosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ListadoMovimientosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceListadoMovimientos=new JRBeanArrayDataSource(ListadoMovimientosJInternalFrame.TraerListadoMovimientosBeans(listadomovimientossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceListadoMovimientos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ListadoMovimientosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ListadoMovimientosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ListadoMovimientosBean.TraerListadoMovimientosBeans(listadomovimientossParaReportes).toArray()));
							
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
				this.generarExcelReporteListadoMovimientoss(sAccionBusqueda,sTipoArchivoReporte,listadomovimientossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalListadoMovimientoss(sAccionBusqueda,sTipoArchivoReporte,listadomovimientossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoListadoMovimientosActionPerformed(null);
					//this.generarExcelReporteListadoMovimientoss(sAccionBusqueda,sTipoArchivoReporte,listadomovimientossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalListadoMovimientoss(sAccionBusqueda,sTipoArchivoReporte,listadomovimientossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesListadoMovimientoss(sAccionBusqueda,sTipoArchivoReporte,listadomovimientossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesListadoMovimientoss(sAccionBusqueda,sTipoArchivoReporte,listadomovimientossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteListadoMovimientoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadoMovimientos> listadomovimientossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadomovimientos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadoMovimientoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderListadoMovimientos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ListadoMovimientos listadomovimientos : listadomovimientossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ListadoMovimientosConstantesFunciones.generarExcelReporteDataListadoMovimientos("NORMAL",row,workbook,listadomovimientos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Movimientos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderListadoMovimientos(String sTipo,Row row,Workbook workbook) {
		
		ListadoMovimientosConstantesFunciones.generarExcelReporteHeaderListadoMovimientos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalListadoMovimientoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadoMovimientos> listadomovimientossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadomovimientos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadoMovimientoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ListadoMovimientos listadomovimientos : listadomovimientossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ListadoMovimientosConstantesFunciones.getListadoMovimientosDescripcion(listadomovimientos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoMovimientosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadomovimientos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadomovimientos.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadomovimientos.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadomovimientos.getnombre_transaccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadomovimientos.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadomovimientos.getfecha_venta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadomovimientos.getnumero_comprobante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadomovimientos.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadomovimientos.getdebito_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadomovimientos.getcredito_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadomovimientos.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Movimientos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesListadoMovimientoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadoMovimientos> listadomovimientossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ListadoMovimientos> listadomovimientossRespaldo=null;
		
		classes=ListadoMovimientosConstantesFunciones.getClassesRelationshipsOfListadoMovimientos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.listadomovimientosLogic.setDatosCliente(this.datosCliente);
		this.listadomovimientosLogic.setDatosDeep(this.datosDeep);
		this.listadomovimientosLogic.setIsConDeep(true);
		
		listadomovimientossRespaldo=this.listadomovimientosLogic.getListadoMovimientoss();
		
		this.listadomovimientosLogic.setListadoMovimientoss(listadomovimientossParaReportes);	
		this.listadomovimientosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		listadomovimientossParaReportes=this.listadomovimientosLogic.getListadoMovimientoss();
		this.listadomovimientosLogic.setListadoMovimientoss(listadomovimientossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadomovimientos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadoMovimientoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderListadoMovimientos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ListadoMovimientos listadomovimientos : listadomovimientossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderListadoMovimientos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ListadoMovimientosConstantesFunciones.generarExcelReporteDataListadoMovimientos("NORMAL",row,workbook,listadomovimientos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ListadoMovimientosConstantesFunciones.getListadoMovimientosDescripcion(listadomovimientos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Movimientos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoListadoMovimientos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadoMovimientos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoListadoMovimientos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadoMovimientos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessListadoMovimientos() throws Exception {		
		this.startProcessListadoMovimientos(true);
	}
	
	public void startProcessListadoMovimientos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasListadoMovimientos ,this.jPanelParametrosReportesListadoMovimientos, this.jScrollPanelDatosListadoMovimientos,this.jPanelPaginacionListadoMovimientos, this.jScrollPanelDatosEdicionListadoMovimientos, this.jPanelAccionesListadoMovimientos,this.jPanelAccionesFormularioListadoMovimientos,this.jmenuBarListadoMovimientos,this.jmenuBarDetalleListadoMovimientos,this.jTtoolBarListadoMovimientos,this.jTtoolBarDetalleListadoMovimientos);		
		
		final JTabbedPane jTabbedPaneBusquedasListadoMovimientos=this.jTabbedPaneBusquedasListadoMovimientos; 
		
		final JPanel jPanelParametrosReportesListadoMovimientos=this.jPanelParametrosReportesListadoMovimientos;
		//final JScrollPane jScrollPanelDatosListadoMovimientos=this.jScrollPanelDatosListadoMovimientos;
		final JTable jTableDatosListadoMovimientos=this.jTableDatosListadoMovimientos;		
		final JPanel jPanelPaginacionListadoMovimientos=this.jPanelPaginacionListadoMovimientos;
		//final JScrollPane jScrollPanelDatosEdicionListadoMovimientos=this.jScrollPanelDatosEdicionListadoMovimientos;
		final JPanel jPanelAccionesListadoMovimientos=this.jPanelAccionesListadoMovimientos;
		
		JPanel jPanelCamposAuxiliarListadoMovimientos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarListadoMovimientos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
			jPanelCamposAuxiliarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jPanelCamposListadoMovimientos;
			jPanelAccionesFormularioAuxiliarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jPanelAccionesFormularioListadoMovimientos;
		}
		
		final JPanel jPanelCamposListadoMovimientos=jPanelCamposAuxiliarListadoMovimientos;
		final JPanel jPanelAccionesFormularioListadoMovimientos=jPanelAccionesFormularioAuxiliarListadoMovimientos;
		
		
		final JMenuBar jmenuBarListadoMovimientos=this.jmenuBarListadoMovimientos;
		final JToolBar jTtoolBarListadoMovimientos=this.jTtoolBarListadoMovimientos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarListadoMovimientos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarListadoMovimientos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
			jmenuBarDetalleAuxiliarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jmenuBarDetalleListadoMovimientos;
			jTtoolBarDetalleAuxiliarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jTtoolBarDetalleListadoMovimientos;
		}
		
		final JMenuBar jmenuBarDetalleListadoMovimientos=jmenuBarDetalleAuxiliarListadoMovimientos;
		final JToolBar jTtoolBarDetalleListadoMovimientos=jTtoolBarDetalleAuxiliarListadoMovimientos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasListadoMovimientos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesListadoMovimientos;
			processRunnable.jTableDatos=jTableDatosListadoMovimientos;
			processRunnable.jPanelCampos=jPanelCamposListadoMovimientos;
			processRunnable.jPanelPaginacion=jPanelPaginacionListadoMovimientos;
			processRunnable.jPanelAcciones=jPanelAccionesListadoMovimientos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioListadoMovimientos;
			
			
			processRunnable.jmenuBar=jmenuBarListadoMovimientos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleListadoMovimientos;
			processRunnable.jTtoolBar=jTtoolBarListadoMovimientos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleListadoMovimientos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasListadoMovimientos ,jPanelParametrosReportesListadoMovimientos,jTableDatosListadoMovimientos, /*jScrollPanelDatosListadoMovimientos,*/jPanelCamposListadoMovimientos,jPanelPaginacionListadoMovimientos, /*jScrollPanelDatosEdicionListadoMovimientos,*/ jPanelAccionesListadoMovimientos,jPanelAccionesFormularioListadoMovimientos,jmenuBarListadoMovimientos,jmenuBarDetalleListadoMovimientos,jTtoolBarListadoMovimientos,jTtoolBarDetalleListadoMovimientos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasListadoMovimientos ,jPanelParametrosReportesListadoMovimientos, jScrollPanelDatosListadoMovimientos,jPanelPaginacionListadoMovimientos, jScrollPanelDatosEdicionListadoMovimientos, jPanelAccionesListadoMovimientos,jPanelAccionesFormularioListadoMovimientos,jmenuBarListadoMovimientos,jmenuBarDetalleListadoMovimientos,jTtoolBarListadoMovimientos,jTtoolBarDetalleListadoMovimientos);
						
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
	
	public void finishProcessListadoMovimientos() {// throws Exception 
		this.finishProcessListadoMovimientos(true);
	}
	
	public void finishProcessListadoMovimientos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasListadoMovimientos ,this.jPanelParametrosReportesListadoMovimientos, this.jScrollPanelDatosListadoMovimientos,this.jPanelPaginacionListadoMovimientos, this.jScrollPanelDatosEdicionListadoMovimientos, this.jPanelAccionesListadoMovimientos,this.jPanelAccionesFormularioListadoMovimientos,this.jmenuBarListadoMovimientos,this.jmenuBarDetalleListadoMovimientos,this.jTtoolBarListadoMovimientos,this.jTtoolBarDetalleListadoMovimientos);		
		
		final JTabbedPane jTabbedPaneBusquedasListadoMovimientos=this.jTabbedPaneBusquedasListadoMovimientos; 
		
		final JPanel jPanelParametrosReportesListadoMovimientos=this.jPanelParametrosReportesListadoMovimientos;
		//final JScrollPane jScrollPanelDatosListadoMovimientos=this.jScrollPanelDatosListadoMovimientos;
		final JTable jTableDatosListadoMovimientos=this.jTableDatosListadoMovimientos;		
		final JPanel jPanelPaginacionListadoMovimientos=this.jPanelPaginacionListadoMovimientos;
		//final JScrollPane jScrollPanelDatosEdicionListadoMovimientos=this.jScrollPanelDatosEdicionListadoMovimientos;
		final JPanel jPanelAccionesListadoMovimientos=this.jPanelAccionesListadoMovimientos;
		
		JPanel jPanelCamposAuxiliarListadoMovimientos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarListadoMovimientos=new JPanel();
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
			jPanelCamposAuxiliarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jPanelCamposListadoMovimientos;
			jPanelAccionesFormularioAuxiliarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jPanelAccionesFormularioListadoMovimientos;
		}
		
		final JPanel jPanelCamposListadoMovimientos=jPanelCamposAuxiliarListadoMovimientos;
		final JPanel jPanelAccionesFormularioListadoMovimientos=jPanelAccionesFormularioAuxiliarListadoMovimientos;
		
		
		final JMenuBar jmenuBarListadoMovimientos=this.jmenuBarListadoMovimientos;		
		final JToolBar jTtoolBarListadoMovimientos=this.jTtoolBarListadoMovimientos;
				
		JMenuBar jmenuBarDetalleAuxiliarListadoMovimientos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarListadoMovimientos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
			jmenuBarDetalleAuxiliarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jmenuBarDetalleListadoMovimientos;
			jTtoolBarDetalleAuxiliarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jTtoolBarDetalleListadoMovimientos;		
		}
		
		final JMenuBar jmenuBarDetalleListadoMovimientos=jmenuBarDetalleAuxiliarListadoMovimientos;
		final JToolBar jTtoolBarDetalleListadoMovimientos=jTtoolBarDetalleAuxiliarListadoMovimientos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasListadoMovimientos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesListadoMovimientos;
			processRunnable.jTableDatos=jTableDatosListadoMovimientos;
			processRunnable.jPanelCampos=jPanelCamposListadoMovimientos;
			processRunnable.jPanelPaginacion=jPanelPaginacionListadoMovimientos;
			processRunnable.jPanelAcciones=jPanelAccionesListadoMovimientos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioListadoMovimientos;
			
			
			processRunnable.jmenuBar=jmenuBarListadoMovimientos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleListadoMovimientos;
			processRunnable.jTtoolBar=jTtoolBarListadoMovimientos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleListadoMovimientos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasListadoMovimientos ,jPanelParametrosReportesListadoMovimientos, jTableDatosListadoMovimientos,/*jScrollPanelDatosListadoMovimientos,*/jPanelCamposListadoMovimientos,jPanelPaginacionListadoMovimientos, /*jScrollPanelDatosEdicionListadoMovimientos,*/ jPanelAccionesListadoMovimientos,jPanelAccionesFormularioListadoMovimientos,jmenuBarListadoMovimientos,jmenuBarDetalleListadoMovimientos,jTtoolBarListadoMovimientos,jTtoolBarDetalleListadoMovimientos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesListadoMovimientos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarListadoMovimientos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuListadoMovimientos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarListadoMovimientos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarListadoMovimientos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleListadoMovimientos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuListadoMovimientos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarListadoMovimientos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleListadoMovimientos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.listadomovimientosConstantesFunciones.getsFinalQueryListadoMovimientos();
		String  finalQueryPaginacionTodos=this.listadomovimientosConstantesFunciones.getsFinalQueryListadoMovimientos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ListadoMovimientosConstantesFunciones.getArrayColumnasGlobalesNoListadoMovimientos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ListadoMovimientosConstantesFunciones.getArrayColumnasGlobalesListadoMovimientos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ListadoMovimientosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.listadomovimientossEliminados= new ArrayList<ListadoMovimientos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessListadoMovimientos();
		
				///*ListadoMovimientosSessionBean*/this.listadomovimientosSessionBean=new ListadoMovimientosSessionBean();
			
			if(this.listadomovimientosSessionBean==null) {
				this.listadomovimientosSessionBean=new ListadoMovimientosSessionBean();
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
					this.iNumeroPaginacion=ListadoMovimientosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ListadoMovimientosConstantesFunciones.getClassesForeignKeysOfListadoMovimientos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/listadomovimientos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			listadomovimientossAux= new ArrayList<ListadoMovimientos>();
			
				
			listadomovimientosLogic.setDatosCliente(this.datosCliente);
			listadomovimientosLogic.setDatosDeep(this.datosDeep);
			listadomovimientosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaListadoMovimientos")) {
				this.sDetalleReporte=ListadoMovimientosConstantesFunciones.getDetalleIndiceBusquedaListadoMovimientos(fecha_emision_desdeBusquedaListadoMovimientos,fecha_emision_hastaBusquedaListadoMovimientos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					listadomovimientosLogic.getListadoMovimientossBusquedaListadoMovimientos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaListadoMovimientos,fecha_emision_hastaBusquedaListadoMovimientos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ListadoMovimientosConstantesFunciones.getDetalleIndiceBusquedaListadoMovimientos(fecha_emision_desdeBusquedaListadoMovimientos,fecha_emision_hastaBusquedaListadoMovimientos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ListadoMovimientosConstantesFunciones.getDetalleIndiceBusquedaListadoMovimientos(fecha_emision_desdeBusquedaListadoMovimientos,fecha_emision_hastaBusquedaListadoMovimientos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=listadomovimientosLogic.getListadoMovimientoss()==null||listadomovimientosLogic.getListadoMovimientoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=listadomovimientoss==null|| listadomovimientoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						listadomovimientossAux=new ArrayList<ListadoMovimientos>();
						listadomovimientossAux.addAll(listadomovimientosLogic.getListadoMovimientoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadomovimientossAux=new ArrayList<ListadoMovimientos>();
							listadomovimientossAux.addAll(listadomovimientoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							listadomovimientosLogic.getListadoMovimientossBusquedaListadoMovimientos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaListadoMovimientos,fecha_emision_hastaBusquedaListadoMovimientos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ListadoMovimientosConstantesFunciones.getDetalleIndiceBusquedaListadoMovimientos(fecha_emision_desdeBusquedaListadoMovimientos,fecha_emision_hastaBusquedaListadoMovimientos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ListadoMovimientosConstantesFunciones.getDetalleIndiceBusquedaListadoMovimientos(fecha_emision_desdeBusquedaListadoMovimientos,fecha_emision_hastaBusquedaListadoMovimientos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteListadoMovimientoss("BusquedaListadoMovimientos",listadomovimientosLogic.getListadoMovimientoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteListadoMovimientoss("BusquedaListadoMovimientos",listadomovimientoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						listadomovimientosLogic.setListadoMovimientoss(new ArrayList<ListadoMovimientos>());
						listadomovimientosLogic.getListadoMovimientoss().addAll(listadomovimientossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadomovimientoss=new ArrayList<ListadoMovimientos>();
							listadomovimientoss.addAll(listadomovimientossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesListadoMovimientos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessListadoMovimientos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=listadomovimientosLogic.getListadoMovimientoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadomovimientoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=listadomovimientosLogic.getListadoMovimientoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadomovimientoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ListadoMovimientos listadomovimientos) {
		Boolean permite=true;
		
		if(this.listadomovimientos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ListadoMovimientosConstantesFunciones.getOrderByListaListadoMovimientos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ListadoMovimientosConstantesFunciones.getOrderByListaListadoMovimientos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadoMovimientos listadomovimientos:listadomovimientosLogic.getListadoMovimientoss()) {
				if(listadomovimientos.getsType().equals(Constantes2.S_TOTALES)) {
					listadomovimientosTotales=listadomovimientos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadoMovimientos listadomovimientos:this.listadomovimientoss) {
				if(listadomovimientos.getsType().equals(Constantes2.S_TOTALES)) {
					listadomovimientosTotales=listadomovimientos;
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
			this.listadomovimientosAux=new ListadoMovimientos();
			this.listadomovimientosAux.setsType(Constantes2.S_TOTALES);
			this.listadomovimientosAux.setIsNew(false);
			this.listadomovimientosAux.setIsChanged(false);
			this.listadomovimientosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ListadoMovimientosConstantesFunciones.TotalizarValoresFilaListadoMovimientos(this.listadomovimientosLogic.getListadoMovimientoss(),this.listadomovimientosAux);
				
				//this.listadomovimientosLogic.getListadoMovimientoss().add(this.listadomovimientosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ListadoMovimientosConstantesFunciones.TotalizarValoresFilaListadoMovimientos(this.listadomovimientoss,this.listadomovimientosAux);
				
				this.listadomovimientoss.add(this.listadomovimientosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		listadomovimientosTotales=new ListadoMovimientos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.listadomovimientosLogic.getListadoMovimientoss().remove(listadomovimientosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.listadomovimientoss.remove(listadomovimientosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		listadomovimientosTotales=new ListadoMovimientos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadoMovimientos listadomovimientos:listadomovimientosLogic.getListadoMovimientoss()) {
				if(listadomovimientos.getsType().equals(Constantes2.S_TOTALES)) {
					listadomovimientosTotales=listadomovimientos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ListadoMovimientosConstantesFunciones.TotalizarValoresFilaListadoMovimientos(this.listadomovimientosLogic.getListadoMovimientoss(),listadomovimientosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadoMovimientos listadomovimientos:this.listadomovimientoss) {
				if(listadomovimientos.getsType().equals(Constantes2.S_TOTALES)) {
					listadomovimientosTotales=listadomovimientos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ListadoMovimientosConstantesFunciones.TotalizarValoresFilaListadoMovimientos(this.listadomovimientoss,listadomovimientosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getListadoMovimientossBusquedaListadoMovimientos()throws Exception {
		try {
			sAccionBusqueda="BusquedaListadoMovimientos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getListadoMovimientossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getListadoMovimientossBusquedaListadoMovimientos(String sFinalQuery,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadomovimientosLogic.getListadoMovimientossBusquedaListadoMovimientos(sFinalQuery,this.pagination,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getListadoMovimientossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadomovimientosLogic.getListadoMovimientossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosListadoMovimientos() {
		this.isPermisoTodoListadoMovimientos=false;
		this.isPermisoNuevoListadoMovimientos=false;
		this.isPermisoActualizarListadoMovimientos=false;
		this.isPermisoActualizarOriginalListadoMovimientos=false;
		this.isPermisoEliminarListadoMovimientos=false;
		this.isPermisoGuardarCambiosListadoMovimientos=false;
		this.isPermisoConsultaListadoMovimientos=true;
		this.isPermisoBusquedaListadoMovimientos=true;
		this.isPermisoReporteListadoMovimientos=true;
		this.isPermisoOrdenListadoMovimientos=false;		
		this.isPermisoPaginacionMedioListadoMovimientos=false;		
		this.isPermisoPaginacionAltoListadoMovimientos=false;		
		this.isPermisoPaginacionTodoListadoMovimientos=false;		
		this.isPermisoCopiarListadoMovimientos=false;		
		this.isPermisoVerFormListadoMovimientos=false;		
		this.isPermisoDuplicarListadoMovimientos=false;
		this.isPermisoOrdenListadoMovimientos=false;
	}
	
	public void setPermisosUsuarioListadoMovimientos(Boolean isPermiso) {
		this.isPermisoTodoListadoMovimientos=isPermiso;
		this.isPermisoNuevoListadoMovimientos=isPermiso;
		this.isPermisoActualizarListadoMovimientos=isPermiso;
		this.isPermisoActualizarOriginalListadoMovimientos=isPermiso;
		this.isPermisoEliminarListadoMovimientos=isPermiso;
		this.isPermisoGuardarCambiosListadoMovimientos=isPermiso;
		this.isPermisoConsultaListadoMovimientos=isPermiso;
		this.isPermisoBusquedaListadoMovimientos=isPermiso;
		this.isPermisoReporteListadoMovimientos=isPermiso;
		this.isPermisoOrdenListadoMovimientos=isPermiso;		
		this.isPermisoPaginacionMedioListadoMovimientos=isPermiso;		
		this.isPermisoPaginacionAltoListadoMovimientos=isPermiso;		
		this.isPermisoPaginacionTodoListadoMovimientos=isPermiso;		
		this.isPermisoCopiarListadoMovimientos=isPermiso;		
		this.isPermisoVerFormListadoMovimientos=isPermiso;		
		this.isPermisoDuplicarListadoMovimientos=isPermiso;
		this.isPermisoOrdenListadoMovimientos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioListadoMovimientos(Boolean isPermiso) {
		//this.isPermisoTodoListadoMovimientos=isPermiso;
		this.isPermisoNuevoListadoMovimientos=isPermiso;
		this.isPermisoActualizarListadoMovimientos=isPermiso;
		this.isPermisoActualizarOriginalListadoMovimientos=isPermiso;
		this.isPermisoEliminarListadoMovimientos=isPermiso;
		this.isPermisoGuardarCambiosListadoMovimientos=isPermiso;
		//this.isPermisoConsultaListadoMovimientos=isPermiso;
		//this.isPermisoBusquedaListadoMovimientos=isPermiso;
		//this.isPermisoReporteListadoMovimientos=isPermiso;
		//this.isPermisoOrdenListadoMovimientos=isPermiso;		
		//this.isPermisoPaginacionMedioListadoMovimientos=isPermiso;		
		//this.isPermisoPaginacionAltoListadoMovimientos=isPermiso;		
		//this.isPermisoPaginacionTodoListadoMovimientos=isPermiso;		
		//this.isPermisoCopiarListadoMovimientos=isPermiso;		
		//this.isPermisoDuplicarListadoMovimientos=isPermiso;
		//this.isPermisoOrdenListadoMovimientos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioListadoMovimientosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ListadoMovimientosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebListadoMovimientos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioListadoMovimientosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioListadoMovimientosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionListadoMovimientosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioListadoMovimientosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioListadoMovimientos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ListadoMovimientosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ListadoMovimientosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoListadoMovimientos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarListadoMovimientos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalListadoMovimientos=this.isPermisoActualizarListadoMovimientos;
			this.isPermisoEliminarListadoMovimientos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosListadoMovimientos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaListadoMovimientos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaListadoMovimientos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoListadoMovimientos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteListadoMovimientos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenListadoMovimientos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioListadoMovimientos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoListadoMovimientos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoListadoMovimientos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarListadoMovimientos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormListadoMovimientos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarListadoMovimientos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenListadoMovimientos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosListadoMovimientos.setToolTipText(this.jTableDatosListadoMovimientos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioListadoMovimientos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioListadoMovimientos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ListadoMovimientosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ListadoMovimientosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioListadoMovimientos() throws Exception {
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
	public void inicializarCombosForeignKeyListadoMovimientosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyListadoMovimientosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ListadoMovimientosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyListadoMovimientos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.listadomovimientosSessionBean==null) {
				this.listadomovimientosSessionBean=new ListadoMovimientosSessionBean();
			}

			if(!this.listadomovimientosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyListadoMovimientos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyListadoMovimientos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyListadoMovimientos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyListadoMovimientos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyListadoMovimientos(ListadoMovimientos listadomovimientos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyListadoMovimientos(ListadoMovimientos listadomovimientos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyListadoMovimientos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyListadoMovimientos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyListadoMovimientos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyListadoMovimientos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroListadoMovimientos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyListadoMovimientos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyListadoMovimientos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyListadoMovimientos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxid_empresaListadoMovimientos!=null && this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxid_empresaListadoMovimientos.getItemCount()>0) {
				this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxid_empresaListadoMovimientos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ListadoMovimientosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ListadoMovimientosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ListadoMovimientosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.listadomovimientosSessionBean=new ListadoMovimientosSessionBean(); 
		this.listadomovimientosConstantesFunciones=new ListadoMovimientosConstantesFunciones(); 
		this.listadomovimientosBean=new ListadoMovimientos();//(this.listadomovimientosConstantesFunciones); 		
		this.listadomovimientosReturnGeneral=new ListadoMovimientosParameterReturnGeneral(); 
		
		this.listadomovimientosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadomovimientosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ListadoMovimientosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ListadoMovimientosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ListadoMovimientosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessListadoMovimientos(true);
			
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
			
			this.listadomovimientosConstantesFunciones=new ListadoMovimientosConstantesFunciones(); 
			this.listadomovimientosBean=new ListadoMovimientos();//this.listadomovimientosConstantesFunciones); 			
			this.listadomovimientosReturnGeneral=new ListadoMovimientosParameterReturnGeneral(); 
		
			ListadoMovimientosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Listado Movimientos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.listadomovimientos=new ListadoMovimientos();
			this.listadomovimientoss = new ArrayList<ListadoMovimientos>();
			this.listadomovimientossAux = new ArrayList<ListadoMovimientos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic=new ListadoMovimientosLogic();
				this.listadomovimientosLogic.getNewConnexionToDeep("");
			}
			
			//this.listadomovimientosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.listadomovimientosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormListadoMovimientos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoListadoMovimientos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoListadoMovimientos);	
					}
					
					if(this.jInternalFrameImportacionListadoMovimientos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionListadoMovimientos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByListadoMovimientos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByListadoMovimientos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormListadoMovimientos);
				this.jInternalFrameDetalleFormListadoMovimientos.setVisible(false);
				this.jInternalFrameDetalleFormListadoMovimientos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoListadoMovimientos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoListadoMovimientos);
					this.jInternalFrameReporteDinamicoListadoMovimientos.setVisible(false);
					this.jInternalFrameReporteDinamicoListadoMovimientos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionListadoMovimientos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionListadoMovimientos);
					this.jInternalFrameImportacionListadoMovimientos.setVisible(false);
					this.jInternalFrameImportacionListadoMovimientos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByListadoMovimientos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByListadoMovimientos);
					this.jInternalFrameOrderByListadoMovimientos.setVisible(false);
					this.jInternalFrameOrderByListadoMovimientos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idListadoMovimientosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ListadoMovimientosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.listadomovimientosReturnGeneral=new ListadoMovimientosParameterReturnGeneral();
			
			this.listadomovimientosParameterGeneral=new ListadoMovimientosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.listadomovimientosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ListadoMovimientosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ListadoMovimientosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.listadomovimientosSessionBean.getEsGuardarRelacionado(),this.listadomovimientosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ListadoMovimientosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.listadomovimientosSessionBean.getEsGuardarRelacionado(),this.listadomovimientosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoListadoMovimientos=false;
			this.isVisibilidadCeldaDuplicarListadoMovimientos=true;
			this.isVisibilidadCeldaCopiarListadoMovimientos=true;
			this.isVisibilidadCeldaVerFormListadoMovimientos=true;
			this.isVisibilidadCeldaOrdenListadoMovimientos=true;
			this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos=false;
			this.isVisibilidadCeldaModificarListadoMovimientos=false;
			this.isVisibilidadCeldaActualizarListadoMovimientos=false;
			this.isVisibilidadCeldaEliminarListadoMovimientos=false;
			this.isVisibilidadCeldaCancelarListadoMovimientos=false;
			this.isVisibilidadCeldaGuardarListadoMovimientos=false;
			this.isVisibilidadCeldaGuardarCambiosListadoMovimientos=false;
			
			
			this.isVisibilidadBusquedaListadoMovimientos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesListadoMovimientos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosListadoMovimientos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioListadoMovimientos(false);
			
			this.setPermisosUsuarioListadoMovimientos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado() 
				|| (this.listadomovimientosSessionBean.getEsGuardarRelacionado() && this.listadomovimientosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioListadoMovimientosClasesRelacionadas();
			}
			
			if(this.listadomovimientosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioListadoMovimientosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ListadoMovimientosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosListadoMovimientos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualListadoMovimientos();
			}
			
			if(!this.isPermisoBusquedaListadoMovimientos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasListadoMovimientos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ListadoMovimientosConstantesFunciones.getTiposSeleccionarListadoMovimientos());
				
				this.tiposColumnasSelect=ListadoMovimientosConstantesFunciones.getTiposSeleccionarListadoMovimientos(true);
				
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
			//if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioListadoMovimientos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioListadoMovimientos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioListadoMovimientos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesListadoMovimientos() ;
			
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
				listadomovimientosImplementable= (ListadoMovimientosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ListadoMovimientosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				listadomovimientosImplementableHome= (ListadoMovimientosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ListadoMovimientosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.listadomovimientoss= new ArrayList<ListadoMovimientos>();
			this.listadomovimientossEliminados= new ArrayList<ListadoMovimientos>();
						
			this.isEsNuevoListadoMovimientos=false;
			this.esParaAccionDesdeFormularioListadoMovimientos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyListadoMovimientos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroListadoMovimientos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ListadoMovimientosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ListadoMovimientosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesListadoMovimientos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingListadoMovimientos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioListadoMovimientos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioListadoMovimientos();
			}
			
			ListadoMovimientosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasListadoMovimientos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasListadoMovimientos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasListadoMovimientos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessListadoMovimientos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ListadoMovimientos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectListadoMovimientos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesListadoMovimientos")) {
				iIndex=this.jInternalFrameDetalleFormListadoMovimientos.jTabbedPaneRelacionesListadoMovimientos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormListadoMovimientos.jTabbedPaneRelacionesListadoMovimientos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessListadoMovimientos();	
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
	
	public void cargarCombosForeignKeyListadoMovimientos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyListadoMovimientos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyListadoMovimientos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyListadoMovimientosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyListadoMovimientos();
		
		this.cargarCombosFrameForeignKeyListadoMovimientos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyListadoMovimientos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyListadoMovimientos();
		}
	}
	
	
	
	public void jButtonNuevoListadoMovimientosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.listadomovimientosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormListadoMovimientos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
			
			
			if(jTableDatosListadoMovimientos.getRowCount()>=1) {
				jTableDatosListadoMovimientos.removeRowSelectionInterval(0, jTableDatosListadoMovimientos.getRowCount()-1);						
			}
			
			this.isEsNuevoListadoMovimientos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoListadoMovimientos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesListadoMovimientos(true);			
			//this.listadomovimientos=new ListadoMovimientos();
			//this.listadomovimientos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadoMovimientos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadoMovimientos() ;
			
			if(ListadoMovimientosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadoMovimientos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.listadomovimientos);	
			this.actualizarInformacion("INFO_PADRE",false,this.listadomovimientos);				
			
			ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
			
			if(this.listadomovimientosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ListadoMovimientos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarListadoMovimientosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ListadoMovimientos> listadomovimientossSeleccionados=new ArrayList<ListadoMovimientos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosListadoMovimientos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosListadoMovimientos.getSelectedRows().length;			
			}
			
			listadomovimientossSeleccionados=this.getListadoMovimientossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoListadoMovimientos--;			
				//ListadoMovimientos listadomovimientosAux= new ListadoMovimientos();			
				//listadomovimientosAux.setId(this.iIdNuevoListadoMovimientos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ListadoMovimientos listadomovimientosOrigen=new ListadoMovimientos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ListadoMovimientos listadomovimientosOrigen : listadomovimientossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							listadomovimientosOrigen =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadomovimientosOrigen =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaListadoMovimientos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.listadomovimientos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosListadoMovimientos(listadomovimientosOrigen,this.listadomovimientos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.listadomovimientosLogic.getListadoMovimientoss().add(this.listadomovimientosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.listadomovimientoss.add(this.listadomovimientosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaListadoMovimientos(false);
				
				this.jTableDatosListadoMovimientos.setRowSelectionInterval(this.getIndiceNuevoListadoMovimientos(), this.getIndiceNuevoListadoMovimientos());
				
				int iLastRow =  this.jTableDatosListadoMovimientos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosListadoMovimientos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosListadoMovimientos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaListadoMovimientos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ListadoMovimientos> listadomovimientossSeleccionados=new ArrayList<ListadoMovimientos>();									
		
			ListadoMovimientos listadomovimientosOrigen=new ListadoMovimientos();
			ListadoMovimientos listadomovimientosDestino=new ListadoMovimientos();
				
			listadomovimientossSeleccionados=this.getListadoMovimientossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosListadoMovimientos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || listadomovimientossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosListadoMovimientos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						listadomovimientosOrigen =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						listadomovimientosOrigen =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						listadomovimientosDestino =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						listadomovimientosDestino =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				listadomovimientosOrigen =listadomovimientossSeleccionados.get(0);
				listadomovimientosDestino =listadomovimientossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosListadoMovimientos(listadomovimientosOrigen,listadomovimientosDestino,true,false);
				
				listadomovimientosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(listadomovimientosDestino,listadomovimientosLogic.getListadoMovimientoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(listadomovimientosDestino,listadomovimientoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaListadoMovimientos(false);
				
				//this.jTableDatosListadoMovimientos.setRowSelectionInterval(this.getIndiceNuevoListadoMovimientos(), this.getIndiceNuevoListadoMovimientos());
				
				int iLastRow =  this.jTableDatosListadoMovimientos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosListadoMovimientos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosListadoMovimientos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaListadoMovimientos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormListadoMovimientos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormListadoMovimientos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesListadoMovimientos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasListadoMovimientos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesListadoMovimientos.setVisible(!isVisible);
			this.jPanelPaginacionListadoMovimientos.setVisible(!isVisible);
			this.jPanelAccionesListadoMovimientos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameListadoMovimientos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoListadoMovimientos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionListadoMovimientos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByListadoMovimientos();
			
			this.abrirFrameOrderByListadoMovimientos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByListadoMovimientos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleListadoMovimientos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormListadoMovimientos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormListadoMovimientos.isMaximum()) {
					this.jInternalFrameDetalleFormListadoMovimientos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormListadoMovimientos.setSize(this.jInternalFrameDetalleFormListadoMovimientos.iWidthFormulario,this.jInternalFrameDetalleFormListadoMovimientos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormListadoMovimientos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormListadoMovimientos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormListadoMovimientos.isMaximum()) {
						this.jInternalFrameDetalleFormListadoMovimientos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormListadoMovimientos.jContentPaneDetalleListadoMovimientos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormListadoMovimientos.jTabbedPaneRelacionesListadoMovimientos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormListadoMovimientos.jContentPaneDetalleListadoMovimientos.getWidth(),ListadoMovimientosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormListadoMovimientos.jTabbedPaneRelacionesListadoMovimientos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormListadoMovimientos.jContentPaneDetalleListadoMovimientos.getWidth(),ListadoMovimientosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormListadoMovimientos.jTabbedPaneRelacionesListadoMovimientos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormListadoMovimientos.jContentPaneDetalleListadoMovimientos.getWidth(),ListadoMovimientosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormListadoMovimientos.setVisible(true);
	        this.jInternalFrameDetalleFormListadoMovimientos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByListadoMovimientos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByListadoMovimientos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByListadoMovimientos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadoMovimientos,false,this);
				} else {
					this.jInternalFrameOrderByListadoMovimientos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadoMovimientos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByListadoMovimientos);
				this.jInternalFrameOrderByListadoMovimientos.setVisible(false);
				this.jInternalFrameOrderByListadoMovimientos.setSelected(false);
				
				this.jInternalFrameOrderByListadoMovimientos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByListadoMovimientos"));
				
				this.inicializarActualizarBindingTablaOrderByListadoMovimientos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionListadoMovimientos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionListadoMovimientos==null) {
				
				this.jInternalFrameImportacionListadoMovimientos=new ImportacionJInternalFrame(ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionListadoMovimientos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionListadoMovimientos);
				this.jInternalFrameImportacionListadoMovimientos.setVisible(false);
				this.jInternalFrameImportacionListadoMovimientos.setSelected(false);


				this.jInternalFrameImportacionListadoMovimientos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionListadoMovimientos"));
				this.jInternalFrameImportacionListadoMovimientos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionListadoMovimientos"));
				this.jInternalFrameImportacionListadoMovimientos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionListadoMovimientos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoListadoMovimientos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoListadoMovimientos==null) {
				this.jInternalFrameReporteDinamicoListadoMovimientos=new ReporteDinamicoJInternalFrame(ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoListadoMovimientos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoListadoMovimientos);
				this.jInternalFrameReporteDinamicoListadoMovimientos.setVisible(false);
				this.jInternalFrameReporteDinamicoListadoMovimientos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoListadoMovimientos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadoMovimientos"));
				this.jInternalFrameReporteDinamicoListadoMovimientos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadoMovimientos"));
				this.jInternalFrameReporteDinamicoListadoMovimientos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadoMovimientos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadoMovimientos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleListadoMovimientos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormListadoMovimientos);
			
	       	this.jInternalFrameDetalleFormListadoMovimientos.setVisible(false);
	        this.jInternalFrameDetalleFormListadoMovimientos.setSelected(false);
			
			//this.jInternalFrameDetalleFormListadoMovimientos.dispose();
			//this.jInternalFrameDetalleFormListadoMovimientos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoListadoMovimientos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoListadoMovimientos.setVisible(true);
	        this.jInternalFrameReporteDinamicoListadoMovimientos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionListadoMovimientos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionListadoMovimientos.setVisible(true);
	        this.jInternalFrameImportacionListadoMovimientos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByListadoMovimientos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByListadoMovimientos.setVisible(true);
	        this.jInternalFrameOrderByListadoMovimientos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByListadoMovimientos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByListadoMovimientos.setVisible(false);
	        this.jInternalFrameOrderByListadoMovimientos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoListadoMovimientos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoListadoMovimientos.setVisible(false);
	        this.jInternalFrameReporteDinamicoListadoMovimientos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionListadoMovimientos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionListadoMovimientos.setVisible(false);
	        this.jInternalFrameImportacionListadoMovimientos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarListadoMovimientos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarListadoMovimientos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesListadoMovimientos(true);
			//this.isEsNuevoListadoMovimientos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesListadoMovimientos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadoMovimientos(false) ;
			
			if(listadomovimientosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ListadoMovimientosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadoMovimientos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadoMovimientos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaListadoMovimientosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarListadoMovimientos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormListadoMovimientos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesListadoMovimientos(true);
			//this.isEsNuevoListadoMovimientos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.listadomovimientos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesListadoMovimientos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesListadoMovimientos(false) ;
			
			if(ListadoMovimientosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadoMovimientos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadoMovimientos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesListadoMovimientos(false);
			
			//if(!this.isEsNuevoListadoMovimientos) {								
				int intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ListadoMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualListadoMovimientos(this.listadomovimientos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
				
			}
			
			if(this.permiteMantenimiento(this.listadomovimientos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoListadoMovimientos=true;
					this.inicializarActualizarBindingTablaListadoMovimientos(false);
					this.isEsNuevoListadoMovimientos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoListadoMovimientos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoListadoMovimientos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesListadoMovimientos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadoMovimientos(false);
				
				this.habilitarDeshabilitarControlesListadoMovimientos(false);
			
												
				
				if(ListadoMovimientosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleListadoMovimientos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoListadoMovimientosActionPerformed(evt,listadomovimientosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualListadoMovimientos(this.listadomovimientos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosListadoMovimientos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,listadomovimientosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.listadomovimientos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ListadoMovimientos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoMovimientos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				this.listadomovimientos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				this.listadomovimientos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.listadomovimientos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ListadoMovimientosModel) this.jTableDatosListadoMovimientos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoListadoMovimientos=true;
				this.inicializarActualizarBindingTablaListadoMovimientos(false);
				this.isEsNuevoListadoMovimientos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesListadoMovimientos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadoMovimientos(false);
				
				this.habilitarDeshabilitarControlesListadoMovimientos(false);
				
				
				
				if(ListadoMovimientosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleListadoMovimientos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosListadoMovimientos.getRowCount()>=1) {
				jTableDatosListadoMovimientos.removeRowSelectionInterval(0, jTableDatosListadoMovimientos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesListadoMovimientos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaListadoMovimientos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadoMovimientos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadoMovimientos(false) ;
			
			this.isEsNuevoListadoMovimientos=false;
			
			if(ListadoMovimientosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleListadoMovimientos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingListadoMovimientos(false);
				
				//SI ES MANUAL
				if(ListadoMovimientosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualListadoMovimientos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoListadoMovimientos--;			
			//ListadoMovimientos listadomovimientosAux= new ListadoMovimientos();			
			//listadomovimientosAux.setId(this.iIdNuevoListadoMovimientos);
			
			if(this.jInternalFrameDetalleFormListadoMovimientos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaListadoMovimientos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
			
			this.listadomovimientos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.listadomovimientosLogic.getListadoMovimientoss().add(this.listadomovimientosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.listadomovimientoss.add(this.listadomovimientosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaListadoMovimientos(false);
			
			this.jTableDatosListadoMovimientos.setRowSelectionInterval(this.getIndiceNuevoListadoMovimientos(), this.getIndiceNuevoListadoMovimientos());
			
			int iLastRow =  this.jTableDatosListadoMovimientos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosListadoMovimientos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosListadoMovimientos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaListadoMovimientos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingListadoMovimientos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadoMovimientos(false);
			
			//SI ES MANUAL
			if(ListadoMovimientosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadoMovimientos();
			}
			
			//this.abrirFrameTreeListadoMovimientos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionListadoMovimientos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionListadoMovimientos.setFileImportacion(this.jInternalFrameImportacionListadoMovimientos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionListadoMovimientos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionListadoMovimientos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionListadoMovimientos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionListadoMovimientos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ListadoMovimientos> listadomovimientossSeleccionados=new ArrayList<ListadoMovimientos>();		

		listadomovimientossSeleccionados=this.getListadoMovimientossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ListadoMovimientosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ListadoMovimientosBaseDesign.jrxml";
			
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
			
			this.generarReporteListadoMovimientoss("Todos",listadomovimientossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Movimientos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoListadoMovimientos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadoMovimientos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTransaccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTransaccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTransaccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTransaccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoListadoMovimientos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					sNombreCampoCategoria="nombre_transaccion";
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA:
					sNombreCampoCategoria="fecha_venta";
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoria="numero_comprobante";
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoria="debito_mone_local";
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoria="credito_mone_local";
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					sNombreCampoCategoriaValor="nombre_transaccion";
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA:
					sNombreCampoCategoriaValor="fecha_venta";
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoriaValor="numero_comprobante";
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoriaValor="debito_mone_local";
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoriaValor="credito_mone_local";
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoListadoMovimientos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadoMovimientos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Transaccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_transaccion");
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Venta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_venta");
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_comprobante");
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_mone_local");
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_mone_local");
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ListadoMovimientos> listadomovimientossSeleccionados=new ArrayList<ListadoMovimientos>();		
		
		listadomovimientossSeleccionados=this.getListadoMovimientossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadomovimientos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ListadoMovimientoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoListadoMovimientos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoListadoMovimientos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ListadoMovimientosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ListadoMovimientos listadomovimientos:listadomovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadomovimientos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(ListadoMovimientos listadomovimientos:listadomovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadomovimientos.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(ListadoMovimientos listadomovimientos:listadomovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadomovimientos.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION);
					iRow++;

					for(ListadoMovimientos listadomovimientos:listadomovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadomovimientos.getnombre_transaccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(ListadoMovimientos listadomovimientos:listadomovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadomovimientos.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA);
					iRow++;

					for(ListadoMovimientos listadomovimientos:listadomovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadomovimientos.getfecha_venta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
					iRow++;

					for(ListadoMovimientos listadomovimientos:listadomovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadomovimientos.getnumero_comprobante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(ListadoMovimientos listadomovimientos:listadomovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadomovimientos.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL);
					iRow++;

					for(ListadoMovimientos listadomovimientos:listadomovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadomovimientos.getdebito_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL);
					iRow++;

					for(ListadoMovimientos listadomovimientos:listadomovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadomovimientos.getcredito_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ListadoMovimientos listadomovimientos:listadomovimientossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadomovimientos.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelListadoMovimientos(row);				
			//	iRow++;
			//}				
			
			//for(ListadoMovimientos listadomovimientosAux:listadomovimientossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelListadoMovimientos(listadomovimientosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Movimientos",JOptionPane.INFORMATION_MESSAGE);
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
				this.listadomovimientosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadoMovimientos(false);
			
			//SI ES MANUAL
			if(ListadoMovimientosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadoMovimientos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadoMovimientos(false);
			
			//SI ES MANUAL
			if(ListadoMovimientosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualListadoMovimientos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadoMovimientos(false);
			
			//SI ES MANUAL
			if(ListadoMovimientosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualListadoMovimientos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaListadoMovimientos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosListadoMovimientos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosListadoMovimientos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosListadoMovimientos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosListadoMovimientos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosListadoMovimientos.setMinimumSize(dimensionMinimum);
		this.jTableDatosListadoMovimientos.setMaximumSize(dimensionMaximum);
		this.jTableDatosListadoMovimientos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingListadoMovimientos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingListadoMovimientos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingListadoMovimientos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaListadoMovimientos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesListadoMovimientos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasListadoMovimientos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesListadoMovimientos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesListadoMovimientos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ListadoMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ListadoMovimientosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualListadoMovimientos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaListadoMovimientos();
		
		this.inicializarActualizarBindingBotonesManualListadoMovimientos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualListadoMovimientos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesListadoMovimientos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualListadoMovimientos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualListadoMovimientos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosListadoMovimientos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosListadoMovimientos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteListadoMovimientos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormListadoMovimientos.jCheckBoxPostAccionNuevoListadoMovimientos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormListadoMovimientos.jCheckBoxPostAccionSinCerrarListadoMovimientos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormListadoMovimientos.jCheckBoxPostAccionSinMensajeListadoMovimientos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosListadoMovimientos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosListadoMovimientos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteListadoMovimientos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
				this.jInternalFrameDetalleFormListadoMovimientos.jCheckBoxPostAccionNuevoListadoMovimientos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormListadoMovimientos.jCheckBoxPostAccionSinCerrarListadoMovimientos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormListadoMovimientos.jCheckBoxPostAccionSinMensajeListadoMovimientos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionListadoMovimientos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionListadoMovimientos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxTiposAccionesFormularioListadoMovimientos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesListadoMovimientos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoListadoMovimientos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesListadoMovimientos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesListadoMovimientos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarListadoMovimientos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesListadoMovimientos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoListadoMovimientos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesListadoMovimientos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralListadoMovimientos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesListadoMovimientos(Boolean esInicializar) throws Exception {
		try	{	
			if(ListadoMovimientosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualListadoMovimientos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesListadoMovimientos() throws Exception {
		try	{
			if(ListadoMovimientosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualListadoMovimientos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleListadoMovimientos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxTiposAccionesFormularioListadoMovimientos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxTiposAccionesFormularioListadoMovimientos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualListadoMovimientos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesListadoMovimientos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesListadoMovimientos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesListadoMovimientos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesListadoMovimientos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesListadoMovimientos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesListadoMovimientos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionListadoMovimientos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionListadoMovimientos.addItem(reporte);
			}
			
			
			if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionListadoMovimientos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionListadoMovimientos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesListadoMovimientos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesListadoMovimientos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesListadoMovimientos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesListadoMovimientos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxTiposAccionesFormularioListadoMovimientos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxTiposAccionesFormularioListadoMovimientos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarListadoMovimientos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarListadoMovimientos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarListadoMovimientos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadoMovimientos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadoMovimientos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoListadoMovimientos!=null) {
				this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoListadoMovimientos!=null) {
				this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoListadoMovimientos!=null) {
				
				if(this.jInternalFrameReporteDinamicoListadoMovimientos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoListadoMovimientos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadoMovimientos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoListadoMovimientos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoListadoMovimientos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadoMovimientos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ListadoMovimientosConstantesFunciones.getTiposSeleccionarListadoMovimientos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ListadoMovimientosConstantesFunciones.getTiposSeleccionarListadoMovimientos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoListadoMovimientos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoListadoMovimientos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ListadoMovimientosConstantesFunciones.getTiposSeleccionarListadoMovimientos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadoMovimientos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoListadoMovimientos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualListadoMovimientos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_emision_desdeBusquedaListadoMovimientos=new Date(this.jDateChooserfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos.getDate().getTime());
		this.fecha_emision_hastaBusquedaListadoMovimientos=new Date(this.jDateChooserfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasListadoMovimientos(Boolean esInicializar) throws Exception {				
		if(ListadoMovimientosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualListadoMovimientos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaListadoMovimientos() throws Exception {
		this.inicializarActualizarBindingTablaListadoMovimientos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByListadoMovimientos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByListadoMovimientos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByListadoMovimientos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadoMovimientos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ListadoMovimientosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByListadoMovimientos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadoMovimientos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ListadoMovimientosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosListadoMovimientosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoMovimientosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ListadoMovimientosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByListadoMovimientos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadoMovimientos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ListadoMovimientosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByListadoMovimientos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaListadoMovimientos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=listadomovimientosLogic.getListadoMovimientoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=listadomovimientoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ListadoMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosListadoMovimientos.setModel(new ListadoMovimientosModel(this.listadomovimientosLogic.getListadoMovimientoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosListadoMovimientos.setModel(new ListadoMovimientosModel(this.listadomovimientoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByListadoMovimientos!=null && this.jInternalFrameOrderByListadoMovimientos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByListadoMovimientos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosListadoMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoMovimientos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ListadoMovimientosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO,listadomovimientosConstantesFunciones.resaltarSeleccionarListadoMovimientos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO,listadomovimientosConstantesFunciones.resaltarSeleccionarListadoMovimientos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosListadoMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoMovimientos,ListadoMovimientosConstantesFunciones.LABEL_ID));

		if(this.listadomovimientosConstantesFunciones.mostraridListadoMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoMovimientosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.listadomovimientosConstantesFunciones.resaltaridListadoMovimientos,this.listadomovimientosConstantesFunciones.activaridListadoMovimientos,iSizeTabla,this,true,"idListadoMovimientos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadomovimientosConstantesFunciones.resaltaridListadoMovimientos,this.listadomovimientosConstantesFunciones.activaridListadoMovimientos,this,true,"idListadoMovimientos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoMovimientos,ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION));

		if(this.listadomovimientosConstantesFunciones.mostrarnombre_transaccionListadoMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadomovimientosConstantesFunciones.resaltarnombre_transaccionListadoMovimientos,this.listadomovimientosConstantesFunciones.activarnombre_transaccionListadoMovimientos,iSizeTabla,this,true,"nombre_transaccionListadoMovimientos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadomovimientosConstantesFunciones.resaltarnombre_transaccionListadoMovimientos,this.listadomovimientosConstantesFunciones.activarnombre_transaccionListadoMovimientos,this,true,"nombre_transaccionListadoMovimientos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoMovimientos,ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION));

		if(this.listadomovimientosConstantesFunciones.mostrarfecha_emisionListadoMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.listadomovimientosConstantesFunciones.resaltarfecha_emisionListadoMovimientos,this.listadomovimientosConstantesFunciones.activarfecha_emisionListadoMovimientos,iSizeTabla,this,true,"fecha_emisionListadoMovimientos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.listadomovimientosConstantesFunciones.resaltarfecha_emisionListadoMovimientos,this.listadomovimientosConstantesFunciones.activarfecha_emisionListadoMovimientos,this,true,"fecha_emisionListadoMovimientos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ListadoMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoMovimientos,ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA));

		if(this.listadomovimientosConstantesFunciones.mostrarfecha_ventaListadoMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.listadomovimientosConstantesFunciones.resaltarfecha_ventaListadoMovimientos,this.listadomovimientosConstantesFunciones.activarfecha_ventaListadoMovimientos,iSizeTabla,this,true,"fecha_ventaListadoMovimientos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.listadomovimientosConstantesFunciones.resaltarfecha_ventaListadoMovimientos,this.listadomovimientosConstantesFunciones.activarfecha_ventaListadoMovimientos,this,true,"fecha_ventaListadoMovimientos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ListadoMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoMovimientos,ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE));

		if(this.listadomovimientosConstantesFunciones.mostrarnumero_comprobanteListadoMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadomovimientosConstantesFunciones.resaltarnumero_comprobanteListadoMovimientos,this.listadomovimientosConstantesFunciones.activarnumero_comprobanteListadoMovimientos,iSizeTabla,this,true,"numero_comprobanteListadoMovimientos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadomovimientosConstantesFunciones.resaltarnumero_comprobanteListadoMovimientos,this.listadomovimientosConstantesFunciones.activarnumero_comprobanteListadoMovimientos,this,true,"numero_comprobanteListadoMovimientos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoMovimientos,ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.listadomovimientosConstantesFunciones.mostrarnombre_clienteListadoMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadomovimientosConstantesFunciones.resaltarnombre_clienteListadoMovimientos,this.listadomovimientosConstantesFunciones.activarnombre_clienteListadoMovimientos,iSizeTabla,this,true,"nombre_clienteListadoMovimientos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadomovimientosConstantesFunciones.resaltarnombre_clienteListadoMovimientos,this.listadomovimientosConstantesFunciones.activarnombre_clienteListadoMovimientos,this,true,"nombre_clienteListadoMovimientos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoMovimientos,ListadoMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL));

		if(this.listadomovimientosConstantesFunciones.mostrardebito_mone_localListadoMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.listadomovimientosConstantesFunciones.resaltardebito_mone_localListadoMovimientos,this.listadomovimientosConstantesFunciones.activardebito_mone_localListadoMovimientos,iSizeTabla,this,true,"debito_mone_localListadoMovimientos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadomovimientosConstantesFunciones.resaltardebito_mone_localListadoMovimientos,this.listadomovimientosConstantesFunciones.activardebito_mone_localListadoMovimientos,this,true,"debito_mone_localListadoMovimientos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ListadoMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoMovimientos,ListadoMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL));

		if(this.listadomovimientosConstantesFunciones.mostrarcredito_mone_localListadoMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.listadomovimientosConstantesFunciones.resaltarcredito_mone_localListadoMovimientos,this.listadomovimientosConstantesFunciones.activarcredito_mone_localListadoMovimientos,iSizeTabla,this,true,"credito_mone_localListadoMovimientos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadomovimientosConstantesFunciones.resaltarcredito_mone_localListadoMovimientos,this.listadomovimientosConstantesFunciones.activarcredito_mone_localListadoMovimientos,this,true,"credito_mone_localListadoMovimientos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ListadoMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoMovimientos,ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION));

		if(this.listadomovimientosConstantesFunciones.mostrardescripcionListadoMovimientos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadomovimientosConstantesFunciones.resaltardescripcionListadoMovimientos,this.listadomovimientosConstantesFunciones.activardescripcionListadoMovimientos,iSizeTabla,this,true,"descripcionListadoMovimientos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadomovimientosConstantesFunciones.resaltardescripcionListadoMovimientos,this.listadomovimientosConstantesFunciones.activardescripcionListadoMovimientos,this,true,"descripcionListadoMovimientos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoMovimientosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.listadomovimientosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.listadomovimientosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosListadoMovimientos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.listadomovimientosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.listadomovimientosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosListadoMovimientos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarListadoMovimientos && this.isPermisoGuardarCambiosListadoMovimientos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.listadomovimientosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.listadomovimientosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosListadoMovimientos.addColumn(tableColumn);
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
			
			this.jTableDatosListadoMovimientos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarListadoMovimientos && this.isPermisoGuardarCambiosListadoMovimientos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarListadoMovimientos && this.isPermisoGuardarCambiosListadoMovimientos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosListadoMovimientos.moveColumn(this.jTableDatosListadoMovimientos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosListadoMovimientos.moveColumn(this.jTableDatosListadoMovimientos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosListadoMovimientos.moveColumn(this.jTableDatosListadoMovimientos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosListadoMovimientos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosListadoMovimientos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosListadoMovimientos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ListadoMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosListadoMovimientos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosListadoMovimientos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ListadoMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ListadoMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosListadoMovimientos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosListadoMovimientos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosListadoMovimientos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=listadomovimientosLogic.getListadoMovimientoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=listadomovimientoss.size()-1;
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
		//this.jTableDatosListadoMovimientos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosListadoMovimientos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosListadoMovimientos();
			
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
				
				//this.isEsNuevoListadoMovimientos=false;
					
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
			
				if(this.listadomovimientosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormListadoMovimientos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosListadoMovimientos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosListadoMovimientos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.listadomovimientos.getsType().equals("DUPLICADO")
				   || this.listadomovimientos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoListadoMovimientos=true;
				
				} else {
					this.isEsNuevoListadoMovimientos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
					if(this.listadomovimientos.getId()>=0 && !this.listadomovimientos.getIsNew()) {						
						this.isEsNuevoListadoMovimientos=false;
						
					} else {
						this.isEsNuevoListadoMovimientos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoListadoMovimientos(esRelaciones);						
				
				this.seleccionarListadoMovimientos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.listadomovimientos.getId()<0) {
					this.isEsNuevoListadoMovimientos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarListadoMovimientos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarListadoMovimientos(evt,rowIndex);
				}	
				
				if(this.listadomovimientosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ListadoMovimientos: " + this.dDif); 
					}
				}								
				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarListadoMovimientos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.listadomovimientos)) {
					if(this.listadomovimientos.getId()>0) {
						this.listadomovimientos.setIsDeleted(true);
						
						this.listadomovimientossEliminados.add(this.listadomovimientos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.listadomovimientosLogic.getListadoMovimientoss().remove(this.listadomovimientos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.listadomovimientoss.remove(this.listadomovimientos);				
					}
					
					
					((ListadoMovimientosModel) this.jTableDatosListadoMovimientos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaListadoMovimientos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarListadoMovimientos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoListadoMovimientos) {
			
			if(this.jInternalFrameDetalleFormListadoMovimientos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosListadoMovimientos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosListadoMovimientos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ListadoMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioListadoMovimientos(this.listadomovimientos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesListadoMovimientos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesListadoMovimientos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadoMovimientos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoListadoMovimientos(ListadoMovimientos listadomovimientos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoListadoMovimientos(listadomovimientos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoListadoMovimientos(ListadoMovimientos listadomovimientos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioListadoMovimientos(listadomovimientos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyListadoMovimientos(listadomovimientos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyListadoMovimientos(listadomovimientos);
	}
	
	public void setVariablesObjetoActualToFormularioListadoMovimientos(ListadoMovimientos listadomovimientos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormListadoMovimientos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormListadoMovimientos.jLabelidListadoMovimientos.setText(listadomovimientos.getId().toString());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldnombre_transaccionListadoMovimientos.setText(listadomovimientos.getnombre_transaccion());
			this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_emisionListadoMovimientos.setDate(listadomovimientos.getfecha_emision());
			this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_ventaListadoMovimientos.setDate(listadomovimientos.getfecha_venta());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldnumero_comprobanteListadoMovimientos.setText(listadomovimientos.getnumero_comprobante());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextAreanombre_clienteListadoMovimientos.setText(listadomovimientos.getnombre_cliente());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextFielddebito_mone_localListadoMovimientos.setText(listadomovimientos.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldcredito_mone_localListadoMovimientos.setText(listadomovimientos.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextAreadescripcionListadoMovimientos.setText(listadomovimientos.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ListadoMovimientos listadomovimientosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,listadomovimientosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ListadoMovimientos listadomovimientosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				listadomovimientosLocal=this.listadomovimientos;
			} else {
				listadomovimientosLocal=this.listadomovimientosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(listadomovimientosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoListadoMovimientos(listadomovimientosLocal,true);
					
					if(listadomovimientosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(listadomovimientosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(listadomovimientosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoListadoMovimientos(ListadoMovimientos listadomovimientos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualListadoMovimientos(listadomovimientos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(listadomovimientos);
	}
	
	public void setVariablesFormularioToObjetoActualListadoMovimientos(ListadoMovimientos listadomovimientos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualListadoMovimientos(listadomovimientos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualListadoMovimientos(ListadoMovimientos listadomovimientos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormListadoMovimientos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormListadoMovimientos.jLabelidListadoMovimientos.getText()==null || this.jInternalFrameDetalleFormListadoMovimientos.jLabelidListadoMovimientos.getText()=="" || this.jInternalFrameDetalleFormListadoMovimientos.jLabelidListadoMovimientos.getText()=="Id") {
				this.jInternalFrameDetalleFormListadoMovimientos.jLabelidListadoMovimientos.setText("0");
			}

			if(conColumnasBase) {listadomovimientos.setId(Long.parseLong(this.jInternalFrameDetalleFormListadoMovimientos.jLabelidListadoMovimientos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoMovimientosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoMovimientos.jLabelIdListadoMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadomovimientos.setnombre_transaccion(this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldnombre_transaccionListadoMovimientos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoMovimientos.jLabelnombre_transaccionListadoMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadomovimientos.setfecha_emision(this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_emisionListadoMovimientos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoMovimientos.jLabelfecha_emisionListadoMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadomovimientos.setfecha_venta(this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_ventaListadoMovimientos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoMovimientos.jLabelfecha_ventaListadoMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadomovimientos.setnumero_comprobante(this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldnumero_comprobanteListadoMovimientos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoMovimientos.jLabelnumero_comprobanteListadoMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadomovimientos.setnombre_cliente(this.jInternalFrameDetalleFormListadoMovimientos.jTextAreanombre_clienteListadoMovimientos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoMovimientos.jLabelnombre_clienteListadoMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadomovimientos.setdebito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormListadoMovimientos.jTextFielddebito_mone_localListadoMovimientos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoMovimientos.jLabeldebito_mone_localListadoMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadomovimientos.setcredito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldcredito_mone_localListadoMovimientos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoMovimientos.jLabelcredito_mone_localListadoMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadomovimientos.setdescripcion(this.jInternalFrameDetalleFormListadoMovimientos.jTextAreadescripcionListadoMovimientos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoMovimientos.jLabeldescripcionListadoMovimientos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualListadoMovimientos(ListadoMovimientos listadomovimientosBean,ListadoMovimientos listadomovimientos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosListadoMovimientos(ListadoMovimientos listadomovimientosOrigen,ListadoMovimientos listadomovimientos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && listadomovimientosOrigen.getId()!=null && !listadomovimientosOrigen.getId().equals(0L))) {listadomovimientos.setId(listadomovimientosOrigen.getId());}}
			if(conDefault || (!conDefault && listadomovimientosOrigen.getfecha_emision_desde()!=null && !listadomovimientosOrigen.getfecha_emision_desde().equals(new Date()))) {listadomovimientos.setfecha_emision_desde(listadomovimientosOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && listadomovimientosOrigen.getfecha_emision_hasta()!=null && !listadomovimientosOrigen.getfecha_emision_hasta().equals(new Date()))) {listadomovimientos.setfecha_emision_hasta(listadomovimientosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && listadomovimientosOrigen.getnombre_transaccion()!=null && !listadomovimientosOrigen.getnombre_transaccion().equals(""))) {listadomovimientos.setnombre_transaccion(listadomovimientosOrigen.getnombre_transaccion());}
			if(conDefault || (!conDefault && listadomovimientosOrigen.getfecha_emision()!=null && !listadomovimientosOrigen.getfecha_emision().equals(new Date()))) {listadomovimientos.setfecha_emision(listadomovimientosOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && listadomovimientosOrigen.getfecha_venta()!=null && !listadomovimientosOrigen.getfecha_venta().equals(new Date()))) {listadomovimientos.setfecha_venta(listadomovimientosOrigen.getfecha_venta());}
			if(conDefault || (!conDefault && listadomovimientosOrigen.getnumero_comprobante()!=null && !listadomovimientosOrigen.getnumero_comprobante().equals(""))) {listadomovimientos.setnumero_comprobante(listadomovimientosOrigen.getnumero_comprobante());}
			if(conDefault || (!conDefault && listadomovimientosOrigen.getnombre_cliente()!=null && !listadomovimientosOrigen.getnombre_cliente().equals(""))) {listadomovimientos.setnombre_cliente(listadomovimientosOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && listadomovimientosOrigen.getdebito_mone_local()!=null && !listadomovimientosOrigen.getdebito_mone_local().equals(0.0))) {listadomovimientos.setdebito_mone_local(listadomovimientosOrigen.getdebito_mone_local());}
			if(conDefault || (!conDefault && listadomovimientosOrigen.getcredito_mone_local()!=null && !listadomovimientosOrigen.getcredito_mone_local().equals(0.0))) {listadomovimientos.setcredito_mone_local(listadomovimientosOrigen.getcredito_mone_local());}
			if(conDefault || (!conDefault && listadomovimientosOrigen.getdescripcion()!=null && !listadomovimientosOrigen.getdescripcion().equals(""))) {listadomovimientos.setdescripcion(listadomovimientosOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioListadoMovimientos(ListadoMovimientos listadomovimientos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormListadoMovimientos.jLabelidListadoMovimientos.setText(listadomovimientos.getId().toString());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldnombre_transaccionListadoMovimientos.setText(listadomovimientos.getnombre_transaccion());
			this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_emisionListadoMovimientos.setDate(listadomovimientos.getfecha_emision());
			this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_ventaListadoMovimientos.setDate(listadomovimientos.getfecha_venta());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldnumero_comprobanteListadoMovimientos.setText(listadomovimientos.getnumero_comprobante());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextAreanombre_clienteListadoMovimientos.setText(listadomovimientos.getnombre_cliente());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextFielddebito_mone_localListadoMovimientos.setText(listadomovimientos.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldcredito_mone_localListadoMovimientos.setText(listadomovimientos.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextAreadescripcionListadoMovimientos.setText(listadomovimientos.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioListadoMovimientos(ListadoMovimientosBean listadomovimientosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormListadoMovimientos.jLabelidListadoMovimientos.setText(listadomovimientosBean.getId().toString());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldnombre_transaccionListadoMovimientos.setText(listadomovimientosBean.getnombre_transaccion());
			this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_emisionListadoMovimientos.setDate(listadomovimientosBean.getfecha_emision());
			this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_ventaListadoMovimientos.setDate(listadomovimientosBean.getfecha_venta());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldnumero_comprobanteListadoMovimientos.setText(listadomovimientosBean.getnumero_comprobante());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextAreanombre_clienteListadoMovimientos.setText(listadomovimientosBean.getnombre_cliente());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextFielddebito_mone_localListadoMovimientos.setText(listadomovimientosBean.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldcredito_mone_localListadoMovimientos.setText(listadomovimientosBean.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormListadoMovimientos.jTextAreadescripcionListadoMovimientos.setText(listadomovimientosBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanListadoMovimientos(ListadoMovimientosParameterReturnGeneral listadomovimientosReturnGeneral,ListadoMovimientosBean listadomovimientosBean,Boolean conDefault) throws Exception { 
		try {
			ListadoMovimientos listadomovimientosLocal=new ListadoMovimientos();
			
			listadomovimientosLocal=listadomovimientosReturnGeneral.getListadoMovimientos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && listadomovimientosLocal.getId()!=null && !listadomovimientosLocal.getId().equals(0L))) {listadomovimientosBean.setId(listadomovimientosLocal.getId());}}
			if(conDefault || (!conDefault && listadomovimientosLocal.getnombre_transaccion()!=null && !listadomovimientosLocal.getnombre_transaccion().equals(""))) {listadomovimientosBean.setnombre_transaccion(listadomovimientosLocal.getnombre_transaccion());}
			if(conDefault || (!conDefault && listadomovimientosLocal.getfecha_emision()!=null && !listadomovimientosLocal.getfecha_emision().equals(new Date()))) {listadomovimientosBean.setfecha_emision(listadomovimientosLocal.getfecha_emision());}
			if(conDefault || (!conDefault && listadomovimientosLocal.getfecha_venta()!=null && !listadomovimientosLocal.getfecha_venta().equals(new Date()))) {listadomovimientosBean.setfecha_venta(listadomovimientosLocal.getfecha_venta());}
			if(conDefault || (!conDefault && listadomovimientosLocal.getnumero_comprobante()!=null && !listadomovimientosLocal.getnumero_comprobante().equals(""))) {listadomovimientosBean.setnumero_comprobante(listadomovimientosLocal.getnumero_comprobante());}
			if(conDefault || (!conDefault && listadomovimientosLocal.getnombre_cliente()!=null && !listadomovimientosLocal.getnombre_cliente().equals(""))) {listadomovimientosBean.setnombre_cliente(listadomovimientosLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && listadomovimientosLocal.getdebito_mone_local()!=null && !listadomovimientosLocal.getdebito_mone_local().equals(0.0))) {listadomovimientosBean.setdebito_mone_local(listadomovimientosLocal.getdebito_mone_local());}
			if(conDefault || (!conDefault && listadomovimientosLocal.getcredito_mone_local()!=null && !listadomovimientosLocal.getcredito_mone_local().equals(0.0))) {listadomovimientosBean.setcredito_mone_local(listadomovimientosLocal.getcredito_mone_local());}
			if(conDefault || (!conDefault && listadomovimientosLocal.getdescripcion()!=null && !listadomovimientosLocal.getdescripcion().equals(""))) {listadomovimientosBean.setdescripcion(listadomovimientosLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxListadoMovimientosGenerico(Long idListadoMovimientosSeleccionado,JComboBox jComboBoxListadoMovimientos,List<ListadoMovimientos> listadomovimientossLocal)throws Exception {
		try {
			ListadoMovimientos  listadomovimientosTemp=null;

			for(ListadoMovimientos listadomovimientosAux:listadomovimientossLocal) {
				if(listadomovimientosAux.getId()!=null && listadomovimientosAux.getId().equals(idListadoMovimientosSeleccionado)) {
					listadomovimientosTemp=listadomovimientosAux;
					break;
				}
			}

			jComboBoxListadoMovimientos.setSelectedItem(listadomovimientosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxListadoMovimientosGenerico(JComboBox jComboBoxListadoMovimientos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxListadoMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxListadoMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxListadoMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxListadoMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxListadoMovimientos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxListadoMovimientos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxListadoMovimientos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxListadoMovimientos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxListadoMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxListadoMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadomovimientos=(ListadoMovimientos) listadomovimientosLogic.getListadoMovimientoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			listadomovimientos =(ListadoMovimientos) listadomovimientoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!listadomovimientos.getIsNew() && !listadomovimientos.getIsChanged() && !listadomovimientos.getIsDeleted()) {
				sDescripcion=listadomovimientos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=listadomovimientos.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ListadoMovimientos listadomovimientosRow=new ListadoMovimientos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadomovimientosRow=(ListadoMovimientos) listadomovimientosLogic.getListadoMovimientoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			listadomovimientosRow=(ListadoMovimientos) listadomovimientoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualListadoMovimientos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoListadoMovimientos.setVisible((this.isVisibilidadCeldaNuevoListadoMovimientos && this.isPermisoNuevoListadoMovimientos));			
			this.jButtonDuplicarListadoMovimientos.setVisible((this.isVisibilidadCeldaDuplicarListadoMovimientos && this.isPermisoDuplicarListadoMovimientos));			
			this.jButtonCopiarListadoMovimientos.setVisible((this.isVisibilidadCeldaCopiarListadoMovimientos && this.isPermisoCopiarListadoMovimientos));
			this.jButtonVerFormListadoMovimientos.setVisible((this.isVisibilidadCeldaVerFormListadoMovimientos && this.isPermisoVerFormListadoMovimientos));
			
			this.jButtonAbrirOrderByListadoMovimientos.setVisible((this.isVisibilidadCeldaOrdenListadoMovimientos && this.isPermisoOrdenListadoMovimientos));			
			
			this.jButtonNuevoRelacionesListadoMovimientos.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos && this.isPermisoNuevoListadoMovimientos));			
			this.jButtonNuevoGuardarCambiosListadoMovimientos.setVisible((this.isVisibilidadCeldaNuevoListadoMovimientos && this.isPermisoNuevoListadoMovimientos && this.isPermisoGuardarCambiosListadoMovimientos));
			
			if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonModificarListadoMovimientos.setVisible((this.isVisibilidadCeldaModificarListadoMovimientos && this.isPermisoActualizarListadoMovimientos));	
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonActualizarListadoMovimientos.setVisible((this.isVisibilidadCeldaActualizarListadoMovimientos && this.isPermisoActualizarListadoMovimientos));	
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonEliminarListadoMovimientos.setVisible((this.isVisibilidadCeldaEliminarListadoMovimientos && this.isPermisoEliminarListadoMovimientos));
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonCancelarListadoMovimientos.setVisible(this.isVisibilidadCeldaCancelarListadoMovimientos);							
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonGuardarCambiosListadoMovimientos.setVisible((this.isVisibilidadCeldaGuardarListadoMovimientos && this.isPermisoGuardarCambiosListadoMovimientos));			
			
			}
						
			this.jButtonGuardarCambiosTablaListadoMovimientos.setVisible((this.isVisibilidadCeldaGuardarCambiosListadoMovimientos && this.isPermisoGuardarCambiosListadoMovimientos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarListadoMovimientos.setVisible((this.isVisibilidadCeldaNuevoListadoMovimientos && this.isPermisoNuevoListadoMovimientos));						
			this.jButtonDuplicarToolBarListadoMovimientos.setVisible((this.isVisibilidadCeldaDuplicarListadoMovimientos && this.isPermisoDuplicarListadoMovimientos));						
			this.jButtonCopiarToolBarListadoMovimientos.setVisible((this.isVisibilidadCeldaCopiarListadoMovimientos && this.isPermisoCopiarListadoMovimientos));			
			this.jButtonVerFormToolBarListadoMovimientos.setVisible((this.isVisibilidadCeldaVerFormListadoMovimientos && this.isPermisoVerFormListadoMovimientos));			
			this.jButtonAbrirOrderByToolBarListadoMovimientos.setVisible((this.isVisibilidadCeldaOrdenListadoMovimientos && this.isPermisoOrdenListadoMovimientos));
			this.jButtonNuevoRelacionesToolBarListadoMovimientos.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos && this.isPermisoNuevoListadoMovimientos));			
			this.jButtonNuevoGuardarCambiosToolBarListadoMovimientos.setVisible((this.isVisibilidadCeldaNuevoListadoMovimientos && this.isPermisoNuevoListadoMovimientos && this.isPermisoGuardarCambiosListadoMovimientos));			
			
			if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonModificarToolBarListadoMovimientos.setVisible((this.isVisibilidadCeldaModificarListadoMovimientos && this.isPermisoActualizarListadoMovimientos));	
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonActualizarToolBarListadoMovimientos.setVisible((this.isVisibilidadCeldaActualizarListadoMovimientos  && this.isPermisoActualizarListadoMovimientos));	
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonEliminarToolBarListadoMovimientos.setVisible((this.isVisibilidadCeldaEliminarListadoMovimientos && this.isPermisoEliminarListadoMovimientos));
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonCancelarToolBarListadoMovimientos.setVisible(this.isVisibilidadCeldaCancelarListadoMovimientos);				
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonGuardarCambiosToolBarListadoMovimientos.setVisible((this.isVisibilidadCeldaGuardarListadoMovimientos && this.isPermisoGuardarCambiosListadoMovimientos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarListadoMovimientos.setVisible((this.isVisibilidadCeldaGuardarCambiosListadoMovimientos && this.isPermisoGuardarCambiosListadoMovimientos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoListadoMovimientos.setVisible((this.isVisibilidadCeldaNuevoListadoMovimientos && this.isPermisoNuevoListadoMovimientos));			
			this.jMenuItemDuplicarListadoMovimientos.setVisible((this.isVisibilidadCeldaDuplicarListadoMovimientos && this.isPermisoDuplicarListadoMovimientos));			
			this.jMenuItemCopiarListadoMovimientos.setVisible((this.isVisibilidadCeldaCopiarListadoMovimientos && this.isPermisoCopiarListadoMovimientos));			
			this.jMenuItemVerFormListadoMovimientos.setVisible((this.isVisibilidadCeldaVerFormListadoMovimientos && this.isPermisoVerFormListadoMovimientos));			
			this.jMenuItemAbrirOrderByListadoMovimientos.setVisible((this.isVisibilidadCeldaOrdenListadoMovimientos && this.isPermisoOrdenListadoMovimientos));			
			//this.jMenuItemMostrarOcultarListadoMovimientos.setVisible((this.isVisibilidadCeldaOrdenListadoMovimientos && this.isPermisoOrdenListadoMovimientos));
			this.jMenuItemDetalleAbrirOrderByListadoMovimientos.setVisible((this.isVisibilidadCeldaOrdenListadoMovimientos && this.isPermisoOrdenListadoMovimientos));			
			//this.jMenuItemDetalleMostrarOcultarListadoMovimientos.setVisible((this.isVisibilidadCeldaOrdenListadoMovimientos && this.isPermisoOrdenListadoMovimientos));			
			this.jMenuItemNuevoRelacionesListadoMovimientos.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos && this.isPermisoNuevoListadoMovimientos));			
			this.jMenuItemNuevoGuardarCambiosListadoMovimientos.setVisible((this.isVisibilidadCeldaNuevoListadoMovimientos && this.isPermisoNuevoListadoMovimientos && this.isPermisoGuardarCambiosListadoMovimientos));									
			
			if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
			this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemModificarListadoMovimientos.setVisible((this.isVisibilidadCeldaModificarListadoMovimientos && this.isPermisoActualizarListadoMovimientos));	
			this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemActualizarListadoMovimientos.setVisible((this.isVisibilidadCeldaActualizarListadoMovimientos && this.isPermisoActualizarListadoMovimientos));	
			this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemEliminarListadoMovimientos.setVisible((this.isVisibilidadCeldaEliminarListadoMovimientos && this.isPermisoEliminarListadoMovimientos));
			this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemCancelarListadoMovimientos.setVisible(this.isVisibilidadCeldaCancelarListadoMovimientos);				
			}
			
			this.jMenuItemGuardarCambiosListadoMovimientos.setVisible((this.isVisibilidadCeldaGuardarListadoMovimientos && this.isPermisoGuardarCambiosListadoMovimientos));						
			this.jMenuItemGuardarCambiosTablaListadoMovimientos.setVisible((this.isVisibilidadCeldaGuardarCambiosListadoMovimientos && this.isPermisoGuardarCambiosListadoMovimientos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoListadoMovimientos=this.jButtonNuevoListadoMovimientos.isVisible();
			this.isVisibilidadCeldaDuplicarListadoMovimientos=this.jButtonDuplicarListadoMovimientos.isVisible();
			this.isVisibilidadCeldaCopiarListadoMovimientos=this.jButtonCopiarListadoMovimientos.isVisible();
			this.isVisibilidadCeldaVerFormListadoMovimientos=this.jButtonVerFormListadoMovimientos.isVisible();
			
			this.isVisibilidadCeldaOrdenListadoMovimientos=this.jButtonAbrirOrderByListadoMovimientos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos=this.jButtonNuevoRelacionesListadoMovimientos.isVisible();
			this.isVisibilidadCeldaModificarListadoMovimientos=this.jButtonModificarListadoMovimientos.isVisible();
			
			if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
			this.isVisibilidadCeldaActualizarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jButtonActualizarListadoMovimientos.isVisible();
			this.isVisibilidadCeldaEliminarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jButtonEliminarListadoMovimientos.isVisible();
			this.isVisibilidadCeldaCancelarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jButtonCancelarListadoMovimientos.isVisible();
			this.isVisibilidadCeldaGuardarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jButtonGuardarCambiosListadoMovimientos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosListadoMovimientos=this.jButtonGuardarCambiosTablaListadoMovimientos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoListadoMovimientos=this.jButtonNuevoToolBarListadoMovimientos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos=this.jButtonNuevoRelacionesToolBarListadoMovimientos.isVisible();
			
			if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
			this.isVisibilidadCeldaModificarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jButtonModificarToolBarListadoMovimientos.isVisible();
			this.isVisibilidadCeldaActualizarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jButtonActualizarToolBarListadoMovimientos.isVisible();
			this.isVisibilidadCeldaEliminarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jButtonEliminarToolBarListadoMovimientos.isVisible();
			this.isVisibilidadCeldaCancelarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jButtonCancelarToolBarListadoMovimientos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarListadoMovimientos=this.jButtonGuardarCambiosToolBarListadoMovimientos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosListadoMovimientos=this.jButtonGuardarCambiosTablaToolBarListadoMovimientos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoListadoMovimientos=this.jMenuItemNuevoListadoMovimientos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos=this.jMenuItemNuevoRelacionesListadoMovimientos.isVisible();
			
			if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
			this.isVisibilidadCeldaModificarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemModificarListadoMovimientos.isVisible();
			this.isVisibilidadCeldaActualizarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemActualizarListadoMovimientos.isVisible();
			this.isVisibilidadCeldaEliminarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemEliminarListadoMovimientos.isVisible();
			this.isVisibilidadCeldaCancelarListadoMovimientos=this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemCancelarListadoMovimientos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarListadoMovimientos=this.jMenuItemGuardarCambiosListadoMovimientos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosListadoMovimientos=this.jMenuItemGuardarCambiosTablaListadoMovimientos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesListadoMovimientos(Boolean esInicializar) {
		if(ListadoMovimientosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.listadomovimientosSessionBean.getConGuardarRelaciones()) {
				//if(this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesListadoMovimientos();
			}
			
			this.inicializarActualizarBindingBotonesManualListadoMovimientos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualListadoMovimientos() {
		this.jButtonNuevoListadoMovimientos.setVisible(this.isPermisoNuevoListadoMovimientos);			
		this.jButtonDuplicarListadoMovimientos.setVisible(this.isPermisoDuplicarListadoMovimientos);			
		this.jButtonCopiarListadoMovimientos.setVisible(this.isPermisoCopiarListadoMovimientos);			
		this.jButtonVerFormListadoMovimientos.setVisible(this.isPermisoVerFormListadoMovimientos);			
		
		this.jButtonAbrirOrderByListadoMovimientos.setVisible(this.isPermisoOrdenListadoMovimientos);					
		
		this.jButtonNuevoRelacionesListadoMovimientos.setVisible(this.isPermisoNuevoListadoMovimientos);			
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonModificarListadoMovimientos.setVisible(this.isPermisoActualizarListadoMovimientos);	
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonActualizarListadoMovimientos.setVisible(this.isPermisoActualizarListadoMovimientos);	
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonEliminarListadoMovimientos.setVisible(this.isPermisoEliminarListadoMovimientos);
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonCancelarListadoMovimientos.setVisible(this.isVisibilidadCeldaCancelarListadoMovimientos);						
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonGuardarCambiosListadoMovimientos.setVisible(this.isPermisoGuardarCambiosListadoMovimientos);							
		}
		
		this.jButtonGuardarCambiosTablaListadoMovimientos.setVisible(this.isPermisoActualizarListadoMovimientos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleListadoMovimientos() {
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonModificarListadoMovimientos.setVisible(this.isPermisoActualizarListadoMovimientos);	
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonActualizarListadoMovimientos.setVisible(this.isPermisoActualizarListadoMovimientos);	
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonEliminarListadoMovimientos.setVisible(this.isPermisoEliminarListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonCancelarListadoMovimientos.setVisible(this.isVisibilidadCeldaCancelarListadoMovimientos);							
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonGuardarCambiosListadoMovimientos.setVisible((this.isVisibilidadCeldaGuardarListadoMovimientos && this.isPermisoGuardarCambiosListadoMovimientos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosListadoMovimientos() {
		if(ListadoMovimientosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualListadoMovimientos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesListadoMovimientos() {
	}
	
	public void jTableDatosListadoMovimientosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarListadoMovimientos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidListadoMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.getlistadomovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadomovimientos==null) {
						this.listadomovimientos = new ListadoMovimientos();
					}

					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.listadomovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
				}

				if(this.listadomovimientos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.listadomovimientos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaListadoMovimientosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebListadoMovimientos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosListadoMovimientos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosListadoMovimientos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualListadoMovimientos(this.getlistadomovimientos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.listadomovimientosLogic.getConnexion());

				if(this.listadomovimientos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.listadomovimientos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderListadoMovimientos=(TitledBorder)this.jScrollPanelDatosListadoMovimientos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderListadoMovimientos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaListadoMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.getlistadomovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadomovimientos==null) {
						this.listadomovimientos = new ListadoMovimientos();
					}

					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.listadomovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
				}

				if(this.listadomovimientos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.listadomovimientos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeListadoMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.getlistadomovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadomovimientos==null) {
						this.listadomovimientos = new ListadoMovimientos();
					}

					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.listadomovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
				}

				if(this.listadomovimientos.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.listadomovimientos.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaListadoMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.getlistadomovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadomovimientos==null) {
						this.listadomovimientos = new ListadoMovimientos();
					}

					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.listadomovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
				}

				if(this.listadomovimientos.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.listadomovimientos.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_transaccionListadoMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.getlistadomovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadomovimientos==null) {
						this.listadomovimientos = new ListadoMovimientos();
					}

					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.listadomovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
				}

				if(this.listadomovimientos.getnombre_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_transaccion like '%"+this.listadomovimientos.getnombre_transaccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionListadoMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.getlistadomovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadomovimientos==null) {
						this.listadomovimientos = new ListadoMovimientos();
					}

					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.listadomovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
				}

				if(this.listadomovimientos.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.listadomovimientos.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ventaListadoMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.getlistadomovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadomovimientos==null) {
						this.listadomovimientos = new ListadoMovimientos();
					}

					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.listadomovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
				}

				if(this.listadomovimientos.getfecha_venta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_venta = '"+Funciones2.getStringPostgresDate(this.listadomovimientos.getfecha_venta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_comprobanteListadoMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.getlistadomovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadomovimientos==null) {
						this.listadomovimientos = new ListadoMovimientos();
					}

					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.listadomovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
				}

				if(this.listadomovimientos.getnumero_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_comprobante like '%"+this.listadomovimientos.getnumero_comprobante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clienteListadoMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.getlistadomovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadomovimientos==null) {
						this.listadomovimientos = new ListadoMovimientos();
					}

					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.listadomovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
				}

				if(this.listadomovimientos.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.listadomovimientos.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_mone_localListadoMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.getlistadomovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadomovimientos==null) {
						this.listadomovimientos = new ListadoMovimientos();
					}

					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.listadomovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
				}

				if(this.listadomovimientos.getdebito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_mone_local = "+this.listadomovimientos.getdebito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_mone_localListadoMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.getlistadomovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadomovimientos==null) {
						this.listadomovimientos = new ListadoMovimientos();
					}

					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.listadomovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
				}

				if(this.listadomovimientos.getcredito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_mone_local = "+this.listadomovimientos.getcredito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionListadoMovimientosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.getlistadomovimientos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadomovimientos==null) {
						this.listadomovimientos = new ListadoMovimientos();
					}

					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.listadomovimientos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);
				}

				if(this.listadomovimientos.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.listadomovimientos.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoMovimientos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaListadoMovimientosListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadoMovimientos(false,false);

			this.getListadoMovimientossBusquedaListadoMovimientos();

			this.inicializarActualizarBindingListadoMovimientos(false);

			//if(ListadoMovimientosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadoMovimientos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaListadoMovimientosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadoMovimientos(false,false);

			this.getListadoMovimientossFK_IdEmpresa();

			this.inicializarActualizarBindingListadoMovimientos(false);

			//if(ListadoMovimientosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadoMovimientos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadomovimientosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameListadoMovimientos() {
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
			this.jInternalFrameDetalleFormListadoMovimientos.setVisible(false);	    			
			this.jInternalFrameDetalleFormListadoMovimientos.dispose();
			this.jInternalFrameDetalleFormListadoMovimientos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoListadoMovimientos!=null) {
			this.jInternalFrameReporteDinamicoListadoMovimientos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoListadoMovimientos.dispose();
			this.jInternalFrameReporteDinamicoListadoMovimientos=null;
		}
		
		if(this.jInternalFrameImportacionListadoMovimientos!=null) {
			this.jInternalFrameImportacionListadoMovimientos.setVisible(false);	    			
			this.jInternalFrameImportacionListadoMovimientos.dispose();
			this.jInternalFrameImportacionListadoMovimientos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessListadoMovimientos();
			
			ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
			
			
			if(sTipo.equals("NuevoListadoMovimientos")) {
				jButtonNuevoListadoMovimientosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarListadoMovimientos")) {
				jButtonDuplicarListadoMovimientosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarListadoMovimientos")) {
				jButtonCopiarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("VerFormListadoMovimientos")) {
				jButtonVerFormListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarListadoMovimientos")) {
				jButtonNuevoListadoMovimientosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarListadoMovimientos")) {
				jButtonDuplicarListadoMovimientosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoListadoMovimientos")) {
				jButtonNuevoListadoMovimientosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarListadoMovimientos")) {
				jButtonDuplicarListadoMovimientosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesListadoMovimientos")) {
				jButtonNuevoListadoMovimientosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarListadoMovimientos")) {
				jButtonNuevoListadoMovimientosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesListadoMovimientos")) {
				jButtonNuevoListadoMovimientosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarListadoMovimientos")) {
				jButtonModificarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarListadoMovimientos")) {
				jButtonModificarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarListadoMovimientos")) {
				jButtonModificarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarListadoMovimientos")) {
				jButtonActualizarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarListadoMovimientos")) {
				jButtonActualizarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarListadoMovimientos")) {
				jButtonActualizarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("EliminarListadoMovimientos")) {
				jButtonEliminarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarListadoMovimientos")) {
				jButtonEliminarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarListadoMovimientos")) {
				jButtonEliminarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("CancelarListadoMovimientos")) {
				jButtonCancelarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarListadoMovimientos")) {
				jButtonCancelarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarListadoMovimientos")) {
				jButtonCancelarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("CerrarListadoMovimientos")) {
				jButtonCerrarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarListadoMovimientos")) {
				jButtonCerrarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarListadoMovimientos")) {
				jButtonCerrarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarListadoMovimientos")) {
				jButtonMostrarOcultarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarListadoMovimientos")) {
				jButtonCancelarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosListadoMovimientos")) {
				jButtonGuardarCambiosListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarListadoMovimientos")) {
				jButtonGuardarCambiosListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarListadoMovimientos")) {
				jButtonCopiarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarListadoMovimientos")) {
				jButtonVerFormListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosListadoMovimientos")) {
				jButtonGuardarCambiosListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarListadoMovimientos")) {
				jButtonCopiarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormListadoMovimientos")) {
				jButtonVerFormListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaListadoMovimientos")) {
				jButtonGuardarCambiosListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarListadoMovimientos")) {
				jButtonGuardarCambiosListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaListadoMovimientos")) {
				jButtonGuardarCambiosListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionListadoMovimientos")) {
				jButtonRecargarInformacionListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarListadoMovimientos")) {
				jButtonRecargarInformacionListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionListadoMovimientos")) {
				jButtonRecargarInformacionListadoMovimientosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresListadoMovimientos")) {
				jButtonAnterioresListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarListadoMovimientos")) {
				jButtonAnterioresListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreListadoMovimientos")) {
				jButtonAnterioresListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesListadoMovimientos")) {
				jButtonSiguientesListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarListadoMovimientos")) {
				jButtonSiguientesListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesListadoMovimientos")) {
				jButtonSiguientesListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByListadoMovimientos") || sTipo.equals("MenuItemDetalleAbrirOrderByListadoMovimientos")) {
				jButtonAbrirOrderByListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarListadoMovimientos") || sTipo.equals("MenuItemDetalleMostrarOcultarListadoMovimientos")) {
				jButtonMostrarOcultarListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosListadoMovimientos")) {
				jButtonNuevoGuardarCambiosListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarListadoMovimientos")) {
				jButtonNuevoGuardarCambiosListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosListadoMovimientos")) {
				jButtonNuevoGuardarCambiosListadoMovimientosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoListadoMovimientos")) {
				jButtonCerrarReporteDinamicoListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoListadoMovimientos")) {
				jButtonGenerarReporteDinamicoListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoListadoMovimientos")) {
				
				jButtonGenerarExcelReporteDinamicoListadoMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionListadoMovimientos")) {
				jButtonCerrarImportacionListadoMovimientosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionListadoMovimientos")) {
				
				jButtonGenerarImportacionListadoMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionListadoMovimientos")) {
				
				jButtonAbrirImportacionListadoMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesListadoMovimientos")) {
				jComboBoxTiposAccionesListadoMovimientosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesListadoMovimientos")) {
				jComboBoxTiposRelacionesListadoMovimientosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioListadoMovimientos")) {
				jComboBoxTiposAccionesListadoMovimientosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarListadoMovimientos")) {
				
				jComboBoxTiposSeleccionarListadoMovimientosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralListadoMovimientos")) {
				jTextFieldValorCampoGeneralListadoMovimientosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByListadoMovimientos")) {
				jButtonAbrirOrderByListadoMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarListadoMovimientos")) {
				jButtonAbrirOrderByListadoMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByListadoMovimientos")) {
				jButtonCerrarOrderByListadoMovimientosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idListadoMovimientosBusqueda")) {
				this.jButtonidListadoMovimientosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaListadoMovimientosUpdate")) {
				this.jButtonid_empresaListadoMovimientosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaListadoMovimientosBusqueda")) {
				this.jButtonid_empresaListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeListadoMovimientosBusqueda")) {
				this.jButtonfecha_emision_desdeListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaListadoMovimientosBusqueda")) {
				this.jButtonfecha_emision_hastaListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_transaccionListadoMovimientosBusqueda")) {
				this.jButtonnombre_transaccionListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionListadoMovimientosBusqueda")) {
				this.jButtonfecha_emisionListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ventaListadoMovimientosBusqueda")) {
				this.jButtonfecha_ventaListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteListadoMovimientosBusqueda")) {
				this.jButtonnumero_comprobanteListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteListadoMovimientosBusqueda")) {
				this.jButtonnombre_clienteListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localListadoMovimientosBusqueda")) {
				this.jButtondebito_mone_localListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localListadoMovimientosBusqueda")) {
				this.jButtoncredito_mone_localListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionListadoMovimientosBusqueda")) {
				this.jButtondescripcionListadoMovimientosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaListadoMovimientosListadoMovimientos")) {
				this.jButtonBusquedaListadoMovimientosListadoMovimientosActionPerformed(evt);
			}
			
			;
			
			
			ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessListadoMovimientos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoMovimientosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadomovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadomovimientos);
				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
				
				


				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoMovimientos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoMovimientos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ListadoMovimientos listadomovimientosLocal=null;
			
			if(!this.getEsControlTabla()) {
				listadomovimientosLocal=this.listadomovimientos;
			} else {
				listadomovimientosLocal=this.listadomovimientosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadomovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadomovimientos);
				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
							
				
				


				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoMovimientos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoMovimientos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoMovimientosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosAnterior =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadomovimientosAnterior =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
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
			
			ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
			
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
			
			


			
			ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoMovimientosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadomovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadomovimientos);
				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
								
						
				


				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoMovimientos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoMovimientos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadomovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadomovimientos);
				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
								
				
				


				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoMovimientos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoMovimientos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoMovimientosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosAnterior =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadomovimientosAnterior =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadomovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadomovimientos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoMovimientosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosAnterior =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadomovimientosAnterior =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoMovimientosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadomovimientos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadomovimientos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadomovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadomovimientos);
				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
							
				
				


				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoMovimientos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoMovimientos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoMovimientosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadomovimientosAnterior =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.listadomovimientosAnterior =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
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
			
			ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
			
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
			
			


			
			ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoMovimientosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadomovimientos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadomovimientos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadomovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadomovimientos);
				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
								
				
				


				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoMovimientos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoMovimientos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoMovimientosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosAnterior =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadomovimientosAnterior =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoMovimientosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadomovimientos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadomovimientos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoMovimientosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadomovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadomovimientos);
				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosListadoMovimientos")) {
					jCheckBoxSeleccionarTodosListadoMovimientosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosListadoMovimientos")) {
					jCheckBoxSeleccionadosListadoMovimientosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarListadoMovimientos")) {
					
				}
				
				


				
				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoMovimientos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoMovimientos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.listadomovimientos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.listadomovimientos);
				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
												
				
				


				
				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoMovimientos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoMovimientos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoMovimientosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadomovimientosAnterior =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.listadomovimientosAnterior =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoMovimientosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadomovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadomovimientos);
				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
				
				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
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
			
			ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
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
			
			


			
			ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoMovimientosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadomovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadomovimientos);
				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoMovimientos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoMovimientos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadomovimientos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadomovimientos);
				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
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
				
				


				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoMovimientos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoMovimientos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoMovimientosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadomovimientosAnterior =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadomovimientosAnterior =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarListadoMovimientos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosListadoMovimientosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosListadoMovimientos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.listadomovimientos =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.listadomovimientos =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.listadomovimientos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarListadoMovimientos")) {
				
				}
				
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarListadoMovimientos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosListadoMovimientos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarListadoMovimientos")) {
			
			}
			
			ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessListadoMovimientos();
			
			ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
			
			if(sTipo.equals("NuevoListadoMovimientos")) {
				jButtonNuevoListadoMovimientosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarListadoMovimientos")) {
				jButtonDuplicarListadoMovimientosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarListadoMovimientos")) {
				jButtonCopiarListadoMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormListadoMovimientos")) {
				jButtonVerFormListadoMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesListadoMovimientos")) {
				jButtonNuevoListadoMovimientosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarListadoMovimientos")) {
				jButtonModificarListadoMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarListadoMovimientos")) {
				jButtonActualizarListadoMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarListadoMovimientos")) {
				jButtonEliminarListadoMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaListadoMovimientos")) {
				jButtonGuardarCambiosListadoMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarListadoMovimientos")) {
				jButtonCancelarListadoMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarListadoMovimientos")) {
				jButtonCerrarListadoMovimientosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosListadoMovimientos")) {
				jButtonGuardarCambiosListadoMovimientosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosListadoMovimientos")) {
				jButtonNuevoGuardarCambiosListadoMovimientosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByListadoMovimientos")) {
				jButtonAbrirOrderByListadoMovimientosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionListadoMovimientos")) {
				jButtonRecargarInformacionListadoMovimientosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresListadoMovimientos")) {
				jButtonAnterioresListadoMovimientosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesListadoMovimientos")) {
				jButtonSiguientesListadoMovimientosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idListadoMovimientosBusqueda")) {
				this.jButtonidListadoMovimientosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaListadoMovimientosUpdate")) {
				this.jButtonid_empresaListadoMovimientosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaListadoMovimientosBusqueda")) {
				this.jButtonid_empresaListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeListadoMovimientosBusqueda")) {
				this.jButtonfecha_emision_desdeListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaListadoMovimientosBusqueda")) {
				this.jButtonfecha_emision_hastaListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_transaccionListadoMovimientosBusqueda")) {
				this.jButtonnombre_transaccionListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionListadoMovimientosBusqueda")) {
				this.jButtonfecha_emisionListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ventaListadoMovimientosBusqueda")) {
				this.jButtonfecha_ventaListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteListadoMovimientosBusqueda")) {
				this.jButtonnumero_comprobanteListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteListadoMovimientosBusqueda")) {
				this.jButtonnombre_clienteListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localListadoMovimientosBusqueda")) {
				this.jButtondebito_mone_localListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localListadoMovimientosBusqueda")) {
				this.jButtoncredito_mone_localListadoMovimientosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionListadoMovimientosBusqueda")) {
				this.jButtondescripcionListadoMovimientosBusquedaActionPerformed(evt);
			}
			
			ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessListadoMovimientos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameListadoMovimientos")) {
				closingInternalFrameListadoMovimientos();
				
			} else if(sTipo.equals("jButtonCancelarListadoMovimientos")) {
				JInternalFrameBase jInternalFrameDetalleFormListadoMovimientos = (JInternalFrameBase)evt.getSource();
	            	
	            ListadoMovimientosBeanSwingJInternalFrame jInternalFrameParent=(ListadoMovimientosBeanSwingJInternalFrame)jInternalFrameDetalleFormListadoMovimientos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarListadoMovimientosActionPerformed(null);
			}
			
			ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.listadomovimientos,new Object(),this.listadomovimientosParameterGeneral,this.listadomovimientosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormListadoMovimientos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormListadoMovimientos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormListadoMovimientos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.listadomovimientos)) {
			if(!esControlTabla) {
				if(ListadoMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.listadomovimientos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);			
				}
				
				if(this.listadomovimientosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualListadoMovimientos(this.listadomovimientos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanListadoMovimientos(this.listadomovimientosReturnGeneral,this.listadomovimientosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.listadomovimientosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanListadoMovimientos(classes,this.listadomovimientosReturnGeneral,this.listadomovimientosBean,false);
					}
						
					if(this.listadomovimientosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyListadoMovimientos(this.listadomovimientosReturnGeneral.getListadoMovimientos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioListadoMovimientos(this.listadomovimientosReturnGeneral.getListadoMovimientos());	
					}
						
					if(this.listadomovimientosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioListadoMovimientos(this.listadomovimientosReturnGeneral.getListadoMovimientos(),classes);//this.listadomovimientosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioListadoMovimientos(this.listadomovimientos,classes);//this.listadomovimientosBean);									
				}
			
				if(ListadoMovimientosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualListadoMovimientos(this.listadomovimientos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoMovimientos(this.listadomovimientos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.listadomovimientosAnterior!=null) {
						this.listadomovimientos=this.listadomovimientosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.listadomovimientosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.listadomovimientosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.listadomovimientosReturnGeneral.getListadoMovimientos(),listadomovimientosLogic.getListadoMovimientoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.listadomovimientosReturnGeneral.getListadoMovimientos(),this.listadomovimientoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosListadoMovimientos.repaint();
				
				//((AbstractTableModel) this.jTableDatosListadoMovimientos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosListadoMovimientos();
			}
		}
	}
	
	public void actualizarVisualTableDatosListadoMovimientos() throws Exception {
		
		ListadoMovimientosModel listadomovimientosModel=(ListadoMovimientosModel)this.jTableDatosListadoMovimientos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadomovimientosModel.listadomovimientoss=this.listadomovimientosLogic.getListadoMovimientoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			listadomovimientosModel.listadomovimientoss=this.listadomovimientoss;
		}
		
		
		((ListadoMovimientosModel) this.jTableDatosListadoMovimientos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaListadoMovimientos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getlistadomovimientosAnterior(),this.listadomovimientosLogic.getListadoMovimientoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getlistadomovimientosAnterior(),this.listadomovimientoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosListadoMovimientos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioListadoMovimientos(ListadoMovimientos listadomovimientos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
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
										
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.listadomovimientos,new Object(),generalEntityParameterGeneral,this.listadomovimientosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.listadomovimientosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ListadoMovimientosConstantesFunciones.getClassesRelationshipsOfListadoMovimientos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ListadoMovimientosConstantesFunciones.getClassesRelationshipsFromStringsOfListadoMovimientos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormListadoMovimientos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ListadoMovimientosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.listadomovimientos,new Object(),generalEntityParameterGeneral,this.listadomovimientosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioListadoMovimientos(ListadoMovimientosBean listadomovimientosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanListadoMovimientos(ArrayList<Classe> classes,ListadoMovimientosReturnGeneral listadomovimientosReturnGeneral,ListadoMovimientosBean listadomovimientosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualListadoMovimientos(ListadoMovimientos listadomovimientos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.listadomovimientos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormListadoMovimientos = new ListadoMovimientosDetalleFormJInternalFrame(jDesktopPane,this.listadomovimientosSessionBean.getConGuardarRelaciones(),this.listadomovimientosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.setVisible(false);
		this.jInternalFrameDetalleFormListadoMovimientos.setSelected(false);						
		
		this.jInternalFrameDetalleFormListadoMovimientos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormListadoMovimientos.listadomovimientosLogic=this.listadomovimientosLogic;
		
		this.cargarCombosFrameForeignKeyListadoMovimientos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleListadoMovimientos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleListadoMovimientos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyListadoMovimientos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyListadoMovimientos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormListadoMovimientos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarListadoMovimientos"));
		
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonModificarListadoMovimientos.addActionListener(new ButtonActionListener(this,"ModificarListadoMovimientos"));

		
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonModificarToolBarListadoMovimientos.addActionListener(new ButtonActionListener(this,"ModificarToolBarListadoMovimientos"));
					
		this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemModificarListadoMovimientos.addActionListener(new ButtonActionListener(this,"MenuItemModificarListadoMovimientos"));		
		
		
		
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonActualizarListadoMovimientos.addActionListener (new ButtonActionListener(this,"ActualizarListadoMovimientos"));
		
		
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonActualizarToolBarListadoMovimientos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarListadoMovimientos"));
						
		this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemActualizarListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarListadoMovimientos"));		
		
		
		
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonEliminarListadoMovimientos.addActionListener (new ButtonActionListener(this,"EliminarListadoMovimientos"));
		
		
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonEliminarToolBarListadoMovimientos.addActionListener (new ButtonActionListener(this,"EliminarToolBarListadoMovimientos"));
								
		this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemEliminarListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarListadoMovimientos"));		
		
		
		
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonCancelarListadoMovimientos.addActionListener (new ButtonActionListener(this,"CancelarListadoMovimientos"));
		
		
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonCancelarToolBarListadoMovimientos.addActionListener (new ButtonActionListener(this,"CancelarToolBarListadoMovimientos"));
					
		this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemCancelarListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarListadoMovimientos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemDetalleCerrarListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarListadoMovimientos"));		
		
		
		
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonGuardarCambiosToolBarListadoMovimientos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadoMovimientos"));
		
		
		
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonGuardarCambiosToolBarListadoMovimientos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadoMovimientos"));
		
		
		
		this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxTiposAccionesFormularioListadoMovimientos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioListadoMovimientos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonidListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"idListadoMovimientosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonid_empresaListadoMovimientosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadoMovimientosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonid_empresaListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonfecha_emision_desdeListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonfecha_emision_hastaListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonnombre_transaccionListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonfecha_emisionListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonfecha_ventaListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ventaListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonnumero_comprobanteListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonnombre_clienteListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtondebito_mone_localListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtoncredito_mone_localListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtondescripcionListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionListadoMovimientosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormListadoMovimientos.jTabbedPaneRelacionesListadoMovimientos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesListadoMovimientos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameListadoMovimientos"));
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoMovimientos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarListadoMovimientos"));
		}
		
		this.jTableDatosListadoMovimientos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarListadoMovimientos"));
		
		this.jTableDatosListadoMovimientos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarListadoMovimientos"));
		
		this.jButtonNuevoListadoMovimientos.addActionListener(new ButtonActionListener(this,"NuevoListadoMovimientos"));
		
		this.jButtonDuplicarListadoMovimientos.addActionListener(new ButtonActionListener(this,"DuplicarListadoMovimientos"));
		
		this.jButtonCopiarListadoMovimientos.addActionListener(new ButtonActionListener(this,"CopiarListadoMovimientos"));
		
		this.jButtonVerFormListadoMovimientos.addActionListener(new ButtonActionListener(this,"VerFormListadoMovimientos"));
		
		
		this.jButtonNuevoToolBarListadoMovimientos.addActionListener(new ButtonActionListener(this,"NuevoToolBarListadoMovimientos"));
			
		this.jButtonDuplicarToolBarListadoMovimientos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarListadoMovimientos"));
			
		this.jMenuItemNuevoListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoListadoMovimientos"));
			
		this.jMenuItemDuplicarListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarListadoMovimientos"));		
		
		
		this.jButtonNuevoRelacionesListadoMovimientos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesListadoMovimientos"));
		
		
		this.jButtonNuevoRelacionesToolBarListadoMovimientos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarListadoMovimientos"));
			
		this.jMenuItemNuevoRelacionesListadoMovimientos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesListadoMovimientos"));		
		
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonModificarListadoMovimientos.addActionListener(new ButtonActionListener(this,"ModificarListadoMovimientos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonModificarToolBarListadoMovimientos.addActionListener(new ButtonActionListener(this,"ModificarToolBarListadoMovimientos"));
			
			this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemModificarListadoMovimientos.addActionListener(new ButtonActionListener(this,"MenuItemModificarListadoMovimientos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonActualizarListadoMovimientos.addActionListener (new ButtonActionListener(this,"ActualizarListadoMovimientos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonActualizarToolBarListadoMovimientos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarListadoMovimientos"));
				
			this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemActualizarListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarListadoMovimientos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonEliminarListadoMovimientos.addActionListener (new ButtonActionListener(this,"EliminarListadoMovimientos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonEliminarToolBarListadoMovimientos.addActionListener (new ButtonActionListener(this,"EliminarToolBarListadoMovimientos"));
						
			this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemEliminarListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarListadoMovimientos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonCancelarListadoMovimientos.addActionListener (new ButtonActionListener(this,"CancelarListadoMovimientos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonCancelarToolBarListadoMovimientos.addActionListener (new ButtonActionListener(this,"CancelarToolBarListadoMovimientos"));
			
			this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemCancelarListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarListadoMovimientos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarListadoMovimientos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarListadoMovimientos"));		
		
		
		this.jButtonCerrarListadoMovimientos.addActionListener (new ButtonActionListener(this,"CerrarListadoMovimientos"));
		
		
		this.jButtonCerrarToolBarListadoMovimientos.addActionListener (new ButtonActionListener(this,"CerrarToolBarListadoMovimientos"));
			
		this.jMenuItemCerrarListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarListadoMovimientos"));
			
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoMovimientos.jMenuItemDetalleCerrarListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarListadoMovimientos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonGuardarCambiosListadoMovimientos.addActionListener (new ButtonActionListener(this,"GuardarCambiosListadoMovimientos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoMovimientos.jButtonGuardarCambiosToolBarListadoMovimientos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadoMovimientos"));
		}
		
		this.jButtonCopiarToolBarListadoMovimientos.addActionListener (new ButtonActionListener(this,"CopiarToolBarListadoMovimientos"));
			
		this.jButtonVerFormToolBarListadoMovimientos.addActionListener (new ButtonActionListener(this,"VerFormToolBarListadoMovimientos"));
		
		this.jMenuItemGuardarCambiosListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosListadoMovimientos"));
			
		this.jMenuItemCopiarListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarListadoMovimientos"));		
		
		this.jMenuItemVerFormListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormListadoMovimientos"));		
		
		
		this.jButtonGuardarCambiosTablaListadoMovimientos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaListadoMovimientos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarListadoMovimientos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarListadoMovimientos"));
			
		this.jMenuItemGuardarCambiosTablaListadoMovimientos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaListadoMovimientos"));		
		
		
		
		this.jButtonRecargarInformacionListadoMovimientos.addActionListener (new ButtonActionListener(this,"RecargarInformacionListadoMovimientos"));
					
		this.jButtonRecargarInformacionToolBarListadoMovimientos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarListadoMovimientos"));
		
		this.jMenuItemRecargarInformacionListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionListadoMovimientos"));		
		
		
		
		this.jButtonAnterioresListadoMovimientos.addActionListener (new ButtonActionListener(this,"AnterioresListadoMovimientos"));
		
		
		this.jButtonAnterioresToolBarListadoMovimientos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarListadoMovimientos"));
		
		this.jMenuItemAnterioresListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresListadoMovimientos"));		
		
		
		this.jButtonSiguientesListadoMovimientos.addActionListener (new ButtonActionListener(this,"SiguientesListadoMovimientos"));
		
		
		this.jButtonSiguientesToolBarListadoMovimientos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarListadoMovimientos"));
			
		this.jMenuItemSiguientesListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesListadoMovimientos"));
			
		this.jMenuItemAbrirOrderByListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByListadoMovimientos"));
			
		this.jMenuItemMostrarOcultarListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarListadoMovimientos"));
			
		this.jMenuItemDetalleAbrirOrderByListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByListadoMovimientos"));
			
		this.jMenuItemDetalleMostarOcultarListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarListadoMovimientos"));		
		
		
		this.jButtonNuevoGuardarCambiosListadoMovimientos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosListadoMovimientos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarListadoMovimientos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarListadoMovimientos"));
			
		this.jMenuItemNuevoGuardarCambiosListadoMovimientos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosListadoMovimientos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosListadoMovimientos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosListadoMovimientos"));

		this.jCheckBoxSeleccionadosListadoMovimientos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosListadoMovimientos"));
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxTiposAccionesFormularioListadoMovimientos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioListadoMovimientos"));
		}
		
		
		this.jComboBoxTiposRelacionesListadoMovimientos.addActionListener (new ButtonActionListener(this,"TiposRelacionesListadoMovimientos"));
			
		this.jComboBoxTiposAccionesListadoMovimientos.addActionListener (new ButtonActionListener(this,"TiposAccionesListadoMovimientos"));
					
		this.jComboBoxTiposSeleccionarListadoMovimientos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarListadoMovimientos"));
			
		this.jTextFieldValorCampoGeneralListadoMovimientos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralListadoMovimientos"));		
		
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonidListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"idListadoMovimientosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonid_empresaListadoMovimientosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadoMovimientosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonid_empresaListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonfecha_emision_desdeListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonfecha_emision_hastaListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonnombre_transaccionListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonfecha_emisionListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonfecha_ventaListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ventaListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonnumero_comprobanteListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonnombre_clienteListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtondebito_mone_localListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtoncredito_mone_localListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtondescripcionListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionListadoMovimientosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaListadoMovimientosListadoMovimientos.addActionListener(new ButtonActionListener(this,"BusquedaListadoMovimientosListadoMovimientos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoListadoMovimientos!=null) {
				this.jInternalFrameReporteDinamicoListadoMovimientos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadoMovimientos"));
				this.jInternalFrameReporteDinamicoListadoMovimientos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadoMovimientos"));
				this.jInternalFrameReporteDinamicoListadoMovimientos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadoMovimientos"));
			}
			
			//this.jButtonCerrarReporteDinamicoListadoMovimientos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadoMovimientos"));				
			//this.jButtonGenerarReporteDinamicoListadoMovimientos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadoMovimientos"));
			//this.jButtonGenerarExcelReporteDinamicoListadoMovimientos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadoMovimientos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionListadoMovimientos!=null) {
				this.jInternalFrameImportacionListadoMovimientos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionListadoMovimientos"));
				this.jInternalFrameImportacionListadoMovimientos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionListadoMovimientos"));
				this.jInternalFrameImportacionListadoMovimientos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionListadoMovimientos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByListadoMovimientos.addActionListener (new ButtonActionListener(this,"AbrirOrderByListadoMovimientos"));
			
			this.jButtonAbrirOrderByToolBarListadoMovimientos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarListadoMovimientos"));			
			
			if(this.jInternalFrameOrderByListadoMovimientos!=null) {
				this.jInternalFrameOrderByListadoMovimientos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByListadoMovimientos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoMovimientos.jTabbedPaneRelacionesListadoMovimientos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesListadoMovimientos"));
		
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
            		closingInternalFrameListadoMovimientos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormListadoMovimientos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormListadoMovimientos = (JInternalFrameBase)event.getSource();
	            	
	            ListadoMovimientosBeanSwingJInternalFrame jInternalFrameParent=(ListadoMovimientosBeanSwingJInternalFrame)jInternalFrameDetalleFormListadoMovimientos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarListadoMovimientosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosListadoMovimientos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosListadoMovimientosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosListadoMovimientos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosListadoMovimientos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoMovimientosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoMovimientosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoMovimientosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoListadoMovimientos";
		inputMap = this.jButtonNuevoListadoMovimientos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoListadoMovimientos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoListadoMovimientosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoMovimientosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoMovimientosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoMovimientosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesListadoMovimientos";
		inputMap = this.jButtonNuevoRelacionesListadoMovimientos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesListadoMovimientos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoListadoMovimientosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarListadoMovimientos";
		inputMap = this.jButtonModificarListadoMovimientos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarListadoMovimientos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarListadoMovimientosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarListadoMovimientos";
		inputMap = this.jButtonActualizarListadoMovimientos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarListadoMovimientos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarListadoMovimientosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarListadoMovimientos";
		inputMap = this.jButtonEliminarListadoMovimientos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarListadoMovimientos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarListadoMovimientosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarListadoMovimientos";
		inputMap = this.jButtonCancelarListadoMovimientos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarListadoMovimientos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarListadoMovimientosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarListadoMovimientos";
		inputMap = this.jButtonCerrarListadoMovimientos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarListadoMovimientos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarListadoMovimientosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonGuardarCambiosListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosListadoMovimientos";
		inputMap = this.jInternalFrameDetalleFormListadoMovimientos.jButtonGuardarCambiosListadoMovimientos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonGuardarCambiosListadoMovimientos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosListadoMovimientosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosListadoMovimientos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosListadoMovimientosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesListadoMovimientos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesListadoMovimientosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarListadoMovimientos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarListadoMovimientosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralListadoMovimientos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralListadoMovimientosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonidListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"idListadoMovimientosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonid_empresaListadoMovimientosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadoMovimientosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonid_empresaListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonfecha_emision_desdeListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonfecha_emision_hastaListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonnombre_transaccionListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonfecha_emisionListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonfecha_ventaListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ventaListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonnumero_comprobanteListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtonnombre_clienteListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtondebito_mone_localListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtoncredito_mone_localListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localListadoMovimientosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoMovimientos.jButtondescripcionListadoMovimientosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionListadoMovimientosBusqueda"));
		
		
		this.jButtonBusquedaListadoMovimientosListadoMovimientos.addActionListener(new ButtonActionListener(this,"BusquedaListadoMovimientosListadoMovimientos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionListadoMovimientos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionListadoMovimientosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarListadoMovimientosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarListadoMovimientos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosListadoMovimientos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ListadoMovimientos listadomovimientosAux:this.listadomovimientosLogic.getListadoMovimientoss()) {
					listadomovimientosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadoMovimientos listadomovimientosAux:listadomovimientoss) {
					listadomovimientosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosListadoMovimientosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingListadoMovimientos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ListadoMovimientos listadomovimientosAux:this.listadomovimientosLogic.getListadoMovimientoss()) {
						listadomovimientosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadoMovimientos listadomovimientosAux:listadomovimientoss) {
						listadomovimientosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ListadoMovimientos listadomovimientosAux:this.listadomovimientosLogic.getListadoMovimientoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadoMovimientos listadomovimientosAux:listadomovimientoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaListadoMovimientos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosListadoMovimientos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosListadoMovimientos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosListadoMovimientos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosListadoMovimientosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingListadoMovimientos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosListadoMovimientos.getSelectedRows();
			
			ListadoMovimientos listadomovimientosLocal=new ListadoMovimientos();
			
			//this.seleccionarTodosListadoMovimientos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					listadomovimientosLocal =(ListadoMovimientos) this.listadomovimientosLogic.getListadoMovimientoss().toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					listadomovimientosLocal =(ListadoMovimientos) this.listadomovimientoss.toArray()[this.jTableDatosListadoMovimientos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				listadomovimientosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ListadoMovimientos listadomovimientosAux:this.listadomovimientosLogic.getListadoMovimientoss()) {
						listadomovimientosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadoMovimientos listadomovimientosAux:listadomovimientoss) {
						listadomovimientosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaListadoMovimientos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosListadoMovimientos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosListadoMovimientos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosListadoMovimientos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualListadoMovimientosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarListadoMovimientosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralListadoMovimientosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingListadoMovimientos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralListadoMovimientos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ListadoMovimientos listadomovimientosAux:this.listadomovimientosLogic.getListadoMovimientoss()) {
				
						if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							listadomovimientosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							listadomovimientosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
							existe=true;
							listadomovimientosAux.setnombre_transaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							listadomovimientosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA)) {
							existe=true;
							listadomovimientosAux.setfecha_venta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							listadomovimientosAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							listadomovimientosAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							listadomovimientosAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							listadomovimientosAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							listadomovimientosAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadoMovimientos listadomovimientosAux:listadomovimientoss) {
					
						if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							listadomovimientosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							listadomovimientosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
							existe=true;
							listadomovimientosAux.setnombre_transaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							listadomovimientosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA)) {
							existe=true;
							listadomovimientosAux.setfecha_venta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							listadomovimientosAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							listadomovimientosAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							listadomovimientosAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							listadomovimientosAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							listadomovimientosAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaListadoMovimientos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesListadoMovimientosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingListadoMovimientos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioListadoMovimientos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesListadoMovimientos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxTiposAccionesFormularioListadoMovimientos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteListadoMovimientos) {				
					conSplash=true;//false;										
					
					//this.startProcessListadoMovimientos(conSplash);
				
					this.generarReporteListadoMovimientossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadoMovimientos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxTiposAccionesFormularioListadoMovimientos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoListadoMovimientossSeleccionados();
				//this.jComboBoxTiposAccionesListadoMovimientos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoListadoMovimientossSeleccionados(false);
				//this.jComboBoxTiposAccionesListadoMovimientos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoListadoMovimientossSeleccionados(true);
				//this.jComboBoxTiposAccionesListadoMovimientos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessListadoMovimientos();
				
				this.exportarListadoMovimientossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadoMovimientos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxTiposAccionesFormularioListadoMovimientos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionListadoMovimientoss();
				//this.importarListadoMovimientoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadoMovimientos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxTiposAccionesFormularioListadoMovimientos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessListadoMovimientos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelListadoMovimientossSeleccionados();
				//this.jComboBoxTiposAccionesListadoMovimientos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Listado Movimientos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessListadoMovimientos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoListadoMovimientos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyListadoMovimientos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Listado Movimientos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadoMovimientos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxTiposAccionesFormularioListadoMovimientos.setSelectedIndex(0);					
				}	
			} 			
			else if(ListadoMovimientosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteListadoMovimientos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessListadoMovimientos(conSplash);
					
						//this.actualizarParametrosGeneralListadoMovimientos();
						
						this.generarReporteProcesoAccionListadoMovimientossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesListadoMovimientos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxTiposAccionesFormularioListadoMovimientos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ListadoMovimientosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Listado MovimientosES SELECCIONADOS?", "MANTENIMIENTO DE Listado Movimientos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessListadoMovimientos();
				
						this.actualizarParametrosGeneralListadoMovimientos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.listadomovimientosReturnGeneral=listadomovimientosLogic.procesarAccionListadoMovimientossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.listadomovimientosLogic.getListadoMovimientoss(),this.listadomovimientosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarListadoMovimientosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesListadoMovimientos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxTiposAccionesFormularioListadoMovimientos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralListadoMovimientos();
					
					ListadoMovimientosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarListadoMovimientosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesListadoMovimientos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxTiposAccionesFormularioListadoMovimientos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessListadoMovimientos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesListadoMovimientosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessListadoMovimientos();
			
			if(this.jInternalFrameDetalleFormListadoMovimientos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ListadoMovimientos> listadomovimientossSeleccionados=new ArrayList<ListadoMovimientos>();		
			ListadoMovimientos listadomovimientos=new ListadoMovimientos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingListadoMovimientos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesListadoMovimientos.getSelectedItem();
			
			
			
			
			listadomovimientossSeleccionados=this.getListadoMovimientossSeleccionados(true);
			//this.sTipoAccion;
			
			if(listadomovimientossSeleccionados.size()==1) {
				for(ListadoMovimientos listadomovimientosAux:listadomovimientossSeleccionados) {
					listadomovimientos=listadomovimientosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessListadoMovimientos();
			
      		//this.finishProcessListadoMovimientos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarListadoMovimientosReturnGeneral() throws Exception {
		if(this.listadomovimientosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.listadomovimientosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.listadomovimientosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.listadomovimientosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.listadomovimientosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.listadomovimientosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingListadoMovimientos(false);
		}
		
		if(this.listadomovimientosReturnGeneral.getConRetornoLista() || this.listadomovimientosReturnGeneral.getConRetornoObjeto()) {
			if(this.listadomovimientosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.listadomovimientosLogic.setListadoMovimientoss(this.listadomovimientosReturnGeneral.getListadoMovimientoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingListadoMovimientos(false);
		}
	}
	
	public void actualizarParametrosGeneralListadoMovimientos() throws Exception {
		
		
	}
	
	public ArrayList<ListadoMovimientos> getListadoMovimientossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ListadoMovimientos> listadomovimientossSeleccionados=new ArrayList<ListadoMovimientos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioListadoMovimientos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ListadoMovimientos listadomovimientosAux:listadomovimientosLogic.getListadoMovimientoss()) {
					if(listadomovimientosAux.getIsSelected()) {
						listadomovimientossSeleccionados.add(listadomovimientosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadoMovimientos listadomovimientosAux:this.listadomovimientoss) {
					if(listadomovimientosAux.getIsSelected()) {
						listadomovimientossSeleccionados.add(listadomovimientosAux);				
					}
				}
			}
			
			if(listadomovimientossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						listadomovimientossSeleccionados.addAll(this.listadomovimientosLogic.getListadoMovimientoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						listadomovimientossSeleccionados.addAll(this.listadomovimientoss);				
					}
				}
			}
		} else {
			listadomovimientossSeleccionados.add(this.listadomovimientos);
		}
		
		return listadomovimientossSeleccionados;
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
	
	public void generarReporteListadoMovimientossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalListadoMovimientossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoListadoMovimientossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoListadoMovimientossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoListadoMovimientossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Listado Movimientos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesListadoMovimientossSeleccionados() throws Exception {
		ArrayList<ListadoMovimientos> listadomovimientossSeleccionados=new ArrayList<ListadoMovimientos>();		
		
		listadomovimientossSeleccionados=this.getListadoMovimientossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteListadoMovimientoss("Todos",listadomovimientossSeleccionados);
		
	}	
	
	public void generarReporteNormalListadoMovimientossSeleccionados() throws Exception {
		ArrayList<ListadoMovimientos> listadomovimientossSeleccionados=new ArrayList<ListadoMovimientos>();		
		
		listadomovimientossSeleccionados=this.getListadoMovimientossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteListadoMovimientoss("Todos",listadomovimientossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionListadoMovimientossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ListadoMovimientos> listadomovimientossSeleccionados=new ArrayList<ListadoMovimientos>();
		
		listadomovimientossSeleccionados=this.getListadoMovimientossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteListadoMovimientoss("Todos",listadomovimientossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoListadoMovimientossSeleccionados() throws Exception {
		ArrayList<ListadoMovimientos> listadomovimientossSeleccionados=new ArrayList<ListadoMovimientos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoListadoMovimientos();
		
		
		listadomovimientossSeleccionados=this.getListadoMovimientossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoListadoMovimientos();
		
		
		//this.generarReporteListadoMovimientoss("Todos",listadomovimientossSeleccionados ,listadomovimientosImplementable,listadomovimientosImplementableHome);
	}
	
	public void mostrarImportacionListadoMovimientoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionListadoMovimientos();
		
		this.abrirFrameImportacionListadoMovimientos();		
		
			
		//this.generarReporteListadoMovimientoss("Todos",listadomovimientossSeleccionados ,listadomovimientosImplementable,listadomovimientosImplementableHome);
	}
	
	public void importarListadoMovimientoss() throws Exception {		
	
	}
	
	public void exportarListadoMovimientossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelListadoMovimientossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoListadoMovimientossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlListadoMovimientossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Listado Movimientos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoListadoMovimientossSeleccionados() throws Exception {
		ArrayList<ListadoMovimientos> listadomovimientossSeleccionados=new ArrayList<ListadoMovimientos>();		
		
		listadomovimientossSeleccionados=this.getListadoMovimientossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadomovimientos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarListadoMovimientos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ListadoMovimientos listadomovimientosAux:listadomovimientossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarListadoMovimientos(listadomovimientosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//listadomovimientosAux.setsDetalleGeneralEntityReporte(listadomovimientosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Movimientos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarListadoMovimientos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ListadoMovimientosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoMovimientosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoMovimientosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarListadoMovimientos(ListadoMovimientos listadomovimientos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=listadomovimientos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=listadomovimientos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadomovimientos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadomovimientos.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadomovimientos.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadomovimientos.getnombre_transaccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadomovimientos.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadomovimientos.getfecha_venta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadomovimientos.getnumero_comprobante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadomovimientos.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadomovimientos.getdebito_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadomovimientos.getcredito_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadomovimientos.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelListadoMovimientossSeleccionados() throws Exception {
		ArrayList<ListadoMovimientos> listadomovimientossSeleccionados=new ArrayList<ListadoMovimientos>();		
		
		listadomovimientossSeleccionados=this.getListadoMovimientossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadomovimientos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ListadoMovimientoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelListadoMovimientos(row);				
				iRow++;
			}				
			
			for(ListadoMovimientos listadomovimientosAux:listadomovimientossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelListadoMovimientos(listadomovimientosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Movimientos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlListadoMovimientossSeleccionados() throws Exception {
		ArrayList<ListadoMovimientos> listadomovimientossSeleccionados=new ArrayList<ListadoMovimientos>();		
		
		listadomovimientossSeleccionados=this.getListadoMovimientossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadomovimientos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("listadomovimientoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("listadomovimientos");
			//elementRoot.appendChild(element);
		
			for(ListadoMovimientos listadomovimientosAux:listadomovimientossSeleccionados) {
				element = document.createElement("listadomovimientos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlListadoMovimientos(listadomovimientosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Movimientos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelListadoMovimientos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelListadoMovimientos(ListadoMovimientos listadomovimientos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(listadomovimientos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(listadomovimientos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(listadomovimientos.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(listadomovimientos.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(listadomovimientos.getnombre_transaccion());
		cell = row.createCell(iColumn++);cell.setCellValue(listadomovimientos.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(listadomovimientos.getfecha_venta());
		cell = row.createCell(iColumn++);cell.setCellValue(listadomovimientos.getnumero_comprobante());
		cell = row.createCell(iColumn++);cell.setCellValue(listadomovimientos.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(listadomovimientos.getdebito_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(listadomovimientos.getcredito_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(listadomovimientos.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlListadoMovimientos(ListadoMovimientos listadomovimientos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ListadoMovimientosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(listadomovimientos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ListadoMovimientosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(listadomovimientos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ListadoMovimientosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(listadomovimientos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfecha_emision_desde = document.createElement(ListadoMovimientosConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(listadomovimientos.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(ListadoMovimientosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(listadomovimientos.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_transaccion = document.createElement(ListadoMovimientosConstantesFunciones.NOMBRETRANSACCION);
		elementnombre_transaccion.appendChild(document.createTextNode(listadomovimientos.getnombre_transaccion().trim()));
		element.appendChild(elementnombre_transaccion);

		Element elementfecha_emision = document.createElement(ListadoMovimientosConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(listadomovimientos.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_venta = document.createElement(ListadoMovimientosConstantesFunciones.FECHAVENTA);
		elementfecha_venta.appendChild(document.createTextNode(listadomovimientos.getfecha_venta().toString().trim()));
		element.appendChild(elementfecha_venta);

		Element elementnumero_comprobante = document.createElement(ListadoMovimientosConstantesFunciones.NUMEROCOMPROBANTE);
		elementnumero_comprobante.appendChild(document.createTextNode(listadomovimientos.getnumero_comprobante().trim()));
		element.appendChild(elementnumero_comprobante);

		Element elementnombre_cliente = document.createElement(ListadoMovimientosConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(listadomovimientos.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementdebito_mone_local = document.createElement(ListadoMovimientosConstantesFunciones.DEBITOMONELOCAL);
		elementdebito_mone_local.appendChild(document.createTextNode(listadomovimientos.getdebito_mone_local().toString().trim()));
		element.appendChild(elementdebito_mone_local);

		Element elementcredito_mone_local = document.createElement(ListadoMovimientosConstantesFunciones.CREDITOMONELOCAL);
		elementcredito_mone_local.appendChild(document.createTextNode(listadomovimientos.getcredito_mone_local().toString().trim()));
		element.appendChild(elementcredito_mone_local);

		Element elementdescripcion = document.createElement(ListadoMovimientosConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(listadomovimientos.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoListadoMovimientossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ListadoMovimientos> listadomovimientossSeleccionados=new ArrayList<ListadoMovimientos>();
		
		listadomovimientossSeleccionados=this.getListadoMovimientossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoListadoMovimientos(listadomovimientossSeleccionados);
		
		this.generarReporteListadoMovimientoss("Todos",listadomovimientossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoListadoMovimientos(ArrayList<ListadoMovimientos> listadomovimientossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ListadoMovimientos listadomovimientosAux:listadomovimientossSeleccionados) {
				listadomovimientosAux.setsDetalleGeneralEntityReporte(listadomovimientosAux.toString());
			
				if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					listadomovimientosAux.setsDescripcionGeneralEntityReporte1(listadomovimientosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					listadomovimientosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(listadomovimientosAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					listadomovimientosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(listadomovimientosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
					existe=true;
					listadomovimientosAux.setsDescripcionGeneralEntityReporte1(listadomovimientosAux.getnombre_transaccion());
				}
				 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					listadomovimientosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(listadomovimientosAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA)) {
					existe=true;
					listadomovimientosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(listadomovimientosAux.getfecha_venta()));
				}
				 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
					existe=true;
					listadomovimientosAux.setsDescripcionGeneralEntityReporte1(listadomovimientosAux.getnumero_comprobante());
				}
				 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					listadomovimientosAux.setsDescripcionGeneralEntityReporte1(listadomovimientosAux.getnombre_cliente());
				}
				 else if(sTipoSeleccionar.equals(ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					listadomovimientosAux.setsDescripcionGeneralEntityReporte1(listadomovimientosAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoMovimientosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesListadoMovimientos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoListadoMovimientos=true;
				this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos=true;
				this.isVisibilidadCeldaGuardarCambiosListadoMovimientos=true;
			}
			
			this.isVisibilidadCeldaModificarListadoMovimientos=false;
			this.isVisibilidadCeldaActualizarListadoMovimientos=false;
			this.isVisibilidadCeldaEliminarListadoMovimientos=false;
			this.isVisibilidadCeldaCancelarListadoMovimientos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoMovimientos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadoMovimientos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoListadoMovimientos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos=false;
			this.isVisibilidadCeldaGuardarCambiosListadoMovimientos=false;
			this.isVisibilidadCeldaModificarListadoMovimientos=false;
			this.isVisibilidadCeldaActualizarListadoMovimientos=true;
			this.isVisibilidadCeldaEliminarListadoMovimientos=false;
			this.isVisibilidadCeldaCancelarListadoMovimientos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoMovimientos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadoMovimientos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoListadoMovimientos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos=false;
			this.isVisibilidadCeldaGuardarCambiosListadoMovimientos=false;
			this.isVisibilidadCeldaModificarListadoMovimientos=false;
			this.isVisibilidadCeldaActualizarListadoMovimientos=true;
			this.isVisibilidadCeldaEliminarListadoMovimientos=true;
			this.isVisibilidadCeldaCancelarListadoMovimientos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoMovimientos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadoMovimientos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoListadoMovimientos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos=false;
			this.isVisibilidadCeldaGuardarCambiosListadoMovimientos=false;
			this.isVisibilidadCeldaModificarListadoMovimientos=false;
			this.isVisibilidadCeldaActualizarListadoMovimientos=true;
			this.isVisibilidadCeldaEliminarListadoMovimientos=false;
			this.isVisibilidadCeldaCancelarListadoMovimientos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoMovimientos=false;
				} else {
					this.isVisibilidadCeldaGuardarListadoMovimientos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoListadoMovimientos=true;
			this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos=true;
			this.isVisibilidadCeldaGuardarCambiosListadoMovimientos=true;
			this.isVisibilidadCeldaModificarListadoMovimientos=false;
			this.isVisibilidadCeldaActualizarListadoMovimientos=false;
			this.isVisibilidadCeldaEliminarListadoMovimientos=false;
			this.isVisibilidadCeldaCancelarListadoMovimientos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoMovimientos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadoMovimientos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoListadoMovimientos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos=false;
			this.isVisibilidadCeldaGuardarCambiosListadoMovimientos=false;
			this.isVisibilidadCeldaActualizarListadoMovimientos=false;
			this.isVisibilidadCeldaEliminarListadoMovimientos=false;
			this.isVisibilidadCeldaCancelarListadoMovimientos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoMovimientos=false;
				} else {
					this.isVisibilidadCeldaGuardarListadoMovimientos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoListadoMovimientos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos=false;
			this.isVisibilidadCeldaGuardarCambiosListadoMovimientos=false;
			this.isVisibilidadCeldaModificarListadoMovimientos=true;
			this.isVisibilidadCeldaActualizarListadoMovimientos=false;
			this.isVisibilidadCeldaEliminarListadoMovimientos=false;
			this.isVisibilidadCeldaCancelarListadoMovimientos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoMovimientos=false;
				} else {
					this.isVisibilidadCeldaGuardarListadoMovimientos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ListadoMovimientosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoListadoMovimientos=true;
			this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos=true;
			this.isVisibilidadCeldaGuardarCambiosListadoMovimientos=true;
		} else {
			this.actualizarEstadoPanelsListadoMovimientos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarListadoMovimientos=false;
			//this.isVisibilidadCeldaVerFormListadoMovimientos=false;
			this.isVisibilidadCeldaDuplicarListadoMovimientos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!listadomovimientosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos=false;
		} else {
			this.isVisibilidadCeldaNuevoListadoMovimientos=false;
			this.isVisibilidadCeldaGuardarCambiosListadoMovimientos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(listadomovimientosSessionBean.getEsGuardarRelacionado()) {
			if(!listadomovimientosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos=false;												
			}
			
			this.jButtonCerrarListadoMovimientos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos=false;
		}
		
		if(!this.permiteMantenimiento(this.listadomovimientos)) {
			this.isVisibilidadCeldaActualizarListadoMovimientos=false;
			this.isVisibilidadCeldaEliminarListadoMovimientos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoListadoMovimientos=false;
		this.isVisibilidadCeldaNuevoRelacionesListadoMovimientos=false;
		this.isVisibilidadCeldaGuardarCambiosListadoMovimientos=false;
		//this.isVisibilidadCeldaModificarListadoMovimientos=true;
		this.isVisibilidadCeldaActualizarListadoMovimientos=false;
		this.isVisibilidadCeldaEliminarListadoMovimientos=false;
		//this.isVisibilidadCeldaCancelarListadoMovimientos=true;			
		this.isVisibilidadCeldaGuardarListadoMovimientos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesListadoMovimientos() {
	}
	
	public void actualizarEstadoPanelsListadoMovimientos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionListadoMovimientos!=null) {
				this.jScrollPanelDatosEdicionListadoMovimientos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoMovimientos!=null) {
				this.jTabbedPaneBusquedasListadoMovimientos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadoMovimientos!=null) {
				this.jScrollPanelDatosListadoMovimientos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadoMovimientos!=null) {
				this.jPanelPaginacionListadoMovimientos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadoMovimientos!=null) {
				this.jPanelParametrosReportesListadoMovimientos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionListadoMovimientos!=null) {
				this.jScrollPanelDatosEdicionListadoMovimientos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoMovimientos!=null) {
				this.jTabbedPaneBusquedasListadoMovimientos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosListadoMovimientos!=null) {
				this.jScrollPanelDatosListadoMovimientos.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadoMovimientos!=null) {
				this.jPanelPaginacionListadoMovimientos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadoMovimientos!=null) {
				this.jPanelParametrosReportesListadoMovimientos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionListadoMovimientos!=null) {
				this.jScrollPanelDatosEdicionListadoMovimientos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoMovimientos!=null) {
				this.jTabbedPaneBusquedasListadoMovimientos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosListadoMovimientos!=null) {
				this.jScrollPanelDatosListadoMovimientos.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadoMovimientos!=null) {
				this.jPanelPaginacionListadoMovimientos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadoMovimientos!=null) {
				this.jPanelParametrosReportesListadoMovimientos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionListadoMovimientos!=null) {
				this.jScrollPanelDatosEdicionListadoMovimientos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoMovimientos!=null) {
				this.jTabbedPaneBusquedasListadoMovimientos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosListadoMovimientos!=null) {
				this.jScrollPanelDatosListadoMovimientos.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadoMovimientos!=null) {
				this.jPanelPaginacionListadoMovimientos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadoMovimientos!=null) {
				this.jPanelParametrosReportesListadoMovimientos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionListadoMovimientos!=null) {
				this.jScrollPanelDatosEdicionListadoMovimientos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoMovimientos!=null) {
				this.jTabbedPaneBusquedasListadoMovimientos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadoMovimientos!=null) {
				this.jScrollPanelDatosListadoMovimientos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadoMovimientos!=null) {
				this.jPanelPaginacionListadoMovimientos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadoMovimientos!=null) {
				this.jPanelParametrosReportesListadoMovimientos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionListadoMovimientos!=null) {
				this.jScrollPanelDatosEdicionListadoMovimientos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoMovimientos!=null) {
				this.jTabbedPaneBusquedasListadoMovimientos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadoMovimientos!=null) {
				this.jScrollPanelDatosListadoMovimientos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadoMovimientos!=null) {
				this.jPanelPaginacionListadoMovimientos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadoMovimientos!=null) {
				this.jPanelParametrosReportesListadoMovimientos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionListadoMovimientos!=null) {
				this.jScrollPanelDatosEdicionListadoMovimientos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoMovimientos!=null) {
				this.jTabbedPaneBusquedasListadoMovimientos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadoMovimientos!=null) {
				this.jScrollPanelDatosListadoMovimientos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadoMovimientos!=null) {
				this.jPanelPaginacionListadoMovimientos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadoMovimientos!=null) {
				this.jPanelParametrosReportesListadoMovimientos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasListadoMovimientos!=null) {
					this.jTabbedPaneBusquedasListadoMovimientos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesListadoMovimientos!=null) {
				this.jPanelParametrosReportesListadoMovimientos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoMovimientos!=null) {
				this.jTabbedPaneBusquedasListadoMovimientos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesListadoMovimientos!=null) {
				this.jPanelParametrosReportesListadoMovimientos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaListadoMovimientos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaListadoMovimientos) {this.jTabbedPaneBusquedasListadoMovimientos.remove(jPanelBusquedaListadoMovimientosListadoMovimientos);}
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
			
			this.inicializarActualizarBindingTablaListadoMovimientos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioListadoMovimientos() {
		this.updateBorderResaltarBusquedasFormularioListadoMovimientos();
		this.updateVisibilidadBusquedasFormularioListadoMovimientos();
		this.updateHabilitarBusquedasFormularioListadoMovimientos();
	}
	
	public void updateBorderResaltarBusquedasFormularioListadoMovimientos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasListadoMovimientos.getComponents().length>0) {
	

		if(this.listadomovimientosConstantesFunciones.resaltarBusquedaListadoMovimientosListadoMovimientos!=null) {
			index= this.jTabbedPaneBusquedasListadoMovimientos.indexOfComponent(this.jPanelBusquedaListadoMovimientosListadoMovimientos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasListadoMovimientos.getComponent(index);
				jPanel.setBorder(this.listadomovimientosConstantesFunciones.resaltarBusquedaListadoMovimientosListadoMovimientos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioListadoMovimientos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasListadoMovimientos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasListadoMovimientos.indexOfComponent(this.jPanelBusquedaListadoMovimientosListadoMovimientos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasListadoMovimientos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.listadomovimientosConstantesFunciones.mostrarBusquedaListadoMovimientosListadoMovimientos);
			if(!this.listadomovimientosConstantesFunciones.mostrarBusquedaListadoMovimientosListadoMovimientos && index>-1) {
				this.jTabbedPaneBusquedasListadoMovimientos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioListadoMovimientos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasListadoMovimientos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasListadoMovimientos.indexOfComponent(this.jPanelBusquedaListadoMovimientosListadoMovimientos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasListadoMovimientos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.listadomovimientosConstantesFunciones.activarBusquedaListadoMovimientosListadoMovimientos);
				this.jTabbedPaneBusquedasListadoMovimientos.setEnabledAt(index,this.listadomovimientosConstantesFunciones.activarBusquedaListadoMovimientosListadoMovimientos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaListadoMovimientos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaListadoMovimientos")) {
			index= this.jTabbedPaneBusquedasListadoMovimientos.indexOfComponent(this.jPanelBusquedaListadoMovimientosListadoMovimientos);

			this.jTabbedPaneBusquedasListadoMovimientos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasListadoMovimientos.getComponent(index);

			this.listadomovimientosConstantesFunciones.setResaltarBusquedaListadoMovimientosListadoMovimientos(resaltar);

			jPanel.setBorder(this.listadomovimientosConstantesFunciones.resaltarBusquedaListadoMovimientosListadoMovimientos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarListadoMovimientos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioListadoMovimientos() throws Exception {

		if(this.jInternalFrameDetalleFormListadoMovimientos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioListadoMovimientos();
		this.updateVisibilidadResaltarControlesFormularioListadoMovimientos();
		this.updateHabilitarResaltarControlesFormularioListadoMovimientos();
		
	}
	
	public void updateBorderResaltarControlesFormularioListadoMovimientos() throws Exception {
		if(this.jInternalFrameDetalleFormListadoMovimientos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.listadomovimientosConstantesFunciones.resaltaridListadoMovimientos!=null && this.jInternalFrameDetalleFormListadoMovimientos!=null) {this.jInternalFrameDetalleFormListadoMovimientos.jLabelidListadoMovimientos.setBorder(this.listadomovimientosConstantesFunciones.resaltaridListadoMovimientos);}
		if(this.listadomovimientosConstantesFunciones.resaltarid_empresaListadoMovimientos!=null && this.jInternalFrameDetalleFormListadoMovimientos!=null) {this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxid_empresaListadoMovimientos.setBorder(this.listadomovimientosConstantesFunciones.resaltarid_empresaListadoMovimientos);}
		if(this.listadomovimientosConstantesFunciones.resaltarfecha_emision_desdeListadoMovimientos!=null && this.jInternalFrameDetalleFormListadoMovimientos!=null) {this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_emision_desdeListadoMovimientos.setBorder(this.listadomovimientosConstantesFunciones.resaltarfecha_emision_desdeListadoMovimientos);}
		if(this.listadomovimientosConstantesFunciones.resaltarfecha_emision_hastaListadoMovimientos!=null && this.jInternalFrameDetalleFormListadoMovimientos!=null) {this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_emision_hastaListadoMovimientos.setBorder(this.listadomovimientosConstantesFunciones.resaltarfecha_emision_hastaListadoMovimientos);}
		if(this.listadomovimientosConstantesFunciones.resaltarnombre_transaccionListadoMovimientos!=null && this.jInternalFrameDetalleFormListadoMovimientos!=null) {this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldnombre_transaccionListadoMovimientos.setBorder(this.listadomovimientosConstantesFunciones.resaltarnombre_transaccionListadoMovimientos);}
		if(this.listadomovimientosConstantesFunciones.resaltarfecha_emisionListadoMovimientos!=null && this.jInternalFrameDetalleFormListadoMovimientos!=null) {this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_emisionListadoMovimientos.setBorder(this.listadomovimientosConstantesFunciones.resaltarfecha_emisionListadoMovimientos);}
		if(this.listadomovimientosConstantesFunciones.resaltarfecha_ventaListadoMovimientos!=null && this.jInternalFrameDetalleFormListadoMovimientos!=null) {this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_ventaListadoMovimientos.setBorder(this.listadomovimientosConstantesFunciones.resaltarfecha_ventaListadoMovimientos);}
		if(this.listadomovimientosConstantesFunciones.resaltarnumero_comprobanteListadoMovimientos!=null && this.jInternalFrameDetalleFormListadoMovimientos!=null) {this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldnumero_comprobanteListadoMovimientos.setBorder(this.listadomovimientosConstantesFunciones.resaltarnumero_comprobanteListadoMovimientos);}
		if(this.listadomovimientosConstantesFunciones.resaltarnombre_clienteListadoMovimientos!=null && this.jInternalFrameDetalleFormListadoMovimientos!=null) {this.jInternalFrameDetalleFormListadoMovimientos.jTextAreanombre_clienteListadoMovimientos.setBorder(this.listadomovimientosConstantesFunciones.resaltarnombre_clienteListadoMovimientos);}
		if(this.listadomovimientosConstantesFunciones.resaltardebito_mone_localListadoMovimientos!=null && this.jInternalFrameDetalleFormListadoMovimientos!=null) {this.jInternalFrameDetalleFormListadoMovimientos.jTextFielddebito_mone_localListadoMovimientos.setBorder(this.listadomovimientosConstantesFunciones.resaltardebito_mone_localListadoMovimientos);}
		if(this.listadomovimientosConstantesFunciones.resaltarcredito_mone_localListadoMovimientos!=null && this.jInternalFrameDetalleFormListadoMovimientos!=null) {this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldcredito_mone_localListadoMovimientos.setBorder(this.listadomovimientosConstantesFunciones.resaltarcredito_mone_localListadoMovimientos);}
		if(this.listadomovimientosConstantesFunciones.resaltardescripcionListadoMovimientos!=null && this.jInternalFrameDetalleFormListadoMovimientos!=null) {this.jInternalFrameDetalleFormListadoMovimientos.jTextAreadescripcionListadoMovimientos.setBorder(this.listadomovimientosConstantesFunciones.resaltardescripcionListadoMovimientos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioListadoMovimientos() throws Exception {		
		if(this.jInternalFrameDetalleFormListadoMovimientos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
	
		//this.jInternalFrameDetalleFormListadoMovimientos.jLabelidListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostraridListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jPanelidListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostraridListadoMovimientos);
		//this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxid_empresaListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarid_empresaListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jPanelid_empresaListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarid_empresaListadoMovimientos);
		//this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_emision_desdeListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarfecha_emision_desdeListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jPanelfecha_emision_desdeListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarfecha_emision_desdeListadoMovimientos);
		//this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_emision_hastaListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarfecha_emision_hastaListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jPanelfecha_emision_hastaListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarfecha_emision_hastaListadoMovimientos);
		//this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldnombre_transaccionListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarnombre_transaccionListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jPanelnombre_transaccionListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarnombre_transaccionListadoMovimientos);
		//this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_emisionListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarfecha_emisionListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jPanelfecha_emisionListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarfecha_emisionListadoMovimientos);
		//this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_ventaListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarfecha_ventaListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jPanelfecha_ventaListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarfecha_ventaListadoMovimientos);
		//this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldnumero_comprobanteListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarnumero_comprobanteListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jPanelnumero_comprobanteListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarnumero_comprobanteListadoMovimientos);
		//this.jInternalFrameDetalleFormListadoMovimientos.jTextAreanombre_clienteListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarnombre_clienteListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jPanelnombre_clienteListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarnombre_clienteListadoMovimientos);
		//this.jInternalFrameDetalleFormListadoMovimientos.jTextFielddebito_mone_localListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrardebito_mone_localListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jPaneldebito_mone_localListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrardebito_mone_localListadoMovimientos);
		//this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldcredito_mone_localListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarcredito_mone_localListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jPanelcredito_mone_localListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrarcredito_mone_localListadoMovimientos);
		//this.jInternalFrameDetalleFormListadoMovimientos.jTextAreadescripcionListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrardescripcionListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jPaneldescripcionListadoMovimientos.setVisible(this.listadomovimientosConstantesFunciones.mostrardescripcionListadoMovimientos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioListadoMovimientos() throws Exception {
		if(this.jInternalFrameDetalleFormListadoMovimientos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormListadoMovimientos!=null) {
	
		this.jInternalFrameDetalleFormListadoMovimientos.jLabelidListadoMovimientos.setEnabled(this.listadomovimientosConstantesFunciones.activaridListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jComboBoxid_empresaListadoMovimientos.setEnabled(this.listadomovimientosConstantesFunciones.activarid_empresaListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_emision_desdeListadoMovimientos.setEnabled(this.listadomovimientosConstantesFunciones.activarfecha_emision_desdeListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_emision_hastaListadoMovimientos.setEnabled(this.listadomovimientosConstantesFunciones.activarfecha_emision_hastaListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldnombre_transaccionListadoMovimientos.setEnabled(this.listadomovimientosConstantesFunciones.activarnombre_transaccionListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_emisionListadoMovimientos.setEnabled(this.listadomovimientosConstantesFunciones.activarfecha_emisionListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jDateChooserfecha_ventaListadoMovimientos.setEnabled(this.listadomovimientosConstantesFunciones.activarfecha_ventaListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldnumero_comprobanteListadoMovimientos.setEnabled(this.listadomovimientosConstantesFunciones.activarnumero_comprobanteListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jTextAreanombre_clienteListadoMovimientos.setEnabled(this.listadomovimientosConstantesFunciones.activarnombre_clienteListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jTextFielddebito_mone_localListadoMovimientos.setEnabled(this.listadomovimientosConstantesFunciones.activardebito_mone_localListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jTextFieldcredito_mone_localListadoMovimientos.setEnabled(this.listadomovimientosConstantesFunciones.activarcredito_mone_localListadoMovimientos);
		this.jInternalFrameDetalleFormListadoMovimientos.jTextAreadescripcionListadoMovimientos.setEnabled(this.listadomovimientosConstantesFunciones.activardescripcionListadoMovimientos);
		}
	}
	
		
}