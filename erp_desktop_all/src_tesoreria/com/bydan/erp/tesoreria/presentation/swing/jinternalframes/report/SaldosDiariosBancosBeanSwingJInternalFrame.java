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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.tesoreria.util.SaldosDiariosBancosConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.SaldosDiariosBancosParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.SaldosDiariosBancosParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.report.SaldosDiariosBancosBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.tesoreria.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.tesoreria.util.*;

import com.bydan.erp.tesoreria.util.report.*;
import com.bydan.erp.tesoreria.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.report.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;

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
public class SaldosDiariosBancosBeanSwingJInternalFrame extends SaldosDiariosBancosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SaldosDiariosBancosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SaldosDiariosBancos> saldosdiariosbancosValidator = new ClassValidator<SaldosDiariosBancos>(SaldosDiariosBancos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SaldosDiariosBancos saldosdiariosbancos;	
	public SaldosDiariosBancos saldosdiariosbancosAux;
	public SaldosDiariosBancos saldosdiariosbancosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SaldosDiariosBancos saldosdiariosbancosTotales;
	public Long idSaldosDiariosBancosActual;
	public Long iIdNuevoSaldosDiariosBancos=0L;
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
	
	public Boolean isPermisoTodoSaldosDiariosBancos;
	public Boolean isPermisoNuevoSaldosDiariosBancos;
	public Boolean isPermisoActualizarSaldosDiariosBancos;
	public Boolean isPermisoActualizarOriginalSaldosDiariosBancos;
	public Boolean isPermisoEliminarSaldosDiariosBancos;
	public Boolean isPermisoGuardarCambiosSaldosDiariosBancos;
	public Boolean isPermisoConsultaSaldosDiariosBancos;
	public Boolean isPermisoBusquedaSaldosDiariosBancos;
	public Boolean isPermisoReporteSaldosDiariosBancos;
	public Boolean isPermisoPaginacionMedioSaldosDiariosBancos;
	public Boolean isPermisoPaginacionAltoSaldosDiariosBancos;
	public Boolean isPermisoPaginacionTodoSaldosDiariosBancos;
	public Boolean isPermisoCopiarSaldosDiariosBancos;
	public Boolean isPermisoVerFormSaldosDiariosBancos;
	public Boolean isPermisoDuplicarSaldosDiariosBancos;
	public Boolean isPermisoOrdenSaldosDiariosBancos;
	
	
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
	
	public SaldosDiariosBancosParameterReturnGeneral saldosdiariosbancosReturnGeneral;
	public SaldosDiariosBancosParameterReturnGeneral saldosdiariosbancosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSaldosDiariosBancos=false;
	public Boolean esParaAccionDesdeFormularioSaldosDiariosBancos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SaldosDiariosBancosSessionBeanAdditional saldosdiariosbancosSessionBeanAdditional=null;
	
	public SaldosDiariosBancosSessionBeanAdditional getSaldosDiariosBancosSessionBeanAdditional() {
		return this.saldosdiariosbancosSessionBeanAdditional;
	}
	
	public void setSaldosDiariosBancosSessionBeanAdditional(SaldosDiariosBancosSessionBeanAdditional saldosdiariosbancosSessionBeanAdditional) {
		try {
			this.saldosdiariosbancosSessionBeanAdditional=saldosdiariosbancosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SaldosDiariosBancosBeanSwingJInternalFrameAdditional saldosdiariosbancosBeanSwingJInternalFrameAdditional=null;
	//public class SaldosDiariosBancosBeanSwingJInternalFrame
	
	public SaldosDiariosBancosBeanSwingJInternalFrameAdditional getSaldosDiariosBancosBeanSwingJInternalFrameAdditional() {
		return this.saldosdiariosbancosBeanSwingJInternalFrameAdditional;
	}
	
	public void setSaldosDiariosBancosBeanSwingJInternalFrameAdditional(SaldosDiariosBancosBeanSwingJInternalFrameAdditional saldosdiariosbancosBeanSwingJInternalFrameAdditional) {
		try {
			this.saldosdiariosbancosBeanSwingJInternalFrameAdditional=saldosdiariosbancosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SaldosDiariosBancosLogic saldosdiariosbancosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SaldosDiariosBancos saldosdiariosbancosBean;
	public SaldosDiariosBancosConstantesFunciones saldosdiariosbancosConstantesFunciones;
	//public SaldosDiariosBancosParameterReturnGeneral saldosdiariosbancosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EjercicioLogic ejercicioLogic;
	
	//PARAMETROS
	
	
	//public List<SaldosDiariosBancos> saldosdiariosbancoss;	
	//public List<SaldosDiariosBancos> saldosdiariosbancossEliminados;
	//public List<SaldosDiariosBancos> saldosdiariosbancossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSaldosDiariosBancos=false;
	public Boolean isVisibilidadCeldaDuplicarSaldosDiariosBancos=true;
	public Boolean isVisibilidadCeldaCopiarSaldosDiariosBancos=true;
	public Boolean isVisibilidadCeldaVerFormSaldosDiariosBancos=true;
	public Boolean isVisibilidadCeldaOrdenSaldosDiariosBancos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos=false;
	public Boolean isVisibilidadCeldaModificarSaldosDiariosBancos=false;
	public Boolean isVisibilidadCeldaActualizarSaldosDiariosBancos=false;
	public Boolean isVisibilidadCeldaEliminarSaldosDiariosBancos=false;
	public Boolean isVisibilidadCeldaCancelarSaldosDiariosBancos=false;
	public Boolean isVisibilidadCeldaGuardarSaldosDiariosBancos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos=false;	
	
	
	public Boolean isVisibilidadBusquedaSaldosDiariosBancos=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoSaldosDiariosBancos() {
		return this.iIdNuevoSaldosDiariosBancos;
	}

	public void setiIdNuevoSaldosDiariosBancos(Long iIdNuevoSaldosDiariosBancos) {
		this.iIdNuevoSaldosDiariosBancos = iIdNuevoSaldosDiariosBancos;
	}
	
	public Long getidSaldosDiariosBancosActual() {
		return this.idSaldosDiariosBancosActual;
	}

	public void setidSaldosDiariosBancosActual(Long idSaldosDiariosBancosActual) {
		this.idSaldosDiariosBancosActual = idSaldosDiariosBancosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SaldosDiariosBancos getsaldosdiariosbancos() {
		return this.saldosdiariosbancos;
	}

	public void setsaldosdiariosbancos(SaldosDiariosBancos saldosdiariosbancos) {
		this.saldosdiariosbancos = saldosdiariosbancos;
	}
	
	public SaldosDiariosBancos getsaldosdiariosbancosAux() {
		return this.saldosdiariosbancosAux;
	}

	public void setsaldosdiariosbancosAux(SaldosDiariosBancos saldosdiariosbancosAux) {
		this.saldosdiariosbancosAux = saldosdiariosbancosAux;
	}				
	
	public SaldosDiariosBancos getsaldosdiariosbancosAnterior() {
		return this.saldosdiariosbancosAnterior;
	}

	public void setsaldosdiariosbancosAnterior(SaldosDiariosBancos saldosdiariosbancosAnterior) {
		this.saldosdiariosbancosAnterior = saldosdiariosbancosAnterior;
	}	
	
	public SaldosDiariosBancos getsaldosdiariosbancosTotales() {
		return this.saldosdiariosbancosTotales;
	}

	public void setsaldosdiariosbancosTotales(SaldosDiariosBancos saldosdiariosbancosTotales) {
		this.saldosdiariosbancosTotales = saldosdiariosbancosTotales;
	}	
	
	public SaldosDiariosBancos getsaldosdiariosbancosBean() {
		return this.saldosdiariosbancosBean;
	}

	public void setsaldosdiariosbancosBean(SaldosDiariosBancos saldosdiariosbancosBean) {
		this.saldosdiariosbancosBean = saldosdiariosbancosBean;
	}	
	
	public SaldosDiariosBancosParameterReturnGeneral getsaldosdiariosbancosReturnGeneral() {
		return this.saldosdiariosbancosReturnGeneral;
	}

	public void setsaldosdiariosbancosReturnGeneral(SaldosDiariosBancosParameterReturnGeneral saldosdiariosbancosReturnGeneral) {
		this.saldosdiariosbancosReturnGeneral = saldosdiariosbancosReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaSaldosDiariosBancos=-1L;

	public Long getid_ejercicioBusquedaSaldosDiariosBancos() {
		return this.id_ejercicioBusquedaSaldosDiariosBancos;
	}

	public void setid_ejercicioBusquedaSaldosDiariosBancos(Long id_ejercicioBusquedaSaldosDiariosBancos) {
		this.id_ejercicioBusquedaSaldosDiariosBancos = id_ejercicioBusquedaSaldosDiariosBancos;
	}

;
	public Date fecha_desdeBusquedaSaldosDiariosBancos=new Date();

	public Date getfecha_desdeBusquedaSaldosDiariosBancos() {
		return this.fecha_desdeBusquedaSaldosDiariosBancos;
	}

	public void setfecha_desdeBusquedaSaldosDiariosBancos(Date fecha_desdeBusquedaSaldosDiariosBancos) {
		this.fecha_desdeBusquedaSaldosDiariosBancos = fecha_desdeBusquedaSaldosDiariosBancos;
	}

;
	public Date fecha_hastaBusquedaSaldosDiariosBancos=new Date();

	public Date getfecha_hastaBusquedaSaldosDiariosBancos() {
		return this.fecha_hastaBusquedaSaldosDiariosBancos;
	}

	public void setfecha_hastaBusquedaSaldosDiariosBancos(Date fecha_hastaBusquedaSaldosDiariosBancos) {
		this.fecha_hastaBusquedaSaldosDiariosBancos = fecha_hastaBusquedaSaldosDiariosBancos;
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
	
	
	public SaldosDiariosBancosLogic getSaldosDiariosBancosLogic()	{		
		return saldosdiariosbancosLogic;
	}

	public void setSaldosDiariosBancosLogic(SaldosDiariosBancosLogic saldosdiariosbancosLogic) {
		this.saldosdiariosbancosLogic = saldosdiariosbancosLogic;
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
	
	public Boolean getIsEsNuevoSaldosDiariosBancos() {
		return isEsNuevoSaldosDiariosBancos;
	}

	public void setIsEsNuevoSaldosDiariosBancos(Boolean isEsNuevoSaldosDiariosBancos) {
		this.isEsNuevoSaldosDiariosBancos = isEsNuevoSaldosDiariosBancos;
	}

	public Boolean getEsParaAccionDesdeFormularioSaldosDiariosBancos() {
		return esParaAccionDesdeFormularioSaldosDiariosBancos;
	}
	
	public void setEsParaAccionDesdeFormularioSaldosDiariosBancos(Boolean esParaAccionDesdeFormularioSaldosDiariosBancos) {
		this.esParaAccionDesdeFormularioSaldosDiariosBancos = esParaAccionDesdeFormularioSaldosDiariosBancos;
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

			if(this.saldosdiariosbancosSessionBean==null) {
				this.saldosdiariosbancosSessionBean=new SaldosDiariosBancosSessionBean();
			}

			if(!this.saldosdiariosbancosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(saldosdiariosbancosSessionBean.getlidEmpresaActual());
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

			if(this.saldosdiariosbancosSessionBean==null) {
				this.saldosdiariosbancosSessionBean=new SaldosDiariosBancosSessionBean();
			}

			if(!this.saldosdiariosbancosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(saldosdiariosbancosSessionBean.getlidEjercicioActual());
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

					if(this.saldosdiariosbancos!=null) {
						this.saldosdiariosbancos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
						this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_empresaSaldosDiariosBancos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSaldosDiariosBancos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
						if(this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_empresaSaldosDiariosBancos.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_empresaSaldosDiariosBancos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSaldosDiariosBancosGenerico)throws Exception
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
				jComboBoxid_empresaSaldosDiariosBancosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSaldosDiariosBancosGenerico!=null && jComboBoxid_empresaSaldosDiariosBancosGenerico.getItemCount()>0) {
					jComboBoxid_empresaSaldosDiariosBancosGenerico.setSelectedIndex(0);
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

					if(this.saldosdiariosbancos!=null) {
						this.saldosdiariosbancos.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
						this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_ejercicioSaldosDiariosBancos.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioSaldosDiariosBancos.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
						if(this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_ejercicioSaldosDiariosBancos.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_ejercicioSaldosDiariosBancos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaSaldosDiariosBancos") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos!=null) {
						jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos!=null) {
							//jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioSaldosDiariosBancosGenerico)throws Exception
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
				jComboBoxid_ejercicioSaldosDiariosBancosGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioSaldosDiariosBancosGenerico!=null && jComboBoxid_ejercicioSaldosDiariosBancosGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioSaldosDiariosBancosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SaldosDiariosBancos saldosdiariosbancos,JComboBox jComboBoxid_empresaSaldosDiariosBancosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSaldosDiariosBancosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_empresaSaldosDiariosBancos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSaldosDiariosBancosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				saldosdiariosbancos.setid_empresa(empresaAux.getId());
				saldosdiariosbancos.setempresa_descripcion(SaldosDiariosBancosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				saldosdiariosbancos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(SaldosDiariosBancos saldosdiariosbancos,JComboBox jComboBoxid_ejercicioSaldosDiariosBancosGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioSaldosDiariosBancosGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_ejercicioSaldosDiariosBancos.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioSaldosDiariosBancosGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				saldosdiariosbancos.setid_ejercicio(ejercicioAux.getId());
				saldosdiariosbancos.setejercicio_descripcion(SaldosDiariosBancosConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				saldosdiariosbancos.setEjercicio(ejercicioAux);			}
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

					if(!SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { 
							this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_empresaSaldosDiariosBancos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_empresaSaldosDiariosBancos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { 
					}

					if(!SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { 
							this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_ejercicioSaldosDiariosBancos.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_ejercicioSaldosDiariosBancos.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { 
					}

					if(!SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaSaldosDiariosBancos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.addItem(ejercicio);
							}
						}

						if(!SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
							this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_empresaSaldosDiariosBancos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
							this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_empresaSaldosDiariosBancos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
							this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_ejercicioSaldosDiariosBancos.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
							this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_ejercicioSaldosDiariosBancos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesSaldosDiariosBancos() throws Exception {
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
		
	public SaldosDiariosBancosParameterReturnGeneral getSaldosDiariosBancosParameterGeneral() {
		return this.saldosdiariosbancosParameterGeneral;
	}
	
	public void setSaldosDiariosBancosParameterGeneral(SaldosDiariosBancosParameterReturnGeneral saldosdiariosbancosParameterGeneral) {
		this.saldosdiariosbancosParameterGeneral = saldosdiariosbancosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSaldosDiariosBancos() {
		return isPermisoTodoSaldosDiariosBancos;
	}

	public void setIsPermisoTodoSaldosDiariosBancos(Boolean isPermisoTodoSaldosDiariosBancos) {
		this.isPermisoTodoSaldosDiariosBancos = isPermisoTodoSaldosDiariosBancos;
	}

	public Boolean getIsPermisoNuevoSaldosDiariosBancos() {
		return isPermisoNuevoSaldosDiariosBancos;
	}

	public void setIsPermisoNuevoSaldosDiariosBancos(Boolean isPermisoNuevoSaldosDiariosBancos) {
		this.isPermisoNuevoSaldosDiariosBancos = isPermisoNuevoSaldosDiariosBancos;
	}

	public Boolean getIsPermisoActualizarSaldosDiariosBancos() {
		return isPermisoActualizarSaldosDiariosBancos;
	}

	public void setIsPermisoActualizarSaldosDiariosBancos(Boolean isPermisoActualizarSaldosDiariosBancos) {
		this.isPermisoActualizarSaldosDiariosBancos = isPermisoActualizarSaldosDiariosBancos;
	}

	public Boolean getIsPermisoEliminarSaldosDiariosBancos() {
		return isPermisoEliminarSaldosDiariosBancos;
	}

	public void setIsPermisoEliminarSaldosDiariosBancos(Boolean isPermisoEliminarSaldosDiariosBancos) {
		this.isPermisoEliminarSaldosDiariosBancos = isPermisoEliminarSaldosDiariosBancos;
	}

	public Boolean getIsPermisoGuardarCambiosSaldosDiariosBancos() {
		return isPermisoGuardarCambiosSaldosDiariosBancos;
	}

	public void setIsPermisoGuardarCambiosSaldosDiariosBancos(Boolean isPermisoGuardarCambiosSaldosDiariosBancos) {
		this.isPermisoGuardarCambiosSaldosDiariosBancos = isPermisoGuardarCambiosSaldosDiariosBancos;
	}
	
	public Boolean getIsPermisoConsultaSaldosDiariosBancos() {
		return isPermisoConsultaSaldosDiariosBancos;
	}

	public void setIsPermisoConsultaSaldosDiariosBancos(Boolean isPermisoConsultaSaldosDiariosBancos) {
		this.isPermisoConsultaSaldosDiariosBancos = isPermisoConsultaSaldosDiariosBancos;
	}

	public Boolean getIsPermisoBusquedaSaldosDiariosBancos() {
		return isPermisoBusquedaSaldosDiariosBancos;
	}

	public void setIsPermisoBusquedaSaldosDiariosBancos(Boolean isPermisoBusquedaSaldosDiariosBancos) {
		this.isPermisoBusquedaSaldosDiariosBancos = isPermisoBusquedaSaldosDiariosBancos;
	}

	public Boolean getIsPermisoReporteSaldosDiariosBancos() {
		return isPermisoReporteSaldosDiariosBancos;
	}

	public void setIsPermisoReporteSaldosDiariosBancos(Boolean isPermisoReporteSaldosDiariosBancos) {
		this.isPermisoReporteSaldosDiariosBancos = isPermisoReporteSaldosDiariosBancos;
	}
	
	public Boolean getIsPermisoPaginacionMedioSaldosDiariosBancos() {
		return isPermisoPaginacionMedioSaldosDiariosBancos;
	}

	public void setIsPermisoPaginacionMedioSaldosDiariosBancos(Boolean isPermisoPaginacionMedioSaldosDiariosBancos) {
		this.isPermisoPaginacionMedioSaldosDiariosBancos = isPermisoPaginacionMedioSaldosDiariosBancos;
	}
	
	public Boolean getIsPermisoPaginacionTodoSaldosDiariosBancos() {
		return isPermisoPaginacionTodoSaldosDiariosBancos;
	}

	public void setIsPermisoPaginacionTodoSaldosDiariosBancos(Boolean isPermisoPaginacionTodoSaldosDiariosBancos) {
		this.isPermisoPaginacionTodoSaldosDiariosBancos = isPermisoPaginacionTodoSaldosDiariosBancos;
	}
	
	public Boolean getIsPermisoPaginacionAltoSaldosDiariosBancos() {
		return isPermisoPaginacionAltoSaldosDiariosBancos;
	}

	public void setIsPermisoPaginacionAltoSaldosDiariosBancos(Boolean isPermisoPaginacionAltoSaldosDiariosBancos) {
		this.isPermisoPaginacionAltoSaldosDiariosBancos = isPermisoPaginacionAltoSaldosDiariosBancos;
	}
	
	public Boolean getIsPermisoCopiarSaldosDiariosBancos() {
		return isPermisoCopiarSaldosDiariosBancos;
	}

	public void setIsPermisoCopiarSaldosDiariosBancos(Boolean isPermisoCopiarSaldosDiariosBancos) {
		this.isPermisoCopiarSaldosDiariosBancos = isPermisoCopiarSaldosDiariosBancos;
	}
	
	public Boolean getIsPermisoVerFormSaldosDiariosBancos() {
		return isPermisoVerFormSaldosDiariosBancos;
	}

	public void setIsPermisoVerFormSaldosDiariosBancos(Boolean isPermisoVerFormSaldosDiariosBancos) {
		this.isPermisoVerFormSaldosDiariosBancos = isPermisoVerFormSaldosDiariosBancos;
	}
	
	public Boolean getIsPermisoDuplicarSaldosDiariosBancos() {
		return isPermisoDuplicarSaldosDiariosBancos;
	}

	public void setIsPermisoDuplicarSaldosDiariosBancos(Boolean isPermisoDuplicarSaldosDiariosBancos) {
		this.isPermisoDuplicarSaldosDiariosBancos = isPermisoDuplicarSaldosDiariosBancos;
	}
	
	public Boolean getIsPermisoOrdenSaldosDiariosBancos() {
		return isPermisoOrdenSaldosDiariosBancos;
	}

	public void setIsPermisoOrdenSaldosDiariosBancos(Boolean isPermisoOrdenSaldosDiariosBancos) {
		this.isPermisoOrdenSaldosDiariosBancos = isPermisoOrdenSaldosDiariosBancos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSaldosDiariosBancos() {
		return isVisibilidadCeldaNuevoSaldosDiariosBancos;
	}

	public void setIsVisibilidadCeldaNuevoSaldosDiariosBancos(Boolean isVisibilidadCeldaNuevoSaldosDiariosBancos) {
		this.isVisibilidadCeldaNuevoSaldosDiariosBancos = isVisibilidadCeldaNuevoSaldosDiariosBancos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSaldosDiariosBancos() {
		return isVisibilidadCeldaDuplicarSaldosDiariosBancos;
	}

	public void setIsVisibilidadCeldaDuplicarSaldosDiariosBancos(Boolean isVisibilidadCeldaDuplicarSaldosDiariosBancos) {
		this.isVisibilidadCeldaDuplicarSaldosDiariosBancos = isVisibilidadCeldaDuplicarSaldosDiariosBancos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSaldosDiariosBancos() {
		return isVisibilidadCeldaCopiarSaldosDiariosBancos;
	}

	public void setIsVisibilidadCeldaCopiarSaldosDiariosBancos(Boolean isVisibilidadCeldaCopiarSaldosDiariosBancos) {
		this.isVisibilidadCeldaCopiarSaldosDiariosBancos = isVisibilidadCeldaCopiarSaldosDiariosBancos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSaldosDiariosBancos() {
		return isVisibilidadCeldaVerFormSaldosDiariosBancos;
	}

	public void setIsVisibilidadCeldaVerFormSaldosDiariosBancos(Boolean isVisibilidadCeldaVerFormSaldosDiariosBancos) {
		this.isVisibilidadCeldaVerFormSaldosDiariosBancos = isVisibilidadCeldaVerFormSaldosDiariosBancos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSaldosDiariosBancos() {
		return isVisibilidadCeldaOrdenSaldosDiariosBancos;
	}

	public void setIsVisibilidadCeldaOrdenSaldosDiariosBancos(Boolean isVisibilidadCeldaOrdenSaldosDiariosBancos) {
		this.isVisibilidadCeldaOrdenSaldosDiariosBancos = isVisibilidadCeldaOrdenSaldosDiariosBancos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos() {
		return isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos(Boolean isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos) {
		this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos = isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSaldosDiariosBancos() {
		return isVisibilidadCeldaModificarSaldosDiariosBancos;
	}

	public void setIsVisibilidadCeldaModificarSaldosDiariosBancos(Boolean isVisibilidadCeldaModificarSaldosDiariosBancos) {
		this.isVisibilidadCeldaModificarSaldosDiariosBancos = isVisibilidadCeldaModificarSaldosDiariosBancos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSaldosDiariosBancos() {
		return isVisibilidadCeldaActualizarSaldosDiariosBancos;
	}

	public void setIsVisibilidadCeldaActualizarSaldosDiariosBancos(Boolean isVisibilidadCeldaActualizarSaldosDiariosBancos) {
		this.isVisibilidadCeldaActualizarSaldosDiariosBancos = isVisibilidadCeldaActualizarSaldosDiariosBancos;
	}

	public Boolean getIsVisibilidadCeldaEliminarSaldosDiariosBancos() {
		return isVisibilidadCeldaEliminarSaldosDiariosBancos;
	}

	public void setIsVisibilidadCeldaEliminarSaldosDiariosBancos(Boolean isVisibilidadCeldaEliminarSaldosDiariosBancos) {
		this.isVisibilidadCeldaEliminarSaldosDiariosBancos = isVisibilidadCeldaEliminarSaldosDiariosBancos;
	}

	public Boolean getIsVisibilidadCeldaCancelarSaldosDiariosBancos() {
		return isVisibilidadCeldaCancelarSaldosDiariosBancos;
	}

	public void setIsVisibilidadCeldaCancelarSaldosDiariosBancos(Boolean isVisibilidadCeldaCancelarSaldosDiariosBancos) {
		this.isVisibilidadCeldaCancelarSaldosDiariosBancos = isVisibilidadCeldaCancelarSaldosDiariosBancos;
	}

	public Boolean getIsVisibilidadCeldaGuardarSaldosDiariosBancos() {
		return isVisibilidadCeldaGuardarSaldosDiariosBancos;
	}

	public void setIsVisibilidadCeldaGuardarSaldosDiariosBancos(Boolean isVisibilidadCeldaGuardarSaldosDiariosBancos) {
		this.isVisibilidadCeldaGuardarSaldosDiariosBancos = isVisibilidadCeldaGuardarSaldosDiariosBancos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSaldosDiariosBancos() {
		return isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSaldosDiariosBancos(Boolean isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos) {
		this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos = isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos;
	}
		
	public SaldosDiariosBancosSessionBean getsaldosdiariosbancosSessionBean() {
		return this.saldosdiariosbancosSessionBean;
	}
	
	public void setsaldosdiariosbancosSessionBean(SaldosDiariosBancosSessionBean saldosdiariosbancosSessionBean) {
		this.saldosdiariosbancosSessionBean=saldosdiariosbancosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaSaldosDiariosBancos() {
		return this.isVisibilidadBusquedaSaldosDiariosBancos;
	}

	public void setisVisibilidadBusquedaSaldosDiariosBancos(Boolean isVisibilidadBusquedaSaldosDiariosBancos) {
		this.isVisibilidadBusquedaSaldosDiariosBancos=isVisibilidadBusquedaSaldosDiariosBancos;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(saldosdiariosbancos,null);
				this.setActualParaGuardarEjercicioForeignKey(saldosdiariosbancos,null);
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
	
	public void bugActualizarReferenciaActual(SaldosDiariosBancos saldosdiariosbancos,SaldosDiariosBancos saldosdiariosbancosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSaldosDiariosBancos(saldosdiariosbancos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		saldosdiariosbancosAux.setId(saldosdiariosbancos.getId());
		saldosdiariosbancosAux.setVersionRow(saldosdiariosbancos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(SaldosDiariosBancos saldosdiariosbancosLocal) throws Exception {
		
		if(this.saldosdiariosbancosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SaldosDiariosBancos saldosdiariosbancosLocal) throws Exception {	
		if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				saldosdiariosbancosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				saldosdiariosbancosLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSaldosDiariosBancosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = saldosdiariosbancosValidator.getInvalidValues(this.saldosdiariosbancos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SaldosDiariosBancos saldosdiariosbancos,List<SaldosDiariosBancos> saldosdiariosbancoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(SaldosDiariosBancos saldosdiariosbancos,List<SaldosDiariosBancos> saldosdiariosbancoss) throws Exception {
		try	{			
			SaldosDiariosBancosConstantesFunciones.actualizarSelectedLista(saldosdiariosbancos,saldosdiariosbancoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SaldosDiariosBancos> saldosdiariosbancossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				saldosdiariosbancossLocal=this.saldosdiariosbancosLogic.getSaldosDiariosBancoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				saldosdiariosbancossLocal=this.saldosdiariosbancoss;
			}
			//ARCHITECTURE
		
			for(SaldosDiariosBancos saldosdiariosbancosLocal:saldosdiariosbancossLocal) {
				if(this.permiteMantenimiento(saldosdiariosbancosLocal) && saldosdiariosbancosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SaldosDiariosBancosConstantesFunciones.getSaldosDiariosBancosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SaldosDiariosBancosConstantesFunciones.CODIGOCUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelcodigo_cuentaSaldosDiariosBancos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosDiariosBancosConstantesFunciones.NOMBREBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelnombre_bancoSaldosDiariosBancos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosDiariosBancosConstantesFunciones.NUMEROCUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelnumero_cuentaSaldosDiariosBancos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosDiariosBancosConstantesFunciones.NOMBREMONEDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelnombre_monedaSaldosDiariosBancos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosDiariosBancosConstantesFunciones.SALDOANTERIOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelsaldo_anteriorSaldosDiariosBancos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosDiariosBancosConstantesFunciones.DEPOSITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabeldepositoSaldosDiariosBancos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosDiariosBancosConstantesFunciones.NC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelncSaldosDiariosBancos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosDiariosBancosConstantesFunciones.CHGIRADOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelch_giradosSaldosDiariosBancos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosDiariosBancosConstantesFunciones.ND)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelndSaldosDiariosBancos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosDiariosBancosConstantesFunciones.PROCEDENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelprocedenciaSaldosDiariosBancos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosDiariosBancosConstantesFunciones.DESTINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabeldestinoSaldosDiariosBancos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelcodigo_cuentaSaldosDiariosBancos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelnombre_bancoSaldosDiariosBancos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelnumero_cuentaSaldosDiariosBancos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelnombre_monedaSaldosDiariosBancos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelsaldo_anteriorSaldosDiariosBancos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabeldepositoSaldosDiariosBancos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelncSaldosDiariosBancos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelch_giradosSaldosDiariosBancos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelndSaldosDiariosBancos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelprocedenciaSaldosDiariosBancos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabeldestinoSaldosDiariosBancos,"");
		
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
		this.iIdNuevoSaldosDiariosBancos--;	
		
		
		this.saldosdiariosbancosAux=new SaldosDiariosBancos();
		
		this.saldosdiariosbancosAux.setId(this.iIdNuevoSaldosDiariosBancos);
		this.saldosdiariosbancosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().add(this.saldosdiariosbancosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.saldosdiariosbancoss.add(this.saldosdiariosbancosAux);
		}
		//ARCHITECTURE
		
		this.saldosdiariosbancos=this.saldosdiariosbancosAux;
		
		if(SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSaldosDiariosBancos(this.saldosdiariosbancos);
			this.setVariablesObjetoActualToFormularioForeignKeySaldosDiariosBancos(this.saldosdiariosbancos);
		}
				
		//this.setDefaultControlesSaldosDiariosBancos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySaldosDiariosBancos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySaldosDiariosBancos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySaldosDiariosBancos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancosBean,this.saldosdiariosbancos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSaldosDiariosBancos(this.saldosdiariosbancosReturnGeneral,this.saldosdiariosbancosBean,false);
		
		if(this.saldosdiariosbancosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySaldosDiariosBancos(this.saldosdiariosbancosReturnGeneral.getSaldosDiariosBancos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSaldosDiariosBancos(this.saldosdiariosbancosReturnGeneral.getSaldosDiariosBancos());
		}
		
		if(this.saldosdiariosbancosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSaldosDiariosBancos(this.saldosdiariosbancosReturnGeneral.getSaldosDiariosBancos(),classes);//this.saldosdiariosbancosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySaldosDiariosBancos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySaldosDiariosBancos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.RecargarFormSaldosDiariosBancos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSaldosDiariosBancos(false);
						
			if(saldosdiariosbancosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSaldosDiariosBancos();
			}
			
			this.actualizarVisualTableDatosSaldosDiariosBancos();
			
			this.jTableDatosSaldosDiariosBancos.setRowSelectionInterval(this.getIndiceNuevoSaldosDiariosBancos(), this.getIndiceNuevoSaldosDiariosBancos());
			
			this.seleccionarFilaTablaSaldosDiariosBancosActual();
						
			this.actualizarEstadoCeldasBotonesSaldosDiariosBancos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSaldosDiariosBancos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jDateChooserfecha_desdeSaldosDiariosBancos.setEnabled(isHabilitar && this.saldosdiariosbancosConstantesFunciones.activarfecha_desdeSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jDateChooserfecha_hastaSaldosDiariosBancos.setEnabled(isHabilitar && this.saldosdiariosbancosConstantesFunciones.activarfecha_hastaSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldcodigo_cuentaSaldosDiariosBancos.setEnabled(isHabilitar && this.saldosdiariosbancosConstantesFunciones.activarcodigo_cuentaSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreanombre_bancoSaldosDiariosBancos.setEnabled(isHabilitar && this.saldosdiariosbancosConstantesFunciones.activarnombre_bancoSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldnumero_cuentaSaldosDiariosBancos.setEnabled(isHabilitar && this.saldosdiariosbancosConstantesFunciones.activarnumero_cuentaSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldnombre_monedaSaldosDiariosBancos.setEnabled(isHabilitar && this.saldosdiariosbancosConstantesFunciones.activarnombre_monedaSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldsaldo_anteriorSaldosDiariosBancos.setEnabled(isHabilitar && this.saldosdiariosbancosConstantesFunciones.activarsaldo_anteriorSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFielddepositoSaldosDiariosBancos.setEnabled(isHabilitar && this.saldosdiariosbancosConstantesFunciones.activardepositoSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldncSaldosDiariosBancos.setEnabled(isHabilitar && this.saldosdiariosbancosConstantesFunciones.activarncSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldch_giradosSaldosDiariosBancos.setEnabled(isHabilitar && this.saldosdiariosbancosConstantesFunciones.activarch_giradosSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldndSaldosDiariosBancos.setEnabled(isHabilitar && this.saldosdiariosbancosConstantesFunciones.activarndSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreaprocedenciaSaldosDiariosBancos.setEnabled(isHabilitar && this.saldosdiariosbancosConstantesFunciones.activarprocedenciaSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreadestinoSaldosDiariosBancos.setEnabled(isHabilitar && this.saldosdiariosbancosConstantesFunciones.activardestinoSaldosDiariosBancos);	
		//
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_empresaSaldosDiariosBancos.setEnabled(isHabilitar && this.saldosdiariosbancosConstantesFunciones.activarid_empresaSaldosDiariosBancos);//
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_ejercicioSaldosDiariosBancos.setEnabled(isHabilitar && this.saldosdiariosbancosConstantesFunciones.activarid_ejercicioSaldosDiariosBancos);
	};
	
	public void setDefaultControlesSaldosDiariosBancos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSaldosDiariosBancos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.saldosdiariosbancosSessionBean.setConGuardarRelaciones(true);			
			this.saldosdiariosbancosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTabbedPaneRelacionesSaldosDiariosBancos.setVisible(true);
			
					
		} else {
			//this.saldosdiariosbancosSessionBean.setConGuardarRelaciones(false);			
			this.saldosdiariosbancosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTabbedPaneRelacionesSaldosDiariosBancos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSaldosDiariosBancos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldosDiariosBancos saldosdiariosbancosAux:this.saldosdiariosbancosLogic.getSaldosDiariosBancoss()) {
				if(saldosdiariosbancosAux.getId().equals(this.iIdNuevoSaldosDiariosBancos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldosDiariosBancos saldosdiariosbancosAux:this.saldosdiariosbancoss) {
				if(saldosdiariosbancosAux.getId().equals(this.iIdNuevoSaldosDiariosBancos)) {
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
	
	public int getIndiceActualSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldosDiariosBancos saldosdiariosbancosAux:this.saldosdiariosbancosLogic.getSaldosDiariosBancoss()) {
				if(saldosdiariosbancosAux.getId().equals(saldosdiariosbancos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldosDiariosBancos saldosdiariosbancosAux:this.saldosdiariosbancoss) {
				if(saldosdiariosbancosAux.getId().equals(saldosdiariosbancos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldosDiariosBancos saldosdiariosbancosAux:this.saldosdiariosbancosLogic.getSaldosDiariosBancoss()) {
				if(saldosdiariosbancosAux.getSaldosDiariosBancosOriginal().getId().equals(saldosdiariosbancosOriginal.getId())) {
					existe=true;
					saldosdiariosbancosOriginal.setId(saldosdiariosbancosAux.getId());
					saldosdiariosbancosOriginal.setVersionRow(saldosdiariosbancosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldosDiariosBancos saldosdiariosbancosAux:this.saldosdiariosbancoss) {
				if(saldosdiariosbancosAux.getSaldosDiariosBancosOriginal().getId().equals(saldosdiariosbancosOriginal.getId())) {
					existe=true;
					saldosdiariosbancosOriginal.setId(saldosdiariosbancosAux.getId());
					saldosdiariosbancosOriginal.setVersionRow(saldosdiariosbancosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSaldosDiariosBancos(Boolean esParaCancelar) throws Exception {
		saldosdiariosbancossAux=new ArrayList<SaldosDiariosBancos>();
		saldosdiariosbancosAux=new SaldosDiariosBancos();
		
		if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SaldosDiariosBancos saldosdiariosbancosAux:this.saldosdiariosbancosLogic.getSaldosDiariosBancoss()) {
					if(saldosdiariosbancosAux.getId()<0) {
						saldosdiariosbancossAux.add(saldosdiariosbancosAux);
					}		
				}
				this.iIdNuevoSaldosDiariosBancos=0L;
				this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().removeAll(saldosdiariosbancossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldosDiariosBancos saldosdiariosbancosAux:this.saldosdiariosbancoss) {
					if(saldosdiariosbancosAux.getId()<0) {
						saldosdiariosbancossAux.add(saldosdiariosbancosAux);
					}		
				}
				this.iIdNuevoSaldosDiariosBancos=0L;
				this.saldosdiariosbancoss.removeAll(saldosdiariosbancossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSaldosDiariosBancos 
					&& this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().size()>0
					) {
					saldosdiariosbancosAux=this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().get(this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().size() - 1);
				
					if(saldosdiariosbancosAux.getId()<0) {
						this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().remove(saldosdiariosbancosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSaldosDiariosBancos && this.saldosdiariosbancoss.size()>0) {
					saldosdiariosbancosAux=this.saldosdiariosbancoss.get(this.saldosdiariosbancoss.size() - 1);
				
					if(saldosdiariosbancosAux.getId()<0) {
						this.saldosdiariosbancoss.remove(saldosdiariosbancosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSaldosDiariosBancos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(saldosdiariosbancos.getId()<0) {
				this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().remove(this.saldosdiariosbancos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(saldosdiariosbancos.getId()<0) {
				this.saldosdiariosbancoss.remove(this.saldosdiariosbancos);
			}
		}			
	}
	
	public void setEstadosInicialesSaldosDiariosBancos(List<SaldosDiariosBancos> saldosdiariosbancossAux) throws Exception {
		SaldosDiariosBancosConstantesFunciones.setEstadosInicialesSaldosDiariosBancos(saldosdiariosbancossAux);
	}
	
	public void setEstadosInicialesSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancosAux) throws Exception {
		SaldosDiariosBancosConstantesFunciones.setEstadosInicialesSaldosDiariosBancos(saldosdiariosbancosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSaldosDiariosBancosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSaldosDiariosBancos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSaldosDiariosBancosActual()) {
				if(!this.isEsNuevoSaldosDiariosBancos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSaldosDiariosBancos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSaldosDiariosBancos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSaldosDiariosBancosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Saldos Diarios Bancos ?", "MANTENIMIENTO DE Saldos Diarios Bancos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSaldosDiariosBancos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SaldosDiariosBancos saldosdiariosbancos) throws Exception {
		SaldosDiariosBancosConstantesFunciones.seleccionarAsignar(this.saldosdiariosbancos,saldosdiariosbancos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSaldosDiariosBancos=this.isPermisoActualizarOriginalSaldosDiariosBancos;
			
			
			this.seleccionarAsignar(saldosdiariosbancos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesSaldosDiariosBancos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.saldosdiariosbancosSessionBean.setsFuncionBusquedaRapida(this.saldosdiariosbancosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSaldosDiariosBancos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSaldosDiariosBancos(esParaCancelar);				
				this.cancelarNuevoSaldosDiariosBancos(esParaCancelar);								
			}
			
			this.saldosdiariosbancos=new SaldosDiariosBancos();
			
			this.inicializarSaldosDiariosBancos();
			
			this.actualizarEstadoCeldasBotonesSaldosDiariosBancos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSaldosDiariosBancos() throws Exception {
		try {
			SaldosDiariosBancosConstantesFunciones.inicializarSaldosDiariosBancos(this.saldosdiariosbancos);
			
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
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSaldosDiariosBancoss(String sAccionBusqueda,List<SaldosDiariosBancos> saldosdiariosbancossParaReportes) throws Exception {
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
					sPathReporteFinal="SaldosDiariosBancos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SaldosDiariosBancosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SaldosDiariosBancosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SaldosDiariosBancos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Saldos Diarios Bancoses");		
		parameters.put("busquedapor", SaldosDiariosBancosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSaldosDiariosBancos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SaldosDiariosBancosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SaldosDiariosBancosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSaldosDiariosBancos=new JRBeanArrayDataSource(SaldosDiariosBancosJInternalFrame.TraerSaldosDiariosBancosBeans(saldosdiariosbancossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSaldosDiariosBancos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SaldosDiariosBancosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SaldosDiariosBancosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SaldosDiariosBancosBean.TraerSaldosDiariosBancosBeans(saldosdiariosbancossParaReportes).toArray()));
							
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
				this.generarExcelReporteSaldosDiariosBancoss(sAccionBusqueda,sTipoArchivoReporte,saldosdiariosbancossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSaldosDiariosBancoss(sAccionBusqueda,sTipoArchivoReporte,saldosdiariosbancossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSaldosDiariosBancosActionPerformed(null);
					//this.generarExcelReporteSaldosDiariosBancoss(sAccionBusqueda,sTipoArchivoReporte,saldosdiariosbancossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSaldosDiariosBancoss(sAccionBusqueda,sTipoArchivoReporte,saldosdiariosbancossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSaldosDiariosBancoss(sAccionBusqueda,sTipoArchivoReporte,saldosdiariosbancossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSaldosDiariosBancoss(sAccionBusqueda,sTipoArchivoReporte,saldosdiariosbancossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSaldosDiariosBancoss(String sAccionBusqueda,String sTipoArchivoReporte,List<SaldosDiariosBancos> saldosdiariosbancossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldosdiariosbancos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SaldosDiariosBancoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSaldosDiariosBancos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SaldosDiariosBancos saldosdiariosbancos : saldosdiariosbancossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SaldosDiariosBancosConstantesFunciones.generarExcelReporteDataSaldosDiariosBancos("NORMAL",row,workbook,saldosdiariosbancos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Diarios Bancos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSaldosDiariosBancos(String sTipo,Row row,Workbook workbook) {
		
		SaldosDiariosBancosConstantesFunciones.generarExcelReporteHeaderSaldosDiariosBancos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSaldosDiariosBancoss(String sAccionBusqueda,String sTipoArchivoReporte,List<SaldosDiariosBancos> saldosdiariosbancossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldosdiariosbancos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SaldosDiariosBancoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SaldosDiariosBancos saldosdiariosbancos : saldosdiariosbancossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SaldosDiariosBancosConstantesFunciones.getSaldosDiariosBancosDescripcion(saldosdiariosbancos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosDiariosBancosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosdiariosbancos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosDiariosBancosConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosdiariosbancos.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosDiariosBancosConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosdiariosbancos.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosDiariosBancosConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosdiariosbancos.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosdiariosbancos.getcodigo_cuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosdiariosbancos.getnombre_banco());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosdiariosbancos.getnumero_cuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosdiariosbancos.getnombre_moneda());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosDiariosBancosConstantesFunciones.LABEL_SALDOANTERIOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_SALDOANTERIOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosdiariosbancos.getsaldo_anterior());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosDiariosBancosConstantesFunciones.LABEL_DEPOSITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_DEPOSITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosdiariosbancos.getdeposito());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosDiariosBancosConstantesFunciones.LABEL_NC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_NC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosdiariosbancos.getnc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosDiariosBancosConstantesFunciones.LABEL_CHGIRADOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_CHGIRADOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosdiariosbancos.getch_girados());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosDiariosBancosConstantesFunciones.LABEL_ND))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_ND);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosdiariosbancos.getnd());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosdiariosbancos.getprocedencia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldosdiariosbancos.getdestino());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Diarios Bancos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSaldosDiariosBancoss(String sAccionBusqueda,String sTipoArchivoReporte,List<SaldosDiariosBancos> saldosdiariosbancossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SaldosDiariosBancos> saldosdiariosbancossRespaldo=null;
		
		classes=SaldosDiariosBancosConstantesFunciones.getClassesRelationshipsOfSaldosDiariosBancos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.saldosdiariosbancosLogic.setDatosCliente(this.datosCliente);
		this.saldosdiariosbancosLogic.setDatosDeep(this.datosDeep);
		this.saldosdiariosbancosLogic.setIsConDeep(true);
		
		saldosdiariosbancossRespaldo=this.saldosdiariosbancosLogic.getSaldosDiariosBancoss();
		
		this.saldosdiariosbancosLogic.setSaldosDiariosBancoss(saldosdiariosbancossParaReportes);	
		this.saldosdiariosbancosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		saldosdiariosbancossParaReportes=this.saldosdiariosbancosLogic.getSaldosDiariosBancoss();
		this.saldosdiariosbancosLogic.setSaldosDiariosBancoss(saldosdiariosbancossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldosdiariosbancos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SaldosDiariosBancoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSaldosDiariosBancos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SaldosDiariosBancos saldosdiariosbancos : saldosdiariosbancossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSaldosDiariosBancos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SaldosDiariosBancosConstantesFunciones.generarExcelReporteDataSaldosDiariosBancos("NORMAL",row,workbook,saldosdiariosbancos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SaldosDiariosBancosConstantesFunciones.getSaldosDiariosBancosDescripcion(saldosdiariosbancos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Diarios Bancos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSaldosDiariosBancos() throws Exception {		
		this.startProcessSaldosDiariosBancos(true);
	}
	
	public void startProcessSaldosDiariosBancos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSaldosDiariosBancos ,this.jPanelParametrosReportesSaldosDiariosBancos, this.jScrollPanelDatosSaldosDiariosBancos,this.jPanelPaginacionSaldosDiariosBancos, this.jScrollPanelDatosEdicionSaldosDiariosBancos, this.jPanelAccionesSaldosDiariosBancos,this.jPanelAccionesFormularioSaldosDiariosBancos,this.jmenuBarSaldosDiariosBancos,this.jmenuBarDetalleSaldosDiariosBancos,this.jTtoolBarSaldosDiariosBancos,this.jTtoolBarDetalleSaldosDiariosBancos);		
		
		final JTabbedPane jTabbedPaneBusquedasSaldosDiariosBancos=this.jTabbedPaneBusquedasSaldosDiariosBancos; 
		
		final JPanel jPanelParametrosReportesSaldosDiariosBancos=this.jPanelParametrosReportesSaldosDiariosBancos;
		//final JScrollPane jScrollPanelDatosSaldosDiariosBancos=this.jScrollPanelDatosSaldosDiariosBancos;
		final JTable jTableDatosSaldosDiariosBancos=this.jTableDatosSaldosDiariosBancos;		
		final JPanel jPanelPaginacionSaldosDiariosBancos=this.jPanelPaginacionSaldosDiariosBancos;
		//final JScrollPane jScrollPanelDatosEdicionSaldosDiariosBancos=this.jScrollPanelDatosEdicionSaldosDiariosBancos;
		final JPanel jPanelAccionesSaldosDiariosBancos=this.jPanelAccionesSaldosDiariosBancos;
		
		JPanel jPanelCamposAuxiliarSaldosDiariosBancos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSaldosDiariosBancos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
			jPanelCamposAuxiliarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelCamposSaldosDiariosBancos;
			jPanelAccionesFormularioAuxiliarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelAccionesFormularioSaldosDiariosBancos;
		}
		
		final JPanel jPanelCamposSaldosDiariosBancos=jPanelCamposAuxiliarSaldosDiariosBancos;
		final JPanel jPanelAccionesFormularioSaldosDiariosBancos=jPanelAccionesFormularioAuxiliarSaldosDiariosBancos;
		
		
		final JMenuBar jmenuBarSaldosDiariosBancos=this.jmenuBarSaldosDiariosBancos;
		final JToolBar jTtoolBarSaldosDiariosBancos=this.jTtoolBarSaldosDiariosBancos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSaldosDiariosBancos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSaldosDiariosBancos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
			jmenuBarDetalleAuxiliarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jmenuBarDetalleSaldosDiariosBancos;
			jTtoolBarDetalleAuxiliarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jTtoolBarDetalleSaldosDiariosBancos;
		}
		
		final JMenuBar jmenuBarDetalleSaldosDiariosBancos=jmenuBarDetalleAuxiliarSaldosDiariosBancos;
		final JToolBar jTtoolBarDetalleSaldosDiariosBancos=jTtoolBarDetalleAuxiliarSaldosDiariosBancos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSaldosDiariosBancos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSaldosDiariosBancos;
			processRunnable.jTableDatos=jTableDatosSaldosDiariosBancos;
			processRunnable.jPanelCampos=jPanelCamposSaldosDiariosBancos;
			processRunnable.jPanelPaginacion=jPanelPaginacionSaldosDiariosBancos;
			processRunnable.jPanelAcciones=jPanelAccionesSaldosDiariosBancos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSaldosDiariosBancos;
			
			
			processRunnable.jmenuBar=jmenuBarSaldosDiariosBancos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSaldosDiariosBancos;
			processRunnable.jTtoolBar=jTtoolBarSaldosDiariosBancos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSaldosDiariosBancos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSaldosDiariosBancos ,jPanelParametrosReportesSaldosDiariosBancos,jTableDatosSaldosDiariosBancos, /*jScrollPanelDatosSaldosDiariosBancos,*/jPanelCamposSaldosDiariosBancos,jPanelPaginacionSaldosDiariosBancos, /*jScrollPanelDatosEdicionSaldosDiariosBancos,*/ jPanelAccionesSaldosDiariosBancos,jPanelAccionesFormularioSaldosDiariosBancos,jmenuBarSaldosDiariosBancos,jmenuBarDetalleSaldosDiariosBancos,jTtoolBarSaldosDiariosBancos,jTtoolBarDetalleSaldosDiariosBancos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSaldosDiariosBancos ,jPanelParametrosReportesSaldosDiariosBancos, jScrollPanelDatosSaldosDiariosBancos,jPanelPaginacionSaldosDiariosBancos, jScrollPanelDatosEdicionSaldosDiariosBancos, jPanelAccionesSaldosDiariosBancos,jPanelAccionesFormularioSaldosDiariosBancos,jmenuBarSaldosDiariosBancos,jmenuBarDetalleSaldosDiariosBancos,jTtoolBarSaldosDiariosBancos,jTtoolBarDetalleSaldosDiariosBancos);
						
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
	
	public void finishProcessSaldosDiariosBancos() {// throws Exception 
		this.finishProcessSaldosDiariosBancos(true);
	}
	
	public void finishProcessSaldosDiariosBancos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSaldosDiariosBancos ,this.jPanelParametrosReportesSaldosDiariosBancos, this.jScrollPanelDatosSaldosDiariosBancos,this.jPanelPaginacionSaldosDiariosBancos, this.jScrollPanelDatosEdicionSaldosDiariosBancos, this.jPanelAccionesSaldosDiariosBancos,this.jPanelAccionesFormularioSaldosDiariosBancos,this.jmenuBarSaldosDiariosBancos,this.jmenuBarDetalleSaldosDiariosBancos,this.jTtoolBarSaldosDiariosBancos,this.jTtoolBarDetalleSaldosDiariosBancos);		
		
		final JTabbedPane jTabbedPaneBusquedasSaldosDiariosBancos=this.jTabbedPaneBusquedasSaldosDiariosBancos; 
		
		final JPanel jPanelParametrosReportesSaldosDiariosBancos=this.jPanelParametrosReportesSaldosDiariosBancos;
		//final JScrollPane jScrollPanelDatosSaldosDiariosBancos=this.jScrollPanelDatosSaldosDiariosBancos;
		final JTable jTableDatosSaldosDiariosBancos=this.jTableDatosSaldosDiariosBancos;		
		final JPanel jPanelPaginacionSaldosDiariosBancos=this.jPanelPaginacionSaldosDiariosBancos;
		//final JScrollPane jScrollPanelDatosEdicionSaldosDiariosBancos=this.jScrollPanelDatosEdicionSaldosDiariosBancos;
		final JPanel jPanelAccionesSaldosDiariosBancos=this.jPanelAccionesSaldosDiariosBancos;
		
		JPanel jPanelCamposAuxiliarSaldosDiariosBancos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSaldosDiariosBancos=new JPanel();
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
			jPanelCamposAuxiliarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelCamposSaldosDiariosBancos;
			jPanelAccionesFormularioAuxiliarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelAccionesFormularioSaldosDiariosBancos;
		}
		
		final JPanel jPanelCamposSaldosDiariosBancos=jPanelCamposAuxiliarSaldosDiariosBancos;
		final JPanel jPanelAccionesFormularioSaldosDiariosBancos=jPanelAccionesFormularioAuxiliarSaldosDiariosBancos;
		
		
		final JMenuBar jmenuBarSaldosDiariosBancos=this.jmenuBarSaldosDiariosBancos;		
		final JToolBar jTtoolBarSaldosDiariosBancos=this.jTtoolBarSaldosDiariosBancos;
				
		JMenuBar jmenuBarDetalleAuxiliarSaldosDiariosBancos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSaldosDiariosBancos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
			jmenuBarDetalleAuxiliarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jmenuBarDetalleSaldosDiariosBancos;
			jTtoolBarDetalleAuxiliarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jTtoolBarDetalleSaldosDiariosBancos;		
		}
		
		final JMenuBar jmenuBarDetalleSaldosDiariosBancos=jmenuBarDetalleAuxiliarSaldosDiariosBancos;
		final JToolBar jTtoolBarDetalleSaldosDiariosBancos=jTtoolBarDetalleAuxiliarSaldosDiariosBancos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSaldosDiariosBancos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSaldosDiariosBancos;
			processRunnable.jTableDatos=jTableDatosSaldosDiariosBancos;
			processRunnable.jPanelCampos=jPanelCamposSaldosDiariosBancos;
			processRunnable.jPanelPaginacion=jPanelPaginacionSaldosDiariosBancos;
			processRunnable.jPanelAcciones=jPanelAccionesSaldosDiariosBancos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSaldosDiariosBancos;
			
			
			processRunnable.jmenuBar=jmenuBarSaldosDiariosBancos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSaldosDiariosBancos;
			processRunnable.jTtoolBar=jTtoolBarSaldosDiariosBancos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSaldosDiariosBancos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSaldosDiariosBancos ,jPanelParametrosReportesSaldosDiariosBancos, jTableDatosSaldosDiariosBancos,/*jScrollPanelDatosSaldosDiariosBancos,*/jPanelCamposSaldosDiariosBancos,jPanelPaginacionSaldosDiariosBancos, /*jScrollPanelDatosEdicionSaldosDiariosBancos,*/ jPanelAccionesSaldosDiariosBancos,jPanelAccionesFormularioSaldosDiariosBancos,jmenuBarSaldosDiariosBancos,jmenuBarDetalleSaldosDiariosBancos,jTtoolBarSaldosDiariosBancos,jTtoolBarDetalleSaldosDiariosBancos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSaldosDiariosBancos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSaldosDiariosBancos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSaldosDiariosBancos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSaldosDiariosBancos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSaldosDiariosBancos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSaldosDiariosBancos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSaldosDiariosBancos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSaldosDiariosBancos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSaldosDiariosBancos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.saldosdiariosbancosConstantesFunciones.getsFinalQuerySaldosDiariosBancos();
		String  finalQueryPaginacionTodos=this.saldosdiariosbancosConstantesFunciones.getsFinalQuerySaldosDiariosBancos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SaldosDiariosBancosConstantesFunciones.getArrayColumnasGlobalesNoSaldosDiariosBancos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SaldosDiariosBancosConstantesFunciones.getArrayColumnasGlobalesSaldosDiariosBancos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SaldosDiariosBancosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.saldosdiariosbancossEliminados= new ArrayList<SaldosDiariosBancos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSaldosDiariosBancos();
		
				///*SaldosDiariosBancosSessionBean*/this.saldosdiariosbancosSessionBean=new SaldosDiariosBancosSessionBean();
			
			if(this.saldosdiariosbancosSessionBean==null) {
				this.saldosdiariosbancosSessionBean=new SaldosDiariosBancosSessionBean();
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
					this.iNumeroPaginacion=SaldosDiariosBancosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SaldosDiariosBancosConstantesFunciones.getClassesForeignKeysOfSaldosDiariosBancos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/saldosdiariosbancos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			saldosdiariosbancossAux= new ArrayList<SaldosDiariosBancos>();
			
				
			saldosdiariosbancosLogic.setDatosCliente(this.datosCliente);
			saldosdiariosbancosLogic.setDatosDeep(this.datosDeep);
			saldosdiariosbancosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaSaldosDiariosBancos")) {
				this.sDetalleReporte=SaldosDiariosBancosConstantesFunciones.getDetalleIndiceBusquedaSaldosDiariosBancos(id_ejercicioBusquedaSaldosDiariosBancos,fecha_desdeBusquedaSaldosDiariosBancos,fecha_hastaBusquedaSaldosDiariosBancos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					saldosdiariosbancosLogic.getSaldosDiariosBancossBusquedaSaldosDiariosBancos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaSaldosDiariosBancos,fecha_desdeBusquedaSaldosDiariosBancos,fecha_hastaBusquedaSaldosDiariosBancos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldosDiariosBancosConstantesFunciones.getDetalleIndiceBusquedaSaldosDiariosBancos(id_ejercicioBusquedaSaldosDiariosBancos,fecha_desdeBusquedaSaldosDiariosBancos,fecha_hastaBusquedaSaldosDiariosBancos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldosDiariosBancosConstantesFunciones.getDetalleIndiceBusquedaSaldosDiariosBancos(id_ejercicioBusquedaSaldosDiariosBancos,fecha_desdeBusquedaSaldosDiariosBancos,fecha_hastaBusquedaSaldosDiariosBancos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=saldosdiariosbancosLogic.getSaldosDiariosBancoss()==null||saldosdiariosbancosLogic.getSaldosDiariosBancoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=saldosdiariosbancoss==null|| saldosdiariosbancoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						saldosdiariosbancossAux=new ArrayList<SaldosDiariosBancos>();
						saldosdiariosbancossAux.addAll(saldosdiariosbancosLogic.getSaldosDiariosBancoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldosdiariosbancossAux=new ArrayList<SaldosDiariosBancos>();
							saldosdiariosbancossAux.addAll(saldosdiariosbancoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							saldosdiariosbancosLogic.getSaldosDiariosBancossBusquedaSaldosDiariosBancos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaSaldosDiariosBancos,fecha_desdeBusquedaSaldosDiariosBancos,fecha_hastaBusquedaSaldosDiariosBancos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldosDiariosBancosConstantesFunciones.getDetalleIndiceBusquedaSaldosDiariosBancos(id_ejercicioBusquedaSaldosDiariosBancos,fecha_desdeBusquedaSaldosDiariosBancos,fecha_hastaBusquedaSaldosDiariosBancos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldosDiariosBancosConstantesFunciones.getDetalleIndiceBusquedaSaldosDiariosBancos(id_ejercicioBusquedaSaldosDiariosBancos,fecha_desdeBusquedaSaldosDiariosBancos,fecha_hastaBusquedaSaldosDiariosBancos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSaldosDiariosBancoss("BusquedaSaldosDiariosBancos",saldosdiariosbancosLogic.getSaldosDiariosBancoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSaldosDiariosBancoss("BusquedaSaldosDiariosBancos",saldosdiariosbancoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						saldosdiariosbancosLogic.setSaldosDiariosBancoss(new ArrayList<SaldosDiariosBancos>());
						saldosdiariosbancosLogic.getSaldosDiariosBancoss().addAll(saldosdiariosbancossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldosdiariosbancoss=new ArrayList<SaldosDiariosBancos>();
							saldosdiariosbancoss.addAll(saldosdiariosbancossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSaldosDiariosBancos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSaldosDiariosBancos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=saldosdiariosbancosLogic.getSaldosDiariosBancoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=saldosdiariosbancoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=saldosdiariosbancosLogic.getSaldosDiariosBancoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=saldosdiariosbancoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SaldosDiariosBancos saldosdiariosbancos) {
		Boolean permite=true;
		
		if(this.saldosdiariosbancos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SaldosDiariosBancosConstantesFunciones.getOrderByListaSaldosDiariosBancos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SaldosDiariosBancosConstantesFunciones.getOrderByListaSaldosDiariosBancos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancosLogic.getSaldosDiariosBancoss()) {
				if(saldosdiariosbancos.getsType().equals(Constantes2.S_TOTALES)) {
					saldosdiariosbancosTotales=saldosdiariosbancos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldosDiariosBancos saldosdiariosbancos:this.saldosdiariosbancoss) {
				if(saldosdiariosbancos.getsType().equals(Constantes2.S_TOTALES)) {
					saldosdiariosbancosTotales=saldosdiariosbancos;
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
			this.saldosdiariosbancosAux=new SaldosDiariosBancos();
			this.saldosdiariosbancosAux.setsType(Constantes2.S_TOTALES);
			this.saldosdiariosbancosAux.setIsNew(false);
			this.saldosdiariosbancosAux.setIsChanged(false);
			this.saldosdiariosbancosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//SaldosDiariosBancosConstantesFunciones.TotalizarValoresFilaSaldosDiariosBancos(this.saldosdiariosbancosLogic.getSaldosDiariosBancoss(),this.saldosdiariosbancosAux);
				
				//this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().add(this.saldosdiariosbancosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SaldosDiariosBancosConstantesFunciones.TotalizarValoresFilaSaldosDiariosBancos(this.saldosdiariosbancoss,this.saldosdiariosbancosAux);
				
				this.saldosdiariosbancoss.add(this.saldosdiariosbancosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		saldosdiariosbancosTotales=new SaldosDiariosBancos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().remove(saldosdiariosbancosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.saldosdiariosbancoss.remove(saldosdiariosbancosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		saldosdiariosbancosTotales=new SaldosDiariosBancos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancosLogic.getSaldosDiariosBancoss()) {
				if(saldosdiariosbancos.getsType().equals(Constantes2.S_TOTALES)) {
					saldosdiariosbancosTotales=saldosdiariosbancos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SaldosDiariosBancosConstantesFunciones.TotalizarValoresFilaSaldosDiariosBancos(this.saldosdiariosbancosLogic.getSaldosDiariosBancoss(),saldosdiariosbancosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldosDiariosBancos saldosdiariosbancos:this.saldosdiariosbancoss) {
				if(saldosdiariosbancos.getsType().equals(Constantes2.S_TOTALES)) {
					saldosdiariosbancosTotales=saldosdiariosbancos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SaldosDiariosBancosConstantesFunciones.TotalizarValoresFilaSaldosDiariosBancos(this.saldosdiariosbancoss,saldosdiariosbancosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSaldosDiariosBancossBusquedaSaldosDiariosBancos()throws Exception {
		try {
			sAccionBusqueda="BusquedaSaldosDiariosBancos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldosDiariosBancossFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldosDiariosBancossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSaldosDiariosBancossBusquedaSaldosDiariosBancos(String sFinalQuery,Long id_ejercicio,Date fecha_desde,Date fecha_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//saldosdiariosbancosLogic.getSaldosDiariosBancossBusquedaSaldosDiariosBancos(sFinalQuery,this.pagination,id_ejercicio,fecha_desde,fecha_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldosDiariosBancossFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//saldosdiariosbancosLogic.getSaldosDiariosBancossFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldosDiariosBancossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//saldosdiariosbancosLogic.getSaldosDiariosBancossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosSaldosDiariosBancos() {
		this.isPermisoTodoSaldosDiariosBancos=false;
		this.isPermisoNuevoSaldosDiariosBancos=false;
		this.isPermisoActualizarSaldosDiariosBancos=false;
		this.isPermisoActualizarOriginalSaldosDiariosBancos=false;
		this.isPermisoEliminarSaldosDiariosBancos=false;
		this.isPermisoGuardarCambiosSaldosDiariosBancos=false;
		this.isPermisoConsultaSaldosDiariosBancos=true;
		this.isPermisoBusquedaSaldosDiariosBancos=true;
		this.isPermisoReporteSaldosDiariosBancos=true;
		this.isPermisoOrdenSaldosDiariosBancos=false;		
		this.isPermisoPaginacionMedioSaldosDiariosBancos=false;		
		this.isPermisoPaginacionAltoSaldosDiariosBancos=false;		
		this.isPermisoPaginacionTodoSaldosDiariosBancos=false;		
		this.isPermisoCopiarSaldosDiariosBancos=false;		
		this.isPermisoVerFormSaldosDiariosBancos=false;		
		this.isPermisoDuplicarSaldosDiariosBancos=false;
		this.isPermisoOrdenSaldosDiariosBancos=false;
	}
	
	public void setPermisosUsuarioSaldosDiariosBancos(Boolean isPermiso) {
		this.isPermisoTodoSaldosDiariosBancos=isPermiso;
		this.isPermisoNuevoSaldosDiariosBancos=isPermiso;
		this.isPermisoActualizarSaldosDiariosBancos=isPermiso;
		this.isPermisoActualizarOriginalSaldosDiariosBancos=isPermiso;
		this.isPermisoEliminarSaldosDiariosBancos=isPermiso;
		this.isPermisoGuardarCambiosSaldosDiariosBancos=isPermiso;
		this.isPermisoConsultaSaldosDiariosBancos=isPermiso;
		this.isPermisoBusquedaSaldosDiariosBancos=isPermiso;
		this.isPermisoReporteSaldosDiariosBancos=isPermiso;
		this.isPermisoOrdenSaldosDiariosBancos=isPermiso;		
		this.isPermisoPaginacionMedioSaldosDiariosBancos=isPermiso;		
		this.isPermisoPaginacionAltoSaldosDiariosBancos=isPermiso;		
		this.isPermisoPaginacionTodoSaldosDiariosBancos=isPermiso;		
		this.isPermisoCopiarSaldosDiariosBancos=isPermiso;		
		this.isPermisoVerFormSaldosDiariosBancos=isPermiso;		
		this.isPermisoDuplicarSaldosDiariosBancos=isPermiso;
		this.isPermisoOrdenSaldosDiariosBancos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSaldosDiariosBancos(Boolean isPermiso) {
		//this.isPermisoTodoSaldosDiariosBancos=isPermiso;
		this.isPermisoNuevoSaldosDiariosBancos=isPermiso;
		this.isPermisoActualizarSaldosDiariosBancos=isPermiso;
		this.isPermisoActualizarOriginalSaldosDiariosBancos=isPermiso;
		this.isPermisoEliminarSaldosDiariosBancos=isPermiso;
		this.isPermisoGuardarCambiosSaldosDiariosBancos=isPermiso;
		//this.isPermisoConsultaSaldosDiariosBancos=isPermiso;
		//this.isPermisoBusquedaSaldosDiariosBancos=isPermiso;
		//this.isPermisoReporteSaldosDiariosBancos=isPermiso;
		//this.isPermisoOrdenSaldosDiariosBancos=isPermiso;		
		//this.isPermisoPaginacionMedioSaldosDiariosBancos=isPermiso;		
		//this.isPermisoPaginacionAltoSaldosDiariosBancos=isPermiso;		
		//this.isPermisoPaginacionTodoSaldosDiariosBancos=isPermiso;		
		//this.isPermisoCopiarSaldosDiariosBancos=isPermiso;		
		//this.isPermisoDuplicarSaldosDiariosBancos=isPermiso;
		//this.isPermisoOrdenSaldosDiariosBancos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSaldosDiariosBancosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SaldosDiariosBancosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSaldosDiariosBancos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSaldosDiariosBancosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSaldosDiariosBancosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSaldosDiariosBancosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSaldosDiariosBancosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSaldosDiariosBancos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SaldosDiariosBancosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SaldosDiariosBancosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSaldosDiariosBancos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSaldosDiariosBancos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSaldosDiariosBancos=this.isPermisoActualizarSaldosDiariosBancos;
			this.isPermisoEliminarSaldosDiariosBancos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSaldosDiariosBancos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSaldosDiariosBancos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSaldosDiariosBancos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSaldosDiariosBancos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSaldosDiariosBancos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSaldosDiariosBancos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSaldosDiariosBancos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSaldosDiariosBancos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSaldosDiariosBancos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSaldosDiariosBancos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSaldosDiariosBancos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSaldosDiariosBancos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSaldosDiariosBancos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSaldosDiariosBancos.setToolTipText(this.jTableDatosSaldosDiariosBancos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSaldosDiariosBancos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSaldosDiariosBancos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SaldosDiariosBancosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SaldosDiariosBancosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSaldosDiariosBancos() throws Exception {
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
	public void inicializarCombosForeignKeySaldosDiariosBancosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySaldosDiariosBancosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SaldosDiariosBancosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeySaldosDiariosBancos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEjercicio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.saldosdiariosbancosSessionBean==null) {
				this.saldosdiariosbancosSessionBean=new SaldosDiariosBancosSessionBean();
			}

			if(!this.saldosdiariosbancosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.saldosdiariosbancosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
	
	public void initActionsCombosTodosForeignKeySaldosDiariosBancos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySaldosDiariosBancos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySaldosDiariosBancos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySaldosDiariosBancos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySaldosDiariosBancos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySaldosDiariosBancos()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_ejercicioSaldosDiariosBancos.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySaldosDiariosBancos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySaldosDiariosBancos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSaldosDiariosBancos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySaldosDiariosBancos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySaldosDiariosBancos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySaldosDiariosBancos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_empresaSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_empresaSaldosDiariosBancos.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_empresaSaldosDiariosBancos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_ejercicioSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_ejercicioSaldosDiariosBancos.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_ejercicioSaldosDiariosBancos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public SaldosDiariosBancosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SaldosDiariosBancosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SaldosDiariosBancosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.saldosdiariosbancosSessionBean=new SaldosDiariosBancosSessionBean(); 
		this.saldosdiariosbancosConstantesFunciones=new SaldosDiariosBancosConstantesFunciones(); 
		this.saldosdiariosbancosBean=new SaldosDiariosBancos();//(this.saldosdiariosbancosConstantesFunciones); 		
		this.saldosdiariosbancosReturnGeneral=new SaldosDiariosBancosParameterReturnGeneral(); 
		
		this.saldosdiariosbancosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.saldosdiariosbancosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SaldosDiariosBancosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SaldosDiariosBancosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SaldosDiariosBancosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSaldosDiariosBancos(true);
			
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
			
			this.saldosdiariosbancosConstantesFunciones=new SaldosDiariosBancosConstantesFunciones(); 
			this.saldosdiariosbancosBean=new SaldosDiariosBancos();//this.saldosdiariosbancosConstantesFunciones); 			
			this.saldosdiariosbancosReturnGeneral=new SaldosDiariosBancosParameterReturnGeneral(); 
		
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Saldos Diarios Bancos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.saldosdiariosbancos=new SaldosDiariosBancos();
			this.saldosdiariosbancoss = new ArrayList<SaldosDiariosBancos>();
			this.saldosdiariosbancossAux = new ArrayList<SaldosDiariosBancos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic=new SaldosDiariosBancosLogic();
				this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
			}
			
			//this.saldosdiariosbancosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.saldosdiariosbancosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSaldosDiariosBancos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSaldosDiariosBancos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSaldosDiariosBancos);	
					}
					
					if(this.jInternalFrameImportacionSaldosDiariosBancos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSaldosDiariosBancos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySaldosDiariosBancos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySaldosDiariosBancos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSaldosDiariosBancos);
				this.jInternalFrameDetalleFormSaldosDiariosBancos.setVisible(false);
				this.jInternalFrameDetalleFormSaldosDiariosBancos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSaldosDiariosBancos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSaldosDiariosBancos);
					this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setVisible(false);
					this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSaldosDiariosBancos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSaldosDiariosBancos);
					this.jInternalFrameImportacionSaldosDiariosBancos.setVisible(false);
					this.jInternalFrameImportacionSaldosDiariosBancos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySaldosDiariosBancos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySaldosDiariosBancos);
					this.jInternalFrameOrderBySaldosDiariosBancos.setVisible(false);
					this.jInternalFrameOrderBySaldosDiariosBancos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSaldosDiariosBancosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SaldosDiariosBancosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.saldosdiariosbancosReturnGeneral=new SaldosDiariosBancosParameterReturnGeneral();
			
			this.saldosdiariosbancosParameterGeneral=new SaldosDiariosBancosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.saldosdiariosbancosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SaldosDiariosBancosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SaldosDiariosBancosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado(),this.saldosdiariosbancosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SaldosDiariosBancosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado(),this.saldosdiariosbancosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSaldosDiariosBancos=false;
			this.isVisibilidadCeldaDuplicarSaldosDiariosBancos=true;
			this.isVisibilidadCeldaCopiarSaldosDiariosBancos=true;
			this.isVisibilidadCeldaVerFormSaldosDiariosBancos=true;
			this.isVisibilidadCeldaOrdenSaldosDiariosBancos=true;
			this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos=false;
			this.isVisibilidadCeldaModificarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaActualizarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaEliminarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaCancelarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaGuardarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos=false;
			
			
			this.isVisibilidadBusquedaSaldosDiariosBancos=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSaldosDiariosBancos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSaldosDiariosBancos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSaldosDiariosBancos(false);
			
			this.setPermisosUsuarioSaldosDiariosBancos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado() 
				|| (this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado() && this.saldosdiariosbancosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSaldosDiariosBancosClasesRelacionadas();
			}
			
			if(this.saldosdiariosbancosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSaldosDiariosBancosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSaldosDiariosBancos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSaldosDiariosBancos();
			}
			
			if(!this.isPermisoBusquedaSaldosDiariosBancos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSaldosDiariosBancos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SaldosDiariosBancosConstantesFunciones.getTiposSeleccionarSaldosDiariosBancos());
				
				this.tiposColumnasSelect=SaldosDiariosBancosConstantesFunciones.getTiposSeleccionarSaldosDiariosBancos(true);
				
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
			//if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSaldosDiariosBancos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioSaldosDiariosBancos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioSaldosDiariosBancos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSaldosDiariosBancos() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				saldosdiariosbancosImplementable= (SaldosDiariosBancosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SaldosDiariosBancosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				saldosdiariosbancosImplementableHome= (SaldosDiariosBancosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SaldosDiariosBancosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.saldosdiariosbancoss= new ArrayList<SaldosDiariosBancos>();
			this.saldosdiariosbancossEliminados= new ArrayList<SaldosDiariosBancos>();
						
			this.isEsNuevoSaldosDiariosBancos=false;
			this.esParaAccionDesdeFormularioSaldosDiariosBancos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySaldosDiariosBancos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSaldosDiariosBancos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SaldosDiariosBancosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSaldosDiariosBancos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSaldosDiariosBancos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSaldosDiariosBancos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSaldosDiariosBancos();
			}
			
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSaldosDiariosBancos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSaldosDiariosBancos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSaldosDiariosBancos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSaldosDiariosBancos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SaldosDiariosBancos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSaldosDiariosBancos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSaldosDiariosBancos")) {
				iIndex=this.jInternalFrameDetalleFormSaldosDiariosBancos.jTabbedPaneRelacionesSaldosDiariosBancos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSaldosDiariosBancos.jTabbedPaneRelacionesSaldosDiariosBancos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSaldosDiariosBancos();	
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
	
	public void cargarCombosForeignKeySaldosDiariosBancos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySaldosDiariosBancos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySaldosDiariosBancos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySaldosDiariosBancosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySaldosDiariosBancos();
		
		this.cargarCombosFrameForeignKeySaldosDiariosBancos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySaldosDiariosBancos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySaldosDiariosBancos();
		}
	}
	
	
	
	public void jButtonNuevoSaldosDiariosBancosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.saldosdiariosbancosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
			
			
			if(jTableDatosSaldosDiariosBancos.getRowCount()>=1) {
				jTableDatosSaldosDiariosBancos.removeRowSelectionInterval(0, jTableDatosSaldosDiariosBancos.getRowCount()-1);						
			}
			
			this.isEsNuevoSaldosDiariosBancos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSaldosDiariosBancos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSaldosDiariosBancos(true);			
			//this.saldosdiariosbancos=new SaldosDiariosBancos();
			//this.saldosdiariosbancos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSaldosDiariosBancos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldosDiariosBancos() ;
			
			if(SaldosDiariosBancosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSaldosDiariosBancos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.saldosdiariosbancos);	
			this.actualizarInformacion("INFO_PADRE",false,this.saldosdiariosbancos);				
			
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
			
			if(this.saldosdiariosbancosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SaldosDiariosBancos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSaldosDiariosBancosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SaldosDiariosBancos> saldosdiariosbancossSeleccionados=new ArrayList<SaldosDiariosBancos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSaldosDiariosBancos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSaldosDiariosBancos.getSelectedRows().length;			
			}
			
			saldosdiariosbancossSeleccionados=this.getSaldosDiariosBancossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSaldosDiariosBancos--;			
				//SaldosDiariosBancos saldosdiariosbancosAux= new SaldosDiariosBancos();			
				//saldosdiariosbancosAux.setId(this.iIdNuevoSaldosDiariosBancos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SaldosDiariosBancos saldosdiariosbancosOrigen=new SaldosDiariosBancos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SaldosDiariosBancos saldosdiariosbancosOrigen : saldosdiariosbancossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							saldosdiariosbancosOrigen =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldosdiariosbancosOrigen =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSaldosDiariosBancos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.saldosdiariosbancos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSaldosDiariosBancos(saldosdiariosbancosOrigen,this.saldosdiariosbancos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().add(this.saldosdiariosbancosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancoss.add(this.saldosdiariosbancosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSaldosDiariosBancos(false);
				
				this.jTableDatosSaldosDiariosBancos.setRowSelectionInterval(this.getIndiceNuevoSaldosDiariosBancos(), this.getIndiceNuevoSaldosDiariosBancos());
				
				int iLastRow =  this.jTableDatosSaldosDiariosBancos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSaldosDiariosBancos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSaldosDiariosBancos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSaldosDiariosBancos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SaldosDiariosBancos> saldosdiariosbancossSeleccionados=new ArrayList<SaldosDiariosBancos>();									
		
			SaldosDiariosBancos saldosdiariosbancosOrigen=new SaldosDiariosBancos();
			SaldosDiariosBancos saldosdiariosbancosDestino=new SaldosDiariosBancos();
				
			saldosdiariosbancossSeleccionados=this.getSaldosDiariosBancossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSaldosDiariosBancos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || saldosdiariosbancossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSaldosDiariosBancos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						saldosdiariosbancosOrigen =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						saldosdiariosbancosOrigen =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						saldosdiariosbancosDestino =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						saldosdiariosbancosDestino =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				saldosdiariosbancosOrigen =saldosdiariosbancossSeleccionados.get(0);
				saldosdiariosbancosDestino =saldosdiariosbancossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSaldosDiariosBancos(saldosdiariosbancosOrigen,saldosdiariosbancosDestino,true,false);
				
				saldosdiariosbancosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(saldosdiariosbancosDestino,saldosdiariosbancosLogic.getSaldosDiariosBancoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(saldosdiariosbancosDestino,saldosdiariosbancoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSaldosDiariosBancos(false);
				
				//this.jTableDatosSaldosDiariosBancos.setRowSelectionInterval(this.getIndiceNuevoSaldosDiariosBancos(), this.getIndiceNuevoSaldosDiariosBancos());
				
				int iLastRow =  this.jTableDatosSaldosDiariosBancos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSaldosDiariosBancos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSaldosDiariosBancos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSaldosDiariosBancos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSaldosDiariosBancos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSaldosDiariosBancos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSaldosDiariosBancos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSaldosDiariosBancos.setVisible(!isVisible);
			this.jPanelPaginacionSaldosDiariosBancos.setVisible(!isVisible);
			this.jPanelAccionesSaldosDiariosBancos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSaldosDiariosBancos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSaldosDiariosBancos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSaldosDiariosBancos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySaldosDiariosBancos();
			
			this.abrirFrameOrderBySaldosDiariosBancos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySaldosDiariosBancos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSaldosDiariosBancos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSaldosDiariosBancos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSaldosDiariosBancos.isMaximum()) {
					this.jInternalFrameDetalleFormSaldosDiariosBancos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSaldosDiariosBancos.setSize(this.jInternalFrameDetalleFormSaldosDiariosBancos.iWidthFormulario,this.jInternalFrameDetalleFormSaldosDiariosBancos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSaldosDiariosBancos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSaldosDiariosBancos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSaldosDiariosBancos.isMaximum()) {
						this.jInternalFrameDetalleFormSaldosDiariosBancos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSaldosDiariosBancos.jContentPaneDetalleSaldosDiariosBancos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSaldosDiariosBancos.jTabbedPaneRelacionesSaldosDiariosBancos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSaldosDiariosBancos.jContentPaneDetalleSaldosDiariosBancos.getWidth(),SaldosDiariosBancosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSaldosDiariosBancos.jTabbedPaneRelacionesSaldosDiariosBancos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSaldosDiariosBancos.jContentPaneDetalleSaldosDiariosBancos.getWidth(),SaldosDiariosBancosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSaldosDiariosBancos.jTabbedPaneRelacionesSaldosDiariosBancos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSaldosDiariosBancos.jContentPaneDetalleSaldosDiariosBancos.getWidth(),SaldosDiariosBancosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSaldosDiariosBancos.setVisible(true);
	        this.jInternalFrameDetalleFormSaldosDiariosBancos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySaldosDiariosBancos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySaldosDiariosBancos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySaldosDiariosBancos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldosDiariosBancos,false,this);
				} else {
					this.jInternalFrameOrderBySaldosDiariosBancos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldosDiariosBancos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySaldosDiariosBancos);
				this.jInternalFrameOrderBySaldosDiariosBancos.setVisible(false);
				this.jInternalFrameOrderBySaldosDiariosBancos.setSelected(false);
				
				this.jInternalFrameOrderBySaldosDiariosBancos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySaldosDiariosBancos"));
				
				this.inicializarActualizarBindingTablaOrderBySaldosDiariosBancos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSaldosDiariosBancos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSaldosDiariosBancos==null) {
				
				this.jInternalFrameImportacionSaldosDiariosBancos=new ImportacionJInternalFrame(SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSaldosDiariosBancos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSaldosDiariosBancos);
				this.jInternalFrameImportacionSaldosDiariosBancos.setVisible(false);
				this.jInternalFrameImportacionSaldosDiariosBancos.setSelected(false);


				this.jInternalFrameImportacionSaldosDiariosBancos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSaldosDiariosBancos"));
				this.jInternalFrameImportacionSaldosDiariosBancos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSaldosDiariosBancos"));
				this.jInternalFrameImportacionSaldosDiariosBancos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSaldosDiariosBancos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSaldosDiariosBancos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSaldosDiariosBancos==null) {
				this.jInternalFrameReporteDinamicoSaldosDiariosBancos=new ReporteDinamicoJInternalFrame(SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSaldosDiariosBancos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSaldosDiariosBancos);
				this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setVisible(false);
				this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSaldosDiariosBancos"));
				this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSaldosDiariosBancos"));
				this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSaldosDiariosBancos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSaldosDiariosBancos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSaldosDiariosBancos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSaldosDiariosBancos);
			
	       	this.jInternalFrameDetalleFormSaldosDiariosBancos.setVisible(false);
	        this.jInternalFrameDetalleFormSaldosDiariosBancos.setSelected(false);
			
			//this.jInternalFrameDetalleFormSaldosDiariosBancos.dispose();
			//this.jInternalFrameDetalleFormSaldosDiariosBancos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSaldosDiariosBancos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setVisible(true);
	        this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSaldosDiariosBancos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSaldosDiariosBancos.setVisible(true);
	        this.jInternalFrameImportacionSaldosDiariosBancos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySaldosDiariosBancos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySaldosDiariosBancos.setVisible(true);
	        this.jInternalFrameOrderBySaldosDiariosBancos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySaldosDiariosBancos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySaldosDiariosBancos.setVisible(false);
	        this.jInternalFrameOrderBySaldosDiariosBancos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSaldosDiariosBancos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setVisible(false);
	        this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSaldosDiariosBancos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSaldosDiariosBancos.setVisible(false);
	        this.jInternalFrameImportacionSaldosDiariosBancos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSaldosDiariosBancos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSaldosDiariosBancos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSaldosDiariosBancos(true);
			//this.isEsNuevoSaldosDiariosBancos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSaldosDiariosBancos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSaldosDiariosBancos(false) ;
			
			if(saldosdiariosbancosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SaldosDiariosBancosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSaldosDiariosBancos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldosDiariosBancos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSaldosDiariosBancosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSaldosDiariosBancos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSaldosDiariosBancos(true);
			//this.isEsNuevoSaldosDiariosBancos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.saldosdiariosbancos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSaldosDiariosBancos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSaldosDiariosBancos(false) ;
			
			if(SaldosDiariosBancosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSaldosDiariosBancos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldosDiariosBancos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSaldosDiariosBancos(false);
			
			//if(!this.isEsNuevoSaldosDiariosBancos) {								
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				
			}
			
			if(this.permiteMantenimiento(this.saldosdiariosbancos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSaldosDiariosBancos=true;
					this.inicializarActualizarBindingTablaSaldosDiariosBancos(false);
					this.isEsNuevoSaldosDiariosBancos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSaldosDiariosBancos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSaldosDiariosBancos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSaldosDiariosBancos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSaldosDiariosBancos(false);
				
				this.habilitarDeshabilitarControlesSaldosDiariosBancos(false);
			
												
				
				if(SaldosDiariosBancosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSaldosDiariosBancos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSaldosDiariosBancosActionPerformed(evt,saldosdiariosbancosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSaldosDiariosBancos(this.saldosdiariosbancos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSaldosDiariosBancos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,saldosdiariosbancosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.saldosdiariosbancos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SaldosDiariosBancos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosDiariosBancos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				this.saldosdiariosbancos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				this.saldosdiariosbancos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.saldosdiariosbancos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SaldosDiariosBancosModel) this.jTableDatosSaldosDiariosBancos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSaldosDiariosBancos=true;
				this.inicializarActualizarBindingTablaSaldosDiariosBancos(false);
				this.isEsNuevoSaldosDiariosBancos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSaldosDiariosBancos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSaldosDiariosBancos(false);
				
				this.habilitarDeshabilitarControlesSaldosDiariosBancos(false);
				
				
				
				if(SaldosDiariosBancosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSaldosDiariosBancos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSaldosDiariosBancos.getRowCount()>=1) {
				jTableDatosSaldosDiariosBancos.removeRowSelectionInterval(0, jTableDatosSaldosDiariosBancos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSaldosDiariosBancos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSaldosDiariosBancos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSaldosDiariosBancos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldosDiariosBancos(false) ;
			
			this.isEsNuevoSaldosDiariosBancos=false;
			
			if(SaldosDiariosBancosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSaldosDiariosBancos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSaldosDiariosBancos(false);
				
				//SI ES MANUAL
				if(SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSaldosDiariosBancos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSaldosDiariosBancos--;			
			//SaldosDiariosBancos saldosdiariosbancosAux= new SaldosDiariosBancos();			
			//saldosdiariosbancosAux.setId(this.iIdNuevoSaldosDiariosBancos);
			
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSaldosDiariosBancos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
			
			this.saldosdiariosbancos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().add(this.saldosdiariosbancosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.saldosdiariosbancoss.add(this.saldosdiariosbancosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSaldosDiariosBancos(false);
			
			this.jTableDatosSaldosDiariosBancos.setRowSelectionInterval(this.getIndiceNuevoSaldosDiariosBancos(), this.getIndiceNuevoSaldosDiariosBancos());
			
			int iLastRow =  this.jTableDatosSaldosDiariosBancos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSaldosDiariosBancos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSaldosDiariosBancos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSaldosDiariosBancos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSaldosDiariosBancos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldosDiariosBancos(false);
			
			//SI ES MANUAL
			if(SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSaldosDiariosBancos();
			}
			
			//this.abrirFrameTreeSaldosDiariosBancos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSaldosDiariosBancos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSaldosDiariosBancos.setFileImportacion(this.jInternalFrameImportacionSaldosDiariosBancos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSaldosDiariosBancos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSaldosDiariosBancos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSaldosDiariosBancos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSaldosDiariosBancos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SaldosDiariosBancos> saldosdiariosbancossSeleccionados=new ArrayList<SaldosDiariosBancos>();		

		saldosdiariosbancossSeleccionados=this.getSaldosDiariosBancossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SaldosDiariosBancosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SaldosDiariosBancosBaseDesign.jrxml";
			
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
			
			this.generarReporteSaldosDiariosBancoss("Todos",saldosdiariosbancossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Diarios Bancos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCuenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBanco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBanco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBanco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBanco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCuenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreMoneda_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreMoneda_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreMoneda_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreMoneda_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_SALDOANTERIOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldoAnterior_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldoAnterior_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldoAnterior_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldoAnterior_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_DEPOSITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_posito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_posito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_posito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_posito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NC:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col__col", "");
						sXmlStringFile=sXmlStringFile.replace("col__col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho__colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx__colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_CHGIRADOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Girados_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Girados_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Girados_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Girados_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_ND:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col__col", "");
						sXmlStringFile=sXmlStringFile.replace("col__col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho__colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx__colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ocedencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ocedencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ocedencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ocedencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stino_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stino_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stino_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stino_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA:
					sNombreCampoCategoria="codigo_cuenta";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO:
					sNombreCampoCategoria="nombre_banco";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA:
					sNombreCampoCategoria="numero_cuenta";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA:
					sNombreCampoCategoria="nombre_moneda";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_SALDOANTERIOR:
					sNombreCampoCategoria="saldo_anterior";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_DEPOSITO:
					sNombreCampoCategoria="deposito";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NC:
					sNombreCampoCategoria="nc";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_CHGIRADOS:
					sNombreCampoCategoria="ch_girados";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_ND:
					sNombreCampoCategoria="nd";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA:
					sNombreCampoCategoria="procedencia";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO:
					sNombreCampoCategoria="destino";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA:
					sNombreCampoCategoriaValor="codigo_cuenta";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO:
					sNombreCampoCategoriaValor="nombre_banco";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA:
					sNombreCampoCategoriaValor="numero_cuenta";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA:
					sNombreCampoCategoriaValor="nombre_moneda";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_SALDOANTERIOR:
					sNombreCampoCategoriaValor="saldo_anterior";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_DEPOSITO:
					sNombreCampoCategoriaValor="deposito";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NC:
					sNombreCampoCategoriaValor="nc";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_CHGIRADOS:
					sNombreCampoCategoriaValor="ch_girados";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_ND:
					sNombreCampoCategoriaValor="nd";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA:
					sNombreCampoCategoriaValor="procedencia";
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO:
					sNombreCampoCategoriaValor="destino";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cuenta");
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_banco");
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cuenta");
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Moneda",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_moneda");
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_SALDOANTERIOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo Anterior",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo_anterior");
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_DEPOSITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Deposito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"deposito");
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nc");
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_CHGIRADOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ch Girados",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ch_girados");
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_ND:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nd",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nd");
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Procedencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"procedencia");
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Destino",sNombreCampoCategoria,sNombreCampoCategoriaValor,"destino");
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
	
	public void jButtonGenerarExcelReporteDinamicoSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SaldosDiariosBancos> saldosdiariosbancossSeleccionados=new ArrayList<SaldosDiariosBancos>();		
		
		saldosdiariosbancossSeleccionados=this.getSaldosDiariosBancossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldosdiariosbancos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SaldosDiariosBancoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SaldosDiariosBancosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosdiariosbancos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosdiariosbancos.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosdiariosbancos.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosdiariosbancos.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA);
					iRow++;

					for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosdiariosbancos.getcodigo_cuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO);
					iRow++;

					for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosdiariosbancos.getnombre_banco());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA);
					iRow++;

					for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosdiariosbancos.getnumero_cuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA);
					iRow++;

					for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosdiariosbancos.getnombre_moneda());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_SALDOANTERIOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_SALDOANTERIOR);
					iRow++;

					for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosdiariosbancos.getsaldo_anterior());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_DEPOSITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_DEPOSITO);
					iRow++;

					for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosdiariosbancos.getdeposito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_NC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_NC);
					iRow++;

					for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosdiariosbancos.getnc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_CHGIRADOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_CHGIRADOS);
					iRow++;

					for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosdiariosbancos.getch_girados());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_ND:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_ND);
					iRow++;

					for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosdiariosbancos.getnd());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA);
					iRow++;

					for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosdiariosbancos.getprocedencia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO);
					iRow++;

					for(SaldosDiariosBancos saldosdiariosbancos:saldosdiariosbancossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldosdiariosbancos.getdestino());
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
			//	this.getFilaCabeceraExportarExcelSaldosDiariosBancos(row);				
			//	iRow++;
			//}				
			
			//for(SaldosDiariosBancos saldosdiariosbancosAux:saldosdiariosbancossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSaldosDiariosBancos(saldosdiariosbancosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Diarios Bancos",JOptionPane.INFORMATION_MESSAGE);
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
				this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldosDiariosBancos(false);
			
			//SI ES MANUAL
			if(SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSaldosDiariosBancos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldosDiariosBancos(false);
			
			//SI ES MANUAL
			if(SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSaldosDiariosBancos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldosDiariosBancos(false);
			
			//SI ES MANUAL
			if(SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSaldosDiariosBancos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSaldosDiariosBancos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSaldosDiariosBancos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSaldosDiariosBancos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSaldosDiariosBancos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSaldosDiariosBancos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSaldosDiariosBancos.setMinimumSize(dimensionMinimum);
		this.jTableDatosSaldosDiariosBancos.setMaximumSize(dimensionMaximum);
		this.jTableDatosSaldosDiariosBancos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSaldosDiariosBancos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSaldosDiariosBancos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSaldosDiariosBancos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSaldosDiariosBancos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSaldosDiariosBancos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSaldosDiariosBancos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSaldosDiariosBancos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSaldosDiariosBancos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSaldosDiariosBancos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSaldosDiariosBancos();
		
		this.inicializarActualizarBindingBotonesManualSaldosDiariosBancos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSaldosDiariosBancos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSaldosDiariosBancos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSaldosDiariosBancos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSaldosDiariosBancos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSaldosDiariosBancos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSaldosDiariosBancos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSaldosDiariosBancos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSaldosDiariosBancos.jCheckBoxPostAccionNuevoSaldosDiariosBancos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSaldosDiariosBancos.jCheckBoxPostAccionSinCerrarSaldosDiariosBancos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSaldosDiariosBancos.jCheckBoxPostAccionSinMensajeSaldosDiariosBancos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSaldosDiariosBancos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSaldosDiariosBancos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSaldosDiariosBancos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
				this.jInternalFrameDetalleFormSaldosDiariosBancos.jCheckBoxPostAccionNuevoSaldosDiariosBancos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSaldosDiariosBancos.jCheckBoxPostAccionSinCerrarSaldosDiariosBancos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSaldosDiariosBancos.jCheckBoxPostAccionSinMensajeSaldosDiariosBancos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSaldosDiariosBancos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSaldosDiariosBancos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSaldosDiariosBancos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSaldosDiariosBancos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSaldosDiariosBancos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSaldosDiariosBancos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSaldosDiariosBancos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSaldosDiariosBancos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSaldosDiariosBancos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSaldosDiariosBancos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSaldosDiariosBancos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSaldosDiariosBancos(Boolean esInicializar) throws Exception {
		try	{	
			if(SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSaldosDiariosBancos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSaldosDiariosBancos() throws Exception {
		try	{
			if(SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSaldosDiariosBancos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSaldosDiariosBancos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSaldosDiariosBancos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSaldosDiariosBancos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSaldosDiariosBancos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSaldosDiariosBancos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSaldosDiariosBancos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSaldosDiariosBancos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSaldosDiariosBancos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSaldosDiariosBancos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSaldosDiariosBancos.addItem(reporte);
			}
			
			
			if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSaldosDiariosBancos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSaldosDiariosBancos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSaldosDiariosBancos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSaldosDiariosBancos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSaldosDiariosBancos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSaldosDiariosBancos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSaldosDiariosBancos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSaldosDiariosBancos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSaldosDiariosBancos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSaldosDiariosBancos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSaldosDiariosBancos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSaldosDiariosBancos!=null) {
				this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSaldosDiariosBancos!=null) {
				this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSaldosDiariosBancos!=null) {
				
				if(this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=SaldosDiariosBancosConstantesFunciones.getTiposSeleccionarSaldosDiariosBancos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=SaldosDiariosBancosConstantesFunciones.getTiposSeleccionarSaldosDiariosBancos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=SaldosDiariosBancosConstantesFunciones.getTiposSeleccionarSaldosDiariosBancos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSaldosDiariosBancos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.getSelectedItem()!=null){this.id_ejercicioBusquedaSaldosDiariosBancos=((Ejercicio)this.jComboBoxid_ejercicioBusquedaSaldosDiariosBancosSaldosDiariosBancos.getSelectedItem()).getId();}
		this.fecha_desdeBusquedaSaldosDiariosBancos=new Date(this.jDateChooserfecha_desdeBusquedaSaldosDiariosBancosSaldosDiariosBancos.getDate().getTime());
		this.fecha_hastaBusquedaSaldosDiariosBancos=new Date(this.jDateChooserfecha_hastaBusquedaSaldosDiariosBancosSaldosDiariosBancos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSaldosDiariosBancos(Boolean esInicializar) throws Exception {				
		if(SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSaldosDiariosBancos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSaldosDiariosBancos() throws Exception {
		this.inicializarActualizarBindingTablaSaldosDiariosBancos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySaldosDiariosBancos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySaldosDiariosBancos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySaldosDiariosBancos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySaldosDiariosBancos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SaldosDiariosBancosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySaldosDiariosBancos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySaldosDiariosBancos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SaldosDiariosBancosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSaldosDiariosBancosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosDiariosBancosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SaldosDiariosBancosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySaldosDiariosBancos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySaldosDiariosBancos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SaldosDiariosBancosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySaldosDiariosBancos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSaldosDiariosBancos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=saldosdiariosbancosLogic.getSaldosDiariosBancoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=saldosdiariosbancoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSaldosDiariosBancos.setModel(new SaldosDiariosBancosModel(this.saldosdiariosbancosLogic.getSaldosDiariosBancoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSaldosDiariosBancos.setModel(new SaldosDiariosBancosModel(this.saldosdiariosbancoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySaldosDiariosBancos!=null && this.jInternalFrameOrderBySaldosDiariosBancos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySaldosDiariosBancos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosDiariosBancos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SaldosDiariosBancosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO,saldosdiariosbancosConstantesFunciones.resaltarSeleccionarSaldosDiariosBancos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO,saldosdiariosbancosConstantesFunciones.resaltarSeleccionarSaldosDiariosBancos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosDiariosBancos,SaldosDiariosBancosConstantesFunciones.LABEL_ID));

		if(this.saldosdiariosbancosConstantesFunciones.mostraridSaldosDiariosBancos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosDiariosBancosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldosdiariosbancosConstantesFunciones.resaltaridSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activaridSaldosDiariosBancos,iSizeTabla,this,true,"idSaldosDiariosBancos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosdiariosbancosConstantesFunciones.resaltaridSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activaridSaldosDiariosBancos,this,true,"idSaldosDiariosBancos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosDiariosBancos,SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA));

		if(this.saldosdiariosbancosConstantesFunciones.mostrarcodigo_cuentaSaldosDiariosBancos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarcodigo_cuentaSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarcodigo_cuentaSaldosDiariosBancos,iSizeTabla,this,true,"codigo_cuentaSaldosDiariosBancos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarcodigo_cuentaSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarcodigo_cuentaSaldosDiariosBancos,this,true,"codigo_cuentaSaldosDiariosBancos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldosDiariosBancosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosDiariosBancos,SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO));

		if(this.saldosdiariosbancosConstantesFunciones.mostrarnombre_bancoSaldosDiariosBancos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarnombre_bancoSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarnombre_bancoSaldosDiariosBancos,iSizeTabla,this,true,"nombre_bancoSaldosDiariosBancos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarnombre_bancoSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarnombre_bancoSaldosDiariosBancos,this,true,"nombre_bancoSaldosDiariosBancos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldosDiariosBancosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosDiariosBancos,SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA));

		if(this.saldosdiariosbancosConstantesFunciones.mostrarnumero_cuentaSaldosDiariosBancos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarnumero_cuentaSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarnumero_cuentaSaldosDiariosBancos,iSizeTabla,this,true,"numero_cuentaSaldosDiariosBancos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarnumero_cuentaSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarnumero_cuentaSaldosDiariosBancos,this,true,"numero_cuentaSaldosDiariosBancos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldosDiariosBancosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosDiariosBancos,SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA));

		if(this.saldosdiariosbancosConstantesFunciones.mostrarnombre_monedaSaldosDiariosBancos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarnombre_monedaSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarnombre_monedaSaldosDiariosBancos,iSizeTabla,this,true,"nombre_monedaSaldosDiariosBancos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarnombre_monedaSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarnombre_monedaSaldosDiariosBancos,this,true,"nombre_monedaSaldosDiariosBancos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldosDiariosBancosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosDiariosBancos,SaldosDiariosBancosConstantesFunciones.LABEL_SALDOANTERIOR));

		if(this.saldosdiariosbancosConstantesFunciones.mostrarsaldo_anteriorSaldosDiariosBancos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosDiariosBancosConstantesFunciones.LABEL_SALDOANTERIOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarsaldo_anteriorSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarsaldo_anteriorSaldosDiariosBancos,iSizeTabla,this,true,"saldo_anteriorSaldosDiariosBancos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarsaldo_anteriorSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarsaldo_anteriorSaldosDiariosBancos,this,true,"saldo_anteriorSaldosDiariosBancos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldosDiariosBancosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosDiariosBancos,SaldosDiariosBancosConstantesFunciones.LABEL_DEPOSITO));

		if(this.saldosdiariosbancosConstantesFunciones.mostrardepositoSaldosDiariosBancos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosDiariosBancosConstantesFunciones.LABEL_DEPOSITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldosdiariosbancosConstantesFunciones.resaltardepositoSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activardepositoSaldosDiariosBancos,iSizeTabla,this,true,"depositoSaldosDiariosBancos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosdiariosbancosConstantesFunciones.resaltardepositoSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activardepositoSaldosDiariosBancos,this,true,"depositoSaldosDiariosBancos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldosDiariosBancosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosDiariosBancos,SaldosDiariosBancosConstantesFunciones.LABEL_NC));

		if(this.saldosdiariosbancosConstantesFunciones.mostrarncSaldosDiariosBancos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosDiariosBancosConstantesFunciones.LABEL_NC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarncSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarncSaldosDiariosBancos,iSizeTabla,this,true,"ncSaldosDiariosBancos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarncSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarncSaldosDiariosBancos,this,true,"ncSaldosDiariosBancos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldosDiariosBancosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosDiariosBancos,SaldosDiariosBancosConstantesFunciones.LABEL_CHGIRADOS));

		if(this.saldosdiariosbancosConstantesFunciones.mostrarch_giradosSaldosDiariosBancos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosDiariosBancosConstantesFunciones.LABEL_CHGIRADOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarch_giradosSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarch_giradosSaldosDiariosBancos,iSizeTabla,this,true,"ch_giradosSaldosDiariosBancos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarch_giradosSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarch_giradosSaldosDiariosBancos,this,true,"ch_giradosSaldosDiariosBancos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldosDiariosBancosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosDiariosBancos,SaldosDiariosBancosConstantesFunciones.LABEL_ND));

		if(this.saldosdiariosbancosConstantesFunciones.mostrarndSaldosDiariosBancos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosDiariosBancosConstantesFunciones.LABEL_ND,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarndSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarndSaldosDiariosBancos,iSizeTabla,this,true,"ndSaldosDiariosBancos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarndSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarndSaldosDiariosBancos,this,true,"ndSaldosDiariosBancos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldosDiariosBancosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosDiariosBancos,SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA));

		if(this.saldosdiariosbancosConstantesFunciones.mostrarprocedenciaSaldosDiariosBancos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarprocedenciaSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarprocedenciaSaldosDiariosBancos,iSizeTabla,this,true,"procedenciaSaldosDiariosBancos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosdiariosbancosConstantesFunciones.resaltarprocedenciaSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activarprocedenciaSaldosDiariosBancos,this,true,"procedenciaSaldosDiariosBancos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldosDiariosBancosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosDiariosBancos,SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO));

		if(this.saldosdiariosbancosConstantesFunciones.mostrardestinoSaldosDiariosBancos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.saldosdiariosbancosConstantesFunciones.resaltardestinoSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activardestinoSaldosDiariosBancos,iSizeTabla,this,true,"destinoSaldosDiariosBancos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldosdiariosbancosConstantesFunciones.resaltardestinoSaldosDiariosBancos,this.saldosdiariosbancosConstantesFunciones.activardestinoSaldosDiariosBancos,this,true,"destinoSaldosDiariosBancos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldosDiariosBancosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSaldosDiariosBancos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSaldosDiariosBancos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSaldosDiariosBancos && this.isPermisoGuardarCambiosSaldosDiariosBancos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSaldosDiariosBancos.addColumn(tableColumn);
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
			
			this.jTableDatosSaldosDiariosBancos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSaldosDiariosBancos && this.isPermisoGuardarCambiosSaldosDiariosBancos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSaldosDiariosBancos && this.isPermisoGuardarCambiosSaldosDiariosBancos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSaldosDiariosBancos.moveColumn(this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSaldosDiariosBancos.moveColumn(this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSaldosDiariosBancos.moveColumn(this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSaldosDiariosBancos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSaldosDiariosBancos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSaldosDiariosBancos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSaldosDiariosBancos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSaldosDiariosBancos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSaldosDiariosBancos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=saldosdiariosbancosLogic.getSaldosDiariosBancoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=saldosdiariosbancoss.size()-1;
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
		//this.jTableDatosSaldosDiariosBancos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSaldosDiariosBancos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSaldosDiariosBancos();
			
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
				
				//this.isEsNuevoSaldosDiariosBancos=false;
					
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
			
				if(this.saldosdiariosbancosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSaldosDiariosBancos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSaldosDiariosBancos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSaldosDiariosBancos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.saldosdiariosbancos.getsType().equals("DUPLICADO")
				   || this.saldosdiariosbancos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSaldosDiariosBancos=true;
				
				} else {
					this.isEsNuevoSaldosDiariosBancos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
					if(this.saldosdiariosbancos.getId()>=0 && !this.saldosdiariosbancos.getIsNew()) {						
						this.isEsNuevoSaldosDiariosBancos=false;
						
					} else {
						this.isEsNuevoSaldosDiariosBancos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSaldosDiariosBancos(esRelaciones);						
				
				this.seleccionarSaldosDiariosBancos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.saldosdiariosbancos.getId()<0) {
					this.isEsNuevoSaldosDiariosBancos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSaldosDiariosBancos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSaldosDiariosBancos(evt,rowIndex);
				}	
				
				if(this.saldosdiariosbancosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SaldosDiariosBancos: " + this.dDif); 
					}
				}								
				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSaldosDiariosBancos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.saldosdiariosbancos)) {
					if(this.saldosdiariosbancos.getId()>0) {
						this.saldosdiariosbancos.setIsDeleted(true);
						
						this.saldosdiariosbancossEliminados.add(this.saldosdiariosbancos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().remove(this.saldosdiariosbancos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancoss.remove(this.saldosdiariosbancos);				
					}
					
					
					((SaldosDiariosBancosModel) this.jTableDatosSaldosDiariosBancos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSaldosDiariosBancos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSaldosDiariosBancos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSaldosDiariosBancos) {
			
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSaldosDiariosBancos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSaldosDiariosBancos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSaldosDiariosBancos(this.saldosdiariosbancos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSaldosDiariosBancos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSaldosDiariosBancos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSaldosDiariosBancos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSaldosDiariosBancos(saldosdiariosbancos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSaldosDiariosBancos(saldosdiariosbancos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySaldosDiariosBancos(saldosdiariosbancos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySaldosDiariosBancos(saldosdiariosbancos);
	}
	
	public void setVariablesObjetoActualToFormularioSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelidSaldosDiariosBancos.setText(saldosdiariosbancos.getId().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldcodigo_cuentaSaldosDiariosBancos.setText(saldosdiariosbancos.getcodigo_cuenta());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreanombre_bancoSaldosDiariosBancos.setText(saldosdiariosbancos.getnombre_banco());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldnumero_cuentaSaldosDiariosBancos.setText(saldosdiariosbancos.getnumero_cuenta());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldnombre_monedaSaldosDiariosBancos.setText(saldosdiariosbancos.getnombre_moneda());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldsaldo_anteriorSaldosDiariosBancos.setText(saldosdiariosbancos.getsaldo_anterior().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFielddepositoSaldosDiariosBancos.setText(saldosdiariosbancos.getdeposito().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldncSaldosDiariosBancos.setText(saldosdiariosbancos.getnc().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldch_giradosSaldosDiariosBancos.setText(saldosdiariosbancos.getch_girados().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldndSaldosDiariosBancos.setText(saldosdiariosbancos.getnd().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreaprocedenciaSaldosDiariosBancos.setText(saldosdiariosbancos.getprocedencia());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreadestinoSaldosDiariosBancos.setText(saldosdiariosbancos.getdestino());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SaldosDiariosBancos saldosdiariosbancosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,saldosdiariosbancosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SaldosDiariosBancos saldosdiariosbancosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				saldosdiariosbancosLocal=this.saldosdiariosbancos;
			} else {
				saldosdiariosbancosLocal=this.saldosdiariosbancosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(saldosdiariosbancosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSaldosDiariosBancos(saldosdiariosbancosLocal,true);
					
					if(saldosdiariosbancosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(saldosdiariosbancosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(saldosdiariosbancosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(saldosdiariosbancos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(saldosdiariosbancos);
	}
	
	public void setVariablesFormularioToObjetoActualSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(saldosdiariosbancos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelidSaldosDiariosBancos.getText()==null || this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelidSaldosDiariosBancos.getText()=="" || this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelidSaldosDiariosBancos.getText()=="Id") {
				this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelidSaldosDiariosBancos.setText("0");
			}

			if(conColumnasBase) {saldosdiariosbancos.setId(Long.parseLong(this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelidSaldosDiariosBancos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosDiariosBancosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelIdSaldosDiariosBancos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosdiariosbancos.setcodigo_cuenta(this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldcodigo_cuentaSaldosDiariosBancos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelcodigo_cuentaSaldosDiariosBancos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosdiariosbancos.setnombre_banco(this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreanombre_bancoSaldosDiariosBancos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelnombre_bancoSaldosDiariosBancos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosdiariosbancos.setnumero_cuenta(this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldnumero_cuentaSaldosDiariosBancos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelnumero_cuentaSaldosDiariosBancos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosdiariosbancos.setnombre_moneda(this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldnombre_monedaSaldosDiariosBancos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelnombre_monedaSaldosDiariosBancos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosdiariosbancos.setsaldo_anterior(Double.parseDouble(this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldsaldo_anteriorSaldosDiariosBancos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosDiariosBancosConstantesFunciones.LABEL_SALDOANTERIOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelsaldo_anteriorSaldosDiariosBancos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosdiariosbancos.setdeposito(Double.parseDouble(this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFielddepositoSaldosDiariosBancos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosDiariosBancosConstantesFunciones.LABEL_DEPOSITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabeldepositoSaldosDiariosBancos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosdiariosbancos.setnc(Double.parseDouble(this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldncSaldosDiariosBancos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosDiariosBancosConstantesFunciones.LABEL_NC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelncSaldosDiariosBancos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosdiariosbancos.setch_girados(Double.parseDouble(this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldch_giradosSaldosDiariosBancos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosDiariosBancosConstantesFunciones.LABEL_CHGIRADOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelch_giradosSaldosDiariosBancos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosdiariosbancos.setnd(Double.parseDouble(this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldndSaldosDiariosBancos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosDiariosBancosConstantesFunciones.LABEL_ND+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelndSaldosDiariosBancos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosdiariosbancos.setprocedencia(this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreaprocedenciaSaldosDiariosBancos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelprocedenciaSaldosDiariosBancos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldosdiariosbancos.setdestino(this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreadestinoSaldosDiariosBancos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabeldestinoSaldosDiariosBancos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancosBean,SaldosDiariosBancos saldosdiariosbancos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancosOrigen,SaldosDiariosBancos saldosdiariosbancos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && saldosdiariosbancosOrigen.getId()!=null && !saldosdiariosbancosOrigen.getId().equals(0L))) {saldosdiariosbancos.setId(saldosdiariosbancosOrigen.getId());}}
			if(conDefault || (!conDefault && saldosdiariosbancosOrigen.getfecha_desde()!=null && !saldosdiariosbancosOrigen.getfecha_desde().equals(new Date()))) {saldosdiariosbancos.setfecha_desde(saldosdiariosbancosOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && saldosdiariosbancosOrigen.getfecha_hasta()!=null && !saldosdiariosbancosOrigen.getfecha_hasta().equals(new Date()))) {saldosdiariosbancos.setfecha_hasta(saldosdiariosbancosOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && saldosdiariosbancosOrigen.getcodigo_cuenta()!=null && !saldosdiariosbancosOrigen.getcodigo_cuenta().equals(""))) {saldosdiariosbancos.setcodigo_cuenta(saldosdiariosbancosOrigen.getcodigo_cuenta());}
			if(conDefault || (!conDefault && saldosdiariosbancosOrigen.getnombre_banco()!=null && !saldosdiariosbancosOrigen.getnombre_banco().equals(""))) {saldosdiariosbancos.setnombre_banco(saldosdiariosbancosOrigen.getnombre_banco());}
			if(conDefault || (!conDefault && saldosdiariosbancosOrigen.getnumero_cuenta()!=null && !saldosdiariosbancosOrigen.getnumero_cuenta().equals(""))) {saldosdiariosbancos.setnumero_cuenta(saldosdiariosbancosOrigen.getnumero_cuenta());}
			if(conDefault || (!conDefault && saldosdiariosbancosOrigen.getnombre_moneda()!=null && !saldosdiariosbancosOrigen.getnombre_moneda().equals(""))) {saldosdiariosbancos.setnombre_moneda(saldosdiariosbancosOrigen.getnombre_moneda());}
			if(conDefault || (!conDefault && saldosdiariosbancosOrigen.getsaldo_anterior()!=null && !saldosdiariosbancosOrigen.getsaldo_anterior().equals(0.0))) {saldosdiariosbancos.setsaldo_anterior(saldosdiariosbancosOrigen.getsaldo_anterior());}
			if(conDefault || (!conDefault && saldosdiariosbancosOrigen.getdeposito()!=null && !saldosdiariosbancosOrigen.getdeposito().equals(0.0))) {saldosdiariosbancos.setdeposito(saldosdiariosbancosOrigen.getdeposito());}
			if(conDefault || (!conDefault && saldosdiariosbancosOrigen.getnc()!=null && !saldosdiariosbancosOrigen.getnc().equals(0.0))) {saldosdiariosbancos.setnc(saldosdiariosbancosOrigen.getnc());}
			if(conDefault || (!conDefault && saldosdiariosbancosOrigen.getch_girados()!=null && !saldosdiariosbancosOrigen.getch_girados().equals(0.0))) {saldosdiariosbancos.setch_girados(saldosdiariosbancosOrigen.getch_girados());}
			if(conDefault || (!conDefault && saldosdiariosbancosOrigen.getnd()!=null && !saldosdiariosbancosOrigen.getnd().equals(0.0))) {saldosdiariosbancos.setnd(saldosdiariosbancosOrigen.getnd());}
			if(conDefault || (!conDefault && saldosdiariosbancosOrigen.getprocedencia()!=null && !saldosdiariosbancosOrigen.getprocedencia().equals(""))) {saldosdiariosbancos.setprocedencia(saldosdiariosbancosOrigen.getprocedencia());}
			if(conDefault || (!conDefault && saldosdiariosbancosOrigen.getdestino()!=null && !saldosdiariosbancosOrigen.getdestino().equals(""))) {saldosdiariosbancos.setdestino(saldosdiariosbancosOrigen.getdestino());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelidSaldosDiariosBancos.setText(saldosdiariosbancos.getId().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldcodigo_cuentaSaldosDiariosBancos.setText(saldosdiariosbancos.getcodigo_cuenta());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreanombre_bancoSaldosDiariosBancos.setText(saldosdiariosbancos.getnombre_banco());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldnumero_cuentaSaldosDiariosBancos.setText(saldosdiariosbancos.getnumero_cuenta());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldnombre_monedaSaldosDiariosBancos.setText(saldosdiariosbancos.getnombre_moneda());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldsaldo_anteriorSaldosDiariosBancos.setText(saldosdiariosbancos.getsaldo_anterior().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFielddepositoSaldosDiariosBancos.setText(saldosdiariosbancos.getdeposito().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldncSaldosDiariosBancos.setText(saldosdiariosbancos.getnc().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldch_giradosSaldosDiariosBancos.setText(saldosdiariosbancos.getch_girados().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldndSaldosDiariosBancos.setText(saldosdiariosbancos.getnd().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreaprocedenciaSaldosDiariosBancos.setText(saldosdiariosbancos.getprocedencia());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreadestinoSaldosDiariosBancos.setText(saldosdiariosbancos.getdestino());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSaldosDiariosBancos(SaldosDiariosBancosBean saldosdiariosbancosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelidSaldosDiariosBancos.setText(saldosdiariosbancosBean.getId().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldcodigo_cuentaSaldosDiariosBancos.setText(saldosdiariosbancosBean.getcodigo_cuenta());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreanombre_bancoSaldosDiariosBancos.setText(saldosdiariosbancosBean.getnombre_banco());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldnumero_cuentaSaldosDiariosBancos.setText(saldosdiariosbancosBean.getnumero_cuenta());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldnombre_monedaSaldosDiariosBancos.setText(saldosdiariosbancosBean.getnombre_moneda());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldsaldo_anteriorSaldosDiariosBancos.setText(saldosdiariosbancosBean.getsaldo_anterior().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFielddepositoSaldosDiariosBancos.setText(saldosdiariosbancosBean.getdeposito().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldncSaldosDiariosBancos.setText(saldosdiariosbancosBean.getnc().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldch_giradosSaldosDiariosBancos.setText(saldosdiariosbancosBean.getch_girados().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldndSaldosDiariosBancos.setText(saldosdiariosbancosBean.getnd().toString());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreaprocedenciaSaldosDiariosBancos.setText(saldosdiariosbancosBean.getprocedencia());
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreadestinoSaldosDiariosBancos.setText(saldosdiariosbancosBean.getdestino());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSaldosDiariosBancos(SaldosDiariosBancosParameterReturnGeneral saldosdiariosbancosReturnGeneral,SaldosDiariosBancosBean saldosdiariosbancosBean,Boolean conDefault) throws Exception { 
		try {
			SaldosDiariosBancos saldosdiariosbancosLocal=new SaldosDiariosBancos();
			
			saldosdiariosbancosLocal=saldosdiariosbancosReturnGeneral.getSaldosDiariosBancos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && saldosdiariosbancosLocal.getId()!=null && !saldosdiariosbancosLocal.getId().equals(0L))) {saldosdiariosbancosBean.setId(saldosdiariosbancosLocal.getId());}}
			if(conDefault || (!conDefault && saldosdiariosbancosLocal.getcodigo_cuenta()!=null && !saldosdiariosbancosLocal.getcodigo_cuenta().equals(""))) {saldosdiariosbancosBean.setcodigo_cuenta(saldosdiariosbancosLocal.getcodigo_cuenta());}
			if(conDefault || (!conDefault && saldosdiariosbancosLocal.getnombre_banco()!=null && !saldosdiariosbancosLocal.getnombre_banco().equals(""))) {saldosdiariosbancosBean.setnombre_banco(saldosdiariosbancosLocal.getnombre_banco());}
			if(conDefault || (!conDefault && saldosdiariosbancosLocal.getnumero_cuenta()!=null && !saldosdiariosbancosLocal.getnumero_cuenta().equals(""))) {saldosdiariosbancosBean.setnumero_cuenta(saldosdiariosbancosLocal.getnumero_cuenta());}
			if(conDefault || (!conDefault && saldosdiariosbancosLocal.getnombre_moneda()!=null && !saldosdiariosbancosLocal.getnombre_moneda().equals(""))) {saldosdiariosbancosBean.setnombre_moneda(saldosdiariosbancosLocal.getnombre_moneda());}
			if(conDefault || (!conDefault && saldosdiariosbancosLocal.getsaldo_anterior()!=null && !saldosdiariosbancosLocal.getsaldo_anterior().equals(0.0))) {saldosdiariosbancosBean.setsaldo_anterior(saldosdiariosbancosLocal.getsaldo_anterior());}
			if(conDefault || (!conDefault && saldosdiariosbancosLocal.getdeposito()!=null && !saldosdiariosbancosLocal.getdeposito().equals(0.0))) {saldosdiariosbancosBean.setdeposito(saldosdiariosbancosLocal.getdeposito());}
			if(conDefault || (!conDefault && saldosdiariosbancosLocal.getnc()!=null && !saldosdiariosbancosLocal.getnc().equals(0.0))) {saldosdiariosbancosBean.setnc(saldosdiariosbancosLocal.getnc());}
			if(conDefault || (!conDefault && saldosdiariosbancosLocal.getch_girados()!=null && !saldosdiariosbancosLocal.getch_girados().equals(0.0))) {saldosdiariosbancosBean.setch_girados(saldosdiariosbancosLocal.getch_girados());}
			if(conDefault || (!conDefault && saldosdiariosbancosLocal.getnd()!=null && !saldosdiariosbancosLocal.getnd().equals(0.0))) {saldosdiariosbancosBean.setnd(saldosdiariosbancosLocal.getnd());}
			if(conDefault || (!conDefault && saldosdiariosbancosLocal.getprocedencia()!=null && !saldosdiariosbancosLocal.getprocedencia().equals(""))) {saldosdiariosbancosBean.setprocedencia(saldosdiariosbancosLocal.getprocedencia());}
			if(conDefault || (!conDefault && saldosdiariosbancosLocal.getdestino()!=null && !saldosdiariosbancosLocal.getdestino().equals(""))) {saldosdiariosbancosBean.setdestino(saldosdiariosbancosLocal.getdestino());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSaldosDiariosBancosGenerico(Long idSaldosDiariosBancosSeleccionado,JComboBox jComboBoxSaldosDiariosBancos,List<SaldosDiariosBancos> saldosdiariosbancossLocal)throws Exception {
		try {
			SaldosDiariosBancos  saldosdiariosbancosTemp=null;

			for(SaldosDiariosBancos saldosdiariosbancosAux:saldosdiariosbancossLocal) {
				if(saldosdiariosbancosAux.getId()!=null && saldosdiariosbancosAux.getId().equals(idSaldosDiariosBancosSeleccionado)) {
					saldosdiariosbancosTemp=saldosdiariosbancosAux;
					break;
				}
			}

			jComboBoxSaldosDiariosBancos.setSelectedItem(saldosdiariosbancosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSaldosDiariosBancosGenerico(JComboBox jComboBoxSaldosDiariosBancos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSaldosDiariosBancos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSaldosDiariosBancos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSaldosDiariosBancos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSaldosDiariosBancos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			saldosdiariosbancos=(SaldosDiariosBancos) saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			saldosdiariosbancos =(SaldosDiariosBancos) saldosdiariosbancoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!saldosdiariosbancos.getIsNew() && !saldosdiariosbancos.getIsChanged() && !saldosdiariosbancos.getIsDeleted()) {
				sDescripcion=saldosdiariosbancos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=saldosdiariosbancos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!saldosdiariosbancos.getIsNew() && !saldosdiariosbancos.getIsChanged() && !saldosdiariosbancos.getIsDeleted()) {
				sDescripcion=saldosdiariosbancos.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=saldosdiariosbancos.getejercicio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SaldosDiariosBancos saldosdiariosbancosRow=new SaldosDiariosBancos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			saldosdiariosbancosRow=(SaldosDiariosBancos) saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			saldosdiariosbancosRow=(SaldosDiariosBancos) saldosdiariosbancoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSaldosDiariosBancos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaNuevoSaldosDiariosBancos && this.isPermisoNuevoSaldosDiariosBancos));			
			this.jButtonDuplicarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaDuplicarSaldosDiariosBancos && this.isPermisoDuplicarSaldosDiariosBancos));			
			this.jButtonCopiarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaCopiarSaldosDiariosBancos && this.isPermisoCopiarSaldosDiariosBancos));
			this.jButtonVerFormSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaVerFormSaldosDiariosBancos && this.isPermisoVerFormSaldosDiariosBancos));
			
			this.jButtonAbrirOrderBySaldosDiariosBancos.setVisible((this.isVisibilidadCeldaOrdenSaldosDiariosBancos && this.isPermisoOrdenSaldosDiariosBancos));			
			
			this.jButtonNuevoRelacionesSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos && this.isPermisoNuevoSaldosDiariosBancos));			
			this.jButtonNuevoGuardarCambiosSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaNuevoSaldosDiariosBancos && this.isPermisoNuevoSaldosDiariosBancos && this.isPermisoGuardarCambiosSaldosDiariosBancos));
			
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonModificarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaModificarSaldosDiariosBancos && this.isPermisoActualizarSaldosDiariosBancos));	
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonActualizarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaActualizarSaldosDiariosBancos && this.isPermisoActualizarSaldosDiariosBancos));	
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonEliminarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaEliminarSaldosDiariosBancos && this.isPermisoEliminarSaldosDiariosBancos));
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonCancelarSaldosDiariosBancos.setVisible(this.isVisibilidadCeldaCancelarSaldosDiariosBancos);							
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonGuardarCambiosSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaGuardarSaldosDiariosBancos && this.isPermisoGuardarCambiosSaldosDiariosBancos));			
			
			}
						
			this.jButtonGuardarCambiosTablaSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos && this.isPermisoGuardarCambiosSaldosDiariosBancos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaNuevoSaldosDiariosBancos && this.isPermisoNuevoSaldosDiariosBancos));						
			this.jButtonDuplicarToolBarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaDuplicarSaldosDiariosBancos && this.isPermisoDuplicarSaldosDiariosBancos));						
			this.jButtonCopiarToolBarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaCopiarSaldosDiariosBancos && this.isPermisoCopiarSaldosDiariosBancos));			
			this.jButtonVerFormToolBarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaVerFormSaldosDiariosBancos && this.isPermisoVerFormSaldosDiariosBancos));			
			this.jButtonAbrirOrderByToolBarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaOrdenSaldosDiariosBancos && this.isPermisoOrdenSaldosDiariosBancos));
			this.jButtonNuevoRelacionesToolBarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos && this.isPermisoNuevoSaldosDiariosBancos));			
			this.jButtonNuevoGuardarCambiosToolBarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaNuevoSaldosDiariosBancos && this.isPermisoNuevoSaldosDiariosBancos && this.isPermisoGuardarCambiosSaldosDiariosBancos));			
			
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonModificarToolBarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaModificarSaldosDiariosBancos && this.isPermisoActualizarSaldosDiariosBancos));	
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonActualizarToolBarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaActualizarSaldosDiariosBancos  && this.isPermisoActualizarSaldosDiariosBancos));	
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonEliminarToolBarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaEliminarSaldosDiariosBancos && this.isPermisoEliminarSaldosDiariosBancos));
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonCancelarToolBarSaldosDiariosBancos.setVisible(this.isVisibilidadCeldaCancelarSaldosDiariosBancos);				
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonGuardarCambiosToolBarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaGuardarSaldosDiariosBancos && this.isPermisoGuardarCambiosSaldosDiariosBancos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos && this.isPermisoGuardarCambiosSaldosDiariosBancos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaNuevoSaldosDiariosBancos && this.isPermisoNuevoSaldosDiariosBancos));			
			this.jMenuItemDuplicarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaDuplicarSaldosDiariosBancos && this.isPermisoDuplicarSaldosDiariosBancos));			
			this.jMenuItemCopiarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaCopiarSaldosDiariosBancos && this.isPermisoCopiarSaldosDiariosBancos));			
			this.jMenuItemVerFormSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaVerFormSaldosDiariosBancos && this.isPermisoVerFormSaldosDiariosBancos));			
			this.jMenuItemAbrirOrderBySaldosDiariosBancos.setVisible((this.isVisibilidadCeldaOrdenSaldosDiariosBancos && this.isPermisoOrdenSaldosDiariosBancos));			
			//this.jMenuItemMostrarOcultarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaOrdenSaldosDiariosBancos && this.isPermisoOrdenSaldosDiariosBancos));
			this.jMenuItemDetalleAbrirOrderBySaldosDiariosBancos.setVisible((this.isVisibilidadCeldaOrdenSaldosDiariosBancos && this.isPermisoOrdenSaldosDiariosBancos));			
			//this.jMenuItemDetalleMostrarOcultarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaOrdenSaldosDiariosBancos && this.isPermisoOrdenSaldosDiariosBancos));			
			this.jMenuItemNuevoRelacionesSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos && this.isPermisoNuevoSaldosDiariosBancos));			
			this.jMenuItemNuevoGuardarCambiosSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaNuevoSaldosDiariosBancos && this.isPermisoNuevoSaldosDiariosBancos && this.isPermisoGuardarCambiosSaldosDiariosBancos));									
			
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemModificarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaModificarSaldosDiariosBancos && this.isPermisoActualizarSaldosDiariosBancos));	
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemActualizarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaActualizarSaldosDiariosBancos && this.isPermisoActualizarSaldosDiariosBancos));	
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemEliminarSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaEliminarSaldosDiariosBancos && this.isPermisoEliminarSaldosDiariosBancos));
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemCancelarSaldosDiariosBancos.setVisible(this.isVisibilidadCeldaCancelarSaldosDiariosBancos);				
			}
			
			this.jMenuItemGuardarCambiosSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaGuardarSaldosDiariosBancos && this.isPermisoGuardarCambiosSaldosDiariosBancos));						
			this.jMenuItemGuardarCambiosTablaSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos && this.isPermisoGuardarCambiosSaldosDiariosBancos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSaldosDiariosBancos=this.jButtonNuevoSaldosDiariosBancos.isVisible();
			this.isVisibilidadCeldaDuplicarSaldosDiariosBancos=this.jButtonDuplicarSaldosDiariosBancos.isVisible();
			this.isVisibilidadCeldaCopiarSaldosDiariosBancos=this.jButtonCopiarSaldosDiariosBancos.isVisible();
			this.isVisibilidadCeldaVerFormSaldosDiariosBancos=this.jButtonVerFormSaldosDiariosBancos.isVisible();
			
			this.isVisibilidadCeldaOrdenSaldosDiariosBancos=this.jButtonAbrirOrderBySaldosDiariosBancos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos=this.jButtonNuevoRelacionesSaldosDiariosBancos.isVisible();
			this.isVisibilidadCeldaModificarSaldosDiariosBancos=this.jButtonModificarSaldosDiariosBancos.isVisible();
			
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
			this.isVisibilidadCeldaActualizarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonActualizarSaldosDiariosBancos.isVisible();
			this.isVisibilidadCeldaEliminarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonEliminarSaldosDiariosBancos.isVisible();
			this.isVisibilidadCeldaCancelarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonCancelarSaldosDiariosBancos.isVisible();
			this.isVisibilidadCeldaGuardarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonGuardarCambiosSaldosDiariosBancos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos=this.jButtonGuardarCambiosTablaSaldosDiariosBancos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSaldosDiariosBancos=this.jButtonNuevoToolBarSaldosDiariosBancos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos=this.jButtonNuevoRelacionesToolBarSaldosDiariosBancos.isVisible();
			
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
			this.isVisibilidadCeldaModificarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonModificarToolBarSaldosDiariosBancos.isVisible();
			this.isVisibilidadCeldaActualizarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonActualizarToolBarSaldosDiariosBancos.isVisible();
			this.isVisibilidadCeldaEliminarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonEliminarToolBarSaldosDiariosBancos.isVisible();
			this.isVisibilidadCeldaCancelarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonCancelarToolBarSaldosDiariosBancos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSaldosDiariosBancos=this.jButtonGuardarCambiosToolBarSaldosDiariosBancos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos=this.jButtonGuardarCambiosTablaToolBarSaldosDiariosBancos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSaldosDiariosBancos=this.jMenuItemNuevoSaldosDiariosBancos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos=this.jMenuItemNuevoRelacionesSaldosDiariosBancos.isVisible();
			
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
			this.isVisibilidadCeldaModificarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemModificarSaldosDiariosBancos.isVisible();
			this.isVisibilidadCeldaActualizarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemActualizarSaldosDiariosBancos.isVisible();
			this.isVisibilidadCeldaEliminarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemEliminarSaldosDiariosBancos.isVisible();
			this.isVisibilidadCeldaCancelarSaldosDiariosBancos=this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemCancelarSaldosDiariosBancos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSaldosDiariosBancos=this.jMenuItemGuardarCambiosSaldosDiariosBancos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos=this.jMenuItemGuardarCambiosTablaSaldosDiariosBancos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSaldosDiariosBancos(Boolean esInicializar) {
		if(SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.saldosdiariosbancosSessionBean.getConGuardarRelaciones()) {
				//if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSaldosDiariosBancos();
			}
			
			this.inicializarActualizarBindingBotonesManualSaldosDiariosBancos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSaldosDiariosBancos() {
		this.jButtonNuevoSaldosDiariosBancos.setVisible(this.isPermisoNuevoSaldosDiariosBancos);			
		this.jButtonDuplicarSaldosDiariosBancos.setVisible(this.isPermisoDuplicarSaldosDiariosBancos);			
		this.jButtonCopiarSaldosDiariosBancos.setVisible(this.isPermisoCopiarSaldosDiariosBancos);			
		this.jButtonVerFormSaldosDiariosBancos.setVisible(this.isPermisoVerFormSaldosDiariosBancos);			
		
		this.jButtonAbrirOrderBySaldosDiariosBancos.setVisible(this.isPermisoOrdenSaldosDiariosBancos);					
		
		this.jButtonNuevoRelacionesSaldosDiariosBancos.setVisible(this.isPermisoNuevoSaldosDiariosBancos);			
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonModificarSaldosDiariosBancos.setVisible(this.isPermisoActualizarSaldosDiariosBancos);	
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonActualizarSaldosDiariosBancos.setVisible(this.isPermisoActualizarSaldosDiariosBancos);	
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonEliminarSaldosDiariosBancos.setVisible(this.isPermisoEliminarSaldosDiariosBancos);
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonCancelarSaldosDiariosBancos.setVisible(this.isVisibilidadCeldaCancelarSaldosDiariosBancos);						
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonGuardarCambiosSaldosDiariosBancos.setVisible(this.isPermisoGuardarCambiosSaldosDiariosBancos);							
		}
		
		this.jButtonGuardarCambiosTablaSaldosDiariosBancos.setVisible(this.isPermisoActualizarSaldosDiariosBancos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSaldosDiariosBancos() {
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonModificarSaldosDiariosBancos.setVisible(this.isPermisoActualizarSaldosDiariosBancos);	
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonActualizarSaldosDiariosBancos.setVisible(this.isPermisoActualizarSaldosDiariosBancos);	
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonEliminarSaldosDiariosBancos.setVisible(this.isPermisoEliminarSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonCancelarSaldosDiariosBancos.setVisible(this.isVisibilidadCeldaCancelarSaldosDiariosBancos);							
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonGuardarCambiosSaldosDiariosBancos.setVisible((this.isVisibilidadCeldaGuardarSaldosDiariosBancos && this.isPermisoGuardarCambiosSaldosDiariosBancos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSaldosDiariosBancos() {
		if(SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSaldosDiariosBancos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSaldosDiariosBancos() {
	}
	
	public void jTableDatosSaldosDiariosBancosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSaldosDiariosBancos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSaldosDiariosBancosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosdiariosbancos==null) {
						this.saldosdiariosbancos = new SaldosDiariosBancos();
					}

					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				}

				if(this.saldosdiariosbancos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.saldosdiariosbancos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosDiariosBancos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSaldosDiariosBancosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSaldosDiariosBancos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldosDiariosBancos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldosDiariosBancos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.saldosdiariosbancosLogic.getConnexion());

				if(this.saldosdiariosbancos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.saldosdiariosbancos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldosDiariosBancos=(TitledBorder)this.jScrollPanelDatosSaldosDiariosBancos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSaldosDiariosBancos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSaldosDiariosBancosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosdiariosbancos==null) {
						this.saldosdiariosbancos = new SaldosDiariosBancos();
					}

					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				}

				if(this.saldosdiariosbancos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.saldosdiariosbancos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosDiariosBancos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioSaldosDiariosBancosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebSaldosDiariosBancos(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldosDiariosBancos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldosDiariosBancos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.saldosdiariosbancosLogic.getConnexion());

				if(this.saldosdiariosbancos.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.saldosdiariosbancos.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldosDiariosBancos=(TitledBorder)this.jScrollPanelDatosSaldosDiariosBancos.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderSaldosDiariosBancos.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioSaldosDiariosBancosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosdiariosbancos==null) {
						this.saldosdiariosbancos = new SaldosDiariosBancos();
					}

					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				}

				if(this.saldosdiariosbancos.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.saldosdiariosbancos.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosDiariosBancos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeSaldosDiariosBancosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosdiariosbancos==null) {
						this.saldosdiariosbancos = new SaldosDiariosBancos();
					}

					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				}

				if(this.saldosdiariosbancos.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.saldosdiariosbancos.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosDiariosBancos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaSaldosDiariosBancosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosdiariosbancos==null) {
						this.saldosdiariosbancos = new SaldosDiariosBancos();
					}

					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				}

				if(this.saldosdiariosbancos.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.saldosdiariosbancos.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosDiariosBancos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_cuentaSaldosDiariosBancosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosdiariosbancos==null) {
						this.saldosdiariosbancos = new SaldosDiariosBancos();
					}

					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				}

				if(this.saldosdiariosbancos.getcodigo_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cuenta like '%"+this.saldosdiariosbancos.getcodigo_cuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosDiariosBancos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bancoSaldosDiariosBancosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosdiariosbancos==null) {
						this.saldosdiariosbancos = new SaldosDiariosBancos();
					}

					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				}

				if(this.saldosdiariosbancos.getnombre_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_banco like '%"+this.saldosdiariosbancos.getnombre_banco()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosDiariosBancos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cuentaSaldosDiariosBancosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosdiariosbancos==null) {
						this.saldosdiariosbancos = new SaldosDiariosBancos();
					}

					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				}

				if(this.saldosdiariosbancos.getnumero_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cuenta like '%"+this.saldosdiariosbancos.getnumero_cuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosDiariosBancos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_monedaSaldosDiariosBancosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosdiariosbancos==null) {
						this.saldosdiariosbancos = new SaldosDiariosBancos();
					}

					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				}

				if(this.saldosdiariosbancos.getnombre_moneda()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_moneda like '%"+this.saldosdiariosbancos.getnombre_moneda()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosDiariosBancos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldo_anteriorSaldosDiariosBancosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosdiariosbancos==null) {
						this.saldosdiariosbancos = new SaldosDiariosBancos();
					}

					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				}

				if(this.saldosdiariosbancos.getsaldo_anterior()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo_anterior = "+this.saldosdiariosbancos.getsaldo_anterior().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosDiariosBancos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondepositoSaldosDiariosBancosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosdiariosbancos==null) {
						this.saldosdiariosbancos = new SaldosDiariosBancos();
					}

					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				}

				if(this.saldosdiariosbancos.getdeposito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where deposito = "+this.saldosdiariosbancos.getdeposito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosDiariosBancos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonncSaldosDiariosBancosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosdiariosbancos==null) {
						this.saldosdiariosbancos = new SaldosDiariosBancos();
					}

					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				}

				if(this.saldosdiariosbancos.getnc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nc = "+this.saldosdiariosbancos.getnc().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosDiariosBancos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonch_giradosSaldosDiariosBancosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosdiariosbancos==null) {
						this.saldosdiariosbancos = new SaldosDiariosBancos();
					}

					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				}

				if(this.saldosdiariosbancos.getch_girados()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ch_girados = "+this.saldosdiariosbancos.getch_girados().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosDiariosBancos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonndSaldosDiariosBancosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosdiariosbancos==null) {
						this.saldosdiariosbancos = new SaldosDiariosBancos();
					}

					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				}

				if(this.saldosdiariosbancos.getnd()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nd = "+this.saldosdiariosbancos.getnd().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosDiariosBancos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprocedenciaSaldosDiariosBancosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosdiariosbancos==null) {
						this.saldosdiariosbancos = new SaldosDiariosBancos();
					}

					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				}

				if(this.saldosdiariosbancos.getprocedencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where procedencia like '%"+this.saldosdiariosbancos.getprocedencia()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosDiariosBancos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondestinoSaldosDiariosBancosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.getsaldosdiariosbancos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldosdiariosbancos==null) {
						this.saldosdiariosbancos = new SaldosDiariosBancos();
					}

					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);
				}

				if(this.saldosdiariosbancos.getdestino()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where destino like '%"+this.saldosdiariosbancos.getdestino()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosDiariosBancos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaSaldosDiariosBancosSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldosDiariosBancos(false,false);

			this.getSaldosDiariosBancossBusquedaSaldosDiariosBancos();

			this.inicializarActualizarBindingSaldosDiariosBancos(false);

			//if(SaldosDiariosBancosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldosDiariosBancos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldosDiariosBancos(false,false);

			this.getSaldosDiariosBancossFK_IdEjercicio();

			this.inicializarActualizarBindingSaldosDiariosBancos(false);

			//if(SaldosDiariosBancosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldosDiariosBancos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSaldosDiariosBancosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldosDiariosBancos(false,false);

			this.getSaldosDiariosBancossFK_IdEmpresa();

			this.inicializarActualizarBindingSaldosDiariosBancos(false);

			//if(SaldosDiariosBancosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldosDiariosBancos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldosdiariosbancosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSaldosDiariosBancos() {
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.setVisible(false);	    			
			this.jInternalFrameDetalleFormSaldosDiariosBancos.dispose();
			this.jInternalFrameDetalleFormSaldosDiariosBancos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSaldosDiariosBancos!=null) {
			this.jInternalFrameReporteDinamicoSaldosDiariosBancos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSaldosDiariosBancos.dispose();
			this.jInternalFrameReporteDinamicoSaldosDiariosBancos=null;
		}
		
		if(this.jInternalFrameImportacionSaldosDiariosBancos!=null) {
			this.jInternalFrameImportacionSaldosDiariosBancos.setVisible(false);	    			
			this.jInternalFrameImportacionSaldosDiariosBancos.dispose();
			this.jInternalFrameImportacionSaldosDiariosBancos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSaldosDiariosBancos();
			
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
			
			
			if(sTipo.equals("NuevoSaldosDiariosBancos")) {
				jButtonNuevoSaldosDiariosBancosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSaldosDiariosBancos")) {
				jButtonDuplicarSaldosDiariosBancosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSaldosDiariosBancos")) {
				jButtonCopiarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("VerFormSaldosDiariosBancos")) {
				jButtonVerFormSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSaldosDiariosBancos")) {
				jButtonNuevoSaldosDiariosBancosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSaldosDiariosBancos")) {
				jButtonDuplicarSaldosDiariosBancosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSaldosDiariosBancos")) {
				jButtonNuevoSaldosDiariosBancosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSaldosDiariosBancos")) {
				jButtonDuplicarSaldosDiariosBancosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSaldosDiariosBancos")) {
				jButtonNuevoSaldosDiariosBancosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSaldosDiariosBancos")) {
				jButtonNuevoSaldosDiariosBancosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSaldosDiariosBancos")) {
				jButtonNuevoSaldosDiariosBancosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSaldosDiariosBancos")) {
				jButtonModificarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSaldosDiariosBancos")) {
				jButtonModificarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSaldosDiariosBancos")) {
				jButtonModificarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSaldosDiariosBancos")) {
				jButtonActualizarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSaldosDiariosBancos")) {
				jButtonActualizarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSaldosDiariosBancos")) {
				jButtonActualizarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("EliminarSaldosDiariosBancos")) {
				jButtonEliminarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSaldosDiariosBancos")) {
				jButtonEliminarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSaldosDiariosBancos")) {
				jButtonEliminarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("CancelarSaldosDiariosBancos")) {
				jButtonCancelarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSaldosDiariosBancos")) {
				jButtonCancelarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSaldosDiariosBancos")) {
				jButtonCancelarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("CerrarSaldosDiariosBancos")) {
				jButtonCerrarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSaldosDiariosBancos")) {
				jButtonCerrarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSaldosDiariosBancos")) {
				jButtonCerrarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSaldosDiariosBancos")) {
				jButtonMostrarOcultarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSaldosDiariosBancos")) {
				jButtonCancelarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSaldosDiariosBancos")) {
				jButtonGuardarCambiosSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSaldosDiariosBancos")) {
				jButtonGuardarCambiosSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSaldosDiariosBancos")) {
				jButtonCopiarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSaldosDiariosBancos")) {
				jButtonVerFormSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSaldosDiariosBancos")) {
				jButtonGuardarCambiosSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSaldosDiariosBancos")) {
				jButtonCopiarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSaldosDiariosBancos")) {
				jButtonVerFormSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSaldosDiariosBancos")) {
				jButtonGuardarCambiosSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSaldosDiariosBancos")) {
				jButtonGuardarCambiosSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSaldosDiariosBancos")) {
				jButtonGuardarCambiosSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSaldosDiariosBancos")) {
				jButtonRecargarInformacionSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSaldosDiariosBancos")) {
				jButtonRecargarInformacionSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSaldosDiariosBancos")) {
				jButtonRecargarInformacionSaldosDiariosBancosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSaldosDiariosBancos")) {
				jButtonAnterioresSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSaldosDiariosBancos")) {
				jButtonAnterioresSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSaldosDiariosBancos")) {
				jButtonAnterioresSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSaldosDiariosBancos")) {
				jButtonSiguientesSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSaldosDiariosBancos")) {
				jButtonSiguientesSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSaldosDiariosBancos")) {
				jButtonSiguientesSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySaldosDiariosBancos") || sTipo.equals("MenuItemDetalleAbrirOrderBySaldosDiariosBancos")) {
				jButtonAbrirOrderBySaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSaldosDiariosBancos") || sTipo.equals("MenuItemDetalleMostrarOcultarSaldosDiariosBancos")) {
				jButtonMostrarOcultarSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSaldosDiariosBancos")) {
				jButtonNuevoGuardarCambiosSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSaldosDiariosBancos")) {
				jButtonNuevoGuardarCambiosSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSaldosDiariosBancos")) {
				jButtonNuevoGuardarCambiosSaldosDiariosBancosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSaldosDiariosBancos")) {
				jButtonCerrarReporteDinamicoSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSaldosDiariosBancos")) {
				jButtonGenerarReporteDinamicoSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSaldosDiariosBancos")) {
				
				jButtonGenerarExcelReporteDinamicoSaldosDiariosBancosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSaldosDiariosBancos")) {
				jButtonCerrarImportacionSaldosDiariosBancosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSaldosDiariosBancos")) {
				
				jButtonGenerarImportacionSaldosDiariosBancosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSaldosDiariosBancos")) {
				
				jButtonAbrirImportacionSaldosDiariosBancosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSaldosDiariosBancos")) {
				jComboBoxTiposAccionesSaldosDiariosBancosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSaldosDiariosBancos")) {
				jComboBoxTiposRelacionesSaldosDiariosBancosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSaldosDiariosBancos")) {
				jComboBoxTiposAccionesSaldosDiariosBancosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSaldosDiariosBancos")) {
				
				jComboBoxTiposSeleccionarSaldosDiariosBancosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSaldosDiariosBancos")) {
				jTextFieldValorCampoGeneralSaldosDiariosBancosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySaldosDiariosBancos")) {
				jButtonAbrirOrderBySaldosDiariosBancosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSaldosDiariosBancos")) {
				jButtonAbrirOrderBySaldosDiariosBancosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySaldosDiariosBancos")) {
				jButtonCerrarOrderBySaldosDiariosBancosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSaldosDiariosBancosBusqueda")) {
				this.jButtonidSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSaldosDiariosBancosUpdate")) {
				this.jButtonid_empresaSaldosDiariosBancosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSaldosDiariosBancosBusqueda")) {
				this.jButtonid_empresaSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioSaldosDiariosBancosUpdate")) {
				this.jButtonid_ejercicioSaldosDiariosBancosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioSaldosDiariosBancosBusqueda")) {
				this.jButtonid_ejercicioSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeSaldosDiariosBancosBusqueda")) {
				this.jButtonfecha_desdeSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaSaldosDiariosBancosBusqueda")) {
				this.jButtonfecha_hastaSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuentaSaldosDiariosBancosBusqueda")) {
				this.jButtoncodigo_cuentaSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bancoSaldosDiariosBancosBusqueda")) {
				this.jButtonnombre_bancoSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuentaSaldosDiariosBancosBusqueda")) {
				this.jButtonnumero_cuentaSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_monedaSaldosDiariosBancosBusqueda")) {
				this.jButtonnombre_monedaSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_anteriorSaldosDiariosBancosBusqueda")) {
				this.jButtonsaldo_anteriorSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("depositoSaldosDiariosBancosBusqueda")) {
				this.jButtondepositoSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ncSaldosDiariosBancosBusqueda")) {
				this.jButtonncSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ch_giradosSaldosDiariosBancosBusqueda")) {
				this.jButtonch_giradosSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ndSaldosDiariosBancosBusqueda")) {
				this.jButtonndSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("procedenciaSaldosDiariosBancosBusqueda")) {
				this.jButtonprocedenciaSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("destinoSaldosDiariosBancosBusqueda")) {
				this.jButtondestinoSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaSaldosDiariosBancosSaldosDiariosBancos")) {
				this.jButtonBusquedaSaldosDiariosBancosSaldosDiariosBancosActionPerformed(evt);
			}
			
			;
			
			
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSaldosDiariosBancos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosDiariosBancosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosdiariosbancos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosdiariosbancos);
				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
				
				


				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosDiariosBancos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosDiariosBancos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SaldosDiariosBancos saldosdiariosbancosLocal=null;
			
			if(!this.getEsControlTabla()) {
				saldosdiariosbancosLocal=this.saldosdiariosbancos;
			} else {
				saldosdiariosbancosLocal=this.saldosdiariosbancosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosdiariosbancos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosdiariosbancos);
				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
							
				
				


				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosDiariosBancos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosDiariosBancos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosDiariosBancosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosAnterior =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldosdiariosbancosAnterior =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
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
			
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
			
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
			
			


			
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosDiariosBancosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosdiariosbancos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosdiariosbancos);
				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
								
						
				


				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosDiariosBancos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosDiariosBancos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosdiariosbancos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosdiariosbancos);
				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
								
				
				


				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosDiariosBancos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosDiariosBancos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosDiariosBancosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosAnterior =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldosdiariosbancosAnterior =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosdiariosbancos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosdiariosbancos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosDiariosBancosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosAnterior =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldosdiariosbancosAnterior =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosDiariosBancosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosdiariosbancos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.saldosdiariosbancos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosdiariosbancos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosdiariosbancos);
				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
							
				
				


				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosDiariosBancos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosDiariosBancos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosDiariosBancosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancosAnterior =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.saldosdiariosbancosAnterior =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
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
			
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
			
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
			
			


			
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosDiariosBancosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosdiariosbancos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.saldosdiariosbancos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosdiariosbancos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosdiariosbancos);
				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
								
				
				


				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosDiariosBancos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosDiariosBancos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosDiariosBancosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosAnterior =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldosdiariosbancosAnterior =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosDiariosBancosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosdiariosbancos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.saldosdiariosbancos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosDiariosBancosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosdiariosbancos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosdiariosbancos);
				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSaldosDiariosBancos")) {
					jCheckBoxSeleccionarTodosSaldosDiariosBancosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSaldosDiariosBancos")) {
					jCheckBoxSeleccionadosSaldosDiariosBancosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSaldosDiariosBancos")) {
					
				}
				
				


				
				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosDiariosBancos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosDiariosBancos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosdiariosbancos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.saldosdiariosbancos);
				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
												
				
				


				
				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosDiariosBancos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosDiariosBancos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosDiariosBancosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldosdiariosbancosAnterior =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.saldosdiariosbancosAnterior =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosDiariosBancosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosdiariosbancos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosdiariosbancos);
				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
				
				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
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
			
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
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
			
			


			
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosDiariosBancosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosdiariosbancos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosdiariosbancos);
				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosDiariosBancos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosDiariosBancos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldosdiariosbancos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldosdiariosbancos);
				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
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
				
				


				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosDiariosBancos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosDiariosBancos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosDiariosBancosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldosdiariosbancosAnterior =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldosdiariosbancosAnterior =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSaldosDiariosBancos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSaldosDiariosBancosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSaldosDiariosBancos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.saldosdiariosbancos =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.saldosdiariosbancos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSaldosDiariosBancos")) {
				
				}
				
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSaldosDiariosBancos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSaldosDiariosBancos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSaldosDiariosBancos")) {
			
			}
			
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSaldosDiariosBancos();
			
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
			
			if(sTipo.equals("NuevoSaldosDiariosBancos")) {
				jButtonNuevoSaldosDiariosBancosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSaldosDiariosBancos")) {
				jButtonDuplicarSaldosDiariosBancosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSaldosDiariosBancos")) {
				jButtonCopiarSaldosDiariosBancosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSaldosDiariosBancos")) {
				jButtonVerFormSaldosDiariosBancosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSaldosDiariosBancos")) {
				jButtonNuevoSaldosDiariosBancosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSaldosDiariosBancos")) {
				jButtonModificarSaldosDiariosBancosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSaldosDiariosBancos")) {
				jButtonActualizarSaldosDiariosBancosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSaldosDiariosBancos")) {
				jButtonEliminarSaldosDiariosBancosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSaldosDiariosBancos")) {
				jButtonGuardarCambiosSaldosDiariosBancosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSaldosDiariosBancos")) {
				jButtonCancelarSaldosDiariosBancosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSaldosDiariosBancos")) {
				jButtonCerrarSaldosDiariosBancosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSaldosDiariosBancos")) {
				jButtonGuardarCambiosSaldosDiariosBancosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSaldosDiariosBancos")) {
				jButtonNuevoGuardarCambiosSaldosDiariosBancosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySaldosDiariosBancos")) {
				jButtonAbrirOrderBySaldosDiariosBancosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSaldosDiariosBancos")) {
				jButtonRecargarInformacionSaldosDiariosBancosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSaldosDiariosBancos")) {
				jButtonAnterioresSaldosDiariosBancosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSaldosDiariosBancos")) {
				jButtonSiguientesSaldosDiariosBancosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSaldosDiariosBancosBusqueda")) {
				this.jButtonidSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSaldosDiariosBancosUpdate")) {
				this.jButtonid_empresaSaldosDiariosBancosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSaldosDiariosBancosBusqueda")) {
				this.jButtonid_empresaSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioSaldosDiariosBancosUpdate")) {
				this.jButtonid_ejercicioSaldosDiariosBancosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioSaldosDiariosBancosBusqueda")) {
				this.jButtonid_ejercicioSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeSaldosDiariosBancosBusqueda")) {
				this.jButtonfecha_desdeSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaSaldosDiariosBancosBusqueda")) {
				this.jButtonfecha_hastaSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuentaSaldosDiariosBancosBusqueda")) {
				this.jButtoncodigo_cuentaSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bancoSaldosDiariosBancosBusqueda")) {
				this.jButtonnombre_bancoSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuentaSaldosDiariosBancosBusqueda")) {
				this.jButtonnumero_cuentaSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_monedaSaldosDiariosBancosBusqueda")) {
				this.jButtonnombre_monedaSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_anteriorSaldosDiariosBancosBusqueda")) {
				this.jButtonsaldo_anteriorSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("depositoSaldosDiariosBancosBusqueda")) {
				this.jButtondepositoSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ncSaldosDiariosBancosBusqueda")) {
				this.jButtonncSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ch_giradosSaldosDiariosBancosBusqueda")) {
				this.jButtonch_giradosSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ndSaldosDiariosBancosBusqueda")) {
				this.jButtonndSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("procedenciaSaldosDiariosBancosBusqueda")) {
				this.jButtonprocedenciaSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("destinoSaldosDiariosBancosBusqueda")) {
				this.jButtondestinoSaldosDiariosBancosBusquedaActionPerformed(evt);
			}
			
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSaldosDiariosBancos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSaldosDiariosBancos")) {
				closingInternalFrameSaldosDiariosBancos();
				
			} else if(sTipo.equals("jButtonCancelarSaldosDiariosBancos")) {
				JInternalFrameBase jInternalFrameDetalleFormSaldosDiariosBancos = (JInternalFrameBase)evt.getSource();
	            	
	            SaldosDiariosBancosBeanSwingJInternalFrame jInternalFrameParent=(SaldosDiariosBancosBeanSwingJInternalFrame)jInternalFrameDetalleFormSaldosDiariosBancos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSaldosDiariosBancosActionPerformed(null);
			}
			
			SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.saldosdiariosbancos,new Object(),this.saldosdiariosbancosParameterGeneral,this.saldosdiariosbancosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSaldosDiariosBancos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSaldosDiariosBancos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSaldosDiariosBancos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.saldosdiariosbancos)) {
			if(!esControlTabla) {
				if(SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);			
				}
				
				if(this.saldosdiariosbancosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSaldosDiariosBancos(this.saldosdiariosbancosReturnGeneral,this.saldosdiariosbancosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.saldosdiariosbancosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSaldosDiariosBancos(classes,this.saldosdiariosbancosReturnGeneral,this.saldosdiariosbancosBean,false);
					}
						
					if(this.saldosdiariosbancosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySaldosDiariosBancos(this.saldosdiariosbancosReturnGeneral.getSaldosDiariosBancos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSaldosDiariosBancos(this.saldosdiariosbancosReturnGeneral.getSaldosDiariosBancos());	
					}
						
					if(this.saldosdiariosbancosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSaldosDiariosBancos(this.saldosdiariosbancosReturnGeneral.getSaldosDiariosBancos(),classes);//this.saldosdiariosbancosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSaldosDiariosBancos(this.saldosdiariosbancos,classes);//this.saldosdiariosbancosBean);									
				}
			
				if(SaldosDiariosBancosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSaldosDiariosBancos(this.saldosdiariosbancos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosDiariosBancos(this.saldosdiariosbancos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.saldosdiariosbancosAnterior!=null) {
						this.saldosdiariosbancos=this.saldosdiariosbancosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.saldosdiariosbancosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.saldosdiariosbancosReturnGeneral.getSaldosDiariosBancos(),saldosdiariosbancosLogic.getSaldosDiariosBancoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.saldosdiariosbancosReturnGeneral.getSaldosDiariosBancos(),this.saldosdiariosbancoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSaldosDiariosBancos.repaint();
				
				//((AbstractTableModel) this.jTableDatosSaldosDiariosBancos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSaldosDiariosBancos();
			}
		}
	}
	
	public void actualizarVisualTableDatosSaldosDiariosBancos() throws Exception {
		
		SaldosDiariosBancosModel saldosdiariosbancosModel=(SaldosDiariosBancosModel)this.jTableDatosSaldosDiariosBancos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			saldosdiariosbancosModel.saldosdiariosbancoss=this.saldosdiariosbancosLogic.getSaldosDiariosBancoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			saldosdiariosbancosModel.saldosdiariosbancoss=this.saldosdiariosbancoss;
		}
		
		
		((SaldosDiariosBancosModel) this.jTableDatosSaldosDiariosBancos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSaldosDiariosBancos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsaldosdiariosbancosAnterior(),this.saldosdiariosbancosLogic.getSaldosDiariosBancoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsaldosdiariosbancosAnterior(),this.saldosdiariosbancoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSaldosDiariosBancos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
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
										
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.saldosdiariosbancos,new Object(),generalEntityParameterGeneral,this.saldosdiariosbancosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.saldosdiariosbancosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SaldosDiariosBancosConstantesFunciones.getClassesRelationshipsOfSaldosDiariosBancos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SaldosDiariosBancosConstantesFunciones.getClassesRelationshipsFromStringsOfSaldosDiariosBancos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSaldosDiariosBancos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SaldosDiariosBancosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.saldosdiariosbancos,new Object(),generalEntityParameterGeneral,this.saldosdiariosbancosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSaldosDiariosBancos(SaldosDiariosBancosBean saldosdiariosbancosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSaldosDiariosBancos(ArrayList<Classe> classes,SaldosDiariosBancosReturnGeneral saldosdiariosbancosReturnGeneral,SaldosDiariosBancosBean saldosdiariosbancosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.saldosdiariosbancos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos = new SaldosDiariosBancosDetalleFormJInternalFrame(jDesktopPane,this.saldosdiariosbancosSessionBean.getConGuardarRelaciones(),this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.setVisible(false);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.setSelected(false);						
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.saldosdiariosbancosLogic=this.saldosdiariosbancosLogic;
		
		this.cargarCombosFrameForeignKeySaldosDiariosBancos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSaldosDiariosBancos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSaldosDiariosBancos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySaldosDiariosBancos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySaldosDiariosBancos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSaldosDiariosBancos"));
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonModificarSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"ModificarSaldosDiariosBancos"));

		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonModificarToolBarSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"ModificarToolBarSaldosDiariosBancos"));
					
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemModificarSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"MenuItemModificarSaldosDiariosBancos"));		
		
		
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonActualizarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"ActualizarSaldosDiariosBancos"));
		
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonActualizarToolBarSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSaldosDiariosBancos"));
						
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemActualizarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSaldosDiariosBancos"));		
		
		
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonEliminarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"EliminarSaldosDiariosBancos"));
		
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonEliminarToolBarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"EliminarToolBarSaldosDiariosBancos"));
								
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemEliminarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSaldosDiariosBancos"));		
		
		
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonCancelarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"CancelarSaldosDiariosBancos"));
		
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonCancelarToolBarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"CancelarToolBarSaldosDiariosBancos"));
					
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemCancelarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSaldosDiariosBancos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemDetalleCerrarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSaldosDiariosBancos"));		
		
		
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonGuardarCambiosToolBarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSaldosDiariosBancos"));
		
		
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonGuardarCambiosToolBarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSaldosDiariosBancos"));
		
		
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSaldosDiariosBancos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonidSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"idSaldosDiariosBancosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonid_empresaSaldosDiariosBancosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSaldosDiariosBancosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonid_empresaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSaldosDiariosBancosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonid_ejercicioSaldosDiariosBancosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioSaldosDiariosBancosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonid_ejercicioSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonfecha_desdeSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonfecha_hastaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtoncodigo_cuentaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuentaSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonnombre_bancoSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonnumero_cuentaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonnombre_monedaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_monedaSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonsaldo_anteriorSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"saldo_anteriorSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtondepositoSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"depositoSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonncSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"ncSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonch_giradosSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"ch_giradosSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonndSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"ndSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonprocedenciaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"procedenciaSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtondestinoSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"destinoSaldosDiariosBancosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTabbedPaneRelacionesSaldosDiariosBancos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSaldosDiariosBancos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSaldosDiariosBancos"));
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSaldosDiariosBancos"));
		}
		
		this.jTableDatosSaldosDiariosBancos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSaldosDiariosBancos"));
		
		this.jTableDatosSaldosDiariosBancos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSaldosDiariosBancos"));
		
		this.jButtonNuevoSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"NuevoSaldosDiariosBancos"));
		
		this.jButtonDuplicarSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"DuplicarSaldosDiariosBancos"));
		
		this.jButtonCopiarSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"CopiarSaldosDiariosBancos"));
		
		this.jButtonVerFormSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"VerFormSaldosDiariosBancos"));
		
		
		this.jButtonNuevoToolBarSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"NuevoToolBarSaldosDiariosBancos"));
			
		this.jButtonDuplicarToolBarSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSaldosDiariosBancos"));
			
		this.jMenuItemNuevoSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSaldosDiariosBancos"));
			
		this.jMenuItemDuplicarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSaldosDiariosBancos"));		
		
		
		this.jButtonNuevoRelacionesSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSaldosDiariosBancos"));
		
		
		this.jButtonNuevoRelacionesToolBarSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSaldosDiariosBancos"));
			
		this.jMenuItemNuevoRelacionesSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSaldosDiariosBancos"));		
		
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonModificarSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"ModificarSaldosDiariosBancos"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonModificarToolBarSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"ModificarToolBarSaldosDiariosBancos"));
			
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemModificarSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"MenuItemModificarSaldosDiariosBancos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonActualizarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"ActualizarSaldosDiariosBancos"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonActualizarToolBarSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSaldosDiariosBancos"));
				
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemActualizarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSaldosDiariosBancos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonEliminarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"EliminarSaldosDiariosBancos"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonEliminarToolBarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"EliminarToolBarSaldosDiariosBancos"));
						
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemEliminarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSaldosDiariosBancos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonCancelarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"CancelarSaldosDiariosBancos"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonCancelarToolBarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"CancelarToolBarSaldosDiariosBancos"));
			
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemCancelarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSaldosDiariosBancos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSaldosDiariosBancos"));		
		
		
		this.jButtonCerrarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"CerrarSaldosDiariosBancos"));
		
		
		this.jButtonCerrarToolBarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"CerrarToolBarSaldosDiariosBancos"));
			
		this.jMenuItemCerrarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSaldosDiariosBancos"));
			
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jMenuItemDetalleCerrarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSaldosDiariosBancos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonGuardarCambiosSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"GuardarCambiosSaldosDiariosBancos"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonGuardarCambiosToolBarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSaldosDiariosBancos"));
		}
		
		this.jButtonCopiarToolBarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"CopiarToolBarSaldosDiariosBancos"));
			
		this.jButtonVerFormToolBarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"VerFormToolBarSaldosDiariosBancos"));
		
		this.jMenuItemGuardarCambiosSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSaldosDiariosBancos"));
			
		this.jMenuItemCopiarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSaldosDiariosBancos"));		
		
		this.jMenuItemVerFormSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSaldosDiariosBancos"));		
		
		
		this.jButtonGuardarCambiosTablaSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSaldosDiariosBancos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSaldosDiariosBancos"));
			
		this.jMenuItemGuardarCambiosTablaSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSaldosDiariosBancos"));		
		
		
		
		this.jButtonRecargarInformacionSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"RecargarInformacionSaldosDiariosBancos"));
					
		this.jButtonRecargarInformacionToolBarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSaldosDiariosBancos"));
		
		this.jMenuItemRecargarInformacionSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSaldosDiariosBancos"));		
		
		
		
		this.jButtonAnterioresSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"AnterioresSaldosDiariosBancos"));
		
		
		this.jButtonAnterioresToolBarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSaldosDiariosBancos"));
		
		this.jMenuItemAnterioresSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSaldosDiariosBancos"));		
		
		
		this.jButtonSiguientesSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"SiguientesSaldosDiariosBancos"));
		
		
		this.jButtonSiguientesToolBarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSaldosDiariosBancos"));
			
		this.jMenuItemSiguientesSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSaldosDiariosBancos"));
			
		this.jMenuItemAbrirOrderBySaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySaldosDiariosBancos"));
			
		this.jMenuItemMostrarOcultarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSaldosDiariosBancos"));
			
		this.jMenuItemDetalleAbrirOrderBySaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySaldosDiariosBancos"));
			
		this.jMenuItemDetalleMostarOcultarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSaldosDiariosBancos"));		
		
		
		this.jButtonNuevoGuardarCambiosSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSaldosDiariosBancos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSaldosDiariosBancos"));
			
		this.jMenuItemNuevoGuardarCambiosSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSaldosDiariosBancos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSaldosDiariosBancos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSaldosDiariosBancos"));

		this.jCheckBoxSeleccionadosSaldosDiariosBancos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSaldosDiariosBancos"));
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSaldosDiariosBancos"));
		}
		
		
		this.jComboBoxTiposRelacionesSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"TiposRelacionesSaldosDiariosBancos"));
			
		this.jComboBoxTiposAccionesSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"TiposAccionesSaldosDiariosBancos"));
					
		this.jComboBoxTiposSeleccionarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSaldosDiariosBancos"));
			
		this.jTextFieldValorCampoGeneralSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSaldosDiariosBancos"));		
		
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonidSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"idSaldosDiariosBancosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonid_empresaSaldosDiariosBancosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSaldosDiariosBancosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonid_empresaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSaldosDiariosBancosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonid_ejercicioSaldosDiariosBancosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioSaldosDiariosBancosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonid_ejercicioSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonfecha_desdeSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonfecha_hastaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtoncodigo_cuentaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuentaSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonnombre_bancoSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonnumero_cuentaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonnombre_monedaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_monedaSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonsaldo_anteriorSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"saldo_anteriorSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtondepositoSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"depositoSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonncSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"ncSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonch_giradosSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"ch_giradosSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonndSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"ndSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonprocedenciaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"procedenciaSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtondestinoSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"destinoSaldosDiariosBancosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaSaldosDiariosBancosSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"BusquedaSaldosDiariosBancosSaldosDiariosBancos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSaldosDiariosBancos!=null) {
				this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSaldosDiariosBancos"));
				this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSaldosDiariosBancos"));
				this.jInternalFrameReporteDinamicoSaldosDiariosBancos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSaldosDiariosBancos"));
			}
			
			//this.jButtonCerrarReporteDinamicoSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSaldosDiariosBancos"));				
			//this.jButtonGenerarReporteDinamicoSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSaldosDiariosBancos"));
			//this.jButtonGenerarExcelReporteDinamicoSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSaldosDiariosBancos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSaldosDiariosBancos!=null) {
				this.jInternalFrameImportacionSaldosDiariosBancos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSaldosDiariosBancos"));
				this.jInternalFrameImportacionSaldosDiariosBancos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSaldosDiariosBancos"));
				this.jInternalFrameImportacionSaldosDiariosBancos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSaldosDiariosBancos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"AbrirOrderBySaldosDiariosBancos"));
			
			this.jButtonAbrirOrderByToolBarSaldosDiariosBancos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSaldosDiariosBancos"));			
			
			if(this.jInternalFrameOrderBySaldosDiariosBancos!=null) {
				this.jInternalFrameOrderBySaldosDiariosBancos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySaldosDiariosBancos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosDiariosBancos.jTabbedPaneRelacionesSaldosDiariosBancos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSaldosDiariosBancos"));
		
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
            		closingInternalFrameSaldosDiariosBancos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSaldosDiariosBancos = (JInternalFrameBase)event.getSource();
	            	
	            SaldosDiariosBancosBeanSwingJInternalFrame jInternalFrameParent=(SaldosDiariosBancosBeanSwingJInternalFrame)jInternalFrameDetalleFormSaldosDiariosBancos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSaldosDiariosBancosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSaldosDiariosBancos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSaldosDiariosBancosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSaldosDiariosBancos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSaldosDiariosBancos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosDiariosBancosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosDiariosBancosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosDiariosBancosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSaldosDiariosBancos";
		inputMap = this.jButtonNuevoSaldosDiariosBancos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSaldosDiariosBancos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSaldosDiariosBancosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosDiariosBancosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosDiariosBancosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosDiariosBancosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSaldosDiariosBancos";
		inputMap = this.jButtonNuevoRelacionesSaldosDiariosBancos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSaldosDiariosBancos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSaldosDiariosBancosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSaldosDiariosBancos";
		inputMap = this.jButtonModificarSaldosDiariosBancos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSaldosDiariosBancos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSaldosDiariosBancosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSaldosDiariosBancos";
		inputMap = this.jButtonActualizarSaldosDiariosBancos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSaldosDiariosBancos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSaldosDiariosBancosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSaldosDiariosBancos";
		inputMap = this.jButtonEliminarSaldosDiariosBancos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSaldosDiariosBancos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSaldosDiariosBancosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSaldosDiariosBancos";
		inputMap = this.jButtonCancelarSaldosDiariosBancos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSaldosDiariosBancos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSaldosDiariosBancosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSaldosDiariosBancos";
		inputMap = this.jButtonCerrarSaldosDiariosBancos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSaldosDiariosBancos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSaldosDiariosBancosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonGuardarCambiosSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSaldosDiariosBancos";
		inputMap = this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonGuardarCambiosSaldosDiariosBancos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonGuardarCambiosSaldosDiariosBancos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSaldosDiariosBancosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSaldosDiariosBancos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSaldosDiariosBancosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSaldosDiariosBancos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSaldosDiariosBancosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSaldosDiariosBancos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSaldosDiariosBancosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSaldosDiariosBancos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSaldosDiariosBancosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonidSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"idSaldosDiariosBancosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonid_empresaSaldosDiariosBancosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSaldosDiariosBancosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonid_empresaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSaldosDiariosBancosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonid_ejercicioSaldosDiariosBancosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioSaldosDiariosBancosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonid_ejercicioSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonfecha_desdeSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonfecha_hastaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtoncodigo_cuentaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuentaSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonnombre_bancoSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonnumero_cuentaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonnombre_monedaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_monedaSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonsaldo_anteriorSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"saldo_anteriorSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtondepositoSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"depositoSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonncSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"ncSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonch_giradosSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"ch_giradosSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonndSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"ndSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtonprocedenciaSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"procedenciaSaldosDiariosBancosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jButtondestinoSaldosDiariosBancosBusqueda.addActionListener(new ButtonActionListener(this,"destinoSaldosDiariosBancosBusqueda"));
		
		
		this.jButtonBusquedaSaldosDiariosBancosSaldosDiariosBancos.addActionListener(new ButtonActionListener(this,"BusquedaSaldosDiariosBancosSaldosDiariosBancos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSaldosDiariosBancos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSaldosDiariosBancosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSaldosDiariosBancosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSaldosDiariosBancos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSaldosDiariosBancos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SaldosDiariosBancos saldosdiariosbancosAux:this.saldosdiariosbancosLogic.getSaldosDiariosBancoss()) {
					saldosdiariosbancosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldosDiariosBancos saldosdiariosbancosAux:saldosdiariosbancoss) {
					saldosdiariosbancosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSaldosDiariosBancosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSaldosDiariosBancos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SaldosDiariosBancos saldosdiariosbancosAux:this.saldosdiariosbancosLogic.getSaldosDiariosBancoss()) {
						saldosdiariosbancosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SaldosDiariosBancos saldosdiariosbancosAux:saldosdiariosbancoss) {
						saldosdiariosbancosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SaldosDiariosBancos saldosdiariosbancosAux:this.saldosdiariosbancosLogic.getSaldosDiariosBancoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SaldosDiariosBancos saldosdiariosbancosAux:saldosdiariosbancoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSaldosDiariosBancos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSaldosDiariosBancos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSaldosDiariosBancos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSaldosDiariosBancos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSaldosDiariosBancosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSaldosDiariosBancos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSaldosDiariosBancos.getSelectedRows();
			
			SaldosDiariosBancos saldosdiariosbancosLocal=new SaldosDiariosBancos();
			
			//this.seleccionarTodosSaldosDiariosBancos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldosdiariosbancosLocal =(SaldosDiariosBancos) this.saldosdiariosbancosLogic.getSaldosDiariosBancoss().toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					saldosdiariosbancosLocal =(SaldosDiariosBancos) this.saldosdiariosbancoss.toArray()[this.jTableDatosSaldosDiariosBancos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				saldosdiariosbancosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SaldosDiariosBancos saldosdiariosbancosAux:this.saldosdiariosbancosLogic.getSaldosDiariosBancoss()) {
						saldosdiariosbancosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SaldosDiariosBancos saldosdiariosbancosAux:saldosdiariosbancoss) {
						saldosdiariosbancosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSaldosDiariosBancos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSaldosDiariosBancos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSaldosDiariosBancos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSaldosDiariosBancos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSaldosDiariosBancosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSaldosDiariosBancosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSaldosDiariosBancosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSaldosDiariosBancos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSaldosDiariosBancos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SaldosDiariosBancos saldosdiariosbancosAux:this.saldosdiariosbancosLogic.getSaldosDiariosBancoss()) {
				
						if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							saldosdiariosbancosAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							saldosdiariosbancosAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA)) {
							existe=true;
							saldosdiariosbancosAux.setcodigo_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO)) {
							existe=true;
							saldosdiariosbancosAux.setnombre_banco(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA)) {
							existe=true;
							saldosdiariosbancosAux.setnumero_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA)) {
							existe=true;
							saldosdiariosbancosAux.setnombre_moneda(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_SALDOANTERIOR)) {
							existe=true;
							saldosdiariosbancosAux.setsaldo_anterior(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_DEPOSITO)) {
							existe=true;
							saldosdiariosbancosAux.setdeposito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_NC)) {
							existe=true;
							saldosdiariosbancosAux.setnc(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_CHGIRADOS)) {
							existe=true;
							saldosdiariosbancosAux.setch_girados(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_ND)) {
							existe=true;
							saldosdiariosbancosAux.setnd(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA)) {
							existe=true;
							saldosdiariosbancosAux.setprocedencia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO)) {
							existe=true;
							saldosdiariosbancosAux.setdestino(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldosDiariosBancos saldosdiariosbancosAux:saldosdiariosbancoss) {
					
						if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							saldosdiariosbancosAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							saldosdiariosbancosAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA)) {
							existe=true;
							saldosdiariosbancosAux.setcodigo_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO)) {
							existe=true;
							saldosdiariosbancosAux.setnombre_banco(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA)) {
							existe=true;
							saldosdiariosbancosAux.setnumero_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA)) {
							existe=true;
							saldosdiariosbancosAux.setnombre_moneda(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_SALDOANTERIOR)) {
							existe=true;
							saldosdiariosbancosAux.setsaldo_anterior(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_DEPOSITO)) {
							existe=true;
							saldosdiariosbancosAux.setdeposito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_NC)) {
							existe=true;
							saldosdiariosbancosAux.setnc(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_CHGIRADOS)) {
							existe=true;
							saldosdiariosbancosAux.setch_girados(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_ND)) {
							existe=true;
							saldosdiariosbancosAux.setnd(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA)) {
							existe=true;
							saldosdiariosbancosAux.setprocedencia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO)) {
							existe=true;
							saldosdiariosbancosAux.setdestino(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSaldosDiariosBancos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSaldosDiariosBancosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSaldosDiariosBancos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSaldosDiariosBancos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSaldosDiariosBancos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSaldosDiariosBancos) {				
					conSplash=true;//false;										
					
					//this.startProcessSaldosDiariosBancos(conSplash);
				
					this.generarReporteSaldosDiariosBancossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldosDiariosBancos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSaldosDiariosBancossSeleccionados();
				//this.jComboBoxTiposAccionesSaldosDiariosBancos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSaldosDiariosBancossSeleccionados(false);
				//this.jComboBoxTiposAccionesSaldosDiariosBancos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSaldosDiariosBancossSeleccionados(true);
				//this.jComboBoxTiposAccionesSaldosDiariosBancos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSaldosDiariosBancos();
				
				this.exportarSaldosDiariosBancossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldosDiariosBancos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSaldosDiariosBancoss();
				//this.importarSaldosDiariosBancoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldosDiariosBancos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSaldosDiariosBancos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSaldosDiariosBancossSeleccionados();
				//this.jComboBoxTiposAccionesSaldosDiariosBancos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Saldos Diarios Bancos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSaldosDiariosBancos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSaldosDiariosBancos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySaldosDiariosBancos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Saldos Diarios Bancos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldosDiariosBancos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.setSelectedIndex(0);					
				}	
			} 			
			else if(SaldosDiariosBancosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSaldosDiariosBancos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSaldosDiariosBancos(conSplash);
					
						//this.actualizarParametrosGeneralSaldosDiariosBancos();
						
						this.generarReporteProcesoAccionSaldosDiariosBancossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSaldosDiariosBancos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SaldosDiariosBancosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Saldos Diarios BancosES SELECCIONADOS?", "MANTENIMIENTO DE Saldos Diarios Bancos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSaldosDiariosBancos();
				
						this.actualizarParametrosGeneralSaldosDiariosBancos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.saldosdiariosbancosReturnGeneral=saldosdiariosbancosLogic.procesarAccionSaldosDiariosBancossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.saldosdiariosbancosLogic.getSaldosDiariosBancoss(),this.saldosdiariosbancosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSaldosDiariosBancosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSaldosDiariosBancos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSaldosDiariosBancos();
					
					SaldosDiariosBancosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSaldosDiariosBancosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSaldosDiariosBancos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSaldosDiariosBancos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSaldosDiariosBancosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSaldosDiariosBancos();
			
			if(this.jInternalFrameDetalleFormSaldosDiariosBancos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SaldosDiariosBancos> saldosdiariosbancossSeleccionados=new ArrayList<SaldosDiariosBancos>();		
			SaldosDiariosBancos saldosdiariosbancos=new SaldosDiariosBancos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSaldosDiariosBancos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSaldosDiariosBancos.getSelectedItem();
			
			
			
			
			saldosdiariosbancossSeleccionados=this.getSaldosDiariosBancossSeleccionados(true);
			//this.sTipoAccion;
			
			if(saldosdiariosbancossSeleccionados.size()==1) {
				for(SaldosDiariosBancos saldosdiariosbancosAux:saldosdiariosbancossSeleccionados) {
					saldosdiariosbancos=saldosdiariosbancosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSaldosDiariosBancos();
			
      		//this.finishProcessSaldosDiariosBancos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSaldosDiariosBancosReturnGeneral() throws Exception {
		if(this.saldosdiariosbancosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.saldosdiariosbancosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.saldosdiariosbancosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.saldosdiariosbancosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.saldosdiariosbancosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.saldosdiariosbancosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSaldosDiariosBancos(false);
		}
		
		if(this.saldosdiariosbancosReturnGeneral.getConRetornoLista() || this.saldosdiariosbancosReturnGeneral.getConRetornoObjeto()) {
			if(this.saldosdiariosbancosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.saldosdiariosbancosLogic.setSaldosDiariosBancoss(this.saldosdiariosbancosReturnGeneral.getSaldosDiariosBancoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingSaldosDiariosBancos(false);
		}
	}
	
	public void actualizarParametrosGeneralSaldosDiariosBancos() throws Exception {
		
		
	}
	
	public ArrayList<SaldosDiariosBancos> getSaldosDiariosBancossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SaldosDiariosBancos> saldosdiariosbancossSeleccionados=new ArrayList<SaldosDiariosBancos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSaldosDiariosBancos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SaldosDiariosBancos saldosdiariosbancosAux:saldosdiariosbancosLogic.getSaldosDiariosBancoss()) {
					if(saldosdiariosbancosAux.getIsSelected()) {
						saldosdiariosbancossSeleccionados.add(saldosdiariosbancosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldosDiariosBancos saldosdiariosbancosAux:this.saldosdiariosbancoss) {
					if(saldosdiariosbancosAux.getIsSelected()) {
						saldosdiariosbancossSeleccionados.add(saldosdiariosbancosAux);				
					}
				}
			}
			
			if(saldosdiariosbancossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						saldosdiariosbancossSeleccionados.addAll(this.saldosdiariosbancosLogic.getSaldosDiariosBancoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						saldosdiariosbancossSeleccionados.addAll(this.saldosdiariosbancoss);				
					}
				}
			}
		} else {
			saldosdiariosbancossSeleccionados.add(this.saldosdiariosbancos);
		}
		
		return saldosdiariosbancossSeleccionados;
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
	
	public void generarReporteSaldosDiariosBancossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSaldosDiariosBancossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSaldosDiariosBancossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSaldosDiariosBancossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSaldosDiariosBancossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Saldos Diarios Bancos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSaldosDiariosBancossSeleccionados() throws Exception {
		ArrayList<SaldosDiariosBancos> saldosdiariosbancossSeleccionados=new ArrayList<SaldosDiariosBancos>();		
		
		saldosdiariosbancossSeleccionados=this.getSaldosDiariosBancossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSaldosDiariosBancoss("Todos",saldosdiariosbancossSeleccionados);
		
	}	
	
	public void generarReporteNormalSaldosDiariosBancossSeleccionados() throws Exception {
		ArrayList<SaldosDiariosBancos> saldosdiariosbancossSeleccionados=new ArrayList<SaldosDiariosBancos>();		
		
		saldosdiariosbancossSeleccionados=this.getSaldosDiariosBancossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSaldosDiariosBancoss("Todos",saldosdiariosbancossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSaldosDiariosBancossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SaldosDiariosBancos> saldosdiariosbancossSeleccionados=new ArrayList<SaldosDiariosBancos>();
		
		saldosdiariosbancossSeleccionados=this.getSaldosDiariosBancossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSaldosDiariosBancoss("Todos",saldosdiariosbancossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSaldosDiariosBancossSeleccionados() throws Exception {
		ArrayList<SaldosDiariosBancos> saldosdiariosbancossSeleccionados=new ArrayList<SaldosDiariosBancos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSaldosDiariosBancos();
		
		
		saldosdiariosbancossSeleccionados=this.getSaldosDiariosBancossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSaldosDiariosBancos();
		
		
		//this.generarReporteSaldosDiariosBancoss("Todos",saldosdiariosbancossSeleccionados ,saldosdiariosbancosImplementable,saldosdiariosbancosImplementableHome);
	}
	
	public void mostrarImportacionSaldosDiariosBancoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSaldosDiariosBancos();
		
		this.abrirFrameImportacionSaldosDiariosBancos();		
		
			
		//this.generarReporteSaldosDiariosBancoss("Todos",saldosdiariosbancossSeleccionados ,saldosdiariosbancosImplementable,saldosdiariosbancosImplementableHome);
	}
	
	public void importarSaldosDiariosBancoss() throws Exception {		
	
	}
	
	public void exportarSaldosDiariosBancossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSaldosDiariosBancossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSaldosDiariosBancossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSaldosDiariosBancossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Saldos Diarios Bancos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSaldosDiariosBancossSeleccionados() throws Exception {
		ArrayList<SaldosDiariosBancos> saldosdiariosbancossSeleccionados=new ArrayList<SaldosDiariosBancos>();		
		
		saldosdiariosbancossSeleccionados=this.getSaldosDiariosBancossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldosdiariosbancos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSaldosDiariosBancos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SaldosDiariosBancos saldosdiariosbancosAux:saldosdiariosbancossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSaldosDiariosBancos(saldosdiariosbancosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//saldosdiariosbancosAux.setsDetalleGeneralEntityReporte(saldosdiariosbancosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Diarios Bancos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSaldosDiariosBancos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SaldosDiariosBancosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosDiariosBancosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosDiariosBancosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosDiariosBancosConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosDiariosBancosConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosDiariosBancosConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosDiariosBancosConstantesFunciones.LABEL_SALDOANTERIOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosDiariosBancosConstantesFunciones.LABEL_DEPOSITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosDiariosBancosConstantesFunciones.LABEL_NC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosDiariosBancosConstantesFunciones.LABEL_CHGIRADOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosDiariosBancosConstantesFunciones.LABEL_ND;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=saldosdiariosbancos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosdiariosbancos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosdiariosbancos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosdiariosbancos.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosdiariosbancos.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosdiariosbancos.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosdiariosbancos.getcodigo_cuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosdiariosbancos.getnombre_banco();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosdiariosbancos.getnumero_cuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosdiariosbancos.getnombre_moneda();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosdiariosbancos.getsaldo_anterior().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosdiariosbancos.getdeposito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosdiariosbancos.getnc().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosdiariosbancos.getch_girados().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosdiariosbancos.getnd().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosdiariosbancos.getprocedencia();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldosdiariosbancos.getdestino();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSaldosDiariosBancossSeleccionados() throws Exception {
		ArrayList<SaldosDiariosBancos> saldosdiariosbancossSeleccionados=new ArrayList<SaldosDiariosBancos>();		
		
		saldosdiariosbancossSeleccionados=this.getSaldosDiariosBancossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldosdiariosbancos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SaldosDiariosBancoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSaldosDiariosBancos(row);				
				iRow++;
			}				
			
			for(SaldosDiariosBancos saldosdiariosbancosAux:saldosdiariosbancossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSaldosDiariosBancos(saldosdiariosbancosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Diarios Bancos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSaldosDiariosBancossSeleccionados() throws Exception {
		ArrayList<SaldosDiariosBancos> saldosdiariosbancossSeleccionados=new ArrayList<SaldosDiariosBancos>();		
		
		saldosdiariosbancossSeleccionados=this.getSaldosDiariosBancossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldosdiariosbancos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("saldosdiariosbancoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("saldosdiariosbancos");
			//elementRoot.appendChild(element);
		
			for(SaldosDiariosBancos saldosdiariosbancosAux:saldosdiariosbancossSeleccionados) {
				element = document.createElement("saldosdiariosbancos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSaldosDiariosBancos(saldosdiariosbancosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Diarios Bancos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSaldosDiariosBancos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_SALDOANTERIOR);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_DEPOSITO);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_NC);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_CHGIRADOS);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_ND);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(saldosdiariosbancos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosdiariosbancos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosdiariosbancos.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosdiariosbancos.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosdiariosbancos.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosdiariosbancos.getcodigo_cuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosdiariosbancos.getnombre_banco());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosdiariosbancos.getnumero_cuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosdiariosbancos.getnombre_moneda());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosdiariosbancos.getsaldo_anterior());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosdiariosbancos.getdeposito());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosdiariosbancos.getnc());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosdiariosbancos.getch_girados());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosdiariosbancos.getnd());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosdiariosbancos.getprocedencia());
		cell = row.createCell(iColumn++);cell.setCellValue(saldosdiariosbancos.getdestino());				
	}
	
	public void setFilaDatosExportarXmlSaldosDiariosBancos(SaldosDiariosBancos saldosdiariosbancos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SaldosDiariosBancosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(saldosdiariosbancos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SaldosDiariosBancosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(saldosdiariosbancos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SaldosDiariosBancosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(saldosdiariosbancos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementejercicio_descripcion = document.createElement(SaldosDiariosBancosConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(saldosdiariosbancos.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementfecha_desde = document.createElement(SaldosDiariosBancosConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(saldosdiariosbancos.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(SaldosDiariosBancosConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(saldosdiariosbancos.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementcodigo_cuenta = document.createElement(SaldosDiariosBancosConstantesFunciones.CODIGOCUENTA);
		elementcodigo_cuenta.appendChild(document.createTextNode(saldosdiariosbancos.getcodigo_cuenta().trim()));
		element.appendChild(elementcodigo_cuenta);

		Element elementnombre_banco = document.createElement(SaldosDiariosBancosConstantesFunciones.NOMBREBANCO);
		elementnombre_banco.appendChild(document.createTextNode(saldosdiariosbancos.getnombre_banco().trim()));
		element.appendChild(elementnombre_banco);

		Element elementnumero_cuenta = document.createElement(SaldosDiariosBancosConstantesFunciones.NUMEROCUENTA);
		elementnumero_cuenta.appendChild(document.createTextNode(saldosdiariosbancos.getnumero_cuenta().trim()));
		element.appendChild(elementnumero_cuenta);

		Element elementnombre_moneda = document.createElement(SaldosDiariosBancosConstantesFunciones.NOMBREMONEDA);
		elementnombre_moneda.appendChild(document.createTextNode(saldosdiariosbancos.getnombre_moneda().trim()));
		element.appendChild(elementnombre_moneda);

		Element elementsaldo_anterior = document.createElement(SaldosDiariosBancosConstantesFunciones.SALDOANTERIOR);
		elementsaldo_anterior.appendChild(document.createTextNode(saldosdiariosbancos.getsaldo_anterior().toString().trim()));
		element.appendChild(elementsaldo_anterior);

		Element elementdeposito = document.createElement(SaldosDiariosBancosConstantesFunciones.DEPOSITO);
		elementdeposito.appendChild(document.createTextNode(saldosdiariosbancos.getdeposito().toString().trim()));
		element.appendChild(elementdeposito);

		Element elementnc = document.createElement(SaldosDiariosBancosConstantesFunciones.NC);
		elementnc.appendChild(document.createTextNode(saldosdiariosbancos.getnc().toString().trim()));
		element.appendChild(elementnc);

		Element elementch_girados = document.createElement(SaldosDiariosBancosConstantesFunciones.CHGIRADOS);
		elementch_girados.appendChild(document.createTextNode(saldosdiariosbancos.getch_girados().toString().trim()));
		element.appendChild(elementch_girados);

		Element elementnd = document.createElement(SaldosDiariosBancosConstantesFunciones.ND);
		elementnd.appendChild(document.createTextNode(saldosdiariosbancos.getnd().toString().trim()));
		element.appendChild(elementnd);

		Element elementprocedencia = document.createElement(SaldosDiariosBancosConstantesFunciones.PROCEDENCIA);
		elementprocedencia.appendChild(document.createTextNode(saldosdiariosbancos.getprocedencia().trim()));
		element.appendChild(elementprocedencia);

		Element elementdestino = document.createElement(SaldosDiariosBancosConstantesFunciones.DESTINO);
		elementdestino.appendChild(document.createTextNode(saldosdiariosbancos.getdestino().trim()));
		element.appendChild(elementdestino);
	}
	
	public void generarReporteGroupGenericoSaldosDiariosBancossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SaldosDiariosBancos> saldosdiariosbancossSeleccionados=new ArrayList<SaldosDiariosBancos>();
		
		saldosdiariosbancossSeleccionados=this.getSaldosDiariosBancossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSaldosDiariosBancos(saldosdiariosbancossSeleccionados);
		
		this.generarReporteSaldosDiariosBancoss("Todos",saldosdiariosbancossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSaldosDiariosBancos(ArrayList<SaldosDiariosBancos> saldosdiariosbancossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SaldosDiariosBancos saldosdiariosbancosAux:saldosdiariosbancossSeleccionados) {
				saldosdiariosbancosAux.setsDetalleGeneralEntityReporte(saldosdiariosbancosAux.toString());
			
				if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					saldosdiariosbancosAux.setsDescripcionGeneralEntityReporte1(saldosdiariosbancosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					saldosdiariosbancosAux.setsDescripcionGeneralEntityReporte1(saldosdiariosbancosAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					saldosdiariosbancosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(saldosdiariosbancosAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					saldosdiariosbancosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(saldosdiariosbancosAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA)) {
					existe=true;
					saldosdiariosbancosAux.setsDescripcionGeneralEntityReporte1(saldosdiariosbancosAux.getcodigo_cuenta());
				}
				 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO)) {
					existe=true;
					saldosdiariosbancosAux.setsDescripcionGeneralEntityReporte1(saldosdiariosbancosAux.getnombre_banco());
				}
				 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA)) {
					existe=true;
					saldosdiariosbancosAux.setsDescripcionGeneralEntityReporte1(saldosdiariosbancosAux.getnumero_cuenta());
				}
				 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA)) {
					existe=true;
					saldosdiariosbancosAux.setsDescripcionGeneralEntityReporte1(saldosdiariosbancosAux.getnombre_moneda());
				}
				 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA)) {
					existe=true;
					saldosdiariosbancosAux.setsDescripcionGeneralEntityReporte1(saldosdiariosbancosAux.getprocedencia());
				}
				 else if(sTipoSeleccionar.equals(SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO)) {
					existe=true;
					saldosdiariosbancosAux.setsDescripcionGeneralEntityReporte1(saldosdiariosbancosAux.getdestino());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosDiariosBancosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSaldosDiariosBancos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSaldosDiariosBancos=true;
				this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos=true;
				this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos=true;
			}
			
			this.isVisibilidadCeldaModificarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaActualizarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaEliminarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaCancelarSaldosDiariosBancos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosDiariosBancos=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldosDiariosBancos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSaldosDiariosBancos=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos=false;
			this.isVisibilidadCeldaModificarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaActualizarSaldosDiariosBancos=true;
			this.isVisibilidadCeldaEliminarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaCancelarSaldosDiariosBancos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosDiariosBancos=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldosDiariosBancos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSaldosDiariosBancos=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos=false;
			this.isVisibilidadCeldaModificarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaActualizarSaldosDiariosBancos=true;
			this.isVisibilidadCeldaEliminarSaldosDiariosBancos=true;
			this.isVisibilidadCeldaCancelarSaldosDiariosBancos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosDiariosBancos=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldosDiariosBancos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSaldosDiariosBancos=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos=false;
			this.isVisibilidadCeldaModificarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaActualizarSaldosDiariosBancos=true;
			this.isVisibilidadCeldaEliminarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaCancelarSaldosDiariosBancos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosDiariosBancos=false;
				} else {
					this.isVisibilidadCeldaGuardarSaldosDiariosBancos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSaldosDiariosBancos=true;
			this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos=true;
			this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos=true;
			this.isVisibilidadCeldaModificarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaActualizarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaEliminarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaCancelarSaldosDiariosBancos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosDiariosBancos=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldosDiariosBancos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSaldosDiariosBancos=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos=false;
			this.isVisibilidadCeldaActualizarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaEliminarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaCancelarSaldosDiariosBancos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosDiariosBancos=false;
				} else {
					this.isVisibilidadCeldaGuardarSaldosDiariosBancos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSaldosDiariosBancos=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos=false;
			this.isVisibilidadCeldaModificarSaldosDiariosBancos=true;
			this.isVisibilidadCeldaActualizarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaEliminarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaCancelarSaldosDiariosBancos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosDiariosBancos=false;
				} else {
					this.isVisibilidadCeldaGuardarSaldosDiariosBancos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SaldosDiariosBancosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSaldosDiariosBancos=true;
			this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos=true;
			this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos=true;
		} else {
			this.actualizarEstadoPanelsSaldosDiariosBancos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSaldosDiariosBancos=false;
			//this.isVisibilidadCeldaVerFormSaldosDiariosBancos=false;
			this.isVisibilidadCeldaDuplicarSaldosDiariosBancos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!saldosdiariosbancosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos=false;
		} else {
			this.isVisibilidadCeldaNuevoSaldosDiariosBancos=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
			if(!saldosdiariosbancosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos=false;												
			}
			
			this.jButtonCerrarSaldosDiariosBancos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos=false;
		}
		
		if(!this.permiteMantenimiento(this.saldosdiariosbancos)) {
			this.isVisibilidadCeldaActualizarSaldosDiariosBancos=false;
			this.isVisibilidadCeldaEliminarSaldosDiariosBancos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoSaldosDiariosBancos=false;
		this.isVisibilidadCeldaNuevoRelacionesSaldosDiariosBancos=false;
		this.isVisibilidadCeldaGuardarCambiosSaldosDiariosBancos=false;
		//this.isVisibilidadCeldaModificarSaldosDiariosBancos=true;
		this.isVisibilidadCeldaActualizarSaldosDiariosBancos=false;
		this.isVisibilidadCeldaEliminarSaldosDiariosBancos=false;
		//this.isVisibilidadCeldaCancelarSaldosDiariosBancos=true;			
		this.isVisibilidadCeldaGuardarSaldosDiariosBancos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSaldosDiariosBancos() {
	}
	
	public void actualizarEstadoPanelsSaldosDiariosBancos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSaldosDiariosBancos!=null) {
				this.jScrollPanelDatosEdicionSaldosDiariosBancos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosDiariosBancos!=null) {
				this.jTabbedPaneBusquedasSaldosDiariosBancos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldosDiariosBancos!=null) {
				this.jScrollPanelDatosSaldosDiariosBancos.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldosDiariosBancos!=null) {
				this.jPanelPaginacionSaldosDiariosBancos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldosDiariosBancos!=null) {
				this.jPanelParametrosReportesSaldosDiariosBancos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSaldosDiariosBancos!=null) {
				this.jScrollPanelDatosEdicionSaldosDiariosBancos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosDiariosBancos!=null) {
				this.jTabbedPaneBusquedasSaldosDiariosBancos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSaldosDiariosBancos!=null) {
				this.jScrollPanelDatosSaldosDiariosBancos.setVisible(false);
			}
			
			if(this.jPanelPaginacionSaldosDiariosBancos!=null) {
				this.jPanelPaginacionSaldosDiariosBancos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSaldosDiariosBancos!=null) {
				this.jPanelParametrosReportesSaldosDiariosBancos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSaldosDiariosBancos!=null) {
				this.jScrollPanelDatosEdicionSaldosDiariosBancos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosDiariosBancos!=null) {
				this.jTabbedPaneBusquedasSaldosDiariosBancos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSaldosDiariosBancos!=null) {
				this.jScrollPanelDatosSaldosDiariosBancos.setVisible(false);
			}
			
			if(this.jPanelPaginacionSaldosDiariosBancos!=null) {
				this.jPanelPaginacionSaldosDiariosBancos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSaldosDiariosBancos!=null) {
				this.jPanelParametrosReportesSaldosDiariosBancos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSaldosDiariosBancos!=null) {
				this.jScrollPanelDatosEdicionSaldosDiariosBancos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosDiariosBancos!=null) {
				this.jTabbedPaneBusquedasSaldosDiariosBancos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSaldosDiariosBancos!=null) {
				this.jScrollPanelDatosSaldosDiariosBancos.setVisible(false);
			}
			
			if(this.jPanelPaginacionSaldosDiariosBancos!=null) {
				this.jPanelPaginacionSaldosDiariosBancos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSaldosDiariosBancos!=null) {
				this.jPanelParametrosReportesSaldosDiariosBancos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSaldosDiariosBancos!=null) {
				this.jScrollPanelDatosEdicionSaldosDiariosBancos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosDiariosBancos!=null) {
				this.jTabbedPaneBusquedasSaldosDiariosBancos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldosDiariosBancos!=null) {
				this.jScrollPanelDatosSaldosDiariosBancos.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldosDiariosBancos!=null) {
				this.jPanelPaginacionSaldosDiariosBancos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldosDiariosBancos!=null) {
				this.jPanelParametrosReportesSaldosDiariosBancos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSaldosDiariosBancos!=null) {
				this.jScrollPanelDatosEdicionSaldosDiariosBancos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosDiariosBancos!=null) {
				this.jTabbedPaneBusquedasSaldosDiariosBancos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldosDiariosBancos!=null) {
				this.jScrollPanelDatosSaldosDiariosBancos.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldosDiariosBancos!=null) {
				this.jPanelPaginacionSaldosDiariosBancos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldosDiariosBancos!=null) {
				this.jPanelParametrosReportesSaldosDiariosBancos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSaldosDiariosBancos!=null) {
				this.jScrollPanelDatosEdicionSaldosDiariosBancos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosDiariosBancos!=null) {
				this.jTabbedPaneBusquedasSaldosDiariosBancos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldosDiariosBancos!=null) {
				this.jScrollPanelDatosSaldosDiariosBancos.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldosDiariosBancos!=null) {
				this.jPanelPaginacionSaldosDiariosBancos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldosDiariosBancos!=null) {
				this.jPanelParametrosReportesSaldosDiariosBancos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSaldosDiariosBancos!=null) {
					this.jTabbedPaneBusquedasSaldosDiariosBancos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSaldosDiariosBancos!=null) {
				this.jPanelParametrosReportesSaldosDiariosBancos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosDiariosBancos!=null) {
				this.jTabbedPaneBusquedasSaldosDiariosBancos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSaldosDiariosBancos!=null) {
				this.jPanelParametrosReportesSaldosDiariosBancos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaSaldosDiariosBancos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaSaldosDiariosBancos) {this.jTabbedPaneBusquedasSaldosDiariosBancos.remove(jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaSaldosDiariosBancos=isParaEjercicio;
			if(!this.isVisibilidadBusquedaSaldosDiariosBancos) {this.jTabbedPaneBusquedasSaldosDiariosBancos.remove(jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos);}
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
			
			this.inicializarActualizarBindingTablaSaldosDiariosBancos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSaldosDiariosBancos() {
		this.updateBorderResaltarBusquedasFormularioSaldosDiariosBancos();
		this.updateVisibilidadBusquedasFormularioSaldosDiariosBancos();
		this.updateHabilitarBusquedasFormularioSaldosDiariosBancos();
	}
	
	public void updateBorderResaltarBusquedasFormularioSaldosDiariosBancos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSaldosDiariosBancos.getComponents().length>0) {
	

		if(this.saldosdiariosbancosConstantesFunciones.resaltarBusquedaSaldosDiariosBancosSaldosDiariosBancos!=null) {
			index= this.jTabbedPaneBusquedasSaldosDiariosBancos.indexOfComponent(this.jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSaldosDiariosBancos.getComponent(index);
				jPanel.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltarBusquedaSaldosDiariosBancosSaldosDiariosBancos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSaldosDiariosBancos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSaldosDiariosBancos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSaldosDiariosBancos.indexOfComponent(this.jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSaldosDiariosBancos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarBusquedaSaldosDiariosBancosSaldosDiariosBancos);
			if(!this.saldosdiariosbancosConstantesFunciones.mostrarBusquedaSaldosDiariosBancosSaldosDiariosBancos && index>-1) {
				this.jTabbedPaneBusquedasSaldosDiariosBancos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSaldosDiariosBancos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSaldosDiariosBancos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSaldosDiariosBancos.indexOfComponent(this.jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSaldosDiariosBancos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.saldosdiariosbancosConstantesFunciones.activarBusquedaSaldosDiariosBancosSaldosDiariosBancos);
				this.jTabbedPaneBusquedasSaldosDiariosBancos.setEnabledAt(index,this.saldosdiariosbancosConstantesFunciones.activarBusquedaSaldosDiariosBancosSaldosDiariosBancos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSaldosDiariosBancos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaSaldosDiariosBancos")) {
			index= this.jTabbedPaneBusquedasSaldosDiariosBancos.indexOfComponent(this.jPanelBusquedaSaldosDiariosBancosSaldosDiariosBancos);

			this.jTabbedPaneBusquedasSaldosDiariosBancos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSaldosDiariosBancos.getComponent(index);

			this.saldosdiariosbancosConstantesFunciones.setResaltarBusquedaSaldosDiariosBancosSaldosDiariosBancos(resaltar);

			jPanel.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltarBusquedaSaldosDiariosBancosSaldosDiariosBancos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSaldosDiariosBancos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSaldosDiariosBancos() throws Exception {

		if(this.jInternalFrameDetalleFormSaldosDiariosBancos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSaldosDiariosBancos();
		this.updateVisibilidadResaltarControlesFormularioSaldosDiariosBancos();
		this.updateHabilitarResaltarControlesFormularioSaldosDiariosBancos();
		
	}
	
	public void updateBorderResaltarControlesFormularioSaldosDiariosBancos() throws Exception {
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.saldosdiariosbancosConstantesFunciones.resaltaridSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelidSaldosDiariosBancos.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltaridSaldosDiariosBancos);}
		if(this.saldosdiariosbancosConstantesFunciones.resaltarid_empresaSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_empresaSaldosDiariosBancos.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltarid_empresaSaldosDiariosBancos);}
		if(this.saldosdiariosbancosConstantesFunciones.resaltarid_ejercicioSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_ejercicioSaldosDiariosBancos.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltarid_ejercicioSaldosDiariosBancos);}
		if(this.saldosdiariosbancosConstantesFunciones.resaltarfecha_desdeSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {this.jInternalFrameDetalleFormSaldosDiariosBancos.jDateChooserfecha_desdeSaldosDiariosBancos.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltarfecha_desdeSaldosDiariosBancos);}
		if(this.saldosdiariosbancosConstantesFunciones.resaltarfecha_hastaSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {this.jInternalFrameDetalleFormSaldosDiariosBancos.jDateChooserfecha_hastaSaldosDiariosBancos.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltarfecha_hastaSaldosDiariosBancos);}
		if(this.saldosdiariosbancosConstantesFunciones.resaltarcodigo_cuentaSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldcodigo_cuentaSaldosDiariosBancos.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltarcodigo_cuentaSaldosDiariosBancos);}
		if(this.saldosdiariosbancosConstantesFunciones.resaltarnombre_bancoSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreanombre_bancoSaldosDiariosBancos.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltarnombre_bancoSaldosDiariosBancos);}
		if(this.saldosdiariosbancosConstantesFunciones.resaltarnumero_cuentaSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldnumero_cuentaSaldosDiariosBancos.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltarnumero_cuentaSaldosDiariosBancos);}
		if(this.saldosdiariosbancosConstantesFunciones.resaltarnombre_monedaSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldnombre_monedaSaldosDiariosBancos.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltarnombre_monedaSaldosDiariosBancos);}
		if(this.saldosdiariosbancosConstantesFunciones.resaltarsaldo_anteriorSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldsaldo_anteriorSaldosDiariosBancos.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltarsaldo_anteriorSaldosDiariosBancos);}
		if(this.saldosdiariosbancosConstantesFunciones.resaltardepositoSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFielddepositoSaldosDiariosBancos.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltardepositoSaldosDiariosBancos);}
		if(this.saldosdiariosbancosConstantesFunciones.resaltarncSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldncSaldosDiariosBancos.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltarncSaldosDiariosBancos);}
		if(this.saldosdiariosbancosConstantesFunciones.resaltarch_giradosSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldch_giradosSaldosDiariosBancos.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltarch_giradosSaldosDiariosBancos);}
		if(this.saldosdiariosbancosConstantesFunciones.resaltarndSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldndSaldosDiariosBancos.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltarndSaldosDiariosBancos);}
		if(this.saldosdiariosbancosConstantesFunciones.resaltarprocedenciaSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreaprocedenciaSaldosDiariosBancos.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltarprocedenciaSaldosDiariosBancos);}
		if(this.saldosdiariosbancosConstantesFunciones.resaltardestinoSaldosDiariosBancos!=null && this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreadestinoSaldosDiariosBancos.setBorder(this.saldosdiariosbancosConstantesFunciones.resaltardestinoSaldosDiariosBancos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSaldosDiariosBancos() throws Exception {		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
	
		//this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelidSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostraridSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelidSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostraridSaldosDiariosBancos);
		//this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_empresaSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarid_empresaSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelid_empresaSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarid_empresaSaldosDiariosBancos);
		//this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_ejercicioSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarid_ejercicioSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelid_ejercicioSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarid_ejercicioSaldosDiariosBancos);
		//this.jInternalFrameDetalleFormSaldosDiariosBancos.jDateChooserfecha_desdeSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarfecha_desdeSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelfecha_desdeSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarfecha_desdeSaldosDiariosBancos);
		//this.jInternalFrameDetalleFormSaldosDiariosBancos.jDateChooserfecha_hastaSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarfecha_hastaSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelfecha_hastaSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarfecha_hastaSaldosDiariosBancos);
		//this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldcodigo_cuentaSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarcodigo_cuentaSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelcodigo_cuentaSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarcodigo_cuentaSaldosDiariosBancos);
		//this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreanombre_bancoSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarnombre_bancoSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelnombre_bancoSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarnombre_bancoSaldosDiariosBancos);
		//this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldnumero_cuentaSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarnumero_cuentaSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelnumero_cuentaSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarnumero_cuentaSaldosDiariosBancos);
		//this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldnombre_monedaSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarnombre_monedaSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelnombre_monedaSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarnombre_monedaSaldosDiariosBancos);
		//this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldsaldo_anteriorSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarsaldo_anteriorSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelsaldo_anteriorSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarsaldo_anteriorSaldosDiariosBancos);
		//this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFielddepositoSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrardepositoSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jPaneldepositoSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrardepositoSaldosDiariosBancos);
		//this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldncSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarncSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelncSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarncSaldosDiariosBancos);
		//this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldch_giradosSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarch_giradosSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelch_giradosSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarch_giradosSaldosDiariosBancos);
		//this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldndSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarndSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelndSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarndSaldosDiariosBancos);
		//this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreaprocedenciaSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarprocedenciaSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jPanelprocedenciaSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrarprocedenciaSaldosDiariosBancos);
		//this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreadestinoSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrardestinoSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jPaneldestinoSaldosDiariosBancos.setVisible(this.saldosdiariosbancosConstantesFunciones.mostrardestinoSaldosDiariosBancos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSaldosDiariosBancos() throws Exception {
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSaldosDiariosBancos!=null) {
	
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jLabelidSaldosDiariosBancos.setEnabled(this.saldosdiariosbancosConstantesFunciones.activaridSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_empresaSaldosDiariosBancos.setEnabled(this.saldosdiariosbancosConstantesFunciones.activarid_empresaSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jComboBoxid_ejercicioSaldosDiariosBancos.setEnabled(this.saldosdiariosbancosConstantesFunciones.activarid_ejercicioSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jDateChooserfecha_desdeSaldosDiariosBancos.setEnabled(this.saldosdiariosbancosConstantesFunciones.activarfecha_desdeSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jDateChooserfecha_hastaSaldosDiariosBancos.setEnabled(this.saldosdiariosbancosConstantesFunciones.activarfecha_hastaSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldcodigo_cuentaSaldosDiariosBancos.setEnabled(this.saldosdiariosbancosConstantesFunciones.activarcodigo_cuentaSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreanombre_bancoSaldosDiariosBancos.setEnabled(this.saldosdiariosbancosConstantesFunciones.activarnombre_bancoSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldnumero_cuentaSaldosDiariosBancos.setEnabled(this.saldosdiariosbancosConstantesFunciones.activarnumero_cuentaSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldnombre_monedaSaldosDiariosBancos.setEnabled(this.saldosdiariosbancosConstantesFunciones.activarnombre_monedaSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldsaldo_anteriorSaldosDiariosBancos.setEnabled(this.saldosdiariosbancosConstantesFunciones.activarsaldo_anteriorSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFielddepositoSaldosDiariosBancos.setEnabled(this.saldosdiariosbancosConstantesFunciones.activardepositoSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldncSaldosDiariosBancos.setEnabled(this.saldosdiariosbancosConstantesFunciones.activarncSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldch_giradosSaldosDiariosBancos.setEnabled(this.saldosdiariosbancosConstantesFunciones.activarch_giradosSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextFieldndSaldosDiariosBancos.setEnabled(this.saldosdiariosbancosConstantesFunciones.activarndSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreaprocedenciaSaldosDiariosBancos.setEnabled(this.saldosdiariosbancosConstantesFunciones.activarprocedenciaSaldosDiariosBancos);
		this.jInternalFrameDetalleFormSaldosDiariosBancos.jTextAreadestinoSaldosDiariosBancos.setEnabled(this.saldosdiariosbancosConstantesFunciones.activardestinoSaldosDiariosBancos);
		}
	}
	
		
}