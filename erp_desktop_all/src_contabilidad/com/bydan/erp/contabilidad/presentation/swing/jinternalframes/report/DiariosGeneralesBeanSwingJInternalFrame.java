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

//import com.bydan.erp.contabilidad.util.DiariosGeneralesConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.DiariosGeneralesParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.DiariosGeneralesParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.DiariosGeneralesBean;
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
import com.bydan.erp.contabilidad.business.logic.*;

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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DiariosGeneralesBeanSwingJInternalFrame extends DiariosGeneralesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DiariosGeneralesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DiariosGenerales> diariosgeneralesValidator = new ClassValidator<DiariosGenerales>(DiariosGenerales.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DiariosGenerales diariosgenerales;	
	public DiariosGenerales diariosgeneralesAux;
	public DiariosGenerales diariosgeneralesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DiariosGenerales diariosgeneralesTotales;
	public Long idDiariosGeneralesActual;
	public Long iIdNuevoDiariosGenerales=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboTipoMovimiento="";

	public List<TipoMovimiento> tipomovimientosForeignKey;

	public List<TipoMovimiento> gettipomovimientosForeignKey() {
		return tipomovimientosForeignKey;
	}

	public void settipomovimientosForeignKey(List<TipoMovimiento> tipomovimientosForeignKey) {
		this.tipomovimientosForeignKey = tipomovimientosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoMovimiento tipomovimientoForeignKey;

	public TipoMovimiento gettipomovimientoForeignKey() {
		return tipomovimientoForeignKey;
	}

	public void settipomovimientoForeignKey(TipoMovimiento tipomovimientoForeignKey) {
		this.tipomovimientoForeignKey = tipomovimientoForeignKey;
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
	
	public Boolean isPermisoTodoDiariosGenerales;
	public Boolean isPermisoNuevoDiariosGenerales;
	public Boolean isPermisoActualizarDiariosGenerales;
	public Boolean isPermisoActualizarOriginalDiariosGenerales;
	public Boolean isPermisoEliminarDiariosGenerales;
	public Boolean isPermisoGuardarCambiosDiariosGenerales;
	public Boolean isPermisoConsultaDiariosGenerales;
	public Boolean isPermisoBusquedaDiariosGenerales;
	public Boolean isPermisoReporteDiariosGenerales;
	public Boolean isPermisoPaginacionMedioDiariosGenerales;
	public Boolean isPermisoPaginacionAltoDiariosGenerales;
	public Boolean isPermisoPaginacionTodoDiariosGenerales;
	public Boolean isPermisoCopiarDiariosGenerales;
	public Boolean isPermisoVerFormDiariosGenerales;
	public Boolean isPermisoDuplicarDiariosGenerales;
	public Boolean isPermisoOrdenDiariosGenerales;
	
	
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
	
	public DiariosGeneralesParameterReturnGeneral diariosgeneralesReturnGeneral;
	public DiariosGeneralesParameterReturnGeneral diariosgeneralesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDiariosGenerales=false;
	public Boolean esParaAccionDesdeFormularioDiariosGenerales=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DiariosGeneralesSessionBeanAdditional diariosgeneralesSessionBeanAdditional=null;
	
	public DiariosGeneralesSessionBeanAdditional getDiariosGeneralesSessionBeanAdditional() {
		return this.diariosgeneralesSessionBeanAdditional;
	}
	
	public void setDiariosGeneralesSessionBeanAdditional(DiariosGeneralesSessionBeanAdditional diariosgeneralesSessionBeanAdditional) {
		try {
			this.diariosgeneralesSessionBeanAdditional=diariosgeneralesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DiariosGeneralesBeanSwingJInternalFrameAdditional diariosgeneralesBeanSwingJInternalFrameAdditional=null;
	//public class DiariosGeneralesBeanSwingJInternalFrame
	
	public DiariosGeneralesBeanSwingJInternalFrameAdditional getDiariosGeneralesBeanSwingJInternalFrameAdditional() {
		return this.diariosgeneralesBeanSwingJInternalFrameAdditional;
	}
	
	public void setDiariosGeneralesBeanSwingJInternalFrameAdditional(DiariosGeneralesBeanSwingJInternalFrameAdditional diariosgeneralesBeanSwingJInternalFrameAdditional) {
		try {
			this.diariosgeneralesBeanSwingJInternalFrameAdditional=diariosgeneralesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DiariosGeneralesLogic diariosgeneralesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DiariosGenerales diariosgeneralesBean;
	public DiariosGeneralesConstantesFunciones diariosgeneralesConstantesFunciones;
	//public DiariosGeneralesParameterReturnGeneral diariosgeneralesReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public TipoMovimientoLogic tipomovimientoLogic;
	
	//PARAMETROS
	
	
	//public List<DiariosGenerales> diariosgeneraless;	
	//public List<DiariosGenerales> diariosgeneralessEliminados;
	//public List<DiariosGenerales> diariosgeneralessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDiariosGenerales=false;
	public Boolean isVisibilidadCeldaDuplicarDiariosGenerales=true;
	public Boolean isVisibilidadCeldaCopiarDiariosGenerales=true;
	public Boolean isVisibilidadCeldaVerFormDiariosGenerales=true;
	public Boolean isVisibilidadCeldaOrdenDiariosGenerales=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDiariosGenerales=false;
	public Boolean isVisibilidadCeldaModificarDiariosGenerales=false;
	public Boolean isVisibilidadCeldaActualizarDiariosGenerales=false;
	public Boolean isVisibilidadCeldaEliminarDiariosGenerales=false;
	public Boolean isVisibilidadCeldaCancelarDiariosGenerales=false;
	public Boolean isVisibilidadCeldaGuardarDiariosGenerales=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDiariosGenerales=false;	
	
	
	public Boolean isVisibilidadBusquedaDiariosGenerales=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoMovimiento=false;
	
	public Long getiIdNuevoDiariosGenerales() {
		return this.iIdNuevoDiariosGenerales;
	}

	public void setiIdNuevoDiariosGenerales(Long iIdNuevoDiariosGenerales) {
		this.iIdNuevoDiariosGenerales = iIdNuevoDiariosGenerales;
	}
	
	public Long getidDiariosGeneralesActual() {
		return this.idDiariosGeneralesActual;
	}

	public void setidDiariosGeneralesActual(Long idDiariosGeneralesActual) {
		this.idDiariosGeneralesActual = idDiariosGeneralesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DiariosGenerales getdiariosgenerales() {
		return this.diariosgenerales;
	}

	public void setdiariosgenerales(DiariosGenerales diariosgenerales) {
		this.diariosgenerales = diariosgenerales;
	}
	
	public DiariosGenerales getdiariosgeneralesAux() {
		return this.diariosgeneralesAux;
	}

	public void setdiariosgeneralesAux(DiariosGenerales diariosgeneralesAux) {
		this.diariosgeneralesAux = diariosgeneralesAux;
	}				
	
	public DiariosGenerales getdiariosgeneralesAnterior() {
		return this.diariosgeneralesAnterior;
	}

	public void setdiariosgeneralesAnterior(DiariosGenerales diariosgeneralesAnterior) {
		this.diariosgeneralesAnterior = diariosgeneralesAnterior;
	}	
	
	public DiariosGenerales getdiariosgeneralesTotales() {
		return this.diariosgeneralesTotales;
	}

	public void setdiariosgeneralesTotales(DiariosGenerales diariosgeneralesTotales) {
		this.diariosgeneralesTotales = diariosgeneralesTotales;
	}	
	
	public DiariosGenerales getdiariosgeneralesBean() {
		return this.diariosgeneralesBean;
	}

	public void setdiariosgeneralesBean(DiariosGenerales diariosgeneralesBean) {
		this.diariosgeneralesBean = diariosgeneralesBean;
	}	
	
	public DiariosGeneralesParameterReturnGeneral getdiariosgeneralesReturnGeneral() {
		return this.diariosgeneralesReturnGeneral;
	}

	public void setdiariosgeneralesReturnGeneral(DiariosGeneralesParameterReturnGeneral diariosgeneralesReturnGeneral) {
		this.diariosgeneralesReturnGeneral = diariosgeneralesReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaDiariosGenerales=-1L;

	public Long getid_ejercicioBusquedaDiariosGenerales() {
		return this.id_ejercicioBusquedaDiariosGenerales;
	}

	public void setid_ejercicioBusquedaDiariosGenerales(Long id_ejercicioBusquedaDiariosGenerales) {
		this.id_ejercicioBusquedaDiariosGenerales = id_ejercicioBusquedaDiariosGenerales;
	}

;
	public Long id_tipo_movimientoBusquedaDiariosGenerales=-1L;

	public Long getid_tipo_movimientoBusquedaDiariosGenerales() {
		return this.id_tipo_movimientoBusquedaDiariosGenerales;
	}

	public void setid_tipo_movimientoBusquedaDiariosGenerales(Long id_tipo_movimientoBusquedaDiariosGenerales) {
		this.id_tipo_movimientoBusquedaDiariosGenerales = id_tipo_movimientoBusquedaDiariosGenerales;
	}

;
	public Date fecha_emision_desdeBusquedaDiariosGenerales=new Date();

	public Date getfecha_emision_desdeBusquedaDiariosGenerales() {
		return this.fecha_emision_desdeBusquedaDiariosGenerales;
	}

	public void setfecha_emision_desdeBusquedaDiariosGenerales(Date fecha_emision_desdeBusquedaDiariosGenerales) {
		this.fecha_emision_desdeBusquedaDiariosGenerales = fecha_emision_desdeBusquedaDiariosGenerales;
	}

;
	public Date fecha_emision_hastaBusquedaDiariosGenerales=new Date();

	public Date getfecha_emision_hastaBusquedaDiariosGenerales() {
		return this.fecha_emision_hastaBusquedaDiariosGenerales;
	}

	public void setfecha_emision_hastaBusquedaDiariosGenerales(Date fecha_emision_hastaBusquedaDiariosGenerales) {
		this.fecha_emision_hastaBusquedaDiariosGenerales = fecha_emision_hastaBusquedaDiariosGenerales;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
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

	public Long id_tipo_movimientoFK_IdTipoMovimiento=-1L;

	public Long getid_tipo_movimientoFK_IdTipoMovimiento() {
		return this.id_tipo_movimientoFK_IdTipoMovimiento;
	}

	public void setid_tipo_movimientoFK_IdTipoMovimiento(Long id_tipo_movimientoFK_IdTipoMovimiento) {
		this.id_tipo_movimientoFK_IdTipoMovimiento = id_tipo_movimientoFK_IdTipoMovimiento;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DiariosGeneralesLogic getDiariosGeneralesLogic()	{		
		return diariosgeneralesLogic;
	}

	public void setDiariosGeneralesLogic(DiariosGeneralesLogic diariosgeneralesLogic) {
		this.diariosgeneralesLogic = diariosgeneralesLogic;
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
	
	public Boolean getIsEsNuevoDiariosGenerales() {
		return isEsNuevoDiariosGenerales;
	}

	public void setIsEsNuevoDiariosGenerales(Boolean isEsNuevoDiariosGenerales) {
		this.isEsNuevoDiariosGenerales = isEsNuevoDiariosGenerales;
	}

	public Boolean getEsParaAccionDesdeFormularioDiariosGenerales() {
		return esParaAccionDesdeFormularioDiariosGenerales;
	}
	
	public void setEsParaAccionDesdeFormularioDiariosGenerales(Boolean esParaAccionDesdeFormularioDiariosGenerales) {
		this.esParaAccionDesdeFormularioDiariosGenerales = esParaAccionDesdeFormularioDiariosGenerales;
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

			if(this.diariosgeneralesSessionBean==null) {
				this.diariosgeneralesSessionBean=new DiariosGeneralesSessionBean();
			}

			if(!this.diariosgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(diariosgeneralesSessionBean.getlidEmpresaActual());
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

			if(this.diariosgeneralesSessionBean==null) {
				this.diariosgeneralesSessionBean=new DiariosGeneralesSessionBean();
			}

			if(!this.diariosgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(diariosgeneralesSessionBean.getlidSucursalActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.diariosgeneralesSessionBean==null) {
				this.diariosgeneralesSessionBean=new DiariosGeneralesSessionBean();
			}

			if(!this.diariosgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(diariosgeneralesSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosTipoMovimientosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoMovimientoLogic tipomovimientoLogic=new TipoMovimientoLogic();

			//tipomovimientoLogic.getTipoMovimientoDataAccess().setIsForForeingKeyData(true);

			if(this.diariosgeneralesSessionBean==null) {
				this.diariosgeneralesSessionBean=new DiariosGeneralesSessionBean();
			}

			if(!this.diariosgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipomovimientoLogic.getTipoMovimientoDataAccess().setIsForForeingKeyData(true);

					tipomovimientoLogic.getTodosTipoMovimientosWithConnection(sFinalQuery,new Pagination());

					this.tipomovimientosForeignKey=tipomovimientoLogic.getTipoMovimientos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoMovimiento(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientoLogic.getEntityWithConnection(diariosgeneralesSessionBean.getlidTipoMovimientoActual());
					this.tipomovimientosForeignKey.add(tipomovimientoLogic.getTipoMovimiento());
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

					if(this.diariosgenerales!=null) {
						this.diariosgenerales.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
						this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_empresaDiariosGenerales.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDiariosGenerales.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
						if(this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_empresaDiariosGenerales.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_empresaDiariosGenerales.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDiariosGeneralesGenerico)throws Exception
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
				jComboBoxid_empresaDiariosGeneralesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDiariosGeneralesGenerico!=null && jComboBoxid_empresaDiariosGeneralesGenerico.getItemCount()>0) {
					jComboBoxid_empresaDiariosGeneralesGenerico.setSelectedIndex(0);
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

					if(this.diariosgenerales!=null) {
						this.diariosgenerales.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
						this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_sucursalDiariosGenerales.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDiariosGenerales.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
						if(this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_sucursalDiariosGenerales.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_sucursalDiariosGenerales.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDiariosGeneralesGenerico)throws Exception
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
				jComboBoxid_sucursalDiariosGeneralesGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDiariosGeneralesGenerico!=null && jComboBoxid_sucursalDiariosGeneralesGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDiariosGeneralesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.diariosgenerales!=null) {
						this.diariosgenerales.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
						this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_ejercicioDiariosGenerales.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioDiariosGenerales.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
						if(this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_ejercicioDiariosGenerales.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_ejercicioDiariosGenerales.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDiariosGenerales") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales!=null) {
						jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales!=null) {
							//jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioDiariosGeneralesGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioDiariosGeneralesGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioDiariosGeneralesGenerico!=null && jComboBoxid_ejercicioDiariosGeneralesGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioDiariosGeneralesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoMovimientoForeignKey(Long idTipoMovimientoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipomovimientoTemp!=null) {

					if(this.diariosgenerales!=null) {
						this.diariosgenerales.setTipoMovimiento(tipomovimientoTemp);
					}

					if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
						this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_tipo_movimientoDiariosGenerales.setSelectedItem(tipomovimientoTemp);
					}
				} else {
					//jComboBoxid_tipo_movimientoDiariosGenerales.setSelectedItem(tipomovimientoTemp);
					if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
						if(this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_tipo_movimientoDiariosGenerales.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_tipo_movimientoDiariosGenerales.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDiariosGenerales") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomovimientoTemp!=null && jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales!=null) {
						jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.setSelectedItem(tipomovimientoTemp);
					} else {
						if(jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales!=null) {
							//jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.setSelectedItem(tipomovimientoTemp);
							if(jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.getItemCount()>0) {
								jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.setSelectedIndex(0);
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

	public String getActualTipoMovimientoForeignKeyDescripcion(Long idTipoMovimientoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}


			sDescripcion=TipoMovimientoConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoMovimientoForeignKeyGenerico(Long idTipoMovimientoSeleccionado,JComboBox jComboBoxid_tipo_movimientoDiariosGeneralesGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}

			if(tipomovimientoTemp!=null) {
				jComboBoxid_tipo_movimientoDiariosGeneralesGenerico.setSelectedItem(tipomovimientoTemp);
			} else {
				if(jComboBoxid_tipo_movimientoDiariosGeneralesGenerico!=null && jComboBoxid_tipo_movimientoDiariosGeneralesGenerico.getItemCount()>0) {
					jComboBoxid_tipo_movimientoDiariosGeneralesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DiariosGenerales diariosgenerales,JComboBox jComboBoxid_empresaDiariosGeneralesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDiariosGeneralesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_empresaDiariosGenerales.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDiariosGeneralesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				diariosgenerales.setid_empresa(empresaAux.getId());
				diariosgenerales.setempresa_descripcion(DiariosGeneralesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				diariosgenerales.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DiariosGenerales diariosgenerales,JComboBox jComboBoxid_sucursalDiariosGeneralesGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDiariosGeneralesGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_sucursalDiariosGenerales.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDiariosGeneralesGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				diariosgenerales.setid_sucursal(sucursalAux.getId());
				diariosgenerales.setsucursal_descripcion(DiariosGeneralesConstantesFunciones.getSucursalDescripcion(sucursalAux));
				diariosgenerales.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(DiariosGenerales diariosgenerales,JComboBox jComboBoxid_ejercicioDiariosGeneralesGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioDiariosGeneralesGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_ejercicioDiariosGenerales.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioDiariosGeneralesGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				diariosgenerales.setid_ejercicio(ejercicioAux.getId());
				diariosgenerales.setejercicio_descripcion(DiariosGeneralesConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				diariosgenerales.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMovimientoForeignKey(DiariosGenerales diariosgenerales,JComboBox jComboBoxid_tipo_movimientoDiariosGeneralesGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoAux=new TipoMovimiento();

			if(jComboBoxid_tipo_movimientoDiariosGeneralesGenerico==null) {
				tipomovimientoAux=(TipoMovimiento)this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_tipo_movimientoDiariosGenerales.getSelectedItem();
			} else {
				tipomovimientoAux=(TipoMovimiento)jComboBoxid_tipo_movimientoDiariosGeneralesGenerico.getSelectedItem();
			}

			if(tipomovimientoAux!=null && tipomovimientoAux.getId()!=null) {
				diariosgenerales.setid_tipo_movimiento(tipomovimientoAux.getId());
				diariosgenerales.settipomovimiento_descripcion(DiariosGeneralesConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoAux));
				diariosgenerales.setTipoMovimiento(tipomovimientoAux);			}
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

					if(!DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { 
							this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_empresaDiariosGenerales.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_empresaDiariosGenerales.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { 
					}

					if(!DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { 
							this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_sucursalDiariosGenerales.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_sucursalDiariosGenerales.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { 
					}

					if(!DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { 
							this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_ejercicioDiariosGenerales.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_ejercicioDiariosGenerales.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { 
					}

					if(!DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDiariosGenerales") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.addItem(ejercicio);
							}
						}

						if(!DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoMovimientosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoMovimiento=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { 
							this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_tipo_movimientoDiariosGenerales.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_tipo_movimientoDiariosGenerales.addItem(tipomovimiento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { 
					}

					if(!DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDiariosGenerales") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.addItem(tipomovimiento);
							}
						}

						if(!DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
							this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_empresaDiariosGenerales.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
							this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_empresaDiariosGenerales.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
							this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_sucursalDiariosGenerales.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
							this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_sucursalDiariosGenerales.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
							this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_ejercicioDiariosGenerales.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
							this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_ejercicioDiariosGenerales.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoMovimientoForeignKey(TipoMovimiento tipomovimiento,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
							this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_tipo_movimientoDiariosGenerales.setSelectedItem(tipomovimiento);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
							this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_tipo_movimientoDiariosGenerales.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.setSelectedItem(tipomovimiento);
						} else {
							this.jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDiariosGenerales() throws Exception {
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
		
	public DiariosGeneralesParameterReturnGeneral getDiariosGeneralesParameterGeneral() {
		return this.diariosgeneralesParameterGeneral;
	}
	
	public void setDiariosGeneralesParameterGeneral(DiariosGeneralesParameterReturnGeneral diariosgeneralesParameterGeneral) {
		this.diariosgeneralesParameterGeneral = diariosgeneralesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDiariosGenerales() {
		return isPermisoTodoDiariosGenerales;
	}

	public void setIsPermisoTodoDiariosGenerales(Boolean isPermisoTodoDiariosGenerales) {
		this.isPermisoTodoDiariosGenerales = isPermisoTodoDiariosGenerales;
	}

	public Boolean getIsPermisoNuevoDiariosGenerales() {
		return isPermisoNuevoDiariosGenerales;
	}

	public void setIsPermisoNuevoDiariosGenerales(Boolean isPermisoNuevoDiariosGenerales) {
		this.isPermisoNuevoDiariosGenerales = isPermisoNuevoDiariosGenerales;
	}

	public Boolean getIsPermisoActualizarDiariosGenerales() {
		return isPermisoActualizarDiariosGenerales;
	}

	public void setIsPermisoActualizarDiariosGenerales(Boolean isPermisoActualizarDiariosGenerales) {
		this.isPermisoActualizarDiariosGenerales = isPermisoActualizarDiariosGenerales;
	}

	public Boolean getIsPermisoEliminarDiariosGenerales() {
		return isPermisoEliminarDiariosGenerales;
	}

	public void setIsPermisoEliminarDiariosGenerales(Boolean isPermisoEliminarDiariosGenerales) {
		this.isPermisoEliminarDiariosGenerales = isPermisoEliminarDiariosGenerales;
	}

	public Boolean getIsPermisoGuardarCambiosDiariosGenerales() {
		return isPermisoGuardarCambiosDiariosGenerales;
	}

	public void setIsPermisoGuardarCambiosDiariosGenerales(Boolean isPermisoGuardarCambiosDiariosGenerales) {
		this.isPermisoGuardarCambiosDiariosGenerales = isPermisoGuardarCambiosDiariosGenerales;
	}
	
	public Boolean getIsPermisoConsultaDiariosGenerales() {
		return isPermisoConsultaDiariosGenerales;
	}

	public void setIsPermisoConsultaDiariosGenerales(Boolean isPermisoConsultaDiariosGenerales) {
		this.isPermisoConsultaDiariosGenerales = isPermisoConsultaDiariosGenerales;
	}

	public Boolean getIsPermisoBusquedaDiariosGenerales() {
		return isPermisoBusquedaDiariosGenerales;
	}

	public void setIsPermisoBusquedaDiariosGenerales(Boolean isPermisoBusquedaDiariosGenerales) {
		this.isPermisoBusquedaDiariosGenerales = isPermisoBusquedaDiariosGenerales;
	}

	public Boolean getIsPermisoReporteDiariosGenerales() {
		return isPermisoReporteDiariosGenerales;
	}

	public void setIsPermisoReporteDiariosGenerales(Boolean isPermisoReporteDiariosGenerales) {
		this.isPermisoReporteDiariosGenerales = isPermisoReporteDiariosGenerales;
	}
	
	public Boolean getIsPermisoPaginacionMedioDiariosGenerales() {
		return isPermisoPaginacionMedioDiariosGenerales;
	}

	public void setIsPermisoPaginacionMedioDiariosGenerales(Boolean isPermisoPaginacionMedioDiariosGenerales) {
		this.isPermisoPaginacionMedioDiariosGenerales = isPermisoPaginacionMedioDiariosGenerales;
	}
	
	public Boolean getIsPermisoPaginacionTodoDiariosGenerales() {
		return isPermisoPaginacionTodoDiariosGenerales;
	}

	public void setIsPermisoPaginacionTodoDiariosGenerales(Boolean isPermisoPaginacionTodoDiariosGenerales) {
		this.isPermisoPaginacionTodoDiariosGenerales = isPermisoPaginacionTodoDiariosGenerales;
	}
	
	public Boolean getIsPermisoPaginacionAltoDiariosGenerales() {
		return isPermisoPaginacionAltoDiariosGenerales;
	}

	public void setIsPermisoPaginacionAltoDiariosGenerales(Boolean isPermisoPaginacionAltoDiariosGenerales) {
		this.isPermisoPaginacionAltoDiariosGenerales = isPermisoPaginacionAltoDiariosGenerales;
	}
	
	public Boolean getIsPermisoCopiarDiariosGenerales() {
		return isPermisoCopiarDiariosGenerales;
	}

	public void setIsPermisoCopiarDiariosGenerales(Boolean isPermisoCopiarDiariosGenerales) {
		this.isPermisoCopiarDiariosGenerales = isPermisoCopiarDiariosGenerales;
	}
	
	public Boolean getIsPermisoVerFormDiariosGenerales() {
		return isPermisoVerFormDiariosGenerales;
	}

	public void setIsPermisoVerFormDiariosGenerales(Boolean isPermisoVerFormDiariosGenerales) {
		this.isPermisoVerFormDiariosGenerales = isPermisoVerFormDiariosGenerales;
	}
	
	public Boolean getIsPermisoDuplicarDiariosGenerales() {
		return isPermisoDuplicarDiariosGenerales;
	}

	public void setIsPermisoDuplicarDiariosGenerales(Boolean isPermisoDuplicarDiariosGenerales) {
		this.isPermisoDuplicarDiariosGenerales = isPermisoDuplicarDiariosGenerales;
	}
	
	public Boolean getIsPermisoOrdenDiariosGenerales() {
		return isPermisoOrdenDiariosGenerales;
	}

	public void setIsPermisoOrdenDiariosGenerales(Boolean isPermisoOrdenDiariosGenerales) {
		this.isPermisoOrdenDiariosGenerales = isPermisoOrdenDiariosGenerales;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDiariosGenerales() {
		return isVisibilidadCeldaNuevoDiariosGenerales;
	}

	public void setIsVisibilidadCeldaNuevoDiariosGenerales(Boolean isVisibilidadCeldaNuevoDiariosGenerales) {
		this.isVisibilidadCeldaNuevoDiariosGenerales = isVisibilidadCeldaNuevoDiariosGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDiariosGenerales() {
		return isVisibilidadCeldaDuplicarDiariosGenerales;
	}

	public void setIsVisibilidadCeldaDuplicarDiariosGenerales(Boolean isVisibilidadCeldaDuplicarDiariosGenerales) {
		this.isVisibilidadCeldaDuplicarDiariosGenerales = isVisibilidadCeldaDuplicarDiariosGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDiariosGenerales() {
		return isVisibilidadCeldaCopiarDiariosGenerales;
	}

	public void setIsVisibilidadCeldaCopiarDiariosGenerales(Boolean isVisibilidadCeldaCopiarDiariosGenerales) {
		this.isVisibilidadCeldaCopiarDiariosGenerales = isVisibilidadCeldaCopiarDiariosGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDiariosGenerales() {
		return isVisibilidadCeldaVerFormDiariosGenerales;
	}

	public void setIsVisibilidadCeldaVerFormDiariosGenerales(Boolean isVisibilidadCeldaVerFormDiariosGenerales) {
		this.isVisibilidadCeldaVerFormDiariosGenerales = isVisibilidadCeldaVerFormDiariosGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDiariosGenerales() {
		return isVisibilidadCeldaOrdenDiariosGenerales;
	}

	public void setIsVisibilidadCeldaOrdenDiariosGenerales(Boolean isVisibilidadCeldaOrdenDiariosGenerales) {
		this.isVisibilidadCeldaOrdenDiariosGenerales = isVisibilidadCeldaOrdenDiariosGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDiariosGenerales() {
		return isVisibilidadCeldaNuevoRelacionesDiariosGenerales;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDiariosGenerales(Boolean isVisibilidadCeldaNuevoRelacionesDiariosGenerales) {
		this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales = isVisibilidadCeldaNuevoRelacionesDiariosGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDiariosGenerales() {
		return isVisibilidadCeldaModificarDiariosGenerales;
	}

	public void setIsVisibilidadCeldaModificarDiariosGenerales(Boolean isVisibilidadCeldaModificarDiariosGenerales) {
		this.isVisibilidadCeldaModificarDiariosGenerales = isVisibilidadCeldaModificarDiariosGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDiariosGenerales() {
		return isVisibilidadCeldaActualizarDiariosGenerales;
	}

	public void setIsVisibilidadCeldaActualizarDiariosGenerales(Boolean isVisibilidadCeldaActualizarDiariosGenerales) {
		this.isVisibilidadCeldaActualizarDiariosGenerales = isVisibilidadCeldaActualizarDiariosGenerales;
	}

	public Boolean getIsVisibilidadCeldaEliminarDiariosGenerales() {
		return isVisibilidadCeldaEliminarDiariosGenerales;
	}

	public void setIsVisibilidadCeldaEliminarDiariosGenerales(Boolean isVisibilidadCeldaEliminarDiariosGenerales) {
		this.isVisibilidadCeldaEliminarDiariosGenerales = isVisibilidadCeldaEliminarDiariosGenerales;
	}

	public Boolean getIsVisibilidadCeldaCancelarDiariosGenerales() {
		return isVisibilidadCeldaCancelarDiariosGenerales;
	}

	public void setIsVisibilidadCeldaCancelarDiariosGenerales(Boolean isVisibilidadCeldaCancelarDiariosGenerales) {
		this.isVisibilidadCeldaCancelarDiariosGenerales = isVisibilidadCeldaCancelarDiariosGenerales;
	}

	public Boolean getIsVisibilidadCeldaGuardarDiariosGenerales() {
		return isVisibilidadCeldaGuardarDiariosGenerales;
	}

	public void setIsVisibilidadCeldaGuardarDiariosGenerales(Boolean isVisibilidadCeldaGuardarDiariosGenerales) {
		this.isVisibilidadCeldaGuardarDiariosGenerales = isVisibilidadCeldaGuardarDiariosGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDiariosGenerales() {
		return isVisibilidadCeldaGuardarCambiosDiariosGenerales;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDiariosGenerales(Boolean isVisibilidadCeldaGuardarCambiosDiariosGenerales) {
		this.isVisibilidadCeldaGuardarCambiosDiariosGenerales = isVisibilidadCeldaGuardarCambiosDiariosGenerales;
	}
		
	public DiariosGeneralesSessionBean getdiariosgeneralesSessionBean() {
		return this.diariosgeneralesSessionBean;
	}
	
	public void setdiariosgeneralesSessionBean(DiariosGeneralesSessionBean diariosgeneralesSessionBean) {
		this.diariosgeneralesSessionBean=diariosgeneralesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaDiariosGenerales() {
		return this.isVisibilidadBusquedaDiariosGenerales;
	}

	public void setisVisibilidadBusquedaDiariosGenerales(Boolean isVisibilidadBusquedaDiariosGenerales) {
		this.isVisibilidadBusquedaDiariosGenerales=isVisibilidadBusquedaDiariosGenerales;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
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

	public Boolean getisVisibilidadFK_IdTipoMovimiento() {
		return this.isVisibilidadFK_IdTipoMovimiento;
	}

	public void setisVisibilidadFK_IdTipoMovimiento(Boolean isVisibilidadFK_IdTipoMovimiento) {
		this.isVisibilidadFK_IdTipoMovimiento=isVisibilidadFK_IdTipoMovimiento;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(DiariosGenerales diariosgenerales)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(diariosgenerales,null);
				this.setActualParaGuardarSucursalForeignKey(diariosgenerales,null);
				this.setActualParaGuardarEjercicioForeignKey(diariosgenerales,null);
				this.setActualParaGuardarTipoMovimientoForeignKey(diariosgenerales,null);
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
	
	public void bugActualizarReferenciaActual(DiariosGenerales diariosgenerales,DiariosGenerales diariosgeneralesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDiariosGenerales(diariosgenerales);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		diariosgeneralesAux.setId(diariosgenerales.getId());
		diariosgeneralesAux.setVersionRow(diariosgenerales.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(DiariosGenerales diariosgeneralesLocal) throws Exception {
		
		if(this.diariosgeneralesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DiariosGenerales diariosgeneralesLocal) throws Exception {	
		if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				diariosgeneralesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				diariosgeneralesLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				diariosgeneralesLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMovimientoDetalleFormJInternalFrame.class)) {
				TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrameLocal=(TipoMovimientoBeanSwingJInternalFrame) ((TipoMovimientoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomovimientoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.gettipomovimiento(),true);
				tipomovimientoBeanSwingJInternalFrameLocal.actualizarLista(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento,this.tipomovimientosForeignKey);

				tipomovimientoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				diariosgeneralesLocal.setTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey("Formulario");
				this.setActualTipoMovimientoForeignKey(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDiariosGeneralesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = diariosgeneralesValidator.getInvalidValues(this.diariosgenerales);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DiariosGenerales diariosgenerales,List<DiariosGenerales> diariosgeneraless) throws Exception {
	}		
	
	public void actualizarSelectedLista(DiariosGenerales diariosgenerales,List<DiariosGenerales> diariosgeneraless) throws Exception {
		try	{			
			DiariosGeneralesConstantesFunciones.actualizarSelectedLista(diariosgenerales,diariosgeneraless);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DiariosGenerales> diariosgeneralessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				diariosgeneralessLocal=this.diariosgeneralesLogic.getDiariosGeneraless();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				diariosgeneralessLocal=this.diariosgeneraless;
			}
			//ARCHITECTURE
		
			for(DiariosGenerales diariosgeneralesLocal:diariosgeneralessLocal) {
				if(this.permiteMantenimiento(diariosgeneralesLocal) && diariosgeneralesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DiariosGeneralesConstantesFunciones.getDiariosGeneralesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DiariosGeneralesConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabelcodigoDiariosGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiariosGeneralesConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabelfecha_emisionDiariosGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiariosGeneralesConstantesFunciones.CODIGOTIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabelcodigo_tipo_movimientoDiariosGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiariosGeneralesConstantesFunciones.NUMEROMAYOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabelnumero_mayorDiariosGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiariosGeneralesConstantesFunciones.NOMBRECUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabelnombre_cuenta_contableDiariosGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiariosGeneralesConstantesFunciones.DEBITOLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabeldebito_localDiariosGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiariosGeneralesConstantesFunciones.CREDITOLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabelcredito_localDiariosGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiariosGeneralesConstantesFunciones.DETALLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabeldetalleDiariosGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiariosGeneralesConstantesFunciones.CODIGOCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabelcodigo_cuenta_contableDiariosGenerales,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiariosGenerales.jLabelcodigoDiariosGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiariosGenerales.jLabelfecha_emisionDiariosGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiariosGenerales.jLabelcodigo_tipo_movimientoDiariosGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiariosGenerales.jLabelnumero_mayorDiariosGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiariosGenerales.jLabelnombre_cuenta_contableDiariosGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiariosGenerales.jLabeldebito_localDiariosGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiariosGenerales.jLabelcredito_localDiariosGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiariosGenerales.jLabeldetalleDiariosGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiariosGenerales.jLabelcodigo_cuenta_contableDiariosGenerales,"");
		
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
		this.iIdNuevoDiariosGenerales--;	
		
		
		this.diariosgeneralesAux=new DiariosGenerales();
		
		this.diariosgeneralesAux.setId(this.iIdNuevoDiariosGenerales);
		this.diariosgeneralesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.diariosgeneralesLogic.getDiariosGeneraless().add(this.diariosgeneralesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.diariosgeneraless.add(this.diariosgeneralesAux);
		}
		//ARCHITECTURE
		
		this.diariosgenerales=this.diariosgeneralesAux;
		
		if(DiariosGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDiariosGenerales(this.diariosgenerales);
			this.setVariablesObjetoActualToFormularioForeignKeyDiariosGenerales(this.diariosgenerales);
		}
				
		//this.setDefaultControlesDiariosGenerales();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDiariosGenerales();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDiariosGenerales();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDiariosGenerales();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDiariosGenerales(this.diariosgeneralesBean,this.diariosgenerales,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDiariosGenerales(this.diariosgeneralesReturnGeneral,this.diariosgeneralesBean,false);
		
		if(this.diariosgeneralesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDiariosGenerales(this.diariosgeneralesReturnGeneral.getDiariosGenerales());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDiariosGenerales(this.diariosgeneralesReturnGeneral.getDiariosGenerales());
		}
		
		if(this.diariosgeneralesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDiariosGenerales(this.diariosgeneralesReturnGeneral.getDiariosGenerales(),classes);//this.diariosgeneralesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDiariosGenerales();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDiariosGenerales();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DiariosGeneralesBeanSwingJInternalFrameAdditional.RecargarFormDiariosGenerales(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDiariosGenerales(false);
						
			if(diariosgeneralesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDiariosGenerales();
			}
			
			this.actualizarVisualTableDatosDiariosGenerales();
			
			this.jTableDatosDiariosGenerales.setRowSelectionInterval(this.getIndiceNuevoDiariosGenerales(), this.getIndiceNuevoDiariosGenerales());
			
			this.seleccionarFilaTablaDiariosGeneralesActual();
						
			this.actualizarEstadoCeldasBotonesDiariosGenerales("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDiariosGenerales(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDiariosGenerales.jDateChooserfecha_emision_desdeDiariosGenerales.setEnabled(isHabilitar && this.diariosgeneralesConstantesFunciones.activarfecha_emision_desdeDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jDateChooserfecha_emision_hastaDiariosGenerales.setEnabled(isHabilitar && this.diariosgeneralesConstantesFunciones.activarfecha_emision_hastaDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigoDiariosGenerales.setEnabled(isHabilitar && this.diariosgeneralesConstantesFunciones.activarcodigoDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jDateChooserfecha_emisionDiariosGenerales.setEnabled(isHabilitar && this.diariosgeneralesConstantesFunciones.activarfecha_emisionDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigo_tipo_movimientoDiariosGenerales.setEnabled(isHabilitar && this.diariosgeneralesConstantesFunciones.activarcodigo_tipo_movimientoDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jTextAreanumero_mayorDiariosGenerales.setEnabled(isHabilitar && this.diariosgeneralesConstantesFunciones.activarnumero_mayorDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jTextAreanombre_cuenta_contableDiariosGenerales.setEnabled(isHabilitar && this.diariosgeneralesConstantesFunciones.activarnombre_cuenta_contableDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jTextFielddebito_localDiariosGenerales.setEnabled(isHabilitar && this.diariosgeneralesConstantesFunciones.activardebito_localDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcredito_localDiariosGenerales.setEnabled(isHabilitar && this.diariosgeneralesConstantesFunciones.activarcredito_localDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jTextAreadetalleDiariosGenerales.setEnabled(isHabilitar && this.diariosgeneralesConstantesFunciones.activardetalleDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigo_cuenta_contableDiariosGenerales.setEnabled(isHabilitar && this.diariosgeneralesConstantesFunciones.activarcodigo_cuenta_contableDiariosGenerales);	
		//
		this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_empresaDiariosGenerales.setEnabled(isHabilitar && this.diariosgeneralesConstantesFunciones.activarid_empresaDiariosGenerales);//
		this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_sucursalDiariosGenerales.setEnabled(isHabilitar && this.diariosgeneralesConstantesFunciones.activarid_sucursalDiariosGenerales);//
		this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_ejercicioDiariosGenerales.setEnabled(isHabilitar && this.diariosgeneralesConstantesFunciones.activarid_ejercicioDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_tipo_movimientoDiariosGenerales.setEnabled(isHabilitar && this.diariosgeneralesConstantesFunciones.activarid_tipo_movimientoDiariosGenerales);
	};
	
	public void setDefaultControlesDiariosGenerales() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDiariosGenerales(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.diariosgeneralesSessionBean.setConGuardarRelaciones(true);			
			this.diariosgeneralesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDiariosGenerales.jTabbedPaneRelacionesDiariosGenerales.setVisible(true);
			
					
		} else {
			//this.diariosgeneralesSessionBean.setConGuardarRelaciones(false);			
			this.diariosgeneralesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDiariosGenerales.jTabbedPaneRelacionesDiariosGenerales.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDiariosGenerales() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiariosGenerales diariosgeneralesAux:this.diariosgeneralesLogic.getDiariosGeneraless()) {
				if(diariosgeneralesAux.getId().equals(this.iIdNuevoDiariosGenerales)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiariosGenerales diariosgeneralesAux:this.diariosgeneraless) {
				if(diariosgeneralesAux.getId().equals(this.iIdNuevoDiariosGenerales)) {
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
	
	public int getIndiceActualDiariosGenerales(DiariosGenerales diariosgenerales,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiariosGenerales diariosgeneralesAux:this.diariosgeneralesLogic.getDiariosGeneraless()) {
				if(diariosgeneralesAux.getId().equals(diariosgenerales.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiariosGenerales diariosgeneralesAux:this.diariosgeneraless) {
				if(diariosgeneralesAux.getId().equals(diariosgenerales.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDiariosGenerales(DiariosGenerales diariosgeneralesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiariosGenerales diariosgeneralesAux:this.diariosgeneralesLogic.getDiariosGeneraless()) {
				if(diariosgeneralesAux.getDiariosGeneralesOriginal().getId().equals(diariosgeneralesOriginal.getId())) {
					existe=true;
					diariosgeneralesOriginal.setId(diariosgeneralesAux.getId());
					diariosgeneralesOriginal.setVersionRow(diariosgeneralesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiariosGenerales diariosgeneralesAux:this.diariosgeneraless) {
				if(diariosgeneralesAux.getDiariosGeneralesOriginal().getId().equals(diariosgeneralesOriginal.getId())) {
					existe=true;
					diariosgeneralesOriginal.setId(diariosgeneralesAux.getId());
					diariosgeneralesOriginal.setVersionRow(diariosgeneralesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDiariosGenerales(Boolean esParaCancelar) throws Exception {
		diariosgeneralessAux=new ArrayList<DiariosGenerales>();
		diariosgeneralesAux=new DiariosGenerales();
		
		if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DiariosGenerales diariosgeneralesAux:this.diariosgeneralesLogic.getDiariosGeneraless()) {
					if(diariosgeneralesAux.getId()<0) {
						diariosgeneralessAux.add(diariosgeneralesAux);
					}		
				}
				this.iIdNuevoDiariosGenerales=0L;
				this.diariosgeneralesLogic.getDiariosGeneraless().removeAll(diariosgeneralessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DiariosGenerales diariosgeneralesAux:this.diariosgeneraless) {
					if(diariosgeneralesAux.getId()<0) {
						diariosgeneralessAux.add(diariosgeneralesAux);
					}		
				}
				this.iIdNuevoDiariosGenerales=0L;
				this.diariosgeneraless.removeAll(diariosgeneralessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDiariosGenerales 
					&& this.diariosgeneralesLogic.getDiariosGeneraless().size()>0
					) {
					diariosgeneralesAux=this.diariosgeneralesLogic.getDiariosGeneraless().get(this.diariosgeneralesLogic.getDiariosGeneraless().size() - 1);
				
					if(diariosgeneralesAux.getId()<0) {
						this.diariosgeneralesLogic.getDiariosGeneraless().remove(diariosgeneralesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDiariosGenerales && this.diariosgeneraless.size()>0) {
					diariosgeneralesAux=this.diariosgeneraless.get(this.diariosgeneraless.size() - 1);
				
					if(diariosgeneralesAux.getId()<0) {
						this.diariosgeneraless.remove(diariosgeneralesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDiariosGenerales(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(diariosgenerales.getId()<0) {
				this.diariosgeneralesLogic.getDiariosGeneraless().remove(this.diariosgenerales);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(diariosgenerales.getId()<0) {
				this.diariosgeneraless.remove(this.diariosgenerales);
			}
		}			
	}
	
	public void setEstadosInicialesDiariosGenerales(List<DiariosGenerales> diariosgeneralessAux) throws Exception {
		DiariosGeneralesConstantesFunciones.setEstadosInicialesDiariosGenerales(diariosgeneralessAux);
	}
	
	public void setEstadosInicialesDiariosGenerales(DiariosGenerales diariosgeneralesAux) throws Exception {
		DiariosGeneralesConstantesFunciones.setEstadosInicialesDiariosGenerales(diariosgeneralesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDiariosGeneralesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDiariosGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDiariosGeneralesActual()) {
				if(!this.isEsNuevoDiariosGenerales) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDiariosGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDiariosGenerales=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDiariosGeneralesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Diarios Generales ?", "MANTENIMIENTO DE Diarios Generales", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDiariosGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DiariosGenerales diariosgenerales) throws Exception {
		DiariosGeneralesConstantesFunciones.seleccionarAsignar(this.diariosgenerales,diariosgenerales);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDiariosGenerales=this.isPermisoActualizarOriginalDiariosGenerales;
			
			
			this.seleccionarAsignar(diariosgenerales);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesDiariosGenerales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.diariosgeneralesSessionBean.setsFuncionBusquedaRapida(this.diariosgeneralesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDiariosGenerales) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDiariosGenerales(esParaCancelar);				
				this.cancelarNuevoDiariosGenerales(esParaCancelar);								
			}
			
			this.diariosgenerales=new DiariosGenerales();
			
			this.inicializarDiariosGenerales();
			
			this.actualizarEstadoCeldasBotonesDiariosGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDiariosGenerales() throws Exception {
		try {
			DiariosGeneralesConstantesFunciones.inicializarDiariosGenerales(this.diariosgenerales);
			
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
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.diariosgeneralesLogic.getDiariosGeneraless().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDiariosGeneraless(String sAccionBusqueda,List<DiariosGenerales> diariosgeneralessParaReportes) throws Exception {
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
					sPathReporteFinal="DiariosGenerales"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DiariosGeneralesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DiariosGeneralesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DiariosGenerales"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Diarios Generaleses");		
		parameters.put("busquedapor", DiariosGeneralesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDiariosGenerales=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DiariosGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DiariosGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDiariosGenerales=new JRBeanArrayDataSource(DiariosGeneralesJInternalFrame.TraerDiariosGeneralesBeans(diariosgeneralessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDiariosGenerales);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DiariosGeneralesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DiariosGeneralesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DiariosGeneralesBean.TraerDiariosGeneralesBeans(diariosgeneralessParaReportes).toArray()));
							
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
				this.generarExcelReporteDiariosGeneraless(sAccionBusqueda,sTipoArchivoReporte,diariosgeneralessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDiariosGeneraless(sAccionBusqueda,sTipoArchivoReporte,diariosgeneralessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDiariosGeneralesActionPerformed(null);
					//this.generarExcelReporteDiariosGeneraless(sAccionBusqueda,sTipoArchivoReporte,diariosgeneralessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDiariosGeneraless(sAccionBusqueda,sTipoArchivoReporte,diariosgeneralessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDiariosGeneraless(sAccionBusqueda,sTipoArchivoReporte,diariosgeneralessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDiariosGeneraless(sAccionBusqueda,sTipoArchivoReporte,diariosgeneralessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDiariosGeneraless(String sAccionBusqueda,String sTipoArchivoReporte,List<DiariosGenerales> diariosgeneralessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diariosgenerales";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DiariosGeneraless");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDiariosGenerales("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DiariosGenerales diariosgenerales : diariosgeneralessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DiariosGeneralesConstantesFunciones.generarExcelReporteDataDiariosGenerales("NORMAL",row,workbook,diariosgenerales,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diarios Generales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDiariosGenerales(String sTipo,Row row,Workbook workbook) {
		
		DiariosGeneralesConstantesFunciones.generarExcelReporteHeaderDiariosGenerales(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDiariosGeneraless(String sAccionBusqueda,String sTipoArchivoReporte,List<DiariosGenerales> diariosgeneralessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diariosgenerales_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DiariosGeneraless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DiariosGenerales diariosgenerales : diariosgeneralessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DiariosGeneralesConstantesFunciones.getDiariosGeneralesDescripcion(diariosgenerales));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiariosGeneralesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariosgenerales.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiariosGeneralesConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariosgenerales.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiariosGeneralesConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariosgenerales.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiariosGeneralesConstantesFunciones.LABEL_IDTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariosgenerales.gettipomovimiento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariosgenerales.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariosgenerales.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiariosGeneralesConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariosgenerales.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariosgenerales.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariosgenerales.getcodigo_tipo_movimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariosgenerales.getnumero_mayor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariosgenerales.getnombre_cuenta_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiariosGeneralesConstantesFunciones.LABEL_DEBITOLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_DEBITOLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariosgenerales.getdebito_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiariosGeneralesConstantesFunciones.LABEL_CREDITOLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_CREDITOLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariosgenerales.getcredito_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiariosGeneralesConstantesFunciones.LABEL_DETALLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_DETALLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariosgenerales.getdetalle());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariosgenerales.getcodigo_cuenta_contable());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diarios Generales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDiariosGeneraless(String sAccionBusqueda,String sTipoArchivoReporte,List<DiariosGenerales> diariosgeneralessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DiariosGenerales> diariosgeneralessRespaldo=null;
		
		classes=DiariosGeneralesConstantesFunciones.getClassesRelationshipsOfDiariosGenerales(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.diariosgeneralesLogic.setDatosCliente(this.datosCliente);
		this.diariosgeneralesLogic.setDatosDeep(this.datosDeep);
		this.diariosgeneralesLogic.setIsConDeep(true);
		
		diariosgeneralessRespaldo=this.diariosgeneralesLogic.getDiariosGeneraless();
		
		this.diariosgeneralesLogic.setDiariosGeneraless(diariosgeneralessParaReportes);	
		this.diariosgeneralesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		diariosgeneralessParaReportes=this.diariosgeneralesLogic.getDiariosGeneraless();
		this.diariosgeneralesLogic.setDiariosGeneraless(diariosgeneralessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diariosgenerales_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DiariosGeneraless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDiariosGenerales("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DiariosGenerales diariosgenerales : diariosgeneralessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDiariosGenerales("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DiariosGeneralesConstantesFunciones.generarExcelReporteDataDiariosGenerales("NORMAL",row,workbook,diariosgenerales,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DiariosGeneralesConstantesFunciones.getDiariosGeneralesDescripcion(diariosgenerales));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diarios Generales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDiariosGenerales.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDiariosGenerales.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDiariosGenerales.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDiariosGenerales.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDiariosGenerales() throws Exception {		
		this.startProcessDiariosGenerales(true);
	}
	
	public void startProcessDiariosGenerales(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDiariosGenerales ,this.jPanelParametrosReportesDiariosGenerales, this.jScrollPanelDatosDiariosGenerales,this.jPanelPaginacionDiariosGenerales, this.jScrollPanelDatosEdicionDiariosGenerales, this.jPanelAccionesDiariosGenerales,this.jPanelAccionesFormularioDiariosGenerales,this.jmenuBarDiariosGenerales,this.jmenuBarDetalleDiariosGenerales,this.jTtoolBarDiariosGenerales,this.jTtoolBarDetalleDiariosGenerales);		
		
		final JTabbedPane jTabbedPaneBusquedasDiariosGenerales=this.jTabbedPaneBusquedasDiariosGenerales; 
		
		final JPanel jPanelParametrosReportesDiariosGenerales=this.jPanelParametrosReportesDiariosGenerales;
		//final JScrollPane jScrollPanelDatosDiariosGenerales=this.jScrollPanelDatosDiariosGenerales;
		final JTable jTableDatosDiariosGenerales=this.jTableDatosDiariosGenerales;		
		final JPanel jPanelPaginacionDiariosGenerales=this.jPanelPaginacionDiariosGenerales;
		//final JScrollPane jScrollPanelDatosEdicionDiariosGenerales=this.jScrollPanelDatosEdicionDiariosGenerales;
		final JPanel jPanelAccionesDiariosGenerales=this.jPanelAccionesDiariosGenerales;
		
		JPanel jPanelCamposAuxiliarDiariosGenerales=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDiariosGenerales=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
			jPanelCamposAuxiliarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jPanelCamposDiariosGenerales;
			jPanelAccionesFormularioAuxiliarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jPanelAccionesFormularioDiariosGenerales;
		}
		
		final JPanel jPanelCamposDiariosGenerales=jPanelCamposAuxiliarDiariosGenerales;
		final JPanel jPanelAccionesFormularioDiariosGenerales=jPanelAccionesFormularioAuxiliarDiariosGenerales;
		
		
		final JMenuBar jmenuBarDiariosGenerales=this.jmenuBarDiariosGenerales;
		final JToolBar jTtoolBarDiariosGenerales=this.jTtoolBarDiariosGenerales;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDiariosGenerales=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDiariosGenerales=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
			jmenuBarDetalleAuxiliarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jmenuBarDetalleDiariosGenerales;
			jTtoolBarDetalleAuxiliarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jTtoolBarDetalleDiariosGenerales;
		}
		
		final JMenuBar jmenuBarDetalleDiariosGenerales=jmenuBarDetalleAuxiliarDiariosGenerales;
		final JToolBar jTtoolBarDetalleDiariosGenerales=jTtoolBarDetalleAuxiliarDiariosGenerales;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDiariosGenerales;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDiariosGenerales;
			processRunnable.jTableDatos=jTableDatosDiariosGenerales;
			processRunnable.jPanelCampos=jPanelCamposDiariosGenerales;
			processRunnable.jPanelPaginacion=jPanelPaginacionDiariosGenerales;
			processRunnable.jPanelAcciones=jPanelAccionesDiariosGenerales;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDiariosGenerales;
			
			
			processRunnable.jmenuBar=jmenuBarDiariosGenerales;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDiariosGenerales;
			processRunnable.jTtoolBar=jTtoolBarDiariosGenerales;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDiariosGenerales;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDiariosGenerales ,jPanelParametrosReportesDiariosGenerales,jTableDatosDiariosGenerales, /*jScrollPanelDatosDiariosGenerales,*/jPanelCamposDiariosGenerales,jPanelPaginacionDiariosGenerales, /*jScrollPanelDatosEdicionDiariosGenerales,*/ jPanelAccionesDiariosGenerales,jPanelAccionesFormularioDiariosGenerales,jmenuBarDiariosGenerales,jmenuBarDetalleDiariosGenerales,jTtoolBarDiariosGenerales,jTtoolBarDetalleDiariosGenerales);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDiariosGenerales ,jPanelParametrosReportesDiariosGenerales, jScrollPanelDatosDiariosGenerales,jPanelPaginacionDiariosGenerales, jScrollPanelDatosEdicionDiariosGenerales, jPanelAccionesDiariosGenerales,jPanelAccionesFormularioDiariosGenerales,jmenuBarDiariosGenerales,jmenuBarDetalleDiariosGenerales,jTtoolBarDiariosGenerales,jTtoolBarDetalleDiariosGenerales);
						
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
	
	public void finishProcessDiariosGenerales() {// throws Exception 
		this.finishProcessDiariosGenerales(true);
	}
	
	public void finishProcessDiariosGenerales(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDiariosGenerales ,this.jPanelParametrosReportesDiariosGenerales, this.jScrollPanelDatosDiariosGenerales,this.jPanelPaginacionDiariosGenerales, this.jScrollPanelDatosEdicionDiariosGenerales, this.jPanelAccionesDiariosGenerales,this.jPanelAccionesFormularioDiariosGenerales,this.jmenuBarDiariosGenerales,this.jmenuBarDetalleDiariosGenerales,this.jTtoolBarDiariosGenerales,this.jTtoolBarDetalleDiariosGenerales);		
		
		final JTabbedPane jTabbedPaneBusquedasDiariosGenerales=this.jTabbedPaneBusquedasDiariosGenerales; 
		
		final JPanel jPanelParametrosReportesDiariosGenerales=this.jPanelParametrosReportesDiariosGenerales;
		//final JScrollPane jScrollPanelDatosDiariosGenerales=this.jScrollPanelDatosDiariosGenerales;
		final JTable jTableDatosDiariosGenerales=this.jTableDatosDiariosGenerales;		
		final JPanel jPanelPaginacionDiariosGenerales=this.jPanelPaginacionDiariosGenerales;
		//final JScrollPane jScrollPanelDatosEdicionDiariosGenerales=this.jScrollPanelDatosEdicionDiariosGenerales;
		final JPanel jPanelAccionesDiariosGenerales=this.jPanelAccionesDiariosGenerales;
		
		JPanel jPanelCamposAuxiliarDiariosGenerales=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDiariosGenerales=new JPanel();
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
			jPanelCamposAuxiliarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jPanelCamposDiariosGenerales;
			jPanelAccionesFormularioAuxiliarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jPanelAccionesFormularioDiariosGenerales;
		}
		
		final JPanel jPanelCamposDiariosGenerales=jPanelCamposAuxiliarDiariosGenerales;
		final JPanel jPanelAccionesFormularioDiariosGenerales=jPanelAccionesFormularioAuxiliarDiariosGenerales;
		
		
		final JMenuBar jmenuBarDiariosGenerales=this.jmenuBarDiariosGenerales;		
		final JToolBar jTtoolBarDiariosGenerales=this.jTtoolBarDiariosGenerales;
				
		JMenuBar jmenuBarDetalleAuxiliarDiariosGenerales=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDiariosGenerales=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
			jmenuBarDetalleAuxiliarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jmenuBarDetalleDiariosGenerales;
			jTtoolBarDetalleAuxiliarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jTtoolBarDetalleDiariosGenerales;		
		}
		
		final JMenuBar jmenuBarDetalleDiariosGenerales=jmenuBarDetalleAuxiliarDiariosGenerales;
		final JToolBar jTtoolBarDetalleDiariosGenerales=jTtoolBarDetalleAuxiliarDiariosGenerales;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDiariosGenerales;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDiariosGenerales;
			processRunnable.jTableDatos=jTableDatosDiariosGenerales;
			processRunnable.jPanelCampos=jPanelCamposDiariosGenerales;
			processRunnable.jPanelPaginacion=jPanelPaginacionDiariosGenerales;
			processRunnable.jPanelAcciones=jPanelAccionesDiariosGenerales;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDiariosGenerales;
			
			
			processRunnable.jmenuBar=jmenuBarDiariosGenerales;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDiariosGenerales;
			processRunnable.jTtoolBar=jTtoolBarDiariosGenerales;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDiariosGenerales;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDiariosGenerales ,jPanelParametrosReportesDiariosGenerales, jTableDatosDiariosGenerales,/*jScrollPanelDatosDiariosGenerales,*/jPanelCamposDiariosGenerales,jPanelPaginacionDiariosGenerales, /*jScrollPanelDatosEdicionDiariosGenerales,*/ jPanelAccionesDiariosGenerales,jPanelAccionesFormularioDiariosGenerales,jmenuBarDiariosGenerales,jmenuBarDetalleDiariosGenerales,jTtoolBarDiariosGenerales,jTtoolBarDetalleDiariosGenerales));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDiariosGenerales(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDiariosGenerales(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDiariosGenerales(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDiariosGenerales(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDiariosGenerales,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDiariosGenerales,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDiariosGenerales(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDiariosGenerales,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDiariosGenerales,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.diariosgeneralesConstantesFunciones.getsFinalQueryDiariosGenerales();
		String  finalQueryPaginacionTodos=this.diariosgeneralesConstantesFunciones.getsFinalQueryDiariosGenerales();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DiariosGeneralesConstantesFunciones.getArrayColumnasGlobalesNoDiariosGenerales(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DiariosGeneralesConstantesFunciones.getArrayColumnasGlobalesDiariosGenerales(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DiariosGeneralesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.diariosgeneralessEliminados= new ArrayList<DiariosGenerales>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDiariosGenerales();
		
				///*DiariosGeneralesSessionBean*/this.diariosgeneralesSessionBean=new DiariosGeneralesSessionBean();
			
			if(this.diariosgeneralesSessionBean==null) {
				this.diariosgeneralesSessionBean=new DiariosGeneralesSessionBean();
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
					this.iNumeroPaginacion=DiariosGeneralesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DiariosGeneralesConstantesFunciones.getClassesForeignKeysOfDiariosGenerales(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/diariosgenerales."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			diariosgeneralessAux= new ArrayList<DiariosGenerales>();
			
				
			diariosgeneralesLogic.setDatosCliente(this.datosCliente);
			diariosgeneralesLogic.setDatosDeep(this.datosDeep);
			diariosgeneralesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaDiariosGenerales")) {
				this.sDetalleReporte=DiariosGeneralesConstantesFunciones.getDetalleIndiceBusquedaDiariosGenerales(id_ejercicioBusquedaDiariosGenerales,id_tipo_movimientoBusquedaDiariosGenerales,fecha_emision_desdeBusquedaDiariosGenerales,fecha_emision_hastaBusquedaDiariosGenerales);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					diariosgeneralesLogic.getDiariosGeneralessBusquedaDiariosGenerales(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaDiariosGenerales,id_tipo_movimientoBusquedaDiariosGenerales,fecha_emision_desdeBusquedaDiariosGenerales,fecha_emision_hastaBusquedaDiariosGenerales);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DiariosGeneralesConstantesFunciones.getDetalleIndiceBusquedaDiariosGenerales(id_ejercicioBusquedaDiariosGenerales,id_tipo_movimientoBusquedaDiariosGenerales,fecha_emision_desdeBusquedaDiariosGenerales,fecha_emision_hastaBusquedaDiariosGenerales);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DiariosGeneralesConstantesFunciones.getDetalleIndiceBusquedaDiariosGenerales(id_ejercicioBusquedaDiariosGenerales,id_tipo_movimientoBusquedaDiariosGenerales,fecha_emision_desdeBusquedaDiariosGenerales,fecha_emision_hastaBusquedaDiariosGenerales);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=diariosgeneralesLogic.getDiariosGeneraless()==null||diariosgeneralesLogic.getDiariosGeneraless().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=diariosgeneraless==null|| diariosgeneraless.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						diariosgeneralessAux=new ArrayList<DiariosGenerales>();
						diariosgeneralessAux.addAll(diariosgeneralesLogic.getDiariosGeneraless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diariosgeneralessAux=new ArrayList<DiariosGenerales>();
							diariosgeneralessAux.addAll(diariosgeneraless);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							diariosgeneralesLogic.getDiariosGeneralessBusquedaDiariosGenerales(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaDiariosGenerales,id_tipo_movimientoBusquedaDiariosGenerales,fecha_emision_desdeBusquedaDiariosGenerales,fecha_emision_hastaBusquedaDiariosGenerales);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DiariosGeneralesConstantesFunciones.getDetalleIndiceBusquedaDiariosGenerales(id_ejercicioBusquedaDiariosGenerales,id_tipo_movimientoBusquedaDiariosGenerales,fecha_emision_desdeBusquedaDiariosGenerales,fecha_emision_hastaBusquedaDiariosGenerales);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DiariosGeneralesConstantesFunciones.getDetalleIndiceBusquedaDiariosGenerales(id_ejercicioBusquedaDiariosGenerales,id_tipo_movimientoBusquedaDiariosGenerales,fecha_emision_desdeBusquedaDiariosGenerales,fecha_emision_hastaBusquedaDiariosGenerales);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDiariosGeneraless("BusquedaDiariosGenerales",diariosgeneralesLogic.getDiariosGeneraless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDiariosGeneraless("BusquedaDiariosGenerales",diariosgeneraless);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						diariosgeneralesLogic.setDiariosGeneraless(new ArrayList<DiariosGenerales>());
						diariosgeneralesLogic.getDiariosGeneraless().addAll(diariosgeneralessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diariosgeneraless=new ArrayList<DiariosGenerales>();
							diariosgeneraless.addAll(diariosgeneralessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDiariosGenerales();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDiariosGenerales();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=diariosgeneralesLogic.getDiariosGeneraless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=diariosgeneraless.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=diariosgeneralesLogic.getDiariosGeneraless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=diariosgeneraless.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DiariosGenerales diariosgenerales) {
		Boolean permite=true;
		
		if(this.diariosgenerales.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DiariosGeneralesConstantesFunciones.getOrderByListaDiariosGenerales();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DiariosGeneralesConstantesFunciones.getOrderByListaDiariosGenerales();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiariosGenerales diariosgenerales:diariosgeneralesLogic.getDiariosGeneraless()) {
				if(diariosgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					diariosgeneralesTotales=diariosgenerales;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiariosGenerales diariosgenerales:this.diariosgeneraless) {
				if(diariosgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					diariosgeneralesTotales=diariosgenerales;
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
			this.diariosgeneralesAux=new DiariosGenerales();
			this.diariosgeneralesAux.setsType(Constantes2.S_TOTALES);
			this.diariosgeneralesAux.setIsNew(false);
			this.diariosgeneralesAux.setIsChanged(false);
			this.diariosgeneralesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//DiariosGeneralesConstantesFunciones.TotalizarValoresFilaDiariosGenerales(this.diariosgeneralesLogic.getDiariosGeneraless(),this.diariosgeneralesAux);
				
				//this.diariosgeneralesLogic.getDiariosGeneraless().add(this.diariosgeneralesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DiariosGeneralesConstantesFunciones.TotalizarValoresFilaDiariosGenerales(this.diariosgeneraless,this.diariosgeneralesAux);
				
				this.diariosgeneraless.add(this.diariosgeneralesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		diariosgeneralesTotales=new DiariosGenerales();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.diariosgeneralesLogic.getDiariosGeneraless().remove(diariosgeneralesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.diariosgeneraless.remove(diariosgeneralesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		diariosgeneralesTotales=new DiariosGenerales();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiariosGenerales diariosgenerales:diariosgeneralesLogic.getDiariosGeneraless()) {
				if(diariosgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					diariosgeneralesTotales=diariosgenerales;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DiariosGeneralesConstantesFunciones.TotalizarValoresFilaDiariosGenerales(this.diariosgeneralesLogic.getDiariosGeneraless(),diariosgeneralesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiariosGenerales diariosgenerales:this.diariosgeneraless) {
				if(diariosgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					diariosgeneralesTotales=diariosgenerales;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DiariosGeneralesConstantesFunciones.TotalizarValoresFilaDiariosGenerales(this.diariosgeneraless,diariosgeneralesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDiariosGeneralessBusquedaDiariosGenerales()throws Exception {
		try {
			sAccionBusqueda="BusquedaDiariosGenerales";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiariosGeneralessFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiariosGeneralessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiariosGeneralessFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiariosGeneralessFK_IdTipoMovimiento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMovimiento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDiariosGeneralessBusquedaDiariosGenerales(String sFinalQuery,Long id_ejercicio,Long id_tipo_movimiento,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diariosgeneralesLogic.getDiariosGeneralessBusquedaDiariosGenerales(sFinalQuery,this.pagination,id_ejercicio,id_tipo_movimiento,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiariosGeneralessFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diariosgeneralesLogic.getDiariosGeneralessFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiariosGeneralessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diariosgeneralesLogic.getDiariosGeneralessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiariosGeneralessFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diariosgeneralesLogic.getDiariosGeneralessFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiariosGeneralessFK_IdTipoMovimiento(String sFinalQuery,Long id_tipo_movimiento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diariosgeneralesLogic.getDiariosGeneralessFK_IdTipoMovimiento(sFinalQuery,this.pagination,id_tipo_movimiento);
				
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
	
	public void inicializarPermisosDiariosGenerales() {
		this.isPermisoTodoDiariosGenerales=false;
		this.isPermisoNuevoDiariosGenerales=false;
		this.isPermisoActualizarDiariosGenerales=false;
		this.isPermisoActualizarOriginalDiariosGenerales=false;
		this.isPermisoEliminarDiariosGenerales=false;
		this.isPermisoGuardarCambiosDiariosGenerales=false;
		this.isPermisoConsultaDiariosGenerales=true;
		this.isPermisoBusquedaDiariosGenerales=true;
		this.isPermisoReporteDiariosGenerales=true;
		this.isPermisoOrdenDiariosGenerales=false;		
		this.isPermisoPaginacionMedioDiariosGenerales=false;		
		this.isPermisoPaginacionAltoDiariosGenerales=false;		
		this.isPermisoPaginacionTodoDiariosGenerales=false;		
		this.isPermisoCopiarDiariosGenerales=false;		
		this.isPermisoVerFormDiariosGenerales=false;		
		this.isPermisoDuplicarDiariosGenerales=false;
		this.isPermisoOrdenDiariosGenerales=false;
	}
	
	public void setPermisosUsuarioDiariosGenerales(Boolean isPermiso) {
		this.isPermisoTodoDiariosGenerales=isPermiso;
		this.isPermisoNuevoDiariosGenerales=isPermiso;
		this.isPermisoActualizarDiariosGenerales=isPermiso;
		this.isPermisoActualizarOriginalDiariosGenerales=isPermiso;
		this.isPermisoEliminarDiariosGenerales=isPermiso;
		this.isPermisoGuardarCambiosDiariosGenerales=isPermiso;
		this.isPermisoConsultaDiariosGenerales=isPermiso;
		this.isPermisoBusquedaDiariosGenerales=isPermiso;
		this.isPermisoReporteDiariosGenerales=isPermiso;
		this.isPermisoOrdenDiariosGenerales=isPermiso;		
		this.isPermisoPaginacionMedioDiariosGenerales=isPermiso;		
		this.isPermisoPaginacionAltoDiariosGenerales=isPermiso;		
		this.isPermisoPaginacionTodoDiariosGenerales=isPermiso;		
		this.isPermisoCopiarDiariosGenerales=isPermiso;		
		this.isPermisoVerFormDiariosGenerales=isPermiso;		
		this.isPermisoDuplicarDiariosGenerales=isPermiso;
		this.isPermisoOrdenDiariosGenerales=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDiariosGenerales(Boolean isPermiso) {
		//this.isPermisoTodoDiariosGenerales=isPermiso;
		this.isPermisoNuevoDiariosGenerales=isPermiso;
		this.isPermisoActualizarDiariosGenerales=isPermiso;
		this.isPermisoActualizarOriginalDiariosGenerales=isPermiso;
		this.isPermisoEliminarDiariosGenerales=isPermiso;
		this.isPermisoGuardarCambiosDiariosGenerales=isPermiso;
		//this.isPermisoConsultaDiariosGenerales=isPermiso;
		//this.isPermisoBusquedaDiariosGenerales=isPermiso;
		//this.isPermisoReporteDiariosGenerales=isPermiso;
		//this.isPermisoOrdenDiariosGenerales=isPermiso;		
		//this.isPermisoPaginacionMedioDiariosGenerales=isPermiso;		
		//this.isPermisoPaginacionAltoDiariosGenerales=isPermiso;		
		//this.isPermisoPaginacionTodoDiariosGenerales=isPermiso;		
		//this.isPermisoCopiarDiariosGenerales=isPermiso;		
		//this.isPermisoDuplicarDiariosGenerales=isPermiso;
		//this.isPermisoOrdenDiariosGenerales=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDiariosGeneralesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DiariosGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDiariosGenerales(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDiariosGeneralesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDiariosGeneralesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDiariosGeneralesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDiariosGeneralesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDiariosGenerales() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DiariosGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DiariosGeneralesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDiariosGenerales=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDiariosGenerales=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDiariosGenerales=this.isPermisoActualizarDiariosGenerales;
			this.isPermisoEliminarDiariosGenerales=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDiariosGenerales=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDiariosGenerales=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDiariosGenerales=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDiariosGenerales=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDiariosGenerales=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDiariosGenerales=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDiariosGenerales=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDiariosGenerales=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDiariosGenerales=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDiariosGenerales=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDiariosGenerales=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDiariosGenerales=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDiariosGenerales=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDiariosGenerales.setToolTipText(this.jTableDatosDiariosGenerales.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDiariosGenerales(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDiariosGenerales(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DiariosGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DiariosGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDiariosGenerales() throws Exception {
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
	public void inicializarCombosForeignKeyDiariosGeneralesListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.tipomovimientosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDiariosGeneralesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DiariosGeneralesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoMovimientoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipomovimientosForeignKey==null||this.tipomovimientosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoMovimientoConstantesFunciones.getArrayColumnasGlobalesTipoMovimiento(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoMovimientoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoMovimientosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyDiariosGenerales()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyTipoMovimiento();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.diariosgeneralesSessionBean==null) {
				this.diariosgeneralesSessionBean=new DiariosGeneralesSessionBean();
			}

			if(!this.diariosgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.diariosgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.diariosgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoMovimiento()throws Exception {
		try {

			if(!this.diariosgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
				TipoMovimiento tipomovimiento=new TipoMovimiento();
				TipoMovimientoConstantesFunciones.setTipoMovimientoDescripcion(tipomovimiento,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipomovimiento.setId(null);

				if(!TipoMovimientoConstantesFunciones.ExisteEnLista(this.tipomovimientosForeignKey,tipomovimiento,true)) {

					this.tipomovimientosForeignKey.add(0,tipomovimiento);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDiariosGenerales()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDiariosGenerales(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDiariosGenerales()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDiariosGenerales();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDiariosGenerales(DiariosGenerales diariosgenerales)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDiariosGenerales(DiariosGenerales diariosgenerales,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDiariosGenerales()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDiariosGenerales()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_ejercicioDiariosGenerales.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDiariosGenerales()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDiariosGenerales()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDiariosGenerales()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDiariosGenerales()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFrameTipoMovimientosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDiariosGenerales(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDiariosGenerales()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_empresaDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_empresaDiariosGenerales.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_empresaDiariosGenerales.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_sucursalDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_sucursalDiariosGenerales.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_sucursalDiariosGenerales.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_ejercicioDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_ejercicioDiariosGenerales.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_ejercicioDiariosGenerales.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_tipo_movimientoDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_tipo_movimientoDiariosGenerales.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_tipo_movimientoDiariosGenerales.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public DiariosGeneralesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DiariosGeneralesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DiariosGeneralesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.diariosgeneralesSessionBean=new DiariosGeneralesSessionBean(); 
		this.diariosgeneralesConstantesFunciones=new DiariosGeneralesConstantesFunciones(); 
		this.diariosgeneralesBean=new DiariosGenerales();//(this.diariosgeneralesConstantesFunciones); 		
		this.diariosgeneralesReturnGeneral=new DiariosGeneralesParameterReturnGeneral(); 
		
		this.diariosgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.diariosgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DiariosGeneralesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DiariosGeneralesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DiariosGeneralesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDiariosGenerales(true);
			
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
			
			this.diariosgeneralesConstantesFunciones=new DiariosGeneralesConstantesFunciones(); 
			this.diariosgeneralesBean=new DiariosGenerales();//this.diariosgeneralesConstantesFunciones); 			
			this.diariosgeneralesReturnGeneral=new DiariosGeneralesParameterReturnGeneral(); 
		
			DiariosGeneralesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Diarios Generales Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.diariosgenerales=new DiariosGenerales();
			this.diariosgeneraless = new ArrayList<DiariosGenerales>();
			this.diariosgeneralessAux = new ArrayList<DiariosGenerales>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic=new DiariosGeneralesLogic();
				this.diariosgeneralesLogic.getNewConnexionToDeep("");
			}
			
			//this.diariosgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.diariosgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDiariosGenerales);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDiariosGenerales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDiariosGenerales);	
					}
					
					if(this.jInternalFrameImportacionDiariosGenerales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDiariosGenerales);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDiariosGenerales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDiariosGenerales);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDiariosGenerales);
				this.jInternalFrameDetalleFormDiariosGenerales.setVisible(false);
				this.jInternalFrameDetalleFormDiariosGenerales.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDiariosGenerales!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDiariosGenerales);
					this.jInternalFrameReporteDinamicoDiariosGenerales.setVisible(false);
					this.jInternalFrameReporteDinamicoDiariosGenerales.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDiariosGenerales!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDiariosGenerales);
					this.jInternalFrameImportacionDiariosGenerales.setVisible(false);
					this.jInternalFrameImportacionDiariosGenerales.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDiariosGenerales!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDiariosGenerales);
					this.jInternalFrameOrderByDiariosGenerales.setVisible(false);
					this.jInternalFrameOrderByDiariosGenerales.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDiariosGeneralesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DiariosGeneralesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.diariosgeneralesReturnGeneral=new DiariosGeneralesParameterReturnGeneral();
			
			this.diariosgeneralesParameterGeneral=new DiariosGeneralesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.diariosgeneralesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DiariosGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DiariosGeneralesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.diariosgeneralesSessionBean.getEsGuardarRelacionado(),this.diariosgeneralesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DiariosGeneralesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.diariosgeneralesSessionBean.getEsGuardarRelacionado(),this.diariosgeneralesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDiariosGenerales=false;
			this.isVisibilidadCeldaDuplicarDiariosGenerales=true;
			this.isVisibilidadCeldaCopiarDiariosGenerales=true;
			this.isVisibilidadCeldaVerFormDiariosGenerales=true;
			this.isVisibilidadCeldaOrdenDiariosGenerales=true;
			this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales=false;
			this.isVisibilidadCeldaModificarDiariosGenerales=false;
			this.isVisibilidadCeldaActualizarDiariosGenerales=false;
			this.isVisibilidadCeldaEliminarDiariosGenerales=false;
			this.isVisibilidadCeldaCancelarDiariosGenerales=false;
			this.isVisibilidadCeldaGuardarDiariosGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosDiariosGenerales=false;
			
			
			this.isVisibilidadBusquedaDiariosGenerales=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoMovimiento=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDiariosGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDiariosGenerales();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDiariosGenerales(false);
			
			this.setPermisosUsuarioDiariosGenerales();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado() 
				|| (this.diariosgeneralesSessionBean.getEsGuardarRelacionado() && this.diariosgeneralesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDiariosGeneralesClasesRelacionadas();
			}
			
			if(this.diariosgeneralesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDiariosGeneralesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDiariosGenerales();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDiariosGenerales();
			}
			
			if(!this.isPermisoBusquedaDiariosGenerales) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDiariosGenerales.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DiariosGeneralesConstantesFunciones.getTiposSeleccionarDiariosGenerales());
				
				this.tiposColumnasSelect=DiariosGeneralesConstantesFunciones.getTiposSeleccionarDiariosGenerales(true);
				
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
			//if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDiariosGenerales();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioDiariosGenerales(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioDiariosGenerales(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDiariosGenerales() ;
			
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
			this.ejercicioLogic=new EjercicioLogic();
			this.tipomovimientoLogic=new TipoMovimientoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				diariosgeneralesImplementable= (DiariosGeneralesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DiariosGeneralesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				diariosgeneralesImplementableHome= (DiariosGeneralesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DiariosGeneralesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.diariosgeneraless= new ArrayList<DiariosGenerales>();
			this.diariosgeneralessEliminados= new ArrayList<DiariosGenerales>();
						
			this.isEsNuevoDiariosGenerales=false;
			this.esParaAccionDesdeFormularioDiariosGenerales=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDiariosGenerales(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDiariosGenerales();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DiariosGeneralesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DiariosGeneralesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDiariosGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDiariosGenerales(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDiariosGenerales();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDiariosGenerales();
			}
			
			DiariosGeneralesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDiariosGenerales.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDiariosGenerales.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDiariosGenerales.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDiariosGenerales(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DiariosGenerales: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDiariosGenerales() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDiariosGenerales")) {
				iIndex=this.jInternalFrameDetalleFormDiariosGenerales.jTabbedPaneRelacionesDiariosGenerales.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDiariosGenerales.jTabbedPaneRelacionesDiariosGenerales.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDiariosGenerales();	
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
	
	public void cargarCombosForeignKeyDiariosGenerales(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDiariosGenerales(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDiariosGenerales(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDiariosGeneralesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDiariosGenerales();
		
		this.cargarCombosFrameForeignKeyDiariosGenerales();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDiariosGenerales();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDiariosGenerales();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoMovimiento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoMovimiento(this.tipomovimientosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDiariosGeneralesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.diariosgeneralesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDiariosGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
			
			
			if(jTableDatosDiariosGenerales.getRowCount()>=1) {
				jTableDatosDiariosGenerales.removeRowSelectionInterval(0, jTableDatosDiariosGenerales.getRowCount()-1);						
			}
			
			this.isEsNuevoDiariosGenerales=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDiariosGenerales(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDiariosGenerales(true);			
			//this.diariosgenerales=new DiariosGenerales();
			//this.diariosgenerales.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDiariosGenerales(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDiariosGenerales() ;
			
			if(DiariosGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDiariosGenerales(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.diariosgenerales);	
			this.actualizarInformacion("INFO_PADRE",false,this.diariosgenerales);				
			
			DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
			
			if(this.diariosgeneralesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DiariosGenerales: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDiariosGeneralesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DiariosGenerales> diariosgeneralessSeleccionados=new ArrayList<DiariosGenerales>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDiariosGenerales.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDiariosGenerales.getSelectedRows().length;			
			}
			
			diariosgeneralessSeleccionados=this.getDiariosGeneralessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDiariosGenerales--;			
				//DiariosGenerales diariosgeneralesAux= new DiariosGenerales();			
				//diariosgeneralesAux.setId(this.iIdNuevoDiariosGenerales);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DiariosGenerales diariosgeneralesOrigen=new DiariosGenerales();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DiariosGenerales diariosgeneralesOrigen : diariosgeneralessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							diariosgeneralesOrigen =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diariosgeneralesOrigen =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDiariosGenerales();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.diariosgenerales.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDiariosGenerales(diariosgeneralesOrigen,this.diariosgenerales,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.diariosgeneralesLogic.getDiariosGeneraless().add(this.diariosgeneralesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.diariosgeneraless.add(this.diariosgeneralesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDiariosGenerales(false);
				
				this.jTableDatosDiariosGenerales.setRowSelectionInterval(this.getIndiceNuevoDiariosGenerales(), this.getIndiceNuevoDiariosGenerales());
				
				int iLastRow =  this.jTableDatosDiariosGenerales.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDiariosGenerales.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDiariosGenerales.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDiariosGenerales(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DiariosGenerales> diariosgeneralessSeleccionados=new ArrayList<DiariosGenerales>();									
		
			DiariosGenerales diariosgeneralesOrigen=new DiariosGenerales();
			DiariosGenerales diariosgeneralesDestino=new DiariosGenerales();
				
			diariosgeneralessSeleccionados=this.getDiariosGeneralessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDiariosGenerales.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || diariosgeneralessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDiariosGenerales.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						diariosgeneralesOrigen =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						diariosgeneralesOrigen =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						diariosgeneralesDestino =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						diariosgeneralesDestino =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				diariosgeneralesOrigen =diariosgeneralessSeleccionados.get(0);
				diariosgeneralesDestino =diariosgeneralessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDiariosGenerales(diariosgeneralesOrigen,diariosgeneralesDestino,true,false);
				
				diariosgeneralesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(diariosgeneralesDestino,diariosgeneralesLogic.getDiariosGeneraless());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(diariosgeneralesDestino,diariosgeneraless);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDiariosGenerales(false);
				
				//this.jTableDatosDiariosGenerales.setRowSelectionInterval(this.getIndiceNuevoDiariosGenerales(), this.getIndiceNuevoDiariosGenerales());
				
				int iLastRow =  this.jTableDatosDiariosGenerales.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDiariosGenerales.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDiariosGenerales.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDiariosGenerales(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDiariosGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDiariosGenerales.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDiariosGenerales.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDiariosGenerales.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDiariosGenerales.setVisible(!isVisible);
			this.jPanelPaginacionDiariosGenerales.setVisible(!isVisible);
			this.jPanelAccionesDiariosGenerales.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDiariosGenerales();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDiariosGenerales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDiariosGenerales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDiariosGenerales();
			
			this.abrirFrameOrderByDiariosGenerales();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDiariosGenerales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDiariosGenerales(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDiariosGenerales);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDiariosGenerales.isMaximum()) {
					this.jInternalFrameDetalleFormDiariosGenerales.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDiariosGenerales.setSize(this.jInternalFrameDetalleFormDiariosGenerales.iWidthFormulario,this.jInternalFrameDetalleFormDiariosGenerales.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDiariosGenerales.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDiariosGenerales.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDiariosGenerales.isMaximum()) {
						this.jInternalFrameDetalleFormDiariosGenerales.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDiariosGenerales.jContentPaneDetalleDiariosGenerales.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDiariosGenerales.jTabbedPaneRelacionesDiariosGenerales.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDiariosGenerales.jContentPaneDetalleDiariosGenerales.getWidth(),DiariosGeneralesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDiariosGenerales.jTabbedPaneRelacionesDiariosGenerales.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDiariosGenerales.jContentPaneDetalleDiariosGenerales.getWidth(),DiariosGeneralesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDiariosGenerales.jTabbedPaneRelacionesDiariosGenerales.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDiariosGenerales.jContentPaneDetalleDiariosGenerales.getWidth(),DiariosGeneralesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDiariosGenerales.setVisible(true);
	        this.jInternalFrameDetalleFormDiariosGenerales.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDiariosGenerales() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDiariosGenerales==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDiariosGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDiariosGenerales,false,this);
				} else {
					this.jInternalFrameOrderByDiariosGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDiariosGenerales,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDiariosGenerales);
				this.jInternalFrameOrderByDiariosGenerales.setVisible(false);
				this.jInternalFrameOrderByDiariosGenerales.setSelected(false);
				
				this.jInternalFrameOrderByDiariosGenerales.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDiariosGenerales"));
				
				this.inicializarActualizarBindingTablaOrderByDiariosGenerales();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDiariosGenerales() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDiariosGenerales==null) {
				
				this.jInternalFrameImportacionDiariosGenerales=new ImportacionJInternalFrame(DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDiariosGenerales);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDiariosGenerales);
				this.jInternalFrameImportacionDiariosGenerales.setVisible(false);
				this.jInternalFrameImportacionDiariosGenerales.setSelected(false);


				this.jInternalFrameImportacionDiariosGenerales.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDiariosGenerales"));
				this.jInternalFrameImportacionDiariosGenerales.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDiariosGenerales"));
				this.jInternalFrameImportacionDiariosGenerales.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDiariosGenerales"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDiariosGenerales() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDiariosGenerales==null) {
				this.jInternalFrameReporteDinamicoDiariosGenerales=new ReporteDinamicoJInternalFrame(DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDiariosGenerales);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDiariosGenerales);
				this.jInternalFrameReporteDinamicoDiariosGenerales.setVisible(false);
				this.jInternalFrameReporteDinamicoDiariosGenerales.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDiariosGenerales.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDiariosGenerales"));
				this.jInternalFrameReporteDinamicoDiariosGenerales.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDiariosGenerales"));
				this.jInternalFrameReporteDinamicoDiariosGenerales.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDiariosGenerales"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDiariosGenerales();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDiariosGenerales() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDiariosGenerales);
			
	       	this.jInternalFrameDetalleFormDiariosGenerales.setVisible(false);
	        this.jInternalFrameDetalleFormDiariosGenerales.setSelected(false);
			
			//this.jInternalFrameDetalleFormDiariosGenerales.dispose();
			//this.jInternalFrameDetalleFormDiariosGenerales=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDiariosGenerales() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDiariosGenerales.setVisible(true);
	        this.jInternalFrameReporteDinamicoDiariosGenerales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDiariosGenerales() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDiariosGenerales.setVisible(true);
	        this.jInternalFrameImportacionDiariosGenerales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDiariosGenerales() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDiariosGenerales.setVisible(true);
	        this.jInternalFrameOrderByDiariosGenerales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDiariosGenerales() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDiariosGenerales.setVisible(false);
	        this.jInternalFrameOrderByDiariosGenerales.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDiariosGenerales() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDiariosGenerales.setVisible(false);
	        this.jInternalFrameReporteDinamicoDiariosGenerales.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDiariosGenerales() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDiariosGenerales.setVisible(false);
	        this.jInternalFrameImportacionDiariosGenerales.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDiariosGenerales(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDiariosGenerales(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDiariosGenerales(true);
			//this.isEsNuevoDiariosGenerales=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDiariosGenerales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDiariosGenerales(false) ;
			
			if(diariosgeneralesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DiariosGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDiariosGenerales(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDiariosGenerales(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDiariosGeneralesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDiariosGenerales(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDiariosGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDiariosGenerales(true);
			//this.isEsNuevoDiariosGenerales=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.diariosgenerales.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDiariosGenerales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDiariosGenerales(false) ;
			
			if(DiariosGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDiariosGenerales(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDiariosGenerales(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaTipoMovimiento(List<TipoMovimiento> tipomovimientosForeignKey)throws Exception{
		TableColumn tableColumnTipoMovimiento=this.jTableDatosDiariosGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiariosGenerales,DiariosGeneralesConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));
		TableCellEditor tableCellEditorTipoMovimiento =tableColumnTipoMovimiento.getCellEditor();

		TipoMovimientoTableCell tipomovimientoTableCellFk=(TipoMovimientoTableCell)tableCellEditorTipoMovimiento;

		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.settipomovimientosForeignKey(tipomovimientosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDiariosGenerales.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomovimientoTableCellFk.setRowActual(intSelectedRow);
			//tipomovimientoTableCellFk.settipomovimientosForeignKeyActual(tipomovimientosForeignKey);
		//}


		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.RecargarTipoMovimientosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDiariosGenerales(false);
			
			//if(!this.isEsNuevoDiariosGenerales) {								
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DiariosGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				
			}
			
			if(this.permiteMantenimiento(this.diariosgenerales)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDiariosGenerales=true;
					this.inicializarActualizarBindingTablaDiariosGenerales(false);
					this.isEsNuevoDiariosGenerales=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDiariosGenerales=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDiariosGenerales=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDiariosGenerales(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDiariosGenerales(false);
				
				this.habilitarDeshabilitarControlesDiariosGenerales(false);
			
												
				
				if(DiariosGeneralesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDiariosGenerales();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDiariosGeneralesActionPerformed(evt,diariosgeneralesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDiariosGenerales(this.diariosgenerales,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDiariosGenerales.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,diariosgeneralesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.diariosgenerales.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DiariosGenerales.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiariosGenerales.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				this.diariosgenerales.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				this.diariosgenerales.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.diariosgenerales)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DiariosGeneralesModel) this.jTableDatosDiariosGenerales.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDiariosGenerales=true;
				this.inicializarActualizarBindingTablaDiariosGenerales(false);
				this.isEsNuevoDiariosGenerales=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDiariosGenerales(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDiariosGenerales(false);
				
				this.habilitarDeshabilitarControlesDiariosGenerales(false);
				
				
				
				if(DiariosGeneralesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDiariosGenerales();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDiariosGenerales.getRowCount()>=1) {
				jTableDatosDiariosGenerales.removeRowSelectionInterval(0, jTableDatosDiariosGenerales.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDiariosGenerales(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDiariosGenerales(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDiariosGenerales(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDiariosGenerales(false) ;
			
			this.isEsNuevoDiariosGenerales=false;
			
			if(DiariosGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDiariosGenerales();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDiariosGenerales(false);
				
				//SI ES MANUAL
				if(DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDiariosGenerales();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDiariosGenerales--;			
			//DiariosGenerales diariosgeneralesAux= new DiariosGenerales();			
			//diariosgeneralesAux.setId(this.iIdNuevoDiariosGenerales);
			
			if(this.jInternalFrameDetalleFormDiariosGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDiariosGenerales();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
			
			this.diariosgenerales.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.diariosgeneralesLogic.getDiariosGeneraless().add(this.diariosgeneralesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.diariosgeneraless.add(this.diariosgeneralesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDiariosGenerales(false);
			
			this.jTableDatosDiariosGenerales.setRowSelectionInterval(this.getIndiceNuevoDiariosGenerales(), this.getIndiceNuevoDiariosGenerales());
			
			int iLastRow =  this.jTableDatosDiariosGenerales.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDiariosGenerales.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDiariosGenerales.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDiariosGenerales(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDiariosGenerales(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDiariosGenerales(false);
			
			//SI ES MANUAL
			if(DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDiariosGenerales();
			}
			
			//this.abrirFrameTreeDiariosGenerales();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDiariosGenerales.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDiariosGenerales.setFileImportacion(this.jInternalFrameImportacionDiariosGenerales.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDiariosGenerales.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDiariosGenerales.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDiariosGenerales.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDiariosGenerales.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DiariosGenerales> diariosgeneralessSeleccionados=new ArrayList<DiariosGenerales>();		

		diariosgeneralessSeleccionados=this.getDiariosGeneralessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DiariosGeneralesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DiariosGeneralesBaseDesign.jrxml";
			
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
			
			this.generarReporteDiariosGeneraless("Todos",diariosgeneralessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diarios Generales",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDiariosGenerales.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDiariosGenerales.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DiariosGeneralesConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoTipoMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoTipoMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoTipoMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoTipoMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMayor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMayor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMayor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMayor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiariosGeneralesConstantesFunciones.LABEL_DEBITOLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiariosGeneralesConstantesFunciones.LABEL_CREDITOLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiariosGeneralesConstantesFunciones.LABEL_DETALLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talle_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talle_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talle_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talle_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCuentaContable_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDiariosGenerales.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DiariosGeneralesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					sNombreCampoCategoria="codigo_tipo_movimiento";
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoria="numero_mayor";
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					sNombreCampoCategoria="nombre_cuenta_contable";
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_DEBITOLOCAL:
					sNombreCampoCategoria="debito_local";
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_CREDITOLOCAL:
					sNombreCampoCategoria="credito_local";
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoria="detalle";
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					sNombreCampoCategoria="codigo_cuenta_contable";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DiariosGeneralesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="codigo_tipo_movimiento";
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoriaValor="numero_mayor";
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					sNombreCampoCategoriaValor="nombre_cuenta_contable";
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_DEBITOLOCAL:
					sNombreCampoCategoriaValor="debito_local";
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_CREDITOLOCAL:
					sNombreCampoCategoriaValor="credito_local";
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoriaValor="detalle";
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					sNombreCampoCategoriaValor="codigo_cuenta_contable";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDiariosGenerales.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDiariosGenerales.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DiariosGeneralesConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_tipo_movimiento");
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Mayor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_mayor");
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cuenta_contable");
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_DEBITOLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_local");
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_CREDITOLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_local");
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_DETALLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle",sNombreCampoCategoria,sNombreCampoCategoriaValor,"detalle");
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cuenta_contable");
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
	
	public void jButtonGenerarExcelReporteDinamicoDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DiariosGenerales> diariosgeneralessSeleccionados=new ArrayList<DiariosGenerales>();		
		
		diariosgeneralessSeleccionados=this.getDiariosGeneralessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diariosgenerales";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DiariosGeneraless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDiariosGenerales.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDiariosGenerales.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DiariosGeneralesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DiariosGenerales diariosgenerales:diariosgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariosgenerales.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DiariosGenerales diariosgenerales:diariosgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariosgenerales.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(DiariosGenerales diariosgenerales:diariosgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariosgenerales.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
					iRow++;

					for(DiariosGenerales diariosgenerales:diariosgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariosgenerales.gettipomovimiento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(DiariosGenerales diariosgenerales:diariosgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariosgenerales.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(DiariosGenerales diariosgenerales:diariosgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariosgenerales.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(DiariosGenerales diariosgenerales:diariosgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariosgenerales.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(DiariosGenerales diariosgenerales:diariosgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariosgenerales.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO);
					iRow++;

					for(DiariosGenerales diariosgenerales:diariosgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariosgenerales.getcodigo_tipo_movimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR);
					iRow++;

					for(DiariosGenerales diariosgenerales:diariosgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariosgenerales.getnumero_mayor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
					iRow++;

					for(DiariosGenerales diariosgenerales:diariosgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariosgenerales.getnombre_cuenta_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_DEBITOLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_DEBITOLOCAL);
					iRow++;

					for(DiariosGenerales diariosgenerales:diariosgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariosgenerales.getdebito_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_CREDITOLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_CREDITOLOCAL);
					iRow++;

					for(DiariosGenerales diariosgenerales:diariosgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariosgenerales.getcredito_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_DETALLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_DETALLE);
					iRow++;

					for(DiariosGenerales diariosgenerales:diariosgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariosgenerales.getdetalle());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE);
					iRow++;

					for(DiariosGenerales diariosgenerales:diariosgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariosgenerales.getcodigo_cuenta_contable());
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
			//	this.getFilaCabeceraExportarExcelDiariosGenerales(row);				
			//	iRow++;
			//}				
			
			//for(DiariosGenerales diariosgeneralesAux:diariosgeneralessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDiariosGenerales(diariosgeneralesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diarios Generales",JOptionPane.INFORMATION_MESSAGE);
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
				this.diariosgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDiariosGenerales(false);
			
			//SI ES MANUAL
			if(DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDiariosGenerales();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDiariosGenerales(false);
			
			//SI ES MANUAL
			if(DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDiariosGenerales();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDiariosGenerales(false);
			
			//SI ES MANUAL
			if(DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDiariosGenerales();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDiariosGenerales() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDiariosGenerales.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDiariosGenerales.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDiariosGenerales.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDiariosGenerales.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDiariosGenerales.setMinimumSize(dimensionMinimum);
		this.jTableDatosDiariosGenerales.setMaximumSize(dimensionMaximum);
		this.jTableDatosDiariosGenerales.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDiariosGenerales(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDiariosGenerales(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDiariosGenerales(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDiariosGenerales(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDiariosGenerales(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDiariosGenerales(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDiariosGenerales(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDiariosGenerales(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DiariosGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDiariosGenerales() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDiariosGenerales();
		
		this.inicializarActualizarBindingBotonesManualDiariosGenerales(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDiariosGenerales();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDiariosGenerales() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDiariosGenerales(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDiariosGenerales(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDiariosGenerales.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDiariosGenerales.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDiariosGenerales.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDiariosGenerales.jCheckBoxPostAccionNuevoDiariosGenerales.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDiariosGenerales.jCheckBoxPostAccionSinCerrarDiariosGenerales.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDiariosGenerales.jCheckBoxPostAccionSinMensajeDiariosGenerales.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDiariosGenerales.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDiariosGenerales.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDiariosGenerales.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
				this.jInternalFrameDetalleFormDiariosGenerales.jCheckBoxPostAccionNuevoDiariosGenerales.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDiariosGenerales.jCheckBoxPostAccionSinCerrarDiariosGenerales.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDiariosGenerales.jCheckBoxPostAccionSinMensajeDiariosGenerales.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDiariosGenerales.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDiariosGenerales.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxTiposAccionesFormularioDiariosGenerales.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDiariosGenerales.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDiariosGenerales!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDiariosGenerales.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDiariosGenerales.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDiariosGenerales.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDiariosGenerales.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDiariosGenerales!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDiariosGenerales.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDiariosGenerales.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDiariosGenerales(Boolean esInicializar) throws Exception {
		try	{	
			if(DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDiariosGenerales(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDiariosGenerales() throws Exception {
		try	{
			if(DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDiariosGenerales();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDiariosGenerales() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxTiposAccionesFormularioDiariosGenerales.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxTiposAccionesFormularioDiariosGenerales.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDiariosGenerales() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDiariosGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDiariosGenerales.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDiariosGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDiariosGenerales.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDiariosGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDiariosGenerales.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDiariosGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDiariosGenerales.addItem(reporte);
			}
			
			
			if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDiariosGenerales.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDiariosGenerales.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDiariosGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDiariosGenerales.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDiariosGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDiariosGenerales.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxTiposAccionesFormularioDiariosGenerales.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxTiposAccionesFormularioDiariosGenerales.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDiariosGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDiariosGenerales.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDiariosGenerales.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDiariosGenerales();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDiariosGenerales() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDiariosGenerales!=null) {
				this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDiariosGenerales!=null) {
				this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDiariosGenerales!=null) {
				
				if(this.jInternalFrameReporteDinamicoDiariosGenerales.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDiariosGenerales.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDiariosGenerales.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDiariosGenerales.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDiariosGenerales.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDiariosGenerales.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DiariosGeneralesConstantesFunciones.getTiposSeleccionarDiariosGenerales(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DiariosGeneralesConstantesFunciones.getTiposSeleccionarDiariosGenerales(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDiariosGenerales.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDiariosGenerales.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DiariosGeneralesConstantesFunciones.getTiposSeleccionarDiariosGenerales(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDiariosGenerales.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDiariosGenerales.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDiariosGenerales()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.getSelectedItem()!=null){this.id_ejercicioBusquedaDiariosGenerales=((Ejercicio)this.jComboBoxid_ejercicioBusquedaDiariosGeneralesDiariosGenerales.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.getSelectedItem()!=null){this.id_tipo_movimientoBusquedaDiariosGenerales=((TipoMovimiento)this.jComboBoxid_tipo_movimientoBusquedaDiariosGeneralesDiariosGenerales.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaDiariosGenerales=new Date(this.jDateChooserfecha_emision_desdeBusquedaDiariosGeneralesDiariosGenerales.getDate().getTime());
		this.fecha_emision_hastaBusquedaDiariosGenerales=new Date(this.jDateChooserfecha_emision_hastaBusquedaDiariosGeneralesDiariosGenerales.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDiariosGenerales(Boolean esInicializar) throws Exception {				
		if(DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDiariosGenerales();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDiariosGenerales() throws Exception {
		this.inicializarActualizarBindingTablaDiariosGenerales(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDiariosGenerales() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDiariosGenerales.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDiariosGenerales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDiariosGenerales.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DiariosGeneralesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDiariosGenerales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDiariosGenerales.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DiariosGeneralesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDiariosGeneralesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiariosGeneralesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DiariosGeneralesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDiariosGenerales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDiariosGenerales.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DiariosGeneralesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDiariosGenerales.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDiariosGenerales(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=diariosgeneralesLogic.getDiariosGeneraless().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=diariosgeneraless.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DiariosGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDiariosGenerales.setModel(new DiariosGeneralesModel(this.diariosgeneralesLogic.getDiariosGeneraless(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDiariosGenerales.setModel(new DiariosGeneralesModel(this.diariosgeneraless,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDiariosGenerales!=null && this.jInternalFrameOrderByDiariosGenerales.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDiariosGenerales();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDiariosGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiariosGenerales,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DiariosGeneralesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO,diariosgeneralesConstantesFunciones.resaltarSeleccionarDiariosGenerales,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO,diariosgeneralesConstantesFunciones.resaltarSeleccionarDiariosGenerales,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDiariosGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiariosGenerales,DiariosGeneralesConstantesFunciones.LABEL_ID));

		if(this.diariosgeneralesConstantesFunciones.mostraridDiariosGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiariosGeneralesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diariosgeneralesConstantesFunciones.resaltaridDiariosGenerales,this.diariosgeneralesConstantesFunciones.activaridDiariosGenerales,iSizeTabla,this,true,"idDiariosGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariosgeneralesConstantesFunciones.resaltaridDiariosGenerales,this.diariosgeneralesConstantesFunciones.activaridDiariosGenerales,this,true,"idDiariosGenerales","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiariosGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiariosGenerales,DiariosGeneralesConstantesFunciones.LABEL_CODIGO));

		if(this.diariosgeneralesConstantesFunciones.mostrarcodigoDiariosGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiariosGeneralesConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diariosgeneralesConstantesFunciones.resaltarcodigoDiariosGenerales,this.diariosgeneralesConstantesFunciones.activarcodigoDiariosGenerales,iSizeTabla,this,true,"codigoDiariosGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariosgeneralesConstantesFunciones.resaltarcodigoDiariosGenerales,this.diariosgeneralesConstantesFunciones.activarcodigoDiariosGenerales,this,true,"codigoDiariosGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiariosGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiariosGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiariosGenerales,DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION));

		if(this.diariosgeneralesConstantesFunciones.mostrarfecha_emisionDiariosGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.diariosgeneralesConstantesFunciones.resaltarfecha_emisionDiariosGenerales,this.diariosgeneralesConstantesFunciones.activarfecha_emisionDiariosGenerales,iSizeTabla,this,true,"fecha_emisionDiariosGenerales","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.diariosgeneralesConstantesFunciones.resaltarfecha_emisionDiariosGenerales,this.diariosgeneralesConstantesFunciones.activarfecha_emisionDiariosGenerales,this,true,"fecha_emisionDiariosGenerales","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DiariosGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiariosGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiariosGenerales,DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO));

		if(this.diariosgeneralesConstantesFunciones.mostrarcodigo_tipo_movimientoDiariosGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diariosgeneralesConstantesFunciones.resaltarcodigo_tipo_movimientoDiariosGenerales,this.diariosgeneralesConstantesFunciones.activarcodigo_tipo_movimientoDiariosGenerales,iSizeTabla,this,true,"codigo_tipo_movimientoDiariosGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariosgeneralesConstantesFunciones.resaltarcodigo_tipo_movimientoDiariosGenerales,this.diariosgeneralesConstantesFunciones.activarcodigo_tipo_movimientoDiariosGenerales,this,true,"codigo_tipo_movimientoDiariosGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiariosGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiariosGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiariosGenerales,DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR));

		if(this.diariosgeneralesConstantesFunciones.mostrarnumero_mayorDiariosGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diariosgeneralesConstantesFunciones.resaltarnumero_mayorDiariosGenerales,this.diariosgeneralesConstantesFunciones.activarnumero_mayorDiariosGenerales,iSizeTabla,this,true,"numero_mayorDiariosGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariosgeneralesConstantesFunciones.resaltarnumero_mayorDiariosGenerales,this.diariosgeneralesConstantesFunciones.activarnumero_mayorDiariosGenerales,this,true,"numero_mayorDiariosGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiariosGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiariosGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiariosGenerales,DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE));

		if(this.diariosgeneralesConstantesFunciones.mostrarnombre_cuenta_contableDiariosGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diariosgeneralesConstantesFunciones.resaltarnombre_cuenta_contableDiariosGenerales,this.diariosgeneralesConstantesFunciones.activarnombre_cuenta_contableDiariosGenerales,iSizeTabla,this,true,"nombre_cuenta_contableDiariosGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariosgeneralesConstantesFunciones.resaltarnombre_cuenta_contableDiariosGenerales,this.diariosgeneralesConstantesFunciones.activarnombre_cuenta_contableDiariosGenerales,this,true,"nombre_cuenta_contableDiariosGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiariosGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiariosGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiariosGenerales,DiariosGeneralesConstantesFunciones.LABEL_DEBITOLOCAL));

		if(this.diariosgeneralesConstantesFunciones.mostrardebito_localDiariosGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiariosGeneralesConstantesFunciones.LABEL_DEBITOLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diariosgeneralesConstantesFunciones.resaltardebito_localDiariosGenerales,this.diariosgeneralesConstantesFunciones.activardebito_localDiariosGenerales,iSizeTabla,this,true,"debito_localDiariosGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariosgeneralesConstantesFunciones.resaltardebito_localDiariosGenerales,this.diariosgeneralesConstantesFunciones.activardebito_localDiariosGenerales,this,true,"debito_localDiariosGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DiariosGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiariosGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiariosGenerales,DiariosGeneralesConstantesFunciones.LABEL_CREDITOLOCAL));

		if(this.diariosgeneralesConstantesFunciones.mostrarcredito_localDiariosGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiariosGeneralesConstantesFunciones.LABEL_CREDITOLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diariosgeneralesConstantesFunciones.resaltarcredito_localDiariosGenerales,this.diariosgeneralesConstantesFunciones.activarcredito_localDiariosGenerales,iSizeTabla,this,true,"credito_localDiariosGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariosgeneralesConstantesFunciones.resaltarcredito_localDiariosGenerales,this.diariosgeneralesConstantesFunciones.activarcredito_localDiariosGenerales,this,true,"credito_localDiariosGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DiariosGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiariosGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiariosGenerales,DiariosGeneralesConstantesFunciones.LABEL_DETALLE));

		if(this.diariosgeneralesConstantesFunciones.mostrardetalleDiariosGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiariosGeneralesConstantesFunciones.LABEL_DETALLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diariosgeneralesConstantesFunciones.resaltardetalleDiariosGenerales,this.diariosgeneralesConstantesFunciones.activardetalleDiariosGenerales,iSizeTabla,this,true,"detalleDiariosGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariosgeneralesConstantesFunciones.resaltardetalleDiariosGenerales,this.diariosgeneralesConstantesFunciones.activardetalleDiariosGenerales,this,true,"detalleDiariosGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiariosGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiariosGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiariosGenerales,DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE));

		if(this.diariosgeneralesConstantesFunciones.mostrarcodigo_cuenta_contableDiariosGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diariosgeneralesConstantesFunciones.resaltarcodigo_cuenta_contableDiariosGenerales,this.diariosgeneralesConstantesFunciones.activarcodigo_cuenta_contableDiariosGenerales,iSizeTabla,this,true,"codigo_cuenta_contableDiariosGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariosgeneralesConstantesFunciones.resaltarcodigo_cuenta_contableDiariosGenerales,this.diariosgeneralesConstantesFunciones.activarcodigo_cuenta_contableDiariosGenerales,this,true,"codigo_cuenta_contableDiariosGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiariosGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.diariosgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.diariosgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDiariosGenerales.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.diariosgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.diariosgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDiariosGenerales.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDiariosGenerales && this.isPermisoGuardarCambiosDiariosGenerales) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.diariosgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.diariosgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDiariosGenerales.addColumn(tableColumn);
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
			
			this.jTableDatosDiariosGenerales.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDiariosGenerales && this.isPermisoGuardarCambiosDiariosGenerales) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDiariosGenerales && this.isPermisoGuardarCambiosDiariosGenerales) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDiariosGenerales.moveColumn(this.jTableDatosDiariosGenerales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDiariosGenerales.moveColumn(this.jTableDatosDiariosGenerales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDiariosGenerales.moveColumn(this.jTableDatosDiariosGenerales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDiariosGenerales.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDiariosGenerales.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDiariosGenerales,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DiariosGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDiariosGenerales.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDiariosGenerales.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DiariosGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DiariosGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDiariosGenerales.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDiariosGenerales.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDiariosGenerales.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=diariosgeneralesLogic.getDiariosGeneraless().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=diariosgeneraless.size()-1;
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
		//this.jTableDatosDiariosGenerales.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDiariosGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDiariosGenerales();
			
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
				
				//this.isEsNuevoDiariosGenerales=false;
					
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
			
				if(this.diariosgeneralesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDiariosGenerales==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDiariosGenerales.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDiariosGenerales.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.diariosgenerales.getsType().equals("DUPLICADO")
				   || this.diariosgenerales.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDiariosGenerales=true;
				
				} else {
					this.isEsNuevoDiariosGenerales=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
					if(this.diariosgenerales.getId()>=0 && !this.diariosgenerales.getIsNew()) {						
						this.isEsNuevoDiariosGenerales=false;
						
					} else {
						this.isEsNuevoDiariosGenerales=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDiariosGenerales(esRelaciones);						
				
				this.seleccionarDiariosGenerales(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.diariosgenerales.getId()<0) {
					this.isEsNuevoDiariosGenerales=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDiariosGenerales(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDiariosGenerales(evt,rowIndex);
				}	
				
				if(this.diariosgeneralesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DiariosGenerales: " + this.dDif); 
					}
				}								
				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDiariosGenerales(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.diariosgenerales)) {
					if(this.diariosgenerales.getId()>0) {
						this.diariosgenerales.setIsDeleted(true);
						
						this.diariosgeneralessEliminados.add(this.diariosgenerales);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.diariosgeneralesLogic.getDiariosGeneraless().remove(this.diariosgenerales);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.diariosgeneraless.remove(this.diariosgenerales);				
					}
					
					
					((DiariosGeneralesModel) this.jTableDatosDiariosGenerales.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDiariosGenerales(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDiariosGenerales(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDiariosGenerales) {
			
			if(this.jInternalFrameDetalleFormDiariosGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDiariosGenerales.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDiariosGenerales.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DiariosGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDiariosGenerales(this.diariosgenerales);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDiariosGenerales("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDiariosGenerales(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDiariosGenerales() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDiariosGenerales(DiariosGenerales diariosgenerales) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDiariosGenerales(diariosgenerales,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDiariosGenerales(DiariosGenerales diariosgenerales,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDiariosGenerales(diariosgenerales);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDiariosGenerales(diariosgenerales,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDiariosGenerales(diariosgenerales);
	}
	
	public void setVariablesObjetoActualToFormularioDiariosGenerales(DiariosGenerales diariosgenerales) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDiariosGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDiariosGenerales.jLabelidDiariosGenerales.setText(diariosgenerales.getId().toString());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigoDiariosGenerales.setText(diariosgenerales.getcodigo());
			this.jInternalFrameDetalleFormDiariosGenerales.jDateChooserfecha_emisionDiariosGenerales.setDate(diariosgenerales.getfecha_emision());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigo_tipo_movimientoDiariosGenerales.setText(diariosgenerales.getcodigo_tipo_movimiento());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextAreanumero_mayorDiariosGenerales.setText(diariosgenerales.getnumero_mayor());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextAreanombre_cuenta_contableDiariosGenerales.setText(diariosgenerales.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextFielddebito_localDiariosGenerales.setText(diariosgenerales.getdebito_local().toString());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcredito_localDiariosGenerales.setText(diariosgenerales.getcredito_local().toString());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextAreadetalleDiariosGenerales.setText(diariosgenerales.getdetalle());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigo_cuenta_contableDiariosGenerales.setText(diariosgenerales.getcodigo_cuenta_contable());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DiariosGenerales diariosgeneralesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,diariosgeneralesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DiariosGenerales diariosgeneralesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				diariosgeneralesLocal=this.diariosgenerales;
			} else {
				diariosgeneralesLocal=this.diariosgeneralesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(diariosgeneralesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDiariosGenerales(diariosgeneralesLocal,true);
					
					if(diariosgeneralesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(diariosgeneralesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(diariosgeneralesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDiariosGenerales(DiariosGenerales diariosgenerales,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDiariosGenerales(diariosgenerales,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(diariosgenerales);
	}
	
	public void setVariablesFormularioToObjetoActualDiariosGenerales(DiariosGenerales diariosgenerales,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDiariosGenerales(diariosgenerales,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDiariosGenerales(DiariosGenerales diariosgenerales,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDiariosGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDiariosGenerales.jLabelidDiariosGenerales.getText()==null || this.jInternalFrameDetalleFormDiariosGenerales.jLabelidDiariosGenerales.getText()=="" || this.jInternalFrameDetalleFormDiariosGenerales.jLabelidDiariosGenerales.getText()=="Id") {
				this.jInternalFrameDetalleFormDiariosGenerales.jLabelidDiariosGenerales.setText("0");
			}

			if(conColumnasBase) {diariosgenerales.setId(Long.parseLong(this.jInternalFrameDetalleFormDiariosGenerales.jLabelidDiariosGenerales.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiariosGeneralesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabelIdDiariosGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariosgenerales.setcodigo(this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigoDiariosGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiariosGeneralesConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabelcodigoDiariosGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariosgenerales.setfecha_emision(this.jInternalFrameDetalleFormDiariosGenerales.jDateChooserfecha_emisionDiariosGenerales.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabelfecha_emisionDiariosGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariosgenerales.setcodigo_tipo_movimiento(this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigo_tipo_movimientoDiariosGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabelcodigo_tipo_movimientoDiariosGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariosgenerales.setnumero_mayor(this.jInternalFrameDetalleFormDiariosGenerales.jTextAreanumero_mayorDiariosGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabelnumero_mayorDiariosGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariosgenerales.setnombre_cuenta_contable(this.jInternalFrameDetalleFormDiariosGenerales.jTextAreanombre_cuenta_contableDiariosGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabelnombre_cuenta_contableDiariosGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariosgenerales.setdebito_local(Double.parseDouble(this.jInternalFrameDetalleFormDiariosGenerales.jTextFielddebito_localDiariosGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiariosGeneralesConstantesFunciones.LABEL_DEBITOLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabeldebito_localDiariosGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariosgenerales.setcredito_local(Double.parseDouble(this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcredito_localDiariosGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiariosGeneralesConstantesFunciones.LABEL_CREDITOLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabelcredito_localDiariosGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariosgenerales.setdetalle(this.jInternalFrameDetalleFormDiariosGenerales.jTextAreadetalleDiariosGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiariosGeneralesConstantesFunciones.LABEL_DETALLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabeldetalleDiariosGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariosgenerales.setcodigo_cuenta_contable(this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigo_cuenta_contableDiariosGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiariosGenerales.jLabelcodigo_cuenta_contableDiariosGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDiariosGenerales(DiariosGenerales diariosgeneralesBean,DiariosGenerales diariosgenerales,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDiariosGenerales(DiariosGenerales diariosgeneralesOrigen,DiariosGenerales diariosgenerales,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && diariosgeneralesOrigen.getId()!=null && !diariosgeneralesOrigen.getId().equals(0L))) {diariosgenerales.setId(diariosgeneralesOrigen.getId());}}
			if(conDefault || (!conDefault && diariosgeneralesOrigen.getfecha_emision_desde()!=null && !diariosgeneralesOrigen.getfecha_emision_desde().equals(new Date()))) {diariosgenerales.setfecha_emision_desde(diariosgeneralesOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && diariosgeneralesOrigen.getfecha_emision_hasta()!=null && !diariosgeneralesOrigen.getfecha_emision_hasta().equals(new Date()))) {diariosgenerales.setfecha_emision_hasta(diariosgeneralesOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && diariosgeneralesOrigen.getcodigo()!=null && !diariosgeneralesOrigen.getcodigo().equals(""))) {diariosgenerales.setcodigo(diariosgeneralesOrigen.getcodigo());}
			if(conDefault || (!conDefault && diariosgeneralesOrigen.getfecha_emision()!=null && !diariosgeneralesOrigen.getfecha_emision().equals(new Date()))) {diariosgenerales.setfecha_emision(diariosgeneralesOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && diariosgeneralesOrigen.getcodigo_tipo_movimiento()!=null && !diariosgeneralesOrigen.getcodigo_tipo_movimiento().equals(""))) {diariosgenerales.setcodigo_tipo_movimiento(diariosgeneralesOrigen.getcodigo_tipo_movimiento());}
			if(conDefault || (!conDefault && diariosgeneralesOrigen.getnumero_mayor()!=null && !diariosgeneralesOrigen.getnumero_mayor().equals(""))) {diariosgenerales.setnumero_mayor(diariosgeneralesOrigen.getnumero_mayor());}
			if(conDefault || (!conDefault && diariosgeneralesOrigen.getnombre_cuenta_contable()!=null && !diariosgeneralesOrigen.getnombre_cuenta_contable().equals(""))) {diariosgenerales.setnombre_cuenta_contable(diariosgeneralesOrigen.getnombre_cuenta_contable());}
			if(conDefault || (!conDefault && diariosgeneralesOrigen.getdebito_local()!=null && !diariosgeneralesOrigen.getdebito_local().equals(0.0))) {diariosgenerales.setdebito_local(diariosgeneralesOrigen.getdebito_local());}
			if(conDefault || (!conDefault && diariosgeneralesOrigen.getcredito_local()!=null && !diariosgeneralesOrigen.getcredito_local().equals(0.0))) {diariosgenerales.setcredito_local(diariosgeneralesOrigen.getcredito_local());}
			if(conDefault || (!conDefault && diariosgeneralesOrigen.getdetalle()!=null && !diariosgeneralesOrigen.getdetalle().equals(""))) {diariosgenerales.setdetalle(diariosgeneralesOrigen.getdetalle());}
			if(conDefault || (!conDefault && diariosgeneralesOrigen.getcodigo_cuenta_contable()!=null && !diariosgeneralesOrigen.getcodigo_cuenta_contable().equals(""))) {diariosgenerales.setcodigo_cuenta_contable(diariosgeneralesOrigen.getcodigo_cuenta_contable());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDiariosGenerales(DiariosGenerales diariosgenerales) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDiariosGenerales.jLabelidDiariosGenerales.setText(diariosgenerales.getId().toString());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigoDiariosGenerales.setText(diariosgenerales.getcodigo());
			this.jInternalFrameDetalleFormDiariosGenerales.jDateChooserfecha_emisionDiariosGenerales.setDate(diariosgenerales.getfecha_emision());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigo_tipo_movimientoDiariosGenerales.setText(diariosgenerales.getcodigo_tipo_movimiento());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextAreanumero_mayorDiariosGenerales.setText(diariosgenerales.getnumero_mayor());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextAreanombre_cuenta_contableDiariosGenerales.setText(diariosgenerales.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextFielddebito_localDiariosGenerales.setText(diariosgenerales.getdebito_local().toString());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcredito_localDiariosGenerales.setText(diariosgenerales.getcredito_local().toString());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextAreadetalleDiariosGenerales.setText(diariosgenerales.getdetalle());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigo_cuenta_contableDiariosGenerales.setText(diariosgenerales.getcodigo_cuenta_contable());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDiariosGenerales(DiariosGeneralesBean diariosgeneralesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDiariosGenerales.jLabelidDiariosGenerales.setText(diariosgeneralesBean.getId().toString());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigoDiariosGenerales.setText(diariosgeneralesBean.getcodigo());
			this.jInternalFrameDetalleFormDiariosGenerales.jDateChooserfecha_emisionDiariosGenerales.setDate(diariosgeneralesBean.getfecha_emision());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigo_tipo_movimientoDiariosGenerales.setText(diariosgeneralesBean.getcodigo_tipo_movimiento());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextAreanumero_mayorDiariosGenerales.setText(diariosgeneralesBean.getnumero_mayor());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextAreanombre_cuenta_contableDiariosGenerales.setText(diariosgeneralesBean.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextFielddebito_localDiariosGenerales.setText(diariosgeneralesBean.getdebito_local().toString());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcredito_localDiariosGenerales.setText(diariosgeneralesBean.getcredito_local().toString());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextAreadetalleDiariosGenerales.setText(diariosgeneralesBean.getdetalle());
			this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigo_cuenta_contableDiariosGenerales.setText(diariosgeneralesBean.getcodigo_cuenta_contable());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDiariosGenerales(DiariosGeneralesParameterReturnGeneral diariosgeneralesReturnGeneral,DiariosGeneralesBean diariosgeneralesBean,Boolean conDefault) throws Exception { 
		try {
			DiariosGenerales diariosgeneralesLocal=new DiariosGenerales();
			
			diariosgeneralesLocal=diariosgeneralesReturnGeneral.getDiariosGenerales();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && diariosgeneralesLocal.getId()!=null && !diariosgeneralesLocal.getId().equals(0L))) {diariosgeneralesBean.setId(diariosgeneralesLocal.getId());}}
			if(conDefault || (!conDefault && diariosgeneralesLocal.getcodigo()!=null && !diariosgeneralesLocal.getcodigo().equals(""))) {diariosgeneralesBean.setcodigo(diariosgeneralesLocal.getcodigo());}
			if(conDefault || (!conDefault && diariosgeneralesLocal.getfecha_emision()!=null && !diariosgeneralesLocal.getfecha_emision().equals(new Date()))) {diariosgeneralesBean.setfecha_emision(diariosgeneralesLocal.getfecha_emision());}
			if(conDefault || (!conDefault && diariosgeneralesLocal.getcodigo_tipo_movimiento()!=null && !diariosgeneralesLocal.getcodigo_tipo_movimiento().equals(""))) {diariosgeneralesBean.setcodigo_tipo_movimiento(diariosgeneralesLocal.getcodigo_tipo_movimiento());}
			if(conDefault || (!conDefault && diariosgeneralesLocal.getnumero_mayor()!=null && !diariosgeneralesLocal.getnumero_mayor().equals(""))) {diariosgeneralesBean.setnumero_mayor(diariosgeneralesLocal.getnumero_mayor());}
			if(conDefault || (!conDefault && diariosgeneralesLocal.getnombre_cuenta_contable()!=null && !diariosgeneralesLocal.getnombre_cuenta_contable().equals(""))) {diariosgeneralesBean.setnombre_cuenta_contable(diariosgeneralesLocal.getnombre_cuenta_contable());}
			if(conDefault || (!conDefault && diariosgeneralesLocal.getdebito_local()!=null && !diariosgeneralesLocal.getdebito_local().equals(0.0))) {diariosgeneralesBean.setdebito_local(diariosgeneralesLocal.getdebito_local());}
			if(conDefault || (!conDefault && diariosgeneralesLocal.getcredito_local()!=null && !diariosgeneralesLocal.getcredito_local().equals(0.0))) {diariosgeneralesBean.setcredito_local(diariosgeneralesLocal.getcredito_local());}
			if(conDefault || (!conDefault && diariosgeneralesLocal.getdetalle()!=null && !diariosgeneralesLocal.getdetalle().equals(""))) {diariosgeneralesBean.setdetalle(diariosgeneralesLocal.getdetalle());}
			if(conDefault || (!conDefault && diariosgeneralesLocal.getcodigo_cuenta_contable()!=null && !diariosgeneralesLocal.getcodigo_cuenta_contable().equals(""))) {diariosgeneralesBean.setcodigo_cuenta_contable(diariosgeneralesLocal.getcodigo_cuenta_contable());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDiariosGeneralesGenerico(Long idDiariosGeneralesSeleccionado,JComboBox jComboBoxDiariosGenerales,List<DiariosGenerales> diariosgeneralessLocal)throws Exception {
		try {
			DiariosGenerales  diariosgeneralesTemp=null;

			for(DiariosGenerales diariosgeneralesAux:diariosgeneralessLocal) {
				if(diariosgeneralesAux.getId()!=null && diariosgeneralesAux.getId().equals(idDiariosGeneralesSeleccionado)) {
					diariosgeneralesTemp=diariosgeneralesAux;
					break;
				}
			}

			jComboBoxDiariosGenerales.setSelectedItem(diariosgeneralesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDiariosGeneralesGenerico(JComboBox jComboBoxDiariosGenerales,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDiariosGenerales.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDiariosGenerales.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDiariosGenerales.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDiariosGenerales.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			diariosgenerales=(DiariosGenerales) diariosgeneralesLogic.getDiariosGeneraless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			diariosgenerales =(DiariosGenerales) diariosgeneraless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!diariosgenerales.getIsNew() && !diariosgenerales.getIsChanged() && !diariosgenerales.getIsDeleted()) {
				sDescripcion=diariosgenerales.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=diariosgenerales.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!diariosgenerales.getIsNew() && !diariosgenerales.getIsChanged() && !diariosgenerales.getIsDeleted()) {
				sDescripcion=diariosgenerales.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=diariosgenerales.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!diariosgenerales.getIsNew() && !diariosgenerales.getIsChanged() && !diariosgenerales.getIsDeleted()) {
				sDescripcion=diariosgenerales.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=diariosgenerales.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("TipoMovimiento")) {
			//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
			if(!diariosgenerales.getIsNew() && !diariosgenerales.getIsChanged() && !diariosgenerales.getIsDeleted()) {
				sDescripcion=diariosgenerales.gettipomovimiento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
				sDescripcion=diariosgenerales.gettipomovimiento_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DiariosGenerales diariosgeneralesRow=new DiariosGenerales();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			diariosgeneralesRow=(DiariosGenerales) diariosgeneralesLogic.getDiariosGeneraless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			diariosgeneralesRow=(DiariosGenerales) diariosgeneraless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDiariosGenerales(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDiariosGenerales.setVisible((this.isVisibilidadCeldaNuevoDiariosGenerales && this.isPermisoNuevoDiariosGenerales));			
			this.jButtonDuplicarDiariosGenerales.setVisible((this.isVisibilidadCeldaDuplicarDiariosGenerales && this.isPermisoDuplicarDiariosGenerales));			
			this.jButtonCopiarDiariosGenerales.setVisible((this.isVisibilidadCeldaCopiarDiariosGenerales && this.isPermisoCopiarDiariosGenerales));
			this.jButtonVerFormDiariosGenerales.setVisible((this.isVisibilidadCeldaVerFormDiariosGenerales && this.isPermisoVerFormDiariosGenerales));
			
			this.jButtonAbrirOrderByDiariosGenerales.setVisible((this.isVisibilidadCeldaOrdenDiariosGenerales && this.isPermisoOrdenDiariosGenerales));			
			
			this.jButtonNuevoRelacionesDiariosGenerales.setVisible((this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales && this.isPermisoNuevoDiariosGenerales));			
			this.jButtonNuevoGuardarCambiosDiariosGenerales.setVisible((this.isVisibilidadCeldaNuevoDiariosGenerales && this.isPermisoNuevoDiariosGenerales && this.isPermisoGuardarCambiosDiariosGenerales));
			
			if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonModificarDiariosGenerales.setVisible((this.isVisibilidadCeldaModificarDiariosGenerales && this.isPermisoActualizarDiariosGenerales));	
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonActualizarDiariosGenerales.setVisible((this.isVisibilidadCeldaActualizarDiariosGenerales && this.isPermisoActualizarDiariosGenerales));	
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonEliminarDiariosGenerales.setVisible((this.isVisibilidadCeldaEliminarDiariosGenerales && this.isPermisoEliminarDiariosGenerales));
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonCancelarDiariosGenerales.setVisible(this.isVisibilidadCeldaCancelarDiariosGenerales);							
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonGuardarCambiosDiariosGenerales.setVisible((this.isVisibilidadCeldaGuardarDiariosGenerales && this.isPermisoGuardarCambiosDiariosGenerales));			
			
			}
						
			this.jButtonGuardarCambiosTablaDiariosGenerales.setVisible((this.isVisibilidadCeldaGuardarCambiosDiariosGenerales && this.isPermisoGuardarCambiosDiariosGenerales));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDiariosGenerales.setVisible((this.isVisibilidadCeldaNuevoDiariosGenerales && this.isPermisoNuevoDiariosGenerales));						
			this.jButtonDuplicarToolBarDiariosGenerales.setVisible((this.isVisibilidadCeldaDuplicarDiariosGenerales && this.isPermisoDuplicarDiariosGenerales));						
			this.jButtonCopiarToolBarDiariosGenerales.setVisible((this.isVisibilidadCeldaCopiarDiariosGenerales && this.isPermisoCopiarDiariosGenerales));			
			this.jButtonVerFormToolBarDiariosGenerales.setVisible((this.isVisibilidadCeldaVerFormDiariosGenerales && this.isPermisoVerFormDiariosGenerales));			
			this.jButtonAbrirOrderByToolBarDiariosGenerales.setVisible((this.isVisibilidadCeldaOrdenDiariosGenerales && this.isPermisoOrdenDiariosGenerales));
			this.jButtonNuevoRelacionesToolBarDiariosGenerales.setVisible((this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales && this.isPermisoNuevoDiariosGenerales));			
			this.jButtonNuevoGuardarCambiosToolBarDiariosGenerales.setVisible((this.isVisibilidadCeldaNuevoDiariosGenerales && this.isPermisoNuevoDiariosGenerales && this.isPermisoGuardarCambiosDiariosGenerales));			
			
			if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonModificarToolBarDiariosGenerales.setVisible((this.isVisibilidadCeldaModificarDiariosGenerales && this.isPermisoActualizarDiariosGenerales));	
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonActualizarToolBarDiariosGenerales.setVisible((this.isVisibilidadCeldaActualizarDiariosGenerales  && this.isPermisoActualizarDiariosGenerales));	
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonEliminarToolBarDiariosGenerales.setVisible((this.isVisibilidadCeldaEliminarDiariosGenerales && this.isPermisoEliminarDiariosGenerales));
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonCancelarToolBarDiariosGenerales.setVisible(this.isVisibilidadCeldaCancelarDiariosGenerales);				
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonGuardarCambiosToolBarDiariosGenerales.setVisible((this.isVisibilidadCeldaGuardarDiariosGenerales && this.isPermisoGuardarCambiosDiariosGenerales));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDiariosGenerales.setVisible((this.isVisibilidadCeldaGuardarCambiosDiariosGenerales && this.isPermisoGuardarCambiosDiariosGenerales));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDiariosGenerales.setVisible((this.isVisibilidadCeldaNuevoDiariosGenerales && this.isPermisoNuevoDiariosGenerales));			
			this.jMenuItemDuplicarDiariosGenerales.setVisible((this.isVisibilidadCeldaDuplicarDiariosGenerales && this.isPermisoDuplicarDiariosGenerales));			
			this.jMenuItemCopiarDiariosGenerales.setVisible((this.isVisibilidadCeldaCopiarDiariosGenerales && this.isPermisoCopiarDiariosGenerales));			
			this.jMenuItemVerFormDiariosGenerales.setVisible((this.isVisibilidadCeldaVerFormDiariosGenerales && this.isPermisoVerFormDiariosGenerales));			
			this.jMenuItemAbrirOrderByDiariosGenerales.setVisible((this.isVisibilidadCeldaOrdenDiariosGenerales && this.isPermisoOrdenDiariosGenerales));			
			//this.jMenuItemMostrarOcultarDiariosGenerales.setVisible((this.isVisibilidadCeldaOrdenDiariosGenerales && this.isPermisoOrdenDiariosGenerales));
			this.jMenuItemDetalleAbrirOrderByDiariosGenerales.setVisible((this.isVisibilidadCeldaOrdenDiariosGenerales && this.isPermisoOrdenDiariosGenerales));			
			//this.jMenuItemDetalleMostrarOcultarDiariosGenerales.setVisible((this.isVisibilidadCeldaOrdenDiariosGenerales && this.isPermisoOrdenDiariosGenerales));			
			this.jMenuItemNuevoRelacionesDiariosGenerales.setVisible((this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales && this.isPermisoNuevoDiariosGenerales));			
			this.jMenuItemNuevoGuardarCambiosDiariosGenerales.setVisible((this.isVisibilidadCeldaNuevoDiariosGenerales && this.isPermisoNuevoDiariosGenerales && this.isPermisoGuardarCambiosDiariosGenerales));									
			
			if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
			this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemModificarDiariosGenerales.setVisible((this.isVisibilidadCeldaModificarDiariosGenerales && this.isPermisoActualizarDiariosGenerales));	
			this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemActualizarDiariosGenerales.setVisible((this.isVisibilidadCeldaActualizarDiariosGenerales && this.isPermisoActualizarDiariosGenerales));	
			this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemEliminarDiariosGenerales.setVisible((this.isVisibilidadCeldaEliminarDiariosGenerales && this.isPermisoEliminarDiariosGenerales));
			this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemCancelarDiariosGenerales.setVisible(this.isVisibilidadCeldaCancelarDiariosGenerales);				
			}
			
			this.jMenuItemGuardarCambiosDiariosGenerales.setVisible((this.isVisibilidadCeldaGuardarDiariosGenerales && this.isPermisoGuardarCambiosDiariosGenerales));						
			this.jMenuItemGuardarCambiosTablaDiariosGenerales.setVisible((this.isVisibilidadCeldaGuardarCambiosDiariosGenerales && this.isPermisoGuardarCambiosDiariosGenerales));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDiariosGenerales=this.jButtonNuevoDiariosGenerales.isVisible();
			this.isVisibilidadCeldaDuplicarDiariosGenerales=this.jButtonDuplicarDiariosGenerales.isVisible();
			this.isVisibilidadCeldaCopiarDiariosGenerales=this.jButtonCopiarDiariosGenerales.isVisible();
			this.isVisibilidadCeldaVerFormDiariosGenerales=this.jButtonVerFormDiariosGenerales.isVisible();
			
			this.isVisibilidadCeldaOrdenDiariosGenerales=this.jButtonAbrirOrderByDiariosGenerales.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales=this.jButtonNuevoRelacionesDiariosGenerales.isVisible();
			this.isVisibilidadCeldaModificarDiariosGenerales=this.jButtonModificarDiariosGenerales.isVisible();
			
			if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
			this.isVisibilidadCeldaActualizarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jButtonActualizarDiariosGenerales.isVisible();
			this.isVisibilidadCeldaEliminarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jButtonEliminarDiariosGenerales.isVisible();
			this.isVisibilidadCeldaCancelarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jButtonCancelarDiariosGenerales.isVisible();
			this.isVisibilidadCeldaGuardarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jButtonGuardarCambiosDiariosGenerales.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDiariosGenerales=this.jButtonGuardarCambiosTablaDiariosGenerales.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDiariosGenerales=this.jButtonNuevoToolBarDiariosGenerales.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales=this.jButtonNuevoRelacionesToolBarDiariosGenerales.isVisible();
			
			if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
			this.isVisibilidadCeldaModificarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jButtonModificarToolBarDiariosGenerales.isVisible();
			this.isVisibilidadCeldaActualizarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jButtonActualizarToolBarDiariosGenerales.isVisible();
			this.isVisibilidadCeldaEliminarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jButtonEliminarToolBarDiariosGenerales.isVisible();
			this.isVisibilidadCeldaCancelarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jButtonCancelarToolBarDiariosGenerales.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDiariosGenerales=this.jButtonGuardarCambiosToolBarDiariosGenerales.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDiariosGenerales=this.jButtonGuardarCambiosTablaToolBarDiariosGenerales.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDiariosGenerales=this.jMenuItemNuevoDiariosGenerales.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales=this.jMenuItemNuevoRelacionesDiariosGenerales.isVisible();
			
			if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
			this.isVisibilidadCeldaModificarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemModificarDiariosGenerales.isVisible();
			this.isVisibilidadCeldaActualizarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemActualizarDiariosGenerales.isVisible();
			this.isVisibilidadCeldaEliminarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemEliminarDiariosGenerales.isVisible();
			this.isVisibilidadCeldaCancelarDiariosGenerales=this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemCancelarDiariosGenerales.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDiariosGenerales=this.jMenuItemGuardarCambiosDiariosGenerales.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDiariosGenerales=this.jMenuItemGuardarCambiosTablaDiariosGenerales.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDiariosGenerales(Boolean esInicializar) {
		if(DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.diariosgeneralesSessionBean.getConGuardarRelaciones()) {
				//if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDiariosGenerales();
			}
			
			this.inicializarActualizarBindingBotonesManualDiariosGenerales(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDiariosGenerales() {
		this.jButtonNuevoDiariosGenerales.setVisible(this.isPermisoNuevoDiariosGenerales);			
		this.jButtonDuplicarDiariosGenerales.setVisible(this.isPermisoDuplicarDiariosGenerales);			
		this.jButtonCopiarDiariosGenerales.setVisible(this.isPermisoCopiarDiariosGenerales);			
		this.jButtonVerFormDiariosGenerales.setVisible(this.isPermisoVerFormDiariosGenerales);			
		
		this.jButtonAbrirOrderByDiariosGenerales.setVisible(this.isPermisoOrdenDiariosGenerales);					
		
		this.jButtonNuevoRelacionesDiariosGenerales.setVisible(this.isPermisoNuevoDiariosGenerales);			
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonModificarDiariosGenerales.setVisible(this.isPermisoActualizarDiariosGenerales);	
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonActualizarDiariosGenerales.setVisible(this.isPermisoActualizarDiariosGenerales);	
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonEliminarDiariosGenerales.setVisible(this.isPermisoEliminarDiariosGenerales);
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonCancelarDiariosGenerales.setVisible(this.isVisibilidadCeldaCancelarDiariosGenerales);						
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonGuardarCambiosDiariosGenerales.setVisible(this.isPermisoGuardarCambiosDiariosGenerales);							
		}
		
		this.jButtonGuardarCambiosTablaDiariosGenerales.setVisible(this.isPermisoActualizarDiariosGenerales);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDiariosGenerales() {
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonModificarDiariosGenerales.setVisible(this.isPermisoActualizarDiariosGenerales);	
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonActualizarDiariosGenerales.setVisible(this.isPermisoActualizarDiariosGenerales);	
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonEliminarDiariosGenerales.setVisible(this.isPermisoEliminarDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonCancelarDiariosGenerales.setVisible(this.isVisibilidadCeldaCancelarDiariosGenerales);							
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonGuardarCambiosDiariosGenerales.setVisible((this.isVisibilidadCeldaGuardarDiariosGenerales && this.isPermisoGuardarCambiosDiariosGenerales));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDiariosGenerales() {
		if(DiariosGeneralesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDiariosGenerales();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDiariosGenerales() {
	}
	
	public void jTableDatosDiariosGeneralesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDiariosGenerales(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDiariosGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariosgenerales==null) {
						this.diariosgenerales = new DiariosGenerales();
					}

					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				}

				if(this.diariosgenerales.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.diariosgenerales.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiariosGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDiariosGeneralesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDiariosGenerales(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiariosGenerales.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiariosGenerales.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.diariosgeneralesLogic.getConnexion());

				if(this.diariosgenerales.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.diariosgenerales.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiariosGenerales=(TitledBorder)this.jScrollPanelDatosDiariosGenerales.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDiariosGenerales.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDiariosGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariosgenerales==null) {
						this.diariosgenerales = new DiariosGenerales();
					}

					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				}

				if(this.diariosgenerales.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.diariosgenerales.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiariosGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDiariosGeneralesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDiariosGenerales(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiariosGenerales.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiariosGenerales.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.diariosgeneralesLogic.getConnexion());

				if(this.diariosgenerales.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.diariosgenerales.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiariosGenerales=(TitledBorder)this.jScrollPanelDatosDiariosGenerales.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDiariosGenerales.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDiariosGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariosgenerales==null) {
						this.diariosgenerales = new DiariosGenerales();
					}

					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				}

				if(this.diariosgenerales.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.diariosgenerales.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiariosGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioDiariosGeneralesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebDiariosGenerales(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiariosGenerales.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiariosGenerales.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.diariosgeneralesLogic.getConnexion());

				if(this.diariosgenerales.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.diariosgenerales.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiariosGenerales=(TitledBorder)this.jScrollPanelDatosDiariosGenerales.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderDiariosGenerales.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioDiariosGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariosgenerales==null) {
						this.diariosgenerales = new DiariosGenerales();
					}

					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				}

				if(this.diariosgenerales.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.diariosgenerales.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiariosGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_movimientoDiariosGeneralesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomovimiento=true;

			idTienePermisotipomovimiento=this.tienePermisosUsuarioEnPaginaWebDiariosGenerales(TipoMovimientoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomovimiento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiariosGenerales.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiariosGenerales.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);

				this.tipomovimientoBeanSwingJInternalFrame=new TipoMovimientoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomovimientoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomovimientoBeanSwingJInternalFrame.getTipoMovimientoLogic().setConnexion(this.diariosgeneralesLogic.getConnexion());

				if(this.diariosgenerales.getid_tipo_movimiento()!=null) {
					this.tipomovimientoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomovimientoBeanSwingJInternalFrame.setIdActual(this.diariosgenerales.getid_tipo_movimiento());
					this.tipomovimientoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMovimiento();
				}

				JInternalFrameBase jinternalFrame =this.tipomovimientoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiariosGenerales=(TitledBorder)this.jScrollPanelDatosDiariosGenerales.getBorder();
				TitledBorder titledBordertipomovimiento=(TitledBorder)this.tipomovimientoBeanSwingJInternalFrame.jScrollPanelDatosTipoMovimiento.getBorder();

				titledBordertipomovimiento.setTitle(titledBorderDiariosGenerales.getTitle() + " -> Tipo Movimiento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_movimientoDiariosGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariosgenerales==null) {
						this.diariosgenerales = new DiariosGenerales();
					}

					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				}

				if(this.diariosgenerales.getid_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_movimiento = "+this.diariosgenerales.getid_tipo_movimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiariosGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeDiariosGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariosgenerales==null) {
						this.diariosgenerales = new DiariosGenerales();
					}

					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				}

				if(this.diariosgenerales.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.diariosgenerales.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiariosGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaDiariosGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariosgenerales==null) {
						this.diariosgenerales = new DiariosGenerales();
					}

					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				}

				if(this.diariosgenerales.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.diariosgenerales.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiariosGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoDiariosGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariosgenerales==null) {
						this.diariosgenerales = new DiariosGenerales();
					}

					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				}

				if(this.diariosgenerales.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.diariosgenerales.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiariosGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionDiariosGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariosgenerales==null) {
						this.diariosgenerales = new DiariosGenerales();
					}

					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				}

				if(this.diariosgenerales.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.diariosgenerales.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiariosGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_tipo_movimientoDiariosGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariosgenerales==null) {
						this.diariosgenerales = new DiariosGenerales();
					}

					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				}

				if(this.diariosgenerales.getcodigo_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_tipo_movimiento like '%"+this.diariosgenerales.getcodigo_tipo_movimiento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiariosGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mayorDiariosGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariosgenerales==null) {
						this.diariosgenerales = new DiariosGenerales();
					}

					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				}

				if(this.diariosgenerales.getnumero_mayor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_mayor like '%"+this.diariosgenerales.getnumero_mayor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiariosGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cuenta_contableDiariosGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariosgenerales==null) {
						this.diariosgenerales = new DiariosGenerales();
					}

					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				}

				if(this.diariosgenerales.getnombre_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cuenta_contable like '%"+this.diariosgenerales.getnombre_cuenta_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiariosGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_localDiariosGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariosgenerales==null) {
						this.diariosgenerales = new DiariosGenerales();
					}

					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				}

				if(this.diariosgenerales.getdebito_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_local = "+this.diariosgenerales.getdebito_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiariosGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_localDiariosGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariosgenerales==null) {
						this.diariosgenerales = new DiariosGenerales();
					}

					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				}

				if(this.diariosgenerales.getcredito_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_local = "+this.diariosgenerales.getcredito_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiariosGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondetalleDiariosGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariosgenerales==null) {
						this.diariosgenerales = new DiariosGenerales();
					}

					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				}

				if(this.diariosgenerales.getdetalle()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where detalle like '%"+this.diariosgenerales.getdetalle()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiariosGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_cuenta_contableDiariosGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.getdiariosgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariosgenerales==null) {
						this.diariosgenerales = new DiariosGenerales();
					}

					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);
				}

				if(this.diariosgenerales.getcodigo_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cuenta_contable like '%"+this.diariosgenerales.getcodigo_cuenta_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiariosGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaDiariosGeneralesDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiariosGenerales(false,false);

			this.getDiariosGeneralessBusquedaDiariosGenerales();

			this.inicializarActualizarBindingDiariosGenerales(false);

			//if(DiariosGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiariosGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiariosGenerales(false,false);

			this.getDiariosGeneralessFK_IdEjercicio();

			this.inicializarActualizarBindingDiariosGenerales(false);

			//if(DiariosGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiariosGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiariosGenerales(false,false);

			this.getDiariosGeneralessFK_IdEmpresa();

			this.inicializarActualizarBindingDiariosGenerales(false);

			//if(DiariosGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiariosGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiariosGenerales(false,false);

			this.getDiariosGeneralessFK_IdSucursal();

			this.inicializarActualizarBindingDiariosGenerales(false);

			//if(DiariosGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiariosGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMovimientoDiariosGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiariosGenerales(false,false);

			this.getDiariosGeneralessFK_IdTipoMovimiento();

			this.inicializarActualizarBindingDiariosGenerales(false);

			//if(DiariosGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiariosGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariosgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDiariosGenerales() {
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
			this.jInternalFrameDetalleFormDiariosGenerales.setVisible(false);	    			
			this.jInternalFrameDetalleFormDiariosGenerales.dispose();
			this.jInternalFrameDetalleFormDiariosGenerales=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDiariosGenerales!=null) {
			this.jInternalFrameReporteDinamicoDiariosGenerales.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDiariosGenerales.dispose();
			this.jInternalFrameReporteDinamicoDiariosGenerales=null;
		}
		
		if(this.jInternalFrameImportacionDiariosGenerales!=null) {
			this.jInternalFrameImportacionDiariosGenerales.setVisible(false);	    			
			this.jInternalFrameImportacionDiariosGenerales.dispose();
			this.jInternalFrameImportacionDiariosGenerales=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDiariosGenerales();
			
			DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
			
			
			if(sTipo.equals("NuevoDiariosGenerales")) {
				jButtonNuevoDiariosGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDiariosGenerales")) {
				jButtonDuplicarDiariosGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDiariosGenerales")) {
				jButtonCopiarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("VerFormDiariosGenerales")) {
				jButtonVerFormDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDiariosGenerales")) {
				jButtonNuevoDiariosGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDiariosGenerales")) {
				jButtonDuplicarDiariosGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDiariosGenerales")) {
				jButtonNuevoDiariosGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDiariosGenerales")) {
				jButtonDuplicarDiariosGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDiariosGenerales")) {
				jButtonNuevoDiariosGeneralesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDiariosGenerales")) {
				jButtonNuevoDiariosGeneralesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDiariosGenerales")) {
				jButtonNuevoDiariosGeneralesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDiariosGenerales")) {
				jButtonModificarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDiariosGenerales")) {
				jButtonModificarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDiariosGenerales")) {
				jButtonModificarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDiariosGenerales")) {
				jButtonActualizarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDiariosGenerales")) {
				jButtonActualizarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDiariosGenerales")) {
				jButtonActualizarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("EliminarDiariosGenerales")) {
				jButtonEliminarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDiariosGenerales")) {
				jButtonEliminarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDiariosGenerales")) {
				jButtonEliminarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CancelarDiariosGenerales")) {
				jButtonCancelarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDiariosGenerales")) {
				jButtonCancelarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDiariosGenerales")) {
				jButtonCancelarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CerrarDiariosGenerales")) {
				jButtonCerrarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDiariosGenerales")) {
				jButtonCerrarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDiariosGenerales")) {
				jButtonCerrarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDiariosGenerales")) {
				jButtonMostrarOcultarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDiariosGenerales")) {
				jButtonCancelarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDiariosGenerales")) {
				jButtonGuardarCambiosDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDiariosGenerales")) {
				jButtonGuardarCambiosDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDiariosGenerales")) {
				jButtonCopiarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDiariosGenerales")) {
				jButtonVerFormDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDiariosGenerales")) {
				jButtonGuardarCambiosDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDiariosGenerales")) {
				jButtonCopiarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDiariosGenerales")) {
				jButtonVerFormDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDiariosGenerales")) {
				jButtonGuardarCambiosDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDiariosGenerales")) {
				jButtonGuardarCambiosDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDiariosGenerales")) {
				jButtonGuardarCambiosDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDiariosGenerales")) {
				jButtonRecargarInformacionDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDiariosGenerales")) {
				jButtonRecargarInformacionDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDiariosGenerales")) {
				jButtonRecargarInformacionDiariosGeneralesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDiariosGenerales")) {
				jButtonAnterioresDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDiariosGenerales")) {
				jButtonAnterioresDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDiariosGenerales")) {
				jButtonAnterioresDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDiariosGenerales")) {
				jButtonSiguientesDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDiariosGenerales")) {
				jButtonSiguientesDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDiariosGenerales")) {
				jButtonSiguientesDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDiariosGenerales") || sTipo.equals("MenuItemDetalleAbrirOrderByDiariosGenerales")) {
				jButtonAbrirOrderByDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDiariosGenerales") || sTipo.equals("MenuItemDetalleMostrarOcultarDiariosGenerales")) {
				jButtonMostrarOcultarDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDiariosGenerales")) {
				jButtonNuevoGuardarCambiosDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDiariosGenerales")) {
				jButtonNuevoGuardarCambiosDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDiariosGenerales")) {
				jButtonNuevoGuardarCambiosDiariosGeneralesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDiariosGenerales")) {
				jButtonCerrarReporteDinamicoDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDiariosGenerales")) {
				jButtonGenerarReporteDinamicoDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDiariosGenerales")) {
				
				jButtonGenerarExcelReporteDinamicoDiariosGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDiariosGenerales")) {
				jButtonCerrarImportacionDiariosGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDiariosGenerales")) {
				
				jButtonGenerarImportacionDiariosGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDiariosGenerales")) {
				
				jButtonAbrirImportacionDiariosGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDiariosGenerales")) {
				jComboBoxTiposAccionesDiariosGeneralesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDiariosGenerales")) {
				jComboBoxTiposRelacionesDiariosGeneralesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDiariosGenerales")) {
				jComboBoxTiposAccionesDiariosGeneralesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDiariosGenerales")) {
				
				jComboBoxTiposSeleccionarDiariosGeneralesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDiariosGenerales")) {
				jTextFieldValorCampoGeneralDiariosGeneralesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDiariosGenerales")) {
				jButtonAbrirOrderByDiariosGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDiariosGenerales")) {
				jButtonAbrirOrderByDiariosGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDiariosGenerales")) {
				jButtonCerrarOrderByDiariosGeneralesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDiariosGeneralesBusqueda")) {
				this.jButtonidDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDiariosGeneralesUpdate")) {
				this.jButtonid_empresaDiariosGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDiariosGeneralesBusqueda")) {
				this.jButtonid_empresaDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDiariosGeneralesUpdate")) {
				this.jButtonid_sucursalDiariosGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDiariosGeneralesBusqueda")) {
				this.jButtonid_sucursalDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDiariosGeneralesUpdate")) {
				this.jButtonid_ejercicioDiariosGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDiariosGeneralesBusqueda")) {
				this.jButtonid_ejercicioDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoDiariosGeneralesUpdate")) {
				this.jButtonid_tipo_movimientoDiariosGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoDiariosGeneralesBusqueda")) {
				this.jButtonid_tipo_movimientoDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeDiariosGeneralesBusqueda")) {
				this.jButtonfecha_emision_desdeDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaDiariosGeneralesBusqueda")) {
				this.jButtonfecha_emision_hastaDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDiariosGeneralesBusqueda")) {
				this.jButtoncodigoDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionDiariosGeneralesBusqueda")) {
				this.jButtonfecha_emisionDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_movimientoDiariosGeneralesBusqueda")) {
				this.jButtoncodigo_tipo_movimientoDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorDiariosGeneralesBusqueda")) {
				this.jButtonnumero_mayorDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contableDiariosGeneralesBusqueda")) {
				this.jButtonnombre_cuenta_contableDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_localDiariosGeneralesBusqueda")) {
				this.jButtondebito_localDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_localDiariosGeneralesBusqueda")) {
				this.jButtoncredito_localDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleDiariosGeneralesBusqueda")) {
				this.jButtondetalleDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_contableDiariosGeneralesBusqueda")) {
				this.jButtoncodigo_cuenta_contableDiariosGeneralesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaDiariosGeneralesDiariosGenerales")) {
				this.jButtonBusquedaDiariosGeneralesDiariosGeneralesActionPerformed(evt);
			}
			
			;
			
			
			DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDiariosGenerales();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiariosGeneralesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariosgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariosgenerales);
				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
				
				


				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiariosGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiariosGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DiariosGenerales diariosgeneralesLocal=null;
			
			if(!this.getEsControlTabla()) {
				diariosgeneralesLocal=this.diariosgenerales;
			} else {
				diariosgeneralesLocal=this.diariosgeneralesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariosgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariosgenerales);
				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
							
				
				


				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiariosGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiariosGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiariosGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesAnterior =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diariosgeneralesAnterior =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
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
			
			DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
			
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
			
			


			
			DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiariosGeneralesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariosgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariosgenerales);
				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
								
						
				


				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiariosGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiariosGenerales.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariosgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariosgenerales);
				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
								
				
				


				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiariosGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiariosGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiariosGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesAnterior =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diariosgeneralesAnterior =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariosgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariosgenerales);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiariosGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesAnterior =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diariosgeneralesAnterior =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiariosGeneralesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.diariosgenerales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.diariosgenerales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariosgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariosgenerales);
				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
							
				
				


				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiariosGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiariosGenerales.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiariosGeneralesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgeneralesAnterior =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.diariosgeneralesAnterior =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
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
			
			DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
			
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
			
			


			
			DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiariosGeneralesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.diariosgenerales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.diariosgenerales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariosgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariosgenerales);
				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
								
				
				


				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiariosGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiariosGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiariosGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesAnterior =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diariosgeneralesAnterior =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiariosGeneralesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.diariosgenerales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.diariosgenerales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiariosGeneralesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariosgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariosgenerales);
				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDiariosGenerales")) {
					jCheckBoxSeleccionarTodosDiariosGeneralesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDiariosGenerales")) {
					jCheckBoxSeleccionadosDiariosGeneralesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDiariosGenerales")) {
					
				}
				
				


				
				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiariosGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiariosGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.diariosgenerales);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.diariosgenerales);
				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
												
				
				


				
				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiariosGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiariosGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiariosGeneralesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariosgeneralesAnterior =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.diariosgeneralesAnterior =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiariosGeneralesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariosgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariosgenerales);
				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
				
				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
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
			
			DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
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
			
			


			
			DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiariosGeneralesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariosgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariosgenerales);
				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiariosGenerales.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiariosGenerales.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariosgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariosgenerales);
				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
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
				
				


				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiariosGenerales.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiariosGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiariosGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariosgeneralesAnterior =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diariosgeneralesAnterior =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDiariosGenerales")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDiariosGeneralesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDiariosGenerales.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.diariosgenerales =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.diariosgenerales =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.diariosgenerales);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDiariosGenerales")) {
				
				}
				
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDiariosGenerales")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDiariosGenerales.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDiariosGenerales")) {
			
			}
			
			DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDiariosGenerales();
			
			DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
			
			if(sTipo.equals("NuevoDiariosGenerales")) {
				jButtonNuevoDiariosGeneralesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDiariosGenerales")) {
				jButtonDuplicarDiariosGeneralesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDiariosGenerales")) {
				jButtonCopiarDiariosGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDiariosGenerales")) {
				jButtonVerFormDiariosGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDiariosGenerales")) {
				jButtonNuevoDiariosGeneralesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDiariosGenerales")) {
				jButtonModificarDiariosGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDiariosGenerales")) {
				jButtonActualizarDiariosGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDiariosGenerales")) {
				jButtonEliminarDiariosGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDiariosGenerales")) {
				jButtonGuardarCambiosDiariosGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDiariosGenerales")) {
				jButtonCancelarDiariosGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDiariosGenerales")) {
				jButtonCerrarDiariosGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDiariosGenerales")) {
				jButtonGuardarCambiosDiariosGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDiariosGenerales")) {
				jButtonNuevoGuardarCambiosDiariosGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDiariosGenerales")) {
				jButtonAbrirOrderByDiariosGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDiariosGenerales")) {
				jButtonRecargarInformacionDiariosGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDiariosGenerales")) {
				jButtonAnterioresDiariosGeneralesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDiariosGenerales")) {
				jButtonSiguientesDiariosGeneralesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDiariosGeneralesBusqueda")) {
				this.jButtonidDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDiariosGeneralesUpdate")) {
				this.jButtonid_empresaDiariosGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDiariosGeneralesBusqueda")) {
				this.jButtonid_empresaDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDiariosGeneralesUpdate")) {
				this.jButtonid_sucursalDiariosGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDiariosGeneralesBusqueda")) {
				this.jButtonid_sucursalDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDiariosGeneralesUpdate")) {
				this.jButtonid_ejercicioDiariosGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDiariosGeneralesBusqueda")) {
				this.jButtonid_ejercicioDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoDiariosGeneralesUpdate")) {
				this.jButtonid_tipo_movimientoDiariosGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoDiariosGeneralesBusqueda")) {
				this.jButtonid_tipo_movimientoDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeDiariosGeneralesBusqueda")) {
				this.jButtonfecha_emision_desdeDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaDiariosGeneralesBusqueda")) {
				this.jButtonfecha_emision_hastaDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDiariosGeneralesBusqueda")) {
				this.jButtoncodigoDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionDiariosGeneralesBusqueda")) {
				this.jButtonfecha_emisionDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_movimientoDiariosGeneralesBusqueda")) {
				this.jButtoncodigo_tipo_movimientoDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorDiariosGeneralesBusqueda")) {
				this.jButtonnumero_mayorDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contableDiariosGeneralesBusqueda")) {
				this.jButtonnombre_cuenta_contableDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_localDiariosGeneralesBusqueda")) {
				this.jButtondebito_localDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_localDiariosGeneralesBusqueda")) {
				this.jButtoncredito_localDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleDiariosGeneralesBusqueda")) {
				this.jButtondetalleDiariosGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_contableDiariosGeneralesBusqueda")) {
				this.jButtoncodigo_cuenta_contableDiariosGeneralesBusquedaActionPerformed(evt);
			}
			
			DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDiariosGenerales();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDiariosGenerales")) {
				closingInternalFrameDiariosGenerales();
				
			} else if(sTipo.equals("jButtonCancelarDiariosGenerales")) {
				JInternalFrameBase jInternalFrameDetalleFormDiariosGenerales = (JInternalFrameBase)evt.getSource();
	            	
	            DiariosGeneralesBeanSwingJInternalFrame jInternalFrameParent=(DiariosGeneralesBeanSwingJInternalFrame)jInternalFrameDetalleFormDiariosGenerales.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDiariosGeneralesActionPerformed(null);
			}
			
			DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.diariosgenerales,new Object(),this.diariosgeneralesParameterGeneral,this.diariosgeneralesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDiariosGenerales(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDiariosGenerales(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDiariosGenerales(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.diariosgenerales)) {
			if(!esControlTabla) {
				if(DiariosGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);			
				}
				
				if(this.diariosgeneralesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDiariosGenerales(this.diariosgenerales,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDiariosGenerales(this.diariosgeneralesReturnGeneral,this.diariosgeneralesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.diariosgeneralesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDiariosGenerales(classes,this.diariosgeneralesReturnGeneral,this.diariosgeneralesBean,false);
					}
						
					if(this.diariosgeneralesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDiariosGenerales(this.diariosgeneralesReturnGeneral.getDiariosGenerales());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDiariosGenerales(this.diariosgeneralesReturnGeneral.getDiariosGenerales());	
					}
						
					if(this.diariosgeneralesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDiariosGenerales(this.diariosgeneralesReturnGeneral.getDiariosGenerales(),classes);//this.diariosgeneralesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDiariosGenerales(this.diariosgenerales,classes);//this.diariosgeneralesBean);									
				}
			
				if(DiariosGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDiariosGenerales(this.diariosgenerales,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDiariosGenerales(this.diariosgenerales);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.diariosgeneralesAnterior!=null) {
						this.diariosgenerales=this.diariosgeneralesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.diariosgeneralesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.diariosgeneralesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.diariosgeneralesReturnGeneral.getDiariosGenerales(),diariosgeneralesLogic.getDiariosGeneraless());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.diariosgeneralesReturnGeneral.getDiariosGenerales(),this.diariosgeneraless);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDiariosGenerales.repaint();
				
				//((AbstractTableModel) this.jTableDatosDiariosGenerales.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDiariosGenerales();
			}
		}
	}
	
	public void actualizarVisualTableDatosDiariosGenerales() throws Exception {
		
		DiariosGeneralesModel diariosgeneralesModel=(DiariosGeneralesModel)this.jTableDatosDiariosGenerales.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			diariosgeneralesModel.diariosgeneraless=this.diariosgeneralesLogic.getDiariosGeneraless();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			diariosgeneralesModel.diariosgeneraless=this.diariosgeneraless;
		}
		
		
		((DiariosGeneralesModel) this.jTableDatosDiariosGenerales.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDiariosGenerales() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdiariosgeneralesAnterior(),this.diariosgeneralesLogic.getDiariosGeneraless());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdiariosgeneralesAnterior(),this.diariosgeneraless);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDiariosGenerales();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDiariosGenerales(DiariosGenerales diariosgenerales,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
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
										
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.diariosgenerales,new Object(),generalEntityParameterGeneral,this.diariosgeneralesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.diariosgeneralesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DiariosGeneralesConstantesFunciones.getClassesRelationshipsOfDiariosGenerales(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DiariosGeneralesConstantesFunciones.getClassesRelationshipsFromStringsOfDiariosGenerales(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDiariosGenerales(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DiariosGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.diariosgenerales,new Object(),generalEntityParameterGeneral,this.diariosgeneralesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDiariosGenerales(DiariosGeneralesBean diariosgeneralesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDiariosGenerales(ArrayList<Classe> classes,DiariosGeneralesReturnGeneral diariosgeneralesReturnGeneral,DiariosGeneralesBean diariosgeneralesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDiariosGenerales(DiariosGenerales diariosgenerales,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.diariosgenerales)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDiariosGenerales = new DiariosGeneralesDetalleFormJInternalFrame(jDesktopPane,this.diariosgeneralesSessionBean.getConGuardarRelaciones(),this.diariosgeneralesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.setVisible(false);
		this.jInternalFrameDetalleFormDiariosGenerales.setSelected(false);						
		
		this.jInternalFrameDetalleFormDiariosGenerales.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDiariosGenerales.diariosgeneralesLogic=this.diariosgeneralesLogic;
		
		this.cargarCombosFrameForeignKeyDiariosGenerales("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDiariosGenerales();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDiariosGenerales();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDiariosGenerales("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDiariosGenerales();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDiariosGenerales.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDiariosGenerales"));
		
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonModificarDiariosGenerales.addActionListener(new ButtonActionListener(this,"ModificarDiariosGenerales"));

		
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonModificarToolBarDiariosGenerales.addActionListener(new ButtonActionListener(this,"ModificarToolBarDiariosGenerales"));
					
		this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemModificarDiariosGenerales.addActionListener(new ButtonActionListener(this,"MenuItemModificarDiariosGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonActualizarDiariosGenerales.addActionListener (new ButtonActionListener(this,"ActualizarDiariosGenerales"));
		
		
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonActualizarToolBarDiariosGenerales.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDiariosGenerales"));
						
		this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemActualizarDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDiariosGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonEliminarDiariosGenerales.addActionListener (new ButtonActionListener(this,"EliminarDiariosGenerales"));
		
		
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonEliminarToolBarDiariosGenerales.addActionListener (new ButtonActionListener(this,"EliminarToolBarDiariosGenerales"));
								
		this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemEliminarDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDiariosGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonCancelarDiariosGenerales.addActionListener (new ButtonActionListener(this,"CancelarDiariosGenerales"));
		
		
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonCancelarToolBarDiariosGenerales.addActionListener (new ButtonActionListener(this,"CancelarToolBarDiariosGenerales"));
					
		this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemCancelarDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDiariosGenerales"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemDetalleCerrarDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDiariosGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonGuardarCambiosToolBarDiariosGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDiariosGenerales"));
		
		
		
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonGuardarCambiosToolBarDiariosGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDiariosGenerales"));
		
		
		
		this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxTiposAccionesFormularioDiariosGenerales.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDiariosGenerales"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonidDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"idDiariosGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_empresaDiariosGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDiariosGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_empresaDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDiariosGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_sucursalDiariosGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDiariosGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_sucursalDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDiariosGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_ejercicioDiariosGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDiariosGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_ejercicioDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDiariosGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_tipo_movimientoDiariosGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoDiariosGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_tipo_movimientoDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonfecha_emision_desdeDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonfecha_emision_hastaDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtoncodigoDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigoDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonfecha_emisionDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtoncodigo_tipo_movimientoDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_movimientoDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonnumero_mayorDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonnombre_cuenta_contableDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtondebito_localDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"debito_localDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtoncredito_localDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"credito_localDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtondetalleDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"detalleDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtoncodigo_cuenta_contableDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_contableDiariosGeneralesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDiariosGenerales.jTabbedPaneRelacionesDiariosGenerales.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDiariosGenerales"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDiariosGenerales"));
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiariosGenerales.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDiariosGenerales"));
		}
		
		this.jTableDatosDiariosGenerales.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDiariosGenerales"));
		
		this.jTableDatosDiariosGenerales.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDiariosGenerales"));
		
		this.jButtonNuevoDiariosGenerales.addActionListener(new ButtonActionListener(this,"NuevoDiariosGenerales"));
		
		this.jButtonDuplicarDiariosGenerales.addActionListener(new ButtonActionListener(this,"DuplicarDiariosGenerales"));
		
		this.jButtonCopiarDiariosGenerales.addActionListener(new ButtonActionListener(this,"CopiarDiariosGenerales"));
		
		this.jButtonVerFormDiariosGenerales.addActionListener(new ButtonActionListener(this,"VerFormDiariosGenerales"));
		
		
		this.jButtonNuevoToolBarDiariosGenerales.addActionListener(new ButtonActionListener(this,"NuevoToolBarDiariosGenerales"));
			
		this.jButtonDuplicarToolBarDiariosGenerales.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDiariosGenerales"));
			
		this.jMenuItemNuevoDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDiariosGenerales"));
			
		this.jMenuItemDuplicarDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDiariosGenerales"));		
		
		
		this.jButtonNuevoRelacionesDiariosGenerales.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDiariosGenerales"));
		
		
		this.jButtonNuevoRelacionesToolBarDiariosGenerales.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDiariosGenerales"));
			
		this.jMenuItemNuevoRelacionesDiariosGenerales.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDiariosGenerales"));		
		
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonModificarDiariosGenerales.addActionListener(new ButtonActionListener(this,"ModificarDiariosGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonModificarToolBarDiariosGenerales.addActionListener(new ButtonActionListener(this,"ModificarToolBarDiariosGenerales"));
			
			this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemModificarDiariosGenerales.addActionListener(new ButtonActionListener(this,"MenuItemModificarDiariosGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonActualizarDiariosGenerales.addActionListener (new ButtonActionListener(this,"ActualizarDiariosGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonActualizarToolBarDiariosGenerales.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDiariosGenerales"));
				
			this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemActualizarDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDiariosGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonEliminarDiariosGenerales.addActionListener (new ButtonActionListener(this,"EliminarDiariosGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonEliminarToolBarDiariosGenerales.addActionListener (new ButtonActionListener(this,"EliminarToolBarDiariosGenerales"));
						
			this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemEliminarDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDiariosGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonCancelarDiariosGenerales.addActionListener (new ButtonActionListener(this,"CancelarDiariosGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonCancelarToolBarDiariosGenerales.addActionListener (new ButtonActionListener(this,"CancelarToolBarDiariosGenerales"));
			
			this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemCancelarDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDiariosGenerales"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDiariosGenerales.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDiariosGenerales"));		
		
		
		this.jButtonCerrarDiariosGenerales.addActionListener (new ButtonActionListener(this,"CerrarDiariosGenerales"));
		
		
		this.jButtonCerrarToolBarDiariosGenerales.addActionListener (new ButtonActionListener(this,"CerrarToolBarDiariosGenerales"));
			
		this.jMenuItemCerrarDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDiariosGenerales"));
			
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiariosGenerales.jMenuItemDetalleCerrarDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDiariosGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonGuardarCambiosDiariosGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosDiariosGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiariosGenerales.jButtonGuardarCambiosToolBarDiariosGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDiariosGenerales"));
		}
		
		this.jButtonCopiarToolBarDiariosGenerales.addActionListener (new ButtonActionListener(this,"CopiarToolBarDiariosGenerales"));
			
		this.jButtonVerFormToolBarDiariosGenerales.addActionListener (new ButtonActionListener(this,"VerFormToolBarDiariosGenerales"));
		
		this.jMenuItemGuardarCambiosDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDiariosGenerales"));
			
		this.jMenuItemCopiarDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDiariosGenerales"));		
		
		this.jMenuItemVerFormDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDiariosGenerales"));		
		
		
		this.jButtonGuardarCambiosTablaDiariosGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDiariosGenerales"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDiariosGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDiariosGenerales"));
			
		this.jMenuItemGuardarCambiosTablaDiariosGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDiariosGenerales"));		
		
		
		
		this.jButtonRecargarInformacionDiariosGenerales.addActionListener (new ButtonActionListener(this,"RecargarInformacionDiariosGenerales"));
					
		this.jButtonRecargarInformacionToolBarDiariosGenerales.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDiariosGenerales"));
		
		this.jMenuItemRecargarInformacionDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDiariosGenerales"));		
		
		
		
		this.jButtonAnterioresDiariosGenerales.addActionListener (new ButtonActionListener(this,"AnterioresDiariosGenerales"));
		
		
		this.jButtonAnterioresToolBarDiariosGenerales.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDiariosGenerales"));
		
		this.jMenuItemAnterioresDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDiariosGenerales"));		
		
		
		this.jButtonSiguientesDiariosGenerales.addActionListener (new ButtonActionListener(this,"SiguientesDiariosGenerales"));
		
		
		this.jButtonSiguientesToolBarDiariosGenerales.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDiariosGenerales"));
			
		this.jMenuItemSiguientesDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDiariosGenerales"));
			
		this.jMenuItemAbrirOrderByDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDiariosGenerales"));
			
		this.jMenuItemMostrarOcultarDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDiariosGenerales"));
			
		this.jMenuItemDetalleAbrirOrderByDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDiariosGenerales"));
			
		this.jMenuItemDetalleMostarOcultarDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDiariosGenerales"));		
		
		
		this.jButtonNuevoGuardarCambiosDiariosGenerales.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDiariosGenerales"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDiariosGenerales.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDiariosGenerales"));
			
		this.jMenuItemNuevoGuardarCambiosDiariosGenerales.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDiariosGenerales"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDiariosGenerales.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDiariosGenerales"));

		this.jCheckBoxSeleccionadosDiariosGenerales.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDiariosGenerales"));
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxTiposAccionesFormularioDiariosGenerales.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDiariosGenerales"));
		}
		
		
		this.jComboBoxTiposRelacionesDiariosGenerales.addActionListener (new ButtonActionListener(this,"TiposRelacionesDiariosGenerales"));
			
		this.jComboBoxTiposAccionesDiariosGenerales.addActionListener (new ButtonActionListener(this,"TiposAccionesDiariosGenerales"));
					
		this.jComboBoxTiposSeleccionarDiariosGenerales.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDiariosGenerales"));
			
		this.jTextFieldValorCampoGeneralDiariosGenerales.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDiariosGenerales"));		
		
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonidDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"idDiariosGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_empresaDiariosGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDiariosGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_empresaDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDiariosGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_sucursalDiariosGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDiariosGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_sucursalDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDiariosGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_ejercicioDiariosGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDiariosGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_ejercicioDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDiariosGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_tipo_movimientoDiariosGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoDiariosGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_tipo_movimientoDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonfecha_emision_desdeDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonfecha_emision_hastaDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtoncodigoDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigoDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonfecha_emisionDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtoncodigo_tipo_movimientoDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_movimientoDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonnumero_mayorDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonnombre_cuenta_contableDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtondebito_localDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"debito_localDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtoncredito_localDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"credito_localDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtondetalleDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"detalleDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtoncodigo_cuenta_contableDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_contableDiariosGeneralesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaDiariosGeneralesDiariosGenerales.addActionListener(new ButtonActionListener(this,"BusquedaDiariosGeneralesDiariosGenerales"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDiariosGenerales!=null) {
				this.jInternalFrameReporteDinamicoDiariosGenerales.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDiariosGenerales"));
				this.jInternalFrameReporteDinamicoDiariosGenerales.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDiariosGenerales"));
				this.jInternalFrameReporteDinamicoDiariosGenerales.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDiariosGenerales"));
			}
			
			//this.jButtonCerrarReporteDinamicoDiariosGenerales.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDiariosGenerales"));				
			//this.jButtonGenerarReporteDinamicoDiariosGenerales.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDiariosGenerales"));
			//this.jButtonGenerarExcelReporteDinamicoDiariosGenerales.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDiariosGenerales"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDiariosGenerales!=null) {
				this.jInternalFrameImportacionDiariosGenerales.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDiariosGenerales"));
				this.jInternalFrameImportacionDiariosGenerales.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDiariosGenerales"));
				this.jInternalFrameImportacionDiariosGenerales.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDiariosGenerales"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDiariosGenerales.addActionListener (new ButtonActionListener(this,"AbrirOrderByDiariosGenerales"));
			
			this.jButtonAbrirOrderByToolBarDiariosGenerales.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDiariosGenerales"));			
			
			if(this.jInternalFrameOrderByDiariosGenerales!=null) {
				this.jInternalFrameOrderByDiariosGenerales.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDiariosGenerales"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiariosGenerales.jTabbedPaneRelacionesDiariosGenerales.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDiariosGenerales"));
		
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
            		closingInternalFrameDiariosGenerales();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDiariosGenerales.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDiariosGenerales = (JInternalFrameBase)event.getSource();
	            	
	            DiariosGeneralesBeanSwingJInternalFrame jInternalFrameParent=(DiariosGeneralesBeanSwingJInternalFrame)jInternalFrameDetalleFormDiariosGenerales.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDiariosGeneralesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDiariosGenerales.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDiariosGeneralesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDiariosGenerales.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDiariosGenerales.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiariosGeneralesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiariosGeneralesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiariosGeneralesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDiariosGenerales";
		inputMap = this.jButtonNuevoDiariosGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDiariosGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDiariosGeneralesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiariosGeneralesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiariosGeneralesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiariosGeneralesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDiariosGenerales";
		inputMap = this.jButtonNuevoRelacionesDiariosGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDiariosGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDiariosGeneralesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDiariosGenerales";
		inputMap = this.jButtonModificarDiariosGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDiariosGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDiariosGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDiariosGenerales";
		inputMap = this.jButtonActualizarDiariosGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDiariosGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDiariosGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDiariosGenerales";
		inputMap = this.jButtonEliminarDiariosGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDiariosGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDiariosGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDiariosGenerales";
		inputMap = this.jButtonCancelarDiariosGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDiariosGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDiariosGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDiariosGenerales";
		inputMap = this.jButtonCerrarDiariosGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDiariosGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDiariosGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonGuardarCambiosDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDiariosGenerales";
		inputMap = this.jInternalFrameDetalleFormDiariosGenerales.jButtonGuardarCambiosDiariosGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonGuardarCambiosDiariosGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDiariosGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDiariosGenerales.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDiariosGeneralesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDiariosGenerales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDiariosGeneralesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDiariosGenerales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDiariosGeneralesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDiariosGenerales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDiariosGeneralesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonidDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"idDiariosGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_empresaDiariosGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDiariosGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_empresaDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDiariosGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_sucursalDiariosGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDiariosGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_sucursalDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDiariosGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_ejercicioDiariosGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDiariosGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_ejercicioDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDiariosGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_tipo_movimientoDiariosGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoDiariosGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonid_tipo_movimientoDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonfecha_emision_desdeDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonfecha_emision_hastaDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtoncodigoDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigoDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonfecha_emisionDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtoncodigo_tipo_movimientoDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_movimientoDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonnumero_mayorDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtonnombre_cuenta_contableDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtondebito_localDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"debito_localDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtoncredito_localDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"credito_localDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtondetalleDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"detalleDiariosGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiariosGenerales.jButtoncodigo_cuenta_contableDiariosGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_contableDiariosGeneralesBusqueda"));
		
		
		this.jButtonBusquedaDiariosGeneralesDiariosGenerales.addActionListener(new ButtonActionListener(this,"BusquedaDiariosGeneralesDiariosGenerales"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDiariosGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDiariosGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDiariosGeneralesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDiariosGenerales.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDiariosGenerales(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DiariosGenerales diariosgeneralesAux:this.diariosgeneralesLogic.getDiariosGeneraless()) {
					diariosgeneralesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DiariosGenerales diariosgeneralesAux:diariosgeneraless) {
					diariosgeneralesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDiariosGeneralesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDiariosGenerales(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DiariosGenerales diariosgeneralesAux:this.diariosgeneralesLogic.getDiariosGeneraless()) {
						diariosgeneralesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DiariosGenerales diariosgeneralesAux:diariosgeneraless) {
						diariosgeneralesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DiariosGenerales diariosgeneralesAux:this.diariosgeneralesLogic.getDiariosGeneraless()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DiariosGenerales diariosgeneralesAux:diariosgeneraless) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDiariosGenerales(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDiariosGenerales.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDiariosGenerales.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDiariosGenerales,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDiariosGeneralesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDiariosGenerales(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDiariosGenerales.getSelectedRows();
			
			DiariosGenerales diariosgeneralesLocal=new DiariosGenerales();
			
			//this.seleccionarTodosDiariosGenerales(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					diariosgeneralesLocal =(DiariosGenerales) this.diariosgeneralesLogic.getDiariosGeneraless().toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					diariosgeneralesLocal =(DiariosGenerales) this.diariosgeneraless.toArray()[this.jTableDatosDiariosGenerales.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				diariosgeneralesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DiariosGenerales diariosgeneralesAux:this.diariosgeneralesLogic.getDiariosGeneraless()) {
						diariosgeneralesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DiariosGenerales diariosgeneralesAux:diariosgeneraless) {
						diariosgeneralesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDiariosGenerales(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDiariosGenerales.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDiariosGenerales.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDiariosGenerales,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDiariosGeneralesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDiariosGeneralesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDiariosGeneralesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDiariosGenerales(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDiariosGenerales.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DiariosGenerales diariosgeneralesAux:this.diariosgeneralesLogic.getDiariosGeneraless()) {
				
						if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							diariosgeneralesAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							diariosgeneralesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							diariosgeneralesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							diariosgeneralesAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO)) {
							existe=true;
							diariosgeneralesAux.setcodigo_tipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							diariosgeneralesAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
							existe=true;
							diariosgeneralesAux.setnombre_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_DEBITOLOCAL)) {
							existe=true;
							diariosgeneralesAux.setdebito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_CREDITOLOCAL)) {
							existe=true;
							diariosgeneralesAux.setcredito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							diariosgeneralesAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE)) {
							existe=true;
							diariosgeneralesAux.setcodigo_cuenta_contable(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DiariosGenerales diariosgeneralesAux:diariosgeneraless) {
					
						if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							diariosgeneralesAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							diariosgeneralesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							diariosgeneralesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							diariosgeneralesAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO)) {
							existe=true;
							diariosgeneralesAux.setcodigo_tipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							diariosgeneralesAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
							existe=true;
							diariosgeneralesAux.setnombre_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_DEBITOLOCAL)) {
							existe=true;
							diariosgeneralesAux.setdebito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_CREDITOLOCAL)) {
							existe=true;
							diariosgeneralesAux.setcredito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							diariosgeneralesAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE)) {
							existe=true;
							diariosgeneralesAux.setcodigo_cuenta_contable(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDiariosGenerales(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDiariosGeneralesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDiariosGenerales(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDiariosGenerales=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDiariosGenerales.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxTiposAccionesFormularioDiariosGenerales.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDiariosGenerales) {				
					conSplash=true;//false;										
					
					//this.startProcessDiariosGenerales(conSplash);
				
					this.generarReporteDiariosGeneralessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDiariosGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxTiposAccionesFormularioDiariosGenerales.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDiariosGeneralessSeleccionados();
				//this.jComboBoxTiposAccionesDiariosGenerales.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDiariosGeneralessSeleccionados(false);
				//this.jComboBoxTiposAccionesDiariosGenerales.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDiariosGeneralessSeleccionados(true);
				//this.jComboBoxTiposAccionesDiariosGenerales.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDiariosGenerales();
				
				this.exportarDiariosGeneralessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDiariosGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxTiposAccionesFormularioDiariosGenerales.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDiariosGeneraless();
				//this.importarDiariosGeneraless();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDiariosGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxTiposAccionesFormularioDiariosGenerales.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDiariosGenerales();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDiariosGeneralessSeleccionados();
				//this.jComboBoxTiposAccionesDiariosGenerales.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Diarios Generales", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDiariosGenerales();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDiariosGenerales)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDiariosGenerales(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Diarios Generales",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDiariosGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxTiposAccionesFormularioDiariosGenerales.setSelectedIndex(0);					
				}	
			} 			
			else if(DiariosGeneralesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDiariosGenerales) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDiariosGenerales(conSplash);
					
						//this.actualizarParametrosGeneralDiariosGenerales();
						
						this.generarReporteProcesoAccionDiariosGeneralessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDiariosGenerales.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxTiposAccionesFormularioDiariosGenerales.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DiariosGeneralesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Diarios GeneralesES SELECCIONADOS?", "MANTENIMIENTO DE Diarios Generales", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDiariosGenerales();
				
						this.actualizarParametrosGeneralDiariosGenerales();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.diariosgeneralesReturnGeneral=diariosgeneralesLogic.procesarAccionDiariosGeneralessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.diariosgeneralesLogic.getDiariosGeneraless(),this.diariosgeneralesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDiariosGeneralesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDiariosGenerales.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxTiposAccionesFormularioDiariosGenerales.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDiariosGenerales();
					
					DiariosGeneralesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDiariosGeneralesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDiariosGenerales.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxTiposAccionesFormularioDiariosGenerales.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDiariosGenerales(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDiariosGeneralesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDiariosGenerales();
			
			if(this.jInternalFrameDetalleFormDiariosGenerales==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DiariosGenerales> diariosgeneralessSeleccionados=new ArrayList<DiariosGenerales>();		
			DiariosGenerales diariosgenerales=new DiariosGenerales();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDiariosGenerales(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDiariosGenerales.getSelectedItem();
			
			
			
			
			diariosgeneralessSeleccionados=this.getDiariosGeneralessSeleccionados(true);
			//this.sTipoAccion;
			
			if(diariosgeneralessSeleccionados.size()==1) {
				for(DiariosGenerales diariosgeneralesAux:diariosgeneralessSeleccionados) {
					diariosgenerales=diariosgeneralesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDiariosGenerales();
			
      		//this.finishProcessDiariosGenerales(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDiariosGeneralesReturnGeneral() throws Exception {
		if(this.diariosgeneralesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.diariosgeneralesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.diariosgeneralesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.diariosgeneralesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.diariosgeneralesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.diariosgeneralesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDiariosGenerales(false);
		}
		
		if(this.diariosgeneralesReturnGeneral.getConRetornoLista() || this.diariosgeneralesReturnGeneral.getConRetornoObjeto()) {
			if(this.diariosgeneralesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.diariosgeneralesLogic.setDiariosGeneraless(this.diariosgeneralesReturnGeneral.getDiariosGeneraless());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingDiariosGenerales(false);
		}
	}
	
	public void actualizarParametrosGeneralDiariosGenerales() throws Exception {
		
		
	}
	
	public ArrayList<DiariosGenerales> getDiariosGeneralessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DiariosGenerales> diariosgeneralessSeleccionados=new ArrayList<DiariosGenerales>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDiariosGenerales) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DiariosGenerales diariosgeneralesAux:diariosgeneralesLogic.getDiariosGeneraless()) {
					if(diariosgeneralesAux.getIsSelected()) {
						diariosgeneralessSeleccionados.add(diariosgeneralesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DiariosGenerales diariosgeneralesAux:this.diariosgeneraless) {
					if(diariosgeneralesAux.getIsSelected()) {
						diariosgeneralessSeleccionados.add(diariosgeneralesAux);				
					}
				}
			}
			
			if(diariosgeneralessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						diariosgeneralessSeleccionados.addAll(this.diariosgeneralesLogic.getDiariosGeneraless());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						diariosgeneralessSeleccionados.addAll(this.diariosgeneraless);				
					}
				}
			}
		} else {
			diariosgeneralessSeleccionados.add(this.diariosgenerales);
		}
		
		return diariosgeneralessSeleccionados;
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
	
	public void generarReporteDiariosGeneralessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDiariosGeneralessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDiariosGeneralessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDiariosGeneralessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDiariosGeneralessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Diarios Generales",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDiariosGeneralessSeleccionados() throws Exception {
		ArrayList<DiariosGenerales> diariosgeneralessSeleccionados=new ArrayList<DiariosGenerales>();		
		
		diariosgeneralessSeleccionados=this.getDiariosGeneralessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDiariosGeneraless("Todos",diariosgeneralessSeleccionados);
		
	}	
	
	public void generarReporteNormalDiariosGeneralessSeleccionados() throws Exception {
		ArrayList<DiariosGenerales> diariosgeneralessSeleccionados=new ArrayList<DiariosGenerales>();		
		
		diariosgeneralessSeleccionados=this.getDiariosGeneralessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDiariosGeneraless("Todos",diariosgeneralessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDiariosGeneralessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DiariosGenerales> diariosgeneralessSeleccionados=new ArrayList<DiariosGenerales>();
		
		diariosgeneralessSeleccionados=this.getDiariosGeneralessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDiariosGeneraless("Todos",diariosgeneralessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDiariosGeneralessSeleccionados() throws Exception {
		ArrayList<DiariosGenerales> diariosgeneralessSeleccionados=new ArrayList<DiariosGenerales>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDiariosGenerales();
		
		
		diariosgeneralessSeleccionados=this.getDiariosGeneralessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDiariosGenerales();
		
		
		//this.generarReporteDiariosGeneraless("Todos",diariosgeneralessSeleccionados ,diariosgeneralesImplementable,diariosgeneralesImplementableHome);
	}
	
	public void mostrarImportacionDiariosGeneraless() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDiariosGenerales();
		
		this.abrirFrameImportacionDiariosGenerales();		
		
			
		//this.generarReporteDiariosGeneraless("Todos",diariosgeneralessSeleccionados ,diariosgeneralesImplementable,diariosgeneralesImplementableHome);
	}
	
	public void importarDiariosGeneraless() throws Exception {		
	
	}
	
	public void exportarDiariosGeneralessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDiariosGeneralessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDiariosGeneralessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDiariosGeneralessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Diarios Generales",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDiariosGeneralessSeleccionados() throws Exception {
		ArrayList<DiariosGenerales> diariosgeneralessSeleccionados=new ArrayList<DiariosGenerales>();		
		
		diariosgeneralessSeleccionados=this.getDiariosGeneralessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diariosgenerales."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDiariosGenerales(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DiariosGenerales diariosgeneralesAux:diariosgeneralessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDiariosGenerales(diariosgeneralesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//diariosgeneralesAux.setsDetalleGeneralEntityReporte(diariosgeneralesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diarios Generales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDiariosGenerales(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DiariosGeneralesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiariosGeneralesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiariosGeneralesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiariosGeneralesConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiariosGeneralesConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiariosGeneralesConstantesFunciones.LABEL_IDTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiariosGeneralesConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiariosGeneralesConstantesFunciones.LABEL_DEBITOLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiariosGeneralesConstantesFunciones.LABEL_CREDITOLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiariosGeneralesConstantesFunciones.LABEL_DETALLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDiariosGenerales(DiariosGenerales diariosgenerales,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=diariosgenerales.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=diariosgenerales.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariosgenerales.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariosgenerales.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariosgenerales.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariosgenerales.gettipomovimiento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariosgenerales.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariosgenerales.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariosgenerales.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariosgenerales.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariosgenerales.getcodigo_tipo_movimiento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariosgenerales.getnumero_mayor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariosgenerales.getnombre_cuenta_contable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariosgenerales.getdebito_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariosgenerales.getcredito_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariosgenerales.getdetalle();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariosgenerales.getcodigo_cuenta_contable();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDiariosGeneralessSeleccionados() throws Exception {
		ArrayList<DiariosGenerales> diariosgeneralessSeleccionados=new ArrayList<DiariosGenerales>();		
		
		diariosgeneralessSeleccionados=this.getDiariosGeneralessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diariosgenerales.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DiariosGeneraless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDiariosGenerales(row);				
				iRow++;
			}				
			
			for(DiariosGenerales diariosgeneralesAux:diariosgeneralessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDiariosGenerales(diariosgeneralesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diarios Generales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDiariosGeneralessSeleccionados() throws Exception {
		ArrayList<DiariosGenerales> diariosgeneralessSeleccionados=new ArrayList<DiariosGenerales>();		
		
		diariosgeneralessSeleccionados=this.getDiariosGeneralessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diariosgenerales.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("diariosgeneraless");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("diariosgenerales");
			//elementRoot.appendChild(element);
		
			for(DiariosGenerales diariosgeneralesAux:diariosgeneralessSeleccionados) {
				element = document.createElement("diariosgenerales");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDiariosGenerales(diariosgeneralesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diarios Generales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDiariosGenerales(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_DEBITOLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_CREDITOLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_DETALLE);
		cell = row.createCell(iColumn++);cell.setCellValue(DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDiariosGenerales(DiariosGenerales diariosgenerales,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(diariosgenerales.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(diariosgenerales.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diariosgenerales.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diariosgenerales.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diariosgenerales.gettipomovimiento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diariosgenerales.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(diariosgenerales.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(diariosgenerales.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(diariosgenerales.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(diariosgenerales.getcodigo_tipo_movimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(diariosgenerales.getnumero_mayor());
		cell = row.createCell(iColumn++);cell.setCellValue(diariosgenerales.getnombre_cuenta_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(diariosgenerales.getdebito_local());
		cell = row.createCell(iColumn++);cell.setCellValue(diariosgenerales.getcredito_local());
		cell = row.createCell(iColumn++);cell.setCellValue(diariosgenerales.getdetalle());
		cell = row.createCell(iColumn++);cell.setCellValue(diariosgenerales.getcodigo_cuenta_contable());				
	}
	
	public void setFilaDatosExportarXmlDiariosGenerales(DiariosGenerales diariosgenerales,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DiariosGeneralesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(diariosgenerales.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DiariosGeneralesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(diariosgenerales.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DiariosGeneralesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(diariosgenerales.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DiariosGeneralesConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(diariosgenerales.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(DiariosGeneralesConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(diariosgenerales.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementtipomovimiento_descripcion = document.createElement(DiariosGeneralesConstantesFunciones.IDTIPOMOVIMIENTO);
		elementtipomovimiento_descripcion.appendChild(document.createTextNode(diariosgenerales.gettipomovimiento_descripcion()));
		element.appendChild(elementtipomovimiento_descripcion);

		Element elementfecha_emision_desde = document.createElement(DiariosGeneralesConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(diariosgenerales.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(DiariosGeneralesConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(diariosgenerales.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementcodigo = document.createElement(DiariosGeneralesConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(diariosgenerales.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementfecha_emision = document.createElement(DiariosGeneralesConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(diariosgenerales.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementcodigo_tipo_movimiento = document.createElement(DiariosGeneralesConstantesFunciones.CODIGOTIPOMOVIMIENTO);
		elementcodigo_tipo_movimiento.appendChild(document.createTextNode(diariosgenerales.getcodigo_tipo_movimiento().trim()));
		element.appendChild(elementcodigo_tipo_movimiento);

		Element elementnumero_mayor = document.createElement(DiariosGeneralesConstantesFunciones.NUMEROMAYOR);
		elementnumero_mayor.appendChild(document.createTextNode(diariosgenerales.getnumero_mayor().trim()));
		element.appendChild(elementnumero_mayor);

		Element elementnombre_cuenta_contable = document.createElement(DiariosGeneralesConstantesFunciones.NOMBRECUENTACONTABLE);
		elementnombre_cuenta_contable.appendChild(document.createTextNode(diariosgenerales.getnombre_cuenta_contable().trim()));
		element.appendChild(elementnombre_cuenta_contable);

		Element elementdebito_local = document.createElement(DiariosGeneralesConstantesFunciones.DEBITOLOCAL);
		elementdebito_local.appendChild(document.createTextNode(diariosgenerales.getdebito_local().toString().trim()));
		element.appendChild(elementdebito_local);

		Element elementcredito_local = document.createElement(DiariosGeneralesConstantesFunciones.CREDITOLOCAL);
		elementcredito_local.appendChild(document.createTextNode(diariosgenerales.getcredito_local().toString().trim()));
		element.appendChild(elementcredito_local);

		Element elementdetalle = document.createElement(DiariosGeneralesConstantesFunciones.DETALLE);
		elementdetalle.appendChild(document.createTextNode(diariosgenerales.getdetalle().trim()));
		element.appendChild(elementdetalle);

		Element elementcodigo_cuenta_contable = document.createElement(DiariosGeneralesConstantesFunciones.CODIGOCUENTACONTABLE);
		elementcodigo_cuenta_contable.appendChild(document.createTextNode(diariosgenerales.getcodigo_cuenta_contable().trim()));
		element.appendChild(elementcodigo_cuenta_contable);
	}
	
	public void generarReporteGroupGenericoDiariosGeneralessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DiariosGenerales> diariosgeneralessSeleccionados=new ArrayList<DiariosGenerales>();
		
		diariosgeneralessSeleccionados=this.getDiariosGeneralessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDiariosGenerales(diariosgeneralessSeleccionados);
		
		this.generarReporteDiariosGeneraless("Todos",diariosgeneralessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDiariosGenerales(ArrayList<DiariosGenerales> diariosgeneralessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DiariosGenerales diariosgeneralesAux:diariosgeneralessSeleccionados) {
				diariosgeneralesAux.setsDetalleGeneralEntityReporte(diariosgeneralesAux.toString());
			
				if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					diariosgeneralesAux.setsDescripcionGeneralEntityReporte1(diariosgeneralesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					diariosgeneralesAux.setsDescripcionGeneralEntityReporte1(diariosgeneralesAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					diariosgeneralesAux.setsDescripcionGeneralEntityReporte1(diariosgeneralesAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_IDTIPOMOVIMIENTO)) {
					existe=true;
					diariosgeneralesAux.setsDescripcionGeneralEntityReporte1(diariosgeneralesAux.gettipomovimiento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					diariosgeneralesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(diariosgeneralesAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					diariosgeneralesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(diariosgeneralesAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					diariosgeneralesAux.setsDescripcionGeneralEntityReporte1(diariosgeneralesAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					diariosgeneralesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(diariosgeneralesAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO)) {
					existe=true;
					diariosgeneralesAux.setsDescripcionGeneralEntityReporte1(diariosgeneralesAux.getcodigo_tipo_movimiento());
				}
				 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR)) {
					existe=true;
					diariosgeneralesAux.setsDescripcionGeneralEntityReporte1(diariosgeneralesAux.getnumero_mayor());
				}
				 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
					existe=true;
					diariosgeneralesAux.setsDescripcionGeneralEntityReporte1(diariosgeneralesAux.getnombre_cuenta_contable());
				}
				 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_DETALLE)) {
					existe=true;
					diariosgeneralesAux.setsDescripcionGeneralEntityReporte1(diariosgeneralesAux.getdetalle());
				}
				 else if(sTipoSeleccionar.equals(DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE)) {
					existe=true;
					diariosgeneralesAux.setsDescripcionGeneralEntityReporte1(diariosgeneralesAux.getcodigo_cuenta_contable());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiariosGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDiariosGenerales(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDiariosGenerales=true;
				this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales=true;
				this.isVisibilidadCeldaGuardarCambiosDiariosGenerales=true;
			}
			
			this.isVisibilidadCeldaModificarDiariosGenerales=false;
			this.isVisibilidadCeldaActualizarDiariosGenerales=false;
			this.isVisibilidadCeldaEliminarDiariosGenerales=false;
			this.isVisibilidadCeldaCancelarDiariosGenerales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiariosGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarDiariosGenerales=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDiariosGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosDiariosGenerales=false;
			this.isVisibilidadCeldaModificarDiariosGenerales=false;
			this.isVisibilidadCeldaActualizarDiariosGenerales=true;
			this.isVisibilidadCeldaEliminarDiariosGenerales=false;
			this.isVisibilidadCeldaCancelarDiariosGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiariosGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarDiariosGenerales=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDiariosGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosDiariosGenerales=false;
			this.isVisibilidadCeldaModificarDiariosGenerales=false;
			this.isVisibilidadCeldaActualizarDiariosGenerales=true;
			this.isVisibilidadCeldaEliminarDiariosGenerales=true;
			this.isVisibilidadCeldaCancelarDiariosGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiariosGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarDiariosGenerales=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDiariosGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosDiariosGenerales=false;
			this.isVisibilidadCeldaModificarDiariosGenerales=false;
			this.isVisibilidadCeldaActualizarDiariosGenerales=true;
			this.isVisibilidadCeldaEliminarDiariosGenerales=false;
			this.isVisibilidadCeldaCancelarDiariosGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiariosGenerales=false;
				} else {
					this.isVisibilidadCeldaGuardarDiariosGenerales=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDiariosGenerales=true;
			this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales=true;
			this.isVisibilidadCeldaGuardarCambiosDiariosGenerales=true;
			this.isVisibilidadCeldaModificarDiariosGenerales=false;
			this.isVisibilidadCeldaActualizarDiariosGenerales=false;
			this.isVisibilidadCeldaEliminarDiariosGenerales=false;
			this.isVisibilidadCeldaCancelarDiariosGenerales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiariosGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarDiariosGenerales=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDiariosGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosDiariosGenerales=false;
			this.isVisibilidadCeldaActualizarDiariosGenerales=false;
			this.isVisibilidadCeldaEliminarDiariosGenerales=false;
			this.isVisibilidadCeldaCancelarDiariosGenerales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiariosGenerales=false;
				} else {
					this.isVisibilidadCeldaGuardarDiariosGenerales=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDiariosGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosDiariosGenerales=false;
			this.isVisibilidadCeldaModificarDiariosGenerales=true;
			this.isVisibilidadCeldaActualizarDiariosGenerales=false;
			this.isVisibilidadCeldaEliminarDiariosGenerales=false;
			this.isVisibilidadCeldaCancelarDiariosGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiariosGenerales=false;
				} else {
					this.isVisibilidadCeldaGuardarDiariosGenerales=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DiariosGeneralesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDiariosGenerales=true;
			this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales=true;
			this.isVisibilidadCeldaGuardarCambiosDiariosGenerales=true;
		} else {
			this.actualizarEstadoPanelsDiariosGenerales(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDiariosGenerales=false;
			//this.isVisibilidadCeldaVerFormDiariosGenerales=false;
			this.isVisibilidadCeldaDuplicarDiariosGenerales=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!diariosgeneralesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales=false;
		} else {
			this.isVisibilidadCeldaNuevoDiariosGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosDiariosGenerales=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
			if(!diariosgeneralesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales=false;												
			}
			
			this.jButtonCerrarDiariosGenerales.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales=false;
		}
		
		if(!this.permiteMantenimiento(this.diariosgenerales)) {
			this.isVisibilidadCeldaActualizarDiariosGenerales=false;
			this.isVisibilidadCeldaEliminarDiariosGenerales=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoDiariosGenerales=false;
		this.isVisibilidadCeldaNuevoRelacionesDiariosGenerales=false;
		this.isVisibilidadCeldaGuardarCambiosDiariosGenerales=false;
		//this.isVisibilidadCeldaModificarDiariosGenerales=true;
		this.isVisibilidadCeldaActualizarDiariosGenerales=false;
		this.isVisibilidadCeldaEliminarDiariosGenerales=false;
		//this.isVisibilidadCeldaCancelarDiariosGenerales=true;			
		this.isVisibilidadCeldaGuardarDiariosGenerales=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDiariosGenerales() {
	}
	
	public void actualizarEstadoPanelsDiariosGenerales(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDiariosGenerales!=null) {
				this.jScrollPanelDatosEdicionDiariosGenerales.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiariosGenerales!=null) {
				this.jTabbedPaneBusquedasDiariosGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDiariosGenerales!=null) {
				this.jScrollPanelDatosDiariosGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionDiariosGenerales!=null) {
				this.jPanelPaginacionDiariosGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDiariosGenerales!=null) {
				this.jPanelParametrosReportesDiariosGenerales.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDiariosGenerales!=null) {
				this.jScrollPanelDatosEdicionDiariosGenerales.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiariosGenerales!=null) {
				this.jTabbedPaneBusquedasDiariosGenerales.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDiariosGenerales!=null) {
				this.jScrollPanelDatosDiariosGenerales.setVisible(false);
			}
			
			if(this.jPanelPaginacionDiariosGenerales!=null) {
				this.jPanelPaginacionDiariosGenerales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDiariosGenerales!=null) {
				this.jPanelParametrosReportesDiariosGenerales.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDiariosGenerales!=null) {
				this.jScrollPanelDatosEdicionDiariosGenerales.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiariosGenerales!=null) {
				this.jTabbedPaneBusquedasDiariosGenerales.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDiariosGenerales!=null) {
				this.jScrollPanelDatosDiariosGenerales.setVisible(false);
			}
			
			if(this.jPanelPaginacionDiariosGenerales!=null) {
				this.jPanelPaginacionDiariosGenerales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDiariosGenerales!=null) {
				this.jPanelParametrosReportesDiariosGenerales.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDiariosGenerales!=null) {
				this.jScrollPanelDatosEdicionDiariosGenerales.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiariosGenerales!=null) {
				this.jTabbedPaneBusquedasDiariosGenerales.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDiariosGenerales!=null) {
				this.jScrollPanelDatosDiariosGenerales.setVisible(false);
			}
			
			if(this.jPanelPaginacionDiariosGenerales!=null) {
				this.jPanelPaginacionDiariosGenerales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDiariosGenerales!=null) {
				this.jPanelParametrosReportesDiariosGenerales.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDiariosGenerales!=null) {
				this.jScrollPanelDatosEdicionDiariosGenerales.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiariosGenerales!=null) {
				this.jTabbedPaneBusquedasDiariosGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDiariosGenerales!=null) {
				this.jScrollPanelDatosDiariosGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionDiariosGenerales!=null) {
				this.jPanelPaginacionDiariosGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDiariosGenerales!=null) {
				this.jPanelParametrosReportesDiariosGenerales.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDiariosGenerales!=null) {
				this.jScrollPanelDatosEdicionDiariosGenerales.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiariosGenerales!=null) {
				this.jTabbedPaneBusquedasDiariosGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDiariosGenerales!=null) {
				this.jScrollPanelDatosDiariosGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionDiariosGenerales!=null) {
				this.jPanelPaginacionDiariosGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDiariosGenerales!=null) {
				this.jPanelParametrosReportesDiariosGenerales.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDiariosGenerales!=null) {
				this.jScrollPanelDatosEdicionDiariosGenerales.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiariosGenerales!=null) {
				this.jTabbedPaneBusquedasDiariosGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDiariosGenerales!=null) {
				this.jScrollPanelDatosDiariosGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionDiariosGenerales!=null) {
				this.jPanelPaginacionDiariosGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDiariosGenerales!=null) {
				this.jPanelParametrosReportesDiariosGenerales.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDiariosGenerales!=null) {
					this.jTabbedPaneBusquedasDiariosGenerales.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDiariosGenerales!=null) {
				this.jPanelParametrosReportesDiariosGenerales.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiariosGenerales!=null) {
				this.jTabbedPaneBusquedasDiariosGenerales.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDiariosGenerales!=null) {
				this.jPanelParametrosReportesDiariosGenerales.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaDiariosGenerales=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaDiariosGenerales) {this.jTabbedPaneBusquedasDiariosGenerales.remove(jPanelBusquedaDiariosGeneralesDiariosGenerales);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaDiariosGenerales=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaDiariosGenerales) {this.jTabbedPaneBusquedasDiariosGenerales.remove(jPanelBusquedaDiariosGeneralesDiariosGenerales);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaDiariosGenerales=isParaEjercicio;
			if(!this.isVisibilidadBusquedaDiariosGenerales) {this.jTabbedPaneBusquedasDiariosGenerales.remove(jPanelBusquedaDiariosGeneralesDiariosGenerales);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMovimiento(Boolean isParaTipoMovimiento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMovimientoNegation=!isParaTipoMovimiento;

			this.isVisibilidadBusquedaDiariosGenerales=isParaTipoMovimiento;
			if(!this.isVisibilidadBusquedaDiariosGenerales) {this.jTabbedPaneBusquedasDiariosGenerales.remove(jPanelBusquedaDiariosGeneralesDiariosGenerales);}
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
			
			this.inicializarActualizarBindingTablaDiariosGenerales(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDiariosGenerales() {
		this.updateBorderResaltarBusquedasFormularioDiariosGenerales();
		this.updateVisibilidadBusquedasFormularioDiariosGenerales();
		this.updateHabilitarBusquedasFormularioDiariosGenerales();
	}
	
	public void updateBorderResaltarBusquedasFormularioDiariosGenerales() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDiariosGenerales.getComponents().length>0) {
	

		if(this.diariosgeneralesConstantesFunciones.resaltarBusquedaDiariosGeneralesDiariosGenerales!=null) {
			index= this.jTabbedPaneBusquedasDiariosGenerales.indexOfComponent(this.jPanelBusquedaDiariosGeneralesDiariosGenerales);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDiariosGenerales.getComponent(index);
				jPanel.setBorder(this.diariosgeneralesConstantesFunciones.resaltarBusquedaDiariosGeneralesDiariosGenerales);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDiariosGenerales() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDiariosGenerales.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDiariosGenerales.indexOfComponent(this.jPanelBusquedaDiariosGeneralesDiariosGenerales);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDiariosGenerales.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.diariosgeneralesConstantesFunciones.mostrarBusquedaDiariosGeneralesDiariosGenerales);
			if(!this.diariosgeneralesConstantesFunciones.mostrarBusquedaDiariosGeneralesDiariosGenerales && index>-1) {
				this.jTabbedPaneBusquedasDiariosGenerales.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDiariosGenerales() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDiariosGenerales.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDiariosGenerales.indexOfComponent(this.jPanelBusquedaDiariosGeneralesDiariosGenerales);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDiariosGenerales.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.diariosgeneralesConstantesFunciones.activarBusquedaDiariosGeneralesDiariosGenerales);
				this.jTabbedPaneBusquedasDiariosGenerales.setEnabledAt(index,this.diariosgeneralesConstantesFunciones.activarBusquedaDiariosGeneralesDiariosGenerales);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDiariosGenerales(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaDiariosGenerales")) {
			index= this.jTabbedPaneBusquedasDiariosGenerales.indexOfComponent(this.jPanelBusquedaDiariosGeneralesDiariosGenerales);

			this.jTabbedPaneBusquedasDiariosGenerales.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDiariosGenerales.getComponent(index);

			this.diariosgeneralesConstantesFunciones.setResaltarBusquedaDiariosGeneralesDiariosGenerales(resaltar);

			jPanel.setBorder(this.diariosgeneralesConstantesFunciones.resaltarBusquedaDiariosGeneralesDiariosGenerales);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDiariosGenerales.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDiariosGenerales() throws Exception {

		if(this.jInternalFrameDetalleFormDiariosGenerales==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDiariosGenerales();
		this.updateVisibilidadResaltarControlesFormularioDiariosGenerales();
		this.updateHabilitarResaltarControlesFormularioDiariosGenerales();
		
	}
	
	public void updateBorderResaltarControlesFormularioDiariosGenerales() throws Exception {
		if(this.jInternalFrameDetalleFormDiariosGenerales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.diariosgeneralesConstantesFunciones.resaltaridDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales!=null) {this.jInternalFrameDetalleFormDiariosGenerales.jLabelidDiariosGenerales.setBorder(this.diariosgeneralesConstantesFunciones.resaltaridDiariosGenerales);}
		if(this.diariosgeneralesConstantesFunciones.resaltarid_empresaDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales!=null) {this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_empresaDiariosGenerales.setBorder(this.diariosgeneralesConstantesFunciones.resaltarid_empresaDiariosGenerales);}
		if(this.diariosgeneralesConstantesFunciones.resaltarid_sucursalDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales!=null) {this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_sucursalDiariosGenerales.setBorder(this.diariosgeneralesConstantesFunciones.resaltarid_sucursalDiariosGenerales);}
		if(this.diariosgeneralesConstantesFunciones.resaltarid_ejercicioDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales!=null) {this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_ejercicioDiariosGenerales.setBorder(this.diariosgeneralesConstantesFunciones.resaltarid_ejercicioDiariosGenerales);}
		if(this.diariosgeneralesConstantesFunciones.resaltarid_tipo_movimientoDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales!=null) {this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_tipo_movimientoDiariosGenerales.setBorder(this.diariosgeneralesConstantesFunciones.resaltarid_tipo_movimientoDiariosGenerales);}
		if(this.diariosgeneralesConstantesFunciones.resaltarfecha_emision_desdeDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales!=null) {this.jInternalFrameDetalleFormDiariosGenerales.jDateChooserfecha_emision_desdeDiariosGenerales.setBorder(this.diariosgeneralesConstantesFunciones.resaltarfecha_emision_desdeDiariosGenerales);}
		if(this.diariosgeneralesConstantesFunciones.resaltarfecha_emision_hastaDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales!=null) {this.jInternalFrameDetalleFormDiariosGenerales.jDateChooserfecha_emision_hastaDiariosGenerales.setBorder(this.diariosgeneralesConstantesFunciones.resaltarfecha_emision_hastaDiariosGenerales);}
		if(this.diariosgeneralesConstantesFunciones.resaltarcodigoDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales!=null) {this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigoDiariosGenerales.setBorder(this.diariosgeneralesConstantesFunciones.resaltarcodigoDiariosGenerales);}
		if(this.diariosgeneralesConstantesFunciones.resaltarfecha_emisionDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales!=null) {this.jInternalFrameDetalleFormDiariosGenerales.jDateChooserfecha_emisionDiariosGenerales.setBorder(this.diariosgeneralesConstantesFunciones.resaltarfecha_emisionDiariosGenerales);}
		if(this.diariosgeneralesConstantesFunciones.resaltarcodigo_tipo_movimientoDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales!=null) {this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigo_tipo_movimientoDiariosGenerales.setBorder(this.diariosgeneralesConstantesFunciones.resaltarcodigo_tipo_movimientoDiariosGenerales);}
		if(this.diariosgeneralesConstantesFunciones.resaltarnumero_mayorDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales!=null) {this.jInternalFrameDetalleFormDiariosGenerales.jTextAreanumero_mayorDiariosGenerales.setBorder(this.diariosgeneralesConstantesFunciones.resaltarnumero_mayorDiariosGenerales);}
		if(this.diariosgeneralesConstantesFunciones.resaltarnombre_cuenta_contableDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales!=null) {this.jInternalFrameDetalleFormDiariosGenerales.jTextAreanombre_cuenta_contableDiariosGenerales.setBorder(this.diariosgeneralesConstantesFunciones.resaltarnombre_cuenta_contableDiariosGenerales);}
		if(this.diariosgeneralesConstantesFunciones.resaltardebito_localDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales!=null) {this.jInternalFrameDetalleFormDiariosGenerales.jTextFielddebito_localDiariosGenerales.setBorder(this.diariosgeneralesConstantesFunciones.resaltardebito_localDiariosGenerales);}
		if(this.diariosgeneralesConstantesFunciones.resaltarcredito_localDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales!=null) {this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcredito_localDiariosGenerales.setBorder(this.diariosgeneralesConstantesFunciones.resaltarcredito_localDiariosGenerales);}
		if(this.diariosgeneralesConstantesFunciones.resaltardetalleDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales!=null) {this.jInternalFrameDetalleFormDiariosGenerales.jTextAreadetalleDiariosGenerales.setBorder(this.diariosgeneralesConstantesFunciones.resaltardetalleDiariosGenerales);}
		if(this.diariosgeneralesConstantesFunciones.resaltarcodigo_cuenta_contableDiariosGenerales!=null && this.jInternalFrameDetalleFormDiariosGenerales!=null) {this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigo_cuenta_contableDiariosGenerales.setBorder(this.diariosgeneralesConstantesFunciones.resaltarcodigo_cuenta_contableDiariosGenerales);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDiariosGenerales() throws Exception {		
		if(this.jInternalFrameDetalleFormDiariosGenerales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
	
		//this.jInternalFrameDetalleFormDiariosGenerales.jLabelidDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostraridDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jPanelidDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostraridDiariosGenerales);
		//this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_empresaDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarid_empresaDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jPanelid_empresaDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarid_empresaDiariosGenerales);
		//this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_sucursalDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarid_sucursalDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jPanelid_sucursalDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarid_sucursalDiariosGenerales);
		//this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_ejercicioDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarid_ejercicioDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jPanelid_ejercicioDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarid_ejercicioDiariosGenerales);
		//this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_tipo_movimientoDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarid_tipo_movimientoDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jPanelid_tipo_movimientoDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarid_tipo_movimientoDiariosGenerales);
		//this.jInternalFrameDetalleFormDiariosGenerales.jDateChooserfecha_emision_desdeDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarfecha_emision_desdeDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jPanelfecha_emision_desdeDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarfecha_emision_desdeDiariosGenerales);
		//this.jInternalFrameDetalleFormDiariosGenerales.jDateChooserfecha_emision_hastaDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarfecha_emision_hastaDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jPanelfecha_emision_hastaDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarfecha_emision_hastaDiariosGenerales);
		//this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigoDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarcodigoDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jPanelcodigoDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarcodigoDiariosGenerales);
		//this.jInternalFrameDetalleFormDiariosGenerales.jDateChooserfecha_emisionDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarfecha_emisionDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jPanelfecha_emisionDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarfecha_emisionDiariosGenerales);
		//this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigo_tipo_movimientoDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarcodigo_tipo_movimientoDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jPanelcodigo_tipo_movimientoDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarcodigo_tipo_movimientoDiariosGenerales);
		//this.jInternalFrameDetalleFormDiariosGenerales.jTextAreanumero_mayorDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarnumero_mayorDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jPanelnumero_mayorDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarnumero_mayorDiariosGenerales);
		//this.jInternalFrameDetalleFormDiariosGenerales.jTextAreanombre_cuenta_contableDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarnombre_cuenta_contableDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jPanelnombre_cuenta_contableDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarnombre_cuenta_contableDiariosGenerales);
		//this.jInternalFrameDetalleFormDiariosGenerales.jTextFielddebito_localDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrardebito_localDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jPaneldebito_localDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrardebito_localDiariosGenerales);
		//this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcredito_localDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarcredito_localDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jPanelcredito_localDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarcredito_localDiariosGenerales);
		//this.jInternalFrameDetalleFormDiariosGenerales.jTextAreadetalleDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrardetalleDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jPaneldetalleDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrardetalleDiariosGenerales);
		//this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigo_cuenta_contableDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarcodigo_cuenta_contableDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jPanelcodigo_cuenta_contableDiariosGenerales.setVisible(this.diariosgeneralesConstantesFunciones.mostrarcodigo_cuenta_contableDiariosGenerales);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDiariosGenerales() throws Exception {
		if(this.jInternalFrameDetalleFormDiariosGenerales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDiariosGenerales!=null) {
	
		this.jInternalFrameDetalleFormDiariosGenerales.jLabelidDiariosGenerales.setEnabled(this.diariosgeneralesConstantesFunciones.activaridDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_empresaDiariosGenerales.setEnabled(this.diariosgeneralesConstantesFunciones.activarid_empresaDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_sucursalDiariosGenerales.setEnabled(this.diariosgeneralesConstantesFunciones.activarid_sucursalDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_ejercicioDiariosGenerales.setEnabled(this.diariosgeneralesConstantesFunciones.activarid_ejercicioDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jComboBoxid_tipo_movimientoDiariosGenerales.setEnabled(this.diariosgeneralesConstantesFunciones.activarid_tipo_movimientoDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jDateChooserfecha_emision_desdeDiariosGenerales.setEnabled(this.diariosgeneralesConstantesFunciones.activarfecha_emision_desdeDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jDateChooserfecha_emision_hastaDiariosGenerales.setEnabled(this.diariosgeneralesConstantesFunciones.activarfecha_emision_hastaDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigoDiariosGenerales.setEnabled(this.diariosgeneralesConstantesFunciones.activarcodigoDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jDateChooserfecha_emisionDiariosGenerales.setEnabled(this.diariosgeneralesConstantesFunciones.activarfecha_emisionDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigo_tipo_movimientoDiariosGenerales.setEnabled(this.diariosgeneralesConstantesFunciones.activarcodigo_tipo_movimientoDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jTextAreanumero_mayorDiariosGenerales.setEnabled(this.diariosgeneralesConstantesFunciones.activarnumero_mayorDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jTextAreanombre_cuenta_contableDiariosGenerales.setEnabled(this.diariosgeneralesConstantesFunciones.activarnombre_cuenta_contableDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jTextFielddebito_localDiariosGenerales.setEnabled(this.diariosgeneralesConstantesFunciones.activardebito_localDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcredito_localDiariosGenerales.setEnabled(this.diariosgeneralesConstantesFunciones.activarcredito_localDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jTextAreadetalleDiariosGenerales.setEnabled(this.diariosgeneralesConstantesFunciones.activardetalleDiariosGenerales);
		this.jInternalFrameDetalleFormDiariosGenerales.jTextFieldcodigo_cuenta_contableDiariosGenerales.setEnabled(this.diariosgeneralesConstantesFunciones.activarcodigo_cuenta_contableDiariosGenerales);
		}
	}
	
		
}