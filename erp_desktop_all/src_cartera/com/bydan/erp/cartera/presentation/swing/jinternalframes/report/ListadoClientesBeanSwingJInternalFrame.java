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

//import com.bydan.erp.cartera.util.ListadoClientesConstantesFunciones;
import com.bydan.erp.cartera.util.report.ListadoClientesParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.ListadoClientesParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.ListadoClientesBean;
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
public class ListadoClientesBeanSwingJInternalFrame extends ListadoClientesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ListadoClientesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ListadoClientes> listadoclientesValidator = new ClassValidator<ListadoClientes>(ListadoClientes.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ListadoClientes listadoclientes;	
	public ListadoClientes listadoclientesAux;
	public ListadoClientes listadoclientesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ListadoClientes listadoclientesTotales;
	public Long idListadoClientesActual;
	public Long iIdNuevoListadoClientes=0L;
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
	
	public Boolean isPermisoTodoListadoClientes;
	public Boolean isPermisoNuevoListadoClientes;
	public Boolean isPermisoActualizarListadoClientes;
	public Boolean isPermisoActualizarOriginalListadoClientes;
	public Boolean isPermisoEliminarListadoClientes;
	public Boolean isPermisoGuardarCambiosListadoClientes;
	public Boolean isPermisoConsultaListadoClientes;
	public Boolean isPermisoBusquedaListadoClientes;
	public Boolean isPermisoReporteListadoClientes;
	public Boolean isPermisoPaginacionMedioListadoClientes;
	public Boolean isPermisoPaginacionAltoListadoClientes;
	public Boolean isPermisoPaginacionTodoListadoClientes;
	public Boolean isPermisoCopiarListadoClientes;
	public Boolean isPermisoVerFormListadoClientes;
	public Boolean isPermisoDuplicarListadoClientes;
	public Boolean isPermisoOrdenListadoClientes;
	
	
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
	
	public ListadoClientesParameterReturnGeneral listadoclientesReturnGeneral;
	public ListadoClientesParameterReturnGeneral listadoclientesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoListadoClientes=false;
	public Boolean esParaAccionDesdeFormularioListadoClientes=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ListadoClientesSessionBeanAdditional listadoclientesSessionBeanAdditional=null;
	
	public ListadoClientesSessionBeanAdditional getListadoClientesSessionBeanAdditional() {
		return this.listadoclientesSessionBeanAdditional;
	}
	
	public void setListadoClientesSessionBeanAdditional(ListadoClientesSessionBeanAdditional listadoclientesSessionBeanAdditional) {
		try {
			this.listadoclientesSessionBeanAdditional=listadoclientesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ListadoClientesBeanSwingJInternalFrameAdditional listadoclientesBeanSwingJInternalFrameAdditional=null;
	//public class ListadoClientesBeanSwingJInternalFrame
	
	public ListadoClientesBeanSwingJInternalFrameAdditional getListadoClientesBeanSwingJInternalFrameAdditional() {
		return this.listadoclientesBeanSwingJInternalFrameAdditional;
	}
	
	public void setListadoClientesBeanSwingJInternalFrameAdditional(ListadoClientesBeanSwingJInternalFrameAdditional listadoclientesBeanSwingJInternalFrameAdditional) {
		try {
			this.listadoclientesBeanSwingJInternalFrameAdditional=listadoclientesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ListadoClientesLogic listadoclientesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ListadoClientes listadoclientesBean;
	public ListadoClientesConstantesFunciones listadoclientesConstantesFunciones;
	//public ListadoClientesParameterReturnGeneral listadoclientesReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ListadoClientes> listadoclientess;	
	//public List<ListadoClientes> listadoclientessEliminados;
	//public List<ListadoClientes> listadoclientessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoListadoClientes=false;
	public Boolean isVisibilidadCeldaDuplicarListadoClientes=true;
	public Boolean isVisibilidadCeldaCopiarListadoClientes=true;
	public Boolean isVisibilidadCeldaVerFormListadoClientes=true;
	public Boolean isVisibilidadCeldaOrdenListadoClientes=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesListadoClientes=false;
	public Boolean isVisibilidadCeldaModificarListadoClientes=false;
	public Boolean isVisibilidadCeldaActualizarListadoClientes=false;
	public Boolean isVisibilidadCeldaEliminarListadoClientes=false;
	public Boolean isVisibilidadCeldaCancelarListadoClientes=false;
	public Boolean isVisibilidadCeldaGuardarListadoClientes=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosListadoClientes=false;	
	
	
	public Boolean isVisibilidadBusquedaListadoClientes=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoListadoClientes() {
		return this.iIdNuevoListadoClientes;
	}

	public void setiIdNuevoListadoClientes(Long iIdNuevoListadoClientes) {
		this.iIdNuevoListadoClientes = iIdNuevoListadoClientes;
	}
	
	public Long getidListadoClientesActual() {
		return this.idListadoClientesActual;
	}

	public void setidListadoClientesActual(Long idListadoClientesActual) {
		this.idListadoClientesActual = idListadoClientesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ListadoClientes getlistadoclientes() {
		return this.listadoclientes;
	}

	public void setlistadoclientes(ListadoClientes listadoclientes) {
		this.listadoclientes = listadoclientes;
	}
	
	public ListadoClientes getlistadoclientesAux() {
		return this.listadoclientesAux;
	}

	public void setlistadoclientesAux(ListadoClientes listadoclientesAux) {
		this.listadoclientesAux = listadoclientesAux;
	}				
	
	public ListadoClientes getlistadoclientesAnterior() {
		return this.listadoclientesAnterior;
	}

	public void setlistadoclientesAnterior(ListadoClientes listadoclientesAnterior) {
		this.listadoclientesAnterior = listadoclientesAnterior;
	}	
	
	public ListadoClientes getlistadoclientesTotales() {
		return this.listadoclientesTotales;
	}

	public void setlistadoclientesTotales(ListadoClientes listadoclientesTotales) {
		this.listadoclientesTotales = listadoclientesTotales;
	}	
	
	public ListadoClientes getlistadoclientesBean() {
		return this.listadoclientesBean;
	}

	public void setlistadoclientesBean(ListadoClientes listadoclientesBean) {
		this.listadoclientesBean = listadoclientesBean;
	}	
	
	public ListadoClientesParameterReturnGeneral getlistadoclientesReturnGeneral() {
		return this.listadoclientesReturnGeneral;
	}

	public void setlistadoclientesReturnGeneral(ListadoClientesParameterReturnGeneral listadoclientesReturnGeneral) {
		this.listadoclientesReturnGeneral = listadoclientesReturnGeneral;
	}	
	
	
	public Long idBusquedaListadoClientes=0L;

	public Long getidBusquedaListadoClientes() {
		return this.idBusquedaListadoClientes;
	}

	public void setidBusquedaListadoClientes(Long idBusquedaListadoClientes) {
		this.idBusquedaListadoClientes = idBusquedaListadoClientes;
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
	
	
	public ListadoClientesLogic getListadoClientesLogic()	{		
		return listadoclientesLogic;
	}

	public void setListadoClientesLogic(ListadoClientesLogic listadoclientesLogic) {
		this.listadoclientesLogic = listadoclientesLogic;
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
	
	public Boolean getIsEsNuevoListadoClientes() {
		return isEsNuevoListadoClientes;
	}

	public void setIsEsNuevoListadoClientes(Boolean isEsNuevoListadoClientes) {
		this.isEsNuevoListadoClientes = isEsNuevoListadoClientes;
	}

	public Boolean getEsParaAccionDesdeFormularioListadoClientes() {
		return esParaAccionDesdeFormularioListadoClientes;
	}
	
	public void setEsParaAccionDesdeFormularioListadoClientes(Boolean esParaAccionDesdeFormularioListadoClientes) {
		this.esParaAccionDesdeFormularioListadoClientes = esParaAccionDesdeFormularioListadoClientes;
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

			if(this.listadoclientesSessionBean==null) {
				this.listadoclientesSessionBean=new ListadoClientesSessionBean();
			}

			if(!this.listadoclientesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(listadoclientesSessionBean.getlidEmpresaActual());
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

					if(this.listadoclientes!=null) {
						this.listadoclientes.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormListadoClientes!=null) {
						this.jInternalFrameDetalleFormListadoClientes.jComboBoxid_empresaListadoClientes.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaListadoClientes.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormListadoClientes!=null) {
						if(this.jInternalFrameDetalleFormListadoClientes.jComboBoxid_empresaListadoClientes.getItemCount()>0) {
							this.jInternalFrameDetalleFormListadoClientes.jComboBoxid_empresaListadoClientes.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaListadoClientesGenerico)throws Exception
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
				jComboBoxid_empresaListadoClientesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaListadoClientesGenerico!=null && jComboBoxid_empresaListadoClientesGenerico.getItemCount()>0) {
					jComboBoxid_empresaListadoClientesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ListadoClientes listadoclientes,JComboBox jComboBoxid_empresaListadoClientesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaListadoClientesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormListadoClientes.jComboBoxid_empresaListadoClientes.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaListadoClientesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				listadoclientes.setid_empresa(empresaAux.getId());
				listadoclientes.setempresa_descripcion(ListadoClientesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				listadoclientes.setEmpresa(empresaAux);			}
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

					if(!ListadoClientesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormListadoClientes!=null) { 
							this.jInternalFrameDetalleFormListadoClientes.jComboBoxid_empresaListadoClientes.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormListadoClientes.jComboBoxid_empresaListadoClientes.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormListadoClientes!=null) { 
					}

					if(!ListadoClientesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormListadoClientes!=null) {
							this.jInternalFrameDetalleFormListadoClientes.jComboBoxid_empresaListadoClientes.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormListadoClientes!=null) {
							this.jInternalFrameDetalleFormListadoClientes.jComboBoxid_empresaListadoClientes.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesListadoClientes() throws Exception {
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
		
	public ListadoClientesParameterReturnGeneral getListadoClientesParameterGeneral() {
		return this.listadoclientesParameterGeneral;
	}
	
	public void setListadoClientesParameterGeneral(ListadoClientesParameterReturnGeneral listadoclientesParameterGeneral) {
		this.listadoclientesParameterGeneral = listadoclientesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoListadoClientes() {
		return isPermisoTodoListadoClientes;
	}

	public void setIsPermisoTodoListadoClientes(Boolean isPermisoTodoListadoClientes) {
		this.isPermisoTodoListadoClientes = isPermisoTodoListadoClientes;
	}

	public Boolean getIsPermisoNuevoListadoClientes() {
		return isPermisoNuevoListadoClientes;
	}

	public void setIsPermisoNuevoListadoClientes(Boolean isPermisoNuevoListadoClientes) {
		this.isPermisoNuevoListadoClientes = isPermisoNuevoListadoClientes;
	}

	public Boolean getIsPermisoActualizarListadoClientes() {
		return isPermisoActualizarListadoClientes;
	}

	public void setIsPermisoActualizarListadoClientes(Boolean isPermisoActualizarListadoClientes) {
		this.isPermisoActualizarListadoClientes = isPermisoActualizarListadoClientes;
	}

	public Boolean getIsPermisoEliminarListadoClientes() {
		return isPermisoEliminarListadoClientes;
	}

	public void setIsPermisoEliminarListadoClientes(Boolean isPermisoEliminarListadoClientes) {
		this.isPermisoEliminarListadoClientes = isPermisoEliminarListadoClientes;
	}

	public Boolean getIsPermisoGuardarCambiosListadoClientes() {
		return isPermisoGuardarCambiosListadoClientes;
	}

	public void setIsPermisoGuardarCambiosListadoClientes(Boolean isPermisoGuardarCambiosListadoClientes) {
		this.isPermisoGuardarCambiosListadoClientes = isPermisoGuardarCambiosListadoClientes;
	}
	
	public Boolean getIsPermisoConsultaListadoClientes() {
		return isPermisoConsultaListadoClientes;
	}

	public void setIsPermisoConsultaListadoClientes(Boolean isPermisoConsultaListadoClientes) {
		this.isPermisoConsultaListadoClientes = isPermisoConsultaListadoClientes;
	}

	public Boolean getIsPermisoBusquedaListadoClientes() {
		return isPermisoBusquedaListadoClientes;
	}

	public void setIsPermisoBusquedaListadoClientes(Boolean isPermisoBusquedaListadoClientes) {
		this.isPermisoBusquedaListadoClientes = isPermisoBusquedaListadoClientes;
	}

	public Boolean getIsPermisoReporteListadoClientes() {
		return isPermisoReporteListadoClientes;
	}

	public void setIsPermisoReporteListadoClientes(Boolean isPermisoReporteListadoClientes) {
		this.isPermisoReporteListadoClientes = isPermisoReporteListadoClientes;
	}
	
	public Boolean getIsPermisoPaginacionMedioListadoClientes() {
		return isPermisoPaginacionMedioListadoClientes;
	}

	public void setIsPermisoPaginacionMedioListadoClientes(Boolean isPermisoPaginacionMedioListadoClientes) {
		this.isPermisoPaginacionMedioListadoClientes = isPermisoPaginacionMedioListadoClientes;
	}
	
	public Boolean getIsPermisoPaginacionTodoListadoClientes() {
		return isPermisoPaginacionTodoListadoClientes;
	}

	public void setIsPermisoPaginacionTodoListadoClientes(Boolean isPermisoPaginacionTodoListadoClientes) {
		this.isPermisoPaginacionTodoListadoClientes = isPermisoPaginacionTodoListadoClientes;
	}
	
	public Boolean getIsPermisoPaginacionAltoListadoClientes() {
		return isPermisoPaginacionAltoListadoClientes;
	}

	public void setIsPermisoPaginacionAltoListadoClientes(Boolean isPermisoPaginacionAltoListadoClientes) {
		this.isPermisoPaginacionAltoListadoClientes = isPermisoPaginacionAltoListadoClientes;
	}
	
	public Boolean getIsPermisoCopiarListadoClientes() {
		return isPermisoCopiarListadoClientes;
	}

	public void setIsPermisoCopiarListadoClientes(Boolean isPermisoCopiarListadoClientes) {
		this.isPermisoCopiarListadoClientes = isPermisoCopiarListadoClientes;
	}
	
	public Boolean getIsPermisoVerFormListadoClientes() {
		return isPermisoVerFormListadoClientes;
	}

	public void setIsPermisoVerFormListadoClientes(Boolean isPermisoVerFormListadoClientes) {
		this.isPermisoVerFormListadoClientes = isPermisoVerFormListadoClientes;
	}
	
	public Boolean getIsPermisoDuplicarListadoClientes() {
		return isPermisoDuplicarListadoClientes;
	}

	public void setIsPermisoDuplicarListadoClientes(Boolean isPermisoDuplicarListadoClientes) {
		this.isPermisoDuplicarListadoClientes = isPermisoDuplicarListadoClientes;
	}
	
	public Boolean getIsPermisoOrdenListadoClientes() {
		return isPermisoOrdenListadoClientes;
	}

	public void setIsPermisoOrdenListadoClientes(Boolean isPermisoOrdenListadoClientes) {
		this.isPermisoOrdenListadoClientes = isPermisoOrdenListadoClientes;
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
	
	public Boolean getIsVisibilidadCeldaNuevoListadoClientes() {
		return isVisibilidadCeldaNuevoListadoClientes;
	}

	public void setIsVisibilidadCeldaNuevoListadoClientes(Boolean isVisibilidadCeldaNuevoListadoClientes) {
		this.isVisibilidadCeldaNuevoListadoClientes = isVisibilidadCeldaNuevoListadoClientes;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarListadoClientes() {
		return isVisibilidadCeldaDuplicarListadoClientes;
	}

	public void setIsVisibilidadCeldaDuplicarListadoClientes(Boolean isVisibilidadCeldaDuplicarListadoClientes) {
		this.isVisibilidadCeldaDuplicarListadoClientes = isVisibilidadCeldaDuplicarListadoClientes;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarListadoClientes() {
		return isVisibilidadCeldaCopiarListadoClientes;
	}

	public void setIsVisibilidadCeldaCopiarListadoClientes(Boolean isVisibilidadCeldaCopiarListadoClientes) {
		this.isVisibilidadCeldaCopiarListadoClientes = isVisibilidadCeldaCopiarListadoClientes;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormListadoClientes() {
		return isVisibilidadCeldaVerFormListadoClientes;
	}

	public void setIsVisibilidadCeldaVerFormListadoClientes(Boolean isVisibilidadCeldaVerFormListadoClientes) {
		this.isVisibilidadCeldaVerFormListadoClientes = isVisibilidadCeldaVerFormListadoClientes;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenListadoClientes() {
		return isVisibilidadCeldaOrdenListadoClientes;
	}

	public void setIsVisibilidadCeldaOrdenListadoClientes(Boolean isVisibilidadCeldaOrdenListadoClientes) {
		this.isVisibilidadCeldaOrdenListadoClientes = isVisibilidadCeldaOrdenListadoClientes;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesListadoClientes() {
		return isVisibilidadCeldaNuevoRelacionesListadoClientes;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesListadoClientes(Boolean isVisibilidadCeldaNuevoRelacionesListadoClientes) {
		this.isVisibilidadCeldaNuevoRelacionesListadoClientes = isVisibilidadCeldaNuevoRelacionesListadoClientes;
	}
	
	public Boolean getIsVisibilidadCeldaModificarListadoClientes() {
		return isVisibilidadCeldaModificarListadoClientes;
	}

	public void setIsVisibilidadCeldaModificarListadoClientes(Boolean isVisibilidadCeldaModificarListadoClientes) {
		this.isVisibilidadCeldaModificarListadoClientes = isVisibilidadCeldaModificarListadoClientes;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarListadoClientes() {
		return isVisibilidadCeldaActualizarListadoClientes;
	}

	public void setIsVisibilidadCeldaActualizarListadoClientes(Boolean isVisibilidadCeldaActualizarListadoClientes) {
		this.isVisibilidadCeldaActualizarListadoClientes = isVisibilidadCeldaActualizarListadoClientes;
	}

	public Boolean getIsVisibilidadCeldaEliminarListadoClientes() {
		return isVisibilidadCeldaEliminarListadoClientes;
	}

	public void setIsVisibilidadCeldaEliminarListadoClientes(Boolean isVisibilidadCeldaEliminarListadoClientes) {
		this.isVisibilidadCeldaEliminarListadoClientes = isVisibilidadCeldaEliminarListadoClientes;
	}

	public Boolean getIsVisibilidadCeldaCancelarListadoClientes() {
		return isVisibilidadCeldaCancelarListadoClientes;
	}

	public void setIsVisibilidadCeldaCancelarListadoClientes(Boolean isVisibilidadCeldaCancelarListadoClientes) {
		this.isVisibilidadCeldaCancelarListadoClientes = isVisibilidadCeldaCancelarListadoClientes;
	}

	public Boolean getIsVisibilidadCeldaGuardarListadoClientes() {
		return isVisibilidadCeldaGuardarListadoClientes;
	}

	public void setIsVisibilidadCeldaGuardarListadoClientes(Boolean isVisibilidadCeldaGuardarListadoClientes) {
		this.isVisibilidadCeldaGuardarListadoClientes = isVisibilidadCeldaGuardarListadoClientes;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosListadoClientes() {
		return isVisibilidadCeldaGuardarCambiosListadoClientes;
	}

	public void setIsVisibilidadCeldaGuardarCambiosListadoClientes(Boolean isVisibilidadCeldaGuardarCambiosListadoClientes) {
		this.isVisibilidadCeldaGuardarCambiosListadoClientes = isVisibilidadCeldaGuardarCambiosListadoClientes;
	}
		
	public ListadoClientesSessionBean getlistadoclientesSessionBean() {
		return this.listadoclientesSessionBean;
	}
	
	public void setlistadoclientesSessionBean(ListadoClientesSessionBean listadoclientesSessionBean) {
		this.listadoclientesSessionBean=listadoclientesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaListadoClientes() {
		return this.isVisibilidadBusquedaListadoClientes;
	}

	public void setisVisibilidadBusquedaListadoClientes(Boolean isVisibilidadBusquedaListadoClientes) {
		this.isVisibilidadBusquedaListadoClientes=isVisibilidadBusquedaListadoClientes;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysListadoClientes(ListadoClientes listadoclientes)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(listadoclientes,null);
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
	
	public void bugActualizarReferenciaActual(ListadoClientes listadoclientes,ListadoClientes listadoclientesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalListadoClientes(listadoclientes);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		listadoclientesAux.setId(listadoclientes.getId());
		listadoclientesAux.setVersionRow(listadoclientes.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ListadoClientes listadoclientesLocal) throws Exception {
		
		if(this.listadoclientesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ListadoClientes listadoclientesLocal) throws Exception {	
		if(this.listadoclientesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				listadoclientesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarListadoClientesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = listadoclientesValidator.getInvalidValues(this.listadoclientes);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ListadoClientes listadoclientes,List<ListadoClientes> listadoclientess) throws Exception {
	}		
	
	public void actualizarSelectedLista(ListadoClientes listadoclientes,List<ListadoClientes> listadoclientess) throws Exception {
		try	{			
			ListadoClientesConstantesFunciones.actualizarSelectedLista(listadoclientes,listadoclientess);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ListadoClientes> listadoclientessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				listadoclientessLocal=this.listadoclientesLogic.getListadoClientess();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				listadoclientessLocal=this.listadoclientess;
			}
			//ARCHITECTURE
		
			for(ListadoClientes listadoclientesLocal:listadoclientessLocal) {
				if(this.permiteMantenimiento(listadoclientesLocal) && listadoclientesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ListadoClientesConstantesFunciones.getListadoClientesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ListadoClientesConstantesFunciones.NOMBREZONA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabelnombre_zonaListadoClientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoClientesConstantesFunciones.NOMBRECIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabelnombre_ciudadListadoClientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoClientesConstantesFunciones.NOMBREGRUPOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabelnombre_grupo_clienteListadoClientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoClientesConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabelcodigoListadoClientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoClientesConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabelnombreListadoClientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoClientesConstantesFunciones.APELLIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabelapellidoListadoClientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoClientesConstantesFunciones.RUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabelrucListadoClientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoClientesConstantesFunciones.TELEFONOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabeltelefonosListadoClientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoClientesConstantesFunciones.DIRECCIONES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabeldireccionesListadoClientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoClientesConstantesFunciones.EMAILS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabelemailsListadoClientes,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoClientes.jLabelnombre_zonaListadoClientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoClientes.jLabelnombre_ciudadListadoClientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoClientes.jLabelnombre_grupo_clienteListadoClientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoClientes.jLabelcodigoListadoClientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoClientes.jLabelnombreListadoClientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoClientes.jLabelapellidoListadoClientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoClientes.jLabelrucListadoClientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoClientes.jLabeltelefonosListadoClientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoClientes.jLabeldireccionesListadoClientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoClientes.jLabelemailsListadoClientes,"");
		
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
		this.iIdNuevoListadoClientes--;	
		
		
		this.listadoclientesAux=new ListadoClientes();
		
		this.listadoclientesAux.setId(this.iIdNuevoListadoClientes);
		this.listadoclientesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.listadoclientesLogic.getListadoClientess().add(this.listadoclientesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.listadoclientess.add(this.listadoclientesAux);
		}
		//ARCHITECTURE
		
		this.listadoclientes=this.listadoclientesAux;
		
		if(ListadoClientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioListadoClientes(this.listadoclientes);
			this.setVariablesObjetoActualToFormularioForeignKeyListadoClientes(this.listadoclientes);
		}
				
		//this.setDefaultControlesListadoClientes();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyListadoClientes();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyListadoClientes();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyListadoClientes();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualListadoClientes(this.listadoclientesBean,this.listadoclientes,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanListadoClientes(this.listadoclientesReturnGeneral,this.listadoclientesBean,false);
		
		if(this.listadoclientesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyListadoClientes(this.listadoclientesReturnGeneral.getListadoClientes());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioListadoClientes(this.listadoclientesReturnGeneral.getListadoClientes());
		}
		
		if(this.listadoclientesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioListadoClientes(this.listadoclientesReturnGeneral.getListadoClientes(),classes);//this.listadoclientesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualListadoClientes(this.listadoclientes,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyListadoClientes();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyListadoClientes();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ListadoClientesBeanSwingJInternalFrameAdditional.RecargarFormListadoClientes(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingListadoClientes(false);
						
			if(listadoclientesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ListadoClientesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadoClientes();
			}
			
			this.actualizarVisualTableDatosListadoClientes();
			
			this.jTableDatosListadoClientes.setRowSelectionInterval(this.getIndiceNuevoListadoClientes(), this.getIndiceNuevoListadoClientes());
			
			this.seleccionarFilaTablaListadoClientesActual();
						
			this.actualizarEstadoCeldasBotonesListadoClientes("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesListadoClientes(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormListadoClientes.jTextFieldnombre_zonaListadoClientes.setEnabled(isHabilitar && this.listadoclientesConstantesFunciones.activarnombre_zonaListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextAreanombre_ciudadListadoClientes.setEnabled(isHabilitar && this.listadoclientesConstantesFunciones.activarnombre_ciudadListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextAreanombre_grupo_clienteListadoClientes.setEnabled(isHabilitar && this.listadoclientesConstantesFunciones.activarnombre_grupo_clienteListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextFieldcodigoListadoClientes.setEnabled(isHabilitar && this.listadoclientesConstantesFunciones.activarcodigoListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextAreanombreListadoClientes.setEnabled(isHabilitar && this.listadoclientesConstantesFunciones.activarnombreListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextAreaapellidoListadoClientes.setEnabled(isHabilitar && this.listadoclientesConstantesFunciones.activarapellidoListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextFieldrucListadoClientes.setEnabled(isHabilitar && this.listadoclientesConstantesFunciones.activarrucListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextAreatelefonosListadoClientes.setEnabled(isHabilitar && this.listadoclientesConstantesFunciones.activartelefonosListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextAreadireccionesListadoClientes.setEnabled(isHabilitar && this.listadoclientesConstantesFunciones.activardireccionesListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextAreaemailsListadoClientes.setEnabled(isHabilitar && this.listadoclientesConstantesFunciones.activaremailsListadoClientes);	
		//
		this.jInternalFrameDetalleFormListadoClientes.jComboBoxid_empresaListadoClientes.setEnabled(isHabilitar && this.listadoclientesConstantesFunciones.activarid_empresaListadoClientes);
	};
	
	public void setDefaultControlesListadoClientes() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoListadoClientes(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.listadoclientesSessionBean.setConGuardarRelaciones(true);			
			this.listadoclientesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormListadoClientes.jTabbedPaneRelacionesListadoClientes.setVisible(true);
			
					
		} else {
			//this.listadoclientesSessionBean.setConGuardarRelaciones(false);			
			this.listadoclientesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormListadoClientes.jTabbedPaneRelacionesListadoClientes.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoListadoClientes() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadoClientes listadoclientesAux:this.listadoclientesLogic.getListadoClientess()) {
				if(listadoclientesAux.getId().equals(this.iIdNuevoListadoClientes)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadoClientes listadoclientesAux:this.listadoclientess) {
				if(listadoclientesAux.getId().equals(this.iIdNuevoListadoClientes)) {
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
	
	public int getIndiceActualListadoClientes(ListadoClientes listadoclientes,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadoClientes listadoclientesAux:this.listadoclientesLogic.getListadoClientess()) {
				if(listadoclientesAux.getId().equals(listadoclientes.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadoClientes listadoclientesAux:this.listadoclientess) {
				if(listadoclientesAux.getId().equals(listadoclientes.getId())) {
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
	
	public void setCamposBaseDesdeOriginalListadoClientes(ListadoClientes listadoclientesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadoClientes listadoclientesAux:this.listadoclientesLogic.getListadoClientess()) {
				if(listadoclientesAux.getListadoClientesOriginal().getId().equals(listadoclientesOriginal.getId())) {
					existe=true;
					listadoclientesOriginal.setId(listadoclientesAux.getId());
					listadoclientesOriginal.setVersionRow(listadoclientesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadoClientes listadoclientesAux:this.listadoclientess) {
				if(listadoclientesAux.getListadoClientesOriginal().getId().equals(listadoclientesOriginal.getId())) {
					existe=true;
					listadoclientesOriginal.setId(listadoclientesAux.getId());
					listadoclientesOriginal.setVersionRow(listadoclientesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosListadoClientes(Boolean esParaCancelar) throws Exception {
		listadoclientessAux=new ArrayList<ListadoClientes>();
		listadoclientesAux=new ListadoClientes();
		
		if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ListadoClientes listadoclientesAux:this.listadoclientesLogic.getListadoClientess()) {
					if(listadoclientesAux.getId()<0) {
						listadoclientessAux.add(listadoclientesAux);
					}		
				}
				this.iIdNuevoListadoClientes=0L;
				this.listadoclientesLogic.getListadoClientess().removeAll(listadoclientessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadoClientes listadoclientesAux:this.listadoclientess) {
					if(listadoclientesAux.getId()<0) {
						listadoclientessAux.add(listadoclientesAux);
					}		
				}
				this.iIdNuevoListadoClientes=0L;
				this.listadoclientess.removeAll(listadoclientessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoListadoClientes 
					&& this.listadoclientesLogic.getListadoClientess().size()>0
					) {
					listadoclientesAux=this.listadoclientesLogic.getListadoClientess().get(this.listadoclientesLogic.getListadoClientess().size() - 1);
				
					if(listadoclientesAux.getId()<0) {
						this.listadoclientesLogic.getListadoClientess().remove(listadoclientesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoListadoClientes && this.listadoclientess.size()>0) {
					listadoclientesAux=this.listadoclientess.get(this.listadoclientess.size() - 1);
				
					if(listadoclientesAux.getId()<0) {
						this.listadoclientess.remove(listadoclientesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoListadoClientes(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(listadoclientes.getId()<0) {
				this.listadoclientesLogic.getListadoClientess().remove(this.listadoclientes);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(listadoclientes.getId()<0) {
				this.listadoclientess.remove(this.listadoclientes);
			}
		}			
	}
	
	public void setEstadosInicialesListadoClientes(List<ListadoClientes> listadoclientessAux) throws Exception {
		ListadoClientesConstantesFunciones.setEstadosInicialesListadoClientes(listadoclientessAux);
	}
	
	public void setEstadosInicialesListadoClientes(ListadoClientes listadoclientesAux) throws Exception {
		ListadoClientesConstantesFunciones.setEstadosInicialesListadoClientes(listadoclientesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarListadoClientesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesListadoClientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarListadoClientesActual()) {
				if(!this.isEsNuevoListadoClientes) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesListadoClientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoListadoClientes=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarListadoClientesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Listado Clientes ?", "MANTENIMIENTO DE Listado Clientes", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesListadoClientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ListadoClientes listadoclientes) throws Exception {
		ListadoClientesConstantesFunciones.seleccionarAsignar(this.listadoclientes,listadoclientes);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarListadoClientes=this.isPermisoActualizarOriginalListadoClientes;
			
			
			this.seleccionarAsignar(listadoclientes);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesListadoClientes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.listadoclientesSessionBean.setsFuncionBusquedaRapida(this.listadoclientesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoListadoClientes) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosListadoClientes(esParaCancelar);				
				this.cancelarNuevoListadoClientes(esParaCancelar);								
			}
			
			this.listadoclientes=new ListadoClientes();
			
			this.inicializarListadoClientes();
			
			this.actualizarEstadoCeldasBotonesListadoClientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarListadoClientes() throws Exception {
		try {
			ListadoClientesConstantesFunciones.inicializarListadoClientes(this.listadoclientes);
			
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
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.listadoclientesLogic.getListadoClientess().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteListadoClientess(String sAccionBusqueda,List<ListadoClientes> listadoclientessParaReportes) throws Exception {
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
					sPathReporteFinal="ListadoClientes"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ListadoClientesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ListadoClientesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ListadoClientes"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Listado Clienteses");		
		parameters.put("busquedapor", ListadoClientesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceListadoClientes=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ListadoClientesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ListadoClientesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceListadoClientes=new JRBeanArrayDataSource(ListadoClientesJInternalFrame.TraerListadoClientesBeans(listadoclientessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceListadoClientes);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ListadoClientesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ListadoClientesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ListadoClientesBean.TraerListadoClientesBeans(listadoclientessParaReportes).toArray()));
							
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
				this.generarExcelReporteListadoClientess(sAccionBusqueda,sTipoArchivoReporte,listadoclientessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalListadoClientess(sAccionBusqueda,sTipoArchivoReporte,listadoclientessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoListadoClientesActionPerformed(null);
					//this.generarExcelReporteListadoClientess(sAccionBusqueda,sTipoArchivoReporte,listadoclientessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalListadoClientess(sAccionBusqueda,sTipoArchivoReporte,listadoclientessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesListadoClientess(sAccionBusqueda,sTipoArchivoReporte,listadoclientessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesListadoClientess(sAccionBusqueda,sTipoArchivoReporte,listadoclientessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteListadoClientess(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadoClientes> listadoclientessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoclientes";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadoClientess");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderListadoClientes("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ListadoClientes listadoclientes : listadoclientessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ListadoClientesConstantesFunciones.generarExcelReporteDataListadoClientes("NORMAL",row,workbook,listadoclientes,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoclientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Clientes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderListadoClientes(String sTipo,Row row,Workbook workbook) {
		
		ListadoClientesConstantesFunciones.generarExcelReporteHeaderListadoClientes(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalListadoClientess(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadoClientes> listadoclientessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoclientes_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadoClientess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ListadoClientes listadoclientes : listadoclientessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ListadoClientesConstantesFunciones.getListadoClientesDescripcion(listadoclientes));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoClientesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoclientes.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoClientesConstantesFunciones.LABEL_NOMBREZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_NOMBREZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoclientes.getnombre_zona());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoclientes.getnombre_ciudad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoclientes.getnombre_grupo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoClientesConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoclientes.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoClientesConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoclientes.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoClientesConstantesFunciones.LABEL_APELLIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_APELLIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoclientes.getapellido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoClientesConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoclientes.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoClientesConstantesFunciones.LABEL_TELEFONOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_TELEFONOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoclientes.gettelefonos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoClientesConstantesFunciones.LABEL_DIRECCIONES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_DIRECCIONES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoclientes.getdirecciones());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoClientesConstantesFunciones.LABEL_EMAILS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_EMAILS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoclientes.getemails());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoclientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Clientes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesListadoClientess(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadoClientes> listadoclientessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ListadoClientes> listadoclientessRespaldo=null;
		
		classes=ListadoClientesConstantesFunciones.getClassesRelationshipsOfListadoClientes(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.listadoclientesLogic.setDatosCliente(this.datosCliente);
		this.listadoclientesLogic.setDatosDeep(this.datosDeep);
		this.listadoclientesLogic.setIsConDeep(true);
		
		listadoclientessRespaldo=this.listadoclientesLogic.getListadoClientess();
		
		this.listadoclientesLogic.setListadoClientess(listadoclientessParaReportes);	
		this.listadoclientesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		listadoclientessParaReportes=this.listadoclientesLogic.getListadoClientess();
		this.listadoclientesLogic.setListadoClientess(listadoclientessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoclientes_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadoClientess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderListadoClientes("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ListadoClientes listadoclientes : listadoclientessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderListadoClientes("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ListadoClientesConstantesFunciones.generarExcelReporteDataListadoClientes("NORMAL",row,workbook,listadoclientes,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ListadoClientesConstantesFunciones.getListadoClientesDescripcion(listadoclientes));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoclientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Clientes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoListadoClientes.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadoClientes.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoListadoClientes.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadoClientes.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessListadoClientes() throws Exception {		
		this.startProcessListadoClientes(true);
	}
	
	public void startProcessListadoClientes(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasListadoClientes ,this.jPanelParametrosReportesListadoClientes, this.jScrollPanelDatosListadoClientes,this.jPanelPaginacionListadoClientes, this.jScrollPanelDatosEdicionListadoClientes, this.jPanelAccionesListadoClientes,this.jPanelAccionesFormularioListadoClientes,this.jmenuBarListadoClientes,this.jmenuBarDetalleListadoClientes,this.jTtoolBarListadoClientes,this.jTtoolBarDetalleListadoClientes);		
		
		final JTabbedPane jTabbedPaneBusquedasListadoClientes=this.jTabbedPaneBusquedasListadoClientes; 
		
		final JPanel jPanelParametrosReportesListadoClientes=this.jPanelParametrosReportesListadoClientes;
		//final JScrollPane jScrollPanelDatosListadoClientes=this.jScrollPanelDatosListadoClientes;
		final JTable jTableDatosListadoClientes=this.jTableDatosListadoClientes;		
		final JPanel jPanelPaginacionListadoClientes=this.jPanelPaginacionListadoClientes;
		//final JScrollPane jScrollPanelDatosEdicionListadoClientes=this.jScrollPanelDatosEdicionListadoClientes;
		final JPanel jPanelAccionesListadoClientes=this.jPanelAccionesListadoClientes;
		
		JPanel jPanelCamposAuxiliarListadoClientes=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarListadoClientes=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) {
			jPanelCamposAuxiliarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jPanelCamposListadoClientes;
			jPanelAccionesFormularioAuxiliarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jPanelAccionesFormularioListadoClientes;
		}
		
		final JPanel jPanelCamposListadoClientes=jPanelCamposAuxiliarListadoClientes;
		final JPanel jPanelAccionesFormularioListadoClientes=jPanelAccionesFormularioAuxiliarListadoClientes;
		
		
		final JMenuBar jmenuBarListadoClientes=this.jmenuBarListadoClientes;
		final JToolBar jTtoolBarListadoClientes=this.jTtoolBarListadoClientes;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarListadoClientes=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarListadoClientes=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) {
			jmenuBarDetalleAuxiliarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jmenuBarDetalleListadoClientes;
			jTtoolBarDetalleAuxiliarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jTtoolBarDetalleListadoClientes;
		}
		
		final JMenuBar jmenuBarDetalleListadoClientes=jmenuBarDetalleAuxiliarListadoClientes;
		final JToolBar jTtoolBarDetalleListadoClientes=jTtoolBarDetalleAuxiliarListadoClientes;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasListadoClientes;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesListadoClientes;
			processRunnable.jTableDatos=jTableDatosListadoClientes;
			processRunnable.jPanelCampos=jPanelCamposListadoClientes;
			processRunnable.jPanelPaginacion=jPanelPaginacionListadoClientes;
			processRunnable.jPanelAcciones=jPanelAccionesListadoClientes;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioListadoClientes;
			
			
			processRunnable.jmenuBar=jmenuBarListadoClientes;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleListadoClientes;
			processRunnable.jTtoolBar=jTtoolBarListadoClientes;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleListadoClientes;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasListadoClientes ,jPanelParametrosReportesListadoClientes,jTableDatosListadoClientes, /*jScrollPanelDatosListadoClientes,*/jPanelCamposListadoClientes,jPanelPaginacionListadoClientes, /*jScrollPanelDatosEdicionListadoClientes,*/ jPanelAccionesListadoClientes,jPanelAccionesFormularioListadoClientes,jmenuBarListadoClientes,jmenuBarDetalleListadoClientes,jTtoolBarListadoClientes,jTtoolBarDetalleListadoClientes);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasListadoClientes ,jPanelParametrosReportesListadoClientes, jScrollPanelDatosListadoClientes,jPanelPaginacionListadoClientes, jScrollPanelDatosEdicionListadoClientes, jPanelAccionesListadoClientes,jPanelAccionesFormularioListadoClientes,jmenuBarListadoClientes,jmenuBarDetalleListadoClientes,jTtoolBarListadoClientes,jTtoolBarDetalleListadoClientes);
						
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
	
	public void finishProcessListadoClientes() {// throws Exception 
		this.finishProcessListadoClientes(true);
	}
	
	public void finishProcessListadoClientes(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasListadoClientes ,this.jPanelParametrosReportesListadoClientes, this.jScrollPanelDatosListadoClientes,this.jPanelPaginacionListadoClientes, this.jScrollPanelDatosEdicionListadoClientes, this.jPanelAccionesListadoClientes,this.jPanelAccionesFormularioListadoClientes,this.jmenuBarListadoClientes,this.jmenuBarDetalleListadoClientes,this.jTtoolBarListadoClientes,this.jTtoolBarDetalleListadoClientes);		
		
		final JTabbedPane jTabbedPaneBusquedasListadoClientes=this.jTabbedPaneBusquedasListadoClientes; 
		
		final JPanel jPanelParametrosReportesListadoClientes=this.jPanelParametrosReportesListadoClientes;
		//final JScrollPane jScrollPanelDatosListadoClientes=this.jScrollPanelDatosListadoClientes;
		final JTable jTableDatosListadoClientes=this.jTableDatosListadoClientes;		
		final JPanel jPanelPaginacionListadoClientes=this.jPanelPaginacionListadoClientes;
		//final JScrollPane jScrollPanelDatosEdicionListadoClientes=this.jScrollPanelDatosEdicionListadoClientes;
		final JPanel jPanelAccionesListadoClientes=this.jPanelAccionesListadoClientes;
		
		JPanel jPanelCamposAuxiliarListadoClientes=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarListadoClientes=new JPanel();
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) {
			jPanelCamposAuxiliarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jPanelCamposListadoClientes;
			jPanelAccionesFormularioAuxiliarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jPanelAccionesFormularioListadoClientes;
		}
		
		final JPanel jPanelCamposListadoClientes=jPanelCamposAuxiliarListadoClientes;
		final JPanel jPanelAccionesFormularioListadoClientes=jPanelAccionesFormularioAuxiliarListadoClientes;
		
		
		final JMenuBar jmenuBarListadoClientes=this.jmenuBarListadoClientes;		
		final JToolBar jTtoolBarListadoClientes=this.jTtoolBarListadoClientes;
				
		JMenuBar jmenuBarDetalleAuxiliarListadoClientes=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarListadoClientes=new JToolBar();
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) {
			jmenuBarDetalleAuxiliarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jmenuBarDetalleListadoClientes;
			jTtoolBarDetalleAuxiliarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jTtoolBarDetalleListadoClientes;		
		}
		
		final JMenuBar jmenuBarDetalleListadoClientes=jmenuBarDetalleAuxiliarListadoClientes;
		final JToolBar jTtoolBarDetalleListadoClientes=jTtoolBarDetalleAuxiliarListadoClientes;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasListadoClientes;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesListadoClientes;
			processRunnable.jTableDatos=jTableDatosListadoClientes;
			processRunnable.jPanelCampos=jPanelCamposListadoClientes;
			processRunnable.jPanelPaginacion=jPanelPaginacionListadoClientes;
			processRunnable.jPanelAcciones=jPanelAccionesListadoClientes;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioListadoClientes;
			
			
			processRunnable.jmenuBar=jmenuBarListadoClientes;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleListadoClientes;
			processRunnable.jTtoolBar=jTtoolBarListadoClientes;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleListadoClientes;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasListadoClientes ,jPanelParametrosReportesListadoClientes, jTableDatosListadoClientes,/*jScrollPanelDatosListadoClientes,*/jPanelCamposListadoClientes,jPanelPaginacionListadoClientes, /*jScrollPanelDatosEdicionListadoClientes,*/ jPanelAccionesListadoClientes,jPanelAccionesFormularioListadoClientes,jmenuBarListadoClientes,jmenuBarDetalleListadoClientes,jTtoolBarListadoClientes,jTtoolBarDetalleListadoClientes));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesListadoClientes(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarListadoClientes(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuListadoClientes(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarListadoClientes(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarListadoClientes,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleListadoClientes,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuListadoClientes(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarListadoClientes,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleListadoClientes,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.listadoclientesConstantesFunciones.getsFinalQueryListadoClientes();
		String  finalQueryPaginacionTodos=this.listadoclientesConstantesFunciones.getsFinalQueryListadoClientes();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ListadoClientesConstantesFunciones.getArrayColumnasGlobalesNoListadoClientes(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ListadoClientesConstantesFunciones.getArrayColumnasGlobalesListadoClientes(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ListadoClientesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.listadoclientessEliminados= new ArrayList<ListadoClientes>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessListadoClientes();
		
				///*ListadoClientesSessionBean*/this.listadoclientesSessionBean=new ListadoClientesSessionBean();
			
			if(this.listadoclientesSessionBean==null) {
				this.listadoclientesSessionBean=new ListadoClientesSessionBean();
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
					this.iNumeroPaginacion=ListadoClientesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ListadoClientesConstantesFunciones.getClassesForeignKeysOfListadoClientes(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/listadoclientes."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			listadoclientessAux= new ArrayList<ListadoClientes>();
			
				
			listadoclientesLogic.setDatosCliente(this.datosCliente);
			listadoclientesLogic.setDatosDeep(this.datosDeep);
			listadoclientesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaListadoClientes")) {
				this.sDetalleReporte=ListadoClientesConstantesFunciones.getDetalleIndiceBusquedaListadoClientes(idBusquedaListadoClientes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					listadoclientesLogic.getListadoClientessBusquedaListadoClientes(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaListadoClientes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ListadoClientesConstantesFunciones.getDetalleIndiceBusquedaListadoClientes(idBusquedaListadoClientes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ListadoClientesConstantesFunciones.getDetalleIndiceBusquedaListadoClientes(idBusquedaListadoClientes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=listadoclientesLogic.getListadoClientess()==null||listadoclientesLogic.getListadoClientess().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=listadoclientess==null|| listadoclientess.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						listadoclientessAux=new ArrayList<ListadoClientes>();
						listadoclientessAux.addAll(listadoclientesLogic.getListadoClientess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadoclientessAux=new ArrayList<ListadoClientes>();
							listadoclientessAux.addAll(listadoclientess);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							listadoclientesLogic.getListadoClientessBusquedaListadoClientes(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaListadoClientes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ListadoClientesConstantesFunciones.getDetalleIndiceBusquedaListadoClientes(idBusquedaListadoClientes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ListadoClientesConstantesFunciones.getDetalleIndiceBusquedaListadoClientes(idBusquedaListadoClientes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteListadoClientess("BusquedaListadoClientes",listadoclientesLogic.getListadoClientess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteListadoClientess("BusquedaListadoClientes",listadoclientess);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						listadoclientesLogic.setListadoClientess(new ArrayList<ListadoClientes>());
						listadoclientesLogic.getListadoClientess().addAll(listadoclientessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadoclientess=new ArrayList<ListadoClientes>();
							listadoclientess.addAll(listadoclientessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesListadoClientes();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessListadoClientes();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=listadoclientesLogic.getListadoClientess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadoclientess.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=listadoclientesLogic.getListadoClientess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadoclientess.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ListadoClientes listadoclientes) {
		Boolean permite=true;
		
		if(this.listadoclientes.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ListadoClientesConstantesFunciones.getOrderByListaListadoClientes();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ListadoClientesConstantesFunciones.getOrderByListaListadoClientes();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadoClientes listadoclientes:listadoclientesLogic.getListadoClientess()) {
				if(listadoclientes.getsType().equals(Constantes2.S_TOTALES)) {
					listadoclientesTotales=listadoclientes;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadoClientes listadoclientes:this.listadoclientess) {
				if(listadoclientes.getsType().equals(Constantes2.S_TOTALES)) {
					listadoclientesTotales=listadoclientes;
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
			this.listadoclientesAux=new ListadoClientes();
			this.listadoclientesAux.setsType(Constantes2.S_TOTALES);
			this.listadoclientesAux.setIsNew(false);
			this.listadoclientesAux.setIsChanged(false);
			this.listadoclientesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ListadoClientesConstantesFunciones.TotalizarValoresFilaListadoClientes(this.listadoclientesLogic.getListadoClientess(),this.listadoclientesAux);
				
				//this.listadoclientesLogic.getListadoClientess().add(this.listadoclientesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ListadoClientesConstantesFunciones.TotalizarValoresFilaListadoClientes(this.listadoclientess,this.listadoclientesAux);
				
				this.listadoclientess.add(this.listadoclientesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		listadoclientesTotales=new ListadoClientes();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.listadoclientesLogic.getListadoClientess().remove(listadoclientesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.listadoclientess.remove(listadoclientesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		listadoclientesTotales=new ListadoClientes();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadoClientes listadoclientes:listadoclientesLogic.getListadoClientess()) {
				if(listadoclientes.getsType().equals(Constantes2.S_TOTALES)) {
					listadoclientesTotales=listadoclientes;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ListadoClientesConstantesFunciones.TotalizarValoresFilaListadoClientes(this.listadoclientesLogic.getListadoClientess(),listadoclientesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadoClientes listadoclientes:this.listadoclientess) {
				if(listadoclientes.getsType().equals(Constantes2.S_TOTALES)) {
					listadoclientesTotales=listadoclientes;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ListadoClientesConstantesFunciones.TotalizarValoresFilaListadoClientes(this.listadoclientess,listadoclientesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getListadoClientessBusquedaListadoClientes()throws Exception {
		try {
			sAccionBusqueda="BusquedaListadoClientes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getListadoClientessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getListadoClientessBusquedaListadoClientes(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadoclientesLogic.getListadoClientessBusquedaListadoClientes(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getListadoClientessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadoclientesLogic.getListadoClientessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosListadoClientes() {
		this.isPermisoTodoListadoClientes=false;
		this.isPermisoNuevoListadoClientes=false;
		this.isPermisoActualizarListadoClientes=false;
		this.isPermisoActualizarOriginalListadoClientes=false;
		this.isPermisoEliminarListadoClientes=false;
		this.isPermisoGuardarCambiosListadoClientes=false;
		this.isPermisoConsultaListadoClientes=true;
		this.isPermisoBusquedaListadoClientes=true;
		this.isPermisoReporteListadoClientes=true;
		this.isPermisoOrdenListadoClientes=false;		
		this.isPermisoPaginacionMedioListadoClientes=false;		
		this.isPermisoPaginacionAltoListadoClientes=false;		
		this.isPermisoPaginacionTodoListadoClientes=false;		
		this.isPermisoCopiarListadoClientes=false;		
		this.isPermisoVerFormListadoClientes=false;		
		this.isPermisoDuplicarListadoClientes=false;
		this.isPermisoOrdenListadoClientes=false;
	}
	
	public void setPermisosUsuarioListadoClientes(Boolean isPermiso) {
		this.isPermisoTodoListadoClientes=isPermiso;
		this.isPermisoNuevoListadoClientes=isPermiso;
		this.isPermisoActualizarListadoClientes=isPermiso;
		this.isPermisoActualizarOriginalListadoClientes=isPermiso;
		this.isPermisoEliminarListadoClientes=isPermiso;
		this.isPermisoGuardarCambiosListadoClientes=isPermiso;
		this.isPermisoConsultaListadoClientes=isPermiso;
		this.isPermisoBusquedaListadoClientes=isPermiso;
		this.isPermisoReporteListadoClientes=isPermiso;
		this.isPermisoOrdenListadoClientes=isPermiso;		
		this.isPermisoPaginacionMedioListadoClientes=isPermiso;		
		this.isPermisoPaginacionAltoListadoClientes=isPermiso;		
		this.isPermisoPaginacionTodoListadoClientes=isPermiso;		
		this.isPermisoCopiarListadoClientes=isPermiso;		
		this.isPermisoVerFormListadoClientes=isPermiso;		
		this.isPermisoDuplicarListadoClientes=isPermiso;
		this.isPermisoOrdenListadoClientes=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioListadoClientes(Boolean isPermiso) {
		//this.isPermisoTodoListadoClientes=isPermiso;
		this.isPermisoNuevoListadoClientes=isPermiso;
		this.isPermisoActualizarListadoClientes=isPermiso;
		this.isPermisoActualizarOriginalListadoClientes=isPermiso;
		this.isPermisoEliminarListadoClientes=isPermiso;
		this.isPermisoGuardarCambiosListadoClientes=isPermiso;
		//this.isPermisoConsultaListadoClientes=isPermiso;
		//this.isPermisoBusquedaListadoClientes=isPermiso;
		//this.isPermisoReporteListadoClientes=isPermiso;
		//this.isPermisoOrdenListadoClientes=isPermiso;		
		//this.isPermisoPaginacionMedioListadoClientes=isPermiso;		
		//this.isPermisoPaginacionAltoListadoClientes=isPermiso;		
		//this.isPermisoPaginacionTodoListadoClientes=isPermiso;		
		//this.isPermisoCopiarListadoClientes=isPermiso;		
		//this.isPermisoDuplicarListadoClientes=isPermiso;
		//this.isPermisoOrdenListadoClientes=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioListadoClientesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ListadoClientesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebListadoClientes(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioListadoClientesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioListadoClientesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionListadoClientesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioListadoClientesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioListadoClientes() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ListadoClientesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ListadoClientesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoListadoClientes=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarListadoClientes=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalListadoClientes=this.isPermisoActualizarListadoClientes;
			this.isPermisoEliminarListadoClientes=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosListadoClientes=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaListadoClientes=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaListadoClientes=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoListadoClientes=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteListadoClientes=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenListadoClientes=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioListadoClientes=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoListadoClientes=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoListadoClientes=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarListadoClientes=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormListadoClientes=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarListadoClientes=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenListadoClientes=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosListadoClientes.setToolTipText(this.jTableDatosListadoClientes.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioListadoClientes(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioListadoClientes(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ListadoClientesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ListadoClientesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioListadoClientes() throws Exception {
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
	public void inicializarCombosForeignKeyListadoClientesListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyListadoClientesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ListadoClientesJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyListadoClientes()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.listadoclientesSessionBean==null) {
				this.listadoclientesSessionBean=new ListadoClientesSessionBean();
			}

			if(!this.listadoclientesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyListadoClientes()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyListadoClientes(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyListadoClientes()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyListadoClientes();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyListadoClientes(ListadoClientes listadoclientes)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyListadoClientes(ListadoClientes listadoclientes,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyListadoClientes()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyListadoClientes()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyListadoClientes()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyListadoClientes()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroListadoClientes()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyListadoClientes()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyListadoClientes(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyListadoClientes()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormListadoClientes.jComboBoxid_empresaListadoClientes!=null && this.jInternalFrameDetalleFormListadoClientes.jComboBoxid_empresaListadoClientes.getItemCount()>0) {
				this.jInternalFrameDetalleFormListadoClientes.jComboBoxid_empresaListadoClientes.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ListadoClientesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ListadoClientesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ListadoClientesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.listadoclientesSessionBean=new ListadoClientesSessionBean(); 
		this.listadoclientesConstantesFunciones=new ListadoClientesConstantesFunciones(); 
		this.listadoclientesBean=new ListadoClientes();//(this.listadoclientesConstantesFunciones); 		
		this.listadoclientesReturnGeneral=new ListadoClientesParameterReturnGeneral(); 
		
		this.listadoclientesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadoclientesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ListadoClientesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ListadoClientesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ListadoClientesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessListadoClientes(true);
			
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
			
			this.listadoclientesConstantesFunciones=new ListadoClientesConstantesFunciones(); 
			this.listadoclientesBean=new ListadoClientes();//this.listadoclientesConstantesFunciones); 			
			this.listadoclientesReturnGeneral=new ListadoClientesParameterReturnGeneral(); 
		
			ListadoClientesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Listado Clientes Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.listadoclientes=new ListadoClientes();
			this.listadoclientess = new ArrayList<ListadoClientes>();
			this.listadoclientessAux = new ArrayList<ListadoClientes>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic=new ListadoClientesLogic();
				this.listadoclientesLogic.getNewConnexionToDeep("");
			}
			
			//this.listadoclientesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.listadoclientesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormListadoClientes);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoListadoClientes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoListadoClientes);	
					}
					
					if(this.jInternalFrameImportacionListadoClientes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionListadoClientes);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByListadoClientes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByListadoClientes);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormListadoClientes!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormListadoClientes);
				this.jInternalFrameDetalleFormListadoClientes.setVisible(false);
				this.jInternalFrameDetalleFormListadoClientes.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoListadoClientes!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoListadoClientes);
					this.jInternalFrameReporteDinamicoListadoClientes.setVisible(false);
					this.jInternalFrameReporteDinamicoListadoClientes.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionListadoClientes!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionListadoClientes);
					this.jInternalFrameImportacionListadoClientes.setVisible(false);
					this.jInternalFrameImportacionListadoClientes.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByListadoClientes!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByListadoClientes);
					this.jInternalFrameOrderByListadoClientes.setVisible(false);
					this.jInternalFrameOrderByListadoClientes.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idListadoClientesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ListadoClientesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.listadoclientesReturnGeneral=new ListadoClientesParameterReturnGeneral();
			
			this.listadoclientesParameterGeneral=new ListadoClientesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.listadoclientesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ListadoClientesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ListadoClientesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.listadoclientesSessionBean.getEsGuardarRelacionado(),this.listadoclientesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ListadoClientesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.listadoclientesSessionBean.getEsGuardarRelacionado(),this.listadoclientesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoListadoClientes=false;
			this.isVisibilidadCeldaDuplicarListadoClientes=true;
			this.isVisibilidadCeldaCopiarListadoClientes=true;
			this.isVisibilidadCeldaVerFormListadoClientes=true;
			this.isVisibilidadCeldaOrdenListadoClientes=true;
			this.isVisibilidadCeldaNuevoRelacionesListadoClientes=false;
			this.isVisibilidadCeldaModificarListadoClientes=false;
			this.isVisibilidadCeldaActualizarListadoClientes=false;
			this.isVisibilidadCeldaEliminarListadoClientes=false;
			this.isVisibilidadCeldaCancelarListadoClientes=false;
			this.isVisibilidadCeldaGuardarListadoClientes=false;
			this.isVisibilidadCeldaGuardarCambiosListadoClientes=false;
			
			
			this.isVisibilidadBusquedaListadoClientes=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesListadoClientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosListadoClientes();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioListadoClientes(false);
			
			this.setPermisosUsuarioListadoClientes();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadoclientesSessionBean.getEsGuardarRelacionado() 
				|| (this.listadoclientesSessionBean.getEsGuardarRelacionado() && this.listadoclientesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioListadoClientesClasesRelacionadas();
			}
			
			if(this.listadoclientesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioListadoClientesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ListadoClientesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosListadoClientes();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualListadoClientes();
			}
			
			if(!this.isPermisoBusquedaListadoClientes) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasListadoClientes.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ListadoClientesConstantesFunciones.getTiposSeleccionarListadoClientes());
				
				this.tiposColumnasSelect=ListadoClientesConstantesFunciones.getTiposSeleccionarListadoClientes(true);
				
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
			//if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioListadoClientes();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioListadoClientes(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioListadoClientes(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesListadoClientes() ;
			
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
				listadoclientesImplementable= (ListadoClientesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ListadoClientesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				listadoclientesImplementableHome= (ListadoClientesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ListadoClientesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.listadoclientess= new ArrayList<ListadoClientes>();
			this.listadoclientessEliminados= new ArrayList<ListadoClientes>();
						
			this.isEsNuevoListadoClientes=false;
			this.esParaAccionDesdeFormularioListadoClientes=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyListadoClientes(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroListadoClientes();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ListadoClientesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ListadoClientesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesListadoClientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingListadoClientes(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormListadoClientes!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioListadoClientes();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioListadoClientes();
			}
			
			ListadoClientesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasListadoClientes.getTabCount(); i++) {
					this.jTabbedPaneBusquedasListadoClientes.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasListadoClientes.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessListadoClientes(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ListadoClientes: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectListadoClientes() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesListadoClientes")) {
				iIndex=this.jInternalFrameDetalleFormListadoClientes.jTabbedPaneRelacionesListadoClientes.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormListadoClientes.jTabbedPaneRelacionesListadoClientes.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessListadoClientes();	
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
	
	public void cargarCombosForeignKeyListadoClientes(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyListadoClientes(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyListadoClientes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyListadoClientesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyListadoClientes();
		
		this.cargarCombosFrameForeignKeyListadoClientes();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyListadoClientes();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyListadoClientes();
		}
	}
	
	
	
	public void jButtonNuevoListadoClientesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.listadoclientesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormListadoClientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
			
			
			if(jTableDatosListadoClientes.getRowCount()>=1) {
				jTableDatosListadoClientes.removeRowSelectionInterval(0, jTableDatosListadoClientes.getRowCount()-1);						
			}
			
			this.isEsNuevoListadoClientes=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoListadoClientes(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesListadoClientes(true);			
			//this.listadoclientes=new ListadoClientes();
			//this.listadoclientes.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadoClientes(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadoClientes() ;
			
			if(ListadoClientesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadoClientes(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.listadoclientes);	
			this.actualizarInformacion("INFO_PADRE",false,this.listadoclientes);				
			
			ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
			
			if(this.listadoclientesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ListadoClientes: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarListadoClientesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ListadoClientes> listadoclientessSeleccionados=new ArrayList<ListadoClientes>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosListadoClientes.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosListadoClientes.getSelectedRows().length;			
			}
			
			listadoclientessSeleccionados=this.getListadoClientessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoListadoClientes--;			
				//ListadoClientes listadoclientesAux= new ListadoClientes();			
				//listadoclientesAux.setId(this.iIdNuevoListadoClientes);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ListadoClientes listadoclientesOrigen=new ListadoClientes();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ListadoClientes listadoclientesOrigen : listadoclientessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							listadoclientesOrigen =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadoclientesOrigen =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaListadoClientes();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.listadoclientes.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosListadoClientes(listadoclientesOrigen,this.listadoclientes,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.listadoclientesLogic.getListadoClientess().add(this.listadoclientesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.listadoclientess.add(this.listadoclientesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaListadoClientes(false);
				
				this.jTableDatosListadoClientes.setRowSelectionInterval(this.getIndiceNuevoListadoClientes(), this.getIndiceNuevoListadoClientes());
				
				int iLastRow =  this.jTableDatosListadoClientes.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosListadoClientes.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosListadoClientes.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaListadoClientes(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarListadoClientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ListadoClientes> listadoclientessSeleccionados=new ArrayList<ListadoClientes>();									
		
			ListadoClientes listadoclientesOrigen=new ListadoClientes();
			ListadoClientes listadoclientesDestino=new ListadoClientes();
				
			listadoclientessSeleccionados=this.getListadoClientessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosListadoClientes.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || listadoclientessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosListadoClientes.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						listadoclientesOrigen =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						listadoclientesOrigen =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						listadoclientesDestino =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						listadoclientesDestino =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				listadoclientesOrigen =listadoclientessSeleccionados.get(0);
				listadoclientesDestino =listadoclientessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosListadoClientes(listadoclientesOrigen,listadoclientesDestino,true,false);
				
				listadoclientesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(listadoclientesDestino,listadoclientesLogic.getListadoClientess());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(listadoclientesDestino,listadoclientess);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaListadoClientes(false);
				
				//this.jTableDatosListadoClientes.setRowSelectionInterval(this.getIndiceNuevoListadoClientes(), this.getIndiceNuevoListadoClientes());
				
				int iLastRow =  this.jTableDatosListadoClientes.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosListadoClientes.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosListadoClientes.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaListadoClientes(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormListadoClientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormListadoClientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormListadoClientes.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarListadoClientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesListadoClientes.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasListadoClientes.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesListadoClientes.setVisible(!isVisible);
			this.jPanelPaginacionListadoClientes.setVisible(!isVisible);
			this.jPanelAccionesListadoClientes.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarListadoClientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameListadoClientes();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoListadoClientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoListadoClientes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionListadoClientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionListadoClientes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByListadoClientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByListadoClientes();
			
			this.abrirFrameOrderByListadoClientes();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByListadoClientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByListadoClientes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleListadoClientes(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormListadoClientes);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormListadoClientes.isMaximum()) {
					this.jInternalFrameDetalleFormListadoClientes.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormListadoClientes.setSize(this.jInternalFrameDetalleFormListadoClientes.iWidthFormulario,this.jInternalFrameDetalleFormListadoClientes.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormListadoClientes.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormListadoClientes.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormListadoClientes.isMaximum()) {
						this.jInternalFrameDetalleFormListadoClientes.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormListadoClientes.jContentPaneDetalleListadoClientes.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormListadoClientes.jTabbedPaneRelacionesListadoClientes.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormListadoClientes.jContentPaneDetalleListadoClientes.getWidth(),ListadoClientesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormListadoClientes.jTabbedPaneRelacionesListadoClientes.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormListadoClientes.jContentPaneDetalleListadoClientes.getWidth(),ListadoClientesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormListadoClientes.jTabbedPaneRelacionesListadoClientes.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormListadoClientes.jContentPaneDetalleListadoClientes.getWidth(),ListadoClientesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormListadoClientes.setVisible(true);
	        this.jInternalFrameDetalleFormListadoClientes.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByListadoClientes() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByListadoClientes==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByListadoClientes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadoClientes,false,this);
				} else {
					this.jInternalFrameOrderByListadoClientes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadoClientes,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByListadoClientes);
				this.jInternalFrameOrderByListadoClientes.setVisible(false);
				this.jInternalFrameOrderByListadoClientes.setSelected(false);
				
				this.jInternalFrameOrderByListadoClientes.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByListadoClientes"));
				
				this.inicializarActualizarBindingTablaOrderByListadoClientes();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionListadoClientes() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionListadoClientes==null) {
				
				this.jInternalFrameImportacionListadoClientes=new ImportacionJInternalFrame(ListadoClientesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionListadoClientes);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionListadoClientes);
				this.jInternalFrameImportacionListadoClientes.setVisible(false);
				this.jInternalFrameImportacionListadoClientes.setSelected(false);


				this.jInternalFrameImportacionListadoClientes.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionListadoClientes"));
				this.jInternalFrameImportacionListadoClientes.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionListadoClientes"));
				this.jInternalFrameImportacionListadoClientes.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionListadoClientes"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoListadoClientes() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoListadoClientes==null) {
				this.jInternalFrameReporteDinamicoListadoClientes=new ReporteDinamicoJInternalFrame(ListadoClientesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoListadoClientes);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoListadoClientes);
				this.jInternalFrameReporteDinamicoListadoClientes.setVisible(false);
				this.jInternalFrameReporteDinamicoListadoClientes.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoListadoClientes.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadoClientes"));
				this.jInternalFrameReporteDinamicoListadoClientes.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadoClientes"));
				this.jInternalFrameReporteDinamicoListadoClientes.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadoClientes"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadoClientes();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleListadoClientes() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormListadoClientes);
			
	       	this.jInternalFrameDetalleFormListadoClientes.setVisible(false);
	        this.jInternalFrameDetalleFormListadoClientes.setSelected(false);
			
			//this.jInternalFrameDetalleFormListadoClientes.dispose();
			//this.jInternalFrameDetalleFormListadoClientes=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoListadoClientes() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoListadoClientes.setVisible(true);
	        this.jInternalFrameReporteDinamicoListadoClientes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionListadoClientes() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionListadoClientes.setVisible(true);
	        this.jInternalFrameImportacionListadoClientes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByListadoClientes() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByListadoClientes.setVisible(true);
	        this.jInternalFrameOrderByListadoClientes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByListadoClientes() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByListadoClientes.setVisible(false);
	        this.jInternalFrameOrderByListadoClientes.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoListadoClientes() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoListadoClientes.setVisible(false);
	        this.jInternalFrameReporteDinamicoListadoClientes.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionListadoClientes() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionListadoClientes.setVisible(false);
	        this.jInternalFrameImportacionListadoClientes.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarListadoClientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarListadoClientes(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarListadoClientes(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesListadoClientes(true);
			//this.isEsNuevoListadoClientes=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesListadoClientes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadoClientes(false) ;
			
			if(listadoclientesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ListadoClientesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadoClientes(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadoClientes(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaListadoClientesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarListadoClientes(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormListadoClientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesListadoClientes(true);
			//this.isEsNuevoListadoClientes=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.listadoclientes.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesListadoClientes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesListadoClientes(false) ;
			
			if(ListadoClientesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadoClientes(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadoClientes(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarListadoClientesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesListadoClientes(false);
			
			//if(!this.isEsNuevoListadoClientes) {								
				int intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ListadoClientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualListadoClientes(this.listadoclientes,true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
				
			}
			
			if(this.permiteMantenimiento(this.listadoclientes)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoListadoClientes=true;
					this.inicializarActualizarBindingTablaListadoClientes(false);
					this.isEsNuevoListadoClientes=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoListadoClientes=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoListadoClientes=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesListadoClientes(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadoClientes(false);
				
				this.habilitarDeshabilitarControlesListadoClientes(false);
			
												
				
				if(ListadoClientesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleListadoClientes();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoListadoClientesActionPerformed(evt,listadoclientesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualListadoClientes(this.listadoclientes,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosListadoClientes.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,listadoclientesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.listadoclientes.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ListadoClientes.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoClientes.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarListadoClientesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				this.listadoclientes.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				this.listadoclientes.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.listadoclientes)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ListadoClientesModel) this.jTableDatosListadoClientes.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoListadoClientes=true;
				this.inicializarActualizarBindingTablaListadoClientes(false);
				this.isEsNuevoListadoClientes=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesListadoClientes(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadoClientes(false);
				
				this.habilitarDeshabilitarControlesListadoClientes(false);
				
				
				
				if(ListadoClientesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleListadoClientes();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarListadoClientesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosListadoClientes.getRowCount()>=1) {
				jTableDatosListadoClientes.removeRowSelectionInterval(0, jTableDatosListadoClientes.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesListadoClientes(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaListadoClientes(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadoClientes(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadoClientes(false) ;
			
			this.isEsNuevoListadoClientes=false;
			
			if(ListadoClientesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleListadoClientes();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosListadoClientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingListadoClientes(false);
				
				//SI ES MANUAL
				if(ListadoClientesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualListadoClientes();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosListadoClientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoListadoClientes--;			
			//ListadoClientes listadoclientesAux= new ListadoClientes();			
			//listadoclientesAux.setId(this.iIdNuevoListadoClientes);
			
			if(this.jInternalFrameDetalleFormListadoClientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaListadoClientes();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
			
			this.listadoclientes.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.listadoclientesLogic.getListadoClientess().add(this.listadoclientesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.listadoclientess.add(this.listadoclientesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaListadoClientes(false);
			
			this.jTableDatosListadoClientes.setRowSelectionInterval(this.getIndiceNuevoListadoClientes(), this.getIndiceNuevoListadoClientes());
			
			int iLastRow =  this.jTableDatosListadoClientes.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosListadoClientes.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosListadoClientes.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaListadoClientes(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionListadoClientesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingListadoClientes(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadoClientes(false);
			
			//SI ES MANUAL
			if(ListadoClientesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadoClientes();
			}
			
			//this.abrirFrameTreeListadoClientes();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionListadoClientesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionListadoClientesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionListadoClientes.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionListadoClientes.setFileImportacion(this.jInternalFrameImportacionListadoClientes.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionListadoClientes.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionListadoClientes.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionListadoClientes.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionListadoClientes.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoListadoClientesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ListadoClientes> listadoclientessSeleccionados=new ArrayList<ListadoClientes>();		

		listadoclientessSeleccionados=this.getListadoClientessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadoClientes.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadoClientes.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ListadoClientesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ListadoClientesBaseDesign.jrxml";
			
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
			
			this.generarReporteListadoClientess("Todos",listadoclientessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoclientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Clientes",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoListadoClientes.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadoClientes.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ListadoClientesConstantesFunciones.LABEL_NOMBREZONA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreZona_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreZona_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreZona_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreZona_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCiudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCiudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCiudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCiudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreGrupoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreGrupoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreGrupoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreGrupoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoClientesConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoClientesConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoClientesConstantesFunciones.LABEL_APELLIDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoClientesConstantesFunciones.LABEL_RUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_c_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_c_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_c_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_c_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoClientesConstantesFunciones.LABEL_TELEFONOS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoClientesConstantesFunciones.LABEL_DIRECCIONES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_recciones_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_recciones_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_recciones_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_recciones_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoClientesConstantesFunciones.LABEL_EMAILS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ails_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ails_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ails_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ails_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoListadoClientes.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoListadoClientes.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoListadoClientes.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ListadoClientesConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoria="nombre_zona";
					break;

				case ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoria="nombre_ciudad";
					break;

				case ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					sNombreCampoCategoria="nombre_grupo_cliente";
					break;

				case ListadoClientesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ListadoClientesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ListadoClientesConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoria="apellido";
					break;

				case ListadoClientesConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoria="ruc";
					break;

				case ListadoClientesConstantesFunciones.LABEL_TELEFONOS:
					sNombreCampoCategoria="telefonos";
					break;

				case ListadoClientesConstantesFunciones.LABEL_DIRECCIONES:
					sNombreCampoCategoria="direcciones";
					break;

				case ListadoClientesConstantesFunciones.LABEL_EMAILS:
					sNombreCampoCategoria="emails";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoListadoClientes.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ListadoClientesConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoriaValor="nombre_zona";
					break;

				case ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoriaValor="nombre_ciudad";
					break;

				case ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					sNombreCampoCategoriaValor="nombre_grupo_cliente";
					break;

				case ListadoClientesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ListadoClientesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ListadoClientesConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoriaValor="apellido";
					break;

				case ListadoClientesConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoriaValor="ruc";
					break;

				case ListadoClientesConstantesFunciones.LABEL_TELEFONOS:
					sNombreCampoCategoriaValor="telefonos";
					break;

				case ListadoClientesConstantesFunciones.LABEL_DIRECCIONES:
					sNombreCampoCategoriaValor="direcciones";
					break;

				case ListadoClientesConstantesFunciones.LABEL_EMAILS:
					sNombreCampoCategoriaValor="emails";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoListadoClientes.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadoClientes.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ListadoClientesConstantesFunciones.LABEL_NOMBREZONA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Zona",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_zona");
					break;

				case ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_ciudad");
					break;

				case ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Grupo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_grupo_cliente");
					break;

				case ListadoClientesConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ListadoClientesConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ListadoClientesConstantesFunciones.LABEL_APELLIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apello",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellido");
					break;

				case ListadoClientesConstantesFunciones.LABEL_RUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc");
					break;

				case ListadoClientesConstantesFunciones.LABEL_TELEFONOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefonos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefonos");
					break;

				case ListadoClientesConstantesFunciones.LABEL_DIRECCIONES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direcciones",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direcciones");
					break;

				case ListadoClientesConstantesFunciones.LABEL_EMAILS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Emails",sNombreCampoCategoria,sNombreCampoCategoriaValor,"emails");
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
	
	public void jButtonGenerarExcelReporteDinamicoListadoClientesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ListadoClientes> listadoclientessSeleccionados=new ArrayList<ListadoClientes>();		
		
		listadoclientessSeleccionados=this.getListadoClientessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoclientes";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ListadoClientess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoListadoClientes.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoListadoClientes.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ListadoClientesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ListadoClientes listadoclientes:listadoclientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoclientes.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoClientesConstantesFunciones.LABEL_NOMBREZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_NOMBREZONA);
					iRow++;

					for(ListadoClientes listadoclientes:listadoclientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoclientes.getnombre_zona());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD);
					iRow++;

					for(ListadoClientes listadoclientes:listadoclientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoclientes.getnombre_ciudad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
					iRow++;

					for(ListadoClientes listadoclientes:listadoclientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoclientes.getnombre_grupo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoClientesConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ListadoClientes listadoclientes:listadoclientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoclientes.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoClientesConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ListadoClientes listadoclientes:listadoclientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoclientes.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoClientesConstantesFunciones.LABEL_APELLIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_APELLIDO);
					iRow++;

					for(ListadoClientes listadoclientes:listadoclientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoclientes.getapellido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoClientesConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_RUC);
					iRow++;

					for(ListadoClientes listadoclientes:listadoclientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoclientes.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoClientesConstantesFunciones.LABEL_TELEFONOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_TELEFONOS);
					iRow++;

					for(ListadoClientes listadoclientes:listadoclientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoclientes.gettelefonos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoClientesConstantesFunciones.LABEL_DIRECCIONES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_DIRECCIONES);
					iRow++;

					for(ListadoClientes listadoclientes:listadoclientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoclientes.getdirecciones());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoClientesConstantesFunciones.LABEL_EMAILS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_EMAILS);
					iRow++;

					for(ListadoClientes listadoclientes:listadoclientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoclientes.getemails());
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
			//	this.getFilaCabeceraExportarExcelListadoClientes(row);				
			//	iRow++;
			//}				
			
			//for(ListadoClientes listadoclientesAux:listadoclientessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelListadoClientes(listadoclientesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoclientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Clientes",JOptionPane.INFORMATION_MESSAGE);
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
				this.listadoclientesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadoClientes(false);
			
			//SI ES MANUAL
			if(ListadoClientesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadoClientes();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresListadoClientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadoClientes(false);
			
			//SI ES MANUAL
			if(ListadoClientesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualListadoClientes();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesListadoClientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadoClientes(false);
			
			//SI ES MANUAL
			if(ListadoClientesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualListadoClientes();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaListadoClientes() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosListadoClientes.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosListadoClientes.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosListadoClientes.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosListadoClientes.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosListadoClientes.setMinimumSize(dimensionMinimum);
		this.jTableDatosListadoClientes.setMaximumSize(dimensionMaximum);
		this.jTableDatosListadoClientes.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingListadoClientes(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingListadoClientes(esInicializar,true);
	}
	
	public void inicializarActualizarBindingListadoClientes(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaListadoClientes(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesListadoClientes(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasListadoClientes(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesListadoClientes(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesListadoClientes(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ListadoClientesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ListadoClientesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualListadoClientes() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaListadoClientes();
		
		this.inicializarActualizarBindingBotonesManualListadoClientes(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualListadoClientes();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesListadoClientes() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualListadoClientes(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualListadoClientes(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosListadoClientes.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosListadoClientes.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteListadoClientes.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormListadoClientes!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormListadoClientes.jCheckBoxPostAccionNuevoListadoClientes.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormListadoClientes.jCheckBoxPostAccionSinCerrarListadoClientes.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormListadoClientes.jCheckBoxPostAccionSinMensajeListadoClientes.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosListadoClientes.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosListadoClientes.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteListadoClientes.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormListadoClientes!=null) {
				this.jInternalFrameDetalleFormListadoClientes.jCheckBoxPostAccionNuevoListadoClientes.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormListadoClientes.jCheckBoxPostAccionSinCerrarListadoClientes.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormListadoClientes.jCheckBoxPostAccionSinMensajeListadoClientes.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionListadoClientes.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionListadoClientes.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormListadoClientes!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormListadoClientes.jComboBoxTiposAccionesFormularioListadoClientes.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesListadoClientes.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoListadoClientes!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadoClientes.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesListadoClientes.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesListadoClientes.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarListadoClientes.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesListadoClientes.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoListadoClientes!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadoClientes.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesListadoClientes.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralListadoClientes.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesListadoClientes(Boolean esInicializar) throws Exception {
		try	{	
			if(ListadoClientesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualListadoClientes(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesListadoClientes() throws Exception {
		try	{
			if(ListadoClientesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualListadoClientes();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleListadoClientes() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormListadoClientes.jComboBoxTiposAccionesFormularioListadoClientes.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormListadoClientes.jComboBoxTiposAccionesFormularioListadoClientes.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualListadoClientes() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesListadoClientes.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesListadoClientes.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesListadoClientes.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesListadoClientes.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesListadoClientes.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesListadoClientes.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionListadoClientes.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionListadoClientes.addItem(reporte);
			}
			
			
			if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionListadoClientes.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionListadoClientes.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesListadoClientes.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesListadoClientes.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesListadoClientes.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesListadoClientes.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormListadoClientes.jComboBoxTiposAccionesFormularioListadoClientes.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormListadoClientes.jComboBoxTiposAccionesFormularioListadoClientes.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarListadoClientes.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarListadoClientes.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarListadoClientes.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadoClientes();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadoClientes() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoListadoClientes!=null) {
				this.jInternalFrameReporteDinamicoListadoClientes.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoListadoClientes.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoListadoClientes!=null) {
				this.jInternalFrameReporteDinamicoListadoClientes.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoListadoClientes.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoListadoClientes!=null) {
				
				if(this.jInternalFrameReporteDinamicoListadoClientes.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoListadoClientes.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadoClientes.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoListadoClientes.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoListadoClientes.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadoClientes.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualListadoClientes()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaListadoClientes=Long.parseLong(this.jLabelidListadoClientesBusquedaListadoClientes.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasListadoClientes(Boolean esInicializar) throws Exception {				
		if(ListadoClientesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualListadoClientes();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaListadoClientes() throws Exception {
		this.inicializarActualizarBindingTablaListadoClientes(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByListadoClientes() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByListadoClientes.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByListadoClientes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadoClientes.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ListadoClientesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByListadoClientes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadoClientes.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ListadoClientesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosListadoClientesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoClientesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ListadoClientesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByListadoClientes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadoClientes.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ListadoClientesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByListadoClientes.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaListadoClientes(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=listadoclientesLogic.getListadoClientess().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=listadoclientess.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ListadoClientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosListadoClientes.setModel(new ListadoClientesModel(this.listadoclientesLogic.getListadoClientess(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosListadoClientes.setModel(new ListadoClientesModel(this.listadoclientess,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByListadoClientes!=null && this.jInternalFrameOrderByListadoClientes.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByListadoClientes();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosListadoClientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoClientes,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ListadoClientesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO,listadoclientesConstantesFunciones.resaltarSeleccionarListadoClientes,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO,listadoclientesConstantesFunciones.resaltarSeleccionarListadoClientes,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosListadoClientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoClientes,ListadoClientesConstantesFunciones.LABEL_ID));

		if(this.listadoclientesConstantesFunciones.mostraridListadoClientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoClientesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.listadoclientesConstantesFunciones.resaltaridListadoClientes,this.listadoclientesConstantesFunciones.activaridListadoClientes,this,true,"idListadoClientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoclientesConstantesFunciones.resaltaridListadoClientes,this.listadoclientesConstantesFunciones.activaridListadoClientes,this,true,"idListadoClientes","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoClientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoClientes,ListadoClientesConstantesFunciones.LABEL_NOMBREZONA));

		if(this.listadoclientesConstantesFunciones.mostrarnombre_zonaListadoClientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoClientesConstantesFunciones.LABEL_NOMBREZONA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoclientesConstantesFunciones.resaltarnombre_zonaListadoClientes,this.listadoclientesConstantesFunciones.activarnombre_zonaListadoClientes,this,true,"nombre_zonaListadoClientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoclientesConstantesFunciones.resaltarnombre_zonaListadoClientes,this.listadoclientesConstantesFunciones.activarnombre_zonaListadoClientes,this,true,"nombre_zonaListadoClientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoClientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoClientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoClientes,ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD));

		if(this.listadoclientesConstantesFunciones.mostrarnombre_ciudadListadoClientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoclientesConstantesFunciones.resaltarnombre_ciudadListadoClientes,this.listadoclientesConstantesFunciones.activarnombre_ciudadListadoClientes,this,true,"nombre_ciudadListadoClientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoclientesConstantesFunciones.resaltarnombre_ciudadListadoClientes,this.listadoclientesConstantesFunciones.activarnombre_ciudadListadoClientes,this,true,"nombre_ciudadListadoClientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoClientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoClientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoClientes,ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE));

		if(this.listadoclientesConstantesFunciones.mostrarnombre_grupo_clienteListadoClientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoclientesConstantesFunciones.resaltarnombre_grupo_clienteListadoClientes,this.listadoclientesConstantesFunciones.activarnombre_grupo_clienteListadoClientes,this,true,"nombre_grupo_clienteListadoClientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoclientesConstantesFunciones.resaltarnombre_grupo_clienteListadoClientes,this.listadoclientesConstantesFunciones.activarnombre_grupo_clienteListadoClientes,this,true,"nombre_grupo_clienteListadoClientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoClientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoClientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoClientes,ListadoClientesConstantesFunciones.LABEL_CODIGO));

		if(this.listadoclientesConstantesFunciones.mostrarcodigoListadoClientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoClientesConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoclientesConstantesFunciones.resaltarcodigoListadoClientes,this.listadoclientesConstantesFunciones.activarcodigoListadoClientes,this,true,"codigoListadoClientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoclientesConstantesFunciones.resaltarcodigoListadoClientes,this.listadoclientesConstantesFunciones.activarcodigoListadoClientes,this,true,"codigoListadoClientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoClientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoClientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoClientes,ListadoClientesConstantesFunciones.LABEL_NOMBRE));

		if(this.listadoclientesConstantesFunciones.mostrarnombreListadoClientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoClientesConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoclientesConstantesFunciones.resaltarnombreListadoClientes,this.listadoclientesConstantesFunciones.activarnombreListadoClientes,this,true,"nombreListadoClientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoclientesConstantesFunciones.resaltarnombreListadoClientes,this.listadoclientesConstantesFunciones.activarnombreListadoClientes,this,true,"nombreListadoClientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoClientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoClientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoClientes,ListadoClientesConstantesFunciones.LABEL_APELLIDO));

		if(this.listadoclientesConstantesFunciones.mostrarapellidoListadoClientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoClientesConstantesFunciones.LABEL_APELLIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoclientesConstantesFunciones.resaltarapellidoListadoClientes,this.listadoclientesConstantesFunciones.activarapellidoListadoClientes,this,true,"apellidoListadoClientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoclientesConstantesFunciones.resaltarapellidoListadoClientes,this.listadoclientesConstantesFunciones.activarapellidoListadoClientes,this,true,"apellidoListadoClientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoClientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoClientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoClientes,ListadoClientesConstantesFunciones.LABEL_RUC));

		if(this.listadoclientesConstantesFunciones.mostrarrucListadoClientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoClientesConstantesFunciones.LABEL_RUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoclientesConstantesFunciones.resaltarrucListadoClientes,this.listadoclientesConstantesFunciones.activarrucListadoClientes,this,true,"rucListadoClientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoclientesConstantesFunciones.resaltarrucListadoClientes,this.listadoclientesConstantesFunciones.activarrucListadoClientes,this,true,"rucListadoClientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoClientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoClientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoClientes,ListadoClientesConstantesFunciones.LABEL_TELEFONOS));

		if(this.listadoclientesConstantesFunciones.mostrartelefonosListadoClientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoClientesConstantesFunciones.LABEL_TELEFONOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoclientesConstantesFunciones.resaltartelefonosListadoClientes,this.listadoclientesConstantesFunciones.activartelefonosListadoClientes,this,true,"telefonosListadoClientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoclientesConstantesFunciones.resaltartelefonosListadoClientes,this.listadoclientesConstantesFunciones.activartelefonosListadoClientes,this,true,"telefonosListadoClientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoClientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoClientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoClientes,ListadoClientesConstantesFunciones.LABEL_DIRECCIONES));

		if(this.listadoclientesConstantesFunciones.mostrardireccionesListadoClientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoClientesConstantesFunciones.LABEL_DIRECCIONES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoclientesConstantesFunciones.resaltardireccionesListadoClientes,this.listadoclientesConstantesFunciones.activardireccionesListadoClientes,this,true,"direccionesListadoClientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoclientesConstantesFunciones.resaltardireccionesListadoClientes,this.listadoclientesConstantesFunciones.activardireccionesListadoClientes,this,true,"direccionesListadoClientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoClientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoClientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoClientes,ListadoClientesConstantesFunciones.LABEL_EMAILS));

		if(this.listadoclientesConstantesFunciones.mostraremailsListadoClientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoClientesConstantesFunciones.LABEL_EMAILS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoclientesConstantesFunciones.resaltaremailsListadoClientes,this.listadoclientesConstantesFunciones.activaremailsListadoClientes,this,true,"emailsListadoClientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoclientesConstantesFunciones.resaltaremailsListadoClientes,this.listadoclientesConstantesFunciones.activaremailsListadoClientes,this,true,"emailsListadoClientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoClientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.listadoclientesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.listadoclientesSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosListadoClientes.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.listadoclientesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.listadoclientesSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosListadoClientes.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarListadoClientes && this.isPermisoGuardarCambiosListadoClientes) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.listadoclientesSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.listadoclientesSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosListadoClientes.addColumn(tableColumn);
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
			
			this.jTableDatosListadoClientes.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarListadoClientes && this.isPermisoGuardarCambiosListadoClientes) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarListadoClientes && this.isPermisoGuardarCambiosListadoClientes) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosListadoClientes.moveColumn(this.jTableDatosListadoClientes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosListadoClientes.moveColumn(this.jTableDatosListadoClientes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosListadoClientes.moveColumn(this.jTableDatosListadoClientes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosListadoClientes.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosListadoClientes.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosListadoClientes,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ListadoClientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosListadoClientes.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosListadoClientes.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ListadoClientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ListadoClientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosListadoClientes.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosListadoClientes.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosListadoClientes.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=listadoclientesLogic.getListadoClientess().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=listadoclientess.size()-1;
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
		//this.jTableDatosListadoClientes.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosListadoClientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosListadoClientes();
			
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
				
				//this.isEsNuevoListadoClientes=false;
					
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
			
				if(this.listadoclientesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormListadoClientes==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosListadoClientes.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosListadoClientes.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.listadoclientes.getsType().equals("DUPLICADO")
				   || this.listadoclientes.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoListadoClientes=true;
				
				} else {
					this.isEsNuevoListadoClientes=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
					if(this.listadoclientes.getId()>=0 && !this.listadoclientes.getIsNew()) {						
						this.isEsNuevoListadoClientes=false;
						
					} else {
						this.isEsNuevoListadoClientes=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoListadoClientes(esRelaciones);						
				
				this.seleccionarListadoClientes(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.listadoclientes.getId()<0) {
					this.isEsNuevoListadoClientes=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarListadoClientes(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarListadoClientes(evt,rowIndex);
				}	
				
				if(this.listadoclientesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ListadoClientes: " + this.dDif); 
					}
				}								
				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarListadoClientes(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.listadoclientes)) {
					if(this.listadoclientes.getId()>0) {
						this.listadoclientes.setIsDeleted(true);
						
						this.listadoclientessEliminados.add(this.listadoclientes);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.listadoclientesLogic.getListadoClientess().remove(this.listadoclientes);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.listadoclientess.remove(this.listadoclientes);				
					}
					
					
					((ListadoClientesModel) this.jTableDatosListadoClientes.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaListadoClientes(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarListadoClientes(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoListadoClientes) {
			
			if(this.jInternalFrameDetalleFormListadoClientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosListadoClientes.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosListadoClientes.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ListadoClientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioListadoClientes(this.listadoclientes);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesListadoClientes("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesListadoClientes(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadoClientes() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoListadoClientes(ListadoClientes listadoclientes) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoListadoClientes(listadoclientes,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoListadoClientes(ListadoClientes listadoclientes,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioListadoClientes(listadoclientes);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyListadoClientes(listadoclientes,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyListadoClientes(listadoclientes);
	}
	
	public void setVariablesObjetoActualToFormularioListadoClientes(ListadoClientes listadoclientes) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormListadoClientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormListadoClientes.jLabelidListadoClientes.setText(listadoclientes.getId().toString());
			this.jInternalFrameDetalleFormListadoClientes.jTextFieldnombre_zonaListadoClientes.setText(listadoclientes.getnombre_zona());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreanombre_ciudadListadoClientes.setText(listadoclientes.getnombre_ciudad());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreanombre_grupo_clienteListadoClientes.setText(listadoclientes.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormListadoClientes.jTextFieldcodigoListadoClientes.setText(listadoclientes.getcodigo());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreanombreListadoClientes.setText(listadoclientes.getnombre());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreaapellidoListadoClientes.setText(listadoclientes.getapellido());
			this.jInternalFrameDetalleFormListadoClientes.jTextFieldrucListadoClientes.setText(listadoclientes.getruc());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreatelefonosListadoClientes.setText(listadoclientes.gettelefonos());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreadireccionesListadoClientes.setText(listadoclientes.getdirecciones());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreaemailsListadoClientes.setText(listadoclientes.getemails());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ListadoClientes listadoclientesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,listadoclientesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ListadoClientes listadoclientesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				listadoclientesLocal=this.listadoclientes;
			} else {
				listadoclientesLocal=this.listadoclientesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(listadoclientesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoListadoClientes(listadoclientesLocal,true);
					
					if(listadoclientesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(listadoclientesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(listadoclientesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoListadoClientes(ListadoClientes listadoclientes,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualListadoClientes(listadoclientes,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(listadoclientes);
	}
	
	public void setVariablesFormularioToObjetoActualListadoClientes(ListadoClientes listadoclientes,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualListadoClientes(listadoclientes,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualListadoClientes(ListadoClientes listadoclientes,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormListadoClientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormListadoClientes.jLabelidListadoClientes.getText()==null || this.jInternalFrameDetalleFormListadoClientes.jLabelidListadoClientes.getText()=="" || this.jInternalFrameDetalleFormListadoClientes.jLabelidListadoClientes.getText()=="Id") {
				this.jInternalFrameDetalleFormListadoClientes.jLabelidListadoClientes.setText("0");
			}

			if(conColumnasBase) {listadoclientes.setId(Long.parseLong(this.jInternalFrameDetalleFormListadoClientes.jLabelidListadoClientes.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoClientesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabelIdListadoClientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoclientes.setnombre_zona(this.jInternalFrameDetalleFormListadoClientes.jTextFieldnombre_zonaListadoClientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoClientesConstantesFunciones.LABEL_NOMBREZONA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabelnombre_zonaListadoClientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoclientes.setnombre_ciudad(this.jInternalFrameDetalleFormListadoClientes.jTextAreanombre_ciudadListadoClientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabelnombre_ciudadListadoClientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoclientes.setnombre_grupo_cliente(this.jInternalFrameDetalleFormListadoClientes.jTextAreanombre_grupo_clienteListadoClientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabelnombre_grupo_clienteListadoClientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoclientes.setcodigo(this.jInternalFrameDetalleFormListadoClientes.jTextFieldcodigoListadoClientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoClientesConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabelcodigoListadoClientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoclientes.setnombre(this.jInternalFrameDetalleFormListadoClientes.jTextAreanombreListadoClientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoClientesConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabelnombreListadoClientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoclientes.setapellido(this.jInternalFrameDetalleFormListadoClientes.jTextAreaapellidoListadoClientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoClientesConstantesFunciones.LABEL_APELLIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabelapellidoListadoClientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoclientes.setruc(this.jInternalFrameDetalleFormListadoClientes.jTextFieldrucListadoClientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoClientesConstantesFunciones.LABEL_RUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabelrucListadoClientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoclientes.settelefonos(this.jInternalFrameDetalleFormListadoClientes.jTextAreatelefonosListadoClientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoClientesConstantesFunciones.LABEL_TELEFONOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabeltelefonosListadoClientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoclientes.setdirecciones(this.jInternalFrameDetalleFormListadoClientes.jTextAreadireccionesListadoClientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoClientesConstantesFunciones.LABEL_DIRECCIONES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabeldireccionesListadoClientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoclientes.setemails(this.jInternalFrameDetalleFormListadoClientes.jTextAreaemailsListadoClientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoClientesConstantesFunciones.LABEL_EMAILS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoClientes.jLabelemailsListadoClientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualListadoClientes(ListadoClientes listadoclientesBean,ListadoClientes listadoclientes,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosListadoClientes(ListadoClientes listadoclientesOrigen,ListadoClientes listadoclientes,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && listadoclientesOrigen.getId()!=null && !listadoclientesOrigen.getId().equals(0L))) {listadoclientes.setId(listadoclientesOrigen.getId());}}
			if(conDefault || (!conDefault && listadoclientesOrigen.getnombre_zona()!=null && !listadoclientesOrigen.getnombre_zona().equals(""))) {listadoclientes.setnombre_zona(listadoclientesOrigen.getnombre_zona());}
			if(conDefault || (!conDefault && listadoclientesOrigen.getnombre_ciudad()!=null && !listadoclientesOrigen.getnombre_ciudad().equals(""))) {listadoclientes.setnombre_ciudad(listadoclientesOrigen.getnombre_ciudad());}
			if(conDefault || (!conDefault && listadoclientesOrigen.getnombre_grupo_cliente()!=null && !listadoclientesOrigen.getnombre_grupo_cliente().equals(""))) {listadoclientes.setnombre_grupo_cliente(listadoclientesOrigen.getnombre_grupo_cliente());}
			if(conDefault || (!conDefault && listadoclientesOrigen.getcodigo()!=null && !listadoclientesOrigen.getcodigo().equals(""))) {listadoclientes.setcodigo(listadoclientesOrigen.getcodigo());}
			if(conDefault || (!conDefault && listadoclientesOrigen.getnombre()!=null && !listadoclientesOrigen.getnombre().equals(""))) {listadoclientes.setnombre(listadoclientesOrigen.getnombre());}
			if(conDefault || (!conDefault && listadoclientesOrigen.getapellido()!=null && !listadoclientesOrigen.getapellido().equals(""))) {listadoclientes.setapellido(listadoclientesOrigen.getapellido());}
			if(conDefault || (!conDefault && listadoclientesOrigen.getruc()!=null && !listadoclientesOrigen.getruc().equals(""))) {listadoclientes.setruc(listadoclientesOrigen.getruc());}
			if(conDefault || (!conDefault && listadoclientesOrigen.gettelefonos()!=null && !listadoclientesOrigen.gettelefonos().equals(""))) {listadoclientes.settelefonos(listadoclientesOrigen.gettelefonos());}
			if(conDefault || (!conDefault && listadoclientesOrigen.getdirecciones()!=null && !listadoclientesOrigen.getdirecciones().equals(""))) {listadoclientes.setdirecciones(listadoclientesOrigen.getdirecciones());}
			if(conDefault || (!conDefault && listadoclientesOrigen.getemails()!=null && !listadoclientesOrigen.getemails().equals(""))) {listadoclientes.setemails(listadoclientesOrigen.getemails());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioListadoClientes(ListadoClientes listadoclientes) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormListadoClientes.jLabelidListadoClientes.setText(listadoclientes.getId().toString());
			this.jInternalFrameDetalleFormListadoClientes.jTextFieldnombre_zonaListadoClientes.setText(listadoclientes.getnombre_zona());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreanombre_ciudadListadoClientes.setText(listadoclientes.getnombre_ciudad());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreanombre_grupo_clienteListadoClientes.setText(listadoclientes.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormListadoClientes.jTextFieldcodigoListadoClientes.setText(listadoclientes.getcodigo());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreanombreListadoClientes.setText(listadoclientes.getnombre());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreaapellidoListadoClientes.setText(listadoclientes.getapellido());
			this.jInternalFrameDetalleFormListadoClientes.jTextFieldrucListadoClientes.setText(listadoclientes.getruc());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreatelefonosListadoClientes.setText(listadoclientes.gettelefonos());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreadireccionesListadoClientes.setText(listadoclientes.getdirecciones());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreaemailsListadoClientes.setText(listadoclientes.getemails());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioListadoClientes(ListadoClientesBean listadoclientesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormListadoClientes.jLabelidListadoClientes.setText(listadoclientesBean.getId().toString());
			this.jInternalFrameDetalleFormListadoClientes.jTextFieldnombre_zonaListadoClientes.setText(listadoclientesBean.getnombre_zona());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreanombre_ciudadListadoClientes.setText(listadoclientesBean.getnombre_ciudad());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreanombre_grupo_clienteListadoClientes.setText(listadoclientesBean.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormListadoClientes.jTextFieldcodigoListadoClientes.setText(listadoclientesBean.getcodigo());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreanombreListadoClientes.setText(listadoclientesBean.getnombre());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreaapellidoListadoClientes.setText(listadoclientesBean.getapellido());
			this.jInternalFrameDetalleFormListadoClientes.jTextFieldrucListadoClientes.setText(listadoclientesBean.getruc());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreatelefonosListadoClientes.setText(listadoclientesBean.gettelefonos());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreadireccionesListadoClientes.setText(listadoclientesBean.getdirecciones());
			this.jInternalFrameDetalleFormListadoClientes.jTextAreaemailsListadoClientes.setText(listadoclientesBean.getemails());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanListadoClientes(ListadoClientesParameterReturnGeneral listadoclientesReturnGeneral,ListadoClientesBean listadoclientesBean,Boolean conDefault) throws Exception { 
		try {
			ListadoClientes listadoclientesLocal=new ListadoClientes();
			
			listadoclientesLocal=listadoclientesReturnGeneral.getListadoClientes();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && listadoclientesLocal.getId()!=null && !listadoclientesLocal.getId().equals(0L))) {listadoclientesBean.setId(listadoclientesLocal.getId());}}
			if(conDefault || (!conDefault && listadoclientesLocal.getnombre_zona()!=null && !listadoclientesLocal.getnombre_zona().equals(""))) {listadoclientesBean.setnombre_zona(listadoclientesLocal.getnombre_zona());}
			if(conDefault || (!conDefault && listadoclientesLocal.getnombre_ciudad()!=null && !listadoclientesLocal.getnombre_ciudad().equals(""))) {listadoclientesBean.setnombre_ciudad(listadoclientesLocal.getnombre_ciudad());}
			if(conDefault || (!conDefault && listadoclientesLocal.getnombre_grupo_cliente()!=null && !listadoclientesLocal.getnombre_grupo_cliente().equals(""))) {listadoclientesBean.setnombre_grupo_cliente(listadoclientesLocal.getnombre_grupo_cliente());}
			if(conDefault || (!conDefault && listadoclientesLocal.getcodigo()!=null && !listadoclientesLocal.getcodigo().equals(""))) {listadoclientesBean.setcodigo(listadoclientesLocal.getcodigo());}
			if(conDefault || (!conDefault && listadoclientesLocal.getnombre()!=null && !listadoclientesLocal.getnombre().equals(""))) {listadoclientesBean.setnombre(listadoclientesLocal.getnombre());}
			if(conDefault || (!conDefault && listadoclientesLocal.getapellido()!=null && !listadoclientesLocal.getapellido().equals(""))) {listadoclientesBean.setapellido(listadoclientesLocal.getapellido());}
			if(conDefault || (!conDefault && listadoclientesLocal.getruc()!=null && !listadoclientesLocal.getruc().equals(""))) {listadoclientesBean.setruc(listadoclientesLocal.getruc());}
			if(conDefault || (!conDefault && listadoclientesLocal.gettelefonos()!=null && !listadoclientesLocal.gettelefonos().equals(""))) {listadoclientesBean.settelefonos(listadoclientesLocal.gettelefonos());}
			if(conDefault || (!conDefault && listadoclientesLocal.getdirecciones()!=null && !listadoclientesLocal.getdirecciones().equals(""))) {listadoclientesBean.setdirecciones(listadoclientesLocal.getdirecciones());}
			if(conDefault || (!conDefault && listadoclientesLocal.getemails()!=null && !listadoclientesLocal.getemails().equals(""))) {listadoclientesBean.setemails(listadoclientesLocal.getemails());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxListadoClientesGenerico(Long idListadoClientesSeleccionado,JComboBox jComboBoxListadoClientes,List<ListadoClientes> listadoclientessLocal)throws Exception {
		try {
			ListadoClientes  listadoclientesTemp=null;

			for(ListadoClientes listadoclientesAux:listadoclientessLocal) {
				if(listadoclientesAux.getId()!=null && listadoclientesAux.getId().equals(idListadoClientesSeleccionado)) {
					listadoclientesTemp=listadoclientesAux;
					break;
				}
			}

			jComboBoxListadoClientes.setSelectedItem(listadoclientesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxListadoClientesGenerico(JComboBox jComboBoxListadoClientes,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxListadoClientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxListadoClientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxListadoClientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxListadoClientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxListadoClientes.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxListadoClientes.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxListadoClientes.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxListadoClientes.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxListadoClientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxListadoClientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadoclientes=(ListadoClientes) listadoclientesLogic.getListadoClientess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			listadoclientes =(ListadoClientes) listadoclientess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!listadoclientes.getIsNew() && !listadoclientes.getIsChanged() && !listadoclientes.getIsDeleted()) {
				sDescripcion=listadoclientes.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=listadoclientes.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ListadoClientes listadoclientesRow=new ListadoClientes();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadoclientesRow=(ListadoClientes) listadoclientesLogic.getListadoClientess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			listadoclientesRow=(ListadoClientes) listadoclientess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualListadoClientes(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoListadoClientes.setVisible((this.isVisibilidadCeldaNuevoListadoClientes && this.isPermisoNuevoListadoClientes));			
			this.jButtonDuplicarListadoClientes.setVisible((this.isVisibilidadCeldaDuplicarListadoClientes && this.isPermisoDuplicarListadoClientes));			
			this.jButtonCopiarListadoClientes.setVisible((this.isVisibilidadCeldaCopiarListadoClientes && this.isPermisoCopiarListadoClientes));
			this.jButtonVerFormListadoClientes.setVisible((this.isVisibilidadCeldaVerFormListadoClientes && this.isPermisoVerFormListadoClientes));
			
			this.jButtonAbrirOrderByListadoClientes.setVisible((this.isVisibilidadCeldaOrdenListadoClientes && this.isPermisoOrdenListadoClientes));			
			
			this.jButtonNuevoRelacionesListadoClientes.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadoClientes && this.isPermisoNuevoListadoClientes));			
			this.jButtonNuevoGuardarCambiosListadoClientes.setVisible((this.isVisibilidadCeldaNuevoListadoClientes && this.isPermisoNuevoListadoClientes && this.isPermisoGuardarCambiosListadoClientes));
			
			if(this.jInternalFrameDetalleFormListadoClientes!=null) {
			this.jInternalFrameDetalleFormListadoClientes.jButtonModificarListadoClientes.setVisible((this.isVisibilidadCeldaModificarListadoClientes && this.isPermisoActualizarListadoClientes));	
			this.jInternalFrameDetalleFormListadoClientes.jButtonActualizarListadoClientes.setVisible((this.isVisibilidadCeldaActualizarListadoClientes && this.isPermisoActualizarListadoClientes));	
			this.jInternalFrameDetalleFormListadoClientes.jButtonEliminarListadoClientes.setVisible((this.isVisibilidadCeldaEliminarListadoClientes && this.isPermisoEliminarListadoClientes));
			this.jInternalFrameDetalleFormListadoClientes.jButtonCancelarListadoClientes.setVisible(this.isVisibilidadCeldaCancelarListadoClientes);							
			this.jInternalFrameDetalleFormListadoClientes.jButtonGuardarCambiosListadoClientes.setVisible((this.isVisibilidadCeldaGuardarListadoClientes && this.isPermisoGuardarCambiosListadoClientes));			
			
			}
						
			this.jButtonGuardarCambiosTablaListadoClientes.setVisible((this.isVisibilidadCeldaGuardarCambiosListadoClientes && this.isPermisoGuardarCambiosListadoClientes));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarListadoClientes.setVisible((this.isVisibilidadCeldaNuevoListadoClientes && this.isPermisoNuevoListadoClientes));						
			this.jButtonDuplicarToolBarListadoClientes.setVisible((this.isVisibilidadCeldaDuplicarListadoClientes && this.isPermisoDuplicarListadoClientes));						
			this.jButtonCopiarToolBarListadoClientes.setVisible((this.isVisibilidadCeldaCopiarListadoClientes && this.isPermisoCopiarListadoClientes));			
			this.jButtonVerFormToolBarListadoClientes.setVisible((this.isVisibilidadCeldaVerFormListadoClientes && this.isPermisoVerFormListadoClientes));			
			this.jButtonAbrirOrderByToolBarListadoClientes.setVisible((this.isVisibilidadCeldaOrdenListadoClientes && this.isPermisoOrdenListadoClientes));
			this.jButtonNuevoRelacionesToolBarListadoClientes.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadoClientes && this.isPermisoNuevoListadoClientes));			
			this.jButtonNuevoGuardarCambiosToolBarListadoClientes.setVisible((this.isVisibilidadCeldaNuevoListadoClientes && this.isPermisoNuevoListadoClientes && this.isPermisoGuardarCambiosListadoClientes));			
			
			if(this.jInternalFrameDetalleFormListadoClientes!=null) {
			this.jInternalFrameDetalleFormListadoClientes.jButtonModificarToolBarListadoClientes.setVisible((this.isVisibilidadCeldaModificarListadoClientes && this.isPermisoActualizarListadoClientes));	
			this.jInternalFrameDetalleFormListadoClientes.jButtonActualizarToolBarListadoClientes.setVisible((this.isVisibilidadCeldaActualizarListadoClientes  && this.isPermisoActualizarListadoClientes));	
			this.jInternalFrameDetalleFormListadoClientes.jButtonEliminarToolBarListadoClientes.setVisible((this.isVisibilidadCeldaEliminarListadoClientes && this.isPermisoEliminarListadoClientes));
			this.jInternalFrameDetalleFormListadoClientes.jButtonCancelarToolBarListadoClientes.setVisible(this.isVisibilidadCeldaCancelarListadoClientes);				
			this.jInternalFrameDetalleFormListadoClientes.jButtonGuardarCambiosToolBarListadoClientes.setVisible((this.isVisibilidadCeldaGuardarListadoClientes && this.isPermisoGuardarCambiosListadoClientes));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarListadoClientes.setVisible((this.isVisibilidadCeldaGuardarCambiosListadoClientes && this.isPermisoGuardarCambiosListadoClientes));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoListadoClientes.setVisible((this.isVisibilidadCeldaNuevoListadoClientes && this.isPermisoNuevoListadoClientes));			
			this.jMenuItemDuplicarListadoClientes.setVisible((this.isVisibilidadCeldaDuplicarListadoClientes && this.isPermisoDuplicarListadoClientes));			
			this.jMenuItemCopiarListadoClientes.setVisible((this.isVisibilidadCeldaCopiarListadoClientes && this.isPermisoCopiarListadoClientes));			
			this.jMenuItemVerFormListadoClientes.setVisible((this.isVisibilidadCeldaVerFormListadoClientes && this.isPermisoVerFormListadoClientes));			
			this.jMenuItemAbrirOrderByListadoClientes.setVisible((this.isVisibilidadCeldaOrdenListadoClientes && this.isPermisoOrdenListadoClientes));			
			//this.jMenuItemMostrarOcultarListadoClientes.setVisible((this.isVisibilidadCeldaOrdenListadoClientes && this.isPermisoOrdenListadoClientes));
			this.jMenuItemDetalleAbrirOrderByListadoClientes.setVisible((this.isVisibilidadCeldaOrdenListadoClientes && this.isPermisoOrdenListadoClientes));			
			//this.jMenuItemDetalleMostrarOcultarListadoClientes.setVisible((this.isVisibilidadCeldaOrdenListadoClientes && this.isPermisoOrdenListadoClientes));			
			this.jMenuItemNuevoRelacionesListadoClientes.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadoClientes && this.isPermisoNuevoListadoClientes));			
			this.jMenuItemNuevoGuardarCambiosListadoClientes.setVisible((this.isVisibilidadCeldaNuevoListadoClientes && this.isPermisoNuevoListadoClientes && this.isPermisoGuardarCambiosListadoClientes));									
			
			if(this.jInternalFrameDetalleFormListadoClientes!=null) {
			this.jInternalFrameDetalleFormListadoClientes.jMenuItemModificarListadoClientes.setVisible((this.isVisibilidadCeldaModificarListadoClientes && this.isPermisoActualizarListadoClientes));	
			this.jInternalFrameDetalleFormListadoClientes.jMenuItemActualizarListadoClientes.setVisible((this.isVisibilidadCeldaActualizarListadoClientes && this.isPermisoActualizarListadoClientes));	
			this.jInternalFrameDetalleFormListadoClientes.jMenuItemEliminarListadoClientes.setVisible((this.isVisibilidadCeldaEliminarListadoClientes && this.isPermisoEliminarListadoClientes));
			this.jInternalFrameDetalleFormListadoClientes.jMenuItemCancelarListadoClientes.setVisible(this.isVisibilidadCeldaCancelarListadoClientes);				
			}
			
			this.jMenuItemGuardarCambiosListadoClientes.setVisible((this.isVisibilidadCeldaGuardarListadoClientes && this.isPermisoGuardarCambiosListadoClientes));						
			this.jMenuItemGuardarCambiosTablaListadoClientes.setVisible((this.isVisibilidadCeldaGuardarCambiosListadoClientes && this.isPermisoGuardarCambiosListadoClientes));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoListadoClientes=this.jButtonNuevoListadoClientes.isVisible();
			this.isVisibilidadCeldaDuplicarListadoClientes=this.jButtonDuplicarListadoClientes.isVisible();
			this.isVisibilidadCeldaCopiarListadoClientes=this.jButtonCopiarListadoClientes.isVisible();
			this.isVisibilidadCeldaVerFormListadoClientes=this.jButtonVerFormListadoClientes.isVisible();
			
			this.isVisibilidadCeldaOrdenListadoClientes=this.jButtonAbrirOrderByListadoClientes.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesListadoClientes=this.jButtonNuevoRelacionesListadoClientes.isVisible();
			this.isVisibilidadCeldaModificarListadoClientes=this.jButtonModificarListadoClientes.isVisible();
			
			if(this.jInternalFrameDetalleFormListadoClientes!=null) {
			this.isVisibilidadCeldaActualizarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jButtonActualizarListadoClientes.isVisible();
			this.isVisibilidadCeldaEliminarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jButtonEliminarListadoClientes.isVisible();
			this.isVisibilidadCeldaCancelarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jButtonCancelarListadoClientes.isVisible();
			this.isVisibilidadCeldaGuardarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jButtonGuardarCambiosListadoClientes.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosListadoClientes=this.jButtonGuardarCambiosTablaListadoClientes.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoListadoClientes=this.jButtonNuevoToolBarListadoClientes.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesListadoClientes=this.jButtonNuevoRelacionesToolBarListadoClientes.isVisible();
			
			if(this.jInternalFrameDetalleFormListadoClientes!=null) {
			this.isVisibilidadCeldaModificarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jButtonModificarToolBarListadoClientes.isVisible();
			this.isVisibilidadCeldaActualizarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jButtonActualizarToolBarListadoClientes.isVisible();
			this.isVisibilidadCeldaEliminarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jButtonEliminarToolBarListadoClientes.isVisible();
			this.isVisibilidadCeldaCancelarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jButtonCancelarToolBarListadoClientes.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarListadoClientes=this.jButtonGuardarCambiosToolBarListadoClientes.isVisible();
			this.isVisibilidadCeldaGuardarCambiosListadoClientes=this.jButtonGuardarCambiosTablaToolBarListadoClientes.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoListadoClientes=this.jMenuItemNuevoListadoClientes.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesListadoClientes=this.jMenuItemNuevoRelacionesListadoClientes.isVisible();
			
			if(this.jInternalFrameDetalleFormListadoClientes!=null) {
			this.isVisibilidadCeldaModificarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jMenuItemModificarListadoClientes.isVisible();
			this.isVisibilidadCeldaActualizarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jMenuItemActualizarListadoClientes.isVisible();
			this.isVisibilidadCeldaEliminarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jMenuItemEliminarListadoClientes.isVisible();
			this.isVisibilidadCeldaCancelarListadoClientes=this.jInternalFrameDetalleFormListadoClientes.jMenuItemCancelarListadoClientes.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarListadoClientes=this.jMenuItemGuardarCambiosListadoClientes.isVisible();
			this.isVisibilidadCeldaGuardarCambiosListadoClientes=this.jMenuItemGuardarCambiosTablaListadoClientes.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesListadoClientes(Boolean esInicializar) {
		if(ListadoClientesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.listadoclientesSessionBean.getConGuardarRelaciones()) {
				//if(this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesListadoClientes();
			}
			
			this.inicializarActualizarBindingBotonesManualListadoClientes(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualListadoClientes() {
		this.jButtonNuevoListadoClientes.setVisible(this.isPermisoNuevoListadoClientes);			
		this.jButtonDuplicarListadoClientes.setVisible(this.isPermisoDuplicarListadoClientes);			
		this.jButtonCopiarListadoClientes.setVisible(this.isPermisoCopiarListadoClientes);			
		this.jButtonVerFormListadoClientes.setVisible(this.isPermisoVerFormListadoClientes);			
		
		this.jButtonAbrirOrderByListadoClientes.setVisible(this.isPermisoOrdenListadoClientes);					
		
		this.jButtonNuevoRelacionesListadoClientes.setVisible(this.isPermisoNuevoListadoClientes);			
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoClientes.jButtonModificarListadoClientes.setVisible(this.isPermisoActualizarListadoClientes);	
			this.jInternalFrameDetalleFormListadoClientes.jButtonActualizarListadoClientes.setVisible(this.isPermisoActualizarListadoClientes);	
			this.jInternalFrameDetalleFormListadoClientes.jButtonEliminarListadoClientes.setVisible(this.isPermisoEliminarListadoClientes);
			this.jInternalFrameDetalleFormListadoClientes.jButtonCancelarListadoClientes.setVisible(this.isVisibilidadCeldaCancelarListadoClientes);						
			this.jInternalFrameDetalleFormListadoClientes.jButtonGuardarCambiosListadoClientes.setVisible(this.isPermisoGuardarCambiosListadoClientes);							
		}
		
		this.jButtonGuardarCambiosTablaListadoClientes.setVisible(this.isPermisoActualizarListadoClientes);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleListadoClientes() {
		this.jInternalFrameDetalleFormListadoClientes.jButtonModificarListadoClientes.setVisible(this.isPermisoActualizarListadoClientes);	
		this.jInternalFrameDetalleFormListadoClientes.jButtonActualizarListadoClientes.setVisible(this.isPermisoActualizarListadoClientes);	
		this.jInternalFrameDetalleFormListadoClientes.jButtonEliminarListadoClientes.setVisible(this.isPermisoEliminarListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jButtonCancelarListadoClientes.setVisible(this.isVisibilidadCeldaCancelarListadoClientes);							
		this.jInternalFrameDetalleFormListadoClientes.jButtonGuardarCambiosListadoClientes.setVisible((this.isVisibilidadCeldaGuardarListadoClientes && this.isPermisoGuardarCambiosListadoClientes));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosListadoClientes() {
		if(ListadoClientesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualListadoClientes();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesListadoClientes() {
	}
	
	public void jTableDatosListadoClientesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarListadoClientes(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidListadoClientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoClientes(this.getlistadoclientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoclientes==null) {
						this.listadoclientes = new ListadoClientes();
					}

					this.setVariablesFormularioToObjetoActualListadoClientes(this.listadoclientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
				}

				if(this.listadoclientes.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.listadoclientes.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoClientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaListadoClientesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebListadoClientes(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosListadoClientes.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosListadoClientes.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualListadoClientes(this.getlistadoclientes(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.listadoclientesLogic.getConnexion());

				if(this.listadoclientes.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.listadoclientes.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderListadoClientes=(TitledBorder)this.jScrollPanelDatosListadoClientes.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderListadoClientes.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaListadoClientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoClientes(this.getlistadoclientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoclientes==null) {
						this.listadoclientes = new ListadoClientes();
					}

					this.setVariablesFormularioToObjetoActualListadoClientes(this.listadoclientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
				}

				if(this.listadoclientes.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.listadoclientes.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoClientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_zonaListadoClientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoClientes(this.getlistadoclientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoclientes==null) {
						this.listadoclientes = new ListadoClientes();
					}

					this.setVariablesFormularioToObjetoActualListadoClientes(this.listadoclientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
				}

				if(this.listadoclientes.getnombre_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_zona like '%"+this.listadoclientes.getnombre_zona()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoClientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_ciudadListadoClientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoClientes(this.getlistadoclientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoclientes==null) {
						this.listadoclientes = new ListadoClientes();
					}

					this.setVariablesFormularioToObjetoActualListadoClientes(this.listadoclientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
				}

				if(this.listadoclientes.getnombre_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_ciudad like '%"+this.listadoclientes.getnombre_ciudad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoClientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_grupo_clienteListadoClientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoClientes(this.getlistadoclientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoclientes==null) {
						this.listadoclientes = new ListadoClientes();
					}

					this.setVariablesFormularioToObjetoActualListadoClientes(this.listadoclientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
				}

				if(this.listadoclientes.getnombre_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_grupo_cliente like '%"+this.listadoclientes.getnombre_grupo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoClientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoListadoClientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoClientes(this.getlistadoclientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoclientes==null) {
						this.listadoclientes = new ListadoClientes();
					}

					this.setVariablesFormularioToObjetoActualListadoClientes(this.listadoclientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
				}

				if(this.listadoclientes.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.listadoclientes.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoClientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreListadoClientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoClientes(this.getlistadoclientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoclientes==null) {
						this.listadoclientes = new ListadoClientes();
					}

					this.setVariablesFormularioToObjetoActualListadoClientes(this.listadoclientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
				}

				if(this.listadoclientes.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.listadoclientes.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoClientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidoListadoClientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoClientes(this.getlistadoclientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoclientes==null) {
						this.listadoclientes = new ListadoClientes();
					}

					this.setVariablesFormularioToObjetoActualListadoClientes(this.listadoclientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
				}

				if(this.listadoclientes.getapellido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellido like '%"+this.listadoclientes.getapellido()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoClientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucListadoClientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoClientes(this.getlistadoclientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoclientes==null) {
						this.listadoclientes = new ListadoClientes();
					}

					this.setVariablesFormularioToObjetoActualListadoClientes(this.listadoclientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
				}

				if(this.listadoclientes.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.listadoclientes.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoClientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonosListadoClientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoClientes(this.getlistadoclientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoclientes==null) {
						this.listadoclientes = new ListadoClientes();
					}

					this.setVariablesFormularioToObjetoActualListadoClientes(this.listadoclientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
				}

				if(this.listadoclientes.gettelefonos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefonos like '%"+this.listadoclientes.gettelefonos()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoClientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionesListadoClientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoClientes(this.getlistadoclientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoclientes==null) {
						this.listadoclientes = new ListadoClientes();
					}

					this.setVariablesFormularioToObjetoActualListadoClientes(this.listadoclientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
				}

				if(this.listadoclientes.getdirecciones()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direcciones like '%"+this.listadoclientes.getdirecciones()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoClientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonemailsListadoClientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoClientes(this.getlistadoclientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoclientes==null) {
						this.listadoclientes = new ListadoClientes();
					}

					this.setVariablesFormularioToObjetoActualListadoClientes(this.listadoclientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);
				}

				if(this.listadoclientes.getemails()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where emails like '%"+this.listadoclientes.getemails()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoClientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaListadoClientesListadoClientesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadoClientes(false,false);

			this.getListadoClientessBusquedaListadoClientes();

			this.inicializarActualizarBindingListadoClientes(false);

			//if(ListadoClientesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadoClientes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaListadoClientesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadoClientes(false,false);

			this.getListadoClientessFK_IdEmpresa();

			this.inicializarActualizarBindingListadoClientes(false);

			//if(ListadoClientesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadoClientes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoclientesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameListadoClientes() {
		if(this.jInternalFrameDetalleFormListadoClientes!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) {
			this.jInternalFrameDetalleFormListadoClientes.setVisible(false);	    			
			this.jInternalFrameDetalleFormListadoClientes.dispose();
			this.jInternalFrameDetalleFormListadoClientes=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoListadoClientes!=null) {
			this.jInternalFrameReporteDinamicoListadoClientes.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoListadoClientes.dispose();
			this.jInternalFrameReporteDinamicoListadoClientes=null;
		}
		
		if(this.jInternalFrameImportacionListadoClientes!=null) {
			this.jInternalFrameImportacionListadoClientes.setVisible(false);	    			
			this.jInternalFrameImportacionListadoClientes.dispose();
			this.jInternalFrameImportacionListadoClientes=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessListadoClientes();
			
			ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
			
			
			if(sTipo.equals("NuevoListadoClientes")) {
				jButtonNuevoListadoClientesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarListadoClientes")) {
				jButtonDuplicarListadoClientesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarListadoClientes")) {
				jButtonCopiarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("VerFormListadoClientes")) {
				jButtonVerFormListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarListadoClientes")) {
				jButtonNuevoListadoClientesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarListadoClientes")) {
				jButtonDuplicarListadoClientesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoListadoClientes")) {
				jButtonNuevoListadoClientesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarListadoClientes")) {
				jButtonDuplicarListadoClientesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesListadoClientes")) {
				jButtonNuevoListadoClientesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarListadoClientes")) {
				jButtonNuevoListadoClientesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesListadoClientes")) {
				jButtonNuevoListadoClientesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarListadoClientes")) {
				jButtonModificarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarListadoClientes")) {
				jButtonModificarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarListadoClientes")) {
				jButtonModificarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarListadoClientes")) {
				jButtonActualizarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarListadoClientes")) {
				jButtonActualizarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarListadoClientes")) {
				jButtonActualizarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("EliminarListadoClientes")) {
				jButtonEliminarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarListadoClientes")) {
				jButtonEliminarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarListadoClientes")) {
				jButtonEliminarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("CancelarListadoClientes")) {
				jButtonCancelarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarListadoClientes")) {
				jButtonCancelarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarListadoClientes")) {
				jButtonCancelarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("CerrarListadoClientes")) {
				jButtonCerrarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarListadoClientes")) {
				jButtonCerrarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarListadoClientes")) {
				jButtonCerrarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarListadoClientes")) {
				jButtonMostrarOcultarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarListadoClientes")) {
				jButtonCancelarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosListadoClientes")) {
				jButtonGuardarCambiosListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarListadoClientes")) {
				jButtonGuardarCambiosListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarListadoClientes")) {
				jButtonCopiarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarListadoClientes")) {
				jButtonVerFormListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosListadoClientes")) {
				jButtonGuardarCambiosListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarListadoClientes")) {
				jButtonCopiarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormListadoClientes")) {
				jButtonVerFormListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaListadoClientes")) {
				jButtonGuardarCambiosListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarListadoClientes")) {
				jButtonGuardarCambiosListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaListadoClientes")) {
				jButtonGuardarCambiosListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionListadoClientes")) {
				jButtonRecargarInformacionListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarListadoClientes")) {
				jButtonRecargarInformacionListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionListadoClientes")) {
				jButtonRecargarInformacionListadoClientesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresListadoClientes")) {
				jButtonAnterioresListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarListadoClientes")) {
				jButtonAnterioresListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreListadoClientes")) {
				jButtonAnterioresListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesListadoClientes")) {
				jButtonSiguientesListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarListadoClientes")) {
				jButtonSiguientesListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesListadoClientes")) {
				jButtonSiguientesListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByListadoClientes") || sTipo.equals("MenuItemDetalleAbrirOrderByListadoClientes")) {
				jButtonAbrirOrderByListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarListadoClientes") || sTipo.equals("MenuItemDetalleMostrarOcultarListadoClientes")) {
				jButtonMostrarOcultarListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosListadoClientes")) {
				jButtonNuevoGuardarCambiosListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarListadoClientes")) {
				jButtonNuevoGuardarCambiosListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosListadoClientes")) {
				jButtonNuevoGuardarCambiosListadoClientesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoListadoClientes")) {
				jButtonCerrarReporteDinamicoListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoListadoClientes")) {
				jButtonGenerarReporteDinamicoListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoListadoClientes")) {
				
				jButtonGenerarExcelReporteDinamicoListadoClientesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionListadoClientes")) {
				jButtonCerrarImportacionListadoClientesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionListadoClientes")) {
				
				jButtonGenerarImportacionListadoClientesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionListadoClientes")) {
				
				jButtonAbrirImportacionListadoClientesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesListadoClientes")) {
				jComboBoxTiposAccionesListadoClientesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesListadoClientes")) {
				jComboBoxTiposRelacionesListadoClientesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioListadoClientes")) {
				jComboBoxTiposAccionesListadoClientesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarListadoClientes")) {
				
				jComboBoxTiposSeleccionarListadoClientesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralListadoClientes")) {
				jTextFieldValorCampoGeneralListadoClientesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByListadoClientes")) {
				jButtonAbrirOrderByListadoClientesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarListadoClientes")) {
				jButtonAbrirOrderByListadoClientesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByListadoClientes")) {
				jButtonCerrarOrderByListadoClientesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idListadoClientesBusqueda")) {
				this.jButtonidListadoClientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaListadoClientesUpdate")) {
				this.jButtonid_empresaListadoClientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaListadoClientesBusqueda")) {
				this.jButtonid_empresaListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaListadoClientesBusqueda")) {
				this.jButtonnombre_zonaListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadListadoClientesBusqueda")) {
				this.jButtonnombre_ciudadListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupo_clienteListadoClientesBusqueda")) {
				this.jButtonnombre_grupo_clienteListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoListadoClientesBusqueda")) {
				this.jButtoncodigoListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreListadoClientesBusqueda")) {
				this.jButtonnombreListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoListadoClientesBusqueda")) {
				this.jButtonapellidoListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucListadoClientesBusqueda")) {
				this.jButtonrucListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonosListadoClientesBusqueda")) {
				this.jButtontelefonosListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionesListadoClientesBusqueda")) {
				this.jButtondireccionesListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailsListadoClientesBusqueda")) {
				this.jButtonemailsListadoClientesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaListadoClientesListadoClientes")) {
				this.jButtonBusquedaListadoClientesListadoClientesActionPerformed(evt);
			}
			
			;
			
			
			ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessListadoClientes();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoClientesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoclientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoclientes);
				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
				
				


				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoClientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoClientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ListadoClientes listadoclientesLocal=null;
			
			if(!this.getEsControlTabla()) {
				listadoclientesLocal=this.listadoclientes;
			} else {
				listadoclientesLocal=this.listadoclientesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoclientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoclientes);
				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
							
				
				


				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoClientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoClientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoClientesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesAnterior =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoclientesAnterior =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
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
			
			ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
			
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
			
			


			
			ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoClientesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoclientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoclientes);
				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
								
						
				


				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoClientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoClientes.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoclientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoclientes);
				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
								
				
				


				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoClientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoClientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoClientesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesAnterior =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoclientesAnterior =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoclientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoclientes);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoClientesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesAnterior =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoclientesAnterior =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoClientesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoclientes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadoclientes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoclientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoclientes);
				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
							
				
				


				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoClientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoClientes.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoClientesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoclientesAnterior =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.listadoclientesAnterior =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
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
			
			ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
			
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
			
			


			
			ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoClientesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoclientes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadoclientes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoclientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoclientes);
				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
								
				
				


				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoClientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoClientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoClientesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesAnterior =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoclientesAnterior =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoClientesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoclientes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadoclientes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoClientesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoclientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoclientes);
				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosListadoClientes")) {
					jCheckBoxSeleccionarTodosListadoClientesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosListadoClientes")) {
					jCheckBoxSeleccionadosListadoClientesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarListadoClientes")) {
					
				}
				
				


				
				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoClientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoClientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoclientes);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.listadoclientes);
				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
												
				
				


				
				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoClientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoClientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoClientesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoclientesAnterior =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.listadoclientesAnterior =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoClientesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoclientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoclientes);
				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
				
				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
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
			
			ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
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
			
			


			
			ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoClientesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoclientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoclientes);
				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoClientes.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoClientes.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoclientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoclientes);
				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
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
				
				


				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoClientes.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoClientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoClientesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoclientesAnterior =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoclientesAnterior =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarListadoClientes")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosListadoClientesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosListadoClientes.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.listadoclientes =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.listadoclientes =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.listadoclientes);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarListadoClientes")) {
				
				}
				
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarListadoClientes")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosListadoClientes.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarListadoClientes")) {
			
			}
			
			ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessListadoClientes();
			
			ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
			
			if(sTipo.equals("NuevoListadoClientes")) {
				jButtonNuevoListadoClientesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarListadoClientes")) {
				jButtonDuplicarListadoClientesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarListadoClientes")) {
				jButtonCopiarListadoClientesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormListadoClientes")) {
				jButtonVerFormListadoClientesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesListadoClientes")) {
				jButtonNuevoListadoClientesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarListadoClientes")) {
				jButtonModificarListadoClientesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarListadoClientes")) {
				jButtonActualizarListadoClientesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarListadoClientes")) {
				jButtonEliminarListadoClientesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaListadoClientes")) {
				jButtonGuardarCambiosListadoClientesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarListadoClientes")) {
				jButtonCancelarListadoClientesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarListadoClientes")) {
				jButtonCerrarListadoClientesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosListadoClientes")) {
				jButtonGuardarCambiosListadoClientesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosListadoClientes")) {
				jButtonNuevoGuardarCambiosListadoClientesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByListadoClientes")) {
				jButtonAbrirOrderByListadoClientesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionListadoClientes")) {
				jButtonRecargarInformacionListadoClientesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresListadoClientes")) {
				jButtonAnterioresListadoClientesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesListadoClientes")) {
				jButtonSiguientesListadoClientesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idListadoClientesBusqueda")) {
				this.jButtonidListadoClientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaListadoClientesUpdate")) {
				this.jButtonid_empresaListadoClientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaListadoClientesBusqueda")) {
				this.jButtonid_empresaListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaListadoClientesBusqueda")) {
				this.jButtonnombre_zonaListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadListadoClientesBusqueda")) {
				this.jButtonnombre_ciudadListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupo_clienteListadoClientesBusqueda")) {
				this.jButtonnombre_grupo_clienteListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoListadoClientesBusqueda")) {
				this.jButtoncodigoListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreListadoClientesBusqueda")) {
				this.jButtonnombreListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoListadoClientesBusqueda")) {
				this.jButtonapellidoListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucListadoClientesBusqueda")) {
				this.jButtonrucListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonosListadoClientesBusqueda")) {
				this.jButtontelefonosListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionesListadoClientesBusqueda")) {
				this.jButtondireccionesListadoClientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailsListadoClientesBusqueda")) {
				this.jButtonemailsListadoClientesBusquedaActionPerformed(evt);
			}
			
			ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessListadoClientes();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameListadoClientes")) {
				closingInternalFrameListadoClientes();
				
			} else if(sTipo.equals("jButtonCancelarListadoClientes")) {
				JInternalFrameBase jInternalFrameDetalleFormListadoClientes = (JInternalFrameBase)evt.getSource();
	            	
	            ListadoClientesBeanSwingJInternalFrame jInternalFrameParent=(ListadoClientesBeanSwingJInternalFrame)jInternalFrameDetalleFormListadoClientes.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarListadoClientesActionPerformed(null);
			}
			
			ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.listadoclientes,new Object(),this.listadoclientesParameterGeneral,this.listadoclientesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormListadoClientes(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormListadoClientes(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormListadoClientes(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.listadoclientes)) {
			if(!esControlTabla) {
				if(ListadoClientesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualListadoClientes(this.listadoclientes,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);			
				}
				
				if(this.listadoclientesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualListadoClientes(this.listadoclientes,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanListadoClientes(this.listadoclientesReturnGeneral,this.listadoclientesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.listadoclientesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanListadoClientes(classes,this.listadoclientesReturnGeneral,this.listadoclientesBean,false);
					}
						
					if(this.listadoclientesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyListadoClientes(this.listadoclientesReturnGeneral.getListadoClientes());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioListadoClientes(this.listadoclientesReturnGeneral.getListadoClientes());	
					}
						
					if(this.listadoclientesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioListadoClientes(this.listadoclientesReturnGeneral.getListadoClientes(),classes);//this.listadoclientesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioListadoClientes(this.listadoclientes,classes);//this.listadoclientesBean);									
				}
			
				if(ListadoClientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualListadoClientes(this.listadoclientes,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoClientes(this.listadoclientes);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.listadoclientesAnterior!=null) {
						this.listadoclientes=this.listadoclientesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.listadoclientesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.listadoclientesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.listadoclientesReturnGeneral.getListadoClientes(),listadoclientesLogic.getListadoClientess());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.listadoclientesReturnGeneral.getListadoClientes(),this.listadoclientess);
				}
				//ARCHITECTURE
				
				//this.jTableDatosListadoClientes.repaint();
				
				//((AbstractTableModel) this.jTableDatosListadoClientes.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosListadoClientes();
			}
		}
	}
	
	public void actualizarVisualTableDatosListadoClientes() throws Exception {
		
		ListadoClientesModel listadoclientesModel=(ListadoClientesModel)this.jTableDatosListadoClientes.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadoclientesModel.listadoclientess=this.listadoclientesLogic.getListadoClientess();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			listadoclientesModel.listadoclientess=this.listadoclientess;
		}
		
		
		((ListadoClientesModel) this.jTableDatosListadoClientes.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaListadoClientes() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getlistadoclientesAnterior(),this.listadoclientesLogic.getListadoClientess());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getlistadoclientesAnterior(),this.listadoclientess);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosListadoClientes();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioListadoClientes(ListadoClientes listadoclientes,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
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
										
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.listadoclientes,new Object(),generalEntityParameterGeneral,this.listadoclientesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.listadoclientesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ListadoClientesConstantesFunciones.getClassesRelationshipsOfListadoClientes(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ListadoClientesConstantesFunciones.getClassesRelationshipsFromStringsOfListadoClientes(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormListadoClientes(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ListadoClientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.listadoclientes,new Object(),generalEntityParameterGeneral,this.listadoclientesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioListadoClientes(ListadoClientesBean listadoclientesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanListadoClientes(ArrayList<Classe> classes,ListadoClientesReturnGeneral listadoclientesReturnGeneral,ListadoClientesBean listadoclientesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualListadoClientes(ListadoClientes listadoclientes,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.listadoclientes)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormListadoClientes = new ListadoClientesDetalleFormJInternalFrame(jDesktopPane,this.listadoclientesSessionBean.getConGuardarRelaciones(),this.listadoclientesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.setVisible(false);
		this.jInternalFrameDetalleFormListadoClientes.setSelected(false);						
		
		this.jInternalFrameDetalleFormListadoClientes.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormListadoClientes.listadoclientesLogic=this.listadoclientesLogic;
		
		this.cargarCombosFrameForeignKeyListadoClientes("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleListadoClientes();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleListadoClientes();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyListadoClientes("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyListadoClientes();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormListadoClientes.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarListadoClientes"));
		
		this.jInternalFrameDetalleFormListadoClientes.jButtonModificarListadoClientes.addActionListener(new ButtonActionListener(this,"ModificarListadoClientes"));

		
		this.jInternalFrameDetalleFormListadoClientes.jButtonModificarToolBarListadoClientes.addActionListener(new ButtonActionListener(this,"ModificarToolBarListadoClientes"));
					
		this.jInternalFrameDetalleFormListadoClientes.jMenuItemModificarListadoClientes.addActionListener(new ButtonActionListener(this,"MenuItemModificarListadoClientes"));		
		
		
		
		this.jInternalFrameDetalleFormListadoClientes.jButtonActualizarListadoClientes.addActionListener (new ButtonActionListener(this,"ActualizarListadoClientes"));
		
		
		this.jInternalFrameDetalleFormListadoClientes.jButtonActualizarToolBarListadoClientes.addActionListener(new ButtonActionListener(this,"ActualizarToolBarListadoClientes"));
						
		this.jInternalFrameDetalleFormListadoClientes.jMenuItemActualizarListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemActualizarListadoClientes"));		
		
		
		
		this.jInternalFrameDetalleFormListadoClientes.jButtonEliminarListadoClientes.addActionListener (new ButtonActionListener(this,"EliminarListadoClientes"));
		
		
		this.jInternalFrameDetalleFormListadoClientes.jButtonEliminarToolBarListadoClientes.addActionListener (new ButtonActionListener(this,"EliminarToolBarListadoClientes"));
								
		this.jInternalFrameDetalleFormListadoClientes.jMenuItemEliminarListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemEliminarListadoClientes"));		
		
		
		
		this.jInternalFrameDetalleFormListadoClientes.jButtonCancelarListadoClientes.addActionListener (new ButtonActionListener(this,"CancelarListadoClientes"));
		
		
		this.jInternalFrameDetalleFormListadoClientes.jButtonCancelarToolBarListadoClientes.addActionListener (new ButtonActionListener(this,"CancelarToolBarListadoClientes"));
					
		this.jInternalFrameDetalleFormListadoClientes.jMenuItemCancelarListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemCancelarListadoClientes"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormListadoClientes.jMenuItemDetalleCerrarListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarListadoClientes"));		
		
		
		
		this.jInternalFrameDetalleFormListadoClientes.jButtonGuardarCambiosToolBarListadoClientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadoClientes"));
		
		
		
		this.jInternalFrameDetalleFormListadoClientes.jButtonGuardarCambiosToolBarListadoClientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadoClientes"));
		
		
		
		this.jInternalFrameDetalleFormListadoClientes.jComboBoxTiposAccionesFormularioListadoClientes.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioListadoClientes"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonidListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"idListadoClientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadoClientes.jButtonid_empresaListadoClientesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadoClientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonid_empresaListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonnombre_zonaListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonnombre_ciudadListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonnombre_grupo_clienteListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtoncodigoListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonnombreListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"nombreListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonapellidoListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"apellidoListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonrucListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"rucListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtontelefonosListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"telefonosListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtondireccionesListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"direccionesListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonemailsListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"emailsListadoClientesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormListadoClientes.jTabbedPaneRelacionesListadoClientes.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesListadoClientes"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameListadoClientes"));
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoClientes.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarListadoClientes"));
		}
		
		this.jTableDatosListadoClientes.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarListadoClientes"));
		
		this.jTableDatosListadoClientes.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarListadoClientes"));
		
		this.jButtonNuevoListadoClientes.addActionListener(new ButtonActionListener(this,"NuevoListadoClientes"));
		
		this.jButtonDuplicarListadoClientes.addActionListener(new ButtonActionListener(this,"DuplicarListadoClientes"));
		
		this.jButtonCopiarListadoClientes.addActionListener(new ButtonActionListener(this,"CopiarListadoClientes"));
		
		this.jButtonVerFormListadoClientes.addActionListener(new ButtonActionListener(this,"VerFormListadoClientes"));
		
		
		this.jButtonNuevoToolBarListadoClientes.addActionListener(new ButtonActionListener(this,"NuevoToolBarListadoClientes"));
			
		this.jButtonDuplicarToolBarListadoClientes.addActionListener(new ButtonActionListener(this,"DuplicarToolBarListadoClientes"));
			
		this.jMenuItemNuevoListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemNuevoListadoClientes"));
			
		this.jMenuItemDuplicarListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarListadoClientes"));		
		
		
		this.jButtonNuevoRelacionesListadoClientes.addActionListener (new ButtonActionListener(this,"NuevoRelacionesListadoClientes"));
		
		
		this.jButtonNuevoRelacionesToolBarListadoClientes.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarListadoClientes"));
			
		this.jMenuItemNuevoRelacionesListadoClientes.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesListadoClientes"));		
		
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoClientes.jButtonModificarListadoClientes.addActionListener(new ButtonActionListener(this,"ModificarListadoClientes"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoClientes.jButtonModificarToolBarListadoClientes.addActionListener(new ButtonActionListener(this,"ModificarToolBarListadoClientes"));
			
			this.jInternalFrameDetalleFormListadoClientes.jMenuItemModificarListadoClientes.addActionListener(new ButtonActionListener(this,"MenuItemModificarListadoClientes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormListadoClientes.jButtonActualizarListadoClientes.addActionListener (new ButtonActionListener(this,"ActualizarListadoClientes"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoClientes.jButtonActualizarToolBarListadoClientes.addActionListener(new ButtonActionListener(this,"ActualizarToolBarListadoClientes"));
				
			this.jInternalFrameDetalleFormListadoClientes.jMenuItemActualizarListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemActualizarListadoClientes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoClientes.jButtonEliminarListadoClientes.addActionListener (new ButtonActionListener(this,"EliminarListadoClientes"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoClientes.jButtonEliminarToolBarListadoClientes.addActionListener (new ButtonActionListener(this,"EliminarToolBarListadoClientes"));
						
			this.jInternalFrameDetalleFormListadoClientes.jMenuItemEliminarListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemEliminarListadoClientes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoClientes.jButtonCancelarListadoClientes.addActionListener (new ButtonActionListener(this,"CancelarListadoClientes"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoClientes.jButtonCancelarToolBarListadoClientes.addActionListener (new ButtonActionListener(this,"CancelarToolBarListadoClientes"));
			
			this.jInternalFrameDetalleFormListadoClientes.jMenuItemCancelarListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemCancelarListadoClientes"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarListadoClientes.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarListadoClientes"));		
		
		
		this.jButtonCerrarListadoClientes.addActionListener (new ButtonActionListener(this,"CerrarListadoClientes"));
		
		
		this.jButtonCerrarToolBarListadoClientes.addActionListener (new ButtonActionListener(this,"CerrarToolBarListadoClientes"));
			
		this.jMenuItemCerrarListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemCerrarListadoClientes"));
			
		if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoClientes.jMenuItemDetalleCerrarListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarListadoClientes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoClientes.jButtonGuardarCambiosListadoClientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosListadoClientes"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoClientes.jButtonGuardarCambiosToolBarListadoClientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadoClientes"));
		}
		
		this.jButtonCopiarToolBarListadoClientes.addActionListener (new ButtonActionListener(this,"CopiarToolBarListadoClientes"));
			
		this.jButtonVerFormToolBarListadoClientes.addActionListener (new ButtonActionListener(this,"VerFormToolBarListadoClientes"));
		
		this.jMenuItemGuardarCambiosListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosListadoClientes"));
			
		this.jMenuItemCopiarListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemCopiarListadoClientes"));		
		
		this.jMenuItemVerFormListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemVerFormListadoClientes"));		
		
		
		this.jButtonGuardarCambiosTablaListadoClientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaListadoClientes"));
		
		
		this.jButtonGuardarCambiosTablaToolBarListadoClientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarListadoClientes"));
			
		this.jMenuItemGuardarCambiosTablaListadoClientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaListadoClientes"));		
		
		
		
		this.jButtonRecargarInformacionListadoClientes.addActionListener (new ButtonActionListener(this,"RecargarInformacionListadoClientes"));
					
		this.jButtonRecargarInformacionToolBarListadoClientes.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarListadoClientes"));
		
		this.jMenuItemRecargarInformacionListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionListadoClientes"));		
		
		
		
		this.jButtonAnterioresListadoClientes.addActionListener (new ButtonActionListener(this,"AnterioresListadoClientes"));
		
		
		this.jButtonAnterioresToolBarListadoClientes.addActionListener (new ButtonActionListener(this,"AnterioresToolBarListadoClientes"));
		
		this.jMenuItemAnterioresListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresListadoClientes"));		
		
		
		this.jButtonSiguientesListadoClientes.addActionListener (new ButtonActionListener(this,"SiguientesListadoClientes"));
		
		
		this.jButtonSiguientesToolBarListadoClientes.addActionListener (new ButtonActionListener(this,"SiguientesToolBarListadoClientes"));
			
		this.jMenuItemSiguientesListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesListadoClientes"));
			
		this.jMenuItemAbrirOrderByListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByListadoClientes"));
			
		this.jMenuItemMostrarOcultarListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarListadoClientes"));
			
		this.jMenuItemDetalleAbrirOrderByListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByListadoClientes"));
			
		this.jMenuItemDetalleMostarOcultarListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarListadoClientes"));		
		
		
		this.jButtonNuevoGuardarCambiosListadoClientes.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosListadoClientes"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarListadoClientes.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarListadoClientes"));
			
		this.jMenuItemNuevoGuardarCambiosListadoClientes.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosListadoClientes"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosListadoClientes.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosListadoClientes"));

		this.jCheckBoxSeleccionadosListadoClientes.addItemListener(new CheckBoxItemListener(this,"SeleccionadosListadoClientes"));
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoClientes.jComboBoxTiposAccionesFormularioListadoClientes.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioListadoClientes"));
		}
		
		
		this.jComboBoxTiposRelacionesListadoClientes.addActionListener (new ButtonActionListener(this,"TiposRelacionesListadoClientes"));
			
		this.jComboBoxTiposAccionesListadoClientes.addActionListener (new ButtonActionListener(this,"TiposAccionesListadoClientes"));
					
		this.jComboBoxTiposSeleccionarListadoClientes.addActionListener (new ButtonActionListener(this,"TiposSeleccionarListadoClientes"));
			
		this.jTextFieldValorCampoGeneralListadoClientes.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralListadoClientes"));		
		
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonidListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"idListadoClientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadoClientes.jButtonid_empresaListadoClientesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadoClientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonid_empresaListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonnombre_zonaListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonnombre_ciudadListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonnombre_grupo_clienteListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtoncodigoListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonnombreListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"nombreListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonapellidoListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"apellidoListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonrucListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"rucListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtontelefonosListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"telefonosListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtondireccionesListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"direccionesListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonemailsListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"emailsListadoClientesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaListadoClientesListadoClientes.addActionListener(new ButtonActionListener(this,"BusquedaListadoClientesListadoClientes"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoListadoClientes!=null) {
				this.jInternalFrameReporteDinamicoListadoClientes.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadoClientes"));
				this.jInternalFrameReporteDinamicoListadoClientes.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadoClientes"));
				this.jInternalFrameReporteDinamicoListadoClientes.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadoClientes"));
			}
			
			//this.jButtonCerrarReporteDinamicoListadoClientes.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadoClientes"));				
			//this.jButtonGenerarReporteDinamicoListadoClientes.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadoClientes"));
			//this.jButtonGenerarExcelReporteDinamicoListadoClientes.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadoClientes"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionListadoClientes!=null) {
				this.jInternalFrameImportacionListadoClientes.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionListadoClientes"));
				this.jInternalFrameImportacionListadoClientes.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionListadoClientes"));
				this.jInternalFrameImportacionListadoClientes.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionListadoClientes"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByListadoClientes.addActionListener (new ButtonActionListener(this,"AbrirOrderByListadoClientes"));
			
			this.jButtonAbrirOrderByToolBarListadoClientes.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarListadoClientes"));			
			
			if(this.jInternalFrameOrderByListadoClientes!=null) {
				this.jInternalFrameOrderByListadoClientes.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByListadoClientes"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormListadoClientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoClientes.jTabbedPaneRelacionesListadoClientes.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesListadoClientes"));
		
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
            		closingInternalFrameListadoClientes();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormListadoClientes.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormListadoClientes = (JInternalFrameBase)event.getSource();
	            	
	            ListadoClientesBeanSwingJInternalFrame jInternalFrameParent=(ListadoClientesBeanSwingJInternalFrame)jInternalFrameDetalleFormListadoClientes.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarListadoClientesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosListadoClientes.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosListadoClientesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosListadoClientes.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosListadoClientes.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoClientesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoClientesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoClientesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoListadoClientes";
		inputMap = this.jButtonNuevoListadoClientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoListadoClientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoListadoClientesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoClientesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoClientesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoClientesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesListadoClientes";
		inputMap = this.jButtonNuevoRelacionesListadoClientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesListadoClientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoListadoClientesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarListadoClientes";
		inputMap = this.jButtonModificarListadoClientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarListadoClientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarListadoClientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarListadoClientes";
		inputMap = this.jButtonActualizarListadoClientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarListadoClientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarListadoClientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarListadoClientes";
		inputMap = this.jButtonEliminarListadoClientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarListadoClientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarListadoClientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarListadoClientes";
		inputMap = this.jButtonCancelarListadoClientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarListadoClientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarListadoClientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarListadoClientes";
		inputMap = this.jButtonCerrarListadoClientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarListadoClientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarListadoClientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormListadoClientes.jButtonGuardarCambiosListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosListadoClientes";
		inputMap = this.jInternalFrameDetalleFormListadoClientes.jButtonGuardarCambiosListadoClientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormListadoClientes.jButtonGuardarCambiosListadoClientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosListadoClientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosListadoClientes.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosListadoClientesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesListadoClientes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesListadoClientesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarListadoClientes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarListadoClientesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralListadoClientes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralListadoClientesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonidListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"idListadoClientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadoClientes.jButtonid_empresaListadoClientesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadoClientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonid_empresaListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonnombre_zonaListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonnombre_ciudadListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonnombre_grupo_clienteListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtoncodigoListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonnombreListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"nombreListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonapellidoListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"apellidoListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonrucListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"rucListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtontelefonosListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"telefonosListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtondireccionesListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"direccionesListadoClientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoClientes.jButtonemailsListadoClientesBusqueda.addActionListener(new ButtonActionListener(this,"emailsListadoClientesBusqueda"));
		
		
		this.jButtonBusquedaListadoClientesListadoClientes.addActionListener(new ButtonActionListener(this,"BusquedaListadoClientesListadoClientes"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionListadoClientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionListadoClientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarListadoClientesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarListadoClientes.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosListadoClientes(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ListadoClientes listadoclientesAux:this.listadoclientesLogic.getListadoClientess()) {
					listadoclientesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadoClientes listadoclientesAux:listadoclientess) {
					listadoclientesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosListadoClientesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingListadoClientes(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ListadoClientes listadoclientesAux:this.listadoclientesLogic.getListadoClientess()) {
						listadoclientesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadoClientes listadoclientesAux:listadoclientess) {
						listadoclientesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ListadoClientes listadoclientesAux:this.listadoclientesLogic.getListadoClientess()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadoClientes listadoclientesAux:listadoclientess) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaListadoClientes(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosListadoClientes.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosListadoClientes.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosListadoClientes,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosListadoClientesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingListadoClientes(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosListadoClientes.getSelectedRows();
			
			ListadoClientes listadoclientesLocal=new ListadoClientes();
			
			//this.seleccionarTodosListadoClientes(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					listadoclientesLocal =(ListadoClientes) this.listadoclientesLogic.getListadoClientess().toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					listadoclientesLocal =(ListadoClientes) this.listadoclientess.toArray()[this.jTableDatosListadoClientes.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				listadoclientesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ListadoClientes listadoclientesAux:this.listadoclientesLogic.getListadoClientess()) {
						listadoclientesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadoClientes listadoclientesAux:listadoclientess) {
						listadoclientesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaListadoClientes(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosListadoClientes.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosListadoClientes.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosListadoClientes,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualListadoClientesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarListadoClientesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralListadoClientesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingListadoClientes(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralListadoClientes.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ListadoClientes listadoclientesAux:this.listadoclientesLogic.getListadoClientess()) {
				
						if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							listadoclientesAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							listadoclientesAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
							existe=true;
							listadoclientesAux.setnombre_grupo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							listadoclientesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							listadoclientesAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							listadoclientesAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_RUC)) {
							existe=true;
							listadoclientesAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_TELEFONOS)) {
							existe=true;
							listadoclientesAux.settelefonos(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_DIRECCIONES)) {
							existe=true;
							listadoclientesAux.setdirecciones(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_EMAILS)) {
							existe=true;
							listadoclientesAux.setemails(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadoClientes listadoclientesAux:listadoclientess) {
					
						if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							listadoclientesAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							listadoclientesAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
							existe=true;
							listadoclientesAux.setnombre_grupo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							listadoclientesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							listadoclientesAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							listadoclientesAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_RUC)) {
							existe=true;
							listadoclientesAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_TELEFONOS)) {
							existe=true;
							listadoclientesAux.settelefonos(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_DIRECCIONES)) {
							existe=true;
							listadoclientesAux.setdirecciones(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_EMAILS)) {
							existe=true;
							listadoclientesAux.setemails(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaListadoClientes(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesListadoClientesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingListadoClientes(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioListadoClientes=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesListadoClientes.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormListadoClientes.jComboBoxTiposAccionesFormularioListadoClientes.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteListadoClientes) {				
					conSplash=true;//false;										
					
					//this.startProcessListadoClientes(conSplash);
				
					this.generarReporteListadoClientessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadoClientes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadoClientes.jComboBoxTiposAccionesFormularioListadoClientes.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoListadoClientessSeleccionados();
				//this.jComboBoxTiposAccionesListadoClientes.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoListadoClientessSeleccionados(false);
				//this.jComboBoxTiposAccionesListadoClientes.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoListadoClientessSeleccionados(true);
				//this.jComboBoxTiposAccionesListadoClientes.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessListadoClientes();
				
				this.exportarListadoClientessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadoClientes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadoClientes.jComboBoxTiposAccionesFormularioListadoClientes.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionListadoClientess();
				//this.importarListadoClientess();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadoClientes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadoClientes.jComboBoxTiposAccionesFormularioListadoClientes.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessListadoClientes();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelListadoClientessSeleccionados();
				//this.jComboBoxTiposAccionesListadoClientes.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Listado Clientes", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessListadoClientes();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoListadoClientes)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyListadoClientes(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Listado Clientes",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadoClientes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadoClientes.jComboBoxTiposAccionesFormularioListadoClientes.setSelectedIndex(0);					
				}	
			} 			
			else if(ListadoClientesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteListadoClientes) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessListadoClientes(conSplash);
					
						//this.actualizarParametrosGeneralListadoClientes();
						
						this.generarReporteProcesoAccionListadoClientessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesListadoClientes.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormListadoClientes.jComboBoxTiposAccionesFormularioListadoClientes.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ListadoClientesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Listado ClientesES SELECCIONADOS?", "MANTENIMIENTO DE Listado Clientes", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessListadoClientes();
				
						this.actualizarParametrosGeneralListadoClientes();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.listadoclientesReturnGeneral=listadoclientesLogic.procesarAccionListadoClientessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.listadoclientesLogic.getListadoClientess(),this.listadoclientesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarListadoClientesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesListadoClientes.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormListadoClientes.jComboBoxTiposAccionesFormularioListadoClientes.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralListadoClientes();
					
					ListadoClientesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarListadoClientesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesListadoClientes.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormListadoClientes.jComboBoxTiposAccionesFormularioListadoClientes.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessListadoClientes(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesListadoClientesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessListadoClientes();
			
			if(this.jInternalFrameDetalleFormListadoClientes==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ListadoClientes> listadoclientessSeleccionados=new ArrayList<ListadoClientes>();		
			ListadoClientes listadoclientes=new ListadoClientes();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingListadoClientes(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesListadoClientes.getSelectedItem();
			
			
			
			
			listadoclientessSeleccionados=this.getListadoClientessSeleccionados(true);
			//this.sTipoAccion;
			
			if(listadoclientessSeleccionados.size()==1) {
				for(ListadoClientes listadoclientesAux:listadoclientessSeleccionados) {
					listadoclientes=listadoclientesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessListadoClientes();
			
      		//this.finishProcessListadoClientes(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarListadoClientesReturnGeneral() throws Exception {
		if(this.listadoclientesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.listadoclientesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.listadoclientesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.listadoclientesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.listadoclientesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.listadoclientesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingListadoClientes(false);
		}
		
		if(this.listadoclientesReturnGeneral.getConRetornoLista() || this.listadoclientesReturnGeneral.getConRetornoObjeto()) {
			if(this.listadoclientesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.listadoclientesLogic.setListadoClientess(this.listadoclientesReturnGeneral.getListadoClientess());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingListadoClientes(false);
		}
	}
	
	public void actualizarParametrosGeneralListadoClientes() throws Exception {
		
		
	}
	
	public ArrayList<ListadoClientes> getListadoClientessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ListadoClientes> listadoclientessSeleccionados=new ArrayList<ListadoClientes>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioListadoClientes) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ListadoClientes listadoclientesAux:listadoclientesLogic.getListadoClientess()) {
					if(listadoclientesAux.getIsSelected()) {
						listadoclientessSeleccionados.add(listadoclientesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadoClientes listadoclientesAux:this.listadoclientess) {
					if(listadoclientesAux.getIsSelected()) {
						listadoclientessSeleccionados.add(listadoclientesAux);				
					}
				}
			}
			
			if(listadoclientessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						listadoclientessSeleccionados.addAll(this.listadoclientesLogic.getListadoClientess());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						listadoclientessSeleccionados.addAll(this.listadoclientess);				
					}
				}
			}
		} else {
			listadoclientessSeleccionados.add(this.listadoclientes);
		}
		
		return listadoclientessSeleccionados;
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
	
	public void generarReporteListadoClientessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalListadoClientessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoListadoClientessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoListadoClientessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoListadoClientessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Listado Clientes",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesListadoClientessSeleccionados() throws Exception {
		ArrayList<ListadoClientes> listadoclientessSeleccionados=new ArrayList<ListadoClientes>();		
		
		listadoclientessSeleccionados=this.getListadoClientessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteListadoClientess("Todos",listadoclientessSeleccionados);
		
	}	
	
	public void generarReporteNormalListadoClientessSeleccionados() throws Exception {
		ArrayList<ListadoClientes> listadoclientessSeleccionados=new ArrayList<ListadoClientes>();		
		
		listadoclientessSeleccionados=this.getListadoClientessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteListadoClientess("Todos",listadoclientessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionListadoClientessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ListadoClientes> listadoclientessSeleccionados=new ArrayList<ListadoClientes>();
		
		listadoclientessSeleccionados=this.getListadoClientessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteListadoClientess("Todos",listadoclientessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoListadoClientessSeleccionados() throws Exception {
		ArrayList<ListadoClientes> listadoclientessSeleccionados=new ArrayList<ListadoClientes>();		
		
		
		this.abrirInicializarFrameReporteDinamicoListadoClientes();
		
		
		listadoclientessSeleccionados=this.getListadoClientessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoListadoClientes();
		
		
		//this.generarReporteListadoClientess("Todos",listadoclientessSeleccionados ,listadoclientesImplementable,listadoclientesImplementableHome);
	}
	
	public void mostrarImportacionListadoClientess() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionListadoClientes();
		
		this.abrirFrameImportacionListadoClientes();		
		
			
		//this.generarReporteListadoClientess("Todos",listadoclientessSeleccionados ,listadoclientesImplementable,listadoclientesImplementableHome);
	}
	
	public void importarListadoClientess() throws Exception {		
	
	}
	
	public void exportarListadoClientessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelListadoClientessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoListadoClientessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlListadoClientessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Listado Clientes",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoListadoClientessSeleccionados() throws Exception {
		ArrayList<ListadoClientes> listadoclientessSeleccionados=new ArrayList<ListadoClientes>();		
		
		listadoclientessSeleccionados=this.getListadoClientessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoclientes."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarListadoClientes(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ListadoClientes listadoclientesAux:listadoclientessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarListadoClientes(listadoclientesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//listadoclientesAux.setsDetalleGeneralEntityReporte(listadoclientesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoclientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Clientes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarListadoClientes(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ListadoClientesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoClientesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoClientesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoClientesConstantesFunciones.LABEL_NOMBREZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoClientesConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoClientesConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoClientesConstantesFunciones.LABEL_APELLIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoClientesConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoClientesConstantesFunciones.LABEL_TELEFONOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoClientesConstantesFunciones.LABEL_DIRECCIONES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoClientesConstantesFunciones.LABEL_EMAILS;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarListadoClientes(ListadoClientes listadoclientes,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=listadoclientes.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoclientes.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoclientes.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoclientes.getnombre_zona();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoclientes.getnombre_ciudad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoclientes.getnombre_grupo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoclientes.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoclientes.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoclientes.getapellido();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoclientes.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoclientes.gettelefonos();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoclientes.getdirecciones();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoclientes.getemails();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelListadoClientessSeleccionados() throws Exception {
		ArrayList<ListadoClientes> listadoclientessSeleccionados=new ArrayList<ListadoClientes>();		
		
		listadoclientessSeleccionados=this.getListadoClientessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoclientes.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ListadoClientess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelListadoClientes(row);				
				iRow++;
			}				
			
			for(ListadoClientes listadoclientesAux:listadoclientessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelListadoClientes(listadoclientesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoclientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Clientes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlListadoClientessSeleccionados() throws Exception {
		ArrayList<ListadoClientes> listadoclientessSeleccionados=new ArrayList<ListadoClientes>();		
		
		listadoclientessSeleccionados=this.getListadoClientessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoclientes.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("listadoclientess");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("listadoclientes");
			//elementRoot.appendChild(element);
		
			for(ListadoClientes listadoclientesAux:listadoclientessSeleccionados) {
				element = document.createElement("listadoclientes");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlListadoClientes(listadoclientesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoclientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Clientes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelListadoClientes(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_NOMBREZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_APELLIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_TELEFONOS);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_DIRECCIONES);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoClientesConstantesFunciones.LABEL_EMAILS);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelListadoClientes(ListadoClientes listadoclientes,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(listadoclientes.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoclientes.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoclientes.getnombre_zona());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoclientes.getnombre_ciudad());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoclientes.getnombre_grupo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoclientes.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoclientes.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoclientes.getapellido());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoclientes.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoclientes.gettelefonos());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoclientes.getdirecciones());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoclientes.getemails());				
	}
	
	public void setFilaDatosExportarXmlListadoClientes(ListadoClientes listadoclientes,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ListadoClientesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(listadoclientes.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ListadoClientesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(listadoclientes.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ListadoClientesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(listadoclientes.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre_zona = document.createElement(ListadoClientesConstantesFunciones.NOMBREZONA);
		elementnombre_zona.appendChild(document.createTextNode(listadoclientes.getnombre_zona().trim()));
		element.appendChild(elementnombre_zona);

		Element elementnombre_ciudad = document.createElement(ListadoClientesConstantesFunciones.NOMBRECIUDAD);
		elementnombre_ciudad.appendChild(document.createTextNode(listadoclientes.getnombre_ciudad().trim()));
		element.appendChild(elementnombre_ciudad);

		Element elementnombre_grupo_cliente = document.createElement(ListadoClientesConstantesFunciones.NOMBREGRUPOCLIENTE);
		elementnombre_grupo_cliente.appendChild(document.createTextNode(listadoclientes.getnombre_grupo_cliente().trim()));
		element.appendChild(elementnombre_grupo_cliente);

		Element elementcodigo = document.createElement(ListadoClientesConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(listadoclientes.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ListadoClientesConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(listadoclientes.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementapellido = document.createElement(ListadoClientesConstantesFunciones.APELLIDO);
		elementapellido.appendChild(document.createTextNode(listadoclientes.getapellido().trim()));
		element.appendChild(elementapellido);

		Element elementruc = document.createElement(ListadoClientesConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(listadoclientes.getruc().trim()));
		element.appendChild(elementruc);

		Element elementtelefonos = document.createElement(ListadoClientesConstantesFunciones.TELEFONOS);
		elementtelefonos.appendChild(document.createTextNode(listadoclientes.gettelefonos().trim()));
		element.appendChild(elementtelefonos);

		Element elementdirecciones = document.createElement(ListadoClientesConstantesFunciones.DIRECCIONES);
		elementdirecciones.appendChild(document.createTextNode(listadoclientes.getdirecciones().trim()));
		element.appendChild(elementdirecciones);

		Element elementemails = document.createElement(ListadoClientesConstantesFunciones.EMAILS);
		elementemails.appendChild(document.createTextNode(listadoclientes.getemails().trim()));
		element.appendChild(elementemails);
	}
	
	public void generarReporteGroupGenericoListadoClientessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ListadoClientes> listadoclientessSeleccionados=new ArrayList<ListadoClientes>();
		
		listadoclientessSeleccionados=this.getListadoClientessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoListadoClientes(listadoclientessSeleccionados);
		
		this.generarReporteListadoClientess("Todos",listadoclientessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoListadoClientes(ArrayList<ListadoClientes> listadoclientessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ListadoClientes listadoclientesAux:listadoclientessSeleccionados) {
				listadoclientesAux.setsDetalleGeneralEntityReporte(listadoclientesAux.toString());
			
				if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					listadoclientesAux.setsDescripcionGeneralEntityReporte1(listadoclientesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_NOMBREZONA)) {
					existe=true;
					listadoclientesAux.setsDescripcionGeneralEntityReporte1(listadoclientesAux.getnombre_zona());
				}
				 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD)) {
					existe=true;
					listadoclientesAux.setsDescripcionGeneralEntityReporte1(listadoclientesAux.getnombre_ciudad());
				}
				 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
					existe=true;
					listadoclientesAux.setsDescripcionGeneralEntityReporte1(listadoclientesAux.getnombre_grupo_cliente());
				}
				 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					listadoclientesAux.setsDescripcionGeneralEntityReporte1(listadoclientesAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					listadoclientesAux.setsDescripcionGeneralEntityReporte1(listadoclientesAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_APELLIDO)) {
					existe=true;
					listadoclientesAux.setsDescripcionGeneralEntityReporte1(listadoclientesAux.getapellido());
				}
				 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_RUC)) {
					existe=true;
					listadoclientesAux.setsDescripcionGeneralEntityReporte1(listadoclientesAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_TELEFONOS)) {
					existe=true;
					listadoclientesAux.setsDescripcionGeneralEntityReporte1(listadoclientesAux.gettelefonos());
				}
				 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_DIRECCIONES)) {
					existe=true;
					listadoclientesAux.setsDescripcionGeneralEntityReporte1(listadoclientesAux.getdirecciones());
				}
				 else if(sTipoSeleccionar.equals(ListadoClientesConstantesFunciones.LABEL_EMAILS)) {
					existe=true;
					listadoclientesAux.setsDescripcionGeneralEntityReporte1(listadoclientesAux.getemails());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoClientesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesListadoClientes(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoListadoClientes=true;
				this.isVisibilidadCeldaNuevoRelacionesListadoClientes=true;
				this.isVisibilidadCeldaGuardarCambiosListadoClientes=true;
			}
			
			this.isVisibilidadCeldaModificarListadoClientes=false;
			this.isVisibilidadCeldaActualizarListadoClientes=false;
			this.isVisibilidadCeldaEliminarListadoClientes=false;
			this.isVisibilidadCeldaCancelarListadoClientes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoClientes=true;
				} else {
					this.isVisibilidadCeldaGuardarListadoClientes=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoListadoClientes=false;
			this.isVisibilidadCeldaNuevoRelacionesListadoClientes=false;
			this.isVisibilidadCeldaGuardarCambiosListadoClientes=false;
			this.isVisibilidadCeldaModificarListadoClientes=false;
			this.isVisibilidadCeldaActualizarListadoClientes=true;
			this.isVisibilidadCeldaEliminarListadoClientes=false;
			this.isVisibilidadCeldaCancelarListadoClientes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoClientes=true;
				} else {
					this.isVisibilidadCeldaGuardarListadoClientes=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoListadoClientes=false;
			this.isVisibilidadCeldaNuevoRelacionesListadoClientes=false;
			this.isVisibilidadCeldaGuardarCambiosListadoClientes=false;
			this.isVisibilidadCeldaModificarListadoClientes=false;
			this.isVisibilidadCeldaActualizarListadoClientes=true;
			this.isVisibilidadCeldaEliminarListadoClientes=true;
			this.isVisibilidadCeldaCancelarListadoClientes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoClientes=true;
				} else {
					this.isVisibilidadCeldaGuardarListadoClientes=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoListadoClientes=false;
			this.isVisibilidadCeldaNuevoRelacionesListadoClientes=false;
			this.isVisibilidadCeldaGuardarCambiosListadoClientes=false;
			this.isVisibilidadCeldaModificarListadoClientes=false;
			this.isVisibilidadCeldaActualizarListadoClientes=true;
			this.isVisibilidadCeldaEliminarListadoClientes=false;
			this.isVisibilidadCeldaCancelarListadoClientes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoClientes=false;
				} else {
					this.isVisibilidadCeldaGuardarListadoClientes=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoListadoClientes=true;
			this.isVisibilidadCeldaNuevoRelacionesListadoClientes=true;
			this.isVisibilidadCeldaGuardarCambiosListadoClientes=true;
			this.isVisibilidadCeldaModificarListadoClientes=false;
			this.isVisibilidadCeldaActualizarListadoClientes=false;
			this.isVisibilidadCeldaEliminarListadoClientes=false;
			this.isVisibilidadCeldaCancelarListadoClientes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoClientes=true;
				} else {
					this.isVisibilidadCeldaGuardarListadoClientes=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoListadoClientes=false;
			this.isVisibilidadCeldaNuevoRelacionesListadoClientes=false;
			this.isVisibilidadCeldaGuardarCambiosListadoClientes=false;
			this.isVisibilidadCeldaActualizarListadoClientes=false;
			this.isVisibilidadCeldaEliminarListadoClientes=false;
			this.isVisibilidadCeldaCancelarListadoClientes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoClientes=false;
				} else {
					this.isVisibilidadCeldaGuardarListadoClientes=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoListadoClientes=false;
			this.isVisibilidadCeldaNuevoRelacionesListadoClientes=false;
			this.isVisibilidadCeldaGuardarCambiosListadoClientes=false;
			this.isVisibilidadCeldaModificarListadoClientes=true;
			this.isVisibilidadCeldaActualizarListadoClientes=false;
			this.isVisibilidadCeldaEliminarListadoClientes=false;
			this.isVisibilidadCeldaCancelarListadoClientes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoClientes=false;
				} else {
					this.isVisibilidadCeldaGuardarListadoClientes=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ListadoClientesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoListadoClientes=true;
			this.isVisibilidadCeldaNuevoRelacionesListadoClientes=true;
			this.isVisibilidadCeldaGuardarCambiosListadoClientes=true;
		} else {
			this.actualizarEstadoPanelsListadoClientes(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarListadoClientes=false;
			//this.isVisibilidadCeldaVerFormListadoClientes=false;
			this.isVisibilidadCeldaDuplicarListadoClientes=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!listadoclientesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesListadoClientes=false;
		} else {
			this.isVisibilidadCeldaNuevoListadoClientes=false;
			this.isVisibilidadCeldaGuardarCambiosListadoClientes=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(listadoclientesSessionBean.getEsGuardarRelacionado()) {
			if(!listadoclientesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesListadoClientes=false;												
			}
			
			this.jButtonCerrarListadoClientes.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesListadoClientes=false;
		}
		
		if(!this.permiteMantenimiento(this.listadoclientes)) {
			this.isVisibilidadCeldaActualizarListadoClientes=false;
			this.isVisibilidadCeldaEliminarListadoClientes=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoListadoClientes=false;
		this.isVisibilidadCeldaNuevoRelacionesListadoClientes=false;
		this.isVisibilidadCeldaGuardarCambiosListadoClientes=false;
		//this.isVisibilidadCeldaModificarListadoClientes=true;
		this.isVisibilidadCeldaActualizarListadoClientes=false;
		this.isVisibilidadCeldaEliminarListadoClientes=false;
		//this.isVisibilidadCeldaCancelarListadoClientes=true;			
		this.isVisibilidadCeldaGuardarListadoClientes=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesListadoClientes() {
	}
	
	public void actualizarEstadoPanelsListadoClientes(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionListadoClientes!=null) {
				this.jScrollPanelDatosEdicionListadoClientes.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoClientes!=null) {
				this.jTabbedPaneBusquedasListadoClientes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadoClientes!=null) {
				this.jScrollPanelDatosListadoClientes.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadoClientes!=null) {
				this.jPanelPaginacionListadoClientes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadoClientes!=null) {
				this.jPanelParametrosReportesListadoClientes.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionListadoClientes!=null) {
				this.jScrollPanelDatosEdicionListadoClientes.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoClientes!=null) {
				this.jTabbedPaneBusquedasListadoClientes.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosListadoClientes!=null) {
				this.jScrollPanelDatosListadoClientes.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadoClientes!=null) {
				this.jPanelPaginacionListadoClientes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadoClientes!=null) {
				this.jPanelParametrosReportesListadoClientes.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionListadoClientes!=null) {
				this.jScrollPanelDatosEdicionListadoClientes.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoClientes!=null) {
				this.jTabbedPaneBusquedasListadoClientes.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosListadoClientes!=null) {
				this.jScrollPanelDatosListadoClientes.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadoClientes!=null) {
				this.jPanelPaginacionListadoClientes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadoClientes!=null) {
				this.jPanelParametrosReportesListadoClientes.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionListadoClientes!=null) {
				this.jScrollPanelDatosEdicionListadoClientes.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoClientes!=null) {
				this.jTabbedPaneBusquedasListadoClientes.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosListadoClientes!=null) {
				this.jScrollPanelDatosListadoClientes.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadoClientes!=null) {
				this.jPanelPaginacionListadoClientes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadoClientes!=null) {
				this.jPanelParametrosReportesListadoClientes.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionListadoClientes!=null) {
				this.jScrollPanelDatosEdicionListadoClientes.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoClientes!=null) {
				this.jTabbedPaneBusquedasListadoClientes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadoClientes!=null) {
				this.jScrollPanelDatosListadoClientes.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadoClientes!=null) {
				this.jPanelPaginacionListadoClientes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadoClientes!=null) {
				this.jPanelParametrosReportesListadoClientes.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionListadoClientes!=null) {
				this.jScrollPanelDatosEdicionListadoClientes.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoClientes!=null) {
				this.jTabbedPaneBusquedasListadoClientes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadoClientes!=null) {
				this.jScrollPanelDatosListadoClientes.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadoClientes!=null) {
				this.jPanelPaginacionListadoClientes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadoClientes!=null) {
				this.jPanelParametrosReportesListadoClientes.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionListadoClientes!=null) {
				this.jScrollPanelDatosEdicionListadoClientes.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoClientes!=null) {
				this.jTabbedPaneBusquedasListadoClientes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadoClientes!=null) {
				this.jScrollPanelDatosListadoClientes.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadoClientes!=null) {
				this.jPanelPaginacionListadoClientes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadoClientes!=null) {
				this.jPanelParametrosReportesListadoClientes.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasListadoClientes!=null) {
					this.jTabbedPaneBusquedasListadoClientes.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesListadoClientes!=null) {
				this.jPanelParametrosReportesListadoClientes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoClientes!=null) {
				this.jTabbedPaneBusquedasListadoClientes.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesListadoClientes!=null) {
				this.jPanelParametrosReportesListadoClientes.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaListadoClientes=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaListadoClientes) {this.jTabbedPaneBusquedasListadoClientes.remove(jPanelBusquedaListadoClientesListadoClientes);}
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
			
			this.inicializarActualizarBindingTablaListadoClientes(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioListadoClientes() {
		this.updateBorderResaltarBusquedasFormularioListadoClientes();
		this.updateVisibilidadBusquedasFormularioListadoClientes();
		this.updateHabilitarBusquedasFormularioListadoClientes();
	}
	
	public void updateBorderResaltarBusquedasFormularioListadoClientes() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasListadoClientes.getComponents().length>0) {
	

		if(this.listadoclientesConstantesFunciones.resaltarBusquedaListadoClientesListadoClientes!=null) {
			index= this.jTabbedPaneBusquedasListadoClientes.indexOfComponent(this.jPanelBusquedaListadoClientesListadoClientes);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasListadoClientes.getComponent(index);
				jPanel.setBorder(this.listadoclientesConstantesFunciones.resaltarBusquedaListadoClientesListadoClientes);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioListadoClientes() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasListadoClientes.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasListadoClientes.indexOfComponent(this.jPanelBusquedaListadoClientesListadoClientes);
			jPanel=(JPanel)this.jTabbedPaneBusquedasListadoClientes.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.listadoclientesConstantesFunciones.mostrarBusquedaListadoClientesListadoClientes);
			if(!this.listadoclientesConstantesFunciones.mostrarBusquedaListadoClientesListadoClientes && index>-1) {
				this.jTabbedPaneBusquedasListadoClientes.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioListadoClientes() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasListadoClientes.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasListadoClientes.indexOfComponent(this.jPanelBusquedaListadoClientesListadoClientes);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasListadoClientes.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.listadoclientesConstantesFunciones.activarBusquedaListadoClientesListadoClientes);
				this.jTabbedPaneBusquedasListadoClientes.setEnabledAt(index,this.listadoclientesConstantesFunciones.activarBusquedaListadoClientesListadoClientes);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaListadoClientes(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaListadoClientes")) {
			index= this.jTabbedPaneBusquedasListadoClientes.indexOfComponent(this.jPanelBusquedaListadoClientesListadoClientes);

			this.jTabbedPaneBusquedasListadoClientes.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasListadoClientes.getComponent(index);

			this.listadoclientesConstantesFunciones.setResaltarBusquedaListadoClientesListadoClientes(resaltar);

			jPanel.setBorder(this.listadoclientesConstantesFunciones.resaltarBusquedaListadoClientesListadoClientes);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarListadoClientes.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioListadoClientes() throws Exception {

		if(this.jInternalFrameDetalleFormListadoClientes==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioListadoClientes();
		this.updateVisibilidadResaltarControlesFormularioListadoClientes();
		this.updateHabilitarResaltarControlesFormularioListadoClientes();
		
	}
	
	public void updateBorderResaltarControlesFormularioListadoClientes() throws Exception {
		if(this.jInternalFrameDetalleFormListadoClientes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.listadoclientesConstantesFunciones.resaltaridListadoClientes!=null && this.jInternalFrameDetalleFormListadoClientes!=null) {this.jInternalFrameDetalleFormListadoClientes.jLabelidListadoClientes.setBorder(this.listadoclientesConstantesFunciones.resaltaridListadoClientes);}
		if(this.listadoclientesConstantesFunciones.resaltarid_empresaListadoClientes!=null && this.jInternalFrameDetalleFormListadoClientes!=null) {this.jInternalFrameDetalleFormListadoClientes.jComboBoxid_empresaListadoClientes.setBorder(this.listadoclientesConstantesFunciones.resaltarid_empresaListadoClientes);}
		if(this.listadoclientesConstantesFunciones.resaltarnombre_zonaListadoClientes!=null && this.jInternalFrameDetalleFormListadoClientes!=null) {this.jInternalFrameDetalleFormListadoClientes.jTextFieldnombre_zonaListadoClientes.setBorder(this.listadoclientesConstantesFunciones.resaltarnombre_zonaListadoClientes);}
		if(this.listadoclientesConstantesFunciones.resaltarnombre_ciudadListadoClientes!=null && this.jInternalFrameDetalleFormListadoClientes!=null) {this.jInternalFrameDetalleFormListadoClientes.jTextAreanombre_ciudadListadoClientes.setBorder(this.listadoclientesConstantesFunciones.resaltarnombre_ciudadListadoClientes);}
		if(this.listadoclientesConstantesFunciones.resaltarnombre_grupo_clienteListadoClientes!=null && this.jInternalFrameDetalleFormListadoClientes!=null) {this.jInternalFrameDetalleFormListadoClientes.jTextAreanombre_grupo_clienteListadoClientes.setBorder(this.listadoclientesConstantesFunciones.resaltarnombre_grupo_clienteListadoClientes);}
		if(this.listadoclientesConstantesFunciones.resaltarcodigoListadoClientes!=null && this.jInternalFrameDetalleFormListadoClientes!=null) {this.jInternalFrameDetalleFormListadoClientes.jTextFieldcodigoListadoClientes.setBorder(this.listadoclientesConstantesFunciones.resaltarcodigoListadoClientes);}
		if(this.listadoclientesConstantesFunciones.resaltarnombreListadoClientes!=null && this.jInternalFrameDetalleFormListadoClientes!=null) {this.jInternalFrameDetalleFormListadoClientes.jTextAreanombreListadoClientes.setBorder(this.listadoclientesConstantesFunciones.resaltarnombreListadoClientes);}
		if(this.listadoclientesConstantesFunciones.resaltarapellidoListadoClientes!=null && this.jInternalFrameDetalleFormListadoClientes!=null) {this.jInternalFrameDetalleFormListadoClientes.jTextAreaapellidoListadoClientes.setBorder(this.listadoclientesConstantesFunciones.resaltarapellidoListadoClientes);}
		if(this.listadoclientesConstantesFunciones.resaltarrucListadoClientes!=null && this.jInternalFrameDetalleFormListadoClientes!=null) {this.jInternalFrameDetalleFormListadoClientes.jTextFieldrucListadoClientes.setBorder(this.listadoclientesConstantesFunciones.resaltarrucListadoClientes);}
		if(this.listadoclientesConstantesFunciones.resaltartelefonosListadoClientes!=null && this.jInternalFrameDetalleFormListadoClientes!=null) {this.jInternalFrameDetalleFormListadoClientes.jTextAreatelefonosListadoClientes.setBorder(this.listadoclientesConstantesFunciones.resaltartelefonosListadoClientes);}
		if(this.listadoclientesConstantesFunciones.resaltardireccionesListadoClientes!=null && this.jInternalFrameDetalleFormListadoClientes!=null) {this.jInternalFrameDetalleFormListadoClientes.jTextAreadireccionesListadoClientes.setBorder(this.listadoclientesConstantesFunciones.resaltardireccionesListadoClientes);}
		if(this.listadoclientesConstantesFunciones.resaltaremailsListadoClientes!=null && this.jInternalFrameDetalleFormListadoClientes!=null) {this.jInternalFrameDetalleFormListadoClientes.jTextAreaemailsListadoClientes.setBorder(this.listadoclientesConstantesFunciones.resaltaremailsListadoClientes);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioListadoClientes() throws Exception {		
		if(this.jInternalFrameDetalleFormListadoClientes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) {
	
		//this.jInternalFrameDetalleFormListadoClientes.jLabelidListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostraridListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jPanelidListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostraridListadoClientes);
		//this.jInternalFrameDetalleFormListadoClientes.jComboBoxid_empresaListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrarid_empresaListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jPanelid_empresaListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrarid_empresaListadoClientes);
		//this.jInternalFrameDetalleFormListadoClientes.jTextFieldnombre_zonaListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrarnombre_zonaListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jPanelnombre_zonaListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrarnombre_zonaListadoClientes);
		//this.jInternalFrameDetalleFormListadoClientes.jTextAreanombre_ciudadListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrarnombre_ciudadListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jPanelnombre_ciudadListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrarnombre_ciudadListadoClientes);
		//this.jInternalFrameDetalleFormListadoClientes.jTextAreanombre_grupo_clienteListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrarnombre_grupo_clienteListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jPanelnombre_grupo_clienteListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrarnombre_grupo_clienteListadoClientes);
		//this.jInternalFrameDetalleFormListadoClientes.jTextFieldcodigoListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrarcodigoListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jPanelcodigoListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrarcodigoListadoClientes);
		//this.jInternalFrameDetalleFormListadoClientes.jTextAreanombreListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrarnombreListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jPanelnombreListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrarnombreListadoClientes);
		//this.jInternalFrameDetalleFormListadoClientes.jTextAreaapellidoListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrarapellidoListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jPanelapellidoListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrarapellidoListadoClientes);
		//this.jInternalFrameDetalleFormListadoClientes.jTextFieldrucListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrarrucListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jPanelrucListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrarrucListadoClientes);
		//this.jInternalFrameDetalleFormListadoClientes.jTextAreatelefonosListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrartelefonosListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jPaneltelefonosListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrartelefonosListadoClientes);
		//this.jInternalFrameDetalleFormListadoClientes.jTextAreadireccionesListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrardireccionesListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jPaneldireccionesListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostrardireccionesListadoClientes);
		//this.jInternalFrameDetalleFormListadoClientes.jTextAreaemailsListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostraremailsListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jPanelemailsListadoClientes.setVisible(this.listadoclientesConstantesFunciones.mostraremailsListadoClientes);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioListadoClientes() throws Exception {
		if(this.jInternalFrameDetalleFormListadoClientes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormListadoClientes!=null) {
	
		this.jInternalFrameDetalleFormListadoClientes.jLabelidListadoClientes.setEnabled(this.listadoclientesConstantesFunciones.activaridListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jComboBoxid_empresaListadoClientes.setEnabled(this.listadoclientesConstantesFunciones.activarid_empresaListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextFieldnombre_zonaListadoClientes.setEnabled(this.listadoclientesConstantesFunciones.activarnombre_zonaListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextAreanombre_ciudadListadoClientes.setEnabled(this.listadoclientesConstantesFunciones.activarnombre_ciudadListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextAreanombre_grupo_clienteListadoClientes.setEnabled(this.listadoclientesConstantesFunciones.activarnombre_grupo_clienteListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextFieldcodigoListadoClientes.setEnabled(this.listadoclientesConstantesFunciones.activarcodigoListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextAreanombreListadoClientes.setEnabled(this.listadoclientesConstantesFunciones.activarnombreListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextAreaapellidoListadoClientes.setEnabled(this.listadoclientesConstantesFunciones.activarapellidoListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextFieldrucListadoClientes.setEnabled(this.listadoclientesConstantesFunciones.activarrucListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextAreatelefonosListadoClientes.setEnabled(this.listadoclientesConstantesFunciones.activartelefonosListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextAreadireccionesListadoClientes.setEnabled(this.listadoclientesConstantesFunciones.activardireccionesListadoClientes);
		this.jInternalFrameDetalleFormListadoClientes.jTextAreaemailsListadoClientes.setEnabled(this.listadoclientesConstantesFunciones.activaremailsListadoClientes);
		}
	}
	
		
}