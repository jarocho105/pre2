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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.contabilidad.util.ListadosCentrosActividadesConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.ListadosCentrosActividadesParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.ListadosCentrosActividadesParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.ListadosCentrosActividadesBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.contabilidad.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.contabilidad.util.*;

import com.bydan.erp.contabilidad.util.report.*;
import com.bydan.erp.contabilidad.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.report.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;

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
public class ListadosCentrosActividadesBeanSwingJInternalFrame extends ListadosCentrosActividadesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ListadosCentrosActividadesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ListadosCentrosActividades> listadoscentrosactividadesValidator = new ClassValidator<ListadosCentrosActividades>(ListadosCentrosActividades.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ListadosCentrosActividades listadoscentrosactividades;	
	public ListadosCentrosActividades listadoscentrosactividadesAux;
	public ListadosCentrosActividades listadoscentrosactividadesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ListadosCentrosActividades listadoscentrosactividadesTotales;
	public Long idListadosCentrosActividadesActual;
	public Long iIdNuevoListadosCentrosActividades=0L;
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
	
	public Boolean isPermisoTodoListadosCentrosActividades;
	public Boolean isPermisoNuevoListadosCentrosActividades;
	public Boolean isPermisoActualizarListadosCentrosActividades;
	public Boolean isPermisoActualizarOriginalListadosCentrosActividades;
	public Boolean isPermisoEliminarListadosCentrosActividades;
	public Boolean isPermisoGuardarCambiosListadosCentrosActividades;
	public Boolean isPermisoConsultaListadosCentrosActividades;
	public Boolean isPermisoBusquedaListadosCentrosActividades;
	public Boolean isPermisoReporteListadosCentrosActividades;
	public Boolean isPermisoPaginacionMedioListadosCentrosActividades;
	public Boolean isPermisoPaginacionAltoListadosCentrosActividades;
	public Boolean isPermisoPaginacionTodoListadosCentrosActividades;
	public Boolean isPermisoCopiarListadosCentrosActividades;
	public Boolean isPermisoVerFormListadosCentrosActividades;
	public Boolean isPermisoDuplicarListadosCentrosActividades;
	public Boolean isPermisoOrdenListadosCentrosActividades;
	
	
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
	
	public ListadosCentrosActividadesParameterReturnGeneral listadoscentrosactividadesReturnGeneral;
	public ListadosCentrosActividadesParameterReturnGeneral listadoscentrosactividadesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoListadosCentrosActividades=false;
	public Boolean esParaAccionDesdeFormularioListadosCentrosActividades=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ListadosCentrosActividadesSessionBeanAdditional listadoscentrosactividadesSessionBeanAdditional=null;
	
	public ListadosCentrosActividadesSessionBeanAdditional getListadosCentrosActividadesSessionBeanAdditional() {
		return this.listadoscentrosactividadesSessionBeanAdditional;
	}
	
	public void setListadosCentrosActividadesSessionBeanAdditional(ListadosCentrosActividadesSessionBeanAdditional listadoscentrosactividadesSessionBeanAdditional) {
		try {
			this.listadoscentrosactividadesSessionBeanAdditional=listadoscentrosactividadesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ListadosCentrosActividadesBeanSwingJInternalFrameAdditional listadoscentrosactividadesBeanSwingJInternalFrameAdditional=null;
	//public class ListadosCentrosActividadesBeanSwingJInternalFrame
	
	public ListadosCentrosActividadesBeanSwingJInternalFrameAdditional getListadosCentrosActividadesBeanSwingJInternalFrameAdditional() {
		return this.listadoscentrosactividadesBeanSwingJInternalFrameAdditional;
	}
	
	public void setListadosCentrosActividadesBeanSwingJInternalFrameAdditional(ListadosCentrosActividadesBeanSwingJInternalFrameAdditional listadoscentrosactividadesBeanSwingJInternalFrameAdditional) {
		try {
			this.listadoscentrosactividadesBeanSwingJInternalFrameAdditional=listadoscentrosactividadesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ListadosCentrosActividadesLogic listadoscentrosactividadesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ListadosCentrosActividades listadoscentrosactividadesBean;
	public ListadosCentrosActividadesConstantesFunciones listadoscentrosactividadesConstantesFunciones;
	//public ListadosCentrosActividadesParameterReturnGeneral listadoscentrosactividadesReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ListadosCentrosActividades> listadoscentrosactividadess;	
	//public List<ListadosCentrosActividades> listadoscentrosactividadessEliminados;
	//public List<ListadosCentrosActividades> listadoscentrosactividadessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoListadosCentrosActividades=false;
	public Boolean isVisibilidadCeldaDuplicarListadosCentrosActividades=true;
	public Boolean isVisibilidadCeldaCopiarListadosCentrosActividades=true;
	public Boolean isVisibilidadCeldaVerFormListadosCentrosActividades=true;
	public Boolean isVisibilidadCeldaOrdenListadosCentrosActividades=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades=false;
	public Boolean isVisibilidadCeldaModificarListadosCentrosActividades=false;
	public Boolean isVisibilidadCeldaActualizarListadosCentrosActividades=false;
	public Boolean isVisibilidadCeldaEliminarListadosCentrosActividades=false;
	public Boolean isVisibilidadCeldaCancelarListadosCentrosActividades=false;
	public Boolean isVisibilidadCeldaGuardarListadosCentrosActividades=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosListadosCentrosActividades=false;	
	
	
	public Boolean isVisibilidadBusquedaListadosCentrosActividades=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoListadosCentrosActividades() {
		return this.iIdNuevoListadosCentrosActividades;
	}

	public void setiIdNuevoListadosCentrosActividades(Long iIdNuevoListadosCentrosActividades) {
		this.iIdNuevoListadosCentrosActividades = iIdNuevoListadosCentrosActividades;
	}
	
	public Long getidListadosCentrosActividadesActual() {
		return this.idListadosCentrosActividadesActual;
	}

	public void setidListadosCentrosActividadesActual(Long idListadosCentrosActividadesActual) {
		this.idListadosCentrosActividadesActual = idListadosCentrosActividadesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ListadosCentrosActividades getlistadoscentrosactividades() {
		return this.listadoscentrosactividades;
	}

	public void setlistadoscentrosactividades(ListadosCentrosActividades listadoscentrosactividades) {
		this.listadoscentrosactividades = listadoscentrosactividades;
	}
	
	public ListadosCentrosActividades getlistadoscentrosactividadesAux() {
		return this.listadoscentrosactividadesAux;
	}

	public void setlistadoscentrosactividadesAux(ListadosCentrosActividades listadoscentrosactividadesAux) {
		this.listadoscentrosactividadesAux = listadoscentrosactividadesAux;
	}				
	
	public ListadosCentrosActividades getlistadoscentrosactividadesAnterior() {
		return this.listadoscentrosactividadesAnterior;
	}

	public void setlistadoscentrosactividadesAnterior(ListadosCentrosActividades listadoscentrosactividadesAnterior) {
		this.listadoscentrosactividadesAnterior = listadoscentrosactividadesAnterior;
	}	
	
	public ListadosCentrosActividades getlistadoscentrosactividadesTotales() {
		return this.listadoscentrosactividadesTotales;
	}

	public void setlistadoscentrosactividadesTotales(ListadosCentrosActividades listadoscentrosactividadesTotales) {
		this.listadoscentrosactividadesTotales = listadoscentrosactividadesTotales;
	}	
	
	public ListadosCentrosActividades getlistadoscentrosactividadesBean() {
		return this.listadoscentrosactividadesBean;
	}

	public void setlistadoscentrosactividadesBean(ListadosCentrosActividades listadoscentrosactividadesBean) {
		this.listadoscentrosactividadesBean = listadoscentrosactividadesBean;
	}	
	
	public ListadosCentrosActividadesParameterReturnGeneral getlistadoscentrosactividadesReturnGeneral() {
		return this.listadoscentrosactividadesReturnGeneral;
	}

	public void setlistadoscentrosactividadesReturnGeneral(ListadosCentrosActividadesParameterReturnGeneral listadoscentrosactividadesReturnGeneral) {
		this.listadoscentrosactividadesReturnGeneral = listadoscentrosactividadesReturnGeneral;
	}	
	
	
	public Long idBusquedaListadosCentrosActividades=0L;

	public Long getidBusquedaListadosCentrosActividades() {
		return this.idBusquedaListadosCentrosActividades;
	}

	public void setidBusquedaListadosCentrosActividades(Long idBusquedaListadosCentrosActividades) {
		this.idBusquedaListadosCentrosActividades = idBusquedaListadosCentrosActividades;
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
	
	
	public ListadosCentrosActividadesLogic getListadosCentrosActividadesLogic()	{		
		return listadoscentrosactividadesLogic;
	}

	public void setListadosCentrosActividadesLogic(ListadosCentrosActividadesLogic listadoscentrosactividadesLogic) {
		this.listadoscentrosactividadesLogic = listadoscentrosactividadesLogic;
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
	
	public Boolean getIsEsNuevoListadosCentrosActividades() {
		return isEsNuevoListadosCentrosActividades;
	}

	public void setIsEsNuevoListadosCentrosActividades(Boolean isEsNuevoListadosCentrosActividades) {
		this.isEsNuevoListadosCentrosActividades = isEsNuevoListadosCentrosActividades;
	}

	public Boolean getEsParaAccionDesdeFormularioListadosCentrosActividades() {
		return esParaAccionDesdeFormularioListadosCentrosActividades;
	}
	
	public void setEsParaAccionDesdeFormularioListadosCentrosActividades(Boolean esParaAccionDesdeFormularioListadosCentrosActividades) {
		this.esParaAccionDesdeFormularioListadosCentrosActividades = esParaAccionDesdeFormularioListadosCentrosActividades;
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

			if(this.listadoscentrosactividadesSessionBean==null) {
				this.listadoscentrosactividadesSessionBean=new ListadosCentrosActividadesSessionBean();
			}

			if(!this.listadoscentrosactividadesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(listadoscentrosactividadesSessionBean.getlidEmpresaActual());
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

					if(this.listadoscentrosactividades!=null) {
						this.listadoscentrosactividades.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
						this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxid_empresaListadosCentrosActividades.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaListadosCentrosActividades.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
						if(this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxid_empresaListadosCentrosActividades.getItemCount()>0) {
							this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxid_empresaListadosCentrosActividades.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaListadosCentrosActividadesGenerico)throws Exception
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
				jComboBoxid_empresaListadosCentrosActividadesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaListadosCentrosActividadesGenerico!=null && jComboBoxid_empresaListadosCentrosActividadesGenerico.getItemCount()>0) {
					jComboBoxid_empresaListadosCentrosActividadesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ListadosCentrosActividades listadoscentrosactividades,JComboBox jComboBoxid_empresaListadosCentrosActividadesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaListadosCentrosActividadesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxid_empresaListadosCentrosActividades.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaListadosCentrosActividadesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				listadoscentrosactividades.setid_empresa(empresaAux.getId());
				listadoscentrosactividades.setempresa_descripcion(ListadosCentrosActividadesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				listadoscentrosactividades.setEmpresa(empresaAux);			}
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

					if(!ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { 
							this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxid_empresaListadosCentrosActividades.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxid_empresaListadosCentrosActividades.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { 
					}

					if(!ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
							this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxid_empresaListadosCentrosActividades.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
							this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxid_empresaListadosCentrosActividades.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesListadosCentrosActividades() throws Exception {
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
		
	public ListadosCentrosActividadesParameterReturnGeneral getListadosCentrosActividadesParameterGeneral() {
		return this.listadoscentrosactividadesParameterGeneral;
	}
	
	public void setListadosCentrosActividadesParameterGeneral(ListadosCentrosActividadesParameterReturnGeneral listadoscentrosactividadesParameterGeneral) {
		this.listadoscentrosactividadesParameterGeneral = listadoscentrosactividadesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoListadosCentrosActividades() {
		return isPermisoTodoListadosCentrosActividades;
	}

	public void setIsPermisoTodoListadosCentrosActividades(Boolean isPermisoTodoListadosCentrosActividades) {
		this.isPermisoTodoListadosCentrosActividades = isPermisoTodoListadosCentrosActividades;
	}

	public Boolean getIsPermisoNuevoListadosCentrosActividades() {
		return isPermisoNuevoListadosCentrosActividades;
	}

	public void setIsPermisoNuevoListadosCentrosActividades(Boolean isPermisoNuevoListadosCentrosActividades) {
		this.isPermisoNuevoListadosCentrosActividades = isPermisoNuevoListadosCentrosActividades;
	}

	public Boolean getIsPermisoActualizarListadosCentrosActividades() {
		return isPermisoActualizarListadosCentrosActividades;
	}

	public void setIsPermisoActualizarListadosCentrosActividades(Boolean isPermisoActualizarListadosCentrosActividades) {
		this.isPermisoActualizarListadosCentrosActividades = isPermisoActualizarListadosCentrosActividades;
	}

	public Boolean getIsPermisoEliminarListadosCentrosActividades() {
		return isPermisoEliminarListadosCentrosActividades;
	}

	public void setIsPermisoEliminarListadosCentrosActividades(Boolean isPermisoEliminarListadosCentrosActividades) {
		this.isPermisoEliminarListadosCentrosActividades = isPermisoEliminarListadosCentrosActividades;
	}

	public Boolean getIsPermisoGuardarCambiosListadosCentrosActividades() {
		return isPermisoGuardarCambiosListadosCentrosActividades;
	}

	public void setIsPermisoGuardarCambiosListadosCentrosActividades(Boolean isPermisoGuardarCambiosListadosCentrosActividades) {
		this.isPermisoGuardarCambiosListadosCentrosActividades = isPermisoGuardarCambiosListadosCentrosActividades;
	}
	
	public Boolean getIsPermisoConsultaListadosCentrosActividades() {
		return isPermisoConsultaListadosCentrosActividades;
	}

	public void setIsPermisoConsultaListadosCentrosActividades(Boolean isPermisoConsultaListadosCentrosActividades) {
		this.isPermisoConsultaListadosCentrosActividades = isPermisoConsultaListadosCentrosActividades;
	}

	public Boolean getIsPermisoBusquedaListadosCentrosActividades() {
		return isPermisoBusquedaListadosCentrosActividades;
	}

	public void setIsPermisoBusquedaListadosCentrosActividades(Boolean isPermisoBusquedaListadosCentrosActividades) {
		this.isPermisoBusquedaListadosCentrosActividades = isPermisoBusquedaListadosCentrosActividades;
	}

	public Boolean getIsPermisoReporteListadosCentrosActividades() {
		return isPermisoReporteListadosCentrosActividades;
	}

	public void setIsPermisoReporteListadosCentrosActividades(Boolean isPermisoReporteListadosCentrosActividades) {
		this.isPermisoReporteListadosCentrosActividades = isPermisoReporteListadosCentrosActividades;
	}
	
	public Boolean getIsPermisoPaginacionMedioListadosCentrosActividades() {
		return isPermisoPaginacionMedioListadosCentrosActividades;
	}

	public void setIsPermisoPaginacionMedioListadosCentrosActividades(Boolean isPermisoPaginacionMedioListadosCentrosActividades) {
		this.isPermisoPaginacionMedioListadosCentrosActividades = isPermisoPaginacionMedioListadosCentrosActividades;
	}
	
	public Boolean getIsPermisoPaginacionTodoListadosCentrosActividades() {
		return isPermisoPaginacionTodoListadosCentrosActividades;
	}

	public void setIsPermisoPaginacionTodoListadosCentrosActividades(Boolean isPermisoPaginacionTodoListadosCentrosActividades) {
		this.isPermisoPaginacionTodoListadosCentrosActividades = isPermisoPaginacionTodoListadosCentrosActividades;
	}
	
	public Boolean getIsPermisoPaginacionAltoListadosCentrosActividades() {
		return isPermisoPaginacionAltoListadosCentrosActividades;
	}

	public void setIsPermisoPaginacionAltoListadosCentrosActividades(Boolean isPermisoPaginacionAltoListadosCentrosActividades) {
		this.isPermisoPaginacionAltoListadosCentrosActividades = isPermisoPaginacionAltoListadosCentrosActividades;
	}
	
	public Boolean getIsPermisoCopiarListadosCentrosActividades() {
		return isPermisoCopiarListadosCentrosActividades;
	}

	public void setIsPermisoCopiarListadosCentrosActividades(Boolean isPermisoCopiarListadosCentrosActividades) {
		this.isPermisoCopiarListadosCentrosActividades = isPermisoCopiarListadosCentrosActividades;
	}
	
	public Boolean getIsPermisoVerFormListadosCentrosActividades() {
		return isPermisoVerFormListadosCentrosActividades;
	}

	public void setIsPermisoVerFormListadosCentrosActividades(Boolean isPermisoVerFormListadosCentrosActividades) {
		this.isPermisoVerFormListadosCentrosActividades = isPermisoVerFormListadosCentrosActividades;
	}
	
	public Boolean getIsPermisoDuplicarListadosCentrosActividades() {
		return isPermisoDuplicarListadosCentrosActividades;
	}

	public void setIsPermisoDuplicarListadosCentrosActividades(Boolean isPermisoDuplicarListadosCentrosActividades) {
		this.isPermisoDuplicarListadosCentrosActividades = isPermisoDuplicarListadosCentrosActividades;
	}
	
	public Boolean getIsPermisoOrdenListadosCentrosActividades() {
		return isPermisoOrdenListadosCentrosActividades;
	}

	public void setIsPermisoOrdenListadosCentrosActividades(Boolean isPermisoOrdenListadosCentrosActividades) {
		this.isPermisoOrdenListadosCentrosActividades = isPermisoOrdenListadosCentrosActividades;
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
	
	public Boolean getIsVisibilidadCeldaNuevoListadosCentrosActividades() {
		return isVisibilidadCeldaNuevoListadosCentrosActividades;
	}

	public void setIsVisibilidadCeldaNuevoListadosCentrosActividades(Boolean isVisibilidadCeldaNuevoListadosCentrosActividades) {
		this.isVisibilidadCeldaNuevoListadosCentrosActividades = isVisibilidadCeldaNuevoListadosCentrosActividades;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarListadosCentrosActividades() {
		return isVisibilidadCeldaDuplicarListadosCentrosActividades;
	}

	public void setIsVisibilidadCeldaDuplicarListadosCentrosActividades(Boolean isVisibilidadCeldaDuplicarListadosCentrosActividades) {
		this.isVisibilidadCeldaDuplicarListadosCentrosActividades = isVisibilidadCeldaDuplicarListadosCentrosActividades;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarListadosCentrosActividades() {
		return isVisibilidadCeldaCopiarListadosCentrosActividades;
	}

	public void setIsVisibilidadCeldaCopiarListadosCentrosActividades(Boolean isVisibilidadCeldaCopiarListadosCentrosActividades) {
		this.isVisibilidadCeldaCopiarListadosCentrosActividades = isVisibilidadCeldaCopiarListadosCentrosActividades;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormListadosCentrosActividades() {
		return isVisibilidadCeldaVerFormListadosCentrosActividades;
	}

	public void setIsVisibilidadCeldaVerFormListadosCentrosActividades(Boolean isVisibilidadCeldaVerFormListadosCentrosActividades) {
		this.isVisibilidadCeldaVerFormListadosCentrosActividades = isVisibilidadCeldaVerFormListadosCentrosActividades;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenListadosCentrosActividades() {
		return isVisibilidadCeldaOrdenListadosCentrosActividades;
	}

	public void setIsVisibilidadCeldaOrdenListadosCentrosActividades(Boolean isVisibilidadCeldaOrdenListadosCentrosActividades) {
		this.isVisibilidadCeldaOrdenListadosCentrosActividades = isVisibilidadCeldaOrdenListadosCentrosActividades;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesListadosCentrosActividades() {
		return isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesListadosCentrosActividades(Boolean isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades) {
		this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades = isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades;
	}
	
	public Boolean getIsVisibilidadCeldaModificarListadosCentrosActividades() {
		return isVisibilidadCeldaModificarListadosCentrosActividades;
	}

	public void setIsVisibilidadCeldaModificarListadosCentrosActividades(Boolean isVisibilidadCeldaModificarListadosCentrosActividades) {
		this.isVisibilidadCeldaModificarListadosCentrosActividades = isVisibilidadCeldaModificarListadosCentrosActividades;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarListadosCentrosActividades() {
		return isVisibilidadCeldaActualizarListadosCentrosActividades;
	}

	public void setIsVisibilidadCeldaActualizarListadosCentrosActividades(Boolean isVisibilidadCeldaActualizarListadosCentrosActividades) {
		this.isVisibilidadCeldaActualizarListadosCentrosActividades = isVisibilidadCeldaActualizarListadosCentrosActividades;
	}

	public Boolean getIsVisibilidadCeldaEliminarListadosCentrosActividades() {
		return isVisibilidadCeldaEliminarListadosCentrosActividades;
	}

	public void setIsVisibilidadCeldaEliminarListadosCentrosActividades(Boolean isVisibilidadCeldaEliminarListadosCentrosActividades) {
		this.isVisibilidadCeldaEliminarListadosCentrosActividades = isVisibilidadCeldaEliminarListadosCentrosActividades;
	}

	public Boolean getIsVisibilidadCeldaCancelarListadosCentrosActividades() {
		return isVisibilidadCeldaCancelarListadosCentrosActividades;
	}

	public void setIsVisibilidadCeldaCancelarListadosCentrosActividades(Boolean isVisibilidadCeldaCancelarListadosCentrosActividades) {
		this.isVisibilidadCeldaCancelarListadosCentrosActividades = isVisibilidadCeldaCancelarListadosCentrosActividades;
	}

	public Boolean getIsVisibilidadCeldaGuardarListadosCentrosActividades() {
		return isVisibilidadCeldaGuardarListadosCentrosActividades;
	}

	public void setIsVisibilidadCeldaGuardarListadosCentrosActividades(Boolean isVisibilidadCeldaGuardarListadosCentrosActividades) {
		this.isVisibilidadCeldaGuardarListadosCentrosActividades = isVisibilidadCeldaGuardarListadosCentrosActividades;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosListadosCentrosActividades() {
		return isVisibilidadCeldaGuardarCambiosListadosCentrosActividades;
	}

	public void setIsVisibilidadCeldaGuardarCambiosListadosCentrosActividades(Boolean isVisibilidadCeldaGuardarCambiosListadosCentrosActividades) {
		this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades = isVisibilidadCeldaGuardarCambiosListadosCentrosActividades;
	}
		
	public ListadosCentrosActividadesSessionBean getlistadoscentrosactividadesSessionBean() {
		return this.listadoscentrosactividadesSessionBean;
	}
	
	public void setlistadoscentrosactividadesSessionBean(ListadosCentrosActividadesSessionBean listadoscentrosactividadesSessionBean) {
		this.listadoscentrosactividadesSessionBean=listadoscentrosactividadesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaListadosCentrosActividades() {
		return this.isVisibilidadBusquedaListadosCentrosActividades;
	}

	public void setisVisibilidadBusquedaListadosCentrosActividades(Boolean isVisibilidadBusquedaListadosCentrosActividades) {
		this.isVisibilidadBusquedaListadosCentrosActividades=isVisibilidadBusquedaListadosCentrosActividades;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividades)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(listadoscentrosactividades,null);
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
	
	public void bugActualizarReferenciaActual(ListadosCentrosActividades listadoscentrosactividades,ListadosCentrosActividades listadoscentrosactividadesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalListadosCentrosActividades(listadoscentrosactividades);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		listadoscentrosactividadesAux.setId(listadoscentrosactividades.getId());
		listadoscentrosactividadesAux.setVersionRow(listadoscentrosactividades.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ListadosCentrosActividades listadoscentrosactividadesLocal) throws Exception {
		
		if(this.listadoscentrosactividadesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ListadosCentrosActividades listadoscentrosactividadesLocal) throws Exception {	
		if(this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				listadoscentrosactividadesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarListadosCentrosActividadesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = listadoscentrosactividadesValidator.getInvalidValues(this.listadoscentrosactividades);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ListadosCentrosActividades listadoscentrosactividades,List<ListadosCentrosActividades> listadoscentrosactividadess) throws Exception {
	}		
	
	public void actualizarSelectedLista(ListadosCentrosActividades listadoscentrosactividades,List<ListadosCentrosActividades> listadoscentrosactividadess) throws Exception {
		try	{			
			ListadosCentrosActividadesConstantesFunciones.actualizarSelectedLista(listadoscentrosactividades,listadoscentrosactividadess);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ListadosCentrosActividades> listadoscentrosactividadessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				listadoscentrosactividadessLocal=this.listadoscentrosactividadesLogic.getListadosCentrosActividadess();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				listadoscentrosactividadessLocal=this.listadoscentrosactividadess;
			}
			//ARCHITECTURE
		
			for(ListadosCentrosActividades listadoscentrosactividadesLocal:listadoscentrosactividadessLocal) {
				if(this.permiteMantenimiento(listadoscentrosactividadesLocal) && listadoscentrosactividadesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ListadosCentrosActividadesConstantesFunciones.getListadosCentrosActividadesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ListadosCentrosActividadesConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosCentrosActividades.jLabelcodigoListadosCentrosActividades,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosCentrosActividadesConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosCentrosActividades.jLabelnombreListadosCentrosActividades,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosCentrosActividades.jLabelcodigoListadosCentrosActividades,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosCentrosActividades.jLabelnombreListadosCentrosActividades,"");
		
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
		this.iIdNuevoListadosCentrosActividades--;	
		
		
		this.listadoscentrosactividadesAux=new ListadosCentrosActividades();
		
		this.listadoscentrosactividadesAux.setId(this.iIdNuevoListadosCentrosActividades);
		this.listadoscentrosactividadesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().add(this.listadoscentrosactividadesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.listadoscentrosactividadess.add(this.listadoscentrosactividadesAux);
		}
		//ARCHITECTURE
		
		this.listadoscentrosactividades=this.listadoscentrosactividadesAux;
		
		if(ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioListadosCentrosActividades(this.listadoscentrosactividades);
			this.setVariablesObjetoActualToFormularioForeignKeyListadosCentrosActividades(this.listadoscentrosactividades);
		}
				
		//this.setDefaultControlesListadosCentrosActividades();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyListadosCentrosActividades();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyListadosCentrosActividades();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyListadosCentrosActividades();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualListadosCentrosActividades(this.listadoscentrosactividadesBean,this.listadoscentrosactividades,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosActividades(this.listadoscentrosactividades);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanListadosCentrosActividades(this.listadoscentrosactividadesReturnGeneral,this.listadoscentrosactividadesBean,false);
		
		if(this.listadoscentrosactividadesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyListadosCentrosActividades(this.listadoscentrosactividadesReturnGeneral.getListadosCentrosActividades());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioListadosCentrosActividades(this.listadoscentrosactividadesReturnGeneral.getListadosCentrosActividades());
		}
		
		if(this.listadoscentrosactividadesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioListadosCentrosActividades(this.listadoscentrosactividadesReturnGeneral.getListadosCentrosActividades(),classes);//this.listadoscentrosactividadesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualListadosCentrosActividades(this.listadoscentrosactividades,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyListadosCentrosActividades();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyListadosCentrosActividades();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.RecargarFormListadosCentrosActividades(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingListadosCentrosActividades(false);
						
			if(listadoscentrosactividadesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadosCentrosActividades();
			}
			
			this.actualizarVisualTableDatosListadosCentrosActividades();
			
			this.jTableDatosListadosCentrosActividades.setRowSelectionInterval(this.getIndiceNuevoListadosCentrosActividades(), this.getIndiceNuevoListadosCentrosActividades());
			
			this.seleccionarFilaTablaListadosCentrosActividadesActual();
						
			this.actualizarEstadoCeldasBotonesListadosCentrosActividades("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesListadosCentrosActividades(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormListadosCentrosActividades.jTextFieldcodigoListadosCentrosActividades.setEnabled(isHabilitar && this.listadoscentrosactividadesConstantesFunciones.activarcodigoListadosCentrosActividades);
		this.jInternalFrameDetalleFormListadosCentrosActividades.jTextAreanombreListadosCentrosActividades.setEnabled(isHabilitar && this.listadoscentrosactividadesConstantesFunciones.activarnombreListadosCentrosActividades);	
		//
		this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxid_empresaListadosCentrosActividades.setEnabled(isHabilitar && this.listadoscentrosactividadesConstantesFunciones.activarid_empresaListadosCentrosActividades);
	};
	
	public void setDefaultControlesListadosCentrosActividades() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoListadosCentrosActividades(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.listadoscentrosactividadesSessionBean.setConGuardarRelaciones(true);			
			this.listadoscentrosactividadesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormListadosCentrosActividades.jTabbedPaneRelacionesListadosCentrosActividades.setVisible(true);
			
					
		} else {
			//this.listadoscentrosactividadesSessionBean.setConGuardarRelaciones(false);			
			this.listadoscentrosactividadesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormListadosCentrosActividades.jTabbedPaneRelacionesListadosCentrosActividades.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoListadosCentrosActividades() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosCentrosActividades listadoscentrosactividadesAux:this.listadoscentrosactividadesLogic.getListadosCentrosActividadess()) {
				if(listadoscentrosactividadesAux.getId().equals(this.iIdNuevoListadosCentrosActividades)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosCentrosActividades listadoscentrosactividadesAux:this.listadoscentrosactividadess) {
				if(listadoscentrosactividadesAux.getId().equals(this.iIdNuevoListadosCentrosActividades)) {
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
	
	public int getIndiceActualListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividades,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosCentrosActividades listadoscentrosactividadesAux:this.listadoscentrosactividadesLogic.getListadosCentrosActividadess()) {
				if(listadoscentrosactividadesAux.getId().equals(listadoscentrosactividades.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosCentrosActividades listadoscentrosactividadesAux:this.listadoscentrosactividadess) {
				if(listadoscentrosactividadesAux.getId().equals(listadoscentrosactividades.getId())) {
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
	
	public void setCamposBaseDesdeOriginalListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividadesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosCentrosActividades listadoscentrosactividadesAux:this.listadoscentrosactividadesLogic.getListadosCentrosActividadess()) {
				if(listadoscentrosactividadesAux.getListadosCentrosActividadesOriginal().getId().equals(listadoscentrosactividadesOriginal.getId())) {
					existe=true;
					listadoscentrosactividadesOriginal.setId(listadoscentrosactividadesAux.getId());
					listadoscentrosactividadesOriginal.setVersionRow(listadoscentrosactividadesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosCentrosActividades listadoscentrosactividadesAux:this.listadoscentrosactividadess) {
				if(listadoscentrosactividadesAux.getListadosCentrosActividadesOriginal().getId().equals(listadoscentrosactividadesOriginal.getId())) {
					existe=true;
					listadoscentrosactividadesOriginal.setId(listadoscentrosactividadesAux.getId());
					listadoscentrosactividadesOriginal.setVersionRow(listadoscentrosactividadesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosListadosCentrosActividades(Boolean esParaCancelar) throws Exception {
		listadoscentrosactividadessAux=new ArrayList<ListadosCentrosActividades>();
		listadoscentrosactividadesAux=new ListadosCentrosActividades();
		
		if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ListadosCentrosActividades listadoscentrosactividadesAux:this.listadoscentrosactividadesLogic.getListadosCentrosActividadess()) {
					if(listadoscentrosactividadesAux.getId()<0) {
						listadoscentrosactividadessAux.add(listadoscentrosactividadesAux);
					}		
				}
				this.iIdNuevoListadosCentrosActividades=0L;
				this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().removeAll(listadoscentrosactividadessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosCentrosActividades listadoscentrosactividadesAux:this.listadoscentrosactividadess) {
					if(listadoscentrosactividadesAux.getId()<0) {
						listadoscentrosactividadessAux.add(listadoscentrosactividadesAux);
					}		
				}
				this.iIdNuevoListadosCentrosActividades=0L;
				this.listadoscentrosactividadess.removeAll(listadoscentrosactividadessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoListadosCentrosActividades 
					&& this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().size()>0
					) {
					listadoscentrosactividadesAux=this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().get(this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().size() - 1);
				
					if(listadoscentrosactividadesAux.getId()<0) {
						this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().remove(listadoscentrosactividadesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoListadosCentrosActividades && this.listadoscentrosactividadess.size()>0) {
					listadoscentrosactividadesAux=this.listadoscentrosactividadess.get(this.listadoscentrosactividadess.size() - 1);
				
					if(listadoscentrosactividadesAux.getId()<0) {
						this.listadoscentrosactividadess.remove(listadoscentrosactividadesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoListadosCentrosActividades(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(listadoscentrosactividades.getId()<0) {
				this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().remove(this.listadoscentrosactividades);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(listadoscentrosactividades.getId()<0) {
				this.listadoscentrosactividadess.remove(this.listadoscentrosactividades);
			}
		}			
	}
	
	public void setEstadosInicialesListadosCentrosActividades(List<ListadosCentrosActividades> listadoscentrosactividadessAux) throws Exception {
		ListadosCentrosActividadesConstantesFunciones.setEstadosInicialesListadosCentrosActividades(listadoscentrosactividadessAux);
	}
	
	public void setEstadosInicialesListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividadesAux) throws Exception {
		ListadosCentrosActividadesConstantesFunciones.setEstadosInicialesListadosCentrosActividades(listadoscentrosactividadesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarListadosCentrosActividadesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesListadosCentrosActividades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarListadosCentrosActividadesActual()) {
				if(!this.isEsNuevoListadosCentrosActividades) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesListadosCentrosActividades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoListadosCentrosActividades=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarListadosCentrosActividadesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Listados Centros Actividades ?", "MANTENIMIENTO DE Listados Centros Actividades", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesListadosCentrosActividades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ListadosCentrosActividades listadoscentrosactividades) throws Exception {
		ListadosCentrosActividadesConstantesFunciones.seleccionarAsignar(this.listadoscentrosactividades,listadoscentrosactividades);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarListadosCentrosActividades=this.isPermisoActualizarOriginalListadosCentrosActividades;
			
			
			this.seleccionarAsignar(listadoscentrosactividades);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesListadosCentrosActividades("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.listadoscentrosactividadesSessionBean.setsFuncionBusquedaRapida(this.listadoscentrosactividadesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoListadosCentrosActividades) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosListadosCentrosActividades(esParaCancelar);				
				this.cancelarNuevoListadosCentrosActividades(esParaCancelar);								
			}
			
			this.listadoscentrosactividades=new ListadosCentrosActividades();
			
			this.inicializarListadosCentrosActividades();
			
			this.actualizarEstadoCeldasBotonesListadosCentrosActividades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarListadosCentrosActividades() throws Exception {
		try {
			ListadosCentrosActividadesConstantesFunciones.inicializarListadosCentrosActividades(this.listadoscentrosactividades);
			
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
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteListadosCentrosActividadess(String sAccionBusqueda,List<ListadosCentrosActividades> listadoscentrosactividadessParaReportes) throws Exception {
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
					sPathReporteFinal="ListadosCentrosActividades"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ListadosCentrosActividadesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ListadosCentrosActividadesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ListadosCentrosActividades"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Listados Centros Actividadeses");		
		parameters.put("busquedapor", ListadosCentrosActividadesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceListadosCentrosActividades=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ListadosCentrosActividadesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ListadosCentrosActividadesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceListadosCentrosActividades=new JRBeanArrayDataSource(ListadosCentrosActividadesJInternalFrame.TraerListadosCentrosActividadesBeans(listadoscentrosactividadessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceListadosCentrosActividades);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ListadosCentrosActividadesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ListadosCentrosActividadesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ListadosCentrosActividadesBean.TraerListadosCentrosActividadesBeans(listadoscentrosactividadessParaReportes).toArray()));
							
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
				this.generarExcelReporteListadosCentrosActividadess(sAccionBusqueda,sTipoArchivoReporte,listadoscentrosactividadessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalListadosCentrosActividadess(sAccionBusqueda,sTipoArchivoReporte,listadoscentrosactividadessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoListadosCentrosActividadesActionPerformed(null);
					//this.generarExcelReporteListadosCentrosActividadess(sAccionBusqueda,sTipoArchivoReporte,listadoscentrosactividadessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalListadosCentrosActividadess(sAccionBusqueda,sTipoArchivoReporte,listadoscentrosactividadessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesListadosCentrosActividadess(sAccionBusqueda,sTipoArchivoReporte,listadoscentrosactividadessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesListadosCentrosActividadess(sAccionBusqueda,sTipoArchivoReporte,listadoscentrosactividadessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteListadosCentrosActividadess(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadosCentrosActividades> listadoscentrosactividadessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoscentrosactividades";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadosCentrosActividadess");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderListadosCentrosActividades("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ListadosCentrosActividades listadoscentrosactividades : listadoscentrosactividadessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ListadosCentrosActividadesConstantesFunciones.generarExcelReporteDataListadosCentrosActividades("NORMAL",row,workbook,listadoscentrosactividades,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Centros Actividades",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderListadosCentrosActividades(String sTipo,Row row,Workbook workbook) {
		
		ListadosCentrosActividadesConstantesFunciones.generarExcelReporteHeaderListadosCentrosActividades(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalListadosCentrosActividadess(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadosCentrosActividades> listadoscentrosactividadessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoscentrosactividades_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadosCentrosActividadess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ListadosCentrosActividades listadoscentrosactividades : listadoscentrosactividadessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ListadosCentrosActividadesConstantesFunciones.getListadosCentrosActividadesDescripcion(listadoscentrosactividades));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosCentrosActividadesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosCentrosActividadesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoscentrosactividades.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoscentrosactividades.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoscentrosactividades.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Centros Actividades",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesListadosCentrosActividadess(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadosCentrosActividades> listadoscentrosactividadessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ListadosCentrosActividades> listadoscentrosactividadessRespaldo=null;
		
		classes=ListadosCentrosActividadesConstantesFunciones.getClassesRelationshipsOfListadosCentrosActividades(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.listadoscentrosactividadesLogic.setDatosCliente(this.datosCliente);
		this.listadoscentrosactividadesLogic.setDatosDeep(this.datosDeep);
		this.listadoscentrosactividadesLogic.setIsConDeep(true);
		
		listadoscentrosactividadessRespaldo=this.listadoscentrosactividadesLogic.getListadosCentrosActividadess();
		
		this.listadoscentrosactividadesLogic.setListadosCentrosActividadess(listadoscentrosactividadessParaReportes);	
		this.listadoscentrosactividadesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		listadoscentrosactividadessParaReportes=this.listadoscentrosactividadesLogic.getListadosCentrosActividadess();
		this.listadoscentrosactividadesLogic.setListadosCentrosActividadess(listadoscentrosactividadessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoscentrosactividades_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadosCentrosActividadess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderListadosCentrosActividades("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ListadosCentrosActividades listadoscentrosactividades : listadoscentrosactividadessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderListadosCentrosActividades("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ListadosCentrosActividadesConstantesFunciones.generarExcelReporteDataListadosCentrosActividades("NORMAL",row,workbook,listadoscentrosactividades,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ListadosCentrosActividadesConstantesFunciones.getListadosCentrosActividadesDescripcion(listadoscentrosactividades));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Centros Actividades",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessListadosCentrosActividades() throws Exception {		
		this.startProcessListadosCentrosActividades(true);
	}
	
	public void startProcessListadosCentrosActividades(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasListadosCentrosActividades ,this.jPanelParametrosReportesListadosCentrosActividades, this.jScrollPanelDatosListadosCentrosActividades,this.jPanelPaginacionListadosCentrosActividades, this.jScrollPanelDatosEdicionListadosCentrosActividades, this.jPanelAccionesListadosCentrosActividades,this.jPanelAccionesFormularioListadosCentrosActividades,this.jmenuBarListadosCentrosActividades,this.jmenuBarDetalleListadosCentrosActividades,this.jTtoolBarListadosCentrosActividades,this.jTtoolBarDetalleListadosCentrosActividades);		
		
		final JTabbedPane jTabbedPaneBusquedasListadosCentrosActividades=this.jTabbedPaneBusquedasListadosCentrosActividades; 
		
		final JPanel jPanelParametrosReportesListadosCentrosActividades=this.jPanelParametrosReportesListadosCentrosActividades;
		//final JScrollPane jScrollPanelDatosListadosCentrosActividades=this.jScrollPanelDatosListadosCentrosActividades;
		final JTable jTableDatosListadosCentrosActividades=this.jTableDatosListadosCentrosActividades;		
		final JPanel jPanelPaginacionListadosCentrosActividades=this.jPanelPaginacionListadosCentrosActividades;
		//final JScrollPane jScrollPanelDatosEdicionListadosCentrosActividades=this.jScrollPanelDatosEdicionListadosCentrosActividades;
		final JPanel jPanelAccionesListadosCentrosActividades=this.jPanelAccionesListadosCentrosActividades;
		
		JPanel jPanelCamposAuxiliarListadosCentrosActividades=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarListadosCentrosActividades=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
			jPanelCamposAuxiliarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jPanelCamposListadosCentrosActividades;
			jPanelAccionesFormularioAuxiliarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jPanelAccionesFormularioListadosCentrosActividades;
		}
		
		final JPanel jPanelCamposListadosCentrosActividades=jPanelCamposAuxiliarListadosCentrosActividades;
		final JPanel jPanelAccionesFormularioListadosCentrosActividades=jPanelAccionesFormularioAuxiliarListadosCentrosActividades;
		
		
		final JMenuBar jmenuBarListadosCentrosActividades=this.jmenuBarListadosCentrosActividades;
		final JToolBar jTtoolBarListadosCentrosActividades=this.jTtoolBarListadosCentrosActividades;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarListadosCentrosActividades=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarListadosCentrosActividades=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
			jmenuBarDetalleAuxiliarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jmenuBarDetalleListadosCentrosActividades;
			jTtoolBarDetalleAuxiliarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jTtoolBarDetalleListadosCentrosActividades;
		}
		
		final JMenuBar jmenuBarDetalleListadosCentrosActividades=jmenuBarDetalleAuxiliarListadosCentrosActividades;
		final JToolBar jTtoolBarDetalleListadosCentrosActividades=jTtoolBarDetalleAuxiliarListadosCentrosActividades;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasListadosCentrosActividades;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesListadosCentrosActividades;
			processRunnable.jTableDatos=jTableDatosListadosCentrosActividades;
			processRunnable.jPanelCampos=jPanelCamposListadosCentrosActividades;
			processRunnable.jPanelPaginacion=jPanelPaginacionListadosCentrosActividades;
			processRunnable.jPanelAcciones=jPanelAccionesListadosCentrosActividades;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioListadosCentrosActividades;
			
			
			processRunnable.jmenuBar=jmenuBarListadosCentrosActividades;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleListadosCentrosActividades;
			processRunnable.jTtoolBar=jTtoolBarListadosCentrosActividades;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleListadosCentrosActividades;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasListadosCentrosActividades ,jPanelParametrosReportesListadosCentrosActividades,jTableDatosListadosCentrosActividades, /*jScrollPanelDatosListadosCentrosActividades,*/jPanelCamposListadosCentrosActividades,jPanelPaginacionListadosCentrosActividades, /*jScrollPanelDatosEdicionListadosCentrosActividades,*/ jPanelAccionesListadosCentrosActividades,jPanelAccionesFormularioListadosCentrosActividades,jmenuBarListadosCentrosActividades,jmenuBarDetalleListadosCentrosActividades,jTtoolBarListadosCentrosActividades,jTtoolBarDetalleListadosCentrosActividades);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasListadosCentrosActividades ,jPanelParametrosReportesListadosCentrosActividades, jScrollPanelDatosListadosCentrosActividades,jPanelPaginacionListadosCentrosActividades, jScrollPanelDatosEdicionListadosCentrosActividades, jPanelAccionesListadosCentrosActividades,jPanelAccionesFormularioListadosCentrosActividades,jmenuBarListadosCentrosActividades,jmenuBarDetalleListadosCentrosActividades,jTtoolBarListadosCentrosActividades,jTtoolBarDetalleListadosCentrosActividades);
						
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
	
	public void finishProcessListadosCentrosActividades() {// throws Exception 
		this.finishProcessListadosCentrosActividades(true);
	}
	
	public void finishProcessListadosCentrosActividades(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasListadosCentrosActividades ,this.jPanelParametrosReportesListadosCentrosActividades, this.jScrollPanelDatosListadosCentrosActividades,this.jPanelPaginacionListadosCentrosActividades, this.jScrollPanelDatosEdicionListadosCentrosActividades, this.jPanelAccionesListadosCentrosActividades,this.jPanelAccionesFormularioListadosCentrosActividades,this.jmenuBarListadosCentrosActividades,this.jmenuBarDetalleListadosCentrosActividades,this.jTtoolBarListadosCentrosActividades,this.jTtoolBarDetalleListadosCentrosActividades);		
		
		final JTabbedPane jTabbedPaneBusquedasListadosCentrosActividades=this.jTabbedPaneBusquedasListadosCentrosActividades; 
		
		final JPanel jPanelParametrosReportesListadosCentrosActividades=this.jPanelParametrosReportesListadosCentrosActividades;
		//final JScrollPane jScrollPanelDatosListadosCentrosActividades=this.jScrollPanelDatosListadosCentrosActividades;
		final JTable jTableDatosListadosCentrosActividades=this.jTableDatosListadosCentrosActividades;		
		final JPanel jPanelPaginacionListadosCentrosActividades=this.jPanelPaginacionListadosCentrosActividades;
		//final JScrollPane jScrollPanelDatosEdicionListadosCentrosActividades=this.jScrollPanelDatosEdicionListadosCentrosActividades;
		final JPanel jPanelAccionesListadosCentrosActividades=this.jPanelAccionesListadosCentrosActividades;
		
		JPanel jPanelCamposAuxiliarListadosCentrosActividades=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarListadosCentrosActividades=new JPanel();
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
			jPanelCamposAuxiliarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jPanelCamposListadosCentrosActividades;
			jPanelAccionesFormularioAuxiliarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jPanelAccionesFormularioListadosCentrosActividades;
		}
		
		final JPanel jPanelCamposListadosCentrosActividades=jPanelCamposAuxiliarListadosCentrosActividades;
		final JPanel jPanelAccionesFormularioListadosCentrosActividades=jPanelAccionesFormularioAuxiliarListadosCentrosActividades;
		
		
		final JMenuBar jmenuBarListadosCentrosActividades=this.jmenuBarListadosCentrosActividades;		
		final JToolBar jTtoolBarListadosCentrosActividades=this.jTtoolBarListadosCentrosActividades;
				
		JMenuBar jmenuBarDetalleAuxiliarListadosCentrosActividades=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarListadosCentrosActividades=new JToolBar();
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
			jmenuBarDetalleAuxiliarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jmenuBarDetalleListadosCentrosActividades;
			jTtoolBarDetalleAuxiliarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jTtoolBarDetalleListadosCentrosActividades;		
		}
		
		final JMenuBar jmenuBarDetalleListadosCentrosActividades=jmenuBarDetalleAuxiliarListadosCentrosActividades;
		final JToolBar jTtoolBarDetalleListadosCentrosActividades=jTtoolBarDetalleAuxiliarListadosCentrosActividades;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasListadosCentrosActividades;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesListadosCentrosActividades;
			processRunnable.jTableDatos=jTableDatosListadosCentrosActividades;
			processRunnable.jPanelCampos=jPanelCamposListadosCentrosActividades;
			processRunnable.jPanelPaginacion=jPanelPaginacionListadosCentrosActividades;
			processRunnable.jPanelAcciones=jPanelAccionesListadosCentrosActividades;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioListadosCentrosActividades;
			
			
			processRunnable.jmenuBar=jmenuBarListadosCentrosActividades;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleListadosCentrosActividades;
			processRunnable.jTtoolBar=jTtoolBarListadosCentrosActividades;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleListadosCentrosActividades;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasListadosCentrosActividades ,jPanelParametrosReportesListadosCentrosActividades, jTableDatosListadosCentrosActividades,/*jScrollPanelDatosListadosCentrosActividades,*/jPanelCamposListadosCentrosActividades,jPanelPaginacionListadosCentrosActividades, /*jScrollPanelDatosEdicionListadosCentrosActividades,*/ jPanelAccionesListadosCentrosActividades,jPanelAccionesFormularioListadosCentrosActividades,jmenuBarListadosCentrosActividades,jmenuBarDetalleListadosCentrosActividades,jTtoolBarListadosCentrosActividades,jTtoolBarDetalleListadosCentrosActividades));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesListadosCentrosActividades(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarListadosCentrosActividades(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuListadosCentrosActividades(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarListadosCentrosActividades(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarListadosCentrosActividades,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleListadosCentrosActividades,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuListadosCentrosActividades(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarListadosCentrosActividades,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleListadosCentrosActividades,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.listadoscentrosactividadesConstantesFunciones.getsFinalQueryListadosCentrosActividades();
		String  finalQueryPaginacionTodos=this.listadoscentrosactividadesConstantesFunciones.getsFinalQueryListadosCentrosActividades();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ListadosCentrosActividadesConstantesFunciones.getArrayColumnasGlobalesNoListadosCentrosActividades(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ListadosCentrosActividadesConstantesFunciones.getArrayColumnasGlobalesListadosCentrosActividades(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ListadosCentrosActividadesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.listadoscentrosactividadessEliminados= new ArrayList<ListadosCentrosActividades>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessListadosCentrosActividades();
		
				///*ListadosCentrosActividadesSessionBean*/this.listadoscentrosactividadesSessionBean=new ListadosCentrosActividadesSessionBean();
			
			if(this.listadoscentrosactividadesSessionBean==null) {
				this.listadoscentrosactividadesSessionBean=new ListadosCentrosActividadesSessionBean();
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
					this.iNumeroPaginacion=ListadosCentrosActividadesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ListadosCentrosActividadesConstantesFunciones.getClassesForeignKeysOfListadosCentrosActividades(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/listadoscentrosactividades."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			listadoscentrosactividadessAux= new ArrayList<ListadosCentrosActividades>();
			
				
			listadoscentrosactividadesLogic.setDatosCliente(this.datosCliente);
			listadoscentrosactividadesLogic.setDatosDeep(this.datosDeep);
			listadoscentrosactividadesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaListadosCentrosActividades")) {
				this.sDetalleReporte=ListadosCentrosActividadesConstantesFunciones.getDetalleIndiceBusquedaListadosCentrosActividades(idBusquedaListadosCentrosActividades);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					listadoscentrosactividadesLogic.getListadosCentrosActividadessBusquedaListadosCentrosActividades(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaListadosCentrosActividades);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ListadosCentrosActividadesConstantesFunciones.getDetalleIndiceBusquedaListadosCentrosActividades(idBusquedaListadosCentrosActividades);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ListadosCentrosActividadesConstantesFunciones.getDetalleIndiceBusquedaListadosCentrosActividades(idBusquedaListadosCentrosActividades);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=listadoscentrosactividadesLogic.getListadosCentrosActividadess()==null||listadoscentrosactividadesLogic.getListadosCentrosActividadess().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=listadoscentrosactividadess==null|| listadoscentrosactividadess.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						listadoscentrosactividadessAux=new ArrayList<ListadosCentrosActividades>();
						listadoscentrosactividadessAux.addAll(listadoscentrosactividadesLogic.getListadosCentrosActividadess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadoscentrosactividadessAux=new ArrayList<ListadosCentrosActividades>();
							listadoscentrosactividadessAux.addAll(listadoscentrosactividadess);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							listadoscentrosactividadesLogic.getListadosCentrosActividadessBusquedaListadosCentrosActividades(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaListadosCentrosActividades);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ListadosCentrosActividadesConstantesFunciones.getDetalleIndiceBusquedaListadosCentrosActividades(idBusquedaListadosCentrosActividades);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ListadosCentrosActividadesConstantesFunciones.getDetalleIndiceBusquedaListadosCentrosActividades(idBusquedaListadosCentrosActividades);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteListadosCentrosActividadess("BusquedaListadosCentrosActividades",listadoscentrosactividadesLogic.getListadosCentrosActividadess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteListadosCentrosActividadess("BusquedaListadosCentrosActividades",listadoscentrosactividadess);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						listadoscentrosactividadesLogic.setListadosCentrosActividadess(new ArrayList<ListadosCentrosActividades>());
						listadoscentrosactividadesLogic.getListadosCentrosActividadess().addAll(listadoscentrosactividadessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadoscentrosactividadess=new ArrayList<ListadosCentrosActividades>();
							listadoscentrosactividadess.addAll(listadoscentrosactividadessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesListadosCentrosActividades();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessListadosCentrosActividades();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=listadoscentrosactividadesLogic.getListadosCentrosActividadess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadoscentrosactividadess.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=listadoscentrosactividadesLogic.getListadosCentrosActividadess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadoscentrosactividadess.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ListadosCentrosActividades listadoscentrosactividades) {
		Boolean permite=true;
		
		if(this.listadoscentrosactividades.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ListadosCentrosActividadesConstantesFunciones.getOrderByListaListadosCentrosActividades();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ListadosCentrosActividadesConstantesFunciones.getOrderByListaListadosCentrosActividades();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosCentrosActividades listadoscentrosactividades:listadoscentrosactividadesLogic.getListadosCentrosActividadess()) {
				if(listadoscentrosactividades.getsType().equals(Constantes2.S_TOTALES)) {
					listadoscentrosactividadesTotales=listadoscentrosactividades;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosCentrosActividades listadoscentrosactividades:this.listadoscentrosactividadess) {
				if(listadoscentrosactividades.getsType().equals(Constantes2.S_TOTALES)) {
					listadoscentrosactividadesTotales=listadoscentrosactividades;
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
			this.listadoscentrosactividadesAux=new ListadosCentrosActividades();
			this.listadoscentrosactividadesAux.setsType(Constantes2.S_TOTALES);
			this.listadoscentrosactividadesAux.setIsNew(false);
			this.listadoscentrosactividadesAux.setIsChanged(false);
			this.listadoscentrosactividadesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ListadosCentrosActividadesConstantesFunciones.TotalizarValoresFilaListadosCentrosActividades(this.listadoscentrosactividadesLogic.getListadosCentrosActividadess(),this.listadoscentrosactividadesAux);
				
				//this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().add(this.listadoscentrosactividadesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ListadosCentrosActividadesConstantesFunciones.TotalizarValoresFilaListadosCentrosActividades(this.listadoscentrosactividadess,this.listadoscentrosactividadesAux);
				
				this.listadoscentrosactividadess.add(this.listadoscentrosactividadesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		listadoscentrosactividadesTotales=new ListadosCentrosActividades();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().remove(listadoscentrosactividadesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.listadoscentrosactividadess.remove(listadoscentrosactividadesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		listadoscentrosactividadesTotales=new ListadosCentrosActividades();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosCentrosActividades listadoscentrosactividades:listadoscentrosactividadesLogic.getListadosCentrosActividadess()) {
				if(listadoscentrosactividades.getsType().equals(Constantes2.S_TOTALES)) {
					listadoscentrosactividadesTotales=listadoscentrosactividades;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ListadosCentrosActividadesConstantesFunciones.TotalizarValoresFilaListadosCentrosActividades(this.listadoscentrosactividadesLogic.getListadosCentrosActividadess(),listadoscentrosactividadesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosCentrosActividades listadoscentrosactividades:this.listadoscentrosactividadess) {
				if(listadoscentrosactividades.getsType().equals(Constantes2.S_TOTALES)) {
					listadoscentrosactividadesTotales=listadoscentrosactividades;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ListadosCentrosActividadesConstantesFunciones.TotalizarValoresFilaListadosCentrosActividades(this.listadoscentrosactividadess,listadoscentrosactividadesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getListadosCentrosActividadessBusquedaListadosCentrosActividades()throws Exception {
		try {
			sAccionBusqueda="BusquedaListadosCentrosActividades";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getListadosCentrosActividadessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getListadosCentrosActividadessBusquedaListadosCentrosActividades(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadoscentrosactividadesLogic.getListadosCentrosActividadessBusquedaListadosCentrosActividades(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getListadosCentrosActividadessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadoscentrosactividadesLogic.getListadosCentrosActividadessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosListadosCentrosActividades() {
		this.isPermisoTodoListadosCentrosActividades=false;
		this.isPermisoNuevoListadosCentrosActividades=false;
		this.isPermisoActualizarListadosCentrosActividades=false;
		this.isPermisoActualizarOriginalListadosCentrosActividades=false;
		this.isPermisoEliminarListadosCentrosActividades=false;
		this.isPermisoGuardarCambiosListadosCentrosActividades=false;
		this.isPermisoConsultaListadosCentrosActividades=true;
		this.isPermisoBusquedaListadosCentrosActividades=true;
		this.isPermisoReporteListadosCentrosActividades=true;
		this.isPermisoOrdenListadosCentrosActividades=false;		
		this.isPermisoPaginacionMedioListadosCentrosActividades=false;		
		this.isPermisoPaginacionAltoListadosCentrosActividades=false;		
		this.isPermisoPaginacionTodoListadosCentrosActividades=false;		
		this.isPermisoCopiarListadosCentrosActividades=false;		
		this.isPermisoVerFormListadosCentrosActividades=false;		
		this.isPermisoDuplicarListadosCentrosActividades=false;
		this.isPermisoOrdenListadosCentrosActividades=false;
	}
	
	public void setPermisosUsuarioListadosCentrosActividades(Boolean isPermiso) {
		this.isPermisoTodoListadosCentrosActividades=isPermiso;
		this.isPermisoNuevoListadosCentrosActividades=isPermiso;
		this.isPermisoActualizarListadosCentrosActividades=isPermiso;
		this.isPermisoActualizarOriginalListadosCentrosActividades=isPermiso;
		this.isPermisoEliminarListadosCentrosActividades=isPermiso;
		this.isPermisoGuardarCambiosListadosCentrosActividades=isPermiso;
		this.isPermisoConsultaListadosCentrosActividades=isPermiso;
		this.isPermisoBusquedaListadosCentrosActividades=isPermiso;
		this.isPermisoReporteListadosCentrosActividades=isPermiso;
		this.isPermisoOrdenListadosCentrosActividades=isPermiso;		
		this.isPermisoPaginacionMedioListadosCentrosActividades=isPermiso;		
		this.isPermisoPaginacionAltoListadosCentrosActividades=isPermiso;		
		this.isPermisoPaginacionTodoListadosCentrosActividades=isPermiso;		
		this.isPermisoCopiarListadosCentrosActividades=isPermiso;		
		this.isPermisoVerFormListadosCentrosActividades=isPermiso;		
		this.isPermisoDuplicarListadosCentrosActividades=isPermiso;
		this.isPermisoOrdenListadosCentrosActividades=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioListadosCentrosActividades(Boolean isPermiso) {
		//this.isPermisoTodoListadosCentrosActividades=isPermiso;
		this.isPermisoNuevoListadosCentrosActividades=isPermiso;
		this.isPermisoActualizarListadosCentrosActividades=isPermiso;
		this.isPermisoActualizarOriginalListadosCentrosActividades=isPermiso;
		this.isPermisoEliminarListadosCentrosActividades=isPermiso;
		this.isPermisoGuardarCambiosListadosCentrosActividades=isPermiso;
		//this.isPermisoConsultaListadosCentrosActividades=isPermiso;
		//this.isPermisoBusquedaListadosCentrosActividades=isPermiso;
		//this.isPermisoReporteListadosCentrosActividades=isPermiso;
		//this.isPermisoOrdenListadosCentrosActividades=isPermiso;		
		//this.isPermisoPaginacionMedioListadosCentrosActividades=isPermiso;		
		//this.isPermisoPaginacionAltoListadosCentrosActividades=isPermiso;		
		//this.isPermisoPaginacionTodoListadosCentrosActividades=isPermiso;		
		//this.isPermisoCopiarListadosCentrosActividades=isPermiso;		
		//this.isPermisoDuplicarListadosCentrosActividades=isPermiso;
		//this.isPermisoOrdenListadosCentrosActividades=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioListadosCentrosActividadesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ListadosCentrosActividadesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebListadosCentrosActividades(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioListadosCentrosActividadesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioListadosCentrosActividadesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionListadosCentrosActividadesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioListadosCentrosActividadesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioListadosCentrosActividades() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ListadosCentrosActividadesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ListadosCentrosActividadesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoListadosCentrosActividades=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarListadosCentrosActividades=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalListadosCentrosActividades=this.isPermisoActualizarListadosCentrosActividades;
			this.isPermisoEliminarListadosCentrosActividades=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosListadosCentrosActividades=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaListadosCentrosActividades=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaListadosCentrosActividades=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoListadosCentrosActividades=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteListadosCentrosActividades=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenListadosCentrosActividades=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioListadosCentrosActividades=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoListadosCentrosActividades=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoListadosCentrosActividades=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarListadosCentrosActividades=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormListadosCentrosActividades=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarListadosCentrosActividades=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenListadosCentrosActividades=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosListadosCentrosActividades.setToolTipText(this.jTableDatosListadosCentrosActividades.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioListadosCentrosActividades(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioListadosCentrosActividades(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ListadosCentrosActividadesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ListadosCentrosActividadesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioListadosCentrosActividades() throws Exception {
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
	public void inicializarCombosForeignKeyListadosCentrosActividadesListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyListadosCentrosActividadesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ListadosCentrosActividadesJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyListadosCentrosActividades()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.listadoscentrosactividadesSessionBean==null) {
				this.listadoscentrosactividadesSessionBean=new ListadosCentrosActividadesSessionBean();
			}

			if(!this.listadoscentrosactividadesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyListadosCentrosActividades()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyListadosCentrosActividades(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyListadosCentrosActividades()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyListadosCentrosActividades();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividades)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividades,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyListadosCentrosActividades()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyListadosCentrosActividades()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyListadosCentrosActividades()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyListadosCentrosActividades()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroListadosCentrosActividades()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyListadosCentrosActividades()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyListadosCentrosActividades(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyListadosCentrosActividades()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxid_empresaListadosCentrosActividades!=null && this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxid_empresaListadosCentrosActividades.getItemCount()>0) {
				this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxid_empresaListadosCentrosActividades.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ListadosCentrosActividadesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ListadosCentrosActividadesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ListadosCentrosActividadesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.listadoscentrosactividadesSessionBean=new ListadosCentrosActividadesSessionBean(); 
		this.listadoscentrosactividadesConstantesFunciones=new ListadosCentrosActividadesConstantesFunciones(); 
		this.listadoscentrosactividadesBean=new ListadosCentrosActividades();//(this.listadoscentrosactividadesConstantesFunciones); 		
		this.listadoscentrosactividadesReturnGeneral=new ListadosCentrosActividadesParameterReturnGeneral(); 
		
		this.listadoscentrosactividadesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadoscentrosactividadesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ListadosCentrosActividadesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ListadosCentrosActividadesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ListadosCentrosActividadesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessListadosCentrosActividades(true);
			
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
			
			this.listadoscentrosactividadesConstantesFunciones=new ListadosCentrosActividadesConstantesFunciones(); 
			this.listadoscentrosactividadesBean=new ListadosCentrosActividades();//this.listadoscentrosactividadesConstantesFunciones); 			
			this.listadoscentrosactividadesReturnGeneral=new ListadosCentrosActividadesParameterReturnGeneral(); 
		
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Listados Centros Actividades Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.listadoscentrosactividades=new ListadosCentrosActividades();
			this.listadoscentrosactividadess = new ArrayList<ListadosCentrosActividades>();
			this.listadoscentrosactividadessAux = new ArrayList<ListadosCentrosActividades>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic=new ListadosCentrosActividadesLogic();
				this.listadoscentrosactividadesLogic.getNewConnexionToDeep("");
			}
			
			//this.listadoscentrosactividadesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.listadoscentrosactividadesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormListadosCentrosActividades);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoListadosCentrosActividades!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoListadosCentrosActividades);	
					}
					
					if(this.jInternalFrameImportacionListadosCentrosActividades!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionListadosCentrosActividades);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByListadosCentrosActividades!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByListadosCentrosActividades);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormListadosCentrosActividades);
				this.jInternalFrameDetalleFormListadosCentrosActividades.setVisible(false);
				this.jInternalFrameDetalleFormListadosCentrosActividades.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoListadosCentrosActividades!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoListadosCentrosActividades);
					this.jInternalFrameReporteDinamicoListadosCentrosActividades.setVisible(false);
					this.jInternalFrameReporteDinamicoListadosCentrosActividades.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionListadosCentrosActividades!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionListadosCentrosActividades);
					this.jInternalFrameImportacionListadosCentrosActividades.setVisible(false);
					this.jInternalFrameImportacionListadosCentrosActividades.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByListadosCentrosActividades!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByListadosCentrosActividades);
					this.jInternalFrameOrderByListadosCentrosActividades.setVisible(false);
					this.jInternalFrameOrderByListadosCentrosActividades.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idListadosCentrosActividadesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ListadosCentrosActividadesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.listadoscentrosactividadesReturnGeneral=new ListadosCentrosActividadesParameterReturnGeneral();
			
			this.listadoscentrosactividadesParameterGeneral=new ListadosCentrosActividadesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.listadoscentrosactividadesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ListadosCentrosActividadesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ListadosCentrosActividadesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado(),this.listadoscentrosactividadesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ListadosCentrosActividadesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado(),this.listadoscentrosactividadesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoListadosCentrosActividades=false;
			this.isVisibilidadCeldaDuplicarListadosCentrosActividades=true;
			this.isVisibilidadCeldaCopiarListadosCentrosActividades=true;
			this.isVisibilidadCeldaVerFormListadosCentrosActividades=true;
			this.isVisibilidadCeldaOrdenListadosCentrosActividades=true;
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades=false;
			this.isVisibilidadCeldaModificarListadosCentrosActividades=false;
			this.isVisibilidadCeldaActualizarListadosCentrosActividades=false;
			this.isVisibilidadCeldaEliminarListadosCentrosActividades=false;
			this.isVisibilidadCeldaCancelarListadosCentrosActividades=false;
			this.isVisibilidadCeldaGuardarListadosCentrosActividades=false;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades=false;
			
			
			this.isVisibilidadBusquedaListadosCentrosActividades=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesListadosCentrosActividades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosListadosCentrosActividades();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioListadosCentrosActividades(false);
			
			this.setPermisosUsuarioListadosCentrosActividades();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado() 
				|| (this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado() && this.listadoscentrosactividadesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioListadosCentrosActividadesClasesRelacionadas();
			}
			
			if(this.listadoscentrosactividadesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioListadosCentrosActividadesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosListadosCentrosActividades();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualListadosCentrosActividades();
			}
			
			if(!this.isPermisoBusquedaListadosCentrosActividades) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasListadosCentrosActividades.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ListadosCentrosActividadesConstantesFunciones.getTiposSeleccionarListadosCentrosActividades());
				
				this.tiposColumnasSelect=ListadosCentrosActividadesConstantesFunciones.getTiposSeleccionarListadosCentrosActividades(true);
				
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
			//if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioListadosCentrosActividades();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioListadosCentrosActividades(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioListadosCentrosActividades(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesListadosCentrosActividades() ;
			
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
				listadoscentrosactividadesImplementable= (ListadosCentrosActividadesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ListadosCentrosActividadesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				listadoscentrosactividadesImplementableHome= (ListadosCentrosActividadesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ListadosCentrosActividadesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.listadoscentrosactividadess= new ArrayList<ListadosCentrosActividades>();
			this.listadoscentrosactividadessEliminados= new ArrayList<ListadosCentrosActividades>();
						
			this.isEsNuevoListadosCentrosActividades=false;
			this.esParaAccionDesdeFormularioListadosCentrosActividades=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyListadosCentrosActividades(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroListadosCentrosActividades();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ListadosCentrosActividadesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesListadosCentrosActividades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingListadosCentrosActividades(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioListadosCentrosActividades();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioListadosCentrosActividades();
			}
			
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasListadosCentrosActividades.getTabCount(); i++) {
					this.jTabbedPaneBusquedasListadosCentrosActividades.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasListadosCentrosActividades.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessListadosCentrosActividades(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ListadosCentrosActividades: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectListadosCentrosActividades() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesListadosCentrosActividades")) {
				iIndex=this.jInternalFrameDetalleFormListadosCentrosActividades.jTabbedPaneRelacionesListadosCentrosActividades.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormListadosCentrosActividades.jTabbedPaneRelacionesListadosCentrosActividades.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessListadosCentrosActividades();	
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
	
	public void cargarCombosForeignKeyListadosCentrosActividades(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyListadosCentrosActividades(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyListadosCentrosActividades(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyListadosCentrosActividadesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyListadosCentrosActividades();
		
		this.cargarCombosFrameForeignKeyListadosCentrosActividades();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyListadosCentrosActividades();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyListadosCentrosActividades();
		}
	}
	
	
	
	public void jButtonNuevoListadosCentrosActividadesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.listadoscentrosactividadesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormListadosCentrosActividades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
			
			
			if(jTableDatosListadosCentrosActividades.getRowCount()>=1) {
				jTableDatosListadosCentrosActividades.removeRowSelectionInterval(0, jTableDatosListadosCentrosActividades.getRowCount()-1);						
			}
			
			this.isEsNuevoListadosCentrosActividades=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoListadosCentrosActividades(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesListadosCentrosActividades(true);			
			//this.listadoscentrosactividades=new ListadosCentrosActividades();
			//this.listadoscentrosactividades.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadosCentrosActividades(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosCentrosActividades() ;
			
			if(ListadosCentrosActividadesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadosCentrosActividades(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.listadoscentrosactividades);	
			this.actualizarInformacion("INFO_PADRE",false,this.listadoscentrosactividades);				
			
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
			
			if(this.listadoscentrosactividadesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ListadosCentrosActividades: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarListadosCentrosActividadesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ListadosCentrosActividades> listadoscentrosactividadessSeleccionados=new ArrayList<ListadosCentrosActividades>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosListadosCentrosActividades.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosListadosCentrosActividades.getSelectedRows().length;			
			}
			
			listadoscentrosactividadessSeleccionados=this.getListadosCentrosActividadessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoListadosCentrosActividades--;			
				//ListadosCentrosActividades listadoscentrosactividadesAux= new ListadosCentrosActividades();			
				//listadoscentrosactividadesAux.setId(this.iIdNuevoListadosCentrosActividades);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ListadosCentrosActividades listadoscentrosactividadesOrigen=new ListadosCentrosActividades();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ListadosCentrosActividades listadoscentrosactividadesOrigen : listadoscentrosactividadessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							listadoscentrosactividadesOrigen =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadoscentrosactividadesOrigen =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaListadosCentrosActividades();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.listadoscentrosactividades.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosListadosCentrosActividades(listadoscentrosactividadesOrigen,this.listadoscentrosactividades,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosActividades(this.listadoscentrosactividades);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().add(this.listadoscentrosactividadesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.listadoscentrosactividadess.add(this.listadoscentrosactividadesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaListadosCentrosActividades(false);
				
				this.jTableDatosListadosCentrosActividades.setRowSelectionInterval(this.getIndiceNuevoListadosCentrosActividades(), this.getIndiceNuevoListadosCentrosActividades());
				
				int iLastRow =  this.jTableDatosListadosCentrosActividades.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosListadosCentrosActividades.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosListadosCentrosActividades.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaListadosCentrosActividades(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ListadosCentrosActividades> listadoscentrosactividadessSeleccionados=new ArrayList<ListadosCentrosActividades>();									
		
			ListadosCentrosActividades listadoscentrosactividadesOrigen=new ListadosCentrosActividades();
			ListadosCentrosActividades listadoscentrosactividadesDestino=new ListadosCentrosActividades();
				
			listadoscentrosactividadessSeleccionados=this.getListadosCentrosActividadessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosListadosCentrosActividades.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || listadoscentrosactividadessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosListadosCentrosActividades.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						listadoscentrosactividadesOrigen =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						listadoscentrosactividadesOrigen =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						listadoscentrosactividadesDestino =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						listadoscentrosactividadesDestino =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				listadoscentrosactividadesOrigen =listadoscentrosactividadessSeleccionados.get(0);
				listadoscentrosactividadesDestino =listadoscentrosactividadessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosListadosCentrosActividades(listadoscentrosactividadesOrigen,listadoscentrosactividadesDestino,true,false);
				
				listadoscentrosactividadesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(listadoscentrosactividadesDestino,listadoscentrosactividadesLogic.getListadosCentrosActividadess());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(listadoscentrosactividadesDestino,listadoscentrosactividadess);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaListadosCentrosActividades(false);
				
				//this.jTableDatosListadosCentrosActividades.setRowSelectionInterval(this.getIndiceNuevoListadosCentrosActividades(), this.getIndiceNuevoListadosCentrosActividades());
				
				int iLastRow =  this.jTableDatosListadosCentrosActividades.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosListadosCentrosActividades.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosListadosCentrosActividades.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaListadosCentrosActividades(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormListadosCentrosActividades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormListadosCentrosActividades.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesListadosCentrosActividades.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasListadosCentrosActividades.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesListadosCentrosActividades.setVisible(!isVisible);
			this.jPanelPaginacionListadosCentrosActividades.setVisible(!isVisible);
			this.jPanelAccionesListadosCentrosActividades.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameListadosCentrosActividades();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoListadosCentrosActividades();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionListadosCentrosActividades();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByListadosCentrosActividades();
			
			this.abrirFrameOrderByListadosCentrosActividades();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByListadosCentrosActividades();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleListadosCentrosActividades(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormListadosCentrosActividades);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormListadosCentrosActividades.isMaximum()) {
					this.jInternalFrameDetalleFormListadosCentrosActividades.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormListadosCentrosActividades.setSize(this.jInternalFrameDetalleFormListadosCentrosActividades.iWidthFormulario,this.jInternalFrameDetalleFormListadosCentrosActividades.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormListadosCentrosActividades.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormListadosCentrosActividades.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormListadosCentrosActividades.isMaximum()) {
						this.jInternalFrameDetalleFormListadosCentrosActividades.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormListadosCentrosActividades.jContentPaneDetalleListadosCentrosActividades.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormListadosCentrosActividades.jTabbedPaneRelacionesListadosCentrosActividades.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormListadosCentrosActividades.jContentPaneDetalleListadosCentrosActividades.getWidth(),ListadosCentrosActividadesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormListadosCentrosActividades.jTabbedPaneRelacionesListadosCentrosActividades.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormListadosCentrosActividades.jContentPaneDetalleListadosCentrosActividades.getWidth(),ListadosCentrosActividadesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormListadosCentrosActividades.jTabbedPaneRelacionesListadosCentrosActividades.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormListadosCentrosActividades.jContentPaneDetalleListadosCentrosActividades.getWidth(),ListadosCentrosActividadesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormListadosCentrosActividades.setVisible(true);
	        this.jInternalFrameDetalleFormListadosCentrosActividades.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByListadosCentrosActividades() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByListadosCentrosActividades==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByListadosCentrosActividades=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosCentrosActividades,false,this);
				} else {
					this.jInternalFrameOrderByListadosCentrosActividades=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosCentrosActividades,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByListadosCentrosActividades);
				this.jInternalFrameOrderByListadosCentrosActividades.setVisible(false);
				this.jInternalFrameOrderByListadosCentrosActividades.setSelected(false);
				
				this.jInternalFrameOrderByListadosCentrosActividades.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByListadosCentrosActividades"));
				
				this.inicializarActualizarBindingTablaOrderByListadosCentrosActividades();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionListadosCentrosActividades() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionListadosCentrosActividades==null) {
				
				this.jInternalFrameImportacionListadosCentrosActividades=new ImportacionJInternalFrame(ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionListadosCentrosActividades);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionListadosCentrosActividades);
				this.jInternalFrameImportacionListadosCentrosActividades.setVisible(false);
				this.jInternalFrameImportacionListadosCentrosActividades.setSelected(false);


				this.jInternalFrameImportacionListadosCentrosActividades.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionListadosCentrosActividades"));
				this.jInternalFrameImportacionListadosCentrosActividades.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionListadosCentrosActividades"));
				this.jInternalFrameImportacionListadosCentrosActividades.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionListadosCentrosActividades"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoListadosCentrosActividades() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoListadosCentrosActividades==null) {
				this.jInternalFrameReporteDinamicoListadosCentrosActividades=new ReporteDinamicoJInternalFrame(ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoListadosCentrosActividades);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoListadosCentrosActividades);
				this.jInternalFrameReporteDinamicoListadosCentrosActividades.setVisible(false);
				this.jInternalFrameReporteDinamicoListadosCentrosActividades.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadosCentrosActividades"));
				this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadosCentrosActividades"));
				this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadosCentrosActividades"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadosCentrosActividades();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleListadosCentrosActividades() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormListadosCentrosActividades);
			
	       	this.jInternalFrameDetalleFormListadosCentrosActividades.setVisible(false);
	        this.jInternalFrameDetalleFormListadosCentrosActividades.setSelected(false);
			
			//this.jInternalFrameDetalleFormListadosCentrosActividades.dispose();
			//this.jInternalFrameDetalleFormListadosCentrosActividades=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoListadosCentrosActividades() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoListadosCentrosActividades.setVisible(true);
	        this.jInternalFrameReporteDinamicoListadosCentrosActividades.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionListadosCentrosActividades() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionListadosCentrosActividades.setVisible(true);
	        this.jInternalFrameImportacionListadosCentrosActividades.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByListadosCentrosActividades() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByListadosCentrosActividades.setVisible(true);
	        this.jInternalFrameOrderByListadosCentrosActividades.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByListadosCentrosActividades() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByListadosCentrosActividades.setVisible(false);
	        this.jInternalFrameOrderByListadosCentrosActividades.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoListadosCentrosActividades() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoListadosCentrosActividades.setVisible(false);
	        this.jInternalFrameReporteDinamicoListadosCentrosActividades.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionListadosCentrosActividades() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionListadosCentrosActividades.setVisible(false);
	        this.jInternalFrameImportacionListadosCentrosActividades.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarListadosCentrosActividades(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarListadosCentrosActividades(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesListadosCentrosActividades(true);
			//this.isEsNuevoListadosCentrosActividades=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesListadosCentrosActividades("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadosCentrosActividades(false) ;
			
			if(listadoscentrosactividadesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ListadosCentrosActividadesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadosCentrosActividades(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosCentrosActividades(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaListadosCentrosActividadesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarListadosCentrosActividades(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormListadosCentrosActividades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesListadosCentrosActividades(true);
			//this.isEsNuevoListadosCentrosActividades=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.listadoscentrosactividades.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesListadosCentrosActividades("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesListadosCentrosActividades(false) ;
			
			if(ListadosCentrosActividadesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadosCentrosActividades(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosCentrosActividades(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesListadosCentrosActividades(false);
			
			//if(!this.isEsNuevoListadosCentrosActividades) {								
				int intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualListadosCentrosActividades(this.listadoscentrosactividades,true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosActividades(this.listadoscentrosactividades);
				
			}
			
			if(this.permiteMantenimiento(this.listadoscentrosactividades)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoListadosCentrosActividades=true;
					this.inicializarActualizarBindingTablaListadosCentrosActividades(false);
					this.isEsNuevoListadosCentrosActividades=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoListadosCentrosActividades=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoListadosCentrosActividades=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesListadosCentrosActividades(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadosCentrosActividades(false);
				
				this.habilitarDeshabilitarControlesListadosCentrosActividades(false);
			
												
				
				if(ListadosCentrosActividadesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleListadosCentrosActividades();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoListadosCentrosActividadesActionPerformed(evt,listadoscentrosactividadesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualListadosCentrosActividades(this.listadoscentrosactividades,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosListadosCentrosActividades.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,listadoscentrosactividadesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.listadoscentrosactividades.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosActividades.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosActividades.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				this.listadoscentrosactividades.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				this.listadoscentrosactividades.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.listadoscentrosactividades)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ListadosCentrosActividadesModel) this.jTableDatosListadosCentrosActividades.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoListadosCentrosActividades=true;
				this.inicializarActualizarBindingTablaListadosCentrosActividades(false);
				this.isEsNuevoListadosCentrosActividades=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesListadosCentrosActividades(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadosCentrosActividades(false);
				
				this.habilitarDeshabilitarControlesListadosCentrosActividades(false);
				
				
				
				if(ListadosCentrosActividadesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleListadosCentrosActividades();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosListadosCentrosActividades.getRowCount()>=1) {
				jTableDatosListadosCentrosActividades.removeRowSelectionInterval(0, jTableDatosListadosCentrosActividades.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesListadosCentrosActividades(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaListadosCentrosActividades(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadosCentrosActividades(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosCentrosActividades(false) ;
			
			this.isEsNuevoListadosCentrosActividades=false;
			
			if(ListadosCentrosActividadesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleListadosCentrosActividades();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingListadosCentrosActividades(false);
				
				//SI ES MANUAL
				if(ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualListadosCentrosActividades();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoListadosCentrosActividades--;			
			//ListadosCentrosActividades listadoscentrosactividadesAux= new ListadosCentrosActividades();			
			//listadoscentrosactividadesAux.setId(this.iIdNuevoListadosCentrosActividades);
			
			if(this.jInternalFrameDetalleFormListadosCentrosActividades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaListadosCentrosActividades();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosActividades(this.listadoscentrosactividades);
			
			this.listadoscentrosactividades.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().add(this.listadoscentrosactividadesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.listadoscentrosactividadess.add(this.listadoscentrosactividadesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaListadosCentrosActividades(false);
			
			this.jTableDatosListadosCentrosActividades.setRowSelectionInterval(this.getIndiceNuevoListadosCentrosActividades(), this.getIndiceNuevoListadosCentrosActividades());
			
			int iLastRow =  this.jTableDatosListadosCentrosActividades.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosListadosCentrosActividades.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosListadosCentrosActividades.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaListadosCentrosActividades(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingListadosCentrosActividades(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosCentrosActividades(false);
			
			//SI ES MANUAL
			if(ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadosCentrosActividades();
			}
			
			//this.abrirFrameTreeListadosCentrosActividades();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionListadosCentrosActividades.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionListadosCentrosActividades.setFileImportacion(this.jInternalFrameImportacionListadosCentrosActividades.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionListadosCentrosActividades.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionListadosCentrosActividades.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionListadosCentrosActividades.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionListadosCentrosActividades.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ListadosCentrosActividades> listadoscentrosactividadessSeleccionados=new ArrayList<ListadosCentrosActividades>();		

		listadoscentrosactividadessSeleccionados=this.getListadosCentrosActividadessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ListadosCentrosActividadesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ListadosCentrosActividadesBaseDesign.jrxml";
			
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
			
			this.generarReporteListadosCentrosActividadess("Todos",listadoscentrosactividadessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Centros Actividades",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ListadosCentrosActividades> listadoscentrosactividadessSeleccionados=new ArrayList<ListadosCentrosActividades>();		
		
		listadoscentrosactividadessSeleccionados=this.getListadosCentrosActividadessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoscentrosactividades";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ListadosCentrosActividadess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ListadosCentrosActividadesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosCentrosActividadesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ListadosCentrosActividades listadoscentrosactividades:listadoscentrosactividadessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoscentrosactividades.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ListadosCentrosActividades listadoscentrosactividades:listadoscentrosactividadessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoscentrosactividades.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ListadosCentrosActividades listadoscentrosactividades:listadoscentrosactividadessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoscentrosactividades.getnombre());
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
			//	this.getFilaCabeceraExportarExcelListadosCentrosActividades(row);				
			//	iRow++;
			//}				
			
			//for(ListadosCentrosActividades listadoscentrosactividadesAux:listadoscentrosactividadessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelListadosCentrosActividades(listadoscentrosactividadesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Centros Actividades",JOptionPane.INFORMATION_MESSAGE);
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
				this.listadoscentrosactividadesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosCentrosActividades(false);
			
			//SI ES MANUAL
			if(ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadosCentrosActividades();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosCentrosActividades(false);
			
			//SI ES MANUAL
			if(ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualListadosCentrosActividades();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosCentrosActividades(false);
			
			//SI ES MANUAL
			if(ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualListadosCentrosActividades();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaListadosCentrosActividades() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosListadosCentrosActividades.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosListadosCentrosActividades.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosListadosCentrosActividades.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosListadosCentrosActividades.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosListadosCentrosActividades.setMinimumSize(dimensionMinimum);
		this.jTableDatosListadosCentrosActividades.setMaximumSize(dimensionMaximum);
		this.jTableDatosListadosCentrosActividades.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingListadosCentrosActividades(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingListadosCentrosActividades(esInicializar,true);
	}
	
	public void inicializarActualizarBindingListadosCentrosActividades(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaListadosCentrosActividades(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesListadosCentrosActividades(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasListadosCentrosActividades(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesListadosCentrosActividades(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesListadosCentrosActividades(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualListadosCentrosActividades() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaListadosCentrosActividades();
		
		this.inicializarActualizarBindingBotonesManualListadosCentrosActividades(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualListadosCentrosActividades();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesListadosCentrosActividades() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualListadosCentrosActividades(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualListadosCentrosActividades(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosListadosCentrosActividades.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosListadosCentrosActividades.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteListadosCentrosActividades.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormListadosCentrosActividades.jCheckBoxPostAccionNuevoListadosCentrosActividades.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormListadosCentrosActividades.jCheckBoxPostAccionSinCerrarListadosCentrosActividades.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormListadosCentrosActividades.jCheckBoxPostAccionSinMensajeListadosCentrosActividades.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosListadosCentrosActividades.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosListadosCentrosActividades.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteListadosCentrosActividades.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
				this.jInternalFrameDetalleFormListadosCentrosActividades.jCheckBoxPostAccionNuevoListadosCentrosActividades.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormListadosCentrosActividades.jCheckBoxPostAccionSinCerrarListadosCentrosActividades.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormListadosCentrosActividades.jCheckBoxPostAccionSinMensajeListadosCentrosActividades.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionListadosCentrosActividades.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionListadosCentrosActividades.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxTiposAccionesFormularioListadosCentrosActividades.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesListadosCentrosActividades.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoListadosCentrosActividades!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesListadosCentrosActividades.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesListadosCentrosActividades.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarListadosCentrosActividades.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesListadosCentrosActividades.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoListadosCentrosActividades!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesListadosCentrosActividades.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralListadosCentrosActividades.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesListadosCentrosActividades(Boolean esInicializar) throws Exception {
		try	{	
			if(ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualListadosCentrosActividades(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesListadosCentrosActividades() throws Exception {
		try	{
			if(ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualListadosCentrosActividades();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleListadosCentrosActividades() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxTiposAccionesFormularioListadosCentrosActividades.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxTiposAccionesFormularioListadosCentrosActividades.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualListadosCentrosActividades() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesListadosCentrosActividades.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesListadosCentrosActividades.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesListadosCentrosActividades.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesListadosCentrosActividades.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesListadosCentrosActividades.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesListadosCentrosActividades.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionListadosCentrosActividades.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionListadosCentrosActividades.addItem(reporte);
			}
			
			
			if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionListadosCentrosActividades.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionListadosCentrosActividades.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesListadosCentrosActividades.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesListadosCentrosActividades.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesListadosCentrosActividades.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesListadosCentrosActividades.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxTiposAccionesFormularioListadosCentrosActividades.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxTiposAccionesFormularioListadosCentrosActividades.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarListadosCentrosActividades.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarListadosCentrosActividades.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarListadosCentrosActividades.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadosCentrosActividades();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadosCentrosActividades() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoListadosCentrosActividades!=null) {
				this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoListadosCentrosActividades!=null) {
				this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoListadosCentrosActividades!=null) {
				
				if(this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualListadosCentrosActividades()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaListadosCentrosActividades=Long.parseLong(this.jLabelidListadosCentrosActividadesBusquedaListadosCentrosActividades.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasListadosCentrosActividades(Boolean esInicializar) throws Exception {				
		if(ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualListadosCentrosActividades();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaListadosCentrosActividades() throws Exception {
		this.inicializarActualizarBindingTablaListadosCentrosActividades(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByListadosCentrosActividades() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByListadosCentrosActividades.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByListadosCentrosActividades.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadosCentrosActividades.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ListadosCentrosActividadesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByListadosCentrosActividades.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadosCentrosActividades.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ListadosCentrosActividadesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosListadosCentrosActividadesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosCentrosActividadesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ListadosCentrosActividadesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByListadosCentrosActividades.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadosCentrosActividades.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ListadosCentrosActividadesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByListadosCentrosActividades.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaListadosCentrosActividades(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=listadoscentrosactividadesLogic.getListadosCentrosActividadess().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=listadoscentrosactividadess.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosListadosCentrosActividades.setModel(new ListadosCentrosActividadesModel(this.listadoscentrosactividadesLogic.getListadosCentrosActividadess(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosListadosCentrosActividades.setModel(new ListadosCentrosActividadesModel(this.listadoscentrosactividadess,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByListadosCentrosActividades!=null && this.jInternalFrameOrderByListadosCentrosActividades.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByListadosCentrosActividades();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosListadosCentrosActividades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosCentrosActividades,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ListadosCentrosActividadesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO,listadoscentrosactividadesConstantesFunciones.resaltarSeleccionarListadosCentrosActividades,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO,listadoscentrosactividadesConstantesFunciones.resaltarSeleccionarListadosCentrosActividades,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosListadosCentrosActividades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosCentrosActividades,ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO));

		if(this.listadoscentrosactividadesConstantesFunciones.mostrarcodigoListadosCentrosActividades && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoscentrosactividadesConstantesFunciones.resaltarcodigoListadosCentrosActividades,this.listadoscentrosactividadesConstantesFunciones.activarcodigoListadosCentrosActividades,this,true,"codigoListadosCentrosActividades","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoscentrosactividadesConstantesFunciones.resaltarcodigoListadosCentrosActividades,this.listadoscentrosactividadesConstantesFunciones.activarcodigoListadosCentrosActividades,this,true,"codigoListadosCentrosActividades","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosCentrosActividadesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosCentrosActividades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosCentrosActividades,ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE));

		if(this.listadoscentrosactividadesConstantesFunciones.mostrarnombreListadosCentrosActividades && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoscentrosactividadesConstantesFunciones.resaltarnombreListadosCentrosActividades,this.listadoscentrosactividadesConstantesFunciones.activarnombreListadosCentrosActividades,this,true,"nombreListadosCentrosActividades","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoscentrosactividadesConstantesFunciones.resaltarnombreListadosCentrosActividades,this.listadoscentrosactividadesConstantesFunciones.activarnombreListadosCentrosActividades,this,true,"nombreListadosCentrosActividades","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosCentrosActividadesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosListadosCentrosActividades.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosListadosCentrosActividades.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarListadosCentrosActividades && this.isPermisoGuardarCambiosListadosCentrosActividades) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosListadosCentrosActividades.addColumn(tableColumn);
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
			
			this.jTableDatosListadosCentrosActividades.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarListadosCentrosActividades && this.isPermisoGuardarCambiosListadosCentrosActividades) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarListadosCentrosActividades && this.isPermisoGuardarCambiosListadosCentrosActividades) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosListadosCentrosActividades.moveColumn(this.jTableDatosListadosCentrosActividades.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosListadosCentrosActividades.moveColumn(this.jTableDatosListadosCentrosActividades.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosListadosCentrosActividades.moveColumn(this.jTableDatosListadosCentrosActividades.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosListadosCentrosActividades.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosListadosCentrosActividades.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosListadosCentrosActividades,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosListadosCentrosActividades.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosListadosCentrosActividades.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosListadosCentrosActividades.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosListadosCentrosActividades.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosListadosCentrosActividades.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=listadoscentrosactividadesLogic.getListadosCentrosActividadess().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=listadoscentrosactividadess.size()-1;
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
		//this.jTableDatosListadosCentrosActividades.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosListadosCentrosActividades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosListadosCentrosActividades();
			
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
				
				//this.isEsNuevoListadosCentrosActividades=false;
					
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
			
				if(this.listadoscentrosactividadesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormListadosCentrosActividades==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosListadosCentrosActividades.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosListadosCentrosActividades.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.listadoscentrosactividades.getsType().equals("DUPLICADO")
				   || this.listadoscentrosactividades.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoListadosCentrosActividades=true;
				
				} else {
					this.isEsNuevoListadosCentrosActividades=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
					if(this.listadoscentrosactividades.getId()>=0 && !this.listadoscentrosactividades.getIsNew()) {						
						this.isEsNuevoListadosCentrosActividades=false;
						
					} else {
						this.isEsNuevoListadosCentrosActividades=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoListadosCentrosActividades(esRelaciones);						
				
				this.seleccionarListadosCentrosActividades(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.listadoscentrosactividades.getId()<0) {
					this.isEsNuevoListadosCentrosActividades=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarListadosCentrosActividades(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarListadosCentrosActividades(evt,rowIndex);
				}	
				
				if(this.listadoscentrosactividadesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ListadosCentrosActividades: " + this.dDif); 
					}
				}								
				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarListadosCentrosActividades(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.listadoscentrosactividades)) {
					if(this.listadoscentrosactividades.getId()>0) {
						this.listadoscentrosactividades.setIsDeleted(true);
						
						this.listadoscentrosactividadessEliminados.add(this.listadoscentrosactividades);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().remove(this.listadoscentrosactividades);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.listadoscentrosactividadess.remove(this.listadoscentrosactividades);				
					}
					
					
					((ListadosCentrosActividadesModel) this.jTableDatosListadosCentrosActividades.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaListadosCentrosActividades(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarListadosCentrosActividades(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoListadosCentrosActividades) {
			
			if(this.jInternalFrameDetalleFormListadosCentrosActividades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosListadosCentrosActividades.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosListadosCentrosActividades.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioListadosCentrosActividades(this.listadoscentrosactividades);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesListadosCentrosActividades("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesListadosCentrosActividades(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadosCentrosActividades() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividades) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoListadosCentrosActividades(listadoscentrosactividades,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividades,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioListadosCentrosActividades(listadoscentrosactividades);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyListadosCentrosActividades(listadoscentrosactividades,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyListadosCentrosActividades(listadoscentrosactividades);
	}
	
	public void setVariablesObjetoActualToFormularioListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividades) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormListadosCentrosActividades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormListadosCentrosActividades.jTextFieldcodigoListadosCentrosActividades.setText(listadoscentrosactividades.getcodigo());
			this.jInternalFrameDetalleFormListadosCentrosActividades.jTextAreanombreListadosCentrosActividades.setText(listadoscentrosactividades.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ListadosCentrosActividades listadoscentrosactividadesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,listadoscentrosactividadesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ListadosCentrosActividades listadoscentrosactividadesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				listadoscentrosactividadesLocal=this.listadoscentrosactividades;
			} else {
				listadoscentrosactividadesLocal=this.listadoscentrosactividadesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(listadoscentrosactividadesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoListadosCentrosActividades(listadoscentrosactividadesLocal,true);
					
					if(listadoscentrosactividadesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(listadoscentrosactividadesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(listadoscentrosactividadesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividades,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualListadosCentrosActividades(listadoscentrosactividades,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosActividades(listadoscentrosactividades);
	}
	
	public void setVariablesFormularioToObjetoActualListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividades,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualListadosCentrosActividades(listadoscentrosactividades,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividades,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormListadosCentrosActividades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			listadoscentrosactividades.setcodigo(this.jInternalFrameDetalleFormListadosCentrosActividades.jTextFieldcodigoListadosCentrosActividades.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosCentrosActividades.jLabelcodigoListadosCentrosActividades,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoscentrosactividades.setnombre(this.jInternalFrameDetalleFormListadosCentrosActividades.jTextAreanombreListadosCentrosActividades.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosCentrosActividades.jLabelnombreListadosCentrosActividades,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividadesBean,ListadosCentrosActividades listadoscentrosactividades,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividadesOrigen,ListadosCentrosActividades listadoscentrosactividades,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && listadoscentrosactividadesOrigen.getId()!=null && !listadoscentrosactividadesOrigen.getId().equals(0L))) {listadoscentrosactividades.setId(listadoscentrosactividadesOrigen.getId());}}
			if(conDefault || (!conDefault && listadoscentrosactividadesOrigen.getcodigo()!=null && !listadoscentrosactividadesOrigen.getcodigo().equals(""))) {listadoscentrosactividades.setcodigo(listadoscentrosactividadesOrigen.getcodigo());}
			if(conDefault || (!conDefault && listadoscentrosactividadesOrigen.getnombre()!=null && !listadoscentrosactividadesOrigen.getnombre().equals(""))) {listadoscentrosactividades.setnombre(listadoscentrosactividadesOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividades) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormListadosCentrosActividades.jTextFieldcodigoListadosCentrosActividades.setText(listadoscentrosactividades.getcodigo());
			this.jInternalFrameDetalleFormListadosCentrosActividades.jTextAreanombreListadosCentrosActividades.setText(listadoscentrosactividades.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioListadosCentrosActividades(ListadosCentrosActividadesBean listadoscentrosactividadesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormListadosCentrosActividades.jTextFieldcodigoListadosCentrosActividades.setText(listadoscentrosactividadesBean.getcodigo());
			this.jInternalFrameDetalleFormListadosCentrosActividades.jTextAreanombreListadosCentrosActividades.setText(listadoscentrosactividadesBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanListadosCentrosActividades(ListadosCentrosActividadesParameterReturnGeneral listadoscentrosactividadesReturnGeneral,ListadosCentrosActividadesBean listadoscentrosactividadesBean,Boolean conDefault) throws Exception { 
		try {
			ListadosCentrosActividades listadoscentrosactividadesLocal=new ListadosCentrosActividades();
			
			listadoscentrosactividadesLocal=listadoscentrosactividadesReturnGeneral.getListadosCentrosActividades();
			
			
			if(conDefault || (!conDefault && listadoscentrosactividadesLocal.getcodigo()!=null && !listadoscentrosactividadesLocal.getcodigo().equals(""))) {listadoscentrosactividadesBean.setcodigo(listadoscentrosactividadesLocal.getcodigo());}
			if(conDefault || (!conDefault && listadoscentrosactividadesLocal.getnombre()!=null && !listadoscentrosactividadesLocal.getnombre().equals(""))) {listadoscentrosactividadesBean.setnombre(listadoscentrosactividadesLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxListadosCentrosActividadesGenerico(Long idListadosCentrosActividadesSeleccionado,JComboBox jComboBoxListadosCentrosActividades,List<ListadosCentrosActividades> listadoscentrosactividadessLocal)throws Exception {
		try {
			ListadosCentrosActividades  listadoscentrosactividadesTemp=null;

			for(ListadosCentrosActividades listadoscentrosactividadesAux:listadoscentrosactividadessLocal) {
				if(listadoscentrosactividadesAux.getId()!=null && listadoscentrosactividadesAux.getId().equals(idListadosCentrosActividadesSeleccionado)) {
					listadoscentrosactividadesTemp=listadoscentrosactividadesAux;
					break;
				}
			}

			jComboBoxListadosCentrosActividades.setSelectedItem(listadoscentrosactividadesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxListadosCentrosActividadesGenerico(JComboBox jComboBoxListadosCentrosActividades,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxListadosCentrosActividades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxListadosCentrosActividades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxListadosCentrosActividades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxListadosCentrosActividades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxListadosCentrosActividades.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxListadosCentrosActividades.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxListadosCentrosActividades.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxListadosCentrosActividades.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxListadosCentrosActividades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxListadosCentrosActividades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadoscentrosactividades=(ListadosCentrosActividades) listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			listadoscentrosactividades =(ListadosCentrosActividades) listadoscentrosactividadess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!listadoscentrosactividades.getIsNew() && !listadoscentrosactividades.getIsChanged() && !listadoscentrosactividades.getIsDeleted()) {
				sDescripcion=listadoscentrosactividades.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=listadoscentrosactividades.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ListadosCentrosActividades listadoscentrosactividadesRow=new ListadosCentrosActividades();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadoscentrosactividadesRow=(ListadosCentrosActividades) listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			listadoscentrosactividadesRow=(ListadosCentrosActividades) listadoscentrosactividadess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualListadosCentrosActividades(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoListadosCentrosActividades.setVisible((this.isVisibilidadCeldaNuevoListadosCentrosActividades && this.isPermisoNuevoListadosCentrosActividades));			
			this.jButtonDuplicarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaDuplicarListadosCentrosActividades && this.isPermisoDuplicarListadosCentrosActividades));			
			this.jButtonCopiarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaCopiarListadosCentrosActividades && this.isPermisoCopiarListadosCentrosActividades));
			this.jButtonVerFormListadosCentrosActividades.setVisible((this.isVisibilidadCeldaVerFormListadosCentrosActividades && this.isPermisoVerFormListadosCentrosActividades));
			
			this.jButtonAbrirOrderByListadosCentrosActividades.setVisible((this.isVisibilidadCeldaOrdenListadosCentrosActividades && this.isPermisoOrdenListadosCentrosActividades));			
			
			this.jButtonNuevoRelacionesListadosCentrosActividades.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades && this.isPermisoNuevoListadosCentrosActividades));			
			this.jButtonNuevoGuardarCambiosListadosCentrosActividades.setVisible((this.isVisibilidadCeldaNuevoListadosCentrosActividades && this.isPermisoNuevoListadosCentrosActividades && this.isPermisoGuardarCambiosListadosCentrosActividades));
			
			if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonModificarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaModificarListadosCentrosActividades && this.isPermisoActualizarListadosCentrosActividades));	
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonActualizarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaActualizarListadosCentrosActividades && this.isPermisoActualizarListadosCentrosActividades));	
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonEliminarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaEliminarListadosCentrosActividades && this.isPermisoEliminarListadosCentrosActividades));
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonCancelarListadosCentrosActividades.setVisible(this.isVisibilidadCeldaCancelarListadosCentrosActividades);							
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonGuardarCambiosListadosCentrosActividades.setVisible((this.isVisibilidadCeldaGuardarListadosCentrosActividades && this.isPermisoGuardarCambiosListadosCentrosActividades));			
			
			}
						
			this.jButtonGuardarCambiosTablaListadosCentrosActividades.setVisible((this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades && this.isPermisoGuardarCambiosListadosCentrosActividades));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaNuevoListadosCentrosActividades && this.isPermisoNuevoListadosCentrosActividades));						
			this.jButtonDuplicarToolBarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaDuplicarListadosCentrosActividades && this.isPermisoDuplicarListadosCentrosActividades));						
			this.jButtonCopiarToolBarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaCopiarListadosCentrosActividades && this.isPermisoCopiarListadosCentrosActividades));			
			this.jButtonVerFormToolBarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaVerFormListadosCentrosActividades && this.isPermisoVerFormListadosCentrosActividades));			
			this.jButtonAbrirOrderByToolBarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaOrdenListadosCentrosActividades && this.isPermisoOrdenListadosCentrosActividades));
			this.jButtonNuevoRelacionesToolBarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades && this.isPermisoNuevoListadosCentrosActividades));			
			this.jButtonNuevoGuardarCambiosToolBarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaNuevoListadosCentrosActividades && this.isPermisoNuevoListadosCentrosActividades && this.isPermisoGuardarCambiosListadosCentrosActividades));			
			
			if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonModificarToolBarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaModificarListadosCentrosActividades && this.isPermisoActualizarListadosCentrosActividades));	
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonActualizarToolBarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaActualizarListadosCentrosActividades  && this.isPermisoActualizarListadosCentrosActividades));	
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonEliminarToolBarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaEliminarListadosCentrosActividades && this.isPermisoEliminarListadosCentrosActividades));
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonCancelarToolBarListadosCentrosActividades.setVisible(this.isVisibilidadCeldaCancelarListadosCentrosActividades);				
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonGuardarCambiosToolBarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaGuardarListadosCentrosActividades && this.isPermisoGuardarCambiosListadosCentrosActividades));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades && this.isPermisoGuardarCambiosListadosCentrosActividades));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoListadosCentrosActividades.setVisible((this.isVisibilidadCeldaNuevoListadosCentrosActividades && this.isPermisoNuevoListadosCentrosActividades));			
			this.jMenuItemDuplicarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaDuplicarListadosCentrosActividades && this.isPermisoDuplicarListadosCentrosActividades));			
			this.jMenuItemCopiarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaCopiarListadosCentrosActividades && this.isPermisoCopiarListadosCentrosActividades));			
			this.jMenuItemVerFormListadosCentrosActividades.setVisible((this.isVisibilidadCeldaVerFormListadosCentrosActividades && this.isPermisoVerFormListadosCentrosActividades));			
			this.jMenuItemAbrirOrderByListadosCentrosActividades.setVisible((this.isVisibilidadCeldaOrdenListadosCentrosActividades && this.isPermisoOrdenListadosCentrosActividades));			
			//this.jMenuItemMostrarOcultarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaOrdenListadosCentrosActividades && this.isPermisoOrdenListadosCentrosActividades));
			this.jMenuItemDetalleAbrirOrderByListadosCentrosActividades.setVisible((this.isVisibilidadCeldaOrdenListadosCentrosActividades && this.isPermisoOrdenListadosCentrosActividades));			
			//this.jMenuItemDetalleMostrarOcultarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaOrdenListadosCentrosActividades && this.isPermisoOrdenListadosCentrosActividades));			
			this.jMenuItemNuevoRelacionesListadosCentrosActividades.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades && this.isPermisoNuevoListadosCentrosActividades));			
			this.jMenuItemNuevoGuardarCambiosListadosCentrosActividades.setVisible((this.isVisibilidadCeldaNuevoListadosCentrosActividades && this.isPermisoNuevoListadosCentrosActividades && this.isPermisoGuardarCambiosListadosCentrosActividades));									
			
			if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemModificarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaModificarListadosCentrosActividades && this.isPermisoActualizarListadosCentrosActividades));	
			this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemActualizarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaActualizarListadosCentrosActividades && this.isPermisoActualizarListadosCentrosActividades));	
			this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemEliminarListadosCentrosActividades.setVisible((this.isVisibilidadCeldaEliminarListadosCentrosActividades && this.isPermisoEliminarListadosCentrosActividades));
			this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemCancelarListadosCentrosActividades.setVisible(this.isVisibilidadCeldaCancelarListadosCentrosActividades);				
			}
			
			this.jMenuItemGuardarCambiosListadosCentrosActividades.setVisible((this.isVisibilidadCeldaGuardarListadosCentrosActividades && this.isPermisoGuardarCambiosListadosCentrosActividades));						
			this.jMenuItemGuardarCambiosTablaListadosCentrosActividades.setVisible((this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades && this.isPermisoGuardarCambiosListadosCentrosActividades));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoListadosCentrosActividades=this.jButtonNuevoListadosCentrosActividades.isVisible();
			this.isVisibilidadCeldaDuplicarListadosCentrosActividades=this.jButtonDuplicarListadosCentrosActividades.isVisible();
			this.isVisibilidadCeldaCopiarListadosCentrosActividades=this.jButtonCopiarListadosCentrosActividades.isVisible();
			this.isVisibilidadCeldaVerFormListadosCentrosActividades=this.jButtonVerFormListadosCentrosActividades.isVisible();
			
			this.isVisibilidadCeldaOrdenListadosCentrosActividades=this.jButtonAbrirOrderByListadosCentrosActividades.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades=this.jButtonNuevoRelacionesListadosCentrosActividades.isVisible();
			this.isVisibilidadCeldaModificarListadosCentrosActividades=this.jButtonModificarListadosCentrosActividades.isVisible();
			
			if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
			this.isVisibilidadCeldaActualizarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonActualizarListadosCentrosActividades.isVisible();
			this.isVisibilidadCeldaEliminarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonEliminarListadosCentrosActividades.isVisible();
			this.isVisibilidadCeldaCancelarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonCancelarListadosCentrosActividades.isVisible();
			this.isVisibilidadCeldaGuardarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonGuardarCambiosListadosCentrosActividades.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades=this.jButtonGuardarCambiosTablaListadosCentrosActividades.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoListadosCentrosActividades=this.jButtonNuevoToolBarListadosCentrosActividades.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades=this.jButtonNuevoRelacionesToolBarListadosCentrosActividades.isVisible();
			
			if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
			this.isVisibilidadCeldaModificarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonModificarToolBarListadosCentrosActividades.isVisible();
			this.isVisibilidadCeldaActualizarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonActualizarToolBarListadosCentrosActividades.isVisible();
			this.isVisibilidadCeldaEliminarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonEliminarToolBarListadosCentrosActividades.isVisible();
			this.isVisibilidadCeldaCancelarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonCancelarToolBarListadosCentrosActividades.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarListadosCentrosActividades=this.jButtonGuardarCambiosToolBarListadosCentrosActividades.isVisible();
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades=this.jButtonGuardarCambiosTablaToolBarListadosCentrosActividades.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoListadosCentrosActividades=this.jMenuItemNuevoListadosCentrosActividades.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades=this.jMenuItemNuevoRelacionesListadosCentrosActividades.isVisible();
			
			if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
			this.isVisibilidadCeldaModificarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemModificarListadosCentrosActividades.isVisible();
			this.isVisibilidadCeldaActualizarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemActualizarListadosCentrosActividades.isVisible();
			this.isVisibilidadCeldaEliminarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemEliminarListadosCentrosActividades.isVisible();
			this.isVisibilidadCeldaCancelarListadosCentrosActividades=this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemCancelarListadosCentrosActividades.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarListadosCentrosActividades=this.jMenuItemGuardarCambiosListadosCentrosActividades.isVisible();
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades=this.jMenuItemGuardarCambiosTablaListadosCentrosActividades.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesListadosCentrosActividades(Boolean esInicializar) {
		if(ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.listadoscentrosactividadesSessionBean.getConGuardarRelaciones()) {
				//if(this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesListadosCentrosActividades();
			}
			
			this.inicializarActualizarBindingBotonesManualListadosCentrosActividades(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualListadosCentrosActividades() {
		this.jButtonNuevoListadosCentrosActividades.setVisible(this.isPermisoNuevoListadosCentrosActividades);			
		this.jButtonDuplicarListadosCentrosActividades.setVisible(this.isPermisoDuplicarListadosCentrosActividades);			
		this.jButtonCopiarListadosCentrosActividades.setVisible(this.isPermisoCopiarListadosCentrosActividades);			
		this.jButtonVerFormListadosCentrosActividades.setVisible(this.isPermisoVerFormListadosCentrosActividades);			
		
		this.jButtonAbrirOrderByListadosCentrosActividades.setVisible(this.isPermisoOrdenListadosCentrosActividades);					
		
		this.jButtonNuevoRelacionesListadosCentrosActividades.setVisible(this.isPermisoNuevoListadosCentrosActividades);			
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonModificarListadosCentrosActividades.setVisible(this.isPermisoActualizarListadosCentrosActividades);	
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonActualizarListadosCentrosActividades.setVisible(this.isPermisoActualizarListadosCentrosActividades);	
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonEliminarListadosCentrosActividades.setVisible(this.isPermisoEliminarListadosCentrosActividades);
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonCancelarListadosCentrosActividades.setVisible(this.isVisibilidadCeldaCancelarListadosCentrosActividades);						
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonGuardarCambiosListadosCentrosActividades.setVisible(this.isPermisoGuardarCambiosListadosCentrosActividades);							
		}
		
		this.jButtonGuardarCambiosTablaListadosCentrosActividades.setVisible(this.isPermisoActualizarListadosCentrosActividades);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleListadosCentrosActividades() {
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonModificarListadosCentrosActividades.setVisible(this.isPermisoActualizarListadosCentrosActividades);	
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonActualizarListadosCentrosActividades.setVisible(this.isPermisoActualizarListadosCentrosActividades);	
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonEliminarListadosCentrosActividades.setVisible(this.isPermisoEliminarListadosCentrosActividades);
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonCancelarListadosCentrosActividades.setVisible(this.isVisibilidadCeldaCancelarListadosCentrosActividades);							
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonGuardarCambiosListadosCentrosActividades.setVisible((this.isVisibilidadCeldaGuardarListadosCentrosActividades && this.isPermisoGuardarCambiosListadosCentrosActividades));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosListadosCentrosActividades() {
		if(ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualListadosCentrosActividades();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesListadosCentrosActividades() {
	}
	
	public void jTableDatosListadosCentrosActividadesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarListadosCentrosActividades(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidListadosCentrosActividadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosCentrosActividades(this.getlistadoscentrosactividades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosActividades(this.listadoscentrosactividades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoscentrosactividades==null) {
						this.listadoscentrosactividades = new ListadosCentrosActividades();
					}

					this.setVariablesFormularioToObjetoActualListadosCentrosActividades(this.listadoscentrosactividades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosActividades(this.listadoscentrosactividades);
				}

				if(this.listadoscentrosactividades.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.listadoscentrosactividades.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosCentrosActividades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaListadosCentrosActividadesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebListadosCentrosActividades(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosListadosCentrosActividades.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosListadosCentrosActividades.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualListadosCentrosActividades(this.getlistadoscentrosactividades(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosActividades(this.listadoscentrosactividades);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.listadoscentrosactividadesLogic.getConnexion());

				if(this.listadoscentrosactividades.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.listadoscentrosactividades.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderListadosCentrosActividades=(TitledBorder)this.jScrollPanelDatosListadosCentrosActividades.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderListadosCentrosActividades.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaListadosCentrosActividadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosCentrosActividades(this.getlistadoscentrosactividades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosActividades(this.listadoscentrosactividades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoscentrosactividades==null) {
						this.listadoscentrosactividades = new ListadosCentrosActividades();
					}

					this.setVariablesFormularioToObjetoActualListadosCentrosActividades(this.listadoscentrosactividades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosActividades(this.listadoscentrosactividades);
				}

				if(this.listadoscentrosactividades.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.listadoscentrosactividades.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosCentrosActividades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoListadosCentrosActividadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosCentrosActividades(this.getlistadoscentrosactividades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosActividades(this.listadoscentrosactividades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoscentrosactividades==null) {
						this.listadoscentrosactividades = new ListadosCentrosActividades();
					}

					this.setVariablesFormularioToObjetoActualListadosCentrosActividades(this.listadoscentrosactividades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosActividades(this.listadoscentrosactividades);
				}

				if(this.listadoscentrosactividades.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.listadoscentrosactividades.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosCentrosActividades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreListadosCentrosActividadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosCentrosActividades(this.getlistadoscentrosactividades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosActividades(this.listadoscentrosactividades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoscentrosactividades==null) {
						this.listadoscentrosactividades = new ListadosCentrosActividades();
					}

					this.setVariablesFormularioToObjetoActualListadosCentrosActividades(this.listadoscentrosactividades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosActividades(this.listadoscentrosactividades);
				}

				if(this.listadoscentrosactividades.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.listadoscentrosactividades.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosCentrosActividades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaListadosCentrosActividadesListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadosCentrosActividades(false,false);

			this.getListadosCentrosActividadessBusquedaListadosCentrosActividades();

			this.inicializarActualizarBindingListadosCentrosActividades(false);

			//if(ListadosCentrosActividadesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadosCentrosActividades(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaListadosCentrosActividadesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadosCentrosActividades(false,false);

			this.getListadosCentrosActividadessFK_IdEmpresa();

			this.inicializarActualizarBindingListadosCentrosActividades(false);

			//if(ListadosCentrosActividadesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadosCentrosActividades(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentrosactividadesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameListadosCentrosActividades() {
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.setVisible(false);	    			
			this.jInternalFrameDetalleFormListadosCentrosActividades.dispose();
			this.jInternalFrameDetalleFormListadosCentrosActividades=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoListadosCentrosActividades!=null) {
			this.jInternalFrameReporteDinamicoListadosCentrosActividades.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoListadosCentrosActividades.dispose();
			this.jInternalFrameReporteDinamicoListadosCentrosActividades=null;
		}
		
		if(this.jInternalFrameImportacionListadosCentrosActividades!=null) {
			this.jInternalFrameImportacionListadosCentrosActividades.setVisible(false);	    			
			this.jInternalFrameImportacionListadosCentrosActividades.dispose();
			this.jInternalFrameImportacionListadosCentrosActividades=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessListadosCentrosActividades();
			
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
			
			
			if(sTipo.equals("NuevoListadosCentrosActividades")) {
				jButtonNuevoListadosCentrosActividadesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarListadosCentrosActividades")) {
				jButtonDuplicarListadosCentrosActividadesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarListadosCentrosActividades")) {
				jButtonCopiarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("VerFormListadosCentrosActividades")) {
				jButtonVerFormListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarListadosCentrosActividades")) {
				jButtonNuevoListadosCentrosActividadesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarListadosCentrosActividades")) {
				jButtonDuplicarListadosCentrosActividadesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoListadosCentrosActividades")) {
				jButtonNuevoListadosCentrosActividadesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarListadosCentrosActividades")) {
				jButtonDuplicarListadosCentrosActividadesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesListadosCentrosActividades")) {
				jButtonNuevoListadosCentrosActividadesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarListadosCentrosActividades")) {
				jButtonNuevoListadosCentrosActividadesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesListadosCentrosActividades")) {
				jButtonNuevoListadosCentrosActividadesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarListadosCentrosActividades")) {
				jButtonModificarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarListadosCentrosActividades")) {
				jButtonModificarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarListadosCentrosActividades")) {
				jButtonModificarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarListadosCentrosActividades")) {
				jButtonActualizarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarListadosCentrosActividades")) {
				jButtonActualizarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarListadosCentrosActividades")) {
				jButtonActualizarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("EliminarListadosCentrosActividades")) {
				jButtonEliminarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarListadosCentrosActividades")) {
				jButtonEliminarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarListadosCentrosActividades")) {
				jButtonEliminarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("CancelarListadosCentrosActividades")) {
				jButtonCancelarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarListadosCentrosActividades")) {
				jButtonCancelarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarListadosCentrosActividades")) {
				jButtonCancelarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("CerrarListadosCentrosActividades")) {
				jButtonCerrarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarListadosCentrosActividades")) {
				jButtonCerrarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarListadosCentrosActividades")) {
				jButtonCerrarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarListadosCentrosActividades")) {
				jButtonMostrarOcultarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarListadosCentrosActividades")) {
				jButtonCancelarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosListadosCentrosActividades")) {
				jButtonGuardarCambiosListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarListadosCentrosActividades")) {
				jButtonGuardarCambiosListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarListadosCentrosActividades")) {
				jButtonCopiarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarListadosCentrosActividades")) {
				jButtonVerFormListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosListadosCentrosActividades")) {
				jButtonGuardarCambiosListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarListadosCentrosActividades")) {
				jButtonCopiarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormListadosCentrosActividades")) {
				jButtonVerFormListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaListadosCentrosActividades")) {
				jButtonGuardarCambiosListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarListadosCentrosActividades")) {
				jButtonGuardarCambiosListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaListadosCentrosActividades")) {
				jButtonGuardarCambiosListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionListadosCentrosActividades")) {
				jButtonRecargarInformacionListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarListadosCentrosActividades")) {
				jButtonRecargarInformacionListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionListadosCentrosActividades")) {
				jButtonRecargarInformacionListadosCentrosActividadesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresListadosCentrosActividades")) {
				jButtonAnterioresListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarListadosCentrosActividades")) {
				jButtonAnterioresListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreListadosCentrosActividades")) {
				jButtonAnterioresListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesListadosCentrosActividades")) {
				jButtonSiguientesListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarListadosCentrosActividades")) {
				jButtonSiguientesListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesListadosCentrosActividades")) {
				jButtonSiguientesListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByListadosCentrosActividades") || sTipo.equals("MenuItemDetalleAbrirOrderByListadosCentrosActividades")) {
				jButtonAbrirOrderByListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarListadosCentrosActividades") || sTipo.equals("MenuItemDetalleMostrarOcultarListadosCentrosActividades")) {
				jButtonMostrarOcultarListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosListadosCentrosActividades")) {
				jButtonNuevoGuardarCambiosListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarListadosCentrosActividades")) {
				jButtonNuevoGuardarCambiosListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosListadosCentrosActividades")) {
				jButtonNuevoGuardarCambiosListadosCentrosActividadesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoListadosCentrosActividades")) {
				jButtonCerrarReporteDinamicoListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoListadosCentrosActividades")) {
				jButtonGenerarReporteDinamicoListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoListadosCentrosActividades")) {
				
				jButtonGenerarExcelReporteDinamicoListadosCentrosActividadesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionListadosCentrosActividades")) {
				jButtonCerrarImportacionListadosCentrosActividadesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionListadosCentrosActividades")) {
				
				jButtonGenerarImportacionListadosCentrosActividadesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionListadosCentrosActividades")) {
				
				jButtonAbrirImportacionListadosCentrosActividadesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesListadosCentrosActividades")) {
				jComboBoxTiposAccionesListadosCentrosActividadesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesListadosCentrosActividades")) {
				jComboBoxTiposRelacionesListadosCentrosActividadesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioListadosCentrosActividades")) {
				jComboBoxTiposAccionesListadosCentrosActividadesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarListadosCentrosActividades")) {
				
				jComboBoxTiposSeleccionarListadosCentrosActividadesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralListadosCentrosActividades")) {
				jTextFieldValorCampoGeneralListadosCentrosActividadesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByListadosCentrosActividades")) {
				jButtonAbrirOrderByListadosCentrosActividadesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarListadosCentrosActividades")) {
				jButtonAbrirOrderByListadosCentrosActividadesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByListadosCentrosActividades")) {
				jButtonCerrarOrderByListadosCentrosActividadesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idListadosCentrosActividadesBusqueda")) {
				this.jButtonidListadosCentrosActividadesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaListadosCentrosActividadesUpdate")) {
				this.jButtonid_empresaListadosCentrosActividadesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaListadosCentrosActividadesBusqueda")) {
				this.jButtonid_empresaListadosCentrosActividadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoListadosCentrosActividadesBusqueda")) {
				this.jButtoncodigoListadosCentrosActividadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreListadosCentrosActividadesBusqueda")) {
				this.jButtonnombreListadosCentrosActividadesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaListadosCentrosActividadesListadosCentrosActividades")) {
				this.jButtonBusquedaListadosCentrosActividadesListadosCentrosActividadesActionPerformed(evt);
			}
			
			;
			
			
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessListadosCentrosActividades();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosCentrosActividadesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentrosactividades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentrosactividades);
				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
				
				


				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosActividades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosActividades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ListadosCentrosActividades listadoscentrosactividadesLocal=null;
			
			if(!this.getEsControlTabla()) {
				listadoscentrosactividadesLocal=this.listadoscentrosactividades;
			} else {
				listadoscentrosactividadesLocal=this.listadoscentrosactividadesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentrosactividades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentrosactividades);
				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
							
				
				


				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosActividades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosActividades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosCentrosActividadesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesAnterior =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoscentrosactividadesAnterior =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
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
			
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
			
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
			
			


			
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosCentrosActividadesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentrosactividades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentrosactividades);
				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
								
						
				


				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosActividades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosActividades.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentrosactividades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentrosactividades);
				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
								
				
				


				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosActividades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosActividades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosCentrosActividadesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesAnterior =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoscentrosactividadesAnterior =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentrosactividades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentrosactividades);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosCentrosActividadesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesAnterior =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoscentrosactividadesAnterior =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosCentrosActividadesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentrosactividades);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadoscentrosactividades);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentrosactividades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentrosactividades);
				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
							
				
				


				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosActividades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosActividades.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosCentrosActividadesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoscentrosactividadesAnterior =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.listadoscentrosactividadesAnterior =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
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
			
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
			
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
			
			


			
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosCentrosActividadesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentrosactividades);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadoscentrosactividades);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentrosactividades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentrosactividades);
				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
								
				
				


				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosActividades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosActividades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosCentrosActividadesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesAnterior =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoscentrosactividadesAnterior =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosCentrosActividadesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentrosactividades);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadoscentrosactividades);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosCentrosActividadesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentrosactividades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentrosactividades);
				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosListadosCentrosActividades")) {
					jCheckBoxSeleccionarTodosListadosCentrosActividadesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosListadosCentrosActividades")) {
					jCheckBoxSeleccionadosListadosCentrosActividadesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarListadosCentrosActividades")) {
					
				}
				
				


				
				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosActividades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosActividades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentrosactividades);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.listadoscentrosactividades);
				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
												
				
				


				
				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosActividades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosActividades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosCentrosActividadesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoscentrosactividadesAnterior =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.listadoscentrosactividadesAnterior =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosCentrosActividadesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentrosactividades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentrosactividades);
				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
				
				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
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
			
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
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
			
			


			
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosCentrosActividadesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentrosactividades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentrosactividades);
				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosActividades.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosActividades.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentrosactividades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentrosactividades);
				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
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
				
				


				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosActividades.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosActividades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosCentrosActividadesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentrosactividadesAnterior =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoscentrosactividadesAnterior =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarListadosCentrosActividades")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosListadosCentrosActividadesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosListadosCentrosActividades.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.listadoscentrosactividades =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.listadoscentrosactividades);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarListadosCentrosActividades")) {
				
				}
				
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarListadosCentrosActividades")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosListadosCentrosActividades.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarListadosCentrosActividades")) {
			
			}
			
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessListadosCentrosActividades();
			
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
			
			if(sTipo.equals("NuevoListadosCentrosActividades")) {
				jButtonNuevoListadosCentrosActividadesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarListadosCentrosActividades")) {
				jButtonDuplicarListadosCentrosActividadesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarListadosCentrosActividades")) {
				jButtonCopiarListadosCentrosActividadesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormListadosCentrosActividades")) {
				jButtonVerFormListadosCentrosActividadesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesListadosCentrosActividades")) {
				jButtonNuevoListadosCentrosActividadesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarListadosCentrosActividades")) {
				jButtonModificarListadosCentrosActividadesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarListadosCentrosActividades")) {
				jButtonActualizarListadosCentrosActividadesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarListadosCentrosActividades")) {
				jButtonEliminarListadosCentrosActividadesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaListadosCentrosActividades")) {
				jButtonGuardarCambiosListadosCentrosActividadesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarListadosCentrosActividades")) {
				jButtonCancelarListadosCentrosActividadesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarListadosCentrosActividades")) {
				jButtonCerrarListadosCentrosActividadesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosListadosCentrosActividades")) {
				jButtonGuardarCambiosListadosCentrosActividadesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosListadosCentrosActividades")) {
				jButtonNuevoGuardarCambiosListadosCentrosActividadesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByListadosCentrosActividades")) {
				jButtonAbrirOrderByListadosCentrosActividadesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionListadosCentrosActividades")) {
				jButtonRecargarInformacionListadosCentrosActividadesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresListadosCentrosActividades")) {
				jButtonAnterioresListadosCentrosActividadesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesListadosCentrosActividades")) {
				jButtonSiguientesListadosCentrosActividadesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idListadosCentrosActividadesBusqueda")) {
				this.jButtonidListadosCentrosActividadesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaListadosCentrosActividadesUpdate")) {
				this.jButtonid_empresaListadosCentrosActividadesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaListadosCentrosActividadesBusqueda")) {
				this.jButtonid_empresaListadosCentrosActividadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoListadosCentrosActividadesBusqueda")) {
				this.jButtoncodigoListadosCentrosActividadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreListadosCentrosActividadesBusqueda")) {
				this.jButtonnombreListadosCentrosActividadesBusquedaActionPerformed(evt);
			}
			
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessListadosCentrosActividades();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameListadosCentrosActividades")) {
				closingInternalFrameListadosCentrosActividades();
				
			} else if(sTipo.equals("jButtonCancelarListadosCentrosActividades")) {
				JInternalFrameBase jInternalFrameDetalleFormListadosCentrosActividades = (JInternalFrameBase)evt.getSource();
	            	
	            ListadosCentrosActividadesBeanSwingJInternalFrame jInternalFrameParent=(ListadosCentrosActividadesBeanSwingJInternalFrame)jInternalFrameDetalleFormListadosCentrosActividades.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarListadosCentrosActividadesActionPerformed(null);
			}
			
			ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.listadoscentrosactividades,new Object(),this.listadoscentrosactividadesParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormListadosCentrosActividades(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormListadosCentrosActividades(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormListadosCentrosActividades(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.listadoscentrosactividades)) {
			if(!esControlTabla) {
				if(ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualListadosCentrosActividades(this.listadoscentrosactividades,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosActividades(this.listadoscentrosactividades);			
				}
				
				if(this.listadoscentrosactividadesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualListadosCentrosActividades(this.listadoscentrosactividades,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanListadosCentrosActividades(this.listadoscentrosactividadesReturnGeneral,this.listadoscentrosactividadesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.listadoscentrosactividadesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanListadosCentrosActividades(classes,this.listadoscentrosactividadesReturnGeneral,this.listadoscentrosactividadesBean,false);
					}
						
					if(this.listadoscentrosactividadesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyListadosCentrosActividades(this.listadoscentrosactividadesReturnGeneral.getListadosCentrosActividades());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioListadosCentrosActividades(this.listadoscentrosactividadesReturnGeneral.getListadosCentrosActividades());	
					}
						
					if(this.listadoscentrosactividadesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioListadosCentrosActividades(this.listadoscentrosactividadesReturnGeneral.getListadosCentrosActividades(),classes);//this.listadoscentrosactividadesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioListadosCentrosActividades(this.listadoscentrosactividades,classes);//this.listadoscentrosactividadesBean);									
				}
			
				if(ListadosCentrosActividadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualListadosCentrosActividades(this.listadoscentrosactividades,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosActividades(this.listadoscentrosactividades);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.listadoscentrosactividadesAnterior!=null) {
						this.listadoscentrosactividades=this.listadoscentrosactividadesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.listadoscentrosactividadesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.listadoscentrosactividadesReturnGeneral.getListadosCentrosActividades(),listadoscentrosactividadesLogic.getListadosCentrosActividadess());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.listadoscentrosactividadesReturnGeneral.getListadosCentrosActividades(),this.listadoscentrosactividadess);
				}
				//ARCHITECTURE
				
				//this.jTableDatosListadosCentrosActividades.repaint();
				
				//((AbstractTableModel) this.jTableDatosListadosCentrosActividades.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosListadosCentrosActividades();
			}
		}
	}
	
	public void actualizarVisualTableDatosListadosCentrosActividades() throws Exception {
		
		ListadosCentrosActividadesModel listadoscentrosactividadesModel=(ListadosCentrosActividadesModel)this.jTableDatosListadosCentrosActividades.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadoscentrosactividadesModel.listadoscentrosactividadess=this.listadoscentrosactividadesLogic.getListadosCentrosActividadess();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			listadoscentrosactividadesModel.listadoscentrosactividadess=this.listadoscentrosactividadess;
		}
		
		
		((ListadosCentrosActividadesModel) this.jTableDatosListadosCentrosActividades.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaListadosCentrosActividades() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getlistadoscentrosactividadesAnterior(),this.listadoscentrosactividadesLogic.getListadosCentrosActividadess());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getlistadoscentrosactividadesAnterior(),this.listadoscentrosactividadess);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosListadosCentrosActividades();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividades,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
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
										
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.listadoscentrosactividades,new Object(),generalEntityParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.listadoscentrosactividadesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ListadosCentrosActividadesConstantesFunciones.getClassesRelationshipsOfListadosCentrosActividades(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ListadosCentrosActividadesConstantesFunciones.getClassesRelationshipsFromStringsOfListadosCentrosActividades(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormListadosCentrosActividades(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.listadoscentrosactividades,new Object(),generalEntityParameterGeneral,this.listadoscentrosactividadesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioListadosCentrosActividades(ListadosCentrosActividadesBean listadoscentrosactividadesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanListadosCentrosActividades(ArrayList<Classe> classes,ListadosCentrosActividadesReturnGeneral listadoscentrosactividadesReturnGeneral,ListadosCentrosActividadesBean listadoscentrosactividadesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividades,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.listadoscentrosactividades)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormListadosCentrosActividades = new ListadosCentrosActividadesDetalleFormJInternalFrame(jDesktopPane,this.listadoscentrosactividadesSessionBean.getConGuardarRelaciones(),this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormListadosCentrosActividades);
		this.jInternalFrameDetalleFormListadosCentrosActividades.setVisible(false);
		this.jInternalFrameDetalleFormListadosCentrosActividades.setSelected(false);						
		
		this.jInternalFrameDetalleFormListadosCentrosActividades.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormListadosCentrosActividades.listadoscentrosactividadesLogic=this.listadoscentrosactividadesLogic;
		
		this.cargarCombosFrameForeignKeyListadosCentrosActividades("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleListadosCentrosActividades();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleListadosCentrosActividades();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyListadosCentrosActividades("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyListadosCentrosActividades();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormListadosCentrosActividades.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarListadosCentrosActividades"));
		
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonModificarListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"ModificarListadosCentrosActividades"));

		
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonModificarToolBarListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"ModificarToolBarListadosCentrosActividades"));
					
		this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemModificarListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"MenuItemModificarListadosCentrosActividades"));		
		
		
		
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonActualizarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"ActualizarListadosCentrosActividades"));
		
		
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonActualizarToolBarListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"ActualizarToolBarListadosCentrosActividades"));
						
		this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemActualizarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemActualizarListadosCentrosActividades"));		
		
		
		
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonEliminarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"EliminarListadosCentrosActividades"));
		
		
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonEliminarToolBarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"EliminarToolBarListadosCentrosActividades"));
								
		this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemEliminarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemEliminarListadosCentrosActividades"));		
		
		
		
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonCancelarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"CancelarListadosCentrosActividades"));
		
		
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonCancelarToolBarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"CancelarToolBarListadosCentrosActividades"));
					
		this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemCancelarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemCancelarListadosCentrosActividades"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemDetalleCerrarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarListadosCentrosActividades"));		
		
		
		
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonGuardarCambiosToolBarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadosCentrosActividades"));
		
		
		
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonGuardarCambiosToolBarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadosCentrosActividades"));
		
		
		
		this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxTiposAccionesFormularioListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioListadosCentrosActividades"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonidListadosCentrosActividadesBusqueda.addActionListener(new ButtonActionListener(this,"idListadosCentrosActividadesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonid_empresaListadosCentrosActividadesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadosCentrosActividadesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonid_empresaListadosCentrosActividadesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadosCentrosActividadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtoncodigoListadosCentrosActividadesBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadosCentrosActividadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonnombreListadosCentrosActividadesBusqueda.addActionListener(new ButtonActionListener(this,"nombreListadosCentrosActividadesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormListadosCentrosActividades.jTabbedPaneRelacionesListadosCentrosActividades.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesListadosCentrosActividades"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameListadosCentrosActividades"));
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarListadosCentrosActividades"));
		}
		
		this.jTableDatosListadosCentrosActividades.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarListadosCentrosActividades"));
		
		this.jTableDatosListadosCentrosActividades.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarListadosCentrosActividades"));
		
		this.jButtonNuevoListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"NuevoListadosCentrosActividades"));
		
		this.jButtonDuplicarListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"DuplicarListadosCentrosActividades"));
		
		this.jButtonCopiarListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"CopiarListadosCentrosActividades"));
		
		this.jButtonVerFormListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"VerFormListadosCentrosActividades"));
		
		
		this.jButtonNuevoToolBarListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"NuevoToolBarListadosCentrosActividades"));
			
		this.jButtonDuplicarToolBarListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"DuplicarToolBarListadosCentrosActividades"));
			
		this.jMenuItemNuevoListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemNuevoListadosCentrosActividades"));
			
		this.jMenuItemDuplicarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarListadosCentrosActividades"));		
		
		
		this.jButtonNuevoRelacionesListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"NuevoRelacionesListadosCentrosActividades"));
		
		
		this.jButtonNuevoRelacionesToolBarListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarListadosCentrosActividades"));
			
		this.jMenuItemNuevoRelacionesListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesListadosCentrosActividades"));		
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonModificarListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"ModificarListadosCentrosActividades"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonModificarToolBarListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"ModificarToolBarListadosCentrosActividades"));
			
			this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemModificarListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"MenuItemModificarListadosCentrosActividades"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonActualizarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"ActualizarListadosCentrosActividades"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonActualizarToolBarListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"ActualizarToolBarListadosCentrosActividades"));
				
			this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemActualizarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemActualizarListadosCentrosActividades"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonEliminarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"EliminarListadosCentrosActividades"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonEliminarToolBarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"EliminarToolBarListadosCentrosActividades"));
						
			this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemEliminarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemEliminarListadosCentrosActividades"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonCancelarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"CancelarListadosCentrosActividades"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonCancelarToolBarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"CancelarToolBarListadosCentrosActividades"));
			
			this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemCancelarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemCancelarListadosCentrosActividades"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarListadosCentrosActividades"));		
		
		
		this.jButtonCerrarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"CerrarListadosCentrosActividades"));
		
		
		this.jButtonCerrarToolBarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"CerrarToolBarListadosCentrosActividades"));
			
		this.jMenuItemCerrarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemCerrarListadosCentrosActividades"));
			
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.jMenuItemDetalleCerrarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarListadosCentrosActividades"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonGuardarCambiosListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"GuardarCambiosListadosCentrosActividades"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonGuardarCambiosToolBarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadosCentrosActividades"));
		}
		
		this.jButtonCopiarToolBarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"CopiarToolBarListadosCentrosActividades"));
			
		this.jButtonVerFormToolBarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"VerFormToolBarListadosCentrosActividades"));
		
		this.jMenuItemGuardarCambiosListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosListadosCentrosActividades"));
			
		this.jMenuItemCopiarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemCopiarListadosCentrosActividades"));		
		
		this.jMenuItemVerFormListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemVerFormListadosCentrosActividades"));		
		
		
		this.jButtonGuardarCambiosTablaListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaListadosCentrosActividades"));
		
		
		this.jButtonGuardarCambiosTablaToolBarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarListadosCentrosActividades"));
			
		this.jMenuItemGuardarCambiosTablaListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaListadosCentrosActividades"));		
		
		
		
		this.jButtonRecargarInformacionListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"RecargarInformacionListadosCentrosActividades"));
					
		this.jButtonRecargarInformacionToolBarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarListadosCentrosActividades"));
		
		this.jMenuItemRecargarInformacionListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionListadosCentrosActividades"));		
		
		
		
		this.jButtonAnterioresListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"AnterioresListadosCentrosActividades"));
		
		
		this.jButtonAnterioresToolBarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"AnterioresToolBarListadosCentrosActividades"));
		
		this.jMenuItemAnterioresListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresListadosCentrosActividades"));		
		
		
		this.jButtonSiguientesListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"SiguientesListadosCentrosActividades"));
		
		
		this.jButtonSiguientesToolBarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"SiguientesToolBarListadosCentrosActividades"));
			
		this.jMenuItemSiguientesListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesListadosCentrosActividades"));
			
		this.jMenuItemAbrirOrderByListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByListadosCentrosActividades"));
			
		this.jMenuItemMostrarOcultarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarListadosCentrosActividades"));
			
		this.jMenuItemDetalleAbrirOrderByListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByListadosCentrosActividades"));
			
		this.jMenuItemDetalleMostarOcultarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarListadosCentrosActividades"));		
		
		
		this.jButtonNuevoGuardarCambiosListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosListadosCentrosActividades"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarListadosCentrosActividades"));
			
		this.jMenuItemNuevoGuardarCambiosListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosListadosCentrosActividades"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosListadosCentrosActividades.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosListadosCentrosActividades"));

		this.jCheckBoxSeleccionadosListadosCentrosActividades.addItemListener(new CheckBoxItemListener(this,"SeleccionadosListadosCentrosActividades"));
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxTiposAccionesFormularioListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioListadosCentrosActividades"));
		}
		
		
		this.jComboBoxTiposRelacionesListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"TiposRelacionesListadosCentrosActividades"));
			
		this.jComboBoxTiposAccionesListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"TiposAccionesListadosCentrosActividades"));
					
		this.jComboBoxTiposSeleccionarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"TiposSeleccionarListadosCentrosActividades"));
			
		this.jTextFieldValorCampoGeneralListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralListadosCentrosActividades"));		
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonidListadosCentrosActividadesBusqueda.addActionListener(new ButtonActionListener(this,"idListadosCentrosActividadesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonid_empresaListadosCentrosActividadesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadosCentrosActividadesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonid_empresaListadosCentrosActividadesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadosCentrosActividadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtoncodigoListadosCentrosActividadesBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadosCentrosActividadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonnombreListadosCentrosActividadesBusqueda.addActionListener(new ButtonActionListener(this,"nombreListadosCentrosActividadesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaListadosCentrosActividadesListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"BusquedaListadosCentrosActividadesListadosCentrosActividades"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoListadosCentrosActividades!=null) {
				this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadosCentrosActividades"));
				this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadosCentrosActividades"));
				this.jInternalFrameReporteDinamicoListadosCentrosActividades.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadosCentrosActividades"));
			}
			
			//this.jButtonCerrarReporteDinamicoListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadosCentrosActividades"));				
			//this.jButtonGenerarReporteDinamicoListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadosCentrosActividades"));
			//this.jButtonGenerarExcelReporteDinamicoListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadosCentrosActividades"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionListadosCentrosActividades!=null) {
				this.jInternalFrameImportacionListadosCentrosActividades.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionListadosCentrosActividades"));
				this.jInternalFrameImportacionListadosCentrosActividades.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionListadosCentrosActividades"));
				this.jInternalFrameImportacionListadosCentrosActividades.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionListadosCentrosActividades"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"AbrirOrderByListadosCentrosActividades"));
			
			this.jButtonAbrirOrderByToolBarListadosCentrosActividades.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarListadosCentrosActividades"));			
			
			if(this.jInternalFrameOrderByListadosCentrosActividades!=null) {
				this.jInternalFrameOrderByListadosCentrosActividades.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByListadosCentrosActividades"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosActividades.jTabbedPaneRelacionesListadosCentrosActividades.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesListadosCentrosActividades"));
		
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
            		closingInternalFrameListadosCentrosActividades();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormListadosCentrosActividades.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormListadosCentrosActividades = (JInternalFrameBase)event.getSource();
	            	
	            ListadosCentrosActividadesBeanSwingJInternalFrame jInternalFrameParent=(ListadosCentrosActividadesBeanSwingJInternalFrame)jInternalFrameDetalleFormListadosCentrosActividades.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarListadosCentrosActividadesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosListadosCentrosActividades.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosListadosCentrosActividadesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosListadosCentrosActividades.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosListadosCentrosActividades.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosCentrosActividadesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosCentrosActividadesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosCentrosActividadesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoListadosCentrosActividades";
		inputMap = this.jButtonNuevoListadosCentrosActividades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoListadosCentrosActividades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoListadosCentrosActividadesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosCentrosActividadesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosCentrosActividadesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosCentrosActividadesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesListadosCentrosActividades";
		inputMap = this.jButtonNuevoRelacionesListadosCentrosActividades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesListadosCentrosActividades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoListadosCentrosActividadesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarListadosCentrosActividades";
		inputMap = this.jButtonModificarListadosCentrosActividades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarListadosCentrosActividades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarListadosCentrosActividadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarListadosCentrosActividades";
		inputMap = this.jButtonActualizarListadosCentrosActividades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarListadosCentrosActividades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarListadosCentrosActividadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarListadosCentrosActividades";
		inputMap = this.jButtonEliminarListadosCentrosActividades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarListadosCentrosActividades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarListadosCentrosActividadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarListadosCentrosActividades";
		inputMap = this.jButtonCancelarListadosCentrosActividades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarListadosCentrosActividades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarListadosCentrosActividadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarListadosCentrosActividades";
		inputMap = this.jButtonCerrarListadosCentrosActividades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarListadosCentrosActividades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarListadosCentrosActividadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonGuardarCambiosListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosListadosCentrosActividades";
		inputMap = this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonGuardarCambiosListadosCentrosActividades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonGuardarCambiosListadosCentrosActividades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosListadosCentrosActividadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosListadosCentrosActividades.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosListadosCentrosActividadesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesListadosCentrosActividades.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesListadosCentrosActividadesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarListadosCentrosActividades.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarListadosCentrosActividadesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralListadosCentrosActividades.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralListadosCentrosActividadesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonidListadosCentrosActividadesBusqueda.addActionListener(new ButtonActionListener(this,"idListadosCentrosActividadesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonid_empresaListadosCentrosActividadesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadosCentrosActividadesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonid_empresaListadosCentrosActividadesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadosCentrosActividadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtoncodigoListadosCentrosActividadesBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadosCentrosActividadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosActividades.jButtonnombreListadosCentrosActividadesBusqueda.addActionListener(new ButtonActionListener(this,"nombreListadosCentrosActividadesBusqueda"));
		
		
		this.jButtonBusquedaListadosCentrosActividadesListadosCentrosActividades.addActionListener(new ButtonActionListener(this,"BusquedaListadosCentrosActividadesListadosCentrosActividades"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionListadosCentrosActividades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionListadosCentrosActividadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarListadosCentrosActividadesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarListadosCentrosActividades.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosListadosCentrosActividades(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ListadosCentrosActividades listadoscentrosactividadesAux:this.listadoscentrosactividadesLogic.getListadosCentrosActividadess()) {
					listadoscentrosactividadesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosCentrosActividades listadoscentrosactividadesAux:listadoscentrosactividadess) {
					listadoscentrosactividadesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosListadosCentrosActividadesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingListadosCentrosActividades(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ListadosCentrosActividades listadoscentrosactividadesAux:this.listadoscentrosactividadesLogic.getListadosCentrosActividadess()) {
						listadoscentrosactividadesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadosCentrosActividades listadoscentrosactividadesAux:listadoscentrosactividadess) {
						listadoscentrosactividadesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ListadosCentrosActividades listadoscentrosactividadesAux:this.listadoscentrosactividadesLogic.getListadosCentrosActividadess()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadosCentrosActividades listadoscentrosactividadesAux:listadoscentrosactividadess) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaListadosCentrosActividades(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosListadosCentrosActividades.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosListadosCentrosActividades.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosListadosCentrosActividades,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosListadosCentrosActividadesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingListadosCentrosActividades(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosListadosCentrosActividades.getSelectedRows();
			
			ListadosCentrosActividades listadoscentrosactividadesLocal=new ListadosCentrosActividades();
			
			//this.seleccionarTodosListadosCentrosActividades(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					listadoscentrosactividadesLocal =(ListadosCentrosActividades) this.listadoscentrosactividadesLogic.getListadosCentrosActividadess().toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					listadoscentrosactividadesLocal =(ListadosCentrosActividades) this.listadoscentrosactividadess.toArray()[this.jTableDatosListadosCentrosActividades.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				listadoscentrosactividadesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ListadosCentrosActividades listadoscentrosactividadesAux:this.listadoscentrosactividadesLogic.getListadosCentrosActividadess()) {
						listadoscentrosactividadesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadosCentrosActividades listadoscentrosactividadesAux:listadoscentrosactividadess) {
						listadoscentrosactividadesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaListadosCentrosActividades(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosListadosCentrosActividades.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosListadosCentrosActividades.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosListadosCentrosActividades,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualListadosCentrosActividadesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarListadosCentrosActividadesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralListadosCentrosActividadesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingListadosCentrosActividades(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralListadosCentrosActividades.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ListadosCentrosActividades listadoscentrosactividadesAux:this.listadoscentrosactividadesLogic.getListadosCentrosActividadess()) {
				
						if(sTipoSeleccionar.equals(ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							listadoscentrosactividadesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							listadoscentrosactividadesAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosCentrosActividades listadoscentrosactividadesAux:listadoscentrosactividadess) {
					
						if(sTipoSeleccionar.equals(ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							listadoscentrosactividadesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							listadoscentrosactividadesAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaListadosCentrosActividades(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesListadosCentrosActividadesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingListadosCentrosActividades(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioListadosCentrosActividades=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesListadosCentrosActividades.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxTiposAccionesFormularioListadosCentrosActividades.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteListadosCentrosActividades) {				
					conSplash=true;//false;										
					
					//this.startProcessListadosCentrosActividades(conSplash);
				
					this.generarReporteListadosCentrosActividadessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosCentrosActividades.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxTiposAccionesFormularioListadosCentrosActividades.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoListadosCentrosActividadessSeleccionados();
				//this.jComboBoxTiposAccionesListadosCentrosActividades.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoListadosCentrosActividadessSeleccionados(false);
				//this.jComboBoxTiposAccionesListadosCentrosActividades.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoListadosCentrosActividadessSeleccionados(true);
				//this.jComboBoxTiposAccionesListadosCentrosActividades.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessListadosCentrosActividades();
				
				this.exportarListadosCentrosActividadessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosCentrosActividades.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxTiposAccionesFormularioListadosCentrosActividades.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionListadosCentrosActividadess();
				//this.importarListadosCentrosActividadess();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosCentrosActividades.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxTiposAccionesFormularioListadosCentrosActividades.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessListadosCentrosActividades();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelListadosCentrosActividadessSeleccionados();
				//this.jComboBoxTiposAccionesListadosCentrosActividades.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Listados Centros Actividades", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessListadosCentrosActividades();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoListadosCentrosActividades)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyListadosCentrosActividades(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Listados Centros Actividades",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosCentrosActividades.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxTiposAccionesFormularioListadosCentrosActividades.setSelectedIndex(0);					
				}	
			} 			
			else if(ListadosCentrosActividadesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteListadosCentrosActividades) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessListadosCentrosActividades(conSplash);
					
						//this.actualizarParametrosGeneralListadosCentrosActividades();
						
						this.generarReporteProcesoAccionListadosCentrosActividadessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesListadosCentrosActividades.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxTiposAccionesFormularioListadosCentrosActividades.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Listados Centros ActividadesES SELECCIONADOS?", "MANTENIMIENTO DE Listados Centros Actividades", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessListadosCentrosActividades();
				
						this.actualizarParametrosGeneralListadosCentrosActividades();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.listadoscentrosactividadesReturnGeneral=listadoscentrosactividadesLogic.procesarAccionListadosCentrosActividadessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.listadoscentrosactividadesLogic.getListadosCentrosActividadess(),this.listadoscentrosactividadesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarListadosCentrosActividadesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesListadosCentrosActividades.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxTiposAccionesFormularioListadosCentrosActividades.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralListadosCentrosActividades();
					
					ListadosCentrosActividadesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarListadosCentrosActividadesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesListadosCentrosActividades.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxTiposAccionesFormularioListadosCentrosActividades.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessListadosCentrosActividades(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesListadosCentrosActividadesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessListadosCentrosActividades();
			
			if(this.jInternalFrameDetalleFormListadosCentrosActividades==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ListadosCentrosActividades> listadoscentrosactividadessSeleccionados=new ArrayList<ListadosCentrosActividades>();		
			ListadosCentrosActividades listadoscentrosactividades=new ListadosCentrosActividades();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingListadosCentrosActividades(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesListadosCentrosActividades.getSelectedItem();
			
			
			
			
			listadoscentrosactividadessSeleccionados=this.getListadosCentrosActividadessSeleccionados(true);
			//this.sTipoAccion;
			
			if(listadoscentrosactividadessSeleccionados.size()==1) {
				for(ListadosCentrosActividades listadoscentrosactividadesAux:listadoscentrosactividadessSeleccionados) {
					listadoscentrosactividades=listadoscentrosactividadesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessListadosCentrosActividades();
			
      		//this.finishProcessListadosCentrosActividades(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarListadosCentrosActividadesReturnGeneral() throws Exception {
		if(this.listadoscentrosactividadesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.listadoscentrosactividadesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.listadoscentrosactividadesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.listadoscentrosactividadesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.listadoscentrosactividadesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.listadoscentrosactividadesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingListadosCentrosActividades(false);
		}
		
		if(this.listadoscentrosactividadesReturnGeneral.getConRetornoLista() || this.listadoscentrosactividadesReturnGeneral.getConRetornoObjeto()) {
			if(this.listadoscentrosactividadesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.listadoscentrosactividadesLogic.setListadosCentrosActividadess(this.listadoscentrosactividadesReturnGeneral.getListadosCentrosActividadess());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingListadosCentrosActividades(false);
		}
	}
	
	public void actualizarParametrosGeneralListadosCentrosActividades() throws Exception {
		
		
	}
	
	public ArrayList<ListadosCentrosActividades> getListadosCentrosActividadessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ListadosCentrosActividades> listadoscentrosactividadessSeleccionados=new ArrayList<ListadosCentrosActividades>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioListadosCentrosActividades) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ListadosCentrosActividades listadoscentrosactividadesAux:listadoscentrosactividadesLogic.getListadosCentrosActividadess()) {
					if(listadoscentrosactividadesAux.getIsSelected()) {
						listadoscentrosactividadessSeleccionados.add(listadoscentrosactividadesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosCentrosActividades listadoscentrosactividadesAux:this.listadoscentrosactividadess) {
					if(listadoscentrosactividadesAux.getIsSelected()) {
						listadoscentrosactividadessSeleccionados.add(listadoscentrosactividadesAux);				
					}
				}
			}
			
			if(listadoscentrosactividadessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						listadoscentrosactividadessSeleccionados.addAll(this.listadoscentrosactividadesLogic.getListadosCentrosActividadess());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						listadoscentrosactividadessSeleccionados.addAll(this.listadoscentrosactividadess);				
					}
				}
			}
		} else {
			listadoscentrosactividadessSeleccionados.add(this.listadoscentrosactividades);
		}
		
		return listadoscentrosactividadessSeleccionados;
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
	
	public void generarReporteListadosCentrosActividadessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalListadosCentrosActividadessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoListadosCentrosActividadessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoListadosCentrosActividadessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoListadosCentrosActividadessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Listados Centros Actividades",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesListadosCentrosActividadessSeleccionados() throws Exception {
		ArrayList<ListadosCentrosActividades> listadoscentrosactividadessSeleccionados=new ArrayList<ListadosCentrosActividades>();		
		
		listadoscentrosactividadessSeleccionados=this.getListadosCentrosActividadessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteListadosCentrosActividadess("Todos",listadoscentrosactividadessSeleccionados);
		
	}	
	
	public void generarReporteNormalListadosCentrosActividadessSeleccionados() throws Exception {
		ArrayList<ListadosCentrosActividades> listadoscentrosactividadessSeleccionados=new ArrayList<ListadosCentrosActividades>();		
		
		listadoscentrosactividadessSeleccionados=this.getListadosCentrosActividadessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteListadosCentrosActividadess("Todos",listadoscentrosactividadessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionListadosCentrosActividadessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ListadosCentrosActividades> listadoscentrosactividadessSeleccionados=new ArrayList<ListadosCentrosActividades>();
		
		listadoscentrosactividadessSeleccionados=this.getListadosCentrosActividadessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteListadosCentrosActividadess("Todos",listadoscentrosactividadessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoListadosCentrosActividadessSeleccionados() throws Exception {
		ArrayList<ListadosCentrosActividades> listadoscentrosactividadessSeleccionados=new ArrayList<ListadosCentrosActividades>();		
		
		
		this.abrirInicializarFrameReporteDinamicoListadosCentrosActividades();
		
		
		listadoscentrosactividadessSeleccionados=this.getListadosCentrosActividadessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoListadosCentrosActividades();
		
		
		//this.generarReporteListadosCentrosActividadess("Todos",listadoscentrosactividadessSeleccionados ,listadoscentrosactividadesImplementable,listadoscentrosactividadesImplementableHome);
	}
	
	public void mostrarImportacionListadosCentrosActividadess() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionListadosCentrosActividades();
		
		this.abrirFrameImportacionListadosCentrosActividades();		
		
			
		//this.generarReporteListadosCentrosActividadess("Todos",listadoscentrosactividadessSeleccionados ,listadoscentrosactividadesImplementable,listadoscentrosactividadesImplementableHome);
	}
	
	public void importarListadosCentrosActividadess() throws Exception {		
	
	}
	
	public void exportarListadosCentrosActividadessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelListadosCentrosActividadessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoListadosCentrosActividadessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlListadosCentrosActividadessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Listados Centros Actividades",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoListadosCentrosActividadessSeleccionados() throws Exception {
		ArrayList<ListadosCentrosActividades> listadoscentrosactividadessSeleccionados=new ArrayList<ListadosCentrosActividades>();		
		
		listadoscentrosactividadessSeleccionados=this.getListadosCentrosActividadessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoscentrosactividades."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarListadosCentrosActividades(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ListadosCentrosActividades listadoscentrosactividadesAux:listadoscentrosactividadessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarListadosCentrosActividades(listadoscentrosactividadesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//listadoscentrosactividadesAux.setsDetalleGeneralEntityReporte(listadoscentrosactividadesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Centros Actividades",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarListadosCentrosActividades(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ListadosCentrosActividadesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosCentrosActividadesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosCentrosActividadesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividades,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=listadoscentrosactividades.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoscentrosactividades.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoscentrosactividades.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoscentrosactividades.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoscentrosactividades.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelListadosCentrosActividadessSeleccionados() throws Exception {
		ArrayList<ListadosCentrosActividades> listadoscentrosactividadessSeleccionados=new ArrayList<ListadosCentrosActividades>();		
		
		listadoscentrosactividadessSeleccionados=this.getListadosCentrosActividadessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoscentrosactividades.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ListadosCentrosActividadess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelListadosCentrosActividades(row);				
				iRow++;
			}				
			
			for(ListadosCentrosActividades listadoscentrosactividadesAux:listadoscentrosactividadessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelListadosCentrosActividades(listadoscentrosactividadesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Centros Actividades",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlListadosCentrosActividadessSeleccionados() throws Exception {
		ArrayList<ListadosCentrosActividades> listadoscentrosactividadessSeleccionados=new ArrayList<ListadosCentrosActividades>();		
		
		listadoscentrosactividadessSeleccionados=this.getListadosCentrosActividadessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoscentrosactividades.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("listadoscentrosactividadess");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("listadoscentrosactividades");
			//elementRoot.appendChild(element);
		
			for(ListadosCentrosActividades listadoscentrosactividadesAux:listadoscentrosactividadessSeleccionados) {
				element = document.createElement("listadoscentrosactividades");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlListadosCentrosActividades(listadoscentrosactividadesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Centros Actividades",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelListadosCentrosActividades(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosCentrosActividadesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosCentrosActividadesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ListadosCentrosActividadesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividades,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(listadoscentrosactividades.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoscentrosactividades.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoscentrosactividades.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoscentrosactividades.getnombre());				
	}
	
	public void setFilaDatosExportarXmlListadosCentrosActividades(ListadosCentrosActividades listadoscentrosactividades,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ListadosCentrosActividadesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(listadoscentrosactividades.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ListadosCentrosActividadesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(listadoscentrosactividades.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ListadosCentrosActividadesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(listadoscentrosactividades.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(ListadosCentrosActividadesConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(listadoscentrosactividades.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ListadosCentrosActividadesConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(listadoscentrosactividades.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoListadosCentrosActividadessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ListadosCentrosActividades> listadoscentrosactividadessSeleccionados=new ArrayList<ListadosCentrosActividades>();
		
		listadoscentrosactividadessSeleccionados=this.getListadosCentrosActividadessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoListadosCentrosActividades(listadoscentrosactividadessSeleccionados);
		
		this.generarReporteListadosCentrosActividadess("Todos",listadoscentrosactividadessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoListadosCentrosActividades(ArrayList<ListadosCentrosActividades> listadoscentrosactividadessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ListadosCentrosActividades listadoscentrosactividadesAux:listadoscentrosactividadessSeleccionados) {
				listadoscentrosactividadesAux.setsDetalleGeneralEntityReporte(listadoscentrosactividadesAux.toString());
			
				if(sTipoSeleccionar.equals(ListadosCentrosActividadesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					listadoscentrosactividadesAux.setsDescripcionGeneralEntityReporte1(listadoscentrosactividadesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ListadosCentrosActividadesConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					listadoscentrosactividadesAux.setsDescripcionGeneralEntityReporte1(listadoscentrosactividadesAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ListadosCentrosActividadesConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					listadoscentrosactividadesAux.setsDescripcionGeneralEntityReporte1(listadoscentrosactividadesAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosActividadesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesListadosCentrosActividades(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoListadosCentrosActividades=true;
				this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades=true;
				this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades=true;
			}
			
			this.isVisibilidadCeldaModificarListadosCentrosActividades=false;
			this.isVisibilidadCeldaActualizarListadosCentrosActividades=false;
			this.isVisibilidadCeldaEliminarListadosCentrosActividades=false;
			this.isVisibilidadCeldaCancelarListadosCentrosActividades=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosCentrosActividades=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosCentrosActividades=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoListadosCentrosActividades=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades=false;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades=false;
			this.isVisibilidadCeldaModificarListadosCentrosActividades=false;
			this.isVisibilidadCeldaActualizarListadosCentrosActividades=true;
			this.isVisibilidadCeldaEliminarListadosCentrosActividades=false;
			this.isVisibilidadCeldaCancelarListadosCentrosActividades=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosCentrosActividades=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosCentrosActividades=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoListadosCentrosActividades=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades=false;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades=false;
			this.isVisibilidadCeldaModificarListadosCentrosActividades=false;
			this.isVisibilidadCeldaActualizarListadosCentrosActividades=true;
			this.isVisibilidadCeldaEliminarListadosCentrosActividades=true;
			this.isVisibilidadCeldaCancelarListadosCentrosActividades=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosCentrosActividades=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosCentrosActividades=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoListadosCentrosActividades=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades=false;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades=false;
			this.isVisibilidadCeldaModificarListadosCentrosActividades=false;
			this.isVisibilidadCeldaActualizarListadosCentrosActividades=true;
			this.isVisibilidadCeldaEliminarListadosCentrosActividades=false;
			this.isVisibilidadCeldaCancelarListadosCentrosActividades=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosCentrosActividades=false;
				} else {
					this.isVisibilidadCeldaGuardarListadosCentrosActividades=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoListadosCentrosActividades=true;
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades=true;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades=true;
			this.isVisibilidadCeldaModificarListadosCentrosActividades=false;
			this.isVisibilidadCeldaActualizarListadosCentrosActividades=false;
			this.isVisibilidadCeldaEliminarListadosCentrosActividades=false;
			this.isVisibilidadCeldaCancelarListadosCentrosActividades=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosCentrosActividades=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosCentrosActividades=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoListadosCentrosActividades=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades=false;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades=false;
			this.isVisibilidadCeldaActualizarListadosCentrosActividades=false;
			this.isVisibilidadCeldaEliminarListadosCentrosActividades=false;
			this.isVisibilidadCeldaCancelarListadosCentrosActividades=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosCentrosActividades=false;
				} else {
					this.isVisibilidadCeldaGuardarListadosCentrosActividades=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoListadosCentrosActividades=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades=false;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades=false;
			this.isVisibilidadCeldaModificarListadosCentrosActividades=true;
			this.isVisibilidadCeldaActualizarListadosCentrosActividades=false;
			this.isVisibilidadCeldaEliminarListadosCentrosActividades=false;
			this.isVisibilidadCeldaCancelarListadosCentrosActividades=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosCentrosActividades=false;
				} else {
					this.isVisibilidadCeldaGuardarListadosCentrosActividades=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ListadosCentrosActividadesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoListadosCentrosActividades=true;
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades=true;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades=true;
		} else {
			this.actualizarEstadoPanelsListadosCentrosActividades(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarListadosCentrosActividades=false;
			//this.isVisibilidadCeldaVerFormListadosCentrosActividades=false;
			this.isVisibilidadCeldaDuplicarListadosCentrosActividades=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!listadoscentrosactividadesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades=false;
		} else {
			this.isVisibilidadCeldaNuevoListadosCentrosActividades=false;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
			if(!listadoscentrosactividadesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades=false;												
			}
			
			this.jButtonCerrarListadosCentrosActividades.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades=false;
		}
		
		if(!this.permiteMantenimiento(this.listadoscentrosactividades)) {
			this.isVisibilidadCeldaActualizarListadosCentrosActividades=false;
			this.isVisibilidadCeldaEliminarListadosCentrosActividades=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoListadosCentrosActividades=false;
		this.isVisibilidadCeldaNuevoRelacionesListadosCentrosActividades=false;
		this.isVisibilidadCeldaGuardarCambiosListadosCentrosActividades=false;
		//this.isVisibilidadCeldaModificarListadosCentrosActividades=true;
		this.isVisibilidadCeldaActualizarListadosCentrosActividades=false;
		this.isVisibilidadCeldaEliminarListadosCentrosActividades=false;
		//this.isVisibilidadCeldaCancelarListadosCentrosActividades=true;			
		this.isVisibilidadCeldaGuardarListadosCentrosActividades=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesListadosCentrosActividades() {
	}
	
	public void actualizarEstadoPanelsListadosCentrosActividades(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionListadosCentrosActividades!=null) {
				this.jScrollPanelDatosEdicionListadosCentrosActividades.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosCentrosActividades!=null) {
				this.jTabbedPaneBusquedasListadosCentrosActividades.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosCentrosActividades!=null) {
				this.jScrollPanelDatosListadosCentrosActividades.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosCentrosActividades!=null) {
				this.jPanelPaginacionListadosCentrosActividades.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosCentrosActividades!=null) {
				this.jPanelParametrosReportesListadosCentrosActividades.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionListadosCentrosActividades!=null) {
				this.jScrollPanelDatosEdicionListadosCentrosActividades.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosCentrosActividades!=null) {
				this.jTabbedPaneBusquedasListadosCentrosActividades.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosListadosCentrosActividades!=null) {
				this.jScrollPanelDatosListadosCentrosActividades.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadosCentrosActividades!=null) {
				this.jPanelPaginacionListadosCentrosActividades.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadosCentrosActividades!=null) {
				this.jPanelParametrosReportesListadosCentrosActividades.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionListadosCentrosActividades!=null) {
				this.jScrollPanelDatosEdicionListadosCentrosActividades.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosCentrosActividades!=null) {
				this.jTabbedPaneBusquedasListadosCentrosActividades.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosListadosCentrosActividades!=null) {
				this.jScrollPanelDatosListadosCentrosActividades.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadosCentrosActividades!=null) {
				this.jPanelPaginacionListadosCentrosActividades.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadosCentrosActividades!=null) {
				this.jPanelParametrosReportesListadosCentrosActividades.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionListadosCentrosActividades!=null) {
				this.jScrollPanelDatosEdicionListadosCentrosActividades.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosCentrosActividades!=null) {
				this.jTabbedPaneBusquedasListadosCentrosActividades.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosListadosCentrosActividades!=null) {
				this.jScrollPanelDatosListadosCentrosActividades.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadosCentrosActividades!=null) {
				this.jPanelPaginacionListadosCentrosActividades.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadosCentrosActividades!=null) {
				this.jPanelParametrosReportesListadosCentrosActividades.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionListadosCentrosActividades!=null) {
				this.jScrollPanelDatosEdicionListadosCentrosActividades.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosCentrosActividades!=null) {
				this.jTabbedPaneBusquedasListadosCentrosActividades.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosCentrosActividades!=null) {
				this.jScrollPanelDatosListadosCentrosActividades.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosCentrosActividades!=null) {
				this.jPanelPaginacionListadosCentrosActividades.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosCentrosActividades!=null) {
				this.jPanelParametrosReportesListadosCentrosActividades.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionListadosCentrosActividades!=null) {
				this.jScrollPanelDatosEdicionListadosCentrosActividades.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosCentrosActividades!=null) {
				this.jTabbedPaneBusquedasListadosCentrosActividades.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosCentrosActividades!=null) {
				this.jScrollPanelDatosListadosCentrosActividades.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosCentrosActividades!=null) {
				this.jPanelPaginacionListadosCentrosActividades.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosCentrosActividades!=null) {
				this.jPanelParametrosReportesListadosCentrosActividades.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionListadosCentrosActividades!=null) {
				this.jScrollPanelDatosEdicionListadosCentrosActividades.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosCentrosActividades!=null) {
				this.jTabbedPaneBusquedasListadosCentrosActividades.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosCentrosActividades!=null) {
				this.jScrollPanelDatosListadosCentrosActividades.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosCentrosActividades!=null) {
				this.jPanelPaginacionListadosCentrosActividades.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosCentrosActividades!=null) {
				this.jPanelParametrosReportesListadosCentrosActividades.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasListadosCentrosActividades!=null) {
					this.jTabbedPaneBusquedasListadosCentrosActividades.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesListadosCentrosActividades!=null) {
				this.jPanelParametrosReportesListadosCentrosActividades.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosCentrosActividades!=null) {
				this.jTabbedPaneBusquedasListadosCentrosActividades.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesListadosCentrosActividades!=null) {
				this.jPanelParametrosReportesListadosCentrosActividades.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaListadosCentrosActividades=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaListadosCentrosActividades) {this.jTabbedPaneBusquedasListadosCentrosActividades.remove(jPanelBusquedaListadosCentrosActividadesListadosCentrosActividades);}
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
			
			this.inicializarActualizarBindingTablaListadosCentrosActividades(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioListadosCentrosActividades() {
		this.updateBorderResaltarBusquedasFormularioListadosCentrosActividades();
		this.updateVisibilidadBusquedasFormularioListadosCentrosActividades();
		this.updateHabilitarBusquedasFormularioListadosCentrosActividades();
	}
	
	public void updateBorderResaltarBusquedasFormularioListadosCentrosActividades() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasListadosCentrosActividades.getComponents().length>0) {
	

		if(this.listadoscentrosactividadesConstantesFunciones.resaltarBusquedaListadosCentrosActividadesListadosCentrosActividades!=null) {
			index= this.jTabbedPaneBusquedasListadosCentrosActividades.indexOfComponent(this.jPanelBusquedaListadosCentrosActividadesListadosCentrosActividades);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasListadosCentrosActividades.getComponent(index);
				jPanel.setBorder(this.listadoscentrosactividadesConstantesFunciones.resaltarBusquedaListadosCentrosActividadesListadosCentrosActividades);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioListadosCentrosActividades() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasListadosCentrosActividades.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasListadosCentrosActividades.indexOfComponent(this.jPanelBusquedaListadosCentrosActividadesListadosCentrosActividades);
			jPanel=(JPanel)this.jTabbedPaneBusquedasListadosCentrosActividades.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.listadoscentrosactividadesConstantesFunciones.mostrarBusquedaListadosCentrosActividadesListadosCentrosActividades);
			if(!this.listadoscentrosactividadesConstantesFunciones.mostrarBusquedaListadosCentrosActividadesListadosCentrosActividades && index>-1) {
				this.jTabbedPaneBusquedasListadosCentrosActividades.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioListadosCentrosActividades() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasListadosCentrosActividades.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasListadosCentrosActividades.indexOfComponent(this.jPanelBusquedaListadosCentrosActividadesListadosCentrosActividades);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasListadosCentrosActividades.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.listadoscentrosactividadesConstantesFunciones.activarBusquedaListadosCentrosActividadesListadosCentrosActividades);
				this.jTabbedPaneBusquedasListadosCentrosActividades.setEnabledAt(index,this.listadoscentrosactividadesConstantesFunciones.activarBusquedaListadosCentrosActividadesListadosCentrosActividades);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaListadosCentrosActividades(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaListadosCentrosActividades")) {
			index= this.jTabbedPaneBusquedasListadosCentrosActividades.indexOfComponent(this.jPanelBusquedaListadosCentrosActividadesListadosCentrosActividades);

			this.jTabbedPaneBusquedasListadosCentrosActividades.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasListadosCentrosActividades.getComponent(index);

			this.listadoscentrosactividadesConstantesFunciones.setResaltarBusquedaListadosCentrosActividadesListadosCentrosActividades(resaltar);

			jPanel.setBorder(this.listadoscentrosactividadesConstantesFunciones.resaltarBusquedaListadosCentrosActividadesListadosCentrosActividades);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarListadosCentrosActividades.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioListadosCentrosActividades() throws Exception {

		if(this.jInternalFrameDetalleFormListadosCentrosActividades==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioListadosCentrosActividades();
		this.updateVisibilidadResaltarControlesFormularioListadosCentrosActividades();
		this.updateHabilitarResaltarControlesFormularioListadosCentrosActividades();
		
	}
	
	public void updateBorderResaltarControlesFormularioListadosCentrosActividades() throws Exception {
		if(this.jInternalFrameDetalleFormListadosCentrosActividades==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.listadoscentrosactividadesConstantesFunciones.resaltaridListadosCentrosActividades!=null && this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {this.jInternalFrameDetalleFormListadosCentrosActividades.jLabelidListadosCentrosActividades.setBorder(this.listadoscentrosactividadesConstantesFunciones.resaltaridListadosCentrosActividades);}
		if(this.listadoscentrosactividadesConstantesFunciones.resaltarid_empresaListadosCentrosActividades!=null && this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxid_empresaListadosCentrosActividades.setBorder(this.listadoscentrosactividadesConstantesFunciones.resaltarid_empresaListadosCentrosActividades);}
		if(this.listadoscentrosactividadesConstantesFunciones.resaltarcodigoListadosCentrosActividades!=null && this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {this.jInternalFrameDetalleFormListadosCentrosActividades.jTextFieldcodigoListadosCentrosActividades.setBorder(this.listadoscentrosactividadesConstantesFunciones.resaltarcodigoListadosCentrosActividades);}
		if(this.listadoscentrosactividadesConstantesFunciones.resaltarnombreListadosCentrosActividades!=null && this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {this.jInternalFrameDetalleFormListadosCentrosActividades.jTextAreanombreListadosCentrosActividades.setBorder(this.listadoscentrosactividadesConstantesFunciones.resaltarnombreListadosCentrosActividades);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioListadosCentrosActividades() throws Exception {		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
	
		//this.jInternalFrameDetalleFormListadosCentrosActividades.jLabelidListadosCentrosActividades.setVisible(this.listadoscentrosactividadesConstantesFunciones.mostraridListadosCentrosActividades);
		this.jInternalFrameDetalleFormListadosCentrosActividades.jPanelidListadosCentrosActividades.setVisible(this.listadoscentrosactividadesConstantesFunciones.mostraridListadosCentrosActividades);
		//this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxid_empresaListadosCentrosActividades.setVisible(this.listadoscentrosactividadesConstantesFunciones.mostrarid_empresaListadosCentrosActividades);
		this.jInternalFrameDetalleFormListadosCentrosActividades.jPanelid_empresaListadosCentrosActividades.setVisible(this.listadoscentrosactividadesConstantesFunciones.mostrarid_empresaListadosCentrosActividades);
		//this.jInternalFrameDetalleFormListadosCentrosActividades.jTextFieldcodigoListadosCentrosActividades.setVisible(this.listadoscentrosactividadesConstantesFunciones.mostrarcodigoListadosCentrosActividades);
		this.jInternalFrameDetalleFormListadosCentrosActividades.jPanelcodigoListadosCentrosActividades.setVisible(this.listadoscentrosactividadesConstantesFunciones.mostrarcodigoListadosCentrosActividades);
		//this.jInternalFrameDetalleFormListadosCentrosActividades.jTextAreanombreListadosCentrosActividades.setVisible(this.listadoscentrosactividadesConstantesFunciones.mostrarnombreListadosCentrosActividades);
		this.jInternalFrameDetalleFormListadosCentrosActividades.jPanelnombreListadosCentrosActividades.setVisible(this.listadoscentrosactividadesConstantesFunciones.mostrarnombreListadosCentrosActividades);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioListadosCentrosActividades() throws Exception {
		if(this.jInternalFrameDetalleFormListadosCentrosActividades==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormListadosCentrosActividades!=null) {
	
		this.jInternalFrameDetalleFormListadosCentrosActividades.jLabelidListadosCentrosActividades.setEnabled(this.listadoscentrosactividadesConstantesFunciones.activaridListadosCentrosActividades);
		this.jInternalFrameDetalleFormListadosCentrosActividades.jComboBoxid_empresaListadosCentrosActividades.setEnabled(this.listadoscentrosactividadesConstantesFunciones.activarid_empresaListadosCentrosActividades);
		this.jInternalFrameDetalleFormListadosCentrosActividades.jTextFieldcodigoListadosCentrosActividades.setEnabled(this.listadoscentrosactividadesConstantesFunciones.activarcodigoListadosCentrosActividades);
		this.jInternalFrameDetalleFormListadosCentrosActividades.jTextAreanombreListadosCentrosActividades.setEnabled(this.listadoscentrosactividadesConstantesFunciones.activarnombreListadosCentrosActividades);
		}
	}
	
		
}