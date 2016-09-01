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

//import com.bydan.erp.nomina.util.CreditosDetalladosConstantesFunciones;
import com.bydan.erp.nomina.util.report.CreditosDetalladosParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.CreditosDetalladosParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.CreditosDetalladosBean;
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

import com.bydan.erp.nomina.business.logic.*;
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


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CreditosDetalladosBeanSwingJInternalFrame extends CreditosDetalladosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CreditosDetalladosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CreditosDetallados> creditosdetalladosValidator = new ClassValidator<CreditosDetallados>(CreditosDetallados.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CreditosDetallados creditosdetallados;	
	public CreditosDetallados creditosdetalladosAux;
	public CreditosDetallados creditosdetalladosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CreditosDetallados creditosdetalladosTotales;
	public Long idCreditosDetalladosActual;
	public Long iIdNuevoCreditosDetallados=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboCargo="";

	public List<Cargo> cargosForeignKey;

	public List<Cargo> getcargosForeignKey() {
		return cargosForeignKey;
	}

	public void setcargosForeignKey(List<Cargo> cargosForeignKey) {
		this.cargosForeignKey = cargosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cargo cargoForeignKey;

	public Cargo getcargoForeignKey() {
		return cargoForeignKey;
	}

	public void setcargoForeignKey(Cargo cargoForeignKey) {
		this.cargoForeignKey = cargoForeignKey;
	}

	public String sFinalQueryComboEstructura="";

	public List<Estructura> estructurasForeignKey;

	public List<Estructura> getestructurasForeignKey() {
		return estructurasForeignKey;
	}

	public void setestructurasForeignKey(List<Estructura> estructurasForeignKey) {
		this.estructurasForeignKey = estructurasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Estructura estructuraForeignKey;

	public Estructura getestructuraForeignKey() {
		return estructuraForeignKey;
	}

	public void setestructuraForeignKey(Estructura estructuraForeignKey) {
		this.estructuraForeignKey = estructuraForeignKey;
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

	public String sFinalQueryComboEmpleado="";

	public List<Empleado> empleadosForeignKey;

	public List<Empleado> getempleadosForeignKey() {
		return empleadosForeignKey;
	}

	public void setempleadosForeignKey(List<Empleado> empleadosForeignKey) {
		this.empleadosForeignKey = empleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoForeignKey;

	public Empleado getempleadoForeignKey() {
		return empleadoForeignKey;
	}

	public void setempleadoForeignKey(Empleado empleadoForeignKey) {
		this.empleadoForeignKey = empleadoForeignKey;
	}

	public String sFinalQueryComboTipoPrestamo="";

	public List<TipoPrestamo> tipoprestamosForeignKey;

	public List<TipoPrestamo> gettipoprestamosForeignKey() {
		return tipoprestamosForeignKey;
	}

	public void settipoprestamosForeignKey(List<TipoPrestamo> tipoprestamosForeignKey) {
		this.tipoprestamosForeignKey = tipoprestamosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoPrestamo tipoprestamoForeignKey;

	public TipoPrestamo gettipoprestamoForeignKey() {
		return tipoprestamoForeignKey;
	}

	public void settipoprestamoForeignKey(TipoPrestamo tipoprestamoForeignKey) {
		this.tipoprestamoForeignKey = tipoprestamoForeignKey;
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
	
	public Boolean isPermisoTodoCreditosDetallados;
	public Boolean isPermisoNuevoCreditosDetallados;
	public Boolean isPermisoActualizarCreditosDetallados;
	public Boolean isPermisoActualizarOriginalCreditosDetallados;
	public Boolean isPermisoEliminarCreditosDetallados;
	public Boolean isPermisoGuardarCambiosCreditosDetallados;
	public Boolean isPermisoConsultaCreditosDetallados;
	public Boolean isPermisoBusquedaCreditosDetallados;
	public Boolean isPermisoReporteCreditosDetallados;
	public Boolean isPermisoPaginacionMedioCreditosDetallados;
	public Boolean isPermisoPaginacionAltoCreditosDetallados;
	public Boolean isPermisoPaginacionTodoCreditosDetallados;
	public Boolean isPermisoCopiarCreditosDetallados;
	public Boolean isPermisoVerFormCreditosDetallados;
	public Boolean isPermisoDuplicarCreditosDetallados;
	public Boolean isPermisoOrdenCreditosDetallados;
	
	
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
	
	public CreditosDetalladosParameterReturnGeneral creditosdetalladosReturnGeneral;
	public CreditosDetalladosParameterReturnGeneral creditosdetalladosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCreditosDetallados=false;
	public Boolean esParaAccionDesdeFormularioCreditosDetallados=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CreditosDetalladosSessionBeanAdditional creditosdetalladosSessionBeanAdditional=null;
	
	public CreditosDetalladosSessionBeanAdditional getCreditosDetalladosSessionBeanAdditional() {
		return this.creditosdetalladosSessionBeanAdditional;
	}
	
	public void setCreditosDetalladosSessionBeanAdditional(CreditosDetalladosSessionBeanAdditional creditosdetalladosSessionBeanAdditional) {
		try {
			this.creditosdetalladosSessionBeanAdditional=creditosdetalladosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CreditosDetalladosBeanSwingJInternalFrameAdditional creditosdetalladosBeanSwingJInternalFrameAdditional=null;
	//public class CreditosDetalladosBeanSwingJInternalFrame
	
	public CreditosDetalladosBeanSwingJInternalFrameAdditional getCreditosDetalladosBeanSwingJInternalFrameAdditional() {
		return this.creditosdetalladosBeanSwingJInternalFrameAdditional;
	}
	
	public void setCreditosDetalladosBeanSwingJInternalFrameAdditional(CreditosDetalladosBeanSwingJInternalFrameAdditional creditosdetalladosBeanSwingJInternalFrameAdditional) {
		try {
			this.creditosdetalladosBeanSwingJInternalFrameAdditional=creditosdetalladosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CreditosDetalladosLogic creditosdetalladosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CreditosDetallados creditosdetalladosBean;
	public CreditosDetalladosConstantesFunciones creditosdetalladosConstantesFunciones;
	//public CreditosDetalladosParameterReturnGeneral creditosdetalladosReturnGeneral;
	
	//FK
	
	public CargoLogic cargoLogic;
	public EstructuraLogic estructuraLogic;
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public TipoPrestamoLogic tipoprestamoLogic;
	
	//PARAMETROS
	
	
	//public List<CreditosDetallados> creditosdetalladoss;	
	//public List<CreditosDetallados> creditosdetalladossEliminados;
	//public List<CreditosDetallados> creditosdetalladossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCreditosDetallados=false;
	public Boolean isVisibilidadCeldaDuplicarCreditosDetallados=true;
	public Boolean isVisibilidadCeldaCopiarCreditosDetallados=true;
	public Boolean isVisibilidadCeldaVerFormCreditosDetallados=true;
	public Boolean isVisibilidadCeldaOrdenCreditosDetallados=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCreditosDetallados=false;
	public Boolean isVisibilidadCeldaModificarCreditosDetallados=false;
	public Boolean isVisibilidadCeldaActualizarCreditosDetallados=false;
	public Boolean isVisibilidadCeldaEliminarCreditosDetallados=false;
	public Boolean isVisibilidadCeldaCancelarCreditosDetallados=false;
	public Boolean isVisibilidadCeldaGuardarCreditosDetallados=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCreditosDetallados=false;	
	
	
	public Boolean isVisibilidadBusquedaCreditosDetallados=false;
	public Boolean isVisibilidadFK_IdCargo=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdTipoPrestamo=false;
	
	public Long getiIdNuevoCreditosDetallados() {
		return this.iIdNuevoCreditosDetallados;
	}

	public void setiIdNuevoCreditosDetallados(Long iIdNuevoCreditosDetallados) {
		this.iIdNuevoCreditosDetallados = iIdNuevoCreditosDetallados;
	}
	
	public Long getidCreditosDetalladosActual() {
		return this.idCreditosDetalladosActual;
	}

	public void setidCreditosDetalladosActual(Long idCreditosDetalladosActual) {
		this.idCreditosDetalladosActual = idCreditosDetalladosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CreditosDetallados getcreditosdetallados() {
		return this.creditosdetallados;
	}

	public void setcreditosdetallados(CreditosDetallados creditosdetallados) {
		this.creditosdetallados = creditosdetallados;
	}
	
	public CreditosDetallados getcreditosdetalladosAux() {
		return this.creditosdetalladosAux;
	}

	public void setcreditosdetalladosAux(CreditosDetallados creditosdetalladosAux) {
		this.creditosdetalladosAux = creditosdetalladosAux;
	}				
	
	public CreditosDetallados getcreditosdetalladosAnterior() {
		return this.creditosdetalladosAnterior;
	}

	public void setcreditosdetalladosAnterior(CreditosDetallados creditosdetalladosAnterior) {
		this.creditosdetalladosAnterior = creditosdetalladosAnterior;
	}	
	
	public CreditosDetallados getcreditosdetalladosTotales() {
		return this.creditosdetalladosTotales;
	}

	public void setcreditosdetalladosTotales(CreditosDetallados creditosdetalladosTotales) {
		this.creditosdetalladosTotales = creditosdetalladosTotales;
	}	
	
	public CreditosDetallados getcreditosdetalladosBean() {
		return this.creditosdetalladosBean;
	}

	public void setcreditosdetalladosBean(CreditosDetallados creditosdetalladosBean) {
		this.creditosdetalladosBean = creditosdetalladosBean;
	}	
	
	public CreditosDetalladosParameterReturnGeneral getcreditosdetalladosReturnGeneral() {
		return this.creditosdetalladosReturnGeneral;
	}

	public void setcreditosdetalladosReturnGeneral(CreditosDetalladosParameterReturnGeneral creditosdetalladosReturnGeneral) {
		this.creditosdetalladosReturnGeneral = creditosdetalladosReturnGeneral;
	}	
	
	
	public Long id_cargoBusquedaCreditosDetallados=-1L;

	public Long getid_cargoBusquedaCreditosDetallados() {
		return this.id_cargoBusquedaCreditosDetallados;
	}

	public void setid_cargoBusquedaCreditosDetallados(Long id_cargoBusquedaCreditosDetallados) {
		this.id_cargoBusquedaCreditosDetallados = id_cargoBusquedaCreditosDetallados;
	}

;
	public Long id_estructuraBusquedaCreditosDetallados=-1L;

	public Long getid_estructuraBusquedaCreditosDetallados() {
		return this.id_estructuraBusquedaCreditosDetallados;
	}

	public void setid_estructuraBusquedaCreditosDetallados(Long id_estructuraBusquedaCreditosDetallados) {
		this.id_estructuraBusquedaCreditosDetallados = id_estructuraBusquedaCreditosDetallados;
	}

;
	public Long id_empleadoBusquedaCreditosDetallados=-1L;

	public Long getid_empleadoBusquedaCreditosDetallados() {
		return this.id_empleadoBusquedaCreditosDetallados;
	}

	public void setid_empleadoBusquedaCreditosDetallados(Long id_empleadoBusquedaCreditosDetallados) {
		this.id_empleadoBusquedaCreditosDetallados = id_empleadoBusquedaCreditosDetallados;
	}

;
	public Long id_tipo_prestamoBusquedaCreditosDetallados=-1L;

	public Long getid_tipo_prestamoBusquedaCreditosDetallados() {
		return this.id_tipo_prestamoBusquedaCreditosDetallados;
	}

	public void setid_tipo_prestamoBusquedaCreditosDetallados(Long id_tipo_prestamoBusquedaCreditosDetallados) {
		this.id_tipo_prestamoBusquedaCreditosDetallados = id_tipo_prestamoBusquedaCreditosDetallados;
	}

;
	public Date fecha_vencimiento_desdeBusquedaCreditosDetallados=new Date();

	public Date getfecha_vencimiento_desdeBusquedaCreditosDetallados() {
		return this.fecha_vencimiento_desdeBusquedaCreditosDetallados;
	}

	public void setfecha_vencimiento_desdeBusquedaCreditosDetallados(Date fecha_vencimiento_desdeBusquedaCreditosDetallados) {
		this.fecha_vencimiento_desdeBusquedaCreditosDetallados = fecha_vencimiento_desdeBusquedaCreditosDetallados;
	}

;
	public Date fecha_vencimiento_hastaBusquedaCreditosDetallados=new Date();

	public Date getfecha_vencimiento_hastaBusquedaCreditosDetallados() {
		return this.fecha_vencimiento_hastaBusquedaCreditosDetallados;
	}

	public void setfecha_vencimiento_hastaBusquedaCreditosDetallados(Date fecha_vencimiento_hastaBusquedaCreditosDetallados) {
		this.fecha_vencimiento_hastaBusquedaCreditosDetallados = fecha_vencimiento_hastaBusquedaCreditosDetallados;
	}

	public Long id_cargoFK_IdCargo=-1L;

	public Long getid_cargoFK_IdCargo() {
		return this.id_cargoFK_IdCargo;
	}

	public void setid_cargoFK_IdCargo(Long id_cargoFK_IdCargo) {
		this.id_cargoFK_IdCargo = id_cargoFK_IdCargo;
	}

	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estructuraFK_IdEstructura=-1L;

	public Long getid_estructuraFK_IdEstructura() {
		return this.id_estructuraFK_IdEstructura;
	}

	public void setid_estructuraFK_IdEstructura(Long id_estructuraFK_IdEstructura) {
		this.id_estructuraFK_IdEstructura = id_estructuraFK_IdEstructura;
	}

	public Long id_tipo_prestamoFK_IdTipoPrestamo=-1L;

	public Long getid_tipo_prestamoFK_IdTipoPrestamo() {
		return this.id_tipo_prestamoFK_IdTipoPrestamo;
	}

	public void setid_tipo_prestamoFK_IdTipoPrestamo(Long id_tipo_prestamoFK_IdTipoPrestamo) {
		this.id_tipo_prestamoFK_IdTipoPrestamo = id_tipo_prestamoFK_IdTipoPrestamo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CreditosDetalladosLogic getCreditosDetalladosLogic()	{		
		return creditosdetalladosLogic;
	}

	public void setCreditosDetalladosLogic(CreditosDetalladosLogic creditosdetalladosLogic) {
		this.creditosdetalladosLogic = creditosdetalladosLogic;
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
	
	public Boolean getIsEsNuevoCreditosDetallados() {
		return isEsNuevoCreditosDetallados;
	}

	public void setIsEsNuevoCreditosDetallados(Boolean isEsNuevoCreditosDetallados) {
		this.isEsNuevoCreditosDetallados = isEsNuevoCreditosDetallados;
	}

	public Boolean getEsParaAccionDesdeFormularioCreditosDetallados() {
		return esParaAccionDesdeFormularioCreditosDetallados;
	}
	
	public void setEsParaAccionDesdeFormularioCreditosDetallados(Boolean esParaAccionDesdeFormularioCreditosDetallados) {
		this.esParaAccionDesdeFormularioCreditosDetallados = esParaAccionDesdeFormularioCreditosDetallados;
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
	
	
	public void cargarCombosCargosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cargosForeignKey=new ArrayList<Cargo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CargoLogic cargoLogic=new CargoLogic();

			cargoLogic.getCargoDataAccess().setIsForForeingKeyData(true);

			if(this.creditosdetalladosSessionBean==null) {
				this.creditosdetalladosSessionBean=new CreditosDetalladosSessionBean();
			}

			if(!this.creditosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionCargo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoLogic.getCargoDataAccess().setIsForForeingKeyData(true);

					cargoLogic.getTodosCargosWithConnection(sFinalQuery,new Pagination());

					this.cargosForeignKey=cargoLogic.getCargos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCargo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoLogic.getEntityWithConnection(creditosdetalladosSessionBean.getlidCargoActual());
					this.cargosForeignKey.add(cargoLogic.getCargo());
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

	public void cargarCombosEstructurasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estructurasForeignKey=new ArrayList<Estructura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstructuraLogic estructuraLogic=new EstructuraLogic();

			estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.creditosdetalladosSessionBean==null) {
				this.creditosdetalladosSessionBean=new CreditosDetalladosSessionBean();
			}

			if(!this.creditosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

					estructuraLogic.getTodosEstructurasWithConnection(sFinalQuery,new Pagination());

					this.estructurasForeignKey=estructuraLogic.getEstructuras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstructura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEntityWithConnection(creditosdetalladosSessionBean.getlidEstructuraActual());
					this.estructurasForeignKey.add(estructuraLogic.getEstructura());
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

			if(this.creditosdetalladosSessionBean==null) {
				this.creditosdetalladosSessionBean=new CreditosDetalladosSessionBean();
			}

			if(!this.creditosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(creditosdetalladosSessionBean.getlidEmpresaActual());
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

	public void cargarCombosEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadosForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.creditosdetalladosSessionBean==null) {
				this.creditosdetalladosSessionBean=new CreditosDetalladosSessionBean();
			}

			if(!this.creditosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadosForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(creditosdetalladosSessionBean.getlidEmpleadoActual());
					this.empleadosForeignKey.add(empleadoLogic.getEmpleado());
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

	public void cargarCombosTipoPrestamosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoprestamosForeignKey=new ArrayList<TipoPrestamo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoPrestamoLogic tipoprestamoLogic=new TipoPrestamoLogic();

			//tipoprestamoLogic.getTipoPrestamoDataAccess().setIsForForeingKeyData(true);

			if(this.creditosdetalladosSessionBean==null) {
				this.creditosdetalladosSessionBean=new CreditosDetalladosSessionBean();
			}

			if(!this.creditosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrestamo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoprestamoLogic.getTipoPrestamoDataAccess().setIsForForeingKeyData(true);

					tipoprestamoLogic.getTodosTipoPrestamosWithConnection(sFinalQuery,new Pagination());

					this.tipoprestamosForeignKey=tipoprestamoLogic.getTipoPrestamos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoPrestamo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprestamoLogic.getEntityWithConnection(creditosdetalladosSessionBean.getlidTipoPrestamoActual());
					this.tipoprestamosForeignKey.add(tipoprestamoLogic.getTipoPrestamo());
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

	
	
	public void setActualCargoForeignKey(Long idCargoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cargo  cargoTemp=null;

			for(Cargo cargoAux:cargosForeignKey) {
				if(cargoAux.getId()!=null && cargoAux.getId().equals(idCargoSeleccionado)) {
					cargoTemp=cargoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cargoTemp!=null) {

					if(this.creditosdetallados!=null) {
						this.creditosdetallados.setCargo(cargoTemp);
					}

					if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
						this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_cargoCreditosDetallados.setSelectedItem(cargoTemp);
					}
				} else {
					//jComboBoxid_cargoCreditosDetallados.setSelectedItem(cargoTemp);
					if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
						if(this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_cargoCreditosDetallados.getItemCount()>0) {
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_cargoCreditosDetallados.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCreditosDetallados") || sFormularioTipoBusqueda.equals("Todos")){
					if(cargoTemp!=null && jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados!=null) {
						jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados.setSelectedItem(cargoTemp);
					} else {
						if(jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados!=null) {
							//jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados.setSelectedItem(cargoTemp);
							if(jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados.getItemCount()>0) {
								jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados.setSelectedIndex(0);
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

	public String getActualCargoForeignKeyDescripcion(Long idCargoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cargo  cargoTemp=null;

			for(Cargo cargoAux:cargosForeignKey) {
				if(cargoAux.getId()!=null && cargoAux.getId().equals(idCargoSeleccionado)) {
					cargoTemp=cargoAux;
					break;
				}
			}


			sDescripcion=CargoConstantesFunciones.getCargoDescripcion(cargoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCargoForeignKeyGenerico(Long idCargoSeleccionado,JComboBox jComboBoxid_cargoCreditosDetalladosGenerico)throws Exception
	{
		try
		{
			Cargo  cargoTemp=null;

			for(Cargo cargoAux:cargosForeignKey) {
				if(cargoAux.getId()!=null && cargoAux.getId().equals(idCargoSeleccionado)) {
					cargoTemp=cargoAux;
					break;
				}
			}

			if(cargoTemp!=null) {
				jComboBoxid_cargoCreditosDetalladosGenerico.setSelectedItem(cargoTemp);
			} else {
				if(jComboBoxid_cargoCreditosDetalladosGenerico!=null && jComboBoxid_cargoCreditosDetalladosGenerico.getItemCount()>0) {
					jComboBoxid_cargoCreditosDetalladosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstructuraForeignKey(Long idEstructuraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estructuraTemp!=null) {

					if(this.creditosdetallados!=null) {
						this.creditosdetallados.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
						this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_estructuraCreditosDetallados.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraCreditosDetallados.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
						if(this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_estructuraCreditosDetallados.getItemCount()>0) {
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_estructuraCreditosDetallados.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCreditosDetallados") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados!=null) {
						jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados!=null) {
							//jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados.getItemCount()>0) {
								jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados.setSelectedIndex(0);
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

	public String getActualEstructuraForeignKeyDescripcion(Long idEstructuraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}


			sDescripcion=EstructuraConstantesFunciones.getEstructuraDescripcion(estructuraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraCreditosDetalladosGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(estructuraTemp!=null) {
				jComboBoxid_estructuraCreditosDetalladosGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraCreditosDetalladosGenerico!=null && jComboBoxid_estructuraCreditosDetalladosGenerico.getItemCount()>0) {
					jComboBoxid_estructuraCreditosDetalladosGenerico.setSelectedIndex(0);
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

					if(this.creditosdetallados!=null) {
						this.creditosdetallados.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
						this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empresaCreditosDetallados.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCreditosDetallados.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
						if(this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empresaCreditosDetallados.getItemCount()>0) {
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empresaCreditosDetallados.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCreditosDetalladosGenerico)throws Exception
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
				jComboBoxid_empresaCreditosDetalladosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCreditosDetalladosGenerico!=null && jComboBoxid_empresaCreditosDetalladosGenerico.getItemCount()>0) {
					jComboBoxid_empresaCreditosDetalladosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoForeignKey(Long idEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoTemp!=null) {

					if(this.creditosdetallados!=null) {
						this.creditosdetallados.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
						this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empleadoCreditosDetallados.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoCreditosDetallados.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
						if(this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empleadoCreditosDetallados.getItemCount()>0) {
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empleadoCreditosDetallados.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCreditosDetallados") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados!=null) {
						jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados!=null) {
							//jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados.getItemCount()>0) {
								jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados.setSelectedIndex(0);
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

	public String getActualEmpleadoForeignKeyDescripcion(Long idEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoCreditosDetalladosGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(empleadoTemp!=null) {
				jComboBoxid_empleadoCreditosDetalladosGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoCreditosDetalladosGenerico!=null && jComboBoxid_empleadoCreditosDetalladosGenerico.getItemCount()>0) {
					jComboBoxid_empleadoCreditosDetalladosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoPrestamoForeignKey(Long idTipoPrestamoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoPrestamo  tipoprestamoTemp=null;

			for(TipoPrestamo tipoprestamoAux:tipoprestamosForeignKey) {
				if(tipoprestamoAux.getId()!=null && tipoprestamoAux.getId().equals(idTipoPrestamoSeleccionado)) {
					tipoprestamoTemp=tipoprestamoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoprestamoTemp!=null) {

					if(this.creditosdetallados!=null) {
						this.creditosdetallados.setTipoPrestamo(tipoprestamoTemp);
					}

					if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
						this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_tipo_prestamoCreditosDetallados.setSelectedItem(tipoprestamoTemp);
					}
				} else {
					//jComboBoxid_tipo_prestamoCreditosDetallados.setSelectedItem(tipoprestamoTemp);
					if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
						if(this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_tipo_prestamoCreditosDetallados.getItemCount()>0) {
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_tipo_prestamoCreditosDetallados.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCreditosDetallados") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoprestamoTemp!=null && jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados!=null) {
						jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.setSelectedItem(tipoprestamoTemp);
					} else {
						if(jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados!=null) {
							//jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.setSelectedItem(tipoprestamoTemp);
							if(jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.getItemCount()>0) {
								jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.setSelectedIndex(0);
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

	public String getActualTipoPrestamoForeignKeyDescripcion(Long idTipoPrestamoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoPrestamo  tipoprestamoTemp=null;

			for(TipoPrestamo tipoprestamoAux:tipoprestamosForeignKey) {
				if(tipoprestamoAux.getId()!=null && tipoprestamoAux.getId().equals(idTipoPrestamoSeleccionado)) {
					tipoprestamoTemp=tipoprestamoAux;
					break;
				}
			}


			sDescripcion=TipoPrestamoConstantesFunciones.getTipoPrestamoDescripcion(tipoprestamoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoPrestamoForeignKeyGenerico(Long idTipoPrestamoSeleccionado,JComboBox jComboBoxid_tipo_prestamoCreditosDetalladosGenerico)throws Exception
	{
		try
		{
			TipoPrestamo  tipoprestamoTemp=null;

			for(TipoPrestamo tipoprestamoAux:tipoprestamosForeignKey) {
				if(tipoprestamoAux.getId()!=null && tipoprestamoAux.getId().equals(idTipoPrestamoSeleccionado)) {
					tipoprestamoTemp=tipoprestamoAux;
					break;
				}
			}

			if(tipoprestamoTemp!=null) {
				jComboBoxid_tipo_prestamoCreditosDetalladosGenerico.setSelectedItem(tipoprestamoTemp);
			} else {
				if(jComboBoxid_tipo_prestamoCreditosDetalladosGenerico!=null && jComboBoxid_tipo_prestamoCreditosDetalladosGenerico.getItemCount()>0) {
					jComboBoxid_tipo_prestamoCreditosDetalladosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCargoForeignKey(CreditosDetallados creditosdetallados,JComboBox jComboBoxid_cargoCreditosDetalladosGenerico)throws Exception
	{
		try
		{
			Cargo  cargoAux=new Cargo();

			if(jComboBoxid_cargoCreditosDetalladosGenerico==null) {
				cargoAux=(Cargo)this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_cargoCreditosDetallados.getSelectedItem();
			} else {
				cargoAux=(Cargo)jComboBoxid_cargoCreditosDetalladosGenerico.getSelectedItem();
			}

			if(cargoAux!=null && cargoAux.getId()!=null) {
				creditosdetallados.setid_cargo(cargoAux.getId());
				creditosdetallados.setcargo_descripcion(CreditosDetalladosConstantesFunciones.getCargoDescripcion(cargoAux));
				creditosdetallados.setCargo(cargoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(CreditosDetallados creditosdetallados,JComboBox jComboBoxid_estructuraCreditosDetalladosGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraCreditosDetalladosGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_estructuraCreditosDetallados.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraCreditosDetalladosGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				creditosdetallados.setid_estructura(estructuraAux.getId());
				creditosdetallados.setestructura_descripcion(CreditosDetalladosConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				creditosdetallados.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CreditosDetallados creditosdetallados,JComboBox jComboBoxid_empresaCreditosDetalladosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCreditosDetalladosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empresaCreditosDetallados.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCreditosDetalladosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				creditosdetallados.setid_empresa(empresaAux.getId());
				creditosdetallados.setempresa_descripcion(CreditosDetalladosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				creditosdetallados.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(CreditosDetallados creditosdetallados,JComboBox jComboBoxid_empleadoCreditosDetalladosGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoCreditosDetalladosGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empleadoCreditosDetallados.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoCreditosDetalladosGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				creditosdetallados.setid_empleado(empleadoAux.getId());
				creditosdetallados.setempleado_descripcion(CreditosDetalladosConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				creditosdetallados.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoPrestamoForeignKey(CreditosDetallados creditosdetallados,JComboBox jComboBoxid_tipo_prestamoCreditosDetalladosGenerico)throws Exception
	{
		try
		{
			TipoPrestamo  tipoprestamoAux=new TipoPrestamo();

			if(jComboBoxid_tipo_prestamoCreditosDetalladosGenerico==null) {
				tipoprestamoAux=(TipoPrestamo)this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_tipo_prestamoCreditosDetallados.getSelectedItem();
			} else {
				tipoprestamoAux=(TipoPrestamo)jComboBoxid_tipo_prestamoCreditosDetalladosGenerico.getSelectedItem();
			}

			if(tipoprestamoAux!=null && tipoprestamoAux.getId()!=null) {
				creditosdetallados.setid_tipo_prestamo(tipoprestamoAux.getId());
				creditosdetallados.settipoprestamo_descripcion(CreditosDetalladosConstantesFunciones.getTipoPrestamoDescripcion(tipoprestamoAux));
				creditosdetallados.setTipoPrestamo(tipoprestamoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCargosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCargo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { 
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_cargoCreditosDetallados.removeAllItems();

							for(Cargo cargo:this.cargosForeignKey) {
								this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_cargoCreditosDetallados.addItem(cargo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { 
					}

					if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCreditosDetallados") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados.removeAllItems();

							for(Cargo cargo:this.cargosForeignKey) {
								this.jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados.addItem(cargo);
							}
						}

						if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstructurasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstructura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { 
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_estructuraCreditosDetallados.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_estructuraCreditosDetallados.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { 
					}

					if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCreditosDetallados") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados.addItem(estructura);
							}
						}

						if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { 
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empresaCreditosDetallados.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empresaCreditosDetallados.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { 
					}

					if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { 
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empleadoCreditosDetallados.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empleadoCreditosDetallados.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { 
					}

					if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCreditosDetallados") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados.addItem(empleado);
							}
						}

						if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoPrestamosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoPrestamo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { 
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_tipo_prestamoCreditosDetallados.removeAllItems();

							for(TipoPrestamo tipoprestamo:this.tipoprestamosForeignKey) {
								this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_tipo_prestamoCreditosDetallados.addItem(tipoprestamo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { 
					}

					if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCreditosDetallados") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.removeAllItems();

							for(TipoPrestamo tipoprestamo:this.tipoprestamosForeignKey) {
								this.jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.addItem(tipoprestamo);
							}
						}

						if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameCargoForeignKey(Cargo cargo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_cargoCreditosDetallados.setSelectedItem(cargo);
						}
					} else {
						if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_cargoCreditosDetallados.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados.setSelectedItem(cargo);
						} else {
							this.jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstructuraForeignKey(Estructura estructura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_estructuraCreditosDetallados.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_estructuraCreditosDetallados.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empresaCreditosDetallados.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empresaCreditosDetallados.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEmpleadoForeignKey(Empleado empleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empleadoCreditosDetallados.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empleadoCreditosDetallados.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoPrestamoForeignKey(TipoPrestamo tipoprestamo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_tipo_prestamoCreditosDetallados.setSelectedItem(tipoprestamo);
						}
					} else {
						if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_tipo_prestamoCreditosDetallados.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.setSelectedItem(tipoprestamo);
						} else {
							this.jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCreditosDetallados() throws Exception {
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
		
	public CreditosDetalladosParameterReturnGeneral getCreditosDetalladosParameterGeneral() {
		return this.creditosdetalladosParameterGeneral;
	}
	
	public void setCreditosDetalladosParameterGeneral(CreditosDetalladosParameterReturnGeneral creditosdetalladosParameterGeneral) {
		this.creditosdetalladosParameterGeneral = creditosdetalladosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCreditosDetallados() {
		return isPermisoTodoCreditosDetallados;
	}

	public void setIsPermisoTodoCreditosDetallados(Boolean isPermisoTodoCreditosDetallados) {
		this.isPermisoTodoCreditosDetallados = isPermisoTodoCreditosDetallados;
	}

	public Boolean getIsPermisoNuevoCreditosDetallados() {
		return isPermisoNuevoCreditosDetallados;
	}

	public void setIsPermisoNuevoCreditosDetallados(Boolean isPermisoNuevoCreditosDetallados) {
		this.isPermisoNuevoCreditosDetallados = isPermisoNuevoCreditosDetallados;
	}

	public Boolean getIsPermisoActualizarCreditosDetallados() {
		return isPermisoActualizarCreditosDetallados;
	}

	public void setIsPermisoActualizarCreditosDetallados(Boolean isPermisoActualizarCreditosDetallados) {
		this.isPermisoActualizarCreditosDetallados = isPermisoActualizarCreditosDetallados;
	}

	public Boolean getIsPermisoEliminarCreditosDetallados() {
		return isPermisoEliminarCreditosDetallados;
	}

	public void setIsPermisoEliminarCreditosDetallados(Boolean isPermisoEliminarCreditosDetallados) {
		this.isPermisoEliminarCreditosDetallados = isPermisoEliminarCreditosDetallados;
	}

	public Boolean getIsPermisoGuardarCambiosCreditosDetallados() {
		return isPermisoGuardarCambiosCreditosDetallados;
	}

	public void setIsPermisoGuardarCambiosCreditosDetallados(Boolean isPermisoGuardarCambiosCreditosDetallados) {
		this.isPermisoGuardarCambiosCreditosDetallados = isPermisoGuardarCambiosCreditosDetallados;
	}
	
	public Boolean getIsPermisoConsultaCreditosDetallados() {
		return isPermisoConsultaCreditosDetallados;
	}

	public void setIsPermisoConsultaCreditosDetallados(Boolean isPermisoConsultaCreditosDetallados) {
		this.isPermisoConsultaCreditosDetallados = isPermisoConsultaCreditosDetallados;
	}

	public Boolean getIsPermisoBusquedaCreditosDetallados() {
		return isPermisoBusquedaCreditosDetallados;
	}

	public void setIsPermisoBusquedaCreditosDetallados(Boolean isPermisoBusquedaCreditosDetallados) {
		this.isPermisoBusquedaCreditosDetallados = isPermisoBusquedaCreditosDetallados;
	}

	public Boolean getIsPermisoReporteCreditosDetallados() {
		return isPermisoReporteCreditosDetallados;
	}

	public void setIsPermisoReporteCreditosDetallados(Boolean isPermisoReporteCreditosDetallados) {
		this.isPermisoReporteCreditosDetallados = isPermisoReporteCreditosDetallados;
	}
	
	public Boolean getIsPermisoPaginacionMedioCreditosDetallados() {
		return isPermisoPaginacionMedioCreditosDetallados;
	}

	public void setIsPermisoPaginacionMedioCreditosDetallados(Boolean isPermisoPaginacionMedioCreditosDetallados) {
		this.isPermisoPaginacionMedioCreditosDetallados = isPermisoPaginacionMedioCreditosDetallados;
	}
	
	public Boolean getIsPermisoPaginacionTodoCreditosDetallados() {
		return isPermisoPaginacionTodoCreditosDetallados;
	}

	public void setIsPermisoPaginacionTodoCreditosDetallados(Boolean isPermisoPaginacionTodoCreditosDetallados) {
		this.isPermisoPaginacionTodoCreditosDetallados = isPermisoPaginacionTodoCreditosDetallados;
	}
	
	public Boolean getIsPermisoPaginacionAltoCreditosDetallados() {
		return isPermisoPaginacionAltoCreditosDetallados;
	}

	public void setIsPermisoPaginacionAltoCreditosDetallados(Boolean isPermisoPaginacionAltoCreditosDetallados) {
		this.isPermisoPaginacionAltoCreditosDetallados = isPermisoPaginacionAltoCreditosDetallados;
	}
	
	public Boolean getIsPermisoCopiarCreditosDetallados() {
		return isPermisoCopiarCreditosDetallados;
	}

	public void setIsPermisoCopiarCreditosDetallados(Boolean isPermisoCopiarCreditosDetallados) {
		this.isPermisoCopiarCreditosDetallados = isPermisoCopiarCreditosDetallados;
	}
	
	public Boolean getIsPermisoVerFormCreditosDetallados() {
		return isPermisoVerFormCreditosDetallados;
	}

	public void setIsPermisoVerFormCreditosDetallados(Boolean isPermisoVerFormCreditosDetallados) {
		this.isPermisoVerFormCreditosDetallados = isPermisoVerFormCreditosDetallados;
	}
	
	public Boolean getIsPermisoDuplicarCreditosDetallados() {
		return isPermisoDuplicarCreditosDetallados;
	}

	public void setIsPermisoDuplicarCreditosDetallados(Boolean isPermisoDuplicarCreditosDetallados) {
		this.isPermisoDuplicarCreditosDetallados = isPermisoDuplicarCreditosDetallados;
	}
	
	public Boolean getIsPermisoOrdenCreditosDetallados() {
		return isPermisoOrdenCreditosDetallados;
	}

	public void setIsPermisoOrdenCreditosDetallados(Boolean isPermisoOrdenCreditosDetallados) {
		this.isPermisoOrdenCreditosDetallados = isPermisoOrdenCreditosDetallados;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCreditosDetallados() {
		return isVisibilidadCeldaNuevoCreditosDetallados;
	}

	public void setIsVisibilidadCeldaNuevoCreditosDetallados(Boolean isVisibilidadCeldaNuevoCreditosDetallados) {
		this.isVisibilidadCeldaNuevoCreditosDetallados = isVisibilidadCeldaNuevoCreditosDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCreditosDetallados() {
		return isVisibilidadCeldaDuplicarCreditosDetallados;
	}

	public void setIsVisibilidadCeldaDuplicarCreditosDetallados(Boolean isVisibilidadCeldaDuplicarCreditosDetallados) {
		this.isVisibilidadCeldaDuplicarCreditosDetallados = isVisibilidadCeldaDuplicarCreditosDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCreditosDetallados() {
		return isVisibilidadCeldaCopiarCreditosDetallados;
	}

	public void setIsVisibilidadCeldaCopiarCreditosDetallados(Boolean isVisibilidadCeldaCopiarCreditosDetallados) {
		this.isVisibilidadCeldaCopiarCreditosDetallados = isVisibilidadCeldaCopiarCreditosDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCreditosDetallados() {
		return isVisibilidadCeldaVerFormCreditosDetallados;
	}

	public void setIsVisibilidadCeldaVerFormCreditosDetallados(Boolean isVisibilidadCeldaVerFormCreditosDetallados) {
		this.isVisibilidadCeldaVerFormCreditosDetallados = isVisibilidadCeldaVerFormCreditosDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCreditosDetallados() {
		return isVisibilidadCeldaOrdenCreditosDetallados;
	}

	public void setIsVisibilidadCeldaOrdenCreditosDetallados(Boolean isVisibilidadCeldaOrdenCreditosDetallados) {
		this.isVisibilidadCeldaOrdenCreditosDetallados = isVisibilidadCeldaOrdenCreditosDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCreditosDetallados() {
		return isVisibilidadCeldaNuevoRelacionesCreditosDetallados;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCreditosDetallados(Boolean isVisibilidadCeldaNuevoRelacionesCreditosDetallados) {
		this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados = isVisibilidadCeldaNuevoRelacionesCreditosDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCreditosDetallados() {
		return isVisibilidadCeldaModificarCreditosDetallados;
	}

	public void setIsVisibilidadCeldaModificarCreditosDetallados(Boolean isVisibilidadCeldaModificarCreditosDetallados) {
		this.isVisibilidadCeldaModificarCreditosDetallados = isVisibilidadCeldaModificarCreditosDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCreditosDetallados() {
		return isVisibilidadCeldaActualizarCreditosDetallados;
	}

	public void setIsVisibilidadCeldaActualizarCreditosDetallados(Boolean isVisibilidadCeldaActualizarCreditosDetallados) {
		this.isVisibilidadCeldaActualizarCreditosDetallados = isVisibilidadCeldaActualizarCreditosDetallados;
	}

	public Boolean getIsVisibilidadCeldaEliminarCreditosDetallados() {
		return isVisibilidadCeldaEliminarCreditosDetallados;
	}

	public void setIsVisibilidadCeldaEliminarCreditosDetallados(Boolean isVisibilidadCeldaEliminarCreditosDetallados) {
		this.isVisibilidadCeldaEliminarCreditosDetallados = isVisibilidadCeldaEliminarCreditosDetallados;
	}

	public Boolean getIsVisibilidadCeldaCancelarCreditosDetallados() {
		return isVisibilidadCeldaCancelarCreditosDetallados;
	}

	public void setIsVisibilidadCeldaCancelarCreditosDetallados(Boolean isVisibilidadCeldaCancelarCreditosDetallados) {
		this.isVisibilidadCeldaCancelarCreditosDetallados = isVisibilidadCeldaCancelarCreditosDetallados;
	}

	public Boolean getIsVisibilidadCeldaGuardarCreditosDetallados() {
		return isVisibilidadCeldaGuardarCreditosDetallados;
	}

	public void setIsVisibilidadCeldaGuardarCreditosDetallados(Boolean isVisibilidadCeldaGuardarCreditosDetallados) {
		this.isVisibilidadCeldaGuardarCreditosDetallados = isVisibilidadCeldaGuardarCreditosDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCreditosDetallados() {
		return isVisibilidadCeldaGuardarCambiosCreditosDetallados;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCreditosDetallados(Boolean isVisibilidadCeldaGuardarCambiosCreditosDetallados) {
		this.isVisibilidadCeldaGuardarCambiosCreditosDetallados = isVisibilidadCeldaGuardarCambiosCreditosDetallados;
	}
		
	public CreditosDetalladosSessionBean getcreditosdetalladosSessionBean() {
		return this.creditosdetalladosSessionBean;
	}
	
	public void setcreditosdetalladosSessionBean(CreditosDetalladosSessionBean creditosdetalladosSessionBean) {
		this.creditosdetalladosSessionBean=creditosdetalladosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCreditosDetallados() {
		return this.isVisibilidadBusquedaCreditosDetallados;
	}

	public void setisVisibilidadBusquedaCreditosDetallados(Boolean isVisibilidadBusquedaCreditosDetallados) {
		this.isVisibilidadBusquedaCreditosDetallados=isVisibilidadBusquedaCreditosDetallados;
	}

	public Boolean getisVisibilidadFK_IdCargo() {
		return this.isVisibilidadFK_IdCargo;
	}

	public void setisVisibilidadFK_IdCargo(Boolean isVisibilidadFK_IdCargo) {
		this.isVisibilidadFK_IdCargo=isVisibilidadFK_IdCargo;
	}

	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstructura() {
		return this.isVisibilidadFK_IdEstructura;
	}

	public void setisVisibilidadFK_IdEstructura(Boolean isVisibilidadFK_IdEstructura) {
		this.isVisibilidadFK_IdEstructura=isVisibilidadFK_IdEstructura;
	}

	public Boolean getisVisibilidadFK_IdTipoPrestamo() {
		return this.isVisibilidadFK_IdTipoPrestamo;
	}

	public void setisVisibilidadFK_IdTipoPrestamo(Boolean isVisibilidadFK_IdTipoPrestamo) {
		this.isVisibilidadFK_IdTipoPrestamo=isVisibilidadFK_IdTipoPrestamo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(CreditosDetallados creditosdetallados)throws Exception {
		try {
			
				this.setActualParaGuardarCargoForeignKey(creditosdetallados,null);
				this.setActualParaGuardarEstructuraForeignKey(creditosdetallados,null);
				this.setActualParaGuardarEmpresaForeignKey(creditosdetallados,null);
				this.setActualParaGuardarEmpleadoForeignKey(creditosdetallados,null);
				this.setActualParaGuardarTipoPrestamoForeignKey(creditosdetallados,null);
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
	
	public void bugActualizarReferenciaActual(CreditosDetallados creditosdetallados,CreditosDetallados creditosdetalladosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCreditosDetallados(creditosdetallados);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		creditosdetalladosAux.setId(creditosdetallados.getId());
		creditosdetalladosAux.setVersionRow(creditosdetallados.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CreditosDetallados creditosdetalladosLocal) throws Exception {
		
		if(this.creditosdetalladosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CreditosDetallados creditosdetalladosLocal) throws Exception {	
		if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(CargoDetalleFormJInternalFrame.class)) {
				CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrameLocal=(CargoBeanSwingJInternalFrame) ((CargoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cargoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCargo(cargoBeanSwingJInternalFrameLocal.getcargo(),true);
				cargoBeanSwingJInternalFrameLocal.actualizarLista(cargoBeanSwingJInternalFrameLocal.cargo,this.cargosForeignKey);

				cargoBeanSwingJInternalFrameLocal.actualizarRelaciones(cargoBeanSwingJInternalFrameLocal.cargo);

				creditosdetalladosLocal.setCargo(cargoBeanSwingJInternalFrameLocal.cargo);

				this.addItemDefectoCombosForeignKeyCargo();
				this.cargarCombosFrameCargosForeignKey("Formulario");
				this.setActualCargoForeignKey(cargoBeanSwingJInternalFrameLocal.cargo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				creditosdetalladosLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				creditosdetalladosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				creditosdetalladosLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoPrestamoDetalleFormJInternalFrame.class)) {
				TipoPrestamoBeanSwingJInternalFrame tipoprestamoBeanSwingJInternalFrameLocal=(TipoPrestamoBeanSwingJInternalFrame) ((TipoPrestamoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoprestamoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoPrestamo(tipoprestamoBeanSwingJInternalFrameLocal.gettipoprestamo(),true);
				tipoprestamoBeanSwingJInternalFrameLocal.actualizarLista(tipoprestamoBeanSwingJInternalFrameLocal.tipoprestamo,this.tipoprestamosForeignKey);

				tipoprestamoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoprestamoBeanSwingJInternalFrameLocal.tipoprestamo);

				creditosdetalladosLocal.setTipoPrestamo(tipoprestamoBeanSwingJInternalFrameLocal.tipoprestamo);

				this.addItemDefectoCombosForeignKeyTipoPrestamo();
				this.cargarCombosFrameTipoPrestamosForeignKey("Formulario");
				this.setActualTipoPrestamoForeignKey(tipoprestamoBeanSwingJInternalFrameLocal.tipoprestamo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCreditosDetalladosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = creditosdetalladosValidator.getInvalidValues(this.creditosdetallados);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CreditosDetallados creditosdetallados,List<CreditosDetallados> creditosdetalladoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(CreditosDetallados creditosdetallados,List<CreditosDetallados> creditosdetalladoss) throws Exception {
		try	{			
			CreditosDetalladosConstantesFunciones.actualizarSelectedLista(creditosdetallados,creditosdetalladoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CreditosDetallados> creditosdetalladossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				creditosdetalladossLocal=this.creditosdetalladosLogic.getCreditosDetalladoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				creditosdetalladossLocal=this.creditosdetalladoss;
			}
			//ARCHITECTURE
		
			for(CreditosDetallados creditosdetalladosLocal:creditosdetalladossLocal) {
				if(this.permiteMantenimiento(creditosdetalladosLocal) && creditosdetalladosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CreditosDetalladosConstantesFunciones.getCreditosDetalladosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CreditosDetalladosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelcodigoCreditosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosDetalladosConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelnombre_completoCreditosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosDetalladosConstantesFunciones.CODIGOTIPOPRESTAMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelcodigo_tipo_prestamoCreditosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosDetalladosConstantesFunciones.CODIGOPRESTAMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelcodigo_prestamoCreditosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosDetalladosConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelfechaCreditosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosDetalladosConstantesFunciones.MONTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelmontoCreditosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosDetalladosConstantesFunciones.NUMEROCUOTAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelnumero_cuotasCreditosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosDetalladosConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelnumeroCreditosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosDetalladosConstantesFunciones.MONTOCAPITAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelmonto_capitalCreditosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosDetalladosConstantesFunciones.MONTOINTERES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelmonto_interesCreditosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosDetalladosConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelvalorCreditosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosDetalladosConstantesFunciones.SALDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelsaldoCreditosDetallados,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosDetallados.jLabelcodigoCreditosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosDetallados.jLabelnombre_completoCreditosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosDetallados.jLabelcodigo_tipo_prestamoCreditosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosDetallados.jLabelcodigo_prestamoCreditosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosDetallados.jLabelfechaCreditosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosDetallados.jLabelmontoCreditosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosDetallados.jLabelnumero_cuotasCreditosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosDetallados.jLabelnumeroCreditosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosDetallados.jLabelmonto_capitalCreditosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosDetallados.jLabelmonto_interesCreditosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosDetallados.jLabelvalorCreditosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosDetallados.jLabelsaldoCreditosDetallados,"");
		
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
		this.iIdNuevoCreditosDetallados--;	
		
		
		this.creditosdetalladosAux=new CreditosDetallados();
		
		this.creditosdetalladosAux.setId(this.iIdNuevoCreditosDetallados);
		this.creditosdetalladosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.creditosdetalladosLogic.getCreditosDetalladoss().add(this.creditosdetalladosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.creditosdetalladoss.add(this.creditosdetalladosAux);
		}
		//ARCHITECTURE
		
		this.creditosdetallados=this.creditosdetalladosAux;
		
		if(CreditosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCreditosDetallados(this.creditosdetallados);
			this.setVariablesObjetoActualToFormularioForeignKeyCreditosDetallados(this.creditosdetallados);
		}
				
		//this.setDefaultControlesCreditosDetallados();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCreditosDetallados();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCreditosDetallados();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCreditosDetallados();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCreditosDetallados(this.creditosdetalladosBean,this.creditosdetallados,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCreditosDetallados(this.creditosdetalladosReturnGeneral,this.creditosdetalladosBean,false);
		
		if(this.creditosdetalladosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCreditosDetallados(this.creditosdetalladosReturnGeneral.getCreditosDetallados());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCreditosDetallados(this.creditosdetalladosReturnGeneral.getCreditosDetallados());
		}
		
		if(this.creditosdetalladosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCreditosDetallados(this.creditosdetalladosReturnGeneral.getCreditosDetallados(),classes);//this.creditosdetalladosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCreditosDetallados();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCreditosDetallados();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CreditosDetalladosBeanSwingJInternalFrameAdditional.RecargarFormCreditosDetallados(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCreditosDetallados(false);
						
			if(creditosdetalladosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCreditosDetallados();
			}
			
			this.actualizarVisualTableDatosCreditosDetallados();
			
			this.jTableDatosCreditosDetallados.setRowSelectionInterval(this.getIndiceNuevoCreditosDetallados(), this.getIndiceNuevoCreditosDetallados());
			
			this.seleccionarFilaTablaCreditosDetalladosActual();
						
			this.actualizarEstadoCeldasBotonesCreditosDetallados("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCreditosDetallados(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCreditosDetallados.jDateChooserfecha_vencimiento_desdeCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarfecha_vencimiento_desdeCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jDateChooserfecha_vencimiento_hastaCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarfecha_vencimiento_hastaCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigoCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarcodigoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextAreanombre_completoCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarnombre_completoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigo_tipo_prestamoCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarcodigo_tipo_prestamoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigo_prestamoCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarcodigo_prestamoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jDateChooserfechaCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarfechaCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmontoCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarmontoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldnumero_cuotasCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarnumero_cuotasCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldnumeroCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarnumeroCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmonto_capitalCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarmonto_capitalCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmonto_interesCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarmonto_interesCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldvalorCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarvalorCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldsaldoCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarsaldoCreditosDetallados);	
		
		this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_cargoCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarid_cargoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_estructuraCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarid_estructuraCreditosDetallados);//
		this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empresaCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarid_empresaCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empleadoCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarid_empleadoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_tipo_prestamoCreditosDetallados.setEnabled(isHabilitar && this.creditosdetalladosConstantesFunciones.activarid_tipo_prestamoCreditosDetallados);
	};
	
	public void setDefaultControlesCreditosDetallados() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCreditosDetallados(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.creditosdetalladosSessionBean.setConGuardarRelaciones(true);			
			this.creditosdetalladosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCreditosDetallados.jTabbedPaneRelacionesCreditosDetallados.setVisible(true);
			
					
		} else {
			//this.creditosdetalladosSessionBean.setConGuardarRelaciones(false);			
			this.creditosdetalladosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCreditosDetallados.jTabbedPaneRelacionesCreditosDetallados.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCreditosDetallados() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CreditosDetallados creditosdetalladosAux:this.creditosdetalladosLogic.getCreditosDetalladoss()) {
				if(creditosdetalladosAux.getId().equals(this.iIdNuevoCreditosDetallados)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CreditosDetallados creditosdetalladosAux:this.creditosdetalladoss) {
				if(creditosdetalladosAux.getId().equals(this.iIdNuevoCreditosDetallados)) {
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
	
	public int getIndiceActualCreditosDetallados(CreditosDetallados creditosdetallados,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CreditosDetallados creditosdetalladosAux:this.creditosdetalladosLogic.getCreditosDetalladoss()) {
				if(creditosdetalladosAux.getId().equals(creditosdetallados.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CreditosDetallados creditosdetalladosAux:this.creditosdetalladoss) {
				if(creditosdetalladosAux.getId().equals(creditosdetallados.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCreditosDetallados(CreditosDetallados creditosdetalladosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CreditosDetallados creditosdetalladosAux:this.creditosdetalladosLogic.getCreditosDetalladoss()) {
				if(creditosdetalladosAux.getCreditosDetalladosOriginal().getId().equals(creditosdetalladosOriginal.getId())) {
					existe=true;
					creditosdetalladosOriginal.setId(creditosdetalladosAux.getId());
					creditosdetalladosOriginal.setVersionRow(creditosdetalladosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CreditosDetallados creditosdetalladosAux:this.creditosdetalladoss) {
				if(creditosdetalladosAux.getCreditosDetalladosOriginal().getId().equals(creditosdetalladosOriginal.getId())) {
					existe=true;
					creditosdetalladosOriginal.setId(creditosdetalladosAux.getId());
					creditosdetalladosOriginal.setVersionRow(creditosdetalladosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCreditosDetallados(Boolean esParaCancelar) throws Exception {
		creditosdetalladossAux=new ArrayList<CreditosDetallados>();
		creditosdetalladosAux=new CreditosDetallados();
		
		if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CreditosDetallados creditosdetalladosAux:this.creditosdetalladosLogic.getCreditosDetalladoss()) {
					if(creditosdetalladosAux.getId()<0) {
						creditosdetalladossAux.add(creditosdetalladosAux);
					}		
				}
				this.iIdNuevoCreditosDetallados=0L;
				this.creditosdetalladosLogic.getCreditosDetalladoss().removeAll(creditosdetalladossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CreditosDetallados creditosdetalladosAux:this.creditosdetalladoss) {
					if(creditosdetalladosAux.getId()<0) {
						creditosdetalladossAux.add(creditosdetalladosAux);
					}		
				}
				this.iIdNuevoCreditosDetallados=0L;
				this.creditosdetalladoss.removeAll(creditosdetalladossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCreditosDetallados 
					&& this.creditosdetalladosLogic.getCreditosDetalladoss().size()>0
					) {
					creditosdetalladosAux=this.creditosdetalladosLogic.getCreditosDetalladoss().get(this.creditosdetalladosLogic.getCreditosDetalladoss().size() - 1);
				
					if(creditosdetalladosAux.getId()<0) {
						this.creditosdetalladosLogic.getCreditosDetalladoss().remove(creditosdetalladosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCreditosDetallados && this.creditosdetalladoss.size()>0) {
					creditosdetalladosAux=this.creditosdetalladoss.get(this.creditosdetalladoss.size() - 1);
				
					if(creditosdetalladosAux.getId()<0) {
						this.creditosdetalladoss.remove(creditosdetalladosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCreditosDetallados(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(creditosdetallados.getId()<0) {
				this.creditosdetalladosLogic.getCreditosDetalladoss().remove(this.creditosdetallados);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(creditosdetallados.getId()<0) {
				this.creditosdetalladoss.remove(this.creditosdetallados);
			}
		}			
	}
	
	public void setEstadosInicialesCreditosDetallados(List<CreditosDetallados> creditosdetalladossAux) throws Exception {
		CreditosDetalladosConstantesFunciones.setEstadosInicialesCreditosDetallados(creditosdetalladossAux);
	}
	
	public void setEstadosInicialesCreditosDetallados(CreditosDetallados creditosdetalladosAux) throws Exception {
		CreditosDetalladosConstantesFunciones.setEstadosInicialesCreditosDetallados(creditosdetalladosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCreditosDetalladosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCreditosDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCreditosDetalladosActual()) {
				if(!this.isEsNuevoCreditosDetallados) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCreditosDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCreditosDetallados=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCreditosDetalladosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Creditos Detallados ?", "MANTENIMIENTO DE Creditos Detallados", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCreditosDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CreditosDetallados creditosdetallados) throws Exception {
		CreditosDetalladosConstantesFunciones.seleccionarAsignar(this.creditosdetallados,creditosdetallados);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCreditosDetallados=this.isPermisoActualizarOriginalCreditosDetallados;
			
			
			this.seleccionarAsignar(creditosdetallados);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCreditosDetallados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.creditosdetalladosSessionBean.setsFuncionBusquedaRapida(this.creditosdetalladosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCreditosDetallados) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCreditosDetallados(esParaCancelar);				
				this.cancelarNuevoCreditosDetallados(esParaCancelar);								
			}
			
			this.creditosdetallados=new CreditosDetallados();
			
			this.inicializarCreditosDetallados();
			
			this.actualizarEstadoCeldasBotonesCreditosDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCreditosDetallados() throws Exception {
		try {
			CreditosDetalladosConstantesFunciones.inicializarCreditosDetallados(this.creditosdetallados);
			
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
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.creditosdetalladosLogic.getCreditosDetalladoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCreditosDetalladoss(String sAccionBusqueda,List<CreditosDetallados> creditosdetalladossParaReportes) throws Exception {
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
					sPathReporteFinal="CreditosDetallados"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CreditosDetalladosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CreditosDetalladosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CreditosDetallados"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Creditos Detalladoses");		
		parameters.put("busquedapor", CreditosDetalladosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCreditosDetallados=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CreditosDetalladosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CreditosDetalladosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCreditosDetallados=new JRBeanArrayDataSource(CreditosDetalladosJInternalFrame.TraerCreditosDetalladosBeans(creditosdetalladossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCreditosDetallados);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CreditosDetalladosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CreditosDetalladosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CreditosDetalladosBean.TraerCreditosDetalladosBeans(creditosdetalladossParaReportes).toArray()));
							
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
				this.generarExcelReporteCreditosDetalladoss(sAccionBusqueda,sTipoArchivoReporte,creditosdetalladossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCreditosDetalladoss(sAccionBusqueda,sTipoArchivoReporte,creditosdetalladossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCreditosDetalladosActionPerformed(null);
					//this.generarExcelReporteCreditosDetalladoss(sAccionBusqueda,sTipoArchivoReporte,creditosdetalladossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCreditosDetalladoss(sAccionBusqueda,sTipoArchivoReporte,creditosdetalladossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCreditosDetalladoss(sAccionBusqueda,sTipoArchivoReporte,creditosdetalladossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCreditosDetalladoss(sAccionBusqueda,sTipoArchivoReporte,creditosdetalladossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCreditosDetalladoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CreditosDetallados> creditosdetalladossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"creditosdetallados";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CreditosDetalladoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCreditosDetallados("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CreditosDetallados creditosdetallados : creditosdetalladossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CreditosDetalladosConstantesFunciones.generarExcelReporteDataCreditosDetallados("NORMAL",row,workbook,creditosdetallados,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Creditos Detallados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCreditosDetallados(String sTipo,Row row,Workbook workbook) {
		
		CreditosDetalladosConstantesFunciones.generarExcelReporteHeaderCreditosDetallados(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCreditosDetalladoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CreditosDetallados> creditosdetalladossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"creditosdetallados_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CreditosDetalladoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CreditosDetallados creditosdetallados : creditosdetalladossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CreditosDetalladosConstantesFunciones.getCreditosDetalladosDescripcion(creditosdetallados));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_IDCARGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_IDCARGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getcargo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_IDTIPOPRESTAMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_IDTIPOPRESTAMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.gettipoprestamo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getfecha_vencimiento_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getfecha_vencimiento_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getcodigo_tipo_prestamo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getcodigo_prestamo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_MONTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_MONTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getmonto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getnumero_cuotas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_MONTOCAPITAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_MONTOCAPITAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getmonto_capital());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_MONTOINTERES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_MONTOINTERES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getmonto_interes());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosDetalladosConstantesFunciones.LABEL_SALDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_SALDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditosdetallados.getsaldo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Creditos Detallados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCreditosDetalladoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CreditosDetallados> creditosdetalladossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CreditosDetallados> creditosdetalladossRespaldo=null;
		
		classes=CreditosDetalladosConstantesFunciones.getClassesRelationshipsOfCreditosDetallados(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.creditosdetalladosLogic.setDatosCliente(this.datosCliente);
		this.creditosdetalladosLogic.setDatosDeep(this.datosDeep);
		this.creditosdetalladosLogic.setIsConDeep(true);
		
		creditosdetalladossRespaldo=this.creditosdetalladosLogic.getCreditosDetalladoss();
		
		this.creditosdetalladosLogic.setCreditosDetalladoss(creditosdetalladossParaReportes);	
		this.creditosdetalladosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		creditosdetalladossParaReportes=this.creditosdetalladosLogic.getCreditosDetalladoss();
		this.creditosdetalladosLogic.setCreditosDetalladoss(creditosdetalladossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"creditosdetallados_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CreditosDetalladoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCreditosDetallados("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CreditosDetallados creditosdetallados : creditosdetalladossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCreditosDetallados("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CreditosDetalladosConstantesFunciones.generarExcelReporteDataCreditosDetallados("NORMAL",row,workbook,creditosdetallados,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CreditosDetalladosConstantesFunciones.getCreditosDetalladosDescripcion(creditosdetallados));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Creditos Detallados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCreditosDetallados.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCreditosDetallados.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCreditosDetallados.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCreditosDetallados.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCreditosDetallados() throws Exception {		
		this.startProcessCreditosDetallados(true);
	}
	
	public void startProcessCreditosDetallados(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCreditosDetallados ,this.jPanelParametrosReportesCreditosDetallados, this.jScrollPanelDatosCreditosDetallados,this.jPanelPaginacionCreditosDetallados, this.jScrollPanelDatosEdicionCreditosDetallados, this.jPanelAccionesCreditosDetallados,this.jPanelAccionesFormularioCreditosDetallados,this.jmenuBarCreditosDetallados,this.jmenuBarDetalleCreditosDetallados,this.jTtoolBarCreditosDetallados,this.jTtoolBarDetalleCreditosDetallados);		
		
		final JTabbedPane jTabbedPaneBusquedasCreditosDetallados=this.jTabbedPaneBusquedasCreditosDetallados; 
		
		final JPanel jPanelParametrosReportesCreditosDetallados=this.jPanelParametrosReportesCreditosDetallados;
		//final JScrollPane jScrollPanelDatosCreditosDetallados=this.jScrollPanelDatosCreditosDetallados;
		final JTable jTableDatosCreditosDetallados=this.jTableDatosCreditosDetallados;		
		final JPanel jPanelPaginacionCreditosDetallados=this.jPanelPaginacionCreditosDetallados;
		//final JScrollPane jScrollPanelDatosEdicionCreditosDetallados=this.jScrollPanelDatosEdicionCreditosDetallados;
		final JPanel jPanelAccionesCreditosDetallados=this.jPanelAccionesCreditosDetallados;
		
		JPanel jPanelCamposAuxiliarCreditosDetallados=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCreditosDetallados=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
			jPanelCamposAuxiliarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jPanelCamposCreditosDetallados;
			jPanelAccionesFormularioAuxiliarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jPanelAccionesFormularioCreditosDetallados;
		}
		
		final JPanel jPanelCamposCreditosDetallados=jPanelCamposAuxiliarCreditosDetallados;
		final JPanel jPanelAccionesFormularioCreditosDetallados=jPanelAccionesFormularioAuxiliarCreditosDetallados;
		
		
		final JMenuBar jmenuBarCreditosDetallados=this.jmenuBarCreditosDetallados;
		final JToolBar jTtoolBarCreditosDetallados=this.jTtoolBarCreditosDetallados;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCreditosDetallados=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCreditosDetallados=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
			jmenuBarDetalleAuxiliarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jmenuBarDetalleCreditosDetallados;
			jTtoolBarDetalleAuxiliarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jTtoolBarDetalleCreditosDetallados;
		}
		
		final JMenuBar jmenuBarDetalleCreditosDetallados=jmenuBarDetalleAuxiliarCreditosDetallados;
		final JToolBar jTtoolBarDetalleCreditosDetallados=jTtoolBarDetalleAuxiliarCreditosDetallados;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCreditosDetallados;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCreditosDetallados;
			processRunnable.jTableDatos=jTableDatosCreditosDetallados;
			processRunnable.jPanelCampos=jPanelCamposCreditosDetallados;
			processRunnable.jPanelPaginacion=jPanelPaginacionCreditosDetallados;
			processRunnable.jPanelAcciones=jPanelAccionesCreditosDetallados;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCreditosDetallados;
			
			
			processRunnable.jmenuBar=jmenuBarCreditosDetallados;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCreditosDetallados;
			processRunnable.jTtoolBar=jTtoolBarCreditosDetallados;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCreditosDetallados;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCreditosDetallados ,jPanelParametrosReportesCreditosDetallados,jTableDatosCreditosDetallados, /*jScrollPanelDatosCreditosDetallados,*/jPanelCamposCreditosDetallados,jPanelPaginacionCreditosDetallados, /*jScrollPanelDatosEdicionCreditosDetallados,*/ jPanelAccionesCreditosDetallados,jPanelAccionesFormularioCreditosDetallados,jmenuBarCreditosDetallados,jmenuBarDetalleCreditosDetallados,jTtoolBarCreditosDetallados,jTtoolBarDetalleCreditosDetallados);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCreditosDetallados ,jPanelParametrosReportesCreditosDetallados, jScrollPanelDatosCreditosDetallados,jPanelPaginacionCreditosDetallados, jScrollPanelDatosEdicionCreditosDetallados, jPanelAccionesCreditosDetallados,jPanelAccionesFormularioCreditosDetallados,jmenuBarCreditosDetallados,jmenuBarDetalleCreditosDetallados,jTtoolBarCreditosDetallados,jTtoolBarDetalleCreditosDetallados);
						
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
	
	public void finishProcessCreditosDetallados() {// throws Exception 
		this.finishProcessCreditosDetallados(true);
	}
	
	public void finishProcessCreditosDetallados(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCreditosDetallados ,this.jPanelParametrosReportesCreditosDetallados, this.jScrollPanelDatosCreditosDetallados,this.jPanelPaginacionCreditosDetallados, this.jScrollPanelDatosEdicionCreditosDetallados, this.jPanelAccionesCreditosDetallados,this.jPanelAccionesFormularioCreditosDetallados,this.jmenuBarCreditosDetallados,this.jmenuBarDetalleCreditosDetallados,this.jTtoolBarCreditosDetallados,this.jTtoolBarDetalleCreditosDetallados);		
		
		final JTabbedPane jTabbedPaneBusquedasCreditosDetallados=this.jTabbedPaneBusquedasCreditosDetallados; 
		
		final JPanel jPanelParametrosReportesCreditosDetallados=this.jPanelParametrosReportesCreditosDetallados;
		//final JScrollPane jScrollPanelDatosCreditosDetallados=this.jScrollPanelDatosCreditosDetallados;
		final JTable jTableDatosCreditosDetallados=this.jTableDatosCreditosDetallados;		
		final JPanel jPanelPaginacionCreditosDetallados=this.jPanelPaginacionCreditosDetallados;
		//final JScrollPane jScrollPanelDatosEdicionCreditosDetallados=this.jScrollPanelDatosEdicionCreditosDetallados;
		final JPanel jPanelAccionesCreditosDetallados=this.jPanelAccionesCreditosDetallados;
		
		JPanel jPanelCamposAuxiliarCreditosDetallados=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCreditosDetallados=new JPanel();
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
			jPanelCamposAuxiliarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jPanelCamposCreditosDetallados;
			jPanelAccionesFormularioAuxiliarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jPanelAccionesFormularioCreditosDetallados;
		}
		
		final JPanel jPanelCamposCreditosDetallados=jPanelCamposAuxiliarCreditosDetallados;
		final JPanel jPanelAccionesFormularioCreditosDetallados=jPanelAccionesFormularioAuxiliarCreditosDetallados;
		
		
		final JMenuBar jmenuBarCreditosDetallados=this.jmenuBarCreditosDetallados;		
		final JToolBar jTtoolBarCreditosDetallados=this.jTtoolBarCreditosDetallados;
				
		JMenuBar jmenuBarDetalleAuxiliarCreditosDetallados=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCreditosDetallados=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
			jmenuBarDetalleAuxiliarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jmenuBarDetalleCreditosDetallados;
			jTtoolBarDetalleAuxiliarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jTtoolBarDetalleCreditosDetallados;		
		}
		
		final JMenuBar jmenuBarDetalleCreditosDetallados=jmenuBarDetalleAuxiliarCreditosDetallados;
		final JToolBar jTtoolBarDetalleCreditosDetallados=jTtoolBarDetalleAuxiliarCreditosDetallados;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCreditosDetallados;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCreditosDetallados;
			processRunnable.jTableDatos=jTableDatosCreditosDetallados;
			processRunnable.jPanelCampos=jPanelCamposCreditosDetallados;
			processRunnable.jPanelPaginacion=jPanelPaginacionCreditosDetallados;
			processRunnable.jPanelAcciones=jPanelAccionesCreditosDetallados;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCreditosDetallados;
			
			
			processRunnable.jmenuBar=jmenuBarCreditosDetallados;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCreditosDetallados;
			processRunnable.jTtoolBar=jTtoolBarCreditosDetallados;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCreditosDetallados;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCreditosDetallados ,jPanelParametrosReportesCreditosDetallados, jTableDatosCreditosDetallados,/*jScrollPanelDatosCreditosDetallados,*/jPanelCamposCreditosDetallados,jPanelPaginacionCreditosDetallados, /*jScrollPanelDatosEdicionCreditosDetallados,*/ jPanelAccionesCreditosDetallados,jPanelAccionesFormularioCreditosDetallados,jmenuBarCreditosDetallados,jmenuBarDetalleCreditosDetallados,jTtoolBarCreditosDetallados,jTtoolBarDetalleCreditosDetallados));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCreditosDetallados(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCreditosDetallados(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCreditosDetallados(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCreditosDetallados(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCreditosDetallados,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCreditosDetallados,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCreditosDetallados(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCreditosDetallados,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCreditosDetallados,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.creditosdetalladosConstantesFunciones.getsFinalQueryCreditosDetallados();
		String  finalQueryPaginacionTodos=this.creditosdetalladosConstantesFunciones.getsFinalQueryCreditosDetallados();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CreditosDetalladosConstantesFunciones.getArrayColumnasGlobalesNoCreditosDetallados(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CreditosDetalladosConstantesFunciones.getArrayColumnasGlobalesCreditosDetallados(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CreditosDetalladosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.creditosdetalladossEliminados= new ArrayList<CreditosDetallados>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCreditosDetallados();
		
				///*CreditosDetalladosSessionBean*/this.creditosdetalladosSessionBean=new CreditosDetalladosSessionBean();
			
			if(this.creditosdetalladosSessionBean==null) {
				this.creditosdetalladosSessionBean=new CreditosDetalladosSessionBean();
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
					this.iNumeroPaginacion=CreditosDetalladosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CreditosDetalladosConstantesFunciones.getClassesForeignKeysOfCreditosDetallados(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/creditosdetallados."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			creditosdetalladossAux= new ArrayList<CreditosDetallados>();
			
				
			creditosdetalladosLogic.setDatosCliente(this.datosCliente);
			creditosdetalladosLogic.setDatosDeep(this.datosDeep);
			creditosdetalladosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCreditosDetallados")) {
				this.sDetalleReporte=CreditosDetalladosConstantesFunciones.getDetalleIndiceBusquedaCreditosDetallados(id_cargoBusquedaCreditosDetallados,id_estructuraBusquedaCreditosDetallados,id_empleadoBusquedaCreditosDetallados,id_tipo_prestamoBusquedaCreditosDetallados,fecha_vencimiento_desdeBusquedaCreditosDetallados,fecha_vencimiento_hastaBusquedaCreditosDetallados);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					creditosdetalladosLogic.getCreditosDetalladossBusquedaCreditosDetallados(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_cargoBusquedaCreditosDetallados,id_estructuraBusquedaCreditosDetallados,id_empleadoBusquedaCreditosDetallados,id_tipo_prestamoBusquedaCreditosDetallados,fecha_vencimiento_desdeBusquedaCreditosDetallados,fecha_vencimiento_hastaBusquedaCreditosDetallados);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CreditosDetalladosConstantesFunciones.getDetalleIndiceBusquedaCreditosDetallados(id_cargoBusquedaCreditosDetallados,id_estructuraBusquedaCreditosDetallados,id_empleadoBusquedaCreditosDetallados,id_tipo_prestamoBusquedaCreditosDetallados,fecha_vencimiento_desdeBusquedaCreditosDetallados,fecha_vencimiento_hastaBusquedaCreditosDetallados);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CreditosDetalladosConstantesFunciones.getDetalleIndiceBusquedaCreditosDetallados(id_cargoBusquedaCreditosDetallados,id_estructuraBusquedaCreditosDetallados,id_empleadoBusquedaCreditosDetallados,id_tipo_prestamoBusquedaCreditosDetallados,fecha_vencimiento_desdeBusquedaCreditosDetallados,fecha_vencimiento_hastaBusquedaCreditosDetallados);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=creditosdetalladosLogic.getCreditosDetalladoss()==null||creditosdetalladosLogic.getCreditosDetalladoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=creditosdetalladoss==null|| creditosdetalladoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						creditosdetalladossAux=new ArrayList<CreditosDetallados>();
						creditosdetalladossAux.addAll(creditosdetalladosLogic.getCreditosDetalladoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							creditosdetalladossAux=new ArrayList<CreditosDetallados>();
							creditosdetalladossAux.addAll(creditosdetalladoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							creditosdetalladosLogic.getCreditosDetalladossBusquedaCreditosDetallados(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_cargoBusquedaCreditosDetallados,id_estructuraBusquedaCreditosDetallados,id_empleadoBusquedaCreditosDetallados,id_tipo_prestamoBusquedaCreditosDetallados,fecha_vencimiento_desdeBusquedaCreditosDetallados,fecha_vencimiento_hastaBusquedaCreditosDetallados);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CreditosDetalladosConstantesFunciones.getDetalleIndiceBusquedaCreditosDetallados(id_cargoBusquedaCreditosDetallados,id_estructuraBusquedaCreditosDetallados,id_empleadoBusquedaCreditosDetallados,id_tipo_prestamoBusquedaCreditosDetallados,fecha_vencimiento_desdeBusquedaCreditosDetallados,fecha_vencimiento_hastaBusquedaCreditosDetallados);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CreditosDetalladosConstantesFunciones.getDetalleIndiceBusquedaCreditosDetallados(id_cargoBusquedaCreditosDetallados,id_estructuraBusquedaCreditosDetallados,id_empleadoBusquedaCreditosDetallados,id_tipo_prestamoBusquedaCreditosDetallados,fecha_vencimiento_desdeBusquedaCreditosDetallados,fecha_vencimiento_hastaBusquedaCreditosDetallados);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCreditosDetalladoss("BusquedaCreditosDetallados",creditosdetalladosLogic.getCreditosDetalladoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCreditosDetalladoss("BusquedaCreditosDetallados",creditosdetalladoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						creditosdetalladosLogic.setCreditosDetalladoss(new ArrayList<CreditosDetallados>());
						creditosdetalladosLogic.getCreditosDetalladoss().addAll(creditosdetalladossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							creditosdetalladoss=new ArrayList<CreditosDetallados>();
							creditosdetalladoss.addAll(creditosdetalladossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCreditosDetallados();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCreditosDetallados();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=creditosdetalladosLogic.getCreditosDetalladoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=creditosdetalladoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=creditosdetalladosLogic.getCreditosDetalladoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=creditosdetalladoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CreditosDetallados creditosdetallados) {
		Boolean permite=true;
		
		if(this.creditosdetallados.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CreditosDetalladosConstantesFunciones.getOrderByListaCreditosDetallados();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CreditosDetalladosConstantesFunciones.getOrderByListaCreditosDetallados();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CreditosDetallados creditosdetallados:creditosdetalladosLogic.getCreditosDetalladoss()) {
				if(creditosdetallados.getsType().equals(Constantes2.S_TOTALES)) {
					creditosdetalladosTotales=creditosdetallados;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CreditosDetallados creditosdetallados:this.creditosdetalladoss) {
				if(creditosdetallados.getsType().equals(Constantes2.S_TOTALES)) {
					creditosdetalladosTotales=creditosdetallados;
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
			this.creditosdetalladosAux=new CreditosDetallados();
			this.creditosdetalladosAux.setsType(Constantes2.S_TOTALES);
			this.creditosdetalladosAux.setIsNew(false);
			this.creditosdetalladosAux.setIsChanged(false);
			this.creditosdetalladosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CreditosDetalladosConstantesFunciones.TotalizarValoresFilaCreditosDetallados(this.creditosdetalladosLogic.getCreditosDetalladoss(),this.creditosdetalladosAux);
				
				//this.creditosdetalladosLogic.getCreditosDetalladoss().add(this.creditosdetalladosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CreditosDetalladosConstantesFunciones.TotalizarValoresFilaCreditosDetallados(this.creditosdetalladoss,this.creditosdetalladosAux);
				
				this.creditosdetalladoss.add(this.creditosdetalladosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		creditosdetalladosTotales=new CreditosDetallados();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.creditosdetalladosLogic.getCreditosDetalladoss().remove(creditosdetalladosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.creditosdetalladoss.remove(creditosdetalladosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		creditosdetalladosTotales=new CreditosDetallados();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CreditosDetallados creditosdetallados:creditosdetalladosLogic.getCreditosDetalladoss()) {
				if(creditosdetallados.getsType().equals(Constantes2.S_TOTALES)) {
					creditosdetalladosTotales=creditosdetallados;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CreditosDetalladosConstantesFunciones.TotalizarValoresFilaCreditosDetallados(this.creditosdetalladosLogic.getCreditosDetalladoss(),creditosdetalladosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CreditosDetallados creditosdetallados:this.creditosdetalladoss) {
				if(creditosdetallados.getsType().equals(Constantes2.S_TOTALES)) {
					creditosdetalladosTotales=creditosdetallados;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CreditosDetalladosConstantesFunciones.TotalizarValoresFilaCreditosDetallados(this.creditosdetalladoss,creditosdetalladosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCreditosDetalladossBusquedaCreditosDetallados()throws Exception {
		try {
			sAccionBusqueda="BusquedaCreditosDetallados";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCreditosDetalladossFK_IdCargo()throws Exception {
		try {
			sAccionBusqueda="FK_IdCargo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCreditosDetalladossFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCreditosDetalladossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCreditosDetalladossFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCreditosDetalladossFK_IdTipoPrestamo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoPrestamo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCreditosDetalladossBusquedaCreditosDetallados(String sFinalQuery,Long id_cargo,Long id_estructura,Long id_empleado,Long id_tipo_prestamo,Date fecha_vencimiento_desde,Date fecha_vencimiento_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//creditosdetalladosLogic.getCreditosDetalladossBusquedaCreditosDetallados(sFinalQuery,this.pagination,id_cargo,id_estructura,id_empleado,id_tipo_prestamo,fecha_vencimiento_desde,fecha_vencimiento_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCreditosDetalladossFK_IdCargo(String sFinalQuery,Long id_cargo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//creditosdetalladosLogic.getCreditosDetalladossFK_IdCargo(sFinalQuery,this.pagination,id_cargo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCreditosDetalladossFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//creditosdetalladosLogic.getCreditosDetalladossFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCreditosDetalladossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//creditosdetalladosLogic.getCreditosDetalladossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCreditosDetalladossFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//creditosdetalladosLogic.getCreditosDetalladossFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCreditosDetalladossFK_IdTipoPrestamo(String sFinalQuery,Long id_tipo_prestamo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//creditosdetalladosLogic.getCreditosDetalladossFK_IdTipoPrestamo(sFinalQuery,this.pagination,id_tipo_prestamo);
				
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
	
	public void inicializarPermisosCreditosDetallados() {
		this.isPermisoTodoCreditosDetallados=false;
		this.isPermisoNuevoCreditosDetallados=false;
		this.isPermisoActualizarCreditosDetallados=false;
		this.isPermisoActualizarOriginalCreditosDetallados=false;
		this.isPermisoEliminarCreditosDetallados=false;
		this.isPermisoGuardarCambiosCreditosDetallados=false;
		this.isPermisoConsultaCreditosDetallados=true;
		this.isPermisoBusquedaCreditosDetallados=true;
		this.isPermisoReporteCreditosDetallados=true;
		this.isPermisoOrdenCreditosDetallados=false;		
		this.isPermisoPaginacionMedioCreditosDetallados=false;		
		this.isPermisoPaginacionAltoCreditosDetallados=false;		
		this.isPermisoPaginacionTodoCreditosDetallados=false;		
		this.isPermisoCopiarCreditosDetallados=false;		
		this.isPermisoVerFormCreditosDetallados=false;		
		this.isPermisoDuplicarCreditosDetallados=false;
		this.isPermisoOrdenCreditosDetallados=false;
	}
	
	public void setPermisosUsuarioCreditosDetallados(Boolean isPermiso) {
		this.isPermisoTodoCreditosDetallados=isPermiso;
		this.isPermisoNuevoCreditosDetallados=isPermiso;
		this.isPermisoActualizarCreditosDetallados=isPermiso;
		this.isPermisoActualizarOriginalCreditosDetallados=isPermiso;
		this.isPermisoEliminarCreditosDetallados=isPermiso;
		this.isPermisoGuardarCambiosCreditosDetallados=isPermiso;
		this.isPermisoConsultaCreditosDetallados=isPermiso;
		this.isPermisoBusquedaCreditosDetallados=isPermiso;
		this.isPermisoReporteCreditosDetallados=isPermiso;
		this.isPermisoOrdenCreditosDetallados=isPermiso;		
		this.isPermisoPaginacionMedioCreditosDetallados=isPermiso;		
		this.isPermisoPaginacionAltoCreditosDetallados=isPermiso;		
		this.isPermisoPaginacionTodoCreditosDetallados=isPermiso;		
		this.isPermisoCopiarCreditosDetallados=isPermiso;		
		this.isPermisoVerFormCreditosDetallados=isPermiso;		
		this.isPermisoDuplicarCreditosDetallados=isPermiso;
		this.isPermisoOrdenCreditosDetallados=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCreditosDetallados(Boolean isPermiso) {
		//this.isPermisoTodoCreditosDetallados=isPermiso;
		this.isPermisoNuevoCreditosDetallados=isPermiso;
		this.isPermisoActualizarCreditosDetallados=isPermiso;
		this.isPermisoActualizarOriginalCreditosDetallados=isPermiso;
		this.isPermisoEliminarCreditosDetallados=isPermiso;
		this.isPermisoGuardarCambiosCreditosDetallados=isPermiso;
		//this.isPermisoConsultaCreditosDetallados=isPermiso;
		//this.isPermisoBusquedaCreditosDetallados=isPermiso;
		//this.isPermisoReporteCreditosDetallados=isPermiso;
		//this.isPermisoOrdenCreditosDetallados=isPermiso;		
		//this.isPermisoPaginacionMedioCreditosDetallados=isPermiso;		
		//this.isPermisoPaginacionAltoCreditosDetallados=isPermiso;		
		//this.isPermisoPaginacionTodoCreditosDetallados=isPermiso;		
		//this.isPermisoCopiarCreditosDetallados=isPermiso;		
		//this.isPermisoDuplicarCreditosDetallados=isPermiso;
		//this.isPermisoOrdenCreditosDetallados=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCreditosDetalladosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CreditosDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCreditosDetallados(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCreditosDetalladosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCreditosDetalladosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCreditosDetalladosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCreditosDetalladosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCreditosDetallados() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CreditosDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CreditosDetalladosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCreditosDetallados=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCreditosDetallados=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCreditosDetallados=this.isPermisoActualizarCreditosDetallados;
			this.isPermisoEliminarCreditosDetallados=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCreditosDetallados=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCreditosDetallados=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCreditosDetallados=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCreditosDetallados=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCreditosDetallados=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCreditosDetallados=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCreditosDetallados=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCreditosDetallados=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCreditosDetallados=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCreditosDetallados=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCreditosDetallados=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCreditosDetallados=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCreditosDetallados=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCreditosDetallados.setToolTipText(this.jTableDatosCreditosDetallados.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCreditosDetallados(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCreditosDetallados(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CreditosDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CreditosDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCreditosDetallados() throws Exception {
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
	public void inicializarCombosForeignKeyCreditosDetalladosListas()throws Exception {
		try	{						
			
				this.cargosForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.tipoprestamosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCreditosDetalladosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CreditosDetalladosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyCargoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoPrestamoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyCargoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cargosForeignKey==null||this.cargosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CargoConstantesFunciones.getArrayColumnasGlobalesCargo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CargoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CargoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCargosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstructuraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstructuraConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoPrestamoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoprestamosForeignKey==null||this.tipoprestamosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoPrestamoConstantesFunciones.getArrayColumnasGlobalesTipoPrestamo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPrestamoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoPrestamoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoPrestamosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyCreditosDetallados()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCargo();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyTipoPrestamo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCargo()throws Exception {
		try {
			if(this.creditosdetalladosSessionBean==null) {
				this.creditosdetalladosSessionBean=new CreditosDetalladosSessionBean();
			}

			if(!this.creditosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionCargo()) {
				Cargo cargo=new Cargo();
				CargoConstantesFunciones.setCargoDescripcion(cargo,Constantes.SMENSAJE_ESCOJA_OPCION);
				cargo.setId(null);

				if(!CargoConstantesFunciones.ExisteEnLista(this.cargosForeignKey,cargo,true)) {

					this.cargosForeignKey.add(0,cargo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.creditosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				Estructura estructura=new Estructura();
				EstructuraConstantesFunciones.setEstructuraDescripcion(estructura,Constantes.SMENSAJE_ESCOJA_OPCION);
				estructura.setId(null);

				if(!EstructuraConstantesFunciones.ExisteEnLista(this.estructurasForeignKey,estructura,true)) {

					this.estructurasForeignKey.add(0,estructura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.creditosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.creditosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				Empleado empleado=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleado.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadosForeignKey,empleado,true)) {

					this.empleadosForeignKey.add(0,empleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoPrestamo()throws Exception {
		try {

			if(!this.creditosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrestamo()) {
				TipoPrestamo tipoprestamo=new TipoPrestamo();
				TipoPrestamoConstantesFunciones.setTipoPrestamoDescripcion(tipoprestamo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoprestamo.setId(null);

				if(!TipoPrestamoConstantesFunciones.ExisteEnLista(this.tipoprestamosForeignKey,tipoprestamo,true)) {

					this.tipoprestamosForeignKey.add(0,tipoprestamo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCreditosDetallados()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCreditosDetallados(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCreditosDetallados()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCreditosDetallados();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCreditosDetallados(CreditosDetallados creditosdetallados)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCreditosDetallados(CreditosDetallados creditosdetallados,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCreditosDetallados()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCreditosDetallados()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCreditosDetallados()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCreditosDetallados()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCreditosDetallados()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCreditosDetallados()throws Exception {
		try {
			

			this.cargarCombosFrameCargosForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameTipoPrestamosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCreditosDetallados(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameCargosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoPrestamosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCreditosDetallados()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_cargoCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_cargoCreditosDetallados.getItemCount()>0) {
				this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_cargoCreditosDetallados.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_estructuraCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_estructuraCreditosDetallados.getItemCount()>0) {
				this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_estructuraCreditosDetallados.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empresaCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empresaCreditosDetallados.getItemCount()>0) {
				this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empresaCreditosDetallados.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empleadoCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empleadoCreditosDetallados.getItemCount()>0) {
				this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empleadoCreditosDetallados.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_tipo_prestamoCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_tipo_prestamoCreditosDetallados.getItemCount()>0) {
				this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_tipo_prestamoCreditosDetallados.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public CreditosDetalladosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CreditosDetalladosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CreditosDetalladosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.creditosdetalladosSessionBean=new CreditosDetalladosSessionBean(); 
		this.creditosdetalladosConstantesFunciones=new CreditosDetalladosConstantesFunciones(); 
		this.creditosdetalladosBean=new CreditosDetallados();//(this.creditosdetalladosConstantesFunciones); 		
		this.creditosdetalladosReturnGeneral=new CreditosDetalladosParameterReturnGeneral(); 
		
		this.creditosdetalladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.creditosdetalladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CreditosDetalladosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CreditosDetalladosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CreditosDetalladosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCreditosDetallados(true);
			
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
			
			this.creditosdetalladosConstantesFunciones=new CreditosDetalladosConstantesFunciones(); 
			this.creditosdetalladosBean=new CreditosDetallados();//this.creditosdetalladosConstantesFunciones); 			
			this.creditosdetalladosReturnGeneral=new CreditosDetalladosParameterReturnGeneral(); 
		
			CreditosDetalladosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Creditos Detallados Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.creditosdetallados=new CreditosDetallados();
			this.creditosdetalladoss = new ArrayList<CreditosDetallados>();
			this.creditosdetalladossAux = new ArrayList<CreditosDetallados>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic=new CreditosDetalladosLogic();
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}
			
			//this.creditosdetalladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.creditosdetalladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCreditosDetallados);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCreditosDetallados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCreditosDetallados);	
					}
					
					if(this.jInternalFrameImportacionCreditosDetallados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCreditosDetallados);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCreditosDetallados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCreditosDetallados);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCreditosDetallados);
				this.jInternalFrameDetalleFormCreditosDetallados.setVisible(false);
				this.jInternalFrameDetalleFormCreditosDetallados.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCreditosDetallados!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCreditosDetallados);
					this.jInternalFrameReporteDinamicoCreditosDetallados.setVisible(false);
					this.jInternalFrameReporteDinamicoCreditosDetallados.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCreditosDetallados!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCreditosDetallados);
					this.jInternalFrameImportacionCreditosDetallados.setVisible(false);
					this.jInternalFrameImportacionCreditosDetallados.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCreditosDetallados!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCreditosDetallados);
					this.jInternalFrameOrderByCreditosDetallados.setVisible(false);
					this.jInternalFrameOrderByCreditosDetallados.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCreditosDetalladosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CreditosDetalladosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.creditosdetalladosReturnGeneral=new CreditosDetalladosParameterReturnGeneral();
			
			this.creditosdetalladosParameterGeneral=new CreditosDetalladosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.creditosdetalladosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CreditosDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CreditosDetalladosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.creditosdetalladosSessionBean.getEsGuardarRelacionado(),this.creditosdetalladosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CreditosDetalladosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.creditosdetalladosSessionBean.getEsGuardarRelacionado(),this.creditosdetalladosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCreditosDetallados=false;
			this.isVisibilidadCeldaDuplicarCreditosDetallados=true;
			this.isVisibilidadCeldaCopiarCreditosDetallados=true;
			this.isVisibilidadCeldaVerFormCreditosDetallados=true;
			this.isVisibilidadCeldaOrdenCreditosDetallados=true;
			this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados=false;
			this.isVisibilidadCeldaModificarCreditosDetallados=false;
			this.isVisibilidadCeldaActualizarCreditosDetallados=false;
			this.isVisibilidadCeldaEliminarCreditosDetallados=false;
			this.isVisibilidadCeldaCancelarCreditosDetallados=false;
			this.isVisibilidadCeldaGuardarCreditosDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCreditosDetallados=false;
			
			
			this.isVisibilidadBusquedaCreditosDetallados=true;
			this.isVisibilidadFK_IdCargo=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdTipoPrestamo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCreditosDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCreditosDetallados();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCreditosDetallados(false);
			
			this.setPermisosUsuarioCreditosDetallados();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado() 
				|| (this.creditosdetalladosSessionBean.getEsGuardarRelacionado() && this.creditosdetalladosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCreditosDetalladosClasesRelacionadas();
			}
			
			if(this.creditosdetalladosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCreditosDetalladosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCreditosDetallados();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCreditosDetallados();
			}
			
			if(!this.isPermisoBusquedaCreditosDetallados) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCreditosDetallados.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CreditosDetalladosConstantesFunciones.getTiposSeleccionarCreditosDetallados());
				
				this.tiposColumnasSelect=CreditosDetalladosConstantesFunciones.getTiposSeleccionarCreditosDetallados(true);
				
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
			//if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCreditosDetallados();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioCreditosDetallados(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioCreditosDetallados(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCreditosDetallados() ;
			
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
			
			this.cargoLogic=new CargoLogic();
			this.estructuraLogic=new EstructuraLogic();
			this.empresaLogic=new EmpresaLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.tipoprestamoLogic=new TipoPrestamoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				creditosdetalladosImplementable= (CreditosDetalladosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CreditosDetalladosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				creditosdetalladosImplementableHome= (CreditosDetalladosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CreditosDetalladosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.creditosdetalladoss= new ArrayList<CreditosDetallados>();
			this.creditosdetalladossEliminados= new ArrayList<CreditosDetallados>();
						
			this.isEsNuevoCreditosDetallados=false;
			this.esParaAccionDesdeFormularioCreditosDetallados=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.cargosForeignKey=new ArrayList<Cargo>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.tipoprestamosForeignKey=new ArrayList<TipoPrestamo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCreditosDetallados(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCreditosDetallados();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CreditosDetalladosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CreditosDetalladosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCreditosDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCreditosDetallados(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCreditosDetallados();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCreditosDetallados();
			}
			
			CreditosDetalladosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCreditosDetallados.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCreditosDetallados.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCreditosDetallados.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCreditosDetallados(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CreditosDetallados: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCreditosDetallados() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCreditosDetallados")) {
				iIndex=this.jInternalFrameDetalleFormCreditosDetallados.jTabbedPaneRelacionesCreditosDetallados.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCreditosDetallados.jTabbedPaneRelacionesCreditosDetallados.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCreditosDetallados();	
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
	
	public void cargarCombosForeignKeyCreditosDetallados(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCreditosDetallados(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCreditosDetallados(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCreditosDetalladosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCreditosDetallados();
		
		this.cargarCombosFrameForeignKeyCreditosDetallados();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCreditosDetallados();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCreditosDetallados();
		}
	}
	
	

	public void cargarCombosForeignKeyCargo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCargoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCargo();
				this.cargarCombosFrameCargosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCargo(this.cargosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstructura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstructura(this.estructurasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleado(this.empleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoPrestamo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoPrestamoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoPrestamo();
				this.cargarCombosFrameTipoPrestamosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoPrestamo(this.tipoprestamosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCreditosDetalladosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.creditosdetalladosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCreditosDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
			
			
			if(jTableDatosCreditosDetallados.getRowCount()>=1) {
				jTableDatosCreditosDetallados.removeRowSelectionInterval(0, jTableDatosCreditosDetallados.getRowCount()-1);						
			}
			
			this.isEsNuevoCreditosDetallados=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCreditosDetallados(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCreditosDetallados(true);			
			//this.creditosdetallados=new CreditosDetallados();
			//this.creditosdetallados.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCreditosDetallados(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCreditosDetallados() ;
			
			if(CreditosDetalladosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCreditosDetallados(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.creditosdetallados);	
			this.actualizarInformacion("INFO_PADRE",false,this.creditosdetallados);				
			
			CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
			
			if(this.creditosdetalladosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CreditosDetallados: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCreditosDetalladosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CreditosDetallados> creditosdetalladossSeleccionados=new ArrayList<CreditosDetallados>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCreditosDetallados.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCreditosDetallados.getSelectedRows().length;			
			}
			
			creditosdetalladossSeleccionados=this.getCreditosDetalladossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCreditosDetallados--;			
				//CreditosDetallados creditosdetalladosAux= new CreditosDetallados();			
				//creditosdetalladosAux.setId(this.iIdNuevoCreditosDetallados);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CreditosDetallados creditosdetalladosOrigen=new CreditosDetallados();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CreditosDetallados creditosdetalladosOrigen : creditosdetalladossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							creditosdetalladosOrigen =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							creditosdetalladosOrigen =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCreditosDetallados();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.creditosdetallados.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCreditosDetallados(creditosdetalladosOrigen,this.creditosdetallados,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.creditosdetalladosLogic.getCreditosDetalladoss().add(this.creditosdetalladosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.creditosdetalladoss.add(this.creditosdetalladosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCreditosDetallados(false);
				
				this.jTableDatosCreditosDetallados.setRowSelectionInterval(this.getIndiceNuevoCreditosDetallados(), this.getIndiceNuevoCreditosDetallados());
				
				int iLastRow =  this.jTableDatosCreditosDetallados.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCreditosDetallados.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCreditosDetallados.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCreditosDetallados(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CreditosDetallados> creditosdetalladossSeleccionados=new ArrayList<CreditosDetallados>();									
		
			CreditosDetallados creditosdetalladosOrigen=new CreditosDetallados();
			CreditosDetallados creditosdetalladosDestino=new CreditosDetallados();
				
			creditosdetalladossSeleccionados=this.getCreditosDetalladossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCreditosDetallados.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || creditosdetalladossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCreditosDetallados.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						creditosdetalladosOrigen =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						creditosdetalladosOrigen =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						creditosdetalladosDestino =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						creditosdetalladosDestino =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				creditosdetalladosOrigen =creditosdetalladossSeleccionados.get(0);
				creditosdetalladosDestino =creditosdetalladossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCreditosDetallados(creditosdetalladosOrigen,creditosdetalladosDestino,true,false);
				
				creditosdetalladosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(creditosdetalladosDestino,creditosdetalladosLogic.getCreditosDetalladoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(creditosdetalladosDestino,creditosdetalladoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCreditosDetallados(false);
				
				//this.jTableDatosCreditosDetallados.setRowSelectionInterval(this.getIndiceNuevoCreditosDetallados(), this.getIndiceNuevoCreditosDetallados());
				
				int iLastRow =  this.jTableDatosCreditosDetallados.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCreditosDetallados.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCreditosDetallados.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCreditosDetallados(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCreditosDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCreditosDetallados.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCreditosDetallados.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCreditosDetallados.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCreditosDetallados.setVisible(!isVisible);
			this.jPanelPaginacionCreditosDetallados.setVisible(!isVisible);
			this.jPanelAccionesCreditosDetallados.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCreditosDetallados();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCreditosDetallados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCreditosDetallados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCreditosDetallados();
			
			this.abrirFrameOrderByCreditosDetallados();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCreditosDetallados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCreditosDetallados(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCreditosDetallados);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCreditosDetallados.isMaximum()) {
					this.jInternalFrameDetalleFormCreditosDetallados.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCreditosDetallados.setSize(this.jInternalFrameDetalleFormCreditosDetallados.iWidthFormulario,this.jInternalFrameDetalleFormCreditosDetallados.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCreditosDetallados.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCreditosDetallados.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCreditosDetallados.isMaximum()) {
						this.jInternalFrameDetalleFormCreditosDetallados.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCreditosDetallados.jContentPaneDetalleCreditosDetallados.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCreditosDetallados.jTabbedPaneRelacionesCreditosDetallados.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCreditosDetallados.jContentPaneDetalleCreditosDetallados.getWidth(),CreditosDetalladosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCreditosDetallados.jTabbedPaneRelacionesCreditosDetallados.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCreditosDetallados.jContentPaneDetalleCreditosDetallados.getWidth(),CreditosDetalladosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCreditosDetallados.jTabbedPaneRelacionesCreditosDetallados.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCreditosDetallados.jContentPaneDetalleCreditosDetallados.getWidth(),CreditosDetalladosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCreditosDetallados.setVisible(true);
	        this.jInternalFrameDetalleFormCreditosDetallados.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCreditosDetallados() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCreditosDetallados==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCreditosDetallados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCreditosDetallados,false,this);
				} else {
					this.jInternalFrameOrderByCreditosDetallados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCreditosDetallados,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCreditosDetallados);
				this.jInternalFrameOrderByCreditosDetallados.setVisible(false);
				this.jInternalFrameOrderByCreditosDetallados.setSelected(false);
				
				this.jInternalFrameOrderByCreditosDetallados.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCreditosDetallados"));
				
				this.inicializarActualizarBindingTablaOrderByCreditosDetallados();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCreditosDetallados() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCreditosDetallados==null) {
				
				this.jInternalFrameImportacionCreditosDetallados=new ImportacionJInternalFrame(CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCreditosDetallados);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCreditosDetallados);
				this.jInternalFrameImportacionCreditosDetallados.setVisible(false);
				this.jInternalFrameImportacionCreditosDetallados.setSelected(false);


				this.jInternalFrameImportacionCreditosDetallados.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCreditosDetallados"));
				this.jInternalFrameImportacionCreditosDetallados.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCreditosDetallados"));
				this.jInternalFrameImportacionCreditosDetallados.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCreditosDetallados"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCreditosDetallados() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCreditosDetallados==null) {
				this.jInternalFrameReporteDinamicoCreditosDetallados=new ReporteDinamicoJInternalFrame(CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCreditosDetallados);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCreditosDetallados);
				this.jInternalFrameReporteDinamicoCreditosDetallados.setVisible(false);
				this.jInternalFrameReporteDinamicoCreditosDetallados.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCreditosDetallados.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCreditosDetallados"));
				this.jInternalFrameReporteDinamicoCreditosDetallados.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCreditosDetallados"));
				this.jInternalFrameReporteDinamicoCreditosDetallados.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCreditosDetallados"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCreditosDetallados();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCreditosDetallados() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCreditosDetallados);
			
	       	this.jInternalFrameDetalleFormCreditosDetallados.setVisible(false);
	        this.jInternalFrameDetalleFormCreditosDetallados.setSelected(false);
			
			//this.jInternalFrameDetalleFormCreditosDetallados.dispose();
			//this.jInternalFrameDetalleFormCreditosDetallados=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCreditosDetallados() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCreditosDetallados.setVisible(true);
	        this.jInternalFrameReporteDinamicoCreditosDetallados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCreditosDetallados() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCreditosDetallados.setVisible(true);
	        this.jInternalFrameImportacionCreditosDetallados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCreditosDetallados() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCreditosDetallados.setVisible(true);
	        this.jInternalFrameOrderByCreditosDetallados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCreditosDetallados() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCreditosDetallados.setVisible(false);
	        this.jInternalFrameOrderByCreditosDetallados.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCreditosDetallados() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCreditosDetallados.setVisible(false);
	        this.jInternalFrameReporteDinamicoCreditosDetallados.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCreditosDetallados() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCreditosDetallados.setVisible(false);
	        this.jInternalFrameImportacionCreditosDetallados.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCreditosDetallados(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCreditosDetallados(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCreditosDetallados(true);
			//this.isEsNuevoCreditosDetallados=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCreditosDetallados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCreditosDetallados(false) ;
			
			if(creditosdetalladosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CreditosDetalladosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCreditosDetallados(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCreditosDetallados(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCreditosDetalladosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCreditosDetallados(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCreditosDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCreditosDetallados(true);
			//this.isEsNuevoCreditosDetallados=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.creditosdetallados.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCreditosDetallados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCreditosDetallados(false) ;
			
			if(CreditosDetalladosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCreditosDetallados(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCreditosDetallados(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaCargo(List<Cargo> cargosForeignKey)throws Exception{
		TableColumn tableColumnCargo=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,CreditosDetalladosConstantesFunciones.LABEL_IDCARGO));
		TableCellEditor tableCellEditorCargo =tableColumnCargo.getCellEditor();

		CargoTableCell cargoTableCellFk=(CargoTableCell)tableCellEditorCargo;

		if(cargoTableCellFk!=null) {
			cargoTableCellFk.setcargosForeignKey(cargosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCreditosDetallados.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cargoTableCellFk.setRowActual(intSelectedRow);
			//cargoTableCellFk.setcargosForeignKeyActual(cargosForeignKey);
		//}


		if(cargoTableCellFk!=null) {
			cargoTableCellFk.RecargarCargosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,CreditosDetalladosConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCreditosDetallados.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,CreditosDetalladosConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCreditosDetallados.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoPrestamo(List<TipoPrestamo> tipoprestamosForeignKey)throws Exception{
		TableColumn tableColumnTipoPrestamo=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,CreditosDetalladosConstantesFunciones.LABEL_IDTIPOPRESTAMO));
		TableCellEditor tableCellEditorTipoPrestamo =tableColumnTipoPrestamo.getCellEditor();

		TipoPrestamoTableCell tipoprestamoTableCellFk=(TipoPrestamoTableCell)tableCellEditorTipoPrestamo;

		if(tipoprestamoTableCellFk!=null) {
			tipoprestamoTableCellFk.settipoprestamosForeignKey(tipoprestamosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCreditosDetallados.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoprestamoTableCellFk.setRowActual(intSelectedRow);
			//tipoprestamoTableCellFk.settipoprestamosForeignKeyActual(tipoprestamosForeignKey);
		//}


		if(tipoprestamoTableCellFk!=null) {
			tipoprestamoTableCellFk.RecargarTipoPrestamosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCreditosDetallados(false);
			
			//if(!this.isEsNuevoCreditosDetallados) {								
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CreditosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				
			}
			
			if(this.permiteMantenimiento(this.creditosdetallados)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCreditosDetallados=true;
					this.inicializarActualizarBindingTablaCreditosDetallados(false);
					this.isEsNuevoCreditosDetallados=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCreditosDetallados=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCreditosDetallados=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCreditosDetallados(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCreditosDetallados(false);
				
				this.habilitarDeshabilitarControlesCreditosDetallados(false);
			
												
				
				if(CreditosDetalladosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCreditosDetallados();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCreditosDetalladosActionPerformed(evt,creditosdetalladosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCreditosDetallados(this.creditosdetallados,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCreditosDetallados.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,creditosdetalladosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.creditosdetallados.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CreditosDetallados.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosDetallados.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				this.creditosdetallados.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				this.creditosdetallados.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.creditosdetallados)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CreditosDetalladosModel) this.jTableDatosCreditosDetallados.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCreditosDetallados=true;
				this.inicializarActualizarBindingTablaCreditosDetallados(false);
				this.isEsNuevoCreditosDetallados=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCreditosDetallados(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCreditosDetallados(false);
				
				this.habilitarDeshabilitarControlesCreditosDetallados(false);
				
				
				
				if(CreditosDetalladosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCreditosDetallados();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCreditosDetallados.getRowCount()>=1) {
				jTableDatosCreditosDetallados.removeRowSelectionInterval(0, jTableDatosCreditosDetallados.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCreditosDetallados(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCreditosDetallados(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCreditosDetallados(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCreditosDetallados(false) ;
			
			this.isEsNuevoCreditosDetallados=false;
			
			if(CreditosDetalladosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCreditosDetallados();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCreditosDetallados(false);
				
				//SI ES MANUAL
				if(CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCreditosDetallados();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCreditosDetallados--;			
			//CreditosDetallados creditosdetalladosAux= new CreditosDetallados();			
			//creditosdetalladosAux.setId(this.iIdNuevoCreditosDetallados);
			
			if(this.jInternalFrameDetalleFormCreditosDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCreditosDetallados();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
			
			this.creditosdetallados.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.creditosdetalladosLogic.getCreditosDetalladoss().add(this.creditosdetalladosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.creditosdetalladoss.add(this.creditosdetalladosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCreditosDetallados(false);
			
			this.jTableDatosCreditosDetallados.setRowSelectionInterval(this.getIndiceNuevoCreditosDetallados(), this.getIndiceNuevoCreditosDetallados());
			
			int iLastRow =  this.jTableDatosCreditosDetallados.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCreditosDetallados.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCreditosDetallados.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCreditosDetallados(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCreditosDetallados(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCreditosDetallados(false);
			
			//SI ES MANUAL
			if(CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCreditosDetallados();
			}
			
			//this.abrirFrameTreeCreditosDetallados();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCreditosDetallados.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCreditosDetallados.setFileImportacion(this.jInternalFrameImportacionCreditosDetallados.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCreditosDetallados.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCreditosDetallados.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCreditosDetallados.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCreditosDetallados.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CreditosDetallados> creditosdetalladossSeleccionados=new ArrayList<CreditosDetallados>();		

		creditosdetalladossSeleccionados=this.getCreditosDetalladossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CreditosDetalladosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CreditosDetalladosBaseDesign.jrxml";
			
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
			
			this.generarReporteCreditosDetalladoss("Todos",creditosdetalladossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Creditos Detallados",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCreditosDetallados.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCreditosDetallados.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CreditosDetalladosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoTipoPrestamo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoTipoPrestamo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoTipoPrestamo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoTipoPrestamo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoPrestamo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoPrestamo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoPrestamo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoPrestamo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosDetalladosConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosDetalladosConstantesFunciones.LABEL_MONTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCuotas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCuotas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCuotas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCuotas_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosDetalladosConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosDetalladosConstantesFunciones.LABEL_MONTOCAPITAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoCapital_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoCapital_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoCapital_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoCapital_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosDetalladosConstantesFunciones.LABEL_MONTOINTERES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoInteres_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoInteres_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoInteres_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoInteres_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosDetalladosConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosDetalladosConstantesFunciones.LABEL_SALDO:
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
		
		if(this.jInternalFrameReporteDinamicoCreditosDetallados.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CreditosDetalladosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO:
					sNombreCampoCategoria="codigo_tipo_prestamo";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO:
					sNombreCampoCategoria="codigo_prestamo";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoria="monto";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS:
					sNombreCampoCategoria="numero_cuotas";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_MONTOCAPITAL:
					sNombreCampoCategoria="monto_capital";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_MONTOINTERES:
					sNombreCampoCategoria="monto_interes";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoria="saldo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CreditosDetalladosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO:
					sNombreCampoCategoriaValor="codigo_tipo_prestamo";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO:
					sNombreCampoCategoriaValor="codigo_prestamo";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoriaValor="monto";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS:
					sNombreCampoCategoriaValor="numero_cuotas";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_MONTOCAPITAL:
					sNombreCampoCategoriaValor="monto_capital";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_MONTOINTERES:
					sNombreCampoCategoriaValor="monto_interes";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoriaValor="saldo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCreditosDetallados.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCreditosDetallados.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CreditosDetalladosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Tipo Prestamo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_tipo_prestamo");
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Prestamo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_prestamo");
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_MONTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto");
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cuotas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cuotas");
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_MONTOCAPITAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Capital",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_capital");
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_MONTOINTERES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Interes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_interes");
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_SALDO:
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
	
	public void jButtonGenerarExcelReporteDinamicoCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CreditosDetallados> creditosdetalladossSeleccionados=new ArrayList<CreditosDetallados>();		
		
		creditosdetalladossSeleccionados=this.getCreditosDetalladossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"creditosdetallados";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CreditosDetalladoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCreditosDetallados.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCreditosDetallados.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CreditosDetalladosConstantesFunciones.LABEL_IDCARGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_IDCARGO);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getcargo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_IDTIPOPRESTAMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_IDTIPOPRESTAMO);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.gettipoprestamo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getfecha_vencimiento_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getfecha_vencimiento_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getcodigo_tipo_prestamo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getcodigo_prestamo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_MONTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_MONTO);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getmonto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getnumero_cuotas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_MONTOCAPITAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_MONTOCAPITAL);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getmonto_capital());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_MONTOINTERES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_MONTOINTERES);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getmonto_interes());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosDetalladosConstantesFunciones.LABEL_SALDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_SALDO);
					iRow++;

					for(CreditosDetallados creditosdetallados:creditosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditosdetallados.getsaldo());
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
			//	this.getFilaCabeceraExportarExcelCreditosDetallados(row);				
			//	iRow++;
			//}				
			
			//for(CreditosDetallados creditosdetalladosAux:creditosdetalladossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCreditosDetallados(creditosdetalladosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Creditos Detallados",JOptionPane.INFORMATION_MESSAGE);
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
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCreditosDetallados(false);
			
			//SI ES MANUAL
			if(CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCreditosDetallados();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCreditosDetallados(false);
			
			//SI ES MANUAL
			if(CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCreditosDetallados();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCreditosDetallados(false);
			
			//SI ES MANUAL
			if(CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCreditosDetallados();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCreditosDetallados() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCreditosDetallados.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCreditosDetallados.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCreditosDetallados.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCreditosDetallados.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCreditosDetallados.setMinimumSize(dimensionMinimum);
		this.jTableDatosCreditosDetallados.setMaximumSize(dimensionMaximum);
		this.jTableDatosCreditosDetallados.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCreditosDetallados(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCreditosDetallados(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCreditosDetallados(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCreditosDetallados(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCreditosDetallados(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCreditosDetallados(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCreditosDetallados(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCreditosDetallados(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CreditosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCreditosDetallados() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCreditosDetallados();
		
		this.inicializarActualizarBindingBotonesManualCreditosDetallados(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCreditosDetallados();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCreditosDetallados() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCreditosDetallados(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCreditosDetallados(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCreditosDetallados.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCreditosDetallados.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCreditosDetallados.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCreditosDetallados.jCheckBoxPostAccionNuevoCreditosDetallados.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCreditosDetallados.jCheckBoxPostAccionSinCerrarCreditosDetallados.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCreditosDetallados.jCheckBoxPostAccionSinMensajeCreditosDetallados.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCreditosDetallados.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCreditosDetallados.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCreditosDetallados.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
				this.jInternalFrameDetalleFormCreditosDetallados.jCheckBoxPostAccionNuevoCreditosDetallados.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCreditosDetallados.jCheckBoxPostAccionSinCerrarCreditosDetallados.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCreditosDetallados.jCheckBoxPostAccionSinMensajeCreditosDetallados.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCreditosDetallados.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCreditosDetallados.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxTiposAccionesFormularioCreditosDetallados.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCreditosDetallados.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCreditosDetallados!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCreditosDetallados.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCreditosDetallados.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCreditosDetallados.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCreditosDetallados.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCreditosDetallados!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCreditosDetallados.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCreditosDetallados.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCreditosDetallados(Boolean esInicializar) throws Exception {
		try	{	
			if(CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCreditosDetallados(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCreditosDetallados() throws Exception {
		try	{
			if(CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCreditosDetallados();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCreditosDetallados() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxTiposAccionesFormularioCreditosDetallados.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxTiposAccionesFormularioCreditosDetallados.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCreditosDetallados() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCreditosDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCreditosDetallados.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCreditosDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCreditosDetallados.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCreditosDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCreditosDetallados.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCreditosDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCreditosDetallados.addItem(reporte);
			}
			
			
			if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCreditosDetallados.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCreditosDetallados.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCreditosDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCreditosDetallados.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCreditosDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCreditosDetallados.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxTiposAccionesFormularioCreditosDetallados.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxTiposAccionesFormularioCreditosDetallados.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCreditosDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCreditosDetallados.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCreditosDetallados.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCreditosDetallados();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCreditosDetallados() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCreditosDetallados!=null) {
				this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCreditosDetallados!=null) {
				this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCreditosDetallados!=null) {
				
				if(this.jInternalFrameReporteDinamicoCreditosDetallados.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCreditosDetallados.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCreditosDetallados.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCreditosDetallados.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCreditosDetallados.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCreditosDetallados.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CreditosDetalladosConstantesFunciones.getTiposSeleccionarCreditosDetallados(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CreditosDetalladosConstantesFunciones.getTiposSeleccionarCreditosDetallados(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCreditosDetallados.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCreditosDetallados.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CreditosDetalladosConstantesFunciones.getTiposSeleccionarCreditosDetallados(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCreditosDetallados.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCreditosDetallados.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCreditosDetallados()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados.getSelectedItem()!=null){this.id_cargoBusquedaCreditosDetallados=((Cargo)this.jComboBoxid_cargoBusquedaCreditosDetalladosCreditosDetallados.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados.getSelectedItem()!=null){this.id_estructuraBusquedaCreditosDetallados=((Estructura)this.jComboBoxid_estructuraBusquedaCreditosDetalladosCreditosDetallados.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados.getSelectedItem()!=null){this.id_empleadoBusquedaCreditosDetallados=((Empleado)this.jComboBoxid_empleadoBusquedaCreditosDetalladosCreditosDetallados.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.getSelectedItem()!=null){this.id_tipo_prestamoBusquedaCreditosDetallados=((TipoPrestamo)this.jComboBoxid_tipo_prestamoBusquedaCreditosDetalladosCreditosDetallados.getSelectedItem()).getId();}
		this.fecha_vencimiento_desdeBusquedaCreditosDetallados=new Date(this.jDateChooserfecha_vencimiento_desdeBusquedaCreditosDetalladosCreditosDetallados.getDate().getTime());
		this.fecha_vencimiento_hastaBusquedaCreditosDetallados=new Date(this.jDateChooserfecha_vencimiento_hastaBusquedaCreditosDetalladosCreditosDetallados.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCreditosDetallados(Boolean esInicializar) throws Exception {				
		if(CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCreditosDetallados();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCreditosDetallados() throws Exception {
		this.inicializarActualizarBindingTablaCreditosDetallados(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCreditosDetallados() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCreditosDetallados.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCreditosDetallados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCreditosDetallados.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CreditosDetalladosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCreditosDetallados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCreditosDetallados.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CreditosDetalladosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCreditosDetalladosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetalladosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CreditosDetalladosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCreditosDetallados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCreditosDetallados.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CreditosDetalladosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCreditosDetallados.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCreditosDetallados(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=creditosdetalladosLogic.getCreditosDetalladoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=creditosdetalladoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CreditosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCreditosDetallados.setModel(new CreditosDetalladosModel(this.creditosdetalladosLogic.getCreditosDetalladoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCreditosDetallados.setModel(new CreditosDetalladosModel(this.creditosdetalladoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCreditosDetallados!=null && this.jInternalFrameOrderByCreditosDetallados.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCreditosDetallados();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CreditosDetalladosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO,creditosdetalladosConstantesFunciones.resaltarSeleccionarCreditosDetallados,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CreditosDetalladosConstantesFunciones.SCLASSWEBTITULO,creditosdetalladosConstantesFunciones.resaltarSeleccionarCreditosDetallados,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,CreditosDetalladosConstantesFunciones.LABEL_ID));

		if(this.creditosdetalladosConstantesFunciones.mostraridCreditosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosDetalladosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.creditosdetalladosConstantesFunciones.resaltaridCreditosDetallados,this.creditosdetalladosConstantesFunciones.activaridCreditosDetallados,iSizeTabla,this,true,"idCreditosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditosdetalladosConstantesFunciones.resaltaridCreditosDetallados,this.creditosdetalladosConstantesFunciones.activaridCreditosDetallados,this,true,"idCreditosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,CreditosDetalladosConstantesFunciones.LABEL_CODIGO));

		if(this.creditosdetalladosConstantesFunciones.mostrarcodigoCreditosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosDetalladosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.creditosdetalladosConstantesFunciones.resaltarcodigoCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarcodigoCreditosDetallados,iSizeTabla,this,true,"codigoCreditosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditosdetalladosConstantesFunciones.resaltarcodigoCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarcodigoCreditosDetallados,this,true,"codigoCreditosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CreditosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.creditosdetalladosConstantesFunciones.mostrarnombre_completoCreditosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.creditosdetalladosConstantesFunciones.resaltarnombre_completoCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarnombre_completoCreditosDetallados,iSizeTabla,this,true,"nombre_completoCreditosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditosdetalladosConstantesFunciones.resaltarnombre_completoCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarnombre_completoCreditosDetallados,this,true,"nombre_completoCreditosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CreditosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO));

		if(this.creditosdetalladosConstantesFunciones.mostrarcodigo_tipo_prestamoCreditosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.creditosdetalladosConstantesFunciones.resaltarcodigo_tipo_prestamoCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarcodigo_tipo_prestamoCreditosDetallados,iSizeTabla,this,true,"codigo_tipo_prestamoCreditosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditosdetalladosConstantesFunciones.resaltarcodigo_tipo_prestamoCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarcodigo_tipo_prestamoCreditosDetallados,this,true,"codigo_tipo_prestamoCreditosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CreditosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO));

		if(this.creditosdetalladosConstantesFunciones.mostrarcodigo_prestamoCreditosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.creditosdetalladosConstantesFunciones.resaltarcodigo_prestamoCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarcodigo_prestamoCreditosDetallados,iSizeTabla,this,true,"codigo_prestamoCreditosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditosdetalladosConstantesFunciones.resaltarcodigo_prestamoCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarcodigo_prestamoCreditosDetallados,this,true,"codigo_prestamoCreditosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CreditosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,CreditosDetalladosConstantesFunciones.LABEL_FECHA));

		if(this.creditosdetalladosConstantesFunciones.mostrarfechaCreditosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosDetalladosConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.creditosdetalladosConstantesFunciones.resaltarfechaCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarfechaCreditosDetallados,iSizeTabla,this,true,"fechaCreditosDetallados","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.creditosdetalladosConstantesFunciones.resaltarfechaCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarfechaCreditosDetallados,this,true,"fechaCreditosDetallados","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CreditosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,CreditosDetalladosConstantesFunciones.LABEL_MONTO));

		if(this.creditosdetalladosConstantesFunciones.mostrarmontoCreditosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosDetalladosConstantesFunciones.LABEL_MONTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.creditosdetalladosConstantesFunciones.resaltarmontoCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarmontoCreditosDetallados,iSizeTabla,this,true,"montoCreditosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditosdetalladosConstantesFunciones.resaltarmontoCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarmontoCreditosDetallados,this,true,"montoCreditosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CreditosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS));

		if(this.creditosdetalladosConstantesFunciones.mostrarnumero_cuotasCreditosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.creditosdetalladosConstantesFunciones.resaltarnumero_cuotasCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarnumero_cuotasCreditosDetallados,iSizeTabla,this,true,"numero_cuotasCreditosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditosdetalladosConstantesFunciones.resaltarnumero_cuotasCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarnumero_cuotasCreditosDetallados,this,true,"numero_cuotasCreditosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CreditosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,CreditosDetalladosConstantesFunciones.LABEL_NUMERO));

		if(this.creditosdetalladosConstantesFunciones.mostrarnumeroCreditosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosDetalladosConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.creditosdetalladosConstantesFunciones.resaltarnumeroCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarnumeroCreditosDetallados,iSizeTabla,this,true,"numeroCreditosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditosdetalladosConstantesFunciones.resaltarnumeroCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarnumeroCreditosDetallados,this,true,"numeroCreditosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CreditosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,CreditosDetalladosConstantesFunciones.LABEL_MONTOCAPITAL));

		if(this.creditosdetalladosConstantesFunciones.mostrarmonto_capitalCreditosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosDetalladosConstantesFunciones.LABEL_MONTOCAPITAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.creditosdetalladosConstantesFunciones.resaltarmonto_capitalCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarmonto_capitalCreditosDetallados,iSizeTabla,this,true,"monto_capitalCreditosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditosdetalladosConstantesFunciones.resaltarmonto_capitalCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarmonto_capitalCreditosDetallados,this,true,"monto_capitalCreditosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CreditosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,CreditosDetalladosConstantesFunciones.LABEL_MONTOINTERES));

		if(this.creditosdetalladosConstantesFunciones.mostrarmonto_interesCreditosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosDetalladosConstantesFunciones.LABEL_MONTOINTERES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.creditosdetalladosConstantesFunciones.resaltarmonto_interesCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarmonto_interesCreditosDetallados,iSizeTabla,this,true,"monto_interesCreditosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditosdetalladosConstantesFunciones.resaltarmonto_interesCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarmonto_interesCreditosDetallados,this,true,"monto_interesCreditosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CreditosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,CreditosDetalladosConstantesFunciones.LABEL_VALOR));

		if(this.creditosdetalladosConstantesFunciones.mostrarvalorCreditosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosDetalladosConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.creditosdetalladosConstantesFunciones.resaltarvalorCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarvalorCreditosDetallados,iSizeTabla,this,true,"valorCreditosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditosdetalladosConstantesFunciones.resaltarvalorCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarvalorCreditosDetallados,this,true,"valorCreditosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CreditosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,CreditosDetalladosConstantesFunciones.LABEL_SALDO));

		if(this.creditosdetalladosConstantesFunciones.mostrarsaldoCreditosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosDetalladosConstantesFunciones.LABEL_SALDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.creditosdetalladosConstantesFunciones.resaltarsaldoCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarsaldoCreditosDetallados,iSizeTabla,this,true,"saldoCreditosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditosdetalladosConstantesFunciones.resaltarsaldoCreditosDetallados,this.creditosdetalladosConstantesFunciones.activarsaldoCreditosDetallados,this,true,"saldoCreditosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CreditosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.creditosdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.creditosdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCreditosDetallados.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.creditosdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.creditosdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCreditosDetallados.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCreditosDetallados && this.isPermisoGuardarCambiosCreditosDetallados) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.creditosdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.creditosdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCreditosDetallados.addColumn(tableColumn);
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
			
			this.jTableDatosCreditosDetallados.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCreditosDetallados && this.isPermisoGuardarCambiosCreditosDetallados) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCreditosDetallados && this.isPermisoGuardarCambiosCreditosDetallados) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCreditosDetallados.moveColumn(this.jTableDatosCreditosDetallados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCreditosDetallados.moveColumn(this.jTableDatosCreditosDetallados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCreditosDetallados.moveColumn(this.jTableDatosCreditosDetallados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCreditosDetallados.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCreditosDetallados.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCreditosDetallados,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCreditosDetallados.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCreditosDetallados.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CreditosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCreditosDetallados.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCreditosDetallados.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCreditosDetallados.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=creditosdetalladosLogic.getCreditosDetalladoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=creditosdetalladoss.size()-1;
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
		//this.jTableDatosCreditosDetallados.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCreditosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCreditosDetallados();
			
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
				
				//this.isEsNuevoCreditosDetallados=false;
					
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
			
				if(this.creditosdetalladosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCreditosDetallados==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCreditosDetallados.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCreditosDetallados.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.creditosdetallados.getsType().equals("DUPLICADO")
				   || this.creditosdetallados.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCreditosDetallados=true;
				
				} else {
					this.isEsNuevoCreditosDetallados=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
					if(this.creditosdetallados.getId()>=0 && !this.creditosdetallados.getIsNew()) {						
						this.isEsNuevoCreditosDetallados=false;
						
					} else {
						this.isEsNuevoCreditosDetallados=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCreditosDetallados(esRelaciones);						
				
				this.seleccionarCreditosDetallados(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.creditosdetallados.getId()<0) {
					this.isEsNuevoCreditosDetallados=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCreditosDetallados(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCreditosDetallados(evt,rowIndex);
				}	
				
				if(this.creditosdetalladosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CreditosDetallados: " + this.dDif); 
					}
				}								
				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCreditosDetallados(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.creditosdetallados)) {
					if(this.creditosdetallados.getId()>0) {
						this.creditosdetallados.setIsDeleted(true);
						
						this.creditosdetalladossEliminados.add(this.creditosdetallados);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.creditosdetalladosLogic.getCreditosDetalladoss().remove(this.creditosdetallados);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.creditosdetalladoss.remove(this.creditosdetallados);				
					}
					
					
					((CreditosDetalladosModel) this.jTableDatosCreditosDetallados.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCreditosDetallados(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCreditosDetallados(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCreditosDetallados) {
			
			if(this.jInternalFrameDetalleFormCreditosDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCreditosDetallados.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCreditosDetallados.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CreditosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCreditosDetallados(this.creditosdetallados);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCreditosDetallados("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCreditosDetallados(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCreditosDetallados() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCreditosDetallados(CreditosDetallados creditosdetallados) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCreditosDetallados(creditosdetallados,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCreditosDetallados(CreditosDetallados creditosdetallados,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCreditosDetallados(creditosdetallados);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCreditosDetallados(creditosdetallados,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCreditosDetallados(creditosdetallados);
	}
	
	public void setVariablesObjetoActualToFormularioCreditosDetallados(CreditosDetallados creditosdetallados) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCreditosDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCreditosDetallados.jLabelidCreditosDetallados.setText(creditosdetallados.getId().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigoCreditosDetallados.setText(creditosdetallados.getcodigo());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextAreanombre_completoCreditosDetallados.setText(creditosdetallados.getnombre_completo());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigo_tipo_prestamoCreditosDetallados.setText(creditosdetallados.getcodigo_tipo_prestamo());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigo_prestamoCreditosDetallados.setText(creditosdetallados.getcodigo_prestamo());
			this.jInternalFrameDetalleFormCreditosDetallados.jDateChooserfechaCreditosDetallados.setDate(creditosdetallados.getfecha());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmontoCreditosDetallados.setText(creditosdetallados.getmonto().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldnumero_cuotasCreditosDetallados.setText(creditosdetallados.getnumero_cuotas().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldnumeroCreditosDetallados.setText(creditosdetallados.getnumero().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmonto_capitalCreditosDetallados.setText(creditosdetallados.getmonto_capital().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmonto_interesCreditosDetallados.setText(creditosdetallados.getmonto_interes().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldvalorCreditosDetallados.setText(creditosdetallados.getvalor().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldsaldoCreditosDetallados.setText(creditosdetallados.getsaldo().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CreditosDetallados creditosdetalladosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,creditosdetalladosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CreditosDetallados creditosdetalladosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				creditosdetalladosLocal=this.creditosdetallados;
			} else {
				creditosdetalladosLocal=this.creditosdetalladosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(creditosdetalladosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCreditosDetallados(creditosdetalladosLocal,true);
					
					if(creditosdetalladosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(creditosdetalladosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(creditosdetalladosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCreditosDetallados(CreditosDetallados creditosdetallados,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCreditosDetallados(creditosdetallados,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(creditosdetallados);
	}
	
	public void setVariablesFormularioToObjetoActualCreditosDetallados(CreditosDetallados creditosdetallados,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCreditosDetallados(creditosdetallados,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCreditosDetallados(CreditosDetallados creditosdetallados,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCreditosDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCreditosDetallados.jLabelidCreditosDetallados.getText()==null || this.jInternalFrameDetalleFormCreditosDetallados.jLabelidCreditosDetallados.getText()=="" || this.jInternalFrameDetalleFormCreditosDetallados.jLabelidCreditosDetallados.getText()=="Id") {
				this.jInternalFrameDetalleFormCreditosDetallados.jLabelidCreditosDetallados.setText("0");
			}

			if(conColumnasBase) {creditosdetallados.setId(Long.parseLong(this.jInternalFrameDetalleFormCreditosDetallados.jLabelidCreditosDetallados.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosDetalladosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelIdCreditosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditosdetallados.setcodigo(this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigoCreditosDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosDetalladosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelcodigoCreditosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditosdetallados.setnombre_completo(this.jInternalFrameDetalleFormCreditosDetallados.jTextAreanombre_completoCreditosDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelnombre_completoCreditosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditosdetallados.setcodigo_tipo_prestamo(this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigo_tipo_prestamoCreditosDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelcodigo_tipo_prestamoCreditosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditosdetallados.setcodigo_prestamo(this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigo_prestamoCreditosDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelcodigo_prestamoCreditosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditosdetallados.setfecha(this.jInternalFrameDetalleFormCreditosDetallados.jDateChooserfechaCreditosDetallados.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosDetalladosConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelfechaCreditosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditosdetallados.setmonto(Double.parseDouble(this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmontoCreditosDetallados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosDetalladosConstantesFunciones.LABEL_MONTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelmontoCreditosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditosdetallados.setnumero_cuotas(Integer.parseInt(this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldnumero_cuotasCreditosDetallados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelnumero_cuotasCreditosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditosdetallados.setnumero(Integer.parseInt(this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldnumeroCreditosDetallados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosDetalladosConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelnumeroCreditosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditosdetallados.setmonto_capital(Double.parseDouble(this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmonto_capitalCreditosDetallados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosDetalladosConstantesFunciones.LABEL_MONTOCAPITAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelmonto_capitalCreditosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditosdetallados.setmonto_interes(Double.parseDouble(this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmonto_interesCreditosDetallados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosDetalladosConstantesFunciones.LABEL_MONTOINTERES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelmonto_interesCreditosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditosdetallados.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldvalorCreditosDetallados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosDetalladosConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelvalorCreditosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditosdetallados.setsaldo(Double.parseDouble(this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldsaldoCreditosDetallados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosDetalladosConstantesFunciones.LABEL_SALDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosDetallados.jLabelsaldoCreditosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCreditosDetallados(CreditosDetallados creditosdetalladosBean,CreditosDetallados creditosdetallados,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCreditosDetallados(CreditosDetallados creditosdetalladosOrigen,CreditosDetallados creditosdetallados,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && creditosdetalladosOrigen.getId()!=null && !creditosdetalladosOrigen.getId().equals(0L))) {creditosdetallados.setId(creditosdetalladosOrigen.getId());}}
			if(conDefault || (!conDefault && creditosdetalladosOrigen.getfecha_vencimiento_desde()!=null && !creditosdetalladosOrigen.getfecha_vencimiento_desde().equals(new Date()))) {creditosdetallados.setfecha_vencimiento_desde(creditosdetalladosOrigen.getfecha_vencimiento_desde());}
			if(conDefault || (!conDefault && creditosdetalladosOrigen.getfecha_vencimiento_hasta()!=null && !creditosdetalladosOrigen.getfecha_vencimiento_hasta().equals(new Date()))) {creditosdetallados.setfecha_vencimiento_hasta(creditosdetalladosOrigen.getfecha_vencimiento_hasta());}
			if(conDefault || (!conDefault && creditosdetalladosOrigen.getcodigo()!=null && !creditosdetalladosOrigen.getcodigo().equals(""))) {creditosdetallados.setcodigo(creditosdetalladosOrigen.getcodigo());}
			if(conDefault || (!conDefault && creditosdetalladosOrigen.getnombre_completo()!=null && !creditosdetalladosOrigen.getnombre_completo().equals(""))) {creditosdetallados.setnombre_completo(creditosdetalladosOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && creditosdetalladosOrigen.getcodigo_tipo_prestamo()!=null && !creditosdetalladosOrigen.getcodigo_tipo_prestamo().equals(""))) {creditosdetallados.setcodigo_tipo_prestamo(creditosdetalladosOrigen.getcodigo_tipo_prestamo());}
			if(conDefault || (!conDefault && creditosdetalladosOrigen.getcodigo_prestamo()!=null && !creditosdetalladosOrigen.getcodigo_prestamo().equals(""))) {creditosdetallados.setcodigo_prestamo(creditosdetalladosOrigen.getcodigo_prestamo());}
			if(conDefault || (!conDefault && creditosdetalladosOrigen.getfecha()!=null && !creditosdetalladosOrigen.getfecha().equals(new Date()))) {creditosdetallados.setfecha(creditosdetalladosOrigen.getfecha());}
			if(conDefault || (!conDefault && creditosdetalladosOrigen.getmonto()!=null && !creditosdetalladosOrigen.getmonto().equals(0.0))) {creditosdetallados.setmonto(creditosdetalladosOrigen.getmonto());}
			if(conDefault || (!conDefault && creditosdetalladosOrigen.getnumero_cuotas()!=null && !creditosdetalladosOrigen.getnumero_cuotas().equals(0))) {creditosdetallados.setnumero_cuotas(creditosdetalladosOrigen.getnumero_cuotas());}
			if(conDefault || (!conDefault && creditosdetalladosOrigen.getnumero()!=null && !creditosdetalladosOrigen.getnumero().equals(0))) {creditosdetallados.setnumero(creditosdetalladosOrigen.getnumero());}
			if(conDefault || (!conDefault && creditosdetalladosOrigen.getmonto_capital()!=null && !creditosdetalladosOrigen.getmonto_capital().equals(0.0))) {creditosdetallados.setmonto_capital(creditosdetalladosOrigen.getmonto_capital());}
			if(conDefault || (!conDefault && creditosdetalladosOrigen.getmonto_interes()!=null && !creditosdetalladosOrigen.getmonto_interes().equals(0.0))) {creditosdetallados.setmonto_interes(creditosdetalladosOrigen.getmonto_interes());}
			if(conDefault || (!conDefault && creditosdetalladosOrigen.getvalor()!=null && !creditosdetalladosOrigen.getvalor().equals(0.0))) {creditosdetallados.setvalor(creditosdetalladosOrigen.getvalor());}
			if(conDefault || (!conDefault && creditosdetalladosOrigen.getsaldo()!=null && !creditosdetalladosOrigen.getsaldo().equals(0.0))) {creditosdetallados.setsaldo(creditosdetalladosOrigen.getsaldo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCreditosDetallados(CreditosDetallados creditosdetallados) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCreditosDetallados.jLabelidCreditosDetallados.setText(creditosdetallados.getId().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigoCreditosDetallados.setText(creditosdetallados.getcodigo());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextAreanombre_completoCreditosDetallados.setText(creditosdetallados.getnombre_completo());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigo_tipo_prestamoCreditosDetallados.setText(creditosdetallados.getcodigo_tipo_prestamo());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigo_prestamoCreditosDetallados.setText(creditosdetallados.getcodigo_prestamo());
			this.jInternalFrameDetalleFormCreditosDetallados.jDateChooserfechaCreditosDetallados.setDate(creditosdetallados.getfecha());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmontoCreditosDetallados.setText(creditosdetallados.getmonto().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldnumero_cuotasCreditosDetallados.setText(creditosdetallados.getnumero_cuotas().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldnumeroCreditosDetallados.setText(creditosdetallados.getnumero().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmonto_capitalCreditosDetallados.setText(creditosdetallados.getmonto_capital().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmonto_interesCreditosDetallados.setText(creditosdetallados.getmonto_interes().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldvalorCreditosDetallados.setText(creditosdetallados.getvalor().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldsaldoCreditosDetallados.setText(creditosdetallados.getsaldo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCreditosDetallados(CreditosDetalladosBean creditosdetalladosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCreditosDetallados.jLabelidCreditosDetallados.setText(creditosdetalladosBean.getId().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigoCreditosDetallados.setText(creditosdetalladosBean.getcodigo());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextAreanombre_completoCreditosDetallados.setText(creditosdetalladosBean.getnombre_completo());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigo_tipo_prestamoCreditosDetallados.setText(creditosdetalladosBean.getcodigo_tipo_prestamo());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigo_prestamoCreditosDetallados.setText(creditosdetalladosBean.getcodigo_prestamo());
			this.jInternalFrameDetalleFormCreditosDetallados.jDateChooserfechaCreditosDetallados.setDate(creditosdetalladosBean.getfecha());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmontoCreditosDetallados.setText(creditosdetalladosBean.getmonto().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldnumero_cuotasCreditosDetallados.setText(creditosdetalladosBean.getnumero_cuotas().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldnumeroCreditosDetallados.setText(creditosdetalladosBean.getnumero().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmonto_capitalCreditosDetallados.setText(creditosdetalladosBean.getmonto_capital().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmonto_interesCreditosDetallados.setText(creditosdetalladosBean.getmonto_interes().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldvalorCreditosDetallados.setText(creditosdetalladosBean.getvalor().toString());
			this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldsaldoCreditosDetallados.setText(creditosdetalladosBean.getsaldo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCreditosDetallados(CreditosDetalladosParameterReturnGeneral creditosdetalladosReturnGeneral,CreditosDetalladosBean creditosdetalladosBean,Boolean conDefault) throws Exception { 
		try {
			CreditosDetallados creditosdetalladosLocal=new CreditosDetallados();
			
			creditosdetalladosLocal=creditosdetalladosReturnGeneral.getCreditosDetallados();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && creditosdetalladosLocal.getId()!=null && !creditosdetalladosLocal.getId().equals(0L))) {creditosdetalladosBean.setId(creditosdetalladosLocal.getId());}}
			if(conDefault || (!conDefault && creditosdetalladosLocal.getcodigo()!=null && !creditosdetalladosLocal.getcodigo().equals(""))) {creditosdetalladosBean.setcodigo(creditosdetalladosLocal.getcodigo());}
			if(conDefault || (!conDefault && creditosdetalladosLocal.getnombre_completo()!=null && !creditosdetalladosLocal.getnombre_completo().equals(""))) {creditosdetalladosBean.setnombre_completo(creditosdetalladosLocal.getnombre_completo());}
			if(conDefault || (!conDefault && creditosdetalladosLocal.getcodigo_tipo_prestamo()!=null && !creditosdetalladosLocal.getcodigo_tipo_prestamo().equals(""))) {creditosdetalladosBean.setcodigo_tipo_prestamo(creditosdetalladosLocal.getcodigo_tipo_prestamo());}
			if(conDefault || (!conDefault && creditosdetalladosLocal.getcodigo_prestamo()!=null && !creditosdetalladosLocal.getcodigo_prestamo().equals(""))) {creditosdetalladosBean.setcodigo_prestamo(creditosdetalladosLocal.getcodigo_prestamo());}
			if(conDefault || (!conDefault && creditosdetalladosLocal.getfecha()!=null && !creditosdetalladosLocal.getfecha().equals(new Date()))) {creditosdetalladosBean.setfecha(creditosdetalladosLocal.getfecha());}
			if(conDefault || (!conDefault && creditosdetalladosLocal.getmonto()!=null && !creditosdetalladosLocal.getmonto().equals(0.0))) {creditosdetalladosBean.setmonto(creditosdetalladosLocal.getmonto());}
			if(conDefault || (!conDefault && creditosdetalladosLocal.getnumero_cuotas()!=null && !creditosdetalladosLocal.getnumero_cuotas().equals(0))) {creditosdetalladosBean.setnumero_cuotas(creditosdetalladosLocal.getnumero_cuotas());}
			if(conDefault || (!conDefault && creditosdetalladosLocal.getnumero()!=null && !creditosdetalladosLocal.getnumero().equals(0))) {creditosdetalladosBean.setnumero(creditosdetalladosLocal.getnumero());}
			if(conDefault || (!conDefault && creditosdetalladosLocal.getmonto_capital()!=null && !creditosdetalladosLocal.getmonto_capital().equals(0.0))) {creditosdetalladosBean.setmonto_capital(creditosdetalladosLocal.getmonto_capital());}
			if(conDefault || (!conDefault && creditosdetalladosLocal.getmonto_interes()!=null && !creditosdetalladosLocal.getmonto_interes().equals(0.0))) {creditosdetalladosBean.setmonto_interes(creditosdetalladosLocal.getmonto_interes());}
			if(conDefault || (!conDefault && creditosdetalladosLocal.getvalor()!=null && !creditosdetalladosLocal.getvalor().equals(0.0))) {creditosdetalladosBean.setvalor(creditosdetalladosLocal.getvalor());}
			if(conDefault || (!conDefault && creditosdetalladosLocal.getsaldo()!=null && !creditosdetalladosLocal.getsaldo().equals(0.0))) {creditosdetalladosBean.setsaldo(creditosdetalladosLocal.getsaldo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCreditosDetalladosGenerico(Long idCreditosDetalladosSeleccionado,JComboBox jComboBoxCreditosDetallados,List<CreditosDetallados> creditosdetalladossLocal)throws Exception {
		try {
			CreditosDetallados  creditosdetalladosTemp=null;

			for(CreditosDetallados creditosdetalladosAux:creditosdetalladossLocal) {
				if(creditosdetalladosAux.getId()!=null && creditosdetalladosAux.getId().equals(idCreditosDetalladosSeleccionado)) {
					creditosdetalladosTemp=creditosdetalladosAux;
					break;
				}
			}

			jComboBoxCreditosDetallados.setSelectedItem(creditosdetalladosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCreditosDetalladosGenerico(JComboBox jComboBoxCreditosDetallados,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCreditosDetallados.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCreditosDetallados.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCreditosDetallados.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCreditosDetallados.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCreditosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCreditosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			creditosdetallados=(CreditosDetallados) creditosdetalladosLogic.getCreditosDetalladoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			creditosdetallados =(CreditosDetallados) creditosdetalladoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Cargo")) {
			//sDescripcion=this.getActualCargoForeignKeyDescripcion((Long)value);
			if(!creditosdetallados.getIsNew() && !creditosdetallados.getIsChanged() && !creditosdetallados.getIsDeleted()) {
				sDescripcion=creditosdetallados.getcargo_descripcion();
			} else {
				//sDescripcion=this.getActualCargoForeignKeyDescripcion((Long)value);
				sDescripcion=creditosdetallados.getcargo_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!creditosdetallados.getIsNew() && !creditosdetallados.getIsChanged() && !creditosdetallados.getIsDeleted()) {
				sDescripcion=creditosdetallados.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=creditosdetallados.getestructura_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!creditosdetallados.getIsNew() && !creditosdetallados.getIsChanged() && !creditosdetallados.getIsDeleted()) {
				sDescripcion=creditosdetallados.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=creditosdetallados.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!creditosdetallados.getIsNew() && !creditosdetallados.getIsChanged() && !creditosdetallados.getIsDeleted()) {
				sDescripcion=creditosdetallados.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=creditosdetallados.getempleado_descripcion();
			}
		}

		if(sTipo.equals("TipoPrestamo")) {
			//sDescripcion=this.getActualTipoPrestamoForeignKeyDescripcion((Long)value);
			if(!creditosdetallados.getIsNew() && !creditosdetallados.getIsChanged() && !creditosdetallados.getIsDeleted()) {
				sDescripcion=creditosdetallados.gettipoprestamo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoPrestamoForeignKeyDescripcion((Long)value);
				sDescripcion=creditosdetallados.gettipoprestamo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CreditosDetallados creditosdetalladosRow=new CreditosDetallados();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			creditosdetalladosRow=(CreditosDetallados) creditosdetalladosLogic.getCreditosDetalladoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			creditosdetalladosRow=(CreditosDetallados) creditosdetalladoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCreditosDetallados(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCreditosDetallados.setVisible((this.isVisibilidadCeldaNuevoCreditosDetallados && this.isPermisoNuevoCreditosDetallados));			
			this.jButtonDuplicarCreditosDetallados.setVisible((this.isVisibilidadCeldaDuplicarCreditosDetallados && this.isPermisoDuplicarCreditosDetallados));			
			this.jButtonCopiarCreditosDetallados.setVisible((this.isVisibilidadCeldaCopiarCreditosDetallados && this.isPermisoCopiarCreditosDetallados));
			this.jButtonVerFormCreditosDetallados.setVisible((this.isVisibilidadCeldaVerFormCreditosDetallados && this.isPermisoVerFormCreditosDetallados));
			
			this.jButtonAbrirOrderByCreditosDetallados.setVisible((this.isVisibilidadCeldaOrdenCreditosDetallados && this.isPermisoOrdenCreditosDetallados));			
			
			this.jButtonNuevoRelacionesCreditosDetallados.setVisible((this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados && this.isPermisoNuevoCreditosDetallados));			
			this.jButtonNuevoGuardarCambiosCreditosDetallados.setVisible((this.isVisibilidadCeldaNuevoCreditosDetallados && this.isPermisoNuevoCreditosDetallados && this.isPermisoGuardarCambiosCreditosDetallados));
			
			if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonModificarCreditosDetallados.setVisible((this.isVisibilidadCeldaModificarCreditosDetallados && this.isPermisoActualizarCreditosDetallados));	
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonActualizarCreditosDetallados.setVisible((this.isVisibilidadCeldaActualizarCreditosDetallados && this.isPermisoActualizarCreditosDetallados));	
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonEliminarCreditosDetallados.setVisible((this.isVisibilidadCeldaEliminarCreditosDetallados && this.isPermisoEliminarCreditosDetallados));
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonCancelarCreditosDetallados.setVisible(this.isVisibilidadCeldaCancelarCreditosDetallados);							
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonGuardarCambiosCreditosDetallados.setVisible((this.isVisibilidadCeldaGuardarCreditosDetallados && this.isPermisoGuardarCambiosCreditosDetallados));			
			
			}
						
			this.jButtonGuardarCambiosTablaCreditosDetallados.setVisible((this.isVisibilidadCeldaGuardarCambiosCreditosDetallados && this.isPermisoGuardarCambiosCreditosDetallados));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCreditosDetallados.setVisible((this.isVisibilidadCeldaNuevoCreditosDetallados && this.isPermisoNuevoCreditosDetallados));						
			this.jButtonDuplicarToolBarCreditosDetallados.setVisible((this.isVisibilidadCeldaDuplicarCreditosDetallados && this.isPermisoDuplicarCreditosDetallados));						
			this.jButtonCopiarToolBarCreditosDetallados.setVisible((this.isVisibilidadCeldaCopiarCreditosDetallados && this.isPermisoCopiarCreditosDetallados));			
			this.jButtonVerFormToolBarCreditosDetallados.setVisible((this.isVisibilidadCeldaVerFormCreditosDetallados && this.isPermisoVerFormCreditosDetallados));			
			this.jButtonAbrirOrderByToolBarCreditosDetallados.setVisible((this.isVisibilidadCeldaOrdenCreditosDetallados && this.isPermisoOrdenCreditosDetallados));
			this.jButtonNuevoRelacionesToolBarCreditosDetallados.setVisible((this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados && this.isPermisoNuevoCreditosDetallados));			
			this.jButtonNuevoGuardarCambiosToolBarCreditosDetallados.setVisible((this.isVisibilidadCeldaNuevoCreditosDetallados && this.isPermisoNuevoCreditosDetallados && this.isPermisoGuardarCambiosCreditosDetallados));			
			
			if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonModificarToolBarCreditosDetallados.setVisible((this.isVisibilidadCeldaModificarCreditosDetallados && this.isPermisoActualizarCreditosDetallados));	
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonActualizarToolBarCreditosDetallados.setVisible((this.isVisibilidadCeldaActualizarCreditosDetallados  && this.isPermisoActualizarCreditosDetallados));	
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonEliminarToolBarCreditosDetallados.setVisible((this.isVisibilidadCeldaEliminarCreditosDetallados && this.isPermisoEliminarCreditosDetallados));
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonCancelarToolBarCreditosDetallados.setVisible(this.isVisibilidadCeldaCancelarCreditosDetallados);				
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonGuardarCambiosToolBarCreditosDetallados.setVisible((this.isVisibilidadCeldaGuardarCreditosDetallados && this.isPermisoGuardarCambiosCreditosDetallados));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCreditosDetallados.setVisible((this.isVisibilidadCeldaGuardarCambiosCreditosDetallados && this.isPermisoGuardarCambiosCreditosDetallados));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCreditosDetallados.setVisible((this.isVisibilidadCeldaNuevoCreditosDetallados && this.isPermisoNuevoCreditosDetallados));			
			this.jMenuItemDuplicarCreditosDetallados.setVisible((this.isVisibilidadCeldaDuplicarCreditosDetallados && this.isPermisoDuplicarCreditosDetallados));			
			this.jMenuItemCopiarCreditosDetallados.setVisible((this.isVisibilidadCeldaCopiarCreditosDetallados && this.isPermisoCopiarCreditosDetallados));			
			this.jMenuItemVerFormCreditosDetallados.setVisible((this.isVisibilidadCeldaVerFormCreditosDetallados && this.isPermisoVerFormCreditosDetallados));			
			this.jMenuItemAbrirOrderByCreditosDetallados.setVisible((this.isVisibilidadCeldaOrdenCreditosDetallados && this.isPermisoOrdenCreditosDetallados));			
			//this.jMenuItemMostrarOcultarCreditosDetallados.setVisible((this.isVisibilidadCeldaOrdenCreditosDetallados && this.isPermisoOrdenCreditosDetallados));
			this.jMenuItemDetalleAbrirOrderByCreditosDetallados.setVisible((this.isVisibilidadCeldaOrdenCreditosDetallados && this.isPermisoOrdenCreditosDetallados));			
			//this.jMenuItemDetalleMostrarOcultarCreditosDetallados.setVisible((this.isVisibilidadCeldaOrdenCreditosDetallados && this.isPermisoOrdenCreditosDetallados));			
			this.jMenuItemNuevoRelacionesCreditosDetallados.setVisible((this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados && this.isPermisoNuevoCreditosDetallados));			
			this.jMenuItemNuevoGuardarCambiosCreditosDetallados.setVisible((this.isVisibilidadCeldaNuevoCreditosDetallados && this.isPermisoNuevoCreditosDetallados && this.isPermisoGuardarCambiosCreditosDetallados));									
			
			if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
			this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemModificarCreditosDetallados.setVisible((this.isVisibilidadCeldaModificarCreditosDetallados && this.isPermisoActualizarCreditosDetallados));	
			this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemActualizarCreditosDetallados.setVisible((this.isVisibilidadCeldaActualizarCreditosDetallados && this.isPermisoActualizarCreditosDetallados));	
			this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemEliminarCreditosDetallados.setVisible((this.isVisibilidadCeldaEliminarCreditosDetallados && this.isPermisoEliminarCreditosDetallados));
			this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemCancelarCreditosDetallados.setVisible(this.isVisibilidadCeldaCancelarCreditosDetallados);				
			}
			
			this.jMenuItemGuardarCambiosCreditosDetallados.setVisible((this.isVisibilidadCeldaGuardarCreditosDetallados && this.isPermisoGuardarCambiosCreditosDetallados));						
			this.jMenuItemGuardarCambiosTablaCreditosDetallados.setVisible((this.isVisibilidadCeldaGuardarCambiosCreditosDetallados && this.isPermisoGuardarCambiosCreditosDetallados));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCreditosDetallados=this.jButtonNuevoCreditosDetallados.isVisible();
			this.isVisibilidadCeldaDuplicarCreditosDetallados=this.jButtonDuplicarCreditosDetallados.isVisible();
			this.isVisibilidadCeldaCopiarCreditosDetallados=this.jButtonCopiarCreditosDetallados.isVisible();
			this.isVisibilidadCeldaVerFormCreditosDetallados=this.jButtonVerFormCreditosDetallados.isVisible();
			
			this.isVisibilidadCeldaOrdenCreditosDetallados=this.jButtonAbrirOrderByCreditosDetallados.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados=this.jButtonNuevoRelacionesCreditosDetallados.isVisible();
			this.isVisibilidadCeldaModificarCreditosDetallados=this.jButtonModificarCreditosDetallados.isVisible();
			
			if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
			this.isVisibilidadCeldaActualizarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jButtonActualizarCreditosDetallados.isVisible();
			this.isVisibilidadCeldaEliminarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jButtonEliminarCreditosDetallados.isVisible();
			this.isVisibilidadCeldaCancelarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jButtonCancelarCreditosDetallados.isVisible();
			this.isVisibilidadCeldaGuardarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jButtonGuardarCambiosCreditosDetallados.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCreditosDetallados=this.jButtonGuardarCambiosTablaCreditosDetallados.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCreditosDetallados=this.jButtonNuevoToolBarCreditosDetallados.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados=this.jButtonNuevoRelacionesToolBarCreditosDetallados.isVisible();
			
			if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
			this.isVisibilidadCeldaModificarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jButtonModificarToolBarCreditosDetallados.isVisible();
			this.isVisibilidadCeldaActualizarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jButtonActualizarToolBarCreditosDetallados.isVisible();
			this.isVisibilidadCeldaEliminarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jButtonEliminarToolBarCreditosDetallados.isVisible();
			this.isVisibilidadCeldaCancelarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jButtonCancelarToolBarCreditosDetallados.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCreditosDetallados=this.jButtonGuardarCambiosToolBarCreditosDetallados.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCreditosDetallados=this.jButtonGuardarCambiosTablaToolBarCreditosDetallados.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCreditosDetallados=this.jMenuItemNuevoCreditosDetallados.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados=this.jMenuItemNuevoRelacionesCreditosDetallados.isVisible();
			
			if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
			this.isVisibilidadCeldaModificarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemModificarCreditosDetallados.isVisible();
			this.isVisibilidadCeldaActualizarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemActualizarCreditosDetallados.isVisible();
			this.isVisibilidadCeldaEliminarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemEliminarCreditosDetallados.isVisible();
			this.isVisibilidadCeldaCancelarCreditosDetallados=this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemCancelarCreditosDetallados.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCreditosDetallados=this.jMenuItemGuardarCambiosCreditosDetallados.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCreditosDetallados=this.jMenuItemGuardarCambiosTablaCreditosDetallados.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCreditosDetallados(Boolean esInicializar) {
		if(CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.creditosdetalladosSessionBean.getConGuardarRelaciones()) {
				//if(this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCreditosDetallados();
			}
			
			this.inicializarActualizarBindingBotonesManualCreditosDetallados(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCreditosDetallados() {
		this.jButtonNuevoCreditosDetallados.setVisible(this.isPermisoNuevoCreditosDetallados);			
		this.jButtonDuplicarCreditosDetallados.setVisible(this.isPermisoDuplicarCreditosDetallados);			
		this.jButtonCopiarCreditosDetallados.setVisible(this.isPermisoCopiarCreditosDetallados);			
		this.jButtonVerFormCreditosDetallados.setVisible(this.isPermisoVerFormCreditosDetallados);			
		
		this.jButtonAbrirOrderByCreditosDetallados.setVisible(this.isPermisoOrdenCreditosDetallados);					
		
		this.jButtonNuevoRelacionesCreditosDetallados.setVisible(this.isPermisoNuevoCreditosDetallados);			
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonModificarCreditosDetallados.setVisible(this.isPermisoActualizarCreditosDetallados);	
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonActualizarCreditosDetallados.setVisible(this.isPermisoActualizarCreditosDetallados);	
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonEliminarCreditosDetallados.setVisible(this.isPermisoEliminarCreditosDetallados);
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonCancelarCreditosDetallados.setVisible(this.isVisibilidadCeldaCancelarCreditosDetallados);						
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonGuardarCambiosCreditosDetallados.setVisible(this.isPermisoGuardarCambiosCreditosDetallados);							
		}
		
		this.jButtonGuardarCambiosTablaCreditosDetallados.setVisible(this.isPermisoActualizarCreditosDetallados);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCreditosDetallados() {
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonModificarCreditosDetallados.setVisible(this.isPermisoActualizarCreditosDetallados);	
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonActualizarCreditosDetallados.setVisible(this.isPermisoActualizarCreditosDetallados);	
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonEliminarCreditosDetallados.setVisible(this.isPermisoEliminarCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonCancelarCreditosDetallados.setVisible(this.isVisibilidadCeldaCancelarCreditosDetallados);							
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonGuardarCambiosCreditosDetallados.setVisible((this.isVisibilidadCeldaGuardarCreditosDetallados && this.isPermisoGuardarCambiosCreditosDetallados));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCreditosDetallados() {
		if(CreditosDetalladosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCreditosDetallados();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCreditosDetallados() {
	}
	
	public void jTableDatosCreditosDetalladosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCreditosDetallados(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.creditosdetallados.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cargoCreditosDetalladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocargo=true;

			idTienePermisocargo=this.tienePermisosUsuarioEnPaginaWebCreditosDetallados(CargoConstantesFunciones.CLASSNAME);

			if(idTienePermisocargo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCreditosDetallados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCreditosDetallados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);

				this.cargoBeanSwingJInternalFrame=new CargoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cargoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cargoBeanSwingJInternalFrame.getCargoLogic().setConnexion(this.creditosdetalladosLogic.getConnexion());

				if(this.creditosdetallados.getid_cargo()!=null) {
					this.cargoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cargoBeanSwingJInternalFrame.setIdActual(this.creditosdetallados.getid_cargo());
					this.cargoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cargoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargo();
				}

				JInternalFrameBase jinternalFrame =this.cargoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCreditosDetallados=(TitledBorder)this.jScrollPanelDatosCreditosDetallados.getBorder();
				TitledBorder titledBordercargo=(TitledBorder)this.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.getBorder();

				titledBordercargo.setTitle(titledBorderCreditosDetallados.getTitle() + " -> Cargo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cargoCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getid_cargo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cargo = "+this.creditosdetallados.getid_cargo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraCreditosDetalladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebCreditosDetallados(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCreditosDetallados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCreditosDetallados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.creditosdetalladosLogic.getConnexion());

				if(this.creditosdetallados.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.creditosdetallados.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCreditosDetallados=(TitledBorder)this.jScrollPanelDatosCreditosDetallados.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderCreditosDetallados.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.creditosdetallados.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCreditosDetalladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCreditosDetallados(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCreditosDetallados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCreditosDetallados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.creditosdetalladosLogic.getConnexion());

				if(this.creditosdetallados.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.creditosdetallados.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCreditosDetallados=(TitledBorder)this.jScrollPanelDatosCreditosDetallados.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCreditosDetallados.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.creditosdetallados.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoCreditosDetalladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebCreditosDetallados(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCreditosDetallados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCreditosDetallados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.creditosdetalladosLogic.getConnexion());

				if(this.creditosdetallados.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.creditosdetallados.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCreditosDetallados=(TitledBorder)this.jScrollPanelDatosCreditosDetallados.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderCreditosDetallados.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.creditosdetallados.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_prestamoCreditosDetalladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoprestamo=true;

			idTienePermisotipoprestamo=this.tienePermisosUsuarioEnPaginaWebCreditosDetallados(TipoPrestamoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoprestamo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCreditosDetallados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCreditosDetallados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);

				this.tipoprestamoBeanSwingJInternalFrame=new TipoPrestamoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoprestamoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoprestamoBeanSwingJInternalFrame.getTipoPrestamoLogic().setConnexion(this.creditosdetalladosLogic.getConnexion());

				if(this.creditosdetallados.getid_tipo_prestamo()!=null) {
					this.tipoprestamoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoprestamoBeanSwingJInternalFrame.setIdActual(this.creditosdetallados.getid_tipo_prestamo());
					this.tipoprestamoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoprestamoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoprestamoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoPrestamo();
				}

				JInternalFrameBase jinternalFrame =this.tipoprestamoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCreditosDetallados=(TitledBorder)this.jScrollPanelDatosCreditosDetallados.getBorder();
				TitledBorder titledBordertipoprestamo=(TitledBorder)this.tipoprestamoBeanSwingJInternalFrame.jScrollPanelDatosTipoPrestamo.getBorder();

				titledBordertipoprestamo.setTitle(titledBorderCreditosDetallados.getTitle() + " -> Tipo Prestamo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_prestamoCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getid_tipo_prestamo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_prestamo = "+this.creditosdetallados.getid_tipo_prestamo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimiento_desdeCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getfecha_vencimiento_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento_desde = '"+Funciones2.getStringPostgresDate(this.creditosdetallados.getfecha_vencimiento_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimiento_hastaCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getfecha_vencimiento_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento_hasta = '"+Funciones2.getStringPostgresDate(this.creditosdetallados.getfecha_vencimiento_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.creditosdetallados.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.creditosdetallados.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_tipo_prestamoCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getcodigo_tipo_prestamo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_tipo_prestamo like '%"+this.creditosdetallados.getcodigo_tipo_prestamo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_prestamoCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getcodigo_prestamo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_prestamo like '%"+this.creditosdetallados.getcodigo_prestamo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.creditosdetallados.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmontoCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getmonto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto = "+this.creditosdetallados.getmonto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cuotasCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getnumero_cuotas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cuotas = "+this.creditosdetallados.getnumero_cuotas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero = "+this.creditosdetallados.getnumero().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_capitalCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getmonto_capital()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_capital = "+this.creditosdetallados.getmonto_capital().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_interesCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getmonto_interes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_interes = "+this.creditosdetallados.getmonto_interes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.creditosdetallados.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldoCreditosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.getcreditosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditosdetallados==null) {
						this.creditosdetallados = new CreditosDetallados();
					}

					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);
				}

				if(this.creditosdetallados.getsaldo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo = "+this.creditosdetallados.getsaldo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCreditosDetalladosCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCreditosDetallados(false,false);

			this.getCreditosDetalladossBusquedaCreditosDetallados();

			this.inicializarActualizarBindingCreditosDetallados(false);

			//if(CreditosDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCreditosDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCargoCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCreditosDetallados(false,false);

			this.getCreditosDetalladossFK_IdCargo();

			this.inicializarActualizarBindingCreditosDetallados(false);

			//if(CreditosDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCreditosDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCreditosDetallados(false,false);

			this.getCreditosDetalladossFK_IdEmpleado();

			this.inicializarActualizarBindingCreditosDetallados(false);

			//if(CreditosDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCreditosDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCreditosDetallados(false,false);

			this.getCreditosDetalladossFK_IdEmpresa();

			this.inicializarActualizarBindingCreditosDetallados(false);

			//if(CreditosDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCreditosDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCreditosDetallados(false,false);

			this.getCreditosDetalladossFK_IdEstructura();

			this.inicializarActualizarBindingCreditosDetallados(false);

			//if(CreditosDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCreditosDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoPrestamoCreditosDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCreditosDetallados(false,false);

			this.getCreditosDetalladossFK_IdTipoPrestamo();

			this.inicializarActualizarBindingCreditosDetallados(false);

			//if(CreditosDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCreditosDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCreditosDetallados() {
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
			this.jInternalFrameDetalleFormCreditosDetallados.setVisible(false);	    			
			this.jInternalFrameDetalleFormCreditosDetallados.dispose();
			this.jInternalFrameDetalleFormCreditosDetallados=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCreditosDetallados!=null) {
			this.jInternalFrameReporteDinamicoCreditosDetallados.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCreditosDetallados.dispose();
			this.jInternalFrameReporteDinamicoCreditosDetallados=null;
		}
		
		if(this.jInternalFrameImportacionCreditosDetallados!=null) {
			this.jInternalFrameImportacionCreditosDetallados.setVisible(false);	    			
			this.jInternalFrameImportacionCreditosDetallados.dispose();
			this.jInternalFrameImportacionCreditosDetallados=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCreditosDetallados();
			
			CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
			
			
			if(sTipo.equals("NuevoCreditosDetallados")) {
				jButtonNuevoCreditosDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCreditosDetallados")) {
				jButtonDuplicarCreditosDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCreditosDetallados")) {
				jButtonCopiarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("VerFormCreditosDetallados")) {
				jButtonVerFormCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCreditosDetallados")) {
				jButtonNuevoCreditosDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCreditosDetallados")) {
				jButtonDuplicarCreditosDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCreditosDetallados")) {
				jButtonNuevoCreditosDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCreditosDetallados")) {
				jButtonDuplicarCreditosDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCreditosDetallados")) {
				jButtonNuevoCreditosDetalladosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCreditosDetallados")) {
				jButtonNuevoCreditosDetalladosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCreditosDetallados")) {
				jButtonNuevoCreditosDetalladosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCreditosDetallados")) {
				jButtonModificarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCreditosDetallados")) {
				jButtonModificarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCreditosDetallados")) {
				jButtonModificarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCreditosDetallados")) {
				jButtonActualizarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCreditosDetallados")) {
				jButtonActualizarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCreditosDetallados")) {
				jButtonActualizarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("EliminarCreditosDetallados")) {
				jButtonEliminarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCreditosDetallados")) {
				jButtonEliminarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCreditosDetallados")) {
				jButtonEliminarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CancelarCreditosDetallados")) {
				jButtonCancelarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCreditosDetallados")) {
				jButtonCancelarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCreditosDetallados")) {
				jButtonCancelarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CerrarCreditosDetallados")) {
				jButtonCerrarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCreditosDetallados")) {
				jButtonCerrarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCreditosDetallados")) {
				jButtonCerrarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCreditosDetallados")) {
				jButtonMostrarOcultarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCreditosDetallados")) {
				jButtonCancelarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCreditosDetallados")) {
				jButtonGuardarCambiosCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCreditosDetallados")) {
				jButtonGuardarCambiosCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCreditosDetallados")) {
				jButtonCopiarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCreditosDetallados")) {
				jButtonVerFormCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCreditosDetallados")) {
				jButtonGuardarCambiosCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCreditosDetallados")) {
				jButtonCopiarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCreditosDetallados")) {
				jButtonVerFormCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCreditosDetallados")) {
				jButtonGuardarCambiosCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCreditosDetallados")) {
				jButtonGuardarCambiosCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCreditosDetallados")) {
				jButtonGuardarCambiosCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCreditosDetallados")) {
				jButtonRecargarInformacionCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCreditosDetallados")) {
				jButtonRecargarInformacionCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCreditosDetallados")) {
				jButtonRecargarInformacionCreditosDetalladosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCreditosDetallados")) {
				jButtonAnterioresCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCreditosDetallados")) {
				jButtonAnterioresCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCreditosDetallados")) {
				jButtonAnterioresCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCreditosDetallados")) {
				jButtonSiguientesCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCreditosDetallados")) {
				jButtonSiguientesCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCreditosDetallados")) {
				jButtonSiguientesCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCreditosDetallados") || sTipo.equals("MenuItemDetalleAbrirOrderByCreditosDetallados")) {
				jButtonAbrirOrderByCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCreditosDetallados") || sTipo.equals("MenuItemDetalleMostrarOcultarCreditosDetallados")) {
				jButtonMostrarOcultarCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCreditosDetallados")) {
				jButtonNuevoGuardarCambiosCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCreditosDetallados")) {
				jButtonNuevoGuardarCambiosCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCreditosDetallados")) {
				jButtonNuevoGuardarCambiosCreditosDetalladosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCreditosDetallados")) {
				jButtonCerrarReporteDinamicoCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCreditosDetallados")) {
				jButtonGenerarReporteDinamicoCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCreditosDetallados")) {
				
				jButtonGenerarExcelReporteDinamicoCreditosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCreditosDetallados")) {
				jButtonCerrarImportacionCreditosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCreditosDetallados")) {
				
				jButtonGenerarImportacionCreditosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCreditosDetallados")) {
				
				jButtonAbrirImportacionCreditosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCreditosDetallados")) {
				jComboBoxTiposAccionesCreditosDetalladosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCreditosDetallados")) {
				jComboBoxTiposRelacionesCreditosDetalladosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCreditosDetallados")) {
				jComboBoxTiposAccionesCreditosDetalladosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCreditosDetallados")) {
				
				jComboBoxTiposSeleccionarCreditosDetalladosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCreditosDetallados")) {
				jTextFieldValorCampoGeneralCreditosDetalladosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCreditosDetallados")) {
				jButtonAbrirOrderByCreditosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCreditosDetallados")) {
				jButtonAbrirOrderByCreditosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCreditosDetallados")) {
				jButtonCerrarOrderByCreditosDetalladosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCreditosDetalladosBusqueda")) {
				this.jButtonidCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cargoCreditosDetalladosUpdate")) {
				this.jButtonid_cargoCreditosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cargoCreditosDetalladosBusqueda")) {
				this.jButtonid_cargoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraCreditosDetalladosUpdate")) {
				this.jButtonid_estructuraCreditosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraCreditosDetalladosBusqueda")) {
				this.jButtonid_estructuraCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCreditosDetalladosUpdate")) {
				this.jButtonid_empresaCreditosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCreditosDetalladosBusqueda")) {
				this.jButtonid_empresaCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoCreditosDetalladosUpdate")) {
				this.jButtonid_empleadoCreditosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoCreditosDetalladosBusqueda")) {
				this.jButtonid_empleadoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_prestamoCreditosDetalladosUpdate")) {
				this.jButtonid_tipo_prestamoCreditosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_prestamoCreditosDetalladosBusqueda")) {
				this.jButtonid_tipo_prestamoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimiento_desdeCreditosDetalladosBusqueda")) {
				this.jButtonfecha_vencimiento_desdeCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimiento_hastaCreditosDetalladosBusqueda")) {
				this.jButtonfecha_vencimiento_hastaCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCreditosDetalladosBusqueda")) {
				this.jButtoncodigoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCreditosDetalladosBusqueda")) {
				this.jButtonnombre_completoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_prestamoCreditosDetalladosBusqueda")) {
				this.jButtoncodigo_tipo_prestamoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_prestamoCreditosDetalladosBusqueda")) {
				this.jButtoncodigo_prestamoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCreditosDetalladosBusqueda")) {
				this.jButtonfechaCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoCreditosDetalladosBusqueda")) {
				this.jButtonmontoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuotasCreditosDetalladosBusqueda")) {
				this.jButtonnumero_cuotasCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroCreditosDetalladosBusqueda")) {
				this.jButtonnumeroCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_capitalCreditosDetalladosBusqueda")) {
				this.jButtonmonto_capitalCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_interesCreditosDetalladosBusqueda")) {
				this.jButtonmonto_interesCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorCreditosDetalladosBusqueda")) {
				this.jButtonvalorCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoCreditosDetalladosBusqueda")) {
				this.jButtonsaldoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCreditosDetalladosCreditosDetallados")) {
				this.jButtonBusquedaCreditosDetalladosCreditosDetalladosActionPerformed(evt);
			}
			
			;
			
			
			CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCreditosDetallados();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCreditosDetalladosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditosdetallados);
				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
				
				


				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CreditosDetallados creditosdetalladosLocal=null;
			
			if(!this.getEsControlTabla()) {
				creditosdetalladosLocal=this.creditosdetallados;
			} else {
				creditosdetalladosLocal=this.creditosdetalladosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditosdetallados);
				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
							
				
				


				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCreditosDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosAnterior =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.creditosdetalladosAnterior =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
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
			
			CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
			
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
			
			


			
			CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCreditosDetalladosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditosdetallados);
				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
								
						
				


				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosDetallados.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditosdetallados);
				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
								
				
				


				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCreditosDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosAnterior =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.creditosdetalladosAnterior =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditosdetallados);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCreditosDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosAnterior =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.creditosdetalladosAnterior =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCreditosDetalladosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.creditosdetallados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.creditosdetallados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditosdetallados);
				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
							
				
				


				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosDetallados.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCreditosDetalladosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetalladosAnterior =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.creditosdetalladosAnterior =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
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
			
			CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
			
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
			
			


			
			CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCreditosDetalladosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.creditosdetallados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.creditosdetallados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditosdetallados);
				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
								
				
				


				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCreditosDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosAnterior =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.creditosdetalladosAnterior =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCreditosDetalladosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.creditosdetallados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.creditosdetallados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCreditosDetalladosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditosdetallados);
				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCreditosDetallados")) {
					jCheckBoxSeleccionarTodosCreditosDetalladosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCreditosDetallados")) {
					jCheckBoxSeleccionadosCreditosDetalladosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCreditosDetallados")) {
					
				}
				
				


				
				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.creditosdetallados);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.creditosdetallados);
				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
												
				
				


				
				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCreditosDetalladosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditosdetalladosAnterior =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.creditosdetalladosAnterior =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCreditosDetalladosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditosdetallados);
				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
				
				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
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
			
			CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
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
			
			


			
			CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCreditosDetalladosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditosdetallados);
				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosDetallados.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosDetallados.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditosdetallados);
				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
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
				
				


				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosDetallados.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCreditosDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditosdetalladosAnterior =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.creditosdetalladosAnterior =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCreditosDetallados")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCreditosDetalladosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCreditosDetallados.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.creditosdetallados =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.creditosdetallados =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.creditosdetallados);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCreditosDetallados")) {
				
				}
				
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCreditosDetallados")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCreditosDetallados.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCreditosDetallados")) {
			
			}
			
			CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCreditosDetallados();
			
			CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
			
			if(sTipo.equals("NuevoCreditosDetallados")) {
				jButtonNuevoCreditosDetalladosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCreditosDetallados")) {
				jButtonDuplicarCreditosDetalladosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCreditosDetallados")) {
				jButtonCopiarCreditosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCreditosDetallados")) {
				jButtonVerFormCreditosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCreditosDetallados")) {
				jButtonNuevoCreditosDetalladosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCreditosDetallados")) {
				jButtonModificarCreditosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCreditosDetallados")) {
				jButtonActualizarCreditosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCreditosDetallados")) {
				jButtonEliminarCreditosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCreditosDetallados")) {
				jButtonGuardarCambiosCreditosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCreditosDetallados")) {
				jButtonCancelarCreditosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCreditosDetallados")) {
				jButtonCerrarCreditosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCreditosDetallados")) {
				jButtonGuardarCambiosCreditosDetalladosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCreditosDetallados")) {
				jButtonNuevoGuardarCambiosCreditosDetalladosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCreditosDetallados")) {
				jButtonAbrirOrderByCreditosDetalladosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCreditosDetallados")) {
				jButtonRecargarInformacionCreditosDetalladosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCreditosDetallados")) {
				jButtonAnterioresCreditosDetalladosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCreditosDetallados")) {
				jButtonSiguientesCreditosDetalladosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCreditosDetalladosBusqueda")) {
				this.jButtonidCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cargoCreditosDetalladosUpdate")) {
				this.jButtonid_cargoCreditosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cargoCreditosDetalladosBusqueda")) {
				this.jButtonid_cargoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraCreditosDetalladosUpdate")) {
				this.jButtonid_estructuraCreditosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraCreditosDetalladosBusqueda")) {
				this.jButtonid_estructuraCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCreditosDetalladosUpdate")) {
				this.jButtonid_empresaCreditosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCreditosDetalladosBusqueda")) {
				this.jButtonid_empresaCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoCreditosDetalladosUpdate")) {
				this.jButtonid_empleadoCreditosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoCreditosDetalladosBusqueda")) {
				this.jButtonid_empleadoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_prestamoCreditosDetalladosUpdate")) {
				this.jButtonid_tipo_prestamoCreditosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_prestamoCreditosDetalladosBusqueda")) {
				this.jButtonid_tipo_prestamoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimiento_desdeCreditosDetalladosBusqueda")) {
				this.jButtonfecha_vencimiento_desdeCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimiento_hastaCreditosDetalladosBusqueda")) {
				this.jButtonfecha_vencimiento_hastaCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCreditosDetalladosBusqueda")) {
				this.jButtoncodigoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCreditosDetalladosBusqueda")) {
				this.jButtonnombre_completoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_prestamoCreditosDetalladosBusqueda")) {
				this.jButtoncodigo_tipo_prestamoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_prestamoCreditosDetalladosBusqueda")) {
				this.jButtoncodigo_prestamoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCreditosDetalladosBusqueda")) {
				this.jButtonfechaCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoCreditosDetalladosBusqueda")) {
				this.jButtonmontoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuotasCreditosDetalladosBusqueda")) {
				this.jButtonnumero_cuotasCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroCreditosDetalladosBusqueda")) {
				this.jButtonnumeroCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_capitalCreditosDetalladosBusqueda")) {
				this.jButtonmonto_capitalCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_interesCreditosDetalladosBusqueda")) {
				this.jButtonmonto_interesCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorCreditosDetalladosBusqueda")) {
				this.jButtonvalorCreditosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoCreditosDetalladosBusqueda")) {
				this.jButtonsaldoCreditosDetalladosBusquedaActionPerformed(evt);
			}
			
			CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCreditosDetallados();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCreditosDetallados")) {
				closingInternalFrameCreditosDetallados();
				
			} else if(sTipo.equals("jButtonCancelarCreditosDetallados")) {
				JInternalFrameBase jInternalFrameDetalleFormCreditosDetallados = (JInternalFrameBase)evt.getSource();
	            	
	            CreditosDetalladosBeanSwingJInternalFrame jInternalFrameParent=(CreditosDetalladosBeanSwingJInternalFrame)jInternalFrameDetalleFormCreditosDetallados.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCreditosDetalladosActionPerformed(null);
			}
			
			CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.creditosdetallados,new Object(),this.creditosdetalladosParameterGeneral,this.creditosdetalladosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCreditosDetallados(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCreditosDetallados(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCreditosDetallados(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.creditosdetallados)) {
			if(!esControlTabla) {
				if(CreditosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);			
				}
				
				if(this.creditosdetalladosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCreditosDetallados(this.creditosdetallados,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCreditosDetallados(this.creditosdetalladosReturnGeneral,this.creditosdetalladosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.creditosdetalladosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCreditosDetallados(classes,this.creditosdetalladosReturnGeneral,this.creditosdetalladosBean,false);
					}
						
					if(this.creditosdetalladosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCreditosDetallados(this.creditosdetalladosReturnGeneral.getCreditosDetallados());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCreditosDetallados(this.creditosdetalladosReturnGeneral.getCreditosDetallados());	
					}
						
					if(this.creditosdetalladosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCreditosDetallados(this.creditosdetalladosReturnGeneral.getCreditosDetallados(),classes);//this.creditosdetalladosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCreditosDetallados(this.creditosdetallados,classes);//this.creditosdetalladosBean);									
				}
			
				if(CreditosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCreditosDetallados(this.creditosdetallados,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosDetallados(this.creditosdetallados);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.creditosdetalladosAnterior!=null) {
						this.creditosdetallados=this.creditosdetalladosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.creditosdetalladosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.creditosdetalladosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.creditosdetalladosReturnGeneral.getCreditosDetallados(),creditosdetalladosLogic.getCreditosDetalladoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.creditosdetalladosReturnGeneral.getCreditosDetallados(),this.creditosdetalladoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCreditosDetallados.repaint();
				
				//((AbstractTableModel) this.jTableDatosCreditosDetallados.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCreditosDetallados();
			}
		}
	}
	
	public void actualizarVisualTableDatosCreditosDetallados() throws Exception {
		
		CreditosDetalladosModel creditosdetalladosModel=(CreditosDetalladosModel)this.jTableDatosCreditosDetallados.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			creditosdetalladosModel.creditosdetalladoss=this.creditosdetalladosLogic.getCreditosDetalladoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			creditosdetalladosModel.creditosdetalladoss=this.creditosdetalladoss;
		}
		
		
		((CreditosDetalladosModel) this.jTableDatosCreditosDetallados.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCreditosDetallados() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcreditosdetalladosAnterior(),this.creditosdetalladosLogic.getCreditosDetalladoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcreditosdetalladosAnterior(),this.creditosdetalladoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCreditosDetallados();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCreditosDetallados(CreditosDetallados creditosdetallados,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
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
										
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.creditosdetallados,new Object(),generalEntityParameterGeneral,this.creditosdetalladosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.creditosdetalladosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CreditosDetalladosConstantesFunciones.getClassesRelationshipsOfCreditosDetallados(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CreditosDetalladosConstantesFunciones.getClassesRelationshipsFromStringsOfCreditosDetallados(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCreditosDetallados(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CreditosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.creditosdetallados,new Object(),generalEntityParameterGeneral,this.creditosdetalladosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCreditosDetallados(CreditosDetalladosBean creditosdetalladosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCreditosDetallados(ArrayList<Classe> classes,CreditosDetalladosReturnGeneral creditosdetalladosReturnGeneral,CreditosDetalladosBean creditosdetalladosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCreditosDetallados(CreditosDetallados creditosdetallados,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.creditosdetallados)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCreditosDetallados = new CreditosDetalladosDetalleFormJInternalFrame(jDesktopPane,this.creditosdetalladosSessionBean.getConGuardarRelaciones(),this.creditosdetalladosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.setVisible(false);
		this.jInternalFrameDetalleFormCreditosDetallados.setSelected(false);						
		
		this.jInternalFrameDetalleFormCreditosDetallados.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCreditosDetallados.creditosdetalladosLogic=this.creditosdetalladosLogic;
		
		this.cargarCombosFrameForeignKeyCreditosDetallados("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCreditosDetallados();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCreditosDetallados();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCreditosDetallados("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCreditosDetallados();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCreditosDetallados.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCreditosDetallados"));
		
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonModificarCreditosDetallados.addActionListener(new ButtonActionListener(this,"ModificarCreditosDetallados"));

		
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonModificarToolBarCreditosDetallados.addActionListener(new ButtonActionListener(this,"ModificarToolBarCreditosDetallados"));
					
		this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemModificarCreditosDetallados.addActionListener(new ButtonActionListener(this,"MenuItemModificarCreditosDetallados"));		
		
		
		
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonActualizarCreditosDetallados.addActionListener (new ButtonActionListener(this,"ActualizarCreditosDetallados"));
		
		
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonActualizarToolBarCreditosDetallados.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCreditosDetallados"));
						
		this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemActualizarCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCreditosDetallados"));		
		
		
		
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonEliminarCreditosDetallados.addActionListener (new ButtonActionListener(this,"EliminarCreditosDetallados"));
		
		
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonEliminarToolBarCreditosDetallados.addActionListener (new ButtonActionListener(this,"EliminarToolBarCreditosDetallados"));
								
		this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemEliminarCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCreditosDetallados"));		
		
		
		
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonCancelarCreditosDetallados.addActionListener (new ButtonActionListener(this,"CancelarCreditosDetallados"));
		
		
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonCancelarToolBarCreditosDetallados.addActionListener (new ButtonActionListener(this,"CancelarToolBarCreditosDetallados"));
					
		this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemCancelarCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCreditosDetallados"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemDetalleCerrarCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCreditosDetallados"));		
		
		
		
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonGuardarCambiosToolBarCreditosDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCreditosDetallados"));
		
		
		
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonGuardarCambiosToolBarCreditosDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCreditosDetallados"));
		
		
		
		this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxTiposAccionesFormularioCreditosDetallados.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCreditosDetallados"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonidCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"idCreditosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_cargoCreditosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_cargoCreditosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_cargoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_cargoCreditosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_estructuraCreditosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraCreditosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_estructuraCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraCreditosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_empresaCreditosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCreditosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_empresaCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCreditosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_empleadoCreditosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCreditosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_empleadoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCreditosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_tipo_prestamoCreditosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_prestamoCreditosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_tipo_prestamoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_prestamoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonfecha_vencimiento_desdeCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_desdeCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonfecha_vencimiento_hastaCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_hastaCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtoncodigoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonnombre_completoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtoncodigo_tipo_prestamoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_prestamoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtoncodigo_prestamoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_prestamoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonfechaCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fechaCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonmontoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"montoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonnumero_cuotasCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotasCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonnumeroCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numeroCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonmonto_capitalCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"monto_capitalCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonmonto_interesCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"monto_interesCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonvalorCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"valorCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonsaldoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"saldoCreditosDetalladosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCreditosDetallados.jTabbedPaneRelacionesCreditosDetallados.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCreditosDetallados"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCreditosDetallados"));
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosDetallados.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCreditosDetallados"));
		}
		
		this.jTableDatosCreditosDetallados.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCreditosDetallados"));
		
		this.jTableDatosCreditosDetallados.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCreditosDetallados"));
		
		this.jButtonNuevoCreditosDetallados.addActionListener(new ButtonActionListener(this,"NuevoCreditosDetallados"));
		
		this.jButtonDuplicarCreditosDetallados.addActionListener(new ButtonActionListener(this,"DuplicarCreditosDetallados"));
		
		this.jButtonCopiarCreditosDetallados.addActionListener(new ButtonActionListener(this,"CopiarCreditosDetallados"));
		
		this.jButtonVerFormCreditosDetallados.addActionListener(new ButtonActionListener(this,"VerFormCreditosDetallados"));
		
		
		this.jButtonNuevoToolBarCreditosDetallados.addActionListener(new ButtonActionListener(this,"NuevoToolBarCreditosDetallados"));
			
		this.jButtonDuplicarToolBarCreditosDetallados.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCreditosDetallados"));
			
		this.jMenuItemNuevoCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCreditosDetallados"));
			
		this.jMenuItemDuplicarCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCreditosDetallados"));		
		
		
		this.jButtonNuevoRelacionesCreditosDetallados.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCreditosDetallados"));
		
		
		this.jButtonNuevoRelacionesToolBarCreditosDetallados.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCreditosDetallados"));
			
		this.jMenuItemNuevoRelacionesCreditosDetallados.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCreditosDetallados"));		
		
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonModificarCreditosDetallados.addActionListener(new ButtonActionListener(this,"ModificarCreditosDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonModificarToolBarCreditosDetallados.addActionListener(new ButtonActionListener(this,"ModificarToolBarCreditosDetallados"));
			
			this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemModificarCreditosDetallados.addActionListener(new ButtonActionListener(this,"MenuItemModificarCreditosDetallados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonActualizarCreditosDetallados.addActionListener (new ButtonActionListener(this,"ActualizarCreditosDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonActualizarToolBarCreditosDetallados.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCreditosDetallados"));
				
			this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemActualizarCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCreditosDetallados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonEliminarCreditosDetallados.addActionListener (new ButtonActionListener(this,"EliminarCreditosDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonEliminarToolBarCreditosDetallados.addActionListener (new ButtonActionListener(this,"EliminarToolBarCreditosDetallados"));
						
			this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemEliminarCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCreditosDetallados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonCancelarCreditosDetallados.addActionListener (new ButtonActionListener(this,"CancelarCreditosDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonCancelarToolBarCreditosDetallados.addActionListener (new ButtonActionListener(this,"CancelarToolBarCreditosDetallados"));
			
			this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemCancelarCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCreditosDetallados"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCreditosDetallados.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCreditosDetallados"));		
		
		
		this.jButtonCerrarCreditosDetallados.addActionListener (new ButtonActionListener(this,"CerrarCreditosDetallados"));
		
		
		this.jButtonCerrarToolBarCreditosDetallados.addActionListener (new ButtonActionListener(this,"CerrarToolBarCreditosDetallados"));
			
		this.jMenuItemCerrarCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCreditosDetallados"));
			
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosDetallados.jMenuItemDetalleCerrarCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCreditosDetallados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonGuardarCambiosCreditosDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosCreditosDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosDetallados.jButtonGuardarCambiosToolBarCreditosDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCreditosDetallados"));
		}
		
		this.jButtonCopiarToolBarCreditosDetallados.addActionListener (new ButtonActionListener(this,"CopiarToolBarCreditosDetallados"));
			
		this.jButtonVerFormToolBarCreditosDetallados.addActionListener (new ButtonActionListener(this,"VerFormToolBarCreditosDetallados"));
		
		this.jMenuItemGuardarCambiosCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCreditosDetallados"));
			
		this.jMenuItemCopiarCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCreditosDetallados"));		
		
		this.jMenuItemVerFormCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCreditosDetallados"));		
		
		
		this.jButtonGuardarCambiosTablaCreditosDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCreditosDetallados"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCreditosDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCreditosDetallados"));
			
		this.jMenuItemGuardarCambiosTablaCreditosDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCreditosDetallados"));		
		
		
		
		this.jButtonRecargarInformacionCreditosDetallados.addActionListener (new ButtonActionListener(this,"RecargarInformacionCreditosDetallados"));
					
		this.jButtonRecargarInformacionToolBarCreditosDetallados.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCreditosDetallados"));
		
		this.jMenuItemRecargarInformacionCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCreditosDetallados"));		
		
		
		
		this.jButtonAnterioresCreditosDetallados.addActionListener (new ButtonActionListener(this,"AnterioresCreditosDetallados"));
		
		
		this.jButtonAnterioresToolBarCreditosDetallados.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCreditosDetallados"));
		
		this.jMenuItemAnterioresCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCreditosDetallados"));		
		
		
		this.jButtonSiguientesCreditosDetallados.addActionListener (new ButtonActionListener(this,"SiguientesCreditosDetallados"));
		
		
		this.jButtonSiguientesToolBarCreditosDetallados.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCreditosDetallados"));
			
		this.jMenuItemSiguientesCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCreditosDetallados"));
			
		this.jMenuItemAbrirOrderByCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCreditosDetallados"));
			
		this.jMenuItemMostrarOcultarCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCreditosDetallados"));
			
		this.jMenuItemDetalleAbrirOrderByCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCreditosDetallados"));
			
		this.jMenuItemDetalleMostarOcultarCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCreditosDetallados"));		
		
		
		this.jButtonNuevoGuardarCambiosCreditosDetallados.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCreditosDetallados"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCreditosDetallados.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCreditosDetallados"));
			
		this.jMenuItemNuevoGuardarCambiosCreditosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCreditosDetallados"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCreditosDetallados.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCreditosDetallados"));

		this.jCheckBoxSeleccionadosCreditosDetallados.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCreditosDetallados"));
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxTiposAccionesFormularioCreditosDetallados.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCreditosDetallados"));
		}
		
		
		this.jComboBoxTiposRelacionesCreditosDetallados.addActionListener (new ButtonActionListener(this,"TiposRelacionesCreditosDetallados"));
			
		this.jComboBoxTiposAccionesCreditosDetallados.addActionListener (new ButtonActionListener(this,"TiposAccionesCreditosDetallados"));
					
		this.jComboBoxTiposSeleccionarCreditosDetallados.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCreditosDetallados"));
			
		this.jTextFieldValorCampoGeneralCreditosDetallados.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCreditosDetallados"));		
		
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonidCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"idCreditosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_cargoCreditosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_cargoCreditosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_cargoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_cargoCreditosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_estructuraCreditosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraCreditosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_estructuraCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraCreditosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_empresaCreditosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCreditosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_empresaCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCreditosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_empleadoCreditosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCreditosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_empleadoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCreditosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_tipo_prestamoCreditosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_prestamoCreditosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_tipo_prestamoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_prestamoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonfecha_vencimiento_desdeCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_desdeCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonfecha_vencimiento_hastaCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_hastaCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtoncodigoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonnombre_completoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtoncodigo_tipo_prestamoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_prestamoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtoncodigo_prestamoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_prestamoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonfechaCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fechaCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonmontoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"montoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonnumero_cuotasCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotasCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonnumeroCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numeroCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonmonto_capitalCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"monto_capitalCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonmonto_interesCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"monto_interesCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonvalorCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"valorCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonsaldoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"saldoCreditosDetalladosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCreditosDetalladosCreditosDetallados.addActionListener(new ButtonActionListener(this,"BusquedaCreditosDetalladosCreditosDetallados"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCreditosDetallados!=null) {
				this.jInternalFrameReporteDinamicoCreditosDetallados.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCreditosDetallados"));
				this.jInternalFrameReporteDinamicoCreditosDetallados.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCreditosDetallados"));
				this.jInternalFrameReporteDinamicoCreditosDetallados.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCreditosDetallados"));
			}
			
			//this.jButtonCerrarReporteDinamicoCreditosDetallados.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCreditosDetallados"));				
			//this.jButtonGenerarReporteDinamicoCreditosDetallados.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCreditosDetallados"));
			//this.jButtonGenerarExcelReporteDinamicoCreditosDetallados.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCreditosDetallados"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCreditosDetallados!=null) {
				this.jInternalFrameImportacionCreditosDetallados.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCreditosDetallados"));
				this.jInternalFrameImportacionCreditosDetallados.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCreditosDetallados"));
				this.jInternalFrameImportacionCreditosDetallados.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCreditosDetallados"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCreditosDetallados.addActionListener (new ButtonActionListener(this,"AbrirOrderByCreditosDetallados"));
			
			this.jButtonAbrirOrderByToolBarCreditosDetallados.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCreditosDetallados"));			
			
			if(this.jInternalFrameOrderByCreditosDetallados!=null) {
				this.jInternalFrameOrderByCreditosDetallados.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCreditosDetallados"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosDetallados.jTabbedPaneRelacionesCreditosDetallados.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCreditosDetallados"));
		
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
            		closingInternalFrameCreditosDetallados();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCreditosDetallados.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCreditosDetallados = (JInternalFrameBase)event.getSource();
	            	
	            CreditosDetalladosBeanSwingJInternalFrame jInternalFrameParent=(CreditosDetalladosBeanSwingJInternalFrame)jInternalFrameDetalleFormCreditosDetallados.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCreditosDetalladosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCreditosDetallados.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCreditosDetalladosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCreditosDetallados.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCreditosDetallados.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCreditosDetalladosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCreditosDetalladosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCreditosDetalladosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCreditosDetallados";
		inputMap = this.jButtonNuevoCreditosDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCreditosDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCreditosDetalladosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCreditosDetalladosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCreditosDetalladosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCreditosDetalladosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCreditosDetallados";
		inputMap = this.jButtonNuevoRelacionesCreditosDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCreditosDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCreditosDetalladosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCreditosDetallados";
		inputMap = this.jButtonModificarCreditosDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCreditosDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCreditosDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCreditosDetallados";
		inputMap = this.jButtonActualizarCreditosDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCreditosDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCreditosDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCreditosDetallados";
		inputMap = this.jButtonEliminarCreditosDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCreditosDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCreditosDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCreditosDetallados";
		inputMap = this.jButtonCancelarCreditosDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCreditosDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCreditosDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCreditosDetallados";
		inputMap = this.jButtonCerrarCreditosDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCreditosDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCreditosDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonGuardarCambiosCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCreditosDetallados";
		inputMap = this.jInternalFrameDetalleFormCreditosDetallados.jButtonGuardarCambiosCreditosDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonGuardarCambiosCreditosDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCreditosDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCreditosDetallados.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCreditosDetalladosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCreditosDetallados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCreditosDetalladosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCreditosDetallados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCreditosDetalladosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCreditosDetallados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCreditosDetalladosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonidCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"idCreditosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_cargoCreditosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_cargoCreditosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_cargoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_cargoCreditosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_estructuraCreditosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraCreditosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_estructuraCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraCreditosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_empresaCreditosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCreditosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_empresaCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCreditosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_empleadoCreditosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCreditosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_empleadoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCreditosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_tipo_prestamoCreditosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_prestamoCreditosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonid_tipo_prestamoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_prestamoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonfecha_vencimiento_desdeCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_desdeCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonfecha_vencimiento_hastaCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_hastaCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtoncodigoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonnombre_completoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtoncodigo_tipo_prestamoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_prestamoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtoncodigo_prestamoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_prestamoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonfechaCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fechaCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonmontoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"montoCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonnumero_cuotasCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotasCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonnumeroCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numeroCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonmonto_capitalCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"monto_capitalCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonmonto_interesCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"monto_interesCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonvalorCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"valorCreditosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosDetallados.jButtonsaldoCreditosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"saldoCreditosDetalladosBusqueda"));
		
		
		this.jButtonBusquedaCreditosDetalladosCreditosDetallados.addActionListener(new ButtonActionListener(this,"BusquedaCreditosDetalladosCreditosDetallados"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCreditosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCreditosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCreditosDetalladosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCreditosDetallados.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCreditosDetallados(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CreditosDetallados creditosdetalladosAux:this.creditosdetalladosLogic.getCreditosDetalladoss()) {
					creditosdetalladosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CreditosDetallados creditosdetalladosAux:creditosdetalladoss) {
					creditosdetalladosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCreditosDetalladosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCreditosDetallados(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CreditosDetallados creditosdetalladosAux:this.creditosdetalladosLogic.getCreditosDetalladoss()) {
						creditosdetalladosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CreditosDetallados creditosdetalladosAux:creditosdetalladoss) {
						creditosdetalladosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CreditosDetallados creditosdetalladosAux:this.creditosdetalladosLogic.getCreditosDetalladoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CreditosDetallados creditosdetalladosAux:creditosdetalladoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCreditosDetallados(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCreditosDetallados.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCreditosDetallados.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCreditosDetalladosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCreditosDetallados(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCreditosDetallados.getSelectedRows();
			
			CreditosDetallados creditosdetalladosLocal=new CreditosDetallados();
			
			//this.seleccionarTodosCreditosDetallados(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					creditosdetalladosLocal =(CreditosDetallados) this.creditosdetalladosLogic.getCreditosDetalladoss().toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					creditosdetalladosLocal =(CreditosDetallados) this.creditosdetalladoss.toArray()[this.jTableDatosCreditosDetallados.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				creditosdetalladosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CreditosDetallados creditosdetalladosAux:this.creditosdetalladosLogic.getCreditosDetalladoss()) {
						creditosdetalladosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CreditosDetallados creditosdetalladosAux:creditosdetalladoss) {
						creditosdetalladosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCreditosDetallados(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCreditosDetallados.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCreditosDetallados.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCreditosDetallados,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCreditosDetalladosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCreditosDetalladosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCreditosDetalladosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCreditosDetallados(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCreditosDetallados.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CreditosDetallados creditosdetalladosAux:this.creditosdetalladosLogic.getCreditosDetalladoss()) {
				
						if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE)) {
							existe=true;
							creditosdetalladosAux.setfecha_vencimiento_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA)) {
							existe=true;
							creditosdetalladosAux.setfecha_vencimiento_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							creditosdetalladosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							creditosdetalladosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO)) {
							existe=true;
							creditosdetalladosAux.setcodigo_tipo_prestamo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO)) {
							existe=true;
							creditosdetalladosAux.setcodigo_prestamo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							creditosdetalladosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							creditosdetalladosAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS)) {
							existe=true;
							creditosdetalladosAux.setnumero_cuotas(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							creditosdetalladosAux.setnumero(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_MONTOCAPITAL)) {
							existe=true;
							creditosdetalladosAux.setmonto_capital(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_MONTOINTERES)) {
							existe=true;
							creditosdetalladosAux.setmonto_interes(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							creditosdetalladosAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							creditosdetalladosAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CreditosDetallados creditosdetalladosAux:creditosdetalladoss) {
					
						if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE)) {
							existe=true;
							creditosdetalladosAux.setfecha_vencimiento_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA)) {
							existe=true;
							creditosdetalladosAux.setfecha_vencimiento_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							creditosdetalladosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							creditosdetalladosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO)) {
							existe=true;
							creditosdetalladosAux.setcodigo_tipo_prestamo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO)) {
							existe=true;
							creditosdetalladosAux.setcodigo_prestamo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							creditosdetalladosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							creditosdetalladosAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS)) {
							existe=true;
							creditosdetalladosAux.setnumero_cuotas(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							creditosdetalladosAux.setnumero(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_MONTOCAPITAL)) {
							existe=true;
							creditosdetalladosAux.setmonto_capital(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_MONTOINTERES)) {
							existe=true;
							creditosdetalladosAux.setmonto_interes(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							creditosdetalladosAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							creditosdetalladosAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCreditosDetallados(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCreditosDetalladosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCreditosDetallados(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCreditosDetallados=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCreditosDetallados.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxTiposAccionesFormularioCreditosDetallados.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCreditosDetallados) {				
					conSplash=true;//false;										
					
					//this.startProcessCreditosDetallados(conSplash);
				
					this.generarReporteCreditosDetalladossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCreditosDetallados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxTiposAccionesFormularioCreditosDetallados.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCreditosDetalladossSeleccionados();
				//this.jComboBoxTiposAccionesCreditosDetallados.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCreditosDetalladossSeleccionados(false);
				//this.jComboBoxTiposAccionesCreditosDetallados.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCreditosDetalladossSeleccionados(true);
				//this.jComboBoxTiposAccionesCreditosDetallados.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCreditosDetallados();
				
				this.exportarCreditosDetalladossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCreditosDetallados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxTiposAccionesFormularioCreditosDetallados.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCreditosDetalladoss();
				//this.importarCreditosDetalladoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCreditosDetallados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxTiposAccionesFormularioCreditosDetallados.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCreditosDetallados();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCreditosDetalladossSeleccionados();
				//this.jComboBoxTiposAccionesCreditosDetallados.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Creditos Detallados", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCreditosDetallados();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCreditosDetallados)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCreditosDetallados(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Creditos Detallados",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCreditosDetallados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxTiposAccionesFormularioCreditosDetallados.setSelectedIndex(0);					
				}	
			} 			
			else if(CreditosDetalladosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCreditosDetallados) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCreditosDetallados(conSplash);
					
						//this.actualizarParametrosGeneralCreditosDetallados();
						
						this.generarReporteProcesoAccionCreditosDetalladossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCreditosDetallados.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxTiposAccionesFormularioCreditosDetallados.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CreditosDetalladosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Creditos DetalladosES SELECCIONADOS?", "MANTENIMIENTO DE Creditos Detallados", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCreditosDetallados();
				
						this.actualizarParametrosGeneralCreditosDetallados();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.creditosdetalladosReturnGeneral=creditosdetalladosLogic.procesarAccionCreditosDetalladossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.creditosdetalladosLogic.getCreditosDetalladoss(),this.creditosdetalladosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCreditosDetalladosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCreditosDetallados.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxTiposAccionesFormularioCreditosDetallados.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCreditosDetallados();
					
					CreditosDetalladosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCreditosDetalladosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCreditosDetallados.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxTiposAccionesFormularioCreditosDetallados.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCreditosDetallados(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCreditosDetalladosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCreditosDetallados();
			
			if(this.jInternalFrameDetalleFormCreditosDetallados==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CreditosDetallados> creditosdetalladossSeleccionados=new ArrayList<CreditosDetallados>();		
			CreditosDetallados creditosdetallados=new CreditosDetallados();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCreditosDetallados(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCreditosDetallados.getSelectedItem();
			
			
			
			
			creditosdetalladossSeleccionados=this.getCreditosDetalladossSeleccionados(true);
			//this.sTipoAccion;
			
			if(creditosdetalladossSeleccionados.size()==1) {
				for(CreditosDetallados creditosdetalladosAux:creditosdetalladossSeleccionados) {
					creditosdetallados=creditosdetalladosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCreditosDetallados();
			
      		//this.finishProcessCreditosDetallados(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCreditosDetalladosReturnGeneral() throws Exception {
		if(this.creditosdetalladosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.creditosdetalladosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.creditosdetalladosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.creditosdetalladosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.creditosdetalladosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.creditosdetalladosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCreditosDetallados(false);
		}
		
		if(this.creditosdetalladosReturnGeneral.getConRetornoLista() || this.creditosdetalladosReturnGeneral.getConRetornoObjeto()) {
			if(this.creditosdetalladosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.creditosdetalladosLogic.setCreditosDetalladoss(this.creditosdetalladosReturnGeneral.getCreditosDetalladoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCreditosDetallados(false);
		}
	}
	
	public void actualizarParametrosGeneralCreditosDetallados() throws Exception {
		
		
	}
	
	public ArrayList<CreditosDetallados> getCreditosDetalladossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CreditosDetallados> creditosdetalladossSeleccionados=new ArrayList<CreditosDetallados>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCreditosDetallados) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CreditosDetallados creditosdetalladosAux:creditosdetalladosLogic.getCreditosDetalladoss()) {
					if(creditosdetalladosAux.getIsSelected()) {
						creditosdetalladossSeleccionados.add(creditosdetalladosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CreditosDetallados creditosdetalladosAux:this.creditosdetalladoss) {
					if(creditosdetalladosAux.getIsSelected()) {
						creditosdetalladossSeleccionados.add(creditosdetalladosAux);				
					}
				}
			}
			
			if(creditosdetalladossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						creditosdetalladossSeleccionados.addAll(this.creditosdetalladosLogic.getCreditosDetalladoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						creditosdetalladossSeleccionados.addAll(this.creditosdetalladoss);				
					}
				}
			}
		} else {
			creditosdetalladossSeleccionados.add(this.creditosdetallados);
		}
		
		return creditosdetalladossSeleccionados;
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
	
	public void generarReporteCreditosDetalladossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCreditosDetalladossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCreditosDetalladossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCreditosDetalladossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCreditosDetalladossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Creditos Detallados",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCreditosDetalladossSeleccionados() throws Exception {
		ArrayList<CreditosDetallados> creditosdetalladossSeleccionados=new ArrayList<CreditosDetallados>();		
		
		creditosdetalladossSeleccionados=this.getCreditosDetalladossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCreditosDetalladoss("Todos",creditosdetalladossSeleccionados);
		
	}	
	
	public void generarReporteNormalCreditosDetalladossSeleccionados() throws Exception {
		ArrayList<CreditosDetallados> creditosdetalladossSeleccionados=new ArrayList<CreditosDetallados>();		
		
		creditosdetalladossSeleccionados=this.getCreditosDetalladossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCreditosDetalladoss("Todos",creditosdetalladossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCreditosDetalladossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CreditosDetallados> creditosdetalladossSeleccionados=new ArrayList<CreditosDetallados>();
		
		creditosdetalladossSeleccionados=this.getCreditosDetalladossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCreditosDetalladoss("Todos",creditosdetalladossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCreditosDetalladossSeleccionados() throws Exception {
		ArrayList<CreditosDetallados> creditosdetalladossSeleccionados=new ArrayList<CreditosDetallados>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCreditosDetallados();
		
		
		creditosdetalladossSeleccionados=this.getCreditosDetalladossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCreditosDetallados();
		
		
		//this.generarReporteCreditosDetalladoss("Todos",creditosdetalladossSeleccionados ,creditosdetalladosImplementable,creditosdetalladosImplementableHome);
	}
	
	public void mostrarImportacionCreditosDetalladoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCreditosDetallados();
		
		this.abrirFrameImportacionCreditosDetallados();		
		
			
		//this.generarReporteCreditosDetalladoss("Todos",creditosdetalladossSeleccionados ,creditosdetalladosImplementable,creditosdetalladosImplementableHome);
	}
	
	public void importarCreditosDetalladoss() throws Exception {		
	
	}
	
	public void exportarCreditosDetalladossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCreditosDetalladossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCreditosDetalladossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCreditosDetalladossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Creditos Detallados",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCreditosDetalladossSeleccionados() throws Exception {
		ArrayList<CreditosDetallados> creditosdetalladossSeleccionados=new ArrayList<CreditosDetallados>();		
		
		creditosdetalladossSeleccionados=this.getCreditosDetalladossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"creditosdetallados."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCreditosDetallados(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CreditosDetallados creditosdetalladosAux:creditosdetalladossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCreditosDetallados(creditosdetalladosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//creditosdetalladosAux.setsDetalleGeneralEntityReporte(creditosdetalladosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Creditos Detallados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCreditosDetallados(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_IDCARGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_IDTIPOPRESTAMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_MONTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_MONTOCAPITAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_MONTOINTERES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosDetalladosConstantesFunciones.LABEL_SALDO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCreditosDetallados(CreditosDetallados creditosdetallados,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=creditosdetallados.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getcargo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.gettipoprestamo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getfecha_vencimiento_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getfecha_vencimiento_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getcodigo_tipo_prestamo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getcodigo_prestamo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getmonto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getnumero_cuotas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getnumero().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getmonto_capital().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getmonto_interes().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditosdetallados.getsaldo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCreditosDetalladossSeleccionados() throws Exception {
		ArrayList<CreditosDetallados> creditosdetalladossSeleccionados=new ArrayList<CreditosDetallados>();		
		
		creditosdetalladossSeleccionados=this.getCreditosDetalladossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"creditosdetallados.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CreditosDetalladoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCreditosDetallados(row);				
				iRow++;
			}				
			
			for(CreditosDetallados creditosdetalladosAux:creditosdetalladossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCreditosDetallados(creditosdetalladosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Creditos Detallados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCreditosDetalladossSeleccionados() throws Exception {
		ArrayList<CreditosDetallados> creditosdetalladossSeleccionados=new ArrayList<CreditosDetallados>();		
		
		creditosdetalladossSeleccionados=this.getCreditosDetalladossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"creditosdetallados.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("creditosdetalladoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("creditosdetallados");
			//elementRoot.appendChild(element);
		
			for(CreditosDetallados creditosdetalladosAux:creditosdetalladossSeleccionados) {
				element = document.createElement("creditosdetallados");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCreditosDetallados(creditosdetalladosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Creditos Detallados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCreditosDetallados(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_IDCARGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_IDTIPOPRESTAMO);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_MONTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_MONTOCAPITAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_MONTOINTERES);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosDetalladosConstantesFunciones.LABEL_SALDO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCreditosDetallados(CreditosDetallados creditosdetallados,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getcargo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.gettipoprestamo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getfecha_vencimiento_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getfecha_vencimiento_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getcodigo_tipo_prestamo());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getcodigo_prestamo());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getmonto());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getnumero_cuotas());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getmonto_capital());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getmonto_interes());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(creditosdetallados.getsaldo());				
	}
	
	public void setFilaDatosExportarXmlCreditosDetallados(CreditosDetallados creditosdetallados,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CreditosDetalladosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(creditosdetallados.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CreditosDetalladosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(creditosdetallados.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcargo_descripcion = document.createElement(CreditosDetalladosConstantesFunciones.IDCARGO);
		elementcargo_descripcion.appendChild(document.createTextNode(creditosdetallados.getcargo_descripcion()));
		element.appendChild(elementcargo_descripcion);

		Element elementestructura_descripcion = document.createElement(CreditosDetalladosConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(creditosdetallados.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementempresa_descripcion = document.createElement(CreditosDetalladosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(creditosdetallados.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(CreditosDetalladosConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(creditosdetallados.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementtipoprestamo_descripcion = document.createElement(CreditosDetalladosConstantesFunciones.IDTIPOPRESTAMO);
		elementtipoprestamo_descripcion.appendChild(document.createTextNode(creditosdetallados.gettipoprestamo_descripcion()));
		element.appendChild(elementtipoprestamo_descripcion);

		Element elementfecha_vencimiento_desde = document.createElement(CreditosDetalladosConstantesFunciones.FECHAVENCIMIENTODESDE);
		elementfecha_vencimiento_desde.appendChild(document.createTextNode(creditosdetallados.getfecha_vencimiento_desde().toString().trim()));
		element.appendChild(elementfecha_vencimiento_desde);

		Element elementfecha_vencimiento_hasta = document.createElement(CreditosDetalladosConstantesFunciones.FECHAVENCIMIENTOHASTA);
		elementfecha_vencimiento_hasta.appendChild(document.createTextNode(creditosdetallados.getfecha_vencimiento_hasta().toString().trim()));
		element.appendChild(elementfecha_vencimiento_hasta);

		Element elementcodigo = document.createElement(CreditosDetalladosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(creditosdetallados.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_completo = document.createElement(CreditosDetalladosConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(creditosdetallados.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementcodigo_tipo_prestamo = document.createElement(CreditosDetalladosConstantesFunciones.CODIGOTIPOPRESTAMO);
		elementcodigo_tipo_prestamo.appendChild(document.createTextNode(creditosdetallados.getcodigo_tipo_prestamo().trim()));
		element.appendChild(elementcodigo_tipo_prestamo);

		Element elementcodigo_prestamo = document.createElement(CreditosDetalladosConstantesFunciones.CODIGOPRESTAMO);
		elementcodigo_prestamo.appendChild(document.createTextNode(creditosdetallados.getcodigo_prestamo().trim()));
		element.appendChild(elementcodigo_prestamo);

		Element elementfecha = document.createElement(CreditosDetalladosConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(creditosdetallados.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementmonto = document.createElement(CreditosDetalladosConstantesFunciones.MONTO);
		elementmonto.appendChild(document.createTextNode(creditosdetallados.getmonto().toString().trim()));
		element.appendChild(elementmonto);

		Element elementnumero_cuotas = document.createElement(CreditosDetalladosConstantesFunciones.NUMEROCUOTAS);
		elementnumero_cuotas.appendChild(document.createTextNode(creditosdetallados.getnumero_cuotas().toString().trim()));
		element.appendChild(elementnumero_cuotas);

		Element elementnumero = document.createElement(CreditosDetalladosConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(creditosdetallados.getnumero().toString().trim()));
		element.appendChild(elementnumero);

		Element elementmonto_capital = document.createElement(CreditosDetalladosConstantesFunciones.MONTOCAPITAL);
		elementmonto_capital.appendChild(document.createTextNode(creditosdetallados.getmonto_capital().toString().trim()));
		element.appendChild(elementmonto_capital);

		Element elementmonto_interes = document.createElement(CreditosDetalladosConstantesFunciones.MONTOINTERES);
		elementmonto_interes.appendChild(document.createTextNode(creditosdetallados.getmonto_interes().toString().trim()));
		element.appendChild(elementmonto_interes);

		Element elementvalor = document.createElement(CreditosDetalladosConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(creditosdetallados.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementsaldo = document.createElement(CreditosDetalladosConstantesFunciones.SALDO);
		elementsaldo.appendChild(document.createTextNode(creditosdetallados.getsaldo().toString().trim()));
		element.appendChild(elementsaldo);
	}
	
	public void generarReporteGroupGenericoCreditosDetalladossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CreditosDetallados> creditosdetalladossSeleccionados=new ArrayList<CreditosDetallados>();
		
		creditosdetalladossSeleccionados=this.getCreditosDetalladossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCreditosDetallados(creditosdetalladossSeleccionados);
		
		this.generarReporteCreditosDetalladoss("Todos",creditosdetalladossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCreditosDetallados(ArrayList<CreditosDetallados> creditosdetalladossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CreditosDetallados creditosdetalladosAux:creditosdetalladossSeleccionados) {
				creditosdetalladosAux.setsDetalleGeneralEntityReporte(creditosdetalladosAux.toString());
			
				if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_IDCARGO)) {
					existe=true;
					creditosdetalladosAux.setsDescripcionGeneralEntityReporte1(creditosdetalladosAux.getcargo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					creditosdetalladosAux.setsDescripcionGeneralEntityReporte1(creditosdetalladosAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					creditosdetalladosAux.setsDescripcionGeneralEntityReporte1(creditosdetalladosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					creditosdetalladosAux.setsDescripcionGeneralEntityReporte1(creditosdetalladosAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_IDTIPOPRESTAMO)) {
					existe=true;
					creditosdetalladosAux.setsDescripcionGeneralEntityReporte1(creditosdetalladosAux.gettipoprestamo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE)) {
					existe=true;
					creditosdetalladosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(creditosdetalladosAux.getfecha_vencimiento_desde()));
				}
				 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA)) {
					existe=true;
					creditosdetalladosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(creditosdetalladosAux.getfecha_vencimiento_hasta()));
				}
				 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					creditosdetalladosAux.setsDescripcionGeneralEntityReporte1(creditosdetalladosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					creditosdetalladosAux.setsDescripcionGeneralEntityReporte1(creditosdetalladosAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO)) {
					existe=true;
					creditosdetalladosAux.setsDescripcionGeneralEntityReporte1(creditosdetalladosAux.getcodigo_tipo_prestamo());
				}
				 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_CODIGOPRESTAMO)) {
					existe=true;
					creditosdetalladosAux.setsDescripcionGeneralEntityReporte1(creditosdetalladosAux.getcodigo_prestamo());
				}
				 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					creditosdetalladosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(creditosdetalladosAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_NUMEROCUOTAS)) {
					existe=true;
					creditosdetalladosAux.setsDescripcionGeneralEntityReporte1(creditosdetalladosAux.getnumero_cuotas().toString());
				}
				 else if(sTipoSeleccionar.equals(CreditosDetalladosConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					creditosdetalladosAux.setsDescripcionGeneralEntityReporte1(creditosdetalladosAux.getnumero().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCreditosDetallados(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCreditosDetallados=true;
				this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados=true;
				this.isVisibilidadCeldaGuardarCambiosCreditosDetallados=true;
			}
			
			this.isVisibilidadCeldaModificarCreditosDetallados=false;
			this.isVisibilidadCeldaActualizarCreditosDetallados=false;
			this.isVisibilidadCeldaEliminarCreditosDetallados=false;
			this.isVisibilidadCeldaCancelarCreditosDetallados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCreditosDetallados=true;
				} else {
					this.isVisibilidadCeldaGuardarCreditosDetallados=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCreditosDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCreditosDetallados=false;
			this.isVisibilidadCeldaModificarCreditosDetallados=false;
			this.isVisibilidadCeldaActualizarCreditosDetallados=true;
			this.isVisibilidadCeldaEliminarCreditosDetallados=false;
			this.isVisibilidadCeldaCancelarCreditosDetallados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCreditosDetallados=true;
				} else {
					this.isVisibilidadCeldaGuardarCreditosDetallados=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCreditosDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCreditosDetallados=false;
			this.isVisibilidadCeldaModificarCreditosDetallados=false;
			this.isVisibilidadCeldaActualizarCreditosDetallados=true;
			this.isVisibilidadCeldaEliminarCreditosDetallados=true;
			this.isVisibilidadCeldaCancelarCreditosDetallados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCreditosDetallados=true;
				} else {
					this.isVisibilidadCeldaGuardarCreditosDetallados=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCreditosDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCreditosDetallados=false;
			this.isVisibilidadCeldaModificarCreditosDetallados=false;
			this.isVisibilidadCeldaActualizarCreditosDetallados=true;
			this.isVisibilidadCeldaEliminarCreditosDetallados=false;
			this.isVisibilidadCeldaCancelarCreditosDetallados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCreditosDetallados=false;
				} else {
					this.isVisibilidadCeldaGuardarCreditosDetallados=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCreditosDetallados=true;
			this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados=true;
			this.isVisibilidadCeldaGuardarCambiosCreditosDetallados=true;
			this.isVisibilidadCeldaModificarCreditosDetallados=false;
			this.isVisibilidadCeldaActualizarCreditosDetallados=false;
			this.isVisibilidadCeldaEliminarCreditosDetallados=false;
			this.isVisibilidadCeldaCancelarCreditosDetallados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCreditosDetallados=true;
				} else {
					this.isVisibilidadCeldaGuardarCreditosDetallados=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCreditosDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCreditosDetallados=false;
			this.isVisibilidadCeldaActualizarCreditosDetallados=false;
			this.isVisibilidadCeldaEliminarCreditosDetallados=false;
			this.isVisibilidadCeldaCancelarCreditosDetallados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCreditosDetallados=false;
				} else {
					this.isVisibilidadCeldaGuardarCreditosDetallados=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCreditosDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCreditosDetallados=false;
			this.isVisibilidadCeldaModificarCreditosDetallados=true;
			this.isVisibilidadCeldaActualizarCreditosDetallados=false;
			this.isVisibilidadCeldaEliminarCreditosDetallados=false;
			this.isVisibilidadCeldaCancelarCreditosDetallados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCreditosDetallados=false;
				} else {
					this.isVisibilidadCeldaGuardarCreditosDetallados=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CreditosDetalladosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCreditosDetallados=true;
			this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados=true;
			this.isVisibilidadCeldaGuardarCambiosCreditosDetallados=true;
		} else {
			this.actualizarEstadoPanelsCreditosDetallados(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCreditosDetallados=false;
			//this.isVisibilidadCeldaVerFormCreditosDetallados=false;
			this.isVisibilidadCeldaDuplicarCreditosDetallados=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!creditosdetalladosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados=false;
		} else {
			this.isVisibilidadCeldaNuevoCreditosDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCreditosDetallados=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
			if(!creditosdetalladosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados=false;												
			}
			
			this.jButtonCerrarCreditosDetallados.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados=false;
		}
		
		if(!this.permiteMantenimiento(this.creditosdetallados)) {
			this.isVisibilidadCeldaActualizarCreditosDetallados=false;
			this.isVisibilidadCeldaEliminarCreditosDetallados=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCreditosDetallados=false;
		this.isVisibilidadCeldaNuevoRelacionesCreditosDetallados=false;
		this.isVisibilidadCeldaGuardarCambiosCreditosDetallados=false;
		//this.isVisibilidadCeldaModificarCreditosDetallados=true;
		this.isVisibilidadCeldaActualizarCreditosDetallados=false;
		this.isVisibilidadCeldaEliminarCreditosDetallados=false;
		//this.isVisibilidadCeldaCancelarCreditosDetallados=true;			
		this.isVisibilidadCeldaGuardarCreditosDetallados=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCreditosDetallados() {
	}
	
	public void actualizarEstadoPanelsCreditosDetallados(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCreditosDetallados!=null) {
				this.jScrollPanelDatosEdicionCreditosDetallados.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCreditosDetallados!=null) {
				this.jTabbedPaneBusquedasCreditosDetallados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCreditosDetallados!=null) {
				this.jScrollPanelDatosCreditosDetallados.setVisible(true);
			}
			
			if(this.jPanelPaginacionCreditosDetallados!=null) {
				this.jPanelPaginacionCreditosDetallados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCreditosDetallados!=null) {
				this.jPanelParametrosReportesCreditosDetallados.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCreditosDetallados!=null) {
				this.jScrollPanelDatosEdicionCreditosDetallados.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCreditosDetallados!=null) {
				this.jTabbedPaneBusquedasCreditosDetallados.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCreditosDetallados!=null) {
				this.jScrollPanelDatosCreditosDetallados.setVisible(false);
			}
			
			if(this.jPanelPaginacionCreditosDetallados!=null) {
				this.jPanelPaginacionCreditosDetallados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCreditosDetallados!=null) {
				this.jPanelParametrosReportesCreditosDetallados.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCreditosDetallados!=null) {
				this.jScrollPanelDatosEdicionCreditosDetallados.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCreditosDetallados!=null) {
				this.jTabbedPaneBusquedasCreditosDetallados.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCreditosDetallados!=null) {
				this.jScrollPanelDatosCreditosDetallados.setVisible(false);
			}
			
			if(this.jPanelPaginacionCreditosDetallados!=null) {
				this.jPanelPaginacionCreditosDetallados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCreditosDetallados!=null) {
				this.jPanelParametrosReportesCreditosDetallados.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCreditosDetallados!=null) {
				this.jScrollPanelDatosEdicionCreditosDetallados.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCreditosDetallados!=null) {
				this.jTabbedPaneBusquedasCreditosDetallados.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCreditosDetallados!=null) {
				this.jScrollPanelDatosCreditosDetallados.setVisible(false);
			}
			
			if(this.jPanelPaginacionCreditosDetallados!=null) {
				this.jPanelPaginacionCreditosDetallados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCreditosDetallados!=null) {
				this.jPanelParametrosReportesCreditosDetallados.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCreditosDetallados!=null) {
				this.jScrollPanelDatosEdicionCreditosDetallados.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCreditosDetallados!=null) {
				this.jTabbedPaneBusquedasCreditosDetallados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCreditosDetallados!=null) {
				this.jScrollPanelDatosCreditosDetallados.setVisible(true);
			}
			
			if(this.jPanelPaginacionCreditosDetallados!=null) {
				this.jPanelPaginacionCreditosDetallados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCreditosDetallados!=null) {
				this.jPanelParametrosReportesCreditosDetallados.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCreditosDetallados!=null) {
				this.jScrollPanelDatosEdicionCreditosDetallados.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCreditosDetallados!=null) {
				this.jTabbedPaneBusquedasCreditosDetallados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCreditosDetallados!=null) {
				this.jScrollPanelDatosCreditosDetallados.setVisible(true);
			}
			
			if(this.jPanelPaginacionCreditosDetallados!=null) {
				this.jPanelPaginacionCreditosDetallados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCreditosDetallados!=null) {
				this.jPanelParametrosReportesCreditosDetallados.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCreditosDetallados!=null) {
				this.jScrollPanelDatosEdicionCreditosDetallados.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCreditosDetallados!=null) {
				this.jTabbedPaneBusquedasCreditosDetallados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCreditosDetallados!=null) {
				this.jScrollPanelDatosCreditosDetallados.setVisible(true);
			}
			
			if(this.jPanelPaginacionCreditosDetallados!=null) {
				this.jPanelPaginacionCreditosDetallados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCreditosDetallados!=null) {
				this.jPanelParametrosReportesCreditosDetallados.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCreditosDetallados!=null) {
					this.jTabbedPaneBusquedasCreditosDetallados.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCreditosDetallados!=null) {
				this.jPanelParametrosReportesCreditosDetallados.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.creditosdetalladosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCreditosDetallados!=null) {
				this.jTabbedPaneBusquedasCreditosDetallados.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCreditosDetallados!=null) {
				this.jPanelParametrosReportesCreditosDetallados.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCargo(Boolean isParaCargo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCargoNegation=!isParaCargo;

			this.isVisibilidadBusquedaCreditosDetallados=isParaCargo;
			if(!this.isVisibilidadBusquedaCreditosDetallados) {this.jTabbedPaneBusquedasCreditosDetallados.remove(jPanelBusquedaCreditosDetalladosCreditosDetallados);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadBusquedaCreditosDetallados=isParaEstructura;
			if(!this.isVisibilidadBusquedaCreditosDetallados) {this.jTabbedPaneBusquedasCreditosDetallados.remove(jPanelBusquedaCreditosDetalladosCreditosDetallados);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCreditosDetallados=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCreditosDetallados) {this.jTabbedPaneBusquedasCreditosDetallados.remove(jPanelBusquedaCreditosDetalladosCreditosDetallados);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadBusquedaCreditosDetallados=isParaEmpleado;
			if(!this.isVisibilidadBusquedaCreditosDetallados) {this.jTabbedPaneBusquedasCreditosDetallados.remove(jPanelBusquedaCreditosDetalladosCreditosDetallados);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoPrestamo(Boolean isParaTipoPrestamo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoPrestamoNegation=!isParaTipoPrestamo;

			this.isVisibilidadBusquedaCreditosDetallados=isParaTipoPrestamo;
			if(!this.isVisibilidadBusquedaCreditosDetallados) {this.jTabbedPaneBusquedasCreditosDetallados.remove(jPanelBusquedaCreditosDetalladosCreditosDetallados);}
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
			
			this.inicializarActualizarBindingTablaCreditosDetallados(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCreditosDetallados() {
		this.updateBorderResaltarBusquedasFormularioCreditosDetallados();
		this.updateVisibilidadBusquedasFormularioCreditosDetallados();
		this.updateHabilitarBusquedasFormularioCreditosDetallados();
	}
	
	public void updateBorderResaltarBusquedasFormularioCreditosDetallados() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCreditosDetallados.getComponents().length>0) {
	

		if(this.creditosdetalladosConstantesFunciones.resaltarBusquedaCreditosDetalladosCreditosDetallados!=null) {
			index= this.jTabbedPaneBusquedasCreditosDetallados.indexOfComponent(this.jPanelBusquedaCreditosDetalladosCreditosDetallados);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCreditosDetallados.getComponent(index);
				jPanel.setBorder(this.creditosdetalladosConstantesFunciones.resaltarBusquedaCreditosDetalladosCreditosDetallados);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCreditosDetallados() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCreditosDetallados.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCreditosDetallados.indexOfComponent(this.jPanelBusquedaCreditosDetalladosCreditosDetallados);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCreditosDetallados.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.creditosdetalladosConstantesFunciones.mostrarBusquedaCreditosDetalladosCreditosDetallados);
			if(!this.creditosdetalladosConstantesFunciones.mostrarBusquedaCreditosDetalladosCreditosDetallados && index>-1) {
				this.jTabbedPaneBusquedasCreditosDetallados.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCreditosDetallados() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCreditosDetallados.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCreditosDetallados.indexOfComponent(this.jPanelBusquedaCreditosDetalladosCreditosDetallados);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCreditosDetallados.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.creditosdetalladosConstantesFunciones.activarBusquedaCreditosDetalladosCreditosDetallados);
				this.jTabbedPaneBusquedasCreditosDetallados.setEnabledAt(index,this.creditosdetalladosConstantesFunciones.activarBusquedaCreditosDetalladosCreditosDetallados);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCreditosDetallados(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCreditosDetallados")) {
			index= this.jTabbedPaneBusquedasCreditosDetallados.indexOfComponent(this.jPanelBusquedaCreditosDetalladosCreditosDetallados);

			this.jTabbedPaneBusquedasCreditosDetallados.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCreditosDetallados.getComponent(index);

			this.creditosdetalladosConstantesFunciones.setResaltarBusquedaCreditosDetalladosCreditosDetallados(resaltar);

			jPanel.setBorder(this.creditosdetalladosConstantesFunciones.resaltarBusquedaCreditosDetalladosCreditosDetallados);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCreditosDetallados.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCreditosDetallados() throws Exception {

		if(this.jInternalFrameDetalleFormCreditosDetallados==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCreditosDetallados();
		this.updateVisibilidadResaltarControlesFormularioCreditosDetallados();
		this.updateHabilitarResaltarControlesFormularioCreditosDetallados();
		
	}
	
	public void updateBorderResaltarControlesFormularioCreditosDetallados() throws Exception {
		if(this.jInternalFrameDetalleFormCreditosDetallados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.creditosdetalladosConstantesFunciones.resaltaridCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jLabelidCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltaridCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarid_cargoCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_cargoCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarid_cargoCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarid_estructuraCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_estructuraCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarid_estructuraCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarid_empresaCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empresaCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarid_empresaCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarid_empleadoCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empleadoCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarid_empleadoCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarid_tipo_prestamoCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_tipo_prestamoCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarid_tipo_prestamoCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarfecha_vencimiento_desdeCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jDateChooserfecha_vencimiento_desdeCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarfecha_vencimiento_desdeCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarfecha_vencimiento_hastaCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jDateChooserfecha_vencimiento_hastaCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarfecha_vencimiento_hastaCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarcodigoCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigoCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarcodigoCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarnombre_completoCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jTextAreanombre_completoCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarnombre_completoCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarcodigo_tipo_prestamoCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigo_tipo_prestamoCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarcodigo_tipo_prestamoCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarcodigo_prestamoCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigo_prestamoCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarcodigo_prestamoCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarfechaCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jDateChooserfechaCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarfechaCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarmontoCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmontoCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarmontoCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarnumero_cuotasCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldnumero_cuotasCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarnumero_cuotasCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarnumeroCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldnumeroCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarnumeroCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarmonto_capitalCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmonto_capitalCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarmonto_capitalCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarmonto_interesCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmonto_interesCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarmonto_interesCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarvalorCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldvalorCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarvalorCreditosDetallados);}
		if(this.creditosdetalladosConstantesFunciones.resaltarsaldoCreditosDetallados!=null && this.jInternalFrameDetalleFormCreditosDetallados!=null) {this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldsaldoCreditosDetallados.setBorder(this.creditosdetalladosConstantesFunciones.resaltarsaldoCreditosDetallados);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCreditosDetallados() throws Exception {		
		if(this.jInternalFrameDetalleFormCreditosDetallados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
	
		//this.jInternalFrameDetalleFormCreditosDetallados.jLabelidCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostraridCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelidCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostraridCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_cargoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarid_cargoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelid_cargoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarid_cargoCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_estructuraCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarid_estructuraCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelid_estructuraCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarid_estructuraCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empresaCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarid_empresaCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelid_empresaCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarid_empresaCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empleadoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarid_empleadoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelid_empleadoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarid_empleadoCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_tipo_prestamoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarid_tipo_prestamoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelid_tipo_prestamoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarid_tipo_prestamoCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jDateChooserfecha_vencimiento_desdeCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarfecha_vencimiento_desdeCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelfecha_vencimiento_desdeCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarfecha_vencimiento_desdeCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jDateChooserfecha_vencimiento_hastaCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarfecha_vencimiento_hastaCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelfecha_vencimiento_hastaCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarfecha_vencimiento_hastaCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarcodigoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelcodigoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarcodigoCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jTextAreanombre_completoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarnombre_completoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelnombre_completoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarnombre_completoCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigo_tipo_prestamoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarcodigo_tipo_prestamoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelcodigo_tipo_prestamoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarcodigo_tipo_prestamoCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigo_prestamoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarcodigo_prestamoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelcodigo_prestamoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarcodigo_prestamoCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jDateChooserfechaCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarfechaCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelfechaCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarfechaCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmontoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarmontoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelmontoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarmontoCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldnumero_cuotasCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarnumero_cuotasCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelnumero_cuotasCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarnumero_cuotasCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldnumeroCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarnumeroCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelnumeroCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarnumeroCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmonto_capitalCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarmonto_capitalCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelmonto_capitalCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarmonto_capitalCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmonto_interesCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarmonto_interesCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelmonto_interesCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarmonto_interesCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldvalorCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarvalorCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelvalorCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarvalorCreditosDetallados);
		//this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldsaldoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarsaldoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jPanelsaldoCreditosDetallados.setVisible(this.creditosdetalladosConstantesFunciones.mostrarsaldoCreditosDetallados);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCreditosDetallados() throws Exception {
		if(this.jInternalFrameDetalleFormCreditosDetallados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCreditosDetallados!=null) {
	
		this.jInternalFrameDetalleFormCreditosDetallados.jLabelidCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activaridCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_cargoCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarid_cargoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_estructuraCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarid_estructuraCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empresaCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarid_empresaCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_empleadoCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarid_empleadoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jComboBoxid_tipo_prestamoCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarid_tipo_prestamoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jDateChooserfecha_vencimiento_desdeCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarfecha_vencimiento_desdeCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jDateChooserfecha_vencimiento_hastaCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarfecha_vencimiento_hastaCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigoCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarcodigoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextAreanombre_completoCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarnombre_completoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigo_tipo_prestamoCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarcodigo_tipo_prestamoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldcodigo_prestamoCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarcodigo_prestamoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jDateChooserfechaCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarfechaCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmontoCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarmontoCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldnumero_cuotasCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarnumero_cuotasCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldnumeroCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarnumeroCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmonto_capitalCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarmonto_capitalCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldmonto_interesCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarmonto_interesCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldvalorCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarvalorCreditosDetallados);
		this.jInternalFrameDetalleFormCreditosDetallados.jTextFieldsaldoCreditosDetallados.setEnabled(this.creditosdetalladosConstantesFunciones.activarsaldoCreditosDetallados);
		}
	}
	
		
}