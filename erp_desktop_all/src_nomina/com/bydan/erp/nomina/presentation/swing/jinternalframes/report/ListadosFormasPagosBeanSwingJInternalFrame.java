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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.nomina.util.ListadosFormasPagosConstantesFunciones;
import com.bydan.erp.nomina.util.report.ListadosFormasPagosParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.ListadosFormasPagosParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.ListadosFormasPagosBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.nomina.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.nomina.util.*;

import com.bydan.erp.nomina.util.report.*;
import com.bydan.erp.nomina.business.logic.report.*;

import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;

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


import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ListadosFormasPagosBeanSwingJInternalFrame extends ListadosFormasPagosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ListadosFormasPagosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ListadosFormasPagos> listadosformaspagosValidator = new ClassValidator<ListadosFormasPagos>(ListadosFormasPagos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ListadosFormasPagos listadosformaspagos;	
	public ListadosFormasPagos listadosformaspagosAux;
	public ListadosFormasPagos listadosformaspagosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ListadosFormasPagos listadosformaspagosTotales;
	public Long idListadosFormasPagosActual;
	public Long iIdNuevoListadosFormasPagos=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboTipoGrupoFormaPago="";

	public List<TipoGrupoFormaPago> tipogrupoformapagosForeignKey;

	public List<TipoGrupoFormaPago> gettipogrupoformapagosForeignKey() {
		return tipogrupoformapagosForeignKey;
	}

	public void settipogrupoformapagosForeignKey(List<TipoGrupoFormaPago> tipogrupoformapagosForeignKey) {
		this.tipogrupoformapagosForeignKey = tipogrupoformapagosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoGrupoFormaPago tipogrupoformapagoForeignKey;

	public TipoGrupoFormaPago gettipogrupoformapagoForeignKey() {
		return tipogrupoformapagoForeignKey;
	}

	public void settipogrupoformapagoForeignKey(TipoGrupoFormaPago tipogrupoformapagoForeignKey) {
		this.tipogrupoformapagoForeignKey = tipogrupoformapagoForeignKey;
	}

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
	
	public Boolean isPermisoTodoListadosFormasPagos;
	public Boolean isPermisoNuevoListadosFormasPagos;
	public Boolean isPermisoActualizarListadosFormasPagos;
	public Boolean isPermisoActualizarOriginalListadosFormasPagos;
	public Boolean isPermisoEliminarListadosFormasPagos;
	public Boolean isPermisoGuardarCambiosListadosFormasPagos;
	public Boolean isPermisoConsultaListadosFormasPagos;
	public Boolean isPermisoBusquedaListadosFormasPagos;
	public Boolean isPermisoReporteListadosFormasPagos;
	public Boolean isPermisoPaginacionMedioListadosFormasPagos;
	public Boolean isPermisoPaginacionAltoListadosFormasPagos;
	public Boolean isPermisoPaginacionTodoListadosFormasPagos;
	public Boolean isPermisoCopiarListadosFormasPagos;
	public Boolean isPermisoVerFormListadosFormasPagos;
	public Boolean isPermisoDuplicarListadosFormasPagos;
	public Boolean isPermisoOrdenListadosFormasPagos;
	
	
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
	
	public ListadosFormasPagosParameterReturnGeneral listadosformaspagosReturnGeneral;
	public ListadosFormasPagosParameterReturnGeneral listadosformaspagosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoListadosFormasPagos=false;
	public Boolean esParaAccionDesdeFormularioListadosFormasPagos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ListadosFormasPagosSessionBeanAdditional listadosformaspagosSessionBeanAdditional=null;
	
	public ListadosFormasPagosSessionBeanAdditional getListadosFormasPagosSessionBeanAdditional() {
		return this.listadosformaspagosSessionBeanAdditional;
	}
	
	public void setListadosFormasPagosSessionBeanAdditional(ListadosFormasPagosSessionBeanAdditional listadosformaspagosSessionBeanAdditional) {
		try {
			this.listadosformaspagosSessionBeanAdditional=listadosformaspagosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ListadosFormasPagosBeanSwingJInternalFrameAdditional listadosformaspagosBeanSwingJInternalFrameAdditional=null;
	//public class ListadosFormasPagosBeanSwingJInternalFrame
	
	public ListadosFormasPagosBeanSwingJInternalFrameAdditional getListadosFormasPagosBeanSwingJInternalFrameAdditional() {
		return this.listadosformaspagosBeanSwingJInternalFrameAdditional;
	}
	
	public void setListadosFormasPagosBeanSwingJInternalFrameAdditional(ListadosFormasPagosBeanSwingJInternalFrameAdditional listadosformaspagosBeanSwingJInternalFrameAdditional) {
		try {
			this.listadosformaspagosBeanSwingJInternalFrameAdditional=listadosformaspagosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ListadosFormasPagosLogic listadosformaspagosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ListadosFormasPagos listadosformaspagosBean;
	public ListadosFormasPagosConstantesFunciones listadosformaspagosConstantesFunciones;
	//public ListadosFormasPagosParameterReturnGeneral listadosformaspagosReturnGeneral;
	
	//FK
	
	public TipoGrupoFormaPagoLogic tipogrupoformapagoLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<ListadosFormasPagos> listadosformaspagoss;	
	//public List<ListadosFormasPagos> listadosformaspagossEliminados;
	//public List<ListadosFormasPagos> listadosformaspagossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoListadosFormasPagos=false;
	public Boolean isVisibilidadCeldaDuplicarListadosFormasPagos=true;
	public Boolean isVisibilidadCeldaCopiarListadosFormasPagos=true;
	public Boolean isVisibilidadCeldaVerFormListadosFormasPagos=true;
	public Boolean isVisibilidadCeldaOrdenListadosFormasPagos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesListadosFormasPagos=false;
	public Boolean isVisibilidadCeldaModificarListadosFormasPagos=false;
	public Boolean isVisibilidadCeldaActualizarListadosFormasPagos=false;
	public Boolean isVisibilidadCeldaEliminarListadosFormasPagos=false;
	public Boolean isVisibilidadCeldaCancelarListadosFormasPagos=false;
	public Boolean isVisibilidadCeldaGuardarListadosFormasPagos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosListadosFormasPagos=false;	
	
	
	public Boolean isVisibilidadBusquedaListadosFormasPagos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoGrupoFormaPago=false;
	
	public Long getiIdNuevoListadosFormasPagos() {
		return this.iIdNuevoListadosFormasPagos;
	}

	public void setiIdNuevoListadosFormasPagos(Long iIdNuevoListadosFormasPagos) {
		this.iIdNuevoListadosFormasPagos = iIdNuevoListadosFormasPagos;
	}
	
	public Long getidListadosFormasPagosActual() {
		return this.idListadosFormasPagosActual;
	}

	public void setidListadosFormasPagosActual(Long idListadosFormasPagosActual) {
		this.idListadosFormasPagosActual = idListadosFormasPagosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ListadosFormasPagos getlistadosformaspagos() {
		return this.listadosformaspagos;
	}

	public void setlistadosformaspagos(ListadosFormasPagos listadosformaspagos) {
		this.listadosformaspagos = listadosformaspagos;
	}
	
	public ListadosFormasPagos getlistadosformaspagosAux() {
		return this.listadosformaspagosAux;
	}

	public void setlistadosformaspagosAux(ListadosFormasPagos listadosformaspagosAux) {
		this.listadosformaspagosAux = listadosformaspagosAux;
	}				
	
	public ListadosFormasPagos getlistadosformaspagosAnterior() {
		return this.listadosformaspagosAnterior;
	}

	public void setlistadosformaspagosAnterior(ListadosFormasPagos listadosformaspagosAnterior) {
		this.listadosformaspagosAnterior = listadosformaspagosAnterior;
	}	
	
	public ListadosFormasPagos getlistadosformaspagosTotales() {
		return this.listadosformaspagosTotales;
	}

	public void setlistadosformaspagosTotales(ListadosFormasPagos listadosformaspagosTotales) {
		this.listadosformaspagosTotales = listadosformaspagosTotales;
	}	
	
	public ListadosFormasPagos getlistadosformaspagosBean() {
		return this.listadosformaspagosBean;
	}

	public void setlistadosformaspagosBean(ListadosFormasPagos listadosformaspagosBean) {
		this.listadosformaspagosBean = listadosformaspagosBean;
	}	
	
	public ListadosFormasPagosParameterReturnGeneral getlistadosformaspagosReturnGeneral() {
		return this.listadosformaspagosReturnGeneral;
	}

	public void setlistadosformaspagosReturnGeneral(ListadosFormasPagosParameterReturnGeneral listadosformaspagosReturnGeneral) {
		this.listadosformaspagosReturnGeneral = listadosformaspagosReturnGeneral;
	}	
	
	
	public Long id_tipo_grupo_forma_pagoBusquedaListadosFormasPagos=-1L;

	public Long getid_tipo_grupo_forma_pagoBusquedaListadosFormasPagos() {
		return this.id_tipo_grupo_forma_pagoBusquedaListadosFormasPagos;
	}

	public void setid_tipo_grupo_forma_pagoBusquedaListadosFormasPagos(Long id_tipo_grupo_forma_pagoBusquedaListadosFormasPagos) {
		this.id_tipo_grupo_forma_pagoBusquedaListadosFormasPagos = id_tipo_grupo_forma_pagoBusquedaListadosFormasPagos;
	}

;
	public Date fecha_desdeBusquedaListadosFormasPagos=new Date();

	public Date getfecha_desdeBusquedaListadosFormasPagos() {
		return this.fecha_desdeBusquedaListadosFormasPagos;
	}

	public void setfecha_desdeBusquedaListadosFormasPagos(Date fecha_desdeBusquedaListadosFormasPagos) {
		this.fecha_desdeBusquedaListadosFormasPagos = fecha_desdeBusquedaListadosFormasPagos;
	}

;
	public Date fecha_hastaBusquedaListadosFormasPagos=new Date();

	public Date getfecha_hastaBusquedaListadosFormasPagos() {
		return this.fecha_hastaBusquedaListadosFormasPagos;
	}

	public void setfecha_hastaBusquedaListadosFormasPagos(Date fecha_hastaBusquedaListadosFormasPagos) {
		this.fecha_hastaBusquedaListadosFormasPagos = fecha_hastaBusquedaListadosFormasPagos;
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

	public Long id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago=-1L;

	public Long getid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago() {
		return this.id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago;
	}

	public void setid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago(Long id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago) {
		this.id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago = id_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ListadosFormasPagosLogic getListadosFormasPagosLogic()	{		
		return listadosformaspagosLogic;
	}

	public void setListadosFormasPagosLogic(ListadosFormasPagosLogic listadosformaspagosLogic) {
		this.listadosformaspagosLogic = listadosformaspagosLogic;
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
	
	public Boolean getIsEsNuevoListadosFormasPagos() {
		return isEsNuevoListadosFormasPagos;
	}

	public void setIsEsNuevoListadosFormasPagos(Boolean isEsNuevoListadosFormasPagos) {
		this.isEsNuevoListadosFormasPagos = isEsNuevoListadosFormasPagos;
	}

	public Boolean getEsParaAccionDesdeFormularioListadosFormasPagos() {
		return esParaAccionDesdeFormularioListadosFormasPagos;
	}
	
	public void setEsParaAccionDesdeFormularioListadosFormasPagos(Boolean esParaAccionDesdeFormularioListadosFormasPagos) {
		this.esParaAccionDesdeFormularioListadosFormasPagos = esParaAccionDesdeFormularioListadosFormasPagos;
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
	
	
	public void cargarCombosTipoGrupoFormaPagosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipogrupoformapagosForeignKey=new ArrayList<TipoGrupoFormaPago>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoGrupoFormaPagoLogic tipogrupoformapagoLogic=new TipoGrupoFormaPagoLogic();

			tipogrupoformapagoLogic.getTipoGrupoFormaPagoDataAccess().setIsForForeingKeyData(true);

			if(this.listadosformaspagosSessionBean==null) {
				this.listadosformaspagosSessionBean=new ListadosFormasPagosSessionBean();
			}

			if(!this.listadosformaspagosSessionBean.getisBusquedaDesdeForeignKeySesionTipoGrupoFormaPago()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoformapagoLogic.getTipoGrupoFormaPagoDataAccess().setIsForForeingKeyData(true);

					tipogrupoformapagoLogic.getTodosTipoGrupoFormaPagosWithConnection(sFinalQuery,new Pagination());

					this.tipogrupoformapagosForeignKey=tipogrupoformapagoLogic.getTipoGrupoFormaPagos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoGrupoFormaPago(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoformapagoLogic.getEntityWithConnection(listadosformaspagosSessionBean.getlidTipoGrupoFormaPagoActual());
					this.tipogrupoformapagosForeignKey.add(tipogrupoformapagoLogic.getTipoGrupoFormaPago());
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

			if(this.listadosformaspagosSessionBean==null) {
				this.listadosformaspagosSessionBean=new ListadosFormasPagosSessionBean();
			}

			if(!this.listadosformaspagosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(listadosformaspagosSessionBean.getlidEmpresaActual());
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

			if(this.listadosformaspagosSessionBean==null) {
				this.listadosformaspagosSessionBean=new ListadosFormasPagosSessionBean();
			}

			if(!this.listadosformaspagosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(listadosformaspagosSessionBean.getlidSucursalActual());
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

	
	
	public void setActualTipoGrupoFormaPagoForeignKey(Long idTipoGrupoFormaPagoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoGrupoFormaPago  tipogrupoformapagoTemp=null;

			for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagosForeignKey) {
				if(tipogrupoformapagoAux.getId()!=null && tipogrupoformapagoAux.getId().equals(idTipoGrupoFormaPagoSeleccionado)) {
					tipogrupoformapagoTemp=tipogrupoformapagoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipogrupoformapagoTemp!=null) {

					if(this.listadosformaspagos!=null) {
						this.listadosformaspagos.setTipoGrupoFormaPago(tipogrupoformapagoTemp);
					}

					if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
						this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.setSelectedItem(tipogrupoformapagoTemp);
					}
				} else {
					//jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.setSelectedItem(tipogrupoformapagoTemp);
					if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
						if(this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.getItemCount()>0) {
							this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaListadosFormasPagos") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipogrupoformapagoTemp!=null && jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos!=null) {
						jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.setSelectedItem(tipogrupoformapagoTemp);
					} else {
						if(jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos!=null) {
							//jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.setSelectedItem(tipogrupoformapagoTemp);
							if(jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.getItemCount()>0) {
								jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.setSelectedIndex(0);
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

	public String getActualTipoGrupoFormaPagoForeignKeyDescripcion(Long idTipoGrupoFormaPagoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoGrupoFormaPago  tipogrupoformapagoTemp=null;

			for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagosForeignKey) {
				if(tipogrupoformapagoAux.getId()!=null && tipogrupoformapagoAux.getId().equals(idTipoGrupoFormaPagoSeleccionado)) {
					tipogrupoformapagoTemp=tipogrupoformapagoAux;
					break;
				}
			}


			sDescripcion=TipoGrupoFormaPagoConstantesFunciones.getTipoGrupoFormaPagoDescripcion(tipogrupoformapagoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoGrupoFormaPagoForeignKeyGenerico(Long idTipoGrupoFormaPagoSeleccionado,JComboBox jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagosGenerico)throws Exception
	{
		try
		{
			TipoGrupoFormaPago  tipogrupoformapagoTemp=null;

			for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagosForeignKey) {
				if(tipogrupoformapagoAux.getId()!=null && tipogrupoformapagoAux.getId().equals(idTipoGrupoFormaPagoSeleccionado)) {
					tipogrupoformapagoTemp=tipogrupoformapagoAux;
					break;
				}
			}

			if(tipogrupoformapagoTemp!=null) {
				jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagosGenerico.setSelectedItem(tipogrupoformapagoTemp);
			} else {
				if(jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagosGenerico!=null && jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagosGenerico.getItemCount()>0) {
					jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagosGenerico.setSelectedIndex(0);
				}
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

					if(this.listadosformaspagos!=null) {
						this.listadosformaspagos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
						this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_empresaListadosFormasPagos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaListadosFormasPagos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
						if(this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_empresaListadosFormasPagos.getItemCount()>0) {
							this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_empresaListadosFormasPagos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaListadosFormasPagosGenerico)throws Exception
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
				jComboBoxid_empresaListadosFormasPagosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaListadosFormasPagosGenerico!=null && jComboBoxid_empresaListadosFormasPagosGenerico.getItemCount()>0) {
					jComboBoxid_empresaListadosFormasPagosGenerico.setSelectedIndex(0);
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

					if(this.listadosformaspagos!=null) {
						this.listadosformaspagos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
						this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_sucursalListadosFormasPagos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalListadosFormasPagos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
						if(this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_sucursalListadosFormasPagos.getItemCount()>0) {
							this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_sucursalListadosFormasPagos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalListadosFormasPagosGenerico)throws Exception
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
				jComboBoxid_sucursalListadosFormasPagosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalListadosFormasPagosGenerico!=null && jComboBoxid_sucursalListadosFormasPagosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalListadosFormasPagosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoGrupoFormaPagoForeignKey(ListadosFormasPagos listadosformaspagos,JComboBox jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagosGenerico)throws Exception
	{
		try
		{
			TipoGrupoFormaPago  tipogrupoformapagoAux=new TipoGrupoFormaPago();

			if(jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagosGenerico==null) {
				tipogrupoformapagoAux=(TipoGrupoFormaPago)this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.getSelectedItem();
			} else {
				tipogrupoformapagoAux=(TipoGrupoFormaPago)jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagosGenerico.getSelectedItem();
			}

			if(tipogrupoformapagoAux!=null && tipogrupoformapagoAux.getId()!=null) {
				listadosformaspagos.setid_tipo_grupo_forma_pago(tipogrupoformapagoAux.getId());
				listadosformaspagos.settipogrupoformapago_descripcion(ListadosFormasPagosConstantesFunciones.getTipoGrupoFormaPagoDescripcion(tipogrupoformapagoAux));
				listadosformaspagos.setTipoGrupoFormaPago(tipogrupoformapagoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ListadosFormasPagos listadosformaspagos,JComboBox jComboBoxid_empresaListadosFormasPagosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaListadosFormasPagosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_empresaListadosFormasPagos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaListadosFormasPagosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				listadosformaspagos.setid_empresa(empresaAux.getId());
				listadosformaspagos.setempresa_descripcion(ListadosFormasPagosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				listadosformaspagos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ListadosFormasPagos listadosformaspagos,JComboBox jComboBoxid_sucursalListadosFormasPagosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalListadosFormasPagosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_sucursalListadosFormasPagos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalListadosFormasPagosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				listadosformaspagos.setid_sucursal(sucursalAux.getId());
				listadosformaspagos.setsucursal_descripcion(ListadosFormasPagosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				listadosformaspagos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoGrupoFormaPagosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoGrupoFormaPago=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { 
							this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.removeAllItems();

							for(TipoGrupoFormaPago tipogrupoformapago:this.tipogrupoformapagosForeignKey) {
								this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.addItem(tipogrupoformapago);
							}
						}
					}

					if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { 
					}

					if(!ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaListadosFormasPagos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.removeAllItems();

							for(TipoGrupoFormaPago tipogrupoformapago:this.tipogrupoformapagosForeignKey) {
								this.jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.addItem(tipogrupoformapago);
							}
						}

						if(!ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { 
							this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_empresaListadosFormasPagos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_empresaListadosFormasPagos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { 
					}

					if(!ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { 
							this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_sucursalListadosFormasPagos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_sucursalListadosFormasPagos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { 
					}

					if(!ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameTipoGrupoFormaPagoForeignKey(TipoGrupoFormaPago tipogrupoformapago,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
							this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.setSelectedItem(tipogrupoformapago);
						}
					} else {
						if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
							this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.setSelectedItem(tipogrupoformapago);
						} else {
							this.jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
							this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_empresaListadosFormasPagos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
							this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_empresaListadosFormasPagos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
							this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_sucursalListadosFormasPagos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
							this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_sucursalListadosFormasPagos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesListadosFormasPagos() throws Exception {
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
		
	public ListadosFormasPagosParameterReturnGeneral getListadosFormasPagosParameterGeneral() {
		return this.listadosformaspagosParameterGeneral;
	}
	
	public void setListadosFormasPagosParameterGeneral(ListadosFormasPagosParameterReturnGeneral listadosformaspagosParameterGeneral) {
		this.listadosformaspagosParameterGeneral = listadosformaspagosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoListadosFormasPagos() {
		return isPermisoTodoListadosFormasPagos;
	}

	public void setIsPermisoTodoListadosFormasPagos(Boolean isPermisoTodoListadosFormasPagos) {
		this.isPermisoTodoListadosFormasPagos = isPermisoTodoListadosFormasPagos;
	}

	public Boolean getIsPermisoNuevoListadosFormasPagos() {
		return isPermisoNuevoListadosFormasPagos;
	}

	public void setIsPermisoNuevoListadosFormasPagos(Boolean isPermisoNuevoListadosFormasPagos) {
		this.isPermisoNuevoListadosFormasPagos = isPermisoNuevoListadosFormasPagos;
	}

	public Boolean getIsPermisoActualizarListadosFormasPagos() {
		return isPermisoActualizarListadosFormasPagos;
	}

	public void setIsPermisoActualizarListadosFormasPagos(Boolean isPermisoActualizarListadosFormasPagos) {
		this.isPermisoActualizarListadosFormasPagos = isPermisoActualizarListadosFormasPagos;
	}

	public Boolean getIsPermisoEliminarListadosFormasPagos() {
		return isPermisoEliminarListadosFormasPagos;
	}

	public void setIsPermisoEliminarListadosFormasPagos(Boolean isPermisoEliminarListadosFormasPagos) {
		this.isPermisoEliminarListadosFormasPagos = isPermisoEliminarListadosFormasPagos;
	}

	public Boolean getIsPermisoGuardarCambiosListadosFormasPagos() {
		return isPermisoGuardarCambiosListadosFormasPagos;
	}

	public void setIsPermisoGuardarCambiosListadosFormasPagos(Boolean isPermisoGuardarCambiosListadosFormasPagos) {
		this.isPermisoGuardarCambiosListadosFormasPagos = isPermisoGuardarCambiosListadosFormasPagos;
	}
	
	public Boolean getIsPermisoConsultaListadosFormasPagos() {
		return isPermisoConsultaListadosFormasPagos;
	}

	public void setIsPermisoConsultaListadosFormasPagos(Boolean isPermisoConsultaListadosFormasPagos) {
		this.isPermisoConsultaListadosFormasPagos = isPermisoConsultaListadosFormasPagos;
	}

	public Boolean getIsPermisoBusquedaListadosFormasPagos() {
		return isPermisoBusquedaListadosFormasPagos;
	}

	public void setIsPermisoBusquedaListadosFormasPagos(Boolean isPermisoBusquedaListadosFormasPagos) {
		this.isPermisoBusquedaListadosFormasPagos = isPermisoBusquedaListadosFormasPagos;
	}

	public Boolean getIsPermisoReporteListadosFormasPagos() {
		return isPermisoReporteListadosFormasPagos;
	}

	public void setIsPermisoReporteListadosFormasPagos(Boolean isPermisoReporteListadosFormasPagos) {
		this.isPermisoReporteListadosFormasPagos = isPermisoReporteListadosFormasPagos;
	}
	
	public Boolean getIsPermisoPaginacionMedioListadosFormasPagos() {
		return isPermisoPaginacionMedioListadosFormasPagos;
	}

	public void setIsPermisoPaginacionMedioListadosFormasPagos(Boolean isPermisoPaginacionMedioListadosFormasPagos) {
		this.isPermisoPaginacionMedioListadosFormasPagos = isPermisoPaginacionMedioListadosFormasPagos;
	}
	
	public Boolean getIsPermisoPaginacionTodoListadosFormasPagos() {
		return isPermisoPaginacionTodoListadosFormasPagos;
	}

	public void setIsPermisoPaginacionTodoListadosFormasPagos(Boolean isPermisoPaginacionTodoListadosFormasPagos) {
		this.isPermisoPaginacionTodoListadosFormasPagos = isPermisoPaginacionTodoListadosFormasPagos;
	}
	
	public Boolean getIsPermisoPaginacionAltoListadosFormasPagos() {
		return isPermisoPaginacionAltoListadosFormasPagos;
	}

	public void setIsPermisoPaginacionAltoListadosFormasPagos(Boolean isPermisoPaginacionAltoListadosFormasPagos) {
		this.isPermisoPaginacionAltoListadosFormasPagos = isPermisoPaginacionAltoListadosFormasPagos;
	}
	
	public Boolean getIsPermisoCopiarListadosFormasPagos() {
		return isPermisoCopiarListadosFormasPagos;
	}

	public void setIsPermisoCopiarListadosFormasPagos(Boolean isPermisoCopiarListadosFormasPagos) {
		this.isPermisoCopiarListadosFormasPagos = isPermisoCopiarListadosFormasPagos;
	}
	
	public Boolean getIsPermisoVerFormListadosFormasPagos() {
		return isPermisoVerFormListadosFormasPagos;
	}

	public void setIsPermisoVerFormListadosFormasPagos(Boolean isPermisoVerFormListadosFormasPagos) {
		this.isPermisoVerFormListadosFormasPagos = isPermisoVerFormListadosFormasPagos;
	}
	
	public Boolean getIsPermisoDuplicarListadosFormasPagos() {
		return isPermisoDuplicarListadosFormasPagos;
	}

	public void setIsPermisoDuplicarListadosFormasPagos(Boolean isPermisoDuplicarListadosFormasPagos) {
		this.isPermisoDuplicarListadosFormasPagos = isPermisoDuplicarListadosFormasPagos;
	}
	
	public Boolean getIsPermisoOrdenListadosFormasPagos() {
		return isPermisoOrdenListadosFormasPagos;
	}

	public void setIsPermisoOrdenListadosFormasPagos(Boolean isPermisoOrdenListadosFormasPagos) {
		this.isPermisoOrdenListadosFormasPagos = isPermisoOrdenListadosFormasPagos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoListadosFormasPagos() {
		return isVisibilidadCeldaNuevoListadosFormasPagos;
	}

	public void setIsVisibilidadCeldaNuevoListadosFormasPagos(Boolean isVisibilidadCeldaNuevoListadosFormasPagos) {
		this.isVisibilidadCeldaNuevoListadosFormasPagos = isVisibilidadCeldaNuevoListadosFormasPagos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarListadosFormasPagos() {
		return isVisibilidadCeldaDuplicarListadosFormasPagos;
	}

	public void setIsVisibilidadCeldaDuplicarListadosFormasPagos(Boolean isVisibilidadCeldaDuplicarListadosFormasPagos) {
		this.isVisibilidadCeldaDuplicarListadosFormasPagos = isVisibilidadCeldaDuplicarListadosFormasPagos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarListadosFormasPagos() {
		return isVisibilidadCeldaCopiarListadosFormasPagos;
	}

	public void setIsVisibilidadCeldaCopiarListadosFormasPagos(Boolean isVisibilidadCeldaCopiarListadosFormasPagos) {
		this.isVisibilidadCeldaCopiarListadosFormasPagos = isVisibilidadCeldaCopiarListadosFormasPagos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormListadosFormasPagos() {
		return isVisibilidadCeldaVerFormListadosFormasPagos;
	}

	public void setIsVisibilidadCeldaVerFormListadosFormasPagos(Boolean isVisibilidadCeldaVerFormListadosFormasPagos) {
		this.isVisibilidadCeldaVerFormListadosFormasPagos = isVisibilidadCeldaVerFormListadosFormasPagos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenListadosFormasPagos() {
		return isVisibilidadCeldaOrdenListadosFormasPagos;
	}

	public void setIsVisibilidadCeldaOrdenListadosFormasPagos(Boolean isVisibilidadCeldaOrdenListadosFormasPagos) {
		this.isVisibilidadCeldaOrdenListadosFormasPagos = isVisibilidadCeldaOrdenListadosFormasPagos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesListadosFormasPagos() {
		return isVisibilidadCeldaNuevoRelacionesListadosFormasPagos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesListadosFormasPagos(Boolean isVisibilidadCeldaNuevoRelacionesListadosFormasPagos) {
		this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos = isVisibilidadCeldaNuevoRelacionesListadosFormasPagos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarListadosFormasPagos() {
		return isVisibilidadCeldaModificarListadosFormasPagos;
	}

	public void setIsVisibilidadCeldaModificarListadosFormasPagos(Boolean isVisibilidadCeldaModificarListadosFormasPagos) {
		this.isVisibilidadCeldaModificarListadosFormasPagos = isVisibilidadCeldaModificarListadosFormasPagos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarListadosFormasPagos() {
		return isVisibilidadCeldaActualizarListadosFormasPagos;
	}

	public void setIsVisibilidadCeldaActualizarListadosFormasPagos(Boolean isVisibilidadCeldaActualizarListadosFormasPagos) {
		this.isVisibilidadCeldaActualizarListadosFormasPagos = isVisibilidadCeldaActualizarListadosFormasPagos;
	}

	public Boolean getIsVisibilidadCeldaEliminarListadosFormasPagos() {
		return isVisibilidadCeldaEliminarListadosFormasPagos;
	}

	public void setIsVisibilidadCeldaEliminarListadosFormasPagos(Boolean isVisibilidadCeldaEliminarListadosFormasPagos) {
		this.isVisibilidadCeldaEliminarListadosFormasPagos = isVisibilidadCeldaEliminarListadosFormasPagos;
	}

	public Boolean getIsVisibilidadCeldaCancelarListadosFormasPagos() {
		return isVisibilidadCeldaCancelarListadosFormasPagos;
	}

	public void setIsVisibilidadCeldaCancelarListadosFormasPagos(Boolean isVisibilidadCeldaCancelarListadosFormasPagos) {
		this.isVisibilidadCeldaCancelarListadosFormasPagos = isVisibilidadCeldaCancelarListadosFormasPagos;
	}

	public Boolean getIsVisibilidadCeldaGuardarListadosFormasPagos() {
		return isVisibilidadCeldaGuardarListadosFormasPagos;
	}

	public void setIsVisibilidadCeldaGuardarListadosFormasPagos(Boolean isVisibilidadCeldaGuardarListadosFormasPagos) {
		this.isVisibilidadCeldaGuardarListadosFormasPagos = isVisibilidadCeldaGuardarListadosFormasPagos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosListadosFormasPagos() {
		return isVisibilidadCeldaGuardarCambiosListadosFormasPagos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosListadosFormasPagos(Boolean isVisibilidadCeldaGuardarCambiosListadosFormasPagos) {
		this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos = isVisibilidadCeldaGuardarCambiosListadosFormasPagos;
	}
		
	public ListadosFormasPagosSessionBean getlistadosformaspagosSessionBean() {
		return this.listadosformaspagosSessionBean;
	}
	
	public void setlistadosformaspagosSessionBean(ListadosFormasPagosSessionBean listadosformaspagosSessionBean) {
		this.listadosformaspagosSessionBean=listadosformaspagosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaListadosFormasPagos() {
		return this.isVisibilidadBusquedaListadosFormasPagos;
	}

	public void setisVisibilidadBusquedaListadosFormasPagos(Boolean isVisibilidadBusquedaListadosFormasPagos) {
		this.isVisibilidadBusquedaListadosFormasPagos=isVisibilidadBusquedaListadosFormasPagos;
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

	public Boolean getisVisibilidadFK_IdTipoGrupoFormaPago() {
		return this.isVisibilidadFK_IdTipoGrupoFormaPago;
	}

	public void setisVisibilidadFK_IdTipoGrupoFormaPago(Boolean isVisibilidadFK_IdTipoGrupoFormaPago) {
		this.isVisibilidadFK_IdTipoGrupoFormaPago=isVisibilidadFK_IdTipoGrupoFormaPago;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(ListadosFormasPagos listadosformaspagos)throws Exception {
		try {
			
				this.setActualParaGuardarTipoGrupoFormaPagoForeignKey(listadosformaspagos,null);
				this.setActualParaGuardarEmpresaForeignKey(listadosformaspagos,null);
				this.setActualParaGuardarSucursalForeignKey(listadosformaspagos,null);
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
	
	public void bugActualizarReferenciaActual(ListadosFormasPagos listadosformaspagos,ListadosFormasPagos listadosformaspagosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalListadosFormasPagos(listadosformaspagos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		listadosformaspagosAux.setId(listadosformaspagos.getId());
		listadosformaspagosAux.setVersionRow(listadosformaspagos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ListadosFormasPagos listadosformaspagosLocal) throws Exception {
		
		if(this.listadosformaspagosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ListadosFormasPagos listadosformaspagosLocal) throws Exception {	
		if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(TipoGrupoFormaPagoDetalleFormJInternalFrame.class)) {
				TipoGrupoFormaPagoBeanSwingJInternalFrame tipogrupoformapagoBeanSwingJInternalFrameLocal=(TipoGrupoFormaPagoBeanSwingJInternalFrame) ((TipoGrupoFormaPagoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipogrupoformapagoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoGrupoFormaPago(tipogrupoformapagoBeanSwingJInternalFrameLocal.gettipogrupoformapago(),true);
				tipogrupoformapagoBeanSwingJInternalFrameLocal.actualizarLista(tipogrupoformapagoBeanSwingJInternalFrameLocal.tipogrupoformapago,this.tipogrupoformapagosForeignKey);

				tipogrupoformapagoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipogrupoformapagoBeanSwingJInternalFrameLocal.tipogrupoformapago);

				listadosformaspagosLocal.setTipoGrupoFormaPago(tipogrupoformapagoBeanSwingJInternalFrameLocal.tipogrupoformapago);

				this.addItemDefectoCombosForeignKeyTipoGrupoFormaPago();
				this.cargarCombosFrameTipoGrupoFormaPagosForeignKey("Formulario");
				this.setActualTipoGrupoFormaPagoForeignKey(tipogrupoformapagoBeanSwingJInternalFrameLocal.tipogrupoformapago.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				listadosformaspagosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				listadosformaspagosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarListadosFormasPagosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = listadosformaspagosValidator.getInvalidValues(this.listadosformaspagos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ListadosFormasPagos listadosformaspagos,List<ListadosFormasPagos> listadosformaspagoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ListadosFormasPagos listadosformaspagos,List<ListadosFormasPagos> listadosformaspagoss) throws Exception {
		try	{			
			ListadosFormasPagosConstantesFunciones.actualizarSelectedLista(listadosformaspagos,listadosformaspagoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ListadosFormasPagos> listadosformaspagossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				listadosformaspagossLocal=this.listadosformaspagosLogic.getListadosFormasPagoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				listadosformaspagossLocal=this.listadosformaspagoss;
			}
			//ARCHITECTURE
		
			for(ListadosFormasPagos listadosformaspagosLocal:listadosformaspagossLocal) {
				if(this.permiteMantenimiento(listadosformaspagosLocal) && listadosformaspagosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ListadosFormasPagosConstantesFunciones.getListadosFormasPagosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ListadosFormasPagosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelcodigoListadosFormasPagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosFormasPagosConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelnombre_completoListadosFormasPagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosFormasPagosConstantesFunciones.CODIGOTIPOCUENTABANCOGLOBAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelcodigo_tipo_cuenta_banco_globalListadosFormasPagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosFormasPagosConstantesFunciones.NUMEROCUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelnumero_cuentaListadosFormasPagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosFormasPagosConstantesFunciones.CODIGOESTADOANTICLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelcodigo_estado_anti_clienteListadosFormasPagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosFormasPagosConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelfechaListadosFormasPagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosFormasPagosConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelvalorListadosFormasPagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosFormasPagosConstantesFunciones.VALORADICIONAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelvalor_adicionalListadosFormasPagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosFormasPagosConstantesFunciones.NOMBRETIPOGRUPOFORMAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelnombre_tipo_grupo_forma_pagoListadosFormasPagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosFormasPagosConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabeltotalListadosFormasPagos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelcodigoListadosFormasPagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelnombre_completoListadosFormasPagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelcodigo_tipo_cuenta_banco_globalListadosFormasPagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelnumero_cuentaListadosFormasPagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelcodigo_estado_anti_clienteListadosFormasPagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelfechaListadosFormasPagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelvalorListadosFormasPagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelvalor_adicionalListadosFormasPagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelnombre_tipo_grupo_forma_pagoListadosFormasPagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosFormasPagos.jLabeltotalListadosFormasPagos,"");
		
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
		this.iIdNuevoListadosFormasPagos--;	
		
		
		this.listadosformaspagosAux=new ListadosFormasPagos();
		
		this.listadosformaspagosAux.setId(this.iIdNuevoListadosFormasPagos);
		this.listadosformaspagosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.listadosformaspagosLogic.getListadosFormasPagoss().add(this.listadosformaspagosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.listadosformaspagoss.add(this.listadosformaspagosAux);
		}
		//ARCHITECTURE
		
		this.listadosformaspagos=this.listadosformaspagosAux;
		
		if(ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioListadosFormasPagos(this.listadosformaspagos);
			this.setVariablesObjetoActualToFormularioForeignKeyListadosFormasPagos(this.listadosformaspagos);
		}
				
		//this.setDefaultControlesListadosFormasPagos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyListadosFormasPagos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyListadosFormasPagos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyListadosFormasPagos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualListadosFormasPagos(this.listadosformaspagosBean,this.listadosformaspagos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanListadosFormasPagos(this.listadosformaspagosReturnGeneral,this.listadosformaspagosBean,false);
		
		if(this.listadosformaspagosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyListadosFormasPagos(this.listadosformaspagosReturnGeneral.getListadosFormasPagos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioListadosFormasPagos(this.listadosformaspagosReturnGeneral.getListadosFormasPagos());
		}
		
		if(this.listadosformaspagosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioListadosFormasPagos(this.listadosformaspagosReturnGeneral.getListadosFormasPagos(),classes);//this.listadosformaspagosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyListadosFormasPagos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyListadosFormasPagos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.RecargarFormListadosFormasPagos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingListadosFormasPagos(false);
						
			if(listadosformaspagosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadosFormasPagos();
			}
			
			this.actualizarVisualTableDatosListadosFormasPagos();
			
			this.jTableDatosListadosFormasPagos.setRowSelectionInterval(this.getIndiceNuevoListadosFormasPagos(), this.getIndiceNuevoListadosFormasPagos());
			
			this.seleccionarFilaTablaListadosFormasPagosActual();
						
			this.actualizarEstadoCeldasBotonesListadosFormasPagos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesListadosFormasPagos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormListadosFormasPagos.jDateChooserfecha_desdeListadosFormasPagos.setEnabled(isHabilitar && this.listadosformaspagosConstantesFunciones.activarfecha_desdeListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jDateChooserfecha_hastaListadosFormasPagos.setEnabled(isHabilitar && this.listadosformaspagosConstantesFunciones.activarfecha_hastaListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigoListadosFormasPagos.setEnabled(isHabilitar && this.listadosformaspagosConstantesFunciones.activarcodigoListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextAreanombre_completoListadosFormasPagos.setEnabled(isHabilitar && this.listadosformaspagosConstantesFunciones.activarnombre_completoListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setEnabled(isHabilitar && this.listadosformaspagosConstantesFunciones.activarcodigo_tipo_cuenta_banco_globalListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldnumero_cuentaListadosFormasPagos.setEnabled(isHabilitar && this.listadosformaspagosConstantesFunciones.activarnumero_cuentaListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigo_estado_anti_clienteListadosFormasPagos.setEnabled(isHabilitar && this.listadosformaspagosConstantesFunciones.activarcodigo_estado_anti_clienteListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jDateChooserfechaListadosFormasPagos.setEnabled(isHabilitar && this.listadosformaspagosConstantesFunciones.activarfechaListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldvalorListadosFormasPagos.setEnabled(isHabilitar && this.listadosformaspagosConstantesFunciones.activarvalorListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldvalor_adicionalListadosFormasPagos.setEnabled(isHabilitar && this.listadosformaspagosConstantesFunciones.activarvalor_adicionalListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.setEnabled(isHabilitar && this.listadosformaspagosConstantesFunciones.activarnombre_tipo_grupo_forma_pagoListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldtotalListadosFormasPagos.setEnabled(isHabilitar && this.listadosformaspagosConstantesFunciones.activartotalListadosFormasPagos);	
		
		this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.setEnabled(isHabilitar && this.listadosformaspagosConstantesFunciones.activarid_tipo_grupo_forma_pagoListadosFormasPagos);//
		this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_empresaListadosFormasPagos.setEnabled(isHabilitar && this.listadosformaspagosConstantesFunciones.activarid_empresaListadosFormasPagos);//
		this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_sucursalListadosFormasPagos.setEnabled(isHabilitar && this.listadosformaspagosConstantesFunciones.activarid_sucursalListadosFormasPagos);
	};
	
	public void setDefaultControlesListadosFormasPagos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoListadosFormasPagos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.listadosformaspagosSessionBean.setConGuardarRelaciones(true);			
			this.listadosformaspagosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormListadosFormasPagos.jTabbedPaneRelacionesListadosFormasPagos.setVisible(true);
			
					
		} else {
			//this.listadosformaspagosSessionBean.setConGuardarRelaciones(false);			
			this.listadosformaspagosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormListadosFormasPagos.jTabbedPaneRelacionesListadosFormasPagos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoListadosFormasPagos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosFormasPagos listadosformaspagosAux:this.listadosformaspagosLogic.getListadosFormasPagoss()) {
				if(listadosformaspagosAux.getId().equals(this.iIdNuevoListadosFormasPagos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosFormasPagos listadosformaspagosAux:this.listadosformaspagoss) {
				if(listadosformaspagosAux.getId().equals(this.iIdNuevoListadosFormasPagos)) {
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
	
	public int getIndiceActualListadosFormasPagos(ListadosFormasPagos listadosformaspagos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosFormasPagos listadosformaspagosAux:this.listadosformaspagosLogic.getListadosFormasPagoss()) {
				if(listadosformaspagosAux.getId().equals(listadosformaspagos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosFormasPagos listadosformaspagosAux:this.listadosformaspagoss) {
				if(listadosformaspagosAux.getId().equals(listadosformaspagos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalListadosFormasPagos(ListadosFormasPagos listadosformaspagosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosFormasPagos listadosformaspagosAux:this.listadosformaspagosLogic.getListadosFormasPagoss()) {
				if(listadosformaspagosAux.getListadosFormasPagosOriginal().getId().equals(listadosformaspagosOriginal.getId())) {
					existe=true;
					listadosformaspagosOriginal.setId(listadosformaspagosAux.getId());
					listadosformaspagosOriginal.setVersionRow(listadosformaspagosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosFormasPagos listadosformaspagosAux:this.listadosformaspagoss) {
				if(listadosformaspagosAux.getListadosFormasPagosOriginal().getId().equals(listadosformaspagosOriginal.getId())) {
					existe=true;
					listadosformaspagosOriginal.setId(listadosformaspagosAux.getId());
					listadosformaspagosOriginal.setVersionRow(listadosformaspagosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosListadosFormasPagos(Boolean esParaCancelar) throws Exception {
		listadosformaspagossAux=new ArrayList<ListadosFormasPagos>();
		listadosformaspagosAux=new ListadosFormasPagos();
		
		if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ListadosFormasPagos listadosformaspagosAux:this.listadosformaspagosLogic.getListadosFormasPagoss()) {
					if(listadosformaspagosAux.getId()<0) {
						listadosformaspagossAux.add(listadosformaspagosAux);
					}		
				}
				this.iIdNuevoListadosFormasPagos=0L;
				this.listadosformaspagosLogic.getListadosFormasPagoss().removeAll(listadosformaspagossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosFormasPagos listadosformaspagosAux:this.listadosformaspagoss) {
					if(listadosformaspagosAux.getId()<0) {
						listadosformaspagossAux.add(listadosformaspagosAux);
					}		
				}
				this.iIdNuevoListadosFormasPagos=0L;
				this.listadosformaspagoss.removeAll(listadosformaspagossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoListadosFormasPagos 
					&& this.listadosformaspagosLogic.getListadosFormasPagoss().size()>0
					) {
					listadosformaspagosAux=this.listadosformaspagosLogic.getListadosFormasPagoss().get(this.listadosformaspagosLogic.getListadosFormasPagoss().size() - 1);
				
					if(listadosformaspagosAux.getId()<0) {
						this.listadosformaspagosLogic.getListadosFormasPagoss().remove(listadosformaspagosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoListadosFormasPagos && this.listadosformaspagoss.size()>0) {
					listadosformaspagosAux=this.listadosformaspagoss.get(this.listadosformaspagoss.size() - 1);
				
					if(listadosformaspagosAux.getId()<0) {
						this.listadosformaspagoss.remove(listadosformaspagosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoListadosFormasPagos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(listadosformaspagos.getId()<0) {
				this.listadosformaspagosLogic.getListadosFormasPagoss().remove(this.listadosformaspagos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(listadosformaspagos.getId()<0) {
				this.listadosformaspagoss.remove(this.listadosformaspagos);
			}
		}			
	}
	
	public void setEstadosInicialesListadosFormasPagos(List<ListadosFormasPagos> listadosformaspagossAux) throws Exception {
		ListadosFormasPagosConstantesFunciones.setEstadosInicialesListadosFormasPagos(listadosformaspagossAux);
	}
	
	public void setEstadosInicialesListadosFormasPagos(ListadosFormasPagos listadosformaspagosAux) throws Exception {
		ListadosFormasPagosConstantesFunciones.setEstadosInicialesListadosFormasPagos(listadosformaspagosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarListadosFormasPagosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesListadosFormasPagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarListadosFormasPagosActual()) {
				if(!this.isEsNuevoListadosFormasPagos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesListadosFormasPagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoListadosFormasPagos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarListadosFormasPagosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Listados Formas Pagos ?", "MANTENIMIENTO DE Listados Formas Pagos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesListadosFormasPagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ListadosFormasPagos listadosformaspagos) throws Exception {
		ListadosFormasPagosConstantesFunciones.seleccionarAsignar(this.listadosformaspagos,listadosformaspagos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarListadosFormasPagos=this.isPermisoActualizarOriginalListadosFormasPagos;
			
			
			this.seleccionarAsignar(listadosformaspagos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesListadosFormasPagos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.listadosformaspagosSessionBean.setsFuncionBusquedaRapida(this.listadosformaspagosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoListadosFormasPagos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosListadosFormasPagos(esParaCancelar);				
				this.cancelarNuevoListadosFormasPagos(esParaCancelar);								
			}
			
			this.listadosformaspagos=new ListadosFormasPagos();
			
			this.inicializarListadosFormasPagos();
			
			this.actualizarEstadoCeldasBotonesListadosFormasPagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarListadosFormasPagos() throws Exception {
		try {
			ListadosFormasPagosConstantesFunciones.inicializarListadosFormasPagos(this.listadosformaspagos);
			
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
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.listadosformaspagosLogic.getListadosFormasPagoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteListadosFormasPagoss(String sAccionBusqueda,List<ListadosFormasPagos> listadosformaspagossParaReportes) throws Exception {
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
					sPathReporteFinal="ListadosFormasPagos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ListadosFormasPagosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ListadosFormasPagosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ListadosFormasPagos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Listados Formas Pagoses");		
		parameters.put("busquedapor", ListadosFormasPagosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceListadosFormasPagos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ListadosFormasPagosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ListadosFormasPagosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceListadosFormasPagos=new JRBeanArrayDataSource(ListadosFormasPagosJInternalFrame.TraerListadosFormasPagosBeans(listadosformaspagossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceListadosFormasPagos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ListadosFormasPagosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ListadosFormasPagosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ListadosFormasPagosBean.TraerListadosFormasPagosBeans(listadosformaspagossParaReportes).toArray()));
							
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
				this.generarExcelReporteListadosFormasPagoss(sAccionBusqueda,sTipoArchivoReporte,listadosformaspagossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalListadosFormasPagoss(sAccionBusqueda,sTipoArchivoReporte,listadosformaspagossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoListadosFormasPagosActionPerformed(null);
					//this.generarExcelReporteListadosFormasPagoss(sAccionBusqueda,sTipoArchivoReporte,listadosformaspagossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalListadosFormasPagoss(sAccionBusqueda,sTipoArchivoReporte,listadosformaspagossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesListadosFormasPagoss(sAccionBusqueda,sTipoArchivoReporte,listadosformaspagossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesListadosFormasPagoss(sAccionBusqueda,sTipoArchivoReporte,listadosformaspagossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteListadosFormasPagoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadosFormasPagos> listadosformaspagossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosformaspagos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadosFormasPagoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderListadosFormasPagos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ListadosFormasPagos listadosformaspagos : listadosformaspagossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ListadosFormasPagosConstantesFunciones.generarExcelReporteDataListadosFormasPagos("NORMAL",row,workbook,listadosformaspagos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Formas Pagos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderListadosFormasPagos(String sTipo,Row row,Workbook workbook) {
		
		ListadosFormasPagosConstantesFunciones.generarExcelReporteHeaderListadosFormasPagos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalListadosFormasPagoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadosFormasPagos> listadosformaspagossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosformaspagos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadosFormasPagoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ListadosFormasPagos listadosformaspagos : listadosformaspagossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ListadosFormasPagosConstantesFunciones.getListadosFormasPagosDescripcion(listadosformaspagos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosFormasPagosConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosformaspagos.gettipogrupoformapago_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosFormasPagosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosformaspagos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosFormasPagosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosformaspagos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosFormasPagosConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosformaspagos.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosFormasPagosConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosformaspagos.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosFormasPagosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosformaspagos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosformaspagos.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosformaspagos.getcodigo_tipo_cuenta_banco_global());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosformaspagos.getnumero_cuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosformaspagos.getcodigo_estado_anti_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosFormasPagosConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosformaspagos.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosFormasPagosConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosformaspagos.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosFormasPagosConstantesFunciones.LABEL_VALORADICIONAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_VALORADICIONAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosformaspagos.getvalor_adicional());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosformaspagos.getnombre_tipo_grupo_forma_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosFormasPagosConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosformaspagos.gettotal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Formas Pagos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesListadosFormasPagoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadosFormasPagos> listadosformaspagossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ListadosFormasPagos> listadosformaspagossRespaldo=null;
		
		classes=ListadosFormasPagosConstantesFunciones.getClassesRelationshipsOfListadosFormasPagos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.listadosformaspagosLogic.setDatosCliente(this.datosCliente);
		this.listadosformaspagosLogic.setDatosDeep(this.datosDeep);
		this.listadosformaspagosLogic.setIsConDeep(true);
		
		listadosformaspagossRespaldo=this.listadosformaspagosLogic.getListadosFormasPagoss();
		
		this.listadosformaspagosLogic.setListadosFormasPagoss(listadosformaspagossParaReportes);	
		this.listadosformaspagosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		listadosformaspagossParaReportes=this.listadosformaspagosLogic.getListadosFormasPagoss();
		this.listadosformaspagosLogic.setListadosFormasPagoss(listadosformaspagossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosformaspagos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadosFormasPagoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderListadosFormasPagos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ListadosFormasPagos listadosformaspagos : listadosformaspagossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderListadosFormasPagos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ListadosFormasPagosConstantesFunciones.generarExcelReporteDataListadosFormasPagos("NORMAL",row,workbook,listadosformaspagos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ListadosFormasPagosConstantesFunciones.getListadosFormasPagosDescripcion(listadosformaspagos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Formas Pagos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessListadosFormasPagos() throws Exception {		
		this.startProcessListadosFormasPagos(true);
	}
	
	public void startProcessListadosFormasPagos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasListadosFormasPagos ,this.jPanelParametrosReportesListadosFormasPagos, this.jScrollPanelDatosListadosFormasPagos,this.jPanelPaginacionListadosFormasPagos, this.jScrollPanelDatosEdicionListadosFormasPagos, this.jPanelAccionesListadosFormasPagos,this.jPanelAccionesFormularioListadosFormasPagos,this.jmenuBarListadosFormasPagos,this.jmenuBarDetalleListadosFormasPagos,this.jTtoolBarListadosFormasPagos,this.jTtoolBarDetalleListadosFormasPagos);		
		
		final JTabbedPane jTabbedPaneBusquedasListadosFormasPagos=this.jTabbedPaneBusquedasListadosFormasPagos; 
		
		final JPanel jPanelParametrosReportesListadosFormasPagos=this.jPanelParametrosReportesListadosFormasPagos;
		//final JScrollPane jScrollPanelDatosListadosFormasPagos=this.jScrollPanelDatosListadosFormasPagos;
		final JTable jTableDatosListadosFormasPagos=this.jTableDatosListadosFormasPagos;		
		final JPanel jPanelPaginacionListadosFormasPagos=this.jPanelPaginacionListadosFormasPagos;
		//final JScrollPane jScrollPanelDatosEdicionListadosFormasPagos=this.jScrollPanelDatosEdicionListadosFormasPagos;
		final JPanel jPanelAccionesListadosFormasPagos=this.jPanelAccionesListadosFormasPagos;
		
		JPanel jPanelCamposAuxiliarListadosFormasPagos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarListadosFormasPagos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
			jPanelCamposAuxiliarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jPanelCamposListadosFormasPagos;
			jPanelAccionesFormularioAuxiliarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jPanelAccionesFormularioListadosFormasPagos;
		}
		
		final JPanel jPanelCamposListadosFormasPagos=jPanelCamposAuxiliarListadosFormasPagos;
		final JPanel jPanelAccionesFormularioListadosFormasPagos=jPanelAccionesFormularioAuxiliarListadosFormasPagos;
		
		
		final JMenuBar jmenuBarListadosFormasPagos=this.jmenuBarListadosFormasPagos;
		final JToolBar jTtoolBarListadosFormasPagos=this.jTtoolBarListadosFormasPagos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarListadosFormasPagos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarListadosFormasPagos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
			jmenuBarDetalleAuxiliarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jmenuBarDetalleListadosFormasPagos;
			jTtoolBarDetalleAuxiliarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jTtoolBarDetalleListadosFormasPagos;
		}
		
		final JMenuBar jmenuBarDetalleListadosFormasPagos=jmenuBarDetalleAuxiliarListadosFormasPagos;
		final JToolBar jTtoolBarDetalleListadosFormasPagos=jTtoolBarDetalleAuxiliarListadosFormasPagos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasListadosFormasPagos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesListadosFormasPagos;
			processRunnable.jTableDatos=jTableDatosListadosFormasPagos;
			processRunnable.jPanelCampos=jPanelCamposListadosFormasPagos;
			processRunnable.jPanelPaginacion=jPanelPaginacionListadosFormasPagos;
			processRunnable.jPanelAcciones=jPanelAccionesListadosFormasPagos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioListadosFormasPagos;
			
			
			processRunnable.jmenuBar=jmenuBarListadosFormasPagos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleListadosFormasPagos;
			processRunnable.jTtoolBar=jTtoolBarListadosFormasPagos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleListadosFormasPagos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasListadosFormasPagos ,jPanelParametrosReportesListadosFormasPagos,jTableDatosListadosFormasPagos, /*jScrollPanelDatosListadosFormasPagos,*/jPanelCamposListadosFormasPagos,jPanelPaginacionListadosFormasPagos, /*jScrollPanelDatosEdicionListadosFormasPagos,*/ jPanelAccionesListadosFormasPagos,jPanelAccionesFormularioListadosFormasPagos,jmenuBarListadosFormasPagos,jmenuBarDetalleListadosFormasPagos,jTtoolBarListadosFormasPagos,jTtoolBarDetalleListadosFormasPagos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasListadosFormasPagos ,jPanelParametrosReportesListadosFormasPagos, jScrollPanelDatosListadosFormasPagos,jPanelPaginacionListadosFormasPagos, jScrollPanelDatosEdicionListadosFormasPagos, jPanelAccionesListadosFormasPagos,jPanelAccionesFormularioListadosFormasPagos,jmenuBarListadosFormasPagos,jmenuBarDetalleListadosFormasPagos,jTtoolBarListadosFormasPagos,jTtoolBarDetalleListadosFormasPagos);
						
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
	
	public void finishProcessListadosFormasPagos() {// throws Exception 
		this.finishProcessListadosFormasPagos(true);
	}
	
	public void finishProcessListadosFormasPagos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasListadosFormasPagos ,this.jPanelParametrosReportesListadosFormasPagos, this.jScrollPanelDatosListadosFormasPagos,this.jPanelPaginacionListadosFormasPagos, this.jScrollPanelDatosEdicionListadosFormasPagos, this.jPanelAccionesListadosFormasPagos,this.jPanelAccionesFormularioListadosFormasPagos,this.jmenuBarListadosFormasPagos,this.jmenuBarDetalleListadosFormasPagos,this.jTtoolBarListadosFormasPagos,this.jTtoolBarDetalleListadosFormasPagos);		
		
		final JTabbedPane jTabbedPaneBusquedasListadosFormasPagos=this.jTabbedPaneBusquedasListadosFormasPagos; 
		
		final JPanel jPanelParametrosReportesListadosFormasPagos=this.jPanelParametrosReportesListadosFormasPagos;
		//final JScrollPane jScrollPanelDatosListadosFormasPagos=this.jScrollPanelDatosListadosFormasPagos;
		final JTable jTableDatosListadosFormasPagos=this.jTableDatosListadosFormasPagos;		
		final JPanel jPanelPaginacionListadosFormasPagos=this.jPanelPaginacionListadosFormasPagos;
		//final JScrollPane jScrollPanelDatosEdicionListadosFormasPagos=this.jScrollPanelDatosEdicionListadosFormasPagos;
		final JPanel jPanelAccionesListadosFormasPagos=this.jPanelAccionesListadosFormasPagos;
		
		JPanel jPanelCamposAuxiliarListadosFormasPagos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarListadosFormasPagos=new JPanel();
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
			jPanelCamposAuxiliarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jPanelCamposListadosFormasPagos;
			jPanelAccionesFormularioAuxiliarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jPanelAccionesFormularioListadosFormasPagos;
		}
		
		final JPanel jPanelCamposListadosFormasPagos=jPanelCamposAuxiliarListadosFormasPagos;
		final JPanel jPanelAccionesFormularioListadosFormasPagos=jPanelAccionesFormularioAuxiliarListadosFormasPagos;
		
		
		final JMenuBar jmenuBarListadosFormasPagos=this.jmenuBarListadosFormasPagos;		
		final JToolBar jTtoolBarListadosFormasPagos=this.jTtoolBarListadosFormasPagos;
				
		JMenuBar jmenuBarDetalleAuxiliarListadosFormasPagos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarListadosFormasPagos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
			jmenuBarDetalleAuxiliarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jmenuBarDetalleListadosFormasPagos;
			jTtoolBarDetalleAuxiliarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jTtoolBarDetalleListadosFormasPagos;		
		}
		
		final JMenuBar jmenuBarDetalleListadosFormasPagos=jmenuBarDetalleAuxiliarListadosFormasPagos;
		final JToolBar jTtoolBarDetalleListadosFormasPagos=jTtoolBarDetalleAuxiliarListadosFormasPagos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasListadosFormasPagos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesListadosFormasPagos;
			processRunnable.jTableDatos=jTableDatosListadosFormasPagos;
			processRunnable.jPanelCampos=jPanelCamposListadosFormasPagos;
			processRunnable.jPanelPaginacion=jPanelPaginacionListadosFormasPagos;
			processRunnable.jPanelAcciones=jPanelAccionesListadosFormasPagos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioListadosFormasPagos;
			
			
			processRunnable.jmenuBar=jmenuBarListadosFormasPagos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleListadosFormasPagos;
			processRunnable.jTtoolBar=jTtoolBarListadosFormasPagos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleListadosFormasPagos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasListadosFormasPagos ,jPanelParametrosReportesListadosFormasPagos, jTableDatosListadosFormasPagos,/*jScrollPanelDatosListadosFormasPagos,*/jPanelCamposListadosFormasPagos,jPanelPaginacionListadosFormasPagos, /*jScrollPanelDatosEdicionListadosFormasPagos,*/ jPanelAccionesListadosFormasPagos,jPanelAccionesFormularioListadosFormasPagos,jmenuBarListadosFormasPagos,jmenuBarDetalleListadosFormasPagos,jTtoolBarListadosFormasPagos,jTtoolBarDetalleListadosFormasPagos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesListadosFormasPagos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarListadosFormasPagos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuListadosFormasPagos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarListadosFormasPagos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarListadosFormasPagos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleListadosFormasPagos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuListadosFormasPagos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarListadosFormasPagos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleListadosFormasPagos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.listadosformaspagosConstantesFunciones.getsFinalQueryListadosFormasPagos();
		String  finalQueryPaginacionTodos=this.listadosformaspagosConstantesFunciones.getsFinalQueryListadosFormasPagos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ListadosFormasPagosConstantesFunciones.getArrayColumnasGlobalesNoListadosFormasPagos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ListadosFormasPagosConstantesFunciones.getArrayColumnasGlobalesListadosFormasPagos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ListadosFormasPagosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.listadosformaspagossEliminados= new ArrayList<ListadosFormasPagos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessListadosFormasPagos();
		
				///*ListadosFormasPagosSessionBean*/this.listadosformaspagosSessionBean=new ListadosFormasPagosSessionBean();
			
			if(this.listadosformaspagosSessionBean==null) {
				this.listadosformaspagosSessionBean=new ListadosFormasPagosSessionBean();
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
					this.iNumeroPaginacion=ListadosFormasPagosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ListadosFormasPagosConstantesFunciones.getClassesForeignKeysOfListadosFormasPagos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/listadosformaspagos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			listadosformaspagossAux= new ArrayList<ListadosFormasPagos>();
			
				
			listadosformaspagosLogic.setDatosCliente(this.datosCliente);
			listadosformaspagosLogic.setDatosDeep(this.datosDeep);
			listadosformaspagosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaListadosFormasPagos")) {
				this.sDetalleReporte=ListadosFormasPagosConstantesFunciones.getDetalleIndiceBusquedaListadosFormasPagos(id_tipo_grupo_forma_pagoBusquedaListadosFormasPagos,fecha_desdeBusquedaListadosFormasPagos,fecha_hastaBusquedaListadosFormasPagos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					listadosformaspagosLogic.getListadosFormasPagossBusquedaListadosFormasPagos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_grupo_forma_pagoBusquedaListadosFormasPagos,fecha_desdeBusquedaListadosFormasPagos,fecha_hastaBusquedaListadosFormasPagos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ListadosFormasPagosConstantesFunciones.getDetalleIndiceBusquedaListadosFormasPagos(id_tipo_grupo_forma_pagoBusquedaListadosFormasPagos,fecha_desdeBusquedaListadosFormasPagos,fecha_hastaBusquedaListadosFormasPagos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ListadosFormasPagosConstantesFunciones.getDetalleIndiceBusquedaListadosFormasPagos(id_tipo_grupo_forma_pagoBusquedaListadosFormasPagos,fecha_desdeBusquedaListadosFormasPagos,fecha_hastaBusquedaListadosFormasPagos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=listadosformaspagosLogic.getListadosFormasPagoss()==null||listadosformaspagosLogic.getListadosFormasPagoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=listadosformaspagoss==null|| listadosformaspagoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						listadosformaspagossAux=new ArrayList<ListadosFormasPagos>();
						listadosformaspagossAux.addAll(listadosformaspagosLogic.getListadosFormasPagoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadosformaspagossAux=new ArrayList<ListadosFormasPagos>();
							listadosformaspagossAux.addAll(listadosformaspagoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							listadosformaspagosLogic.getListadosFormasPagossBusquedaListadosFormasPagos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_grupo_forma_pagoBusquedaListadosFormasPagos,fecha_desdeBusquedaListadosFormasPagos,fecha_hastaBusquedaListadosFormasPagos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ListadosFormasPagosConstantesFunciones.getDetalleIndiceBusquedaListadosFormasPagos(id_tipo_grupo_forma_pagoBusquedaListadosFormasPagos,fecha_desdeBusquedaListadosFormasPagos,fecha_hastaBusquedaListadosFormasPagos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ListadosFormasPagosConstantesFunciones.getDetalleIndiceBusquedaListadosFormasPagos(id_tipo_grupo_forma_pagoBusquedaListadosFormasPagos,fecha_desdeBusquedaListadosFormasPagos,fecha_hastaBusquedaListadosFormasPagos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteListadosFormasPagoss("BusquedaListadosFormasPagos",listadosformaspagosLogic.getListadosFormasPagoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteListadosFormasPagoss("BusquedaListadosFormasPagos",listadosformaspagoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						listadosformaspagosLogic.setListadosFormasPagoss(new ArrayList<ListadosFormasPagos>());
						listadosformaspagosLogic.getListadosFormasPagoss().addAll(listadosformaspagossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadosformaspagoss=new ArrayList<ListadosFormasPagos>();
							listadosformaspagoss.addAll(listadosformaspagossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesListadosFormasPagos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessListadosFormasPagos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=listadosformaspagosLogic.getListadosFormasPagoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadosformaspagoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=listadosformaspagosLogic.getListadosFormasPagoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadosformaspagoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ListadosFormasPagos listadosformaspagos) {
		Boolean permite=true;
		
		if(this.listadosformaspagos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ListadosFormasPagosConstantesFunciones.getOrderByListaListadosFormasPagos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ListadosFormasPagosConstantesFunciones.getOrderByListaListadosFormasPagos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosFormasPagos listadosformaspagos:listadosformaspagosLogic.getListadosFormasPagoss()) {
				if(listadosformaspagos.getsType().equals(Constantes2.S_TOTALES)) {
					listadosformaspagosTotales=listadosformaspagos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosFormasPagos listadosformaspagos:this.listadosformaspagoss) {
				if(listadosformaspagos.getsType().equals(Constantes2.S_TOTALES)) {
					listadosformaspagosTotales=listadosformaspagos;
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
			this.listadosformaspagosAux=new ListadosFormasPagos();
			this.listadosformaspagosAux.setsType(Constantes2.S_TOTALES);
			this.listadosformaspagosAux.setIsNew(false);
			this.listadosformaspagosAux.setIsChanged(false);
			this.listadosformaspagosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ListadosFormasPagosConstantesFunciones.TotalizarValoresFilaListadosFormasPagos(this.listadosformaspagosLogic.getListadosFormasPagoss(),this.listadosformaspagosAux);
				
				//this.listadosformaspagosLogic.getListadosFormasPagoss().add(this.listadosformaspagosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ListadosFormasPagosConstantesFunciones.TotalizarValoresFilaListadosFormasPagos(this.listadosformaspagoss,this.listadosformaspagosAux);
				
				this.listadosformaspagoss.add(this.listadosformaspagosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		listadosformaspagosTotales=new ListadosFormasPagos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.listadosformaspagosLogic.getListadosFormasPagoss().remove(listadosformaspagosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.listadosformaspagoss.remove(listadosformaspagosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		listadosformaspagosTotales=new ListadosFormasPagos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosFormasPagos listadosformaspagos:listadosformaspagosLogic.getListadosFormasPagoss()) {
				if(listadosformaspagos.getsType().equals(Constantes2.S_TOTALES)) {
					listadosformaspagosTotales=listadosformaspagos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ListadosFormasPagosConstantesFunciones.TotalizarValoresFilaListadosFormasPagos(this.listadosformaspagosLogic.getListadosFormasPagoss(),listadosformaspagosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosFormasPagos listadosformaspagos:this.listadosformaspagoss) {
				if(listadosformaspagos.getsType().equals(Constantes2.S_TOTALES)) {
					listadosformaspagosTotales=listadosformaspagos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ListadosFormasPagosConstantesFunciones.TotalizarValoresFilaListadosFormasPagos(this.listadosformaspagoss,listadosformaspagosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getListadosFormasPagossBusquedaListadosFormasPagos()throws Exception {
		try {
			sAccionBusqueda="BusquedaListadosFormasPagos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getListadosFormasPagossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getListadosFormasPagossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getListadosFormasPagossFK_IdTipoGrupoFormaPago()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoGrupoFormaPago";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getListadosFormasPagossBusquedaListadosFormasPagos(String sFinalQuery,Long id_tipo_grupo_forma_pago,Date fecha_desde,Date fecha_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadosformaspagosLogic.getListadosFormasPagossBusquedaListadosFormasPagos(sFinalQuery,this.pagination,id_tipo_grupo_forma_pago,fecha_desde,fecha_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getListadosFormasPagossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadosformaspagosLogic.getListadosFormasPagossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getListadosFormasPagossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadosformaspagosLogic.getListadosFormasPagossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getListadosFormasPagossFK_IdTipoGrupoFormaPago(String sFinalQuery,Long id_tipo_grupo_forma_pago)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadosformaspagosLogic.getListadosFormasPagossFK_IdTipoGrupoFormaPago(sFinalQuery,this.pagination,id_tipo_grupo_forma_pago);
				
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
	
	public void inicializarPermisosListadosFormasPagos() {
		this.isPermisoTodoListadosFormasPagos=false;
		this.isPermisoNuevoListadosFormasPagos=false;
		this.isPermisoActualizarListadosFormasPagos=false;
		this.isPermisoActualizarOriginalListadosFormasPagos=false;
		this.isPermisoEliminarListadosFormasPagos=false;
		this.isPermisoGuardarCambiosListadosFormasPagos=false;
		this.isPermisoConsultaListadosFormasPagos=true;
		this.isPermisoBusquedaListadosFormasPagos=true;
		this.isPermisoReporteListadosFormasPagos=true;
		this.isPermisoOrdenListadosFormasPagos=false;		
		this.isPermisoPaginacionMedioListadosFormasPagos=false;		
		this.isPermisoPaginacionAltoListadosFormasPagos=false;		
		this.isPermisoPaginacionTodoListadosFormasPagos=false;		
		this.isPermisoCopiarListadosFormasPagos=false;		
		this.isPermisoVerFormListadosFormasPagos=false;		
		this.isPermisoDuplicarListadosFormasPagos=false;
		this.isPermisoOrdenListadosFormasPagos=false;
	}
	
	public void setPermisosUsuarioListadosFormasPagos(Boolean isPermiso) {
		this.isPermisoTodoListadosFormasPagos=isPermiso;
		this.isPermisoNuevoListadosFormasPagos=isPermiso;
		this.isPermisoActualizarListadosFormasPagos=isPermiso;
		this.isPermisoActualizarOriginalListadosFormasPagos=isPermiso;
		this.isPermisoEliminarListadosFormasPagos=isPermiso;
		this.isPermisoGuardarCambiosListadosFormasPagos=isPermiso;
		this.isPermisoConsultaListadosFormasPagos=isPermiso;
		this.isPermisoBusquedaListadosFormasPagos=isPermiso;
		this.isPermisoReporteListadosFormasPagos=isPermiso;
		this.isPermisoOrdenListadosFormasPagos=isPermiso;		
		this.isPermisoPaginacionMedioListadosFormasPagos=isPermiso;		
		this.isPermisoPaginacionAltoListadosFormasPagos=isPermiso;		
		this.isPermisoPaginacionTodoListadosFormasPagos=isPermiso;		
		this.isPermisoCopiarListadosFormasPagos=isPermiso;		
		this.isPermisoVerFormListadosFormasPagos=isPermiso;		
		this.isPermisoDuplicarListadosFormasPagos=isPermiso;
		this.isPermisoOrdenListadosFormasPagos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioListadosFormasPagos(Boolean isPermiso) {
		//this.isPermisoTodoListadosFormasPagos=isPermiso;
		this.isPermisoNuevoListadosFormasPagos=isPermiso;
		this.isPermisoActualizarListadosFormasPagos=isPermiso;
		this.isPermisoActualizarOriginalListadosFormasPagos=isPermiso;
		this.isPermisoEliminarListadosFormasPagos=isPermiso;
		this.isPermisoGuardarCambiosListadosFormasPagos=isPermiso;
		//this.isPermisoConsultaListadosFormasPagos=isPermiso;
		//this.isPermisoBusquedaListadosFormasPagos=isPermiso;
		//this.isPermisoReporteListadosFormasPagos=isPermiso;
		//this.isPermisoOrdenListadosFormasPagos=isPermiso;		
		//this.isPermisoPaginacionMedioListadosFormasPagos=isPermiso;		
		//this.isPermisoPaginacionAltoListadosFormasPagos=isPermiso;		
		//this.isPermisoPaginacionTodoListadosFormasPagos=isPermiso;		
		//this.isPermisoCopiarListadosFormasPagos=isPermiso;		
		//this.isPermisoDuplicarListadosFormasPagos=isPermiso;
		//this.isPermisoOrdenListadosFormasPagos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioListadosFormasPagosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ListadosFormasPagosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebListadosFormasPagos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioListadosFormasPagosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioListadosFormasPagosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionListadosFormasPagosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioListadosFormasPagosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioListadosFormasPagos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ListadosFormasPagosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ListadosFormasPagosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoListadosFormasPagos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarListadosFormasPagos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalListadosFormasPagos=this.isPermisoActualizarListadosFormasPagos;
			this.isPermisoEliminarListadosFormasPagos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosListadosFormasPagos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaListadosFormasPagos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaListadosFormasPagos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoListadosFormasPagos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteListadosFormasPagos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenListadosFormasPagos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioListadosFormasPagos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoListadosFormasPagos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoListadosFormasPagos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarListadosFormasPagos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormListadosFormasPagos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarListadosFormasPagos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenListadosFormasPagos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosListadosFormasPagos.setToolTipText(this.jTableDatosListadosFormasPagos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioListadosFormasPagos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioListadosFormasPagos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ListadosFormasPagosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ListadosFormasPagosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioListadosFormasPagos() throws Exception {
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
	public void inicializarCombosForeignKeyListadosFormasPagosListas()throws Exception {
		try	{						
			
				this.tipogrupoformapagosForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyListadosFormasPagosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ListadosFormasPagosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyTipoGrupoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyTipoGrupoFormaPagoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipogrupoformapagosForeignKey==null||this.tipogrupoformapagosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoGrupoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoGrupoFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGrupoFormaPagoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoGrupoFormaPagoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoGrupoFormaPagosForeignKeyLista(finalQueryGlobal);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyListadosFormasPagos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyTipoGrupoFormaPago();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyTipoGrupoFormaPago()throws Exception {
		try {
			if(this.listadosformaspagosSessionBean==null) {
				this.listadosformaspagosSessionBean=new ListadosFormasPagosSessionBean();
			}

			if(!this.listadosformaspagosSessionBean.getisBusquedaDesdeForeignKeySesionTipoGrupoFormaPago()) {
				TipoGrupoFormaPago tipogrupoformapago=new TipoGrupoFormaPago();
				TipoGrupoFormaPagoConstantesFunciones.setTipoGrupoFormaPagoDescripcion(tipogrupoformapago,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipogrupoformapago.setId(null);

				if(!TipoGrupoFormaPagoConstantesFunciones.ExisteEnLista(this.tipogrupoformapagosForeignKey,tipogrupoformapago,true)) {

					this.tipogrupoformapagosForeignKey.add(0,tipogrupoformapago);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.listadosformaspagosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.listadosformaspagosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
	
	public void initActionsCombosTodosForeignKeyListadosFormasPagos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyListadosFormasPagos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyListadosFormasPagos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyListadosFormasPagos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyListadosFormasPagos(ListadosFormasPagos listadosformaspagos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyListadosFormasPagos(ListadosFormasPagos listadosformaspagos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyListadosFormasPagos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyListadosFormasPagos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyListadosFormasPagos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyListadosFormasPagos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroListadosFormasPagos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyListadosFormasPagos()throws Exception {
		try {
			

			this.cargarCombosFrameTipoGrupoFormaPagosForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyListadosFormasPagos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameTipoGrupoFormaPagosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyListadosFormasPagos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.getItemCount()>0) {
				this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_empresaListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_empresaListadosFormasPagos.getItemCount()>0) {
				this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_empresaListadosFormasPagos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_sucursalListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_sucursalListadosFormasPagos.getItemCount()>0) {
				this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_sucursalListadosFormasPagos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ListadosFormasPagosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ListadosFormasPagosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ListadosFormasPagosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.listadosformaspagosSessionBean=new ListadosFormasPagosSessionBean(); 
		this.listadosformaspagosConstantesFunciones=new ListadosFormasPagosConstantesFunciones(); 
		this.listadosformaspagosBean=new ListadosFormasPagos();//(this.listadosformaspagosConstantesFunciones); 		
		this.listadosformaspagosReturnGeneral=new ListadosFormasPagosParameterReturnGeneral(); 
		
		this.listadosformaspagosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadosformaspagosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ListadosFormasPagosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ListadosFormasPagosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ListadosFormasPagosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessListadosFormasPagos(true);
			
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
			
			this.listadosformaspagosConstantesFunciones=new ListadosFormasPagosConstantesFunciones(); 
			this.listadosformaspagosBean=new ListadosFormasPagos();//this.listadosformaspagosConstantesFunciones); 			
			this.listadosformaspagosReturnGeneral=new ListadosFormasPagosParameterReturnGeneral(); 
		
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Listados Formas Pagos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.listadosformaspagos=new ListadosFormasPagos();
			this.listadosformaspagoss = new ArrayList<ListadosFormasPagos>();
			this.listadosformaspagossAux = new ArrayList<ListadosFormasPagos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic=new ListadosFormasPagosLogic();
				this.listadosformaspagosLogic.getNewConnexionToDeep("");
			}
			
			//this.listadosformaspagosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.listadosformaspagosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormListadosFormasPagos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoListadosFormasPagos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoListadosFormasPagos);	
					}
					
					if(this.jInternalFrameImportacionListadosFormasPagos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionListadosFormasPagos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByListadosFormasPagos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByListadosFormasPagos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormListadosFormasPagos);
				this.jInternalFrameDetalleFormListadosFormasPagos.setVisible(false);
				this.jInternalFrameDetalleFormListadosFormasPagos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoListadosFormasPagos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoListadosFormasPagos);
					this.jInternalFrameReporteDinamicoListadosFormasPagos.setVisible(false);
					this.jInternalFrameReporteDinamicoListadosFormasPagos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionListadosFormasPagos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionListadosFormasPagos);
					this.jInternalFrameImportacionListadosFormasPagos.setVisible(false);
					this.jInternalFrameImportacionListadosFormasPagos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByListadosFormasPagos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByListadosFormasPagos);
					this.jInternalFrameOrderByListadosFormasPagos.setVisible(false);
					this.jInternalFrameOrderByListadosFormasPagos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idListadosFormasPagosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ListadosFormasPagosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.listadosformaspagosReturnGeneral=new ListadosFormasPagosParameterReturnGeneral();
			
			this.listadosformaspagosParameterGeneral=new ListadosFormasPagosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.listadosformaspagosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ListadosFormasPagosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ListadosFormasPagosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.listadosformaspagosSessionBean.getEsGuardarRelacionado(),this.listadosformaspagosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ListadosFormasPagosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.listadosformaspagosSessionBean.getEsGuardarRelacionado(),this.listadosformaspagosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoListadosFormasPagos=false;
			this.isVisibilidadCeldaDuplicarListadosFormasPagos=true;
			this.isVisibilidadCeldaCopiarListadosFormasPagos=true;
			this.isVisibilidadCeldaVerFormListadosFormasPagos=true;
			this.isVisibilidadCeldaOrdenListadosFormasPagos=true;
			this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos=false;
			this.isVisibilidadCeldaModificarListadosFormasPagos=false;
			this.isVisibilidadCeldaActualizarListadosFormasPagos=false;
			this.isVisibilidadCeldaEliminarListadosFormasPagos=false;
			this.isVisibilidadCeldaCancelarListadosFormasPagos=false;
			this.isVisibilidadCeldaGuardarListadosFormasPagos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos=false;
			
			
			this.isVisibilidadBusquedaListadosFormasPagos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoGrupoFormaPago=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesListadosFormasPagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosListadosFormasPagos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioListadosFormasPagos(false);
			
			this.setPermisosUsuarioListadosFormasPagos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado() 
				|| (this.listadosformaspagosSessionBean.getEsGuardarRelacionado() && this.listadosformaspagosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioListadosFormasPagosClasesRelacionadas();
			}
			
			if(this.listadosformaspagosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioListadosFormasPagosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosListadosFormasPagos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualListadosFormasPagos();
			}
			
			if(!this.isPermisoBusquedaListadosFormasPagos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasListadosFormasPagos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ListadosFormasPagosConstantesFunciones.getTiposSeleccionarListadosFormasPagos());
				
				this.tiposColumnasSelect=ListadosFormasPagosConstantesFunciones.getTiposSeleccionarListadosFormasPagos(true);
				
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
			//if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioListadosFormasPagos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioListadosFormasPagos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioListadosFormasPagos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesListadosFormasPagos() ;
			
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
			
			this.tipogrupoformapagoLogic=new TipoGrupoFormaPagoLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				listadosformaspagosImplementable= (ListadosFormasPagosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ListadosFormasPagosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				listadosformaspagosImplementableHome= (ListadosFormasPagosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ListadosFormasPagosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.listadosformaspagoss= new ArrayList<ListadosFormasPagos>();
			this.listadosformaspagossEliminados= new ArrayList<ListadosFormasPagos>();
						
			this.isEsNuevoListadosFormasPagos=false;
			this.esParaAccionDesdeFormularioListadosFormasPagos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.tipogrupoformapagosForeignKey=new ArrayList<TipoGrupoFormaPago>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyListadosFormasPagos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroListadosFormasPagos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ListadosFormasPagosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesListadosFormasPagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingListadosFormasPagos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioListadosFormasPagos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioListadosFormasPagos();
			}
			
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasListadosFormasPagos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasListadosFormasPagos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasListadosFormasPagos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessListadosFormasPagos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ListadosFormasPagos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectListadosFormasPagos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesListadosFormasPagos")) {
				iIndex=this.jInternalFrameDetalleFormListadosFormasPagos.jTabbedPaneRelacionesListadosFormasPagos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormListadosFormasPagos.jTabbedPaneRelacionesListadosFormasPagos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessListadosFormasPagos();	
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
	
	public void cargarCombosForeignKeyListadosFormasPagos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyListadosFormasPagos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyListadosFormasPagos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyListadosFormasPagosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyListadosFormasPagos();
		
		this.cargarCombosFrameForeignKeyListadosFormasPagos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyListadosFormasPagos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyListadosFormasPagos();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoGrupoFormaPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoGrupoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoGrupoFormaPago();
				this.cargarCombosFrameTipoGrupoFormaPagosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoGrupoFormaPago(this.tipogrupoformapagosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoListadosFormasPagosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.listadosformaspagosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormListadosFormasPagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
			
			
			if(jTableDatosListadosFormasPagos.getRowCount()>=1) {
				jTableDatosListadosFormasPagos.removeRowSelectionInterval(0, jTableDatosListadosFormasPagos.getRowCount()-1);						
			}
			
			this.isEsNuevoListadosFormasPagos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoListadosFormasPagos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesListadosFormasPagos(true);			
			//this.listadosformaspagos=new ListadosFormasPagos();
			//this.listadosformaspagos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadosFormasPagos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosFormasPagos() ;
			
			if(ListadosFormasPagosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadosFormasPagos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.listadosformaspagos);	
			this.actualizarInformacion("INFO_PADRE",false,this.listadosformaspagos);				
			
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
			
			if(this.listadosformaspagosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ListadosFormasPagos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarListadosFormasPagosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ListadosFormasPagos> listadosformaspagossSeleccionados=new ArrayList<ListadosFormasPagos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosListadosFormasPagos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosListadosFormasPagos.getSelectedRows().length;			
			}
			
			listadosformaspagossSeleccionados=this.getListadosFormasPagossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoListadosFormasPagos--;			
				//ListadosFormasPagos listadosformaspagosAux= new ListadosFormasPagos();			
				//listadosformaspagosAux.setId(this.iIdNuevoListadosFormasPagos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ListadosFormasPagos listadosformaspagosOrigen=new ListadosFormasPagos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ListadosFormasPagos listadosformaspagosOrigen : listadosformaspagossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							listadosformaspagosOrigen =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadosformaspagosOrigen =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaListadosFormasPagos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.listadosformaspagos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosListadosFormasPagos(listadosformaspagosOrigen,this.listadosformaspagos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.listadosformaspagosLogic.getListadosFormasPagoss().add(this.listadosformaspagosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.listadosformaspagoss.add(this.listadosformaspagosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaListadosFormasPagos(false);
				
				this.jTableDatosListadosFormasPagos.setRowSelectionInterval(this.getIndiceNuevoListadosFormasPagos(), this.getIndiceNuevoListadosFormasPagos());
				
				int iLastRow =  this.jTableDatosListadosFormasPagos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosListadosFormasPagos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosListadosFormasPagos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaListadosFormasPagos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ListadosFormasPagos> listadosformaspagossSeleccionados=new ArrayList<ListadosFormasPagos>();									
		
			ListadosFormasPagos listadosformaspagosOrigen=new ListadosFormasPagos();
			ListadosFormasPagos listadosformaspagosDestino=new ListadosFormasPagos();
				
			listadosformaspagossSeleccionados=this.getListadosFormasPagossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosListadosFormasPagos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || listadosformaspagossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosListadosFormasPagos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						listadosformaspagosOrigen =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						listadosformaspagosOrigen =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						listadosformaspagosDestino =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						listadosformaspagosDestino =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				listadosformaspagosOrigen =listadosformaspagossSeleccionados.get(0);
				listadosformaspagosDestino =listadosformaspagossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosListadosFormasPagos(listadosformaspagosOrigen,listadosformaspagosDestino,true,false);
				
				listadosformaspagosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(listadosformaspagosDestino,listadosformaspagosLogic.getListadosFormasPagoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(listadosformaspagosDestino,listadosformaspagoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaListadosFormasPagos(false);
				
				//this.jTableDatosListadosFormasPagos.setRowSelectionInterval(this.getIndiceNuevoListadosFormasPagos(), this.getIndiceNuevoListadosFormasPagos());
				
				int iLastRow =  this.jTableDatosListadosFormasPagos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosListadosFormasPagos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosListadosFormasPagos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaListadosFormasPagos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormListadosFormasPagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormListadosFormasPagos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesListadosFormasPagos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasListadosFormasPagos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesListadosFormasPagos.setVisible(!isVisible);
			this.jPanelPaginacionListadosFormasPagos.setVisible(!isVisible);
			this.jPanelAccionesListadosFormasPagos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameListadosFormasPagos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoListadosFormasPagos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionListadosFormasPagos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByListadosFormasPagos();
			
			this.abrirFrameOrderByListadosFormasPagos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByListadosFormasPagos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleListadosFormasPagos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormListadosFormasPagos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormListadosFormasPagos.isMaximum()) {
					this.jInternalFrameDetalleFormListadosFormasPagos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormListadosFormasPagos.setSize(this.jInternalFrameDetalleFormListadosFormasPagos.iWidthFormulario,this.jInternalFrameDetalleFormListadosFormasPagos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormListadosFormasPagos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormListadosFormasPagos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormListadosFormasPagos.isMaximum()) {
						this.jInternalFrameDetalleFormListadosFormasPagos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormListadosFormasPagos.jContentPaneDetalleListadosFormasPagos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormListadosFormasPagos.jTabbedPaneRelacionesListadosFormasPagos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormListadosFormasPagos.jContentPaneDetalleListadosFormasPagos.getWidth(),ListadosFormasPagosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormListadosFormasPagos.jTabbedPaneRelacionesListadosFormasPagos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormListadosFormasPagos.jContentPaneDetalleListadosFormasPagos.getWidth(),ListadosFormasPagosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormListadosFormasPagos.jTabbedPaneRelacionesListadosFormasPagos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormListadosFormasPagos.jContentPaneDetalleListadosFormasPagos.getWidth(),ListadosFormasPagosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormListadosFormasPagos.setVisible(true);
	        this.jInternalFrameDetalleFormListadosFormasPagos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByListadosFormasPagos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByListadosFormasPagos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByListadosFormasPagos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosFormasPagos,false,this);
				} else {
					this.jInternalFrameOrderByListadosFormasPagos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosFormasPagos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByListadosFormasPagos);
				this.jInternalFrameOrderByListadosFormasPagos.setVisible(false);
				this.jInternalFrameOrderByListadosFormasPagos.setSelected(false);
				
				this.jInternalFrameOrderByListadosFormasPagos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByListadosFormasPagos"));
				
				this.inicializarActualizarBindingTablaOrderByListadosFormasPagos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionListadosFormasPagos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionListadosFormasPagos==null) {
				
				this.jInternalFrameImportacionListadosFormasPagos=new ImportacionJInternalFrame(ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionListadosFormasPagos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionListadosFormasPagos);
				this.jInternalFrameImportacionListadosFormasPagos.setVisible(false);
				this.jInternalFrameImportacionListadosFormasPagos.setSelected(false);


				this.jInternalFrameImportacionListadosFormasPagos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionListadosFormasPagos"));
				this.jInternalFrameImportacionListadosFormasPagos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionListadosFormasPagos"));
				this.jInternalFrameImportacionListadosFormasPagos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionListadosFormasPagos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoListadosFormasPagos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoListadosFormasPagos==null) {
				this.jInternalFrameReporteDinamicoListadosFormasPagos=new ReporteDinamicoJInternalFrame(ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoListadosFormasPagos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoListadosFormasPagos);
				this.jInternalFrameReporteDinamicoListadosFormasPagos.setVisible(false);
				this.jInternalFrameReporteDinamicoListadosFormasPagos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoListadosFormasPagos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadosFormasPagos"));
				this.jInternalFrameReporteDinamicoListadosFormasPagos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadosFormasPagos"));
				this.jInternalFrameReporteDinamicoListadosFormasPagos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadosFormasPagos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadosFormasPagos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleListadosFormasPagos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormListadosFormasPagos);
			
	       	this.jInternalFrameDetalleFormListadosFormasPagos.setVisible(false);
	        this.jInternalFrameDetalleFormListadosFormasPagos.setSelected(false);
			
			//this.jInternalFrameDetalleFormListadosFormasPagos.dispose();
			//this.jInternalFrameDetalleFormListadosFormasPagos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoListadosFormasPagos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoListadosFormasPagos.setVisible(true);
	        this.jInternalFrameReporteDinamicoListadosFormasPagos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionListadosFormasPagos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionListadosFormasPagos.setVisible(true);
	        this.jInternalFrameImportacionListadosFormasPagos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByListadosFormasPagos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByListadosFormasPagos.setVisible(true);
	        this.jInternalFrameOrderByListadosFormasPagos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByListadosFormasPagos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByListadosFormasPagos.setVisible(false);
	        this.jInternalFrameOrderByListadosFormasPagos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoListadosFormasPagos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoListadosFormasPagos.setVisible(false);
	        this.jInternalFrameReporteDinamicoListadosFormasPagos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionListadosFormasPagos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionListadosFormasPagos.setVisible(false);
	        this.jInternalFrameImportacionListadosFormasPagos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarListadosFormasPagos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarListadosFormasPagos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesListadosFormasPagos(true);
			//this.isEsNuevoListadosFormasPagos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesListadosFormasPagos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadosFormasPagos(false) ;
			
			if(listadosformaspagosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ListadosFormasPagosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadosFormasPagos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosFormasPagos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaListadosFormasPagosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarListadosFormasPagos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormListadosFormasPagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesListadosFormasPagos(true);
			//this.isEsNuevoListadosFormasPagos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.listadosformaspagos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesListadosFormasPagos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesListadosFormasPagos(false) ;
			
			if(ListadosFormasPagosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadosFormasPagos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosFormasPagos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaTipoGrupoFormaPago(List<TipoGrupoFormaPago> tipogrupoformapagosForeignKey)throws Exception{
		TableColumn tableColumnTipoGrupoFormaPago=this.jTableDatosListadosFormasPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosFormasPagos,ListadosFormasPagosConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO));
		TableCellEditor tableCellEditorTipoGrupoFormaPago =tableColumnTipoGrupoFormaPago.getCellEditor();

		TipoGrupoFormaPagoTableCell tipogrupoformapagoTableCellFk=(TipoGrupoFormaPagoTableCell)tableCellEditorTipoGrupoFormaPago;

		if(tipogrupoformapagoTableCellFk!=null) {
			tipogrupoformapagoTableCellFk.settipogrupoformapagosForeignKey(tipogrupoformapagosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosListadosFormasPagos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipogrupoformapagoTableCellFk.setRowActual(intSelectedRow);
			//tipogrupoformapagoTableCellFk.settipogrupoformapagosForeignKeyActual(tipogrupoformapagosForeignKey);
		//}


		if(tipogrupoformapagoTableCellFk!=null) {
			tipogrupoformapagoTableCellFk.RecargarTipoGrupoFormaPagosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	
	public void jButtonActualizarListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesListadosFormasPagos(false);
			
			//if(!this.isEsNuevoListadosFormasPagos) {								
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				
			}
			
			if(this.permiteMantenimiento(this.listadosformaspagos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoListadosFormasPagos=true;
					this.inicializarActualizarBindingTablaListadosFormasPagos(false);
					this.isEsNuevoListadosFormasPagos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoListadosFormasPagos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoListadosFormasPagos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesListadosFormasPagos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadosFormasPagos(false);
				
				this.habilitarDeshabilitarControlesListadosFormasPagos(false);
			
												
				
				if(ListadosFormasPagosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleListadosFormasPagos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoListadosFormasPagosActionPerformed(evt,listadosformaspagosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualListadosFormasPagos(this.listadosformaspagos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosListadosFormasPagos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,listadosformaspagosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.listadosformaspagos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ListadosFormasPagos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosFormasPagos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				this.listadosformaspagos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				this.listadosformaspagos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.listadosformaspagos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ListadosFormasPagosModel) this.jTableDatosListadosFormasPagos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoListadosFormasPagos=true;
				this.inicializarActualizarBindingTablaListadosFormasPagos(false);
				this.isEsNuevoListadosFormasPagos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesListadosFormasPagos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadosFormasPagos(false);
				
				this.habilitarDeshabilitarControlesListadosFormasPagos(false);
				
				
				
				if(ListadosFormasPagosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleListadosFormasPagos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosListadosFormasPagos.getRowCount()>=1) {
				jTableDatosListadosFormasPagos.removeRowSelectionInterval(0, jTableDatosListadosFormasPagos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesListadosFormasPagos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaListadosFormasPagos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadosFormasPagos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosFormasPagos(false) ;
			
			this.isEsNuevoListadosFormasPagos=false;
			
			if(ListadosFormasPagosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleListadosFormasPagos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingListadosFormasPagos(false);
				
				//SI ES MANUAL
				if(ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualListadosFormasPagos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoListadosFormasPagos--;			
			//ListadosFormasPagos listadosformaspagosAux= new ListadosFormasPagos();			
			//listadosformaspagosAux.setId(this.iIdNuevoListadosFormasPagos);
			
			if(this.jInternalFrameDetalleFormListadosFormasPagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaListadosFormasPagos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
			
			this.listadosformaspagos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.listadosformaspagosLogic.getListadosFormasPagoss().add(this.listadosformaspagosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.listadosformaspagoss.add(this.listadosformaspagosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaListadosFormasPagos(false);
			
			this.jTableDatosListadosFormasPagos.setRowSelectionInterval(this.getIndiceNuevoListadosFormasPagos(), this.getIndiceNuevoListadosFormasPagos());
			
			int iLastRow =  this.jTableDatosListadosFormasPagos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosListadosFormasPagos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosListadosFormasPagos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaListadosFormasPagos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingListadosFormasPagos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosFormasPagos(false);
			
			//SI ES MANUAL
			if(ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadosFormasPagos();
			}
			
			//this.abrirFrameTreeListadosFormasPagos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionListadosFormasPagos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionListadosFormasPagos.setFileImportacion(this.jInternalFrameImportacionListadosFormasPagos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionListadosFormasPagos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionListadosFormasPagos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionListadosFormasPagos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionListadosFormasPagos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ListadosFormasPagos> listadosformaspagossSeleccionados=new ArrayList<ListadosFormasPagos>();		

		listadosformaspagossSeleccionados=this.getListadosFormasPagossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ListadosFormasPagosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ListadosFormasPagosBaseDesign.jrxml";
			
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
			
			this.generarReporteListadosFormasPagoss("Todos",listadosformaspagossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Formas Pagos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ListadosFormasPagosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoTipoCuentaBancoGlobal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoTipoCuentaBancoGlobal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoTipoCuentaBancoGlobal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoTipoCuentaBancoGlobal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCuenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoEstadoAntiCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoEstadoAntiCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoEstadoAntiCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoEstadoAntiCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_VALORADICIONAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorAdicional_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorAdicional_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorAdicional_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorAdicional_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoGrupoFormaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoGrupoFormaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoGrupoFormaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoGrupoFormaPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoListadosFormasPagos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ListadosFormasPagosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL:
					sNombreCampoCategoria="codigo_tipo_cuenta_banco_global";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA:
					sNombreCampoCategoria="numero_cuenta";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE:
					sNombreCampoCategoria="codigo_estado_anti_cliente";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_VALORADICIONAL:
					sNombreCampoCategoria="valor_adicional";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO:
					sNombreCampoCategoria="nombre_tipo_grupo_forma_pago";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ListadosFormasPagosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL:
					sNombreCampoCategoriaValor="codigo_tipo_cuenta_banco_global";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA:
					sNombreCampoCategoriaValor="numero_cuenta";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE:
					sNombreCampoCategoriaValor="codigo_estado_anti_cliente";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_VALORADICIONAL:
					sNombreCampoCategoriaValor="valor_adicional";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO:
					sNombreCampoCategoriaValor="nombre_tipo_grupo_forma_pago";
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ListadosFormasPagosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Tipo Cuenta Banco Global",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_tipo_cuenta_banco_global");
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cuenta");
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Estado Anti Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_estado_anti_cliente");
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_VALORADICIONAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Adicional",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_adicional");
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Grupo Forma Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_grupo_forma_pago");
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
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
	
	public void jButtonGenerarExcelReporteDinamicoListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ListadosFormasPagos> listadosformaspagossSeleccionados=new ArrayList<ListadosFormasPagos>();		
		
		listadosformaspagossSeleccionados=this.getListadosFormasPagossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosformaspagos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ListadosFormasPagoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ListadosFormasPagosConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO);
					iRow++;

					for(ListadosFormasPagos listadosformaspagos:listadosformaspagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosformaspagos.gettipogrupoformapago_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ListadosFormasPagos listadosformaspagos:listadosformaspagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosformaspagos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ListadosFormasPagos listadosformaspagos:listadosformaspagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosformaspagos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(ListadosFormasPagos listadosformaspagos:listadosformaspagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosformaspagos.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(ListadosFormasPagos listadosformaspagos:listadosformaspagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosformaspagos.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ListadosFormasPagos listadosformaspagos:listadosformaspagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosformaspagos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(ListadosFormasPagos listadosformaspagos:listadosformaspagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosformaspagos.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL);
					iRow++;

					for(ListadosFormasPagos listadosformaspagos:listadosformaspagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosformaspagos.getcodigo_tipo_cuenta_banco_global());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA);
					iRow++;

					for(ListadosFormasPagos listadosformaspagos:listadosformaspagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosformaspagos.getnumero_cuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE);
					iRow++;

					for(ListadosFormasPagos listadosformaspagos:listadosformaspagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosformaspagos.getcodigo_estado_anti_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ListadosFormasPagos listadosformaspagos:listadosformaspagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosformaspagos.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(ListadosFormasPagos listadosformaspagos:listadosformaspagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosformaspagos.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_VALORADICIONAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_VALORADICIONAL);
					iRow++;

					for(ListadosFormasPagos listadosformaspagos:listadosformaspagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosformaspagos.getvalor_adicional());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO);
					iRow++;

					for(ListadosFormasPagos listadosformaspagos:listadosformaspagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosformaspagos.getnombre_tipo_grupo_forma_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosFormasPagosConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(ListadosFormasPagos listadosformaspagos:listadosformaspagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosformaspagos.gettotal());
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
			//	this.getFilaCabeceraExportarExcelListadosFormasPagos(row);				
			//	iRow++;
			//}				
			
			//for(ListadosFormasPagos listadosformaspagosAux:listadosformaspagossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelListadosFormasPagos(listadosformaspagosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Formas Pagos",JOptionPane.INFORMATION_MESSAGE);
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
				this.listadosformaspagosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosFormasPagos(false);
			
			//SI ES MANUAL
			if(ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadosFormasPagos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosFormasPagos(false);
			
			//SI ES MANUAL
			if(ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualListadosFormasPagos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosFormasPagos(false);
			
			//SI ES MANUAL
			if(ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualListadosFormasPagos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaListadosFormasPagos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosListadosFormasPagos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosListadosFormasPagos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosListadosFormasPagos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosListadosFormasPagos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosListadosFormasPagos.setMinimumSize(dimensionMinimum);
		this.jTableDatosListadosFormasPagos.setMaximumSize(dimensionMaximum);
		this.jTableDatosListadosFormasPagos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingListadosFormasPagos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingListadosFormasPagos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingListadosFormasPagos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaListadosFormasPagos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesListadosFormasPagos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasListadosFormasPagos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesListadosFormasPagos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesListadosFormasPagos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualListadosFormasPagos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaListadosFormasPagos();
		
		this.inicializarActualizarBindingBotonesManualListadosFormasPagos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualListadosFormasPagos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesListadosFormasPagos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualListadosFormasPagos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualListadosFormasPagos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosListadosFormasPagos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosListadosFormasPagos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteListadosFormasPagos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormListadosFormasPagos.jCheckBoxPostAccionNuevoListadosFormasPagos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormListadosFormasPagos.jCheckBoxPostAccionSinCerrarListadosFormasPagos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormListadosFormasPagos.jCheckBoxPostAccionSinMensajeListadosFormasPagos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosListadosFormasPagos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosListadosFormasPagos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteListadosFormasPagos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
				this.jInternalFrameDetalleFormListadosFormasPagos.jCheckBoxPostAccionNuevoListadosFormasPagos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormListadosFormasPagos.jCheckBoxPostAccionSinCerrarListadosFormasPagos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormListadosFormasPagos.jCheckBoxPostAccionSinMensajeListadosFormasPagos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionListadosFormasPagos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionListadosFormasPagos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxTiposAccionesFormularioListadosFormasPagos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesListadosFormasPagos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoListadosFormasPagos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesListadosFormasPagos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesListadosFormasPagos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarListadosFormasPagos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesListadosFormasPagos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoListadosFormasPagos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesListadosFormasPagos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralListadosFormasPagos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesListadosFormasPagos(Boolean esInicializar) throws Exception {
		try	{	
			if(ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualListadosFormasPagos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesListadosFormasPagos() throws Exception {
		try	{
			if(ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualListadosFormasPagos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleListadosFormasPagos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxTiposAccionesFormularioListadosFormasPagos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxTiposAccionesFormularioListadosFormasPagos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualListadosFormasPagos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesListadosFormasPagos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesListadosFormasPagos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesListadosFormasPagos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesListadosFormasPagos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesListadosFormasPagos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesListadosFormasPagos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionListadosFormasPagos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionListadosFormasPagos.addItem(reporte);
			}
			
			
			if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionListadosFormasPagos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionListadosFormasPagos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesListadosFormasPagos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesListadosFormasPagos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesListadosFormasPagos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesListadosFormasPagos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxTiposAccionesFormularioListadosFormasPagos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxTiposAccionesFormularioListadosFormasPagos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarListadosFormasPagos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarListadosFormasPagos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarListadosFormasPagos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadosFormasPagos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadosFormasPagos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoListadosFormasPagos!=null) {
				this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoListadosFormasPagos!=null) {
				this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoListadosFormasPagos!=null) {
				
				if(this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ListadosFormasPagosConstantesFunciones.getTiposSeleccionarListadosFormasPagos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ListadosFormasPagosConstantesFunciones.getTiposSeleccionarListadosFormasPagos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ListadosFormasPagosConstantesFunciones.getTiposSeleccionarListadosFormasPagos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadosFormasPagos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoListadosFormasPagos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualListadosFormasPagos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.getSelectedItem()!=null){this.id_tipo_grupo_forma_pagoBusquedaListadosFormasPagos=((TipoGrupoFormaPago)this.jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.getSelectedItem()).getId();}
		this.fecha_desdeBusquedaListadosFormasPagos=new Date(this.jDateChooserfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos.getDate().getTime());
		this.fecha_hastaBusquedaListadosFormasPagos=new Date(this.jDateChooserfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasListadosFormasPagos(Boolean esInicializar) throws Exception {				
		if(ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualListadosFormasPagos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaListadosFormasPagos() throws Exception {
		this.inicializarActualizarBindingTablaListadosFormasPagos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByListadosFormasPagos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByListadosFormasPagos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByListadosFormasPagos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadosFormasPagos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ListadosFormasPagosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByListadosFormasPagos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadosFormasPagos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ListadosFormasPagosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosListadosFormasPagosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosFormasPagosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ListadosFormasPagosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByListadosFormasPagos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadosFormasPagos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ListadosFormasPagosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByListadosFormasPagos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaListadosFormasPagos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=listadosformaspagosLogic.getListadosFormasPagoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=listadosformaspagoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosListadosFormasPagos.setModel(new ListadosFormasPagosModel(this.listadosformaspagosLogic.getListadosFormasPagoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosListadosFormasPagos.setModel(new ListadosFormasPagosModel(this.listadosformaspagoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByListadosFormasPagos!=null && this.jInternalFrameOrderByListadosFormasPagos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByListadosFormasPagos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosListadosFormasPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosFormasPagos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ListadosFormasPagosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO,listadosformaspagosConstantesFunciones.resaltarSeleccionarListadosFormasPagos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO,listadosformaspagosConstantesFunciones.resaltarSeleccionarListadosFormasPagos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosListadosFormasPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosFormasPagos,ListadosFormasPagosConstantesFunciones.LABEL_ID));

		if(this.listadosformaspagosConstantesFunciones.mostraridListadosFormasPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosFormasPagosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.listadosformaspagosConstantesFunciones.resaltaridListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activaridListadosFormasPagos,iSizeTabla,this,true,"idListadosFormasPagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosformaspagosConstantesFunciones.resaltaridListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activaridListadosFormasPagos,this,true,"idListadosFormasPagos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosFormasPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosFormasPagos,ListadosFormasPagosConstantesFunciones.LABEL_CODIGO));

		if(this.listadosformaspagosConstantesFunciones.mostrarcodigoListadosFormasPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosFormasPagosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosformaspagosConstantesFunciones.resaltarcodigoListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarcodigoListadosFormasPagos,iSizeTabla,this,true,"codigoListadosFormasPagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosformaspagosConstantesFunciones.resaltarcodigoListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarcodigoListadosFormasPagos,this,true,"codigoListadosFormasPagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosFormasPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosFormasPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosFormasPagos,ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.listadosformaspagosConstantesFunciones.mostrarnombre_completoListadosFormasPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosformaspagosConstantesFunciones.resaltarnombre_completoListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarnombre_completoListadosFormasPagos,iSizeTabla,this,true,"nombre_completoListadosFormasPagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosformaspagosConstantesFunciones.resaltarnombre_completoListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarnombre_completoListadosFormasPagos,this,true,"nombre_completoListadosFormasPagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosFormasPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosFormasPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosFormasPagos,ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL));

		if(this.listadosformaspagosConstantesFunciones.mostrarcodigo_tipo_cuenta_banco_globalListadosFormasPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosformaspagosConstantesFunciones.resaltarcodigo_tipo_cuenta_banco_globalListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarcodigo_tipo_cuenta_banco_globalListadosFormasPagos,iSizeTabla,this,true,"codigo_tipo_cuenta_banco_globalListadosFormasPagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosformaspagosConstantesFunciones.resaltarcodigo_tipo_cuenta_banco_globalListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarcodigo_tipo_cuenta_banco_globalListadosFormasPagos,this,true,"codigo_tipo_cuenta_banco_globalListadosFormasPagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosFormasPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosFormasPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosFormasPagos,ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA));

		if(this.listadosformaspagosConstantesFunciones.mostrarnumero_cuentaListadosFormasPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosformaspagosConstantesFunciones.resaltarnumero_cuentaListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarnumero_cuentaListadosFormasPagos,iSizeTabla,this,true,"numero_cuentaListadosFormasPagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosformaspagosConstantesFunciones.resaltarnumero_cuentaListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarnumero_cuentaListadosFormasPagos,this,true,"numero_cuentaListadosFormasPagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosFormasPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosFormasPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosFormasPagos,ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE));

		if(this.listadosformaspagosConstantesFunciones.mostrarcodigo_estado_anti_clienteListadosFormasPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosformaspagosConstantesFunciones.resaltarcodigo_estado_anti_clienteListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarcodigo_estado_anti_clienteListadosFormasPagos,iSizeTabla,this,true,"codigo_estado_anti_clienteListadosFormasPagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosformaspagosConstantesFunciones.resaltarcodigo_estado_anti_clienteListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarcodigo_estado_anti_clienteListadosFormasPagos,this,true,"codigo_estado_anti_clienteListadosFormasPagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosFormasPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosFormasPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosFormasPagos,ListadosFormasPagosConstantesFunciones.LABEL_FECHA));

		if(this.listadosformaspagosConstantesFunciones.mostrarfechaListadosFormasPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosFormasPagosConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.listadosformaspagosConstantesFunciones.resaltarfechaListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarfechaListadosFormasPagos,iSizeTabla,this,true,"fechaListadosFormasPagos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.listadosformaspagosConstantesFunciones.resaltarfechaListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarfechaListadosFormasPagos,this,true,"fechaListadosFormasPagos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ListadosFormasPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosFormasPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosFormasPagos,ListadosFormasPagosConstantesFunciones.LABEL_VALOR));

		if(this.listadosformaspagosConstantesFunciones.mostrarvalorListadosFormasPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosFormasPagosConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.listadosformaspagosConstantesFunciones.resaltarvalorListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarvalorListadosFormasPagos,iSizeTabla,this,true,"valorListadosFormasPagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosformaspagosConstantesFunciones.resaltarvalorListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarvalorListadosFormasPagos,this,true,"valorListadosFormasPagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ListadosFormasPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosFormasPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosFormasPagos,ListadosFormasPagosConstantesFunciones.LABEL_VALORADICIONAL));

		if(this.listadosformaspagosConstantesFunciones.mostrarvalor_adicionalListadosFormasPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosFormasPagosConstantesFunciones.LABEL_VALORADICIONAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.listadosformaspagosConstantesFunciones.resaltarvalor_adicionalListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarvalor_adicionalListadosFormasPagos,iSizeTabla,this,true,"valor_adicionalListadosFormasPagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosformaspagosConstantesFunciones.resaltarvalor_adicionalListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarvalor_adicionalListadosFormasPagos,this,true,"valor_adicionalListadosFormasPagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ListadosFormasPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosFormasPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosFormasPagos,ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO));

		if(this.listadosformaspagosConstantesFunciones.mostrarnombre_tipo_grupo_forma_pagoListadosFormasPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosformaspagosConstantesFunciones.resaltarnombre_tipo_grupo_forma_pagoListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarnombre_tipo_grupo_forma_pagoListadosFormasPagos,iSizeTabla,this,true,"nombre_tipo_grupo_forma_pagoListadosFormasPagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosformaspagosConstantesFunciones.resaltarnombre_tipo_grupo_forma_pagoListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activarnombre_tipo_grupo_forma_pagoListadosFormasPagos,this,true,"nombre_tipo_grupo_forma_pagoListadosFormasPagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosFormasPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosFormasPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosFormasPagos,ListadosFormasPagosConstantesFunciones.LABEL_TOTAL));

		if(this.listadosformaspagosConstantesFunciones.mostrartotalListadosFormasPagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosFormasPagosConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.listadosformaspagosConstantesFunciones.resaltartotalListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activartotalListadosFormasPagos,iSizeTabla,this,true,"totalListadosFormasPagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosformaspagosConstantesFunciones.resaltartotalListadosFormasPagos,this.listadosformaspagosConstantesFunciones.activartotalListadosFormasPagos,this,true,"totalListadosFormasPagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ListadosFormasPagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.listadosformaspagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.listadosformaspagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosListadosFormasPagos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.listadosformaspagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.listadosformaspagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosListadosFormasPagos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarListadosFormasPagos && this.isPermisoGuardarCambiosListadosFormasPagos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.listadosformaspagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.listadosformaspagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosListadosFormasPagos.addColumn(tableColumn);
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
			
			this.jTableDatosListadosFormasPagos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarListadosFormasPagos && this.isPermisoGuardarCambiosListadosFormasPagos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarListadosFormasPagos && this.isPermisoGuardarCambiosListadosFormasPagos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosListadosFormasPagos.moveColumn(this.jTableDatosListadosFormasPagos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosListadosFormasPagos.moveColumn(this.jTableDatosListadosFormasPagos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosListadosFormasPagos.moveColumn(this.jTableDatosListadosFormasPagos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosListadosFormasPagos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosListadosFormasPagos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosListadosFormasPagos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosListadosFormasPagos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosListadosFormasPagos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosListadosFormasPagos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosListadosFormasPagos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosListadosFormasPagos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=listadosformaspagosLogic.getListadosFormasPagoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=listadosformaspagoss.size()-1;
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
		//this.jTableDatosListadosFormasPagos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosListadosFormasPagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosListadosFormasPagos();
			
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
				
				//this.isEsNuevoListadosFormasPagos=false;
					
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
			
				if(this.listadosformaspagosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormListadosFormasPagos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosListadosFormasPagos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosListadosFormasPagos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.listadosformaspagos.getsType().equals("DUPLICADO")
				   || this.listadosformaspagos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoListadosFormasPagos=true;
				
				} else {
					this.isEsNuevoListadosFormasPagos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
					if(this.listadosformaspagos.getId()>=0 && !this.listadosformaspagos.getIsNew()) {						
						this.isEsNuevoListadosFormasPagos=false;
						
					} else {
						this.isEsNuevoListadosFormasPagos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoListadosFormasPagos(esRelaciones);						
				
				this.seleccionarListadosFormasPagos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.listadosformaspagos.getId()<0) {
					this.isEsNuevoListadosFormasPagos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarListadosFormasPagos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarListadosFormasPagos(evt,rowIndex);
				}	
				
				if(this.listadosformaspagosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ListadosFormasPagos: " + this.dDif); 
					}
				}								
				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarListadosFormasPagos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.listadosformaspagos)) {
					if(this.listadosformaspagos.getId()>0) {
						this.listadosformaspagos.setIsDeleted(true);
						
						this.listadosformaspagossEliminados.add(this.listadosformaspagos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.listadosformaspagosLogic.getListadosFormasPagoss().remove(this.listadosformaspagos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.listadosformaspagoss.remove(this.listadosformaspagos);				
					}
					
					
					((ListadosFormasPagosModel) this.jTableDatosListadosFormasPagos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaListadosFormasPagos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarListadosFormasPagos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoListadosFormasPagos) {
			
			if(this.jInternalFrameDetalleFormListadosFormasPagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosListadosFormasPagos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosListadosFormasPagos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioListadosFormasPagos(this.listadosformaspagos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesListadosFormasPagos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesListadosFormasPagos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadosFormasPagos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoListadosFormasPagos(ListadosFormasPagos listadosformaspagos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoListadosFormasPagos(listadosformaspagos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoListadosFormasPagos(ListadosFormasPagos listadosformaspagos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioListadosFormasPagos(listadosformaspagos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyListadosFormasPagos(listadosformaspagos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyListadosFormasPagos(listadosformaspagos);
	}
	
	public void setVariablesObjetoActualToFormularioListadosFormasPagos(ListadosFormasPagos listadosformaspagos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormListadosFormasPagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormListadosFormasPagos.jLabelidListadosFormasPagos.setText(listadosformaspagos.getId().toString());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigoListadosFormasPagos.setText(listadosformaspagos.getcodigo());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextAreanombre_completoListadosFormasPagos.setText(listadosformaspagos.getnombre_completo());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setText(listadosformaspagos.getcodigo_tipo_cuenta_banco_global());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldnumero_cuentaListadosFormasPagos.setText(listadosformaspagos.getnumero_cuenta());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigo_estado_anti_clienteListadosFormasPagos.setText(listadosformaspagos.getcodigo_estado_anti_cliente());
			this.jInternalFrameDetalleFormListadosFormasPagos.jDateChooserfechaListadosFormasPagos.setDate(listadosformaspagos.getfecha());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldvalorListadosFormasPagos.setText(listadosformaspagos.getvalor().toString());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldvalor_adicionalListadosFormasPagos.setText(listadosformaspagos.getvalor_adicional().toString());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.setText(listadosformaspagos.getnombre_tipo_grupo_forma_pago());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldtotalListadosFormasPagos.setText(listadosformaspagos.gettotal().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ListadosFormasPagos listadosformaspagosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,listadosformaspagosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ListadosFormasPagos listadosformaspagosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				listadosformaspagosLocal=this.listadosformaspagos;
			} else {
				listadosformaspagosLocal=this.listadosformaspagosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(listadosformaspagosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoListadosFormasPagos(listadosformaspagosLocal,true);
					
					if(listadosformaspagosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(listadosformaspagosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(listadosformaspagosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoListadosFormasPagos(ListadosFormasPagos listadosformaspagos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualListadosFormasPagos(listadosformaspagos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(listadosformaspagos);
	}
	
	public void setVariablesFormularioToObjetoActualListadosFormasPagos(ListadosFormasPagos listadosformaspagos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualListadosFormasPagos(listadosformaspagos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualListadosFormasPagos(ListadosFormasPagos listadosformaspagos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormListadosFormasPagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormListadosFormasPagos.jLabelidListadosFormasPagos.getText()==null || this.jInternalFrameDetalleFormListadosFormasPagos.jLabelidListadosFormasPagos.getText()=="" || this.jInternalFrameDetalleFormListadosFormasPagos.jLabelidListadosFormasPagos.getText()=="Id") {
				this.jInternalFrameDetalleFormListadosFormasPagos.jLabelidListadosFormasPagos.setText("0");
			}

			if(conColumnasBase) {listadosformaspagos.setId(Long.parseLong(this.jInternalFrameDetalleFormListadosFormasPagos.jLabelidListadosFormasPagos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosFormasPagosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelIdListadosFormasPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosformaspagos.setcodigo(this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigoListadosFormasPagos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosFormasPagosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelcodigoListadosFormasPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosformaspagos.setnombre_completo(this.jInternalFrameDetalleFormListadosFormasPagos.jTextAreanombre_completoListadosFormasPagos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelnombre_completoListadosFormasPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosformaspagos.setcodigo_tipo_cuenta_banco_global(this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelcodigo_tipo_cuenta_banco_globalListadosFormasPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosformaspagos.setnumero_cuenta(this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldnumero_cuentaListadosFormasPagos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelnumero_cuentaListadosFormasPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosformaspagos.setcodigo_estado_anti_cliente(this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigo_estado_anti_clienteListadosFormasPagos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelcodigo_estado_anti_clienteListadosFormasPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosformaspagos.setfecha(this.jInternalFrameDetalleFormListadosFormasPagos.jDateChooserfechaListadosFormasPagos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosFormasPagosConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelfechaListadosFormasPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosformaspagos.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldvalorListadosFormasPagos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosFormasPagosConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelvalorListadosFormasPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosformaspagos.setvalor_adicional(Double.parseDouble(this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldvalor_adicionalListadosFormasPagos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosFormasPagosConstantesFunciones.LABEL_VALORADICIONAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelvalor_adicionalListadosFormasPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosformaspagos.setnombre_tipo_grupo_forma_pago(this.jInternalFrameDetalleFormListadosFormasPagos.jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabelnombre_tipo_grupo_forma_pagoListadosFormasPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosformaspagos.settotal(Double.parseDouble(this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldtotalListadosFormasPagos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosFormasPagosConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosFormasPagos.jLabeltotalListadosFormasPagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualListadosFormasPagos(ListadosFormasPagos listadosformaspagosBean,ListadosFormasPagos listadosformaspagos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosListadosFormasPagos(ListadosFormasPagos listadosformaspagosOrigen,ListadosFormasPagos listadosformaspagos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && listadosformaspagosOrigen.getId()!=null && !listadosformaspagosOrigen.getId().equals(0L))) {listadosformaspagos.setId(listadosformaspagosOrigen.getId());}}
			if(conDefault || (!conDefault && listadosformaspagosOrigen.getfecha_desde()!=null && !listadosformaspagosOrigen.getfecha_desde().equals(new Date()))) {listadosformaspagos.setfecha_desde(listadosformaspagosOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && listadosformaspagosOrigen.getfecha_hasta()!=null && !listadosformaspagosOrigen.getfecha_hasta().equals(new Date()))) {listadosformaspagos.setfecha_hasta(listadosformaspagosOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && listadosformaspagosOrigen.getcodigo()!=null && !listadosformaspagosOrigen.getcodigo().equals(""))) {listadosformaspagos.setcodigo(listadosformaspagosOrigen.getcodigo());}
			if(conDefault || (!conDefault && listadosformaspagosOrigen.getnombre_completo()!=null && !listadosformaspagosOrigen.getnombre_completo().equals(""))) {listadosformaspagos.setnombre_completo(listadosformaspagosOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && listadosformaspagosOrigen.getcodigo_tipo_cuenta_banco_global()!=null && !listadosformaspagosOrigen.getcodigo_tipo_cuenta_banco_global().equals(""))) {listadosformaspagos.setcodigo_tipo_cuenta_banco_global(listadosformaspagosOrigen.getcodigo_tipo_cuenta_banco_global());}
			if(conDefault || (!conDefault && listadosformaspagosOrigen.getnumero_cuenta()!=null && !listadosformaspagosOrigen.getnumero_cuenta().equals(""))) {listadosformaspagos.setnumero_cuenta(listadosformaspagosOrigen.getnumero_cuenta());}
			if(conDefault || (!conDefault && listadosformaspagosOrigen.getcodigo_estado_anti_cliente()!=null && !listadosformaspagosOrigen.getcodigo_estado_anti_cliente().equals(""))) {listadosformaspagos.setcodigo_estado_anti_cliente(listadosformaspagosOrigen.getcodigo_estado_anti_cliente());}
			if(conDefault || (!conDefault && listadosformaspagosOrigen.getfecha()!=null && !listadosformaspagosOrigen.getfecha().equals(new Date()))) {listadosformaspagos.setfecha(listadosformaspagosOrigen.getfecha());}
			if(conDefault || (!conDefault && listadosformaspagosOrigen.getvalor()!=null && !listadosformaspagosOrigen.getvalor().equals(0.0))) {listadosformaspagos.setvalor(listadosformaspagosOrigen.getvalor());}
			if(conDefault || (!conDefault && listadosformaspagosOrigen.getvalor_adicional()!=null && !listadosformaspagosOrigen.getvalor_adicional().equals(0.0))) {listadosformaspagos.setvalor_adicional(listadosformaspagosOrigen.getvalor_adicional());}
			if(conDefault || (!conDefault && listadosformaspagosOrigen.getnombre_tipo_grupo_forma_pago()!=null && !listadosformaspagosOrigen.getnombre_tipo_grupo_forma_pago().equals(""))) {listadosformaspagos.setnombre_tipo_grupo_forma_pago(listadosformaspagosOrigen.getnombre_tipo_grupo_forma_pago());}
			if(conDefault || (!conDefault && listadosformaspagosOrigen.gettotal()!=null && !listadosformaspagosOrigen.gettotal().equals(0.0))) {listadosformaspagos.settotal(listadosformaspagosOrigen.gettotal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioListadosFormasPagos(ListadosFormasPagos listadosformaspagos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormListadosFormasPagos.jLabelidListadosFormasPagos.setText(listadosformaspagos.getId().toString());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigoListadosFormasPagos.setText(listadosformaspagos.getcodigo());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextAreanombre_completoListadosFormasPagos.setText(listadosformaspagos.getnombre_completo());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setText(listadosformaspagos.getcodigo_tipo_cuenta_banco_global());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldnumero_cuentaListadosFormasPagos.setText(listadosformaspagos.getnumero_cuenta());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigo_estado_anti_clienteListadosFormasPagos.setText(listadosformaspagos.getcodigo_estado_anti_cliente());
			this.jInternalFrameDetalleFormListadosFormasPagos.jDateChooserfechaListadosFormasPagos.setDate(listadosformaspagos.getfecha());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldvalorListadosFormasPagos.setText(listadosformaspagos.getvalor().toString());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldvalor_adicionalListadosFormasPagos.setText(listadosformaspagos.getvalor_adicional().toString());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.setText(listadosformaspagos.getnombre_tipo_grupo_forma_pago());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldtotalListadosFormasPagos.setText(listadosformaspagos.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioListadosFormasPagos(ListadosFormasPagosBean listadosformaspagosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormListadosFormasPagos.jLabelidListadosFormasPagos.setText(listadosformaspagosBean.getId().toString());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigoListadosFormasPagos.setText(listadosformaspagosBean.getcodigo());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextAreanombre_completoListadosFormasPagos.setText(listadosformaspagosBean.getnombre_completo());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setText(listadosformaspagosBean.getcodigo_tipo_cuenta_banco_global());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldnumero_cuentaListadosFormasPagos.setText(listadosformaspagosBean.getnumero_cuenta());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigo_estado_anti_clienteListadosFormasPagos.setText(listadosformaspagosBean.getcodigo_estado_anti_cliente());
			this.jInternalFrameDetalleFormListadosFormasPagos.jDateChooserfechaListadosFormasPagos.setDate(listadosformaspagosBean.getfecha());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldvalorListadosFormasPagos.setText(listadosformaspagosBean.getvalor().toString());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldvalor_adicionalListadosFormasPagos.setText(listadosformaspagosBean.getvalor_adicional().toString());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.setText(listadosformaspagosBean.getnombre_tipo_grupo_forma_pago());
			this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldtotalListadosFormasPagos.setText(listadosformaspagosBean.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanListadosFormasPagos(ListadosFormasPagosParameterReturnGeneral listadosformaspagosReturnGeneral,ListadosFormasPagosBean listadosformaspagosBean,Boolean conDefault) throws Exception { 
		try {
			ListadosFormasPagos listadosformaspagosLocal=new ListadosFormasPagos();
			
			listadosformaspagosLocal=listadosformaspagosReturnGeneral.getListadosFormasPagos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && listadosformaspagosLocal.getId()!=null && !listadosformaspagosLocal.getId().equals(0L))) {listadosformaspagosBean.setId(listadosformaspagosLocal.getId());}}
			if(conDefault || (!conDefault && listadosformaspagosLocal.getcodigo()!=null && !listadosformaspagosLocal.getcodigo().equals(""))) {listadosformaspagosBean.setcodigo(listadosformaspagosLocal.getcodigo());}
			if(conDefault || (!conDefault && listadosformaspagosLocal.getnombre_completo()!=null && !listadosformaspagosLocal.getnombre_completo().equals(""))) {listadosformaspagosBean.setnombre_completo(listadosformaspagosLocal.getnombre_completo());}
			if(conDefault || (!conDefault && listadosformaspagosLocal.getcodigo_tipo_cuenta_banco_global()!=null && !listadosformaspagosLocal.getcodigo_tipo_cuenta_banco_global().equals(""))) {listadosformaspagosBean.setcodigo_tipo_cuenta_banco_global(listadosformaspagosLocal.getcodigo_tipo_cuenta_banco_global());}
			if(conDefault || (!conDefault && listadosformaspagosLocal.getnumero_cuenta()!=null && !listadosformaspagosLocal.getnumero_cuenta().equals(""))) {listadosformaspagosBean.setnumero_cuenta(listadosformaspagosLocal.getnumero_cuenta());}
			if(conDefault || (!conDefault && listadosformaspagosLocal.getcodigo_estado_anti_cliente()!=null && !listadosformaspagosLocal.getcodigo_estado_anti_cliente().equals(""))) {listadosformaspagosBean.setcodigo_estado_anti_cliente(listadosformaspagosLocal.getcodigo_estado_anti_cliente());}
			if(conDefault || (!conDefault && listadosformaspagosLocal.getfecha()!=null && !listadosformaspagosLocal.getfecha().equals(new Date()))) {listadosformaspagosBean.setfecha(listadosformaspagosLocal.getfecha());}
			if(conDefault || (!conDefault && listadosformaspagosLocal.getvalor()!=null && !listadosformaspagosLocal.getvalor().equals(0.0))) {listadosformaspagosBean.setvalor(listadosformaspagosLocal.getvalor());}
			if(conDefault || (!conDefault && listadosformaspagosLocal.getvalor_adicional()!=null && !listadosformaspagosLocal.getvalor_adicional().equals(0.0))) {listadosformaspagosBean.setvalor_adicional(listadosformaspagosLocal.getvalor_adicional());}
			if(conDefault || (!conDefault && listadosformaspagosLocal.getnombre_tipo_grupo_forma_pago()!=null && !listadosformaspagosLocal.getnombre_tipo_grupo_forma_pago().equals(""))) {listadosformaspagosBean.setnombre_tipo_grupo_forma_pago(listadosformaspagosLocal.getnombre_tipo_grupo_forma_pago());}
			if(conDefault || (!conDefault && listadosformaspagosLocal.gettotal()!=null && !listadosformaspagosLocal.gettotal().equals(0.0))) {listadosformaspagosBean.settotal(listadosformaspagosLocal.gettotal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxListadosFormasPagosGenerico(Long idListadosFormasPagosSeleccionado,JComboBox jComboBoxListadosFormasPagos,List<ListadosFormasPagos> listadosformaspagossLocal)throws Exception {
		try {
			ListadosFormasPagos  listadosformaspagosTemp=null;

			for(ListadosFormasPagos listadosformaspagosAux:listadosformaspagossLocal) {
				if(listadosformaspagosAux.getId()!=null && listadosformaspagosAux.getId().equals(idListadosFormasPagosSeleccionado)) {
					listadosformaspagosTemp=listadosformaspagosAux;
					break;
				}
			}

			jComboBoxListadosFormasPagos.setSelectedItem(listadosformaspagosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxListadosFormasPagosGenerico(JComboBox jComboBoxListadosFormasPagos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxListadosFormasPagos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxListadosFormasPagos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxListadosFormasPagos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxListadosFormasPagos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxListadosFormasPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxListadosFormasPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadosformaspagos=(ListadosFormasPagos) listadosformaspagosLogic.getListadosFormasPagoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			listadosformaspagos =(ListadosFormasPagos) listadosformaspagoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("TipoGrupoFormaPago")) {
			//sDescripcion=this.getActualTipoGrupoFormaPagoForeignKeyDescripcion((Long)value);
			if(!listadosformaspagos.getIsNew() && !listadosformaspagos.getIsChanged() && !listadosformaspagos.getIsDeleted()) {
				sDescripcion=listadosformaspagos.gettipogrupoformapago_descripcion();
			} else {
				//sDescripcion=this.getActualTipoGrupoFormaPagoForeignKeyDescripcion((Long)value);
				sDescripcion=listadosformaspagos.gettipogrupoformapago_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!listadosformaspagos.getIsNew() && !listadosformaspagos.getIsChanged() && !listadosformaspagos.getIsDeleted()) {
				sDescripcion=listadosformaspagos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=listadosformaspagos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!listadosformaspagos.getIsNew() && !listadosformaspagos.getIsChanged() && !listadosformaspagos.getIsDeleted()) {
				sDescripcion=listadosformaspagos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=listadosformaspagos.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ListadosFormasPagos listadosformaspagosRow=new ListadosFormasPagos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadosformaspagosRow=(ListadosFormasPagos) listadosformaspagosLogic.getListadosFormasPagoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			listadosformaspagosRow=(ListadosFormasPagos) listadosformaspagoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualListadosFormasPagos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoListadosFormasPagos.setVisible((this.isVisibilidadCeldaNuevoListadosFormasPagos && this.isPermisoNuevoListadosFormasPagos));			
			this.jButtonDuplicarListadosFormasPagos.setVisible((this.isVisibilidadCeldaDuplicarListadosFormasPagos && this.isPermisoDuplicarListadosFormasPagos));			
			this.jButtonCopiarListadosFormasPagos.setVisible((this.isVisibilidadCeldaCopiarListadosFormasPagos && this.isPermisoCopiarListadosFormasPagos));
			this.jButtonVerFormListadosFormasPagos.setVisible((this.isVisibilidadCeldaVerFormListadosFormasPagos && this.isPermisoVerFormListadosFormasPagos));
			
			this.jButtonAbrirOrderByListadosFormasPagos.setVisible((this.isVisibilidadCeldaOrdenListadosFormasPagos && this.isPermisoOrdenListadosFormasPagos));			
			
			this.jButtonNuevoRelacionesListadosFormasPagos.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos && this.isPermisoNuevoListadosFormasPagos));			
			this.jButtonNuevoGuardarCambiosListadosFormasPagos.setVisible((this.isVisibilidadCeldaNuevoListadosFormasPagos && this.isPermisoNuevoListadosFormasPagos && this.isPermisoGuardarCambiosListadosFormasPagos));
			
			if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonModificarListadosFormasPagos.setVisible((this.isVisibilidadCeldaModificarListadosFormasPagos && this.isPermisoActualizarListadosFormasPagos));	
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonActualizarListadosFormasPagos.setVisible((this.isVisibilidadCeldaActualizarListadosFormasPagos && this.isPermisoActualizarListadosFormasPagos));	
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonEliminarListadosFormasPagos.setVisible((this.isVisibilidadCeldaEliminarListadosFormasPagos && this.isPermisoEliminarListadosFormasPagos));
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonCancelarListadosFormasPagos.setVisible(this.isVisibilidadCeldaCancelarListadosFormasPagos);							
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonGuardarCambiosListadosFormasPagos.setVisible((this.isVisibilidadCeldaGuardarListadosFormasPagos && this.isPermisoGuardarCambiosListadosFormasPagos));			
			
			}
						
			this.jButtonGuardarCambiosTablaListadosFormasPagos.setVisible((this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos && this.isPermisoGuardarCambiosListadosFormasPagos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarListadosFormasPagos.setVisible((this.isVisibilidadCeldaNuevoListadosFormasPagos && this.isPermisoNuevoListadosFormasPagos));						
			this.jButtonDuplicarToolBarListadosFormasPagos.setVisible((this.isVisibilidadCeldaDuplicarListadosFormasPagos && this.isPermisoDuplicarListadosFormasPagos));						
			this.jButtonCopiarToolBarListadosFormasPagos.setVisible((this.isVisibilidadCeldaCopiarListadosFormasPagos && this.isPermisoCopiarListadosFormasPagos));			
			this.jButtonVerFormToolBarListadosFormasPagos.setVisible((this.isVisibilidadCeldaVerFormListadosFormasPagos && this.isPermisoVerFormListadosFormasPagos));			
			this.jButtonAbrirOrderByToolBarListadosFormasPagos.setVisible((this.isVisibilidadCeldaOrdenListadosFormasPagos && this.isPermisoOrdenListadosFormasPagos));
			this.jButtonNuevoRelacionesToolBarListadosFormasPagos.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos && this.isPermisoNuevoListadosFormasPagos));			
			this.jButtonNuevoGuardarCambiosToolBarListadosFormasPagos.setVisible((this.isVisibilidadCeldaNuevoListadosFormasPagos && this.isPermisoNuevoListadosFormasPagos && this.isPermisoGuardarCambiosListadosFormasPagos));			
			
			if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonModificarToolBarListadosFormasPagos.setVisible((this.isVisibilidadCeldaModificarListadosFormasPagos && this.isPermisoActualizarListadosFormasPagos));	
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonActualizarToolBarListadosFormasPagos.setVisible((this.isVisibilidadCeldaActualizarListadosFormasPagos  && this.isPermisoActualizarListadosFormasPagos));	
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonEliminarToolBarListadosFormasPagos.setVisible((this.isVisibilidadCeldaEliminarListadosFormasPagos && this.isPermisoEliminarListadosFormasPagos));
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonCancelarToolBarListadosFormasPagos.setVisible(this.isVisibilidadCeldaCancelarListadosFormasPagos);				
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonGuardarCambiosToolBarListadosFormasPagos.setVisible((this.isVisibilidadCeldaGuardarListadosFormasPagos && this.isPermisoGuardarCambiosListadosFormasPagos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarListadosFormasPagos.setVisible((this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos && this.isPermisoGuardarCambiosListadosFormasPagos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoListadosFormasPagos.setVisible((this.isVisibilidadCeldaNuevoListadosFormasPagos && this.isPermisoNuevoListadosFormasPagos));			
			this.jMenuItemDuplicarListadosFormasPagos.setVisible((this.isVisibilidadCeldaDuplicarListadosFormasPagos && this.isPermisoDuplicarListadosFormasPagos));			
			this.jMenuItemCopiarListadosFormasPagos.setVisible((this.isVisibilidadCeldaCopiarListadosFormasPagos && this.isPermisoCopiarListadosFormasPagos));			
			this.jMenuItemVerFormListadosFormasPagos.setVisible((this.isVisibilidadCeldaVerFormListadosFormasPagos && this.isPermisoVerFormListadosFormasPagos));			
			this.jMenuItemAbrirOrderByListadosFormasPagos.setVisible((this.isVisibilidadCeldaOrdenListadosFormasPagos && this.isPermisoOrdenListadosFormasPagos));			
			//this.jMenuItemMostrarOcultarListadosFormasPagos.setVisible((this.isVisibilidadCeldaOrdenListadosFormasPagos && this.isPermisoOrdenListadosFormasPagos));
			this.jMenuItemDetalleAbrirOrderByListadosFormasPagos.setVisible((this.isVisibilidadCeldaOrdenListadosFormasPagos && this.isPermisoOrdenListadosFormasPagos));			
			//this.jMenuItemDetalleMostrarOcultarListadosFormasPagos.setVisible((this.isVisibilidadCeldaOrdenListadosFormasPagos && this.isPermisoOrdenListadosFormasPagos));			
			this.jMenuItemNuevoRelacionesListadosFormasPagos.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos && this.isPermisoNuevoListadosFormasPagos));			
			this.jMenuItemNuevoGuardarCambiosListadosFormasPagos.setVisible((this.isVisibilidadCeldaNuevoListadosFormasPagos && this.isPermisoNuevoListadosFormasPagos && this.isPermisoGuardarCambiosListadosFormasPagos));									
			
			if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
			this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemModificarListadosFormasPagos.setVisible((this.isVisibilidadCeldaModificarListadosFormasPagos && this.isPermisoActualizarListadosFormasPagos));	
			this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemActualizarListadosFormasPagos.setVisible((this.isVisibilidadCeldaActualizarListadosFormasPagos && this.isPermisoActualizarListadosFormasPagos));	
			this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemEliminarListadosFormasPagos.setVisible((this.isVisibilidadCeldaEliminarListadosFormasPagos && this.isPermisoEliminarListadosFormasPagos));
			this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemCancelarListadosFormasPagos.setVisible(this.isVisibilidadCeldaCancelarListadosFormasPagos);				
			}
			
			this.jMenuItemGuardarCambiosListadosFormasPagos.setVisible((this.isVisibilidadCeldaGuardarListadosFormasPagos && this.isPermisoGuardarCambiosListadosFormasPagos));						
			this.jMenuItemGuardarCambiosTablaListadosFormasPagos.setVisible((this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos && this.isPermisoGuardarCambiosListadosFormasPagos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoListadosFormasPagos=this.jButtonNuevoListadosFormasPagos.isVisible();
			this.isVisibilidadCeldaDuplicarListadosFormasPagos=this.jButtonDuplicarListadosFormasPagos.isVisible();
			this.isVisibilidadCeldaCopiarListadosFormasPagos=this.jButtonCopiarListadosFormasPagos.isVisible();
			this.isVisibilidadCeldaVerFormListadosFormasPagos=this.jButtonVerFormListadosFormasPagos.isVisible();
			
			this.isVisibilidadCeldaOrdenListadosFormasPagos=this.jButtonAbrirOrderByListadosFormasPagos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos=this.jButtonNuevoRelacionesListadosFormasPagos.isVisible();
			this.isVisibilidadCeldaModificarListadosFormasPagos=this.jButtonModificarListadosFormasPagos.isVisible();
			
			if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
			this.isVisibilidadCeldaActualizarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jButtonActualizarListadosFormasPagos.isVisible();
			this.isVisibilidadCeldaEliminarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jButtonEliminarListadosFormasPagos.isVisible();
			this.isVisibilidadCeldaCancelarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jButtonCancelarListadosFormasPagos.isVisible();
			this.isVisibilidadCeldaGuardarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jButtonGuardarCambiosListadosFormasPagos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos=this.jButtonGuardarCambiosTablaListadosFormasPagos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoListadosFormasPagos=this.jButtonNuevoToolBarListadosFormasPagos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos=this.jButtonNuevoRelacionesToolBarListadosFormasPagos.isVisible();
			
			if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
			this.isVisibilidadCeldaModificarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jButtonModificarToolBarListadosFormasPagos.isVisible();
			this.isVisibilidadCeldaActualizarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jButtonActualizarToolBarListadosFormasPagos.isVisible();
			this.isVisibilidadCeldaEliminarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jButtonEliminarToolBarListadosFormasPagos.isVisible();
			this.isVisibilidadCeldaCancelarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jButtonCancelarToolBarListadosFormasPagos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarListadosFormasPagos=this.jButtonGuardarCambiosToolBarListadosFormasPagos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos=this.jButtonGuardarCambiosTablaToolBarListadosFormasPagos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoListadosFormasPagos=this.jMenuItemNuevoListadosFormasPagos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos=this.jMenuItemNuevoRelacionesListadosFormasPagos.isVisible();
			
			if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
			this.isVisibilidadCeldaModificarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemModificarListadosFormasPagos.isVisible();
			this.isVisibilidadCeldaActualizarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemActualizarListadosFormasPagos.isVisible();
			this.isVisibilidadCeldaEliminarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemEliminarListadosFormasPagos.isVisible();
			this.isVisibilidadCeldaCancelarListadosFormasPagos=this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemCancelarListadosFormasPagos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarListadosFormasPagos=this.jMenuItemGuardarCambiosListadosFormasPagos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos=this.jMenuItemGuardarCambiosTablaListadosFormasPagos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesListadosFormasPagos(Boolean esInicializar) {
		if(ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.listadosformaspagosSessionBean.getConGuardarRelaciones()) {
				//if(this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesListadosFormasPagos();
			}
			
			this.inicializarActualizarBindingBotonesManualListadosFormasPagos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualListadosFormasPagos() {
		this.jButtonNuevoListadosFormasPagos.setVisible(this.isPermisoNuevoListadosFormasPagos);			
		this.jButtonDuplicarListadosFormasPagos.setVisible(this.isPermisoDuplicarListadosFormasPagos);			
		this.jButtonCopiarListadosFormasPagos.setVisible(this.isPermisoCopiarListadosFormasPagos);			
		this.jButtonVerFormListadosFormasPagos.setVisible(this.isPermisoVerFormListadosFormasPagos);			
		
		this.jButtonAbrirOrderByListadosFormasPagos.setVisible(this.isPermisoOrdenListadosFormasPagos);					
		
		this.jButtonNuevoRelacionesListadosFormasPagos.setVisible(this.isPermisoNuevoListadosFormasPagos);			
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonModificarListadosFormasPagos.setVisible(this.isPermisoActualizarListadosFormasPagos);	
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonActualizarListadosFormasPagos.setVisible(this.isPermisoActualizarListadosFormasPagos);	
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonEliminarListadosFormasPagos.setVisible(this.isPermisoEliminarListadosFormasPagos);
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonCancelarListadosFormasPagos.setVisible(this.isVisibilidadCeldaCancelarListadosFormasPagos);						
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonGuardarCambiosListadosFormasPagos.setVisible(this.isPermisoGuardarCambiosListadosFormasPagos);							
		}
		
		this.jButtonGuardarCambiosTablaListadosFormasPagos.setVisible(this.isPermisoActualizarListadosFormasPagos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleListadosFormasPagos() {
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonModificarListadosFormasPagos.setVisible(this.isPermisoActualizarListadosFormasPagos);	
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonActualizarListadosFormasPagos.setVisible(this.isPermisoActualizarListadosFormasPagos);	
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonEliminarListadosFormasPagos.setVisible(this.isPermisoEliminarListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonCancelarListadosFormasPagos.setVisible(this.isVisibilidadCeldaCancelarListadosFormasPagos);							
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonGuardarCambiosListadosFormasPagos.setVisible((this.isVisibilidadCeldaGuardarListadosFormasPagos && this.isPermisoGuardarCambiosListadosFormasPagos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosListadosFormasPagos() {
		if(ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualListadosFormasPagos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesListadosFormasPagos() {
	}
	
	public void jTableDatosListadosFormasPagosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarListadosFormasPagos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidListadosFormasPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosformaspagos==null) {
						this.listadosformaspagos = new ListadosFormasPagos();
					}

					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				}

				if(this.listadosformaspagos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.listadosformaspagos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosFormasPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_grupo_forma_pagoListadosFormasPagosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipogrupoformapago=true;

			idTienePermisotipogrupoformapago=this.tienePermisosUsuarioEnPaginaWebListadosFormasPagos(TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipogrupoformapago) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosListadosFormasPagos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosListadosFormasPagos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);

				this.tipogrupoformapagoBeanSwingJInternalFrame=new TipoGrupoFormaPagoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipogrupoformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipogrupoformapagoBeanSwingJInternalFrame.getTipoGrupoFormaPagoLogic().setConnexion(this.listadosformaspagosLogic.getConnexion());

				if(this.listadosformaspagos.getid_tipo_grupo_forma_pago()!=null) {
					this.tipogrupoformapagoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipogrupoformapagoBeanSwingJInternalFrame.setIdActual(this.listadosformaspagos.getid_tipo_grupo_forma_pago());
					this.tipogrupoformapagoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipogrupoformapagoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipogrupoformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoGrupoFormaPago();
				}

				JInternalFrameBase jinternalFrame =this.tipogrupoformapagoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderListadosFormasPagos=(TitledBorder)this.jScrollPanelDatosListadosFormasPagos.getBorder();
				TitledBorder titledBordertipogrupoformapago=(TitledBorder)this.tipogrupoformapagoBeanSwingJInternalFrame.jScrollPanelDatosTipoGrupoFormaPago.getBorder();

				titledBordertipogrupoformapago.setTitle(titledBorderListadosFormasPagos.getTitle() + " -> Tipo Grupo Forma Pago");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_grupo_forma_pagoListadosFormasPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosformaspagos==null) {
						this.listadosformaspagos = new ListadosFormasPagos();
					}

					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				}

				if(this.listadosformaspagos.getid_tipo_grupo_forma_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_grupo_forma_pago = "+this.listadosformaspagos.getid_tipo_grupo_forma_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosFormasPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaListadosFormasPagosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebListadosFormasPagos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosListadosFormasPagos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosListadosFormasPagos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.listadosformaspagosLogic.getConnexion());

				if(this.listadosformaspagos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.listadosformaspagos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderListadosFormasPagos=(TitledBorder)this.jScrollPanelDatosListadosFormasPagos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderListadosFormasPagos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaListadosFormasPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosformaspagos==null) {
						this.listadosformaspagos = new ListadosFormasPagos();
					}

					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				}

				if(this.listadosformaspagos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.listadosformaspagos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosFormasPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalListadosFormasPagosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebListadosFormasPagos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosListadosFormasPagos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosListadosFormasPagos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.listadosformaspagosLogic.getConnexion());

				if(this.listadosformaspagos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.listadosformaspagos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderListadosFormasPagos=(TitledBorder)this.jScrollPanelDatosListadosFormasPagos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderListadosFormasPagos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalListadosFormasPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosformaspagos==null) {
						this.listadosformaspagos = new ListadosFormasPagos();
					}

					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				}

				if(this.listadosformaspagos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.listadosformaspagos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosFormasPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeListadosFormasPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosformaspagos==null) {
						this.listadosformaspagos = new ListadosFormasPagos();
					}

					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				}

				if(this.listadosformaspagos.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.listadosformaspagos.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosFormasPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaListadosFormasPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosformaspagos==null) {
						this.listadosformaspagos = new ListadosFormasPagos();
					}

					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				}

				if(this.listadosformaspagos.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.listadosformaspagos.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosFormasPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoListadosFormasPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosformaspagos==null) {
						this.listadosformaspagos = new ListadosFormasPagos();
					}

					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				}

				if(this.listadosformaspagos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.listadosformaspagos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosFormasPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoListadosFormasPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosformaspagos==null) {
						this.listadosformaspagos = new ListadosFormasPagos();
					}

					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				}

				if(this.listadosformaspagos.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.listadosformaspagos.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosFormasPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_tipo_cuenta_banco_globalListadosFormasPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosformaspagos==null) {
						this.listadosformaspagos = new ListadosFormasPagos();
					}

					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				}

				if(this.listadosformaspagos.getcodigo_tipo_cuenta_banco_global()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_tipo_cuenta_banco_global like '%"+this.listadosformaspagos.getcodigo_tipo_cuenta_banco_global()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosFormasPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cuentaListadosFormasPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosformaspagos==null) {
						this.listadosformaspagos = new ListadosFormasPagos();
					}

					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				}

				if(this.listadosformaspagos.getnumero_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cuenta like '%"+this.listadosformaspagos.getnumero_cuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosFormasPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_estado_anti_clienteListadosFormasPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosformaspagos==null) {
						this.listadosformaspagos = new ListadosFormasPagos();
					}

					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				}

				if(this.listadosformaspagos.getcodigo_estado_anti_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_estado_anti_cliente like '%"+this.listadosformaspagos.getcodigo_estado_anti_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosFormasPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaListadosFormasPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosformaspagos==null) {
						this.listadosformaspagos = new ListadosFormasPagos();
					}

					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				}

				if(this.listadosformaspagos.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.listadosformaspagos.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosFormasPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorListadosFormasPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosformaspagos==null) {
						this.listadosformaspagos = new ListadosFormasPagos();
					}

					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				}

				if(this.listadosformaspagos.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.listadosformaspagos.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosFormasPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_adicionalListadosFormasPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosformaspagos==null) {
						this.listadosformaspagos = new ListadosFormasPagos();
					}

					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				}

				if(this.listadosformaspagos.getvalor_adicional()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_adicional = "+this.listadosformaspagos.getvalor_adicional().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosFormasPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_grupo_forma_pagoListadosFormasPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosformaspagos==null) {
						this.listadosformaspagos = new ListadosFormasPagos();
					}

					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				}

				if(this.listadosformaspagos.getnombre_tipo_grupo_forma_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_grupo_forma_pago like '%"+this.listadosformaspagos.getnombre_tipo_grupo_forma_pago()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosFormasPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalListadosFormasPagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.getlistadosformaspagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosformaspagos==null) {
						this.listadosformaspagos = new ListadosFormasPagos();
					}

					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);
				}

				if(this.listadosformaspagos.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.listadosformaspagos.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosFormasPagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaListadosFormasPagosListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadosFormasPagos(false,false);

			this.getListadosFormasPagossBusquedaListadosFormasPagos();

			this.inicializarActualizarBindingListadosFormasPagos(false);

			//if(ListadosFormasPagosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadosFormasPagos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadosFormasPagos(false,false);

			this.getListadosFormasPagossFK_IdEmpresa();

			this.inicializarActualizarBindingListadosFormasPagos(false);

			//if(ListadosFormasPagosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadosFormasPagos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadosFormasPagos(false,false);

			this.getListadosFormasPagossFK_IdSucursal();

			this.inicializarActualizarBindingListadosFormasPagos(false);

			//if(ListadosFormasPagosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadosFormasPagos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoGrupoFormaPagoListadosFormasPagosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadosFormasPagos(false,false);

			this.getListadosFormasPagossFK_IdTipoGrupoFormaPago();

			this.inicializarActualizarBindingListadosFormasPagos(false);

			//if(ListadosFormasPagosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadosFormasPagos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosformaspagosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameListadosFormasPagos() {
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
			this.jInternalFrameDetalleFormListadosFormasPagos.setVisible(false);	    			
			this.jInternalFrameDetalleFormListadosFormasPagos.dispose();
			this.jInternalFrameDetalleFormListadosFormasPagos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoListadosFormasPagos!=null) {
			this.jInternalFrameReporteDinamicoListadosFormasPagos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoListadosFormasPagos.dispose();
			this.jInternalFrameReporteDinamicoListadosFormasPagos=null;
		}
		
		if(this.jInternalFrameImportacionListadosFormasPagos!=null) {
			this.jInternalFrameImportacionListadosFormasPagos.setVisible(false);	    			
			this.jInternalFrameImportacionListadosFormasPagos.dispose();
			this.jInternalFrameImportacionListadosFormasPagos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessListadosFormasPagos();
			
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
			
			
			if(sTipo.equals("NuevoListadosFormasPagos")) {
				jButtonNuevoListadosFormasPagosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarListadosFormasPagos")) {
				jButtonDuplicarListadosFormasPagosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarListadosFormasPagos")) {
				jButtonCopiarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("VerFormListadosFormasPagos")) {
				jButtonVerFormListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarListadosFormasPagos")) {
				jButtonNuevoListadosFormasPagosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarListadosFormasPagos")) {
				jButtonDuplicarListadosFormasPagosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoListadosFormasPagos")) {
				jButtonNuevoListadosFormasPagosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarListadosFormasPagos")) {
				jButtonDuplicarListadosFormasPagosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesListadosFormasPagos")) {
				jButtonNuevoListadosFormasPagosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarListadosFormasPagos")) {
				jButtonNuevoListadosFormasPagosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesListadosFormasPagos")) {
				jButtonNuevoListadosFormasPagosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarListadosFormasPagos")) {
				jButtonModificarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarListadosFormasPagos")) {
				jButtonModificarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarListadosFormasPagos")) {
				jButtonModificarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarListadosFormasPagos")) {
				jButtonActualizarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarListadosFormasPagos")) {
				jButtonActualizarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarListadosFormasPagos")) {
				jButtonActualizarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("EliminarListadosFormasPagos")) {
				jButtonEliminarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarListadosFormasPagos")) {
				jButtonEliminarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarListadosFormasPagos")) {
				jButtonEliminarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("CancelarListadosFormasPagos")) {
				jButtonCancelarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarListadosFormasPagos")) {
				jButtonCancelarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarListadosFormasPagos")) {
				jButtonCancelarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("CerrarListadosFormasPagos")) {
				jButtonCerrarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarListadosFormasPagos")) {
				jButtonCerrarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarListadosFormasPagos")) {
				jButtonCerrarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarListadosFormasPagos")) {
				jButtonMostrarOcultarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarListadosFormasPagos")) {
				jButtonCancelarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosListadosFormasPagos")) {
				jButtonGuardarCambiosListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarListadosFormasPagos")) {
				jButtonGuardarCambiosListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarListadosFormasPagos")) {
				jButtonCopiarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarListadosFormasPagos")) {
				jButtonVerFormListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosListadosFormasPagos")) {
				jButtonGuardarCambiosListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarListadosFormasPagos")) {
				jButtonCopiarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormListadosFormasPagos")) {
				jButtonVerFormListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaListadosFormasPagos")) {
				jButtonGuardarCambiosListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarListadosFormasPagos")) {
				jButtonGuardarCambiosListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaListadosFormasPagos")) {
				jButtonGuardarCambiosListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionListadosFormasPagos")) {
				jButtonRecargarInformacionListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarListadosFormasPagos")) {
				jButtonRecargarInformacionListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionListadosFormasPagos")) {
				jButtonRecargarInformacionListadosFormasPagosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresListadosFormasPagos")) {
				jButtonAnterioresListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarListadosFormasPagos")) {
				jButtonAnterioresListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreListadosFormasPagos")) {
				jButtonAnterioresListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesListadosFormasPagos")) {
				jButtonSiguientesListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarListadosFormasPagos")) {
				jButtonSiguientesListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesListadosFormasPagos")) {
				jButtonSiguientesListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByListadosFormasPagos") || sTipo.equals("MenuItemDetalleAbrirOrderByListadosFormasPagos")) {
				jButtonAbrirOrderByListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarListadosFormasPagos") || sTipo.equals("MenuItemDetalleMostrarOcultarListadosFormasPagos")) {
				jButtonMostrarOcultarListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosListadosFormasPagos")) {
				jButtonNuevoGuardarCambiosListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarListadosFormasPagos")) {
				jButtonNuevoGuardarCambiosListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosListadosFormasPagos")) {
				jButtonNuevoGuardarCambiosListadosFormasPagosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoListadosFormasPagos")) {
				jButtonCerrarReporteDinamicoListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoListadosFormasPagos")) {
				jButtonGenerarReporteDinamicoListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoListadosFormasPagos")) {
				
				jButtonGenerarExcelReporteDinamicoListadosFormasPagosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionListadosFormasPagos")) {
				jButtonCerrarImportacionListadosFormasPagosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionListadosFormasPagos")) {
				
				jButtonGenerarImportacionListadosFormasPagosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionListadosFormasPagos")) {
				
				jButtonAbrirImportacionListadosFormasPagosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesListadosFormasPagos")) {
				jComboBoxTiposAccionesListadosFormasPagosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesListadosFormasPagos")) {
				jComboBoxTiposRelacionesListadosFormasPagosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioListadosFormasPagos")) {
				jComboBoxTiposAccionesListadosFormasPagosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarListadosFormasPagos")) {
				
				jComboBoxTiposSeleccionarListadosFormasPagosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralListadosFormasPagos")) {
				jTextFieldValorCampoGeneralListadosFormasPagosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByListadosFormasPagos")) {
				jButtonAbrirOrderByListadosFormasPagosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarListadosFormasPagos")) {
				jButtonAbrirOrderByListadosFormasPagosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByListadosFormasPagos")) {
				jButtonCerrarOrderByListadosFormasPagosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idListadosFormasPagosBusqueda")) {
				this.jButtonidListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_grupo_forma_pagoListadosFormasPagosUpdate")) {
				this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_grupo_forma_pagoListadosFormasPagosBusqueda")) {
				this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaListadosFormasPagosUpdate")) {
				this.jButtonid_empresaListadosFormasPagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaListadosFormasPagosBusqueda")) {
				this.jButtonid_empresaListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalListadosFormasPagosUpdate")) {
				this.jButtonid_sucursalListadosFormasPagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalListadosFormasPagosBusqueda")) {
				this.jButtonid_sucursalListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeListadosFormasPagosBusqueda")) {
				this.jButtonfecha_desdeListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaListadosFormasPagosBusqueda")) {
				this.jButtonfecha_hastaListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoListadosFormasPagosBusqueda")) {
				this.jButtoncodigoListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoListadosFormasPagosBusqueda")) {
				this.jButtonnombre_completoListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda")) {
				this.jButtoncodigo_tipo_cuenta_banco_globalListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuentaListadosFormasPagosBusqueda")) {
				this.jButtonnumero_cuentaListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_estado_anti_clienteListadosFormasPagosBusqueda")) {
				this.jButtoncodigo_estado_anti_clienteListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaListadosFormasPagosBusqueda")) {
				this.jButtonfechaListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorListadosFormasPagosBusqueda")) {
				this.jButtonvalorListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_adicionalListadosFormasPagosBusqueda")) {
				this.jButtonvalor_adicionalListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda")) {
				this.jButtonnombre_tipo_grupo_forma_pagoListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalListadosFormasPagosBusqueda")) {
				this.jButtontotalListadosFormasPagosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaListadosFormasPagosListadosFormasPagos")) {
				this.jButtonBusquedaListadosFormasPagosListadosFormasPagosActionPerformed(evt);
			}
			
			;
			
			
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessListadosFormasPagos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosFormasPagosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosformaspagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosformaspagos);
				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
				
				


				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosFormasPagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosFormasPagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ListadosFormasPagos listadosformaspagosLocal=null;
			
			if(!this.getEsControlTabla()) {
				listadosformaspagosLocal=this.listadosformaspagos;
			} else {
				listadosformaspagosLocal=this.listadosformaspagosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosformaspagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosformaspagos);
				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
							
				
				


				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosFormasPagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosFormasPagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosFormasPagosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosAnterior =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosformaspagosAnterior =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
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
			
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
			
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
			
			


			
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosFormasPagosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosformaspagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosformaspagos);
				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
								
						
				


				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosFormasPagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosFormasPagos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosformaspagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosformaspagos);
				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
								
				
				


				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosFormasPagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosFormasPagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosFormasPagosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosAnterior =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosformaspagosAnterior =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosformaspagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosformaspagos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosFormasPagosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosAnterior =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosformaspagosAnterior =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosFormasPagosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosformaspagos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadosformaspagos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosformaspagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosformaspagos);
				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
							
				
				


				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosFormasPagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosFormasPagos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosFormasPagosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagosAnterior =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.listadosformaspagosAnterior =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
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
			
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
			
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
			
			


			
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosFormasPagosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosformaspagos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadosformaspagos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosformaspagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosformaspagos);
				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
								
				
				


				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosFormasPagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosFormasPagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosFormasPagosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosAnterior =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosformaspagosAnterior =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosFormasPagosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosformaspagos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadosformaspagos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosFormasPagosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosformaspagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosformaspagos);
				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosListadosFormasPagos")) {
					jCheckBoxSeleccionarTodosListadosFormasPagosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosListadosFormasPagos")) {
					jCheckBoxSeleccionadosListadosFormasPagosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarListadosFormasPagos")) {
					
				}
				
				


				
				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosFormasPagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosFormasPagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosformaspagos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.listadosformaspagos);
				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
												
				
				


				
				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosFormasPagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosFormasPagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosFormasPagosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosformaspagosAnterior =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.listadosformaspagosAnterior =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosFormasPagosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosformaspagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosformaspagos);
				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
				
				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
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
			
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
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
			
			


			
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosFormasPagosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosformaspagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosformaspagos);
				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosFormasPagos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosFormasPagos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosformaspagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosformaspagos);
				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
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
				
				


				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosFormasPagos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosFormasPagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosFormasPagosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosformaspagosAnterior =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosformaspagosAnterior =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarListadosFormasPagos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosListadosFormasPagosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosListadosFormasPagos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.listadosformaspagos =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.listadosformaspagos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarListadosFormasPagos")) {
				
				}
				
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarListadosFormasPagos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosListadosFormasPagos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarListadosFormasPagos")) {
			
			}
			
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessListadosFormasPagos();
			
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
			
			if(sTipo.equals("NuevoListadosFormasPagos")) {
				jButtonNuevoListadosFormasPagosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarListadosFormasPagos")) {
				jButtonDuplicarListadosFormasPagosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarListadosFormasPagos")) {
				jButtonCopiarListadosFormasPagosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormListadosFormasPagos")) {
				jButtonVerFormListadosFormasPagosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesListadosFormasPagos")) {
				jButtonNuevoListadosFormasPagosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarListadosFormasPagos")) {
				jButtonModificarListadosFormasPagosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarListadosFormasPagos")) {
				jButtonActualizarListadosFormasPagosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarListadosFormasPagos")) {
				jButtonEliminarListadosFormasPagosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaListadosFormasPagos")) {
				jButtonGuardarCambiosListadosFormasPagosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarListadosFormasPagos")) {
				jButtonCancelarListadosFormasPagosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarListadosFormasPagos")) {
				jButtonCerrarListadosFormasPagosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosListadosFormasPagos")) {
				jButtonGuardarCambiosListadosFormasPagosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosListadosFormasPagos")) {
				jButtonNuevoGuardarCambiosListadosFormasPagosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByListadosFormasPagos")) {
				jButtonAbrirOrderByListadosFormasPagosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionListadosFormasPagos")) {
				jButtonRecargarInformacionListadosFormasPagosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresListadosFormasPagos")) {
				jButtonAnterioresListadosFormasPagosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesListadosFormasPagos")) {
				jButtonSiguientesListadosFormasPagosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idListadosFormasPagosBusqueda")) {
				this.jButtonidListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_grupo_forma_pagoListadosFormasPagosUpdate")) {
				this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_grupo_forma_pagoListadosFormasPagosBusqueda")) {
				this.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaListadosFormasPagosUpdate")) {
				this.jButtonid_empresaListadosFormasPagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaListadosFormasPagosBusqueda")) {
				this.jButtonid_empresaListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalListadosFormasPagosUpdate")) {
				this.jButtonid_sucursalListadosFormasPagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalListadosFormasPagosBusqueda")) {
				this.jButtonid_sucursalListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeListadosFormasPagosBusqueda")) {
				this.jButtonfecha_desdeListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaListadosFormasPagosBusqueda")) {
				this.jButtonfecha_hastaListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoListadosFormasPagosBusqueda")) {
				this.jButtoncodigoListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoListadosFormasPagosBusqueda")) {
				this.jButtonnombre_completoListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda")) {
				this.jButtoncodigo_tipo_cuenta_banco_globalListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuentaListadosFormasPagosBusqueda")) {
				this.jButtonnumero_cuentaListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_estado_anti_clienteListadosFormasPagosBusqueda")) {
				this.jButtoncodigo_estado_anti_clienteListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaListadosFormasPagosBusqueda")) {
				this.jButtonfechaListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorListadosFormasPagosBusqueda")) {
				this.jButtonvalorListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_adicionalListadosFormasPagosBusqueda")) {
				this.jButtonvalor_adicionalListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda")) {
				this.jButtonnombre_tipo_grupo_forma_pagoListadosFormasPagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalListadosFormasPagosBusqueda")) {
				this.jButtontotalListadosFormasPagosBusquedaActionPerformed(evt);
			}
			
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessListadosFormasPagos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameListadosFormasPagos")) {
				closingInternalFrameListadosFormasPagos();
				
			} else if(sTipo.equals("jButtonCancelarListadosFormasPagos")) {
				JInternalFrameBase jInternalFrameDetalleFormListadosFormasPagos = (JInternalFrameBase)evt.getSource();
	            	
	            ListadosFormasPagosBeanSwingJInternalFrame jInternalFrameParent=(ListadosFormasPagosBeanSwingJInternalFrame)jInternalFrameDetalleFormListadosFormasPagos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarListadosFormasPagosActionPerformed(null);
			}
			
			ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.listadosformaspagos,new Object(),this.listadosformaspagosParameterGeneral,this.listadosformaspagosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormListadosFormasPagos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormListadosFormasPagos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormListadosFormasPagos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.listadosformaspagos)) {
			if(!esControlTabla) {
				if(ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);			
				}
				
				if(this.listadosformaspagosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualListadosFormasPagos(this.listadosformaspagos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanListadosFormasPagos(this.listadosformaspagosReturnGeneral,this.listadosformaspagosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.listadosformaspagosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanListadosFormasPagos(classes,this.listadosformaspagosReturnGeneral,this.listadosformaspagosBean,false);
					}
						
					if(this.listadosformaspagosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyListadosFormasPagos(this.listadosformaspagosReturnGeneral.getListadosFormasPagos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioListadosFormasPagos(this.listadosformaspagosReturnGeneral.getListadosFormasPagos());	
					}
						
					if(this.listadosformaspagosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioListadosFormasPagos(this.listadosformaspagosReturnGeneral.getListadosFormasPagos(),classes);//this.listadosformaspagosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioListadosFormasPagos(this.listadosformaspagos,classes);//this.listadosformaspagosBean);									
				}
			
				if(ListadosFormasPagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualListadosFormasPagos(this.listadosformaspagos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosFormasPagos(this.listadosformaspagos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.listadosformaspagosAnterior!=null) {
						this.listadosformaspagos=this.listadosformaspagosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.listadosformaspagosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.listadosformaspagosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.listadosformaspagosReturnGeneral.getListadosFormasPagos(),listadosformaspagosLogic.getListadosFormasPagoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.listadosformaspagosReturnGeneral.getListadosFormasPagos(),this.listadosformaspagoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosListadosFormasPagos.repaint();
				
				//((AbstractTableModel) this.jTableDatosListadosFormasPagos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosListadosFormasPagos();
			}
		}
	}
	
	public void actualizarVisualTableDatosListadosFormasPagos() throws Exception {
		
		ListadosFormasPagosModel listadosformaspagosModel=(ListadosFormasPagosModel)this.jTableDatosListadosFormasPagos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadosformaspagosModel.listadosformaspagoss=this.listadosformaspagosLogic.getListadosFormasPagoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			listadosformaspagosModel.listadosformaspagoss=this.listadosformaspagoss;
		}
		
		
		((ListadosFormasPagosModel) this.jTableDatosListadosFormasPagos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaListadosFormasPagos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getlistadosformaspagosAnterior(),this.listadosformaspagosLogic.getListadosFormasPagoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getlistadosformaspagosAnterior(),this.listadosformaspagoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosListadosFormasPagos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioListadosFormasPagos(ListadosFormasPagos listadosformaspagos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
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
										
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.listadosformaspagos,new Object(),generalEntityParameterGeneral,this.listadosformaspagosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.listadosformaspagosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ListadosFormasPagosConstantesFunciones.getClassesRelationshipsOfListadosFormasPagos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ListadosFormasPagosConstantesFunciones.getClassesRelationshipsFromStringsOfListadosFormasPagos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormListadosFormasPagos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ListadosFormasPagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.listadosformaspagos,new Object(),generalEntityParameterGeneral,this.listadosformaspagosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioListadosFormasPagos(ListadosFormasPagosBean listadosformaspagosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanListadosFormasPagos(ArrayList<Classe> classes,ListadosFormasPagosReturnGeneral listadosformaspagosReturnGeneral,ListadosFormasPagosBean listadosformaspagosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualListadosFormasPagos(ListadosFormasPagos listadosformaspagos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.listadosformaspagos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormListadosFormasPagos = new ListadosFormasPagosDetalleFormJInternalFrame(jDesktopPane,this.listadosformaspagosSessionBean.getConGuardarRelaciones(),this.listadosformaspagosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.setVisible(false);
		this.jInternalFrameDetalleFormListadosFormasPagos.setSelected(false);						
		
		this.jInternalFrameDetalleFormListadosFormasPagos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormListadosFormasPagos.listadosformaspagosLogic=this.listadosformaspagosLogic;
		
		this.cargarCombosFrameForeignKeyListadosFormasPagos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleListadosFormasPagos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleListadosFormasPagos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyListadosFormasPagos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyListadosFormasPagos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormListadosFormasPagos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarListadosFormasPagos"));
		
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonModificarListadosFormasPagos.addActionListener(new ButtonActionListener(this,"ModificarListadosFormasPagos"));

		
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonModificarToolBarListadosFormasPagos.addActionListener(new ButtonActionListener(this,"ModificarToolBarListadosFormasPagos"));
					
		this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemModificarListadosFormasPagos.addActionListener(new ButtonActionListener(this,"MenuItemModificarListadosFormasPagos"));		
		
		
		
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonActualizarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"ActualizarListadosFormasPagos"));
		
		
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonActualizarToolBarListadosFormasPagos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarListadosFormasPagos"));
						
		this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemActualizarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarListadosFormasPagos"));		
		
		
		
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonEliminarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"EliminarListadosFormasPagos"));
		
		
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonEliminarToolBarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"EliminarToolBarListadosFormasPagos"));
								
		this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemEliminarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarListadosFormasPagos"));		
		
		
		
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonCancelarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"CancelarListadosFormasPagos"));
		
		
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonCancelarToolBarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"CancelarToolBarListadosFormasPagos"));
					
		this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemCancelarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarListadosFormasPagos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemDetalleCerrarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarListadosFormasPagos"));		
		
		
		
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonGuardarCambiosToolBarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadosFormasPagos"));
		
		
		
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonGuardarCambiosToolBarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadosFormasPagos"));
		
		
		
		this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxTiposAccionesFormularioListadosFormasPagos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioListadosFormasPagos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonidListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"idListadosFormasPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_forma_pagoListadosFormasPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_forma_pagoListadosFormasPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_empresaListadosFormasPagosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadosFormasPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_empresaListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadosFormasPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_sucursalListadosFormasPagosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalListadosFormasPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_sucursalListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonfecha_desdeListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonfecha_hastaListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtoncodigoListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonnombre_completoListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtoncodigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonnumero_cuentaListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtoncodigo_estado_anti_clienteListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_estado_anti_clienteListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonfechaListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"fechaListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonvalorListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"valorListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonvalor_adicionalListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"valor_adicionalListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonnombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtontotalListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"totalListadosFormasPagosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormListadosFormasPagos.jTabbedPaneRelacionesListadosFormasPagos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesListadosFormasPagos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameListadosFormasPagos"));
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosFormasPagos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarListadosFormasPagos"));
		}
		
		this.jTableDatosListadosFormasPagos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarListadosFormasPagos"));
		
		this.jTableDatosListadosFormasPagos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarListadosFormasPagos"));
		
		this.jButtonNuevoListadosFormasPagos.addActionListener(new ButtonActionListener(this,"NuevoListadosFormasPagos"));
		
		this.jButtonDuplicarListadosFormasPagos.addActionListener(new ButtonActionListener(this,"DuplicarListadosFormasPagos"));
		
		this.jButtonCopiarListadosFormasPagos.addActionListener(new ButtonActionListener(this,"CopiarListadosFormasPagos"));
		
		this.jButtonVerFormListadosFormasPagos.addActionListener(new ButtonActionListener(this,"VerFormListadosFormasPagos"));
		
		
		this.jButtonNuevoToolBarListadosFormasPagos.addActionListener(new ButtonActionListener(this,"NuevoToolBarListadosFormasPagos"));
			
		this.jButtonDuplicarToolBarListadosFormasPagos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarListadosFormasPagos"));
			
		this.jMenuItemNuevoListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoListadosFormasPagos"));
			
		this.jMenuItemDuplicarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarListadosFormasPagos"));		
		
		
		this.jButtonNuevoRelacionesListadosFormasPagos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesListadosFormasPagos"));
		
		
		this.jButtonNuevoRelacionesToolBarListadosFormasPagos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarListadosFormasPagos"));
			
		this.jMenuItemNuevoRelacionesListadosFormasPagos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesListadosFormasPagos"));		
		
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonModificarListadosFormasPagos.addActionListener(new ButtonActionListener(this,"ModificarListadosFormasPagos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonModificarToolBarListadosFormasPagos.addActionListener(new ButtonActionListener(this,"ModificarToolBarListadosFormasPagos"));
			
			this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemModificarListadosFormasPagos.addActionListener(new ButtonActionListener(this,"MenuItemModificarListadosFormasPagos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonActualizarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"ActualizarListadosFormasPagos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonActualizarToolBarListadosFormasPagos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarListadosFormasPagos"));
				
			this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemActualizarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarListadosFormasPagos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonEliminarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"EliminarListadosFormasPagos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonEliminarToolBarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"EliminarToolBarListadosFormasPagos"));
						
			this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemEliminarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarListadosFormasPagos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonCancelarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"CancelarListadosFormasPagos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonCancelarToolBarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"CancelarToolBarListadosFormasPagos"));
			
			this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemCancelarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarListadosFormasPagos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarListadosFormasPagos"));		
		
		
		this.jButtonCerrarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"CerrarListadosFormasPagos"));
		
		
		this.jButtonCerrarToolBarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"CerrarToolBarListadosFormasPagos"));
			
		this.jMenuItemCerrarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarListadosFormasPagos"));
			
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosFormasPagos.jMenuItemDetalleCerrarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarListadosFormasPagos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonGuardarCambiosListadosFormasPagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosListadosFormasPagos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosFormasPagos.jButtonGuardarCambiosToolBarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadosFormasPagos"));
		}
		
		this.jButtonCopiarToolBarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"CopiarToolBarListadosFormasPagos"));
			
		this.jButtonVerFormToolBarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"VerFormToolBarListadosFormasPagos"));
		
		this.jMenuItemGuardarCambiosListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosListadosFormasPagos"));
			
		this.jMenuItemCopiarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarListadosFormasPagos"));		
		
		this.jMenuItemVerFormListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormListadosFormasPagos"));		
		
		
		this.jButtonGuardarCambiosTablaListadosFormasPagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaListadosFormasPagos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarListadosFormasPagos"));
			
		this.jMenuItemGuardarCambiosTablaListadosFormasPagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaListadosFormasPagos"));		
		
		
		
		this.jButtonRecargarInformacionListadosFormasPagos.addActionListener (new ButtonActionListener(this,"RecargarInformacionListadosFormasPagos"));
					
		this.jButtonRecargarInformacionToolBarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarListadosFormasPagos"));
		
		this.jMenuItemRecargarInformacionListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionListadosFormasPagos"));		
		
		
		
		this.jButtonAnterioresListadosFormasPagos.addActionListener (new ButtonActionListener(this,"AnterioresListadosFormasPagos"));
		
		
		this.jButtonAnterioresToolBarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarListadosFormasPagos"));
		
		this.jMenuItemAnterioresListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresListadosFormasPagos"));		
		
		
		this.jButtonSiguientesListadosFormasPagos.addActionListener (new ButtonActionListener(this,"SiguientesListadosFormasPagos"));
		
		
		this.jButtonSiguientesToolBarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarListadosFormasPagos"));
			
		this.jMenuItemSiguientesListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesListadosFormasPagos"));
			
		this.jMenuItemAbrirOrderByListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByListadosFormasPagos"));
			
		this.jMenuItemMostrarOcultarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarListadosFormasPagos"));
			
		this.jMenuItemDetalleAbrirOrderByListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByListadosFormasPagos"));
			
		this.jMenuItemDetalleMostarOcultarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarListadosFormasPagos"));		
		
		
		this.jButtonNuevoGuardarCambiosListadosFormasPagos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosListadosFormasPagos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarListadosFormasPagos"));
			
		this.jMenuItemNuevoGuardarCambiosListadosFormasPagos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosListadosFormasPagos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosListadosFormasPagos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosListadosFormasPagos"));

		this.jCheckBoxSeleccionadosListadosFormasPagos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosListadosFormasPagos"));
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxTiposAccionesFormularioListadosFormasPagos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioListadosFormasPagos"));
		}
		
		
		this.jComboBoxTiposRelacionesListadosFormasPagos.addActionListener (new ButtonActionListener(this,"TiposRelacionesListadosFormasPagos"));
			
		this.jComboBoxTiposAccionesListadosFormasPagos.addActionListener (new ButtonActionListener(this,"TiposAccionesListadosFormasPagos"));
					
		this.jComboBoxTiposSeleccionarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarListadosFormasPagos"));
			
		this.jTextFieldValorCampoGeneralListadosFormasPagos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralListadosFormasPagos"));		
		
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonidListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"idListadosFormasPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_forma_pagoListadosFormasPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_forma_pagoListadosFormasPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_empresaListadosFormasPagosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadosFormasPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_empresaListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadosFormasPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_sucursalListadosFormasPagosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalListadosFormasPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_sucursalListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonfecha_desdeListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonfecha_hastaListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtoncodigoListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonnombre_completoListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtoncodigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonnumero_cuentaListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtoncodigo_estado_anti_clienteListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_estado_anti_clienteListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonfechaListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"fechaListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonvalorListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"valorListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonvalor_adicionalListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"valor_adicionalListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonnombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtontotalListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"totalListadosFormasPagosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaListadosFormasPagosListadosFormasPagos.addActionListener(new ButtonActionListener(this,"BusquedaListadosFormasPagosListadosFormasPagos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoListadosFormasPagos!=null) {
				this.jInternalFrameReporteDinamicoListadosFormasPagos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadosFormasPagos"));
				this.jInternalFrameReporteDinamicoListadosFormasPagos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadosFormasPagos"));
				this.jInternalFrameReporteDinamicoListadosFormasPagos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadosFormasPagos"));
			}
			
			//this.jButtonCerrarReporteDinamicoListadosFormasPagos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadosFormasPagos"));				
			//this.jButtonGenerarReporteDinamicoListadosFormasPagos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadosFormasPagos"));
			//this.jButtonGenerarExcelReporteDinamicoListadosFormasPagos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadosFormasPagos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionListadosFormasPagos!=null) {
				this.jInternalFrameImportacionListadosFormasPagos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionListadosFormasPagos"));
				this.jInternalFrameImportacionListadosFormasPagos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionListadosFormasPagos"));
				this.jInternalFrameImportacionListadosFormasPagos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionListadosFormasPagos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByListadosFormasPagos.addActionListener (new ButtonActionListener(this,"AbrirOrderByListadosFormasPagos"));
			
			this.jButtonAbrirOrderByToolBarListadosFormasPagos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarListadosFormasPagos"));			
			
			if(this.jInternalFrameOrderByListadosFormasPagos!=null) {
				this.jInternalFrameOrderByListadosFormasPagos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByListadosFormasPagos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosFormasPagos.jTabbedPaneRelacionesListadosFormasPagos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesListadosFormasPagos"));
		
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
            		closingInternalFrameListadosFormasPagos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormListadosFormasPagos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormListadosFormasPagos = (JInternalFrameBase)event.getSource();
	            	
	            ListadosFormasPagosBeanSwingJInternalFrame jInternalFrameParent=(ListadosFormasPagosBeanSwingJInternalFrame)jInternalFrameDetalleFormListadosFormasPagos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarListadosFormasPagosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosListadosFormasPagos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosListadosFormasPagosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosListadosFormasPagos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosListadosFormasPagos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosFormasPagosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosFormasPagosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosFormasPagosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoListadosFormasPagos";
		inputMap = this.jButtonNuevoListadosFormasPagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoListadosFormasPagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoListadosFormasPagosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosFormasPagosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosFormasPagosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosFormasPagosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesListadosFormasPagos";
		inputMap = this.jButtonNuevoRelacionesListadosFormasPagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesListadosFormasPagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoListadosFormasPagosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarListadosFormasPagos";
		inputMap = this.jButtonModificarListadosFormasPagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarListadosFormasPagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarListadosFormasPagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarListadosFormasPagos";
		inputMap = this.jButtonActualizarListadosFormasPagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarListadosFormasPagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarListadosFormasPagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarListadosFormasPagos";
		inputMap = this.jButtonEliminarListadosFormasPagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarListadosFormasPagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarListadosFormasPagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarListadosFormasPagos";
		inputMap = this.jButtonCancelarListadosFormasPagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarListadosFormasPagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarListadosFormasPagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarListadosFormasPagos";
		inputMap = this.jButtonCerrarListadosFormasPagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarListadosFormasPagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarListadosFormasPagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonGuardarCambiosListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosListadosFormasPagos";
		inputMap = this.jInternalFrameDetalleFormListadosFormasPagos.jButtonGuardarCambiosListadosFormasPagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonGuardarCambiosListadosFormasPagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosListadosFormasPagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosListadosFormasPagos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosListadosFormasPagosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesListadosFormasPagos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesListadosFormasPagosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarListadosFormasPagos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarListadosFormasPagosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralListadosFormasPagos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralListadosFormasPagosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonidListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"idListadosFormasPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_forma_pagoListadosFormasPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_forma_pagoListadosFormasPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_empresaListadosFormasPagosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadosFormasPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_empresaListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadosFormasPagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_sucursalListadosFormasPagosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalListadosFormasPagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonid_sucursalListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonfecha_desdeListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonfecha_hastaListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtoncodigoListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonnombre_completoListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtoncodigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_cuenta_banco_globalListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonnumero_cuentaListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtoncodigo_estado_anti_clienteListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_estado_anti_clienteListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonfechaListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"fechaListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonvalorListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"valorListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonvalor_adicionalListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"valor_adicionalListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtonnombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_grupo_forma_pagoListadosFormasPagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosFormasPagos.jButtontotalListadosFormasPagosBusqueda.addActionListener(new ButtonActionListener(this,"totalListadosFormasPagosBusqueda"));
		
		
		this.jButtonBusquedaListadosFormasPagosListadosFormasPagos.addActionListener(new ButtonActionListener(this,"BusquedaListadosFormasPagosListadosFormasPagos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionListadosFormasPagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionListadosFormasPagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarListadosFormasPagosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarListadosFormasPagos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosListadosFormasPagos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ListadosFormasPagos listadosformaspagosAux:this.listadosformaspagosLogic.getListadosFormasPagoss()) {
					listadosformaspagosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosFormasPagos listadosformaspagosAux:listadosformaspagoss) {
					listadosformaspagosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosListadosFormasPagosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingListadosFormasPagos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ListadosFormasPagos listadosformaspagosAux:this.listadosformaspagosLogic.getListadosFormasPagoss()) {
						listadosformaspagosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadosFormasPagos listadosformaspagosAux:listadosformaspagoss) {
						listadosformaspagosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ListadosFormasPagos listadosformaspagosAux:this.listadosformaspagosLogic.getListadosFormasPagoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadosFormasPagos listadosformaspagosAux:listadosformaspagoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaListadosFormasPagos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosListadosFormasPagos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosListadosFormasPagos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosListadosFormasPagos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosListadosFormasPagosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingListadosFormasPagos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosListadosFormasPagos.getSelectedRows();
			
			ListadosFormasPagos listadosformaspagosLocal=new ListadosFormasPagos();
			
			//this.seleccionarTodosListadosFormasPagos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					listadosformaspagosLocal =(ListadosFormasPagos) this.listadosformaspagosLogic.getListadosFormasPagoss().toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					listadosformaspagosLocal =(ListadosFormasPagos) this.listadosformaspagoss.toArray()[this.jTableDatosListadosFormasPagos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				listadosformaspagosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ListadosFormasPagos listadosformaspagosAux:this.listadosformaspagosLogic.getListadosFormasPagoss()) {
						listadosformaspagosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadosFormasPagos listadosformaspagosAux:listadosformaspagoss) {
						listadosformaspagosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaListadosFormasPagos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosListadosFormasPagos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosListadosFormasPagos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosListadosFormasPagos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualListadosFormasPagosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarListadosFormasPagosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralListadosFormasPagosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingListadosFormasPagos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralListadosFormasPagos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ListadosFormasPagos listadosformaspagosAux:this.listadosformaspagosLogic.getListadosFormasPagoss()) {
				
						if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							listadosformaspagosAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							listadosformaspagosAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							listadosformaspagosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							listadosformaspagosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL)) {
							existe=true;
							listadosformaspagosAux.setcodigo_tipo_cuenta_banco_global(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA)) {
							existe=true;
							listadosformaspagosAux.setnumero_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE)) {
							existe=true;
							listadosformaspagosAux.setcodigo_estado_anti_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							listadosformaspagosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							listadosformaspagosAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_VALORADICIONAL)) {
							existe=true;
							listadosformaspagosAux.setvalor_adicional(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO)) {
							existe=true;
							listadosformaspagosAux.setnombre_tipo_grupo_forma_pago(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							listadosformaspagosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosFormasPagos listadosformaspagosAux:listadosformaspagoss) {
					
						if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							listadosformaspagosAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							listadosformaspagosAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							listadosformaspagosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							listadosformaspagosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL)) {
							existe=true;
							listadosformaspagosAux.setcodigo_tipo_cuenta_banco_global(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA)) {
							existe=true;
							listadosformaspagosAux.setnumero_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE)) {
							existe=true;
							listadosformaspagosAux.setcodigo_estado_anti_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							listadosformaspagosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							listadosformaspagosAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_VALORADICIONAL)) {
							existe=true;
							listadosformaspagosAux.setvalor_adicional(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO)) {
							existe=true;
							listadosformaspagosAux.setnombre_tipo_grupo_forma_pago(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							listadosformaspagosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaListadosFormasPagos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesListadosFormasPagosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingListadosFormasPagos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioListadosFormasPagos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesListadosFormasPagos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxTiposAccionesFormularioListadosFormasPagos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteListadosFormasPagos) {				
					conSplash=true;//false;										
					
					//this.startProcessListadosFormasPagos(conSplash);
				
					this.generarReporteListadosFormasPagossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosFormasPagos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxTiposAccionesFormularioListadosFormasPagos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoListadosFormasPagossSeleccionados();
				//this.jComboBoxTiposAccionesListadosFormasPagos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoListadosFormasPagossSeleccionados(false);
				//this.jComboBoxTiposAccionesListadosFormasPagos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoListadosFormasPagossSeleccionados(true);
				//this.jComboBoxTiposAccionesListadosFormasPagos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessListadosFormasPagos();
				
				this.exportarListadosFormasPagossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosFormasPagos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxTiposAccionesFormularioListadosFormasPagos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionListadosFormasPagoss();
				//this.importarListadosFormasPagoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosFormasPagos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxTiposAccionesFormularioListadosFormasPagos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessListadosFormasPagos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelListadosFormasPagossSeleccionados();
				//this.jComboBoxTiposAccionesListadosFormasPagos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Listados Formas Pagos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessListadosFormasPagos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoListadosFormasPagos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyListadosFormasPagos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Listados Formas Pagos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosFormasPagos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxTiposAccionesFormularioListadosFormasPagos.setSelectedIndex(0);					
				}	
			} 			
			else if(ListadosFormasPagosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteListadosFormasPagos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessListadosFormasPagos(conSplash);
					
						//this.actualizarParametrosGeneralListadosFormasPagos();
						
						this.generarReporteProcesoAccionListadosFormasPagossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesListadosFormasPagos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxTiposAccionesFormularioListadosFormasPagos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ListadosFormasPagosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Listados Formas PagosES SELECCIONADOS?", "MANTENIMIENTO DE Listados Formas Pagos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessListadosFormasPagos();
				
						this.actualizarParametrosGeneralListadosFormasPagos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.listadosformaspagosReturnGeneral=listadosformaspagosLogic.procesarAccionListadosFormasPagossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.listadosformaspagosLogic.getListadosFormasPagoss(),this.listadosformaspagosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarListadosFormasPagosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesListadosFormasPagos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxTiposAccionesFormularioListadosFormasPagos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralListadosFormasPagos();
					
					ListadosFormasPagosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarListadosFormasPagosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesListadosFormasPagos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxTiposAccionesFormularioListadosFormasPagos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessListadosFormasPagos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesListadosFormasPagosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessListadosFormasPagos();
			
			if(this.jInternalFrameDetalleFormListadosFormasPagos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ListadosFormasPagos> listadosformaspagossSeleccionados=new ArrayList<ListadosFormasPagos>();		
			ListadosFormasPagos listadosformaspagos=new ListadosFormasPagos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingListadosFormasPagos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesListadosFormasPagos.getSelectedItem();
			
			
			
			
			listadosformaspagossSeleccionados=this.getListadosFormasPagossSeleccionados(true);
			//this.sTipoAccion;
			
			if(listadosformaspagossSeleccionados.size()==1) {
				for(ListadosFormasPagos listadosformaspagosAux:listadosformaspagossSeleccionados) {
					listadosformaspagos=listadosformaspagosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessListadosFormasPagos();
			
      		//this.finishProcessListadosFormasPagos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarListadosFormasPagosReturnGeneral() throws Exception {
		if(this.listadosformaspagosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.listadosformaspagosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.listadosformaspagosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.listadosformaspagosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.listadosformaspagosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.listadosformaspagosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingListadosFormasPagos(false);
		}
		
		if(this.listadosformaspagosReturnGeneral.getConRetornoLista() || this.listadosformaspagosReturnGeneral.getConRetornoObjeto()) {
			if(this.listadosformaspagosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.listadosformaspagosLogic.setListadosFormasPagoss(this.listadosformaspagosReturnGeneral.getListadosFormasPagoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingListadosFormasPagos(false);
		}
	}
	
	public void actualizarParametrosGeneralListadosFormasPagos() throws Exception {
		
		
	}
	
	public ArrayList<ListadosFormasPagos> getListadosFormasPagossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ListadosFormasPagos> listadosformaspagossSeleccionados=new ArrayList<ListadosFormasPagos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioListadosFormasPagos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ListadosFormasPagos listadosformaspagosAux:listadosformaspagosLogic.getListadosFormasPagoss()) {
					if(listadosformaspagosAux.getIsSelected()) {
						listadosformaspagossSeleccionados.add(listadosformaspagosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosFormasPagos listadosformaspagosAux:this.listadosformaspagoss) {
					if(listadosformaspagosAux.getIsSelected()) {
						listadosformaspagossSeleccionados.add(listadosformaspagosAux);				
					}
				}
			}
			
			if(listadosformaspagossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						listadosformaspagossSeleccionados.addAll(this.listadosformaspagosLogic.getListadosFormasPagoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						listadosformaspagossSeleccionados.addAll(this.listadosformaspagoss);				
					}
				}
			}
		} else {
			listadosformaspagossSeleccionados.add(this.listadosformaspagos);
		}
		
		return listadosformaspagossSeleccionados;
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
	
	public void generarReporteListadosFormasPagossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalListadosFormasPagossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoListadosFormasPagossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoListadosFormasPagossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoListadosFormasPagossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Listados Formas Pagos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesListadosFormasPagossSeleccionados() throws Exception {
		ArrayList<ListadosFormasPagos> listadosformaspagossSeleccionados=new ArrayList<ListadosFormasPagos>();		
		
		listadosformaspagossSeleccionados=this.getListadosFormasPagossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteListadosFormasPagoss("Todos",listadosformaspagossSeleccionados);
		
	}	
	
	public void generarReporteNormalListadosFormasPagossSeleccionados() throws Exception {
		ArrayList<ListadosFormasPagos> listadosformaspagossSeleccionados=new ArrayList<ListadosFormasPagos>();		
		
		listadosformaspagossSeleccionados=this.getListadosFormasPagossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteListadosFormasPagoss("Todos",listadosformaspagossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionListadosFormasPagossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ListadosFormasPagos> listadosformaspagossSeleccionados=new ArrayList<ListadosFormasPagos>();
		
		listadosformaspagossSeleccionados=this.getListadosFormasPagossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteListadosFormasPagoss("Todos",listadosformaspagossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoListadosFormasPagossSeleccionados() throws Exception {
		ArrayList<ListadosFormasPagos> listadosformaspagossSeleccionados=new ArrayList<ListadosFormasPagos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoListadosFormasPagos();
		
		
		listadosformaspagossSeleccionados=this.getListadosFormasPagossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoListadosFormasPagos();
		
		
		//this.generarReporteListadosFormasPagoss("Todos",listadosformaspagossSeleccionados ,listadosformaspagosImplementable,listadosformaspagosImplementableHome);
	}
	
	public void mostrarImportacionListadosFormasPagoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionListadosFormasPagos();
		
		this.abrirFrameImportacionListadosFormasPagos();		
		
			
		//this.generarReporteListadosFormasPagoss("Todos",listadosformaspagossSeleccionados ,listadosformaspagosImplementable,listadosformaspagosImplementableHome);
	}
	
	public void importarListadosFormasPagoss() throws Exception {		
	
	}
	
	public void exportarListadosFormasPagossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelListadosFormasPagossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoListadosFormasPagossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlListadosFormasPagossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Listados Formas Pagos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoListadosFormasPagossSeleccionados() throws Exception {
		ArrayList<ListadosFormasPagos> listadosformaspagossSeleccionados=new ArrayList<ListadosFormasPagos>();		
		
		listadosformaspagossSeleccionados=this.getListadosFormasPagossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosformaspagos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarListadosFormasPagos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ListadosFormasPagos listadosformaspagosAux:listadosformaspagossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarListadosFormasPagos(listadosformaspagosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//listadosformaspagosAux.setsDetalleGeneralEntityReporte(listadosformaspagosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Formas Pagos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarListadosFormasPagos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ListadosFormasPagosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosFormasPagosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosFormasPagosConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosFormasPagosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosFormasPagosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosFormasPagosConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosFormasPagosConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosFormasPagosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosFormasPagosConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosFormasPagosConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosFormasPagosConstantesFunciones.LABEL_VALORADICIONAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosFormasPagosConstantesFunciones.LABEL_TOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarListadosFormasPagos(ListadosFormasPagos listadosformaspagos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=listadosformaspagos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosformaspagos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosformaspagos.gettipogrupoformapago_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosformaspagos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosformaspagos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosformaspagos.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosformaspagos.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosformaspagos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosformaspagos.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosformaspagos.getcodigo_tipo_cuenta_banco_global();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosformaspagos.getnumero_cuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosformaspagos.getcodigo_estado_anti_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosformaspagos.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosformaspagos.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosformaspagos.getvalor_adicional().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosformaspagos.getnombre_tipo_grupo_forma_pago();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosformaspagos.gettotal().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelListadosFormasPagossSeleccionados() throws Exception {
		ArrayList<ListadosFormasPagos> listadosformaspagossSeleccionados=new ArrayList<ListadosFormasPagos>();		
		
		listadosformaspagossSeleccionados=this.getListadosFormasPagossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosformaspagos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ListadosFormasPagoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelListadosFormasPagos(row);				
				iRow++;
			}				
			
			for(ListadosFormasPagos listadosformaspagosAux:listadosformaspagossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelListadosFormasPagos(listadosformaspagosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Formas Pagos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlListadosFormasPagossSeleccionados() throws Exception {
		ArrayList<ListadosFormasPagos> listadosformaspagossSeleccionados=new ArrayList<ListadosFormasPagos>();		
		
		listadosformaspagossSeleccionados=this.getListadosFormasPagossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosformaspagos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("listadosformaspagoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("listadosformaspagos");
			//elementRoot.appendChild(element);
		
			for(ListadosFormasPagos listadosformaspagosAux:listadosformaspagossSeleccionados) {
				element = document.createElement("listadosformaspagos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlListadosFormasPagos(listadosformaspagosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Formas Pagos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelListadosFormasPagos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_VALORADICIONAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosFormasPagosConstantesFunciones.LABEL_TOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelListadosFormasPagos(ListadosFormasPagos listadosformaspagos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(listadosformaspagos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosformaspagos.gettipogrupoformapago_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosformaspagos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosformaspagos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosformaspagos.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosformaspagos.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosformaspagos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosformaspagos.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosformaspagos.getcodigo_tipo_cuenta_banco_global());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosformaspagos.getnumero_cuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosformaspagos.getcodigo_estado_anti_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosformaspagos.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosformaspagos.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosformaspagos.getvalor_adicional());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosformaspagos.getnombre_tipo_grupo_forma_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosformaspagos.gettotal());				
	}
	
	public void setFilaDatosExportarXmlListadosFormasPagos(ListadosFormasPagos listadosformaspagos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ListadosFormasPagosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(listadosformaspagos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ListadosFormasPagosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(listadosformaspagos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementtipogrupoformapago_descripcion = document.createElement(ListadosFormasPagosConstantesFunciones.IDTIPOGRUPOFORMAPAGO);
		elementtipogrupoformapago_descripcion.appendChild(document.createTextNode(listadosformaspagos.gettipogrupoformapago_descripcion()));
		element.appendChild(elementtipogrupoformapago_descripcion);

		Element elementempresa_descripcion = document.createElement(ListadosFormasPagosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(listadosformaspagos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ListadosFormasPagosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(listadosformaspagos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementfecha_desde = document.createElement(ListadosFormasPagosConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(listadosformaspagos.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(ListadosFormasPagosConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(listadosformaspagos.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementcodigo = document.createElement(ListadosFormasPagosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(listadosformaspagos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_completo = document.createElement(ListadosFormasPagosConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(listadosformaspagos.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementcodigo_tipo_cuenta_banco_global = document.createElement(ListadosFormasPagosConstantesFunciones.CODIGOTIPOCUENTABANCOGLOBAL);
		elementcodigo_tipo_cuenta_banco_global.appendChild(document.createTextNode(listadosformaspagos.getcodigo_tipo_cuenta_banco_global().trim()));
		element.appendChild(elementcodigo_tipo_cuenta_banco_global);

		Element elementnumero_cuenta = document.createElement(ListadosFormasPagosConstantesFunciones.NUMEROCUENTA);
		elementnumero_cuenta.appendChild(document.createTextNode(listadosformaspagos.getnumero_cuenta().trim()));
		element.appendChild(elementnumero_cuenta);

		Element elementcodigo_estado_anti_cliente = document.createElement(ListadosFormasPagosConstantesFunciones.CODIGOESTADOANTICLIENTE);
		elementcodigo_estado_anti_cliente.appendChild(document.createTextNode(listadosformaspagos.getcodigo_estado_anti_cliente().trim()));
		element.appendChild(elementcodigo_estado_anti_cliente);

		Element elementfecha = document.createElement(ListadosFormasPagosConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(listadosformaspagos.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementvalor = document.createElement(ListadosFormasPagosConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(listadosformaspagos.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementvalor_adicional = document.createElement(ListadosFormasPagosConstantesFunciones.VALORADICIONAL);
		elementvalor_adicional.appendChild(document.createTextNode(listadosformaspagos.getvalor_adicional().toString().trim()));
		element.appendChild(elementvalor_adicional);

		Element elementnombre_tipo_grupo_forma_pago = document.createElement(ListadosFormasPagosConstantesFunciones.NOMBRETIPOGRUPOFORMAPAGO);
		elementnombre_tipo_grupo_forma_pago.appendChild(document.createTextNode(listadosformaspagos.getnombre_tipo_grupo_forma_pago().trim()));
		element.appendChild(elementnombre_tipo_grupo_forma_pago);

		Element elementtotal = document.createElement(ListadosFormasPagosConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(listadosformaspagos.gettotal().toString().trim()));
		element.appendChild(elementtotal);
	}
	
	public void generarReporteGroupGenericoListadosFormasPagossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ListadosFormasPagos> listadosformaspagossSeleccionados=new ArrayList<ListadosFormasPagos>();
		
		listadosformaspagossSeleccionados=this.getListadosFormasPagossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoListadosFormasPagos(listadosformaspagossSeleccionados);
		
		this.generarReporteListadosFormasPagoss("Todos",listadosformaspagossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoListadosFormasPagos(ArrayList<ListadosFormasPagos> listadosformaspagossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ListadosFormasPagos listadosformaspagosAux:listadosformaspagossSeleccionados) {
				listadosformaspagosAux.setsDetalleGeneralEntityReporte(listadosformaspagosAux.toString());
			
				if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO)) {
					existe=true;
					listadosformaspagosAux.setsDescripcionGeneralEntityReporte1(listadosformaspagosAux.gettipogrupoformapago_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					listadosformaspagosAux.setsDescripcionGeneralEntityReporte1(listadosformaspagosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					listadosformaspagosAux.setsDescripcionGeneralEntityReporte1(listadosformaspagosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					listadosformaspagosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(listadosformaspagosAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					listadosformaspagosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(listadosformaspagosAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					listadosformaspagosAux.setsDescripcionGeneralEntityReporte1(listadosformaspagosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					listadosformaspagosAux.setsDescripcionGeneralEntityReporte1(listadosformaspagosAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_CODIGOTIPOCUENTABANCOGLOBAL)) {
					existe=true;
					listadosformaspagosAux.setsDescripcionGeneralEntityReporte1(listadosformaspagosAux.getcodigo_tipo_cuenta_banco_global());
				}
				 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_NUMEROCUENTA)) {
					existe=true;
					listadosformaspagosAux.setsDescripcionGeneralEntityReporte1(listadosformaspagosAux.getnumero_cuenta());
				}
				 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_CODIGOESTADOANTICLIENTE)) {
					existe=true;
					listadosformaspagosAux.setsDescripcionGeneralEntityReporte1(listadosformaspagosAux.getcodigo_estado_anti_cliente());
				}
				 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					listadosformaspagosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(listadosformaspagosAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(ListadosFormasPagosConstantesFunciones.LABEL_NOMBRETIPOGRUPOFORMAPAGO)) {
					existe=true;
					listadosformaspagosAux.setsDescripcionGeneralEntityReporte1(listadosformaspagosAux.getnombre_tipo_grupo_forma_pago());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosFormasPagosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesListadosFormasPagos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoListadosFormasPagos=true;
				this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos=true;
				this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos=true;
			}
			
			this.isVisibilidadCeldaModificarListadosFormasPagos=false;
			this.isVisibilidadCeldaActualizarListadosFormasPagos=false;
			this.isVisibilidadCeldaEliminarListadosFormasPagos=false;
			this.isVisibilidadCeldaCancelarListadosFormasPagos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosFormasPagos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosFormasPagos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoListadosFormasPagos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos=false;
			this.isVisibilidadCeldaModificarListadosFormasPagos=false;
			this.isVisibilidadCeldaActualizarListadosFormasPagos=true;
			this.isVisibilidadCeldaEliminarListadosFormasPagos=false;
			this.isVisibilidadCeldaCancelarListadosFormasPagos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosFormasPagos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosFormasPagos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoListadosFormasPagos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos=false;
			this.isVisibilidadCeldaModificarListadosFormasPagos=false;
			this.isVisibilidadCeldaActualizarListadosFormasPagos=true;
			this.isVisibilidadCeldaEliminarListadosFormasPagos=true;
			this.isVisibilidadCeldaCancelarListadosFormasPagos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosFormasPagos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosFormasPagos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoListadosFormasPagos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos=false;
			this.isVisibilidadCeldaModificarListadosFormasPagos=false;
			this.isVisibilidadCeldaActualizarListadosFormasPagos=true;
			this.isVisibilidadCeldaEliminarListadosFormasPagos=false;
			this.isVisibilidadCeldaCancelarListadosFormasPagos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosFormasPagos=false;
				} else {
					this.isVisibilidadCeldaGuardarListadosFormasPagos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoListadosFormasPagos=true;
			this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos=true;
			this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos=true;
			this.isVisibilidadCeldaModificarListadosFormasPagos=false;
			this.isVisibilidadCeldaActualizarListadosFormasPagos=false;
			this.isVisibilidadCeldaEliminarListadosFormasPagos=false;
			this.isVisibilidadCeldaCancelarListadosFormasPagos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosFormasPagos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosFormasPagos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoListadosFormasPagos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos=false;
			this.isVisibilidadCeldaActualizarListadosFormasPagos=false;
			this.isVisibilidadCeldaEliminarListadosFormasPagos=false;
			this.isVisibilidadCeldaCancelarListadosFormasPagos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosFormasPagos=false;
				} else {
					this.isVisibilidadCeldaGuardarListadosFormasPagos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoListadosFormasPagos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos=false;
			this.isVisibilidadCeldaModificarListadosFormasPagos=true;
			this.isVisibilidadCeldaActualizarListadosFormasPagos=false;
			this.isVisibilidadCeldaEliminarListadosFormasPagos=false;
			this.isVisibilidadCeldaCancelarListadosFormasPagos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosFormasPagos=false;
				} else {
					this.isVisibilidadCeldaGuardarListadosFormasPagos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ListadosFormasPagosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoListadosFormasPagos=true;
			this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos=true;
			this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos=true;
		} else {
			this.actualizarEstadoPanelsListadosFormasPagos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarListadosFormasPagos=false;
			//this.isVisibilidadCeldaVerFormListadosFormasPagos=false;
			this.isVisibilidadCeldaDuplicarListadosFormasPagos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!listadosformaspagosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos=false;
		} else {
			this.isVisibilidadCeldaNuevoListadosFormasPagos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
			if(!listadosformaspagosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos=false;												
			}
			
			this.jButtonCerrarListadosFormasPagos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos=false;
		}
		
		if(!this.permiteMantenimiento(this.listadosformaspagos)) {
			this.isVisibilidadCeldaActualizarListadosFormasPagos=false;
			this.isVisibilidadCeldaEliminarListadosFormasPagos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoListadosFormasPagos=false;
		this.isVisibilidadCeldaNuevoRelacionesListadosFormasPagos=false;
		this.isVisibilidadCeldaGuardarCambiosListadosFormasPagos=false;
		//this.isVisibilidadCeldaModificarListadosFormasPagos=true;
		this.isVisibilidadCeldaActualizarListadosFormasPagos=false;
		this.isVisibilidadCeldaEliminarListadosFormasPagos=false;
		//this.isVisibilidadCeldaCancelarListadosFormasPagos=true;			
		this.isVisibilidadCeldaGuardarListadosFormasPagos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesListadosFormasPagos() {
	}
	
	public void actualizarEstadoPanelsListadosFormasPagos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionListadosFormasPagos!=null) {
				this.jScrollPanelDatosEdicionListadosFormasPagos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosFormasPagos!=null) {
				this.jTabbedPaneBusquedasListadosFormasPagos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosFormasPagos!=null) {
				this.jScrollPanelDatosListadosFormasPagos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosFormasPagos!=null) {
				this.jPanelPaginacionListadosFormasPagos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosFormasPagos!=null) {
				this.jPanelParametrosReportesListadosFormasPagos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionListadosFormasPagos!=null) {
				this.jScrollPanelDatosEdicionListadosFormasPagos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosFormasPagos!=null) {
				this.jTabbedPaneBusquedasListadosFormasPagos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosListadosFormasPagos!=null) {
				this.jScrollPanelDatosListadosFormasPagos.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadosFormasPagos!=null) {
				this.jPanelPaginacionListadosFormasPagos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadosFormasPagos!=null) {
				this.jPanelParametrosReportesListadosFormasPagos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionListadosFormasPagos!=null) {
				this.jScrollPanelDatosEdicionListadosFormasPagos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosFormasPagos!=null) {
				this.jTabbedPaneBusquedasListadosFormasPagos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosListadosFormasPagos!=null) {
				this.jScrollPanelDatosListadosFormasPagos.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadosFormasPagos!=null) {
				this.jPanelPaginacionListadosFormasPagos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadosFormasPagos!=null) {
				this.jPanelParametrosReportesListadosFormasPagos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionListadosFormasPagos!=null) {
				this.jScrollPanelDatosEdicionListadosFormasPagos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosFormasPagos!=null) {
				this.jTabbedPaneBusquedasListadosFormasPagos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosListadosFormasPagos!=null) {
				this.jScrollPanelDatosListadosFormasPagos.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadosFormasPagos!=null) {
				this.jPanelPaginacionListadosFormasPagos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadosFormasPagos!=null) {
				this.jPanelParametrosReportesListadosFormasPagos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionListadosFormasPagos!=null) {
				this.jScrollPanelDatosEdicionListadosFormasPagos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosFormasPagos!=null) {
				this.jTabbedPaneBusquedasListadosFormasPagos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosFormasPagos!=null) {
				this.jScrollPanelDatosListadosFormasPagos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosFormasPagos!=null) {
				this.jPanelPaginacionListadosFormasPagos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosFormasPagos!=null) {
				this.jPanelParametrosReportesListadosFormasPagos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionListadosFormasPagos!=null) {
				this.jScrollPanelDatosEdicionListadosFormasPagos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosFormasPagos!=null) {
				this.jTabbedPaneBusquedasListadosFormasPagos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosFormasPagos!=null) {
				this.jScrollPanelDatosListadosFormasPagos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosFormasPagos!=null) {
				this.jPanelPaginacionListadosFormasPagos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosFormasPagos!=null) {
				this.jPanelParametrosReportesListadosFormasPagos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionListadosFormasPagos!=null) {
				this.jScrollPanelDatosEdicionListadosFormasPagos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosFormasPagos!=null) {
				this.jTabbedPaneBusquedasListadosFormasPagos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosFormasPagos!=null) {
				this.jScrollPanelDatosListadosFormasPagos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosFormasPagos!=null) {
				this.jPanelPaginacionListadosFormasPagos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosFormasPagos!=null) {
				this.jPanelParametrosReportesListadosFormasPagos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasListadosFormasPagos!=null) {
					this.jTabbedPaneBusquedasListadosFormasPagos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesListadosFormasPagos!=null) {
				this.jPanelParametrosReportesListadosFormasPagos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosFormasPagos!=null) {
				this.jTabbedPaneBusquedasListadosFormasPagos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesListadosFormasPagos!=null) {
				this.jPanelParametrosReportesListadosFormasPagos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaTipoGrupoFormaPago(Boolean isParaTipoGrupoFormaPago){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoGrupoFormaPagoNegation=!isParaTipoGrupoFormaPago;

			this.isVisibilidadBusquedaListadosFormasPagos=isParaTipoGrupoFormaPago;
			if(!this.isVisibilidadBusquedaListadosFormasPagos) {this.jTabbedPaneBusquedasListadosFormasPagos.remove(jPanelBusquedaListadosFormasPagosListadosFormasPagos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaListadosFormasPagos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaListadosFormasPagos) {this.jTabbedPaneBusquedasListadosFormasPagos.remove(jPanelBusquedaListadosFormasPagosListadosFormasPagos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaListadosFormasPagos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaListadosFormasPagos) {this.jTabbedPaneBusquedasListadosFormasPagos.remove(jPanelBusquedaListadosFormasPagosListadosFormasPagos);}
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
			
			this.inicializarActualizarBindingTablaListadosFormasPagos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioListadosFormasPagos() {
		this.updateBorderResaltarBusquedasFormularioListadosFormasPagos();
		this.updateVisibilidadBusquedasFormularioListadosFormasPagos();
		this.updateHabilitarBusquedasFormularioListadosFormasPagos();
	}
	
	public void updateBorderResaltarBusquedasFormularioListadosFormasPagos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasListadosFormasPagos.getComponents().length>0) {
	

		if(this.listadosformaspagosConstantesFunciones.resaltarBusquedaListadosFormasPagosListadosFormasPagos!=null) {
			index= this.jTabbedPaneBusquedasListadosFormasPagos.indexOfComponent(this.jPanelBusquedaListadosFormasPagosListadosFormasPagos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasListadosFormasPagos.getComponent(index);
				jPanel.setBorder(this.listadosformaspagosConstantesFunciones.resaltarBusquedaListadosFormasPagosListadosFormasPagos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioListadosFormasPagos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasListadosFormasPagos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasListadosFormasPagos.indexOfComponent(this.jPanelBusquedaListadosFormasPagosListadosFormasPagos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasListadosFormasPagos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.listadosformaspagosConstantesFunciones.mostrarBusquedaListadosFormasPagosListadosFormasPagos);
			if(!this.listadosformaspagosConstantesFunciones.mostrarBusquedaListadosFormasPagosListadosFormasPagos && index>-1) {
				this.jTabbedPaneBusquedasListadosFormasPagos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioListadosFormasPagos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasListadosFormasPagos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasListadosFormasPagos.indexOfComponent(this.jPanelBusquedaListadosFormasPagosListadosFormasPagos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasListadosFormasPagos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.listadosformaspagosConstantesFunciones.activarBusquedaListadosFormasPagosListadosFormasPagos);
				this.jTabbedPaneBusquedasListadosFormasPagos.setEnabledAt(index,this.listadosformaspagosConstantesFunciones.activarBusquedaListadosFormasPagosListadosFormasPagos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaListadosFormasPagos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaListadosFormasPagos")) {
			index= this.jTabbedPaneBusquedasListadosFormasPagos.indexOfComponent(this.jPanelBusquedaListadosFormasPagosListadosFormasPagos);

			this.jTabbedPaneBusquedasListadosFormasPagos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasListadosFormasPagos.getComponent(index);

			this.listadosformaspagosConstantesFunciones.setResaltarBusquedaListadosFormasPagosListadosFormasPagos(resaltar);

			jPanel.setBorder(this.listadosformaspagosConstantesFunciones.resaltarBusquedaListadosFormasPagosListadosFormasPagos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarListadosFormasPagos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioListadosFormasPagos() throws Exception {

		if(this.jInternalFrameDetalleFormListadosFormasPagos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioListadosFormasPagos();
		this.updateVisibilidadResaltarControlesFormularioListadosFormasPagos();
		this.updateHabilitarResaltarControlesFormularioListadosFormasPagos();
		
	}
	
	public void updateBorderResaltarControlesFormularioListadosFormasPagos() throws Exception {
		if(this.jInternalFrameDetalleFormListadosFormasPagos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.listadosformaspagosConstantesFunciones.resaltaridListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos!=null) {this.jInternalFrameDetalleFormListadosFormasPagos.jLabelidListadosFormasPagos.setBorder(this.listadosformaspagosConstantesFunciones.resaltaridListadosFormasPagos);}
		if(this.listadosformaspagosConstantesFunciones.resaltarid_tipo_grupo_forma_pagoListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos!=null) {this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.setBorder(this.listadosformaspagosConstantesFunciones.resaltarid_tipo_grupo_forma_pagoListadosFormasPagos);}
		if(this.listadosformaspagosConstantesFunciones.resaltarid_empresaListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos!=null) {this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_empresaListadosFormasPagos.setBorder(this.listadosformaspagosConstantesFunciones.resaltarid_empresaListadosFormasPagos);}
		if(this.listadosformaspagosConstantesFunciones.resaltarid_sucursalListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos!=null) {this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_sucursalListadosFormasPagos.setBorder(this.listadosformaspagosConstantesFunciones.resaltarid_sucursalListadosFormasPagos);}
		if(this.listadosformaspagosConstantesFunciones.resaltarfecha_desdeListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos!=null) {this.jInternalFrameDetalleFormListadosFormasPagos.jDateChooserfecha_desdeListadosFormasPagos.setBorder(this.listadosformaspagosConstantesFunciones.resaltarfecha_desdeListadosFormasPagos);}
		if(this.listadosformaspagosConstantesFunciones.resaltarfecha_hastaListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos!=null) {this.jInternalFrameDetalleFormListadosFormasPagos.jDateChooserfecha_hastaListadosFormasPagos.setBorder(this.listadosformaspagosConstantesFunciones.resaltarfecha_hastaListadosFormasPagos);}
		if(this.listadosformaspagosConstantesFunciones.resaltarcodigoListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos!=null) {this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigoListadosFormasPagos.setBorder(this.listadosformaspagosConstantesFunciones.resaltarcodigoListadosFormasPagos);}
		if(this.listadosformaspagosConstantesFunciones.resaltarnombre_completoListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos!=null) {this.jInternalFrameDetalleFormListadosFormasPagos.jTextAreanombre_completoListadosFormasPagos.setBorder(this.listadosformaspagosConstantesFunciones.resaltarnombre_completoListadosFormasPagos);}
		if(this.listadosformaspagosConstantesFunciones.resaltarcodigo_tipo_cuenta_banco_globalListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos!=null) {this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setBorder(this.listadosformaspagosConstantesFunciones.resaltarcodigo_tipo_cuenta_banco_globalListadosFormasPagos);}
		if(this.listadosformaspagosConstantesFunciones.resaltarnumero_cuentaListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos!=null) {this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldnumero_cuentaListadosFormasPagos.setBorder(this.listadosformaspagosConstantesFunciones.resaltarnumero_cuentaListadosFormasPagos);}
		if(this.listadosformaspagosConstantesFunciones.resaltarcodigo_estado_anti_clienteListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos!=null) {this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigo_estado_anti_clienteListadosFormasPagos.setBorder(this.listadosformaspagosConstantesFunciones.resaltarcodigo_estado_anti_clienteListadosFormasPagos);}
		if(this.listadosformaspagosConstantesFunciones.resaltarfechaListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos!=null) {this.jInternalFrameDetalleFormListadosFormasPagos.jDateChooserfechaListadosFormasPagos.setBorder(this.listadosformaspagosConstantesFunciones.resaltarfechaListadosFormasPagos);}
		if(this.listadosformaspagosConstantesFunciones.resaltarvalorListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos!=null) {this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldvalorListadosFormasPagos.setBorder(this.listadosformaspagosConstantesFunciones.resaltarvalorListadosFormasPagos);}
		if(this.listadosformaspagosConstantesFunciones.resaltarvalor_adicionalListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos!=null) {this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldvalor_adicionalListadosFormasPagos.setBorder(this.listadosformaspagosConstantesFunciones.resaltarvalor_adicionalListadosFormasPagos);}
		if(this.listadosformaspagosConstantesFunciones.resaltarnombre_tipo_grupo_forma_pagoListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos!=null) {this.jInternalFrameDetalleFormListadosFormasPagos.jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.setBorder(this.listadosformaspagosConstantesFunciones.resaltarnombre_tipo_grupo_forma_pagoListadosFormasPagos);}
		if(this.listadosformaspagosConstantesFunciones.resaltartotalListadosFormasPagos!=null && this.jInternalFrameDetalleFormListadosFormasPagos!=null) {this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldtotalListadosFormasPagos.setBorder(this.listadosformaspagosConstantesFunciones.resaltartotalListadosFormasPagos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioListadosFormasPagos() throws Exception {		
		if(this.jInternalFrameDetalleFormListadosFormasPagos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
	
		//this.jInternalFrameDetalleFormListadosFormasPagos.jLabelidListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostraridListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jPanelidListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostraridListadosFormasPagos);
		//this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarid_tipo_grupo_forma_pagoListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jPanelid_tipo_grupo_forma_pagoListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarid_tipo_grupo_forma_pagoListadosFormasPagos);
		//this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_empresaListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarid_empresaListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jPanelid_empresaListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarid_empresaListadosFormasPagos);
		//this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_sucursalListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarid_sucursalListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jPanelid_sucursalListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarid_sucursalListadosFormasPagos);
		//this.jInternalFrameDetalleFormListadosFormasPagos.jDateChooserfecha_desdeListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarfecha_desdeListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jPanelfecha_desdeListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarfecha_desdeListadosFormasPagos);
		//this.jInternalFrameDetalleFormListadosFormasPagos.jDateChooserfecha_hastaListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarfecha_hastaListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jPanelfecha_hastaListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarfecha_hastaListadosFormasPagos);
		//this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigoListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarcodigoListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jPanelcodigoListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarcodigoListadosFormasPagos);
		//this.jInternalFrameDetalleFormListadosFormasPagos.jTextAreanombre_completoListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarnombre_completoListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jPanelnombre_completoListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarnombre_completoListadosFormasPagos);
		//this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarcodigo_tipo_cuenta_banco_globalListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jPanelcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarcodigo_tipo_cuenta_banco_globalListadosFormasPagos);
		//this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldnumero_cuentaListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarnumero_cuentaListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jPanelnumero_cuentaListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarnumero_cuentaListadosFormasPagos);
		//this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigo_estado_anti_clienteListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarcodigo_estado_anti_clienteListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jPanelcodigo_estado_anti_clienteListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarcodigo_estado_anti_clienteListadosFormasPagos);
		//this.jInternalFrameDetalleFormListadosFormasPagos.jDateChooserfechaListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarfechaListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jPanelfechaListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarfechaListadosFormasPagos);
		//this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldvalorListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarvalorListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jPanelvalorListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarvalorListadosFormasPagos);
		//this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldvalor_adicionalListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarvalor_adicionalListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jPanelvalor_adicionalListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarvalor_adicionalListadosFormasPagos);
		//this.jInternalFrameDetalleFormListadosFormasPagos.jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarnombre_tipo_grupo_forma_pagoListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jPanelnombre_tipo_grupo_forma_pagoListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrarnombre_tipo_grupo_forma_pagoListadosFormasPagos);
		//this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldtotalListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrartotalListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jPaneltotalListadosFormasPagos.setVisible(this.listadosformaspagosConstantesFunciones.mostrartotalListadosFormasPagos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioListadosFormasPagos() throws Exception {
		if(this.jInternalFrameDetalleFormListadosFormasPagos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormListadosFormasPagos!=null) {
	
		this.jInternalFrameDetalleFormListadosFormasPagos.jLabelidListadosFormasPagos.setEnabled(this.listadosformaspagosConstantesFunciones.activaridListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_tipo_grupo_forma_pagoListadosFormasPagos.setEnabled(this.listadosformaspagosConstantesFunciones.activarid_tipo_grupo_forma_pagoListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_empresaListadosFormasPagos.setEnabled(this.listadosformaspagosConstantesFunciones.activarid_empresaListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jComboBoxid_sucursalListadosFormasPagos.setEnabled(this.listadosformaspagosConstantesFunciones.activarid_sucursalListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jDateChooserfecha_desdeListadosFormasPagos.setEnabled(this.listadosformaspagosConstantesFunciones.activarfecha_desdeListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jDateChooserfecha_hastaListadosFormasPagos.setEnabled(this.listadosformaspagosConstantesFunciones.activarfecha_hastaListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigoListadosFormasPagos.setEnabled(this.listadosformaspagosConstantesFunciones.activarcodigoListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextAreanombre_completoListadosFormasPagos.setEnabled(this.listadosformaspagosConstantesFunciones.activarnombre_completoListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigo_tipo_cuenta_banco_globalListadosFormasPagos.setEnabled(this.listadosformaspagosConstantesFunciones.activarcodigo_tipo_cuenta_banco_globalListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldnumero_cuentaListadosFormasPagos.setEnabled(this.listadosformaspagosConstantesFunciones.activarnumero_cuentaListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldcodigo_estado_anti_clienteListadosFormasPagos.setEnabled(this.listadosformaspagosConstantesFunciones.activarcodigo_estado_anti_clienteListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jDateChooserfechaListadosFormasPagos.setEnabled(this.listadosformaspagosConstantesFunciones.activarfechaListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldvalorListadosFormasPagos.setEnabled(this.listadosformaspagosConstantesFunciones.activarvalorListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldvalor_adicionalListadosFormasPagos.setEnabled(this.listadosformaspagosConstantesFunciones.activarvalor_adicionalListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextAreanombre_tipo_grupo_forma_pagoListadosFormasPagos.setEnabled(this.listadosformaspagosConstantesFunciones.activarnombre_tipo_grupo_forma_pagoListadosFormasPagos);
		this.jInternalFrameDetalleFormListadosFormasPagos.jTextFieldtotalListadosFormasPagos.setEnabled(this.listadosformaspagosConstantesFunciones.activartotalListadosFormasPagos);
		}
	}
	
		
}