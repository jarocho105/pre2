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

//import com.bydan.erp.contabilidad.util.MayooresGeneralesConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.MayooresGeneralesParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.MayooresGeneralesParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.MayooresGeneralesBean;
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
public class MayooresGeneralesBeanSwingJInternalFrame extends MayooresGeneralesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(MayooresGeneralesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<MayooresGenerales> mayooresgeneralesValidator = new ClassValidator<MayooresGenerales>(MayooresGenerales.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public MayooresGenerales mayooresgenerales;	
	public MayooresGenerales mayooresgeneralesAux;
	public MayooresGenerales mayooresgeneralesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public MayooresGenerales mayooresgeneralesTotales;
	public Long idMayooresGeneralesActual;
	public Long iIdNuevoMayooresGenerales=0L;
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

	public String sFinalQueryComboCuentaContable="";

	public List<CuentaContable> cuentacontablesForeignKey;

	public List<CuentaContable> getcuentacontablesForeignKey() {
		return cuentacontablesForeignKey;
	}

	public void setcuentacontablesForeignKey(List<CuentaContable> cuentacontablesForeignKey) {
		this.cuentacontablesForeignKey = cuentacontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontableForeignKey;

	public CuentaContable getcuentacontableForeignKey() {
		return cuentacontableForeignKey;
	}

	public void setcuentacontableForeignKey(CuentaContable cuentacontableForeignKey) {
		this.cuentacontableForeignKey = cuentacontableForeignKey;
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
	
	public Boolean isPermisoTodoMayooresGenerales;
	public Boolean isPermisoNuevoMayooresGenerales;
	public Boolean isPermisoActualizarMayooresGenerales;
	public Boolean isPermisoActualizarOriginalMayooresGenerales;
	public Boolean isPermisoEliminarMayooresGenerales;
	public Boolean isPermisoGuardarCambiosMayooresGenerales;
	public Boolean isPermisoConsultaMayooresGenerales;
	public Boolean isPermisoBusquedaMayooresGenerales;
	public Boolean isPermisoReporteMayooresGenerales;
	public Boolean isPermisoPaginacionMedioMayooresGenerales;
	public Boolean isPermisoPaginacionAltoMayooresGenerales;
	public Boolean isPermisoPaginacionTodoMayooresGenerales;
	public Boolean isPermisoCopiarMayooresGenerales;
	public Boolean isPermisoVerFormMayooresGenerales;
	public Boolean isPermisoDuplicarMayooresGenerales;
	public Boolean isPermisoOrdenMayooresGenerales;
	
	
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
	
	public MayooresGeneralesParameterReturnGeneral mayooresgeneralesReturnGeneral;
	public MayooresGeneralesParameterReturnGeneral mayooresgeneralesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoMayooresGenerales=false;
	public Boolean esParaAccionDesdeFormularioMayooresGenerales=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected MayooresGeneralesSessionBeanAdditional mayooresgeneralesSessionBeanAdditional=null;
	
	public MayooresGeneralesSessionBeanAdditional getMayooresGeneralesSessionBeanAdditional() {
		return this.mayooresgeneralesSessionBeanAdditional;
	}
	
	public void setMayooresGeneralesSessionBeanAdditional(MayooresGeneralesSessionBeanAdditional mayooresgeneralesSessionBeanAdditional) {
		try {
			this.mayooresgeneralesSessionBeanAdditional=mayooresgeneralesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected MayooresGeneralesBeanSwingJInternalFrameAdditional mayooresgeneralesBeanSwingJInternalFrameAdditional=null;
	//public class MayooresGeneralesBeanSwingJInternalFrame
	
	public MayooresGeneralesBeanSwingJInternalFrameAdditional getMayooresGeneralesBeanSwingJInternalFrameAdditional() {
		return this.mayooresgeneralesBeanSwingJInternalFrameAdditional;
	}
	
	public void setMayooresGeneralesBeanSwingJInternalFrameAdditional(MayooresGeneralesBeanSwingJInternalFrameAdditional mayooresgeneralesBeanSwingJInternalFrameAdditional) {
		try {
			this.mayooresgeneralesBeanSwingJInternalFrameAdditional=mayooresgeneralesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public MayooresGeneralesLogic mayooresgeneralesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public MayooresGenerales mayooresgeneralesBean;
	public MayooresGeneralesConstantesFunciones mayooresgeneralesConstantesFunciones;
	//public MayooresGeneralesParameterReturnGeneral mayooresgeneralesReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EjercicioLogic ejercicioLogic;
	public CuentaContableLogic cuentacontableLogic;
	
	//PARAMETROS
	
	
	//public List<MayooresGenerales> mayooresgeneraless;	
	//public List<MayooresGenerales> mayooresgeneralessEliminados;
	//public List<MayooresGenerales> mayooresgeneralessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoMayooresGenerales=false;
	public Boolean isVisibilidadCeldaDuplicarMayooresGenerales=true;
	public Boolean isVisibilidadCeldaCopiarMayooresGenerales=true;
	public Boolean isVisibilidadCeldaVerFormMayooresGenerales=true;
	public Boolean isVisibilidadCeldaOrdenMayooresGenerales=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesMayooresGenerales=false;
	public Boolean isVisibilidadCeldaModificarMayooresGenerales=false;
	public Boolean isVisibilidadCeldaActualizarMayooresGenerales=false;
	public Boolean isVisibilidadCeldaEliminarMayooresGenerales=false;
	public Boolean isVisibilidadCeldaCancelarMayooresGenerales=false;
	public Boolean isVisibilidadCeldaGuardarMayooresGenerales=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosMayooresGenerales=false;	
	
	
	public Boolean isVisibilidadBusquedaMayooresGenerales=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoMayooresGenerales() {
		return this.iIdNuevoMayooresGenerales;
	}

	public void setiIdNuevoMayooresGenerales(Long iIdNuevoMayooresGenerales) {
		this.iIdNuevoMayooresGenerales = iIdNuevoMayooresGenerales;
	}
	
	public Long getidMayooresGeneralesActual() {
		return this.idMayooresGeneralesActual;
	}

	public void setidMayooresGeneralesActual(Long idMayooresGeneralesActual) {
		this.idMayooresGeneralesActual = idMayooresGeneralesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public MayooresGenerales getmayooresgenerales() {
		return this.mayooresgenerales;
	}

	public void setmayooresgenerales(MayooresGenerales mayooresgenerales) {
		this.mayooresgenerales = mayooresgenerales;
	}
	
	public MayooresGenerales getmayooresgeneralesAux() {
		return this.mayooresgeneralesAux;
	}

	public void setmayooresgeneralesAux(MayooresGenerales mayooresgeneralesAux) {
		this.mayooresgeneralesAux = mayooresgeneralesAux;
	}				
	
	public MayooresGenerales getmayooresgeneralesAnterior() {
		return this.mayooresgeneralesAnterior;
	}

	public void setmayooresgeneralesAnterior(MayooresGenerales mayooresgeneralesAnterior) {
		this.mayooresgeneralesAnterior = mayooresgeneralesAnterior;
	}	
	
	public MayooresGenerales getmayooresgeneralesTotales() {
		return this.mayooresgeneralesTotales;
	}

	public void setmayooresgeneralesTotales(MayooresGenerales mayooresgeneralesTotales) {
		this.mayooresgeneralesTotales = mayooresgeneralesTotales;
	}	
	
	public MayooresGenerales getmayooresgeneralesBean() {
		return this.mayooresgeneralesBean;
	}

	public void setmayooresgeneralesBean(MayooresGenerales mayooresgeneralesBean) {
		this.mayooresgeneralesBean = mayooresgeneralesBean;
	}	
	
	public MayooresGeneralesParameterReturnGeneral getmayooresgeneralesReturnGeneral() {
		return this.mayooresgeneralesReturnGeneral;
	}

	public void setmayooresgeneralesReturnGeneral(MayooresGeneralesParameterReturnGeneral mayooresgeneralesReturnGeneral) {
		this.mayooresgeneralesReturnGeneral = mayooresgeneralesReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaMayooresGenerales=-1L;

	public Long getid_ejercicioBusquedaMayooresGenerales() {
		return this.id_ejercicioBusquedaMayooresGenerales;
	}

	public void setid_ejercicioBusquedaMayooresGenerales(Long id_ejercicioBusquedaMayooresGenerales) {
		this.id_ejercicioBusquedaMayooresGenerales = id_ejercicioBusquedaMayooresGenerales;
	}

;
	public Long id_cuenta_contableBusquedaMayooresGenerales=-1L;

	public Long getid_cuenta_contableBusquedaMayooresGenerales() {
		return this.id_cuenta_contableBusquedaMayooresGenerales;
	}

	public void setid_cuenta_contableBusquedaMayooresGenerales(Long id_cuenta_contableBusquedaMayooresGenerales) {
		this.id_cuenta_contableBusquedaMayooresGenerales = id_cuenta_contableBusquedaMayooresGenerales;
	}

;
	public Date fecha_emision_desdeBusquedaMayooresGenerales=new Date();

	public Date getfecha_emision_desdeBusquedaMayooresGenerales() {
		return this.fecha_emision_desdeBusquedaMayooresGenerales;
	}

	public void setfecha_emision_desdeBusquedaMayooresGenerales(Date fecha_emision_desdeBusquedaMayooresGenerales) {
		this.fecha_emision_desdeBusquedaMayooresGenerales = fecha_emision_desdeBusquedaMayooresGenerales;
	}

;
	public Date fecha_emision_hastaBusquedaMayooresGenerales=new Date();

	public Date getfecha_emision_hastaBusquedaMayooresGenerales() {
		return this.fecha_emision_hastaBusquedaMayooresGenerales;
	}

	public void setfecha_emision_hastaBusquedaMayooresGenerales(Date fecha_emision_hastaBusquedaMayooresGenerales) {
		this.fecha_emision_hastaBusquedaMayooresGenerales = fecha_emision_hastaBusquedaMayooresGenerales;
	}

	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public MayooresGeneralesLogic getMayooresGeneralesLogic()	{		
		return mayooresgeneralesLogic;
	}

	public void setMayooresGeneralesLogic(MayooresGeneralesLogic mayooresgeneralesLogic) {
		this.mayooresgeneralesLogic = mayooresgeneralesLogic;
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
	
	public Boolean getIsEsNuevoMayooresGenerales() {
		return isEsNuevoMayooresGenerales;
	}

	public void setIsEsNuevoMayooresGenerales(Boolean isEsNuevoMayooresGenerales) {
		this.isEsNuevoMayooresGenerales = isEsNuevoMayooresGenerales;
	}

	public Boolean getEsParaAccionDesdeFormularioMayooresGenerales() {
		return esParaAccionDesdeFormularioMayooresGenerales;
	}
	
	public void setEsParaAccionDesdeFormularioMayooresGenerales(Boolean esParaAccionDesdeFormularioMayooresGenerales) {
		this.esParaAccionDesdeFormularioMayooresGenerales = esParaAccionDesdeFormularioMayooresGenerales;
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

			if(this.mayooresgeneralesSessionBean==null) {
				this.mayooresgeneralesSessionBean=new MayooresGeneralesSessionBean();
			}

			if(!this.mayooresgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(mayooresgeneralesSessionBean.getlidEmpresaActual());
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

			if(this.mayooresgeneralesSessionBean==null) {
				this.mayooresgeneralesSessionBean=new MayooresGeneralesSessionBean();
			}

			if(!this.mayooresgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(mayooresgeneralesSessionBean.getlidEjercicioActual());
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

	public void cargarCombosCuentaContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.mayooresgeneralesSessionBean==null) {
				this.mayooresgeneralesSessionBean=new MayooresGeneralesSessionBean();
			}

			if(!this.mayooresgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablesForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(mayooresgeneralesSessionBean.getlidCuentaContableActual());
					this.cuentacontablesForeignKey.add(cuentacontableLogic.getCuentaContable());
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

					if(this.mayooresgenerales!=null) {
						this.mayooresgenerales.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
						this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_empresaMayooresGenerales.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaMayooresGenerales.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
						if(this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_empresaMayooresGenerales.getItemCount()>0) {
							this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_empresaMayooresGenerales.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaMayooresGeneralesGenerico)throws Exception
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
				jComboBoxid_empresaMayooresGeneralesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaMayooresGeneralesGenerico!=null && jComboBoxid_empresaMayooresGeneralesGenerico.getItemCount()>0) {
					jComboBoxid_empresaMayooresGeneralesGenerico.setSelectedIndex(0);
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

					if(this.mayooresgenerales!=null) {
						this.mayooresgenerales.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
						this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_ejercicioMayooresGenerales.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioMayooresGenerales.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
						if(this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_ejercicioMayooresGenerales.getItemCount()>0) {
							this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_ejercicioMayooresGenerales.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaMayooresGenerales") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales!=null) {
						jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales!=null) {
							//jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioMayooresGeneralesGenerico)throws Exception
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
				jComboBoxid_ejercicioMayooresGeneralesGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioMayooresGeneralesGenerico!=null && jComboBoxid_ejercicioMayooresGeneralesGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioMayooresGeneralesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableForeignKey(Long idCuentaContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontableTemp!=null) {

					if(this.mayooresgenerales!=null) {
						this.mayooresgenerales.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
						this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_cuenta_contableMayooresGenerales.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableMayooresGenerales.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
						if(this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_cuenta_contableMayooresGenerales.getItemCount()>0) {
							this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_cuenta_contableMayooresGenerales.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaMayooresGenerales") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales!=null) {
						jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales!=null) {
							//jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.getItemCount()>0) {
								jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.setSelectedIndex(0);
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

	public String getActualCuentaContableForeignKeyDescripcion(Long idCuentaContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableMayooresGeneralesGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(cuentacontableTemp!=null) {
				jComboBoxid_cuenta_contableMayooresGeneralesGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableMayooresGeneralesGenerico!=null && jComboBoxid_cuenta_contableMayooresGeneralesGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableMayooresGeneralesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(MayooresGenerales mayooresgenerales,JComboBox jComboBoxid_empresaMayooresGeneralesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaMayooresGeneralesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_empresaMayooresGenerales.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaMayooresGeneralesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				mayooresgenerales.setid_empresa(empresaAux.getId());
				mayooresgenerales.setempresa_descripcion(MayooresGeneralesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				mayooresgenerales.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(MayooresGenerales mayooresgenerales,JComboBox jComboBoxid_ejercicioMayooresGeneralesGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioMayooresGeneralesGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_ejercicioMayooresGenerales.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioMayooresGeneralesGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				mayooresgenerales.setid_ejercicio(ejercicioAux.getId());
				mayooresgenerales.setejercicio_descripcion(MayooresGeneralesConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				mayooresgenerales.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(MayooresGenerales mayooresgenerales,JComboBox jComboBoxid_cuenta_contableMayooresGeneralesGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableMayooresGeneralesGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_cuenta_contableMayooresGenerales.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableMayooresGeneralesGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				mayooresgenerales.setid_cuenta_contable(cuentacontableAux.getId());
				mayooresgenerales.setcuentacontable_descripcion(MayooresGeneralesConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				mayooresgenerales.setCuentaContable(cuentacontableAux);			}
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

					if(!MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { 
							this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_empresaMayooresGenerales.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_empresaMayooresGenerales.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { 
					}

					if(!MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { 
							this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_ejercicioMayooresGenerales.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_ejercicioMayooresGenerales.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { 
					}

					if(!MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaMayooresGenerales") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.addItem(ejercicio);
							}
						}

						if(!MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { 
							this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_cuenta_contableMayooresGenerales.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_cuenta_contableMayooresGenerales.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { 
					}

					if(!MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaMayooresGenerales") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.addItem(cuentacontable);
							}
						}

						if(!MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
							this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_empresaMayooresGenerales.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
							this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_empresaMayooresGenerales.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
							this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_ejercicioMayooresGenerales.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
							this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_ejercicioMayooresGenerales.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableForeignKey(CuentaContable cuentacontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
							this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_cuenta_contableMayooresGenerales.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
							this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_cuenta_contableMayooresGenerales.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesMayooresGenerales() throws Exception {
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
		
	public MayooresGeneralesParameterReturnGeneral getMayooresGeneralesParameterGeneral() {
		return this.mayooresgeneralesParameterGeneral;
	}
	
	public void setMayooresGeneralesParameterGeneral(MayooresGeneralesParameterReturnGeneral mayooresgeneralesParameterGeneral) {
		this.mayooresgeneralesParameterGeneral = mayooresgeneralesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoMayooresGenerales() {
		return isPermisoTodoMayooresGenerales;
	}

	public void setIsPermisoTodoMayooresGenerales(Boolean isPermisoTodoMayooresGenerales) {
		this.isPermisoTodoMayooresGenerales = isPermisoTodoMayooresGenerales;
	}

	public Boolean getIsPermisoNuevoMayooresGenerales() {
		return isPermisoNuevoMayooresGenerales;
	}

	public void setIsPermisoNuevoMayooresGenerales(Boolean isPermisoNuevoMayooresGenerales) {
		this.isPermisoNuevoMayooresGenerales = isPermisoNuevoMayooresGenerales;
	}

	public Boolean getIsPermisoActualizarMayooresGenerales() {
		return isPermisoActualizarMayooresGenerales;
	}

	public void setIsPermisoActualizarMayooresGenerales(Boolean isPermisoActualizarMayooresGenerales) {
		this.isPermisoActualizarMayooresGenerales = isPermisoActualizarMayooresGenerales;
	}

	public Boolean getIsPermisoEliminarMayooresGenerales() {
		return isPermisoEliminarMayooresGenerales;
	}

	public void setIsPermisoEliminarMayooresGenerales(Boolean isPermisoEliminarMayooresGenerales) {
		this.isPermisoEliminarMayooresGenerales = isPermisoEliminarMayooresGenerales;
	}

	public Boolean getIsPermisoGuardarCambiosMayooresGenerales() {
		return isPermisoGuardarCambiosMayooresGenerales;
	}

	public void setIsPermisoGuardarCambiosMayooresGenerales(Boolean isPermisoGuardarCambiosMayooresGenerales) {
		this.isPermisoGuardarCambiosMayooresGenerales = isPermisoGuardarCambiosMayooresGenerales;
	}
	
	public Boolean getIsPermisoConsultaMayooresGenerales() {
		return isPermisoConsultaMayooresGenerales;
	}

	public void setIsPermisoConsultaMayooresGenerales(Boolean isPermisoConsultaMayooresGenerales) {
		this.isPermisoConsultaMayooresGenerales = isPermisoConsultaMayooresGenerales;
	}

	public Boolean getIsPermisoBusquedaMayooresGenerales() {
		return isPermisoBusquedaMayooresGenerales;
	}

	public void setIsPermisoBusquedaMayooresGenerales(Boolean isPermisoBusquedaMayooresGenerales) {
		this.isPermisoBusquedaMayooresGenerales = isPermisoBusquedaMayooresGenerales;
	}

	public Boolean getIsPermisoReporteMayooresGenerales() {
		return isPermisoReporteMayooresGenerales;
	}

	public void setIsPermisoReporteMayooresGenerales(Boolean isPermisoReporteMayooresGenerales) {
		this.isPermisoReporteMayooresGenerales = isPermisoReporteMayooresGenerales;
	}
	
	public Boolean getIsPermisoPaginacionMedioMayooresGenerales() {
		return isPermisoPaginacionMedioMayooresGenerales;
	}

	public void setIsPermisoPaginacionMedioMayooresGenerales(Boolean isPermisoPaginacionMedioMayooresGenerales) {
		this.isPermisoPaginacionMedioMayooresGenerales = isPermisoPaginacionMedioMayooresGenerales;
	}
	
	public Boolean getIsPermisoPaginacionTodoMayooresGenerales() {
		return isPermisoPaginacionTodoMayooresGenerales;
	}

	public void setIsPermisoPaginacionTodoMayooresGenerales(Boolean isPermisoPaginacionTodoMayooresGenerales) {
		this.isPermisoPaginacionTodoMayooresGenerales = isPermisoPaginacionTodoMayooresGenerales;
	}
	
	public Boolean getIsPermisoPaginacionAltoMayooresGenerales() {
		return isPermisoPaginacionAltoMayooresGenerales;
	}

	public void setIsPermisoPaginacionAltoMayooresGenerales(Boolean isPermisoPaginacionAltoMayooresGenerales) {
		this.isPermisoPaginacionAltoMayooresGenerales = isPermisoPaginacionAltoMayooresGenerales;
	}
	
	public Boolean getIsPermisoCopiarMayooresGenerales() {
		return isPermisoCopiarMayooresGenerales;
	}

	public void setIsPermisoCopiarMayooresGenerales(Boolean isPermisoCopiarMayooresGenerales) {
		this.isPermisoCopiarMayooresGenerales = isPermisoCopiarMayooresGenerales;
	}
	
	public Boolean getIsPermisoVerFormMayooresGenerales() {
		return isPermisoVerFormMayooresGenerales;
	}

	public void setIsPermisoVerFormMayooresGenerales(Boolean isPermisoVerFormMayooresGenerales) {
		this.isPermisoVerFormMayooresGenerales = isPermisoVerFormMayooresGenerales;
	}
	
	public Boolean getIsPermisoDuplicarMayooresGenerales() {
		return isPermisoDuplicarMayooresGenerales;
	}

	public void setIsPermisoDuplicarMayooresGenerales(Boolean isPermisoDuplicarMayooresGenerales) {
		this.isPermisoDuplicarMayooresGenerales = isPermisoDuplicarMayooresGenerales;
	}
	
	public Boolean getIsPermisoOrdenMayooresGenerales() {
		return isPermisoOrdenMayooresGenerales;
	}

	public void setIsPermisoOrdenMayooresGenerales(Boolean isPermisoOrdenMayooresGenerales) {
		this.isPermisoOrdenMayooresGenerales = isPermisoOrdenMayooresGenerales;
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
	
	public Boolean getIsVisibilidadCeldaNuevoMayooresGenerales() {
		return isVisibilidadCeldaNuevoMayooresGenerales;
	}

	public void setIsVisibilidadCeldaNuevoMayooresGenerales(Boolean isVisibilidadCeldaNuevoMayooresGenerales) {
		this.isVisibilidadCeldaNuevoMayooresGenerales = isVisibilidadCeldaNuevoMayooresGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarMayooresGenerales() {
		return isVisibilidadCeldaDuplicarMayooresGenerales;
	}

	public void setIsVisibilidadCeldaDuplicarMayooresGenerales(Boolean isVisibilidadCeldaDuplicarMayooresGenerales) {
		this.isVisibilidadCeldaDuplicarMayooresGenerales = isVisibilidadCeldaDuplicarMayooresGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarMayooresGenerales() {
		return isVisibilidadCeldaCopiarMayooresGenerales;
	}

	public void setIsVisibilidadCeldaCopiarMayooresGenerales(Boolean isVisibilidadCeldaCopiarMayooresGenerales) {
		this.isVisibilidadCeldaCopiarMayooresGenerales = isVisibilidadCeldaCopiarMayooresGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormMayooresGenerales() {
		return isVisibilidadCeldaVerFormMayooresGenerales;
	}

	public void setIsVisibilidadCeldaVerFormMayooresGenerales(Boolean isVisibilidadCeldaVerFormMayooresGenerales) {
		this.isVisibilidadCeldaVerFormMayooresGenerales = isVisibilidadCeldaVerFormMayooresGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenMayooresGenerales() {
		return isVisibilidadCeldaOrdenMayooresGenerales;
	}

	public void setIsVisibilidadCeldaOrdenMayooresGenerales(Boolean isVisibilidadCeldaOrdenMayooresGenerales) {
		this.isVisibilidadCeldaOrdenMayooresGenerales = isVisibilidadCeldaOrdenMayooresGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesMayooresGenerales() {
		return isVisibilidadCeldaNuevoRelacionesMayooresGenerales;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesMayooresGenerales(Boolean isVisibilidadCeldaNuevoRelacionesMayooresGenerales) {
		this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales = isVisibilidadCeldaNuevoRelacionesMayooresGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaModificarMayooresGenerales() {
		return isVisibilidadCeldaModificarMayooresGenerales;
	}

	public void setIsVisibilidadCeldaModificarMayooresGenerales(Boolean isVisibilidadCeldaModificarMayooresGenerales) {
		this.isVisibilidadCeldaModificarMayooresGenerales = isVisibilidadCeldaModificarMayooresGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarMayooresGenerales() {
		return isVisibilidadCeldaActualizarMayooresGenerales;
	}

	public void setIsVisibilidadCeldaActualizarMayooresGenerales(Boolean isVisibilidadCeldaActualizarMayooresGenerales) {
		this.isVisibilidadCeldaActualizarMayooresGenerales = isVisibilidadCeldaActualizarMayooresGenerales;
	}

	public Boolean getIsVisibilidadCeldaEliminarMayooresGenerales() {
		return isVisibilidadCeldaEliminarMayooresGenerales;
	}

	public void setIsVisibilidadCeldaEliminarMayooresGenerales(Boolean isVisibilidadCeldaEliminarMayooresGenerales) {
		this.isVisibilidadCeldaEliminarMayooresGenerales = isVisibilidadCeldaEliminarMayooresGenerales;
	}

	public Boolean getIsVisibilidadCeldaCancelarMayooresGenerales() {
		return isVisibilidadCeldaCancelarMayooresGenerales;
	}

	public void setIsVisibilidadCeldaCancelarMayooresGenerales(Boolean isVisibilidadCeldaCancelarMayooresGenerales) {
		this.isVisibilidadCeldaCancelarMayooresGenerales = isVisibilidadCeldaCancelarMayooresGenerales;
	}

	public Boolean getIsVisibilidadCeldaGuardarMayooresGenerales() {
		return isVisibilidadCeldaGuardarMayooresGenerales;
	}

	public void setIsVisibilidadCeldaGuardarMayooresGenerales(Boolean isVisibilidadCeldaGuardarMayooresGenerales) {
		this.isVisibilidadCeldaGuardarMayooresGenerales = isVisibilidadCeldaGuardarMayooresGenerales;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosMayooresGenerales() {
		return isVisibilidadCeldaGuardarCambiosMayooresGenerales;
	}

	public void setIsVisibilidadCeldaGuardarCambiosMayooresGenerales(Boolean isVisibilidadCeldaGuardarCambiosMayooresGenerales) {
		this.isVisibilidadCeldaGuardarCambiosMayooresGenerales = isVisibilidadCeldaGuardarCambiosMayooresGenerales;
	}
		
	public MayooresGeneralesSessionBean getmayooresgeneralesSessionBean() {
		return this.mayooresgeneralesSessionBean;
	}
	
	public void setmayooresgeneralesSessionBean(MayooresGeneralesSessionBean mayooresgeneralesSessionBean) {
		this.mayooresgeneralesSessionBean=mayooresgeneralesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaMayooresGenerales() {
		return this.isVisibilidadBusquedaMayooresGenerales;
	}

	public void setisVisibilidadBusquedaMayooresGenerales(Boolean isVisibilidadBusquedaMayooresGenerales) {
		this.isVisibilidadBusquedaMayooresGenerales=isVisibilidadBusquedaMayooresGenerales;
	}

	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(MayooresGenerales mayooresgenerales)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(mayooresgenerales,null);
				this.setActualParaGuardarEjercicioForeignKey(mayooresgenerales,null);
				this.setActualParaGuardarCuentaContableForeignKey(mayooresgenerales,null);
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
	
	public void bugActualizarReferenciaActual(MayooresGenerales mayooresgenerales,MayooresGenerales mayooresgeneralesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalMayooresGenerales(mayooresgenerales);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		mayooresgeneralesAux.setId(mayooresgenerales.getId());
		mayooresgeneralesAux.setVersionRow(mayooresgenerales.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(MayooresGenerales mayooresgeneralesLocal) throws Exception {
		
		if(this.mayooresgeneralesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(MayooresGenerales mayooresgeneralesLocal) throws Exception {	
		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				mayooresgeneralesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				mayooresgeneralesLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				mayooresgeneralesLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarMayooresGeneralesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = mayooresgeneralesValidator.getInvalidValues(this.mayooresgenerales);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(MayooresGenerales mayooresgenerales,List<MayooresGenerales> mayooresgeneraless) throws Exception {
	}		
	
	public void actualizarSelectedLista(MayooresGenerales mayooresgenerales,List<MayooresGenerales> mayooresgeneraless) throws Exception {
		try	{			
			MayooresGeneralesConstantesFunciones.actualizarSelectedLista(mayooresgenerales,mayooresgeneraless);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<MayooresGenerales> mayooresgeneralessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				mayooresgeneralessLocal=this.mayooresgeneralesLogic.getMayooresGeneraless();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				mayooresgeneralessLocal=this.mayooresgeneraless;
			}
			//ARCHITECTURE
		
			for(MayooresGenerales mayooresgeneralesLocal:mayooresgeneralessLocal) {
				if(this.permiteMantenimiento(mayooresgeneralesLocal) && mayooresgeneralesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+MayooresGeneralesConstantesFunciones.getMayooresGeneralesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(MayooresGeneralesConstantesFunciones.NOMBRESUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelnombre_sucursalMayooresGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MayooresGeneralesConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelcodigoMayooresGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MayooresGeneralesConstantesFunciones.BENEFICIARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelbeneficiarioMayooresGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MayooresGeneralesConstantesFunciones.DETALLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabeldetalleMayooresGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MayooresGeneralesConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelfecha_emisionMayooresGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MayooresGeneralesConstantesFunciones.CODIGOTIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelcodigo_tipo_movimientoMayooresGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MayooresGeneralesConstantesFunciones.NUMEROMAYOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelnumero_mayorMayooresGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MayooresGeneralesConstantesFunciones.NOMBRECUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelnombre_cuenta_contableMayooresGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MayooresGeneralesConstantesFunciones.DEBITOLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabeldebito_localMayooresGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MayooresGeneralesConstantesFunciones.CREDITOLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelcredito_localMayooresGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MayooresGeneralesConstantesFunciones.DETALLEDETALLEASIENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabeldetalle_detalle_asiento_contableMayooresGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MayooresGeneralesConstantesFunciones.CODIGOCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelcodigo_cuenta_contableMayooresGenerales,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MayooresGeneralesConstantesFunciones.SALDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelsaldoMayooresGenerales,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMayooresGenerales.jLabelnombre_sucursalMayooresGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMayooresGenerales.jLabelcodigoMayooresGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMayooresGenerales.jLabelbeneficiarioMayooresGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMayooresGenerales.jLabeldetalleMayooresGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMayooresGenerales.jLabelfecha_emisionMayooresGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMayooresGenerales.jLabelcodigo_tipo_movimientoMayooresGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMayooresGenerales.jLabelnumero_mayorMayooresGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMayooresGenerales.jLabelnombre_cuenta_contableMayooresGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMayooresGenerales.jLabeldebito_localMayooresGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMayooresGenerales.jLabelcredito_localMayooresGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMayooresGenerales.jLabeldetalle_detalle_asiento_contableMayooresGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMayooresGenerales.jLabelcodigo_cuenta_contableMayooresGenerales,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMayooresGenerales.jLabelsaldoMayooresGenerales,"");
		
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
		this.iIdNuevoMayooresGenerales--;	
		
		
		this.mayooresgeneralesAux=new MayooresGenerales();
		
		this.mayooresgeneralesAux.setId(this.iIdNuevoMayooresGenerales);
		this.mayooresgeneralesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.mayooresgeneralesLogic.getMayooresGeneraless().add(this.mayooresgeneralesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.mayooresgeneraless.add(this.mayooresgeneralesAux);
		}
		//ARCHITECTURE
		
		this.mayooresgenerales=this.mayooresgeneralesAux;
		
		if(MayooresGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioMayooresGenerales(this.mayooresgenerales);
			this.setVariablesObjetoActualToFormularioForeignKeyMayooresGenerales(this.mayooresgenerales);
		}
				
		//this.setDefaultControlesMayooresGenerales();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyMayooresGenerales();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyMayooresGenerales();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyMayooresGenerales();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMayooresGenerales(this.mayooresgeneralesBean,this.mayooresgenerales,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanMayooresGenerales(this.mayooresgeneralesReturnGeneral,this.mayooresgeneralesBean,false);
		
		if(this.mayooresgeneralesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyMayooresGenerales(this.mayooresgeneralesReturnGeneral.getMayooresGenerales());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioMayooresGenerales(this.mayooresgeneralesReturnGeneral.getMayooresGenerales());
		}
		
		if(this.mayooresgeneralesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioMayooresGenerales(this.mayooresgeneralesReturnGeneral.getMayooresGenerales(),classes);//this.mayooresgeneralesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyMayooresGenerales();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyMayooresGenerales();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MayooresGeneralesBeanSwingJInternalFrameAdditional.RecargarFormMayooresGenerales(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingMayooresGenerales(false);
						
			if(mayooresgeneralesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMayooresGenerales();
			}
			
			this.actualizarVisualTableDatosMayooresGenerales();
			
			this.jTableDatosMayooresGenerales.setRowSelectionInterval(this.getIndiceNuevoMayooresGenerales(), this.getIndiceNuevoMayooresGenerales());
			
			this.seleccionarFilaTablaMayooresGeneralesActual();
						
			this.actualizarEstadoCeldasBotonesMayooresGenerales("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesMayooresGenerales(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormMayooresGenerales.jDateChooserfecha_emision_desdeMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activarfecha_emision_desdeMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jDateChooserfecha_emision_hastaMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activarfecha_emision_hastaMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanombre_sucursalMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activarnombre_sucursalMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigoMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activarcodigoMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextAreabeneficiarioMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activarbeneficiarioMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextAreadetalleMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activardetalleMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jDateChooserfecha_emisionMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activarfecha_emisionMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigo_tipo_movimientoMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activarcodigo_tipo_movimientoMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanumero_mayorMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activarnumero_mayorMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanombre_cuenta_contableMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activarnombre_cuenta_contableMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextFielddebito_localMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activardebito_localMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcredito_localMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activarcredito_localMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextAreadetalle_detalle_asiento_contableMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activardetalle_detalle_asiento_contableMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigo_cuenta_contableMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activarcodigo_cuenta_contableMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldsaldoMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activarsaldoMayooresGenerales);	
		//
		this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_empresaMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activarid_empresaMayooresGenerales);//
		this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_ejercicioMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activarid_ejercicioMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_cuenta_contableMayooresGenerales.setEnabled(isHabilitar && this.mayooresgeneralesConstantesFunciones.activarid_cuenta_contableMayooresGenerales);
	};
	
	public void setDefaultControlesMayooresGenerales() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoMayooresGenerales(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.mayooresgeneralesSessionBean.setConGuardarRelaciones(true);			
			this.mayooresgeneralesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormMayooresGenerales.jTabbedPaneRelacionesMayooresGenerales.setVisible(true);
			
					
		} else {
			//this.mayooresgeneralesSessionBean.setConGuardarRelaciones(false);			
			this.mayooresgeneralesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormMayooresGenerales.jTabbedPaneRelacionesMayooresGenerales.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoMayooresGenerales() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MayooresGenerales mayooresgeneralesAux:this.mayooresgeneralesLogic.getMayooresGeneraless()) {
				if(mayooresgeneralesAux.getId().equals(this.iIdNuevoMayooresGenerales)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MayooresGenerales mayooresgeneralesAux:this.mayooresgeneraless) {
				if(mayooresgeneralesAux.getId().equals(this.iIdNuevoMayooresGenerales)) {
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
	
	public int getIndiceActualMayooresGenerales(MayooresGenerales mayooresgenerales,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MayooresGenerales mayooresgeneralesAux:this.mayooresgeneralesLogic.getMayooresGeneraless()) {
				if(mayooresgeneralesAux.getId().equals(mayooresgenerales.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MayooresGenerales mayooresgeneralesAux:this.mayooresgeneraless) {
				if(mayooresgeneralesAux.getId().equals(mayooresgenerales.getId())) {
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
	
	public void setCamposBaseDesdeOriginalMayooresGenerales(MayooresGenerales mayooresgeneralesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MayooresGenerales mayooresgeneralesAux:this.mayooresgeneralesLogic.getMayooresGeneraless()) {
				if(mayooresgeneralesAux.getMayooresGeneralesOriginal().getId().equals(mayooresgeneralesOriginal.getId())) {
					existe=true;
					mayooresgeneralesOriginal.setId(mayooresgeneralesAux.getId());
					mayooresgeneralesOriginal.setVersionRow(mayooresgeneralesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MayooresGenerales mayooresgeneralesAux:this.mayooresgeneraless) {
				if(mayooresgeneralesAux.getMayooresGeneralesOriginal().getId().equals(mayooresgeneralesOriginal.getId())) {
					existe=true;
					mayooresgeneralesOriginal.setId(mayooresgeneralesAux.getId());
					mayooresgeneralesOriginal.setVersionRow(mayooresgeneralesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosMayooresGenerales(Boolean esParaCancelar) throws Exception {
		mayooresgeneralessAux=new ArrayList<MayooresGenerales>();
		mayooresgeneralesAux=new MayooresGenerales();
		
		if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MayooresGenerales mayooresgeneralesAux:this.mayooresgeneralesLogic.getMayooresGeneraless()) {
					if(mayooresgeneralesAux.getId()<0) {
						mayooresgeneralessAux.add(mayooresgeneralesAux);
					}		
				}
				this.iIdNuevoMayooresGenerales=0L;
				this.mayooresgeneralesLogic.getMayooresGeneraless().removeAll(mayooresgeneralessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MayooresGenerales mayooresgeneralesAux:this.mayooresgeneraless) {
					if(mayooresgeneralesAux.getId()<0) {
						mayooresgeneralessAux.add(mayooresgeneralesAux);
					}		
				}
				this.iIdNuevoMayooresGenerales=0L;
				this.mayooresgeneraless.removeAll(mayooresgeneralessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoMayooresGenerales 
					&& this.mayooresgeneralesLogic.getMayooresGeneraless().size()>0
					) {
					mayooresgeneralesAux=this.mayooresgeneralesLogic.getMayooresGeneraless().get(this.mayooresgeneralesLogic.getMayooresGeneraless().size() - 1);
				
					if(mayooresgeneralesAux.getId()<0) {
						this.mayooresgeneralesLogic.getMayooresGeneraless().remove(mayooresgeneralesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoMayooresGenerales && this.mayooresgeneraless.size()>0) {
					mayooresgeneralesAux=this.mayooresgeneraless.get(this.mayooresgeneraless.size() - 1);
				
					if(mayooresgeneralesAux.getId()<0) {
						this.mayooresgeneraless.remove(mayooresgeneralesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoMayooresGenerales(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(mayooresgenerales.getId()<0) {
				this.mayooresgeneralesLogic.getMayooresGeneraless().remove(this.mayooresgenerales);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(mayooresgenerales.getId()<0) {
				this.mayooresgeneraless.remove(this.mayooresgenerales);
			}
		}			
	}
	
	public void setEstadosInicialesMayooresGenerales(List<MayooresGenerales> mayooresgeneralessAux) throws Exception {
		MayooresGeneralesConstantesFunciones.setEstadosInicialesMayooresGenerales(mayooresgeneralessAux);
	}
	
	public void setEstadosInicialesMayooresGenerales(MayooresGenerales mayooresgeneralesAux) throws Exception {
		MayooresGeneralesConstantesFunciones.setEstadosInicialesMayooresGenerales(mayooresgeneralesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarMayooresGeneralesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesMayooresGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarMayooresGeneralesActual()) {
				if(!this.isEsNuevoMayooresGenerales) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesMayooresGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoMayooresGenerales=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarMayooresGeneralesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Mayores Generales ?", "MANTENIMIENTO DE Mayores Generales", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesMayooresGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(MayooresGenerales mayooresgenerales) throws Exception {
		MayooresGeneralesConstantesFunciones.seleccionarAsignar(this.mayooresgenerales,mayooresgenerales);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarMayooresGenerales=this.isPermisoActualizarOriginalMayooresGenerales;
			
			
			this.seleccionarAsignar(mayooresgenerales);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesMayooresGenerales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.mayooresgeneralesSessionBean.setsFuncionBusquedaRapida(this.mayooresgeneralesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoMayooresGenerales) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosMayooresGenerales(esParaCancelar);				
				this.cancelarNuevoMayooresGenerales(esParaCancelar);								
			}
			
			this.mayooresgenerales=new MayooresGenerales();
			
			this.inicializarMayooresGenerales();
			
			this.actualizarEstadoCeldasBotonesMayooresGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarMayooresGenerales() throws Exception {
		try {
			MayooresGeneralesConstantesFunciones.inicializarMayooresGenerales(this.mayooresgenerales);
			
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
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.mayooresgeneralesLogic.getMayooresGeneraless().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteMayooresGeneraless(String sAccionBusqueda,List<MayooresGenerales> mayooresgeneralessParaReportes) throws Exception {
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
					sPathReporteFinal="MayooresGenerales"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="MayooresGeneralesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("MayooresGeneralesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="MayooresGenerales"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Mayores Generaleses");		
		parameters.put("busquedapor", MayooresGeneralesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceMayooresGenerales=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			MayooresGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			MayooresGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceMayooresGenerales=new JRBeanArrayDataSource(MayooresGeneralesJInternalFrame.TraerMayooresGeneralesBeans(mayooresgeneralessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceMayooresGenerales);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+MayooresGeneralesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+MayooresGeneralesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(MayooresGeneralesBean.TraerMayooresGeneralesBeans(mayooresgeneralessParaReportes).toArray()));
							
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
				this.generarExcelReporteMayooresGeneraless(sAccionBusqueda,sTipoArchivoReporte,mayooresgeneralessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalMayooresGeneraless(sAccionBusqueda,sTipoArchivoReporte,mayooresgeneralessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoMayooresGeneralesActionPerformed(null);
					//this.generarExcelReporteMayooresGeneraless(sAccionBusqueda,sTipoArchivoReporte,mayooresgeneralessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalMayooresGeneraless(sAccionBusqueda,sTipoArchivoReporte,mayooresgeneralessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesMayooresGeneraless(sAccionBusqueda,sTipoArchivoReporte,mayooresgeneralessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesMayooresGeneraless(sAccionBusqueda,sTipoArchivoReporte,mayooresgeneralessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteMayooresGeneraless(String sAccionBusqueda,String sTipoArchivoReporte,List<MayooresGenerales> mayooresgeneralessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mayooresgenerales";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MayooresGeneraless");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMayooresGenerales("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(MayooresGenerales mayooresgenerales : mayooresgeneralessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			MayooresGeneralesConstantesFunciones.generarExcelReporteDataMayooresGenerales("NORMAL",row,workbook,mayooresgenerales,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mayores Generales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderMayooresGenerales(String sTipo,Row row,Workbook workbook) {
		
		MayooresGeneralesConstantesFunciones.generarExcelReporteHeaderMayooresGenerales(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalMayooresGeneraless(String sAccionBusqueda,String sTipoArchivoReporte,List<MayooresGenerales> mayooresgeneralessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mayooresgenerales_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MayooresGeneraless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(MayooresGenerales mayooresgenerales : mayooresgeneralessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(MayooresGeneralesConstantesFunciones.getMayooresGeneralesDescripcion(mayooresgenerales));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getnombre_sucursal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getbeneficiario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_DETALLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_DETALLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getdetalle());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getcodigo_tipo_movimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getnumero_mayor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getnombre_cuenta_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_DEBITOLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_DEBITOLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getdebito_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_CREDITOLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_CREDITOLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getcredito_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getdetalle_detalle_asiento_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getcodigo_cuenta_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MayooresGeneralesConstantesFunciones.LABEL_SALDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_SALDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mayooresgenerales.getsaldo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mayores Generales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesMayooresGeneraless(String sAccionBusqueda,String sTipoArchivoReporte,List<MayooresGenerales> mayooresgeneralessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<MayooresGenerales> mayooresgeneralessRespaldo=null;
		
		classes=MayooresGeneralesConstantesFunciones.getClassesRelationshipsOfMayooresGenerales(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.mayooresgeneralesLogic.setDatosCliente(this.datosCliente);
		this.mayooresgeneralesLogic.setDatosDeep(this.datosDeep);
		this.mayooresgeneralesLogic.setIsConDeep(true);
		
		mayooresgeneralessRespaldo=this.mayooresgeneralesLogic.getMayooresGeneraless();
		
		this.mayooresgeneralesLogic.setMayooresGeneraless(mayooresgeneralessParaReportes);	
		this.mayooresgeneralesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		mayooresgeneralessParaReportes=this.mayooresgeneralesLogic.getMayooresGeneraless();
		this.mayooresgeneralesLogic.setMayooresGeneraless(mayooresgeneralessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mayooresgenerales_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MayooresGeneraless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMayooresGenerales("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(MayooresGenerales mayooresgenerales : mayooresgeneralessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderMayooresGenerales("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			MayooresGeneralesConstantesFunciones.generarExcelReporteDataMayooresGenerales("NORMAL",row,workbook,mayooresgenerales,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(MayooresGeneralesConstantesFunciones.getMayooresGeneralesDescripcion(mayooresgenerales));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mayores Generales",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoMayooresGenerales.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMayooresGenerales.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoMayooresGenerales.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMayooresGenerales.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessMayooresGenerales() throws Exception {		
		this.startProcessMayooresGenerales(true);
	}
	
	public void startProcessMayooresGenerales(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasMayooresGenerales ,this.jPanelParametrosReportesMayooresGenerales, this.jScrollPanelDatosMayooresGenerales,this.jPanelPaginacionMayooresGenerales, this.jScrollPanelDatosEdicionMayooresGenerales, this.jPanelAccionesMayooresGenerales,this.jPanelAccionesFormularioMayooresGenerales,this.jmenuBarMayooresGenerales,this.jmenuBarDetalleMayooresGenerales,this.jTtoolBarMayooresGenerales,this.jTtoolBarDetalleMayooresGenerales);		
		
		final JTabbedPane jTabbedPaneBusquedasMayooresGenerales=this.jTabbedPaneBusquedasMayooresGenerales; 
		
		final JPanel jPanelParametrosReportesMayooresGenerales=this.jPanelParametrosReportesMayooresGenerales;
		//final JScrollPane jScrollPanelDatosMayooresGenerales=this.jScrollPanelDatosMayooresGenerales;
		final JTable jTableDatosMayooresGenerales=this.jTableDatosMayooresGenerales;		
		final JPanel jPanelPaginacionMayooresGenerales=this.jPanelPaginacionMayooresGenerales;
		//final JScrollPane jScrollPanelDatosEdicionMayooresGenerales=this.jScrollPanelDatosEdicionMayooresGenerales;
		final JPanel jPanelAccionesMayooresGenerales=this.jPanelAccionesMayooresGenerales;
		
		JPanel jPanelCamposAuxiliarMayooresGenerales=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarMayooresGenerales=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
			jPanelCamposAuxiliarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jPanelCamposMayooresGenerales;
			jPanelAccionesFormularioAuxiliarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jPanelAccionesFormularioMayooresGenerales;
		}
		
		final JPanel jPanelCamposMayooresGenerales=jPanelCamposAuxiliarMayooresGenerales;
		final JPanel jPanelAccionesFormularioMayooresGenerales=jPanelAccionesFormularioAuxiliarMayooresGenerales;
		
		
		final JMenuBar jmenuBarMayooresGenerales=this.jmenuBarMayooresGenerales;
		final JToolBar jTtoolBarMayooresGenerales=this.jTtoolBarMayooresGenerales;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarMayooresGenerales=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMayooresGenerales=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
			jmenuBarDetalleAuxiliarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jmenuBarDetalleMayooresGenerales;
			jTtoolBarDetalleAuxiliarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jTtoolBarDetalleMayooresGenerales;
		}
		
		final JMenuBar jmenuBarDetalleMayooresGenerales=jmenuBarDetalleAuxiliarMayooresGenerales;
		final JToolBar jTtoolBarDetalleMayooresGenerales=jTtoolBarDetalleAuxiliarMayooresGenerales;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMayooresGenerales;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMayooresGenerales;
			processRunnable.jTableDatos=jTableDatosMayooresGenerales;
			processRunnable.jPanelCampos=jPanelCamposMayooresGenerales;
			processRunnable.jPanelPaginacion=jPanelPaginacionMayooresGenerales;
			processRunnable.jPanelAcciones=jPanelAccionesMayooresGenerales;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMayooresGenerales;
			
			
			processRunnable.jmenuBar=jmenuBarMayooresGenerales;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMayooresGenerales;
			processRunnable.jTtoolBar=jTtoolBarMayooresGenerales;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMayooresGenerales;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMayooresGenerales ,jPanelParametrosReportesMayooresGenerales,jTableDatosMayooresGenerales, /*jScrollPanelDatosMayooresGenerales,*/jPanelCamposMayooresGenerales,jPanelPaginacionMayooresGenerales, /*jScrollPanelDatosEdicionMayooresGenerales,*/ jPanelAccionesMayooresGenerales,jPanelAccionesFormularioMayooresGenerales,jmenuBarMayooresGenerales,jmenuBarDetalleMayooresGenerales,jTtoolBarMayooresGenerales,jTtoolBarDetalleMayooresGenerales);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMayooresGenerales ,jPanelParametrosReportesMayooresGenerales, jScrollPanelDatosMayooresGenerales,jPanelPaginacionMayooresGenerales, jScrollPanelDatosEdicionMayooresGenerales, jPanelAccionesMayooresGenerales,jPanelAccionesFormularioMayooresGenerales,jmenuBarMayooresGenerales,jmenuBarDetalleMayooresGenerales,jTtoolBarMayooresGenerales,jTtoolBarDetalleMayooresGenerales);
						
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
	
	public void finishProcessMayooresGenerales() {// throws Exception 
		this.finishProcessMayooresGenerales(true);
	}
	
	public void finishProcessMayooresGenerales(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasMayooresGenerales ,this.jPanelParametrosReportesMayooresGenerales, this.jScrollPanelDatosMayooresGenerales,this.jPanelPaginacionMayooresGenerales, this.jScrollPanelDatosEdicionMayooresGenerales, this.jPanelAccionesMayooresGenerales,this.jPanelAccionesFormularioMayooresGenerales,this.jmenuBarMayooresGenerales,this.jmenuBarDetalleMayooresGenerales,this.jTtoolBarMayooresGenerales,this.jTtoolBarDetalleMayooresGenerales);		
		
		final JTabbedPane jTabbedPaneBusquedasMayooresGenerales=this.jTabbedPaneBusquedasMayooresGenerales; 
		
		final JPanel jPanelParametrosReportesMayooresGenerales=this.jPanelParametrosReportesMayooresGenerales;
		//final JScrollPane jScrollPanelDatosMayooresGenerales=this.jScrollPanelDatosMayooresGenerales;
		final JTable jTableDatosMayooresGenerales=this.jTableDatosMayooresGenerales;		
		final JPanel jPanelPaginacionMayooresGenerales=this.jPanelPaginacionMayooresGenerales;
		//final JScrollPane jScrollPanelDatosEdicionMayooresGenerales=this.jScrollPanelDatosEdicionMayooresGenerales;
		final JPanel jPanelAccionesMayooresGenerales=this.jPanelAccionesMayooresGenerales;
		
		JPanel jPanelCamposAuxiliarMayooresGenerales=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarMayooresGenerales=new JPanel();
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
			jPanelCamposAuxiliarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jPanelCamposMayooresGenerales;
			jPanelAccionesFormularioAuxiliarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jPanelAccionesFormularioMayooresGenerales;
		}
		
		final JPanel jPanelCamposMayooresGenerales=jPanelCamposAuxiliarMayooresGenerales;
		final JPanel jPanelAccionesFormularioMayooresGenerales=jPanelAccionesFormularioAuxiliarMayooresGenerales;
		
		
		final JMenuBar jmenuBarMayooresGenerales=this.jmenuBarMayooresGenerales;		
		final JToolBar jTtoolBarMayooresGenerales=this.jTtoolBarMayooresGenerales;
				
		JMenuBar jmenuBarDetalleAuxiliarMayooresGenerales=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMayooresGenerales=new JToolBar();
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
			jmenuBarDetalleAuxiliarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jmenuBarDetalleMayooresGenerales;
			jTtoolBarDetalleAuxiliarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jTtoolBarDetalleMayooresGenerales;		
		}
		
		final JMenuBar jmenuBarDetalleMayooresGenerales=jmenuBarDetalleAuxiliarMayooresGenerales;
		final JToolBar jTtoolBarDetalleMayooresGenerales=jTtoolBarDetalleAuxiliarMayooresGenerales;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMayooresGenerales;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMayooresGenerales;
			processRunnable.jTableDatos=jTableDatosMayooresGenerales;
			processRunnable.jPanelCampos=jPanelCamposMayooresGenerales;
			processRunnable.jPanelPaginacion=jPanelPaginacionMayooresGenerales;
			processRunnable.jPanelAcciones=jPanelAccionesMayooresGenerales;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMayooresGenerales;
			
			
			processRunnable.jmenuBar=jmenuBarMayooresGenerales;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMayooresGenerales;
			processRunnable.jTtoolBar=jTtoolBarMayooresGenerales;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMayooresGenerales;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasMayooresGenerales ,jPanelParametrosReportesMayooresGenerales, jTableDatosMayooresGenerales,/*jScrollPanelDatosMayooresGenerales,*/jPanelCamposMayooresGenerales,jPanelPaginacionMayooresGenerales, /*jScrollPanelDatosEdicionMayooresGenerales,*/ jPanelAccionesMayooresGenerales,jPanelAccionesFormularioMayooresGenerales,jmenuBarMayooresGenerales,jmenuBarDetalleMayooresGenerales,jTtoolBarMayooresGenerales,jTtoolBarDetalleMayooresGenerales));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesMayooresGenerales(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarMayooresGenerales(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuMayooresGenerales(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarMayooresGenerales(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarMayooresGenerales,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleMayooresGenerales,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuMayooresGenerales(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarMayooresGenerales,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleMayooresGenerales,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.mayooresgeneralesConstantesFunciones.getsFinalQueryMayooresGenerales();
		String  finalQueryPaginacionTodos=this.mayooresgeneralesConstantesFunciones.getsFinalQueryMayooresGenerales();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=MayooresGeneralesConstantesFunciones.getArrayColumnasGlobalesNoMayooresGenerales(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=MayooresGeneralesConstantesFunciones.getArrayColumnasGlobalesMayooresGenerales(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,MayooresGeneralesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.mayooresgeneralessEliminados= new ArrayList<MayooresGenerales>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessMayooresGenerales();
		
				///*MayooresGeneralesSessionBean*/this.mayooresgeneralesSessionBean=new MayooresGeneralesSessionBean();
			
			if(this.mayooresgeneralesSessionBean==null) {
				this.mayooresgeneralesSessionBean=new MayooresGeneralesSessionBean();
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
					this.iNumeroPaginacion=MayooresGeneralesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=MayooresGeneralesConstantesFunciones.getClassesForeignKeysOfMayooresGenerales(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/mayooresgenerales."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			mayooresgeneralessAux= new ArrayList<MayooresGenerales>();
			
				
			mayooresgeneralesLogic.setDatosCliente(this.datosCliente);
			mayooresgeneralesLogic.setDatosDeep(this.datosDeep);
			mayooresgeneralesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaMayooresGenerales")) {
				this.sDetalleReporte=MayooresGeneralesConstantesFunciones.getDetalleIndiceBusquedaMayooresGenerales(id_ejercicioBusquedaMayooresGenerales,id_cuenta_contableBusquedaMayooresGenerales,fecha_emision_desdeBusquedaMayooresGenerales,fecha_emision_hastaBusquedaMayooresGenerales);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					mayooresgeneralesLogic.getMayooresGeneralessBusquedaMayooresGenerales(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaMayooresGenerales,id_cuenta_contableBusquedaMayooresGenerales,fecha_emision_desdeBusquedaMayooresGenerales,fecha_emision_hastaBusquedaMayooresGenerales);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MayooresGeneralesConstantesFunciones.getDetalleIndiceBusquedaMayooresGenerales(id_ejercicioBusquedaMayooresGenerales,id_cuenta_contableBusquedaMayooresGenerales,fecha_emision_desdeBusquedaMayooresGenerales,fecha_emision_hastaBusquedaMayooresGenerales);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MayooresGeneralesConstantesFunciones.getDetalleIndiceBusquedaMayooresGenerales(id_ejercicioBusquedaMayooresGenerales,id_cuenta_contableBusquedaMayooresGenerales,fecha_emision_desdeBusquedaMayooresGenerales,fecha_emision_hastaBusquedaMayooresGenerales);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=mayooresgeneralesLogic.getMayooresGeneraless()==null||mayooresgeneralesLogic.getMayooresGeneraless().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=mayooresgeneraless==null|| mayooresgeneraless.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						mayooresgeneralessAux=new ArrayList<MayooresGenerales>();
						mayooresgeneralessAux.addAll(mayooresgeneralesLogic.getMayooresGeneraless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mayooresgeneralessAux=new ArrayList<MayooresGenerales>();
							mayooresgeneralessAux.addAll(mayooresgeneraless);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							mayooresgeneralesLogic.getMayooresGeneralessBusquedaMayooresGenerales(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaMayooresGenerales,id_cuenta_contableBusquedaMayooresGenerales,fecha_emision_desdeBusquedaMayooresGenerales,fecha_emision_hastaBusquedaMayooresGenerales);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MayooresGeneralesConstantesFunciones.getDetalleIndiceBusquedaMayooresGenerales(id_ejercicioBusquedaMayooresGenerales,id_cuenta_contableBusquedaMayooresGenerales,fecha_emision_desdeBusquedaMayooresGenerales,fecha_emision_hastaBusquedaMayooresGenerales);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MayooresGeneralesConstantesFunciones.getDetalleIndiceBusquedaMayooresGenerales(id_ejercicioBusquedaMayooresGenerales,id_cuenta_contableBusquedaMayooresGenerales,fecha_emision_desdeBusquedaMayooresGenerales,fecha_emision_hastaBusquedaMayooresGenerales);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMayooresGeneraless("BusquedaMayooresGenerales",mayooresgeneralesLogic.getMayooresGeneraless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMayooresGeneraless("BusquedaMayooresGenerales",mayooresgeneraless);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						mayooresgeneralesLogic.setMayooresGeneraless(new ArrayList<MayooresGenerales>());
						mayooresgeneralesLogic.getMayooresGeneraless().addAll(mayooresgeneralessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mayooresgeneraless=new ArrayList<MayooresGenerales>();
							mayooresgeneraless.addAll(mayooresgeneralessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesMayooresGenerales();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessMayooresGenerales();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=mayooresgeneralesLogic.getMayooresGeneraless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mayooresgeneraless.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=mayooresgeneralesLogic.getMayooresGeneraless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mayooresgeneraless.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(MayooresGenerales mayooresgenerales) {
		Boolean permite=true;
		
		if(this.mayooresgenerales.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=MayooresGeneralesConstantesFunciones.getOrderByListaMayooresGenerales();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=MayooresGeneralesConstantesFunciones.getOrderByListaMayooresGenerales();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MayooresGenerales mayooresgenerales:mayooresgeneralesLogic.getMayooresGeneraless()) {
				if(mayooresgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					mayooresgeneralesTotales=mayooresgenerales;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MayooresGenerales mayooresgenerales:this.mayooresgeneraless) {
				if(mayooresgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					mayooresgeneralesTotales=mayooresgenerales;
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
			this.mayooresgeneralesAux=new MayooresGenerales();
			this.mayooresgeneralesAux.setsType(Constantes2.S_TOTALES);
			this.mayooresgeneralesAux.setIsNew(false);
			this.mayooresgeneralesAux.setIsChanged(false);
			this.mayooresgeneralesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//MayooresGeneralesConstantesFunciones.TotalizarValoresFilaMayooresGenerales(this.mayooresgeneralesLogic.getMayooresGeneraless(),this.mayooresgeneralesAux);
				
				//this.mayooresgeneralesLogic.getMayooresGeneraless().add(this.mayooresgeneralesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				MayooresGeneralesConstantesFunciones.TotalizarValoresFilaMayooresGenerales(this.mayooresgeneraless,this.mayooresgeneralesAux);
				
				this.mayooresgeneraless.add(this.mayooresgeneralesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		mayooresgeneralesTotales=new MayooresGenerales();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.mayooresgeneralesLogic.getMayooresGeneraless().remove(mayooresgeneralesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.mayooresgeneraless.remove(mayooresgeneralesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		mayooresgeneralesTotales=new MayooresGenerales();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MayooresGenerales mayooresgenerales:mayooresgeneralesLogic.getMayooresGeneraless()) {
				if(mayooresgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					mayooresgeneralesTotales=mayooresgenerales;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MayooresGeneralesConstantesFunciones.TotalizarValoresFilaMayooresGenerales(this.mayooresgeneralesLogic.getMayooresGeneraless(),mayooresgeneralesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MayooresGenerales mayooresgenerales:this.mayooresgeneraless) {
				if(mayooresgenerales.getsType().equals(Constantes2.S_TOTALES)) {
					mayooresgeneralesTotales=mayooresgenerales;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MayooresGeneralesConstantesFunciones.TotalizarValoresFilaMayooresGenerales(this.mayooresgeneraless,mayooresgeneralesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getMayooresGeneralessBusquedaMayooresGenerales()throws Exception {
		try {
			sAccionBusqueda="BusquedaMayooresGenerales";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMayooresGeneralessFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMayooresGeneralessFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMayooresGeneralessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getMayooresGeneralessBusquedaMayooresGenerales(String sFinalQuery,Long id_ejercicio,Long id_cuenta_contable,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mayooresgeneralesLogic.getMayooresGeneralessBusquedaMayooresGenerales(sFinalQuery,this.pagination,id_ejercicio,id_cuenta_contable,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMayooresGeneralessFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mayooresgeneralesLogic.getMayooresGeneralessFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMayooresGeneralessFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mayooresgeneralesLogic.getMayooresGeneralessFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMayooresGeneralessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mayooresgeneralesLogic.getMayooresGeneralessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosMayooresGenerales() {
		this.isPermisoTodoMayooresGenerales=false;
		this.isPermisoNuevoMayooresGenerales=false;
		this.isPermisoActualizarMayooresGenerales=false;
		this.isPermisoActualizarOriginalMayooresGenerales=false;
		this.isPermisoEliminarMayooresGenerales=false;
		this.isPermisoGuardarCambiosMayooresGenerales=false;
		this.isPermisoConsultaMayooresGenerales=true;
		this.isPermisoBusquedaMayooresGenerales=true;
		this.isPermisoReporteMayooresGenerales=true;
		this.isPermisoOrdenMayooresGenerales=false;		
		this.isPermisoPaginacionMedioMayooresGenerales=false;		
		this.isPermisoPaginacionAltoMayooresGenerales=false;		
		this.isPermisoPaginacionTodoMayooresGenerales=false;		
		this.isPermisoCopiarMayooresGenerales=false;		
		this.isPermisoVerFormMayooresGenerales=false;		
		this.isPermisoDuplicarMayooresGenerales=false;
		this.isPermisoOrdenMayooresGenerales=false;
	}
	
	public void setPermisosUsuarioMayooresGenerales(Boolean isPermiso) {
		this.isPermisoTodoMayooresGenerales=isPermiso;
		this.isPermisoNuevoMayooresGenerales=isPermiso;
		this.isPermisoActualizarMayooresGenerales=isPermiso;
		this.isPermisoActualizarOriginalMayooresGenerales=isPermiso;
		this.isPermisoEliminarMayooresGenerales=isPermiso;
		this.isPermisoGuardarCambiosMayooresGenerales=isPermiso;
		this.isPermisoConsultaMayooresGenerales=isPermiso;
		this.isPermisoBusquedaMayooresGenerales=isPermiso;
		this.isPermisoReporteMayooresGenerales=isPermiso;
		this.isPermisoOrdenMayooresGenerales=isPermiso;		
		this.isPermisoPaginacionMedioMayooresGenerales=isPermiso;		
		this.isPermisoPaginacionAltoMayooresGenerales=isPermiso;		
		this.isPermisoPaginacionTodoMayooresGenerales=isPermiso;		
		this.isPermisoCopiarMayooresGenerales=isPermiso;		
		this.isPermisoVerFormMayooresGenerales=isPermiso;		
		this.isPermisoDuplicarMayooresGenerales=isPermiso;
		this.isPermisoOrdenMayooresGenerales=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioMayooresGenerales(Boolean isPermiso) {
		//this.isPermisoTodoMayooresGenerales=isPermiso;
		this.isPermisoNuevoMayooresGenerales=isPermiso;
		this.isPermisoActualizarMayooresGenerales=isPermiso;
		this.isPermisoActualizarOriginalMayooresGenerales=isPermiso;
		this.isPermisoEliminarMayooresGenerales=isPermiso;
		this.isPermisoGuardarCambiosMayooresGenerales=isPermiso;
		//this.isPermisoConsultaMayooresGenerales=isPermiso;
		//this.isPermisoBusquedaMayooresGenerales=isPermiso;
		//this.isPermisoReporteMayooresGenerales=isPermiso;
		//this.isPermisoOrdenMayooresGenerales=isPermiso;		
		//this.isPermisoPaginacionMedioMayooresGenerales=isPermiso;		
		//this.isPermisoPaginacionAltoMayooresGenerales=isPermiso;		
		//this.isPermisoPaginacionTodoMayooresGenerales=isPermiso;		
		//this.isPermisoCopiarMayooresGenerales=isPermiso;		
		//this.isPermisoDuplicarMayooresGenerales=isPermiso;
		//this.isPermisoOrdenMayooresGenerales=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioMayooresGeneralesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(MayooresGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebMayooresGenerales(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioMayooresGeneralesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioMayooresGeneralesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionMayooresGeneralesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioMayooresGeneralesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioMayooresGenerales() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(MayooresGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, MayooresGeneralesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoMayooresGenerales=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarMayooresGenerales=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalMayooresGenerales=this.isPermisoActualizarMayooresGenerales;
			this.isPermisoEliminarMayooresGenerales=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosMayooresGenerales=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaMayooresGenerales=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaMayooresGenerales=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoMayooresGenerales=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteMayooresGenerales=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMayooresGenerales=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioMayooresGenerales=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoMayooresGenerales=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoMayooresGenerales=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarMayooresGenerales=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormMayooresGenerales=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarMayooresGenerales=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMayooresGenerales=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosMayooresGenerales.setToolTipText(this.jTableDatosMayooresGenerales.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioMayooresGenerales(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioMayooresGenerales(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(MayooresGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(MayooresGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioMayooresGenerales() throws Exception {
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
	public void inicializarCombosForeignKeyMayooresGeneralesListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyMayooresGeneralesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(MayooresGeneralesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCuentaContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyMayooresGenerales()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyCuentaContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.mayooresgeneralesSessionBean==null) {
				this.mayooresgeneralesSessionBean=new MayooresGeneralesSessionBean();
			}

			if(!this.mayooresgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.mayooresgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.mayooresgeneralesSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				CuentaContable cuentacontable=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontable.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablesForeignKey,cuentacontable,true)) {

					this.cuentacontablesForeignKey.add(0,cuentacontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyMayooresGenerales()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyMayooresGenerales(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyMayooresGenerales()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyMayooresGenerales();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyMayooresGenerales(MayooresGenerales mayooresgenerales)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyMayooresGenerales(MayooresGenerales mayooresgenerales,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyMayooresGenerales()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyMayooresGenerales()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_ejercicioMayooresGenerales.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyMayooresGenerales()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyMayooresGenerales()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroMayooresGenerales()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyMayooresGenerales()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyMayooresGenerales(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyMayooresGenerales()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_empresaMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_empresaMayooresGenerales.getItemCount()>0) {
				this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_empresaMayooresGenerales.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_ejercicioMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_ejercicioMayooresGenerales.getItemCount()>0) {
				this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_ejercicioMayooresGenerales.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_cuenta_contableMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_cuenta_contableMayooresGenerales.getItemCount()>0) {
				this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_cuenta_contableMayooresGenerales.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public MayooresGeneralesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public MayooresGeneralesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public MayooresGeneralesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.mayooresgeneralesSessionBean=new MayooresGeneralesSessionBean(); 
		this.mayooresgeneralesConstantesFunciones=new MayooresGeneralesConstantesFunciones(); 
		this.mayooresgeneralesBean=new MayooresGenerales();//(this.mayooresgeneralesConstantesFunciones); 		
		this.mayooresgeneralesReturnGeneral=new MayooresGeneralesParameterReturnGeneral(); 
		
		this.mayooresgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mayooresgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public MayooresGeneralesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public MayooresGeneralesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public MayooresGeneralesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessMayooresGenerales(true);
			
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
			
			this.mayooresgeneralesConstantesFunciones=new MayooresGeneralesConstantesFunciones(); 
			this.mayooresgeneralesBean=new MayooresGenerales();//this.mayooresgeneralesConstantesFunciones); 			
			this.mayooresgeneralesReturnGeneral=new MayooresGeneralesParameterReturnGeneral(); 
		
			MayooresGeneralesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Mayores Generales Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.mayooresgenerales=new MayooresGenerales();
			this.mayooresgeneraless = new ArrayList<MayooresGenerales>();
			this.mayooresgeneralessAux = new ArrayList<MayooresGenerales>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic=new MayooresGeneralesLogic();
				this.mayooresgeneralesLogic.getNewConnexionToDeep("");
			}
			
			//this.mayooresgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.mayooresgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormMayooresGenerales);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoMayooresGenerales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMayooresGenerales);	
					}
					
					if(this.jInternalFrameImportacionMayooresGenerales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMayooresGenerales);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByMayooresGenerales!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByMayooresGenerales);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormMayooresGenerales);
				this.jInternalFrameDetalleFormMayooresGenerales.setVisible(false);
				this.jInternalFrameDetalleFormMayooresGenerales.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoMayooresGenerales!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMayooresGenerales);
					this.jInternalFrameReporteDinamicoMayooresGenerales.setVisible(false);
					this.jInternalFrameReporteDinamicoMayooresGenerales.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionMayooresGenerales!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionMayooresGenerales);
					this.jInternalFrameImportacionMayooresGenerales.setVisible(false);
					this.jInternalFrameImportacionMayooresGenerales.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByMayooresGenerales!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByMayooresGenerales);
					this.jInternalFrameOrderByMayooresGenerales.setVisible(false);
					this.jInternalFrameOrderByMayooresGenerales.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idMayooresGeneralesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=MayooresGeneralesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.mayooresgeneralesReturnGeneral=new MayooresGeneralesParameterReturnGeneral();
			
			this.mayooresgeneralesParameterGeneral=new MayooresGeneralesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.mayooresgeneralesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(MayooresGeneralesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MayooresGeneralesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.mayooresgeneralesSessionBean.getEsGuardarRelacionado(),this.mayooresgeneralesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MayooresGeneralesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.mayooresgeneralesSessionBean.getEsGuardarRelacionado(),this.mayooresgeneralesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoMayooresGenerales=false;
			this.isVisibilidadCeldaDuplicarMayooresGenerales=true;
			this.isVisibilidadCeldaCopiarMayooresGenerales=true;
			this.isVisibilidadCeldaVerFormMayooresGenerales=true;
			this.isVisibilidadCeldaOrdenMayooresGenerales=true;
			this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales=false;
			this.isVisibilidadCeldaModificarMayooresGenerales=false;
			this.isVisibilidadCeldaActualizarMayooresGenerales=false;
			this.isVisibilidadCeldaEliminarMayooresGenerales=false;
			this.isVisibilidadCeldaCancelarMayooresGenerales=false;
			this.isVisibilidadCeldaGuardarMayooresGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosMayooresGenerales=false;
			
			
			this.isVisibilidadBusquedaMayooresGenerales=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesMayooresGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosMayooresGenerales();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioMayooresGenerales(false);
			
			this.setPermisosUsuarioMayooresGenerales();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() 
				|| (this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() && this.mayooresgeneralesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioMayooresGeneralesClasesRelacionadas();
			}
			
			if(this.mayooresgeneralesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioMayooresGeneralesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosMayooresGenerales();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualMayooresGenerales();
			}
			
			if(!this.isPermisoBusquedaMayooresGenerales) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasMayooresGenerales.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(MayooresGeneralesConstantesFunciones.getTiposSeleccionarMayooresGenerales());
				
				this.tiposColumnasSelect=MayooresGeneralesConstantesFunciones.getTiposSeleccionarMayooresGenerales(true);
				
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
			//if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioMayooresGenerales();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioMayooresGenerales(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioMayooresGenerales(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesMayooresGenerales() ;
			
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
			this.ejercicioLogic=new EjercicioLogic();
			this.cuentacontableLogic=new CuentaContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				mayooresgeneralesImplementable= (MayooresGeneralesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MayooresGeneralesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				mayooresgeneralesImplementableHome= (MayooresGeneralesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MayooresGeneralesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.mayooresgeneraless= new ArrayList<MayooresGenerales>();
			this.mayooresgeneralessEliminados= new ArrayList<MayooresGenerales>();
						
			this.isEsNuevoMayooresGenerales=false;
			this.esParaAccionDesdeFormularioMayooresGenerales=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyMayooresGenerales(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroMayooresGenerales();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			MayooresGeneralesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=MayooresGeneralesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesMayooresGenerales("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingMayooresGenerales(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioMayooresGenerales();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioMayooresGenerales();
			}
			
			MayooresGeneralesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasMayooresGenerales.getTabCount(); i++) {
					this.jTabbedPaneBusquedasMayooresGenerales.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasMayooresGenerales.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessMayooresGenerales(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga MayooresGenerales: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectMayooresGenerales() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesMayooresGenerales")) {
				iIndex=this.jInternalFrameDetalleFormMayooresGenerales.jTabbedPaneRelacionesMayooresGenerales.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormMayooresGenerales.jTabbedPaneRelacionesMayooresGenerales.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessMayooresGenerales();	
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
	
	public void cargarCombosForeignKeyMayooresGenerales(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyMayooresGenerales(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyMayooresGenerales(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyMayooresGeneralesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyMayooresGenerales();
		
		this.cargarCombosFrameForeignKeyMayooresGenerales();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyMayooresGenerales();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyMayooresGenerales();
		}
	}
	
	

	public void cargarCombosForeignKeyCuentaContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoMayooresGeneralesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.mayooresgeneralesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormMayooresGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
			
			
			if(jTableDatosMayooresGenerales.getRowCount()>=1) {
				jTableDatosMayooresGenerales.removeRowSelectionInterval(0, jTableDatosMayooresGenerales.getRowCount()-1);						
			}
			
			this.isEsNuevoMayooresGenerales=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoMayooresGenerales(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesMayooresGenerales(true);			
			//this.mayooresgenerales=new MayooresGenerales();
			//this.mayooresgenerales.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMayooresGenerales(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMayooresGenerales() ;
			
			if(MayooresGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMayooresGenerales(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.mayooresgenerales);	
			this.actualizarInformacion("INFO_PADRE",false,this.mayooresgenerales);				
			
			MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
			
			if(this.mayooresgeneralesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar MayooresGenerales: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarMayooresGeneralesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<MayooresGenerales> mayooresgeneralessSeleccionados=new ArrayList<MayooresGenerales>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosMayooresGenerales.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosMayooresGenerales.getSelectedRows().length;			
			}
			
			mayooresgeneralessSeleccionados=this.getMayooresGeneralessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoMayooresGenerales--;			
				//MayooresGenerales mayooresgeneralesAux= new MayooresGenerales();			
				//mayooresgeneralesAux.setId(this.iIdNuevoMayooresGenerales);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//MayooresGenerales mayooresgeneralesOrigen=new MayooresGenerales();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(MayooresGenerales mayooresgeneralesOrigen : mayooresgeneralessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							mayooresgeneralesOrigen =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mayooresgeneralesOrigen =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaMayooresGenerales();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.mayooresgenerales.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosMayooresGenerales(mayooresgeneralesOrigen,this.mayooresgenerales,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.mayooresgeneralesLogic.getMayooresGeneraless().add(this.mayooresgeneralesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.mayooresgeneraless.add(this.mayooresgeneralesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaMayooresGenerales(false);
				
				this.jTableDatosMayooresGenerales.setRowSelectionInterval(this.getIndiceNuevoMayooresGenerales(), this.getIndiceNuevoMayooresGenerales());
				
				int iLastRow =  this.jTableDatosMayooresGenerales.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMayooresGenerales.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMayooresGenerales.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMayooresGenerales(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<MayooresGenerales> mayooresgeneralessSeleccionados=new ArrayList<MayooresGenerales>();									
		
			MayooresGenerales mayooresgeneralesOrigen=new MayooresGenerales();
			MayooresGenerales mayooresgeneralesDestino=new MayooresGenerales();
				
			mayooresgeneralessSeleccionados=this.getMayooresGeneralessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosMayooresGenerales.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || mayooresgeneralessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosMayooresGenerales.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mayooresgeneralesOrigen =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						mayooresgeneralesOrigen =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mayooresgeneralesDestino =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						mayooresgeneralesDestino =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				mayooresgeneralesOrigen =mayooresgeneralessSeleccionados.get(0);
				mayooresgeneralesDestino =mayooresgeneralessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosMayooresGenerales(mayooresgeneralesOrigen,mayooresgeneralesDestino,true,false);
				
				mayooresgeneralesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(mayooresgeneralesDestino,mayooresgeneralesLogic.getMayooresGeneraless());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mayooresgeneralesDestino,mayooresgeneraless);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaMayooresGenerales(false);
				
				//this.jTableDatosMayooresGenerales.setRowSelectionInterval(this.getIndiceNuevoMayooresGenerales(), this.getIndiceNuevoMayooresGenerales());
				
				int iLastRow =  this.jTableDatosMayooresGenerales.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMayooresGenerales.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMayooresGenerales.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMayooresGenerales(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMayooresGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormMayooresGenerales.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesMayooresGenerales.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasMayooresGenerales.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesMayooresGenerales.setVisible(!isVisible);
			this.jPanelPaginacionMayooresGenerales.setVisible(!isVisible);
			this.jPanelAccionesMayooresGenerales.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameMayooresGenerales();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoMayooresGenerales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionMayooresGenerales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByMayooresGenerales();
			
			this.abrirFrameOrderByMayooresGenerales();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByMayooresGenerales();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleMayooresGenerales(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormMayooresGenerales);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormMayooresGenerales.isMaximum()) {
					this.jInternalFrameDetalleFormMayooresGenerales.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormMayooresGenerales.setSize(this.jInternalFrameDetalleFormMayooresGenerales.iWidthFormulario,this.jInternalFrameDetalleFormMayooresGenerales.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormMayooresGenerales.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormMayooresGenerales.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormMayooresGenerales.isMaximum()) {
						this.jInternalFrameDetalleFormMayooresGenerales.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormMayooresGenerales.jContentPaneDetalleMayooresGenerales.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormMayooresGenerales.jTabbedPaneRelacionesMayooresGenerales.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormMayooresGenerales.jContentPaneDetalleMayooresGenerales.getWidth(),MayooresGeneralesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMayooresGenerales.jTabbedPaneRelacionesMayooresGenerales.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormMayooresGenerales.jContentPaneDetalleMayooresGenerales.getWidth(),MayooresGeneralesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMayooresGenerales.jTabbedPaneRelacionesMayooresGenerales.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormMayooresGenerales.jContentPaneDetalleMayooresGenerales.getWidth(),MayooresGeneralesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormMayooresGenerales.setVisible(true);
	        this.jInternalFrameDetalleFormMayooresGenerales.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByMayooresGenerales() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByMayooresGenerales==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByMayooresGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMayooresGenerales,false,this);
				} else {
					this.jInternalFrameOrderByMayooresGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMayooresGenerales,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByMayooresGenerales);
				this.jInternalFrameOrderByMayooresGenerales.setVisible(false);
				this.jInternalFrameOrderByMayooresGenerales.setSelected(false);
				
				this.jInternalFrameOrderByMayooresGenerales.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMayooresGenerales"));
				
				this.inicializarActualizarBindingTablaOrderByMayooresGenerales();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionMayooresGenerales() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionMayooresGenerales==null) {
				
				this.jInternalFrameImportacionMayooresGenerales=new ImportacionJInternalFrame(MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMayooresGenerales);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionMayooresGenerales);
				this.jInternalFrameImportacionMayooresGenerales.setVisible(false);
				this.jInternalFrameImportacionMayooresGenerales.setSelected(false);


				this.jInternalFrameImportacionMayooresGenerales.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMayooresGenerales"));
				this.jInternalFrameImportacionMayooresGenerales.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMayooresGenerales"));
				this.jInternalFrameImportacionMayooresGenerales.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMayooresGenerales"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoMayooresGenerales() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoMayooresGenerales==null) {
				this.jInternalFrameReporteDinamicoMayooresGenerales=new ReporteDinamicoJInternalFrame(MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMayooresGenerales);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMayooresGenerales);
				this.jInternalFrameReporteDinamicoMayooresGenerales.setVisible(false);
				this.jInternalFrameReporteDinamicoMayooresGenerales.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoMayooresGenerales.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMayooresGenerales"));
				this.jInternalFrameReporteDinamicoMayooresGenerales.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMayooresGenerales"));
				this.jInternalFrameReporteDinamicoMayooresGenerales.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMayooresGenerales"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMayooresGenerales();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleMayooresGenerales() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormMayooresGenerales);
			
	       	this.jInternalFrameDetalleFormMayooresGenerales.setVisible(false);
	        this.jInternalFrameDetalleFormMayooresGenerales.setSelected(false);
			
			//this.jInternalFrameDetalleFormMayooresGenerales.dispose();
			//this.jInternalFrameDetalleFormMayooresGenerales=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoMayooresGenerales() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoMayooresGenerales.setVisible(true);
	        this.jInternalFrameReporteDinamicoMayooresGenerales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionMayooresGenerales() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionMayooresGenerales.setVisible(true);
	        this.jInternalFrameImportacionMayooresGenerales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByMayooresGenerales() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByMayooresGenerales.setVisible(true);
	        this.jInternalFrameOrderByMayooresGenerales.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByMayooresGenerales() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByMayooresGenerales.setVisible(false);
	        this.jInternalFrameOrderByMayooresGenerales.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoMayooresGenerales() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoMayooresGenerales.setVisible(false);
	        this.jInternalFrameReporteDinamicoMayooresGenerales.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionMayooresGenerales() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionMayooresGenerales.setVisible(false);
	        this.jInternalFrameImportacionMayooresGenerales.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarMayooresGenerales(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarMayooresGenerales(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesMayooresGenerales(true);
			//this.isEsNuevoMayooresGenerales=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesMayooresGenerales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMayooresGenerales(false) ;
			
			if(mayooresgeneralesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(MayooresGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMayooresGenerales(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMayooresGenerales(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaMayooresGeneralesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarMayooresGenerales(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMayooresGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesMayooresGenerales(true);
			//this.isEsNuevoMayooresGenerales=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.mayooresgenerales.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesMayooresGenerales("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesMayooresGenerales(false) ;
			
			if(MayooresGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMayooresGenerales(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMayooresGenerales(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosMayooresGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,MayooresGeneralesConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosMayooresGenerales.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesMayooresGenerales(false);
			
			//if(!this.isEsNuevoMayooresGenerales) {								
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(MayooresGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
				this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				
			}
			
			if(this.permiteMantenimiento(this.mayooresgenerales)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoMayooresGenerales=true;
					this.inicializarActualizarBindingTablaMayooresGenerales(false);
					this.isEsNuevoMayooresGenerales=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoMayooresGenerales=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoMayooresGenerales=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMayooresGenerales(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMayooresGenerales(false);
				
				this.habilitarDeshabilitarControlesMayooresGenerales(false);
			
												
				
				if(MayooresGeneralesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleMayooresGenerales();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoMayooresGeneralesActionPerformed(evt,mayooresgeneralesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualMayooresGenerales(this.mayooresgenerales,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosMayooresGenerales.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,mayooresgeneralesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.mayooresgenerales.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(MayooresGenerales.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MayooresGenerales.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				this.mayooresgenerales.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				this.mayooresgenerales.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.mayooresgenerales)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((MayooresGeneralesModel) this.jTableDatosMayooresGenerales.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoMayooresGenerales=true;
				this.inicializarActualizarBindingTablaMayooresGenerales(false);
				this.isEsNuevoMayooresGenerales=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMayooresGenerales(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMayooresGenerales(false);
				
				this.habilitarDeshabilitarControlesMayooresGenerales(false);
				
				
				
				if(MayooresGeneralesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleMayooresGenerales();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosMayooresGenerales.getRowCount()>=1) {
				jTableDatosMayooresGenerales.removeRowSelectionInterval(0, jTableDatosMayooresGenerales.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesMayooresGenerales(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaMayooresGenerales(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMayooresGenerales(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMayooresGenerales(false) ;
			
			this.isEsNuevoMayooresGenerales=false;
			
			if(MayooresGeneralesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleMayooresGenerales();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingMayooresGenerales(false);
				
				//SI ES MANUAL
				if(MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualMayooresGenerales();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoMayooresGenerales--;			
			//MayooresGenerales mayooresgeneralesAux= new MayooresGenerales();			
			//mayooresgeneralesAux.setId(this.iIdNuevoMayooresGenerales);
			
			if(this.jInternalFrameDetalleFormMayooresGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaMayooresGenerales();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
			
			this.mayooresgenerales.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.mayooresgeneralesLogic.getMayooresGeneraless().add(this.mayooresgeneralesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.mayooresgeneraless.add(this.mayooresgeneralesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaMayooresGenerales(false);
			
			this.jTableDatosMayooresGenerales.setRowSelectionInterval(this.getIndiceNuevoMayooresGenerales(), this.getIndiceNuevoMayooresGenerales());
			
			int iLastRow =  this.jTableDatosMayooresGenerales.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosMayooresGenerales.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosMayooresGenerales.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaMayooresGenerales(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingMayooresGenerales(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMayooresGenerales(false);
			
			//SI ES MANUAL
			if(MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMayooresGenerales();
			}
			
			//this.abrirFrameTreeMayooresGenerales();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionMayooresGenerales.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionMayooresGenerales.setFileImportacion(this.jInternalFrameImportacionMayooresGenerales.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionMayooresGenerales.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionMayooresGenerales.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionMayooresGenerales.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionMayooresGenerales.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<MayooresGenerales> mayooresgeneralessSeleccionados=new ArrayList<MayooresGenerales>();		

		mayooresgeneralessSeleccionados=this.getMayooresGeneralessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("MayooresGeneralesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"MayooresGeneralesBaseDesign.jrxml";
			
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
			
			this.generarReporteMayooresGeneraless("Todos",mayooresgeneralessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mayores Generales",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoMayooresGenerales.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMayooresGenerales.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_neficiario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_neficiario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_neficiario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_neficiario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MayooresGeneralesConstantesFunciones.LABEL_DETALLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talle_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talle_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talle_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talle_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoTipoMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoTipoMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoTipoMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoTipoMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMayor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMayor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMayor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMayor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MayooresGeneralesConstantesFunciones.LABEL_DEBITOLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CREDITOLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talleDetalleAsientoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talleDetalleAsientoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talleDetalleAsientoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talleDetalleAsientoContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MayooresGeneralesConstantesFunciones.LABEL_SALDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoMayooresGenerales.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoria="nombre_sucursal";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoria="beneficiario";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoria="detalle";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					sNombreCampoCategoria="codigo_tipo_movimiento";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoria="numero_mayor";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					sNombreCampoCategoria="nombre_cuenta_contable";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_DEBITOLOCAL:
					sNombreCampoCategoria="debito_local";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CREDITOLOCAL:
					sNombreCampoCategoria="credito_local";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE:
					sNombreCampoCategoria="detalle_detalle_asiento_contable";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					sNombreCampoCategoria="codigo_cuenta_contable";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoria="saldo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoriaValor="nombre_sucursal";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoriaValor="beneficiario";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoriaValor="detalle";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="codigo_tipo_movimiento";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoriaValor="numero_mayor";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					sNombreCampoCategoriaValor="nombre_cuenta_contable";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_DEBITOLOCAL:
					sNombreCampoCategoriaValor="debito_local";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CREDITOLOCAL:
					sNombreCampoCategoriaValor="credito_local";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE:
					sNombreCampoCategoriaValor="detalle_detalle_asiento_contable";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					sNombreCampoCategoriaValor="codigo_cuenta_contable";
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoriaValor="saldo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoMayooresGenerales.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMayooresGenerales.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sucursal");
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Beneficiario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"beneficiario");
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_DETALLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle",sNombreCampoCategoria,sNombreCampoCategoriaValor,"detalle");
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_tipo_movimiento");
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Mayor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_mayor");
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cuenta_contable");
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_DEBITOLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_local");
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CREDITOLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_local");
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle Detalle Asiento Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"detalle_detalle_asiento_contable");
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cuenta_contable");
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_SALDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo");
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
	
	public void jButtonGenerarExcelReporteDinamicoMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<MayooresGenerales> mayooresgeneralessSeleccionados=new ArrayList<MayooresGenerales>();		
		
		mayooresgeneralessSeleccionados=this.getMayooresGeneralessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mayooresgenerales";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("MayooresGeneraless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoMayooresGenerales.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoMayooresGenerales.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case MayooresGeneralesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getnombre_sucursal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getbeneficiario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_DETALLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_DETALLE);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getdetalle());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getcodigo_tipo_movimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getnumero_mayor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getnombre_cuenta_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_DEBITOLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_DEBITOLOCAL);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getdebito_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CREDITOLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_CREDITOLOCAL);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getcredito_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getdetalle_detalle_asiento_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getcodigo_cuenta_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MayooresGeneralesConstantesFunciones.LABEL_SALDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_SALDO);
					iRow++;

					for(MayooresGenerales mayooresgenerales:mayooresgeneralessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mayooresgenerales.getsaldo());
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
			//	this.getFilaCabeceraExportarExcelMayooresGenerales(row);				
			//	iRow++;
			//}				
			
			//for(MayooresGenerales mayooresgeneralesAux:mayooresgeneralessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelMayooresGenerales(mayooresgeneralesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mayores Generales",JOptionPane.INFORMATION_MESSAGE);
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
				this.mayooresgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMayooresGenerales(false);
			
			//SI ES MANUAL
			if(MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMayooresGenerales();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMayooresGenerales(false);
			
			//SI ES MANUAL
			if(MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMayooresGenerales();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMayooresGenerales(false);
			
			//SI ES MANUAL
			if(MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMayooresGenerales();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaMayooresGenerales() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosMayooresGenerales.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosMayooresGenerales.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosMayooresGenerales.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosMayooresGenerales.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosMayooresGenerales.setMinimumSize(dimensionMinimum);
		this.jTableDatosMayooresGenerales.setMaximumSize(dimensionMaximum);
		this.jTableDatosMayooresGenerales.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingMayooresGenerales(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingMayooresGenerales(esInicializar,true);
	}
	
	public void inicializarActualizarBindingMayooresGenerales(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaMayooresGenerales(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesMayooresGenerales(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasMayooresGenerales(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMayooresGenerales(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesMayooresGenerales(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !MayooresGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualMayooresGenerales() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaMayooresGenerales();
		
		this.inicializarActualizarBindingBotonesManualMayooresGenerales(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualMayooresGenerales();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMayooresGenerales() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualMayooresGenerales(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualMayooresGenerales(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosMayooresGenerales.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosMayooresGenerales.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteMayooresGenerales.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormMayooresGenerales.jCheckBoxPostAccionNuevoMayooresGenerales.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormMayooresGenerales.jCheckBoxPostAccionSinCerrarMayooresGenerales.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormMayooresGenerales.jCheckBoxPostAccionSinMensajeMayooresGenerales.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosMayooresGenerales.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosMayooresGenerales.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteMayooresGenerales.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
				this.jInternalFrameDetalleFormMayooresGenerales.jCheckBoxPostAccionNuevoMayooresGenerales.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormMayooresGenerales.jCheckBoxPostAccionSinCerrarMayooresGenerales.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormMayooresGenerales.jCheckBoxPostAccionSinMensajeMayooresGenerales.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionMayooresGenerales.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionMayooresGenerales.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxTiposAccionesFormularioMayooresGenerales.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesMayooresGenerales.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoMayooresGenerales!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesMayooresGenerales.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesMayooresGenerales.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarMayooresGenerales.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesMayooresGenerales.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoMayooresGenerales!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesMayooresGenerales.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralMayooresGenerales.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesMayooresGenerales(Boolean esInicializar) throws Exception {
		try	{	
			if(MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualMayooresGenerales(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesMayooresGenerales() throws Exception {
		try	{
			if(MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualMayooresGenerales();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMayooresGenerales() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxTiposAccionesFormularioMayooresGenerales.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxTiposAccionesFormularioMayooresGenerales.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualMayooresGenerales() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesMayooresGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesMayooresGenerales.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesMayooresGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesMayooresGenerales.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesMayooresGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesMayooresGenerales.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionMayooresGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionMayooresGenerales.addItem(reporte);
			}
			
			
			if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionMayooresGenerales.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionMayooresGenerales.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesMayooresGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesMayooresGenerales.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesMayooresGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesMayooresGenerales.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxTiposAccionesFormularioMayooresGenerales.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxTiposAccionesFormularioMayooresGenerales.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarMayooresGenerales.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarMayooresGenerales.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarMayooresGenerales.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMayooresGenerales();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMayooresGenerales() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMayooresGenerales!=null) {
				this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMayooresGenerales!=null) {
				this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoMayooresGenerales!=null) {
				
				if(this.jInternalFrameReporteDinamicoMayooresGenerales.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMayooresGenerales.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMayooresGenerales.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoMayooresGenerales.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMayooresGenerales.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMayooresGenerales.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=MayooresGeneralesConstantesFunciones.getTiposSeleccionarMayooresGenerales(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=MayooresGeneralesConstantesFunciones.getTiposSeleccionarMayooresGenerales(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoMayooresGenerales.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoMayooresGenerales.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=MayooresGeneralesConstantesFunciones.getTiposSeleccionarMayooresGenerales(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMayooresGenerales.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoMayooresGenerales.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualMayooresGenerales()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.getSelectedItem()!=null){this.id_ejercicioBusquedaMayooresGenerales=((Ejercicio)this.jComboBoxid_ejercicioBusquedaMayooresGeneralesMayooresGenerales.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.getSelectedItem()!=null){this.id_cuenta_contableBusquedaMayooresGenerales=((CuentaContable)this.jComboBoxid_cuenta_contableBusquedaMayooresGeneralesMayooresGenerales.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaMayooresGenerales=new Date(this.jDateChooserfecha_emision_desdeBusquedaMayooresGeneralesMayooresGenerales.getDate().getTime());
		this.fecha_emision_hastaBusquedaMayooresGenerales=new Date(this.jDateChooserfecha_emision_hastaBusquedaMayooresGeneralesMayooresGenerales.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasMayooresGenerales(Boolean esInicializar) throws Exception {				
		if(MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualMayooresGenerales();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaMayooresGenerales() throws Exception {
		this.inicializarActualizarBindingTablaMayooresGenerales(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByMayooresGenerales() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByMayooresGenerales.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByMayooresGenerales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMayooresGenerales.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByMayooresGenerales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMayooresGenerales.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosMayooresGeneralesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMayooresGeneralesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByMayooresGenerales.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMayooresGenerales.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByMayooresGenerales.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaMayooresGenerales(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=mayooresgeneralesLogic.getMayooresGeneraless().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=mayooresgeneraless.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(MayooresGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosMayooresGenerales.setModel(new MayooresGeneralesModel(this.mayooresgeneralesLogic.getMayooresGeneraless(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosMayooresGenerales.setModel(new MayooresGeneralesModel(this.mayooresgeneraless,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByMayooresGenerales!=null && this.jInternalFrameOrderByMayooresGenerales.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByMayooresGenerales();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosMayooresGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO,mayooresgeneralesConstantesFunciones.resaltarSeleccionarMayooresGenerales,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO,mayooresgeneralesConstantesFunciones.resaltarSeleccionarMayooresGenerales,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosMayooresGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,MayooresGeneralesConstantesFunciones.LABEL_ID));

		if(this.mayooresgeneralesConstantesFunciones.mostraridMayooresGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MayooresGeneralesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.mayooresgeneralesConstantesFunciones.resaltaridMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activaridMayooresGenerales,iSizeTabla,this,true,"idMayooresGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mayooresgeneralesConstantesFunciones.resaltaridMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activaridMayooresGenerales,this,true,"idMayooresGenerales","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMayooresGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL));

		if(this.mayooresgeneralesConstantesFunciones.mostrarnombre_sucursalMayooresGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mayooresgeneralesConstantesFunciones.resaltarnombre_sucursalMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarnombre_sucursalMayooresGenerales,iSizeTabla,this,true,"nombre_sucursalMayooresGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mayooresgeneralesConstantesFunciones.resaltarnombre_sucursalMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarnombre_sucursalMayooresGenerales,this,true,"nombre_sucursalMayooresGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMayooresGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,MayooresGeneralesConstantesFunciones.LABEL_CODIGO));

		if(this.mayooresgeneralesConstantesFunciones.mostrarcodigoMayooresGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MayooresGeneralesConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mayooresgeneralesConstantesFunciones.resaltarcodigoMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarcodigoMayooresGenerales,iSizeTabla,this,true,"codigoMayooresGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mayooresgeneralesConstantesFunciones.resaltarcodigoMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarcodigoMayooresGenerales,this,true,"codigoMayooresGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMayooresGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO));

		if(this.mayooresgeneralesConstantesFunciones.mostrarbeneficiarioMayooresGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mayooresgeneralesConstantesFunciones.resaltarbeneficiarioMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarbeneficiarioMayooresGenerales,iSizeTabla,this,true,"beneficiarioMayooresGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mayooresgeneralesConstantesFunciones.resaltarbeneficiarioMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarbeneficiarioMayooresGenerales,this,true,"beneficiarioMayooresGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMayooresGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,MayooresGeneralesConstantesFunciones.LABEL_DETALLE));

		if(this.mayooresgeneralesConstantesFunciones.mostrardetalleMayooresGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MayooresGeneralesConstantesFunciones.LABEL_DETALLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mayooresgeneralesConstantesFunciones.resaltardetalleMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activardetalleMayooresGenerales,iSizeTabla,this,true,"detalleMayooresGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mayooresgeneralesConstantesFunciones.resaltardetalleMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activardetalleMayooresGenerales,this,true,"detalleMayooresGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMayooresGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION));

		if(this.mayooresgeneralesConstantesFunciones.mostrarfecha_emisionMayooresGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.mayooresgeneralesConstantesFunciones.resaltarfecha_emisionMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarfecha_emisionMayooresGenerales,iSizeTabla,this,true,"fecha_emisionMayooresGenerales","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.mayooresgeneralesConstantesFunciones.resaltarfecha_emisionMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarfecha_emisionMayooresGenerales,this,true,"fecha_emisionMayooresGenerales","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMayooresGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO));

		if(this.mayooresgeneralesConstantesFunciones.mostrarcodigo_tipo_movimientoMayooresGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mayooresgeneralesConstantesFunciones.resaltarcodigo_tipo_movimientoMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarcodigo_tipo_movimientoMayooresGenerales,iSizeTabla,this,true,"codigo_tipo_movimientoMayooresGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mayooresgeneralesConstantesFunciones.resaltarcodigo_tipo_movimientoMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarcodigo_tipo_movimientoMayooresGenerales,this,true,"codigo_tipo_movimientoMayooresGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMayooresGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR));

		if(this.mayooresgeneralesConstantesFunciones.mostrarnumero_mayorMayooresGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mayooresgeneralesConstantesFunciones.resaltarnumero_mayorMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarnumero_mayorMayooresGenerales,iSizeTabla,this,true,"numero_mayorMayooresGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mayooresgeneralesConstantesFunciones.resaltarnumero_mayorMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarnumero_mayorMayooresGenerales,this,true,"numero_mayorMayooresGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMayooresGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE));

		if(this.mayooresgeneralesConstantesFunciones.mostrarnombre_cuenta_contableMayooresGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mayooresgeneralesConstantesFunciones.resaltarnombre_cuenta_contableMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarnombre_cuenta_contableMayooresGenerales,iSizeTabla,this,true,"nombre_cuenta_contableMayooresGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mayooresgeneralesConstantesFunciones.resaltarnombre_cuenta_contableMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarnombre_cuenta_contableMayooresGenerales,this,true,"nombre_cuenta_contableMayooresGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMayooresGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,MayooresGeneralesConstantesFunciones.LABEL_DEBITOLOCAL));

		if(this.mayooresgeneralesConstantesFunciones.mostrardebito_localMayooresGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MayooresGeneralesConstantesFunciones.LABEL_DEBITOLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.mayooresgeneralesConstantesFunciones.resaltardebito_localMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activardebito_localMayooresGenerales,iSizeTabla,this,true,"debito_localMayooresGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mayooresgeneralesConstantesFunciones.resaltardebito_localMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activardebito_localMayooresGenerales,this,true,"debito_localMayooresGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMayooresGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,MayooresGeneralesConstantesFunciones.LABEL_CREDITOLOCAL));

		if(this.mayooresgeneralesConstantesFunciones.mostrarcredito_localMayooresGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MayooresGeneralesConstantesFunciones.LABEL_CREDITOLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.mayooresgeneralesConstantesFunciones.resaltarcredito_localMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarcredito_localMayooresGenerales,iSizeTabla,this,true,"credito_localMayooresGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mayooresgeneralesConstantesFunciones.resaltarcredito_localMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarcredito_localMayooresGenerales,this,true,"credito_localMayooresGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMayooresGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE));

		if(this.mayooresgeneralesConstantesFunciones.mostrardetalle_detalle_asiento_contableMayooresGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mayooresgeneralesConstantesFunciones.resaltardetalle_detalle_asiento_contableMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activardetalle_detalle_asiento_contableMayooresGenerales,iSizeTabla,this,true,"detalle_detalle_asiento_contableMayooresGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mayooresgeneralesConstantesFunciones.resaltardetalle_detalle_asiento_contableMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activardetalle_detalle_asiento_contableMayooresGenerales,this,true,"detalle_detalle_asiento_contableMayooresGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMayooresGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE));

		if(this.mayooresgeneralesConstantesFunciones.mostrarcodigo_cuenta_contableMayooresGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mayooresgeneralesConstantesFunciones.resaltarcodigo_cuenta_contableMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarcodigo_cuenta_contableMayooresGenerales,iSizeTabla,this,true,"codigo_cuenta_contableMayooresGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mayooresgeneralesConstantesFunciones.resaltarcodigo_cuenta_contableMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarcodigo_cuenta_contableMayooresGenerales,this,true,"codigo_cuenta_contableMayooresGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMayooresGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,MayooresGeneralesConstantesFunciones.LABEL_SALDO));

		if(this.mayooresgeneralesConstantesFunciones.mostrarsaldoMayooresGenerales && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MayooresGeneralesConstantesFunciones.LABEL_SALDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.mayooresgeneralesConstantesFunciones.resaltarsaldoMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarsaldoMayooresGenerales,iSizeTabla,this,true,"saldoMayooresGenerales","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mayooresgeneralesConstantesFunciones.resaltarsaldoMayooresGenerales,this.mayooresgeneralesConstantesFunciones.activarsaldoMayooresGenerales,this,true,"saldoMayooresGenerales","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MayooresGeneralesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.mayooresgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.mayooresgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMayooresGenerales.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.mayooresgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.mayooresgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMayooresGenerales.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarMayooresGenerales && this.isPermisoGuardarCambiosMayooresGenerales) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.mayooresgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.mayooresgeneralesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosMayooresGenerales.addColumn(tableColumn);
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
			
			this.jTableDatosMayooresGenerales.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMayooresGenerales && this.isPermisoGuardarCambiosMayooresGenerales) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMayooresGenerales && this.isPermisoGuardarCambiosMayooresGenerales) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosMayooresGenerales.moveColumn(this.jTableDatosMayooresGenerales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosMayooresGenerales.moveColumn(this.jTableDatosMayooresGenerales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosMayooresGenerales.moveColumn(this.jTableDatosMayooresGenerales.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosMayooresGenerales.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosMayooresGenerales.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosMayooresGenerales,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!MayooresGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosMayooresGenerales.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosMayooresGenerales.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!MayooresGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!MayooresGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosMayooresGenerales.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosMayooresGenerales.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosMayooresGenerales.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=mayooresgeneralesLogic.getMayooresGeneraless().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=mayooresgeneraless.size()-1;
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
		//this.jTableDatosMayooresGenerales.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosMayooresGenerales.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosMayooresGenerales();
			
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
				
				//this.isEsNuevoMayooresGenerales=false;
					
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
			
				if(this.mayooresgeneralesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormMayooresGenerales==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMayooresGenerales.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMayooresGenerales.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.mayooresgenerales.getsType().equals("DUPLICADO")
				   || this.mayooresgenerales.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoMayooresGenerales=true;
				
				} else {
					this.isEsNuevoMayooresGenerales=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
					if(this.mayooresgenerales.getId()>=0 && !this.mayooresgenerales.getIsNew()) {						
						this.isEsNuevoMayooresGenerales=false;
						
					} else {
						this.isEsNuevoMayooresGenerales=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoMayooresGenerales(esRelaciones);						
				
				this.seleccionarMayooresGenerales(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.mayooresgenerales.getId()<0) {
					this.isEsNuevoMayooresGenerales=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarMayooresGenerales(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarMayooresGenerales(evt,rowIndex);
				}	
				
				if(this.mayooresgeneralesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion MayooresGenerales: " + this.dDif); 
					}
				}								
				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarMayooresGenerales(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.mayooresgenerales)) {
					if(this.mayooresgenerales.getId()>0) {
						this.mayooresgenerales.setIsDeleted(true);
						
						this.mayooresgeneralessEliminados.add(this.mayooresgenerales);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.mayooresgeneralesLogic.getMayooresGeneraless().remove(this.mayooresgenerales);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.mayooresgeneraless.remove(this.mayooresgenerales);				
					}
					
					
					((MayooresGeneralesModel) this.jTableDatosMayooresGenerales.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaMayooresGenerales(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarMayooresGenerales(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoMayooresGenerales) {
			
			if(this.jInternalFrameDetalleFormMayooresGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMayooresGenerales.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMayooresGenerales.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(MayooresGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioMayooresGenerales(this.mayooresgenerales);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesMayooresGenerales("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesMayooresGenerales(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMayooresGenerales() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoMayooresGenerales(MayooresGenerales mayooresgenerales) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoMayooresGenerales(mayooresgenerales,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoMayooresGenerales(MayooresGenerales mayooresgenerales,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioMayooresGenerales(mayooresgenerales);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyMayooresGenerales(mayooresgenerales,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyMayooresGenerales(mayooresgenerales);
	}
	
	public void setVariablesObjetoActualToFormularioMayooresGenerales(MayooresGenerales mayooresgenerales) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormMayooresGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormMayooresGenerales.jLabelidMayooresGenerales.setText(mayooresgenerales.getId().toString());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanombre_sucursalMayooresGenerales.setText(mayooresgenerales.getnombre_sucursal());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigoMayooresGenerales.setText(mayooresgenerales.getcodigo());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreabeneficiarioMayooresGenerales.setText(mayooresgenerales.getbeneficiario());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreadetalleMayooresGenerales.setText(mayooresgenerales.getdetalle());
			this.jInternalFrameDetalleFormMayooresGenerales.jDateChooserfecha_emisionMayooresGenerales.setDate(mayooresgenerales.getfecha_emision());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigo_tipo_movimientoMayooresGenerales.setText(mayooresgenerales.getcodigo_tipo_movimiento());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanumero_mayorMayooresGenerales.setText(mayooresgenerales.getnumero_mayor());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanombre_cuenta_contableMayooresGenerales.setText(mayooresgenerales.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFielddebito_localMayooresGenerales.setText(mayooresgenerales.getdebito_local().toString());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcredito_localMayooresGenerales.setText(mayooresgenerales.getcredito_local().toString());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreadetalle_detalle_asiento_contableMayooresGenerales.setText(mayooresgenerales.getdetalle_detalle_asiento_contable());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigo_cuenta_contableMayooresGenerales.setText(mayooresgenerales.getcodigo_cuenta_contable());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldsaldoMayooresGenerales.setText(mayooresgenerales.getsaldo().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,MayooresGenerales mayooresgeneralesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,mayooresgeneralesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,MayooresGenerales mayooresgeneralesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				mayooresgeneralesLocal=this.mayooresgenerales;
			} else {
				mayooresgeneralesLocal=this.mayooresgeneralesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(mayooresgeneralesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoMayooresGenerales(mayooresgeneralesLocal,true);
					
					if(mayooresgeneralesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(mayooresgeneralesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(mayooresgeneralesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoMayooresGenerales(MayooresGenerales mayooresgenerales,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMayooresGenerales(mayooresgenerales,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(mayooresgenerales);
	}
	
	public void setVariablesFormularioToObjetoActualMayooresGenerales(MayooresGenerales mayooresgenerales,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMayooresGenerales(mayooresgenerales,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualMayooresGenerales(MayooresGenerales mayooresgenerales,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormMayooresGenerales==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormMayooresGenerales.jLabelidMayooresGenerales.getText()==null || this.jInternalFrameDetalleFormMayooresGenerales.jLabelidMayooresGenerales.getText()=="" || this.jInternalFrameDetalleFormMayooresGenerales.jLabelidMayooresGenerales.getText()=="Id") {
				this.jInternalFrameDetalleFormMayooresGenerales.jLabelidMayooresGenerales.setText("0");
			}

			if(conColumnasBase) {mayooresgenerales.setId(Long.parseLong(this.jInternalFrameDetalleFormMayooresGenerales.jLabelidMayooresGenerales.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MayooresGeneralesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelIdMayooresGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mayooresgenerales.setnombre_sucursal(this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanombre_sucursalMayooresGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelnombre_sucursalMayooresGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mayooresgenerales.setcodigo(this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigoMayooresGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MayooresGeneralesConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelcodigoMayooresGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mayooresgenerales.setbeneficiario(this.jInternalFrameDetalleFormMayooresGenerales.jTextAreabeneficiarioMayooresGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelbeneficiarioMayooresGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mayooresgenerales.setdetalle(this.jInternalFrameDetalleFormMayooresGenerales.jTextAreadetalleMayooresGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MayooresGeneralesConstantesFunciones.LABEL_DETALLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabeldetalleMayooresGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mayooresgenerales.setfecha_emision(this.jInternalFrameDetalleFormMayooresGenerales.jDateChooserfecha_emisionMayooresGenerales.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelfecha_emisionMayooresGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mayooresgenerales.setcodigo_tipo_movimiento(this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigo_tipo_movimientoMayooresGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelcodigo_tipo_movimientoMayooresGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mayooresgenerales.setnumero_mayor(this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanumero_mayorMayooresGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelnumero_mayorMayooresGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mayooresgenerales.setnombre_cuenta_contable(this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanombre_cuenta_contableMayooresGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelnombre_cuenta_contableMayooresGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mayooresgenerales.setdebito_local(Double.parseDouble(this.jInternalFrameDetalleFormMayooresGenerales.jTextFielddebito_localMayooresGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MayooresGeneralesConstantesFunciones.LABEL_DEBITOLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabeldebito_localMayooresGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mayooresgenerales.setcredito_local(Double.parseDouble(this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcredito_localMayooresGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MayooresGeneralesConstantesFunciones.LABEL_CREDITOLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelcredito_localMayooresGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mayooresgenerales.setdetalle_detalle_asiento_contable(this.jInternalFrameDetalleFormMayooresGenerales.jTextAreadetalle_detalle_asiento_contableMayooresGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabeldetalle_detalle_asiento_contableMayooresGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mayooresgenerales.setcodigo_cuenta_contable(this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigo_cuenta_contableMayooresGenerales.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelcodigo_cuenta_contableMayooresGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mayooresgenerales.setsaldo(Double.parseDouble(this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldsaldoMayooresGenerales.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MayooresGeneralesConstantesFunciones.LABEL_SALDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMayooresGenerales.jLabelsaldoMayooresGenerales,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMayooresGenerales(MayooresGenerales mayooresgeneralesBean,MayooresGenerales mayooresgenerales,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosMayooresGenerales(MayooresGenerales mayooresgeneralesOrigen,MayooresGenerales mayooresgenerales,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && mayooresgeneralesOrigen.getId()!=null && !mayooresgeneralesOrigen.getId().equals(0L))) {mayooresgenerales.setId(mayooresgeneralesOrigen.getId());}}
			if(conDefault || (!conDefault && mayooresgeneralesOrigen.getfecha_emision_desde()!=null && !mayooresgeneralesOrigen.getfecha_emision_desde().equals(new Date()))) {mayooresgenerales.setfecha_emision_desde(mayooresgeneralesOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && mayooresgeneralesOrigen.getfecha_emision_hasta()!=null && !mayooresgeneralesOrigen.getfecha_emision_hasta().equals(new Date()))) {mayooresgenerales.setfecha_emision_hasta(mayooresgeneralesOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && mayooresgeneralesOrigen.getnombre_sucursal()!=null && !mayooresgeneralesOrigen.getnombre_sucursal().equals(""))) {mayooresgenerales.setnombre_sucursal(mayooresgeneralesOrigen.getnombre_sucursal());}
			if(conDefault || (!conDefault && mayooresgeneralesOrigen.getcodigo()!=null && !mayooresgeneralesOrigen.getcodigo().equals(""))) {mayooresgenerales.setcodigo(mayooresgeneralesOrigen.getcodigo());}
			if(conDefault || (!conDefault && mayooresgeneralesOrigen.getbeneficiario()!=null && !mayooresgeneralesOrigen.getbeneficiario().equals(""))) {mayooresgenerales.setbeneficiario(mayooresgeneralesOrigen.getbeneficiario());}
			if(conDefault || (!conDefault && mayooresgeneralesOrigen.getdetalle()!=null && !mayooresgeneralesOrigen.getdetalle().equals(""))) {mayooresgenerales.setdetalle(mayooresgeneralesOrigen.getdetalle());}
			if(conDefault || (!conDefault && mayooresgeneralesOrigen.getfecha_emision()!=null && !mayooresgeneralesOrigen.getfecha_emision().equals(new Date()))) {mayooresgenerales.setfecha_emision(mayooresgeneralesOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && mayooresgeneralesOrigen.getcodigo_tipo_movimiento()!=null && !mayooresgeneralesOrigen.getcodigo_tipo_movimiento().equals(""))) {mayooresgenerales.setcodigo_tipo_movimiento(mayooresgeneralesOrigen.getcodigo_tipo_movimiento());}
			if(conDefault || (!conDefault && mayooresgeneralesOrigen.getnumero_mayor()!=null && !mayooresgeneralesOrigen.getnumero_mayor().equals(""))) {mayooresgenerales.setnumero_mayor(mayooresgeneralesOrigen.getnumero_mayor());}
			if(conDefault || (!conDefault && mayooresgeneralesOrigen.getnombre_cuenta_contable()!=null && !mayooresgeneralesOrigen.getnombre_cuenta_contable().equals(""))) {mayooresgenerales.setnombre_cuenta_contable(mayooresgeneralesOrigen.getnombre_cuenta_contable());}
			if(conDefault || (!conDefault && mayooresgeneralesOrigen.getdebito_local()!=null && !mayooresgeneralesOrigen.getdebito_local().equals(0.0))) {mayooresgenerales.setdebito_local(mayooresgeneralesOrigen.getdebito_local());}
			if(conDefault || (!conDefault && mayooresgeneralesOrigen.getcredito_local()!=null && !mayooresgeneralesOrigen.getcredito_local().equals(0.0))) {mayooresgenerales.setcredito_local(mayooresgeneralesOrigen.getcredito_local());}
			if(conDefault || (!conDefault && mayooresgeneralesOrigen.getdetalle_detalle_asiento_contable()!=null && !mayooresgeneralesOrigen.getdetalle_detalle_asiento_contable().equals(""))) {mayooresgenerales.setdetalle_detalle_asiento_contable(mayooresgeneralesOrigen.getdetalle_detalle_asiento_contable());}
			if(conDefault || (!conDefault && mayooresgeneralesOrigen.getcodigo_cuenta_contable()!=null && !mayooresgeneralesOrigen.getcodigo_cuenta_contable().equals(""))) {mayooresgenerales.setcodigo_cuenta_contable(mayooresgeneralesOrigen.getcodigo_cuenta_contable());}
			if(conDefault || (!conDefault && mayooresgeneralesOrigen.getsaldo()!=null && !mayooresgeneralesOrigen.getsaldo().equals(0.0))) {mayooresgenerales.setsaldo(mayooresgeneralesOrigen.getsaldo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMayooresGenerales(MayooresGenerales mayooresgenerales) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMayooresGenerales.jLabelidMayooresGenerales.setText(mayooresgenerales.getId().toString());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanombre_sucursalMayooresGenerales.setText(mayooresgenerales.getnombre_sucursal());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigoMayooresGenerales.setText(mayooresgenerales.getcodigo());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreabeneficiarioMayooresGenerales.setText(mayooresgenerales.getbeneficiario());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreadetalleMayooresGenerales.setText(mayooresgenerales.getdetalle());
			this.jInternalFrameDetalleFormMayooresGenerales.jDateChooserfecha_emisionMayooresGenerales.setDate(mayooresgenerales.getfecha_emision());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigo_tipo_movimientoMayooresGenerales.setText(mayooresgenerales.getcodigo_tipo_movimiento());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanumero_mayorMayooresGenerales.setText(mayooresgenerales.getnumero_mayor());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanombre_cuenta_contableMayooresGenerales.setText(mayooresgenerales.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFielddebito_localMayooresGenerales.setText(mayooresgenerales.getdebito_local().toString());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcredito_localMayooresGenerales.setText(mayooresgenerales.getcredito_local().toString());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreadetalle_detalle_asiento_contableMayooresGenerales.setText(mayooresgenerales.getdetalle_detalle_asiento_contable());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigo_cuenta_contableMayooresGenerales.setText(mayooresgenerales.getcodigo_cuenta_contable());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldsaldoMayooresGenerales.setText(mayooresgenerales.getsaldo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMayooresGenerales(MayooresGeneralesBean mayooresgeneralesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMayooresGenerales.jLabelidMayooresGenerales.setText(mayooresgeneralesBean.getId().toString());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanombre_sucursalMayooresGenerales.setText(mayooresgeneralesBean.getnombre_sucursal());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigoMayooresGenerales.setText(mayooresgeneralesBean.getcodigo());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreabeneficiarioMayooresGenerales.setText(mayooresgeneralesBean.getbeneficiario());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreadetalleMayooresGenerales.setText(mayooresgeneralesBean.getdetalle());
			this.jInternalFrameDetalleFormMayooresGenerales.jDateChooserfecha_emisionMayooresGenerales.setDate(mayooresgeneralesBean.getfecha_emision());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigo_tipo_movimientoMayooresGenerales.setText(mayooresgeneralesBean.getcodigo_tipo_movimiento());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanumero_mayorMayooresGenerales.setText(mayooresgeneralesBean.getnumero_mayor());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanombre_cuenta_contableMayooresGenerales.setText(mayooresgeneralesBean.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFielddebito_localMayooresGenerales.setText(mayooresgeneralesBean.getdebito_local().toString());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcredito_localMayooresGenerales.setText(mayooresgeneralesBean.getcredito_local().toString());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextAreadetalle_detalle_asiento_contableMayooresGenerales.setText(mayooresgeneralesBean.getdetalle_detalle_asiento_contable());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigo_cuenta_contableMayooresGenerales.setText(mayooresgeneralesBean.getcodigo_cuenta_contable());
			this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldsaldoMayooresGenerales.setText(mayooresgeneralesBean.getsaldo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanMayooresGenerales(MayooresGeneralesParameterReturnGeneral mayooresgeneralesReturnGeneral,MayooresGeneralesBean mayooresgeneralesBean,Boolean conDefault) throws Exception { 
		try {
			MayooresGenerales mayooresgeneralesLocal=new MayooresGenerales();
			
			mayooresgeneralesLocal=mayooresgeneralesReturnGeneral.getMayooresGenerales();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && mayooresgeneralesLocal.getId()!=null && !mayooresgeneralesLocal.getId().equals(0L))) {mayooresgeneralesBean.setId(mayooresgeneralesLocal.getId());}}
			if(conDefault || (!conDefault && mayooresgeneralesLocal.getnombre_sucursal()!=null && !mayooresgeneralesLocal.getnombre_sucursal().equals(""))) {mayooresgeneralesBean.setnombre_sucursal(mayooresgeneralesLocal.getnombre_sucursal());}
			if(conDefault || (!conDefault && mayooresgeneralesLocal.getcodigo()!=null && !mayooresgeneralesLocal.getcodigo().equals(""))) {mayooresgeneralesBean.setcodigo(mayooresgeneralesLocal.getcodigo());}
			if(conDefault || (!conDefault && mayooresgeneralesLocal.getbeneficiario()!=null && !mayooresgeneralesLocal.getbeneficiario().equals(""))) {mayooresgeneralesBean.setbeneficiario(mayooresgeneralesLocal.getbeneficiario());}
			if(conDefault || (!conDefault && mayooresgeneralesLocal.getdetalle()!=null && !mayooresgeneralesLocal.getdetalle().equals(""))) {mayooresgeneralesBean.setdetalle(mayooresgeneralesLocal.getdetalle());}
			if(conDefault || (!conDefault && mayooresgeneralesLocal.getfecha_emision()!=null && !mayooresgeneralesLocal.getfecha_emision().equals(new Date()))) {mayooresgeneralesBean.setfecha_emision(mayooresgeneralesLocal.getfecha_emision());}
			if(conDefault || (!conDefault && mayooresgeneralesLocal.getcodigo_tipo_movimiento()!=null && !mayooresgeneralesLocal.getcodigo_tipo_movimiento().equals(""))) {mayooresgeneralesBean.setcodigo_tipo_movimiento(mayooresgeneralesLocal.getcodigo_tipo_movimiento());}
			if(conDefault || (!conDefault && mayooresgeneralesLocal.getnumero_mayor()!=null && !mayooresgeneralesLocal.getnumero_mayor().equals(""))) {mayooresgeneralesBean.setnumero_mayor(mayooresgeneralesLocal.getnumero_mayor());}
			if(conDefault || (!conDefault && mayooresgeneralesLocal.getnombre_cuenta_contable()!=null && !mayooresgeneralesLocal.getnombre_cuenta_contable().equals(""))) {mayooresgeneralesBean.setnombre_cuenta_contable(mayooresgeneralesLocal.getnombre_cuenta_contable());}
			if(conDefault || (!conDefault && mayooresgeneralesLocal.getdebito_local()!=null && !mayooresgeneralesLocal.getdebito_local().equals(0.0))) {mayooresgeneralesBean.setdebito_local(mayooresgeneralesLocal.getdebito_local());}
			if(conDefault || (!conDefault && mayooresgeneralesLocal.getcredito_local()!=null && !mayooresgeneralesLocal.getcredito_local().equals(0.0))) {mayooresgeneralesBean.setcredito_local(mayooresgeneralesLocal.getcredito_local());}
			if(conDefault || (!conDefault && mayooresgeneralesLocal.getdetalle_detalle_asiento_contable()!=null && !mayooresgeneralesLocal.getdetalle_detalle_asiento_contable().equals(""))) {mayooresgeneralesBean.setdetalle_detalle_asiento_contable(mayooresgeneralesLocal.getdetalle_detalle_asiento_contable());}
			if(conDefault || (!conDefault && mayooresgeneralesLocal.getcodigo_cuenta_contable()!=null && !mayooresgeneralesLocal.getcodigo_cuenta_contable().equals(""))) {mayooresgeneralesBean.setcodigo_cuenta_contable(mayooresgeneralesLocal.getcodigo_cuenta_contable());}
			if(conDefault || (!conDefault && mayooresgeneralesLocal.getsaldo()!=null && !mayooresgeneralesLocal.getsaldo().equals(0.0))) {mayooresgeneralesBean.setsaldo(mayooresgeneralesLocal.getsaldo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxMayooresGeneralesGenerico(Long idMayooresGeneralesSeleccionado,JComboBox jComboBoxMayooresGenerales,List<MayooresGenerales> mayooresgeneralessLocal)throws Exception {
		try {
			MayooresGenerales  mayooresgeneralesTemp=null;

			for(MayooresGenerales mayooresgeneralesAux:mayooresgeneralessLocal) {
				if(mayooresgeneralesAux.getId()!=null && mayooresgeneralesAux.getId().equals(idMayooresGeneralesSeleccionado)) {
					mayooresgeneralesTemp=mayooresgeneralesAux;
					break;
				}
			}

			jComboBoxMayooresGenerales.setSelectedItem(mayooresgeneralesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxMayooresGeneralesGenerico(JComboBox jComboBoxMayooresGenerales,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMayooresGenerales.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxMayooresGenerales.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMayooresGenerales.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxMayooresGenerales.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mayooresgenerales=(MayooresGenerales) mayooresgeneralesLogic.getMayooresGeneraless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			mayooresgenerales =(MayooresGenerales) mayooresgeneraless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!mayooresgenerales.getIsNew() && !mayooresgenerales.getIsChanged() && !mayooresgenerales.getIsDeleted()) {
				sDescripcion=mayooresgenerales.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=mayooresgenerales.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!mayooresgenerales.getIsNew() && !mayooresgenerales.getIsChanged() && !mayooresgenerales.getIsDeleted()) {
				sDescripcion=mayooresgenerales.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=mayooresgenerales.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!mayooresgenerales.getIsNew() && !mayooresgenerales.getIsChanged() && !mayooresgenerales.getIsDeleted()) {
				sDescripcion=mayooresgenerales.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=mayooresgenerales.getcuentacontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		MayooresGenerales mayooresgeneralesRow=new MayooresGenerales();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mayooresgeneralesRow=(MayooresGenerales) mayooresgeneralesLogic.getMayooresGeneraless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			mayooresgeneralesRow=(MayooresGenerales) mayooresgeneraless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualMayooresGenerales(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoMayooresGenerales.setVisible((this.isVisibilidadCeldaNuevoMayooresGenerales && this.isPermisoNuevoMayooresGenerales));			
			this.jButtonDuplicarMayooresGenerales.setVisible((this.isVisibilidadCeldaDuplicarMayooresGenerales && this.isPermisoDuplicarMayooresGenerales));			
			this.jButtonCopiarMayooresGenerales.setVisible((this.isVisibilidadCeldaCopiarMayooresGenerales && this.isPermisoCopiarMayooresGenerales));
			this.jButtonVerFormMayooresGenerales.setVisible((this.isVisibilidadCeldaVerFormMayooresGenerales && this.isPermisoVerFormMayooresGenerales));
			
			this.jButtonAbrirOrderByMayooresGenerales.setVisible((this.isVisibilidadCeldaOrdenMayooresGenerales && this.isPermisoOrdenMayooresGenerales));			
			
			this.jButtonNuevoRelacionesMayooresGenerales.setVisible((this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales && this.isPermisoNuevoMayooresGenerales));			
			this.jButtonNuevoGuardarCambiosMayooresGenerales.setVisible((this.isVisibilidadCeldaNuevoMayooresGenerales && this.isPermisoNuevoMayooresGenerales && this.isPermisoGuardarCambiosMayooresGenerales));
			
			if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonModificarMayooresGenerales.setVisible((this.isVisibilidadCeldaModificarMayooresGenerales && this.isPermisoActualizarMayooresGenerales));	
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonActualizarMayooresGenerales.setVisible((this.isVisibilidadCeldaActualizarMayooresGenerales && this.isPermisoActualizarMayooresGenerales));	
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonEliminarMayooresGenerales.setVisible((this.isVisibilidadCeldaEliminarMayooresGenerales && this.isPermisoEliminarMayooresGenerales));
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonCancelarMayooresGenerales.setVisible(this.isVisibilidadCeldaCancelarMayooresGenerales);							
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonGuardarCambiosMayooresGenerales.setVisible((this.isVisibilidadCeldaGuardarMayooresGenerales && this.isPermisoGuardarCambiosMayooresGenerales));			
			
			}
						
			this.jButtonGuardarCambiosTablaMayooresGenerales.setVisible((this.isVisibilidadCeldaGuardarCambiosMayooresGenerales && this.isPermisoGuardarCambiosMayooresGenerales));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarMayooresGenerales.setVisible((this.isVisibilidadCeldaNuevoMayooresGenerales && this.isPermisoNuevoMayooresGenerales));						
			this.jButtonDuplicarToolBarMayooresGenerales.setVisible((this.isVisibilidadCeldaDuplicarMayooresGenerales && this.isPermisoDuplicarMayooresGenerales));						
			this.jButtonCopiarToolBarMayooresGenerales.setVisible((this.isVisibilidadCeldaCopiarMayooresGenerales && this.isPermisoCopiarMayooresGenerales));			
			this.jButtonVerFormToolBarMayooresGenerales.setVisible((this.isVisibilidadCeldaVerFormMayooresGenerales && this.isPermisoVerFormMayooresGenerales));			
			this.jButtonAbrirOrderByToolBarMayooresGenerales.setVisible((this.isVisibilidadCeldaOrdenMayooresGenerales && this.isPermisoOrdenMayooresGenerales));
			this.jButtonNuevoRelacionesToolBarMayooresGenerales.setVisible((this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales && this.isPermisoNuevoMayooresGenerales));			
			this.jButtonNuevoGuardarCambiosToolBarMayooresGenerales.setVisible((this.isVisibilidadCeldaNuevoMayooresGenerales && this.isPermisoNuevoMayooresGenerales && this.isPermisoGuardarCambiosMayooresGenerales));			
			
			if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonModificarToolBarMayooresGenerales.setVisible((this.isVisibilidadCeldaModificarMayooresGenerales && this.isPermisoActualizarMayooresGenerales));	
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonActualizarToolBarMayooresGenerales.setVisible((this.isVisibilidadCeldaActualizarMayooresGenerales  && this.isPermisoActualizarMayooresGenerales));	
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonEliminarToolBarMayooresGenerales.setVisible((this.isVisibilidadCeldaEliminarMayooresGenerales && this.isPermisoEliminarMayooresGenerales));
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonCancelarToolBarMayooresGenerales.setVisible(this.isVisibilidadCeldaCancelarMayooresGenerales);				
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonGuardarCambiosToolBarMayooresGenerales.setVisible((this.isVisibilidadCeldaGuardarMayooresGenerales && this.isPermisoGuardarCambiosMayooresGenerales));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarMayooresGenerales.setVisible((this.isVisibilidadCeldaGuardarCambiosMayooresGenerales && this.isPermisoGuardarCambiosMayooresGenerales));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoMayooresGenerales.setVisible((this.isVisibilidadCeldaNuevoMayooresGenerales && this.isPermisoNuevoMayooresGenerales));			
			this.jMenuItemDuplicarMayooresGenerales.setVisible((this.isVisibilidadCeldaDuplicarMayooresGenerales && this.isPermisoDuplicarMayooresGenerales));			
			this.jMenuItemCopiarMayooresGenerales.setVisible((this.isVisibilidadCeldaCopiarMayooresGenerales && this.isPermisoCopiarMayooresGenerales));			
			this.jMenuItemVerFormMayooresGenerales.setVisible((this.isVisibilidadCeldaVerFormMayooresGenerales && this.isPermisoVerFormMayooresGenerales));			
			this.jMenuItemAbrirOrderByMayooresGenerales.setVisible((this.isVisibilidadCeldaOrdenMayooresGenerales && this.isPermisoOrdenMayooresGenerales));			
			//this.jMenuItemMostrarOcultarMayooresGenerales.setVisible((this.isVisibilidadCeldaOrdenMayooresGenerales && this.isPermisoOrdenMayooresGenerales));
			this.jMenuItemDetalleAbrirOrderByMayooresGenerales.setVisible((this.isVisibilidadCeldaOrdenMayooresGenerales && this.isPermisoOrdenMayooresGenerales));			
			//this.jMenuItemDetalleMostrarOcultarMayooresGenerales.setVisible((this.isVisibilidadCeldaOrdenMayooresGenerales && this.isPermisoOrdenMayooresGenerales));			
			this.jMenuItemNuevoRelacionesMayooresGenerales.setVisible((this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales && this.isPermisoNuevoMayooresGenerales));			
			this.jMenuItemNuevoGuardarCambiosMayooresGenerales.setVisible((this.isVisibilidadCeldaNuevoMayooresGenerales && this.isPermisoNuevoMayooresGenerales && this.isPermisoGuardarCambiosMayooresGenerales));									
			
			if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
			this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemModificarMayooresGenerales.setVisible((this.isVisibilidadCeldaModificarMayooresGenerales && this.isPermisoActualizarMayooresGenerales));	
			this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemActualizarMayooresGenerales.setVisible((this.isVisibilidadCeldaActualizarMayooresGenerales && this.isPermisoActualizarMayooresGenerales));	
			this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemEliminarMayooresGenerales.setVisible((this.isVisibilidadCeldaEliminarMayooresGenerales && this.isPermisoEliminarMayooresGenerales));
			this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemCancelarMayooresGenerales.setVisible(this.isVisibilidadCeldaCancelarMayooresGenerales);				
			}
			
			this.jMenuItemGuardarCambiosMayooresGenerales.setVisible((this.isVisibilidadCeldaGuardarMayooresGenerales && this.isPermisoGuardarCambiosMayooresGenerales));						
			this.jMenuItemGuardarCambiosTablaMayooresGenerales.setVisible((this.isVisibilidadCeldaGuardarCambiosMayooresGenerales && this.isPermisoGuardarCambiosMayooresGenerales));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoMayooresGenerales=this.jButtonNuevoMayooresGenerales.isVisible();
			this.isVisibilidadCeldaDuplicarMayooresGenerales=this.jButtonDuplicarMayooresGenerales.isVisible();
			this.isVisibilidadCeldaCopiarMayooresGenerales=this.jButtonCopiarMayooresGenerales.isVisible();
			this.isVisibilidadCeldaVerFormMayooresGenerales=this.jButtonVerFormMayooresGenerales.isVisible();
			
			this.isVisibilidadCeldaOrdenMayooresGenerales=this.jButtonAbrirOrderByMayooresGenerales.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales=this.jButtonNuevoRelacionesMayooresGenerales.isVisible();
			this.isVisibilidadCeldaModificarMayooresGenerales=this.jButtonModificarMayooresGenerales.isVisible();
			
			if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
			this.isVisibilidadCeldaActualizarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jButtonActualizarMayooresGenerales.isVisible();
			this.isVisibilidadCeldaEliminarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jButtonEliminarMayooresGenerales.isVisible();
			this.isVisibilidadCeldaCancelarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jButtonCancelarMayooresGenerales.isVisible();
			this.isVisibilidadCeldaGuardarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jButtonGuardarCambiosMayooresGenerales.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosMayooresGenerales=this.jButtonGuardarCambiosTablaMayooresGenerales.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoMayooresGenerales=this.jButtonNuevoToolBarMayooresGenerales.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales=this.jButtonNuevoRelacionesToolBarMayooresGenerales.isVisible();
			
			if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
			this.isVisibilidadCeldaModificarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jButtonModificarToolBarMayooresGenerales.isVisible();
			this.isVisibilidadCeldaActualizarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jButtonActualizarToolBarMayooresGenerales.isVisible();
			this.isVisibilidadCeldaEliminarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jButtonEliminarToolBarMayooresGenerales.isVisible();
			this.isVisibilidadCeldaCancelarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jButtonCancelarToolBarMayooresGenerales.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMayooresGenerales=this.jButtonGuardarCambiosToolBarMayooresGenerales.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMayooresGenerales=this.jButtonGuardarCambiosTablaToolBarMayooresGenerales.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoMayooresGenerales=this.jMenuItemNuevoMayooresGenerales.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales=this.jMenuItemNuevoRelacionesMayooresGenerales.isVisible();
			
			if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
			this.isVisibilidadCeldaModificarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemModificarMayooresGenerales.isVisible();
			this.isVisibilidadCeldaActualizarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemActualizarMayooresGenerales.isVisible();
			this.isVisibilidadCeldaEliminarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemEliminarMayooresGenerales.isVisible();
			this.isVisibilidadCeldaCancelarMayooresGenerales=this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemCancelarMayooresGenerales.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMayooresGenerales=this.jMenuItemGuardarCambiosMayooresGenerales.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMayooresGenerales=this.jMenuItemGuardarCambiosTablaMayooresGenerales.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesMayooresGenerales(Boolean esInicializar) {
		if(MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.mayooresgeneralesSessionBean.getConGuardarRelaciones()) {
				//if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesMayooresGenerales();
			}
			
			this.inicializarActualizarBindingBotonesManualMayooresGenerales(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualMayooresGenerales() {
		this.jButtonNuevoMayooresGenerales.setVisible(this.isPermisoNuevoMayooresGenerales);			
		this.jButtonDuplicarMayooresGenerales.setVisible(this.isPermisoDuplicarMayooresGenerales);			
		this.jButtonCopiarMayooresGenerales.setVisible(this.isPermisoCopiarMayooresGenerales);			
		this.jButtonVerFormMayooresGenerales.setVisible(this.isPermisoVerFormMayooresGenerales);			
		
		this.jButtonAbrirOrderByMayooresGenerales.setVisible(this.isPermisoOrdenMayooresGenerales);					
		
		this.jButtonNuevoRelacionesMayooresGenerales.setVisible(this.isPermisoNuevoMayooresGenerales);			
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonModificarMayooresGenerales.setVisible(this.isPermisoActualizarMayooresGenerales);	
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonActualizarMayooresGenerales.setVisible(this.isPermisoActualizarMayooresGenerales);	
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonEliminarMayooresGenerales.setVisible(this.isPermisoEliminarMayooresGenerales);
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonCancelarMayooresGenerales.setVisible(this.isVisibilidadCeldaCancelarMayooresGenerales);						
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonGuardarCambiosMayooresGenerales.setVisible(this.isPermisoGuardarCambiosMayooresGenerales);							
		}
		
		this.jButtonGuardarCambiosTablaMayooresGenerales.setVisible(this.isPermisoActualizarMayooresGenerales);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleMayooresGenerales() {
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonModificarMayooresGenerales.setVisible(this.isPermisoActualizarMayooresGenerales);	
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonActualizarMayooresGenerales.setVisible(this.isPermisoActualizarMayooresGenerales);	
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonEliminarMayooresGenerales.setVisible(this.isPermisoEliminarMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonCancelarMayooresGenerales.setVisible(this.isVisibilidadCeldaCancelarMayooresGenerales);							
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonGuardarCambiosMayooresGenerales.setVisible((this.isVisibilidadCeldaGuardarMayooresGenerales && this.isPermisoGuardarCambiosMayooresGenerales));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosMayooresGenerales() {
		if(MayooresGeneralesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualMayooresGenerales();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesMayooresGenerales() {
	}
	
	public void jTableDatosMayooresGeneralesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarMayooresGenerales(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.mayooresgenerales.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaMayooresGeneralesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebMayooresGenerales(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMayooresGenerales.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMayooresGenerales.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.mayooresgeneralesLogic.getConnexion());

				if(this.mayooresgenerales.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.mayooresgenerales.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMayooresGenerales=(TitledBorder)this.jScrollPanelDatosMayooresGenerales.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderMayooresGenerales.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.mayooresgenerales.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioMayooresGeneralesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebMayooresGenerales(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMayooresGenerales.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMayooresGenerales.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.mayooresgeneralesLogic.getConnexion());

				if(this.mayooresgenerales.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.mayooresgenerales.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMayooresGenerales=(TitledBorder)this.jScrollPanelDatosMayooresGenerales.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderMayooresGenerales.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.mayooresgenerales.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableMayooresGeneralesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebMayooresGenerales(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMayooresGenerales.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMayooresGenerales.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.mayooresgeneralesLogic.getConnexion());

				if(this.mayooresgenerales.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.mayooresgenerales.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMayooresGenerales=(TitledBorder)this.jScrollPanelDatosMayooresGenerales.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderMayooresGenerales.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.mayooresgenerales.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.mayooresgenerales.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.mayooresgenerales.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sucursalMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getnombre_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sucursal like '%"+this.mayooresgenerales.getnombre_sucursal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.mayooresgenerales.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbeneficiarioMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getbeneficiario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where beneficiario like '%"+this.mayooresgenerales.getbeneficiario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondetalleMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getdetalle()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where detalle like '%"+this.mayooresgenerales.getdetalle()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.mayooresgenerales.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_tipo_movimientoMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getcodigo_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_tipo_movimiento like '%"+this.mayooresgenerales.getcodigo_tipo_movimiento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mayorMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getnumero_mayor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_mayor like '%"+this.mayooresgenerales.getnumero_mayor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cuenta_contableMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getnombre_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cuenta_contable like '%"+this.mayooresgenerales.getnombre_cuenta_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_localMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getdebito_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_local = "+this.mayooresgenerales.getdebito_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_localMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getcredito_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_local = "+this.mayooresgenerales.getcredito_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondetalle_detalle_asiento_contableMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getdetalle_detalle_asiento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where detalle_detalle_asiento_contable like '%"+this.mayooresgenerales.getdetalle_detalle_asiento_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_cuenta_contableMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getcodigo_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cuenta_contable like '%"+this.mayooresgenerales.getcodigo_cuenta_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldoMayooresGeneralesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.getmayooresgenerales(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mayooresgenerales==null) {
						this.mayooresgenerales = new MayooresGenerales();
					}

					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);
				}

				if(this.mayooresgenerales.getsaldo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo = "+this.mayooresgenerales.getsaldo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMayooresGenerales(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaMayooresGeneralesMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMayooresGenerales(false,false);

			this.getMayooresGeneralessBusquedaMayooresGenerales();

			this.inicializarActualizarBindingMayooresGenerales(false);

			//if(MayooresGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMayooresGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMayooresGenerales(false,false);

			this.getMayooresGeneralessFK_IdCuentaContable();

			this.inicializarActualizarBindingMayooresGenerales(false);

			//if(MayooresGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMayooresGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMayooresGenerales(false,false);

			this.getMayooresGeneralessFK_IdEjercicio();

			this.inicializarActualizarBindingMayooresGenerales(false);

			//if(MayooresGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMayooresGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaMayooresGeneralesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMayooresGenerales(false,false);

			this.getMayooresGeneralessFK_IdEmpresa();

			this.inicializarActualizarBindingMayooresGenerales(false);

			//if(MayooresGeneralesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMayooresGenerales(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mayooresgeneralesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameMayooresGenerales() {
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
			this.jInternalFrameDetalleFormMayooresGenerales.setVisible(false);	    			
			this.jInternalFrameDetalleFormMayooresGenerales.dispose();
			this.jInternalFrameDetalleFormMayooresGenerales=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoMayooresGenerales!=null) {
			this.jInternalFrameReporteDinamicoMayooresGenerales.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoMayooresGenerales.dispose();
			this.jInternalFrameReporteDinamicoMayooresGenerales=null;
		}
		
		if(this.jInternalFrameImportacionMayooresGenerales!=null) {
			this.jInternalFrameImportacionMayooresGenerales.setVisible(false);	    			
			this.jInternalFrameImportacionMayooresGenerales.dispose();
			this.jInternalFrameImportacionMayooresGenerales=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessMayooresGenerales();
			
			MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
			
			
			if(sTipo.equals("NuevoMayooresGenerales")) {
				jButtonNuevoMayooresGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarMayooresGenerales")) {
				jButtonDuplicarMayooresGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarMayooresGenerales")) {
				jButtonCopiarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("VerFormMayooresGenerales")) {
				jButtonVerFormMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarMayooresGenerales")) {
				jButtonNuevoMayooresGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarMayooresGenerales")) {
				jButtonDuplicarMayooresGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoMayooresGenerales")) {
				jButtonNuevoMayooresGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarMayooresGenerales")) {
				jButtonDuplicarMayooresGeneralesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesMayooresGenerales")) {
				jButtonNuevoMayooresGeneralesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarMayooresGenerales")) {
				jButtonNuevoMayooresGeneralesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesMayooresGenerales")) {
				jButtonNuevoMayooresGeneralesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarMayooresGenerales")) {
				jButtonModificarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarMayooresGenerales")) {
				jButtonModificarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarMayooresGenerales")) {
				jButtonModificarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarMayooresGenerales")) {
				jButtonActualizarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarMayooresGenerales")) {
				jButtonActualizarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarMayooresGenerales")) {
				jButtonActualizarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("EliminarMayooresGenerales")) {
				jButtonEliminarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarMayooresGenerales")) {
				jButtonEliminarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarMayooresGenerales")) {
				jButtonEliminarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CancelarMayooresGenerales")) {
				jButtonCancelarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarMayooresGenerales")) {
				jButtonCancelarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarMayooresGenerales")) {
				jButtonCancelarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CerrarMayooresGenerales")) {
				jButtonCerrarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarMayooresGenerales")) {
				jButtonCerrarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarMayooresGenerales")) {
				jButtonCerrarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarMayooresGenerales")) {
				jButtonMostrarOcultarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarMayooresGenerales")) {
				jButtonCancelarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosMayooresGenerales")) {
				jButtonGuardarCambiosMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarMayooresGenerales")) {
				jButtonGuardarCambiosMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarMayooresGenerales")) {
				jButtonCopiarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarMayooresGenerales")) {
				jButtonVerFormMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosMayooresGenerales")) {
				jButtonGuardarCambiosMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarMayooresGenerales")) {
				jButtonCopiarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormMayooresGenerales")) {
				jButtonVerFormMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaMayooresGenerales")) {
				jButtonGuardarCambiosMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarMayooresGenerales")) {
				jButtonGuardarCambiosMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaMayooresGenerales")) {
				jButtonGuardarCambiosMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionMayooresGenerales")) {
				jButtonRecargarInformacionMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarMayooresGenerales")) {
				jButtonRecargarInformacionMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionMayooresGenerales")) {
				jButtonRecargarInformacionMayooresGeneralesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresMayooresGenerales")) {
				jButtonAnterioresMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarMayooresGenerales")) {
				jButtonAnterioresMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreMayooresGenerales")) {
				jButtonAnterioresMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesMayooresGenerales")) {
				jButtonSiguientesMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarMayooresGenerales")) {
				jButtonSiguientesMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesMayooresGenerales")) {
				jButtonSiguientesMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByMayooresGenerales") || sTipo.equals("MenuItemDetalleAbrirOrderByMayooresGenerales")) {
				jButtonAbrirOrderByMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarMayooresGenerales") || sTipo.equals("MenuItemDetalleMostrarOcultarMayooresGenerales")) {
				jButtonMostrarOcultarMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosMayooresGenerales")) {
				jButtonNuevoGuardarCambiosMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarMayooresGenerales")) {
				jButtonNuevoGuardarCambiosMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosMayooresGenerales")) {
				jButtonNuevoGuardarCambiosMayooresGeneralesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoMayooresGenerales")) {
				jButtonCerrarReporteDinamicoMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoMayooresGenerales")) {
				jButtonGenerarReporteDinamicoMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoMayooresGenerales")) {
				
				jButtonGenerarExcelReporteDinamicoMayooresGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionMayooresGenerales")) {
				jButtonCerrarImportacionMayooresGeneralesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionMayooresGenerales")) {
				
				jButtonGenerarImportacionMayooresGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionMayooresGenerales")) {
				
				jButtonAbrirImportacionMayooresGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesMayooresGenerales")) {
				jComboBoxTiposAccionesMayooresGeneralesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesMayooresGenerales")) {
				jComboBoxTiposRelacionesMayooresGeneralesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioMayooresGenerales")) {
				jComboBoxTiposAccionesMayooresGeneralesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarMayooresGenerales")) {
				
				jComboBoxTiposSeleccionarMayooresGeneralesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralMayooresGenerales")) {
				jTextFieldValorCampoGeneralMayooresGeneralesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByMayooresGenerales")) {
				jButtonAbrirOrderByMayooresGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarMayooresGenerales")) {
				jButtonAbrirOrderByMayooresGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByMayooresGenerales")) {
				jButtonCerrarOrderByMayooresGeneralesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMayooresGeneralesBusqueda")) {
				this.jButtonidMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMayooresGeneralesUpdate")) {
				this.jButtonid_empresaMayooresGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMayooresGeneralesBusqueda")) {
				this.jButtonid_empresaMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioMayooresGeneralesUpdate")) {
				this.jButtonid_ejercicioMayooresGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioMayooresGeneralesBusqueda")) {
				this.jButtonid_ejercicioMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableMayooresGeneralesUpdate")) {
				this.jButtonid_cuenta_contableMayooresGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableMayooresGeneralesBusqueda")) {
				this.jButtonid_cuenta_contableMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeMayooresGeneralesBusqueda")) {
				this.jButtonfecha_emision_desdeMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaMayooresGeneralesBusqueda")) {
				this.jButtonfecha_emision_hastaMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalMayooresGeneralesBusqueda")) {
				this.jButtonnombre_sucursalMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoMayooresGeneralesBusqueda")) {
				this.jButtoncodigoMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioMayooresGeneralesBusqueda")) {
				this.jButtonbeneficiarioMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleMayooresGeneralesBusqueda")) {
				this.jButtondetalleMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionMayooresGeneralesBusqueda")) {
				this.jButtonfecha_emisionMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_movimientoMayooresGeneralesBusqueda")) {
				this.jButtoncodigo_tipo_movimientoMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorMayooresGeneralesBusqueda")) {
				this.jButtonnumero_mayorMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contableMayooresGeneralesBusqueda")) {
				this.jButtonnombre_cuenta_contableMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_localMayooresGeneralesBusqueda")) {
				this.jButtondebito_localMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_localMayooresGeneralesBusqueda")) {
				this.jButtoncredito_localMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalle_detalle_asiento_contableMayooresGeneralesBusqueda")) {
				this.jButtondetalle_detalle_asiento_contableMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_contableMayooresGeneralesBusqueda")) {
				this.jButtoncodigo_cuenta_contableMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoMayooresGeneralesBusqueda")) {
				this.jButtonsaldoMayooresGeneralesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaMayooresGeneralesMayooresGenerales")) {
				this.jButtonBusquedaMayooresGeneralesMayooresGeneralesActionPerformed(evt);
			}
			
			;
			
			
			MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessMayooresGenerales();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMayooresGeneralesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mayooresgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mayooresgenerales);
				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
				
				


				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MayooresGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MayooresGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			MayooresGenerales mayooresgeneralesLocal=null;
			
			if(!this.getEsControlTabla()) {
				mayooresgeneralesLocal=this.mayooresgenerales;
			} else {
				mayooresgeneralesLocal=this.mayooresgeneralesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mayooresgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mayooresgenerales);
				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
							
				
				


				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MayooresGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MayooresGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMayooresGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesAnterior =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mayooresgeneralesAnterior =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
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
			
			MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
			
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
			
			


			
			MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMayooresGeneralesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mayooresgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mayooresgenerales);
				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
								
						
				


				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MayooresGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MayooresGenerales.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mayooresgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mayooresgenerales);
				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
								
				
				


				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MayooresGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MayooresGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMayooresGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesAnterior =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mayooresgeneralesAnterior =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mayooresgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mayooresgenerales);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMayooresGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesAnterior =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mayooresgeneralesAnterior =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMayooresGeneralesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mayooresgenerales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mayooresgenerales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mayooresgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mayooresgenerales);
				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
							
				
				


				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MayooresGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MayooresGenerales.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMayooresGeneralesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgeneralesAnterior =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.mayooresgeneralesAnterior =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
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
			
			MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
			
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
			
			


			
			MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMayooresGeneralesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mayooresgenerales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mayooresgenerales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mayooresgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mayooresgenerales);
				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
								
				
				


				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MayooresGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MayooresGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMayooresGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesAnterior =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mayooresgeneralesAnterior =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMayooresGeneralesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mayooresgenerales);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mayooresgenerales);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMayooresGeneralesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mayooresgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mayooresgenerales);
				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosMayooresGenerales")) {
					jCheckBoxSeleccionarTodosMayooresGeneralesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosMayooresGenerales")) {
					jCheckBoxSeleccionadosMayooresGeneralesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarMayooresGenerales")) {
					
				}
				
				


				
				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MayooresGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MayooresGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.mayooresgenerales);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.mayooresgenerales);
				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
												
				
				


				
				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MayooresGenerales.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MayooresGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMayooresGeneralesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mayooresgeneralesAnterior =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.mayooresgeneralesAnterior =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMayooresGeneralesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mayooresgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mayooresgenerales);
				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
				
				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
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
			
			MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
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
			
			


			
			MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMayooresGeneralesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mayooresgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mayooresgenerales);
				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MayooresGenerales.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MayooresGenerales.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mayooresgenerales);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mayooresgenerales);
				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
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
				
				


				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MayooresGenerales.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MayooresGenerales.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMayooresGeneralesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mayooresgeneralesAnterior =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mayooresgeneralesAnterior =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarMayooresGenerales")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosMayooresGeneralesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosMayooresGenerales.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.mayooresgenerales =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.mayooresgenerales);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarMayooresGenerales")) {
				
				}
				
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarMayooresGenerales")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosMayooresGenerales.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarMayooresGenerales")) {
			
			}
			
			MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessMayooresGenerales();
			
			MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
			
			if(sTipo.equals("NuevoMayooresGenerales")) {
				jButtonNuevoMayooresGeneralesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarMayooresGenerales")) {
				jButtonDuplicarMayooresGeneralesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarMayooresGenerales")) {
				jButtonCopiarMayooresGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormMayooresGenerales")) {
				jButtonVerFormMayooresGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesMayooresGenerales")) {
				jButtonNuevoMayooresGeneralesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarMayooresGenerales")) {
				jButtonModificarMayooresGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarMayooresGenerales")) {
				jButtonActualizarMayooresGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarMayooresGenerales")) {
				jButtonEliminarMayooresGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaMayooresGenerales")) {
				jButtonGuardarCambiosMayooresGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarMayooresGenerales")) {
				jButtonCancelarMayooresGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarMayooresGenerales")) {
				jButtonCerrarMayooresGeneralesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosMayooresGenerales")) {
				jButtonGuardarCambiosMayooresGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosMayooresGenerales")) {
				jButtonNuevoGuardarCambiosMayooresGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByMayooresGenerales")) {
				jButtonAbrirOrderByMayooresGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionMayooresGenerales")) {
				jButtonRecargarInformacionMayooresGeneralesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresMayooresGenerales")) {
				jButtonAnterioresMayooresGeneralesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesMayooresGenerales")) {
				jButtonSiguientesMayooresGeneralesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMayooresGeneralesBusqueda")) {
				this.jButtonidMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMayooresGeneralesUpdate")) {
				this.jButtonid_empresaMayooresGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMayooresGeneralesBusqueda")) {
				this.jButtonid_empresaMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioMayooresGeneralesUpdate")) {
				this.jButtonid_ejercicioMayooresGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioMayooresGeneralesBusqueda")) {
				this.jButtonid_ejercicioMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableMayooresGeneralesUpdate")) {
				this.jButtonid_cuenta_contableMayooresGeneralesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableMayooresGeneralesBusqueda")) {
				this.jButtonid_cuenta_contableMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeMayooresGeneralesBusqueda")) {
				this.jButtonfecha_emision_desdeMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaMayooresGeneralesBusqueda")) {
				this.jButtonfecha_emision_hastaMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalMayooresGeneralesBusqueda")) {
				this.jButtonnombre_sucursalMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoMayooresGeneralesBusqueda")) {
				this.jButtoncodigoMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioMayooresGeneralesBusqueda")) {
				this.jButtonbeneficiarioMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleMayooresGeneralesBusqueda")) {
				this.jButtondetalleMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionMayooresGeneralesBusqueda")) {
				this.jButtonfecha_emisionMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_movimientoMayooresGeneralesBusqueda")) {
				this.jButtoncodigo_tipo_movimientoMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorMayooresGeneralesBusqueda")) {
				this.jButtonnumero_mayorMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contableMayooresGeneralesBusqueda")) {
				this.jButtonnombre_cuenta_contableMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_localMayooresGeneralesBusqueda")) {
				this.jButtondebito_localMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_localMayooresGeneralesBusqueda")) {
				this.jButtoncredito_localMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalle_detalle_asiento_contableMayooresGeneralesBusqueda")) {
				this.jButtondetalle_detalle_asiento_contableMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_contableMayooresGeneralesBusqueda")) {
				this.jButtoncodigo_cuenta_contableMayooresGeneralesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoMayooresGeneralesBusqueda")) {
				this.jButtonsaldoMayooresGeneralesBusquedaActionPerformed(evt);
			}
			
			MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessMayooresGenerales();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameMayooresGenerales")) {
				closingInternalFrameMayooresGenerales();
				
			} else if(sTipo.equals("jButtonCancelarMayooresGenerales")) {
				JInternalFrameBase jInternalFrameDetalleFormMayooresGenerales = (JInternalFrameBase)evt.getSource();
	            	
	            MayooresGeneralesBeanSwingJInternalFrame jInternalFrameParent=(MayooresGeneralesBeanSwingJInternalFrame)jInternalFrameDetalleFormMayooresGenerales.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarMayooresGeneralesActionPerformed(null);
			}
			
			MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.mayooresgenerales,new Object(),this.mayooresgeneralesParameterGeneral,this.mayooresgeneralesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormMayooresGenerales(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormMayooresGenerales(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormMayooresGenerales(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.mayooresgenerales)) {
			if(!esControlTabla) {
				if(MayooresGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);			
				}
				
				if(this.mayooresgeneralesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualMayooresGenerales(this.mayooresgenerales,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanMayooresGenerales(this.mayooresgeneralesReturnGeneral,this.mayooresgeneralesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.mayooresgeneralesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanMayooresGenerales(classes,this.mayooresgeneralesReturnGeneral,this.mayooresgeneralesBean,false);
					}
						
					if(this.mayooresgeneralesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyMayooresGenerales(this.mayooresgeneralesReturnGeneral.getMayooresGenerales());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioMayooresGenerales(this.mayooresgeneralesReturnGeneral.getMayooresGenerales());	
					}
						
					if(this.mayooresgeneralesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioMayooresGenerales(this.mayooresgeneralesReturnGeneral.getMayooresGenerales(),classes);//this.mayooresgeneralesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioMayooresGenerales(this.mayooresgenerales,classes);//this.mayooresgeneralesBean);									
				}
			
				if(MayooresGeneralesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualMayooresGenerales(this.mayooresgenerales,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMayooresGenerales(this.mayooresgenerales);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.mayooresgeneralesAnterior!=null) {
						this.mayooresgenerales=this.mayooresgeneralesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.mayooresgeneralesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.mayooresgeneralesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.mayooresgeneralesReturnGeneral.getMayooresGenerales(),mayooresgeneralesLogic.getMayooresGeneraless());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.mayooresgeneralesReturnGeneral.getMayooresGenerales(),this.mayooresgeneraless);
				}
				//ARCHITECTURE
				
				//this.jTableDatosMayooresGenerales.repaint();
				
				//((AbstractTableModel) this.jTableDatosMayooresGenerales.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosMayooresGenerales();
			}
		}
	}
	
	public void actualizarVisualTableDatosMayooresGenerales() throws Exception {
		
		MayooresGeneralesModel mayooresgeneralesModel=(MayooresGeneralesModel)this.jTableDatosMayooresGenerales.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mayooresgeneralesModel.mayooresgeneraless=this.mayooresgeneralesLogic.getMayooresGeneraless();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			mayooresgeneralesModel.mayooresgeneraless=this.mayooresgeneraless;
		}
		
		
		((MayooresGeneralesModel) this.jTableDatosMayooresGenerales.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaMayooresGenerales() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmayooresgeneralesAnterior(),this.mayooresgeneralesLogic.getMayooresGeneraless());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmayooresgeneralesAnterior(),this.mayooresgeneraless);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosMayooresGenerales();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioMayooresGenerales(MayooresGenerales mayooresgenerales,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
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
										
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mayooresgenerales,new Object(),generalEntityParameterGeneral,this.mayooresgeneralesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.mayooresgeneralesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=MayooresGeneralesConstantesFunciones.getClassesRelationshipsOfMayooresGenerales(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=MayooresGeneralesConstantesFunciones.getClassesRelationshipsFromStringsOfMayooresGenerales(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormMayooresGenerales(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				MayooresGeneralesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mayooresgenerales,new Object(),generalEntityParameterGeneral,this.mayooresgeneralesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioMayooresGenerales(MayooresGeneralesBean mayooresgeneralesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanMayooresGenerales(ArrayList<Classe> classes,MayooresGeneralesReturnGeneral mayooresgeneralesReturnGeneral,MayooresGeneralesBean mayooresgeneralesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualMayooresGenerales(MayooresGenerales mayooresgenerales,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.mayooresgenerales)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormMayooresGenerales = new MayooresGeneralesDetalleFormJInternalFrame(jDesktopPane,this.mayooresgeneralesSessionBean.getConGuardarRelaciones(),this.mayooresgeneralesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.setVisible(false);
		this.jInternalFrameDetalleFormMayooresGenerales.setSelected(false);						
		
		this.jInternalFrameDetalleFormMayooresGenerales.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormMayooresGenerales.mayooresgeneralesLogic=this.mayooresgeneralesLogic;
		
		this.cargarCombosFrameForeignKeyMayooresGenerales("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleMayooresGenerales();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMayooresGenerales();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyMayooresGenerales("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyMayooresGenerales();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormMayooresGenerales.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMayooresGenerales"));
		
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonModificarMayooresGenerales.addActionListener(new ButtonActionListener(this,"ModificarMayooresGenerales"));

		
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonModificarToolBarMayooresGenerales.addActionListener(new ButtonActionListener(this,"ModificarToolBarMayooresGenerales"));
					
		this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemModificarMayooresGenerales.addActionListener(new ButtonActionListener(this,"MenuItemModificarMayooresGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonActualizarMayooresGenerales.addActionListener (new ButtonActionListener(this,"ActualizarMayooresGenerales"));
		
		
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonActualizarToolBarMayooresGenerales.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMayooresGenerales"));
						
		this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemActualizarMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMayooresGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonEliminarMayooresGenerales.addActionListener (new ButtonActionListener(this,"EliminarMayooresGenerales"));
		
		
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonEliminarToolBarMayooresGenerales.addActionListener (new ButtonActionListener(this,"EliminarToolBarMayooresGenerales"));
								
		this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemEliminarMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMayooresGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonCancelarMayooresGenerales.addActionListener (new ButtonActionListener(this,"CancelarMayooresGenerales"));
		
		
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonCancelarToolBarMayooresGenerales.addActionListener (new ButtonActionListener(this,"CancelarToolBarMayooresGenerales"));
					
		this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemCancelarMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMayooresGenerales"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemDetalleCerrarMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMayooresGenerales"));		
		
		
		
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonGuardarCambiosToolBarMayooresGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMayooresGenerales"));
		
		
		
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonGuardarCambiosToolBarMayooresGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMayooresGenerales"));
		
		
		
		this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxTiposAccionesFormularioMayooresGenerales.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMayooresGenerales"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonidMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"idMayooresGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_empresaMayooresGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMayooresGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_empresaMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMayooresGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_ejercicioMayooresGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioMayooresGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_ejercicioMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioMayooresGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_cuenta_contableMayooresGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableMayooresGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_cuenta_contableMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonfecha_emision_desdeMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonfecha_emision_hastaMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonnombre_sucursalMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtoncodigoMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigoMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonbeneficiarioMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtondetalleMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"detalleMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonfecha_emisionMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtoncodigo_tipo_movimientoMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_movimientoMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonnumero_mayorMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonnombre_cuenta_contableMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtondebito_localMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"debito_localMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtoncredito_localMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"credito_localMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtondetalle_detalle_asiento_contableMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"detalle_detalle_asiento_contableMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtoncodigo_cuenta_contableMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_contableMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonsaldoMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"saldoMayooresGeneralesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormMayooresGenerales.jTabbedPaneRelacionesMayooresGenerales.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMayooresGenerales"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameMayooresGenerales"));
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMayooresGenerales.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMayooresGenerales"));
		}
		
		this.jTableDatosMayooresGenerales.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarMayooresGenerales"));
		
		this.jTableDatosMayooresGenerales.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarMayooresGenerales"));
		
		this.jButtonNuevoMayooresGenerales.addActionListener(new ButtonActionListener(this,"NuevoMayooresGenerales"));
		
		this.jButtonDuplicarMayooresGenerales.addActionListener(new ButtonActionListener(this,"DuplicarMayooresGenerales"));
		
		this.jButtonCopiarMayooresGenerales.addActionListener(new ButtonActionListener(this,"CopiarMayooresGenerales"));
		
		this.jButtonVerFormMayooresGenerales.addActionListener(new ButtonActionListener(this,"VerFormMayooresGenerales"));
		
		
		this.jButtonNuevoToolBarMayooresGenerales.addActionListener(new ButtonActionListener(this,"NuevoToolBarMayooresGenerales"));
			
		this.jButtonDuplicarToolBarMayooresGenerales.addActionListener(new ButtonActionListener(this,"DuplicarToolBarMayooresGenerales"));
			
		this.jMenuItemNuevoMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemNuevoMayooresGenerales"));
			
		this.jMenuItemDuplicarMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarMayooresGenerales"));		
		
		
		this.jButtonNuevoRelacionesMayooresGenerales.addActionListener (new ButtonActionListener(this,"NuevoRelacionesMayooresGenerales"));
		
		
		this.jButtonNuevoRelacionesToolBarMayooresGenerales.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarMayooresGenerales"));
			
		this.jMenuItemNuevoRelacionesMayooresGenerales.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesMayooresGenerales"));		
		
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonModificarMayooresGenerales.addActionListener(new ButtonActionListener(this,"ModificarMayooresGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonModificarToolBarMayooresGenerales.addActionListener(new ButtonActionListener(this,"ModificarToolBarMayooresGenerales"));
			
			this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemModificarMayooresGenerales.addActionListener(new ButtonActionListener(this,"MenuItemModificarMayooresGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonActualizarMayooresGenerales.addActionListener (new ButtonActionListener(this,"ActualizarMayooresGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonActualizarToolBarMayooresGenerales.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMayooresGenerales"));
				
			this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemActualizarMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMayooresGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonEliminarMayooresGenerales.addActionListener (new ButtonActionListener(this,"EliminarMayooresGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonEliminarToolBarMayooresGenerales.addActionListener (new ButtonActionListener(this,"EliminarToolBarMayooresGenerales"));
						
			this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemEliminarMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMayooresGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonCancelarMayooresGenerales.addActionListener (new ButtonActionListener(this,"CancelarMayooresGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonCancelarToolBarMayooresGenerales.addActionListener (new ButtonActionListener(this,"CancelarToolBarMayooresGenerales"));
			
			this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemCancelarMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMayooresGenerales"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarMayooresGenerales.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarMayooresGenerales"));		
		
		
		this.jButtonCerrarMayooresGenerales.addActionListener (new ButtonActionListener(this,"CerrarMayooresGenerales"));
		
		
		this.jButtonCerrarToolBarMayooresGenerales.addActionListener (new ButtonActionListener(this,"CerrarToolBarMayooresGenerales"));
			
		this.jMenuItemCerrarMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCerrarMayooresGenerales"));
			
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMayooresGenerales.jMenuItemDetalleCerrarMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMayooresGenerales"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonGuardarCambiosMayooresGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosMayooresGenerales"));
		}
		
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMayooresGenerales.jButtonGuardarCambiosToolBarMayooresGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMayooresGenerales"));
		}
		
		this.jButtonCopiarToolBarMayooresGenerales.addActionListener (new ButtonActionListener(this,"CopiarToolBarMayooresGenerales"));
			
		this.jButtonVerFormToolBarMayooresGenerales.addActionListener (new ButtonActionListener(this,"VerFormToolBarMayooresGenerales"));
		
		this.jMenuItemGuardarCambiosMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosMayooresGenerales"));
			
		this.jMenuItemCopiarMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemCopiarMayooresGenerales"));		
		
		this.jMenuItemVerFormMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemVerFormMayooresGenerales"));		
		
		
		this.jButtonGuardarCambiosTablaMayooresGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMayooresGenerales"));
		
		
		this.jButtonGuardarCambiosTablaToolBarMayooresGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarMayooresGenerales"));
			
		this.jMenuItemGuardarCambiosTablaMayooresGenerales.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMayooresGenerales"));		
		
		
		
		this.jButtonRecargarInformacionMayooresGenerales.addActionListener (new ButtonActionListener(this,"RecargarInformacionMayooresGenerales"));
					
		this.jButtonRecargarInformacionToolBarMayooresGenerales.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarMayooresGenerales"));
		
		this.jMenuItemRecargarInformacionMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionMayooresGenerales"));		
		
		
		
		this.jButtonAnterioresMayooresGenerales.addActionListener (new ButtonActionListener(this,"AnterioresMayooresGenerales"));
		
		
		this.jButtonAnterioresToolBarMayooresGenerales.addActionListener (new ButtonActionListener(this,"AnterioresToolBarMayooresGenerales"));
		
		this.jMenuItemAnterioresMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresMayooresGenerales"));		
		
		
		this.jButtonSiguientesMayooresGenerales.addActionListener (new ButtonActionListener(this,"SiguientesMayooresGenerales"));
		
		
		this.jButtonSiguientesToolBarMayooresGenerales.addActionListener (new ButtonActionListener(this,"SiguientesToolBarMayooresGenerales"));
			
		this.jMenuItemSiguientesMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesMayooresGenerales"));
			
		this.jMenuItemAbrirOrderByMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByMayooresGenerales"));
			
		this.jMenuItemMostrarOcultarMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarMayooresGenerales"));
			
		this.jMenuItemDetalleAbrirOrderByMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByMayooresGenerales"));
			
		this.jMenuItemDetalleMostarOcultarMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarMayooresGenerales"));		
		
		
		this.jButtonNuevoGuardarCambiosMayooresGenerales.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosMayooresGenerales"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarMayooresGenerales.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarMayooresGenerales"));
			
		this.jMenuItemNuevoGuardarCambiosMayooresGenerales.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosMayooresGenerales"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosMayooresGenerales.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosMayooresGenerales"));

		this.jCheckBoxSeleccionadosMayooresGenerales.addItemListener(new CheckBoxItemListener(this,"SeleccionadosMayooresGenerales"));
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxTiposAccionesFormularioMayooresGenerales.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMayooresGenerales"));
		}
		
		
		this.jComboBoxTiposRelacionesMayooresGenerales.addActionListener (new ButtonActionListener(this,"TiposRelacionesMayooresGenerales"));
			
		this.jComboBoxTiposAccionesMayooresGenerales.addActionListener (new ButtonActionListener(this,"TiposAccionesMayooresGenerales"));
					
		this.jComboBoxTiposSeleccionarMayooresGenerales.addActionListener (new ButtonActionListener(this,"TiposSeleccionarMayooresGenerales"));
			
		this.jTextFieldValorCampoGeneralMayooresGenerales.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralMayooresGenerales"));		
		
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonidMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"idMayooresGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_empresaMayooresGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMayooresGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_empresaMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMayooresGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_ejercicioMayooresGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioMayooresGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_ejercicioMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioMayooresGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_cuenta_contableMayooresGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableMayooresGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_cuenta_contableMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonfecha_emision_desdeMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonfecha_emision_hastaMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonnombre_sucursalMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtoncodigoMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigoMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonbeneficiarioMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtondetalleMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"detalleMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonfecha_emisionMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtoncodigo_tipo_movimientoMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_movimientoMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonnumero_mayorMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonnombre_cuenta_contableMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtondebito_localMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"debito_localMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtoncredito_localMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"credito_localMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtondetalle_detalle_asiento_contableMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"detalle_detalle_asiento_contableMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtoncodigo_cuenta_contableMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_contableMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonsaldoMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"saldoMayooresGeneralesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaMayooresGeneralesMayooresGenerales.addActionListener(new ButtonActionListener(this,"BusquedaMayooresGeneralesMayooresGenerales"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoMayooresGenerales!=null) {
				this.jInternalFrameReporteDinamicoMayooresGenerales.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMayooresGenerales"));
				this.jInternalFrameReporteDinamicoMayooresGenerales.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMayooresGenerales"));
				this.jInternalFrameReporteDinamicoMayooresGenerales.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMayooresGenerales"));
			}
			
			//this.jButtonCerrarReporteDinamicoMayooresGenerales.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMayooresGenerales"));				
			//this.jButtonGenerarReporteDinamicoMayooresGenerales.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMayooresGenerales"));
			//this.jButtonGenerarExcelReporteDinamicoMayooresGenerales.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMayooresGenerales"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionMayooresGenerales!=null) {
				this.jInternalFrameImportacionMayooresGenerales.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMayooresGenerales"));
				this.jInternalFrameImportacionMayooresGenerales.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMayooresGenerales"));
				this.jInternalFrameImportacionMayooresGenerales.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMayooresGenerales"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByMayooresGenerales.addActionListener (new ButtonActionListener(this,"AbrirOrderByMayooresGenerales"));
			
			this.jButtonAbrirOrderByToolBarMayooresGenerales.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarMayooresGenerales"));			
			
			if(this.jInternalFrameOrderByMayooresGenerales!=null) {
				this.jInternalFrameOrderByMayooresGenerales.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMayooresGenerales"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMayooresGenerales.jTabbedPaneRelacionesMayooresGenerales.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMayooresGenerales"));
		
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
            		closingInternalFrameMayooresGenerales();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormMayooresGenerales.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormMayooresGenerales = (JInternalFrameBase)event.getSource();
	            	
	            MayooresGeneralesBeanSwingJInternalFrame jInternalFrameParent=(MayooresGeneralesBeanSwingJInternalFrame)jInternalFrameDetalleFormMayooresGenerales.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarMayooresGeneralesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosMayooresGenerales.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosMayooresGeneralesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosMayooresGenerales.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosMayooresGenerales.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMayooresGeneralesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMayooresGeneralesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMayooresGeneralesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoMayooresGenerales";
		inputMap = this.jButtonNuevoMayooresGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoMayooresGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMayooresGeneralesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMayooresGeneralesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMayooresGeneralesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMayooresGeneralesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesMayooresGenerales";
		inputMap = this.jButtonNuevoRelacionesMayooresGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesMayooresGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMayooresGeneralesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarMayooresGenerales";
		inputMap = this.jButtonModificarMayooresGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarMayooresGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarMayooresGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarMayooresGenerales";
		inputMap = this.jButtonActualizarMayooresGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarMayooresGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarMayooresGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarMayooresGenerales";
		inputMap = this.jButtonEliminarMayooresGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarMayooresGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarMayooresGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarMayooresGenerales";
		inputMap = this.jButtonCancelarMayooresGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarMayooresGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarMayooresGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarMayooresGenerales";
		inputMap = this.jButtonCerrarMayooresGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarMayooresGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarMayooresGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonGuardarCambiosMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosMayooresGenerales";
		inputMap = this.jInternalFrameDetalleFormMayooresGenerales.jButtonGuardarCambiosMayooresGenerales.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonGuardarCambiosMayooresGenerales.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosMayooresGeneralesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosMayooresGenerales.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosMayooresGeneralesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesMayooresGenerales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesMayooresGeneralesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarMayooresGenerales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarMayooresGeneralesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralMayooresGenerales.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralMayooresGeneralesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonidMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"idMayooresGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_empresaMayooresGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMayooresGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_empresaMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMayooresGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_ejercicioMayooresGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioMayooresGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_ejercicioMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioMayooresGeneralesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_cuenta_contableMayooresGeneralesUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableMayooresGeneralesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonid_cuenta_contableMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonfecha_emision_desdeMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonfecha_emision_hastaMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonnombre_sucursalMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtoncodigoMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigoMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonbeneficiarioMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtondetalleMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"detalleMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonfecha_emisionMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtoncodigo_tipo_movimientoMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_movimientoMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonnumero_mayorMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonnombre_cuenta_contableMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtondebito_localMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"debito_localMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtoncredito_localMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"credito_localMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtondetalle_detalle_asiento_contableMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"detalle_detalle_asiento_contableMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtoncodigo_cuenta_contableMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_contableMayooresGeneralesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMayooresGenerales.jButtonsaldoMayooresGeneralesBusqueda.addActionListener(new ButtonActionListener(this,"saldoMayooresGeneralesBusqueda"));
		
		
		this.jButtonBusquedaMayooresGeneralesMayooresGenerales.addActionListener(new ButtonActionListener(this,"BusquedaMayooresGeneralesMayooresGenerales"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionMayooresGenerales.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionMayooresGeneralesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarMayooresGeneralesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarMayooresGenerales.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosMayooresGenerales(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(MayooresGenerales mayooresgeneralesAux:this.mayooresgeneralesLogic.getMayooresGeneraless()) {
					mayooresgeneralesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MayooresGenerales mayooresgeneralesAux:mayooresgeneraless) {
					mayooresgeneralesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosMayooresGeneralesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMayooresGenerales(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MayooresGenerales mayooresgeneralesAux:this.mayooresgeneralesLogic.getMayooresGeneraless()) {
						mayooresgeneralesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MayooresGenerales mayooresgeneralesAux:mayooresgeneraless) {
						mayooresgeneralesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(MayooresGenerales mayooresgeneralesAux:this.mayooresgeneralesLogic.getMayooresGeneraless()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MayooresGenerales mayooresgeneralesAux:mayooresgeneraless) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaMayooresGenerales(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMayooresGenerales.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMayooresGenerales.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosMayooresGeneralesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMayooresGenerales(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosMayooresGenerales.getSelectedRows();
			
			MayooresGenerales mayooresgeneralesLocal=new MayooresGenerales();
			
			//this.seleccionarTodosMayooresGenerales(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mayooresgeneralesLocal =(MayooresGenerales) this.mayooresgeneralesLogic.getMayooresGeneraless().toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					mayooresgeneralesLocal =(MayooresGenerales) this.mayooresgeneraless.toArray()[this.jTableDatosMayooresGenerales.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				mayooresgeneralesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MayooresGenerales mayooresgeneralesAux:this.mayooresgeneralesLogic.getMayooresGeneraless()) {
						mayooresgeneralesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MayooresGenerales mayooresgeneralesAux:mayooresgeneraless) {
						mayooresgeneralesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaMayooresGenerales(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMayooresGenerales.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMayooresGenerales.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMayooresGenerales,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualMayooresGeneralesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarMayooresGeneralesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralMayooresGeneralesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingMayooresGenerales(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralMayooresGenerales.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MayooresGenerales mayooresgeneralesAux:this.mayooresgeneralesLogic.getMayooresGeneraless()) {
				
						if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							mayooresgeneralesAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							mayooresgeneralesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							mayooresgeneralesAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							mayooresgeneralesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							mayooresgeneralesAux.setbeneficiario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							mayooresgeneralesAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							mayooresgeneralesAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO)) {
							existe=true;
							mayooresgeneralesAux.setcodigo_tipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							mayooresgeneralesAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
							existe=true;
							mayooresgeneralesAux.setnombre_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_DEBITOLOCAL)) {
							existe=true;
							mayooresgeneralesAux.setdebito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_CREDITOLOCAL)) {
							existe=true;
							mayooresgeneralesAux.setcredito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE)) {
							existe=true;
							mayooresgeneralesAux.setdetalle_detalle_asiento_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE)) {
							existe=true;
							mayooresgeneralesAux.setcodigo_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							mayooresgeneralesAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MayooresGenerales mayooresgeneralesAux:mayooresgeneraless) {
					
						if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							mayooresgeneralesAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							mayooresgeneralesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							mayooresgeneralesAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							mayooresgeneralesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							mayooresgeneralesAux.setbeneficiario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							mayooresgeneralesAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							mayooresgeneralesAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO)) {
							existe=true;
							mayooresgeneralesAux.setcodigo_tipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							mayooresgeneralesAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
							existe=true;
							mayooresgeneralesAux.setnombre_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_DEBITOLOCAL)) {
							existe=true;
							mayooresgeneralesAux.setdebito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_CREDITOLOCAL)) {
							existe=true;
							mayooresgeneralesAux.setcredito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE)) {
							existe=true;
							mayooresgeneralesAux.setdetalle_detalle_asiento_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE)) {
							existe=true;
							mayooresgeneralesAux.setcodigo_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							mayooresgeneralesAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaMayooresGenerales(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesMayooresGeneralesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingMayooresGenerales(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioMayooresGenerales=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesMayooresGenerales.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxTiposAccionesFormularioMayooresGenerales.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteMayooresGenerales) {				
					conSplash=true;//false;										
					
					//this.startProcessMayooresGenerales(conSplash);
				
					this.generarReporteMayooresGeneralessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMayooresGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxTiposAccionesFormularioMayooresGenerales.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoMayooresGeneralessSeleccionados();
				//this.jComboBoxTiposAccionesMayooresGenerales.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMayooresGeneralessSeleccionados(false);
				//this.jComboBoxTiposAccionesMayooresGenerales.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMayooresGeneralessSeleccionados(true);
				//this.jComboBoxTiposAccionesMayooresGenerales.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMayooresGenerales();
				
				this.exportarMayooresGeneralessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMayooresGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxTiposAccionesFormularioMayooresGenerales.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionMayooresGeneraless();
				//this.importarMayooresGeneraless();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMayooresGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxTiposAccionesFormularioMayooresGenerales.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMayooresGenerales();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelMayooresGeneralessSeleccionados();
				//this.jComboBoxTiposAccionesMayooresGenerales.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Mayores Generales", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessMayooresGenerales();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoMayooresGenerales)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyMayooresGenerales(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Mayores Generales",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMayooresGenerales.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxTiposAccionesFormularioMayooresGenerales.setSelectedIndex(0);					
				}	
			} 			
			else if(MayooresGeneralesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteMayooresGenerales) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessMayooresGenerales(conSplash);
					
						//this.actualizarParametrosGeneralMayooresGenerales();
						
						this.generarReporteProcesoAccionMayooresGeneralessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesMayooresGenerales.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxTiposAccionesFormularioMayooresGenerales.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(MayooresGeneralesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Mayores GeneralesES SELECCIONADOS?", "MANTENIMIENTO DE Mayores Generales", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessMayooresGenerales();
				
						this.actualizarParametrosGeneralMayooresGenerales();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.mayooresgeneralesReturnGeneral=mayooresgeneralesLogic.procesarAccionMayooresGeneralessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.mayooresgeneralesLogic.getMayooresGeneraless(),this.mayooresgeneralesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarMayooresGeneralesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMayooresGenerales.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxTiposAccionesFormularioMayooresGenerales.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralMayooresGenerales();
					
					MayooresGeneralesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarMayooresGeneralesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMayooresGenerales.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxTiposAccionesFormularioMayooresGenerales.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessMayooresGenerales(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesMayooresGeneralesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessMayooresGenerales();
			
			if(this.jInternalFrameDetalleFormMayooresGenerales==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<MayooresGenerales> mayooresgeneralessSeleccionados=new ArrayList<MayooresGenerales>();		
			MayooresGenerales mayooresgenerales=new MayooresGenerales();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingMayooresGenerales(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesMayooresGenerales.getSelectedItem();
			
			
			
			
			mayooresgeneralessSeleccionados=this.getMayooresGeneralessSeleccionados(true);
			//this.sTipoAccion;
			
			if(mayooresgeneralessSeleccionados.size()==1) {
				for(MayooresGenerales mayooresgeneralesAux:mayooresgeneralessSeleccionados) {
					mayooresgenerales=mayooresgeneralesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessMayooresGenerales();
			
      		//this.finishProcessMayooresGenerales(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarMayooresGeneralesReturnGeneral() throws Exception {
		if(this.mayooresgeneralesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.mayooresgeneralesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.mayooresgeneralesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.mayooresgeneralesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.mayooresgeneralesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.mayooresgeneralesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingMayooresGenerales(false);
		}
		
		if(this.mayooresgeneralesReturnGeneral.getConRetornoLista() || this.mayooresgeneralesReturnGeneral.getConRetornoObjeto()) {
			if(this.mayooresgeneralesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.mayooresgeneralesLogic.setMayooresGeneraless(this.mayooresgeneralesReturnGeneral.getMayooresGeneraless());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingMayooresGenerales(false);
		}
	}
	
	public void actualizarParametrosGeneralMayooresGenerales() throws Exception {
		
		
	}
	
	public ArrayList<MayooresGenerales> getMayooresGeneralessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<MayooresGenerales> mayooresgeneralessSeleccionados=new ArrayList<MayooresGenerales>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioMayooresGenerales) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(MayooresGenerales mayooresgeneralesAux:mayooresgeneralesLogic.getMayooresGeneraless()) {
					if(mayooresgeneralesAux.getIsSelected()) {
						mayooresgeneralessSeleccionados.add(mayooresgeneralesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MayooresGenerales mayooresgeneralesAux:this.mayooresgeneraless) {
					if(mayooresgeneralesAux.getIsSelected()) {
						mayooresgeneralessSeleccionados.add(mayooresgeneralesAux);				
					}
				}
			}
			
			if(mayooresgeneralessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						mayooresgeneralessSeleccionados.addAll(this.mayooresgeneralesLogic.getMayooresGeneraless());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						mayooresgeneralessSeleccionados.addAll(this.mayooresgeneraless);				
					}
				}
			}
		} else {
			mayooresgeneralessSeleccionados.add(this.mayooresgenerales);
		}
		
		return mayooresgeneralessSeleccionados;
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
	
	public void generarReporteMayooresGeneralessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalMayooresGeneralessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoMayooresGeneralessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMayooresGeneralessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMayooresGeneralessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Mayores Generales",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesMayooresGeneralessSeleccionados() throws Exception {
		ArrayList<MayooresGenerales> mayooresgeneralessSeleccionados=new ArrayList<MayooresGenerales>();		
		
		mayooresgeneralessSeleccionados=this.getMayooresGeneralessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteMayooresGeneraless("Todos",mayooresgeneralessSeleccionados);
		
	}	
	
	public void generarReporteNormalMayooresGeneralessSeleccionados() throws Exception {
		ArrayList<MayooresGenerales> mayooresgeneralessSeleccionados=new ArrayList<MayooresGenerales>();		
		
		mayooresgeneralessSeleccionados=this.getMayooresGeneralessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteMayooresGeneraless("Todos",mayooresgeneralessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionMayooresGeneralessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<MayooresGenerales> mayooresgeneralessSeleccionados=new ArrayList<MayooresGenerales>();
		
		mayooresgeneralessSeleccionados=this.getMayooresGeneralessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteMayooresGeneraless("Todos",mayooresgeneralessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoMayooresGeneralessSeleccionados() throws Exception {
		ArrayList<MayooresGenerales> mayooresgeneralessSeleccionados=new ArrayList<MayooresGenerales>();		
		
		
		this.abrirInicializarFrameReporteDinamicoMayooresGenerales();
		
		
		mayooresgeneralessSeleccionados=this.getMayooresGeneralessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoMayooresGenerales();
		
		
		//this.generarReporteMayooresGeneraless("Todos",mayooresgeneralessSeleccionados ,mayooresgeneralesImplementable,mayooresgeneralesImplementableHome);
	}
	
	public void mostrarImportacionMayooresGeneraless() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionMayooresGenerales();
		
		this.abrirFrameImportacionMayooresGenerales();		
		
			
		//this.generarReporteMayooresGeneraless("Todos",mayooresgeneralessSeleccionados ,mayooresgeneralesImplementable,mayooresgeneralesImplementableHome);
	}
	
	public void importarMayooresGeneraless() throws Exception {		
	
	}
	
	public void exportarMayooresGeneralessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelMayooresGeneralessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoMayooresGeneralessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlMayooresGeneralessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Mayores Generales",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoMayooresGeneralessSeleccionados() throws Exception {
		ArrayList<MayooresGenerales> mayooresgeneralessSeleccionados=new ArrayList<MayooresGenerales>();		
		
		mayooresgeneralessSeleccionados=this.getMayooresGeneralessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mayooresgenerales."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarMayooresGenerales(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(MayooresGenerales mayooresgeneralesAux:mayooresgeneralessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarMayooresGenerales(mayooresgeneralesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//mayooresgeneralesAux.setsDetalleGeneralEntityReporte(mayooresgeneralesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mayores Generales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarMayooresGenerales(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_DETALLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_DEBITOLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_CREDITOLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MayooresGeneralesConstantesFunciones.LABEL_SALDO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarMayooresGenerales(MayooresGenerales mayooresgenerales,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=mayooresgenerales.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getnombre_sucursal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getbeneficiario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getdetalle();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getcodigo_tipo_movimiento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getnumero_mayor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getnombre_cuenta_contable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getdebito_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getcredito_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getdetalle_detalle_asiento_contable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getcodigo_cuenta_contable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mayooresgenerales.getsaldo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelMayooresGeneralessSeleccionados() throws Exception {
		ArrayList<MayooresGenerales> mayooresgeneralessSeleccionados=new ArrayList<MayooresGenerales>();		
		
		mayooresgeneralessSeleccionados=this.getMayooresGeneralessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mayooresgenerales.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("MayooresGeneraless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelMayooresGenerales(row);				
				iRow++;
			}				
			
			for(MayooresGenerales mayooresgeneralesAux:mayooresgeneralessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelMayooresGenerales(mayooresgeneralesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mayores Generales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlMayooresGeneralessSeleccionados() throws Exception {
		ArrayList<MayooresGenerales> mayooresgeneralessSeleccionados=new ArrayList<MayooresGenerales>();		
		
		mayooresgeneralessSeleccionados=this.getMayooresGeneralessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mayooresgenerales.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("mayooresgeneraless");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("mayooresgenerales");
			//elementRoot.appendChild(element);
		
			for(MayooresGenerales mayooresgeneralesAux:mayooresgeneralessSeleccionados) {
				element = document.createElement("mayooresgenerales");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlMayooresGenerales(mayooresgeneralesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mayores Generales",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelMayooresGenerales(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_DETALLE);
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR);
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_DEBITOLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_CREDITOLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(MayooresGeneralesConstantesFunciones.LABEL_SALDO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelMayooresGenerales(MayooresGenerales mayooresgenerales,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getnombre_sucursal());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getbeneficiario());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getdetalle());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getcodigo_tipo_movimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getnumero_mayor());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getnombre_cuenta_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getdebito_local());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getcredito_local());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getdetalle_detalle_asiento_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getcodigo_cuenta_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(mayooresgenerales.getsaldo());				
	}
	
	public void setFilaDatosExportarXmlMayooresGenerales(MayooresGenerales mayooresgenerales,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(MayooresGeneralesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(mayooresgenerales.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(MayooresGeneralesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(mayooresgenerales.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(MayooresGeneralesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(mayooresgenerales.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementejercicio_descripcion = document.createElement(MayooresGeneralesConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(mayooresgenerales.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(MayooresGeneralesConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(mayooresgenerales.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementfecha_emision_desde = document.createElement(MayooresGeneralesConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(mayooresgenerales.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(MayooresGeneralesConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(mayooresgenerales.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_sucursal = document.createElement(MayooresGeneralesConstantesFunciones.NOMBRESUCURSAL);
		elementnombre_sucursal.appendChild(document.createTextNode(mayooresgenerales.getnombre_sucursal().trim()));
		element.appendChild(elementnombre_sucursal);

		Element elementcodigo = document.createElement(MayooresGeneralesConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(mayooresgenerales.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementbeneficiario = document.createElement(MayooresGeneralesConstantesFunciones.BENEFICIARIO);
		elementbeneficiario.appendChild(document.createTextNode(mayooresgenerales.getbeneficiario().trim()));
		element.appendChild(elementbeneficiario);

		Element elementdetalle = document.createElement(MayooresGeneralesConstantesFunciones.DETALLE);
		elementdetalle.appendChild(document.createTextNode(mayooresgenerales.getdetalle().trim()));
		element.appendChild(elementdetalle);

		Element elementfecha_emision = document.createElement(MayooresGeneralesConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(mayooresgenerales.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementcodigo_tipo_movimiento = document.createElement(MayooresGeneralesConstantesFunciones.CODIGOTIPOMOVIMIENTO);
		elementcodigo_tipo_movimiento.appendChild(document.createTextNode(mayooresgenerales.getcodigo_tipo_movimiento().trim()));
		element.appendChild(elementcodigo_tipo_movimiento);

		Element elementnumero_mayor = document.createElement(MayooresGeneralesConstantesFunciones.NUMEROMAYOR);
		elementnumero_mayor.appendChild(document.createTextNode(mayooresgenerales.getnumero_mayor().trim()));
		element.appendChild(elementnumero_mayor);

		Element elementnombre_cuenta_contable = document.createElement(MayooresGeneralesConstantesFunciones.NOMBRECUENTACONTABLE);
		elementnombre_cuenta_contable.appendChild(document.createTextNode(mayooresgenerales.getnombre_cuenta_contable().trim()));
		element.appendChild(elementnombre_cuenta_contable);

		Element elementdebito_local = document.createElement(MayooresGeneralesConstantesFunciones.DEBITOLOCAL);
		elementdebito_local.appendChild(document.createTextNode(mayooresgenerales.getdebito_local().toString().trim()));
		element.appendChild(elementdebito_local);

		Element elementcredito_local = document.createElement(MayooresGeneralesConstantesFunciones.CREDITOLOCAL);
		elementcredito_local.appendChild(document.createTextNode(mayooresgenerales.getcredito_local().toString().trim()));
		element.appendChild(elementcredito_local);

		Element elementdetalle_detalle_asiento_contable = document.createElement(MayooresGeneralesConstantesFunciones.DETALLEDETALLEASIENTOCONTABLE);
		elementdetalle_detalle_asiento_contable.appendChild(document.createTextNode(mayooresgenerales.getdetalle_detalle_asiento_contable().trim()));
		element.appendChild(elementdetalle_detalle_asiento_contable);

		Element elementcodigo_cuenta_contable = document.createElement(MayooresGeneralesConstantesFunciones.CODIGOCUENTACONTABLE);
		elementcodigo_cuenta_contable.appendChild(document.createTextNode(mayooresgenerales.getcodigo_cuenta_contable().trim()));
		element.appendChild(elementcodigo_cuenta_contable);

		Element elementsaldo = document.createElement(MayooresGeneralesConstantesFunciones.SALDO);
		elementsaldo.appendChild(document.createTextNode(mayooresgenerales.getsaldo().toString().trim()));
		element.appendChild(elementsaldo);
	}
	
	public void generarReporteGroupGenericoMayooresGeneralessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<MayooresGenerales> mayooresgeneralessSeleccionados=new ArrayList<MayooresGenerales>();
		
		mayooresgeneralessSeleccionados=this.getMayooresGeneralessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoMayooresGenerales(mayooresgeneralessSeleccionados);
		
		this.generarReporteMayooresGeneraless("Todos",mayooresgeneralessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoMayooresGenerales(ArrayList<MayooresGenerales> mayooresgeneralessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(MayooresGenerales mayooresgeneralesAux:mayooresgeneralessSeleccionados) {
				mayooresgeneralesAux.setsDetalleGeneralEntityReporte(mayooresgeneralesAux.toString());
			
				if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					mayooresgeneralesAux.setsDescripcionGeneralEntityReporte1(mayooresgeneralesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					mayooresgeneralesAux.setsDescripcionGeneralEntityReporte1(mayooresgeneralesAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					mayooresgeneralesAux.setsDescripcionGeneralEntityReporte1(mayooresgeneralesAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					mayooresgeneralesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(mayooresgeneralesAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					mayooresgeneralesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(mayooresgeneralesAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
					existe=true;
					mayooresgeneralesAux.setsDescripcionGeneralEntityReporte1(mayooresgeneralesAux.getnombre_sucursal());
				}
				 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					mayooresgeneralesAux.setsDescripcionGeneralEntityReporte1(mayooresgeneralesAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO)) {
					existe=true;
					mayooresgeneralesAux.setsDescripcionGeneralEntityReporte1(mayooresgeneralesAux.getbeneficiario());
				}
				 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_DETALLE)) {
					existe=true;
					mayooresgeneralesAux.setsDescripcionGeneralEntityReporte1(mayooresgeneralesAux.getdetalle());
				}
				 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					mayooresgeneralesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(mayooresgeneralesAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO)) {
					existe=true;
					mayooresgeneralesAux.setsDescripcionGeneralEntityReporte1(mayooresgeneralesAux.getcodigo_tipo_movimiento());
				}
				 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR)) {
					existe=true;
					mayooresgeneralesAux.setsDescripcionGeneralEntityReporte1(mayooresgeneralesAux.getnumero_mayor());
				}
				 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
					existe=true;
					mayooresgeneralesAux.setsDescripcionGeneralEntityReporte1(mayooresgeneralesAux.getnombre_cuenta_contable());
				}
				 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE)) {
					existe=true;
					mayooresgeneralesAux.setsDescripcionGeneralEntityReporte1(mayooresgeneralesAux.getdetalle_detalle_asiento_contable());
				}
				 else if(sTipoSeleccionar.equals(MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE)) {
					existe=true;
					mayooresgeneralesAux.setsDescripcionGeneralEntityReporte1(mayooresgeneralesAux.getcodigo_cuenta_contable());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MayooresGeneralesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesMayooresGenerales(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoMayooresGenerales=true;
				this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales=true;
				this.isVisibilidadCeldaGuardarCambiosMayooresGenerales=true;
			}
			
			this.isVisibilidadCeldaModificarMayooresGenerales=false;
			this.isVisibilidadCeldaActualizarMayooresGenerales=false;
			this.isVisibilidadCeldaEliminarMayooresGenerales=false;
			this.isVisibilidadCeldaCancelarMayooresGenerales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMayooresGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarMayooresGenerales=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoMayooresGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosMayooresGenerales=false;
			this.isVisibilidadCeldaModificarMayooresGenerales=false;
			this.isVisibilidadCeldaActualizarMayooresGenerales=true;
			this.isVisibilidadCeldaEliminarMayooresGenerales=false;
			this.isVisibilidadCeldaCancelarMayooresGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMayooresGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarMayooresGenerales=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoMayooresGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosMayooresGenerales=false;
			this.isVisibilidadCeldaModificarMayooresGenerales=false;
			this.isVisibilidadCeldaActualizarMayooresGenerales=true;
			this.isVisibilidadCeldaEliminarMayooresGenerales=true;
			this.isVisibilidadCeldaCancelarMayooresGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMayooresGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarMayooresGenerales=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoMayooresGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosMayooresGenerales=false;
			this.isVisibilidadCeldaModificarMayooresGenerales=false;
			this.isVisibilidadCeldaActualizarMayooresGenerales=true;
			this.isVisibilidadCeldaEliminarMayooresGenerales=false;
			this.isVisibilidadCeldaCancelarMayooresGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMayooresGenerales=false;
				} else {
					this.isVisibilidadCeldaGuardarMayooresGenerales=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoMayooresGenerales=true;
			this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales=true;
			this.isVisibilidadCeldaGuardarCambiosMayooresGenerales=true;
			this.isVisibilidadCeldaModificarMayooresGenerales=false;
			this.isVisibilidadCeldaActualizarMayooresGenerales=false;
			this.isVisibilidadCeldaEliminarMayooresGenerales=false;
			this.isVisibilidadCeldaCancelarMayooresGenerales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMayooresGenerales=true;
				} else {
					this.isVisibilidadCeldaGuardarMayooresGenerales=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoMayooresGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosMayooresGenerales=false;
			this.isVisibilidadCeldaActualizarMayooresGenerales=false;
			this.isVisibilidadCeldaEliminarMayooresGenerales=false;
			this.isVisibilidadCeldaCancelarMayooresGenerales=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMayooresGenerales=false;
				} else {
					this.isVisibilidadCeldaGuardarMayooresGenerales=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoMayooresGenerales=false;
			this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosMayooresGenerales=false;
			this.isVisibilidadCeldaModificarMayooresGenerales=true;
			this.isVisibilidadCeldaActualizarMayooresGenerales=false;
			this.isVisibilidadCeldaEliminarMayooresGenerales=false;
			this.isVisibilidadCeldaCancelarMayooresGenerales=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMayooresGenerales=false;
				} else {
					this.isVisibilidadCeldaGuardarMayooresGenerales=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(MayooresGeneralesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoMayooresGenerales=true;
			this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales=true;
			this.isVisibilidadCeldaGuardarCambiosMayooresGenerales=true;
		} else {
			this.actualizarEstadoPanelsMayooresGenerales(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarMayooresGenerales=false;
			//this.isVisibilidadCeldaVerFormMayooresGenerales=false;
			this.isVisibilidadCeldaDuplicarMayooresGenerales=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!mayooresgeneralesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales=false;
		} else {
			this.isVisibilidadCeldaNuevoMayooresGenerales=false;
			this.isVisibilidadCeldaGuardarCambiosMayooresGenerales=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
			if(!mayooresgeneralesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales=false;												
			}
			
			this.jButtonCerrarMayooresGenerales.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales=false;
		}
		
		if(!this.permiteMantenimiento(this.mayooresgenerales)) {
			this.isVisibilidadCeldaActualizarMayooresGenerales=false;
			this.isVisibilidadCeldaEliminarMayooresGenerales=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoMayooresGenerales=false;
		this.isVisibilidadCeldaNuevoRelacionesMayooresGenerales=false;
		this.isVisibilidadCeldaGuardarCambiosMayooresGenerales=false;
		//this.isVisibilidadCeldaModificarMayooresGenerales=true;
		this.isVisibilidadCeldaActualizarMayooresGenerales=false;
		this.isVisibilidadCeldaEliminarMayooresGenerales=false;
		//this.isVisibilidadCeldaCancelarMayooresGenerales=true;			
		this.isVisibilidadCeldaGuardarMayooresGenerales=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesMayooresGenerales() {
	}
	
	public void actualizarEstadoPanelsMayooresGenerales(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionMayooresGenerales!=null) {
				this.jScrollPanelDatosEdicionMayooresGenerales.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMayooresGenerales!=null) {
				this.jTabbedPaneBusquedasMayooresGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMayooresGenerales!=null) {
				this.jScrollPanelDatosMayooresGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionMayooresGenerales!=null) {
				this.jPanelPaginacionMayooresGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMayooresGenerales!=null) {
				this.jPanelParametrosReportesMayooresGenerales.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionMayooresGenerales!=null) {
				this.jScrollPanelDatosEdicionMayooresGenerales.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMayooresGenerales!=null) {
				this.jTabbedPaneBusquedasMayooresGenerales.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosMayooresGenerales!=null) {
				this.jScrollPanelDatosMayooresGenerales.setVisible(false);
			}
			
			if(this.jPanelPaginacionMayooresGenerales!=null) {
				this.jPanelPaginacionMayooresGenerales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMayooresGenerales!=null) {
				this.jPanelParametrosReportesMayooresGenerales.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionMayooresGenerales!=null) {
				this.jScrollPanelDatosEdicionMayooresGenerales.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMayooresGenerales!=null) {
				this.jTabbedPaneBusquedasMayooresGenerales.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMayooresGenerales!=null) {
				this.jScrollPanelDatosMayooresGenerales.setVisible(false);
			}
			
			if(this.jPanelPaginacionMayooresGenerales!=null) {
				this.jPanelPaginacionMayooresGenerales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMayooresGenerales!=null) {
				this.jPanelParametrosReportesMayooresGenerales.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionMayooresGenerales!=null) {
				this.jScrollPanelDatosEdicionMayooresGenerales.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMayooresGenerales!=null) {
				this.jTabbedPaneBusquedasMayooresGenerales.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMayooresGenerales!=null) {
				this.jScrollPanelDatosMayooresGenerales.setVisible(false);
			}
			
			if(this.jPanelPaginacionMayooresGenerales!=null) {
				this.jPanelPaginacionMayooresGenerales.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMayooresGenerales!=null) {
				this.jPanelParametrosReportesMayooresGenerales.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionMayooresGenerales!=null) {
				this.jScrollPanelDatosEdicionMayooresGenerales.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMayooresGenerales!=null) {
				this.jTabbedPaneBusquedasMayooresGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMayooresGenerales!=null) {
				this.jScrollPanelDatosMayooresGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionMayooresGenerales!=null) {
				this.jPanelPaginacionMayooresGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMayooresGenerales!=null) {
				this.jPanelParametrosReportesMayooresGenerales.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionMayooresGenerales!=null) {
				this.jScrollPanelDatosEdicionMayooresGenerales.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMayooresGenerales!=null) {
				this.jTabbedPaneBusquedasMayooresGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMayooresGenerales!=null) {
				this.jScrollPanelDatosMayooresGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionMayooresGenerales!=null) {
				this.jPanelPaginacionMayooresGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMayooresGenerales!=null) {
				this.jPanelParametrosReportesMayooresGenerales.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionMayooresGenerales!=null) {
				this.jScrollPanelDatosEdicionMayooresGenerales.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMayooresGenerales!=null) {
				this.jTabbedPaneBusquedasMayooresGenerales.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMayooresGenerales!=null) {
				this.jScrollPanelDatosMayooresGenerales.setVisible(true);
			}
			
			if(this.jPanelPaginacionMayooresGenerales!=null) {
				this.jPanelPaginacionMayooresGenerales.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMayooresGenerales!=null) {
				this.jPanelParametrosReportesMayooresGenerales.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasMayooresGenerales!=null) {
					this.jTabbedPaneBusquedasMayooresGenerales.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesMayooresGenerales!=null) {
				this.jPanelParametrosReportesMayooresGenerales.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMayooresGenerales!=null) {
				this.jTabbedPaneBusquedasMayooresGenerales.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesMayooresGenerales!=null) {
				this.jPanelParametrosReportesMayooresGenerales.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaMayooresGenerales=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaMayooresGenerales) {this.jTabbedPaneBusquedasMayooresGenerales.remove(jPanelBusquedaMayooresGeneralesMayooresGenerales);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaMayooresGenerales=isParaEjercicio;
			if(!this.isVisibilidadBusquedaMayooresGenerales) {this.jTabbedPaneBusquedasMayooresGenerales.remove(jPanelBusquedaMayooresGeneralesMayooresGenerales);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadBusquedaMayooresGenerales=isParaCuentaContable;
			if(!this.isVisibilidadBusquedaMayooresGenerales) {this.jTabbedPaneBusquedasMayooresGenerales.remove(jPanelBusquedaMayooresGeneralesMayooresGenerales);}
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
			
			this.inicializarActualizarBindingTablaMayooresGenerales(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioMayooresGenerales() {
		this.updateBorderResaltarBusquedasFormularioMayooresGenerales();
		this.updateVisibilidadBusquedasFormularioMayooresGenerales();
		this.updateHabilitarBusquedasFormularioMayooresGenerales();
	}
	
	public void updateBorderResaltarBusquedasFormularioMayooresGenerales() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasMayooresGenerales.getComponents().length>0) {
	

		if(this.mayooresgeneralesConstantesFunciones.resaltarBusquedaMayooresGeneralesMayooresGenerales!=null) {
			index= this.jTabbedPaneBusquedasMayooresGenerales.indexOfComponent(this.jPanelBusquedaMayooresGeneralesMayooresGenerales);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMayooresGenerales.getComponent(index);
				jPanel.setBorder(this.mayooresgeneralesConstantesFunciones.resaltarBusquedaMayooresGeneralesMayooresGenerales);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioMayooresGenerales() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasMayooresGenerales.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMayooresGenerales.indexOfComponent(this.jPanelBusquedaMayooresGeneralesMayooresGenerales);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMayooresGenerales.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarBusquedaMayooresGeneralesMayooresGenerales);
			if(!this.mayooresgeneralesConstantesFunciones.mostrarBusquedaMayooresGeneralesMayooresGenerales && index>-1) {
				this.jTabbedPaneBusquedasMayooresGenerales.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioMayooresGenerales() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasMayooresGenerales.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMayooresGenerales.indexOfComponent(this.jPanelBusquedaMayooresGeneralesMayooresGenerales);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMayooresGenerales.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.mayooresgeneralesConstantesFunciones.activarBusquedaMayooresGeneralesMayooresGenerales);
				this.jTabbedPaneBusquedasMayooresGenerales.setEnabledAt(index,this.mayooresgeneralesConstantesFunciones.activarBusquedaMayooresGeneralesMayooresGenerales);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaMayooresGenerales(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaMayooresGenerales")) {
			index= this.jTabbedPaneBusquedasMayooresGenerales.indexOfComponent(this.jPanelBusquedaMayooresGeneralesMayooresGenerales);

			this.jTabbedPaneBusquedasMayooresGenerales.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMayooresGenerales.getComponent(index);

			this.mayooresgeneralesConstantesFunciones.setResaltarBusquedaMayooresGeneralesMayooresGenerales(resaltar);

			jPanel.setBorder(this.mayooresgeneralesConstantesFunciones.resaltarBusquedaMayooresGeneralesMayooresGenerales);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarMayooresGenerales.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioMayooresGenerales() throws Exception {

		if(this.jInternalFrameDetalleFormMayooresGenerales==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioMayooresGenerales();
		this.updateVisibilidadResaltarControlesFormularioMayooresGenerales();
		this.updateHabilitarResaltarControlesFormularioMayooresGenerales();
		
	}
	
	public void updateBorderResaltarControlesFormularioMayooresGenerales() throws Exception {
		if(this.jInternalFrameDetalleFormMayooresGenerales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.mayooresgeneralesConstantesFunciones.resaltaridMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jLabelidMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltaridMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltarid_empresaMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_empresaMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltarid_empresaMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltarid_ejercicioMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_ejercicioMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltarid_ejercicioMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltarid_cuenta_contableMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_cuenta_contableMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltarid_cuenta_contableMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltarfecha_emision_desdeMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jDateChooserfecha_emision_desdeMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltarfecha_emision_desdeMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltarfecha_emision_hastaMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jDateChooserfecha_emision_hastaMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltarfecha_emision_hastaMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltarnombre_sucursalMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanombre_sucursalMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltarnombre_sucursalMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltarcodigoMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigoMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltarcodigoMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltarbeneficiarioMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jTextAreabeneficiarioMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltarbeneficiarioMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltardetalleMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jTextAreadetalleMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltardetalleMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltarfecha_emisionMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jDateChooserfecha_emisionMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltarfecha_emisionMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltarcodigo_tipo_movimientoMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigo_tipo_movimientoMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltarcodigo_tipo_movimientoMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltarnumero_mayorMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanumero_mayorMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltarnumero_mayorMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltarnombre_cuenta_contableMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanombre_cuenta_contableMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltarnombre_cuenta_contableMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltardebito_localMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jTextFielddebito_localMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltardebito_localMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltarcredito_localMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcredito_localMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltarcredito_localMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltardetalle_detalle_asiento_contableMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jTextAreadetalle_detalle_asiento_contableMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltardetalle_detalle_asiento_contableMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltarcodigo_cuenta_contableMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigo_cuenta_contableMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltarcodigo_cuenta_contableMayooresGenerales);}
		if(this.mayooresgeneralesConstantesFunciones.resaltarsaldoMayooresGenerales!=null && this.jInternalFrameDetalleFormMayooresGenerales!=null) {this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldsaldoMayooresGenerales.setBorder(this.mayooresgeneralesConstantesFunciones.resaltarsaldoMayooresGenerales);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioMayooresGenerales() throws Exception {		
		if(this.jInternalFrameDetalleFormMayooresGenerales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
	
		//this.jInternalFrameDetalleFormMayooresGenerales.jLabelidMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostraridMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPanelidMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostraridMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_empresaMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarid_empresaMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPanelid_empresaMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarid_empresaMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_ejercicioMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarid_ejercicioMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPanelid_ejercicioMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarid_ejercicioMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_cuenta_contableMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarid_cuenta_contableMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPanelid_cuenta_contableMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarid_cuenta_contableMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jDateChooserfecha_emision_desdeMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarfecha_emision_desdeMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPanelfecha_emision_desdeMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarfecha_emision_desdeMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jDateChooserfecha_emision_hastaMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarfecha_emision_hastaMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPanelfecha_emision_hastaMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarfecha_emision_hastaMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanombre_sucursalMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarnombre_sucursalMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPanelnombre_sucursalMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarnombre_sucursalMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigoMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarcodigoMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPanelcodigoMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarcodigoMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jTextAreabeneficiarioMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarbeneficiarioMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPanelbeneficiarioMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarbeneficiarioMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jTextAreadetalleMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrardetalleMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPaneldetalleMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrardetalleMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jDateChooserfecha_emisionMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarfecha_emisionMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPanelfecha_emisionMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarfecha_emisionMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigo_tipo_movimientoMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarcodigo_tipo_movimientoMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPanelcodigo_tipo_movimientoMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarcodigo_tipo_movimientoMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanumero_mayorMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarnumero_mayorMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPanelnumero_mayorMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarnumero_mayorMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanombre_cuenta_contableMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarnombre_cuenta_contableMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPanelnombre_cuenta_contableMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarnombre_cuenta_contableMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jTextFielddebito_localMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrardebito_localMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPaneldebito_localMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrardebito_localMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcredito_localMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarcredito_localMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPanelcredito_localMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarcredito_localMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jTextAreadetalle_detalle_asiento_contableMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrardetalle_detalle_asiento_contableMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPaneldetalle_detalle_asiento_contableMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrardetalle_detalle_asiento_contableMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigo_cuenta_contableMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarcodigo_cuenta_contableMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPanelcodigo_cuenta_contableMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarcodigo_cuenta_contableMayooresGenerales);
		//this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldsaldoMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarsaldoMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jPanelsaldoMayooresGenerales.setVisible(this.mayooresgeneralesConstantesFunciones.mostrarsaldoMayooresGenerales);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioMayooresGenerales() throws Exception {
		if(this.jInternalFrameDetalleFormMayooresGenerales==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMayooresGenerales!=null) {
	
		this.jInternalFrameDetalleFormMayooresGenerales.jLabelidMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activaridMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_empresaMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activarid_empresaMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_ejercicioMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activarid_ejercicioMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jComboBoxid_cuenta_contableMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activarid_cuenta_contableMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jDateChooserfecha_emision_desdeMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activarfecha_emision_desdeMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jDateChooserfecha_emision_hastaMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activarfecha_emision_hastaMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanombre_sucursalMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activarnombre_sucursalMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigoMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activarcodigoMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextAreabeneficiarioMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activarbeneficiarioMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextAreadetalleMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activardetalleMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jDateChooserfecha_emisionMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activarfecha_emisionMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigo_tipo_movimientoMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activarcodigo_tipo_movimientoMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanumero_mayorMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activarnumero_mayorMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextAreanombre_cuenta_contableMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activarnombre_cuenta_contableMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextFielddebito_localMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activardebito_localMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcredito_localMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activarcredito_localMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextAreadetalle_detalle_asiento_contableMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activardetalle_detalle_asiento_contableMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldcodigo_cuenta_contableMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activarcodigo_cuenta_contableMayooresGenerales);
		this.jInternalFrameDetalleFormMayooresGenerales.jTextFieldsaldoMayooresGenerales.setEnabled(this.mayooresgeneralesConstantesFunciones.activarsaldoMayooresGenerales);
		}
	}
	
		
}