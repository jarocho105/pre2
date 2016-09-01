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

//import com.bydan.erp.cartera.util.CobrarClientesSaldosConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarClientesSaldosParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarClientesSaldosParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.CobrarClientesSaldosBean;
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
import com.bydan.erp.contabilidad.business.logic.*;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CobrarClientesSaldosBeanSwingJInternalFrame extends CobrarClientesSaldosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CobrarClientesSaldosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CobrarClientesSaldos> cobrarclientessaldosValidator = new ClassValidator<CobrarClientesSaldos>(CobrarClientesSaldos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CobrarClientesSaldos cobrarclientessaldos;	
	public CobrarClientesSaldos cobrarclientessaldosAux;
	public CobrarClientesSaldos cobrarclientessaldosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CobrarClientesSaldos cobrarclientessaldosTotales;
	public Long idCobrarClientesSaldosActual;
	public Long iIdNuevoCobrarClientesSaldos=0L;
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
	
	public Boolean isPermisoTodoCobrarClientesSaldos;
	public Boolean isPermisoNuevoCobrarClientesSaldos;
	public Boolean isPermisoActualizarCobrarClientesSaldos;
	public Boolean isPermisoActualizarOriginalCobrarClientesSaldos;
	public Boolean isPermisoEliminarCobrarClientesSaldos;
	public Boolean isPermisoGuardarCambiosCobrarClientesSaldos;
	public Boolean isPermisoConsultaCobrarClientesSaldos;
	public Boolean isPermisoBusquedaCobrarClientesSaldos;
	public Boolean isPermisoReporteCobrarClientesSaldos;
	public Boolean isPermisoPaginacionMedioCobrarClientesSaldos;
	public Boolean isPermisoPaginacionAltoCobrarClientesSaldos;
	public Boolean isPermisoPaginacionTodoCobrarClientesSaldos;
	public Boolean isPermisoCopiarCobrarClientesSaldos;
	public Boolean isPermisoVerFormCobrarClientesSaldos;
	public Boolean isPermisoDuplicarCobrarClientesSaldos;
	public Boolean isPermisoOrdenCobrarClientesSaldos;
	
	
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
	
	public CobrarClientesSaldosParameterReturnGeneral cobrarclientessaldosReturnGeneral;
	public CobrarClientesSaldosParameterReturnGeneral cobrarclientessaldosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCobrarClientesSaldos=false;
	public Boolean esParaAccionDesdeFormularioCobrarClientesSaldos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CobrarClientesSaldosSessionBeanAdditional cobrarclientessaldosSessionBeanAdditional=null;
	
	public CobrarClientesSaldosSessionBeanAdditional getCobrarClientesSaldosSessionBeanAdditional() {
		return this.cobrarclientessaldosSessionBeanAdditional;
	}
	
	public void setCobrarClientesSaldosSessionBeanAdditional(CobrarClientesSaldosSessionBeanAdditional cobrarclientessaldosSessionBeanAdditional) {
		try {
			this.cobrarclientessaldosSessionBeanAdditional=cobrarclientessaldosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CobrarClientesSaldosBeanSwingJInternalFrameAdditional cobrarclientessaldosBeanSwingJInternalFrameAdditional=null;
	//public class CobrarClientesSaldosBeanSwingJInternalFrame
	
	public CobrarClientesSaldosBeanSwingJInternalFrameAdditional getCobrarClientesSaldosBeanSwingJInternalFrameAdditional() {
		return this.cobrarclientessaldosBeanSwingJInternalFrameAdditional;
	}
	
	public void setCobrarClientesSaldosBeanSwingJInternalFrameAdditional(CobrarClientesSaldosBeanSwingJInternalFrameAdditional cobrarclientessaldosBeanSwingJInternalFrameAdditional) {
		try {
			this.cobrarclientessaldosBeanSwingJInternalFrameAdditional=cobrarclientessaldosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CobrarClientesSaldosLogic cobrarclientessaldosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CobrarClientesSaldos cobrarclientessaldosBean;
	public CobrarClientesSaldosConstantesFunciones cobrarclientessaldosConstantesFunciones;
	//public CobrarClientesSaldosParameterReturnGeneral cobrarclientessaldosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	
	//PARAMETROS
	
	
	//public List<CobrarClientesSaldos> cobrarclientessaldoss;	
	//public List<CobrarClientesSaldos> cobrarclientessaldossEliminados;
	//public List<CobrarClientesSaldos> cobrarclientessaldossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCobrarClientesSaldos=false;
	public Boolean isVisibilidadCeldaDuplicarCobrarClientesSaldos=true;
	public Boolean isVisibilidadCeldaCopiarCobrarClientesSaldos=true;
	public Boolean isVisibilidadCeldaVerFormCobrarClientesSaldos=true;
	public Boolean isVisibilidadCeldaOrdenCobrarClientesSaldos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos=false;
	public Boolean isVisibilidadCeldaModificarCobrarClientesSaldos=false;
	public Boolean isVisibilidadCeldaActualizarCobrarClientesSaldos=false;
	public Boolean isVisibilidadCeldaEliminarCobrarClientesSaldos=false;
	public Boolean isVisibilidadCeldaCancelarCobrarClientesSaldos=false;
	public Boolean isVisibilidadCeldaGuardarCobrarClientesSaldos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos=false;	
	
	
	public Boolean isVisibilidadBusquedaCobrarClientesSaldos=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoCobrarClientesSaldos() {
		return this.iIdNuevoCobrarClientesSaldos;
	}

	public void setiIdNuevoCobrarClientesSaldos(Long iIdNuevoCobrarClientesSaldos) {
		this.iIdNuevoCobrarClientesSaldos = iIdNuevoCobrarClientesSaldos;
	}
	
	public Long getidCobrarClientesSaldosActual() {
		return this.idCobrarClientesSaldosActual;
	}

	public void setidCobrarClientesSaldosActual(Long idCobrarClientesSaldosActual) {
		this.idCobrarClientesSaldosActual = idCobrarClientesSaldosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CobrarClientesSaldos getcobrarclientessaldos() {
		return this.cobrarclientessaldos;
	}

	public void setcobrarclientessaldos(CobrarClientesSaldos cobrarclientessaldos) {
		this.cobrarclientessaldos = cobrarclientessaldos;
	}
	
	public CobrarClientesSaldos getcobrarclientessaldosAux() {
		return this.cobrarclientessaldosAux;
	}

	public void setcobrarclientessaldosAux(CobrarClientesSaldos cobrarclientessaldosAux) {
		this.cobrarclientessaldosAux = cobrarclientessaldosAux;
	}				
	
	public CobrarClientesSaldos getcobrarclientessaldosAnterior() {
		return this.cobrarclientessaldosAnterior;
	}

	public void setcobrarclientessaldosAnterior(CobrarClientesSaldos cobrarclientessaldosAnterior) {
		this.cobrarclientessaldosAnterior = cobrarclientessaldosAnterior;
	}	
	
	public CobrarClientesSaldos getcobrarclientessaldosTotales() {
		return this.cobrarclientessaldosTotales;
	}

	public void setcobrarclientessaldosTotales(CobrarClientesSaldos cobrarclientessaldosTotales) {
		this.cobrarclientessaldosTotales = cobrarclientessaldosTotales;
	}	
	
	public CobrarClientesSaldos getcobrarclientessaldosBean() {
		return this.cobrarclientessaldosBean;
	}

	public void setcobrarclientessaldosBean(CobrarClientesSaldos cobrarclientessaldosBean) {
		this.cobrarclientessaldosBean = cobrarclientessaldosBean;
	}	
	
	public CobrarClientesSaldosParameterReturnGeneral getcobrarclientessaldosReturnGeneral() {
		return this.cobrarclientessaldosReturnGeneral;
	}

	public void setcobrarclientessaldosReturnGeneral(CobrarClientesSaldosParameterReturnGeneral cobrarclientessaldosReturnGeneral) {
		this.cobrarclientessaldosReturnGeneral = cobrarclientessaldosReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaCobrarClientesSaldos=-1L;

	public Long getid_ejercicioBusquedaCobrarClientesSaldos() {
		return this.id_ejercicioBusquedaCobrarClientesSaldos;
	}

	public void setid_ejercicioBusquedaCobrarClientesSaldos(Long id_ejercicioBusquedaCobrarClientesSaldos) {
		this.id_ejercicioBusquedaCobrarClientesSaldos = id_ejercicioBusquedaCobrarClientesSaldos;
	}

;
	public Date fecha_emision_hastaBusquedaCobrarClientesSaldos=new Date();

	public Date getfecha_emision_hastaBusquedaCobrarClientesSaldos() {
		return this.fecha_emision_hastaBusquedaCobrarClientesSaldos;
	}

	public void setfecha_emision_hastaBusquedaCobrarClientesSaldos(Date fecha_emision_hastaBusquedaCobrarClientesSaldos) {
		this.fecha_emision_hastaBusquedaCobrarClientesSaldos = fecha_emision_hastaBusquedaCobrarClientesSaldos;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CobrarClientesSaldosLogic getCobrarClientesSaldosLogic()	{		
		return cobrarclientessaldosLogic;
	}

	public void setCobrarClientesSaldosLogic(CobrarClientesSaldosLogic cobrarclientessaldosLogic) {
		this.cobrarclientessaldosLogic = cobrarclientessaldosLogic;
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
	
	public Boolean getIsEsNuevoCobrarClientesSaldos() {
		return isEsNuevoCobrarClientesSaldos;
	}

	public void setIsEsNuevoCobrarClientesSaldos(Boolean isEsNuevoCobrarClientesSaldos) {
		this.isEsNuevoCobrarClientesSaldos = isEsNuevoCobrarClientesSaldos;
	}

	public Boolean getEsParaAccionDesdeFormularioCobrarClientesSaldos() {
		return esParaAccionDesdeFormularioCobrarClientesSaldos;
	}
	
	public void setEsParaAccionDesdeFormularioCobrarClientesSaldos(Boolean esParaAccionDesdeFormularioCobrarClientesSaldos) {
		this.esParaAccionDesdeFormularioCobrarClientesSaldos = esParaAccionDesdeFormularioCobrarClientesSaldos;
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

			if(this.cobrarclientessaldosSessionBean==null) {
				this.cobrarclientessaldosSessionBean=new CobrarClientesSaldosSessionBean();
			}

			if(!this.cobrarclientessaldosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cobrarclientessaldosSessionBean.getlidEmpresaActual());
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

			if(this.cobrarclientessaldosSessionBean==null) {
				this.cobrarclientessaldosSessionBean=new CobrarClientesSaldosSessionBean();
			}

			if(!this.cobrarclientessaldosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(cobrarclientessaldosSessionBean.getlidSucursalActual());
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

			if(this.cobrarclientessaldosSessionBean==null) {
				this.cobrarclientessaldosSessionBean=new CobrarClientesSaldosSessionBean();
			}

			if(!this.cobrarclientessaldosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(cobrarclientessaldosSessionBean.getlidEjercicioActual());
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

					if(this.cobrarclientessaldos!=null) {
						this.cobrarclientessaldos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
						this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_empresaCobrarClientesSaldos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCobrarClientesSaldos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_empresaCobrarClientesSaldos.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_empresaCobrarClientesSaldos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCobrarClientesSaldosGenerico)throws Exception
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
				jComboBoxid_empresaCobrarClientesSaldosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCobrarClientesSaldosGenerico!=null && jComboBoxid_empresaCobrarClientesSaldosGenerico.getItemCount()>0) {
					jComboBoxid_empresaCobrarClientesSaldosGenerico.setSelectedIndex(0);
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

					if(this.cobrarclientessaldos!=null) {
						this.cobrarclientessaldos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
						this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_sucursalCobrarClientesSaldos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCobrarClientesSaldos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_sucursalCobrarClientesSaldos.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_sucursalCobrarClientesSaldos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCobrarClientesSaldosGenerico)throws Exception
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
				jComboBoxid_sucursalCobrarClientesSaldosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCobrarClientesSaldosGenerico!=null && jComboBoxid_sucursalCobrarClientesSaldosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCobrarClientesSaldosGenerico.setSelectedIndex(0);
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

					if(this.cobrarclientessaldos!=null) {
						this.cobrarclientessaldos.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
						this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_ejercicioCobrarClientesSaldos.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioCobrarClientesSaldos.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_ejercicioCobrarClientesSaldos.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_ejercicioCobrarClientesSaldos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesSaldos") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos!=null) {
						jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos!=null) {
							//jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioCobrarClientesSaldosGenerico)throws Exception
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
				jComboBoxid_ejercicioCobrarClientesSaldosGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioCobrarClientesSaldosGenerico!=null && jComboBoxid_ejercicioCobrarClientesSaldosGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioCobrarClientesSaldosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CobrarClientesSaldos cobrarclientessaldos,JComboBox jComboBoxid_empresaCobrarClientesSaldosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCobrarClientesSaldosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_empresaCobrarClientesSaldos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCobrarClientesSaldosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cobrarclientessaldos.setid_empresa(empresaAux.getId());
				cobrarclientessaldos.setempresa_descripcion(CobrarClientesSaldosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cobrarclientessaldos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CobrarClientesSaldos cobrarclientessaldos,JComboBox jComboBoxid_sucursalCobrarClientesSaldosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCobrarClientesSaldosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_sucursalCobrarClientesSaldos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCobrarClientesSaldosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				cobrarclientessaldos.setid_sucursal(sucursalAux.getId());
				cobrarclientessaldos.setsucursal_descripcion(CobrarClientesSaldosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				cobrarclientessaldos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(CobrarClientesSaldos cobrarclientessaldos,JComboBox jComboBoxid_ejercicioCobrarClientesSaldosGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioCobrarClientesSaldosGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_ejercicioCobrarClientesSaldos.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioCobrarClientesSaldosGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				cobrarclientessaldos.setid_ejercicio(ejercicioAux.getId());
				cobrarclientessaldos.setejercicio_descripcion(CobrarClientesSaldosConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				cobrarclientessaldos.setEjercicio(ejercicioAux);			}
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

					if(!CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_empresaCobrarClientesSaldos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_empresaCobrarClientesSaldos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { 
					}

					if(!CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_sucursalCobrarClientesSaldos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_sucursalCobrarClientesSaldos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { 
					}

					if(!CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_ejercicioCobrarClientesSaldos.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_ejercicioCobrarClientesSaldos.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { 
					}

					if(!CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesSaldos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.addItem(ejercicio);
							}
						}

						if(!CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_empresaCobrarClientesSaldos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_empresaCobrarClientesSaldos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_sucursalCobrarClientesSaldos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_sucursalCobrarClientesSaldos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_ejercicioCobrarClientesSaldos.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
							this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_ejercicioCobrarClientesSaldos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCobrarClientesSaldos() throws Exception {
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
		
	public CobrarClientesSaldosParameterReturnGeneral getCobrarClientesSaldosParameterGeneral() {
		return this.cobrarclientessaldosParameterGeneral;
	}
	
	public void setCobrarClientesSaldosParameterGeneral(CobrarClientesSaldosParameterReturnGeneral cobrarclientessaldosParameterGeneral) {
		this.cobrarclientessaldosParameterGeneral = cobrarclientessaldosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCobrarClientesSaldos() {
		return isPermisoTodoCobrarClientesSaldos;
	}

	public void setIsPermisoTodoCobrarClientesSaldos(Boolean isPermisoTodoCobrarClientesSaldos) {
		this.isPermisoTodoCobrarClientesSaldos = isPermisoTodoCobrarClientesSaldos;
	}

	public Boolean getIsPermisoNuevoCobrarClientesSaldos() {
		return isPermisoNuevoCobrarClientesSaldos;
	}

	public void setIsPermisoNuevoCobrarClientesSaldos(Boolean isPermisoNuevoCobrarClientesSaldos) {
		this.isPermisoNuevoCobrarClientesSaldos = isPermisoNuevoCobrarClientesSaldos;
	}

	public Boolean getIsPermisoActualizarCobrarClientesSaldos() {
		return isPermisoActualizarCobrarClientesSaldos;
	}

	public void setIsPermisoActualizarCobrarClientesSaldos(Boolean isPermisoActualizarCobrarClientesSaldos) {
		this.isPermisoActualizarCobrarClientesSaldos = isPermisoActualizarCobrarClientesSaldos;
	}

	public Boolean getIsPermisoEliminarCobrarClientesSaldos() {
		return isPermisoEliminarCobrarClientesSaldos;
	}

	public void setIsPermisoEliminarCobrarClientesSaldos(Boolean isPermisoEliminarCobrarClientesSaldos) {
		this.isPermisoEliminarCobrarClientesSaldos = isPermisoEliminarCobrarClientesSaldos;
	}

	public Boolean getIsPermisoGuardarCambiosCobrarClientesSaldos() {
		return isPermisoGuardarCambiosCobrarClientesSaldos;
	}

	public void setIsPermisoGuardarCambiosCobrarClientesSaldos(Boolean isPermisoGuardarCambiosCobrarClientesSaldos) {
		this.isPermisoGuardarCambiosCobrarClientesSaldos = isPermisoGuardarCambiosCobrarClientesSaldos;
	}
	
	public Boolean getIsPermisoConsultaCobrarClientesSaldos() {
		return isPermisoConsultaCobrarClientesSaldos;
	}

	public void setIsPermisoConsultaCobrarClientesSaldos(Boolean isPermisoConsultaCobrarClientesSaldos) {
		this.isPermisoConsultaCobrarClientesSaldos = isPermisoConsultaCobrarClientesSaldos;
	}

	public Boolean getIsPermisoBusquedaCobrarClientesSaldos() {
		return isPermisoBusquedaCobrarClientesSaldos;
	}

	public void setIsPermisoBusquedaCobrarClientesSaldos(Boolean isPermisoBusquedaCobrarClientesSaldos) {
		this.isPermisoBusquedaCobrarClientesSaldos = isPermisoBusquedaCobrarClientesSaldos;
	}

	public Boolean getIsPermisoReporteCobrarClientesSaldos() {
		return isPermisoReporteCobrarClientesSaldos;
	}

	public void setIsPermisoReporteCobrarClientesSaldos(Boolean isPermisoReporteCobrarClientesSaldos) {
		this.isPermisoReporteCobrarClientesSaldos = isPermisoReporteCobrarClientesSaldos;
	}
	
	public Boolean getIsPermisoPaginacionMedioCobrarClientesSaldos() {
		return isPermisoPaginacionMedioCobrarClientesSaldos;
	}

	public void setIsPermisoPaginacionMedioCobrarClientesSaldos(Boolean isPermisoPaginacionMedioCobrarClientesSaldos) {
		this.isPermisoPaginacionMedioCobrarClientesSaldos = isPermisoPaginacionMedioCobrarClientesSaldos;
	}
	
	public Boolean getIsPermisoPaginacionTodoCobrarClientesSaldos() {
		return isPermisoPaginacionTodoCobrarClientesSaldos;
	}

	public void setIsPermisoPaginacionTodoCobrarClientesSaldos(Boolean isPermisoPaginacionTodoCobrarClientesSaldos) {
		this.isPermisoPaginacionTodoCobrarClientesSaldos = isPermisoPaginacionTodoCobrarClientesSaldos;
	}
	
	public Boolean getIsPermisoPaginacionAltoCobrarClientesSaldos() {
		return isPermisoPaginacionAltoCobrarClientesSaldos;
	}

	public void setIsPermisoPaginacionAltoCobrarClientesSaldos(Boolean isPermisoPaginacionAltoCobrarClientesSaldos) {
		this.isPermisoPaginacionAltoCobrarClientesSaldos = isPermisoPaginacionAltoCobrarClientesSaldos;
	}
	
	public Boolean getIsPermisoCopiarCobrarClientesSaldos() {
		return isPermisoCopiarCobrarClientesSaldos;
	}

	public void setIsPermisoCopiarCobrarClientesSaldos(Boolean isPermisoCopiarCobrarClientesSaldos) {
		this.isPermisoCopiarCobrarClientesSaldos = isPermisoCopiarCobrarClientesSaldos;
	}
	
	public Boolean getIsPermisoVerFormCobrarClientesSaldos() {
		return isPermisoVerFormCobrarClientesSaldos;
	}

	public void setIsPermisoVerFormCobrarClientesSaldos(Boolean isPermisoVerFormCobrarClientesSaldos) {
		this.isPermisoVerFormCobrarClientesSaldos = isPermisoVerFormCobrarClientesSaldos;
	}
	
	public Boolean getIsPermisoDuplicarCobrarClientesSaldos() {
		return isPermisoDuplicarCobrarClientesSaldos;
	}

	public void setIsPermisoDuplicarCobrarClientesSaldos(Boolean isPermisoDuplicarCobrarClientesSaldos) {
		this.isPermisoDuplicarCobrarClientesSaldos = isPermisoDuplicarCobrarClientesSaldos;
	}
	
	public Boolean getIsPermisoOrdenCobrarClientesSaldos() {
		return isPermisoOrdenCobrarClientesSaldos;
	}

	public void setIsPermisoOrdenCobrarClientesSaldos(Boolean isPermisoOrdenCobrarClientesSaldos) {
		this.isPermisoOrdenCobrarClientesSaldos = isPermisoOrdenCobrarClientesSaldos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCobrarClientesSaldos() {
		return isVisibilidadCeldaNuevoCobrarClientesSaldos;
	}

	public void setIsVisibilidadCeldaNuevoCobrarClientesSaldos(Boolean isVisibilidadCeldaNuevoCobrarClientesSaldos) {
		this.isVisibilidadCeldaNuevoCobrarClientesSaldos = isVisibilidadCeldaNuevoCobrarClientesSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCobrarClientesSaldos() {
		return isVisibilidadCeldaDuplicarCobrarClientesSaldos;
	}

	public void setIsVisibilidadCeldaDuplicarCobrarClientesSaldos(Boolean isVisibilidadCeldaDuplicarCobrarClientesSaldos) {
		this.isVisibilidadCeldaDuplicarCobrarClientesSaldos = isVisibilidadCeldaDuplicarCobrarClientesSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCobrarClientesSaldos() {
		return isVisibilidadCeldaCopiarCobrarClientesSaldos;
	}

	public void setIsVisibilidadCeldaCopiarCobrarClientesSaldos(Boolean isVisibilidadCeldaCopiarCobrarClientesSaldos) {
		this.isVisibilidadCeldaCopiarCobrarClientesSaldos = isVisibilidadCeldaCopiarCobrarClientesSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCobrarClientesSaldos() {
		return isVisibilidadCeldaVerFormCobrarClientesSaldos;
	}

	public void setIsVisibilidadCeldaVerFormCobrarClientesSaldos(Boolean isVisibilidadCeldaVerFormCobrarClientesSaldos) {
		this.isVisibilidadCeldaVerFormCobrarClientesSaldos = isVisibilidadCeldaVerFormCobrarClientesSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCobrarClientesSaldos() {
		return isVisibilidadCeldaOrdenCobrarClientesSaldos;
	}

	public void setIsVisibilidadCeldaOrdenCobrarClientesSaldos(Boolean isVisibilidadCeldaOrdenCobrarClientesSaldos) {
		this.isVisibilidadCeldaOrdenCobrarClientesSaldos = isVisibilidadCeldaOrdenCobrarClientesSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos() {
		return isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos(Boolean isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos) {
		this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos = isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCobrarClientesSaldos() {
		return isVisibilidadCeldaModificarCobrarClientesSaldos;
	}

	public void setIsVisibilidadCeldaModificarCobrarClientesSaldos(Boolean isVisibilidadCeldaModificarCobrarClientesSaldos) {
		this.isVisibilidadCeldaModificarCobrarClientesSaldos = isVisibilidadCeldaModificarCobrarClientesSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCobrarClientesSaldos() {
		return isVisibilidadCeldaActualizarCobrarClientesSaldos;
	}

	public void setIsVisibilidadCeldaActualizarCobrarClientesSaldos(Boolean isVisibilidadCeldaActualizarCobrarClientesSaldos) {
		this.isVisibilidadCeldaActualizarCobrarClientesSaldos = isVisibilidadCeldaActualizarCobrarClientesSaldos;
	}

	public Boolean getIsVisibilidadCeldaEliminarCobrarClientesSaldos() {
		return isVisibilidadCeldaEliminarCobrarClientesSaldos;
	}

	public void setIsVisibilidadCeldaEliminarCobrarClientesSaldos(Boolean isVisibilidadCeldaEliminarCobrarClientesSaldos) {
		this.isVisibilidadCeldaEliminarCobrarClientesSaldos = isVisibilidadCeldaEliminarCobrarClientesSaldos;
	}

	public Boolean getIsVisibilidadCeldaCancelarCobrarClientesSaldos() {
		return isVisibilidadCeldaCancelarCobrarClientesSaldos;
	}

	public void setIsVisibilidadCeldaCancelarCobrarClientesSaldos(Boolean isVisibilidadCeldaCancelarCobrarClientesSaldos) {
		this.isVisibilidadCeldaCancelarCobrarClientesSaldos = isVisibilidadCeldaCancelarCobrarClientesSaldos;
	}

	public Boolean getIsVisibilidadCeldaGuardarCobrarClientesSaldos() {
		return isVisibilidadCeldaGuardarCobrarClientesSaldos;
	}

	public void setIsVisibilidadCeldaGuardarCobrarClientesSaldos(Boolean isVisibilidadCeldaGuardarCobrarClientesSaldos) {
		this.isVisibilidadCeldaGuardarCobrarClientesSaldos = isVisibilidadCeldaGuardarCobrarClientesSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCobrarClientesSaldos() {
		return isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCobrarClientesSaldos(Boolean isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos) {
		this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos = isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos;
	}
		
	public CobrarClientesSaldosSessionBean getcobrarclientessaldosSessionBean() {
		return this.cobrarclientessaldosSessionBean;
	}
	
	public void setcobrarclientessaldosSessionBean(CobrarClientesSaldosSessionBean cobrarclientessaldosSessionBean) {
		this.cobrarclientessaldosSessionBean=cobrarclientessaldosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCobrarClientesSaldos() {
		return this.isVisibilidadBusquedaCobrarClientesSaldos;
	}

	public void setisVisibilidadBusquedaCobrarClientesSaldos(Boolean isVisibilidadBusquedaCobrarClientesSaldos) {
		this.isVisibilidadBusquedaCobrarClientesSaldos=isVisibilidadBusquedaCobrarClientesSaldos;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cobrarclientessaldos,null);
				this.setActualParaGuardarSucursalForeignKey(cobrarclientessaldos,null);
				this.setActualParaGuardarEjercicioForeignKey(cobrarclientessaldos,null);
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
	
	public void bugActualizarReferenciaActual(CobrarClientesSaldos cobrarclientessaldos,CobrarClientesSaldos cobrarclientessaldosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCobrarClientesSaldos(cobrarclientessaldos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cobrarclientessaldosAux.setId(cobrarclientessaldos.getId());
		cobrarclientessaldosAux.setVersionRow(cobrarclientessaldos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CobrarClientesSaldos cobrarclientessaldosLocal) throws Exception {
		
		if(this.cobrarclientessaldosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CobrarClientesSaldos cobrarclientessaldosLocal) throws Exception {	
		if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cobrarclientessaldosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				cobrarclientessaldosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				cobrarclientessaldosLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCobrarClientesSaldosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cobrarclientessaldosValidator.getInvalidValues(this.cobrarclientessaldos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CobrarClientesSaldos cobrarclientessaldos,List<CobrarClientesSaldos> cobrarclientessaldoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(CobrarClientesSaldos cobrarclientessaldos,List<CobrarClientesSaldos> cobrarclientessaldoss) throws Exception {
		try	{			
			CobrarClientesSaldosConstantesFunciones.actualizarSelectedLista(cobrarclientessaldos,cobrarclientessaldoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CobrarClientesSaldos> cobrarclientessaldossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cobrarclientessaldossLocal=this.cobrarclientessaldosLogic.getCobrarClientesSaldoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cobrarclientessaldossLocal=this.cobrarclientessaldoss;
			}
			//ARCHITECTURE
		
			for(CobrarClientesSaldos cobrarclientessaldosLocal:cobrarclientessaldossLocal) {
				if(this.permiteMantenimiento(cobrarclientessaldosLocal) && cobrarclientessaldosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CobrarClientesSaldosConstantesFunciones.getCobrarClientesSaldosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CobrarClientesSaldosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelcodigoCobrarClientesSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesSaldosConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelnombre_completoCobrarClientesSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesSaldosConstantesFunciones.NOMBRECOMERCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelnombre_comercialCobrarClientesSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesSaldosConstantesFunciones.NOMBREGARANTIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelnombre_garantiaCobrarClientesSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesSaldosConstantesFunciones.LIMITECREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabellimite_creditoCobrarClientesSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesSaldosConstantesFunciones.TOTALPEDIDOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabeltotal_pedidosCobrarClientesSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesSaldosConstantesFunciones.TOTALSALDOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabeltotal_saldosCobrarClientesSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesSaldosConstantesFunciones.TOTALCHEQUES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabeltotal_chequesCobrarClientesSaldos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelcodigoCobrarClientesSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelnombre_completoCobrarClientesSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelnombre_comercialCobrarClientesSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelnombre_garantiaCobrarClientesSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabellimite_creditoCobrarClientesSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabeltotal_pedidosCobrarClientesSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabeltotal_saldosCobrarClientesSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabeltotal_chequesCobrarClientesSaldos,"");
		
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
		this.iIdNuevoCobrarClientesSaldos--;	
		
		
		this.cobrarclientessaldosAux=new CobrarClientesSaldos();
		
		this.cobrarclientessaldosAux.setId(this.iIdNuevoCobrarClientesSaldos);
		this.cobrarclientessaldosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().add(this.cobrarclientessaldosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cobrarclientessaldoss.add(this.cobrarclientessaldosAux);
		}
		//ARCHITECTURE
		
		this.cobrarclientessaldos=this.cobrarclientessaldosAux;
		
		if(CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCobrarClientesSaldos(this.cobrarclientessaldos);
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesSaldos(this.cobrarclientessaldos);
		}
				
		//this.setDefaultControlesCobrarClientesSaldos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCobrarClientesSaldos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCobrarClientesSaldos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesSaldos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldosBean,this.cobrarclientessaldos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCobrarClientesSaldos(this.cobrarclientessaldosReturnGeneral,this.cobrarclientessaldosBean,false);
		
		if(this.cobrarclientessaldosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesSaldos(this.cobrarclientessaldosReturnGeneral.getCobrarClientesSaldos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCobrarClientesSaldos(this.cobrarclientessaldosReturnGeneral.getCobrarClientesSaldos());
		}
		
		if(this.cobrarclientessaldosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesSaldos(this.cobrarclientessaldosReturnGeneral.getCobrarClientesSaldos(),classes);//this.cobrarclientessaldosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCobrarClientesSaldos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCobrarClientesSaldos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.RecargarFormCobrarClientesSaldos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCobrarClientesSaldos(false);
						
			if(cobrarclientessaldosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesSaldos();
			}
			
			this.actualizarVisualTableDatosCobrarClientesSaldos();
			
			this.jTableDatosCobrarClientesSaldos.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesSaldos(), this.getIndiceNuevoCobrarClientesSaldos());
			
			this.seleccionarFilaTablaCobrarClientesSaldosActual();
						
			this.actualizarEstadoCeldasBotonesCobrarClientesSaldos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCobrarClientesSaldos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jDateChooserfecha_emision_hastaCobrarClientesSaldos.setEnabled(isHabilitar && this.cobrarclientessaldosConstantesFunciones.activarfecha_emision_hastaCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldcodigoCobrarClientesSaldos.setEnabled(isHabilitar && this.cobrarclientessaldosConstantesFunciones.activarcodigoCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_completoCobrarClientesSaldos.setEnabled(isHabilitar && this.cobrarclientessaldosConstantesFunciones.activarnombre_completoCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_comercialCobrarClientesSaldos.setEnabled(isHabilitar && this.cobrarclientessaldosConstantesFunciones.activarnombre_comercialCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_garantiaCobrarClientesSaldos.setEnabled(isHabilitar && this.cobrarclientessaldosConstantesFunciones.activarnombre_garantiaCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldlimite_creditoCobrarClientesSaldos.setEnabled(isHabilitar && this.cobrarclientessaldosConstantesFunciones.activarlimite_creditoCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_pedidosCobrarClientesSaldos.setEnabled(isHabilitar && this.cobrarclientessaldosConstantesFunciones.activartotal_pedidosCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_saldosCobrarClientesSaldos.setEnabled(isHabilitar && this.cobrarclientessaldosConstantesFunciones.activartotal_saldosCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_chequesCobrarClientesSaldos.setEnabled(isHabilitar && this.cobrarclientessaldosConstantesFunciones.activartotal_chequesCobrarClientesSaldos);	
		//
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_empresaCobrarClientesSaldos.setEnabled(isHabilitar && this.cobrarclientessaldosConstantesFunciones.activarid_empresaCobrarClientesSaldos);//
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_sucursalCobrarClientesSaldos.setEnabled(isHabilitar && this.cobrarclientessaldosConstantesFunciones.activarid_sucursalCobrarClientesSaldos);//
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_ejercicioCobrarClientesSaldos.setEnabled(isHabilitar && this.cobrarclientessaldosConstantesFunciones.activarid_ejercicioCobrarClientesSaldos);
	};
	
	public void setDefaultControlesCobrarClientesSaldos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCobrarClientesSaldos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cobrarclientessaldosSessionBean.setConGuardarRelaciones(true);			
			this.cobrarclientessaldosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTabbedPaneRelacionesCobrarClientesSaldos.setVisible(true);
			
					
		} else {
			//this.cobrarclientessaldosSessionBean.setConGuardarRelaciones(false);			
			this.cobrarclientessaldosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTabbedPaneRelacionesCobrarClientesSaldos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCobrarClientesSaldos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesSaldos cobrarclientessaldosAux:this.cobrarclientessaldosLogic.getCobrarClientesSaldoss()) {
				if(cobrarclientessaldosAux.getId().equals(this.iIdNuevoCobrarClientesSaldos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesSaldos cobrarclientessaldosAux:this.cobrarclientessaldoss) {
				if(cobrarclientessaldosAux.getId().equals(this.iIdNuevoCobrarClientesSaldos)) {
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
	
	public int getIndiceActualCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesSaldos cobrarclientessaldosAux:this.cobrarclientessaldosLogic.getCobrarClientesSaldoss()) {
				if(cobrarclientessaldosAux.getId().equals(cobrarclientessaldos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesSaldos cobrarclientessaldosAux:this.cobrarclientessaldoss) {
				if(cobrarclientessaldosAux.getId().equals(cobrarclientessaldos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesSaldos cobrarclientessaldosAux:this.cobrarclientessaldosLogic.getCobrarClientesSaldoss()) {
				if(cobrarclientessaldosAux.getCobrarClientesSaldosOriginal().getId().equals(cobrarclientessaldosOriginal.getId())) {
					existe=true;
					cobrarclientessaldosOriginal.setId(cobrarclientessaldosAux.getId());
					cobrarclientessaldosOriginal.setVersionRow(cobrarclientessaldosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesSaldos cobrarclientessaldosAux:this.cobrarclientessaldoss) {
				if(cobrarclientessaldosAux.getCobrarClientesSaldosOriginal().getId().equals(cobrarclientessaldosOriginal.getId())) {
					existe=true;
					cobrarclientessaldosOriginal.setId(cobrarclientessaldosAux.getId());
					cobrarclientessaldosOriginal.setVersionRow(cobrarclientessaldosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCobrarClientesSaldos(Boolean esParaCancelar) throws Exception {
		cobrarclientessaldossAux=new ArrayList<CobrarClientesSaldos>();
		cobrarclientessaldosAux=new CobrarClientesSaldos();
		
		if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarClientesSaldos cobrarclientessaldosAux:this.cobrarclientessaldosLogic.getCobrarClientesSaldoss()) {
					if(cobrarclientessaldosAux.getId()<0) {
						cobrarclientessaldossAux.add(cobrarclientessaldosAux);
					}		
				}
				this.iIdNuevoCobrarClientesSaldos=0L;
				this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().removeAll(cobrarclientessaldossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesSaldos cobrarclientessaldosAux:this.cobrarclientessaldoss) {
					if(cobrarclientessaldosAux.getId()<0) {
						cobrarclientessaldossAux.add(cobrarclientessaldosAux);
					}		
				}
				this.iIdNuevoCobrarClientesSaldos=0L;
				this.cobrarclientessaldoss.removeAll(cobrarclientessaldossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCobrarClientesSaldos 
					&& this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().size()>0
					) {
					cobrarclientessaldosAux=this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().get(this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().size() - 1);
				
					if(cobrarclientessaldosAux.getId()<0) {
						this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().remove(cobrarclientessaldosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCobrarClientesSaldos && this.cobrarclientessaldoss.size()>0) {
					cobrarclientessaldosAux=this.cobrarclientessaldoss.get(this.cobrarclientessaldoss.size() - 1);
				
					if(cobrarclientessaldosAux.getId()<0) {
						this.cobrarclientessaldoss.remove(cobrarclientessaldosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCobrarClientesSaldos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cobrarclientessaldos.getId()<0) {
				this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().remove(this.cobrarclientessaldos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cobrarclientessaldos.getId()<0) {
				this.cobrarclientessaldoss.remove(this.cobrarclientessaldos);
			}
		}			
	}
	
	public void setEstadosInicialesCobrarClientesSaldos(List<CobrarClientesSaldos> cobrarclientessaldossAux) throws Exception {
		CobrarClientesSaldosConstantesFunciones.setEstadosInicialesCobrarClientesSaldos(cobrarclientessaldossAux);
	}
	
	public void setEstadosInicialesCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldosAux) throws Exception {
		CobrarClientesSaldosConstantesFunciones.setEstadosInicialesCobrarClientesSaldos(cobrarclientessaldosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCobrarClientesSaldosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCobrarClientesSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCobrarClientesSaldosActual()) {
				if(!this.isEsNuevoCobrarClientesSaldos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCobrarClientesSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCobrarClientesSaldos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCobrarClientesSaldosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cobrar Clientes Saldos ?", "MANTENIMIENTO DE Cobrar Clientes Saldos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCobrarClientesSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CobrarClientesSaldos cobrarclientessaldos) throws Exception {
		CobrarClientesSaldosConstantesFunciones.seleccionarAsignar(this.cobrarclientessaldos,cobrarclientessaldos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCobrarClientesSaldos=this.isPermisoActualizarOriginalCobrarClientesSaldos;
			
			
			this.seleccionarAsignar(cobrarclientessaldos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCobrarClientesSaldos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cobrarclientessaldosSessionBean.setsFuncionBusquedaRapida(this.cobrarclientessaldosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCobrarClientesSaldos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCobrarClientesSaldos(esParaCancelar);				
				this.cancelarNuevoCobrarClientesSaldos(esParaCancelar);								
			}
			
			this.cobrarclientessaldos=new CobrarClientesSaldos();
			
			this.inicializarCobrarClientesSaldos();
			
			this.actualizarEstadoCeldasBotonesCobrarClientesSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCobrarClientesSaldos() throws Exception {
		try {
			CobrarClientesSaldosConstantesFunciones.inicializarCobrarClientesSaldos(this.cobrarclientessaldos);
			
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
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCobrarClientesSaldoss(String sAccionBusqueda,List<CobrarClientesSaldos> cobrarclientessaldossParaReportes) throws Exception {
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
					sPathReporteFinal="CobrarClientesSaldos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CobrarClientesSaldosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CobrarClientesSaldosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CobrarClientesSaldos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cobrar Clientes Saldoses");		
		parameters.put("busquedapor", CobrarClientesSaldosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCobrarClientesSaldos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CobrarClientesSaldosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CobrarClientesSaldosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCobrarClientesSaldos=new JRBeanArrayDataSource(CobrarClientesSaldosJInternalFrame.TraerCobrarClientesSaldosBeans(cobrarclientessaldossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCobrarClientesSaldos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CobrarClientesSaldosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CobrarClientesSaldosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CobrarClientesSaldosBean.TraerCobrarClientesSaldosBeans(cobrarclientessaldossParaReportes).toArray()));
							
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
				this.generarExcelReporteCobrarClientesSaldoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientessaldossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCobrarClientesSaldoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientessaldossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCobrarClientesSaldosActionPerformed(null);
					//this.generarExcelReporteCobrarClientesSaldoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientessaldossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCobrarClientesSaldoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientessaldossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCobrarClientesSaldoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientessaldossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCobrarClientesSaldoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientessaldossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCobrarClientesSaldoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesSaldos> cobrarclientessaldossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientessaldos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesSaldoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarClientesSaldos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CobrarClientesSaldos cobrarclientessaldos : cobrarclientessaldossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CobrarClientesSaldosConstantesFunciones.generarExcelReporteDataCobrarClientesSaldos("NORMAL",row,workbook,cobrarclientessaldos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Saldos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCobrarClientesSaldos(String sTipo,Row row,Workbook workbook) {
		
		CobrarClientesSaldosConstantesFunciones.generarExcelReporteHeaderCobrarClientesSaldos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCobrarClientesSaldoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesSaldos> cobrarclientessaldossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientessaldos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesSaldoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CobrarClientesSaldos cobrarclientessaldos : cobrarclientessaldossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CobrarClientesSaldosConstantesFunciones.getCobrarClientesSaldosDescripcion(cobrarclientessaldos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSaldosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessaldos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSaldosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessaldos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSaldosConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessaldos.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSaldosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessaldos.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessaldos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessaldos.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessaldos.getnombre_comercial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessaldos.getnombre_garantia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSaldosConstantesFunciones.LABEL_LIMITECREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_LIMITECREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessaldos.getlimite_credito());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALPEDIDOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALPEDIDOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessaldos.gettotal_pedidos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALSALDOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALSALDOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessaldos.gettotal_saldos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALCHEQUES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALCHEQUES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessaldos.gettotal_cheques());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Saldos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCobrarClientesSaldoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesSaldos> cobrarclientessaldossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CobrarClientesSaldos> cobrarclientessaldossRespaldo=null;
		
		classes=CobrarClientesSaldosConstantesFunciones.getClassesRelationshipsOfCobrarClientesSaldos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cobrarclientessaldosLogic.setDatosCliente(this.datosCliente);
		this.cobrarclientessaldosLogic.setDatosDeep(this.datosDeep);
		this.cobrarclientessaldosLogic.setIsConDeep(true);
		
		cobrarclientessaldossRespaldo=this.cobrarclientessaldosLogic.getCobrarClientesSaldoss();
		
		this.cobrarclientessaldosLogic.setCobrarClientesSaldoss(cobrarclientessaldossParaReportes);	
		this.cobrarclientessaldosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cobrarclientessaldossParaReportes=this.cobrarclientessaldosLogic.getCobrarClientesSaldoss();
		this.cobrarclientessaldosLogic.setCobrarClientesSaldoss(cobrarclientessaldossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientessaldos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesSaldoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarClientesSaldos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CobrarClientesSaldos cobrarclientessaldos : cobrarclientessaldossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCobrarClientesSaldos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CobrarClientesSaldosConstantesFunciones.generarExcelReporteDataCobrarClientesSaldos("NORMAL",row,workbook,cobrarclientessaldos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CobrarClientesSaldosConstantesFunciones.getCobrarClientesSaldosDescripcion(cobrarclientessaldos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Saldos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCobrarClientesSaldos() throws Exception {		
		this.startProcessCobrarClientesSaldos(true);
	}
	
	public void startProcessCobrarClientesSaldos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCobrarClientesSaldos ,this.jPanelParametrosReportesCobrarClientesSaldos, this.jScrollPanelDatosCobrarClientesSaldos,this.jPanelPaginacionCobrarClientesSaldos, this.jScrollPanelDatosEdicionCobrarClientesSaldos, this.jPanelAccionesCobrarClientesSaldos,this.jPanelAccionesFormularioCobrarClientesSaldos,this.jmenuBarCobrarClientesSaldos,this.jmenuBarDetalleCobrarClientesSaldos,this.jTtoolBarCobrarClientesSaldos,this.jTtoolBarDetalleCobrarClientesSaldos);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarClientesSaldos=this.jTabbedPaneBusquedasCobrarClientesSaldos; 
		
		final JPanel jPanelParametrosReportesCobrarClientesSaldos=this.jPanelParametrosReportesCobrarClientesSaldos;
		//final JScrollPane jScrollPanelDatosCobrarClientesSaldos=this.jScrollPanelDatosCobrarClientesSaldos;
		final JTable jTableDatosCobrarClientesSaldos=this.jTableDatosCobrarClientesSaldos;		
		final JPanel jPanelPaginacionCobrarClientesSaldos=this.jPanelPaginacionCobrarClientesSaldos;
		//final JScrollPane jScrollPanelDatosEdicionCobrarClientesSaldos=this.jScrollPanelDatosEdicionCobrarClientesSaldos;
		final JPanel jPanelAccionesCobrarClientesSaldos=this.jPanelAccionesCobrarClientesSaldos;
		
		JPanel jPanelCamposAuxiliarCobrarClientesSaldos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCobrarClientesSaldos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
			jPanelCamposAuxiliarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jPanelCamposCobrarClientesSaldos;
			jPanelAccionesFormularioAuxiliarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jPanelAccionesFormularioCobrarClientesSaldos;
		}
		
		final JPanel jPanelCamposCobrarClientesSaldos=jPanelCamposAuxiliarCobrarClientesSaldos;
		final JPanel jPanelAccionesFormularioCobrarClientesSaldos=jPanelAccionesFormularioAuxiliarCobrarClientesSaldos;
		
		
		final JMenuBar jmenuBarCobrarClientesSaldos=this.jmenuBarCobrarClientesSaldos;
		final JToolBar jTtoolBarCobrarClientesSaldos=this.jTtoolBarCobrarClientesSaldos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCobrarClientesSaldos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarClientesSaldos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
			jmenuBarDetalleAuxiliarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jmenuBarDetalleCobrarClientesSaldos;
			jTtoolBarDetalleAuxiliarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jTtoolBarDetalleCobrarClientesSaldos;
		}
		
		final JMenuBar jmenuBarDetalleCobrarClientesSaldos=jmenuBarDetalleAuxiliarCobrarClientesSaldos;
		final JToolBar jTtoolBarDetalleCobrarClientesSaldos=jTtoolBarDetalleAuxiliarCobrarClientesSaldos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarClientesSaldos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarClientesSaldos;
			processRunnable.jTableDatos=jTableDatosCobrarClientesSaldos;
			processRunnable.jPanelCampos=jPanelCamposCobrarClientesSaldos;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarClientesSaldos;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarClientesSaldos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarClientesSaldos;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarClientesSaldos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarClientesSaldos;
			processRunnable.jTtoolBar=jTtoolBarCobrarClientesSaldos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarClientesSaldos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarClientesSaldos ,jPanelParametrosReportesCobrarClientesSaldos,jTableDatosCobrarClientesSaldos, /*jScrollPanelDatosCobrarClientesSaldos,*/jPanelCamposCobrarClientesSaldos,jPanelPaginacionCobrarClientesSaldos, /*jScrollPanelDatosEdicionCobrarClientesSaldos,*/ jPanelAccionesCobrarClientesSaldos,jPanelAccionesFormularioCobrarClientesSaldos,jmenuBarCobrarClientesSaldos,jmenuBarDetalleCobrarClientesSaldos,jTtoolBarCobrarClientesSaldos,jTtoolBarDetalleCobrarClientesSaldos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarClientesSaldos ,jPanelParametrosReportesCobrarClientesSaldos, jScrollPanelDatosCobrarClientesSaldos,jPanelPaginacionCobrarClientesSaldos, jScrollPanelDatosEdicionCobrarClientesSaldos, jPanelAccionesCobrarClientesSaldos,jPanelAccionesFormularioCobrarClientesSaldos,jmenuBarCobrarClientesSaldos,jmenuBarDetalleCobrarClientesSaldos,jTtoolBarCobrarClientesSaldos,jTtoolBarDetalleCobrarClientesSaldos);
						
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
	
	public void finishProcessCobrarClientesSaldos() {// throws Exception 
		this.finishProcessCobrarClientesSaldos(true);
	}
	
	public void finishProcessCobrarClientesSaldos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCobrarClientesSaldos ,this.jPanelParametrosReportesCobrarClientesSaldos, this.jScrollPanelDatosCobrarClientesSaldos,this.jPanelPaginacionCobrarClientesSaldos, this.jScrollPanelDatosEdicionCobrarClientesSaldos, this.jPanelAccionesCobrarClientesSaldos,this.jPanelAccionesFormularioCobrarClientesSaldos,this.jmenuBarCobrarClientesSaldos,this.jmenuBarDetalleCobrarClientesSaldos,this.jTtoolBarCobrarClientesSaldos,this.jTtoolBarDetalleCobrarClientesSaldos);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarClientesSaldos=this.jTabbedPaneBusquedasCobrarClientesSaldos; 
		
		final JPanel jPanelParametrosReportesCobrarClientesSaldos=this.jPanelParametrosReportesCobrarClientesSaldos;
		//final JScrollPane jScrollPanelDatosCobrarClientesSaldos=this.jScrollPanelDatosCobrarClientesSaldos;
		final JTable jTableDatosCobrarClientesSaldos=this.jTableDatosCobrarClientesSaldos;		
		final JPanel jPanelPaginacionCobrarClientesSaldos=this.jPanelPaginacionCobrarClientesSaldos;
		//final JScrollPane jScrollPanelDatosEdicionCobrarClientesSaldos=this.jScrollPanelDatosEdicionCobrarClientesSaldos;
		final JPanel jPanelAccionesCobrarClientesSaldos=this.jPanelAccionesCobrarClientesSaldos;
		
		JPanel jPanelCamposAuxiliarCobrarClientesSaldos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCobrarClientesSaldos=new JPanel();
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
			jPanelCamposAuxiliarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jPanelCamposCobrarClientesSaldos;
			jPanelAccionesFormularioAuxiliarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jPanelAccionesFormularioCobrarClientesSaldos;
		}
		
		final JPanel jPanelCamposCobrarClientesSaldos=jPanelCamposAuxiliarCobrarClientesSaldos;
		final JPanel jPanelAccionesFormularioCobrarClientesSaldos=jPanelAccionesFormularioAuxiliarCobrarClientesSaldos;
		
		
		final JMenuBar jmenuBarCobrarClientesSaldos=this.jmenuBarCobrarClientesSaldos;		
		final JToolBar jTtoolBarCobrarClientesSaldos=this.jTtoolBarCobrarClientesSaldos;
				
		JMenuBar jmenuBarDetalleAuxiliarCobrarClientesSaldos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarClientesSaldos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
			jmenuBarDetalleAuxiliarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jmenuBarDetalleCobrarClientesSaldos;
			jTtoolBarDetalleAuxiliarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jTtoolBarDetalleCobrarClientesSaldos;		
		}
		
		final JMenuBar jmenuBarDetalleCobrarClientesSaldos=jmenuBarDetalleAuxiliarCobrarClientesSaldos;
		final JToolBar jTtoolBarDetalleCobrarClientesSaldos=jTtoolBarDetalleAuxiliarCobrarClientesSaldos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarClientesSaldos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarClientesSaldos;
			processRunnable.jTableDatos=jTableDatosCobrarClientesSaldos;
			processRunnable.jPanelCampos=jPanelCamposCobrarClientesSaldos;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarClientesSaldos;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarClientesSaldos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarClientesSaldos;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarClientesSaldos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarClientesSaldos;
			processRunnable.jTtoolBar=jTtoolBarCobrarClientesSaldos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarClientesSaldos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCobrarClientesSaldos ,jPanelParametrosReportesCobrarClientesSaldos, jTableDatosCobrarClientesSaldos,/*jScrollPanelDatosCobrarClientesSaldos,*/jPanelCamposCobrarClientesSaldos,jPanelPaginacionCobrarClientesSaldos, /*jScrollPanelDatosEdicionCobrarClientesSaldos,*/ jPanelAccionesCobrarClientesSaldos,jPanelAccionesFormularioCobrarClientesSaldos,jmenuBarCobrarClientesSaldos,jmenuBarDetalleCobrarClientesSaldos,jTtoolBarCobrarClientesSaldos,jTtoolBarDetalleCobrarClientesSaldos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCobrarClientesSaldos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCobrarClientesSaldos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCobrarClientesSaldos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCobrarClientesSaldos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCobrarClientesSaldos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCobrarClientesSaldos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCobrarClientesSaldos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCobrarClientesSaldos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCobrarClientesSaldos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cobrarclientessaldosConstantesFunciones.getsFinalQueryCobrarClientesSaldos();
		String  finalQueryPaginacionTodos=this.cobrarclientessaldosConstantesFunciones.getsFinalQueryCobrarClientesSaldos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CobrarClientesSaldosConstantesFunciones.getArrayColumnasGlobalesNoCobrarClientesSaldos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CobrarClientesSaldosConstantesFunciones.getArrayColumnasGlobalesCobrarClientesSaldos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CobrarClientesSaldosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cobrarclientessaldossEliminados= new ArrayList<CobrarClientesSaldos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCobrarClientesSaldos();
		
				///*CobrarClientesSaldosSessionBean*/this.cobrarclientessaldosSessionBean=new CobrarClientesSaldosSessionBean();
			
			if(this.cobrarclientessaldosSessionBean==null) {
				this.cobrarclientessaldosSessionBean=new CobrarClientesSaldosSessionBean();
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
					this.iNumeroPaginacion=CobrarClientesSaldosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CobrarClientesSaldosConstantesFunciones.getClassesForeignKeysOfCobrarClientesSaldos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cobrarclientessaldos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cobrarclientessaldossAux= new ArrayList<CobrarClientesSaldos>();
			
				
			cobrarclientessaldosLogic.setDatosCliente(this.datosCliente);
			cobrarclientessaldosLogic.setDatosDeep(this.datosDeep);
			cobrarclientessaldosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCobrarClientesSaldos")) {
				this.sDetalleReporte=CobrarClientesSaldosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesSaldos(id_ejercicioBusquedaCobrarClientesSaldos,fecha_emision_hastaBusquedaCobrarClientesSaldos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cobrarclientessaldosLogic.getCobrarClientesSaldossBusquedaCobrarClientesSaldos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaCobrarClientesSaldos,fecha_emision_hastaBusquedaCobrarClientesSaldos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarClientesSaldosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesSaldos(id_ejercicioBusquedaCobrarClientesSaldos,fecha_emision_hastaBusquedaCobrarClientesSaldos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarClientesSaldosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesSaldos(id_ejercicioBusquedaCobrarClientesSaldos,fecha_emision_hastaBusquedaCobrarClientesSaldos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cobrarclientessaldosLogic.getCobrarClientesSaldoss()==null||cobrarclientessaldosLogic.getCobrarClientesSaldoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cobrarclientessaldoss==null|| cobrarclientessaldoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientessaldossAux=new ArrayList<CobrarClientesSaldos>();
						cobrarclientessaldossAux.addAll(cobrarclientessaldosLogic.getCobrarClientesSaldoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclientessaldossAux=new ArrayList<CobrarClientesSaldos>();
							cobrarclientessaldossAux.addAll(cobrarclientessaldoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cobrarclientessaldosLogic.getCobrarClientesSaldossBusquedaCobrarClientesSaldos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaCobrarClientesSaldos,fecha_emision_hastaBusquedaCobrarClientesSaldos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarClientesSaldosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesSaldos(id_ejercicioBusquedaCobrarClientesSaldos,fecha_emision_hastaBusquedaCobrarClientesSaldos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarClientesSaldosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesSaldos(id_ejercicioBusquedaCobrarClientesSaldos,fecha_emision_hastaBusquedaCobrarClientesSaldos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCobrarClientesSaldoss("BusquedaCobrarClientesSaldos",cobrarclientessaldosLogic.getCobrarClientesSaldoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCobrarClientesSaldoss("BusquedaCobrarClientesSaldos",cobrarclientessaldoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientessaldosLogic.setCobrarClientesSaldoss(new ArrayList<CobrarClientesSaldos>());
						cobrarclientessaldosLogic.getCobrarClientesSaldoss().addAll(cobrarclientessaldossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclientessaldoss=new ArrayList<CobrarClientesSaldos>();
							cobrarclientessaldoss.addAll(cobrarclientessaldossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCobrarClientesSaldos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCobrarClientesSaldos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarclientessaldosLogic.getCobrarClientesSaldoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclientessaldoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarclientessaldosLogic.getCobrarClientesSaldoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclientessaldoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CobrarClientesSaldos cobrarclientessaldos) {
		Boolean permite=true;
		
		if(this.cobrarclientessaldos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CobrarClientesSaldosConstantesFunciones.getOrderByListaCobrarClientesSaldos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CobrarClientesSaldosConstantesFunciones.getOrderByListaCobrarClientesSaldos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesSaldos cobrarclientessaldos:cobrarclientessaldosLogic.getCobrarClientesSaldoss()) {
				if(cobrarclientessaldos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientessaldosTotales=cobrarclientessaldos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesSaldos cobrarclientessaldos:this.cobrarclientessaldoss) {
				if(cobrarclientessaldos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientessaldosTotales=cobrarclientessaldos;
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
			this.cobrarclientessaldosAux=new CobrarClientesSaldos();
			this.cobrarclientessaldosAux.setsType(Constantes2.S_TOTALES);
			this.cobrarclientessaldosAux.setIsNew(false);
			this.cobrarclientessaldosAux.setIsChanged(false);
			this.cobrarclientessaldosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CobrarClientesSaldosConstantesFunciones.TotalizarValoresFilaCobrarClientesSaldos(this.cobrarclientessaldosLogic.getCobrarClientesSaldoss(),this.cobrarclientessaldosAux);
				
				//this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().add(this.cobrarclientessaldosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CobrarClientesSaldosConstantesFunciones.TotalizarValoresFilaCobrarClientesSaldos(this.cobrarclientessaldoss,this.cobrarclientessaldosAux);
				
				this.cobrarclientessaldoss.add(this.cobrarclientessaldosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cobrarclientessaldosTotales=new CobrarClientesSaldos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().remove(cobrarclientessaldosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarclientessaldoss.remove(cobrarclientessaldosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cobrarclientessaldosTotales=new CobrarClientesSaldos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesSaldos cobrarclientessaldos:cobrarclientessaldosLogic.getCobrarClientesSaldoss()) {
				if(cobrarclientessaldos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientessaldosTotales=cobrarclientessaldos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarClientesSaldosConstantesFunciones.TotalizarValoresFilaCobrarClientesSaldos(this.cobrarclientessaldosLogic.getCobrarClientesSaldoss(),cobrarclientessaldosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesSaldos cobrarclientessaldos:this.cobrarclientessaldoss) {
				if(cobrarclientessaldos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientessaldosTotales=cobrarclientessaldos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarClientesSaldosConstantesFunciones.TotalizarValoresFilaCobrarClientesSaldos(this.cobrarclientessaldoss,cobrarclientessaldosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCobrarClientesSaldossBusquedaCobrarClientesSaldos()throws Exception {
		try {
			sAccionBusqueda="BusquedaCobrarClientesSaldos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesSaldossFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesSaldossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesSaldossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCobrarClientesSaldossBusquedaCobrarClientesSaldos(String sFinalQuery,Long id_ejercicio,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclientessaldosLogic.getCobrarClientesSaldossBusquedaCobrarClientesSaldos(sFinalQuery,this.pagination,id_ejercicio,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesSaldossFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclientessaldosLogic.getCobrarClientesSaldossFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesSaldossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclientessaldosLogic.getCobrarClientesSaldossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesSaldossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclientessaldosLogic.getCobrarClientesSaldossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosCobrarClientesSaldos() {
		this.isPermisoTodoCobrarClientesSaldos=false;
		this.isPermisoNuevoCobrarClientesSaldos=false;
		this.isPermisoActualizarCobrarClientesSaldos=false;
		this.isPermisoActualizarOriginalCobrarClientesSaldos=false;
		this.isPermisoEliminarCobrarClientesSaldos=false;
		this.isPermisoGuardarCambiosCobrarClientesSaldos=false;
		this.isPermisoConsultaCobrarClientesSaldos=true;
		this.isPermisoBusquedaCobrarClientesSaldos=true;
		this.isPermisoReporteCobrarClientesSaldos=true;
		this.isPermisoOrdenCobrarClientesSaldos=false;		
		this.isPermisoPaginacionMedioCobrarClientesSaldos=false;		
		this.isPermisoPaginacionAltoCobrarClientesSaldos=false;		
		this.isPermisoPaginacionTodoCobrarClientesSaldos=false;		
		this.isPermisoCopiarCobrarClientesSaldos=false;		
		this.isPermisoVerFormCobrarClientesSaldos=false;		
		this.isPermisoDuplicarCobrarClientesSaldos=false;
		this.isPermisoOrdenCobrarClientesSaldos=false;
	}
	
	public void setPermisosUsuarioCobrarClientesSaldos(Boolean isPermiso) {
		this.isPermisoTodoCobrarClientesSaldos=isPermiso;
		this.isPermisoNuevoCobrarClientesSaldos=isPermiso;
		this.isPermisoActualizarCobrarClientesSaldos=isPermiso;
		this.isPermisoActualizarOriginalCobrarClientesSaldos=isPermiso;
		this.isPermisoEliminarCobrarClientesSaldos=isPermiso;
		this.isPermisoGuardarCambiosCobrarClientesSaldos=isPermiso;
		this.isPermisoConsultaCobrarClientesSaldos=isPermiso;
		this.isPermisoBusquedaCobrarClientesSaldos=isPermiso;
		this.isPermisoReporteCobrarClientesSaldos=isPermiso;
		this.isPermisoOrdenCobrarClientesSaldos=isPermiso;		
		this.isPermisoPaginacionMedioCobrarClientesSaldos=isPermiso;		
		this.isPermisoPaginacionAltoCobrarClientesSaldos=isPermiso;		
		this.isPermisoPaginacionTodoCobrarClientesSaldos=isPermiso;		
		this.isPermisoCopiarCobrarClientesSaldos=isPermiso;		
		this.isPermisoVerFormCobrarClientesSaldos=isPermiso;		
		this.isPermisoDuplicarCobrarClientesSaldos=isPermiso;
		this.isPermisoOrdenCobrarClientesSaldos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCobrarClientesSaldos(Boolean isPermiso) {
		//this.isPermisoTodoCobrarClientesSaldos=isPermiso;
		this.isPermisoNuevoCobrarClientesSaldos=isPermiso;
		this.isPermisoActualizarCobrarClientesSaldos=isPermiso;
		this.isPermisoActualizarOriginalCobrarClientesSaldos=isPermiso;
		this.isPermisoEliminarCobrarClientesSaldos=isPermiso;
		this.isPermisoGuardarCambiosCobrarClientesSaldos=isPermiso;
		//this.isPermisoConsultaCobrarClientesSaldos=isPermiso;
		//this.isPermisoBusquedaCobrarClientesSaldos=isPermiso;
		//this.isPermisoReporteCobrarClientesSaldos=isPermiso;
		//this.isPermisoOrdenCobrarClientesSaldos=isPermiso;		
		//this.isPermisoPaginacionMedioCobrarClientesSaldos=isPermiso;		
		//this.isPermisoPaginacionAltoCobrarClientesSaldos=isPermiso;		
		//this.isPermisoPaginacionTodoCobrarClientesSaldos=isPermiso;		
		//this.isPermisoCopiarCobrarClientesSaldos=isPermiso;		
		//this.isPermisoDuplicarCobrarClientesSaldos=isPermiso;
		//this.isPermisoOrdenCobrarClientesSaldos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCobrarClientesSaldosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CobrarClientesSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCobrarClientesSaldos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCobrarClientesSaldosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCobrarClientesSaldosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCobrarClientesSaldosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCobrarClientesSaldosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCobrarClientesSaldos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CobrarClientesSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CobrarClientesSaldosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCobrarClientesSaldos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCobrarClientesSaldos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCobrarClientesSaldos=this.isPermisoActualizarCobrarClientesSaldos;
			this.isPermisoEliminarCobrarClientesSaldos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCobrarClientesSaldos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCobrarClientesSaldos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCobrarClientesSaldos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCobrarClientesSaldos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCobrarClientesSaldos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarClientesSaldos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCobrarClientesSaldos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCobrarClientesSaldos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCobrarClientesSaldos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCobrarClientesSaldos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCobrarClientesSaldos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCobrarClientesSaldos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarClientesSaldos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCobrarClientesSaldos.setToolTipText(this.jTableDatosCobrarClientesSaldos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCobrarClientesSaldos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCobrarClientesSaldos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CobrarClientesSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CobrarClientesSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCobrarClientesSaldos() throws Exception {
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
	public void inicializarCombosForeignKeyCobrarClientesSaldosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCobrarClientesSaldosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CobrarClientesSaldosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyCobrarClientesSaldos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cobrarclientessaldosSessionBean==null) {
				this.cobrarclientessaldosSessionBean=new CobrarClientesSaldosSessionBean();
			}

			if(!this.cobrarclientessaldosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cobrarclientessaldosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.cobrarclientessaldosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
	
	public void initActionsCombosTodosForeignKeyCobrarClientesSaldos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCobrarClientesSaldos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCobrarClientesSaldos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesSaldos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCobrarClientesSaldos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesSaldos()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_ejercicioCobrarClientesSaldos.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCobrarClientesSaldos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCobrarClientesSaldos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCobrarClientesSaldos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCobrarClientesSaldos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCobrarClientesSaldos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCobrarClientesSaldos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_empresaCobrarClientesSaldos!=null && this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_empresaCobrarClientesSaldos.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_empresaCobrarClientesSaldos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_sucursalCobrarClientesSaldos!=null && this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_sucursalCobrarClientesSaldos.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_sucursalCobrarClientesSaldos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_ejercicioCobrarClientesSaldos!=null && this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_ejercicioCobrarClientesSaldos.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_ejercicioCobrarClientesSaldos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public CobrarClientesSaldosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CobrarClientesSaldosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CobrarClientesSaldosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cobrarclientessaldosSessionBean=new CobrarClientesSaldosSessionBean(); 
		this.cobrarclientessaldosConstantesFunciones=new CobrarClientesSaldosConstantesFunciones(); 
		this.cobrarclientessaldosBean=new CobrarClientesSaldos();//(this.cobrarclientessaldosConstantesFunciones); 		
		this.cobrarclientessaldosReturnGeneral=new CobrarClientesSaldosParameterReturnGeneral(); 
		
		this.cobrarclientessaldosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclientessaldosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CobrarClientesSaldosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CobrarClientesSaldosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CobrarClientesSaldosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCobrarClientesSaldos(true);
			
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
			
			this.cobrarclientessaldosConstantesFunciones=new CobrarClientesSaldosConstantesFunciones(); 
			this.cobrarclientessaldosBean=new CobrarClientesSaldos();//this.cobrarclientessaldosConstantesFunciones); 			
			this.cobrarclientessaldosReturnGeneral=new CobrarClientesSaldosParameterReturnGeneral(); 
		
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Clientes Saldos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cobrarclientessaldos=new CobrarClientesSaldos();
			this.cobrarclientessaldoss = new ArrayList<CobrarClientesSaldos>();
			this.cobrarclientessaldossAux = new ArrayList<CobrarClientesSaldos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic=new CobrarClientesSaldosLogic();
				this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
			}
			
			//this.cobrarclientessaldosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cobrarclientessaldosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCobrarClientesSaldos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCobrarClientesSaldos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarClientesSaldos);	
					}
					
					if(this.jInternalFrameImportacionCobrarClientesSaldos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarClientesSaldos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCobrarClientesSaldos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCobrarClientesSaldos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarClientesSaldos);
				this.jInternalFrameDetalleFormCobrarClientesSaldos.setVisible(false);
				this.jInternalFrameDetalleFormCobrarClientesSaldos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarClientesSaldos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarClientesSaldos);
					this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setVisible(false);
					this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCobrarClientesSaldos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCobrarClientesSaldos);
					this.jInternalFrameImportacionCobrarClientesSaldos.setVisible(false);
					this.jInternalFrameImportacionCobrarClientesSaldos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCobrarClientesSaldos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCobrarClientesSaldos);
					this.jInternalFrameOrderByCobrarClientesSaldos.setVisible(false);
					this.jInternalFrameOrderByCobrarClientesSaldos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCobrarClientesSaldosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CobrarClientesSaldosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cobrarclientessaldosReturnGeneral=new CobrarClientesSaldosParameterReturnGeneral();
			
			this.cobrarclientessaldosParameterGeneral=new CobrarClientesSaldosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cobrarclientessaldosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CobrarClientesSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarClientesSaldosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado(),this.cobrarclientessaldosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarClientesSaldosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado(),this.cobrarclientessaldosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCobrarClientesSaldos=false;
			this.isVisibilidadCeldaDuplicarCobrarClientesSaldos=true;
			this.isVisibilidadCeldaCopiarCobrarClientesSaldos=true;
			this.isVisibilidadCeldaVerFormCobrarClientesSaldos=true;
			this.isVisibilidadCeldaOrdenCobrarClientesSaldos=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos=false;
			this.isVisibilidadCeldaModificarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaGuardarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos=false;
			
			
			this.isVisibilidadBusquedaCobrarClientesSaldos=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCobrarClientesSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCobrarClientesSaldos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCobrarClientesSaldos(false);
			
			this.setPermisosUsuarioCobrarClientesSaldos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado() 
				|| (this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado() && this.cobrarclientessaldosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCobrarClientesSaldosClasesRelacionadas();
			}
			
			if(this.cobrarclientessaldosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCobrarClientesSaldosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCobrarClientesSaldos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCobrarClientesSaldos();
			}
			
			if(!this.isPermisoBusquedaCobrarClientesSaldos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCobrarClientesSaldos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CobrarClientesSaldosConstantesFunciones.getTiposSeleccionarCobrarClientesSaldos());
				
				this.tiposColumnasSelect=CobrarClientesSaldosConstantesFunciones.getTiposSeleccionarCobrarClientesSaldos(true);
				
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
			//if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCobrarClientesSaldos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioCobrarClientesSaldos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioCobrarClientesSaldos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesSaldos() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cobrarclientessaldosImplementable= (CobrarClientesSaldosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarClientesSaldosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cobrarclientessaldosImplementableHome= (CobrarClientesSaldosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarClientesSaldosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cobrarclientessaldoss= new ArrayList<CobrarClientesSaldos>();
			this.cobrarclientessaldossEliminados= new ArrayList<CobrarClientesSaldos>();
						
			this.isEsNuevoCobrarClientesSaldos=false;
			this.esParaAccionDesdeFormularioCobrarClientesSaldos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCobrarClientesSaldos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCobrarClientesSaldos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CobrarClientesSaldosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCobrarClientesSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCobrarClientesSaldos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCobrarClientesSaldos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCobrarClientesSaldos();
			}
			
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCobrarClientesSaldos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCobrarClientesSaldos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCobrarClientesSaldos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCobrarClientesSaldos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CobrarClientesSaldos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCobrarClientesSaldos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCobrarClientesSaldos")) {
				iIndex=this.jInternalFrameDetalleFormCobrarClientesSaldos.jTabbedPaneRelacionesCobrarClientesSaldos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCobrarClientesSaldos.jTabbedPaneRelacionesCobrarClientesSaldos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCobrarClientesSaldos();	
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
	
	public void cargarCombosForeignKeyCobrarClientesSaldos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCobrarClientesSaldos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCobrarClientesSaldos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCobrarClientesSaldosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCobrarClientesSaldos();
		
		this.cargarCombosFrameForeignKeyCobrarClientesSaldos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCobrarClientesSaldos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCobrarClientesSaldos();
		}
	}
	
	
	
	public void jButtonNuevoCobrarClientesSaldosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cobrarclientessaldosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
			
			
			if(jTableDatosCobrarClientesSaldos.getRowCount()>=1) {
				jTableDatosCobrarClientesSaldos.removeRowSelectionInterval(0, jTableDatosCobrarClientesSaldos.getRowCount()-1);						
			}
			
			this.isEsNuevoCobrarClientesSaldos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCobrarClientesSaldos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCobrarClientesSaldos(true);			
			//this.cobrarclientessaldos=new CobrarClientesSaldos();
			//this.cobrarclientessaldos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesSaldos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesSaldos() ;
			
			if(CobrarClientesSaldosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesSaldos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cobrarclientessaldos);	
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessaldos);				
			
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
			
			if(this.cobrarclientessaldosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CobrarClientesSaldos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCobrarClientesSaldosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CobrarClientesSaldos> cobrarclientessaldossSeleccionados=new ArrayList<CobrarClientesSaldos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCobrarClientesSaldos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCobrarClientesSaldos.getSelectedRows().length;			
			}
			
			cobrarclientessaldossSeleccionados=this.getCobrarClientesSaldossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCobrarClientesSaldos--;			
				//CobrarClientesSaldos cobrarclientessaldosAux= new CobrarClientesSaldos();			
				//cobrarclientessaldosAux.setId(this.iIdNuevoCobrarClientesSaldos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CobrarClientesSaldos cobrarclientessaldosOrigen=new CobrarClientesSaldos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CobrarClientesSaldos cobrarclientessaldosOrigen : cobrarclientessaldossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cobrarclientessaldosOrigen =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclientessaldosOrigen =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCobrarClientesSaldos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cobrarclientessaldos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCobrarClientesSaldos(cobrarclientessaldosOrigen,this.cobrarclientessaldos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().add(this.cobrarclientessaldosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarclientessaldoss.add(this.cobrarclientessaldosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCobrarClientesSaldos(false);
				
				this.jTableDatosCobrarClientesSaldos.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesSaldos(), this.getIndiceNuevoCobrarClientesSaldos());
				
				int iLastRow =  this.jTableDatosCobrarClientesSaldos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarClientesSaldos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarClientesSaldos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesSaldos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CobrarClientesSaldos> cobrarclientessaldossSeleccionados=new ArrayList<CobrarClientesSaldos>();									
		
			CobrarClientesSaldos cobrarclientessaldosOrigen=new CobrarClientesSaldos();
			CobrarClientesSaldos cobrarclientessaldosDestino=new CobrarClientesSaldos();
				
			cobrarclientessaldossSeleccionados=this.getCobrarClientesSaldossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCobrarClientesSaldos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cobrarclientessaldossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCobrarClientesSaldos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientessaldosOrigen =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarclientessaldosOrigen =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientessaldosDestino =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarclientessaldosDestino =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cobrarclientessaldosOrigen =cobrarclientessaldossSeleccionados.get(0);
				cobrarclientessaldosDestino =cobrarclientessaldossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCobrarClientesSaldos(cobrarclientessaldosOrigen,cobrarclientessaldosDestino,true,false);
				
				cobrarclientessaldosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cobrarclientessaldosDestino,cobrarclientessaldosLogic.getCobrarClientesSaldoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobrarclientessaldosDestino,cobrarclientessaldoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCobrarClientesSaldos(false);
				
				//this.jTableDatosCobrarClientesSaldos.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesSaldos(), this.getIndiceNuevoCobrarClientesSaldos());
				
				int iLastRow =  this.jTableDatosCobrarClientesSaldos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarClientesSaldos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarClientesSaldos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesSaldos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCobrarClientesSaldos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCobrarClientesSaldos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCobrarClientesSaldos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCobrarClientesSaldos.setVisible(!isVisible);
			this.jPanelPaginacionCobrarClientesSaldos.setVisible(!isVisible);
			this.jPanelAccionesCobrarClientesSaldos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCobrarClientesSaldos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCobrarClientesSaldos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCobrarClientesSaldos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCobrarClientesSaldos();
			
			this.abrirFrameOrderByCobrarClientesSaldos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCobrarClientesSaldos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCobrarClientesSaldos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarClientesSaldos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCobrarClientesSaldos.isMaximum()) {
					this.jInternalFrameDetalleFormCobrarClientesSaldos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCobrarClientesSaldos.setSize(this.jInternalFrameDetalleFormCobrarClientesSaldos.iWidthFormulario,this.jInternalFrameDetalleFormCobrarClientesSaldos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCobrarClientesSaldos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCobrarClientesSaldos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCobrarClientesSaldos.isMaximum()) {
						this.jInternalFrameDetalleFormCobrarClientesSaldos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCobrarClientesSaldos.jContentPaneDetalleCobrarClientesSaldos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCobrarClientesSaldos.jTabbedPaneRelacionesCobrarClientesSaldos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesSaldos.jContentPaneDetalleCobrarClientesSaldos.getWidth(),CobrarClientesSaldosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarClientesSaldos.jTabbedPaneRelacionesCobrarClientesSaldos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesSaldos.jContentPaneDetalleCobrarClientesSaldos.getWidth(),CobrarClientesSaldosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarClientesSaldos.jTabbedPaneRelacionesCobrarClientesSaldos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesSaldos.jContentPaneDetalleCobrarClientesSaldos.getWidth(),CobrarClientesSaldosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCobrarClientesSaldos.setVisible(true);
	        this.jInternalFrameDetalleFormCobrarClientesSaldos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCobrarClientesSaldos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCobrarClientesSaldos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCobrarClientesSaldos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesSaldos,false,this);
				} else {
					this.jInternalFrameOrderByCobrarClientesSaldos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesSaldos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCobrarClientesSaldos);
				this.jInternalFrameOrderByCobrarClientesSaldos.setVisible(false);
				this.jInternalFrameOrderByCobrarClientesSaldos.setSelected(false);
				
				this.jInternalFrameOrderByCobrarClientesSaldos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarClientesSaldos"));
				
				this.inicializarActualizarBindingTablaOrderByCobrarClientesSaldos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCobrarClientesSaldos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCobrarClientesSaldos==null) {
				
				this.jInternalFrameImportacionCobrarClientesSaldos=new ImportacionJInternalFrame(CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarClientesSaldos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCobrarClientesSaldos);
				this.jInternalFrameImportacionCobrarClientesSaldos.setVisible(false);
				this.jInternalFrameImportacionCobrarClientesSaldos.setSelected(false);


				this.jInternalFrameImportacionCobrarClientesSaldos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarClientesSaldos"));
				this.jInternalFrameImportacionCobrarClientesSaldos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarClientesSaldos"));
				this.jInternalFrameImportacionCobrarClientesSaldos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarClientesSaldos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCobrarClientesSaldos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesSaldos==null) {
				this.jInternalFrameReporteDinamicoCobrarClientesSaldos=new ReporteDinamicoJInternalFrame(CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarClientesSaldos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarClientesSaldos);
				this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setVisible(false);
				this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesSaldos"));
				this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesSaldos"));
				this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesSaldos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesSaldos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCobrarClientesSaldos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarClientesSaldos);
			
	       	this.jInternalFrameDetalleFormCobrarClientesSaldos.setVisible(false);
	        this.jInternalFrameDetalleFormCobrarClientesSaldos.setSelected(false);
			
			//this.jInternalFrameDetalleFormCobrarClientesSaldos.dispose();
			//this.jInternalFrameDetalleFormCobrarClientesSaldos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCobrarClientesSaldos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setVisible(true);
	        this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCobrarClientesSaldos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCobrarClientesSaldos.setVisible(true);
	        this.jInternalFrameImportacionCobrarClientesSaldos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCobrarClientesSaldos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCobrarClientesSaldos.setVisible(true);
	        this.jInternalFrameOrderByCobrarClientesSaldos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCobrarClientesSaldos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCobrarClientesSaldos.setVisible(false);
	        this.jInternalFrameOrderByCobrarClientesSaldos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCobrarClientesSaldos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setVisible(false);
	        this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCobrarClientesSaldos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCobrarClientesSaldos.setVisible(false);
	        this.jInternalFrameImportacionCobrarClientesSaldos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCobrarClientesSaldos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCobrarClientesSaldos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCobrarClientesSaldos(true);
			//this.isEsNuevoCobrarClientesSaldos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCobrarClientesSaldos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesSaldos(false) ;
			
			if(cobrarclientessaldosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CobrarClientesSaldosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesSaldos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesSaldos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCobrarClientesSaldosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCobrarClientesSaldos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCobrarClientesSaldos(true);
			//this.isEsNuevoCobrarClientesSaldos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cobrarclientessaldos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCobrarClientesSaldos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCobrarClientesSaldos(false) ;
			
			if(CobrarClientesSaldosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesSaldos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesSaldos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	
	public void jButtonActualizarCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCobrarClientesSaldos(false);
			
			//if(!this.isEsNuevoCobrarClientesSaldos) {								
				int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
				
			}
			
			if(this.permiteMantenimiento(this.cobrarclientessaldos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCobrarClientesSaldos=true;
					this.inicializarActualizarBindingTablaCobrarClientesSaldos(false);
					this.isEsNuevoCobrarClientesSaldos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCobrarClientesSaldos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCobrarClientesSaldos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarClientesSaldos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesSaldos(false);
				
				this.habilitarDeshabilitarControlesCobrarClientesSaldos(false);
			
												
				
				if(CobrarClientesSaldosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCobrarClientesSaldos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCobrarClientesSaldosActionPerformed(evt,cobrarclientessaldosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCobrarClientesSaldos(this.cobrarclientessaldos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCobrarClientesSaldos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cobrarclientessaldosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cobrarclientessaldos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSaldos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSaldos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				this.cobrarclientessaldos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				this.cobrarclientessaldos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cobrarclientessaldos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CobrarClientesSaldosModel) this.jTableDatosCobrarClientesSaldos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCobrarClientesSaldos=true;
				this.inicializarActualizarBindingTablaCobrarClientesSaldos(false);
				this.isEsNuevoCobrarClientesSaldos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarClientesSaldos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesSaldos(false);
				
				this.habilitarDeshabilitarControlesCobrarClientesSaldos(false);
				
				
				
				if(CobrarClientesSaldosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCobrarClientesSaldos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCobrarClientesSaldos.getRowCount()>=1) {
				jTableDatosCobrarClientesSaldos.removeRowSelectionInterval(0, jTableDatosCobrarClientesSaldos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCobrarClientesSaldos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCobrarClientesSaldos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesSaldos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesSaldos(false) ;
			
			this.isEsNuevoCobrarClientesSaldos=false;
			
			if(CobrarClientesSaldosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCobrarClientesSaldos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCobrarClientesSaldos(false);
				
				//SI ES MANUAL
				if(CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCobrarClientesSaldos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCobrarClientesSaldos--;			
			//CobrarClientesSaldos cobrarclientessaldosAux= new CobrarClientesSaldos();			
			//cobrarclientessaldosAux.setId(this.iIdNuevoCobrarClientesSaldos);
			
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCobrarClientesSaldos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
			
			this.cobrarclientessaldos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().add(this.cobrarclientessaldosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cobrarclientessaldoss.add(this.cobrarclientessaldosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCobrarClientesSaldos(false);
			
			this.jTableDatosCobrarClientesSaldos.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesSaldos(), this.getIndiceNuevoCobrarClientesSaldos());
			
			int iLastRow =  this.jTableDatosCobrarClientesSaldos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCobrarClientesSaldos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCobrarClientesSaldos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCobrarClientesSaldos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCobrarClientesSaldos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesSaldos(false);
			
			//SI ES MANUAL
			if(CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesSaldos();
			}
			
			//this.abrirFrameTreeCobrarClientesSaldos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCobrarClientesSaldos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCobrarClientesSaldos.setFileImportacion(this.jInternalFrameImportacionCobrarClientesSaldos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCobrarClientesSaldos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCobrarClientesSaldos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCobrarClientesSaldos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCobrarClientesSaldos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CobrarClientesSaldos> cobrarclientessaldossSeleccionados=new ArrayList<CobrarClientesSaldos>();		

		cobrarclientessaldossSeleccionados=this.getCobrarClientesSaldossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CobrarClientesSaldosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CobrarClientesSaldosBaseDesign.jrxml";
			
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
			
			this.generarReporteCobrarClientesSaldoss("Todos",cobrarclientessaldossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreComercial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreComercial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreComercial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreComercial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreGarantia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreGarantia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreGarantia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreGarantia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_LIMITECREDITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_miteCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_miteCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_miteCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_miteCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_TOTALPEDIDOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talPedidos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talPedidos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talPedidos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talPedidos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_TOTALSALDOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talSaldos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talSaldos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talSaldos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talSaldos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_TOTALCHEQUES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talCheques_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talCheques_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talCheques_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talCheques_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL:
					sNombreCampoCategoria="nombre_comercial";
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA:
					sNombreCampoCategoria="nombre_garantia";
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_LIMITECREDITO:
					sNombreCampoCategoria="limite_credito";
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_TOTALPEDIDOS:
					sNombreCampoCategoria="total_pedidos";
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_TOTALSALDOS:
					sNombreCampoCategoria="total_saldos";
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_TOTALCHEQUES:
					sNombreCampoCategoria="total_cheques";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL:
					sNombreCampoCategoriaValor="nombre_comercial";
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA:
					sNombreCampoCategoriaValor="nombre_garantia";
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_LIMITECREDITO:
					sNombreCampoCategoriaValor="limite_credito";
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_TOTALPEDIDOS:
					sNombreCampoCategoriaValor="total_pedidos";
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_TOTALSALDOS:
					sNombreCampoCategoriaValor="total_saldos";
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_TOTALCHEQUES:
					sNombreCampoCategoriaValor="total_cheques";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Comercial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_comercial");
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Garantia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_garantia");
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_LIMITECREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Limite Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"limite_credito");
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_TOTALPEDIDOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Pedos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_pedidos");
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_TOTALSALDOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Saldos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_saldos");
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_TOTALCHEQUES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Cheques",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_cheques");
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
	
	public void jButtonGenerarExcelReporteDinamicoCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CobrarClientesSaldos> cobrarclientessaldossSeleccionados=new ArrayList<CobrarClientesSaldos>();		
		
		cobrarclientessaldossSeleccionados=this.getCobrarClientesSaldossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientessaldos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CobrarClientesSaldoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CobrarClientesSaldosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CobrarClientesSaldos cobrarclientessaldos:cobrarclientessaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessaldos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CobrarClientesSaldos cobrarclientessaldos:cobrarclientessaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessaldos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(CobrarClientesSaldos cobrarclientessaldos:cobrarclientessaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessaldos.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(CobrarClientesSaldos cobrarclientessaldos:cobrarclientessaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessaldos.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CobrarClientesSaldos cobrarclientessaldos:cobrarclientessaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessaldos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(CobrarClientesSaldos cobrarclientessaldos:cobrarclientessaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessaldos.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL);
					iRow++;

					for(CobrarClientesSaldos cobrarclientessaldos:cobrarclientessaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessaldos.getnombre_comercial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA);
					iRow++;

					for(CobrarClientesSaldos cobrarclientessaldos:cobrarclientessaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessaldos.getnombre_garantia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_LIMITECREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_LIMITECREDITO);
					iRow++;

					for(CobrarClientesSaldos cobrarclientessaldos:cobrarclientessaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessaldos.getlimite_credito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_TOTALPEDIDOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALPEDIDOS);
					iRow++;

					for(CobrarClientesSaldos cobrarclientessaldos:cobrarclientessaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessaldos.gettotal_pedidos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_TOTALSALDOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALSALDOS);
					iRow++;

					for(CobrarClientesSaldos cobrarclientessaldos:cobrarclientessaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessaldos.gettotal_saldos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSaldosConstantesFunciones.LABEL_TOTALCHEQUES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALCHEQUES);
					iRow++;

					for(CobrarClientesSaldos cobrarclientessaldos:cobrarclientessaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessaldos.gettotal_cheques());
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
			//	this.getFilaCabeceraExportarExcelCobrarClientesSaldos(row);				
			//	iRow++;
			//}				
			
			//for(CobrarClientesSaldos cobrarclientessaldosAux:cobrarclientessaldossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCobrarClientesSaldos(cobrarclientessaldosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Saldos",JOptionPane.INFORMATION_MESSAGE);
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
				this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesSaldos(false);
			
			//SI ES MANUAL
			if(CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesSaldos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesSaldos(false);
			
			//SI ES MANUAL
			if(CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarClientesSaldos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesSaldos(false);
			
			//SI ES MANUAL
			if(CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarClientesSaldos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCobrarClientesSaldos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCobrarClientesSaldos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCobrarClientesSaldos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCobrarClientesSaldos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCobrarClientesSaldos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCobrarClientesSaldos.setMinimumSize(dimensionMinimum);
		this.jTableDatosCobrarClientesSaldos.setMaximumSize(dimensionMaximum);
		this.jTableDatosCobrarClientesSaldos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCobrarClientesSaldos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCobrarClientesSaldos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCobrarClientesSaldos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCobrarClientesSaldos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCobrarClientesSaldos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCobrarClientesSaldos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesSaldos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCobrarClientesSaldos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCobrarClientesSaldos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCobrarClientesSaldos();
		
		this.inicializarActualizarBindingBotonesManualCobrarClientesSaldos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarClientesSaldos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesSaldos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesSaldos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesSaldos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCobrarClientesSaldos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCobrarClientesSaldos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCobrarClientesSaldos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCobrarClientesSaldos.jCheckBoxPostAccionNuevoCobrarClientesSaldos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCobrarClientesSaldos.jCheckBoxPostAccionSinCerrarCobrarClientesSaldos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCobrarClientesSaldos.jCheckBoxPostAccionSinMensajeCobrarClientesSaldos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCobrarClientesSaldos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCobrarClientesSaldos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCobrarClientesSaldos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
				this.jInternalFrameDetalleFormCobrarClientesSaldos.jCheckBoxPostAccionNuevoCobrarClientesSaldos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCobrarClientesSaldos.jCheckBoxPostAccionSinCerrarCobrarClientesSaldos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCobrarClientesSaldos.jCheckBoxPostAccionSinMensajeCobrarClientesSaldos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCobrarClientesSaldos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCobrarClientesSaldos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCobrarClientesSaldos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCobrarClientesSaldos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCobrarClientesSaldos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCobrarClientesSaldos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCobrarClientesSaldos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCobrarClientesSaldos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCobrarClientesSaldos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCobrarClientesSaldos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCobrarClientesSaldos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCobrarClientesSaldos(Boolean esInicializar) throws Exception {
		try	{	
			if(CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesSaldos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesSaldos() throws Exception {
		try	{
			if(CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarClientesSaldos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarClientesSaldos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarClientesSaldos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCobrarClientesSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCobrarClientesSaldos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCobrarClientesSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCobrarClientesSaldos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCobrarClientesSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCobrarClientesSaldos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCobrarClientesSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCobrarClientesSaldos.addItem(reporte);
			}
			
			
			if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCobrarClientesSaldos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCobrarClientesSaldos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCobrarClientesSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCobrarClientesSaldos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCobrarClientesSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCobrarClientesSaldos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCobrarClientesSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCobrarClientesSaldos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCobrarClientesSaldos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesSaldos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesSaldos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarClientesSaldos!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarClientesSaldos!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesSaldos!=null) {
				
				if(this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CobrarClientesSaldosConstantesFunciones.getTiposSeleccionarCobrarClientesSaldos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CobrarClientesSaldosConstantesFunciones.getTiposSeleccionarCobrarClientesSaldos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CobrarClientesSaldosConstantesFunciones.getTiposSeleccionarCobrarClientesSaldos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCobrarClientesSaldos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.getSelectedItem()!=null){this.id_ejercicioBusquedaCobrarClientesSaldos=((Ejercicio)this.jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.getSelectedItem()).getId();}
		this.fecha_emision_hastaBusquedaCobrarClientesSaldos=new Date(this.jDateChooserfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCobrarClientesSaldos(Boolean esInicializar) throws Exception {				
		if(CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarClientesSaldos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCobrarClientesSaldos() throws Exception {
		this.inicializarActualizarBindingTablaCobrarClientesSaldos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCobrarClientesSaldos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCobrarClientesSaldos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCobrarClientesSaldos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesSaldos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CobrarClientesSaldosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCobrarClientesSaldos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesSaldos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CobrarClientesSaldosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCobrarClientesSaldosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSaldosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CobrarClientesSaldosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCobrarClientesSaldos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesSaldos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CobrarClientesSaldosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCobrarClientesSaldos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCobrarClientesSaldos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cobrarclientessaldosLogic.getCobrarClientesSaldoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cobrarclientessaldoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCobrarClientesSaldos.setModel(new CobrarClientesSaldosModel(this.cobrarclientessaldosLogic.getCobrarClientesSaldoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCobrarClientesSaldos.setModel(new CobrarClientesSaldosModel(this.cobrarclientessaldoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCobrarClientesSaldos!=null && this.jInternalFrameOrderByCobrarClientesSaldos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCobrarClientesSaldos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSaldos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CobrarClientesSaldosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO,cobrarclientessaldosConstantesFunciones.resaltarSeleccionarCobrarClientesSaldos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO,cobrarclientessaldosConstantesFunciones.resaltarSeleccionarCobrarClientesSaldos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSaldos,CobrarClientesSaldosConstantesFunciones.LABEL_ID));

		if(this.cobrarclientessaldosConstantesFunciones.mostraridCobrarClientesSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSaldosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarclientessaldosConstantesFunciones.resaltaridCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activaridCobrarClientesSaldos,iSizeTabla,this,true,"idCobrarClientesSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessaldosConstantesFunciones.resaltaridCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activaridCobrarClientesSaldos,this,true,"idCobrarClientesSaldos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSaldos,CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO));

		if(this.cobrarclientessaldosConstantesFunciones.mostrarcodigoCobrarClientesSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientessaldosConstantesFunciones.resaltarcodigoCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activarcodigoCobrarClientesSaldos,iSizeTabla,this,true,"codigoCobrarClientesSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessaldosConstantesFunciones.resaltarcodigoCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activarcodigoCobrarClientesSaldos,this,true,"codigoCobrarClientesSaldos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSaldos,CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.cobrarclientessaldosConstantesFunciones.mostrarnombre_completoCobrarClientesSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientessaldosConstantesFunciones.resaltarnombre_completoCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activarnombre_completoCobrarClientesSaldos,iSizeTabla,this,true,"nombre_completoCobrarClientesSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessaldosConstantesFunciones.resaltarnombre_completoCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activarnombre_completoCobrarClientesSaldos,this,true,"nombre_completoCobrarClientesSaldos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSaldos,CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL));

		if(this.cobrarclientessaldosConstantesFunciones.mostrarnombre_comercialCobrarClientesSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientessaldosConstantesFunciones.resaltarnombre_comercialCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activarnombre_comercialCobrarClientesSaldos,iSizeTabla,this,true,"nombre_comercialCobrarClientesSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessaldosConstantesFunciones.resaltarnombre_comercialCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activarnombre_comercialCobrarClientesSaldos,this,true,"nombre_comercialCobrarClientesSaldos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSaldos,CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA));

		if(this.cobrarclientessaldosConstantesFunciones.mostrarnombre_garantiaCobrarClientesSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientessaldosConstantesFunciones.resaltarnombre_garantiaCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activarnombre_garantiaCobrarClientesSaldos,iSizeTabla,this,true,"nombre_garantiaCobrarClientesSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessaldosConstantesFunciones.resaltarnombre_garantiaCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activarnombre_garantiaCobrarClientesSaldos,this,true,"nombre_garantiaCobrarClientesSaldos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSaldos,CobrarClientesSaldosConstantesFunciones.LABEL_LIMITECREDITO));

		if(this.cobrarclientessaldosConstantesFunciones.mostrarlimite_creditoCobrarClientesSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSaldosConstantesFunciones.LABEL_LIMITECREDITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarclientessaldosConstantesFunciones.resaltarlimite_creditoCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activarlimite_creditoCobrarClientesSaldos,iSizeTabla,this,true,"limite_creditoCobrarClientesSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessaldosConstantesFunciones.resaltarlimite_creditoCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activarlimite_creditoCobrarClientesSaldos,this,true,"limite_creditoCobrarClientesSaldos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarClientesSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSaldos,CobrarClientesSaldosConstantesFunciones.LABEL_TOTALPEDIDOS));

		if(this.cobrarclientessaldosConstantesFunciones.mostrartotal_pedidosCobrarClientesSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSaldosConstantesFunciones.LABEL_TOTALPEDIDOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarclientessaldosConstantesFunciones.resaltartotal_pedidosCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activartotal_pedidosCobrarClientesSaldos,iSizeTabla,this,true,"total_pedidosCobrarClientesSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessaldosConstantesFunciones.resaltartotal_pedidosCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activartotal_pedidosCobrarClientesSaldos,this,true,"total_pedidosCobrarClientesSaldos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarClientesSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSaldos,CobrarClientesSaldosConstantesFunciones.LABEL_TOTALSALDOS));

		if(this.cobrarclientessaldosConstantesFunciones.mostrartotal_saldosCobrarClientesSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSaldosConstantesFunciones.LABEL_TOTALSALDOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarclientessaldosConstantesFunciones.resaltartotal_saldosCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activartotal_saldosCobrarClientesSaldos,iSizeTabla,this,true,"total_saldosCobrarClientesSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessaldosConstantesFunciones.resaltartotal_saldosCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activartotal_saldosCobrarClientesSaldos,this,true,"total_saldosCobrarClientesSaldos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarClientesSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSaldos,CobrarClientesSaldosConstantesFunciones.LABEL_TOTALCHEQUES));

		if(this.cobrarclientessaldosConstantesFunciones.mostrartotal_chequesCobrarClientesSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSaldosConstantesFunciones.LABEL_TOTALCHEQUES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarclientessaldosConstantesFunciones.resaltartotal_chequesCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activartotal_chequesCobrarClientesSaldos,iSizeTabla,this,true,"total_chequesCobrarClientesSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessaldosConstantesFunciones.resaltartotal_chequesCobrarClientesSaldos,this.cobrarclientessaldosConstantesFunciones.activartotal_chequesCobrarClientesSaldos,this,true,"total_chequesCobrarClientesSaldos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarClientesSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarClientesSaldos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarClientesSaldos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCobrarClientesSaldos && this.isPermisoGuardarCambiosCobrarClientesSaldos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCobrarClientesSaldos.addColumn(tableColumn);
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
			
			this.jTableDatosCobrarClientesSaldos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarClientesSaldos && this.isPermisoGuardarCambiosCobrarClientesSaldos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarClientesSaldos && this.isPermisoGuardarCambiosCobrarClientesSaldos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCobrarClientesSaldos.moveColumn(this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCobrarClientesSaldos.moveColumn(this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCobrarClientesSaldos.moveColumn(this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCobrarClientesSaldos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCobrarClientesSaldos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCobrarClientesSaldos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCobrarClientesSaldos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCobrarClientesSaldos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCobrarClientesSaldos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cobrarclientessaldosLogic.getCobrarClientesSaldoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cobrarclientessaldoss.size()-1;
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
		//this.jTableDatosCobrarClientesSaldos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCobrarClientesSaldos();
			
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
				
				//this.isEsNuevoCobrarClientesSaldos=false;
					
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
			
				if(this.cobrarclientessaldosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCobrarClientesSaldos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarClientesSaldos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarClientesSaldos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cobrarclientessaldos.getsType().equals("DUPLICADO")
				   || this.cobrarclientessaldos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCobrarClientesSaldos=true;
				
				} else {
					this.isEsNuevoCobrarClientesSaldos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
					if(this.cobrarclientessaldos.getId()>=0 && !this.cobrarclientessaldos.getIsNew()) {						
						this.isEsNuevoCobrarClientesSaldos=false;
						
					} else {
						this.isEsNuevoCobrarClientesSaldos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCobrarClientesSaldos(esRelaciones);						
				
				this.seleccionarCobrarClientesSaldos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cobrarclientessaldos.getId()<0) {
					this.isEsNuevoCobrarClientesSaldos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCobrarClientesSaldos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCobrarClientesSaldos(evt,rowIndex);
				}	
				
				if(this.cobrarclientessaldosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CobrarClientesSaldos: " + this.dDif); 
					}
				}								
				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCobrarClientesSaldos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cobrarclientessaldos)) {
					if(this.cobrarclientessaldos.getId()>0) {
						this.cobrarclientessaldos.setIsDeleted(true);
						
						this.cobrarclientessaldossEliminados.add(this.cobrarclientessaldos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().remove(this.cobrarclientessaldos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarclientessaldoss.remove(this.cobrarclientessaldos);				
					}
					
					
					((CobrarClientesSaldosModel) this.jTableDatosCobrarClientesSaldos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesSaldos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCobrarClientesSaldos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCobrarClientesSaldos) {
			
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarClientesSaldos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarClientesSaldos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCobrarClientesSaldos(this.cobrarclientessaldos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCobrarClientesSaldos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCobrarClientesSaldos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesSaldos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCobrarClientesSaldos(cobrarclientessaldos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCobrarClientesSaldos(cobrarclientessaldos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCobrarClientesSaldos(cobrarclientessaldos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesSaldos(cobrarclientessaldos);
	}
	
	public void setVariablesObjetoActualToFormularioCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelidCobrarClientesSaldos.setText(cobrarclientessaldos.getId().toString());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldcodigoCobrarClientesSaldos.setText(cobrarclientessaldos.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_completoCobrarClientesSaldos.setText(cobrarclientessaldos.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_comercialCobrarClientesSaldos.setText(cobrarclientessaldos.getnombre_comercial());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_garantiaCobrarClientesSaldos.setText(cobrarclientessaldos.getnombre_garantia());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldlimite_creditoCobrarClientesSaldos.setText(cobrarclientessaldos.getlimite_credito().toString());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_pedidosCobrarClientesSaldos.setText(cobrarclientessaldos.gettotal_pedidos().toString());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_saldosCobrarClientesSaldos.setText(cobrarclientessaldos.gettotal_saldos().toString());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_chequesCobrarClientesSaldos.setText(cobrarclientessaldos.gettotal_cheques().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CobrarClientesSaldos cobrarclientessaldosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cobrarclientessaldosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CobrarClientesSaldos cobrarclientessaldosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cobrarclientessaldosLocal=this.cobrarclientessaldos;
			} else {
				cobrarclientessaldosLocal=this.cobrarclientessaldosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cobrarclientessaldosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCobrarClientesSaldos(cobrarclientessaldosLocal,true);
					
					if(cobrarclientessaldosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cobrarclientessaldosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cobrarclientessaldosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(cobrarclientessaldos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(cobrarclientessaldos);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(cobrarclientessaldos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelidCobrarClientesSaldos.getText()==null || this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelidCobrarClientesSaldos.getText()=="" || this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelidCobrarClientesSaldos.getText()=="Id") {
				this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelidCobrarClientesSaldos.setText("0");
			}

			if(conColumnasBase) {cobrarclientessaldos.setId(Long.parseLong(this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelidCobrarClientesSaldos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSaldosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelIdCobrarClientesSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientessaldos.setcodigo(this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldcodigoCobrarClientesSaldos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelcodigoCobrarClientesSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientessaldos.setnombre_completo(this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_completoCobrarClientesSaldos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelnombre_completoCobrarClientesSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientessaldos.setnombre_comercial(this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_comercialCobrarClientesSaldos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelnombre_comercialCobrarClientesSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientessaldos.setnombre_garantia(this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_garantiaCobrarClientesSaldos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelnombre_garantiaCobrarClientesSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientessaldos.setlimite_credito(Double.parseDouble(this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldlimite_creditoCobrarClientesSaldos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSaldosConstantesFunciones.LABEL_LIMITECREDITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabellimite_creditoCobrarClientesSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientessaldos.settotal_pedidos(Double.parseDouble(this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_pedidosCobrarClientesSaldos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSaldosConstantesFunciones.LABEL_TOTALPEDIDOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabeltotal_pedidosCobrarClientesSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientessaldos.settotal_saldos(Double.parseDouble(this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_saldosCobrarClientesSaldos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSaldosConstantesFunciones.LABEL_TOTALSALDOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabeltotal_saldosCobrarClientesSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientessaldos.settotal_cheques(Double.parseDouble(this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_chequesCobrarClientesSaldos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSaldosConstantesFunciones.LABEL_TOTALCHEQUES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabeltotal_chequesCobrarClientesSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldosBean,CobrarClientesSaldos cobrarclientessaldos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldosOrigen,CobrarClientesSaldos cobrarclientessaldos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarclientessaldosOrigen.getId()!=null && !cobrarclientessaldosOrigen.getId().equals(0L))) {cobrarclientessaldos.setId(cobrarclientessaldosOrigen.getId());}}
			if(conDefault || (!conDefault && cobrarclientessaldosOrigen.getfecha_emision_hasta()!=null && !cobrarclientessaldosOrigen.getfecha_emision_hasta().equals(new Date()))) {cobrarclientessaldos.setfecha_emision_hasta(cobrarclientessaldosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && cobrarclientessaldosOrigen.getcodigo()!=null && !cobrarclientessaldosOrigen.getcodigo().equals(""))) {cobrarclientessaldos.setcodigo(cobrarclientessaldosOrigen.getcodigo());}
			if(conDefault || (!conDefault && cobrarclientessaldosOrigen.getnombre_completo()!=null && !cobrarclientessaldosOrigen.getnombre_completo().equals(""))) {cobrarclientessaldos.setnombre_completo(cobrarclientessaldosOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && cobrarclientessaldosOrigen.getnombre_comercial()!=null && !cobrarclientessaldosOrigen.getnombre_comercial().equals(""))) {cobrarclientessaldos.setnombre_comercial(cobrarclientessaldosOrigen.getnombre_comercial());}
			if(conDefault || (!conDefault && cobrarclientessaldosOrigen.getnombre_garantia()!=null && !cobrarclientessaldosOrigen.getnombre_garantia().equals(""))) {cobrarclientessaldos.setnombre_garantia(cobrarclientessaldosOrigen.getnombre_garantia());}
			if(conDefault || (!conDefault && cobrarclientessaldosOrigen.getlimite_credito()!=null && !cobrarclientessaldosOrigen.getlimite_credito().equals(0.0))) {cobrarclientessaldos.setlimite_credito(cobrarclientessaldosOrigen.getlimite_credito());}
			if(conDefault || (!conDefault && cobrarclientessaldosOrigen.gettotal_pedidos()!=null && !cobrarclientessaldosOrigen.gettotal_pedidos().equals(0.0))) {cobrarclientessaldos.settotal_pedidos(cobrarclientessaldosOrigen.gettotal_pedidos());}
			if(conDefault || (!conDefault && cobrarclientessaldosOrigen.gettotal_saldos()!=null && !cobrarclientessaldosOrigen.gettotal_saldos().equals(0.0))) {cobrarclientessaldos.settotal_saldos(cobrarclientessaldosOrigen.gettotal_saldos());}
			if(conDefault || (!conDefault && cobrarclientessaldosOrigen.gettotal_cheques()!=null && !cobrarclientessaldosOrigen.gettotal_cheques().equals(0.0))) {cobrarclientessaldos.settotal_cheques(cobrarclientessaldosOrigen.gettotal_cheques());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelidCobrarClientesSaldos.setText(cobrarclientessaldos.getId().toString());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldcodigoCobrarClientesSaldos.setText(cobrarclientessaldos.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_completoCobrarClientesSaldos.setText(cobrarclientessaldos.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_comercialCobrarClientesSaldos.setText(cobrarclientessaldos.getnombre_comercial());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_garantiaCobrarClientesSaldos.setText(cobrarclientessaldos.getnombre_garantia());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldlimite_creditoCobrarClientesSaldos.setText(cobrarclientessaldos.getlimite_credito().toString());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_pedidosCobrarClientesSaldos.setText(cobrarclientessaldos.gettotal_pedidos().toString());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_saldosCobrarClientesSaldos.setText(cobrarclientessaldos.gettotal_saldos().toString());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_chequesCobrarClientesSaldos.setText(cobrarclientessaldos.gettotal_cheques().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarClientesSaldos(CobrarClientesSaldosBean cobrarclientessaldosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelidCobrarClientesSaldos.setText(cobrarclientessaldosBean.getId().toString());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldcodigoCobrarClientesSaldos.setText(cobrarclientessaldosBean.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_completoCobrarClientesSaldos.setText(cobrarclientessaldosBean.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_comercialCobrarClientesSaldos.setText(cobrarclientessaldosBean.getnombre_comercial());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_garantiaCobrarClientesSaldos.setText(cobrarclientessaldosBean.getnombre_garantia());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldlimite_creditoCobrarClientesSaldos.setText(cobrarclientessaldosBean.getlimite_credito().toString());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_pedidosCobrarClientesSaldos.setText(cobrarclientessaldosBean.gettotal_pedidos().toString());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_saldosCobrarClientesSaldos.setText(cobrarclientessaldosBean.gettotal_saldos().toString());
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_chequesCobrarClientesSaldos.setText(cobrarclientessaldosBean.gettotal_cheques().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCobrarClientesSaldos(CobrarClientesSaldosParameterReturnGeneral cobrarclientessaldosReturnGeneral,CobrarClientesSaldosBean cobrarclientessaldosBean,Boolean conDefault) throws Exception { 
		try {
			CobrarClientesSaldos cobrarclientessaldosLocal=new CobrarClientesSaldos();
			
			cobrarclientessaldosLocal=cobrarclientessaldosReturnGeneral.getCobrarClientesSaldos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarclientessaldosLocal.getId()!=null && !cobrarclientessaldosLocal.getId().equals(0L))) {cobrarclientessaldosBean.setId(cobrarclientessaldosLocal.getId());}}
			if(conDefault || (!conDefault && cobrarclientessaldosLocal.getcodigo()!=null && !cobrarclientessaldosLocal.getcodigo().equals(""))) {cobrarclientessaldosBean.setcodigo(cobrarclientessaldosLocal.getcodigo());}
			if(conDefault || (!conDefault && cobrarclientessaldosLocal.getnombre_completo()!=null && !cobrarclientessaldosLocal.getnombre_completo().equals(""))) {cobrarclientessaldosBean.setnombre_completo(cobrarclientessaldosLocal.getnombre_completo());}
			if(conDefault || (!conDefault && cobrarclientessaldosLocal.getnombre_comercial()!=null && !cobrarclientessaldosLocal.getnombre_comercial().equals(""))) {cobrarclientessaldosBean.setnombre_comercial(cobrarclientessaldosLocal.getnombre_comercial());}
			if(conDefault || (!conDefault && cobrarclientessaldosLocal.getnombre_garantia()!=null && !cobrarclientessaldosLocal.getnombre_garantia().equals(""))) {cobrarclientessaldosBean.setnombre_garantia(cobrarclientessaldosLocal.getnombre_garantia());}
			if(conDefault || (!conDefault && cobrarclientessaldosLocal.getlimite_credito()!=null && !cobrarclientessaldosLocal.getlimite_credito().equals(0.0))) {cobrarclientessaldosBean.setlimite_credito(cobrarclientessaldosLocal.getlimite_credito());}
			if(conDefault || (!conDefault && cobrarclientessaldosLocal.gettotal_pedidos()!=null && !cobrarclientessaldosLocal.gettotal_pedidos().equals(0.0))) {cobrarclientessaldosBean.settotal_pedidos(cobrarclientessaldosLocal.gettotal_pedidos());}
			if(conDefault || (!conDefault && cobrarclientessaldosLocal.gettotal_saldos()!=null && !cobrarclientessaldosLocal.gettotal_saldos().equals(0.0))) {cobrarclientessaldosBean.settotal_saldos(cobrarclientessaldosLocal.gettotal_saldos());}
			if(conDefault || (!conDefault && cobrarclientessaldosLocal.gettotal_cheques()!=null && !cobrarclientessaldosLocal.gettotal_cheques().equals(0.0))) {cobrarclientessaldosBean.settotal_cheques(cobrarclientessaldosLocal.gettotal_cheques());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCobrarClientesSaldosGenerico(Long idCobrarClientesSaldosSeleccionado,JComboBox jComboBoxCobrarClientesSaldos,List<CobrarClientesSaldos> cobrarclientessaldossLocal)throws Exception {
		try {
			CobrarClientesSaldos  cobrarclientessaldosTemp=null;

			for(CobrarClientesSaldos cobrarclientessaldosAux:cobrarclientessaldossLocal) {
				if(cobrarclientessaldosAux.getId()!=null && cobrarclientessaldosAux.getId().equals(idCobrarClientesSaldosSeleccionado)) {
					cobrarclientessaldosTemp=cobrarclientessaldosAux;
					break;
				}
			}

			jComboBoxCobrarClientesSaldos.setSelectedItem(cobrarclientessaldosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCobrarClientesSaldosGenerico(JComboBox jComboBoxCobrarClientesSaldos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarClientesSaldos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCobrarClientesSaldos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarClientesSaldos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCobrarClientesSaldos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCobrarClientesSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCobrarClientesSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclientessaldos=(CobrarClientesSaldos) cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarclientessaldos =(CobrarClientesSaldos) cobrarclientessaldoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cobrarclientessaldos.getIsNew() && !cobrarclientessaldos.getIsChanged() && !cobrarclientessaldos.getIsDeleted()) {
				sDescripcion=cobrarclientessaldos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclientessaldos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!cobrarclientessaldos.getIsNew() && !cobrarclientessaldos.getIsChanged() && !cobrarclientessaldos.getIsDeleted()) {
				sDescripcion=cobrarclientessaldos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclientessaldos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!cobrarclientessaldos.getIsNew() && !cobrarclientessaldos.getIsChanged() && !cobrarclientessaldos.getIsDeleted()) {
				sDescripcion=cobrarclientessaldos.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclientessaldos.getejercicio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CobrarClientesSaldos cobrarclientessaldosRow=new CobrarClientesSaldos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclientessaldosRow=(CobrarClientesSaldos) cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarclientessaldosRow=(CobrarClientesSaldos) cobrarclientessaldoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCobrarClientesSaldos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesSaldos && this.isPermisoNuevoCobrarClientesSaldos));			
			this.jButtonDuplicarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesSaldos && this.isPermisoDuplicarCobrarClientesSaldos));			
			this.jButtonCopiarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesSaldos && this.isPermisoCopiarCobrarClientesSaldos));
			this.jButtonVerFormCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesSaldos && this.isPermisoVerFormCobrarClientesSaldos));
			
			this.jButtonAbrirOrderByCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesSaldos && this.isPermisoOrdenCobrarClientesSaldos));			
			
			this.jButtonNuevoRelacionesCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos && this.isPermisoNuevoCobrarClientesSaldos));			
			this.jButtonNuevoGuardarCambiosCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesSaldos && this.isPermisoNuevoCobrarClientesSaldos && this.isPermisoGuardarCambiosCobrarClientesSaldos));
			
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonModificarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaModificarCobrarClientesSaldos && this.isPermisoActualizarCobrarClientesSaldos));	
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonActualizarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesSaldos && this.isPermisoActualizarCobrarClientesSaldos));	
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonEliminarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesSaldos && this.isPermisoEliminarCobrarClientesSaldos));
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonCancelarCobrarClientesSaldos.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesSaldos);							
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonGuardarCambiosCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesSaldos && this.isPermisoGuardarCambiosCobrarClientesSaldos));			
			
			}
						
			this.jButtonGuardarCambiosTablaCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos && this.isPermisoGuardarCambiosCobrarClientesSaldos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesSaldos && this.isPermisoNuevoCobrarClientesSaldos));						
			this.jButtonDuplicarToolBarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesSaldos && this.isPermisoDuplicarCobrarClientesSaldos));						
			this.jButtonCopiarToolBarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesSaldos && this.isPermisoCopiarCobrarClientesSaldos));			
			this.jButtonVerFormToolBarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesSaldos && this.isPermisoVerFormCobrarClientesSaldos));			
			this.jButtonAbrirOrderByToolBarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesSaldos && this.isPermisoOrdenCobrarClientesSaldos));
			this.jButtonNuevoRelacionesToolBarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos && this.isPermisoNuevoCobrarClientesSaldos));			
			this.jButtonNuevoGuardarCambiosToolBarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesSaldos && this.isPermisoNuevoCobrarClientesSaldos && this.isPermisoGuardarCambiosCobrarClientesSaldos));			
			
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonModificarToolBarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaModificarCobrarClientesSaldos && this.isPermisoActualizarCobrarClientesSaldos));	
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonActualizarToolBarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesSaldos  && this.isPermisoActualizarCobrarClientesSaldos));	
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonEliminarToolBarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesSaldos && this.isPermisoEliminarCobrarClientesSaldos));
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonCancelarToolBarCobrarClientesSaldos.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesSaldos);				
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonGuardarCambiosToolBarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesSaldos && this.isPermisoGuardarCambiosCobrarClientesSaldos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos && this.isPermisoGuardarCambiosCobrarClientesSaldos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesSaldos && this.isPermisoNuevoCobrarClientesSaldos));			
			this.jMenuItemDuplicarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesSaldos && this.isPermisoDuplicarCobrarClientesSaldos));			
			this.jMenuItemCopiarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesSaldos && this.isPermisoCopiarCobrarClientesSaldos));			
			this.jMenuItemVerFormCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesSaldos && this.isPermisoVerFormCobrarClientesSaldos));			
			this.jMenuItemAbrirOrderByCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesSaldos && this.isPermisoOrdenCobrarClientesSaldos));			
			//this.jMenuItemMostrarOcultarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesSaldos && this.isPermisoOrdenCobrarClientesSaldos));
			this.jMenuItemDetalleAbrirOrderByCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesSaldos && this.isPermisoOrdenCobrarClientesSaldos));			
			//this.jMenuItemDetalleMostrarOcultarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesSaldos && this.isPermisoOrdenCobrarClientesSaldos));			
			this.jMenuItemNuevoRelacionesCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos && this.isPermisoNuevoCobrarClientesSaldos));			
			this.jMenuItemNuevoGuardarCambiosCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesSaldos && this.isPermisoNuevoCobrarClientesSaldos && this.isPermisoGuardarCambiosCobrarClientesSaldos));									
			
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemModificarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaModificarCobrarClientesSaldos && this.isPermisoActualizarCobrarClientesSaldos));	
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemActualizarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesSaldos && this.isPermisoActualizarCobrarClientesSaldos));	
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemEliminarCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesSaldos && this.isPermisoEliminarCobrarClientesSaldos));
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemCancelarCobrarClientesSaldos.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesSaldos);				
			}
			
			this.jMenuItemGuardarCambiosCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesSaldos && this.isPermisoGuardarCambiosCobrarClientesSaldos));						
			this.jMenuItemGuardarCambiosTablaCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos && this.isPermisoGuardarCambiosCobrarClientesSaldos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCobrarClientesSaldos=this.jButtonNuevoCobrarClientesSaldos.isVisible();
			this.isVisibilidadCeldaDuplicarCobrarClientesSaldos=this.jButtonDuplicarCobrarClientesSaldos.isVisible();
			this.isVisibilidadCeldaCopiarCobrarClientesSaldos=this.jButtonCopiarCobrarClientesSaldos.isVisible();
			this.isVisibilidadCeldaVerFormCobrarClientesSaldos=this.jButtonVerFormCobrarClientesSaldos.isVisible();
			
			this.isVisibilidadCeldaOrdenCobrarClientesSaldos=this.jButtonAbrirOrderByCobrarClientesSaldos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos=this.jButtonNuevoRelacionesCobrarClientesSaldos.isVisible();
			this.isVisibilidadCeldaModificarCobrarClientesSaldos=this.jButtonModificarCobrarClientesSaldos.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
			this.isVisibilidadCeldaActualizarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonActualizarCobrarClientesSaldos.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonEliminarCobrarClientesSaldos.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonCancelarCobrarClientesSaldos.isVisible();
			this.isVisibilidadCeldaGuardarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonGuardarCambiosCobrarClientesSaldos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos=this.jButtonGuardarCambiosTablaCobrarClientesSaldos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCobrarClientesSaldos=this.jButtonNuevoToolBarCobrarClientesSaldos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos=this.jButtonNuevoRelacionesToolBarCobrarClientesSaldos.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
			this.isVisibilidadCeldaModificarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonModificarToolBarCobrarClientesSaldos.isVisible();
			this.isVisibilidadCeldaActualizarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonActualizarToolBarCobrarClientesSaldos.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonEliminarToolBarCobrarClientesSaldos.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonCancelarToolBarCobrarClientesSaldos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarClientesSaldos=this.jButtonGuardarCambiosToolBarCobrarClientesSaldos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos=this.jButtonGuardarCambiosTablaToolBarCobrarClientesSaldos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCobrarClientesSaldos=this.jMenuItemNuevoCobrarClientesSaldos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos=this.jMenuItemNuevoRelacionesCobrarClientesSaldos.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
			this.isVisibilidadCeldaModificarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemModificarCobrarClientesSaldos.isVisible();
			this.isVisibilidadCeldaActualizarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemActualizarCobrarClientesSaldos.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemEliminarCobrarClientesSaldos.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesSaldos=this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemCancelarCobrarClientesSaldos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarClientesSaldos=this.jMenuItemGuardarCambiosCobrarClientesSaldos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos=this.jMenuItemGuardarCambiosTablaCobrarClientesSaldos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCobrarClientesSaldos(Boolean esInicializar) {
		if(CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cobrarclientessaldosSessionBean.getConGuardarRelaciones()) {
				//if(this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarClientesSaldos();
			}
			
			this.inicializarActualizarBindingBotonesManualCobrarClientesSaldos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCobrarClientesSaldos() {
		this.jButtonNuevoCobrarClientesSaldos.setVisible(this.isPermisoNuevoCobrarClientesSaldos);			
		this.jButtonDuplicarCobrarClientesSaldos.setVisible(this.isPermisoDuplicarCobrarClientesSaldos);			
		this.jButtonCopiarCobrarClientesSaldos.setVisible(this.isPermisoCopiarCobrarClientesSaldos);			
		this.jButtonVerFormCobrarClientesSaldos.setVisible(this.isPermisoVerFormCobrarClientesSaldos);			
		
		this.jButtonAbrirOrderByCobrarClientesSaldos.setVisible(this.isPermisoOrdenCobrarClientesSaldos);					
		
		this.jButtonNuevoRelacionesCobrarClientesSaldos.setVisible(this.isPermisoNuevoCobrarClientesSaldos);			
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonModificarCobrarClientesSaldos.setVisible(this.isPermisoActualizarCobrarClientesSaldos);	
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonActualizarCobrarClientesSaldos.setVisible(this.isPermisoActualizarCobrarClientesSaldos);	
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonEliminarCobrarClientesSaldos.setVisible(this.isPermisoEliminarCobrarClientesSaldos);
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonCancelarCobrarClientesSaldos.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesSaldos);						
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonGuardarCambiosCobrarClientesSaldos.setVisible(this.isPermisoGuardarCambiosCobrarClientesSaldos);							
		}
		
		this.jButtonGuardarCambiosTablaCobrarClientesSaldos.setVisible(this.isPermisoActualizarCobrarClientesSaldos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarClientesSaldos() {
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonModificarCobrarClientesSaldos.setVisible(this.isPermisoActualizarCobrarClientesSaldos);	
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonActualizarCobrarClientesSaldos.setVisible(this.isPermisoActualizarCobrarClientesSaldos);	
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonEliminarCobrarClientesSaldos.setVisible(this.isPermisoEliminarCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonCancelarCobrarClientesSaldos.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesSaldos);							
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonGuardarCambiosCobrarClientesSaldos.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesSaldos && this.isPermisoGuardarCambiosCobrarClientesSaldos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCobrarClientesSaldos() {
		if(CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCobrarClientesSaldos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCobrarClientesSaldos() {
	}
	
	public void jTableDatosCobrarClientesSaldosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCobrarClientesSaldos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCobrarClientesSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.getcobrarclientessaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessaldos==null) {
						this.cobrarclientessaldos = new CobrarClientesSaldos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
				}

				if(this.cobrarclientessaldos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cobrarclientessaldos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCobrarClientesSaldosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCobrarClientesSaldos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesSaldos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesSaldos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.getcobrarclientessaldos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cobrarclientessaldosLogic.getConnexion());

				if(this.cobrarclientessaldos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cobrarclientessaldos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesSaldos=(TitledBorder)this.jScrollPanelDatosCobrarClientesSaldos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCobrarClientesSaldos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCobrarClientesSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.getcobrarclientessaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessaldos==null) {
						this.cobrarclientessaldos = new CobrarClientesSaldos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
				}

				if(this.cobrarclientessaldos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cobrarclientessaldos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCobrarClientesSaldosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCobrarClientesSaldos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesSaldos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesSaldos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.getcobrarclientessaldos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.cobrarclientessaldosLogic.getConnexion());

				if(this.cobrarclientessaldos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.cobrarclientessaldos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesSaldos=(TitledBorder)this.jScrollPanelDatosCobrarClientesSaldos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCobrarClientesSaldos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCobrarClientesSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.getcobrarclientessaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessaldos==null) {
						this.cobrarclientessaldos = new CobrarClientesSaldos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
				}

				if(this.cobrarclientessaldos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.cobrarclientessaldos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioCobrarClientesSaldosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebCobrarClientesSaldos(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesSaldos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesSaldos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.getcobrarclientessaldos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.cobrarclientessaldosLogic.getConnexion());

				if(this.cobrarclientessaldos.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.cobrarclientessaldos.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesSaldos=(TitledBorder)this.jScrollPanelDatosCobrarClientesSaldos.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderCobrarClientesSaldos.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioCobrarClientesSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.getcobrarclientessaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessaldos==null) {
						this.cobrarclientessaldos = new CobrarClientesSaldos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
				}

				if(this.cobrarclientessaldos.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.cobrarclientessaldos.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaCobrarClientesSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.getcobrarclientessaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessaldos==null) {
						this.cobrarclientessaldos = new CobrarClientesSaldos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
				}

				if(this.cobrarclientessaldos.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.cobrarclientessaldos.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCobrarClientesSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.getcobrarclientessaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessaldos==null) {
						this.cobrarclientessaldos = new CobrarClientesSaldos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
				}

				if(this.cobrarclientessaldos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.cobrarclientessaldos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoCobrarClientesSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.getcobrarclientessaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessaldos==null) {
						this.cobrarclientessaldos = new CobrarClientesSaldos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
				}

				if(this.cobrarclientessaldos.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.cobrarclientessaldos.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_comercialCobrarClientesSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.getcobrarclientessaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessaldos==null) {
						this.cobrarclientessaldos = new CobrarClientesSaldos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
				}

				if(this.cobrarclientessaldos.getnombre_comercial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_comercial like '%"+this.cobrarclientessaldos.getnombre_comercial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_garantiaCobrarClientesSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.getcobrarclientessaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessaldos==null) {
						this.cobrarclientessaldos = new CobrarClientesSaldos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
				}

				if(this.cobrarclientessaldos.getnombre_garantia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_garantia like '%"+this.cobrarclientessaldos.getnombre_garantia()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonlimite_creditoCobrarClientesSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.getcobrarclientessaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessaldos==null) {
						this.cobrarclientessaldos = new CobrarClientesSaldos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
				}

				if(this.cobrarclientessaldos.getlimite_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where limite_credito = "+this.cobrarclientessaldos.getlimite_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_pedidosCobrarClientesSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.getcobrarclientessaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessaldos==null) {
						this.cobrarclientessaldos = new CobrarClientesSaldos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
				}

				if(this.cobrarclientessaldos.gettotal_pedidos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_pedidos = "+this.cobrarclientessaldos.gettotal_pedidos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_saldosCobrarClientesSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.getcobrarclientessaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessaldos==null) {
						this.cobrarclientessaldos = new CobrarClientesSaldos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
				}

				if(this.cobrarclientessaldos.gettotal_saldos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_saldos = "+this.cobrarclientessaldos.gettotal_saldos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_chequesCobrarClientesSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.getcobrarclientessaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessaldos==null) {
						this.cobrarclientessaldos = new CobrarClientesSaldos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);
				}

				if(this.cobrarclientessaldos.gettotal_cheques()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_cheques = "+this.cobrarclientessaldos.gettotal_cheques().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCobrarClientesSaldosCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesSaldos(false,false);

			this.getCobrarClientesSaldossBusquedaCobrarClientesSaldos();

			this.inicializarActualizarBindingCobrarClientesSaldos(false);

			//if(CobrarClientesSaldosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesSaldos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesSaldos(false,false);

			this.getCobrarClientesSaldossFK_IdEjercicio();

			this.inicializarActualizarBindingCobrarClientesSaldos(false);

			//if(CobrarClientesSaldosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesSaldos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesSaldos(false,false);

			this.getCobrarClientesSaldossFK_IdEmpresa();

			this.inicializarActualizarBindingCobrarClientesSaldos(false);

			//if(CobrarClientesSaldosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesSaldos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCobrarClientesSaldosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesSaldos(false,false);

			this.getCobrarClientesSaldossFK_IdSucursal();

			this.inicializarActualizarBindingCobrarClientesSaldos(false);

			//if(CobrarClientesSaldosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesSaldos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessaldosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCobrarClientesSaldos() {
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.setVisible(false);	    			
			this.jInternalFrameDetalleFormCobrarClientesSaldos.dispose();
			this.jInternalFrameDetalleFormCobrarClientesSaldos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCobrarClientesSaldos!=null) {
			this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCobrarClientesSaldos.dispose();
			this.jInternalFrameReporteDinamicoCobrarClientesSaldos=null;
		}
		
		if(this.jInternalFrameImportacionCobrarClientesSaldos!=null) {
			this.jInternalFrameImportacionCobrarClientesSaldos.setVisible(false);	    			
			this.jInternalFrameImportacionCobrarClientesSaldos.dispose();
			this.jInternalFrameImportacionCobrarClientesSaldos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCobrarClientesSaldos();
			
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
			
			
			if(sTipo.equals("NuevoCobrarClientesSaldos")) {
				jButtonNuevoCobrarClientesSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCobrarClientesSaldos")) {
				jButtonDuplicarCobrarClientesSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCobrarClientesSaldos")) {
				jButtonCopiarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("VerFormCobrarClientesSaldos")) {
				jButtonVerFormCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCobrarClientesSaldos")) {
				jButtonNuevoCobrarClientesSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCobrarClientesSaldos")) {
				jButtonDuplicarCobrarClientesSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCobrarClientesSaldos")) {
				jButtonNuevoCobrarClientesSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCobrarClientesSaldos")) {
				jButtonDuplicarCobrarClientesSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCobrarClientesSaldos")) {
				jButtonNuevoCobrarClientesSaldosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCobrarClientesSaldos")) {
				jButtonNuevoCobrarClientesSaldosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCobrarClientesSaldos")) {
				jButtonNuevoCobrarClientesSaldosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCobrarClientesSaldos")) {
				jButtonModificarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCobrarClientesSaldos")) {
				jButtonModificarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCobrarClientesSaldos")) {
				jButtonModificarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCobrarClientesSaldos")) {
				jButtonActualizarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCobrarClientesSaldos")) {
				jButtonActualizarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCobrarClientesSaldos")) {
				jButtonActualizarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("EliminarCobrarClientesSaldos")) {
				jButtonEliminarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCobrarClientesSaldos")) {
				jButtonEliminarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCobrarClientesSaldos")) {
				jButtonEliminarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("CancelarCobrarClientesSaldos")) {
				jButtonCancelarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCobrarClientesSaldos")) {
				jButtonCancelarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCobrarClientesSaldos")) {
				jButtonCancelarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("CerrarCobrarClientesSaldos")) {
				jButtonCerrarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCobrarClientesSaldos")) {
				jButtonCerrarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCobrarClientesSaldos")) {
				jButtonCerrarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCobrarClientesSaldos")) {
				jButtonMostrarOcultarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCobrarClientesSaldos")) {
				jButtonCancelarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCobrarClientesSaldos")) {
				jButtonGuardarCambiosCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCobrarClientesSaldos")) {
				jButtonGuardarCambiosCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCobrarClientesSaldos")) {
				jButtonCopiarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCobrarClientesSaldos")) {
				jButtonVerFormCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCobrarClientesSaldos")) {
				jButtonGuardarCambiosCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCobrarClientesSaldos")) {
				jButtonCopiarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCobrarClientesSaldos")) {
				jButtonVerFormCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCobrarClientesSaldos")) {
				jButtonGuardarCambiosCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCobrarClientesSaldos")) {
				jButtonGuardarCambiosCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCobrarClientesSaldos")) {
				jButtonGuardarCambiosCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCobrarClientesSaldos")) {
				jButtonRecargarInformacionCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCobrarClientesSaldos")) {
				jButtonRecargarInformacionCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCobrarClientesSaldos")) {
				jButtonRecargarInformacionCobrarClientesSaldosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCobrarClientesSaldos")) {
				jButtonAnterioresCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCobrarClientesSaldos")) {
				jButtonAnterioresCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCobrarClientesSaldos")) {
				jButtonAnterioresCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCobrarClientesSaldos")) {
				jButtonSiguientesCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCobrarClientesSaldos")) {
				jButtonSiguientesCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCobrarClientesSaldos")) {
				jButtonSiguientesCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCobrarClientesSaldos") || sTipo.equals("MenuItemDetalleAbrirOrderByCobrarClientesSaldos")) {
				jButtonAbrirOrderByCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCobrarClientesSaldos") || sTipo.equals("MenuItemDetalleMostrarOcultarCobrarClientesSaldos")) {
				jButtonMostrarOcultarCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarClientesSaldos")) {
				jButtonNuevoGuardarCambiosCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCobrarClientesSaldos")) {
				jButtonNuevoGuardarCambiosCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCobrarClientesSaldos")) {
				jButtonNuevoGuardarCambiosCobrarClientesSaldosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCobrarClientesSaldos")) {
				jButtonCerrarReporteDinamicoCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCobrarClientesSaldos")) {
				jButtonGenerarReporteDinamicoCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCobrarClientesSaldos")) {
				
				jButtonGenerarExcelReporteDinamicoCobrarClientesSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCobrarClientesSaldos")) {
				jButtonCerrarImportacionCobrarClientesSaldosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCobrarClientesSaldos")) {
				
				jButtonGenerarImportacionCobrarClientesSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCobrarClientesSaldos")) {
				
				jButtonAbrirImportacionCobrarClientesSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCobrarClientesSaldos")) {
				jComboBoxTiposAccionesCobrarClientesSaldosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCobrarClientesSaldos")) {
				jComboBoxTiposRelacionesCobrarClientesSaldosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCobrarClientesSaldos")) {
				jComboBoxTiposAccionesCobrarClientesSaldosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCobrarClientesSaldos")) {
				
				jComboBoxTiposSeleccionarCobrarClientesSaldosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCobrarClientesSaldos")) {
				jTextFieldValorCampoGeneralCobrarClientesSaldosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCobrarClientesSaldos")) {
				jButtonAbrirOrderByCobrarClientesSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCobrarClientesSaldos")) {
				jButtonAbrirOrderByCobrarClientesSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCobrarClientesSaldos")) {
				jButtonCerrarOrderByCobrarClientesSaldosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarClientesSaldosBusqueda")) {
				this.jButtonidCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesSaldosUpdate")) {
				this.jButtonid_empresaCobrarClientesSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesSaldosBusqueda")) {
				this.jButtonid_empresaCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCobrarClientesSaldosUpdate")) {
				this.jButtonid_sucursalCobrarClientesSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCobrarClientesSaldosBusqueda")) {
				this.jButtonid_sucursalCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioCobrarClientesSaldosUpdate")) {
				this.jButtonid_ejercicioCobrarClientesSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioCobrarClientesSaldosBusqueda")) {
				this.jButtonid_ejercicioCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaCobrarClientesSaldosBusqueda")) {
				this.jButtonfecha_emision_hastaCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarClientesSaldosBusqueda")) {
				this.jButtoncodigoCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCobrarClientesSaldosBusqueda")) {
				this.jButtonnombre_completoCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_comercialCobrarClientesSaldosBusqueda")) {
				this.jButtonnombre_comercialCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_garantiaCobrarClientesSaldosBusqueda")) {
				this.jButtonnombre_garantiaCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("limite_creditoCobrarClientesSaldosBusqueda")) {
				this.jButtonlimite_creditoCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_pedidosCobrarClientesSaldosBusqueda")) {
				this.jButtontotal_pedidosCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_saldosCobrarClientesSaldosBusqueda")) {
				this.jButtontotal_saldosCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_chequesCobrarClientesSaldosBusqueda")) {
				this.jButtontotal_chequesCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCobrarClientesSaldosCobrarClientesSaldos")) {
				this.jButtonBusquedaCobrarClientesSaldosCobrarClientesSaldosActionPerformed(evt);
			}
			
			;
			
			
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCobrarClientesSaldos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesSaldosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessaldos);
				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
				
				


				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CobrarClientesSaldos cobrarclientessaldosLocal=null;
			
			if(!this.getEsControlTabla()) {
				cobrarclientessaldosLocal=this.cobrarclientessaldos;
			} else {
				cobrarclientessaldosLocal=this.cobrarclientessaldosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessaldos);
				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
							
				
				


				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosAnterior =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientessaldosAnterior =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
			
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
			
			


			
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesSaldosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessaldos);
				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
								
						
				


				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSaldos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessaldos);
				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
								
				
				


				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosAnterior =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientessaldosAnterior =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessaldos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosAnterior =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientessaldosAnterior =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesSaldosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessaldos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessaldos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessaldos);
				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
							
				
				


				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSaldos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesSaldosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessaldosAnterior =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarclientessaldosAnterior =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
			
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
			
			


			
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesSaldosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessaldos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessaldos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessaldos);
				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
								
				
				


				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosAnterior =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientessaldosAnterior =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesSaldosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessaldos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessaldos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesSaldosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessaldos);
				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCobrarClientesSaldos")) {
					jCheckBoxSeleccionarTodosCobrarClientesSaldosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCobrarClientesSaldos")) {
					jCheckBoxSeleccionadosCobrarClientesSaldosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCobrarClientesSaldos")) {
					
				}
				
				


				
				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessaldos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessaldos);
				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
												
				
				


				
				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesSaldosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessaldosAnterior =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarclientessaldosAnterior =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesSaldosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessaldos);
				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
				
				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
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
			
			


			
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesSaldosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessaldos);
				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSaldos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSaldos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessaldos);
				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
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
				
				


				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSaldos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessaldosAnterior =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientessaldosAnterior =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCobrarClientesSaldos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCobrarClientesSaldosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCobrarClientesSaldos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cobrarclientessaldos =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cobrarclientessaldos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCobrarClientesSaldos")) {
				
				}
				
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCobrarClientesSaldos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCobrarClientesSaldos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCobrarClientesSaldos")) {
			
			}
			
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCobrarClientesSaldos();
			
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
			
			if(sTipo.equals("NuevoCobrarClientesSaldos")) {
				jButtonNuevoCobrarClientesSaldosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCobrarClientesSaldos")) {
				jButtonDuplicarCobrarClientesSaldosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCobrarClientesSaldos")) {
				jButtonCopiarCobrarClientesSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCobrarClientesSaldos")) {
				jButtonVerFormCobrarClientesSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCobrarClientesSaldos")) {
				jButtonNuevoCobrarClientesSaldosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCobrarClientesSaldos")) {
				jButtonModificarCobrarClientesSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCobrarClientesSaldos")) {
				jButtonActualizarCobrarClientesSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCobrarClientesSaldos")) {
				jButtonEliminarCobrarClientesSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCobrarClientesSaldos")) {
				jButtonGuardarCambiosCobrarClientesSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCobrarClientesSaldos")) {
				jButtonCancelarCobrarClientesSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCobrarClientesSaldos")) {
				jButtonCerrarCobrarClientesSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCobrarClientesSaldos")) {
				jButtonGuardarCambiosCobrarClientesSaldosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarClientesSaldos")) {
				jButtonNuevoGuardarCambiosCobrarClientesSaldosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCobrarClientesSaldos")) {
				jButtonAbrirOrderByCobrarClientesSaldosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCobrarClientesSaldos")) {
				jButtonRecargarInformacionCobrarClientesSaldosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCobrarClientesSaldos")) {
				jButtonAnterioresCobrarClientesSaldosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCobrarClientesSaldos")) {
				jButtonSiguientesCobrarClientesSaldosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarClientesSaldosBusqueda")) {
				this.jButtonidCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesSaldosUpdate")) {
				this.jButtonid_empresaCobrarClientesSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesSaldosBusqueda")) {
				this.jButtonid_empresaCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCobrarClientesSaldosUpdate")) {
				this.jButtonid_sucursalCobrarClientesSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCobrarClientesSaldosBusqueda")) {
				this.jButtonid_sucursalCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioCobrarClientesSaldosUpdate")) {
				this.jButtonid_ejercicioCobrarClientesSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioCobrarClientesSaldosBusqueda")) {
				this.jButtonid_ejercicioCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaCobrarClientesSaldosBusqueda")) {
				this.jButtonfecha_emision_hastaCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarClientesSaldosBusqueda")) {
				this.jButtoncodigoCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCobrarClientesSaldosBusqueda")) {
				this.jButtonnombre_completoCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_comercialCobrarClientesSaldosBusqueda")) {
				this.jButtonnombre_comercialCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_garantiaCobrarClientesSaldosBusqueda")) {
				this.jButtonnombre_garantiaCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("limite_creditoCobrarClientesSaldosBusqueda")) {
				this.jButtonlimite_creditoCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_pedidosCobrarClientesSaldosBusqueda")) {
				this.jButtontotal_pedidosCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_saldosCobrarClientesSaldosBusqueda")) {
				this.jButtontotal_saldosCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_chequesCobrarClientesSaldosBusqueda")) {
				this.jButtontotal_chequesCobrarClientesSaldosBusquedaActionPerformed(evt);
			}
			
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCobrarClientesSaldos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCobrarClientesSaldos")) {
				closingInternalFrameCobrarClientesSaldos();
				
			} else if(sTipo.equals("jButtonCancelarCobrarClientesSaldos")) {
				JInternalFrameBase jInternalFrameDetalleFormCobrarClientesSaldos = (JInternalFrameBase)evt.getSource();
	            	
	            CobrarClientesSaldosBeanSwingJInternalFrame jInternalFrameParent=(CobrarClientesSaldosBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarClientesSaldos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCobrarClientesSaldosActionPerformed(null);
			}
			
			CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarclientessaldos,new Object(),this.cobrarclientessaldosParameterGeneral,this.cobrarclientessaldosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCobrarClientesSaldos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCobrarClientesSaldos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCobrarClientesSaldos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cobrarclientessaldos)) {
			if(!esControlTabla) {
				if(CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);			
				}
				
				if(this.cobrarclientessaldosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCobrarClientesSaldos(this.cobrarclientessaldosReturnGeneral,this.cobrarclientessaldosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cobrarclientessaldosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCobrarClientesSaldos(classes,this.cobrarclientessaldosReturnGeneral,this.cobrarclientessaldosBean,false);
					}
						
					if(this.cobrarclientessaldosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesSaldos(this.cobrarclientessaldosReturnGeneral.getCobrarClientesSaldos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCobrarClientesSaldos(this.cobrarclientessaldosReturnGeneral.getCobrarClientesSaldos());	
					}
						
					if(this.cobrarclientessaldosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesSaldos(this.cobrarclientessaldosReturnGeneral.getCobrarClientesSaldos(),classes);//this.cobrarclientessaldosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesSaldos(this.cobrarclientessaldos,classes);//this.cobrarclientessaldosBean);									
				}
			
				if(CobrarClientesSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSaldos(this.cobrarclientessaldos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSaldos(this.cobrarclientessaldos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cobrarclientessaldosAnterior!=null) {
						this.cobrarclientessaldos=this.cobrarclientessaldosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cobrarclientessaldosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cobrarclientessaldosReturnGeneral.getCobrarClientesSaldos(),cobrarclientessaldosLogic.getCobrarClientesSaldoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cobrarclientessaldosReturnGeneral.getCobrarClientesSaldos(),this.cobrarclientessaldoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCobrarClientesSaldos.repaint();
				
				//((AbstractTableModel) this.jTableDatosCobrarClientesSaldos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCobrarClientesSaldos();
			}
		}
	}
	
	public void actualizarVisualTableDatosCobrarClientesSaldos() throws Exception {
		
		CobrarClientesSaldosModel cobrarclientessaldosModel=(CobrarClientesSaldosModel)this.jTableDatosCobrarClientesSaldos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclientessaldosModel.cobrarclientessaldoss=this.cobrarclientessaldosLogic.getCobrarClientesSaldoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cobrarclientessaldosModel.cobrarclientessaldoss=this.cobrarclientessaldoss;
		}
		
		
		((CobrarClientesSaldosModel) this.jTableDatosCobrarClientesSaldos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCobrarClientesSaldos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcobrarclientessaldosAnterior(),this.cobrarclientessaldosLogic.getCobrarClientesSaldoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcobrarclientessaldosAnterior(),this.cobrarclientessaldoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCobrarClientesSaldos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
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
										
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarclientessaldos,new Object(),generalEntityParameterGeneral,this.cobrarclientessaldosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cobrarclientessaldosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CobrarClientesSaldosConstantesFunciones.getClassesRelationshipsOfCobrarClientesSaldos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CobrarClientesSaldosConstantesFunciones.getClassesRelationshipsFromStringsOfCobrarClientesSaldos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCobrarClientesSaldos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CobrarClientesSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarclientessaldos,new Object(),generalEntityParameterGeneral,this.cobrarclientessaldosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCobrarClientesSaldos(CobrarClientesSaldosBean cobrarclientessaldosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCobrarClientesSaldos(ArrayList<Classe> classes,CobrarClientesSaldosReturnGeneral cobrarclientessaldosReturnGeneral,CobrarClientesSaldosBean cobrarclientessaldosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cobrarclientessaldos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos = new CobrarClientesSaldosDetalleFormJInternalFrame(jDesktopPane,this.cobrarclientessaldosSessionBean.getConGuardarRelaciones(),this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.setVisible(false);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.setSelected(false);						
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.cobrarclientessaldosLogic=this.cobrarclientessaldosLogic;
		
		this.cargarCombosFrameForeignKeyCobrarClientesSaldos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarClientesSaldos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarClientesSaldos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCobrarClientesSaldos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCobrarClientesSaldos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarClientesSaldos"));
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonModificarCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"ModificarCobrarClientesSaldos"));

		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonModificarToolBarCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarClientesSaldos"));
					
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemModificarCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarClientesSaldos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonActualizarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"ActualizarCobrarClientesSaldos"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonActualizarToolBarCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarClientesSaldos"));
						
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemActualizarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarClientesSaldos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonEliminarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"EliminarCobrarClientesSaldos"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonEliminarToolBarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarClientesSaldos"));
								
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemEliminarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarClientesSaldos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonCancelarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"CancelarCobrarClientesSaldos"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonCancelarToolBarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarClientesSaldos"));
					
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemCancelarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarClientesSaldos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemDetalleCerrarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarClientesSaldos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonGuardarCambiosToolBarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesSaldos"));
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonGuardarCambiosToolBarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesSaldos"));
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarClientesSaldos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonidCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_empresaCobrarClientesSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_empresaCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_sucursalCobrarClientesSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_sucursalCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_ejercicioCobrarClientesSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCobrarClientesSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_ejercicioCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonfecha_emision_hastaCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtoncodigoCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonnombre_completoCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonnombre_comercialCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_comercialCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonnombre_garantiaCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_garantiaCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonlimite_creditoCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"limite_creditoCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtontotal_pedidosCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"total_pedidosCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtontotal_saldosCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"total_saldosCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtontotal_chequesCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"total_chequesCobrarClientesSaldosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jTabbedPaneRelacionesCobrarClientesSaldos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarClientesSaldos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCobrarClientesSaldos"));
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarClientesSaldos"));
		}
		
		this.jTableDatosCobrarClientesSaldos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCobrarClientesSaldos"));
		
		this.jTableDatosCobrarClientesSaldos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCobrarClientesSaldos"));
		
		this.jButtonNuevoCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"NuevoCobrarClientesSaldos"));
		
		this.jButtonDuplicarCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"DuplicarCobrarClientesSaldos"));
		
		this.jButtonCopiarCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"CopiarCobrarClientesSaldos"));
		
		this.jButtonVerFormCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"VerFormCobrarClientesSaldos"));
		
		
		this.jButtonNuevoToolBarCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"NuevoToolBarCobrarClientesSaldos"));
			
		this.jButtonDuplicarToolBarCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCobrarClientesSaldos"));
			
		this.jMenuItemNuevoCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCobrarClientesSaldos"));
			
		this.jMenuItemDuplicarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCobrarClientesSaldos"));		
		
		
		this.jButtonNuevoRelacionesCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCobrarClientesSaldos"));
		
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCobrarClientesSaldos"));
			
		this.jMenuItemNuevoRelacionesCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCobrarClientesSaldos"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonModificarCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"ModificarCobrarClientesSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonModificarToolBarCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarClientesSaldos"));
			
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemModificarCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarClientesSaldos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonActualizarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"ActualizarCobrarClientesSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonActualizarToolBarCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarClientesSaldos"));
				
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemActualizarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarClientesSaldos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonEliminarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"EliminarCobrarClientesSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonEliminarToolBarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarClientesSaldos"));
						
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemEliminarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarClientesSaldos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonCancelarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"CancelarCobrarClientesSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonCancelarToolBarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarClientesSaldos"));
			
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemCancelarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarClientesSaldos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCobrarClientesSaldos"));		
		
		
		this.jButtonCerrarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"CerrarCobrarClientesSaldos"));
		
		
		this.jButtonCerrarToolBarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"CerrarToolBarCobrarClientesSaldos"));
			
		this.jMenuItemCerrarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCobrarClientesSaldos"));
			
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jMenuItemDetalleCerrarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarClientesSaldos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonGuardarCambiosCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosCobrarClientesSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonGuardarCambiosToolBarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesSaldos"));
		}
		
		this.jButtonCopiarToolBarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"CopiarToolBarCobrarClientesSaldos"));
			
		this.jButtonVerFormToolBarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"VerFormToolBarCobrarClientesSaldos"));
		
		this.jMenuItemGuardarCambiosCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCobrarClientesSaldos"));
			
		this.jMenuItemCopiarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCobrarClientesSaldos"));		
		
		this.jMenuItemVerFormCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCobrarClientesSaldos"));		
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarClientesSaldos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCobrarClientesSaldos"));
			
		this.jMenuItemGuardarCambiosTablaCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarClientesSaldos"));		
		
		
		
		this.jButtonRecargarInformacionCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"RecargarInformacionCobrarClientesSaldos"));
					
		this.jButtonRecargarInformacionToolBarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCobrarClientesSaldos"));
		
		this.jMenuItemRecargarInformacionCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCobrarClientesSaldos"));		
		
		
		
		this.jButtonAnterioresCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"AnterioresCobrarClientesSaldos"));
		
		
		this.jButtonAnterioresToolBarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCobrarClientesSaldos"));
		
		this.jMenuItemAnterioresCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCobrarClientesSaldos"));		
		
		
		this.jButtonSiguientesCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"SiguientesCobrarClientesSaldos"));
		
		
		this.jButtonSiguientesToolBarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCobrarClientesSaldos"));
			
		this.jMenuItemSiguientesCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCobrarClientesSaldos"));
			
		this.jMenuItemAbrirOrderByCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCobrarClientesSaldos"));
			
		this.jMenuItemMostrarOcultarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCobrarClientesSaldos"));
			
		this.jMenuItemDetalleAbrirOrderByCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCobrarClientesSaldos"));
			
		this.jMenuItemDetalleMostarOcultarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCobrarClientesSaldos"));		
		
		
		this.jButtonNuevoGuardarCambiosCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCobrarClientesSaldos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCobrarClientesSaldos"));
			
		this.jMenuItemNuevoGuardarCambiosCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCobrarClientesSaldos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCobrarClientesSaldos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCobrarClientesSaldos"));

		this.jCheckBoxSeleccionadosCobrarClientesSaldos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCobrarClientesSaldos"));
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarClientesSaldos"));
		}
		
		
		this.jComboBoxTiposRelacionesCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"TiposRelacionesCobrarClientesSaldos"));
			
		this.jComboBoxTiposAccionesCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"TiposAccionesCobrarClientesSaldos"));
					
		this.jComboBoxTiposSeleccionarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCobrarClientesSaldos"));
			
		this.jTextFieldValorCampoGeneralCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCobrarClientesSaldos"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonidCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_empresaCobrarClientesSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_empresaCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_sucursalCobrarClientesSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_sucursalCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_ejercicioCobrarClientesSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCobrarClientesSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_ejercicioCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonfecha_emision_hastaCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtoncodigoCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonnombre_completoCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonnombre_comercialCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_comercialCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonnombre_garantiaCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_garantiaCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonlimite_creditoCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"limite_creditoCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtontotal_pedidosCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"total_pedidosCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtontotal_saldosCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"total_saldosCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtontotal_chequesCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"total_chequesCobrarClientesSaldosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCobrarClientesSaldosCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"BusquedaCobrarClientesSaldosCobrarClientesSaldos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesSaldos!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesSaldos"));
				this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesSaldos"));
				this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesSaldos"));
			}
			
			//this.jButtonCerrarReporteDinamicoCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesSaldos"));				
			//this.jButtonGenerarReporteDinamicoCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesSaldos"));
			//this.jButtonGenerarExcelReporteDinamicoCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesSaldos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCobrarClientesSaldos!=null) {
				this.jInternalFrameImportacionCobrarClientesSaldos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarClientesSaldos"));
				this.jInternalFrameImportacionCobrarClientesSaldos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarClientesSaldos"));
				this.jInternalFrameImportacionCobrarClientesSaldos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarClientesSaldos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"AbrirOrderByCobrarClientesSaldos"));
			
			this.jButtonAbrirOrderByToolBarCobrarClientesSaldos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCobrarClientesSaldos"));			
			
			if(this.jInternalFrameOrderByCobrarClientesSaldos!=null) {
				this.jInternalFrameOrderByCobrarClientesSaldos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarClientesSaldos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSaldos.jTabbedPaneRelacionesCobrarClientesSaldos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarClientesSaldos"));
		
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
            		closingInternalFrameCobrarClientesSaldos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCobrarClientesSaldos = (JInternalFrameBase)event.getSource();
	            	
	            CobrarClientesSaldosBeanSwingJInternalFrame jInternalFrameParent=(CobrarClientesSaldosBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarClientesSaldos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCobrarClientesSaldosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCobrarClientesSaldos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCobrarClientesSaldosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCobrarClientesSaldos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCobrarClientesSaldos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesSaldosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesSaldosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesSaldosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCobrarClientesSaldos";
		inputMap = this.jButtonNuevoCobrarClientesSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCobrarClientesSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarClientesSaldosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesSaldosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesSaldosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesSaldosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCobrarClientesSaldos";
		inputMap = this.jButtonNuevoRelacionesCobrarClientesSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCobrarClientesSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarClientesSaldosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCobrarClientesSaldos";
		inputMap = this.jButtonModificarCobrarClientesSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCobrarClientesSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCobrarClientesSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCobrarClientesSaldos";
		inputMap = this.jButtonActualizarCobrarClientesSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCobrarClientesSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCobrarClientesSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCobrarClientesSaldos";
		inputMap = this.jButtonEliminarCobrarClientesSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCobrarClientesSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCobrarClientesSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCobrarClientesSaldos";
		inputMap = this.jButtonCancelarCobrarClientesSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCobrarClientesSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCobrarClientesSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCobrarClientesSaldos";
		inputMap = this.jButtonCerrarCobrarClientesSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCobrarClientesSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCobrarClientesSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonGuardarCambiosCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCobrarClientesSaldos";
		inputMap = this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonGuardarCambiosCobrarClientesSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonGuardarCambiosCobrarClientesSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCobrarClientesSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCobrarClientesSaldos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCobrarClientesSaldosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCobrarClientesSaldos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCobrarClientesSaldosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCobrarClientesSaldos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCobrarClientesSaldosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCobrarClientesSaldos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCobrarClientesSaldosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonidCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_empresaCobrarClientesSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_empresaCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_sucursalCobrarClientesSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_sucursalCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_ejercicioCobrarClientesSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCobrarClientesSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonid_ejercicioCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonfecha_emision_hastaCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtoncodigoCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonnombre_completoCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonnombre_comercialCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_comercialCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonnombre_garantiaCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_garantiaCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtonlimite_creditoCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"limite_creditoCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtontotal_pedidosCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"total_pedidosCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtontotal_saldosCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"total_saldosCobrarClientesSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jButtontotal_chequesCobrarClientesSaldosBusqueda.addActionListener(new ButtonActionListener(this,"total_chequesCobrarClientesSaldosBusqueda"));
		
		
		this.jButtonBusquedaCobrarClientesSaldosCobrarClientesSaldos.addActionListener(new ButtonActionListener(this,"BusquedaCobrarClientesSaldosCobrarClientesSaldos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCobrarClientesSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCobrarClientesSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCobrarClientesSaldosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCobrarClientesSaldos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCobrarClientesSaldos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CobrarClientesSaldos cobrarclientessaldosAux:this.cobrarclientessaldosLogic.getCobrarClientesSaldoss()) {
					cobrarclientessaldosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesSaldos cobrarclientessaldosAux:cobrarclientessaldoss) {
					cobrarclientessaldosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCobrarClientesSaldosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarClientesSaldos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarClientesSaldos cobrarclientessaldosAux:this.cobrarclientessaldosLogic.getCobrarClientesSaldoss()) {
						cobrarclientessaldosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesSaldos cobrarclientessaldosAux:cobrarclientessaldoss) {
						cobrarclientessaldosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CobrarClientesSaldos cobrarclientessaldosAux:this.cobrarclientessaldosLogic.getCobrarClientesSaldoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesSaldos cobrarclientessaldosAux:cobrarclientessaldoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesSaldos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarClientesSaldos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarClientesSaldos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSaldos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCobrarClientesSaldosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarClientesSaldos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCobrarClientesSaldos.getSelectedRows();
			
			CobrarClientesSaldos cobrarclientessaldosLocal=new CobrarClientesSaldos();
			
			//this.seleccionarTodosCobrarClientesSaldos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobrarclientessaldosLocal =(CobrarClientesSaldos) this.cobrarclientessaldosLogic.getCobrarClientesSaldoss().toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cobrarclientessaldosLocal =(CobrarClientesSaldos) this.cobrarclientessaldoss.toArray()[this.jTableDatosCobrarClientesSaldos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cobrarclientessaldosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarClientesSaldos cobrarclientessaldosAux:this.cobrarclientessaldosLogic.getCobrarClientesSaldoss()) {
						cobrarclientessaldosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesSaldos cobrarclientessaldosAux:cobrarclientessaldoss) {
						cobrarclientessaldosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesSaldos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarClientesSaldos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarClientesSaldos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSaldos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCobrarClientesSaldosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCobrarClientesSaldosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCobrarClientesSaldosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCobrarClientesSaldos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCobrarClientesSaldos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarClientesSaldos cobrarclientessaldosAux:this.cobrarclientessaldosLogic.getCobrarClientesSaldoss()) {
				
						if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							cobrarclientessaldosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarclientessaldosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							cobrarclientessaldosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL)) {
							existe=true;
							cobrarclientessaldosAux.setnombre_comercial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA)) {
							existe=true;
							cobrarclientessaldosAux.setnombre_garantia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_LIMITECREDITO)) {
							existe=true;
							cobrarclientessaldosAux.setlimite_credito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALPEDIDOS)) {
							existe=true;
							cobrarclientessaldosAux.settotal_pedidos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALSALDOS)) {
							existe=true;
							cobrarclientessaldosAux.settotal_saldos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALCHEQUES)) {
							existe=true;
							cobrarclientessaldosAux.settotal_cheques(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesSaldos cobrarclientessaldosAux:cobrarclientessaldoss) {
					
						if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							cobrarclientessaldosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarclientessaldosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							cobrarclientessaldosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL)) {
							existe=true;
							cobrarclientessaldosAux.setnombre_comercial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA)) {
							existe=true;
							cobrarclientessaldosAux.setnombre_garantia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_LIMITECREDITO)) {
							existe=true;
							cobrarclientessaldosAux.setlimite_credito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALPEDIDOS)) {
							existe=true;
							cobrarclientessaldosAux.settotal_pedidos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALSALDOS)) {
							existe=true;
							cobrarclientessaldosAux.settotal_saldos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALCHEQUES)) {
							existe=true;
							cobrarclientessaldosAux.settotal_cheques(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesSaldos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCobrarClientesSaldosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCobrarClientesSaldos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCobrarClientesSaldos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCobrarClientesSaldos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCobrarClientesSaldos) {				
					conSplash=true;//false;										
					
					//this.startProcessCobrarClientesSaldos(conSplash);
				
					this.generarReporteCobrarClientesSaldossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesSaldos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCobrarClientesSaldossSeleccionados();
				//this.jComboBoxTiposAccionesCobrarClientesSaldos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarClientesSaldossSeleccionados(false);
				//this.jComboBoxTiposAccionesCobrarClientesSaldos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarClientesSaldossSeleccionados(true);
				//this.jComboBoxTiposAccionesCobrarClientesSaldos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarClientesSaldos();
				
				this.exportarCobrarClientesSaldossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesSaldos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCobrarClientesSaldoss();
				//this.importarCobrarClientesSaldoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesSaldos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarClientesSaldos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCobrarClientesSaldossSeleccionados();
				//this.jComboBoxTiposAccionesCobrarClientesSaldos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cobrar Clientes Saldos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCobrarClientesSaldos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCobrarClientesSaldos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCobrarClientesSaldos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cobrar Clientes Saldos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesSaldos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.setSelectedIndex(0);					
				}	
			} 			
			else if(CobrarClientesSaldosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCobrarClientesSaldos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCobrarClientesSaldos(conSplash);
					
						//this.actualizarParametrosGeneralCobrarClientesSaldos();
						
						this.generarReporteProcesoAccionCobrarClientesSaldossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCobrarClientesSaldos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CobrarClientesSaldosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cobrar Clientes SaldosES SELECCIONADOS?", "MANTENIMIENTO DE Cobrar Clientes Saldos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCobrarClientesSaldos();
				
						this.actualizarParametrosGeneralCobrarClientesSaldos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cobrarclientessaldosReturnGeneral=cobrarclientessaldosLogic.procesarAccionCobrarClientesSaldossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cobrarclientessaldosLogic.getCobrarClientesSaldoss(),this.cobrarclientessaldosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCobrarClientesSaldosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarClientesSaldos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCobrarClientesSaldos();
					
					CobrarClientesSaldosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCobrarClientesSaldosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarClientesSaldos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxTiposAccionesFormularioCobrarClientesSaldos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCobrarClientesSaldos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCobrarClientesSaldosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCobrarClientesSaldos();
			
			if(this.jInternalFrameDetalleFormCobrarClientesSaldos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CobrarClientesSaldos> cobrarclientessaldossSeleccionados=new ArrayList<CobrarClientesSaldos>();		
			CobrarClientesSaldos cobrarclientessaldos=new CobrarClientesSaldos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCobrarClientesSaldos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCobrarClientesSaldos.getSelectedItem();
			
			
			
			
			cobrarclientessaldossSeleccionados=this.getCobrarClientesSaldossSeleccionados(true);
			//this.sTipoAccion;
			
			if(cobrarclientessaldossSeleccionados.size()==1) {
				for(CobrarClientesSaldos cobrarclientessaldosAux:cobrarclientessaldossSeleccionados) {
					cobrarclientessaldos=cobrarclientessaldosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCobrarClientesSaldos();
			
      		//this.finishProcessCobrarClientesSaldos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCobrarClientesSaldosReturnGeneral() throws Exception {
		if(this.cobrarclientessaldosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cobrarclientessaldosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cobrarclientessaldosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cobrarclientessaldosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cobrarclientessaldosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cobrarclientessaldosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCobrarClientesSaldos(false);
		}
		
		if(this.cobrarclientessaldosReturnGeneral.getConRetornoLista() || this.cobrarclientessaldosReturnGeneral.getConRetornoObjeto()) {
			if(this.cobrarclientessaldosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cobrarclientessaldosLogic.setCobrarClientesSaldoss(this.cobrarclientessaldosReturnGeneral.getCobrarClientesSaldoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCobrarClientesSaldos(false);
		}
	}
	
	public void actualizarParametrosGeneralCobrarClientesSaldos() throws Exception {
		
		
	}
	
	public ArrayList<CobrarClientesSaldos> getCobrarClientesSaldossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CobrarClientesSaldos> cobrarclientessaldossSeleccionados=new ArrayList<CobrarClientesSaldos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCobrarClientesSaldos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CobrarClientesSaldos cobrarclientessaldosAux:cobrarclientessaldosLogic.getCobrarClientesSaldoss()) {
					if(cobrarclientessaldosAux.getIsSelected()) {
						cobrarclientessaldossSeleccionados.add(cobrarclientessaldosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesSaldos cobrarclientessaldosAux:this.cobrarclientessaldoss) {
					if(cobrarclientessaldosAux.getIsSelected()) {
						cobrarclientessaldossSeleccionados.add(cobrarclientessaldosAux);				
					}
				}
			}
			
			if(cobrarclientessaldossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cobrarclientessaldossSeleccionados.addAll(this.cobrarclientessaldosLogic.getCobrarClientesSaldoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cobrarclientessaldossSeleccionados.addAll(this.cobrarclientessaldoss);				
					}
				}
			}
		} else {
			cobrarclientessaldossSeleccionados.add(this.cobrarclientessaldos);
		}
		
		return cobrarclientessaldossSeleccionados;
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
	
	public void generarReporteCobrarClientesSaldossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCobrarClientesSaldossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCobrarClientesSaldossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarClientesSaldossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarClientesSaldossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cobrar Clientes Saldos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCobrarClientesSaldossSeleccionados() throws Exception {
		ArrayList<CobrarClientesSaldos> cobrarclientessaldossSeleccionados=new ArrayList<CobrarClientesSaldos>();		
		
		cobrarclientessaldossSeleccionados=this.getCobrarClientesSaldossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCobrarClientesSaldoss("Todos",cobrarclientessaldossSeleccionados);
		
	}	
	
	public void generarReporteNormalCobrarClientesSaldossSeleccionados() throws Exception {
		ArrayList<CobrarClientesSaldos> cobrarclientessaldossSeleccionados=new ArrayList<CobrarClientesSaldos>();		
		
		cobrarclientessaldossSeleccionados=this.getCobrarClientesSaldossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobrarClientesSaldoss("Todos",cobrarclientessaldossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCobrarClientesSaldossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CobrarClientesSaldos> cobrarclientessaldossSeleccionados=new ArrayList<CobrarClientesSaldos>();
		
		cobrarclientessaldossSeleccionados=this.getCobrarClientesSaldossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCobrarClientesSaldoss("Todos",cobrarclientessaldossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCobrarClientesSaldossSeleccionados() throws Exception {
		ArrayList<CobrarClientesSaldos> cobrarclientessaldossSeleccionados=new ArrayList<CobrarClientesSaldos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCobrarClientesSaldos();
		
		
		cobrarclientessaldossSeleccionados=this.getCobrarClientesSaldossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCobrarClientesSaldos();
		
		
		//this.generarReporteCobrarClientesSaldoss("Todos",cobrarclientessaldossSeleccionados ,cobrarclientessaldosImplementable,cobrarclientessaldosImplementableHome);
	}
	
	public void mostrarImportacionCobrarClientesSaldoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCobrarClientesSaldos();
		
		this.abrirFrameImportacionCobrarClientesSaldos();		
		
			
		//this.generarReporteCobrarClientesSaldoss("Todos",cobrarclientessaldossSeleccionados ,cobrarclientessaldosImplementable,cobrarclientessaldosImplementableHome);
	}
	
	public void importarCobrarClientesSaldoss() throws Exception {		
	
	}
	
	public void exportarCobrarClientesSaldossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCobrarClientesSaldossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCobrarClientesSaldossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCobrarClientesSaldossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cobrar Clientes Saldos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCobrarClientesSaldossSeleccionados() throws Exception {
		ArrayList<CobrarClientesSaldos> cobrarclientessaldossSeleccionados=new ArrayList<CobrarClientesSaldos>();		
		
		cobrarclientessaldossSeleccionados=this.getCobrarClientesSaldossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientessaldos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCobrarClientesSaldos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CobrarClientesSaldos cobrarclientessaldosAux:cobrarclientessaldossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCobrarClientesSaldos(cobrarclientessaldosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cobrarclientessaldosAux.setsDetalleGeneralEntityReporte(cobrarclientessaldosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCobrarClientesSaldos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CobrarClientesSaldosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSaldosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSaldosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSaldosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSaldosConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSaldosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSaldosConstantesFunciones.LABEL_LIMITECREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSaldosConstantesFunciones.LABEL_TOTALPEDIDOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSaldosConstantesFunciones.LABEL_TOTALSALDOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSaldosConstantesFunciones.LABEL_TOTALCHEQUES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cobrarclientessaldos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessaldos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessaldos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessaldos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessaldos.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessaldos.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessaldos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessaldos.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessaldos.getnombre_comercial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessaldos.getnombre_garantia();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessaldos.getlimite_credito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessaldos.gettotal_pedidos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessaldos.gettotal_saldos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessaldos.gettotal_cheques().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCobrarClientesSaldossSeleccionados() throws Exception {
		ArrayList<CobrarClientesSaldos> cobrarclientessaldossSeleccionados=new ArrayList<CobrarClientesSaldos>();		
		
		cobrarclientessaldossSeleccionados=this.getCobrarClientesSaldossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientessaldos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CobrarClientesSaldoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCobrarClientesSaldos(row);				
				iRow++;
			}				
			
			for(CobrarClientesSaldos cobrarclientessaldosAux:cobrarclientessaldossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCobrarClientesSaldos(cobrarclientessaldosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCobrarClientesSaldossSeleccionados() throws Exception {
		ArrayList<CobrarClientesSaldos> cobrarclientessaldossSeleccionados=new ArrayList<CobrarClientesSaldos>();		
		
		cobrarclientessaldossSeleccionados=this.getCobrarClientesSaldossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientessaldos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cobrarclientessaldoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cobrarclientessaldos");
			//elementRoot.appendChild(element);
		
			for(CobrarClientesSaldos cobrarclientessaldosAux:cobrarclientessaldossSeleccionados) {
				element = document.createElement("cobrarclientessaldos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCobrarClientesSaldos(cobrarclientessaldosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCobrarClientesSaldos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_LIMITECREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALPEDIDOS);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALSALDOS);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSaldosConstantesFunciones.LABEL_TOTALCHEQUES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessaldos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessaldos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessaldos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessaldos.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessaldos.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessaldos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessaldos.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessaldos.getnombre_comercial());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessaldos.getnombre_garantia());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessaldos.getlimite_credito());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessaldos.gettotal_pedidos());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessaldos.gettotal_saldos());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessaldos.gettotal_cheques());				
	}
	
	public void setFilaDatosExportarXmlCobrarClientesSaldos(CobrarClientesSaldos cobrarclientessaldos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CobrarClientesSaldosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cobrarclientessaldos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CobrarClientesSaldosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cobrarclientessaldos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CobrarClientesSaldosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cobrarclientessaldos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CobrarClientesSaldosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(cobrarclientessaldos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(CobrarClientesSaldosConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(cobrarclientessaldos.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementfecha_emision_hasta = document.createElement(CobrarClientesSaldosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(cobrarclientessaldos.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementcodigo = document.createElement(CobrarClientesSaldosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(cobrarclientessaldos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_completo = document.createElement(CobrarClientesSaldosConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(cobrarclientessaldos.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementnombre_comercial = document.createElement(CobrarClientesSaldosConstantesFunciones.NOMBRECOMERCIAL);
		elementnombre_comercial.appendChild(document.createTextNode(cobrarclientessaldos.getnombre_comercial().trim()));
		element.appendChild(elementnombre_comercial);

		Element elementnombre_garantia = document.createElement(CobrarClientesSaldosConstantesFunciones.NOMBREGARANTIA);
		elementnombre_garantia.appendChild(document.createTextNode(cobrarclientessaldos.getnombre_garantia().trim()));
		element.appendChild(elementnombre_garantia);

		Element elementlimite_credito = document.createElement(CobrarClientesSaldosConstantesFunciones.LIMITECREDITO);
		elementlimite_credito.appendChild(document.createTextNode(cobrarclientessaldos.getlimite_credito().toString().trim()));
		element.appendChild(elementlimite_credito);

		Element elementtotal_pedidos = document.createElement(CobrarClientesSaldosConstantesFunciones.TOTALPEDIDOS);
		elementtotal_pedidos.appendChild(document.createTextNode(cobrarclientessaldos.gettotal_pedidos().toString().trim()));
		element.appendChild(elementtotal_pedidos);

		Element elementtotal_saldos = document.createElement(CobrarClientesSaldosConstantesFunciones.TOTALSALDOS);
		elementtotal_saldos.appendChild(document.createTextNode(cobrarclientessaldos.gettotal_saldos().toString().trim()));
		element.appendChild(elementtotal_saldos);

		Element elementtotal_cheques = document.createElement(CobrarClientesSaldosConstantesFunciones.TOTALCHEQUES);
		elementtotal_cheques.appendChild(document.createTextNode(cobrarclientessaldos.gettotal_cheques().toString().trim()));
		element.appendChild(elementtotal_cheques);
	}
	
	public void generarReporteGroupGenericoCobrarClientesSaldossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CobrarClientesSaldos> cobrarclientessaldossSeleccionados=new ArrayList<CobrarClientesSaldos>();
		
		cobrarclientessaldossSeleccionados=this.getCobrarClientesSaldossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCobrarClientesSaldos(cobrarclientessaldossSeleccionados);
		
		this.generarReporteCobrarClientesSaldoss("Todos",cobrarclientessaldossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCobrarClientesSaldos(ArrayList<CobrarClientesSaldos> cobrarclientessaldossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CobrarClientesSaldos cobrarclientessaldosAux:cobrarclientessaldossSeleccionados) {
				cobrarclientessaldosAux.setsDetalleGeneralEntityReporte(cobrarclientessaldosAux.toString());
			
				if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cobrarclientessaldosAux.setsDescripcionGeneralEntityReporte1(cobrarclientessaldosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					cobrarclientessaldosAux.setsDescripcionGeneralEntityReporte1(cobrarclientessaldosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					cobrarclientessaldosAux.setsDescripcionGeneralEntityReporte1(cobrarclientessaldosAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					cobrarclientessaldosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarclientessaldosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					cobrarclientessaldosAux.setsDescripcionGeneralEntityReporte1(cobrarclientessaldosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					cobrarclientessaldosAux.setsDescripcionGeneralEntityReporte1(cobrarclientessaldosAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBRECOMERCIAL)) {
					existe=true;
					cobrarclientessaldosAux.setsDescripcionGeneralEntityReporte1(cobrarclientessaldosAux.getnombre_comercial());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesSaldosConstantesFunciones.LABEL_NOMBREGARANTIA)) {
					existe=true;
					cobrarclientessaldosAux.setsDescripcionGeneralEntityReporte1(cobrarclientessaldosAux.getnombre_garantia());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCobrarClientesSaldos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCobrarClientesSaldos=true;
				this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos=true;
				this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos=true;
			}
			
			this.isVisibilidadCeldaModificarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesSaldos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesSaldos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesSaldos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCobrarClientesSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos=false;
			this.isVisibilidadCeldaModificarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesSaldos=true;
			this.isVisibilidadCeldaEliminarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesSaldos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesSaldos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesSaldos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCobrarClientesSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos=false;
			this.isVisibilidadCeldaModificarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesSaldos=true;
			this.isVisibilidadCeldaEliminarCobrarClientesSaldos=true;
			this.isVisibilidadCeldaCancelarCobrarClientesSaldos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesSaldos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesSaldos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCobrarClientesSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos=false;
			this.isVisibilidadCeldaModificarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesSaldos=true;
			this.isVisibilidadCeldaEliminarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesSaldos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesSaldos=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesSaldos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCobrarClientesSaldos=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos=true;
			this.isVisibilidadCeldaModificarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesSaldos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesSaldos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesSaldos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCobrarClientesSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesSaldos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesSaldos=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesSaldos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCobrarClientesSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos=false;
			this.isVisibilidadCeldaModificarCobrarClientesSaldos=true;
			this.isVisibilidadCeldaActualizarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesSaldos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesSaldos=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesSaldos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CobrarClientesSaldosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCobrarClientesSaldos=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos=true;
		} else {
			this.actualizarEstadoPanelsCobrarClientesSaldos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCobrarClientesSaldos=false;
			//this.isVisibilidadCeldaVerFormCobrarClientesSaldos=false;
			this.isVisibilidadCeldaDuplicarCobrarClientesSaldos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cobrarclientessaldosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos=false;
		} else {
			this.isVisibilidadCeldaNuevoCobrarClientesSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
			if(!cobrarclientessaldosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos=false;												
			}
			
			this.jButtonCerrarCobrarClientesSaldos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos=false;
		}
		
		if(!this.permiteMantenimiento(this.cobrarclientessaldos)) {
			this.isVisibilidadCeldaActualizarCobrarClientesSaldos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesSaldos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCobrarClientesSaldos=false;
		this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSaldos=false;
		this.isVisibilidadCeldaGuardarCambiosCobrarClientesSaldos=false;
		//this.isVisibilidadCeldaModificarCobrarClientesSaldos=true;
		this.isVisibilidadCeldaActualizarCobrarClientesSaldos=false;
		this.isVisibilidadCeldaEliminarCobrarClientesSaldos=false;
		//this.isVisibilidadCeldaCancelarCobrarClientesSaldos=true;			
		this.isVisibilidadCeldaGuardarCobrarClientesSaldos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarClientesSaldos() {
	}
	
	public void actualizarEstadoPanelsCobrarClientesSaldos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCobrarClientesSaldos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesSaldos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesSaldos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesSaldos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesSaldos!=null) {
				this.jScrollPanelDatosCobrarClientesSaldos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesSaldos!=null) {
				this.jPanelPaginacionCobrarClientesSaldos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSaldos!=null) {
				this.jPanelParametrosReportesCobrarClientesSaldos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCobrarClientesSaldos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesSaldos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesSaldos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesSaldos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCobrarClientesSaldos!=null) {
				this.jScrollPanelDatosCobrarClientesSaldos.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesSaldos!=null) {
				this.jPanelPaginacionCobrarClientesSaldos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSaldos!=null) {
				this.jPanelParametrosReportesCobrarClientesSaldos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCobrarClientesSaldos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesSaldos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesSaldos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesSaldos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesSaldos!=null) {
				this.jScrollPanelDatosCobrarClientesSaldos.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesSaldos!=null) {
				this.jPanelPaginacionCobrarClientesSaldos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSaldos!=null) {
				this.jPanelParametrosReportesCobrarClientesSaldos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCobrarClientesSaldos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesSaldos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesSaldos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesSaldos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesSaldos!=null) {
				this.jScrollPanelDatosCobrarClientesSaldos.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesSaldos!=null) {
				this.jPanelPaginacionCobrarClientesSaldos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSaldos!=null) {
				this.jPanelParametrosReportesCobrarClientesSaldos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCobrarClientesSaldos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesSaldos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesSaldos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesSaldos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesSaldos!=null) {
				this.jScrollPanelDatosCobrarClientesSaldos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesSaldos!=null) {
				this.jPanelPaginacionCobrarClientesSaldos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSaldos!=null) {
				this.jPanelParametrosReportesCobrarClientesSaldos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCobrarClientesSaldos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesSaldos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesSaldos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesSaldos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesSaldos!=null) {
				this.jScrollPanelDatosCobrarClientesSaldos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesSaldos!=null) {
				this.jPanelPaginacionCobrarClientesSaldos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSaldos!=null) {
				this.jPanelParametrosReportesCobrarClientesSaldos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCobrarClientesSaldos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesSaldos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesSaldos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesSaldos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesSaldos!=null) {
				this.jScrollPanelDatosCobrarClientesSaldos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesSaldos!=null) {
				this.jPanelPaginacionCobrarClientesSaldos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSaldos!=null) {
				this.jPanelParametrosReportesCobrarClientesSaldos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCobrarClientesSaldos!=null) {
					this.jTabbedPaneBusquedasCobrarClientesSaldos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSaldos!=null) {
				this.jPanelParametrosReportesCobrarClientesSaldos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesSaldos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesSaldos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSaldos!=null) {
				this.jPanelParametrosReportesCobrarClientesSaldos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCobrarClientesSaldos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCobrarClientesSaldos) {this.jTabbedPaneBusquedasCobrarClientesSaldos.remove(jPanelBusquedaCobrarClientesSaldosCobrarClientesSaldos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaCobrarClientesSaldos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaCobrarClientesSaldos) {this.jTabbedPaneBusquedasCobrarClientesSaldos.remove(jPanelBusquedaCobrarClientesSaldosCobrarClientesSaldos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaCobrarClientesSaldos=isParaEjercicio;
			if(!this.isVisibilidadBusquedaCobrarClientesSaldos) {this.jTabbedPaneBusquedasCobrarClientesSaldos.remove(jPanelBusquedaCobrarClientesSaldosCobrarClientesSaldos);}
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
			
			this.inicializarActualizarBindingTablaCobrarClientesSaldos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCobrarClientesSaldos() {
		this.updateBorderResaltarBusquedasFormularioCobrarClientesSaldos();
		this.updateVisibilidadBusquedasFormularioCobrarClientesSaldos();
		this.updateHabilitarBusquedasFormularioCobrarClientesSaldos();
	}
	
	public void updateBorderResaltarBusquedasFormularioCobrarClientesSaldos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCobrarClientesSaldos.getComponents().length>0) {
	

		if(this.cobrarclientessaldosConstantesFunciones.resaltarBusquedaCobrarClientesSaldosCobrarClientesSaldos!=null) {
			index= this.jTabbedPaneBusquedasCobrarClientesSaldos.indexOfComponent(this.jPanelBusquedaCobrarClientesSaldosCobrarClientesSaldos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesSaldos.getComponent(index);
				jPanel.setBorder(this.cobrarclientessaldosConstantesFunciones.resaltarBusquedaCobrarClientesSaldosCobrarClientesSaldos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCobrarClientesSaldos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCobrarClientesSaldos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarClientesSaldos.indexOfComponent(this.jPanelBusquedaCobrarClientesSaldosCobrarClientesSaldos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesSaldos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarBusquedaCobrarClientesSaldosCobrarClientesSaldos);
			if(!this.cobrarclientessaldosConstantesFunciones.mostrarBusquedaCobrarClientesSaldosCobrarClientesSaldos && index>-1) {
				this.jTabbedPaneBusquedasCobrarClientesSaldos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCobrarClientesSaldos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCobrarClientesSaldos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarClientesSaldos.indexOfComponent(this.jPanelBusquedaCobrarClientesSaldosCobrarClientesSaldos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesSaldos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cobrarclientessaldosConstantesFunciones.activarBusquedaCobrarClientesSaldosCobrarClientesSaldos);
				this.jTabbedPaneBusquedasCobrarClientesSaldos.setEnabledAt(index,this.cobrarclientessaldosConstantesFunciones.activarBusquedaCobrarClientesSaldosCobrarClientesSaldos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCobrarClientesSaldos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCobrarClientesSaldos")) {
			index= this.jTabbedPaneBusquedasCobrarClientesSaldos.indexOfComponent(this.jPanelBusquedaCobrarClientesSaldosCobrarClientesSaldos);

			this.jTabbedPaneBusquedasCobrarClientesSaldos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesSaldos.getComponent(index);

			this.cobrarclientessaldosConstantesFunciones.setResaltarBusquedaCobrarClientesSaldosCobrarClientesSaldos(resaltar);

			jPanel.setBorder(this.cobrarclientessaldosConstantesFunciones.resaltarBusquedaCobrarClientesSaldosCobrarClientesSaldos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCobrarClientesSaldos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCobrarClientesSaldos() throws Exception {

		if(this.jInternalFrameDetalleFormCobrarClientesSaldos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCobrarClientesSaldos();
		this.updateVisibilidadResaltarControlesFormularioCobrarClientesSaldos();
		this.updateHabilitarResaltarControlesFormularioCobrarClientesSaldos();
		
	}
	
	public void updateBorderResaltarControlesFormularioCobrarClientesSaldos() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cobrarclientessaldosConstantesFunciones.resaltaridCobrarClientesSaldos!=null && this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelidCobrarClientesSaldos.setBorder(this.cobrarclientessaldosConstantesFunciones.resaltaridCobrarClientesSaldos);}
		if(this.cobrarclientessaldosConstantesFunciones.resaltarid_empresaCobrarClientesSaldos!=null && this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_empresaCobrarClientesSaldos.setBorder(this.cobrarclientessaldosConstantesFunciones.resaltarid_empresaCobrarClientesSaldos);}
		if(this.cobrarclientessaldosConstantesFunciones.resaltarid_sucursalCobrarClientesSaldos!=null && this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_sucursalCobrarClientesSaldos.setBorder(this.cobrarclientessaldosConstantesFunciones.resaltarid_sucursalCobrarClientesSaldos);}
		if(this.cobrarclientessaldosConstantesFunciones.resaltarid_ejercicioCobrarClientesSaldos!=null && this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_ejercicioCobrarClientesSaldos.setBorder(this.cobrarclientessaldosConstantesFunciones.resaltarid_ejercicioCobrarClientesSaldos);}
		if(this.cobrarclientessaldosConstantesFunciones.resaltarfecha_emision_hastaCobrarClientesSaldos!=null && this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {this.jInternalFrameDetalleFormCobrarClientesSaldos.jDateChooserfecha_emision_hastaCobrarClientesSaldos.setBorder(this.cobrarclientessaldosConstantesFunciones.resaltarfecha_emision_hastaCobrarClientesSaldos);}
		if(this.cobrarclientessaldosConstantesFunciones.resaltarcodigoCobrarClientesSaldos!=null && this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldcodigoCobrarClientesSaldos.setBorder(this.cobrarclientessaldosConstantesFunciones.resaltarcodigoCobrarClientesSaldos);}
		if(this.cobrarclientessaldosConstantesFunciones.resaltarnombre_completoCobrarClientesSaldos!=null && this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_completoCobrarClientesSaldos.setBorder(this.cobrarclientessaldosConstantesFunciones.resaltarnombre_completoCobrarClientesSaldos);}
		if(this.cobrarclientessaldosConstantesFunciones.resaltarnombre_comercialCobrarClientesSaldos!=null && this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_comercialCobrarClientesSaldos.setBorder(this.cobrarclientessaldosConstantesFunciones.resaltarnombre_comercialCobrarClientesSaldos);}
		if(this.cobrarclientessaldosConstantesFunciones.resaltarnombre_garantiaCobrarClientesSaldos!=null && this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_garantiaCobrarClientesSaldos.setBorder(this.cobrarclientessaldosConstantesFunciones.resaltarnombre_garantiaCobrarClientesSaldos);}
		if(this.cobrarclientessaldosConstantesFunciones.resaltarlimite_creditoCobrarClientesSaldos!=null && this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldlimite_creditoCobrarClientesSaldos.setBorder(this.cobrarclientessaldosConstantesFunciones.resaltarlimite_creditoCobrarClientesSaldos);}
		if(this.cobrarclientessaldosConstantesFunciones.resaltartotal_pedidosCobrarClientesSaldos!=null && this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_pedidosCobrarClientesSaldos.setBorder(this.cobrarclientessaldosConstantesFunciones.resaltartotal_pedidosCobrarClientesSaldos);}
		if(this.cobrarclientessaldosConstantesFunciones.resaltartotal_saldosCobrarClientesSaldos!=null && this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_saldosCobrarClientesSaldos.setBorder(this.cobrarclientessaldosConstantesFunciones.resaltartotal_saldosCobrarClientesSaldos);}
		if(this.cobrarclientessaldosConstantesFunciones.resaltartotal_chequesCobrarClientesSaldos!=null && this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_chequesCobrarClientesSaldos.setBorder(this.cobrarclientessaldosConstantesFunciones.resaltartotal_chequesCobrarClientesSaldos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCobrarClientesSaldos() throws Exception {		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
	
		//this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelidCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostraridCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jPanelidCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostraridCobrarClientesSaldos);
		//this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_empresaCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarid_empresaCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jPanelid_empresaCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarid_empresaCobrarClientesSaldos);
		//this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_sucursalCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarid_sucursalCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jPanelid_sucursalCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarid_sucursalCobrarClientesSaldos);
		//this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_ejercicioCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarid_ejercicioCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jPanelid_ejercicioCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarid_ejercicioCobrarClientesSaldos);
		//this.jInternalFrameDetalleFormCobrarClientesSaldos.jDateChooserfecha_emision_hastaCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarfecha_emision_hastaCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jPanelfecha_emision_hastaCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarfecha_emision_hastaCobrarClientesSaldos);
		//this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldcodigoCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarcodigoCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jPanelcodigoCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarcodigoCobrarClientesSaldos);
		//this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_completoCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarnombre_completoCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jPanelnombre_completoCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarnombre_completoCobrarClientesSaldos);
		//this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_comercialCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarnombre_comercialCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jPanelnombre_comercialCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarnombre_comercialCobrarClientesSaldos);
		//this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_garantiaCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarnombre_garantiaCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jPanelnombre_garantiaCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarnombre_garantiaCobrarClientesSaldos);
		//this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldlimite_creditoCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarlimite_creditoCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jPanellimite_creditoCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrarlimite_creditoCobrarClientesSaldos);
		//this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_pedidosCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrartotal_pedidosCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jPaneltotal_pedidosCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrartotal_pedidosCobrarClientesSaldos);
		//this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_saldosCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrartotal_saldosCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jPaneltotal_saldosCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrartotal_saldosCobrarClientesSaldos);
		//this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_chequesCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrartotal_chequesCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jPaneltotal_chequesCobrarClientesSaldos.setVisible(this.cobrarclientessaldosConstantesFunciones.mostrartotal_chequesCobrarClientesSaldos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCobrarClientesSaldos() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesSaldos!=null) {
	
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jLabelidCobrarClientesSaldos.setEnabled(this.cobrarclientessaldosConstantesFunciones.activaridCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_empresaCobrarClientesSaldos.setEnabled(this.cobrarclientessaldosConstantesFunciones.activarid_empresaCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_sucursalCobrarClientesSaldos.setEnabled(this.cobrarclientessaldosConstantesFunciones.activarid_sucursalCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jComboBoxid_ejercicioCobrarClientesSaldos.setEnabled(this.cobrarclientessaldosConstantesFunciones.activarid_ejercicioCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jDateChooserfecha_emision_hastaCobrarClientesSaldos.setEnabled(this.cobrarclientessaldosConstantesFunciones.activarfecha_emision_hastaCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldcodigoCobrarClientesSaldos.setEnabled(this.cobrarclientessaldosConstantesFunciones.activarcodigoCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_completoCobrarClientesSaldos.setEnabled(this.cobrarclientessaldosConstantesFunciones.activarnombre_completoCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_comercialCobrarClientesSaldos.setEnabled(this.cobrarclientessaldosConstantesFunciones.activarnombre_comercialCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextAreanombre_garantiaCobrarClientesSaldos.setEnabled(this.cobrarclientessaldosConstantesFunciones.activarnombre_garantiaCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldlimite_creditoCobrarClientesSaldos.setEnabled(this.cobrarclientessaldosConstantesFunciones.activarlimite_creditoCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_pedidosCobrarClientesSaldos.setEnabled(this.cobrarclientessaldosConstantesFunciones.activartotal_pedidosCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_saldosCobrarClientesSaldos.setEnabled(this.cobrarclientessaldosConstantesFunciones.activartotal_saldosCobrarClientesSaldos);
		this.jInternalFrameDetalleFormCobrarClientesSaldos.jTextFieldtotal_chequesCobrarClientesSaldos.setEnabled(this.cobrarclientessaldosConstantesFunciones.activartotal_chequesCobrarClientesSaldos);
		}
	}
	
		
}